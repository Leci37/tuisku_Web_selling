//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: BTCUSDT_1Hour_1BOL_fad09273 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_1Hour_1BOL_fad09273", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_1Hour_fad09273(BBupper, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower, vrsi, dif_source_BBupper, crossover_rsi_bblowerInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( BBlower <= 62153 )
		if( dif_source_BBlower <= 5843.42 )
			if( dif_source_BBlower <= 3882.01 )
				if( vrsi <= 15.3786 )
					if( BBupper <= 60267.9 )
						if( BBupper <= 58428.3 )
							ret := -0.099165
						if( BBupper > 58428.3 )
							ret := -0.553922
					if( BBupper > 60267.9 )
						if( dif_source_BBupper <= -5629.84 )
							ret := 0.443439
						if( dif_source_BBupper > -5629.84 )
							ret := -0.153846
				if( vrsi > 15.3786 )
					if( dif_source_BBlower <= -2395.04 )
						if( BBupper <= 69256 )
							ret := 0.835294 // buy
						if( BBupper > 69256 )
							ret := -0.416667
					if( dif_source_BBlower > -2395.04 )
						if( dif_source_BBlower <= 284.883 )
							ret := -0.039531
						if( dif_source_BBlower > 284.883 )
							ret := 0.033177
			if( dif_source_BBlower > 3882.01 )
				if( dif_source_BBupper <= 786.659 )
					if( dif_source_BBupper <= -12541.6 )
						if( BBupper <= 70104.1 )
							ret := -0.935484 // sell
						if( BBupper > 70104.1 )
							ret := 0.000000
					if( dif_source_BBupper > -12541.6 )
						if( dif_source_BBupper <= -10475.8 )
							ret := 0.666667
						if( dif_source_BBupper > -10475.8 )
							ret := -0.182330
				if( dif_source_BBupper > 786.659 )
					if( BBupper <= 19884.9 )
						ret := -0.416667
					if( BBupper > 19884.9 )
						if( dif_source_BBlower <= 5762.66 )
							ret := 0.695853
						if( dif_source_BBlower > 5762.66 )
							ret := 0.178571
		if( dif_source_BBlower > 5843.42 )
			if( dif_source_BBlower <= 8569.88 )
				if( BBlower <= 25935 )
					if( dif_source_BBupper <= -493.764 )
						if( BBupper <= 25820 )
							ret := 0.039735
						if( BBupper > 25820 )
							ret := 0.663443
					if( dif_source_BBupper > -493.764 )
						if( dif_source_BBlower <= 7213.83 )
							ret := -0.348571
						if( dif_source_BBlower > 7213.83 )
							ret := 0.921569 // buy
				if( BBlower > 25935 )
					if( BBupper <= 66814.2 )
						if( BBupper <= 66390.1 )
							ret := 0.099410
						if( BBupper > 66390.1 )
							ret := -0.653846
					if( BBupper > 66814.2 )
						if( BBlower <= 58654 )
							ret := 0.878261 // buy
						if( BBlower > 58654 )
							ret := 0.281843
			if( dif_source_BBlower > 8569.88 )
				if( BBlower <= 25589.9 )
					if( dif_source_BBlower <= 8878.5 )
						ret := 0.133333
					if( dif_source_BBlower > 8878.5 )
						if( BBlower <= 18484.4 )
							ret := -0.133333
						if( BBlower > 18484.4 )
							ret := -0.920455 // sell
				if( BBlower > 25589.9 )
					if( dif_source_BBupper <= -1860.62 )
						if( dif_source_BBlower <= 13160.3 )
							ret := 0.119347
						if( dif_source_BBlower > 13160.3 )
							ret := 0.537815
					if( dif_source_BBupper > -1860.62 )
						if( vrsi <= 84.0264 )
							ret := -0.121965
						if( vrsi > 84.0264 )
							ret := 0.207547
	if( BBlower > 62153 )
		if( BBupper <= 66993.7 )
			if( BBlower <= 62268.2 )
				ret := -0.222222
			if( BBlower > 62268.2 )
				if( dif_source_BBupper <= -2831.96 )
					if( BBlower <= 62352.9 )
						ret := -0.888889 // sell
					if( BBlower > 62352.9 )
						ret := -1.000000 // sell
				if( dif_source_BBupper > -2831.96 )
					ret := -0.571429
		if( BBupper > 66993.7 )
			if( dif_source_BBlower <= 317.189 )
				if( BBlower <= 67350.2 )
					if( BBlower <= 63388 )
						if( BBupper <= 69992.3 )
							ret := -0.433333
						if( BBupper > 69992.3 )
							ret := 0.485714
					if( BBlower > 63388 )
						if( BBupper <= 74429.2 )
							ret := 0.520231
						if( BBupper > 74429.2 )
							ret := -0.307692
				if( BBlower > 67350.2 )
					if( dif_source_BBupper <= -4828.19 )
						ret := -0.363636
					if( dif_source_BBupper > -4828.19 )
						ret := -0.944444 // sell
			if( dif_source_BBlower > 317.189 )
				if( BBupper <= 74377.8 )
					if( BBupper <= 74202.9 )
						if( BBupper <= 73704.4 )
							ret := -0.182703
						if( BBupper > 73704.4 )
							ret := -0.854167 // sell
					if( BBupper > 74202.9 )
						if( dif_source_BBlower <= 2501.51 )
							ret := 0.833333 // buy
						if( dif_source_BBlower > 2501.51 )
							ret := -0.440000
				if( BBupper > 74377.8 )
					if( BBupper <= 74939.5 )
						if( vrsi <= 14.4884 )
							ret := -0.166667
						if( vrsi > 14.4884 )
							ret := -0.878505 // sell
					if( BBupper > 74939.5 )
						ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_BTCUSDT_1Hour_fad09273(BBupper, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower, vrsi, dif_source_BBupper, crossover_rsi_bblowerInt)

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


