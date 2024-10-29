//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: NFLX_5Min_2TV0_cfaa62ec Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NFLX_5Min_2TV0_cfaa62ec", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NFLX_5Min_cfaa62ec(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( VIP <= 1.086 )
		if( ema1 <= 321.426 )
			if( VIM <= 1.32946 )
				if( VIP_VIM <= -0.130297 )
					if( ema13 <= -1.63573 )
						ret := 1.000000 // buy
					if( ema13 > -1.63573 )
						if( VIP <= 0.919633 )
							ret := 0.382353
						if( VIP > 0.919633 )
							ret := 0.880000 // buy
				if( VIP_VIM > -0.130297 )
					if( VIP_VIM <= -0.042898 )
						if( ema13 <= -0.248255 )
							ret := 0.454545
						if( ema13 > -0.248255 )
							ret := -0.741935 // sell
					if( VIP_VIM > -0.042898 )
						if( ema1 <= 320.978 )
							ret := 0.657895
						if( ema1 > 320.978 )
							ret := -0.050000
			if( VIM > 1.32946 )
				if( VIP <= 0.639406 )
					if( VIM <= 1.4159 )
						ret := -1.000000 // sell
					if( VIM > 1.4159 )
						ret := 0.000000
				if( VIP > 0.639406 )
					if( VIM <= 1.33834 )
						ret := -0.666667
					if( VIM > 1.33834 )
						ret := 0.545455
		if( ema1 > 321.426 )
			if( tema <= 325.592 )
				if( ema12 <= -0.807628 )
					if( ema2 <= 328.354 )
						if( VIP_VIM <= -0.41296 )
							ret := -0.971154 // sell
						if( VIP_VIM > -0.41296 )
							ret := 0.000000
					if( ema2 > 328.354 )
						ret := 0.000000
				if( ema12 > -0.807628 )
					if( ema12 <= -0.047432 )
						if( VIP_VIM <= -0.328135 )
							ret := -0.500000
						if( VIP_VIM > -0.328135 )
							ret := 0.136986
					if( ema12 > -0.047432 )
						if( tema <= 322.388 )
							ret := -0.125000
						if( tema > 322.388 )
							ret := -0.707071 // sell
			if( tema > 325.592 )
				if( ema12 <= -4.02578 )
					if( ema2 <= 465.85 )
						if( VIP <= 0.745789 )
							ret := 0.285714
						if( VIP > 0.745789 )
							ret := -1.000000 // sell
					if( ema2 > 465.85 )
						if( VIP <= 0.880122 )
							ret := 0.857143 // buy
						if( VIP > 0.880122 )
							ret := -1.000000 // sell
				if( ema12 > -4.02578 )
					if( ema13 <= -5.85062 )
						if( ema3 <= 427.59 )
							ret := 1.000000 // buy
						if( ema3 > 427.59 )
							ret := -0.657718
					if( ema13 > -5.85062 )
						if( VIP <= 0.715304 )
							ret := -0.160043
						if( VIP > 0.715304 )
							ret := -0.028590
	if( VIP > 1.086 )
		if( ema13 <= -0.075755 )
			if( VIP_VIM <= -0.269514 )
				if( tema <= 682.677 )
					if( VIP <= 1.19947 )
						if( VIM <= 1.56202 )
							ret := 0.324324
						if( VIM > 1.56202 )
							ret := -0.125581
					if( VIP > 1.19947 )
						if( ema1 <= 652.538 )
							ret := 0.310526
						if( ema1 > 652.538 )
							ret := 0.634615
				if( tema > 682.677 )
					if( ema3 <= 697.053 )
						if( VIP <= 1.7852 )
							ret := -0.105263
						if( VIP > 1.7852 )
							ret := -0.938776 // sell
					if( ema3 > 697.053 )
						if( VIP_VIM <= -0.827085 )
							ret := -0.750000 // sell
						if( VIP_VIM > -0.827085 )
							ret := 0.563380
			if( VIP_VIM > -0.269514 )
				if( tema <= 706.389 )
					if( ema2 <= 647.648 )
						if( VIM <= 2.22047 )
							ret := -0.010381
						if( VIM > 2.22047 )
							ret := 0.236295
					if( ema2 > 647.648 )
						if( VIM <= 1.5343 )
							ret := 0.260870
						if( VIM > 1.5343 )
							ret := 0.653137
				if( tema > 706.389 )
					if( ema3 <= 716.14 )
						if( ema12 <= 0.224085 )
							ret := -0.975000 // sell
						if( ema12 > 0.224085 )
							ret := 0.000000
					if( ema3 > 716.14 )
						if( VIM <= 3.12576 )
							ret := 0.214286
						if( VIM > 3.12576 )
							ret := -0.600000
		if( ema13 > -0.075755 )
			if( VIP_VIM <= 0.625505 )
				if( ema2 <= 678.105 )
					if( ema3 <= 663.541 )
						if( ema3 <= 658.772 )
							ret := 0.031835
						if( ema3 > 658.772 )
							ret := -0.533333
					if( ema3 > 663.541 )
						if( tema <= 670.381 )
							ret := 0.629371
						if( tema > 670.381 )
							ret := 0.135496
				if( ema2 > 678.105 )
					if( ema13 <= 1.01378 )
						if( tema <= 683.975 )
							ret := -0.216216
						if( tema > 683.975 )
							ret := 0.048926
					if( ema13 > 1.01378 )
						if( tema <= 680.67 )
							ret := -0.931818 // sell
						if( tema > 680.67 )
							ret := -0.202867
			if( VIP_VIM > 0.625505 )
				if( ema12 <= 1.47904 )
					if( ema2 <= 449.202 )
						if( ema13 <= 1.37382 )
							ret := -0.096649
						if( ema13 > 1.37382 )
							ret := -0.440909
					if( ema2 > 449.202 )
						if( ema3 <= 450.534 )
							ret := 1.000000 // buy
						if( ema3 > 450.534 )
							ret := -0.105394
				if( ema12 > 1.47904 )
					if( ema1 <= 380.234 )
						if( ema13 <= 2.85954 )
							ret := -1.000000 // sell
						if( ema13 > 2.85954 )
							ret := 0.760684 // buy
					if( ema1 > 380.234 )
						if( VIM <= 0.974167 )
							ret := -0.109444
						if( VIM > 0.974167 )
							ret := 0.398190
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_NFLX_5Min_cfaa62ec(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


