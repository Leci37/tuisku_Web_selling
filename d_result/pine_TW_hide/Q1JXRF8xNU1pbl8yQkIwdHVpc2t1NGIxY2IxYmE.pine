//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: CRWD_15Min_2BB0_4b1cb1ba Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_2BB0_4b1cb1ba", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_4b1cb1ba(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( bbp <= 0.179208 )
		if( bbm <= 0.13596 )
			if( bearPower <= -0.22924 )
				if( basis <= 103.688 )
					if( Upper_Band <= 59.4448 )
						if( Upper_Band <= 58.8925 )
							if( Lower_Band <= 34.896 )
								ret := 0.771429 // buy
							if( Lower_Band > 34.896 )
								ret := 0.170854
						if( Upper_Band > 58.8925 )
							if( bbp <= -1.10502 )
								ret := -0.923077 // sell
							if( bbp > -1.10502 )
								ret := -0.181818
					if( Upper_Band > 59.4448 )
						if( bullPower <= -0.321764 )
							if( Upper_Band <= 95.4682 )
								ret := 0.627178
							if( Upper_Band > 95.4682 )
								ret := 0.363636
						if( bullPower > -0.321764 )
							if( bullPower <= -0.253636 )
								ret := 0.119266
							if( bullPower > -0.253636 )
								ret := 0.526882
				if( basis > 103.688 )
					if( bullPower <= -0.22962 )
						if( bbm <= 4e-06 )
							if( basis <= 160.898 )
								ret := 0.212982
							if( basis > 160.898 )
								ret := 0.063273
						if( bbm > 4e-06 )
							if( bbm <= 0.009997 )
								ret := 0.463415
							if( bbm > 0.009997 )
								ret := 0.183476
					if( bullPower > -0.22962 )
						if( Lower_Band <= 115.353 )
							ret := -0.250000
						if( Lower_Band > 115.353 )
							if( Lower_Band <= 145.91 )
								ret := 0.685714
							if( Lower_Band > 145.91 )
								ret := 0.363636
			if( bearPower > -0.22924 )
				if( Upper_Band <= 47.0808 )
					if( Lower_Band <= 43.1288 )
						ret := -0.636364
					if( Lower_Band > 43.1288 )
						if( basis <= 45.8795 )
							if( bearPower <= -0.073703 )
								ret := 0.571429
							if( bearPower > -0.073703 )
								ret := 1.000000 // buy
						if( basis > 45.8795 )
							if( BBPower_Color <= 0.5 )
								ret := 1.000000 // buy
							if( BBPower_Color > 0.5 )
								ret := 0.866667 // buy
				if( Upper_Band > 47.0808 )
					if( Upper_Band <= 63.9051 )
						if( Upper_Band <= 55.3319 )
							if( Lower_Band <= 51.9916 )
								ret := 0.079681
							if( Lower_Band > 51.9916 )
								ret := 0.750000 // buy
						if( Upper_Band > 55.3319 )
							if( Lower_Band <= 54.8453 )
								ret := -0.520833
							if( Lower_Band > 54.8453 )
								ret := -0.036735
					if( Upper_Band > 63.9051 )
						if( basis <= 64.8718 )
							if( bullPower <= 0.005738 )
								ret := 0.833333 // buy
							if( bullPower > 0.005738 )
								ret := -0.142857
						if( basis > 64.8718 )
							if( basis <= 79.1333 )
								ret := 0.260870
							if( basis > 79.1333 )
								ret := 0.074858
		if( bbm > 0.13596 )
			if( Lower_Band <= 32.4372 )
				if( bbp <= -0.55924 )
					ret := 1.000000 // buy
				if( bbp > -0.55924 )
					ret := 0.571429
			if( Lower_Band > 32.4372 )
				if( Lower_Band <= 253.521 )
					if( Lower_Band <= 250.255 )
						if( bullPower <= -0.158323 )
							if( basis <= 103.804 )
								ret := 0.205349
							if( basis > 103.804 )
								ret := 0.080144
						if( bullPower > -0.158323 )
							if( bullPower <= 0.205811 )
								ret := 0.023285
							if( bullPower > 0.205811 )
								ret := 0.092197
					if( Lower_Band > 250.255 )
						if( bbp <= -3.92359 )
							if( bearPower <= -7.50012 )
								ret := 0.071429
							if( bearPower > -7.50012 )
								ret := 0.707692 // buy
						if( bbp > -3.92359 )
							if( bbp <= -1.37001 )
								ret := 0.147651
							if( bbp > -1.37001 )
								ret := 0.418079
				if( Lower_Band > 253.521 )
					if( Lower_Band <= 269.218 )
						if( Lower_Band <= 265.93 )
							if( bbm <= 3.74896 )
								ret := -0.038390
							if( bbm > 3.74896 )
								ret := 0.378049
						if( Lower_Band > 265.93 )
							if( bearPower <= -0.9414 )
								ret := -0.435644
							if( bearPower > -0.9414 )
								ret := 0.068966
					if( Lower_Band > 269.218 )
						if( Upper_Band <= 350.768 )
							if( Lower_Band <= 335.418 )
								ret := 0.040602
							if( Lower_Band > 335.418 )
								ret := 0.557047
						if( Upper_Band > 350.768 )
							if( basis <= 349.315 )
								ret := -0.557522
							if( basis > 349.315 )
								ret := 0.001883
	if( bbp > 0.179208 )
		if( bbp <= 3.06204 )
			if( bbm <= 0.549986 )
				if( Lower_Band <= 59.2458 )
					if( basis <= 45.4196 )
						if( bearPower <= 0.087832 )
							if( bearPower <= -0.051966 )
								ret := -0.714286 // sell
							if( bearPower > -0.051966 )
								ret := 0.375000
						if( bearPower > 0.087832 )
							if( bbp <= 0.716717 )
								ret := -0.700000 // sell
							if( bbp > 0.716717 )
								ret := -1.000000 // sell
					if( basis > 45.4196 )
						if( Upper_Band <= 47.6595 )
							if( Upper_Band <= 47.3785 )
								ret := -0.052632
							if( Upper_Band > 47.3785 )
								ret := 0.851852 // buy
						if( Upper_Band > 47.6595 )
							if( Lower_Band <= 58.5433 )
								ret := -0.174860
							if( Lower_Band > 58.5433 )
								ret := -0.586667
				if( Lower_Band > 59.2458 )
					if( Upper_Band <= 89.2522 )
						if( Upper_Band <= 74.2812 )
							if( Upper_Band <= 73.0016 )
								ret := -0.015111
							if( Upper_Band > 73.0016 )
								ret := 0.615385
						if( Upper_Band > 74.2812 )
							if( bbp <= 1.42806 )
								ret := -0.354276
							if( bbp > 1.42806 )
								ret := 0.138889
					if( Upper_Band > 89.2522 )
						if( Lower_Band <= 85.7364 )
							if( bullPower <= 1.51745 )
								ret := 0.974359 // buy
							if( bullPower > 1.51745 )
								ret := 0.571429
						if( Lower_Band > 85.7364 )
							if( bearPower <= 0.32005 )
								ret := 0.065486
							if( bearPower > 0.32005 )
								ret := -0.035259
			if( bbm > 0.549986 )
				if( Lower_Band <= 137.879 )
					if( Upper_Band <= 139.79 )
						if( Lower_Band <= 134.484 )
							if( Upper_Band <= 70.2337 )
								ret := 0.204369
							if( Upper_Band > 70.2337 )
								ret := 0.072208
						if( Lower_Band > 134.484 )
							if( bullPower <= 1.80319 )
								ret := -0.425373
							if( bullPower > 1.80319 )
								ret := 1.000000 // buy
					if( Upper_Band > 139.79 )
						if( BBPower_Color <= 0.5 )
							ret := -0.272727
						if( BBPower_Color > 0.5 )
							if( Upper_Band <= 140.965 )
								ret := 0.866667 // buy
							if( Upper_Band > 140.965 )
								ret := 0.389937
				if( Lower_Band > 137.879 )
					if( bearPower <= -2.24544 )
						if( Lower_Band <= 328.634 )
							if( basis <= 200.891 )
								ret := -0.052632
							if( basis > 200.891 )
								ret := -0.790698 // sell
						if( Lower_Band > 328.634 )
							ret := 0.444444
					if( bearPower > -2.24544 )
						if( BBPower_Color <= 0.5 )
							if( Lower_Band <= 317.606 )
								ret := 0.411765
							if( Lower_Band > 317.606 )
								ret := -0.687500
						if( BBPower_Color > 0.5 )
							if( basis <= 141.918 )
								ret := -0.376623
							if( basis > 141.918 )
								ret := 0.004908
		if( bbp > 3.06204 )
			if( bbm <= 8.99625 )
				if( Upper_Band <= 39.9607 )
					if( bullPower <= 2.21625 )
						ret := 1.000000 // buy
					if( bullPower > 2.21625 )
						ret := 0.571429
				if( Upper_Band > 39.9607 )
					if( Lower_Band <= 61.3598 )
						if( bbp <= 5.86723 )
							if( bbp <= 3.21246 )
								ret := 0.000000
							if( bbp > 3.21246 )
								ret := -0.735294 // sell
						if( bbp > 5.86723 )
							ret := 0.888889 // buy
					if( Lower_Band > 61.3598 )
						if( Upper_Band <= 95.1429 )
							if( bbp <= 4.20546 )
								ret := -0.015748
							if( bbp > 4.20546 )
								ret := 0.639175
						if( Upper_Band > 95.1429 )
							if( Lower_Band <= 97.4067 )
								ret := -0.623762
							if( Lower_Band > 97.4067 )
								ret := -0.062061
			if( bbm > 8.99625 )
				if( bearPower <= -2.75896 )
					if( bbp <= 8.11527 )
						ret := -0.714286 // sell
					if( bbp > 8.11527 )
						ret := 0.125000
				if( bearPower > -2.75896 )
					if( basis <= 296.52 )
						if( bullPower <= 8.39159 )
							ret := 0.900000 // buy
						if( bullPower > 8.39159 )
							if( bullPower <= 10.9416 )
								ret := -0.571429
							if( bullPower > 10.9416 )
								ret := 0.454545
					if( basis > 296.52 )
						if( basis <= 305.873 )
							ret := 1.000000 // buy
						if( basis > 305.873 )
							ret := 0.714286 // buy
	
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
float op_operation = decision_tree_0_CRWD_15Min_4b1cb1ba(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


