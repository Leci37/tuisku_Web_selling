//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: NVDA_30Min_2BB0_788b9e9a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_2BB0_788b9e9a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_788b9e9a(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( bearPower <= -0.255004 )
		if( Lower_Band <= 179.467 )
			if( basis <= 157.622 )
				if( basis <= 155.9 )
					if( bbm <= 0.249606 )
						if( Lower_Band <= 24.9204 )
							ret := 1.000000 // buy
						if( Lower_Band > 24.9204 )
							if( basis <= 27.7532 )
								ret := -0.863636 // sell
							if( basis > 27.7532 )
								ret := -0.120328
					if( bbm > 0.249606 )
						if( Lower_Band <= 101.826 )
							if( bearPower <= -1.49688 )
								ret := 0.444444
							if( bearPower > -1.49688 )
								ret := 0.146166
						if( Lower_Band > 101.826 )
							if( Lower_Band <= 105.035 )
								ret := -0.249493
							if( Lower_Band > 105.035 )
								ret := 0.028875
				if( basis > 155.9 )
					if( Lower_Band <= 155.738 )
						if( bullPower <= -1.78743 )
							if( bullPower <= -3.96754 )
								ret := 0.777778 // buy
							if( bullPower > -3.96754 )
								ret := -0.333333
						if( bullPower > -1.78743 )
							if( Upper_Band <= 157.863 )
								ret := -0.068182
							if( Upper_Band > 157.863 )
								ret := 0.593548
					if( Lower_Band > 155.738 )
						if( bearPower <= -0.663692 )
							if( Upper_Band <= 158.417 )
								ret := 1.000000 // buy
							if( Upper_Band > 158.417 )
								ret := 0.000000
						if( bearPower > -0.663692 )
							if( bullPower <= -0.047934 )
								ret := -0.285714
							if( bullPower > -0.047934 )
								ret := -0.857143 // sell
			if( basis > 157.622 )
				if( bullPower <= 2.07363 )
					if( Upper_Band <= 182.087 )
						if( Lower_Band <= 146.038 )
							ret := 0.900000 // buy
						if( Lower_Band > 146.038 )
							if( bbm <= 0.472348 )
								ret := 0.026995
							if( bbm > 0.472348 )
								ret := -0.125237
					if( Upper_Band > 182.087 )
						if( Upper_Band <= 197.806 )
							if( basis <= 181.816 )
								ret := -0.219577
							if( basis > 181.816 )
								ret := -0.604839
						if( Upper_Band > 197.806 )
							if( Lower_Band <= 166.063 )
								ret := -0.282609
							if( Lower_Band > 166.063 )
								ret := 0.702703 // buy
				if( bullPower > 2.07363 )
					if( basis <= 175.852 )
						if( Lower_Band <= 158.044 )
							if( Lower_Band <= 155.954 )
								ret := 0.636364
							if( Lower_Band > 155.954 )
								ret := -0.741935 // sell
						if( Lower_Band > 158.044 )
							if( basis <= 161.644 )
								ret := 0.724138 // buy
							if( basis > 161.644 )
								ret := 0.009804
					if( basis > 175.852 )
						if( bbp <= 1.52429 )
							if( Upper_Band <= 180.989 )
								ret := 1.000000 // buy
							if( Upper_Band > 180.989 )
								ret := 0.857143 // buy
						if( bbp > 1.52429 )
							ret := 0.250000
		if( Lower_Band > 179.467 )
			if( Upper_Band <= 198.31 )
				if( Upper_Band <= 193.168 )
					if( basis <= 187.404 )
						if( Upper_Band <= 189.75 )
							if( Upper_Band <= 188.803 )
								ret := 0.209677
							if( Upper_Band > 188.803 )
								ret := -0.281250
						if( Upper_Band > 189.75 )
							if( Lower_Band <= 182.038 )
								ret := -0.179487
							if( Lower_Band > 182.038 )
								ret := 0.711340 // buy
					if( basis > 187.404 )
						if( basis <= 188.338 )
							if( bbm <= 3.41613 )
								ret := -0.419847
							if( bbm > 3.41613 )
								ret := 0.375000
						if( basis > 188.338 )
							if( Lower_Band <= 188.586 )
								ret := 0.150000
							if( Lower_Band > 188.586 )
								ret := -0.258993
				if( Upper_Band > 193.168 )
					if( bullPower <= 5.11849 )
						if( bbm <= 0.76843 )
							if( Lower_Band <= 196.104 )
								ret := -0.019608
							if( Lower_Band > 196.104 )
								ret := 0.923077 // buy
						if( bbm > 0.76843 )
							if( bearPower <= -0.329358 )
								ret := 0.421603
							if( bearPower > -0.329358 )
								ret := -0.363636
					if( bullPower > 5.11849 )
						ret := -1.000000 // sell
			if( Upper_Band > 198.31 )
				if( bullPower <= -4.0579 )
					if( basis <= 498.67 )
						if( bbp <= -18.1982 )
							if( Lower_Band <= 478.614 )
								ret := 0.470238
							if( Lower_Band > 478.614 )
								ret := 1.000000 // buy
						if( bbp > -18.1982 )
							if( basis <= 198.089 )
								ret := 0.920000 // buy
							if( basis > 198.089 )
								ret := 0.210687
					if( basis > 498.67 )
						if( Upper_Band <= 514.908 )
							if( bearPower <= -9.24605 )
								ret := -0.142857
							if( bearPower > -9.24605 )
								ret := -1.000000 // sell
						if( Upper_Band > 514.908 )
							if( bearPower <= -19.9075 )
								ret := -0.309524
							if( bearPower > -19.9075 )
								ret := 0.098930
				if( bullPower > -4.0579 )
					if( bearPower <= -2.01027 )
						if( Upper_Band <= 657.197 )
							if( Lower_Band <= 607.953 )
								ret := -0.007013
							if( Lower_Band > 607.953 )
								ret := -0.370370
						if( Upper_Band > 657.197 )
							if( Upper_Band <= 685.881 )
								ret := 0.848485 // buy
							if( Upper_Band > 685.881 )
								ret := 0.071672
					if( bearPower > -2.01027 )
						if( bullPower <= -0.029771 )
							if( bbm <= 1.52078 )
								ret := 0.118379
							if( bbm > 1.52078 )
								ret := -0.150685
						if( bullPower > -0.029771 )
							if( Lower_Band <= 186.727 )
								ret := -0.750000 // sell
							if( Lower_Band > 186.727 )
								ret := 0.035688
	if( bearPower > -0.255004 )
		if( Lower_Band <= 167.859 )
			if( Lower_Band <= 166.643 )
				if( Lower_Band <= 27.6014 )
					if( Upper_Band <= 26.6652 )
						if( bbm <= 0.122712 )
							if( bbm <= 0.004494 )
								ret := 0.533333
							if( bbm > 0.004494 )
								ret := 0.882353 // buy
						if( bbm > 0.122712 )
							if( Upper_Band <= 25.9952 )
								ret := 0.166667
							if( Upper_Band > 25.9952 )
								ret := -0.682927
					if( Upper_Band > 26.6652 )
						if( bbp <= 0.631177 )
							if( Lower_Band <= 26.4647 )
								ret := 0.900000 // buy
							if( Lower_Band > 26.4647 )
								ret := 0.636364
						if( bbp > 0.631177 )
							if( Upper_Band <= 28.5902 )
								ret := -0.441176
							if( Upper_Band > 28.5902 )
								ret := 0.800000 // buy
				if( Lower_Band > 27.6014 )
					if( Lower_Band <= 28.0537 )
						if( Upper_Band <= 28.5719 )
							ret := 0.636364
						if( Upper_Band > 28.5719 )
							if( bearPower <= 0.010463 )
								ret := -0.800000 // sell
							if( bearPower > 0.010463 )
								ret := -0.266667
					if( Lower_Band > 28.0537 )
						if( basis <= 162.861 )
							if( Upper_Band <= 165.25 )
								ret := 0.105108
							if( Upper_Band > 165.25 )
								ret := 0.570707
						if( basis > 162.861 )
							if( Lower_Band <= 157.857 )
								ret := -0.556962
							if( Lower_Band > 157.857 )
								ret := 0.031535
			if( Lower_Band > 166.643 )
				if( bbp <= 6.00575 )
					if( basis <= 174.025 )
						if( Upper_Band <= 171.291 )
							if( bbm <= 1.375 )
								ret := 0.321429
							if( bbm > 1.375 )
								ret := -0.714286 // sell
						if( Upper_Band > 171.291 )
							if( Lower_Band <= 167.516 )
								ret := 0.648148
							if( Lower_Band > 167.516 )
								ret := 0.172414
					if( basis > 174.025 )
						if( bearPower <= 1.69953 )
							ret := -0.727273 // sell
						if( bearPower > 1.69953 )
							ret := 0.857143 // buy
				if( bbp > 6.00575 )
					ret := -0.750000 // sell
		if( Lower_Band > 167.859 )
			if( Upper_Band <= 283.386 )
				if( basis <= 278.682 )
					if( Lower_Band <= 170.942 )
						if( bbm <= 1.2275 )
							if( Lower_Band <= 168.722 )
								ret := -0.428571
							if( Lower_Band > 168.722 )
								ret := -0.045918
						if( bbm > 1.2275 )
							if( Upper_Band <= 177.875 )
								ret := -0.461538
							if( Upper_Band > 177.875 )
								ret := -0.828571 // sell
					if( Lower_Band > 170.942 )
						if( Lower_Band <= 177.144 )
							if( Upper_Band <= 181.814 )
								ret := 0.012613
							if( Upper_Band > 181.814 )
								ret := 0.632432
						if( Lower_Band > 177.144 )
							if( Lower_Band <= 177.684 )
								ret := -0.361111
							if( Lower_Band > 177.684 )
								ret := 0.011807
				if( basis > 278.682 )
					if( bbm <= 0.63995 )
						ret := 0.000000
					if( bbm > 0.63995 )
						if( Lower_Band <= 277.999 )
							if( Lower_Band <= 276.611 )
								ret := -0.809524 // sell
							if( Lower_Band > 276.611 )
								ret := -1.000000 // sell
						if( Lower_Band > 277.999 )
							if( basis <= 280.775 )
								ret := -0.250000
							if( basis > 280.775 )
								ret := -0.888889 // sell
			if( Upper_Band > 283.386 )
				if( bearPower <= 4.36293 )
					if( Lower_Band <= 866.085 )
						if( Upper_Band <= 541.69 )
							if( Lower_Band <= 524.209 )
								ret := 0.059867
							if( Lower_Band > 524.209 )
								ret := -0.495000
						if( Upper_Band > 541.69 )
							if( Lower_Band <= 532.135 )
								ret := 0.391061
							if( Lower_Band > 532.135 )
								ret := 0.159964
					if( Lower_Band > 866.085 )
						if( Lower_Band <= 876.093 )
							if( bearPower <= 1.60458 )
								ret := -0.250000
							if( bearPower > 1.60458 )
								ret := -0.822222 // sell
						if( Lower_Band > 876.093 )
							if( Upper_Band <= 1218.06 )
								ret := -0.069638
							if( Upper_Band > 1218.06 )
								ret := -0.850000 // sell
				if( bearPower > 4.36293 )
					if( Upper_Band <= 530.342 )
						if( bbm <= 9.35816 )
							if( Lower_Band <= 274.883 )
								ret := 0.696429
							if( Lower_Band > 274.883 )
								ret := 0.377990
						if( bbm > 9.35816 )
							if( Upper_Band <= 346.893 )
								ret := -0.428571
							if( Upper_Band > 346.893 )
								ret := -1.000000 // sell
					if( Upper_Band > 530.342 )
						if( basis <= 547.811 )
							if( Upper_Band <= 555.958 )
								ret := -0.145631
							if( Upper_Band > 555.958 )
								ret := -0.888889 // sell
						if( basis > 547.811 )
							if( Upper_Band <= 584.686 )
								ret := 0.488372
							if( Upper_Band > 584.686 )
								ret := 0.163504
	
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
float op_operation = decision_tree_0_NVDA_30Min_788b9e9a(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


