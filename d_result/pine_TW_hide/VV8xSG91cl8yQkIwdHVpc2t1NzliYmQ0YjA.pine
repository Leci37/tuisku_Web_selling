//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: U_1Hour_2BB0_79bbd4b0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Hour_2BB0_79bbd4b0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Hour_79bbd4b0(Upper_Band, basis, Lower_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( Upper_Band <= 40.8308 )
		if( bearPower <= -1.32697 )
			if( Lower_Band <= 30.7472 )
				if( bearPower <= -1.66628 )
					if( bullPower <= -1.14399 )
						if( bbm <= 0.690737 )
							ret := 1.000000 // buy
						if( bbm > 0.690737 )
							ret := 0.600000
					if( bullPower > -1.14399 )
						ret := 1.000000 // buy
				if( bearPower > -1.66628 )
					if( Lower_Band <= 29.8454 )
						if( Upper_Band <= 30.3167 )
							ret := 0.500000
						if( Upper_Band > 30.3167 )
							ret := 0.901961 // buy
					if( Lower_Band > 29.8454 )
						ret := -0.100000
			if( Lower_Band > 30.7472 )
				if( bearPower <= -1.45657 )
					if( Upper_Band <= 35.3412 )
						ret := -0.714286 // sell
					if( Upper_Band > 35.3412 )
						if( Upper_Band <= 36.5608 )
							ret := 0.769231 // buy
						if( Upper_Band > 36.5608 )
							ret := -0.026667
				if( bearPower > -1.45657 )
					if( Lower_Band <= 32.2221 )
						ret := 0.461538
					if( Lower_Band > 32.2221 )
						if( basis <= 38.6285 )
							ret := 0.777778 // buy
						if( basis > 38.6285 )
							ret := 1.000000 // buy
		if( bearPower > -1.32697 )
			if( basis <= 36.2997 )
				if( basis <= 16.2455 )
					if( Lower_Band <= 14.8813 )
						if( BBPower_Color <= 0.5 )
							ret := 0.404040
						if( BBPower_Color > 0.5 )
							ret := -0.388430
					if( Lower_Band > 14.8813 )
						if( Upper_Band <= 16.5295 )
							ret := 0.260116
						if( Upper_Band > 16.5295 )
							ret := 0.637500
				if( basis > 16.2455 )
					if( Lower_Band <= 15.9988 )
						if( bullPower <= -0.106132 )
							ret := 0.176471
						if( bullPower > -0.106132 )
							ret := -0.557471
					if( Lower_Band > 15.9988 )
						if( bearPower <= 0.692085 )
							ret := -0.000750
						if( bearPower > 0.692085 )
							ret := 0.345048
			if( basis > 36.2997 )
				if( bbm <= 0.274308 )
					if( Upper_Band <= 39.9165 )
						if( basis <= 36.5132 )
							ret := 0.875000 // buy
						if( basis > 36.5132 )
							ret := 0.062687
					if( Upper_Band > 39.9165 )
						if( Lower_Band <= 37.566 )
							ret := -0.108696
						if( Lower_Band > 37.566 )
							ret := -0.716667 // sell
				if( bbm > 0.274308 )
					if( bullPower <= -0.49412 )
						if( bbm <= 0.388298 )
							ret := 1.000000 // buy
						if( bbm > 0.388298 )
							ret := 0.684211
					if( bullPower > -0.49412 )
						if( bearPower <= 0.120145 )
							ret := 0.219684
						if( bearPower > 0.120145 )
							ret := 0.508591
	if( Upper_Band > 40.8308 )
		if( Lower_Band <= 63.6201 )
			if( Upper_Band <= 52.5556 )
				if( Lower_Band <= 41.3302 )
					if( bbp <= 0.20173 )
						if( bbm <= 1.18522 )
							ret := -0.500000
						if( bbm > 1.18522 )
							ret := -0.130000
					if( bbp > 0.20173 )
						if( bbm <= 1.31817 )
							ret := -0.161088
						if( bbm > 1.31817 )
							ret := 0.450704
				if( Lower_Band > 41.3302 )
					if( bullPower <= 1.07684 )
						if( bbm <= 0.419109 )
							ret := 0.257576
						if( bbm > 0.419109 )
							ret := -0.113527
					if( bullPower > 1.07684 )
						if( basis <= 47.3604 )
							ret := -0.610169
						if( basis > 47.3604 )
							ret := -1.000000 // sell
			if( Upper_Band > 52.5556 )
				if( Upper_Band <= 58.8252 )
					if( Lower_Band <= 52.5977 )
						if( bearPower <= -0.974023 )
							ret := -0.823529 // sell
						if( bearPower > -0.974023 )
							ret := -0.442857
					if( Lower_Band > 52.5977 )
						if( Upper_Band <= 56.6625 )
							ret := 0.454545
						if( Upper_Band > 56.6625 )
							ret := 1.000000 // buy
				if( Upper_Band > 58.8252 )
					if( bbm <= 1.855 )
						if( bbm <= 0.145 )
							ret := -0.500000
						if( bbm > 0.145 )
							ret := -0.944444 // sell
					if( bbm > 1.855 )
						if( basis <= 56.8276 )
							ret := -0.125000
						if( basis > 56.8276 )
							ret := -0.857143 // sell
		if( Lower_Band > 63.6201 )
			if( Upper_Band <= 102.729 )
				if( bearPower <= 1.37444 )
					if( bearPower <= -3.42426 )
						if( bearPower <= -4.62579 )
							ret := 0.232558
						if( bearPower > -4.62579 )
							ret := 0.688525
					if( bearPower > -3.42426 )
						if( Lower_Band <= 91.8649 )
							ret := -0.014647
						if( Lower_Band > 91.8649 )
							ret := 0.239796
				if( bearPower > 1.37444 )
					if( basis <= 87.6122 )
						if( bullPower <= 3.17094 )
							ret := 0.917808 // buy
						if( bullPower > 3.17094 )
							ret := 0.541667
					if( basis > 87.6122 )
						if( bbm <= 2.1799 )
							ret := 0.024096
						if( bbm > 2.1799 )
							ret := 0.804348 // buy
			if( Upper_Band > 102.729 )
				if( Lower_Band <= 111.443 )
					if( bbp <= -4.89759 )
						if( basis <= 111.872 )
							ret := 0.437229
						if( basis > 111.872 )
							ret := -0.612903
					if( bbp > -4.89759 )
						if( Lower_Band <= 106.766 )
							ret := -0.140131
						if( Lower_Band > 106.766 )
							ret := -0.557576
				if( Lower_Band > 111.443 )
					if( Lower_Band <= 118.17 )
						if( Upper_Band <= 122.952 )
							ret := 0.005128
						if( Upper_Band > 122.952 )
							ret := 0.628692
					if( Lower_Band > 118.17 )
						if( bbm <= 2.72481 )
							ret := 0.036564
						if( bbm > 2.72481 )
							ret := -0.196778
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_U_1Hour_79bbd4b0(Upper_Band, basis, Lower_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)

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


