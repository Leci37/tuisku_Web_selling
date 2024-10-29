//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: HUBS_30Min_2BB0_4dd2b7ec Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_30Min_2BB0_4dd2b7ec", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_30Min_4dd2b7ec(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.65, min_samples_split=10,random_state=843828734)
	if( Lower_Band <= 128.381 )
		if( Upper_Band <= 44.4152 )
			if( bullPower <= 1.12052 )
				if( bearPower <= -2.06254 )
					if( Lower_Band <= 38.3742 )
						if( bullPower <= -2.77924 )
							ret := 0.333333
						if( bullPower > -2.77924 )
							ret := -0.936170 // sell
					if( Lower_Band > 38.3742 )
						ret := 1.000000 // buy
				if( bearPower > -2.06254 )
					if( bearPower <= 0.689045 )
						if( basis <= 28.8961 )
							ret := 0.972222 // buy
						if( basis > 28.8961 )
							ret := 0.320080
					if( bearPower > 0.689045 )
						if( basis <= 32.4031 )
							ret := -1.000000 // sell
						if( basis > 32.4031 )
							ret := -0.437500
			if( bullPower > 1.12052 )
				if( Lower_Band <= 34.6874 )
					if( Upper_Band <= 32.8121 )
						ret := -1.000000 // sell
					if( Upper_Band > 32.8121 )
						if( bearPower <= 0.1715 )
							ret := 0.500000
						if( bearPower > 0.1715 )
							ret := -0.793103 // sell
				if( Lower_Band > 34.6874 )
					if( Lower_Band <= 40.6416 )
						if( bbp <= 1.35562 )
							ret := -1.000000 // sell
						if( bbp > 1.35562 )
							ret := 0.388889
					if( Lower_Band > 40.6416 )
						ret := -1.000000 // sell
		if( Upper_Band > 44.4152 )
			if( basis <= 61.6719 )
				if( bbp <= 0.708059 )
					if( Upper_Band <= 50.3257 )
						if( basis <= 48.4764 )
							ret := -0.126342
						if( basis > 48.4764 )
							ret := -0.823529 // sell
					if( Upper_Band > 50.3257 )
						if( Lower_Band <= 50.9489 )
							ret := 0.195335
						if( Lower_Band > 50.9489 )
							ret := -0.094557
				if( bbp > 0.708059 )
					if( basis <= 43.2882 )
						if( Lower_Band <= 40.5108 )
							ret := 0.000000
						if( Lower_Band > 40.5108 )
							ret := -0.969697 // sell
					if( basis > 43.2882 )
						if( Upper_Band <= 46.925 )
							ret := 0.513889
						if( Upper_Band > 46.925 )
							ret := 0.047767
			if( basis > 61.6719 )
				if( bullPower <= -0.204009 )
					if( Upper_Band <= 137.163 )
						if( Upper_Band <= 135.804 )
							ret := 0.018204
						if( Upper_Band > 135.804 )
							ret := 0.737705 // buy
					if( Upper_Band > 137.163 )
						if( basis <= 133.656 )
							ret := -0.725490 // sell
						if( basis > 133.656 )
							ret := 0.195122
				if( bullPower > -0.204009 )
					if( Upper_Band <= 68.3595 )
						if( basis <= 66.1305 )
							ret := 0.178683
						if( basis > 66.1305 )
							ret := 0.829630 // buy
					if( Upper_Band > 68.3595 )
						if( bearPower <= 3.88822 )
							ret := 0.091329
						if( bearPower > 3.88822 )
							ret := 0.819444 // buy
	if( Lower_Band > 128.381 )
		if( Lower_Band <= 136.822 )
			if( Upper_Band <= 147.604 )
				if( bbm <= 3.31202 )
					if( bbm <= 1.08095 )
						if( bbp <= 3.19107 )
							ret := -0.157324
						if( bbp > 3.19107 )
							ret := 0.337349
					if( bbm > 1.08095 )
						if( basis <= 135.51 )
							ret := -0.472868
						if( basis > 135.51 )
							ret := -0.217593
				if( bbm > 3.31202 )
					if( Upper_Band <= 144.849 )
						if( bearPower <= -2.83848 )
							ret := 0.533333
						if( bearPower > -2.83848 )
							ret := 1.000000 // buy
					if( Upper_Band > 144.849 )
						if( bullPower <= 0.706983 )
							ret := 1.000000 // buy
						if( bullPower > 0.706983 )
							ret := -0.625000
			if( Upper_Band > 147.604 )
				if( Upper_Band <= 149.303 )
					if( bearPower <= -2.6818 )
						if( bbp <= -11.6682 )
							ret := -1.000000 // sell
						if( bbp > -11.6682 )
							ret := 0.384615
					if( bearPower > -2.6818 )
						if( bbm <= 1.7575 )
							ret := -0.892308 // sell
						if( bbm > 1.7575 )
							ret := -0.657895
				if( Upper_Band > 149.303 )
					if( bearPower <= 0.933871 )
						if( bbm <= 1.65693 )
							ret := 0.777778 // buy
						if( bbm > 1.65693 )
							ret := -0.382353
					if( bearPower > 0.933871 )
						if( bullPower <= 1.90072 )
							ret := 0.000000
						if( bullPower > 1.90072 )
							ret := -0.941176 // sell
		if( Lower_Band > 136.822 )
			if( basis <= 625.871 )
				if( basis <= 619.035 )
					if( bullPower <= -16.8172 )
						if( Upper_Band <= 644.633 )
							ret := 0.752941 // buy
						if( Upper_Band > 644.633 )
							ret := -1.000000 // sell
					if( bullPower > -16.8172 )
						if( bbp <= -11.9341 )
							ret := -0.092190
						if( bbp > -11.9341 )
							ret := 0.002856
				if( basis > 619.035 )
					if( bbp <= -13.6164 )
						if( bbm <= 1.53008 )
							ret := -1.000000 // sell
						if( bbm > 1.53008 )
							ret := -0.033333
					if( bbp > -13.6164 )
						if( Upper_Band <= 634.637 )
							ret := 0.298701
						if( Upper_Band > 634.637 )
							ret := 0.690722
			if( basis > 625.871 )
				if( basis <= 633.986 )
					if( bullPower <= 32.3199 )
						if( bullPower <= -7.06546 )
							ret := -0.260870
						if( bullPower > -7.06546 )
							ret := -0.737624 // sell
					if( bullPower > 32.3199 )
						ret := 1.000000 // buy
				if( basis > 633.986 )
					if( Upper_Band <= 846.572 )
						if( Upper_Band <= 816.958 )
							ret := -0.097333
						if( Upper_Band > 816.958 )
							ret := 0.314642
					if( Upper_Band > 846.572 )
						if( Lower_Band <= 828.104 )
							ret := -0.636364
						if( Lower_Band > 828.104 )
							ret := 0.000000
	
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
float op_operation = decision_tree_0_HUBS_30Min_4dd2b7ec(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


