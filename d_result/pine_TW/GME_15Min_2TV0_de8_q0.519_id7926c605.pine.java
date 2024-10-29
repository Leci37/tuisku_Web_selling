//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: GME_15Min_2TV0_7926c605 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_15Min_2TV0_7926c605", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_15Min_7926c605(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= 0.019953 )
		if( tema <= 4.20763 )
			if( ema3 <= 4.20209 )
				if( VIM <= 1.92548 )
					if( ema3 <= 3.96836 )
						if( VIM <= 1.48084 )
							if( ema2 <= 2.75292 )
								ret := 1.000000 // buy
							if( ema2 > 2.75292 )
								if( tema <= 3.03729 )
									ret := -0.239130
								if( tema > 3.03729 )
									ret := 0.329922
						if( VIM > 1.48084 )
							if( ema3 <= 2.94969 )
								if( ema2 <= 2.83584 )
									ret := -0.500000
								if( ema2 > 2.83584 )
									ret := -1.000000 // sell
							if( ema3 > 2.94969 )
								if( ema3 <= 3.15006 )
									ret := 0.882353 // buy
								if( ema3 > 3.15006 )
									ret := -0.169312
					if( ema3 > 3.96836 )
						if( ema1 <= 3.95362 )
							if( ema12 <= -0.126825 )
								if( ema1 <= 3.84897 )
									ret := 1.000000 // buy
								if( ema1 > 3.84897 )
									ret := 0.250000
							if( ema12 > -0.126825 )
								if( VIP <= 0.622626 )
									ret := 0.571429
								if( VIP > 0.622626 )
									ret := -0.831461 // sell
						if( ema1 > 3.95362 )
							if( ema3 <= 4.09294 )
								if( VIP_VIM <= -0.200619 )
									ret := 0.580189
								if( VIP_VIM > -0.200619 )
									ret := 0.109181
							if( ema3 > 4.09294 )
								if( tema <= 3.99372 )
									ret := -0.689655
								if( tema > 3.99372 )
									ret := 0.034166
				if( VIM > 1.92548 )
					if( VIM <= 3.69587 )
						if( VIP <= 0.990348 )
							ret := -0.250000
						if( VIP > 0.990348 )
							if( ema2 <= 3.85941 )
								if( ema12 <= -0.023686 )
									ret := 1.000000 // buy
								if( ema12 > -0.023686 )
									ret := 0.727273 // buy
							if( ema2 > 3.85941 )
								if( VIP <= 2.14412 )
									ret := 0.790323 // buy
								if( VIP > 2.14412 )
									ret := 0.461538
					if( VIM > 3.69587 )
						if( VIP_VIM <= -0.519138 )
							ret := -1.000000 // sell
						if( VIP_VIM > -0.519138 )
							if( VIM <= 5.19589 )
								if( VIP <= 4.55594 )
									ret := 1.000000 // buy
								if( VIP > 4.55594 )
									ret := 0.250000
							if( VIM > 5.19589 )
								ret := 1.000000 // buy
			if( ema3 > 4.20209 )
				if( VIP <= 1.33986 )
					if( VIP <= 0.891273 )
						if( VIP_VIM <= -0.507078 )
							if( ema12 <= -0.031769 )
								if( ema2 <= 4.47127 )
									ret := 0.895833 // buy
								if( ema2 > 4.47127 )
									ret := 0.250000
							if( ema12 > -0.031769 )
								ret := 0.000000
						if( VIP_VIM > -0.507078 )
							if( ema1 <= 4.23648 )
								if( VIM <= 1.14274 )
									ret := -0.357143
								if( VIM > 1.14274 )
									ret := 0.081081
							if( ema1 > 4.23648 )
								if( VIP <= 0.790151 )
									ret := -0.166667
								if( VIP > 0.790151 )
									ret := 0.857143 // buy
					if( VIP > 0.891273 )
						if( ema1 <= 4.15703 )
							if( ema13 <= -0.07699 )
								ret := 1.000000 // buy
							if( ema13 > -0.07699 )
								ret := 0.750000 // buy
						if( ema1 > 4.15703 )
							if( VIM <= 1.39449 )
								if( ema3 <= 4.25933 )
									ret := 0.581081
								if( ema3 > 4.25933 )
									ret := 0.900000 // buy
							if( VIM > 1.39449 )
								if( VIP <= 1.29169 )
									ret := 0.037037
								if( VIP > 1.29169 )
									ret := 1.000000 // buy
				if( VIP > 1.33986 )
					if( VIP_VIM <= -0.34666 )
						if( ema3 <= 4.24031 )
							if( ema2 <= 4.19055 )
								ret := -0.800000 // sell
							if( ema2 > 4.19055 )
								ret := -0.250000
						if( ema3 > 4.24031 )
							if( VIP_VIM <= -0.425751 )
								if( ema13 <= -0.143076 )
									ret := 0.750000 // buy
								if( ema13 > -0.143076 )
									ret := 1.000000 // buy
							if( VIP_VIM > -0.425751 )
								ret := 0.500000
					if( VIP_VIM > -0.34666 )
						if( VIM <= 2.36444 )
							if( VIM <= 1.7439 )
								ret := -0.714286 // sell
							if( VIM > 1.7439 )
								if( tema <= 4.1907 )
									ret := -1.000000 // sell
								if( tema > 4.1907 )
									ret := -0.750000 // sell
						if( VIM > 2.36444 )
							ret := 0.750000 // buy
		if( tema > 4.20763 )
			if( ema12 <= -13.2299 )
				if( ema1 <= 69.4735 )
					if( VIM <= 17.1084 )
						ret := -1.000000 // sell
					if( VIM > 17.1084 )
						ret := -0.250000
				if( ema1 > 69.4735 )
					if( ema13 <= -64.7439 )
						if( ema2 <= 319.326 )
							ret := -1.000000 // sell
						if( ema2 > 319.326 )
							ret := 0.800000 // buy
					if( ema13 > -64.7439 )
						if( VIP <= 0.639537 )
							ret := 0.000000
						if( VIP > 0.639537 )
							if( tema <= 234.116 )
								if( VIM <= 14.2742 )
									ret := 0.980392 // buy
								if( VIM > 14.2742 )
									ret := 0.400000
							if( tema > 234.116 )
								if( ema2 <= 290.637 )
									ret := -0.375000
								if( ema2 > 290.637 )
									ret := 0.860465 // buy
			if( ema12 > -13.2299 )
				if( VIP <= 1.41409 )
					if( ema3 <= 4.34953 )
						if( VIP_VIM <= -0.42712 )
							if( ema12 <= -0.0254 )
								if( VIM <= 1.54245 )
									ret := -0.200000
								if( VIM > 1.54245 )
									ret := 0.500000
							if( ema12 > -0.0254 )
								if( VIP <= 1.10859 )
									ret := -0.625000
								if( VIP > 1.10859 )
									ret := -1.000000 // sell
						if( VIP_VIM > -0.42712 )
							if( ema2 <= 4.23308 )
								if( VIM <= 1.17135 )
									ret := -0.085714
								if( VIM > 1.17135 )
									ret := 0.700000 // buy
							if( ema2 > 4.23308 )
								if( ema1 <= 4.24202 )
									ret := 0.000000
								if( ema1 > 4.24202 )
									ret := 0.510345
					if( ema3 > 4.34953 )
						if( tema <= 4.33873 )
							if( VIP_VIM <= -0.51596 )
								if( VIP_VIM <= -0.587397 )
									ret := -0.400000
								if( VIP_VIM > -0.587397 )
									ret := 0.666667
							if( VIP_VIM > -0.51596 )
								if( ema13 <= -0.048766 )
									ret := -0.762295 // sell
								if( ema13 > -0.048766 )
									ret := -0.411765
						if( tema > 4.33873 )
							if( tema <= 5.51517 )
								if( ema2 <= 5.55846 )
									ret := 0.129208
								if( ema2 > 5.55846 )
									ret := 0.765152 // buy
							if( tema > 5.51517 )
								if( ema1 <= 5.52533 )
									ret := -0.704918 // sell
								if( ema1 > 5.52533 )
									ret := 0.064450
				if( VIP > 1.41409 )
					if( tema <= 206.693 )
						if( ema13 <= -1.93939 )
							if( ema13 <= -3.36415 )
								if( ema3 <= 127.089 )
									ret := -1.000000 // sell
								if( ema3 > 127.089 )
									ret := 0.000000
							if( ema13 > -3.36415 )
								if( ema1 <= 133.861 )
									ret := 0.384615
								if( ema1 > 133.861 )
									ret := 0.769231 // buy
						if( ema13 > -1.93939 )
							if( VIM <= 1.70026 )
								if( VIP <= 1.62648 )
									ret := -0.019403
								if( VIP > 1.62648 )
									ret := 0.181617
							if( VIM > 1.70026 )
								if( ema2 <= 6.25134 )
									ret := -0.317784
								if( ema2 > 6.25134 )
									ret := -0.042093
					if( tema > 206.693 )
						if( ema13 <= -0.135627 )
							if( ema3 <= 254.872 )
								if( VIP <= 1.68338 )
									ret := 0.571429
								if( VIP > 1.68338 )
									ret := 0.933333 // buy
							if( ema3 > 254.872 )
								ret := -0.285714
						if( ema13 > -0.135627 )
							if( ema12 <= -0.091134 )
								ret := -0.750000 // sell
							if( ema12 > -0.091134 )
								if( ema12 <= -0.01975 )
									ret := 0.375000
								if( ema12 > -0.01975 )
									ret := -0.250000
	if( ema12 > 0.019953 )
		if( ema2 <= 316.464 )
			if( VIM <= 1.2305 )
				if( VIP_VIM <= 0.364719 )
					if( ema1 <= 4.14556 )
						if( ema12 <= 0.054973 )
							if( VIM <= 0.87665 )
								if( ema3 <= 3.7122 )
									ret := -0.529412
								if( ema3 > 3.7122 )
									ret := 0.333333
							if( VIM > 0.87665 )
								if( VIP_VIM <= 0.130603 )
									ret := 0.244186
								if( VIP_VIM > 0.130603 )
									ret := 0.642534
						if( ema12 > 0.054973 )
							if( VIP_VIM <= 0.256011 )
								if( VIM <= 0.922127 )
									ret := 0.400000
								if( VIM > 0.922127 )
									ret := -0.764706 // sell
							if( VIP_VIM > 0.256011 )
								ret := -1.000000 // sell
					if( ema1 > 4.14556 )
						if( ema2 <= 4.18822 )
							if( VIM <= 0.825652 )
								ret := 0.200000
							if( VIM > 0.825652 )
								if( tema <= 4.24353 )
									ret := -0.911111 // sell
								if( tema > 4.24353 )
									ret := -0.500000
						if( ema2 > 4.18822 )
							if( ema13 <= 1.70619 )
								if( ema3 <= 4.2121 )
									ret := 0.714286 // buy
								if( ema3 > 4.2121 )
									ret := 0.037416
							if( ema13 > 1.70619 )
								if( ema3 <= 152.842 )
									ret := 0.051305
								if( ema3 > 152.842 )
									ret := 0.240947
				if( VIP_VIM > 0.364719 )
					if( ema1 <= 159.852 )
						if( ema12 <= 1.64238 )
							if( ema1 <= 3.43013 )
								if( VIM <= 0.631088 )
									ret := -0.666667
								if( VIM > 0.631088 )
									ret := 0.578313
							if( ema1 > 3.43013 )
								if( ema2 <= 4.95661 )
									ret := -0.233480
								if( ema2 > 4.95661 )
									ret := -0.029245
						if( ema12 > 1.64238 )
							if( ema1 <= 54.1958 )
								if( VIP <= 1.53139 )
									ret := 0.664032
								if( VIP > 1.53139 )
									ret := -1.000000 // sell
							if( ema1 > 54.1958 )
								if( ema2 <= 62.113 )
									ret := -0.743243 // sell
								if( ema2 > 62.113 )
									ret := 0.190132
					if( ema1 > 159.852 )
						if( VIM <= 0.720922 )
							if( ema13 <= 8.65474 )
								if( ema2 <= 256.7 )
									ret := -0.345588
								if( ema2 > 256.7 )
									ret := 0.681818
							if( ema13 > 8.65474 )
								if( ema1 <= 300.716 )
									ret := -0.610169
								if( ema1 > 300.716 )
									ret := -1.000000 // sell
						if( VIM > 0.720922 )
							if( ema1 <= 186.782 )
								if( VIP <= 1.25429 )
									ret := -0.018957
								if( VIP > 1.25429 )
									ret := -0.449057
							if( ema1 > 186.782 )
								if( ema3 <= 189.07 )
									ret := 0.620000
								if( ema3 > 189.07 )
									ret := -0.027397
			if( VIM > 1.2305 )
				if( ema3 <= 261.889 )
					if( VIM <= 25.1751 )
						if( VIP_VIM <= 0.943629 )
							if( ema1 <= 3.887 )
								if( VIM <= 2.18855 )
									ret := -0.641791
								if( VIM > 2.18855 )
									ret := 0.777778 // buy
							if( ema1 > 3.887 )
								if( ema3 <= 4.0068 )
									ret := 0.516129
								if( ema3 > 4.0068 )
									ret := -0.137363
						if( VIP_VIM > 0.943629 )
							if( ema3 <= 4.10942 )
								ret := -1.000000 // sell
							if( ema3 > 4.10942 )
								if( VIP <= 19.9533 )
									ret := -0.270492
								if( VIP > 19.9533 )
									ret := -1.000000 // sell
					if( VIM > 25.1751 )
						ret := 1.000000 // buy
				if( ema3 > 261.889 )
					if( ema12 <= 0.896562 )
						if( ema12 <= 0.497002 )
							ret := 0.750000 // buy
						if( ema12 > 0.497002 )
							ret := 1.000000 // buy
					if( ema12 > 0.896562 )
						ret := 0.000000
		if( ema2 > 316.464 )
			if( ema12 <= 39.258 )
				if( VIP <= 1.27787 )
					if( tema <= 331.196 )
						if( ema3 <= 306.633 )
							ret := -1.000000 // sell
						if( ema3 > 306.633 )
							ret := -0.500000
					if( tema > 331.196 )
						if( VIP_VIM <= 0.029147 )
							if( ema12 <= 3.37459 )
								ret := -1.000000 // sell
							if( ema12 > 3.37459 )
								ret := -0.750000 // sell
						if( VIP_VIM > 0.029147 )
							ret := -1.000000 // sell
				if( VIP > 1.27787 )
					ret := -0.500000
			if( ema12 > 39.258 )
				if( ema13 <= 71.8161 )
					if( VIP_VIM <= 0.532831 )
						ret := 0.500000
					if( VIP_VIM > 0.532831 )
						ret := 1.000000 // buy
				if( ema13 > 71.8161 )
					ret := -0.600000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_GME_15Min_7926c605(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


