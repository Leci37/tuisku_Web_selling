//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: SOLUSDT_30Min_2BT0_92db2fb1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_30Min_2BT0_92db2fb1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_30Min_92db2fb1(bbm, bearPower, bbp, bullPower, BBPower_Color, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbm <= 0.015395 )
		if( ema2 <= 1.51225 )
			if( ema1 <= 1.52411 )
				if( ema3 <= 1.33107 )
					if( ema12 <= -0.004071 )
						ret := -0.416667
					if( ema12 > -0.004071 )
						if( ema12 <= 0.006986 )
							ret := 1.000000 // buy
						if( ema12 > 0.006986 )
							ret := 0.714286 // buy
				if( ema3 > 1.33107 )
					if( ema1 <= 1.37414 )
						if( tema <= 1.32546 )
							if( bullPower <= -0.009104 )
								ret := 0.200000
							if( bullPower > -0.009104 )
								ret := -0.333333
						if( tema > 1.32546 )
							if( ema3 <= 1.36994 )
								if( ema3 <= 1.34983 )
									ret := -0.461538
								if( ema3 > 1.34983 )
									ret := -1.000000 // sell
							if( ema3 > 1.36994 )
								if( ema3 <= 1.37921 )
									ret := -0.181818
								if( ema3 > 1.37921 )
									ret := -0.500000
					if( ema1 > 1.37414 )
						if( ema1 <= 1.50002 )
							if( tema <= 1.48798 )
								if( bullPower <= 0.013996 )
									ret := -0.164894
								if( bullPower > 0.013996 )
									ret := 0.307692
							if( tema > 1.48798 )
								if( ema3 <= 1.48858 )
									ret := -0.095238
								if( ema3 > 1.48858 )
									ret := 0.782609 // buy
						if( ema1 > 1.50002 )
							if( bbp <= 0.008836 )
								ret := -0.769231 // sell
							if( bbp > 0.008836 )
								ret := -0.642857
			if( ema1 > 1.52411 )
				ret := 1.000000 // buy
		if( ema2 > 1.51225 )
			if( tema <= 1.81748 )
				if( bullPower <= -0.007119 )
					if( bbm <= 0.013539 )
						if( bearPower <= -0.019292 )
							if( ema3 <= 1.63677 )
								if( tema <= 1.52607 )
									ret := 0.000000
								if( tema > 1.52607 )
									ret := 0.750000 // buy
							if( ema3 > 1.63677 )
								ret := -0.142857
						if( bearPower > -0.019292 )
							ret := 0.555556
					if( bbm > 0.013539 )
						if( ema3 <= 1.58926 )
							ret := -0.909091 // sell
						if( ema3 > 1.58926 )
							if( bbm <= 0.014445 )
								ret := 0.363636
							if( bbm > 0.014445 )
								ret := -0.250000
				if( bullPower > -0.007119 )
					if( tema <= 1.73701 )
						if( bbm <= 0.010908 )
							if( ema13 <= 0.007189 )
								if( ema3 <= 1.6966 )
									ret := -0.900990 // sell
								if( ema3 > 1.6966 )
									ret := -0.444444
							if( ema13 > 0.007189 )
								if( bbp <= 0.02816 )
									ret := -0.055556
								if( bbp > 0.02816 )
									ret := -0.823529 // sell
						if( bbm > 0.010908 )
							if( ema13 <= 0.022456 )
								if( ema2 <= 1.69643 )
									ret := -0.496933
								if( ema2 > 1.69643 )
									ret := 0.500000
							if( ema13 > 0.022456 )
								if( bbm <= 0.012218 )
									ret := 0.750000 // buy
								if( bbm > 0.012218 )
									ret := 0.166667
					if( tema > 1.73701 )
						if( bearPower <= -0.011806 )
							ret := -0.818182 // sell
						if( bearPower > -0.011806 )
							ret := -1.000000 // sell
			if( tema > 1.81748 )
				if( ema1 <= 1.90532 )
					if( ema3 <= 1.89028 )
						if( bearPower <= -0.012058 )
							ret := 0.375000
						if( bearPower > -0.012058 )
							if( ema13 <= 0.0047 )
								if( ema13 <= -0.005148 )
									ret := -0.111111
								if( ema13 > -0.005148 )
									ret := 0.000000
							if( ema13 > 0.0047 )
								ret := 0.285714
					if( ema3 > 1.89028 )
						if( bullPower <= 0.002023 )
							ret := 0.176471
						if( bullPower > 0.002023 )
							if( ema2 <= 1.8976 )
								ret := 0.916667 // buy
							if( ema2 > 1.8976 )
								ret := 1.000000 // buy
				if( ema1 > 1.90532 )
					if( bullPower <= 0.019037 )
						if( bbp <= -0.010299 )
							if( ema3 <= 1.95511 )
								if( bbm <= 0.011144 )
									ret := 0.500000
								if( bbm > 0.011144 )
									ret := -0.466667
							if( ema3 > 1.95511 )
								if( tema <= 2.11254 )
									ret := -0.752809 // sell
								if( tema > 2.11254 )
									ret := -0.326316
						if( bbp > -0.010299 )
							if( bearPower <= -0.009786 )
								if( bbp <= -0.008934 )
									ret := 0.250000
								if( bbp > -0.008934 )
									ret := 0.571429
							if( bearPower > -0.009786 )
								if( ema2 <= 1.91135 )
									ret := -0.937500 // sell
								if( ema2 > 1.91135 )
									ret := -0.236364
					if( bullPower > 0.019037 )
						if( bearPower <= 0.015286 )
							if( bbm <= 0.013317 )
								if( ema1 <= 1.98552 )
									ret := 0.400000
								if( ema1 > 1.98552 )
									ret := 0.629630
							if( bbm > 0.013317 )
								ret := 0.166667
						if( bearPower > 0.015286 )
							if( bearPower <= 0.025197 )
								if( ema2 <= 2.51212 )
									ret := -0.625000
								if( ema2 > 2.51212 )
									ret := 0.230769
							if( bearPower > 0.025197 )
								ret := 0.714286 // buy
	if( bbm > 0.015395 )
		if( bbp <= -5.11883 )
			if( ema12 <= -5.10023 )
				if( ema2 <= 197.903 )
					if( ema13 <= -9.48192 )
						ret := 1.000000 // buy
					if( ema13 > -9.48192 )
						if( ema13 <= -9.31372 )
							ret := 0.750000 // buy
						if( ema13 > -9.31372 )
							if( ema12 <= -5.23572 )
								ret := 1.000000 // buy
							if( ema12 > -5.23572 )
								ret := 0.900000 // buy
				if( ema2 > 197.903 )
					ret := 0.636364
			if( ema12 > -5.10023 )
				if( tema <= 192.103 )
					if( ema13 <= -5.67644 )
						if( tema <= 99.4562 )
							if( ema1 <= 100.137 )
								ret := 1.000000 // buy
							if( ema1 > 100.137 )
								ret := 0.888889 // buy
						if( tema > 99.4562 )
							if( ema3 <= 119.996 )
								ret := -0.454545
							if( ema3 > 119.996 )
								if( bbm <= 2.80621 )
									ret := -0.184211
								if( bbm > 2.80621 )
									ret := 0.581395
					if( ema13 > -5.67644 )
						if( ema12 <= -2.32554 )
							if( ema2 <= 147.235 )
								if( ema3 <= 139.751 )
									ret := -0.113402
								if( ema3 > 139.751 )
									ret := 0.681818
							if( ema2 > 147.235 )
								if( bbm <= 6.7686 )
									ret := -0.236842
								if( bbm > 6.7686 )
									ret := 0.400000
						if( ema12 > -2.32554 )
							if( bbp <= -6.33071 )
								if( ema1 <= 177.967 )
									ret := 0.367776
								if( ema1 > 177.967 )
									ret := -0.120000
							if( bbp > -6.33071 )
								if( ema1 <= 178.286 )
									ret := 0.073099
								if( ema1 > 178.286 )
									ret := 0.553191
				if( tema > 192.103 )
					if( ema2 <= 236.836 )
						if( ema12 <= -2.12813 )
							if( bullPower <= -2.90063 )
								if( ema3 <= 229.331 )
									ret := 0.078431
								if( ema3 > 229.331 )
									ret := -0.966667 // sell
							if( bullPower > -2.90063 )
								if( bbp <= -6.66937 )
									ret := -0.858974 // sell
								if( bbp > -6.66937 )
									ret := -0.285714
						if( ema12 > -2.12813 )
							if( ema3 <= 206.456 )
								if( ema1 <= 195.512 )
									ret := 0.166667
								if( ema1 > 195.512 )
									ret := -0.617284
							if( ema3 > 206.456 )
								if( ema13 <= -3.48117 )
									ret := -0.454545
								if( ema13 > -3.48117 )
									ret := 0.647727
					if( ema2 > 236.836 )
						if( ema13 <= -2.94444 )
							if( ema2 <= 244.201 )
								ret := 0.375000
							if( ema2 > 244.201 )
								ret := 1.000000 // buy
						if( ema13 > -2.94444 )
							ret := 0.125000
		if( bbp > -5.11883 )
			if( ema3 <= 146.541 )
				if( ema2 <= 2.10789 )
					if( bullPower <= -0.025077 )
						if( bbm <= 0.023977 )
							if( bbm <= 0.01892 )
								if( bbm <= 0.0165 )
									ret := 0.153846
								if( bbm > 0.0165 )
									ret := 0.692308
							if( bbm > 0.01892 )
								if( ema3 <= 1.91931 )
									ret := 0.307692
								if( ema3 > 1.91931 )
									ret := -0.866667 // sell
						if( bbm > 0.023977 )
							if( ema13 <= -0.186122 )
								ret := -0.333333
							if( ema13 > -0.186122 )
								if( ema13 <= -0.040433 )
									ret := 0.834356 // buy
								if( ema13 > -0.040433 )
									ret := 0.085714
					if( bullPower > -0.025077 )
						if( tema <= 1.36884 )
							if( bbp <= 0.029191 )
								if( bbm <= 0.026499 )
									ret := 0.544000
								if( bbm > 0.026499 )
									ret := 0.880000 // buy
							if( bbp > 0.029191 )
								if( ema1 <= 1.28018 )
									ret := -0.966667 // sell
								if( ema1 > 1.28018 )
									ret := 0.529412
						if( tema > 1.36884 )
							if( bbp <= 0.017629 )
								if( ema3 <= 1.6712 )
									ret := -0.206171
								if( ema3 > 1.6712 )
									ret := 0.111020
							if( bbp > 0.017629 )
								if( bullPower <= 0.099615 )
									ret := 0.265781
								if( bullPower > 0.099615 )
									ret := -0.226994
				if( ema2 > 2.10789 )
					if( bbp <= -3.73875 )
						if( ema2 <= 46.6611 )
							if( bbm <= 2.11286 )
								if( bbp <= -4.31137 )
									ret := -0.115385
								if( bbp > -4.31137 )
									ret := 0.490566
							if( bbm > 2.11286 )
								if( bbm <= 2.53656 )
									ret := 0.750000 // buy
								if( bbm > 2.53656 )
									ret := 1.000000 // buy
						if( ema2 > 46.6611 )
							if( ema13 <= -4.11701 )
								if( bbm <= 3.045 )
									ret := -0.333333
								if( bbm > 3.045 )
									ret := -0.736842 // sell
							if( ema13 > -4.11701 )
								if( bbm <= 4.80489 )
									ret := 0.182039
								if( bbm > 4.80489 )
									ret := 0.920000 // buy
					if( bbp > -3.73875 )
						if( ema3 <= 2.11375 )
							if( bearPower <= -0.018736 )
								ret := 0.000000
							if( bearPower > -0.018736 )
								if( ema13 <= 0.043525 )
									ret := -0.631579
								if( ema13 > 0.043525 )
									ret := -0.901235 // sell
						if( ema3 > 2.11375 )
							if( ema1 <= 2.42864 )
								if( ema13 <= 0.100634 )
									ret := -0.073705
								if( ema13 > 0.100634 )
									ret := -0.831325 // sell
							if( ema1 > 2.42864 )
								if( tema <= 2.49516 )
									ret := 0.717213 // buy
								if( tema > 2.49516 )
									ret := 0.005647
			if( ema3 > 146.541 )
				if( ema2 <= 153.347 )
					if( bearPower <= 2.7565 )
						if( ema1 <= 145.939 )
							if( bbp <= -1.93925 )
								if( ema13 <= -2.58836 )
									ret := -0.050000
								if( ema13 > -2.58836 )
									ret := 0.170732
							if( bbp > -1.93925 )
								ret := 0.636364
						if( ema1 > 145.939 )
							if( ema13 <= -1.15023 )
								if( bbm <= 2.46081 )
									ret := -0.452703
								if( bbm > 2.46081 )
									ret := -0.761905 // sell
							if( ema13 > -1.15023 )
								if( ema3 <= 148.795 )
									ret := -0.334545
								if( ema3 > 148.795 )
									ret := -0.043796
					if( bearPower > 2.7565 )
						if( tema <= 156.588 )
							ret := -0.700000 // sell
						if( tema > 156.588 )
							if( bullPower <= 5.99983 )
								ret := 1.000000 // buy
							if( bullPower > 5.99983 )
								ret := 0.750000 // buy
				if( ema2 > 153.347 )
					if( ema2 <= 154.876 )
						if( ema1 <= 153.764 )
							if( bullPower <= -0.577668 )
								if( ema2 <= 154.075 )
									ret := -1.000000 // sell
								if( ema2 > 154.075 )
									ret := -0.500000
							if( bullPower > -0.577668 )
								if( bearPower <= -1.28354 )
									ret := 0.571429
								if( bearPower > -1.28354 )
									ret := -0.607143
						if( ema1 > 153.764 )
							if( bbp <= 3.11669 )
								if( bbm <= 0.783619 )
									ret := -0.250000
								if( bbm > 0.783619 )
									ret := 0.615764
							if( bbp > 3.11669 )
								if( ema3 <= 153.601 )
									ret := 0.272727
								if( ema3 > 153.601 )
									ret := -0.714286 // sell
					if( ema2 > 154.876 )
						if( ema3 <= 248.454 )
							if( bullPower <= -0.72666 )
								if( bearPower <= -3.23134 )
									ret := 0.040000
								if( bearPower > -3.23134 )
									ret := -0.282132
							if( bullPower > -0.72666 )
								if( bbm <= 3.40575 )
									ret := -0.009745
								if( bbm > 3.40575 )
									ret := -0.135417
						if( ema3 > 248.454 )
							if( bbp <= -0.258119 )
								if( ema3 <= 253.15 )
									ret := -0.222222
								if( ema3 > 253.15 )
									ret := 0.000000
							if( bbp > -0.258119 )
								if( ema1 <= 254.961 )
									ret := -0.678571
								if( ema1 > 254.961 )
									ret := -0.964286 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_SOLUSDT_30Min_92db2fb1(bbm, bearPower, bbp, bullPower, BBPower_Color, ema1, tema, ema12, ema2, ema3, ema13)

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


