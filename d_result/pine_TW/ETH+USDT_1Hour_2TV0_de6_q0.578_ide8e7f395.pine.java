//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: ETHUSDT_1Hour_2TV0_e8e7f395 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_1Hour_2TV0_e8e7f395", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_1Hour_e8e7f395(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema1 <= 1201.45 )
		if( VIP_VIM <= -0.379848 )
			if( ema1 <= 127.244 )
				if( VIM <= 1.19093 )
					if( VIP <= 0.768176 )
						ret := 0.923077 // buy
					if( VIP > 0.768176 )
						ret := -0.500000
				if( VIM > 1.19093 )
					if( ema13 <= -1.80178 )
						if( ema3 <= 129.62 )
							ret := 1.000000 // buy
						if( ema3 > 129.62 )
							ret := 0.875000 // buy
					if( ema13 > -1.80178 )
						ret := 0.500000
			if( ema1 > 127.244 )
				if( VIP_VIM <= -0.69042 )
					if( ema13 <= -5.76608 )
						if( ema3 <= 570.655 )
							ret := 0.866667 // buy
						if( ema3 > 570.655 )
							ret := 0.333333
					if( ema13 > -5.76608 )
						ret := -0.416667
				if( VIP_VIM > -0.69042 )
					if( VIM <= 1.30492 )
						if( ema3 <= 1206.67 )
							ret := -0.223635
						if( ema3 > 1206.67 )
							ret := 0.405405
					if( VIM > 1.30492 )
						if( ema3 <= 169.25 )
							ret := -0.250000
						if( ema3 > 169.25 )
							ret := -0.746269 // sell
		if( VIP_VIM > -0.379848 )
			if( ema3 <= 1154.53 )
				if( VIP_VIM <= 0.632167 )
					if( ema3 <= 1136.59 )
						if( ema12 <= -10.6551 )
							ret := 0.778947 // buy
						if( ema12 > -10.6551 )
							ret := 0.052994
					if( ema3 > 1136.59 )
						if( ema2 <= 1127.21 )
							ret := 0.200000
						if( ema2 > 1127.21 )
							ret := -0.714286 // sell
				if( VIP_VIM > 0.632167 )
					if( ema3 <= 234.634 )
						if( ema3 <= 144.391 )
							ret := -0.166667
						if( ema3 > 144.391 )
							ret := 0.685039
					if( ema3 > 234.634 )
						if( tema <= 1003.87 )
							ret := 0.207101
						if( tema > 1003.87 )
							ret := -0.800000 // sell
			if( ema3 > 1154.53 )
				if( ema3 <= 1179.8 )
					if( ema12 <= -4.14524 )
						if( ema12 <= -9.94315 )
							ret := -0.642857
						if( ema12 > -9.94315 )
							ret := -0.250000
					if( ema12 > -4.14524 )
						if( ema13 <= 17.2248 )
							ret := 0.971631 // buy
						if( ema13 > 17.2248 )
							ret := 0.327586
				if( ema3 > 1179.8 )
					if( ema12 <= -7.03285 )
						if( ema3 <= 1199.34 )
							ret := 0.093750
						if( ema3 > 1199.34 )
							ret := 0.859813 // buy
					if( ema12 > -7.03285 )
						if( VIP <= 0.909771 )
							ret := -0.324675
						if( VIP > 0.909771 )
							ret := 0.099448
	if( ema1 > 1201.45 )
		if( ema3 <= 1224.81 )
			if( ema13 <= -12.2391 )
				if( tema <= 1192.24 )
					ret := 0.700000 // buy
				if( tema > 1192.24 )
					ret := 1.000000 // buy
			if( ema13 > -12.2391 )
				if( tema <= 1220.29 )
					if( ema13 <= 6.03197 )
						if( VIM <= 1.05977 )
							ret := -0.433673
						if( VIM > 1.05977 )
							ret := -0.043478
					if( ema13 > 6.03197 )
						if( VIP_VIM <= 0.217407 )
							ret := 0.666667
						if( VIP_VIM > 0.217407 )
							ret := -0.125000
				if( tema > 1220.29 )
					if( ema3 <= 1215.72 )
						if( ema2 <= 1196.58 )
							ret := -0.058824
						if( ema2 > 1196.58 )
							ret := -0.701550 // sell
					if( ema3 > 1215.72 )
						if( ema3 <= 1217.95 )
							ret := 0.535714
						if( ema3 > 1217.95 )
							ret := -0.433071
		if( ema3 > 1224.81 )
			if( ema2 <= 3131.11 )
				if( ema3 <= 3114.1 )
					if( VIP_VIM <= 0.013716 )
						if( ema2 <= 3101.91 )
							ret := -0.033546
						if( ema2 > 3101.91 )
							ret := -0.718310 // sell
					if( VIP_VIM > 0.013716 )
						if( ema2 <= 2049.11 )
							ret := 0.062820
						if( ema2 > 2049.11 )
							ret := -0.016049
				if( ema3 > 3114.1 )
					if( ema1 <= 3061.7 )
						if( ema2 <= 3085.02 )
							ret := 0.684211
						if( ema2 > 3085.02 )
							ret := -0.555556
					if( ema1 > 3061.7 )
						if( tema <= 3069.58 )
							ret := 0.758929 // buy
						if( tema > 3069.58 )
							ret := 0.278846
			if( ema2 > 3131.11 )
				if( VIP_VIM <= -0.651577 )
					if( ema2 <= 3541.21 )
						if( ema3 <= 3235.2 )
							ret := -0.962963 // sell
						if( ema3 > 3235.2 )
							ret := 0.121212
					if( ema2 > 3541.21 )
						if( ema12 <= -96.5235 )
							ret := -0.100000
						if( ema12 > -96.5235 )
							ret := -0.848485 // sell
				if( VIP_VIM > -0.651577 )
					if( ema3 <= 3130.03 )
						if( ema13 <= 40.4307 )
							ret := -0.750000 // sell
						if( ema13 > 40.4307 )
							ret := -0.229167
					if( ema3 > 3130.03 )
						if( VIP <= 1.33862 )
							ret := -0.070990
						if( VIP > 1.33862 )
							ret := 0.300971
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_ETHUSDT_1Hour_e8e7f395(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


