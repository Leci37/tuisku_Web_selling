//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: SNOW_1Min_2BB0_e68b9e9e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_2BB0_e68b9e9e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_e68b9e9e(basis, Upper_Band, Lower_Band, bbm, bearPower, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( bearPower <= 0.212016 )
		if( basis <= 109.829 )
			if( basis <= 108.98 )
				if( bearPower <= 0.024485 )
					if( Lower_Band <= 107.502 )
						if( bbm <= 0.057375 )
							if( bbm <= 0.031631 )
								ret := 0.969697 // buy
							if( bbm > 0.031631 )
								ret := 0.750000 // buy
						if( bbm > 0.057375 )
							if( bearPower <= -0.012593 )
								ret := 0.260274
							if( bearPower > -0.012593 )
								ret := -0.526316
					if( Lower_Band > 107.502 )
						if( Lower_Band <= 108.516 )
							if( Upper_Band <= 109.269 )
								ret := -0.312081
							if( Upper_Band > 109.269 )
								ret := -0.904762 // sell
						if( Lower_Band > 108.516 )
							if( bullPower <= 0.133934 )
								ret := 0.720930 // buy
							if( bullPower > 0.133934 )
								ret := -1.000000 // sell
				if( bearPower > 0.024485 )
					if( Upper_Band <= 107.961 )
						if( Lower_Band <= 107.18 )
							ret := 0.833333 // buy
						if( Lower_Band > 107.18 )
							if( basis <= 107.613 )
								ret := -1.000000 // sell
							if( basis > 107.613 )
								ret := 0.000000
					if( Upper_Band > 107.961 )
						if( Lower_Band <= 107.435 )
							if( bbp <= 0.521243 )
								ret := 1.000000 // buy
							if( bbp > 0.521243 )
								ret := 0.750000 // buy
						if( Lower_Band > 107.435 )
							if( Upper_Band <= 108.578 )
								ret := 0.878788 // buy
							if( Upper_Band > 108.578 )
								ret := 0.206349
			if( basis > 108.98 )
				if( bearPower <= 0.014505 )
					if( Lower_Band <= 108.763 )
						if( bbm <= 0.374589 )
							if( bbp <= -0.241757 )
								ret := 0.250000
							if( bbp > -0.241757 )
								ret := -0.571429
						if( bbm > 0.374589 )
							if( bbp <= 0.075531 )
								ret := 0.000000
							if( bbp > 0.075531 )
								ret := 1.000000 // buy
					if( Lower_Band > 108.763 )
						if( Lower_Band <= 109.044 )
							if( basis <= 109.248 )
								ret := 0.250000
							if( basis > 109.248 )
								ret := 0.714286 // buy
						if( Lower_Band > 109.044 )
							if( bbp <= 0.10072 )
								ret := 0.263773
							if( bbp > 0.10072 )
								ret := 0.734694 // buy
				if( bearPower > 0.014505 )
					if( bbp <= 0.124909 )
						if( basis <= 109.422 )
							if( Upper_Band <= 109.775 )
								ret := 0.000000
							if( Upper_Band > 109.775 )
								ret := -0.866667 // sell
						if( basis > 109.422 )
							if( bbm <= 0.029635 )
								ret := -0.454545
							if( bbm > 0.029635 )
								ret := 0.038462
					if( bbp > 0.124909 )
						if( bbm <= 0.020991 )
							if( Upper_Band <= 110.024 )
								ret := -0.384615
							if( Upper_Band > 110.024 )
								ret := 0.800000 // buy
						if( bbm > 0.020991 )
							if( Upper_Band <= 109.517 )
								ret := 0.690909
							if( Upper_Band > 109.517 )
								ret := 0.245136
		if( basis > 109.829 )
			if( bullPower <= -0.007452 )
				if( bbm <= 0.039915 )
					if( bullPower <= -0.124344 )
						if( basis <= 170.116 )
							if( basis <= 114.418 )
								ret := 0.440367
							if( basis > 114.418 )
								ret := 0.252757
						if( basis > 170.116 )
							if( basis <= 170.453 )
								ret := -1.000000 // sell
							if( basis > 170.453 )
								ret := -0.750000 // sell
					if( bullPower > -0.124344 )
						if( Upper_Band <= 158.247 )
							if( Lower_Band <= 154.084 )
								ret := 0.128490
							if( Lower_Band > 154.084 )
								ret := 0.513889
						if( Upper_Band > 158.247 )
							if( Lower_Band <= 168.221 )
								ret := -0.157480
							if( Lower_Band > 168.221 )
								ret := 0.814815 // buy
				if( bbm > 0.039915 )
					if( Lower_Band <= 109.219 )
						if( Lower_Band <= 109.024 )
							if( Upper_Band <= 111.424 )
								ret := 0.083333
							if( Upper_Band > 111.424 )
								ret := 0.892857 // buy
						if( Lower_Band > 109.024 )
							ret := 1.000000 // buy
					if( Lower_Band > 109.219 )
						if( Lower_Band <= 114.25 )
							if( bullPower <= -0.128067 )
								ret := 0.183342
							if( bullPower > -0.128067 )
								ret := -0.005974
						if( Lower_Band > 114.25 )
							if( basis <= 118.019 )
								ret := -0.217756
							if( basis > 118.019 )
								ret := -0.002718
			if( bullPower > -0.007452 )
				if( Lower_Band <= 120.14 )
					if( basis <= 119.784 )
						if( bullPower <= 0.274385 )
							if( basis <= 114.31 )
								ret := -0.035842
							if( basis > 114.31 )
								ret := -0.152452
						if( bullPower > 0.274385 )
							if( bbp <= 0.513993 )
								ret := 0.067285
							if( bbp > 0.513993 )
								ret := 0.264205
					if( basis > 119.784 )
						if( basis <= 120.006 )
							if( bbm <= 0.160322 )
								ret := -0.170213
							if( bbm > 0.160322 )
								ret := -0.917431 // sell
						if( basis > 120.006 )
							if( basis <= 120.194 )
								ret := 0.053571
							if( basis > 120.194 )
								ret := -0.479042
				if( Lower_Band > 120.14 )
					if( basis <= 122.67 )
						if( Lower_Band <= 121.812 )
							if( Upper_Band <= 121.337 )
								ret := 0.822785 // buy
							if( Upper_Band > 121.337 )
								ret := 0.010825
						if( Lower_Band > 121.812 )
							if( bbm <= 0.10647 )
								ret := -0.031250
							if( bbm > 0.10647 )
								ret := 0.659933
					if( basis > 122.67 )
						if( bbm <= 0.006067 )
							if( bearPower <= 0.082442 )
								ret := -0.079470
							if( bearPower > 0.082442 )
								ret := -0.268385
						if( bbm > 0.006067 )
							if( Upper_Band <= 176.282 )
								ret := 0.014181
							if( Upper_Band > 176.282 )
								ret := -1.000000 // sell
	if( bearPower > 0.212016 )
		if( Upper_Band <= 152.224 )
			if( bbm <= 0.059445 )
				if( bullPower <= 0.682602 )
					if( Upper_Band <= 132.54 )
						if( basis <= 126.247 )
							if( bearPower <= 0.307847 )
								ret := -0.221884
							if( bearPower > 0.307847 )
								ret := -0.483240
						if( basis > 126.247 )
							if( basis <= 127.156 )
								ret := -0.893333 // sell
							if( basis > 127.156 )
								ret := -0.506803
					if( Upper_Band > 132.54 )
						if( basis <= 137.916 )
							if( Lower_Band <= 131.292 )
								ret := 0.904762 // buy
							if( Lower_Band > 131.292 )
								ret := -0.027273
						if( basis > 137.916 )
							if( Lower_Band <= 146.888 )
								ret := -0.593458
							if( Lower_Band > 146.888 )
								ret := 0.227273
				if( bullPower > 0.682602 )
					if( Upper_Band <= 119.273 )
						if( bullPower <= 1.23795 )
							if( basis <= 114.063 )
								ret := 0.510638
							if( basis > 114.063 )
								ret := -0.500000
						if( bullPower > 1.23795 )
							if( Upper_Band <= 115.821 )
								ret := 0.000000
							if( Upper_Band > 115.821 )
								ret := 1.000000 // buy
					if( Upper_Band > 119.273 )
						if( basis <= 141.782 )
							if( bbp <= 1.65874 )
								ret := -0.235294
							if( bbp > 1.65874 )
								ret := -0.865385 // sell
						if( basis > 141.782 )
							if( Upper_Band <= 146.574 )
								ret := 1.000000 // buy
							if( Upper_Band > 146.574 )
								ret := -0.818182 // sell
			if( bbm > 0.059445 )
				if( Lower_Band <= 130.744 )
					if( Lower_Band <= 129.998 )
						if( Lower_Band <= 128.91 )
							if( basis <= 129.66 )
								ret := -0.029340
							if( basis > 129.66 )
								ret := -0.759259 // sell
						if( Lower_Band > 128.91 )
							if( bbp <= 1.14664 )
								ret := 0.500000
							if( bbp > 1.14664 )
								ret := -0.583333
					if( Lower_Band > 129.998 )
						if( bearPower <= 0.307966 )
							if( bbm <= 0.210221 )
								ret := -0.509091
							if( bbm > 0.210221 )
								ret := 0.125000
						if( bearPower > 0.307966 )
							if( bbm <= 0.123645 )
								ret := -0.500000
							if( bbm > 0.123645 )
								ret := -0.947368 // sell
				if( Lower_Band > 130.744 )
					if( basis <= 136.903 )
						if( Lower_Band <= 133.714 )
							if( Upper_Band <= 136.143 )
								ret := 0.121212
							if( Upper_Band > 136.143 )
								ret := 0.903226 // buy
						if( Lower_Band > 133.714 )
							if( bearPower <= 0.275693 )
								ret := 0.253521
							if( bearPower > 0.275693 )
								ret := 0.682119
					if( basis > 136.903 )
						if( Upper_Band <= 146.662 )
							if( Lower_Band <= 136.154 )
								ret := -0.964286 // sell
							if( Lower_Band > 136.154 )
								ret := -0.173913
						if( Upper_Band > 146.662 )
							if( Upper_Band <= 149.904 )
								ret := 0.514019
							if( Upper_Band > 149.904 )
								ret := -0.057692
		if( Upper_Band > 152.224 )
			if( Lower_Band <= 156.038 )
				if( basis <= 157.687 )
					if( basis <= 156.22 )
						if( basis <= 154.53 )
							if( bbp <= 2.86919 )
								ret := -0.666667
							if( bbp > 2.86919 )
								ret := 1.000000 // buy
						if( basis > 154.53 )
							if( Upper_Band <= 156.697 )
								ret := -0.274510
							if( Upper_Band > 156.697 )
								ret := 0.605263
					if( basis > 156.22 )
						if( Lower_Band <= 155.526 )
							if( bearPower <= 0.390456 )
								ret := -0.157895
							if( bearPower > 0.390456 )
								ret := -0.910714 // sell
						if( Lower_Band > 155.526 )
							if( bbm <= 0.222626 )
								ret := -0.977778 // sell
							if( bbm > 0.222626 )
								ret := -0.848485 // sell
				if( basis > 157.687 )
					if( Upper_Band <= 181.546 )
						if( bbm <= 5.70629 )
							if( bullPower <= 0.843759 )
								ret := 0.888889 // buy
							if( bullPower > 0.843759 )
								ret := -0.200000
						if( bbm > 5.70629 )
							ret := 1.000000 // buy
					if( Upper_Band > 181.546 )
						ret := -0.857143 // sell
			if( Lower_Band > 156.038 )
				if( Lower_Band <= 156.475 )
					if( Upper_Band <= 159.994 )
						if( bearPower <= 0.234051 )
							if( Lower_Band <= 156.221 )
								ret := 0.000000
							if( Lower_Band > 156.221 )
								ret := -0.750000 // sell
						if( bearPower > 0.234051 )
							if( bullPower <= 0.568433 )
								ret := 0.400000
							if( bullPower > 0.568433 )
								ret := 0.904762 // buy
					if( Upper_Band > 159.994 )
						if( Lower_Band <= 156.107 )
							ret := 0.000000
						if( Lower_Band > 156.107 )
							if( bullPower <= 0.776996 )
								ret := -0.750000 // sell
							if( bullPower > 0.776996 )
								ret := -1.000000 // sell
				if( Lower_Band > 156.475 )
					if( Upper_Band <= 170.559 )
						if( bearPower <= 0.445787 )
							if( Upper_Band <= 160.269 )
								ret := -0.296407
							if( Upper_Band > 160.269 )
								ret := -0.011527
						if( bearPower > 0.445787 )
							if( Lower_Band <= 163.307 )
								ret := -0.766129 // sell
							if( Lower_Band > 163.307 )
								ret := 0.500000
					if( Upper_Band > 170.559 )
						if( Upper_Band <= 171.284 )
							ret := -1.000000 // sell
						if( Upper_Band > 171.284 )
							if( bbm <= 0.25094 )
								ret := 0.625000
							if( bbm > 0.25094 )
								ret := -0.916667 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SNOW_1Min_e68b9e9e(basis, Upper_Band, Lower_Band, bbm, bearPower, bbp, bullPower, BBPower_Color)

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


