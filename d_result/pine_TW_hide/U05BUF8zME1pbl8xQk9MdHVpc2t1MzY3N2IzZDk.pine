//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: SNAP_30Min_1BOL_3677b3d9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_30Min_1BOL_3677b3d9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_30Min_3677b3d9(crossunder_rsi_bbupperInt, BBlower, dif_source_BBlower, dif_source_BBupper, vrsi, BBupper, crossover_rsi_bblowerInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( vrsi <= 58.3529 )
		if( dif_source_BBlower <= 0.29774 )
			if( vrsi <= 0.372341 )
				if( BBlower <= 10.844 )
					if( dif_source_BBlower <= 0.210107 )
						if( dif_source_BBupper <= -1.32494 )
							ret := 0.701493 // buy
						if( dif_source_BBupper > -1.32494 )
							ret := 0.390244
					if( dif_source_BBlower > 0.210107 )
						if( dif_source_BBlower <= 0.274254 )
							ret := 0.962963 // buy
						if( dif_source_BBlower > 0.274254 )
							ret := 0.769231 // buy
				if( BBlower > 10.844 )
					if( dif_source_BBupper <= -0.717227 )
						if( dif_source_BBupper <= -2.22978 )
							ret := -0.135922
						if( dif_source_BBupper > -2.22978 )
							ret := 0.406452
					if( dif_source_BBupper > -0.717227 )
						if( dif_source_BBlower <= 0.106187 )
							ret := -0.925926 // sell
						if( dif_source_BBlower > 0.106187 )
							ret := -0.300000
			if( vrsi > 0.372341 )
				if( dif_source_BBlower <= -3.01408 )
					if( vrsi <= 5.32162 )
						if( dif_source_BBupper <= -6.04196 )
							ret := 0.896552 // buy
						if( dif_source_BBupper > -6.04196 )
							ret := -1.000000 // sell
					if( vrsi > 5.32162 )
						if( vrsi <= 11.2667 )
							ret := -0.294118
						if( vrsi > 11.2667 )
							ret := -0.903614 // sell
				if( dif_source_BBlower > -3.01408 )
					if( dif_source_BBupper <= -15.3429 )
						if( vrsi <= 51.7903 )
							ret := 0.828571 // buy
						if( vrsi > 51.7903 )
							ret := 0.000000
					if( dif_source_BBupper > -15.3429 )
						if( BBlower <= 5.10321 )
							ret := 0.862069 // buy
						if( BBlower > 5.10321 )
							ret := -0.028667
		if( dif_source_BBlower > 0.29774 )
			if( BBupper <= 24.8148 )
				if( vrsi <= 47.2111 )
					if( BBlower <= 6.25993 )
						if( dif_source_BBupper <= -0.313553 )
							ret := 0.521825
						if( dif_source_BBupper > -0.313553 )
							ret := 0.075893
					if( BBlower > 6.25993 )
						if( BBlower <= 18.7313 )
							ret := 0.096801
						if( BBlower > 18.7313 )
							ret := 0.256299
				if( vrsi > 47.2111 )
					if( BBupper <= 6.24589 )
						if( BBlower <= 4.8131 )
							ret := -1.000000 // sell
						if( BBlower > 4.8131 )
							ret := -0.520000
					if( BBupper > 6.24589 )
						if( BBlower <= 21.8357 )
							ret := 0.033660
						if( BBlower > 21.8357 )
							ret := 0.681319
			if( BBupper > 24.8148 )
				if( BBlower <= 17.7834 )
					if( dif_source_BBlower <= 5.39295 )
						if( BBupper <= 29.2062 )
							ret := 0.772152 // buy
						if( BBupper > 29.2062 )
							ret := 0.153846
					if( dif_source_BBlower > 5.39295 )
						if( vrsi <= 39.5833 )
							ret := 0.545455
						if( vrsi > 39.5833 )
							ret := -0.222222
				if( BBlower > 17.7834 )
					if( vrsi <= 10.5143 )
						if( dif_source_BBlower <= 7.12584 )
							ret := 0.141522
						if( dif_source_BBlower > 7.12584 )
							ret := 0.604396
					if( vrsi > 10.5143 )
						if( BBupper <= 26.2672 )
							ret := -0.250943
						if( BBupper > 26.2672 )
							ret := -0.004162
	if( vrsi > 58.3529 )
		if( BBlower <= 38.0727 )
			if( BBupper <= 15.0942 )
				if( BBlower <= 11.506 )
					if( dif_source_BBlower <= 2.76323 )
						if( dif_source_BBupper <= -4.41208 )
							ret := 0.768293 // buy
						if( dif_source_BBupper > -4.41208 )
							ret := -0.063855
					if( dif_source_BBlower > 2.76323 )
						if( dif_source_BBupper <= 0.181064 )
							ret := -0.338308
						if( dif_source_BBupper > 0.181064 )
							ret := -0.722222 // sell
				if( BBlower > 11.506 )
					if( dif_source_BBlower <= 1.84211 )
						if( dif_source_BBupper <= -1.18999 )
							ret := 0.276276
						if( dif_source_BBupper > -1.18999 )
							ret := 0.012550
					if( dif_source_BBlower > 1.84211 )
						if( dif_source_BBupper <= -0.194335 )
							ret := 0.616883
						if( dif_source_BBupper > -0.194335 )
							ret := 0.113725
			if( BBupper > 15.0942 )
				if( vrsi <= 68.548 )
					if( BBlower <= 18.4896 )
						if( vrsi <= 58.9036 )
							ret := -0.490196
						if( vrsi > 58.9036 )
							ret := -0.095858
					if( BBlower > 18.4896 )
						if( BBupper <= 21.2033 )
							ret := 0.745455 // buy
						if( BBupper > 21.2033 )
							ret := 0.019481
				if( vrsi > 68.548 )
					if( dif_source_BBlower <= 2.70919 )
						if( BBupper <= 30.2207 )
							ret := -0.191429
						if( BBupper > 30.2207 )
							ret := -0.512195
					if( dif_source_BBlower > 2.70919 )
						if( BBupper <= 43.9978 )
							ret := -0.022697
						if( BBupper > 43.9978 )
							ret := -0.475309
		if( BBlower > 38.0727 )
			if( BBupper <= 44.0647 )
				if( BBlower <= 39.2655 )
					if( dif_source_BBupper <= -1.15774 )
						if( dif_source_BBupper <= -1.67109 )
							ret := 0.354839
						if( dif_source_BBupper > -1.67109 )
							ret := -0.705882 // sell
					if( dif_source_BBupper > -1.15774 )
						if( BBlower <= 39.191 )
							ret := 0.755556 // buy
						if( BBlower > 39.191 )
							ret := 0.100000
				if( BBlower > 39.2655 )
					ret := 1.000000 // buy
			if( BBupper > 44.0647 )
				if( BBlower <= 54.1927 )
					if( BBupper <= 57.6061 )
						if( dif_source_BBupper <= 0.712607 )
							ret := -0.041980
						if( dif_source_BBupper > 0.712607 )
							ret := -0.643678
					if( BBupper > 57.6061 )
						if( dif_source_BBlower <= 10.5032 )
							ret := 0.420635
						if( dif_source_BBlower > 10.5032 )
							ret := -0.055556
				if( BBlower > 54.1927 )
					if( vrsi <= 78.6538 )
						if( BBupper <= 63.8029 )
							ret := 0.452632
						if( BBupper > 63.8029 )
							ret := -0.044843
					if( vrsi > 78.6538 )
						if( BBlower <= 59.1796 )
							ret := -0.521127
						if( BBlower > 59.1796 )
							ret := -0.071138
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_SNAP_30Min_3677b3d9(crossunder_rsi_bbupperInt, BBlower, dif_source_BBlower, dif_source_BBupper, vrsi, BBupper, crossover_rsi_bblowerInt)

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


