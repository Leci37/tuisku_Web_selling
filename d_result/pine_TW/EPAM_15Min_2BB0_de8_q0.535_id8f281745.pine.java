//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: EPAM_15Min_2BB0_8f281745 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_EPAM_15Min_2BB0_8f281745", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_EPAM_15Min_8f281745(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= 1.44981 )
		if( Upper_Band <= 722.366 )
			if( bbm <= 0.046715 )
				if( Lower_Band <= 278.296 )
					if( bullPower <= -1.9691 )
						if( Upper_Band <= 274.345 )
							if( basis <= 204.325 )
								if( basis <= 183.722 )
									ret := 1.000000 // buy
								if( basis > 183.722 )
									ret := 0.846154 // buy
							if( basis > 204.325 )
								if( bearPower <= -4.61222 )
									ret := 0.050000
								if( bearPower > -4.61222 )
									ret := 0.755556 // buy
						if( Upper_Band > 274.345 )
							if( basis <= 272.957 )
								if( Upper_Band <= 274.792 )
									ret := -1.000000 // sell
								if( Upper_Band > 274.792 )
									ret := -0.500000
							if( basis > 272.957 )
								if( Upper_Band <= 280.923 )
									ret := 1.000000 // buy
								if( Upper_Band > 280.923 )
									ret := -0.444444
					if( bullPower > -1.9691 )
						if( Lower_Band <= 276.427 )
							if( bearPower <= 0.150507 )
								if( bbm <= 0.041514 )
									ret := 0.126935
								if( bbm > 0.041514 )
									ret := 0.592593
							if( bearPower > 0.150507 )
								if( Upper_Band <= 111.026 )
									ret := -0.076923
								if( Upper_Band > 111.026 )
									ret := 0.353211
						if( Lower_Band > 276.427 )
							if( basis <= 280.374 )
								ret := 1.000000 // buy
							if( basis > 280.374 )
								if( Lower_Band <= 277.867 )
									ret := 0.500000
								if( Lower_Band > 277.867 )
									ret := 1.000000 // buy
				if( Lower_Band > 278.296 )
					if( basis <= 300.61 )
						if( bearPower <= 0.226872 )
							if( Lower_Band <= 287.621 )
								if( bullPower <= -1.07495 )
									ret := -0.916667 // sell
								if( bullPower > -1.07495 )
									ret := -0.423077
							if( Lower_Band > 287.621 )
								if( basis <= 298.846 )
									ret := 0.206897
								if( basis > 298.846 )
									ret := -0.782609 // sell
						if( bearPower > 0.226872 )
							if( Upper_Band <= 301.953 )
								if( Upper_Band <= 300.239 )
									ret := 0.000000
								if( Upper_Band > 300.239 )
									ret := 1.000000 // buy
							if( Upper_Band > 301.953 )
								ret := -0.600000
					if( basis > 300.61 )
						if( bearPower <= -3.06384 )
							if( bullPower <= -4.14989 )
								if( basis <= 323.904 )
									ret := 0.866667 // buy
								if( basis > 323.904 )
									ret := 0.140625
							if( bullPower > -4.14989 )
								if( bearPower <= -3.82529 )
									ret := 1.000000 // buy
								if( bearPower > -3.82529 )
									ret := 0.625000
						if( bearPower > -3.06384 )
							if( Upper_Band <= 312.795 )
								if( Upper_Band <= 309.148 )
									ret := 0.142857
								if( Upper_Band > 309.148 )
									ret := 0.947368 // buy
							if( Upper_Band > 312.795 )
								if( basis <= 312.349 )
									ret := -0.777778 // sell
								if( basis > 312.349 )
									ret := 0.049223
			if( bbm > 0.046715 )
				if( basis <= 457.795 )
					if( bbp <= -10.4989 )
						if( bullPower <= -9.47381 )
							if( bbp <= -101.322 )
								ret := 1.000000 // buy
							if( bbp > -101.322 )
								if( basis <= 209.219 )
									ret := 0.500000
								if( basis > 209.219 )
									ret := -0.306250
						if( bullPower > -9.47381 )
							if( basis <= 442.168 )
								if( Upper_Band <= 190.727 )
									ret := 1.000000 // buy
								if( Upper_Band > 190.727 )
									ret := 0.227378
							if( basis > 442.168 )
								if( Upper_Band <= 480.085 )
									ret := 0.876404 // buy
								if( Upper_Band > 480.085 )
									ret := -0.555556
					if( bbp > -10.4989 )
						if( bullPower <= -0.120806 )
							if( Upper_Band <= 472.434 )
								if( basis <= 442.297 )
									ret := 0.024985
								if( basis > 442.297 )
									ret := 0.317647
							if( Upper_Band > 472.434 )
								if( bullPower <= -1.4324 )
									ret := -0.250000
								if( bullPower > -1.4324 )
									ret := -1.000000 // sell
						if( bullPower > -0.120806 )
							if( bbm <= 8.37301 )
								if( Lower_Band <= 380.772 )
									ret := 0.073681
								if( Lower_Band > 380.772 )
									ret := 0.202851
							if( bbm > 8.37301 )
								if( Upper_Band <= 334.404 )
									ret := -0.847826 // sell
								if( Upper_Band > 334.404 )
									ret := -0.020833
				if( basis > 457.795 )
					if( Lower_Band <= 475.643 )
						if( bbp <= -31.1037 )
							if( bbm <= 8.36796 )
								ret := 1.000000 // buy
							if( bbm > 8.36796 )
								ret := 0.750000 // buy
						if( bbp > -31.1037 )
							if( basis <= 487.205 )
								if( Upper_Band <= 487.079 )
									ret := -0.250784
								if( Upper_Band > 487.079 )
									ret := -0.705357 // sell
							if( basis > 487.205 )
								if( bbp <= -9.36748 )
									ret := 1.000000 // buy
								if( bbp > -9.36748 )
									ret := 0.600000
					if( Lower_Band > 475.643 )
						if( bbm <= 2.85822 )
							if( Upper_Band <= 633.368 )
								if( basis <= 629.558 )
									ret := 0.196018
								if( basis > 629.558 )
									ret := 0.894737 // buy
							if( Upper_Band > 633.368 )
								if( Lower_Band <= 646.205 )
									ret := -0.161074
								if( Lower_Band > 646.205 )
									ret := 0.188889
						if( bbm > 2.85822 )
							if( Upper_Band <= 703.623 )
								if( Upper_Band <= 561.87 )
									ret := 0.021898
								if( Upper_Band > 561.87 )
									ret := -0.330201
							if( Upper_Band > 703.623 )
								if( bearPower <= -13.8777 )
									ret := -1.000000 // sell
								if( bearPower > -13.8777 )
									ret := 0.640449
		if( Upper_Band > 722.366 )
			if( basis <= 717.011 )
				if( Lower_Band <= 677.001 )
					ret := 0.000000
				if( Lower_Band > 677.001 )
					ret := -1.000000 // sell
			if( basis > 717.011 )
				if( bearPower <= -1.6726 )
					ret := 0.000000
				if( bearPower > -1.6726 )
					ret := -0.500000
	if( bbp > 1.44981 )
		if( Upper_Band <= 705.784 )
			if( Lower_Band <= 581.205 )
				if( basis <= 325.038 )
					if( bearPower <= 7.18278 )
						if( bbm <= 0.037565 )
							if( Upper_Band <= 312.7 )
								if( basis <= 295.433 )
									ret := -0.204301
								if( basis > 295.433 )
									ret := -0.694915
							if( Upper_Band > 312.7 )
								if( bullPower <= 2.46447 )
									ret := 0.771429 // buy
								if( bullPower > 2.46447 )
									ret := -0.307692
						if( bbm > 0.037565 )
							if( basis <= 108.884 )
								if( Upper_Band <= 107.521 )
									ret := 0.034483
								if( Upper_Band > 107.521 )
									ret := 0.725806 // buy
							if( basis > 108.884 )
								if( Lower_Band <= 319.146 )
									ret := 0.010771
								if( Lower_Band > 319.146 )
									ret := 0.339130
					if( bearPower > 7.18278 )
						if( Lower_Band <= 203.327 )
							if( bbm <= 1.31079 )
								if( Lower_Band <= 166.563 )
									ret := -0.250000
								if( Lower_Band > 166.563 )
									ret := 1.000000 // buy
							if( bbm > 1.31079 )
								if( bullPower <= 13.6131 )
									ret := -1.000000 // sell
								if( bullPower > 13.6131 )
									ret := -0.800000 // sell
						if( Lower_Band > 203.327 )
							if( bearPower <= 13.2298 )
								if( Lower_Band <= 297.758 )
									ret := 0.760479 // buy
								if( Lower_Band > 297.758 )
									ret := 0.166667
							if( bearPower > 13.2298 )
								if( basis <= 292.446 )
									ret := 0.250000
								if( basis > 292.446 )
									ret := -1.000000 // sell
				if( basis > 325.038 )
					if( Lower_Band <= 316.69 )
						if( bbp <= 17.3196 )
							if( bbp <= 9.16225 )
								if( bbp <= 2.41271 )
									ret := -0.375000
								if( bbp > 2.41271 )
									ret := -0.842105 // sell
							if( bbp > 9.16225 )
								if( bbp <= 12.4802 )
									ret := 0.833333 // buy
								if( bbp > 12.4802 )
									ret := 0.000000
						if( bbp > 17.3196 )
							ret := -1.000000 // sell
					if( Lower_Band > 316.69 )
						if( basis <= 327.464 )
							if( basis <= 325.344 )
								if( Upper_Band <= 328.905 )
									ret := 1.000000 // buy
								if( Upper_Band > 328.905 )
									ret := 0.000000
							if( basis > 325.344 )
								if( Upper_Band <= 329.437 )
									ret := 0.125000
								if( Upper_Band > 329.437 )
									ret := -0.712766 // sell
						if( basis > 327.464 )
							if( bullPower <= 0.912523 )
								if( bbp <= 1.6989 )
									ret := -0.904762 // sell
								if( bbp > 1.6989 )
									ret := -0.500000
							if( bullPower > 0.912523 )
								if( bearPower <= 1.71734 )
									ret := 0.016627
								if( bearPower > 1.71734 )
									ret := -0.107029
			if( Lower_Band > 581.205 )
				if( basis <= 604.739 )
					if( bbp <= 1.73006 )
						if( Upper_Band <= 599.792 )
							ret := 0.000000
						if( Upper_Band > 599.792 )
							ret := -0.750000 // sell
					if( bbp > 1.73006 )
						if( bearPower <= 0.686842 )
							if( Lower_Band <= 584.89 )
								ret := 0.000000
							if( Lower_Band > 584.89 )
								if( bullPower <= 2.47382 )
									ret := 0.714286 // buy
								if( bullPower > 2.47382 )
									ret := 1.000000 // buy
						if( bearPower > 0.686842 )
							if( bbp <= 15.3288 )
								if( bullPower <= 4.91808 )
									ret := 0.465116
								if( bullPower > 4.91808 )
									ret := 0.037037
							if( bbp > 15.3288 )
								if( Upper_Band <= 609.837 )
									ret := 1.000000 // buy
								if( Upper_Band > 609.837 )
									ret := 0.777778 // buy
				if( basis > 604.739 )
					if( Lower_Band <= 600.994 )
						if( basis <= 607.723 )
							if( basis <= 605.603 )
								if( bbm <= 2.54484 )
									ret := -0.625000
								if( bbm > 2.54484 )
									ret := 0.166667
							if( basis > 605.603 )
								if( Lower_Band <= 596.39 )
									ret := -0.571429
								if( Lower_Band > 596.39 )
									ret := -1.000000 // sell
						if( basis > 607.723 )
							if( bbp <= 3.71161 )
								ret := 0.250000
							if( bbp > 3.71161 )
								if( bbm <= 2.44 )
									ret := 0.000000
								if( bbm > 2.44 )
									ret := -0.250000
					if( Lower_Band > 600.994 )
						if( bbp <= 8.19886 )
							if( Lower_Band <= 661.769 )
								if( bbm <= 0.743401 )
									ret := -0.297297
								if( bbm > 0.743401 )
									ret := 0.131488
							if( Lower_Band > 661.769 )
								if( bbm <= 1.03361 )
									ret := -0.923077 // sell
								if( bbm > 1.03361 )
									ret := -0.488889
						if( bbp > 8.19886 )
							if( basis <= 667.586 )
								if( Upper_Band <= 663.464 )
									ret := 0.444444
								if( Upper_Band > 663.464 )
									ret := -0.589286
							if( basis > 667.586 )
								if( Lower_Band <= 665.602 )
									ret := 0.923077 // buy
								if( Lower_Band > 665.602 )
									ret := 0.176471
		if( Upper_Band > 705.784 )
			if( bullPower <= 4.7339 )
				if( Upper_Band <= 713.127 )
					if( basis <= 700.494 )
						ret := -0.250000
					if( basis > 700.494 )
						ret := -1.000000 // sell
				if( Upper_Band > 713.127 )
					if( Upper_Band <= 717.605 )
						ret := 1.000000 // buy
					if( Upper_Band > 717.605 )
						if( basis <= 715.673 )
							if( bearPower <= 0.296698 )
								ret := 0.000000
							if( bearPower > 0.296698 )
								if( bearPower <= 1.23396 )
									ret := 0.500000
								if( bearPower > 1.23396 )
									ret := 0.083333
						if( basis > 715.673 )
							if( Lower_Band <= 710.997 )
								ret := -1.000000 // sell
							if( Lower_Band > 710.997 )
								ret := -0.142857
			if( bullPower > 4.7339 )
				if( Lower_Band <= 664.798 )
					if( Lower_Band <= 657.244 )
						ret := 0.500000
					if( Lower_Band > 657.244 )
						ret := 0.250000
				if( Lower_Band > 664.798 )
					if( basis <= 687.446 )
						ret := -0.250000
					if( basis > 687.446 )
						if( bullPower <= 8.07117 )
							if( Lower_Band <= 702.426 )
								if( bearPower <= 0.131107 )
									ret := -1.000000 // sell
								if( bearPower > 0.131107 )
									ret := -0.250000
							if( Lower_Band > 702.426 )
								ret := -1.000000 // sell
						if( bullPower > 8.07117 )
							if( basis <= 706.851 )
								ret := -1.000000 // sell
							if( basis > 706.851 )
								ret := -0.750000 // sell
	
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
float op_operation = decision_tree_0_EPAM_15Min_8f281745(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


