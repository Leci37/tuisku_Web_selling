//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: SOLUSDT_30Min_1WAV_ff99cb30 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_30Min_1WAV_ff99cb30", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_30Min_ff99cb30(esa, d_tci, tci, ci_wt2, wt2, d, ci, ap)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( wt2 <= -73.215 )
		if( ci <= -73.2435 )
			if( ap <= 8.54167 )
				if( esa <= 2.4115 )
					if( ci_wt2 <= -17.0748 )
						ret := 0.722222 // buy
					if( ci_wt2 > -17.0748 )
						ret := 0.916667 // buy
				if( esa > 2.4115 )
					ret := 1.000000 // buy
			if( ap > 8.54167 )
				if( tci <= -80.5311 )
					if( wt2 <= -77.9186 )
						if( esa <= 77.7826 )
							if( wt2 <= -79.8818 )
								if( ci_wt2 <= -10.8367 )
									ret := 0.250000
								if( ci_wt2 > -10.8367 )
									ret := 0.111111
							if( wt2 > -79.8818 )
								ret := 0.600000
						if( esa > 77.7826 )
							ret := 0.875000 // buy
					if( wt2 > -77.9186 )
						ret := 0.000000
				if( tci > -80.5311 )
					if( wt2 <= -73.7228 )
						if( d <= 0.617285 )
							if( ci <= -99.5565 )
								ret := 0.818182 // buy
							if( ci > -99.5565 )
								if( wt2 <= -75.6253 )
									ret := 1.000000 // buy
								if( wt2 > -75.6253 )
									ret := 0.888889 // buy
						if( d > 0.617285 )
							if( ci <= -79.6626 )
								if( ap <= 65.32 )
									ret := 1.000000 // buy
								if( ap > 65.32 )
									ret := 0.846154 // buy
							if( ci > -79.6626 )
								ret := 0.250000
					if( wt2 > -73.7228 )
						ret := 0.200000
		if( ci > -73.2435 )
			if( ci_wt2 <= 195.986 )
				if( ap <= 23.861 )
					if( d <= 0.260137 )
						if( d <= 0.056509 )
							if( tci <= -87.8691 )
								ret := 1.000000 // buy
							if( tci > -87.8691 )
								ret := 0.440000
						if( d > 0.056509 )
							if( ci <= -48.4347 )
								if( d_tci <= 77.0353 )
									ret := 0.083333
								if( d_tci > 77.0353 )
									ret := -0.461538
							if( ci > -48.4347 )
								if( wt2 <= -77.8065 )
									ret := 0.000000
								if( wt2 > -77.8065 )
									ret := 0.500000
					if( d > 0.260137 )
						if( wt2 <= -78.449 )
							if( ap <= 18.6962 )
								if( tci <= -77.8745 )
									ret := 0.909091 // buy
								if( tci > -77.8745 )
									ret := 0.888889 // buy
							if( ap > 18.6962 )
								ret := 0.000000
						if( wt2 > -78.449 )
							if( esa <= 20.1936 )
								ret := 0.833333 // buy
							if( esa > 20.1936 )
								if( ap <= 22.1924 )
									ret := 1.000000 // buy
								if( ap > 22.1924 )
									ret := 0.916667 // buy
				if( ap > 23.861 )
					if( d <= 0.478647 )
						if( tci <= -75.4196 )
							ret := -0.888889 // sell
						if( tci > -75.4196 )
							ret := -0.250000
					if( d > 0.478647 )
						if( d_tci <= 70.8671 )
							ret := -0.500000
						if( d_tci > 70.8671 )
							if( d_tci <= 76.4969 )
								if( wt2 <= -74.3326 )
									ret := 0.100000
								if( wt2 > -74.3326 )
									ret := 0.863636 // buy
							if( d_tci > 76.4969 )
								if( ap <= 43.9533 )
									ret := -0.636364
								if( ap > 43.9533 )
									ret := 0.117647
			if( ci_wt2 > 195.986 )
				ret := -0.818182 // sell
	if( wt2 > -73.215 )
		if( ap <= 141.151 )
			if( d_tci <= 51.978 )
				if( wt2 <= -12.6174 )
					if( ap <= 31.4546 )
						if( ap <= 26.1952 )
							if( d_tci <= 10.9124 )
								if( tci <= -10.6966 )
									ret := 0.838710 // buy
								if( tci > -10.6966 )
									ret := 0.093439
							if( d_tci > 10.9124 )
								if( wt2 <= -44.2869 )
									ret := 0.065402
								if( wt2 > -44.2869 )
									ret := -0.068836
						if( ap > 26.1952 )
							if( wt2 <= -23.7438 )
								if( wt2 <= -26.3687 )
									ret := 0.209111
								if( wt2 > -26.3687 )
									ret := 0.469136
							if( wt2 > -23.7438 )
								if( ap <= 26.6783 )
									ret := 0.491525
								if( ap > 26.6783 )
									ret := -0.189850
					if( ap > 31.4546 )
						if( wt2 <= -20.6042 )
							if( ap <= 121.032 )
								if( d_tci <= 33.6626 )
									ret := -0.221374
								if( d_tci > 33.6626 )
									ret := -0.063998
							if( ap > 121.032 )
								if( d_tci <= 34.4923 )
									ret := 0.081481
								if( d_tci > 34.4923 )
									ret := -0.064644
						if( wt2 > -20.6042 )
							if( ci_wt2 <= 31.2283 )
								if( esa <= 139.633 )
									ret := -0.090489
								if( esa > 139.633 )
									ret := 0.661765
							if( ci_wt2 > 31.2283 )
								if( d_tci <= 4.20982 )
									ret := -0.136364
								if( d_tci > 4.20982 )
									ret := 0.138889
				if( wt2 > -12.6174 )
					if( esa <= 4.23254 )
						if( esa <= 2.11898 )
							if( ci_wt2 <= -31.998 )
								if( wt2 <= 58.1486 )
									ret := 0.111270
								if( wt2 > 58.1486 )
									ret := 0.896552 // buy
							if( ci_wt2 > -31.998 )
								if( tci <= 16.8331 )
									ret := -0.184071
								if( tci > 16.8331 )
									ret := 0.093388
						if( esa > 2.11898 )
							if( d_tci <= -8.32612 )
								if( ci <= 137.423 )
									ret := -0.145445
								if( ci > 137.423 )
									ret := -0.534884
							if( d_tci > -8.32612 )
								if( wt2 <= 3.0722 )
									ret := 0.200696
								if( wt2 > 3.0722 )
									ret := -0.121032
					if( esa > 4.23254 )
						if( esa <= 5.8309 )
							if( ci <= 45.4561 )
								if( d_tci <= -60.0638 )
									ret := -0.843750 // sell
								if( d_tci > -60.0638 )
									ret := 0.362245
							if( ci > 45.4561 )
								if( d <= 0.130887 )
									ret := 0.644809
								if( d > 0.130887 )
									ret := 0.187500
						if( esa > 5.8309 )
							if( ci <= -76.6932 )
								if( tci <= -18.7328 )
									ret := 0.163085
								if( tci > -18.7328 )
									ret := -0.073687
							if( ci > -76.6932 )
								if( ci_wt2 <= 189.996 )
									ret := 0.038019
								if( ci_wt2 > 189.996 )
									ret := 0.558442
			if( d_tci > 51.978 )
				if( tci <= -53.7549 )
					if( ci_wt2 <= -84.2294 )
						if( ci_wt2 <= -96.4598 )
							if( esa <= 135.024 )
								if( d <= 0.218338 )
									ret := -0.072993
								if( d > 0.218338 )
									ret := 0.663793
							if( esa > 135.024 )
								ret := -0.888889 // sell
						if( ci_wt2 > -96.4598 )
							if( d <= 0.186169 )
								if( ci <= -133.787 )
									ret := 0.042553
								if( ci > -133.787 )
									ret := 0.428571
							if( d > 0.186169 )
								if( d_tci <= 65.0443 )
									ret := 0.754098 // buy
								if( d_tci > 65.0443 )
									ret := 0.250000
					if( ci_wt2 > -84.2294 )
						if( tci <= -61.8227 )
							if( ci <= -103.212 )
								if( esa <= 17.9721 )
									ret := 0.429952
								if( esa > 17.9721 )
									ret := 0.122396
							if( ci > -103.212 )
								if( esa <= 112.545 )
									ret := 0.024228
								if( esa > 112.545 )
									ret := 0.399399
						if( tci > -61.8227 )
							if( ci_wt2 <= 104.407 )
								if( wt2 <= -63.5362 )
									ret := -0.294118
								if( wt2 > -63.5362 )
									ret := -0.006234
							if( ci_wt2 > 104.407 )
								if( esa <= 22.1334 )
									ret := 0.214286
								if( esa > 22.1334 )
									ret := 0.944444 // buy
				if( tci > -53.7549 )
					if( ci_wt2 <= 57.7189 )
						if( esa <= 10.963 )
							if( ci <= -31.1629 )
								if( esa <= 3.02655 )
									ret := -0.318841
								if( esa > 3.02655 )
									ret := 0.000000
							if( ci > -31.1629 )
								if( ci_wt2 <= 37.6116 )
									ret := 0.555556
								if( ci_wt2 > 37.6116 )
									ret := -0.100000
						if( esa > 10.963 )
							if( d_tci <= 54.3157 )
								if( ci <= -72.6593 )
									ret := 0.391421
								if( ci > -72.6593 )
									ret := 0.188834
							if( d_tci > 54.3157 )
								if( d <= 2.2378 )
									ret := 0.757576 // buy
								if( d > 2.2378 )
									ret := 0.531250
					if( ci_wt2 > 57.7189 )
						if( esa <= 12.6125 )
							if( ci <= 18.9231 )
								ret := -0.100000
							if( ci > 18.9231 )
								ret := 0.714286 // buy
						if( esa > 12.6125 )
							if( ci_wt2 <= 68.8612 )
								if( d_tci <= 53.2997 )
									ret := -0.821429 // sell
								if( d_tci > 53.2997 )
									ret := -0.416667
							if( ci_wt2 > 68.8612 )
								if( wt2 <= -60.377 )
									ret := -0.250000
								if( wt2 > -60.377 )
									ret := 0.318182
		if( ap > 141.151 )
			if( ap <= 153.696 )
				if( ci_wt2 <= 168.084 )
					if( tci <= 76.0824 )
						if( tci <= 15.8178 )
							if( ci_wt2 <= -59.1107 )
								if( tci <= -31.2883 )
									ret := -0.058140
								if( tci > -31.2883 )
									ret := -0.392491
							if( ci_wt2 > -59.1107 )
								if( wt2 <= 2.65587 )
									ret := -0.128255
								if( wt2 > 2.65587 )
									ret := 0.088652
						if( tci > 15.8178 )
							if( tci <= 40.4488 )
								if( tci <= 30.3514 )
									ret := -0.033846
								if( tci > 30.3514 )
									ret := 0.144177
							if( tci > 40.4488 )
								if( ci_wt2 <= -112.892 )
									ret := 0.787879 // buy
								if( ci_wt2 > -112.892 )
									ret := -0.163976
					if( tci > 76.0824 )
						ret := -0.904762 // sell
				if( ci_wt2 > 168.084 )
					if( tci <= 0.377389 )
						if( ap <= 147.328 )
							ret := 0.300000
						if( ap > 147.328 )
							ret := 1.000000 // buy
					if( tci > 0.377389 )
						ret := 0.227273
			if( ap > 153.696 )
				if( ci_wt2 <= 90.3218 )
					if( d_tci <= 67.6644 )
						if( ci <= 49.2428 )
							if( tci <= 47.7507 )
								if( ci <= -36.9372 )
									ret := 0.026019
								if( ci > -36.9372 )
									ret := -0.101690
							if( tci > 47.7507 )
								if( d <= 1.91113 )
									ret := -0.003030
								if( d > 1.91113 )
									ret := 0.236641
						if( ci > 49.2428 )
							if( ap <= 169.665 )
								if( ap <= 162.977 )
									ret := 0.150090
								if( ap > 162.977 )
									ret := 0.490991
							if( ap > 169.665 )
								if( ci <= 73.1607 )
									ret := 0.123537
								if( ci > 73.1607 )
									ret := -0.150766
					if( d_tci > 67.6644 )
						if( esa <= 170.964 )
							if( esa <= 165.056 )
								ret := -1.000000 // sell
							if( esa > 165.056 )
								if( ci <= -114.963 )
									ret := -1.000000 // sell
								if( ci > -114.963 )
									ret := -0.125000
						if( esa > 170.964 )
							if( esa <= 202.464 )
								if( d <= 1.91871 )
									ret := 0.384615
								if( d > 1.91871 )
									ret := 0.823129 // buy
							if( esa > 202.464 )
								ret := 0.050000
				if( ci_wt2 > 90.3218 )
					if( d_tci <= 28.2927 )
						if( ci <= 99.5204 )
							if( d <= 2.34663 )
								if( wt2 <= -14.3914 )
									ret := -0.069853
								if( wt2 > -14.3914 )
									ret := -0.539326
							if( d > 2.34663 )
								if( ci_wt2 <= 118.645 )
									ret := -1.000000 // sell
								if( ci_wt2 > 118.645 )
									ret := -0.769231 // sell
						if( ci > 99.5204 )
							if( d_tci <= -5.4377 )
								if( tci <= 21.4406 )
									ret := -0.262032
								if( tci > 21.4406 )
									ret := -0.008646
							if( d_tci > -5.4377 )
								if( d_tci <= 1.39562 )
									ret := 0.363636
								if( d_tci > 1.39562 )
									ret := -0.021978
					if( d_tci > 28.2927 )
						if( d <= 2.10297 )
							if( ci <= 53.917 )
								if( ci <= 48.5097 )
									ret := -0.222222
								if( ci > 48.5097 )
									ret := 0.312500
							if( ci > 53.917 )
								if( ap <= 187.553 )
									ret := -0.656566
								if( ap > 187.553 )
									ret := -0.259259
						if( d > 2.10297 )
							if( d_tci <= 31.4656 )
								ret := -0.461538
							if( d_tci > 31.4656 )
								if( tci <= -41.7036 )
									ret := -0.571429
								if( tci > -41.7036 )
									ret := -0.957447 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Wave_Trend_Calculation 
//@version=5
//indicator "WaveTrend [LazyBear]", shorttitle="WT_LB", overlay=false)

n1 = input.int(10, title="Channel Length")
n2 = input.int(21, title="Average Length")
obLevel1 = input.float(60, title="Over Bought Level 1")
obLevel2 = input.float(53, title="Over Bought Level 2")
osLevel1 = input.float(-60, title="Over Sold Level 1")
osLevel2 = input.float(-53, title="Over Sold Level 2")

ap = hlc3
esa = ta.ema(ap, n1)
d = ta.ema(math.abs(ap - esa), n1)
ci = (ap - esa) / (0.015 * d)
tci = ta.ema(ci, n2)

wt1 = tci
wt2 = ta.sma(wt1, 4)

d_tci = d-tci
ci_wt2 = ci - wt2

plot(0, color=color.gray)
plot(obLevel1, color=color.red)
plot(osLevel1, color=color.green)
plot(obLevel2, color=color.red, linewidth=2, style=plot.style_line, title="OB Level 2 (Dashed)", color=color.red)
plot(osLevel2, color=color.green, linewidth=2, style=plot.style_line, title="OS Level 2 (Dashed)", color=color.green)

plot(wt1, color=color.green, title="WT1")
plot(wt2, color=color.red, title="WT2", style=plot.style_line, linewidth=1)
plot(wt1 - wt2, color=color.new(color.blue, 80), title="WT1-WT2", style=plot.style_area)

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
float op_operation = decision_tree_0_SOLUSDT_30Min_ff99cb30(esa, d_tci, tci, ci_wt2, wt2, d, ci, ap)

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


