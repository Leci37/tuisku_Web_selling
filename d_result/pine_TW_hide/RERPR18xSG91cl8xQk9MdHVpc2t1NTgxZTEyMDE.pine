//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: DDOG_1Hour_1BOL_581e1201 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DDOG_1Hour_1BOL_581e1201", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DDOG_1Hour_581e1201(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( BBlower <= 66.0203 )
		if( BBlower <= 32.2396 )
			if( vrsi <= 76.6961 )
				if( BBlower <= 29.0336 )
					if( dif_source_BBlower <= 6.44698 )
						if( vrsi <= 42.2039 )
							ret := 0.191489
						if( vrsi > 42.2039 )
							ret := 0.777070 // buy
					if( dif_source_BBlower > 6.44698 )
						if( BBlower <= 26.8336 )
							ret := 0.363636
						if( BBlower > 26.8336 )
							ret := -0.375000
				if( BBlower > 29.0336 )
					if( dif_source_BBlower <= 36.8504 )
						if( BBupper <= 50.8885 )
							ret := -0.230425
						if( BBupper > 50.8885 )
							ret := 0.745455 // buy
					if( dif_source_BBlower > 36.8504 )
						if( dif_source_BBlower <= 38.5686 )
							ret := -1.000000 // sell
						if( dif_source_BBlower > 38.5686 )
							ret := -0.900000 // sell
			if( vrsi > 76.6961 )
				if( vrsi <= 89.8636 )
					if( dif_source_BBlower <= 2.81577 )
						ret := 1.000000 // buy
					if( dif_source_BBlower > 2.81577 )
						if( vrsi <= 87.9172 )
							ret := -0.716216 // sell
						if( vrsi > 87.9172 )
							ret := 0.100000
				if( vrsi > 89.8636 )
					if( BBupper <= 37.4449 )
						ret := -0.181818
					if( BBupper > 37.4449 )
						if( vrsi <= 96.5379 )
							ret := -0.955882 // sell
						if( vrsi > 96.5379 )
							ret := -0.800000 // sell
		if( BBlower > 32.2396 )
			if( BBlower <= 65.1739 )
				if( BBlower <= 38.5446 )
					if( vrsi <= 56.8073 )
						if( BBupper <= 41.2798 )
							ret := 0.734807 // buy
						if( BBupper > 41.2798 )
							ret := 0.367213
					if( vrsi > 56.8073 )
						if( dif_source_BBupper <= -6.65483 )
							ret := -0.737500 // sell
						if( dif_source_BBupper > -6.65483 )
							ret := 0.260597
				if( BBlower > 38.5446 )
					if( BBupper <= 49.5059 )
						if( BBlower <= 41.3683 )
							ret := -0.440000
						if( BBlower > 41.3683 )
							ret := -0.882979 // sell
					if( BBupper > 49.5059 )
						if( dif_source_BBupper <= -4.9725 )
							ret := 0.279597
						if( dif_source_BBupper > -4.9725 )
							ret := -0.002868
			if( BBlower > 65.1739 )
				if( dif_source_BBupper <= -0.999671 )
					if( BBupper <= 81.9616 )
						if( BBlower <= 65.4223 )
							ret := 0.791667 // buy
						if( BBlower > 65.4223 )
							ret := 1.000000 // buy
					if( BBupper > 81.9616 )
						if( BBlower <= 65.8473 )
							ret := 0.313043
						if( BBlower > 65.8473 )
							ret := 0.827586 // buy
				if( dif_source_BBupper > -0.999671 )
					if( vrsi <= 53.6779 )
						ret := -0.636364
					if( vrsi > 53.6779 )
						if( BBupper <= 80.088 )
							ret := 0.607143
						if( BBupper > 80.088 )
							ret := -0.444444
	if( BBlower > 66.0203 )
		if( BBlower <= 121.973 )
			if( dif_source_BBlower <= -2.32898 )
				if( dif_source_BBupper <= -20.6639 )
					if( vrsi <= 9.07521 )
						if( vrsi <= 7.17339 )
							ret := 0.833333 // buy
						if( vrsi > 7.17339 )
							ret := -0.642857
					if( vrsi > 9.07521 )
						if( BBupper <= 99.6397 )
							ret := 0.151515
						if( BBupper > 99.6397 )
							ret := 0.836879 // buy
				if( dif_source_BBupper > -20.6639 )
					if( BBlower <= 79.8492 )
						if( BBlower <= 75.4005 )
							ret := 0.450000
						if( BBlower > 75.4005 )
							ret := 1.000000 // buy
					if( BBlower > 79.8492 )
						if( dif_source_BBlower <= -3.84772 )
							ret := -0.363636
						if( dif_source_BBlower > -3.84772 )
							ret := 0.058824
			if( dif_source_BBlower > -2.32898 )
				if( BBupper <= 88.8769 )
					if( BBupper <= 80.1151 )
						if( vrsi <= 73.5584 )
							ret := 0.915493 // buy
						if( vrsi > 73.5584 )
							ret := -0.727273 // sell
					if( BBupper > 80.1151 )
						if( BBupper <= 82.7293 )
							ret := -0.492462
						if( BBupper > 82.7293 )
							ret := -0.199834
				if( BBupper > 88.8769 )
					if( dif_source_BBupper <= -49.5568 )
						if( BBupper <= 183.052 )
							ret := 0.909091 // buy
						if( BBupper > 183.052 )
							ret := 0.000000
					if( dif_source_BBupper > -49.5568 )
						if( BBupper <= 111.026 )
							ret := 0.050225
						if( BBupper > 111.026 )
							ret := -0.061865
		if( BBlower > 121.973 )
			if( BBlower <= 126.517 )
				if( dif_source_BBlower <= 1.93119 )
					if( BBupper <= 158.566 )
						if( vrsi <= 8.7397 )
							ret := -0.666667
						if( vrsi > 8.7397 )
							ret := 0.321429
					if( BBupper > 158.566 )
						ret := -1.000000 // sell
				if( dif_source_BBlower > 1.93119 )
					if( BBupper <= 136.599 )
						if( dif_source_BBupper <= -8.11319 )
							ret := -0.642857
						if( dif_source_BBupper > -8.11319 )
							ret := -1.000000 // sell
					if( BBupper > 136.599 )
						if( BBupper <= 138.687 )
							ret := -0.106383
						if( BBupper > 138.687 )
							ret := -0.594502
			if( BBlower > 126.517 )
				if( vrsi <= 3.087 )
					if( dif_source_BBlower <= -4.33029 )
						ret := 1.000000 // buy
					if( dif_source_BBlower > -4.33029 )
						if( BBlower <= 158.297 )
							ret := 0.558824
						if( BBlower > 158.297 )
							ret := -0.666667
				if( vrsi > 3.087 )
					if( BBlower <= 158.454 )
						if( dif_source_BBlower <= 1.88473 )
							ret := -0.366197
						if( dif_source_BBlower > 1.88473 )
							ret := 0.011025
					if( BBlower > 158.454 )
						if( dif_source_BBupper <= -33.6607 )
							ret := 0.400000
						if( dif_source_BBupper > -33.6607 )
							ret := -0.604878
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Bollinger_RSI_Double_Strategy 
//@version=5
//strategy "Bollinger + RSI, Double Strategy (by ChartArt) v1.1", shorttitle="CA_-_RSI_Bol_Strat_1.1", overlay=true)

// ChartArt's RSI + Bollinger Bands, Double Strategy - Update
//
// Version 1.1
// Idea by ChartArt on January 18, 2015.
//
// This strategy uses the RSI indicator
// together with the Bollinger Bands
// to sell when the price is above the
// upper Bollinger Band (and to buy when
// this value is below the lower band).
//
// This simple strategy only triggers when
// both the RSI and the Bollinger Bands
// indicators are at the same time in
// a overbought or oversold condition.
//
// In this version 1.1 the strategy was
// both simplified for the user and
// made more successful in backtesting.
//
// List of my work:
// https://www.tradingview.com/u/ChartArt/
//
//  __             __  ___       __  ___
// /  ` |__|  /\  |__)  |   /\  |__)  |
// \__, |  | /~~\ |  \  |  /~~\ |  \  |
//
//

///////////// RSI
RSIlength = input.int(6, title="RSI Period Length")
RSIoverSold = 50
RSIoverBought = 50
price = close
vrsi = ta.rsi(price, RSIlength)

///////////// Bollinger Bands
BBlength = input.int(200, minval=1, title="Bollinger Period Length")
BBmult = 2 // input(2.0, minval=0.001, maxval=50,title="Bollinger Bands Standard Deviation")
BBbasis = ta.sma(price, BBlength)
BBdev = BBmult * ta.stdev(price, BBlength)
BBupper = BBbasis + BBdev
BBlower = BBbasis - BBdev
source = close
buyEntry = ta.crossover(source, BBlower)
sellEntry = ta.crossunder(source, BBupper)
plot(BBbasis, color=color.aqua, title="Bollinger Bands SMA Basis Line")
p1 = plot(BBupper, color=color.silver, title="Bollinger Bands Upper Line")
p2 = plot(BBlower, color=color.silver, title="Bollinger Bands Lower Line")
fill(p1, p2)

///////////// Colors
switch1 = input(true, title="Enable Bar Color?")
switch2 = input(true, title="Enable Background Color?")
TrendColor = (price[1] > BBupper and price < BBupper and BBbasis < BBbasis[1]) ? color.red : (price[1] < BBlower and price > BBlower and BBbasis > BBbasis[1]) ? color.green : na
// bgColor1 = color.new(TrendColor, 70)
barcolor(switch1 ? TrendColor : na)

// Using color.new() to set transparency
bgColor = color.new(TrendColor, 90)
bgcolor(switch2 ? bgColor : na)

///////////// RSI + Bollinger Bands Strategy
crossover_rsi_bblower = ta.crossover(vrsi, RSIoverSold) and ta.crossover(source, BBlower)
crossunder_rsi_bbupper = ta.crossunder(vrsi, RSIoverBought) and ta.crossunder(source, BBupper)

crossover_rsi_bblowerInt = crossover_rsi_bblower ? 1: 0    //Bool to int
crossunder_rsi_bbupperInt = crossunder_rsi_bbupper ? 1: 0  //Bool to int

dif_vrsi_RSIoverSold = vrsi - RSIoverSold
dif_source_BBlower = source - BBlower
dif_vrsi_RSIoverBought = vrsi - RSIoverBought
dif_source_BBupper = source - BBupper

// if not na(vrsi)
//     if crossover_rsi_bblower
//         strategy.entry("RSI_BB_L", strategy.long, stop=BBlower, oca_type=strategy.oca.cancel, comment="RSI_BB_L")
//     else
//         strategy.cancel(id="RSI_BB_L")
//
//     if crossunder_rsi_bbupper
//         strategy.entry("RSI_BB_S", strategy.short, stop=BBupper, oca_type=strategy.oca.cancel, comment="RSI_BB_S")
//     else
//         strategy.cancel(id="RSI_BB_S")

//plot(strategy.equity, title="equity", color=color.red, linewidth=2, style=plot.style_areabr)
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
float op_operation = decision_tree_0_DDOG_1Hour_581e1201(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

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


