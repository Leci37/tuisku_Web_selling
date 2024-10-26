//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: PTON_15Min_2BT0_f4d1f02a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PTON_15Min_2BT0_f4d1f02a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PTON_15Min_f4d1f02a(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( bearPower <= 0.013905 )
		if( ema2 <= 3.05773 )
			if( ema13 <= 0.038671 )
				if( bbm <= 0.010068 )
					if( ema2 <= 3.02239 )
						if( ema2 <= 2.93921 )
							if( ema3 <= 2.93811 )
								ret := 0.133333
							if( ema3 > 2.93811 )
								ret := 1.000000 // buy
						if( ema2 > 2.93921 )
							if( ema3 <= 3.00364 )
								ret := -0.641026
							if( ema3 > 3.00364 )
								ret := 0.062500
					if( ema2 > 3.02239 )
						if( ema13 <= -0.013891 )
							ret := 0.000000
						if( ema13 > -0.013891 )
							if( ema13 <= 0.00896 )
								ret := 0.900000 // buy
							if( ema13 > 0.00896 )
								ret := 0.250000
				if( bbm > 0.010068 )
					if( ema3 <= 3.05785 )
						if( ema3 <= 3.01689 )
							if( ema1 <= 2.97912 )
								ret := 0.603960
							if( ema1 > 2.97912 )
								ret := 0.066667
						if( ema3 > 3.01689 )
							if( bbp <= -0.024356 )
								ret := 0.513514
							if( bbp > -0.024356 )
								ret := 0.870968 // buy
					if( ema3 > 3.05785 )
						if( bbm <= 0.047738 )
							if( ema12 <= -0.057604 )
								ret := -1.000000 // sell
							if( ema12 > -0.057604 )
								ret := -0.160000
						if( bbm > 0.047738 )
							if( bearPower <= -0.11349 )
								ret := 1.000000 // buy
							if( bearPower > -0.11349 )
								ret := 0.857143 // buy
			if( ema13 > 0.038671 )
				ret := -0.800000 // sell
		if( ema2 > 3.05773 )
			if( ema13 <= -4.36916 )
				if( ema3 <= 114.281 )
					if( bbp <= -9.03118 )
						if( tema <= 60.0745 )
							ret := -0.857143 // sell
						if( tema > 60.0745 )
							ret := -1.000000 // sell
					if( bbp > -9.03118 )
						if( bullPower <= -1.03591 )
							if( bbm <= 0.884548 )
								ret := -1.000000 // sell
							if( bbm > 0.884548 )
								ret := 0.100000
						if( bullPower > -1.03591 )
							ret := -1.000000 // sell
				if( ema3 > 114.281 )
					if( ema1 <= 108.848 )
						ret := 1.000000 // buy
					if( ema1 > 108.848 )
						if( ema13 <= -8.28384 )
							ret := -1.000000 // sell
						if( ema13 > -8.28384 )
							if( bbm <= 1.615 )
								ret := -0.142857
							if( bbm > 1.615 )
								ret := 0.285714
			if( ema13 > -4.36916 )
				if( tema <= 148.351 )
					if( ema12 <= -0.308148 )
						if( ema1 <= 23.3724 )
							if( bullPower <= -0.187688 )
								ret := 0.611307
							if( bullPower > -0.187688 )
								ret := -0.043478
						if( ema1 > 23.3724 )
							if( ema3 <= 24.8918 )
								ret := -0.456790
							if( ema3 > 24.8918 )
								ret := 0.133369
					if( ema12 > -0.308148 )
						if( tema <= 4.49056 )
							if( bullPower <= -0.006006 )
								ret := 0.247803
							if( bullPower > -0.006006 )
								ret := 0.067879
						if( tema > 4.49056 )
							if( ema3 <= 4.50776 )
								ret := -0.360000
							if( ema3 > 4.50776 )
								ret := 0.055301
				if( tema > 148.351 )
					if( tema <= 155.406 )
						if( ema3 <= 154.062 )
							if( tema <= 148.874 )
								ret := -0.525424
							if( tema > 148.874 )
								ret := -0.006452
						if( ema3 > 154.062 )
							if( bbm <= 0.4 )
								ret := 0.047619
							if( bbm > 0.4 )
								ret := -0.535433
					if( tema > 155.406 )
						if( ema3 <= 156.974 )
							if( bullPower <= 0.203444 )
								ret := -0.333333
							if( bullPower > 0.203444 )
								ret := 0.744681 // buy
						if( ema3 > 156.974 )
							if( ema1 <= 158.097 )
								ret := -0.402778
							if( ema1 > 158.097 )
								ret := -0.024038
	if( bearPower > 0.013905 )
		if( ema13 <= 0.049133 )
			if( ema12 <= -0.005145 )
				if( bullPower <= 0.501719 )
					if( bbp <= 0.540808 )
						if( bullPower <= 0.037432 )
							if( ema13 <= -0.0164 )
								ret := -0.059524
							if( ema13 > -0.0164 )
								ret := -0.538462
						if( bullPower > 0.037432 )
							if( ema3 <= 7.37918 )
								ret := 0.523810
							if( ema3 > 7.37918 )
								ret := 0.094556
					if( bbp > 0.540808 )
						if( tema <= 105.425 )
							ret := 0.000000
						if( tema > 105.425 )
							ret := -0.666667
				if( bullPower > 0.501719 )
					if( bullPower <= 0.598069 )
						if( ema3 <= 110.101 )
							if( ema13 <= -0.331908 )
								ret := 0.500000
							if( ema13 > -0.331908 )
								ret := 0.866667 // buy
						if( ema3 > 110.101 )
							ret := 0.142857
					if( bullPower > 0.598069 )
						if( ema1 <= 84.6818 )
							if( bbp <= 0.9175 )
								ret := 0.285714
							if( bbp > 0.9175 )
								ret := -0.714286 // sell
						if( ema1 > 84.6818 )
							if( bearPower <= 0.219095 )
								ret := 0.250000
							if( bearPower > 0.219095 )
								ret := 0.607143
			if( ema12 > -0.005145 )
				if( bearPower <= 0.037985 )
					if( ema2 <= 4.18625 )
						if( tema <= 3.60175 )
							if( bbm <= 0.009544 )
								ret := -0.351648
							if( bbm > 0.009544 )
								ret := 0.070539
						if( tema > 3.60175 )
							if( ema13 <= 0.040601 )
								ret := -0.537313
							if( ema13 > 0.040601 )
								ret := 0.444444
					if( ema2 > 4.18625 )
						if( tema <= 4.32189 )
							if( bbp <= 0.061839 )
								ret := 0.622222
							if( bbp > 0.061839 )
								ret := -0.142857
						if( tema > 4.32189 )
							if( ema1 <= 4.31136 )
								ret := -0.800000 // sell
							if( ema1 > 4.31136 )
								ret := -0.033889
				if( bearPower > 0.037985 )
					if( bbm <= 0.039114 )
						if( tema <= 4.59188 )
							if( ema12 <= 0.002049 )
								ret := 0.142857
							if( ema12 > 0.002049 )
								ret := -0.712000 // sell
						if( tema > 4.59188 )
							if( bbm <= 0.00011 )
								ret := -0.239278
							if( bbm > 0.00011 )
								ret := -0.441441
					if( bbm > 0.039114 )
						if( bbm <= 0.321842 )
							if( ema13 <= 0.035616 )
								ret := -0.225734
							if( ema13 > 0.035616 )
								ret := 0.042169
						if( bbm > 0.321842 )
							if( bbm <= 0.925 )
								ret := 0.185000
							if( bbm > 0.925 )
								ret := -0.280702
		if( ema13 > 0.049133 )
			if( bbm <= 0.081694 )
				if( bearPower <= 0.068816 )
					if( ema13 <= 0.195985 )
						if( ema13 <= 0.087943 )
							if( tema <= 3.12544 )
								ret := 0.866667 // buy
							if( tema > 3.12544 )
								ret := 0.006102
						if( ema13 > 0.087943 )
							if( tema <= 4.38638 )
								ret := 0.609756
							if( tema > 4.38638 )
								ret := 0.127749
					if( ema13 > 0.195985 )
						if( ema1 <= 8.42338 )
							if( bbp <= 0.178176 )
								ret := -1.000000 // sell
							if( bbp > 0.178176 )
								ret := -0.777778 // sell
						if( ema1 > 8.42338 )
							if( ema13 <= 0.203642 )
								ret := -0.642857
							if( ema13 > 0.203642 )
								ret := -0.159292
				if( bearPower > 0.068816 )
					if( ema1 <= 4.38631 )
						if( bearPower <= 0.084785 )
							if( tema <= 3.91391 )
								ret := -0.586207
							if( tema > 3.91391 )
								ret := 0.000000
						if( bearPower > 0.084785 )
							if( bbm <= 0.069565 )
								ret := -1.000000 // sell
							if( bbm > 0.069565 )
								ret := -0.625000
					if( ema1 > 4.38631 )
						if( ema13 <= 0.09845 )
							if( ema3 <= 9.30193 )
								ret := -0.075000
							if( ema3 > 9.30193 )
								ret := -0.431310
						if( ema13 > 0.09845 )
							if( ema1 <= 4.82262 )
								ret := 0.409091
							if( ema1 > 4.82262 )
								ret := -0.099959
			if( bbm > 0.081694 )
				if( ema3 <= 22.1017 )
					if( ema1 <= 20.5873 )
						if( tema <= 18.4405 )
							if( ema12 <= 0.161077 )
								ret := 0.051780
							if( ema12 > 0.161077 )
								ret := 0.253129
						if( tema > 18.4405 )
							if( ema13 <= 0.213278 )
								ret := 0.176471
							if( ema13 > 0.213278 )
								ret := -0.759259 // sell
					if( ema1 > 20.5873 )
						if( bullPower <= 1.1981 )
							if( ema2 <= 20.9408 )
								ret := 1.000000 // buy
							if( ema2 > 20.9408 )
								ret := 0.653543
						if( bullPower > 1.1981 )
							ret := -0.888889 // sell
				if( ema3 > 22.1017 )
					if( ema1 <= 29.287 )
						if( ema2 <= 26.6976 )
							if( ema3 <= 25.6761 )
								ret := -0.149211
							if( ema3 > 25.6761 )
								ret := 0.561151
						if( ema2 > 26.6976 )
							if( ema3 <= 27.3271 )
								ret := -0.494737
							if( ema3 > 27.3271 )
								ret := -0.117166
					if( ema1 > 29.287 )
						if( ema3 <= 29.1172 )
							if( tema <= 30.0396 )
								ret := 0.527778
							if( tema > 30.0396 )
								ret := 0.911765 // buy
						if( ema3 > 29.1172 )
							if( bbm <= 2.29128 )
								ret := 0.037482
							if( bbm > 2.29128 )
								ret := -0.275641
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_PTON_15Min_f4d1f02a(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


