//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: DBX_15Min_2BT0_3c96bba5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DBX_15Min_2BT0_3c96bba5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DBX_15Min_3c96bba5(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bullPower <= -0.032755 )
		if( bbm <= 0.039957 )
			if( bbp <= -0.409567 )
				if( ema3 <= 19.8311 )
					if( tema <= 19.072 )
						if( bbm <= 0.005885 )
							ret := 0.616667
						if( bbm > 0.005885 )
							ret := 0.022222
					if( tema > 19.072 )
						if( bbp <= -0.483422 )
							ret := -0.888889 // sell
						if( bbp > -0.483422 )
							ret := -0.250000
				if( ema3 > 19.8311 )
					if( ema3 <= 30.2894 )
						if( bullPower <= -0.315201 )
							ret := 0.913043 // buy
						if( bullPower > -0.315201 )
							ret := 0.658754
					if( ema3 > 30.2894 )
						if( tema <= 30.6763 )
							ret := -0.192308
						if( tema > 30.6763 )
							ret := 0.627907
			if( bbp > -0.409567 )
				if( ema12 <= -0.062016 )
					if( bullPower <= -0.127088 )
						if( bbm <= 0.008955 )
							ret := 0.487685
						if( bbm > 0.008955 )
							ret := 0.191882
					if( bullPower > -0.127088 )
						if( ema3 <= 22.5155 )
							ret := 0.206989
						if( ema3 > 22.5155 )
							ret := -0.142857
				if( ema12 > -0.062016 )
					if( bullPower <= -0.116918 )
						if( ema3 <= 21.2681 )
							ret := 0.852941 // buy
						if( ema3 > 21.2681 )
							ret := 0.529740
					if( bullPower > -0.116918 )
						if( tema <= 17.1592 )
							ret := 0.981132 // buy
						if( tema > 17.1592 )
							ret := 0.320579
		if( bbm > 0.039957 )
			if( ema2 <= 20.0024 )
				if( ema13 <= -0.329042 )
					if( bbp <= -0.295567 )
						if( ema1 <= 16.8304 )
							ret := 0.443478
						if( ema1 > 16.8304 )
							ret := 0.861446 // buy
					if( bbp > -0.295567 )
						if( tema <= 19.447 )
							ret := -0.750000 // sell
						if( tema > 19.447 )
							ret := 0.857143 // buy
				if( ema13 > -0.329042 )
					if( ema1 <= 19.5803 )
						if( tema <= 19.2 )
							ret := 0.133077
						if( tema > 19.2 )
							ret := -0.204348
					if( ema1 > 19.5803 )
						if( ema2 <= 19.9073 )
							ret := 0.690355
						if( ema2 > 19.9073 )
							ret := 0.223140
			if( ema2 > 20.0024 )
				if( bullPower <= -0.308803 )
					if( ema12 <= -0.387105 )
						if( ema13 <= -1.01956 )
							ret := 0.353535
						if( ema13 > -1.01956 )
							ret := -0.375375
					if( ema12 > -0.387105 )
						if( bbm <= 0.099873 )
							ret := 0.774775 // buy
						if( bbm > 0.099873 )
							ret := 0.266573
				if( bullPower > -0.308803 )
					if( ema13 <= -0.355782 )
						if( bbp <= -0.298031 )
							ret := -0.165056
						if( bbp > -0.298031 )
							ret := 0.738095 // buy
					if( ema13 > -0.355782 )
						if( ema3 <= 20.0797 )
							ret := -0.805556 // sell
						if( ema3 > 20.0797 )
							ret := 0.021741
	if( bullPower > -0.032755 )
		if( bbp <= 0.151941 )
			if( ema1 <= 32.2278 )
				if( ema3 <= 17.9417 )
					if( ema1 <= 16.0906 )
						if( ema1 <= 16.0811 )
							ret := 1.000000 // buy
						if( ema1 > 16.0811 )
							ret := 0.800000 // buy
					if( ema1 > 16.0906 )
						if( ema3 <= 16.7534 )
							ret := -0.759494 // sell
						if( ema3 > 16.7534 )
							ret := 0.229272
				if( ema3 > 17.9417 )
					if( ema2 <= 18.3927 )
						if( ema1 <= 18.2428 )
							ret := -0.054653
						if( ema1 > 18.2428 )
							ret := -0.577419
					if( ema2 > 18.3927 )
						if( tema <= 19.952 )
							ret := 0.097219
						if( tema > 19.952 )
							ret := -0.015482
			if( ema1 > 32.2278 )
				if( bearPower <= -0.311063 )
					if( bbp <= -0.86337 )
						ret := -1.000000 // sell
					if( bbp > -0.86337 )
						if( ema12 <= -0.062807 )
							ret := 0.677419
						if( ema12 > -0.062807 )
							ret := -0.116279
				if( bearPower > -0.311063 )
					if( ema12 <= 0.10038 )
						if( ema12 <= -0.163845 )
							ret := 0.888889 // buy
						if( ema12 > -0.163845 )
							ret := -0.434599
					if( ema12 > 0.10038 )
						if( ema3 <= 32.6962 )
							ret := 0.666667
						if( ema3 > 32.6962 )
							ret := 1.000000 // buy
		if( bbp > 0.151941 )
			if( bbm <= 0.028655 )
				if( bullPower <= 0.283633 )
					if( ema1 <= 31.7302 )
						if( ema3 <= 18.413 )
							ret := 0.055556
						if( ema3 > 18.413 )
							ret := -0.317999
					if( ema1 > 31.7302 )
						if( tema <= 32.0525 )
							ret := 0.896552 // buy
						if( tema > 32.0525 )
							ret := 0.054054
				if( bullPower > 0.283633 )
					if( bearPower <= 0.301616 )
						if( bearPower <= 0.288449 )
							ret := -0.872340 // sell
						if( bearPower > 0.288449 )
							ret := -0.275000
					if( bearPower > 0.301616 )
						if( ema13 <= 0.280677 )
							ret := -0.861210 // sell
						if( ema13 > 0.280677 )
							ret := -0.522388
			if( bbm > 0.028655 )
				if( ema1 <= 22.9642 )
					if( ema1 <= 22.3255 )
						if( tema <= 16.1898 )
							ret := 0.866667 // buy
						if( tema > 16.1898 )
							ret := -0.068678
					if( ema1 > 22.3255 )
						if( ema3 <= 22.8625 )
							ret := 0.101477
						if( ema3 > 22.8625 )
							ret := 0.817073 // buy
				if( ema1 > 22.9642 )
					if( bearPower <= 0.519812 )
						if( ema12 <= 0.313405 )
							ret := -0.151573
						if( ema12 > 0.313405 )
							ret := 0.274725
					if( bearPower > 0.519812 )
						if( bbm <= 1.0045 )
							ret := -0.708333 // sell
						if( bbm > 1.0045 )
							ret := 0.400000
	
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
float op_operation = decision_tree_0_DBX_15Min_3c96bba5(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


