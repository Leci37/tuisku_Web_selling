//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: UPST_1Min_1T00_37af8899 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_1T00_37af8899", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_37af8899(ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= 0.015917 )
		if( ema2 <= 23.4064 )
			if( ema3 <= 20.5486 )
				if( ema3 <= 20.3601 )
					if( ema2 <= 20.1602 )
						ret := 0.916667 // buy
					if( ema2 > 20.1602 )
						ret := 1.000000 // buy
				if( ema3 > 20.3601 )
					if( ema13 <= -0.293884 )
						ret := 1.000000 // buy
					if( ema13 > -0.293884 )
						ret := 0.818182 // buy
			if( ema3 > 20.5486 )
				if( ema3 <= 20.9862 )
					if( tema <= 20.6565 )
						ret := -1.000000 // sell
					if( tema > 20.6565 )
						if( ema3 <= 20.9422 )
							if( ema13 <= -0.066183 )
								ret := 0.083333
							if( ema13 > -0.066183 )
								ret := 0.916667 // buy
						if( ema3 > 20.9422 )
							if( tema <= 20.9062 )
								ret := -0.714286 // sell
							if( tema > 20.9062 )
								ret := -1.000000 // sell
				if( ema3 > 20.9862 )
					if( ema1 <= 20.9792 )
						if( tema <= 20.9468 )
							if( ema2 <= 20.9851 )
								ret := 0.800000 // buy
							if( ema2 > 20.9851 )
								ret := 1.000000 // buy
						if( tema > 20.9468 )
							ret := 0.538462
					if( ema1 > 20.9792 )
						if( ema13 <= -0.043915 )
							if( ema3 <= 23.4353 )
								if( ema13 <= -0.136401 )
									ret := 0.475630
								if( ema13 > -0.136401 )
									ret := 0.194966
							if( ema3 > 23.4353 )
								if( ema13 <= -0.198649 )
									ret := 0.277778
								if( ema13 > -0.198649 )
									ret := 0.849057 // buy
						if( ema13 > -0.043915 )
							if( ema3 <= 23.2133 )
								if( tema <= 23.1881 )
									ret := 0.028080
								if( tema > 23.1881 )
									ret := -0.451807
							if( ema3 > 23.2133 )
								if( ema13 <= 0.012568 )
									ret := 0.186885
								if( ema13 > 0.012568 )
									ret := 0.037572
		if( ema2 > 23.4064 )
			if( ema12 <= 0.014638 )
				if( ema1 <= 54.7327 )
					if( tema <= 23.3447 )
						if( ema2 <= 23.4483 )
							if( ema2 <= 23.4099 )
								ret := -0.687500
							if( ema2 > 23.4099 )
								if( ema3 <= 23.4618 )
									ret := 0.333333
								if( ema3 > 23.4618 )
									ret := -0.222222
						if( ema2 > 23.4483 )
							if( ema12 <= -0.125997 )
								ret := -0.250000
							if( ema12 > -0.125997 )
								if( ema1 <= 23.3898 )
									ret := -1.000000 // sell
								if( ema1 > 23.3898 )
									ret := -0.702128 // sell
					if( tema > 23.3447 )
						if( ema12 <= -0.368234 )
							if( ema12 <= -0.387427 )
								ret := 1.000000 // buy
							if( ema12 > -0.387427 )
								ret := 0.777778 // buy
						if( ema12 > -0.368234 )
							if( ema13 <= 0.03882 )
								if( tema <= 48.4399 )
									ret := 0.007651
								if( tema > 48.4399 )
									ret := 0.268293
							if( ema13 > 0.03882 )
								if( tema <= 33.9637 )
									ret := -0.373089
								if( tema > 33.9637 )
									ret := 0.024390
				if( ema1 > 54.7327 )
					if( ema13 <= 0.002804 )
						if( tema <= 54.7419 )
							ret := -0.307692
						if( tema > 54.7419 )
							if( ema3 <= 55.2134 )
								ret := -1.000000 // sell
							if( ema3 > 55.2134 )
								if( ema2 <= 55.5094 )
									ret := -0.634146
								if( ema2 > 55.5094 )
									ret := -1.000000 // sell
					if( ema13 > 0.002804 )
						ret := 0.266667
			if( ema12 > 0.014638 )
				if( ema1 <= 34.0354 )
					if( ema2 <= 31.5443 )
						if( ema2 <= 23.6512 )
							if( ema1 <= 23.5991 )
								ret := -0.285714
							if( ema1 > 23.5991 )
								ret := -0.421053
						if( ema2 > 23.6512 )
							if( ema2 <= 25.9956 )
								if( ema1 <= 25.7372 )
									ret := 0.144578
								if( ema1 > 25.7372 )
									ret := 0.862069 // buy
							if( ema2 > 25.9956 )
								if( ema2 <= 29.0155 )
									ret := -0.205607
								if( ema2 > 29.0155 )
									ret := 0.468750
					if( ema2 > 31.5443 )
						ret := -0.750000 // sell
				if( ema1 > 34.0354 )
					if( tema <= 42.2911 )
						if( ema13 <= 0.029758 )
							if( ema2 <= 35.7175 )
								if( ema13 <= 0.019966 )
									ret := 0.916667 // buy
								if( ema13 > 0.019966 )
									ret := 0.142857
							if( ema2 > 35.7175 )
								if( ema3 <= 39.7283 )
									ret := 0.088235
								if( ema3 > 39.7283 )
									ret := 0.393939
						if( ema13 > 0.029758 )
							if( ema13 <= 0.034329 )
								if( tema <= 36.7273 )
									ret := 1.000000 // buy
								if( tema > 36.7273 )
									ret := 0.500000
							if( ema13 > 0.034329 )
								if( ema2 <= 38.8855 )
									ret := 0.305085
								if( ema2 > 38.8855 )
									ret := 0.729730 // buy
					if( tema > 42.2911 )
						if( tema <= 44.3301 )
							if( tema <= 42.9745 )
								ret := -0.636364
							if( tema > 42.9745 )
								ret := -0.333333
						if( tema > 44.3301 )
							ret := 0.142857
	if( ema12 > 0.015917 )
		if( ema1 <= 29.0975 )
			if( ema2 <= 27.6711 )
				if( ema13 <= 0.211594 )
					if( ema2 <= 27.4886 )
						if( ema13 <= 0.09188 )
							if( ema3 <= 21.5268 )
								if( ema1 <= 20.3526 )
									ret := 0.500000
								if( ema1 > 20.3526 )
									ret := -0.639535
							if( ema3 > 21.5268 )
								if( ema1 <= 22.9055 )
									ret := 0.072747
								if( ema1 > 22.9055 )
									ret := -0.079517
						if( ema13 > 0.09188 )
							if( ema12 <= 0.129496 )
								if( ema1 <= 27.3378 )
									ret := -0.181377
								if( ema1 > 27.3378 )
									ret := -0.684211
							if( ema12 > 0.129496 )
								if( ema12 <= 0.139947 )
									ret := 0.739130 // buy
								if( ema12 > 0.139947 )
									ret := 0.375000
					if( ema2 > 27.4886 )
						if( ema1 <= 27.699 )
							if( ema12 <= 0.017914 )
								ret := -0.588235
							if( ema12 > 0.017914 )
								if( ema3 <= 27.5242 )
									ret := 0.836957 // buy
								if( ema3 > 27.5242 )
									ret := 0.506757
						if( ema1 > 27.699 )
							if( ema3 <= 27.6091 )
								if( tema <= 27.85 )
									ret := -0.741935 // sell
								if( tema > 27.85 )
									ret := 0.454545
							if( ema3 > 27.6091 )
								if( ema13 <= 0.076611 )
									ret := 0.900000 // buy
								if( ema13 > 0.076611 )
									ret := 1.000000 // buy
				if( ema13 > 0.211594 )
					if( tema <= 25.0798 )
						if( tema <= 21.8951 )
							if( ema3 <= 20.8546 )
								ret := 0.900000 // buy
							if( ema3 > 20.8546 )
								ret := 1.000000 // buy
						if( tema > 21.8951 )
							if( ema12 <= 0.198644 )
								if( tema <= 22.6828 )
									ret := 0.872549 // buy
								if( tema > 22.6828 )
									ret := 0.534653
							if( ema12 > 0.198644 )
								if( tema <= 22.7552 )
									ret := -0.158730
								if( tema > 22.7552 )
									ret := -0.755102 // sell
					if( tema > 25.0798 )
						if( ema1 <= 25.1616 )
							if( ema13 <= 0.288036 )
								if( tema <= 25.2327 )
									ret := 0.000000
								if( tema > 25.2327 )
									ret := -0.571429
							if( ema13 > 0.288036 )
								if( ema12 <= 0.243671 )
									ret := -1.000000 // sell
								if( ema12 > 0.243671 )
									ret := -0.733333 // sell
						if( ema1 > 25.1616 )
							if( ema13 <= 0.526541 )
								if( tema <= 26.5934 )
									ret := -0.033557
								if( tema > 26.5934 )
									ret := 0.327801
							if( ema13 > 0.526541 )
								if( ema3 <= 26.2033 )
									ret := -0.463415
								if( ema3 > 26.2033 )
									ret := -0.937500 // sell
			if( ema2 > 27.6711 )
				if( ema2 <= 27.8423 )
					if( tema <= 27.9106 )
						if( ema3 <= 27.7445 )
							if( ema2 <= 27.7538 )
								if( ema2 <= 27.7273 )
									ret := -0.610526
								if( ema2 > 27.7273 )
									ret := 0.200000
							if( ema2 > 27.7538 )
								if( ema12 <= 0.043547 )
									ret := -0.947368 // sell
								if( ema12 > 0.043547 )
									ret := -0.333333
						if( ema3 > 27.7445 )
							if( ema12 <= 0.021063 )
								if( ema1 <= 27.816 )
									ret := -0.928571 // sell
								if( ema1 > 27.816 )
									ret := -0.555556
							if( ema12 > 0.021063 )
								if( ema12 <= 0.027272 )
									ret := -0.941176 // sell
								if( ema12 > 0.027272 )
									ret := -1.000000 // sell
					if( tema > 27.9106 )
						if( ema3 <= 27.6503 )
							ret := 0.882353 // buy
						if( ema3 > 27.6503 )
							if( ema1 <= 27.8207 )
								ret := 0.615385
							if( ema1 > 27.8207 )
								if( ema13 <= 0.117842 )
									ret := 0.100000
								if( ema13 > 0.117842 )
									ret := -0.842105 // sell
				if( ema2 > 27.8423 )
					if( tema <= 28.1295 )
						if( ema13 <= 0.118155 )
							if( ema2 <= 27.9929 )
								if( tema <= 28.0403 )
									ret := 0.155556
								if( tema > 28.0403 )
									ret := -0.681818
							if( ema2 > 27.9929 )
								if( ema13 <= 0.068982 )
									ret := 0.380952
								if( ema13 > 0.068982 )
									ret := 1.000000 // buy
						if( ema13 > 0.118155 )
							if( tema <= 28.1062 )
								ret := 0.666667
							if( tema > 28.1062 )
								ret := 0.882353 // buy
					if( tema > 28.1295 )
						if( ema13 <= 0.101172 )
							if( ema13 <= 0.049879 )
								if( tema <= 28.8697 )
									ret := -0.178261
								if( tema > 28.8697 )
									ret := 0.560000
							if( ema13 > 0.049879 )
								if( ema3 <= 28.3572 )
									ret := -0.309278
								if( ema3 > 28.3572 )
									ret := -0.638393
						if( ema13 > 0.101172 )
							if( ema2 <= 28.0981 )
								if( ema12 <= 0.090858 )
									ret := -0.791667 // sell
								if( ema12 > 0.090858 )
									ret := 0.318436
							if( ema2 > 28.0981 )
								if( tema <= 29.1375 )
									ret := -0.061594
								if( tema > 29.1375 )
									ret := -0.833333 // sell
		if( ema1 > 29.0975 )
			if( ema3 <= 54.5848 )
				if( tema <= 45.6123 )
					if( ema13 <= 0.22645 )
						if( tema <= 29.6537 )
							if( ema12 <= 0.024439 )
								if( tema <= 29.444 )
									ret := -0.500000
								if( tema > 29.444 )
									ret := 0.259259
							if( ema12 > 0.024439 )
								if( ema12 <= 0.073032 )
									ret := 0.500000
								if( ema12 > 0.073032 )
									ret := 0.844444 // buy
						if( tema > 29.6537 )
							if( ema3 <= 44.9616 )
								if( ema1 <= 44.2796 )
									ret := -0.054020
								if( ema1 > 44.2796 )
									ret := 0.525316
							if( ema3 > 44.9616 )
								if( ema12 <= 0.072436 )
									ret := -0.771429 // sell
								if( ema12 > 0.072436 )
									ret := 0.090909
					if( ema13 > 0.22645 )
						if( ema2 <= 44.5676 )
							if( ema12 <= 0.360595 )
								if( ema13 <= 0.29194 )
									ret := 0.226493
								if( ema13 > 0.29194 )
									ret := 0.029201
							if( ema12 > 0.360595 )
								if( ema2 <= 31.2588 )
									ret := -1.000000 // sell
								if( ema2 > 31.2588 )
									ret := -0.444444
						if( ema2 > 44.5676 )
							if( ema2 <= 44.9366 )
								if( ema13 <= 0.304329 )
									ret := -0.700000 // sell
								if( ema13 > 0.304329 )
									ret := -1.000000 // sell
							if( ema2 > 44.9366 )
								ret := 0.437500
				if( tema > 45.6123 )
					if( ema12 <= 0.042435 )
						if( tema <= 47.1023 )
							ret := 0.437500
						if( tema > 47.1023 )
							if( ema2 <= 52.7762 )
								if( ema3 <= 48.349 )
									ret := -0.916667 // sell
								if( ema3 > 48.349 )
									ret := -0.354839
							if( ema2 > 52.7762 )
								if( ema13 <= 0.053285 )
									ret := 0.000000
								if( ema13 > 0.053285 )
									ret := 0.272727
					if( ema12 > 0.042435 )
						if( ema3 <= 51.1874 )
							if( tema <= 48.7075 )
								if( ema1 <= 47.5343 )
									ret := 0.669118
								if( ema1 > 47.5343 )
									ret := -0.666667
							if( tema > 48.7075 )
								if( tema <= 51.2747 )
									ret := 0.971429 // buy
								if( tema > 51.2747 )
									ret := 0.807692 // buy
						if( ema3 > 51.1874 )
							if( ema2 <= 52.3997 )
								if( ema2 <= 51.8999 )
									ret := 0.272727
								if( ema2 > 51.8999 )
									ret := -0.716981 // sell
							if( ema2 > 52.3997 )
								if( tema <= 55.1857 )
									ret := 0.703704 // buy
								if( tema > 55.1857 )
									ret := -0.200000
			if( ema3 > 54.5848 )
				if( ema12 <= 0.179692 )
					if( ema3 <= 54.788 )
						if( ema3 <= 54.6407 )
							if( ema3 <= 54.6094 )
								ret := -1.000000 // sell
							if( ema3 > 54.6094 )
								ret := -0.600000
						if( ema3 > 54.6407 )
							if( tema <= 55.0273 )
								ret := -1.000000 // sell
							if( tema > 55.0273 )
								ret := -0.900000 // sell
					if( ema3 > 54.788 )
						if( ema3 <= 55.2626 )
							if( ema12 <= 0.072932 )
								ret := 0.444444
							if( ema12 > 0.072932 )
								ret := 0.000000
						if( ema3 > 55.2626 )
							ret := -1.000000 // sell
				if( ema12 > 0.179692 )
					ret := -0.125000
	
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
float op_operation = decision_tree_0_UPST_1Min_37af8899(ema2, ema1, ema12, ema3, ema13, tema)

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


