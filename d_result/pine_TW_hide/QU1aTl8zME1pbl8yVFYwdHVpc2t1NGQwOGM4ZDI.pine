//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: AMZN_30Min_2TV0_4d08c8d2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_30Min_2TV0_4d08c8d2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_30Min_4d08c8d2(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema2 <= 3234.3 )
		if( ema13 <= 2.5763 )
			if( ema2 <= 86.2144 )
				if( VIM <= 1.14776 )
					if( ema2 <= 85.4108 )
						if( ema1 <= 84.9794 )
							if( ema2 <= 84.6222 )
								if( VIP <= 1.26465 )
									ret := 0.478528
								if( VIP > 1.26465 )
									ret := -0.307692
							if( ema2 > 84.6222 )
								if( ema13 <= -0.264531 )
									ret := 0.500000
								if( ema13 > -0.264531 )
									ret := 1.000000 // buy
						if( ema1 > 84.9794 )
							if( VIP <= 1.36787 )
								if( ema13 <= 0.25801 )
									ret := 0.259259
								if( ema13 > 0.25801 )
									ret := -0.607143
							if( VIP > 1.36787 )
								ret := 0.857143 // buy
					if( ema2 > 85.4108 )
						if( VIP <= 1.23668 )
							if( VIP_VIM <= -0.183016 )
								ret := 0.666667
							if( VIP_VIM > -0.183016 )
								if( ema1 <= 86.2431 )
									ret := 0.974359 // buy
								if( ema1 > 86.2431 )
									ret := 0.800000 // buy
						if( VIP > 1.23668 )
							if( ema13 <= 0.447132 )
								ret := 0.000000
							if( ema13 > 0.447132 )
								if( tema <= 86.7333 )
									ret := 0.875000 // buy
								if( tema > 86.7333 )
									ret := 0.000000
				if( VIM > 1.14776 )
					if( tema <= 82.9363 )
						if( VIP <= 0.747986 )
							if( tema <= 82.6302 )
								ret := 1.000000 // buy
							if( tema > 82.6302 )
								if( ema1 <= 83.1692 )
									ret := 1.000000 // buy
								if( ema1 > 83.1692 )
									ret := 0.400000
						if( VIP > 0.747986 )
							if( ema13 <= -0.447278 )
								ret := 0.000000
							if( ema13 > -0.447278 )
								ret := 0.750000 // buy
					if( tema > 82.9363 )
						if( ema3 <= 85.5796 )
							if( ema2 <= 83.9631 )
								ret := 0.000000
							if( ema2 > 83.9631 )
								if( ema3 <= 85.1991 )
									ret := -0.833333 // sell
								if( ema3 > 85.1991 )
									ret := -0.357143
						if( ema3 > 85.5796 )
							if( VIP <= 0.642709 )
								ret := -0.571429
							if( VIP > 0.642709 )
								if( tema <= 84.7139 )
									ret := 0.700000 // buy
								if( tema > 84.7139 )
									ret := 0.125000
			if( ema2 > 86.2144 )
				if( ema1 <= 3055.72 )
					if( tema <= 3012.5 )
						if( ema2 <= 3006.27 )
							if( VIM <= 1.80866 )
								if( VIP <= 0.467965 )
									ret := 0.793103 // buy
								if( VIP > 0.467965 )
									ret := 0.042932
							if( VIM > 1.80866 )
								if( ema12 <= -9.08638 )
									ret := 0.629630
								if( ema12 > -9.08638 )
									ret := 0.175904
						if( ema2 > 3006.27 )
							if( ema13 <= -17.4887 )
								if( ema2 <= 3059.13 )
									ret := -0.524691
								if( ema2 > 3059.13 )
									ret := 0.368421
							if( ema13 > -17.4887 )
								if( ema13 <= -11.1099 )
									ret := 0.571429
								if( ema13 > -11.1099 )
									ret := -0.700000 // sell
					if( tema > 3012.5 )
						if( tema <= 3052.16 )
							if( tema <= 3025.26 )
								if( VIP <= 1.30736 )
									ret := 0.695652
								if( VIP > 1.30736 )
									ret := 0.130435
							if( tema > 3025.26 )
								if( ema2 <= 3054.86 )
									ret := -0.040000
								if( ema2 > 3054.86 )
									ret := 0.607477
						if( tema > 3052.16 )
							if( VIP_VIM <= -0.011564 )
								if( tema <= 3058.83 )
									ret := -0.846154 // sell
								if( tema > 3058.83 )
									ret := -0.250000
							if( VIP_VIM > -0.011564 )
								if( ema2 <= 3053.37 )
									ret := -0.500000
								if( ema2 > 3053.37 )
									ret := 0.333333
				if( ema1 > 3055.72 )
					if( ema3 <= 3237.89 )
						if( ema1 <= 3098.49 )
							if( ema12 <= -11.8618 )
								if( VIP_VIM <= -0.295254 )
									ret := -0.671533
								if( VIP_VIM > -0.295254 )
									ret := 0.000000
							if( ema12 > -11.8618 )
								if( ema3 <= 3095.3 )
									ret := 0.226415
								if( ema3 > 3095.3 )
									ret := -0.417476
						if( ema1 > 3098.49 )
							if( ema3 <= 3127.37 )
								if( ema12 <= 0.389086 )
									ret := 0.347490
								if( ema12 > 0.389086 )
									ret := -0.238806
							if( ema3 > 3127.37 )
								if( VIP_VIM <= -0.537847 )
									ret := 0.297945
								if( VIP_VIM > -0.537847 )
									ret := -0.110486
					if( ema3 > 3237.89 )
						if( tema <= 3197.34 )
							if( VIM <= 1.41577 )
								if( VIP <= 0.69691 )
									ret := 0.000000
								if( VIP > 0.69691 )
									ret := 0.642857
							if( VIM > 1.41577 )
								if( ema12 <= -28.9399 )
									ret := 1.000000 // buy
								if( ema12 > -28.9399 )
									ret := 0.923077 // buy
						if( tema > 3197.34 )
							if( ema13 <= -26.3727 )
								ret := -0.500000
							if( ema13 > -26.3727 )
								ret := 0.000000
		if( ema13 > 2.5763 )
			if( ema13 <= 93.2017 )
				if( tema <= 1767.49 )
					if( ema2 <= 1467.99 )
						if( ema2 <= 1455.89 )
							if( VIP_VIM <= 1.01001 )
								if( VIM <= 1.37476 )
									ret := 0.090038
								if( VIM > 1.37476 )
									ret := 0.427027
							if( VIP_VIM > 1.01001 )
								if( ema2 <= 749.603 )
									ret := -0.563636
								if( ema2 > 749.603 )
									ret := 0.040000
						if( ema2 > 1455.89 )
							if( VIP_VIM <= 0.930529 )
								if( ema12 <= 10.1856 )
									ret := -0.571429
								if( ema12 > 10.1856 )
									ret := -1.000000 // sell
							if( VIP_VIM > 0.930529 )
								ret := 0.500000
					if( ema2 > 1467.99 )
						if( tema <= 1523.47 )
							if( ema12 <= 8.49864 )
								if( VIM <= 0.952532 )
									ret := 0.412429
								if( VIM > 0.952532 )
									ret := 0.740741 // buy
							if( ema12 > 8.49864 )
								if( VIM <= 0.826269 )
									ret := 0.714286 // buy
								if( VIM > 0.826269 )
									ret := -0.909091 // sell
						if( tema > 1523.47 )
							if( ema2 <= 1743.15 )
								if( VIP <= 1.72219 )
									ret := 0.182256
								if( VIP > 1.72219 )
									ret := -0.288660
							if( ema2 > 1743.15 )
								if( VIP <= 1.79333 )
									ret := 0.480687
								if( VIP > 1.79333 )
									ret := -0.636364
				if( tema > 1767.49 )
					if( ema2 <= 2123.61 )
						if( ema12 <= 16.108 )
							if( tema <= 2090.67 )
								if( ema1 <= 2082.28 )
									ret := -0.018000
								if( ema1 > 2082.28 )
									ret := 0.954545 // buy
							if( tema > 2090.67 )
								if( VIP_VIM <= 0.0549 )
									ret := 1.000000 // buy
								if( VIP_VIM > 0.0549 )
									ret := -0.514706
						if( ema12 > 16.108 )
							if( VIM <= 0.675229 )
								if( ema1 <= 2097.74 )
									ret := -0.093750
								if( ema1 > 2097.74 )
									ret := 1.000000 // buy
							if( VIM > 0.675229 )
								if( ema3 <= 1856.02 )
									ret := -0.581818
								if( ema3 > 1856.02 )
									ret := -0.927273 // sell
					if( ema2 > 2123.61 )
						if( ema12 <= 5.24071 )
							if( ema13 <= 4.63658 )
								if( ema1 <= 2368.54 )
									ret := 0.554217
								if( ema1 > 2368.54 )
									ret := -0.023504
							if( ema13 > 4.63658 )
								if( tema <= 2153.76 )
									ret := 0.954545 // buy
								if( tema > 2153.76 )
									ret := 0.338153
						if( ema12 > 5.24071 )
							if( ema13 <= 10.1155 )
								if( VIM <= 1.25805 )
									ret := -0.139785
								if( VIM > 1.25805 )
									ret := -0.686275
							if( ema13 > 10.1155 )
								if( ema1 <= 3222.85 )
									ret := 0.070597
								if( ema1 > 3222.85 )
									ret := 0.428571
			if( ema13 > 93.2017 )
				if( ema2 <= 2881.17 )
					if( ema3 <= 1923.08 )
						ret := -1.000000 // sell
					if( ema3 > 1923.08 )
						ret := -0.250000
				if( ema2 > 2881.17 )
					ret := -1.000000 // sell
	if( ema2 > 3234.3 )
		if( tema <= 3730.7 )
			if( ema1 <= 3242.2 )
				if( tema <= 3205.05 )
					if( VIP_VIM <= -0.383277 )
						if( ema2 <= 3251.13 )
							if( ema3 <= 3252.13 )
								ret := 0.000000
							if( ema3 > 3252.13 )
								if( ema1 <= 3224.07 )
									ret := 0.533333
								if( ema1 > 3224.07 )
									ret := 1.000000 // buy
						if( ema2 > 3251.13 )
							if( ema12 <= -23.8174 )
								ret := 0.000000
							if( ema12 > -23.8174 )
								ret := -0.600000
					if( VIP_VIM > -0.383277 )
						if( ema1 <= 3237.05 )
							ret := -0.500000
						if( ema1 > 3237.05 )
							ret := -1.000000 // sell
				if( tema > 3205.05 )
					if( ema12 <= -7.97674 )
						if( ema13 <= -39.0564 )
							ret := 0.000000
						if( ema13 > -39.0564 )
							if( VIP_VIM <= -0.539189 )
								if( ema3 <= 3258.03 )
									ret := -0.285714
								if( ema3 > 3258.03 )
									ret := -0.851852 // sell
							if( VIP_VIM > -0.539189 )
								if( ema2 <= 3254.39 )
									ret := -1.000000 // sell
								if( ema2 > 3254.39 )
									ret := -0.600000
					if( ema12 > -7.97674 )
						if( ema12 <= -0.055382 )
							if( VIM <= 1.04644 )
								ret := -0.500000
							if( VIM > 1.04644 )
								ret := 0.000000
						if( ema12 > -0.055382 )
							if( tema <= 3240.94 )
								ret := -0.750000 // sell
							if( tema > 3240.94 )
								ret := -1.000000 // sell
			if( ema1 > 3242.2 )
				if( VIP_VIM <= -0.094036 )
					if( ema13 <= -43.6146 )
						if( ema3 <= 3395.94 )
							if( ema2 <= 3285.03 )
								ret := 0.166667
							if( ema2 > 3285.03 )
								if( ema13 <= -64.3196 )
									ret := 0.166667
								if( ema13 > -64.3196 )
									ret := 0.871795 // buy
						if( ema3 > 3395.94 )
							if( ema2 <= 3451.93 )
								if( ema13 <= -75.038 )
									ret := 0.000000
								if( ema13 > -75.038 )
									ret := -0.636364
							if( ema2 > 3451.93 )
								if( VIP_VIM <= -0.745371 )
									ret := 0.857143 // buy
								if( VIP_VIM > -0.745371 )
									ret := 0.176471
					if( ema13 > -43.6146 )
						if( ema3 <= 3278.4 )
							if( ema3 <= 3259.12 )
								if( ema2 <= 3252.63 )
									ret := 0.350877
								if( ema2 > 3252.63 )
									ret := -0.571429
							if( ema3 > 3259.12 )
								if( ema12 <= -2.43621 )
									ret := 0.322222
								if( ema12 > -2.43621 )
									ret := 0.700000 // buy
						if( ema3 > 3278.4 )
							if( tema <= 3392.88 )
								if( ema3 <= 3392.49 )
									ret := -0.177114
								if( ema3 > 3392.49 )
									ret := -0.514286
							if( tema > 3392.88 )
								if( ema2 <= 3576.66 )
									ret := 0.023736
								if( ema2 > 3576.66 )
									ret := -0.250000
				if( VIP_VIM > -0.094036 )
					if( ema12 <= 1.79131 )
						if( VIP <= 1.30431 )
							if( VIM <= 0.997288 )
								if( ema2 <= 3298.19 )
									ret := -0.133333
								if( ema2 > 3298.19 )
									ret := 0.492188
							if( VIM > 0.997288 )
								if( ema12 <= -6.23602 )
									ret := 0.666667
								if( ema12 > -6.23602 )
									ret := 0.080065
						if( VIP > 1.30431 )
							if( ema2 <= 3275.21 )
								if( VIP_VIM <= 0.235048 )
									ret := -0.400000
								if( VIP_VIM > 0.235048 )
									ret := -1.000000 // sell
							if( ema2 > 3275.21 )
								if( ema2 <= 3456.92 )
									ret := 0.046512
								if( ema2 > 3456.92 )
									ret := -0.558824
					if( ema12 > 1.79131 )
						if( ema2 <= 3352.26 )
							if( tema <= 3347.39 )
								if( ema1 <= 3333.52 )
									ret := 0.020964
								if( ema1 > 3333.52 )
									ret := -0.800000 // sell
							if( tema > 3347.39 )
								if( ema13 <= 39.2612 )
									ret := 0.308411
								if( ema13 > 39.2612 )
									ret := 1.000000 // buy
						if( ema2 > 3352.26 )
							if( tema <= 3646.01 )
								if( ema13 <= 29.1701 )
									ret := -0.063356
								if( ema13 > 29.1701 )
									ret := -0.306977
							if( tema > 3646.01 )
								if( ema13 <= 4.12024 )
									ret := -0.500000
								if( ema13 > 4.12024 )
									ret := 0.386792
		if( tema > 3730.7 )
			if( ema3 <= 3693.53 )
				ret := -0.166667
			if( ema3 > 3693.53 )
				if( VIM <= 1.45198 )
					if( ema3 <= 3701.59 )
						ret := -0.750000 // sell
					if( ema3 > 3701.59 )
						ret := -1.000000 // sell
				if( VIM > 1.45198 )
					if( ema3 <= 3725.06 )
						ret := 0.000000
					if( ema3 > 3725.06 )
						ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AMZN_30Min_4d08c8d2(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)

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


