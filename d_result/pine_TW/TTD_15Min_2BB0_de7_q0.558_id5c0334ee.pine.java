//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: TTD_15Min_2BB0_5c0334ee Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TTD_15Min_2BB0_5c0334ee", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TTD_15Min_5c0334ee(Upper_Band, basis, Lower_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( bullPower <= -0.095881 )
		if( bbm <= 1.34048 )
			if( Lower_Band <= 43.6042 )
				if( bearPower <= -0.91699 )
					if( bbm <= 0.564976 )
						if( Upper_Band <= 595.265 )
							if( bullPower <= -1.25352 )
								ret := 0.973684 // buy
							if( bullPower > -1.25352 )
								ret := 0.714286 // buy
						if( Upper_Band > 595.265 )
							ret := 0.142857
					if( bbm > 0.564976 )
						if( Upper_Band <= 48.7362 )
							if( basis <= 43.7798 )
								ret := 0.688525
							if( basis > 43.7798 )
								ret := -0.500000
						if( Upper_Band > 48.7362 )
							if( basis <= 45.6694 )
								ret := 0.666667
							if( basis > 45.6694 )
								ret := 1.000000 // buy
				if( bearPower > -0.91699 )
					if( basis <= 36.6911 )
						if( bearPower <= -0.644365 )
							if( Upper_Band <= 35.4214 )
								ret := -0.320755
							if( Upper_Band > 35.4214 )
								ret := 0.916667 // buy
						if( bearPower > -0.644365 )
							if( bbp <= -0.451118 )
								ret := 0.621495
							if( bbp > -0.451118 )
								ret := 0.235294
					if( basis > 36.6911 )
						if( basis <= 41.3149 )
							if( bbm <= 0.398993 )
								ret := -0.287958
							if( bbm > 0.398993 )
								ret := 0.243243
						if( basis > 41.3149 )
							if( basis <= 44.7008 )
								ret := 0.361858
							if( basis > 44.7008 )
								ret := -0.354839
			if( Lower_Band > 43.6042 )
				if( Upper_Band <= 102.065 )
					if( bbm <= 0.884115 )
						if( bullPower <= -0.949668 )
							if( basis <= 94.0397 )
								ret := 0.305361
							if( basis > 94.0397 )
								ret := -0.580645
						if( bullPower > -0.949668 )
							if( bbp <= -1.64536 )
								ret := -0.008141
							if( bbp > -1.64536 )
								ret := 0.124388
					if( bbm > 0.884115 )
						if( bbp <= -2.37785 )
							if( basis <= 59.9748 )
								ret := 0.454545
							if( basis > 59.9748 )
								ret := -0.024823
						if( bbp > -2.37785 )
							if( Upper_Band <= 70.7016 )
								ret := -0.039427
							if( Upper_Band > 70.7016 )
								ret := -0.318966
				if( Upper_Band > 102.065 )
					if( basis <= 111.772 )
						if( bullPower <= -0.860315 )
							if( Lower_Band <= 99.1272 )
								ret := -0.166667
							if( Lower_Band > 99.1272 )
								ret := 0.758621 // buy
						if( bullPower > -0.860315 )
							if( Upper_Band <= 111.053 )
								ret := 0.179894
							if( Upper_Band > 111.053 )
								ret := 0.679245
					if( basis > 111.772 )
						if( Upper_Band <= 115.493 )
							if( Upper_Band <= 113.996 )
								ret := 0.214286
							if( Upper_Band > 113.996 )
								ret := -0.800000 // sell
						if( Upper_Band > 115.493 )
							if( Upper_Band <= 471.162 )
								ret := 0.184491
							if( Upper_Band > 471.162 )
								ret := 0.043750
		if( bbm > 1.34048 )
			if( bullPower <= -17.1702 )
				if( Upper_Band <= 686.726 )
					ret := 0.500000
				if( Upper_Band > 686.726 )
					if( Lower_Band <= 632.074 )
						if( bbp <= -123.577 )
							ret := -0.857143 // sell
						if( bbp > -123.577 )
							ret := -1.000000 // sell
					if( Lower_Band > 632.074 )
						if( Upper_Band <= 899.794 )
							ret := 0.400000
						if( Upper_Band > 899.794 )
							if( Upper_Band <= 980.191 )
								ret := -0.956522 // sell
							if( Upper_Band > 980.191 )
								ret := -0.714286 // sell
			if( bullPower > -17.1702 )
				if( bearPower <= -3.92733 )
					if( Lower_Band <= 108.401 )
						if( bbm <= 2.50799 )
							if( Upper_Band <= 112.279 )
								ret := 0.540541
							if( Upper_Band > 112.279 )
								ret := 0.953488 // buy
						if( bbm > 2.50799 )
							if( basis <= 83.3277 )
								ret := -0.846154 // sell
							if( basis > 83.3277 )
								ret := 0.333333
					if( Lower_Band > 108.401 )
						if( basis <= 124.813 )
							if( basis <= 119.548 )
								ret := 0.055556
							if( basis > 119.548 )
								ret := -0.962963 // sell
						if( basis > 124.813 )
							if( basis <= 147.329 )
								ret := 0.652778
							if( basis > 147.329 )
								ret := 0.053198
				if( bearPower > -3.92733 )
					if( Lower_Band <= 256.061 )
						if( basis <= 60.0112 )
							if( bearPower <= -2.2872 )
								ret := 0.681818
							if( bearPower > -2.2872 )
								ret := -0.018182
						if( basis > 60.0112 )
							if( basis <= 254.974 )
								ret := -0.137854
							if( basis > 254.974 )
								ret := -0.711538 // sell
					if( Lower_Band > 256.061 )
						if( Lower_Band <= 267.528 )
							if( Upper_Band <= 271.921 )
								ret := 0.153846
							if( Upper_Band > 271.921 )
								ret := 0.656716
						if( Lower_Band > 267.528 )
							if( bearPower <= -1.92543 )
								ret := 0.057451
							if( bearPower > -1.92543 )
								ret := -0.333333
	if( bullPower > -0.095881 )
		if( bbp <= 4.18915 )
			if( Lower_Band <= 48.7714 )
				if( bearPower <= 0.339616 )
					if( Upper_Band <= 50.9635 )
						if( bbm <= 0.160263 )
							if( Upper_Band <= 47.8599 )
								ret := -0.024320
							if( Upper_Band > 47.8599 )
								ret := 0.177340
						if( bbm > 0.160263 )
							if( Upper_Band <= 26.7307 )
								ret := 0.707317 // buy
							if( Upper_Band > 26.7307 )
								ret := 0.106795
					if( Upper_Band > 50.9635 )
						if( Upper_Band <= 54.7836 )
							if( bearPower <= 0.148179 )
								ret := 0.809211 // buy
							if( bearPower > 0.148179 )
								ret := -0.083333
						if( Upper_Band > 54.7836 )
							if( bullPower <= 0.50355 )
								ret := -0.875000 // sell
							if( bullPower > 0.50355 )
								ret := -0.285714
				if( bearPower > 0.339616 )
					if( bullPower <= 1.78256 )
						if( basis <= 49.413 )
							if( Lower_Band <= 44.2842 )
								ret := -0.071006
							if( Lower_Band > 44.2842 )
								ret := -0.405941
						if( basis > 49.413 )
							if( Upper_Band <= 52.3182 )
								ret := 0.514286
							if( Upper_Band > 52.3182 )
								ret := -0.233333
					if( bullPower > 1.78256 )
						if( basis <= 48.9441 )
							if( bbp <= 3.16257 )
								ret := 0.369565
							if( bbp > 3.16257 )
								ret := -0.437500
						if( basis > 48.9441 )
							if( bearPower <= 1.24878 )
								ret := 0.361702
							if( bearPower > 1.24878 )
								ret := 0.837838 // buy
			if( Lower_Band > 48.7714 )
				if( Upper_Band <= 336.355 )
					if( basis <= 248.775 )
						if( Lower_Band <= 232.926 )
							if( Upper_Band <= 232.37 )
								ret := 0.004173
							if( Upper_Band > 232.37 )
								ret := -0.214047
						if( Lower_Band > 232.926 )
							if( Lower_Band <= 236.617 )
								ret := 0.470588
							if( Lower_Band > 236.617 )
								ret := 0.066306
					if( basis > 248.775 )
						if( basis <= 252.028 )
							if( bullPower <= 0.93765 )
								ret := 0.000000
							if( bullPower > 0.93765 )
								ret := -0.607143
						if( basis > 252.028 )
							if( Upper_Band <= 258.428 )
								ret := 0.554545
							if( Upper_Band > 258.428 )
								ret := -0.062254
				if( Upper_Band > 336.355 )
					if( Upper_Band <= 352.926 )
						if( Lower_Band <= 333.505 )
							ret := 0.857143 // buy
						if( Lower_Band > 333.505 )
							ret := 1.000000 // buy
					if( Upper_Band > 352.926 )
						if( bbm <= 1.69677 )
							if( Lower_Band <= 400.836 )
								ret := 0.518868
							if( Lower_Band > 400.836 )
								ret := 0.144498
						if( bbm > 1.69677 )
							if( Upper_Band <= 359.136 )
								ret := -0.611111
							if( Upper_Band > 359.136 )
								ret := 0.017833
		if( bbp > 4.18915 )
			if( basis <= 190.113 )
				if( bbp <= 6.36937 )
					if( Lower_Band <= 38.7403 )
						if( bearPower <= 2.05295 )
							ret := 0.428571
						if( bearPower > 2.05295 )
							ret := 1.000000 // buy
					if( Lower_Band > 38.7403 )
						if( basis <= 45.1596 )
							if( bbm <= 1.05196 )
								ret := -1.000000 // sell
							if( bbm > 1.05196 )
								ret := -0.857143 // sell
						if( basis > 45.1596 )
							if( basis <= 58.1171 )
								ret := 0.784314 // buy
							if( basis > 58.1171 )
								ret := 0.162912
				if( bbp > 6.36937 )
					if( Upper_Band <= 204.86 )
						if( bbm <= 0.193444 )
							if( Lower_Band <= 170.578 )
								ret := -0.631579
							if( Lower_Band > 170.578 )
								ret := 0.857143 // buy
						if( bbm > 0.193444 )
							if( basis <= 116.758 )
								ret := 0.692308
							if( basis > 116.758 )
								ret := 0.448276
					if( Upper_Band > 204.86 )
						ret := -0.750000 // sell
			if( basis > 190.113 )
				if( Lower_Band <= 186.761 )
					if( bbp <= 18.5045 )
						if( Upper_Band <= 201.115 )
							if( bearPower <= 2.2553 )
								ret := 0.571429
							if( bearPower > 2.2553 )
								ret := -0.454545
						if( Upper_Band > 201.115 )
							if( bbm <= 2.3356 )
								ret := -0.767442 // sell
							if( bbm > 2.3356 )
								ret := -0.954545 // sell
					if( bbp > 18.5045 )
						ret := 0.875000 // buy
				if( Lower_Band > 186.761 )
					if( basis <= 780.678 )
						if( Lower_Band <= 192.827 )
							if( Upper_Band <= 197.724 )
								ret := -0.812500 // sell
							if( Upper_Band > 197.724 )
								ret := 0.639456
						if( Lower_Band > 192.827 )
							if( bbm <= 2.64333 )
								ret := 0.148786
							if( bbm > 2.64333 )
								ret := 0.035044
					if( basis > 780.678 )
						if( bullPower <= 6.6639 )
							if( Lower_Band <= 920.538 )
								ret := 0.045213
							if( Lower_Band > 920.538 )
								ret := -0.488889
						if( bullPower > 6.6639 )
							if( Upper_Band <= 945.517 )
								ret := -0.268018
							if( Upper_Band > 945.517 )
								ret := -0.764706 // sell
	
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
float op_operation = decision_tree_0_TTD_15Min_5c0334ee(Upper_Band, basis, Lower_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)

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


