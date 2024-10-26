//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: MDB_5Min_1BOL_aa8d84c6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MDB_5Min_1BOL_aa8d84c6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MDB_5Min_aa8d84c6(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( BBlower <= 326.208 )
		if( BBlower <= 319.389 )
			if( BBupper <= 232.317 )
				if( BBlower <= 217.261 )
					if( dif_source_BBupper <= 10.8315 )
						if( dif_source_BBupper <= -3.13718 )
							ret := 0.316940
						if( dif_source_BBupper > -3.13718 )
							ret := 0.589552
					if( dif_source_BBupper > 10.8315 )
						ret := -1.000000 // sell
				if( BBlower > 217.261 )
					if( BBlower <= 222.141 )
						if( vrsi <= 92.2585 )
							ret := -0.104396
						if( vrsi > 92.2585 )
							ret := 0.714286 // buy
					if( BBlower > 222.141 )
						if( vrsi <= 55.2299 )
							ret := -0.085714
						if( vrsi > 55.2299 )
							ret := 0.577778
			if( BBupper > 232.317 )
				if( dif_source_BBupper <= 11.4585 )
					if( vrsi <= 71.9252 )
						if( dif_source_BBlower <= 4.74704 )
							ret := -0.060076
						if( dif_source_BBlower > 4.74704 )
							ret := 0.080292
					if( vrsi > 71.9252 )
						if( BBlower <= 222.894 )
							ret := -0.438835
						if( BBlower > 222.894 )
							ret := -0.019370
				if( dif_source_BBupper > 11.4585 )
					if( BBlower <= 265.434 )
						if( BBupper <= 329.033 )
							ret := -0.875000 // sell
						if( BBupper > 329.033 )
							ret := 0.696970
					if( BBlower > 265.434 )
						if( vrsi <= 95.0082 )
							ret := 0.937500 // buy
						if( vrsi > 95.0082 )
							ret := 0.000000
		if( BBlower > 319.389 )
			if( BBupper <= 347.345 )
				if( vrsi <= 78.9604 )
					if( dif_source_BBlower <= 14.2803 )
						if( BBupper <= 345.871 )
							ret := 0.525974
						if( BBupper > 345.871 )
							ret := 0.180645
					if( dif_source_BBlower > 14.2803 )
						if( BBupper <= 343.317 )
							ret := -0.378531
						if( BBupper > 343.317 )
							ret := 0.438776
				if( vrsi > 78.9604 )
					if( dif_source_BBupper <= 2.73435 )
						if( vrsi <= 90.9216 )
							ret := 0.670588
						if( vrsi > 90.9216 )
							ret := 0.263736
					if( dif_source_BBupper > 2.73435 )
						if( dif_source_BBupper <= 12.4293 )
							ret := 0.935484 // buy
						if( dif_source_BBupper > 12.4293 )
							ret := 0.000000
			if( BBupper > 347.345 )
				if( dif_source_BBlower <= 41.5781 )
					if( vrsi <= 64.5492 )
						if( dif_source_BBupper <= -0.994678 )
							ret := -0.009119
						if( dif_source_BBupper > -0.994678 )
							ret := 0.701299 // buy
					if( vrsi > 64.5492 )
						if( dif_source_BBupper <= -35.0325 )
							ret := 0.928571 // buy
						if( dif_source_BBupper > -35.0325 )
							ret := -0.315476
				if( dif_source_BBlower > 41.5781 )
					if( vrsi <= 69.1084 )
						if( dif_source_BBupper <= -29.6719 )
							ret := 0.800000 // buy
						if( dif_source_BBupper > -29.6719 )
							ret := -0.312500
					if( vrsi > 69.1084 )
						if( BBupper <= 396.326 )
							ret := 0.916667 // buy
						if( BBupper > 396.326 )
							ret := 0.500000
	if( BBlower > 326.208 )
		if( dif_source_BBlower <= 30.3713 )
			if( BBupper <= 512.05 )
				if( dif_source_BBupper <= -56.7428 )
					if( BBupper <= 424.645 )
						ret := -1.000000 // sell
					if( BBupper > 424.645 )
						if( vrsi <= 1.74757 )
							ret := 0.000000
						if( vrsi > 1.74757 )
							ret := 0.903226 // buy
				if( dif_source_BBupper > -56.7428 )
					if( BBlower <= 352.161 )
						if( vrsi <= 11.5698 )
							ret := 0.232742
						if( vrsi > 11.5698 )
							ret := -0.097698
					if( BBlower > 352.161 )
						if( BBupper <= 363.238 )
							ret := 0.348936
						if( BBupper > 363.238 )
							ret := 0.006125
			if( BBupper > 512.05 )
				if( BBupper <= 518.034 )
					if( dif_source_BBlower <= -13.229 )
						ret := 1.000000 // buy
					if( dif_source_BBlower > -13.229 )
						if( BBlower <= 459.652 )
							ret := 0.090909
						if( BBlower > 459.652 )
							ret := -0.793750 // sell
				if( BBupper > 518.034 )
					if( dif_source_BBupper <= -42.9166 )
						if( BBlower <= 467.726 )
							ret := 0.250000
						if( BBlower > 467.726 )
							ret := 0.900000 // buy
					if( dif_source_BBupper > -42.9166 )
						if( BBupper <= 518.37 )
							ret := 0.090909
						if( BBupper > 518.37 )
							ret := -0.933333 // sell
		if( dif_source_BBlower > 30.3713 )
			if( BBlower <= 392.419 )
				if( BBupper <= 415.521 )
					if( BBlower <= 371.148 )
						if( vrsi <= 72.765 )
							ret := -0.310440
						if( vrsi > 72.765 )
							ret := -0.736527 // sell
					if( BBlower > 371.148 )
						if( dif_source_BBlower <= 37.7781 )
							ret := 0.630137
						if( dif_source_BBlower > 37.7781 )
							ret := -1.000000 // sell
				if( BBupper > 415.521 )
					if( BBlower <= 358.404 )
						if( dif_source_BBupper <= -35.0262 )
							ret := 1.000000 // buy
						if( dif_source_BBupper > -35.0262 )
							ret := -0.718750 // sell
					if( BBlower > 358.404 )
						if( vrsi <= 96.817 )
							ret := -0.904762 // sell
						if( vrsi > 96.817 )
							ret := 0.000000
			if( BBlower > 392.419 )
				if( vrsi <= 57.2065 )
					if( dif_source_BBupper <= -8.64561 )
						if( BBupper <= 516.589 )
							ret := -0.309524
						if( BBupper > 516.589 )
							ret := -0.823529 // sell
					if( dif_source_BBupper > -8.64561 )
						if( BBlower <= 401.356 )
							ret := 0.673203
						if( BBlower > 401.356 )
							ret := 0.185714
				if( vrsi > 57.2065 )
					if( dif_source_BBupper <= -2.0687 )
						if( vrsi <= 60.3861 )
							ret := -0.882353 // sell
						if( vrsi > 60.3861 )
							ret := 0.148387
					if( dif_source_BBupper > -2.0687 )
						if( BBupper <= 482.457 )
							ret := -0.734807 // sell
						if( BBupper > 482.457 )
							ret := 0.266667
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_MDB_5Min_aa8d84c6(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

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


