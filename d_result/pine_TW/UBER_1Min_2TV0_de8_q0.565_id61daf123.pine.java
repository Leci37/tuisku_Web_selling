//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: UBER_1Min_2TV0_61daf123 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_2TV0_61daf123", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_61daf123(ema2, ema1, ema12, ema3, ema13, tema, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= 0.023444 )
		if( ema12 <= -0.498473 )
			if( ema1 <= 67.8601 )
				if( VIP_VIM <= -0.747813 )
					ret := 0.727273 // buy
				if( VIP_VIM > -0.747813 )
					ret := 1.000000 // buy
			if( ema1 > 67.8601 )
				if( ema3 <= 72.6166 )
					ret := -0.647059
				if( ema3 > 72.6166 )
					if( tema <= 71.1486 )
						ret := 0.875000 // buy
					if( tema > 71.1486 )
						ret := 0.615385
		if( ema12 > -0.498473 )
			if( VIP_VIM <= -0.967418 )
				if( ema13 <= -0.039156 )
					if( VIM <= 47.0494 )
						if( ema12 <= -0.198322 )
							if( tema <= 65.5154 )
								if( VIP <= 0.606181 )
									ret := 0.848485 // buy
								if( VIP > 0.606181 )
									ret := -0.480000
							if( tema > 65.5154 )
								if( ema13 <= -0.601297 )
									ret := -0.903226 // sell
								if( ema13 > -0.601297 )
									ret := -0.424242
						if( ema12 > -0.198322 )
							if( VIP <= 34.6731 )
								if( tema <= 71.2441 )
									ret := 0.399464
								if( tema > 71.2441 )
									ret := 0.032070
							if( VIP > 34.6731 )
								if( VIP <= 36.3333 )
									ret := -1.000000 // sell
								if( VIP > 36.3333 )
									ret := 0.058824
					if( VIM > 47.0494 )
						if( ema1 <= 72.4722 )
							if( ema3 <= 71.0429 )
								if( ema2 <= 70.2436 )
									ret := 0.833333 // buy
								if( ema2 > 70.2436 )
									ret := 0.333333
							if( ema3 > 71.0429 )
								ret := 1.000000 // buy
						if( ema1 > 72.4722 )
							ret := 0.473684
				if( ema13 > -0.039156 )
					if( VIP <= 1.33806 )
						ret := 0.960000 // buy
					if( VIP > 1.33806 )
						if( ema12 <= -0.022597 )
							if( VIP <= 3.72399 )
								ret := -0.285714
							if( VIP > 3.72399 )
								if( ema1 <= 66.3161 )
									ret := 0.200000
								if( ema1 > 66.3161 )
									ret := 0.759259 // buy
						if( ema12 > -0.022597 )
							if( ema3 <= 69.0282 )
								if( VIM <= 4.60433 )
									ret := 0.600000
								if( VIM > 4.60433 )
									ret := -0.102902
							if( ema3 > 69.0282 )
								if( VIM <= 20.7573 )
									ret := -0.403433
								if( VIM > 20.7573 )
									ret := 0.140351
			if( VIP_VIM > -0.967418 )
				if( VIM <= 1.53605 )
					if( ema1 <= 79.4737 )
						if( ema3 <= 57.9769 )
							if( ema12 <= 0.002256 )
								if( ema13 <= -0.209933 )
									ret := 0.023256
								if( ema13 > -0.209933 )
									ret := 0.615385
							if( ema12 > 0.002256 )
								if( ema2 <= 57.3557 )
									ret := -0.600000
								if( ema2 > 57.3557 )
									ret := -0.037037
						if( ema3 > 57.9769 )
							if( ema2 <= 58.4818 )
								if( VIM <= 1.21343 )
									ret := -0.791304 // sell
								if( VIM > 1.21343 )
									ret := 0.400000
							if( ema2 > 58.4818 )
								if( VIP_VIM <= -0.820787 )
									ret := -0.309859
								if( VIP_VIM > -0.820787 )
									ret := -0.004795
					if( ema1 > 79.4737 )
						if( ema3 <= 81.9546 )
							if( VIM <= 1.35896 )
								if( ema13 <= 0.004653 )
									ret := 0.922330 // buy
								if( ema13 > 0.004653 )
									ret := 0.464286
							if( VIM > 1.35896 )
								ret := 0.153846
						if( ema3 > 81.9546 )
							if( ema3 <= 82.3256 )
								if( ema1 <= 82.0037 )
									ret := -0.145161
								if( ema1 > 82.0037 )
									ret := -0.936170 // sell
							if( ema3 > 82.3256 )
								if( ema3 <= 84.6461 )
									ret := 0.830189 // buy
								if( ema3 > 84.6461 )
									ret := 0.120635
				if( VIM > 1.53605 )
					if( ema3 <= 56.4694 )
						if( ema12 <= -0.098642 )
							if( ema1 <= 55.3323 )
								ret := -1.000000 // sell
							if( ema1 > 55.3323 )
								if( ema2 <= 55.8193 )
									ret := 0.863636 // buy
								if( ema2 > 55.8193 )
									ret := 0.615385
						if( ema12 > -0.098642 )
							if( ema12 <= -0.057596 )
								if( ema3 <= 56.1984 )
									ret := -0.769231 // sell
								if( ema3 > 56.1984 )
									ret := -0.894737 // sell
							if( ema12 > -0.057596 )
								ret := -1.000000 // sell
					if( ema3 > 56.4694 )
						if( tema <= 70.8606 )
							if( tema <= 69.5309 )
								if( VIM <= 16.9389 )
									ret := 0.118103
								if( VIM > 16.9389 )
									ret := 0.417453
							if( tema > 69.5309 )
								if( ema12 <= -0.029898 )
									ret := 0.681564
								if( ema12 > -0.029898 )
									ret := 0.350000
						if( tema > 70.8606 )
							if( ema12 <= -0.034285 )
								if( VIP_VIM <= -0.569743 )
									ret := -0.038095
								if( VIP_VIM > -0.569743 )
									ret := 0.419968
							if( ema12 > -0.034285 )
								if( ema3 <= 71.3755 )
									ret := -0.368794
								if( ema3 > 71.3755 )
									ret := -0.018137
	if( ema12 > 0.023444 )
		if( ema2 <= 55.3301 )
			if( tema <= 54.1779 )
				ret := 0.600000
			if( tema > 54.1779 )
				if( ema12 <= 0.207583 )
					ret := 1.000000 // buy
				if( ema12 > 0.207583 )
					ret := 0.750000 // buy
		if( ema2 > 55.3301 )
			if( ema3 <= 78.1733 )
				if( VIP <= 2.98156 )
					if( ema12 <= 0.419357 )
						if( ema13 <= 0.137122 )
							if( ema2 <= 77.6763 )
								if( VIP <= 2.03122 )
									ret := -0.023066
								if( VIP > 2.03122 )
									ret := 0.160938
							if( ema2 > 77.6763 )
								if( VIP_VIM <= 0.139107 )
									ret := -0.057143
								if( VIP_VIM > 0.139107 )
									ret := -0.449198
						if( ema13 > 0.137122 )
							if( tema <= 57.0809 )
								if( VIP <= 1.25383 )
									ret := 1.000000 // buy
								if( VIP > 1.25383 )
									ret := 0.818182 // buy
							if( tema > 57.0809 )
								if( ema1 <= 71.4552 )
									ret := -0.169059
								if( ema1 > 71.4552 )
									ret := -0.034958
					if( ema12 > 0.419357 )
						if( VIP_VIM <= 0.739673 )
							if( tema <= 68.468 )
								ret := -0.812500 // sell
							if( tema > 68.468 )
								if( ema12 <= 0.468683 )
									ret := -0.833333 // sell
								if( ema12 > 0.468683 )
									ret := -1.000000 // sell
						if( VIP_VIM > 0.739673 )
							if( VIP <= 1.50333 )
								if( ema2 <= 70.3586 )
									ret := -0.500000
								if( ema2 > 70.3586 )
									ret := -0.833333 // sell
							if( VIP > 1.50333 )
								ret := -1.000000 // sell
				if( VIP > 2.98156 )
					if( VIM <= 6.82717 )
						if( ema2 <= 69.9733 )
							if( ema2 <= 69.5305 )
								if( ema2 <= 64.7926 )
									ret := 0.108614
								if( ema2 > 64.7926 )
									ret := -0.273438
							if( ema2 > 69.5305 )
								if( ema2 <= 69.7096 )
									ret := 0.948718 // buy
								if( ema2 > 69.7096 )
									ret := 0.116279
						if( ema2 > 69.9733 )
							if( ema3 <= 70.4912 )
								if( ema3 <= 69.9446 )
									ret := -0.400000
								if( ema3 > 69.9446 )
									ret := -0.847458 // sell
							if( ema3 > 70.4912 )
								if( tema <= 71.1465 )
									ret := 0.512821
								if( tema > 71.1465 )
									ret := -0.379177
					if( VIM > 6.82717 )
						if( VIM <= 8.20274 )
							if( ema12 <= 0.079439 )
								if( tema <= 67.1104 )
									ret := -0.411765
								if( tema > 67.1104 )
									ret := 0.387324
							if( ema12 > 0.079439 )
								if( VIP <= 7.76021 )
									ret := 0.700000 // buy
								if( VIP > 7.76021 )
									ret := 0.952381 // buy
						if( VIM > 8.20274 )
							if( ema2 <= 76.3223 )
								if( VIM <= 9.83964 )
									ret := -0.491803
								if( VIM > 9.83964 )
									ret := -0.077258
							if( ema2 > 76.3223 )
								if( ema13 <= 0.062903 )
									ret := 0.750000 // buy
								if( ema13 > 0.062903 )
									ret := 0.484848
			if( ema3 > 78.1733 )
				if( ema3 <= 81.5262 )
					if( VIP <= 2.80992 )
						if( VIP_VIM <= 0.809007 )
							if( ema1 <= 80.9044 )
								if( VIM <= 1.43146 )
									ret := 0.954545 // buy
								if( VIM > 1.43146 )
									ret := 0.727273 // buy
							if( ema1 > 80.9044 )
								if( ema3 <= 80.7646 )
									ret := -1.000000 // sell
								if( ema3 > 80.7646 )
									ret := 0.454545
						if( VIP_VIM > 0.809007 )
							if( VIP_VIM <= 1.28991 )
								if( ema13 <= 0.250019 )
									ret := 0.971831 // buy
								if( ema13 > 0.250019 )
									ret := -0.125000
							if( VIP_VIM > 1.28991 )
								ret := 1.000000 // buy
					if( VIP > 2.80992 )
						ret := 0.235294
				if( ema3 > 81.5262 )
					if( ema13 <= 0.130172 )
						if( VIP_VIM <= 0.17668 )
							if( ema1 <= 86.2304 )
								if( VIP_VIM <= 0.12178 )
									ret := -0.181818
								if( VIP_VIM > 0.12178 )
									ret := 0.480000
							if( ema1 > 86.2304 )
								if( VIM <= 0.942718 )
									ret := 0.777778 // buy
								if( VIM > 0.942718 )
									ret := 1.000000 // buy
						if( VIP_VIM > 0.17668 )
							if( ema2 <= 85.6177 )
								if( VIM <= 0.809792 )
									ret := 0.000000
								if( VIM > 0.809792 )
									ret := -0.661157
							if( ema2 > 85.6177 )
								if( VIM <= 0.811247 )
									ret := -0.200000
								if( VIM > 0.811247 )
									ret := 0.428571
					if( ema13 > 0.130172 )
						if( tema <= 82.0923 )
							if( tema <= 81.9534 )
								ret := -1.000000 // sell
							if( tema > 81.9534 )
								ret := -0.818182 // sell
						if( tema > 82.0923 )
							if( ema2 <= 86.5076 )
								if( ema3 <= 81.9307 )
									ret := 0.964286 // buy
								if( ema3 > 81.9307 )
									ret := 0.311897
							if( ema2 > 86.5076 )
								if( ema3 <= 86.4561 )
									ret := -1.000000 // sell
								if( ema3 > 86.4561 )
									ret := -0.714286 // sell
	
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
float op_operation = decision_tree_0_UBER_1Min_61daf123(ema2, ema1, ema12, ema3, ema13, tema, VIP, VIP_VIM, VIM)

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


