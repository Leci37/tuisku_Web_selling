//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: CRSR_15Min_2BT0_23356714 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRSR_15Min_2BT0_23356714", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRSR_15Min_23356714(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bullPower <= -0.085621 )
		if( bullPower <= -0.274264 )
			if( tema <= 45.7816 )
				if( tema <= 24.8094 )
					if( tema <= 11.3943 )
						if( bearPower <= -0.491133 )
							ret := 0.812500 // buy
						if( bearPower > -0.491133 )
							ret := -0.900000 // sell
					if( tema > 11.3943 )
						if( ema12 <= -0.280628 )
							ret := 0.296651
						if( ema12 > -0.280628 )
							ret := 0.660550
				if( tema > 24.8094 )
					if( tema <= 27.1845 )
						if( bbp <= -2.68609 )
							ret := 0.923077 // buy
						if( bbp > -2.68609 )
							ret := -0.678571
					if( tema > 27.1845 )
						if( bbp <= -0.813471 )
							ret := 0.401929
						if( bbp > -0.813471 )
							ret := 0.000000
			if( tema > 45.7816 )
				if( bbp <= -4.83996 )
					ret := 1.000000 // buy
				if( bbp > -4.83996 )
					ret := -1.000000 // sell
		if( bullPower > -0.274264 )
			if( bbm <= 0.016358 )
				if( ema13 <= -0.102614 )
					if( ema1 <= 9.89951 )
						if( ema1 <= 6.14361 )
							ret := 1.000000 // buy
						if( ema1 > 6.14361 )
							ret := -0.880000 // sell
					if( ema1 > 9.89951 )
						if( tema <= 15.262 )
							ret := 0.493827
						if( tema > 15.262 )
							ret := 0.121331
				if( ema13 > -0.102614 )
					if( ema13 <= 0.146856 )
						if( ema3 <= 11.8327 )
							ret := 0.894737 // buy
						if( ema3 > 11.8327 )
							ret := 0.477308
					if( ema13 > 0.146856 )
						ret := -0.785714 // sell
			if( bbm > 0.016358 )
				if( ema1 <= 11.0173 )
					if( ema12 <= -0.04882 )
						if( bearPower <= -0.260375 )
							ret := -0.020000
						if( bearPower > -0.260375 )
							ret := -0.595918
					if( ema12 > -0.04882 )
						if( ema2 <= 6.33284 )
							ret := 1.000000 // buy
						if( ema2 > 6.33284 )
							ret := 0.578947
				if( ema1 > 11.0173 )
					if( bbm <= 0.048467 )
						if( bullPower <= -0.199372 )
							ret := 0.686869
						if( bullPower > -0.199372 )
							ret := 0.269084
					if( bbm > 0.048467 )
						if( ema3 <= 40.413 )
							ret := 0.077950
						if( ema3 > 40.413 )
							ret := -0.281250
	if( bullPower > -0.085621 )
		if( ema12 <= 0.015793 )
			if( ema1 <= 12.9136 )
				if( ema13 <= -0.033988 )
					if( ema3 <= 12.3988 )
						if( tema <= 12.1467 )
							ret := -0.059511
						if( tema > 12.1467 )
							ret := -0.613333
					if( ema3 > 12.3988 )
						if( ema2 <= 12.4273 )
							ret := 0.877193 // buy
						if( ema2 > 12.4273 )
							ret := 0.113281
				if( ema13 > -0.033988 )
					if( bbm <= 0.033675 )
						if( ema1 <= 6.55129 )
							ret := 0.692000
						if( ema1 > 6.55129 )
							ret := 0.213099
					if( bbm > 0.033675 )
						if( bullPower <= 0.008466 )
							ret := -0.123260
						if( bullPower > 0.008466 )
							ret := 0.228211
			if( ema1 > 12.9136 )
				if( ema3 <= 23.9019 )
					if( ema1 <= 21.1213 )
						if( ema1 <= 19.9606 )
							ret := -0.064605
						if( ema1 > 19.9606 )
							ret := 0.247465
					if( ema1 > 21.1213 )
						if( bbm <= 0.109959 )
							ret := -0.512295
						if( bbm > 0.109959 )
							ret := -0.124054
				if( ema3 > 23.9019 )
					if( ema1 <= 24.495 )
						if( ema1 <= 24.2926 )
							ret := 0.368421
						if( ema1 > 24.2926 )
							ret := 0.777778 // buy
					if( ema1 > 24.495 )
						if( ema2 <= 39.5759 )
							ret := 0.061203
						if( ema2 > 39.5759 )
							ret := -0.230932
		if( ema12 > 0.015793 )
			if( tema <= 6.49342 )
				if( bearPower <= 0.069335 )
					if( bbp <= 0.104836 )
						if( ema3 <= 6.40011 )
							ret := 0.763736 // buy
						if( ema3 > 6.40011 )
							ret := -1.000000 // sell
					if( bbp > 0.104836 )
						if( ema1 <= 6.33667 )
							ret := 0.000000
						if( ema1 > 6.33667 )
							ret := 0.818182 // buy
				if( bearPower > 0.069335 )
					if( ema1 <= 6.29031 )
						if( ema1 <= 6.04647 )
							ret := -0.307692
						if( ema1 > 6.04647 )
							ret := -0.945946 // sell
					if( ema1 > 6.29031 )
						ret := 0.750000 // buy
			if( tema > 6.49342 )
				if( ema13 <= 0.059659 )
					if( ema1 <= 10.801 )
						if( bearPower <= 0.052764 )
							ret := -0.391447
						if( bearPower > 0.052764 )
							ret := -0.927928 // sell
					if( ema1 > 10.801 )
						if( ema1 <= 13.2417 )
							ret := 0.025303
						if( ema1 > 13.2417 )
							ret := -0.222809
				if( ema13 > 0.059659 )
					if( bearPower <= 0.396847 )
						if( ema3 <= 47.7797 )
							ret := -0.045397
						if( ema3 > 47.7797 )
							ret := 0.791045 // buy
					if( bearPower > 0.396847 )
						if( bbm <= 0.10513 )
							ret := -0.607843
						if( bbm > 0.10513 )
							ret := -0.172986
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_CRSR_15Min_23356714(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)

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


