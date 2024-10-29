//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: TWLO_5Min_2TV0_cc36fd38 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TWLO_5Min_2TV0_cc36fd38", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TWLO_5Min_cc36fd38(ema2, ema1, ema12, ema3, ema13, tema, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6,max_features=sqrt, min_samples_split=10,random_state=843828734)
	if( ema12 <= 0.094325 )
		if( VIP_VIM <= -1.15324 )
			if( ema1 <= 58.4878 )
				if( ema3 <= 55.2445 )
					if( VIP <= 11.9218 )
						if( tema <= 53.8134 )
							ret := 0.652174
						if( tema > 53.8134 )
							ret := 0.111111
					if( VIP > 11.9218 )
						ret := -1.000000 // sell
				if( ema3 > 55.2445 )
					if( VIP_VIM <= -1.73007 )
						ret := 0.500000
					if( VIP_VIM > -1.73007 )
						if( ema1 <= 55.0818 )
							ret := -1.000000 // sell
						if( ema1 > 55.0818 )
							ret := -0.520000
			if( ema1 > 58.4878 )
				if( VIP_VIM <= -1.34862 )
					if( VIP_VIM <= -1.79511 )
						if( tema <= 63.7785 )
							ret := 0.647059
						if( tema > 63.7785 )
							ret := -0.187500
					if( VIP_VIM > -1.79511 )
						if( VIP <= 6.41265 )
							ret := 0.823529 // buy
						if( VIP > 6.41265 )
							ret := 0.357143
				if( VIP_VIM > -1.34862 )
					if( tema <= 58.9694 )
						if( VIP <= 1.51051 )
							ret := 0.857143 // buy
						if( VIP > 1.51051 )
							ret := -1.000000 // sell
					if( tema > 58.9694 )
						if( ema3 <= 59.1894 )
							ret := -1.000000 // sell
						if( ema3 > 59.1894 )
							ret := 0.441176
		if( VIP_VIM > -1.15324 )
			if( VIP <= 1.15362 )
				if( ema1 <= 55.9896 )
					if( ema3 <= 46.5926 )
						if( ema12 <= -0.055987 )
							ret := 0.790000 // buy
						if( ema12 > -0.055987 )
							ret := 0.310345
					if( ema3 > 46.5926 )
						if( ema1 <= 49.8916 )
							ret := -0.072941
						if( ema1 > 49.8916 )
							ret := 0.130919
				if( ema1 > 55.9896 )
					if( ema3 <= 55.9775 )
						if( tema <= 56.0242 )
							ret := 0.000000
						if( tema > 56.0242 )
							ret := -0.934426 // sell
					if( ema3 > 55.9775 )
						if( VIM <= 1.46723 )
							ret := -0.030453
						if( VIM > 1.46723 )
							ret := 0.264637
			if( VIP > 1.15362 )
				if( ema1 <= 71.1858 )
					if( tema <= 70.4685 )
						if( ema12 <= -0.030773 )
							ret := 0.125094
						if( ema12 > -0.030773 )
							ret := 0.033951
					if( tema > 70.4685 )
						if( ema2 <= 70.5767 )
							ret := 0.085714
						if( ema2 > 70.5767 )
							ret := -0.562771
				if( ema1 > 71.1858 )
					if( ema3 <= 72.5039 )
						if( ema3 <= 72.1877 )
							ret := 0.404110
						if( ema3 > 72.1877 )
							ret := 0.732673 // buy
					if( ema3 > 72.5039 )
						if( ema3 <= 73.6474 )
							ret := -0.202479
						if( ema3 > 73.6474 )
							ret := 0.225681
	if( ema12 > 0.094325 )
		if( VIM <= 1.22729 )
			if( tema <= 60.0894 )
				if( ema2 <= 51.1658 )
					if( ema2 <= 50.6898 )
						if( ema13 <= 0.448372 )
							ret := 0.049430
						if( ema13 > 0.448372 )
							ret := -0.783784 // sell
					if( ema2 > 50.6898 )
						if( tema <= 51.0709 )
							ret := 0.000000
						if( tema > 51.0709 )
							ret := -0.840580 // sell
				if( ema2 > 51.1658 )
					if( ema13 <= 0.767931 )
						if( ema2 <= 55.9937 )
							ret := 0.261206
						if( ema2 > 55.9937 )
							ret := 0.024038
					if( ema13 > 0.767931 )
						if( ema3 <= 57.1299 )
							ret := 0.333333
						if( ema3 > 57.1299 )
							ret := 0.876712 // buy
			if( tema > 60.0894 )
				if( ema1 <= 60.1321 )
					if( ema3 <= 59.5106 )
						if( ema3 <= 59.3458 )
							ret := -0.474576
						if( ema3 > 59.3458 )
							ret := 0.681818
					if( ema3 > 59.5106 )
						if( tema <= 60.1199 )
							ret := -0.083333
						if( tema > 60.1199 )
							ret := -0.688679
				if( ema1 > 60.1321 )
					if( ema12 <= 0.520138 )
						if( ema3 <= 59.7696 )
							ret := 0.827586 // buy
						if( ema3 > 59.7696 )
							ret := -0.067253
					if( ema12 > 0.520138 )
						if( VIP <= 1.28253 )
							ret := -0.250000
						if( VIP > 1.28253 )
							ret := -0.723757 // sell
		if( VIM > 1.22729 )
			if( ema3 <= 54.1519 )
				if( tema <= 51.4652 )
					if( VIM <= 1.27618 )
						ret := 0.750000 // buy
					if( VIM > 1.27618 )
						if( VIM <= 2.82242 )
							ret := -0.910714 // sell
						if( VIM > 2.82242 )
							ret := 0.000000
				if( tema > 51.4652 )
					if( VIP_VIM <= 0.039688 )
						if( ema1 <= 53.2443 )
							ret := 0.901961 // buy
						if( ema1 > 53.2443 )
							ret := -0.500000
					if( VIP_VIM > 0.039688 )
						if( ema2 <= 53.2482 )
							ret := -0.119048
						if( ema2 > 53.2482 )
							ret := 0.666667
			if( ema3 > 54.1519 )
				if( ema2 <= 74.2646 )
					if( tema <= 57.8304 )
						if( ema3 <= 56.2191 )
							ret := -0.157895
						if( ema3 > 56.2191 )
							ret := -0.760234 // sell
					if( tema > 57.8304 )
						if( ema1 <= 61.9937 )
							ret := -0.136220
						if( ema1 > 61.9937 )
							ret := -0.347261
				if( ema2 > 74.2646 )
					if( VIM <= 50.7229 )
						if( VIM <= 1.40802 )
							ret := -0.166667
						if( VIM > 1.40802 )
							ret := -0.873786 // sell
					if( VIM > 50.7229 )
						if( tema <= 76.3128 )
							ret := 0.714286 // buy
						if( tema > 76.3128 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_TWLO_5Min_cc36fd38(ema2, ema1, ema12, ema3, ema13, tema, VIP, VIP_VIM, VIM)

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


