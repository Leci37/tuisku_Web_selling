//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: DBX_15Min_2BB0_1946e6e8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DBX_15Min_2BB0_1946e6e8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DBX_15Min_1946e6e8(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bullPower <= -0.019671 )
		if( bullPower <= -0.300484 )
			if( bbm <= 0.011555 )
				if( bullPower <= -1.07014 )
					ret := -1.000000 // sell
				if( bullPower > -1.07014 )
					if( basis <= 17.4279 )
						if( basis <= 16.0332 )
							ret := 1.000000 // buy
						if( basis > 16.0332 )
							ret := -1.000000 // sell
					if( basis > 17.4279 )
						if( basis <= 30.5616 )
							ret := 0.845361 // buy
						if( basis > 30.5616 )
							ret := 0.470588
			if( bbm > 0.011555 )
				if( Upper_Band <= 24.2567 )
					if( bbm <= 0.664203 )
						if( bullPower <= -0.474992 )
							ret := 0.744000 // buy
						if( bullPower > -0.474992 )
							ret := 0.325956
					if( bbm > 0.664203 )
						ret := -1.000000 // sell
				if( Upper_Band > 24.2567 )
					if( Lower_Band <= 29.1107 )
						if( Lower_Band <= 21.6629 )
							ret := -0.906250 // sell
						if( Lower_Band > 21.6629 )
							ret := -0.016981
					if( Lower_Band > 29.1107 )
						if( Lower_Band <= 30.9381 )
							ret := 0.812903 // buy
						if( Lower_Band > 30.9381 )
							ret := -0.066298
		if( bullPower > -0.300484 )
			if( Upper_Band <= 22.4552 )
				if( bearPower <= -0.313749 )
					if( bearPower <= -0.735768 )
						ret := 1.000000 // buy
					if( bearPower > -0.735768 )
						if( bbm <= 0.260633 )
							ret := 0.052632
						if( bbm > 0.260633 )
							ret := -0.278261
				if( bearPower > -0.313749 )
					if( bullPower <= -0.041687 )
						if( basis <= 21.7116 )
							ret := 0.225149
						if( basis > 21.7116 )
							ret := 0.384783
					if( bullPower > -0.041687 )
						if( basis <= 17.1453 )
							ret := 0.782609 // buy
						if( basis > 17.1453 )
							ret := 0.088741
			if( Upper_Band > 22.4552 )
				if( bbm <= 0.033198 )
					if( bbp <= -0.34227 )
						if( Upper_Band <= 23.8543 )
							ret := 0.329787
						if( Upper_Band > 23.8543 )
							ret := 0.695958
					if( bbp > -0.34227 )
						if( Upper_Band <= 23.8646 )
							ret := 0.089202
						if( Upper_Band > 23.8646 )
							ret := 0.281432
				if( bbm > 0.033198 )
					if( basis <= 22.3417 )
						if( bbp <= -0.382508 )
							ret := 0.210843
						if( bbp > -0.382508 )
							ret := -0.445844
					if( basis > 22.3417 )
						if( Upper_Band <= 42.0596 )
							ret := 0.024421
						if( Upper_Band > 42.0596 )
							ret := 0.921053 // buy
	if( bullPower > -0.019671 )
		if( bearPower <= 0.14779 )
			if( basis <= 17.909 )
				if( bullPower <= 0.010357 )
					if( Upper_Band <= 18.1411 )
						if( bbp <= -0.092136 )
							ret := -0.471429
						if( bbp > -0.092136 )
							ret := -0.038889
					if( Upper_Band > 18.1411 )
						if( bbp <= -0.387817 )
							ret := -0.500000
						if( bbp > -0.387817 )
							ret := 0.619048
				if( bullPower > 0.010357 )
					if( Lower_Band <= 15.1412 )
						if( bullPower <= 0.075792 )
							ret := 0.333333
						if( bullPower > 0.075792 )
							ret := 0.957447 // buy
					if( Lower_Band > 15.1412 )
						if( basis <= 16.7391 )
							ret := -0.392857
						if( basis > 16.7391 )
							ret := 0.227758
			if( basis > 17.909 )
				if( bullPower <= 0.087277 )
					if( Upper_Band <= 32.3109 )
						if( Lower_Band <= 31.4463 )
							ret := -0.018744
						if( Lower_Band > 31.4463 )
							ret := 0.607477
					if( Upper_Band > 32.3109 )
						if( Lower_Band <= 31.9473 )
							ret := -0.683673
						if( Lower_Band > 31.9473 )
							ret := -0.177453
				if( bullPower > 0.087277 )
					if( bbm <= 0.029906 )
						if( Upper_Band <= 18.6413 )
							ret := 0.575000
						if( Upper_Band > 18.6413 )
							ret := -0.264230
					if( bbm > 0.029906 )
						if( basis <= 39.3171 )
							ret := -0.070282
						if( basis > 39.3171 )
							ret := -0.600000
		if( bearPower > 0.14779 )
			if( Upper_Band <= 20.0341 )
				if( basis <= 18.8031 )
					if( basis <= 18.5512 )
						if( Upper_Band <= 18.4261 )
							ret := -0.092409
						if( Upper_Band > 18.4261 )
							ret := -0.798077 // sell
					if( basis > 18.5512 )
						if( bearPower <= 0.339156 )
							ret := 0.241379
						if( bearPower > 0.339156 )
							ret := 1.000000 // buy
				if( basis > 18.8031 )
					if( Upper_Band <= 19.5966 )
						if( bbm <= 0.172245 )
							ret := -0.929204 // sell
						if( bbm > 0.172245 )
							ret := 0.000000
					if( Upper_Band > 19.5966 )
						if( basis <= 19.151 )
							ret := 0.133333
						if( basis > 19.151 )
							ret := -0.752000 // sell
			if( Upper_Band > 20.0341 )
				if( basis <= 22.3258 )
					if( bearPower <= 0.327729 )
						if( Upper_Band <= 22.2192 )
							ret := -0.048864
						if( Upper_Band > 22.2192 )
							ret := 0.278481
					if( bearPower > 0.327729 )
						if( bullPower <= 0.767259 )
							ret := -0.490476
						if( bullPower > 0.767259 )
							ret := 0.056604
				if( basis > 22.3258 )
					if( bullPower <= 0.40379 )
						if( bbm <= 0.006578 )
							ret := -0.527546
						if( bbm > 0.006578 )
							ret := -0.267598
					if( bullPower > 0.40379 )
						if( bbp <= 0.806246 )
							ret := 0.081673
						if( bbp > 0.806246 )
							ret := -0.241167
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_DBX_15Min_1946e6e8(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


