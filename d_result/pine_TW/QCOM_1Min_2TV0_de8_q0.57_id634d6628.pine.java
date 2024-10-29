//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: QCOM_1Min_2TV0_634d6628 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Min_2TV0_634d6628", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Min_634d6628(ema2, ema1, ema12, ema3, ema13, tema, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema12 <= 0.238148 )
		if( ema13 <= -0.953464 )
			if( tema <= 178.933 )
				if( ema3 <= 177.598 )
					if( ema3 <= 159.48 )
						if( VIM <= 1.78183 )
							ret := 0.454545
						if( VIM > 1.78183 )
							if( tema <= 153.021 )
								ret := 1.000000 // buy
							if( tema > 153.021 )
								ret := 0.833333 // buy
					if( ema3 > 159.48 )
						if( tema <= 173.595 )
							if( VIP_VIM <= -1.00486 )
								if( VIP <= 2.97553 )
									ret := -0.631579
								if( VIP > 2.97553 )
									ret := 0.500000
							if( VIP_VIM > -1.00486 )
								if( VIP_VIM <= -0.671898 )
									ret := 0.701863 // buy
								if( VIP_VIM > -0.671898 )
									ret := 0.313480
						if( tema > 173.595 )
							if( ema12 <= -0.562589 )
								ret := -0.666667
							if( ema12 > -0.562589 )
								ret := -0.214286
				if( ema3 > 177.598 )
					if( VIM <= 6.76709 )
						if( VIP <= 1.9787 )
							if( tema <= 178.294 )
								ret := 1.000000 // buy
							if( tema > 178.294 )
								ret := 0.900000 // buy
						if( VIP > 1.9787 )
							ret := 0.875000 // buy
					if( VIM > 6.76709 )
						ret := 0.666667
			if( tema > 178.933 )
				if( ema12 <= -1.39234 )
					if( VIP_VIM <= -0.659312 )
						ret := -0.692308
					if( VIP_VIM > -0.659312 )
						if( VIP <= 4.16244 )
							ret := -1.000000 // sell
						if( VIP > 4.16244 )
							ret := -0.818182 // sell
				if( ema12 > -1.39234 )
					if( ema2 <= 191.239 )
						if( ema13 <= -0.992661 )
							if( ema12 <= -0.626353 )
								if( VIP <= 0.618265 )
									ret := 0.315789
								if( VIP > 0.618265 )
									ret := -0.620690
							if( ema12 > -0.626353 )
								if( VIM <= 1.42395 )
									ret := -0.578947
								if( VIM > 1.42395 )
									ret := -0.984375 // sell
						if( ema13 > -0.992661 )
							ret := 0.916667 // buy
					if( ema2 > 191.239 )
						if( ema1 <= 205.462 )
							if( tema <= 199.158 )
								if( ema12 <= -0.708958 )
									ret := 0.854545 // buy
								if( ema12 > -0.708958 )
									ret := -0.255556
							if( tema > 199.158 )
								if( VIM <= 2.91344 )
									ret := 0.745098 // buy
								if( VIM > 2.91344 )
									ret := -0.166667
						if( ema1 > 205.462 )
							if( ema1 <= 221.92 )
								if( ema13 <= -1.99025 )
									ret := 1.000000 // buy
								if( ema13 > -1.99025 )
									ret := -0.266667
							if( ema1 > 221.92 )
								if( ema12 <= -0.714911 )
									ret := 0.615385
								if( ema12 > -0.714911 )
									ret := 1.000000 // buy
		if( ema13 > -0.953464 )
			if( ema13 <= 0.501699 )
				if( tema <= 229.121 )
					if( ema2 <= 228.388 )
						if( VIM <= 51.8277 )
							if( VIP_VIM <= 0.82981 )
								if( tema <= 163.501 )
									ret := 0.069964
								if( tema > 163.501 )
									ret := -0.007602
							if( VIP_VIM > 0.82981 )
								if( ema13 <= -0.312373 )
									ret := -0.459016
								if( ema13 > -0.312373 )
									ret := 0.192418
						if( VIM > 51.8277 )
							if( ema13 <= -0.016826 )
								if( ema3 <= 180.011 )
									ret := -0.244373
								if( ema3 > 180.011 )
									ret := 0.649573
							if( ema13 > -0.016826 )
								if( VIP <= 114.763 )
									ret := -0.633803
								if( VIP > 114.763 )
									ret := -0.025157
					if( ema2 > 228.388 )
						if( ema3 <= 229.64 )
							if( ema1 <= 228.838 )
								if( ema1 <= 228.726 )
									ret := 0.539823
								if( ema1 > 228.726 )
									ret := 0.872727 // buy
							if( ema1 > 228.838 )
								if( ema1 <= 229.119 )
									ret := -0.097826
								if( ema1 > 229.119 )
									ret := 0.569444
						if( ema3 > 229.64 )
							ret := -0.789474 // sell
				if( tema > 229.121 )
					if( ema13 <= -0.042627 )
						ret := -0.043478
					if( ema13 > -0.042627 )
						if( VIM <= 0.909131 )
							if( VIP <= 1.22357 )
								if( tema <= 229.605 )
									ret := 0.034483
								if( tema > 229.605 )
									ret := -0.416667
							if( VIP > 1.22357 )
								if( tema <= 229.785 )
									ret := -0.538462
								if( tema > 229.785 )
									ret := -1.000000 // sell
						if( VIM > 0.909131 )
							if( VIP_VIM <= 0.363883 )
								if( VIP_VIM <= -0.361946 )
									ret := -0.500000
								if( VIP_VIM > -0.361946 )
									ret := -0.875000 // sell
							if( VIP_VIM > 0.363883 )
								ret := 0.176471
			if( ema13 > 0.501699 )
				if( ema1 <= 183.678 )
					if( VIP_VIM <= 0.139639 )
						if( ema3 <= 169.995 )
							ret := 0.166667
						if( ema3 > 169.995 )
							ret := -0.083333
					if( VIP_VIM > 0.139639 )
						if( VIM <= 2.39973 )
							if( tema <= 170.278 )
								if( ema1 <= 165.13 )
									ret := 0.860465 // buy
								if( ema1 > 165.13 )
									ret := 0.000000
							if( tema > 170.278 )
								if( VIM <= 0.776014 )
									ret := 1.000000 // buy
								if( VIM > 0.776014 )
									ret := 0.806452 // buy
						if( VIM > 2.39973 )
							ret := -0.312500
				if( ema1 > 183.678 )
					if( ema2 <= 211.729 )
						if( ema12 <= 0.17861 )
							ret := 0.571429
						if( ema12 > 0.17861 )
							if( ema3 <= 196.746 )
								if( ema13 <= 0.531859 )
									ret := 0.368421
								if( ema13 > 0.531859 )
									ret := -0.333333
							if( ema3 > 196.746 )
								if( VIP <= 1.25021 )
									ret := -0.307692
								if( VIP > 1.25021 )
									ret := -0.785714 // sell
					if( ema2 > 211.729 )
						if( VIP_VIM <= 0.518722 )
							if( tema <= 225.9 )
								ret := 0.090909
							if( tema > 225.9 )
								ret := 0.833333 // buy
						if( VIP_VIM > 0.518722 )
							ret := 1.000000 // buy
	if( ema12 > 0.238148 )
		if( ema13 <= 0.461854 )
			if( ema3 <= 188.195 )
				if( VIP_VIM <= -0.322015 )
					if( ema1 <= 161.775 )
						ret := 0.631579
					if( ema1 > 161.775 )
						ret := -0.300000
				if( VIP_VIM > -0.322015 )
					if( tema <= 174.503 )
						if( VIP <= 8.12869 )
							if( ema2 <= 171.976 )
								if( VIM <= 0.722175 )
									ret := 0.072072
								if( VIM > 0.722175 )
									ret := -0.565702
							if( ema2 > 171.976 )
								if( VIP <= 1.28944 )
									ret := 0.318182
								if( VIP > 1.28944 )
									ret := -0.461538
						if( VIP > 8.12869 )
							if( ema13 <= 0.443085 )
								if( VIM <= 18.2634 )
									ret := 1.000000 // buy
								if( VIM > 18.2634 )
									ret := -0.181818
							if( ema13 > 0.443085 )
								ret := -0.600000
					if( tema > 174.503 )
						if( VIM <= 0.656202 )
							if( VIM <= 0.609612 )
								ret := 0.000000
							if( VIM > 0.609612 )
								ret := 0.312500
						if( VIM > 0.656202 )
							if( VIP_VIM <= 0.035223 )
								ret := 0.200000
							if( VIP_VIM > 0.035223 )
								if( ema3 <= 181.091 )
									ret := -0.765363 // sell
								if( ema3 > 181.091 )
									ret := -0.397059
			if( ema3 > 188.195 )
				if( VIM <= 1.02785 )
					if( ema3 <= 200.044 )
						if( tema <= 198.556 )
							if( VIM <= 0.69498 )
								ret := -0.454545
							if( VIM > 0.69498 )
								if( ema2 <= 191.499 )
									ret := 0.760000 // buy
								if( ema2 > 191.499 )
									ret := 0.117647
						if( tema > 198.556 )
							if( ema2 <= 199.835 )
								if( ema13 <= 0.410767 )
									ret := 0.818182 // buy
								if( ema13 > 0.410767 )
									ret := 0.700000 // buy
							if( ema2 > 199.835 )
								ret := 1.000000 // buy
					if( ema3 > 200.044 )
						if( ema3 <= 205.552 )
							if( ema2 <= 205.182 )
								if( ema3 <= 201.148 )
									ret := -0.307692
								if( ema3 > 201.148 )
									ret := 0.025641
							if( ema2 > 205.182 )
								ret := -1.000000 // sell
						if( ema3 > 205.552 )
							if( ema2 <= 215.351 )
								if( VIM <= 0.690131 )
									ret := -0.294118
								if( VIM > 0.690131 )
									ret := 0.483146
							if( ema2 > 215.351 )
								if( tema <= 222.966 )
									ret := -0.600000
								if( tema > 222.966 )
									ret := 0.285714
				if( VIM > 1.02785 )
					if( VIP_VIM <= 1.51887 )
						if( ema13 <= 0.398601 )
							if( ema13 <= 0.329764 )
								if( VIP_VIM <= 0.442133 )
									ret := -0.363636
								if( VIP_VIM > 0.442133 )
									ret := -0.750000 // sell
							if( ema13 > 0.329764 )
								if( VIP_VIM <= 0.727773 )
									ret := 0.677419
								if( VIP_VIM > 0.727773 )
									ret := 0.000000
						if( ema13 > 0.398601 )
							if( VIP_VIM <= 0.18608 )
								if( tema <= 203.071 )
									ret := -0.400000
								if( tema > 203.071 )
									ret := 0.625000
							if( VIP_VIM > 0.18608 )
								if( ema13 <= 0.452448 )
									ret := -0.403226
								if( ema13 > 0.452448 )
									ret := -0.954545 // sell
					if( VIP_VIM > 1.51887 )
						ret := -0.866667 // sell
		if( ema13 > 0.461854 )
			if( ema12 <= 0.685825 )
				if( ema13 <= 1.24762 )
					if( tema <= 182.96 )
						if( VIM <= 0.665192 )
							if( ema2 <= 174.669 )
								if( ema3 <= 167.2 )
									ret := -0.142857
								if( ema3 > 167.2 )
									ret := -0.629834
							if( ema2 > 174.669 )
								if( ema3 <= 178.273 )
									ret := 0.527273
								if( ema3 > 178.273 )
									ret := -0.384615
						if( VIM > 0.665192 )
							if( tema <= 151.518 )
								if( ema13 <= 0.700634 )
									ret := 0.800000 // buy
								if( ema13 > 0.700634 )
									ret := 1.000000 // buy
							if( tema > 151.518 )
								if( ema12 <= 0.272758 )
									ret := 0.234339
								if( ema12 > 0.272758 )
									ret := -0.029979
					if( tema > 182.96 )
						if( VIP_VIM <= -0.290403 )
							if( VIP_VIM <= -0.462937 )
								if( ema12 <= 0.300798 )
									ret := -0.875000 // sell
								if( ema12 > 0.300798 )
									ret := -1.000000 // sell
							if( VIP_VIM > -0.462937 )
								ret := -0.565217
						if( VIP_VIM > -0.290403 )
							if( tema <= 212.613 )
								if( tema <= 209.886 )
									ret := -0.137863
								if( tema > 209.886 )
									ret := -0.765306 // sell
							if( tema > 212.613 )
								if( ema13 <= 0.635329 )
									ret := 0.385366
								if( ema13 > 0.635329 )
									ret := -0.232143
				if( ema13 > 1.24762 )
					if( ema3 <= 208.205 )
						if( VIP_VIM <= 0.422632 )
							if( ema2 <= 160.955 )
								ret := 1.000000 // buy
							if( ema2 > 160.955 )
								ret := -0.583333
						if( VIP_VIM > 0.422632 )
							if( ema2 <= 201.151 )
								if( ema2 <= 193.318 )
									ret := 0.636364
								if( ema2 > 193.318 )
									ret := 1.000000 // buy
							if( ema2 > 201.151 )
								ret := 0.538462
					if( ema3 > 208.205 )
						ret := -1.000000 // sell
			if( ema12 > 0.685825 )
				if( ema3 <= 168.365 )
					if( tema <= 169.944 )
						if( VIM <= 2.38033 )
							if( ema13 <= 1.15849 )
								ret := -0.500000
							if( ema13 > 1.15849 )
								if( VIP <= 1.11939 )
									ret := -0.500000
								if( VIP > 1.11939 )
									ret := -0.982143 // sell
						if( VIM > 2.38033 )
							if( tema <= 159.565 )
								ret := -1.000000 // sell
							if( tema > 159.565 )
								ret := 0.117647
					if( tema > 169.944 )
						ret := -0.050000
				if( ema3 > 168.365 )
					if( tema <= 203.782 )
						if( ema13 <= 6.21597 )
							if( ema13 <= 1.25378 )
								ret := -0.384615
							if( ema13 > 1.25378 )
								if( VIP_VIM <= 0.435534 )
									ret := 0.090909
								if( VIP_VIM > 0.435534 )
									ret := 0.633803
						if( ema13 > 6.21597 )
							ret := -1.000000 // sell
					if( tema > 203.782 )
						if( VIP <= 1.57409 )
							if( ema2 <= 208.04 )
								ret := 0.055556
							if( ema2 > 208.04 )
								ret := -0.444444
						if( VIP > 1.57409 )
							if( ema2 <= 204.113 )
								if( VIP <= 2.14453 )
									ret := -1.000000 // sell
								if( VIP > 2.14453 )
									ret := -0.900000 // sell
							if( ema2 > 204.113 )
								if( VIM <= 2.23123 )
									ret := -0.266667
								if( VIM > 2.23123 )
									ret := -0.933333 // sell
	
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
float op_operation = decision_tree_0_QCOM_1Min_634d6628(ema2, ema1, ema12, ema3, ema13, tema, VIP, VIP_VIM, VIM)

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


