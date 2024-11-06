//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: CRWD_30Min_2BB0_9a0ab022 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_30Min_2BB0_9a0ab022", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_30Min_9a0ab022(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( bullPower <= 0.173043 )
		if( Upper_Band <= 104.989 )
			if( basis <= 74.9703 )
				if( bbm <= 0.250682 )
					if( Lower_Band <= 57.9301 )
						if( Upper_Band <= 50.2679 )
							ret := 0.466368
						if( Upper_Band > 50.2679 )
							ret := -0.149123
					if( Lower_Band > 57.9301 )
						if( bullPower <= 0.069981 )
							ret := 0.503254
						if( bullPower > 0.069981 )
							ret := -0.254902
				if( bbm > 0.250682 )
					if( Upper_Band <= 69.0952 )
						if( Lower_Band <= 62.4052 )
							ret := 0.045272
						if( Lower_Band > 62.4052 )
							ret := 0.631148
					if( Upper_Band > 69.0952 )
						if( bullPower <= -0.178045 )
							ret := -0.156923
						if( bullPower > -0.178045 )
							ret := -0.672956
			if( basis > 74.9703 )
				if( basis <= 88.3516 )
					if( Upper_Band <= 78.688 )
						if( Upper_Band <= 77.7561 )
							ret := 0.653846
						if( Upper_Band > 77.7561 )
							ret := 0.942308 // buy
					if( Upper_Band > 78.688 )
						if( Upper_Band <= 79.1026 )
							ret := -0.020000
						if( Upper_Band > 79.1026 )
							ret := 0.600543
				if( basis > 88.3516 )
					if( Upper_Band <= 100.463 )
						if( bullPower <= -1.24376 )
							ret := 0.880952 // buy
						if( bullPower > -1.24376 )
							ret := -0.060291
					if( Upper_Band > 100.463 )
						if( bbp <= -3.68308 )
							ret := 0.925000 // buy
						if( bbp > -3.68308 )
							ret := 0.442857
		if( Upper_Band > 104.989 )
			if( Lower_Band <= 114.811 )
				if( Upper_Band <= 107.577 )
					if( basis <= 104.118 )
						if( bullPower <= -0.195045 )
							ret := -0.182609
						if( bullPower > -0.195045 )
							ret := 0.580645
					if( basis > 104.118 )
						if( Lower_Band <= 103.815 )
							ret := -0.912281 // sell
						if( Lower_Band > 103.815 )
							ret := -0.344828
				if( Upper_Band > 107.577 )
					if( Lower_Band <= 101.711 )
						if( Upper_Band <= 108.535 )
							ret := 0.048780
						if( Upper_Band > 108.535 )
							ret := 0.875000 // buy
					if( Lower_Band > 101.711 )
						if( basis <= 114 )
							ret := -0.098532
						if( basis > 114 )
							ret := -0.371542
			if( Lower_Band > 114.811 )
				if( basis <= 125.08 )
					if( basis <= 119.583 )
						if( Upper_Band <= 118.317 )
							ret := 0.789474 // buy
						if( Upper_Band > 118.317 )
							ret := -0.164384
					if( basis > 119.583 )
						if( bbp <= -0.268197 )
							ret := 0.405063
						if( bbp > -0.268197 )
							ret := 0.857143 // buy
				if( basis > 125.08 )
					if( Upper_Band <= 285.491 )
						if( Upper_Band <= 197.843 )
							ret := 0.008168
						if( Upper_Band > 197.843 )
							ret := 0.129862
					if( Upper_Band > 285.491 )
						if( basis <= 281.089 )
							ret := -0.602564
						if( basis > 281.089 )
							ret := -0.045154
	if( bullPower > 0.173043 )
		if( Lower_Band <= 184.826 )
			if( bearPower <= 0.745276 )
				if( bbm <= 0.944886 )
					if( Lower_Band <= 87.4969 )
						if( Upper_Band <= 87.8216 )
							ret := -0.148986
						if( Upper_Band > 87.8216 )
							ret := -0.846774 // sell
					if( Lower_Band > 87.4969 )
						if( basis <= 95.6855 )
							ret := 0.396648
						if( basis > 95.6855 )
							ret := -0.046280
				if( bbm > 0.944886 )
					if( basis <= 68.1354 )
						if( Upper_Band <= 64.9938 )
							ret := 0.189873
						if( Upper_Band > 64.9938 )
							ret := 0.580645
					if( basis > 68.1354 )
						if( Upper_Band <= 71.7352 )
							ret := -0.839080 // sell
						if( Upper_Band > 71.7352 )
							ret := 0.008885
			if( bearPower > 0.745276 )
				if( Lower_Band <= 44.7462 )
					if( bullPower <= 1.67165 )
						if( bearPower <= 1.03646 )
							ret := -1.000000 // sell
						if( bearPower > 1.03646 )
							ret := -0.727273 // sell
					if( bullPower > 1.67165 )
						if( bbp <= 3.3879 )
							ret := 0.310345
						if( bbp > 3.3879 )
							ret := -0.542857
				if( Lower_Band > 44.7462 )
					if( Lower_Band <= 90.534 )
						if( bbp <= 1.86234 )
							ret := -0.341463
						if( bbp > 1.86234 )
							ret := 0.353741
					if( Lower_Band > 90.534 )
						if( Upper_Band <= 101.849 )
							ret := -0.693333
						if( Upper_Band > 101.849 )
							ret := 0.108246
		if( Lower_Band > 184.826 )
			if( Lower_Band <= 187.35 )
				if( basis <= 187.688 )
					if( bearPower <= 0.115113 )
						if( bullPower <= 0.443692 )
							ret := 0.307692
						if( bullPower > 0.443692 )
							ret := -0.680000
					if( bearPower > 0.115113 )
						ret := 0.583333
				if( basis > 187.688 )
					if( bbm <= 1.48298 )
						if( bearPower <= 0.777266 )
							ret := -0.636364
						if( bearPower > 0.777266 )
							ret := 0.102564
					if( bbm > 1.48298 )
						if( bbp <= -1.95582 )
							ret := -0.307692
						if( bbp > -1.95582 )
							ret := -0.867816 // sell
			if( Lower_Band > 187.35 )
				if( basis <= 235.37 )
					if( Lower_Band <= 217.564 )
						if( Upper_Band <= 218.358 )
							ret := -0.123551
						if( Upper_Band > 218.358 )
							ret := 0.063492
					if( Lower_Band > 217.564 )
						if( bullPower <= 1.12773 )
							ret := -0.004843
						if( bullPower > 1.12773 )
							ret := -0.367949
				if( basis > 235.37 )
					if( Upper_Band <= 242.723 )
						if( Lower_Band <= 232.47 )
							ret := -0.260870
						if( Lower_Band > 232.47 )
							ret := 0.502890
					if( Upper_Band > 242.723 )
						if( bearPower <= -12.1317 )
							ret := 0.750000 // buy
						if( bearPower > -12.1317 )
							ret := -0.041597
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bollinger_Bands 
//@version=5
//indicator shorttitle="BB", title="Bollinger Bands", overlay=true, timeframe="", timeframe_gaps=true)
length_BB = input.int(20, minval=1)
maType = input.string("SMA", "Basis MA Type", options = ["SMA", "EMA", "SMMA (RMA)", "WMA", "VWMA"])
src = input(close, title="Source")
mult = input.float(2.0, minval=0.001, maxval=50, title="StdDev")

ma(source, length_BB, _type) =>
    switch _type
        "SMA" => ta.sma(source, length_BB)
        "EMA" => ta.ema(source, length_BB)
        "SMMA (RMA)" => ta.rma(source, length_BB)
        "WMA" => ta.wma(source, length_BB)
        "VWMA" => ta.vwma(source, length_BB)

basis = ma(src, length_BB, maType)
dev = mult * ta.stdev(src, length_BB)
Upper_Band = basis + dev
Lower_Band = basis - dev
offset = input.int(0, "Offset", minval = -500, maxval = 500, display = display.data_window)
plot(basis, "Basis", color=#2962FF, offset = offset)
p1 = plot(Upper_Band, "Upper", color=#F23645, offset = offset)
p2 = plot(Lower_Band, "Lower", color=#089981, offset = offset)
fill(p1, p2, title = "Background", color=color.rgb(33, 150, 243, 95))

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
float op_operation = decision_tree_0_CRWD_30Min_9a0ab022(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


