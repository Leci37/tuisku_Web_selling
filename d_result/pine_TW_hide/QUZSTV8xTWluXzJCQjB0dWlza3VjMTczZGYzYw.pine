//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: AFRM_1Min_2BB0_c173df3c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_2BB0_c173df3c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_c173df3c(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( bearPower <= 0.05236 )
		if( bbm <= 0.00987 )
			if( bearPower <= -0.009298 )
				if( bearPower <= -0.053552 )
					if( basis <= 24.2289 )
						if( Upper_Band <= 24.2688 )
							if( Lower_Band <= 21.805 )
								ret := -0.687500
							if( Lower_Band > 21.805 )
								ret := 0.583333
						if( Upper_Band > 24.2688 )
							if( basis <= 24.135 )
								ret := -0.914286 // sell
							if( basis > 24.135 )
								ret := -0.250000
					if( basis > 24.2289 )
						if( Lower_Band <= 28.522 )
							if( bearPower <= -0.206004 )
								ret := 0.074074
							if( bearPower > -0.206004 )
								ret := 0.734336 // buy
						if( Lower_Band > 28.522 )
							if( Upper_Band <= 30.1459 )
								ret := 0.013889
							if( Upper_Band > 30.1459 )
								ret := 0.383188
				if( bearPower > -0.053552 )
					if( basis <= 30.9091 )
						if( Upper_Band <= 26.437 )
							if( basis <= 24.4624 )
								ret := 0.652174
							if( basis > 24.4624 )
								ret := -0.323529
						if( Upper_Band > 26.437 )
							if( Upper_Band <= 26.8833 )
								ret := 0.759615 // buy
							if( Upper_Band > 26.8833 )
								ret := 0.293303
					if( basis > 30.9091 )
						if( Upper_Band <= 33.3568 )
							if( Upper_Band <= 33.1514 )
								ret := 0.003937
							if( Upper_Band > 33.1514 )
								ret := -0.550000
						if( Upper_Band > 33.3568 )
							if( bbm <= 0.003431 )
								ret := 0.182096
							if( bbm > 0.003431 )
								ret := 0.446970
			if( bearPower > -0.009298 )
				if( bbp <= 0.046449 )
					if( basis <= 30.9837 )
						if( bearPower <= 0.012379 )
							if( Upper_Band <= 26.5942 )
								ret := -0.064935
							if( Upper_Band > 26.5942 )
								ret := 0.251944
						if( bearPower > 0.012379 )
							if( basis <= 29.8246 )
								ret := 0.100478
							if( basis > 29.8246 )
								ret := -0.238095
					if( basis > 30.9837 )
						if( basis <= 31.2104 )
							if( bbp <= 0.014526 )
								ret := -0.133333
							if( bbp > 0.014526 )
								ret := -0.759259 // sell
						if( basis > 31.2104 )
							if( Upper_Band <= 31.3335 )
								ret := 1.000000 // buy
							if( Upper_Band > 31.3335 )
								ret := 0.023673
				if( bbp > 0.046449 )
					if( Upper_Band <= 28.8247 )
						if( Lower_Band <= 27.8373 )
							if( Lower_Band <= 26.731 )
								ret := 0.050847
							if( Lower_Band > 26.731 )
								ret := -0.400000
						if( Lower_Band > 27.8373 )
							if( Upper_Band <= 28.5181 )
								ret := 0.553571
							if( Upper_Band > 28.5181 )
								ret := 0.047619
					if( Upper_Band > 28.8247 )
						if( Lower_Band <= 40.4069 )
							if( bullPower <= 0.047471 )
								ret := -0.207807
							if( bullPower > 0.047471 )
								ret := -0.487047
						if( Lower_Band > 40.4069 )
							if( Lower_Band <= 42.0601 )
								ret := 0.232877
							if( Lower_Band > 42.0601 )
								ret := -0.108491
		if( bbm > 0.00987 )
			if( Lower_Band <= 24.1098 )
				if( bbm <= 0.133275 )
					if( basis <= 23.394 )
						if( basis <= 22.1222 )
							if( bbp <= -0.053759 )
								ret := 1.000000 // buy
							if( bbp > -0.053759 )
								ret := 0.750000 // buy
						if( basis > 22.1222 )
							if( bearPower <= -0.163396 )
								ret := 0.718750 // buy
							if( bearPower > -0.163396 )
								ret := -0.906977 // sell
					if( basis > 23.394 )
						if( Lower_Band <= 23.7197 )
							if( basis <= 24.075 )
								ret := 0.619048
							if( basis > 24.075 )
								ret := 1.000000 // buy
						if( Lower_Band > 23.7197 )
							if( Lower_Band <= 23.9127 )
								ret := 0.265152
							if( Lower_Band > 23.9127 )
								ret := 0.671717
				if( bbm > 0.133275 )
					if( basis <= 24.1426 )
						if( Upper_Band <= 23.0586 )
							if( bullPower <= 0.44233 )
								ret := -0.857143 // sell
							if( bullPower > 0.44233 )
								ret := -0.142857
						if( Upper_Band > 23.0586 )
							if( bullPower <= -0.35413 )
								ret := -1.000000 // sell
							if( bullPower > -0.35413 )
								ret := 0.703704 // buy
					if( basis > 24.1426 )
						if( bbp <= -0.246287 )
							if( Lower_Band <= 22.7599 )
								ret := -0.500000
							if( Lower_Band > 22.7599 )
								ret := 0.833333 // buy
						if( bbp > -0.246287 )
							if( Lower_Band <= 23.8024 )
								ret := -0.571429
							if( Lower_Band > 23.8024 )
								ret := -0.977778 // sell
			if( Lower_Band > 24.1098 )
				if( Lower_Band <= 43.1727 )
					if( basis <= 31.9718 )
						if( Lower_Band <= 31.7428 )
							if( bbp <= -0.879152 )
								ret := -0.721311 // sell
							if( bbp > -0.879152 )
								ret := 0.017584
						if( Lower_Band > 31.7428 )
							if( Upper_Band <= 32.1653 )
								ret := 0.319946
							if( Upper_Band > 32.1653 )
								ret := -0.681818
					if( basis > 31.9718 )
						if( basis <= 32.3776 )
							if( bullPower <= -0.196164 )
								ret := 0.653061
							if( bullPower > -0.196164 )
								ret := -0.174100
						if( basis > 32.3776 )
							if( Lower_Band <= 42.7661 )
								ret := -0.007905
							if( Lower_Band > 42.7661 )
								ret := -0.237480
				if( Lower_Band > 43.1727 )
					if( Lower_Band <= 43.595 )
						if( Lower_Band <= 43.4897 )
							if( bullPower <= 0.103165 )
								ret := 0.096457
							if( bullPower > 0.103165 )
								ret := 0.549020
						if( Lower_Band > 43.4897 )
							if( bullPower <= -0.149809 )
								ret := -0.222222
							if( bullPower > -0.149809 )
								ret := 0.501340
					if( Lower_Band > 43.595 )
						if( bullPower <= -0.182107 )
							if( bbm <= 0.34385 )
								ret := 0.416667
							if( bbm > 0.34385 )
								ret := 0.880000 // buy
						if( bullPower > -0.182107 )
							if( bearPower <= -0.139722 )
								ret := -0.130008
							if( bearPower > -0.139722 )
								ret := 0.060830
	if( bearPower > 0.05236 )
		if( basis <= 31.0383 )
			if( Lower_Band <= 24.1316 )
				if( bearPower <= 0.207467 )
					if( Lower_Band <= 24.0207 )
						if( Lower_Band <= 22.0364 )
							if( bbm <= 0.109 )
								ret := 0.918919 // buy
							if( bbm > 0.109 )
								ret := -0.066667
						if( Lower_Band > 22.0364 )
							if( Lower_Band <= 23.8319 )
								ret := -0.058065
							if( Lower_Band > 23.8319 )
								ret := -0.625000
					if( Lower_Band > 24.0207 )
						if( bbm <= 0.083089 )
							ret := 1.000000 // buy
						if( bbm > 0.083089 )
							ret := 0.750000 // buy
				if( bearPower > 0.207467 )
					if( bbp <= 1.06037 )
						if( Lower_Band <= 22.0616 )
							ret := -0.428571
						if( Lower_Band > 22.0616 )
							if( bbp <= 0.528964 )
								ret := 1.000000 // buy
							if( bbp > 0.528964 )
								ret := 0.644737
					if( bbp > 1.06037 )
						ret := -1.000000 // sell
			if( Lower_Band > 24.1316 )
				if( bbm <= 0.019391 )
					if( basis <= 29.7928 )
						if( Upper_Band <= 24.6272 )
							ret := 1.000000 // buy
						if( Upper_Band > 24.6272 )
							if( Upper_Band <= 29.7398 )
								ret := -0.366589
							if( Upper_Band > 29.7398 )
								ret := 0.102041
					if( basis > 29.7928 )
						if( bearPower <= 0.211172 )
							if( Upper_Band <= 31.1767 )
								ret := -0.701493 // sell
							if( Upper_Band > 31.1767 )
								ret := 0.060606
						if( bearPower > 0.211172 )
							if( bbm <= 0.002099 )
								ret := -0.521739
							if( bbm > 0.002099 )
								ret := 0.700000 // buy
				if( bbm > 0.019391 )
					if( basis <= 27.6915 )
						if( bullPower <= 0.159495 )
							if( Upper_Band <= 25.9884 )
								ret := -0.053942
							if( Upper_Band > 25.9884 )
								ret := -0.448276
						if( bullPower > 0.159495 )
							if( Lower_Band <= 25.0363 )
								ret := -0.861314 // sell
							if( Lower_Band > 25.0363 )
								ret := -0.419929
					if( basis > 27.6915 )
						if( basis <= 30.7511 )
							if( Lower_Band <= 30.3065 )
								ret := -0.065829
							if( Lower_Band > 30.3065 )
								ret := 0.333333
						if( basis > 30.7511 )
							if( bbm <= 0.132514 )
								ret := -0.461538
							if( bbm > 0.132514 )
								ret := -0.029412
		if( basis > 31.0383 )
			if( Lower_Band <= 31.7165 )
				if( Upper_Band <= 32.0275 )
					if( Lower_Band <= 30.6123 )
						if( bbp <= 0.475388 )
							ret := 0.000000
						if( bbp > 0.475388 )
							if( basis <= 31.1542 )
								ret := 0.956522 // buy
							if( basis > 31.1542 )
								ret := 0.500000
					if( Lower_Band > 30.6123 )
						if( bbp <= 0.430667 )
							if( bullPower <= 0.22106 )
								ret := -0.161491
							if( bullPower > 0.22106 )
								ret := 0.480000
						if( bbp > 0.430667 )
							if( basis <= 31.0868 )
								ret := 0.000000
							if( basis > 31.0868 )
								ret := -0.813953 // sell
				if( Upper_Band > 32.0275 )
					if( basis <= 33.428 )
						if( Upper_Band <= 32.4703 )
							if( Lower_Band <= 30.9678 )
								ret := -0.450000
							if( Lower_Band > 30.9678 )
								ret := 0.334385
						if( Upper_Band > 32.4703 )
							if( bbm <= 0.099791 )
								ret := 0.363636
							if( bbm > 0.099791 )
								ret := 0.771028 // buy
					if( basis > 33.428 )
						if( basis <= 34.6195 )
							ret := -1.000000 // sell
						if( basis > 34.6195 )
							if( bearPower <= 0.342426 )
								ret := -1.000000 // sell
							if( bearPower > 0.342426 )
								ret := -0.750000 // sell
			if( Lower_Band > 31.7165 )
				if( bbm <= 0.039588 )
					if( Lower_Band <= 35.8573 )
						if( basis <= 32.8333 )
							if( Upper_Band <= 32.0139 )
								ret := -0.851064 // sell
							if( Upper_Band > 32.0139 )
								ret := -0.136476
						if( basis > 32.8333 )
							if( bbp <= 0.175796 )
								ret := -0.329787
							if( bbp > 0.175796 )
								ret := -0.698454
					if( Lower_Band > 35.8573 )
						if( Upper_Band <= 37.2851 )
							if( bullPower <= 0.148444 )
								ret := 0.259259
							if( bullPower > 0.148444 )
								ret := 0.953488 // buy
						if( Upper_Band > 37.2851 )
							if( bearPower <= 0.425713 )
								ret := -0.218017
							if( bearPower > 0.425713 )
								ret := 0.641026
				if( bbm > 0.039588 )
					if( bbp <= 0.407198 )
						if( basis <= 35.654 )
							if( Upper_Band <= 36.2916 )
								ret := -0.106924
							if( Upper_Band > 36.2916 )
								ret := 1.000000 // buy
						if( basis > 35.654 )
							if( Lower_Band <= 40.7877 )
								ret := 0.182546
							if( Lower_Band > 40.7877 )
								ret := -0.025862
					if( bbp > 0.407198 )
						if( Lower_Band <= 42.9442 )
							if( Lower_Band <= 40.7604 )
								ret := -0.187219
							if( Lower_Band > 40.7604 )
								ret := 0.138973
						if( Lower_Band > 42.9442 )
							if( bearPower <= 0.18846 )
								ret := -0.288591
							if( bearPower > 0.18846 )
								ret := -0.640777
	
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
float op_operation = decision_tree_0_AFRM_1Min_c173df3c(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)

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


