//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: QCOM_1Min_1BOL_a0b1a5fb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Min_1BOL_a0b1a5fb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Min_a0b1a5fb(dif_source_BBupper, crossover_rsi_bblowerInt, BBupper, vrsi, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( BBlower <= 157.107 )
		if( dif_source_BBupper <= -3.52783 )
			if( BBupper <= 162.966 )
				if( dif_source_BBlower <= 2.24714 )
					if( BBlower <= 157.003 )
						if( dif_source_BBlower <= 1.48544 )
							if( dif_source_BBlower <= 0.576864 )
								ret := 0.878378 // buy
							if( dif_source_BBlower > 0.576864 )
								ret := 0.413333
						if( dif_source_BBlower > 1.48544 )
							if( dif_source_BBupper <= -3.74298 )
								ret := 0.950617 // buy
							if( dif_source_BBupper > -3.74298 )
								ret := 0.652174
					if( BBlower > 157.003 )
						ret := -0.285714
				if( dif_source_BBlower > 2.24714 )
					if( BBupper <= 162.363 )
						if( dif_source_BBlower <= 5.43122 )
							if( dif_source_BBupper <= -3.76542 )
								ret := 0.855263 // buy
							if( dif_source_BBupper > -3.76542 )
								ret := 0.222222
						if( dif_source_BBlower > 5.43122 )
							if( BBlower <= 144.363 )
								ret := -0.909091 // sell
							if( BBlower > 144.363 )
								ret := 0.480000
					if( BBupper > 162.363 )
						if( BBlower <= 145.616 )
							if( BBupper <= 162.595 )
								ret := -1.000000 // sell
							if( BBupper > 162.595 )
								ret := -0.571429
						if( BBlower > 145.616 )
							if( dif_source_BBupper <= -8.50946 )
								ret := -0.333333
							if( dif_source_BBupper > -8.50946 )
								ret := 0.500000
			if( BBupper > 162.966 )
				if( dif_source_BBupper <= -9.06166 )
					if( dif_source_BBupper <= -13.6093 )
						if( dif_source_BBlower <= 2.49383 )
							if( dif_source_BBlower <= 2.1783 )
								ret := 0.952381 // buy
							if( dif_source_BBlower > 2.1783 )
								ret := 0.600000
						if( dif_source_BBlower > 2.49383 )
							if( vrsi <= 18.1666 )
								ret := -0.888889 // sell
							if( vrsi > 18.1666 )
								ret := 0.727273 // buy
					if( dif_source_BBupper > -13.6093 )
						if( dif_source_BBlower <= -1.34541 )
							ret := 0.888889 // buy
						if( dif_source_BBlower > -1.34541 )
							if( dif_source_BBlower <= 1.89043 )
								ret := -0.405797
							if( dif_source_BBlower > 1.89043 )
								ret := -0.922078 // sell
				if( dif_source_BBupper > -9.06166 )
					if( BBlower <= 155.597 )
						if( dif_source_BBupper <= -4.38035 )
							if( BBupper <= 163.36 )
								ret := 0.428571
							if( BBupper > 163.36 )
								ret := 0.973684 // buy
						if( dif_source_BBupper > -4.38035 )
							if( vrsi <= 55.3731 )
								ret := 0.342857
							if( vrsi > 55.3731 )
								ret := 0.884615 // buy
					if( BBlower > 155.597 )
						if( dif_source_BBupper <= -8.44255 )
							if( dif_source_BBupper <= -8.69534 )
								ret := 1.000000 // buy
							if( dif_source_BBupper > -8.69534 )
								ret := 0.571429
						if( dif_source_BBupper > -8.44255 )
							if( vrsi <= 41.4729 )
								ret := 0.436364
							if( vrsi > 41.4729 )
								ret := 0.005348
		if( dif_source_BBupper > -3.52783 )
			if( dif_source_BBupper <= -2.65901 )
				if( dif_source_BBlower <= 0.708392 )
					if( BBupper <= 159.464 )
						if( dif_source_BBupper <= -2.86786 )
							ret := 1.000000 // buy
						if( dif_source_BBupper > -2.86786 )
							ret := 0.875000 // buy
					if( BBupper > 159.464 )
						ret := 0.727273 // buy
				if( dif_source_BBlower > 0.708392 )
					if( dif_source_BBlower <= 3.90492 )
						if( dif_source_BBlower <= 2.8657 )
							if( BBlower <= 155.972 )
								ret := -0.724490 // sell
							if( BBlower > 155.972 )
								ret := -0.111940
						if( dif_source_BBlower > 2.8657 )
							if( BBupper <= 162.002 )
								ret := -0.428571
							if( BBupper > 162.002 )
								ret := -0.913043 // sell
					if( dif_source_BBlower > 3.90492 )
						if( dif_source_BBlower <= 13.7754 )
							if( BBupper <= 164.508 )
								ret := 0.496000
							if( BBupper > 164.508 )
								ret := -0.142857
						if( dif_source_BBlower > 13.7754 )
							if( dif_source_BBlower <= 13.9868 )
								ret := -0.714286 // sell
							if( dif_source_BBlower > 13.9868 )
								ret := -1.000000 // sell
			if( dif_source_BBupper > -2.65901 )
				if( dif_source_BBlower <= 13.3771 )
					if( vrsi <= 83.5266 )
						if( BBupper <= 159.327 )
							if( vrsi <= 65.9317 )
								ret := 0.674699
							if( vrsi > 65.9317 )
								ret := 0.144444
						if( BBupper > 159.327 )
							if( vrsi <= 16.8848 )
								ret := -0.292683
							if( vrsi > 16.8848 )
								ret := 0.233155
					if( vrsi > 83.5266 )
						if( BBupper <= 160.834 )
							if( BBlower <= 156.491 )
								ret := -0.140845
							if( BBlower > 156.491 )
								ret := 0.545455
						if( BBupper > 160.834 )
							if( dif_source_BBupper <= -1.18277 )
								ret := -0.433333
							if( dif_source_BBupper > -1.18277 )
								ret := -0.717391 // sell
				if( dif_source_BBlower > 13.3771 )
					if( BBlower <= 145.073 )
						if( BBupper <= 160.177 )
							ret := -0.571429
						if( BBupper > 160.177 )
							ret := -0.750000 // sell
					if( BBlower > 145.073 )
						if( dif_source_BBlower <= 13.5632 )
							ret := -0.857143 // sell
						if( dif_source_BBlower > 13.5632 )
							ret := -1.000000 // sell
	if( BBlower > 157.107 )
		if( dif_source_BBupper <= -8.63397 )
			if( dif_source_BBlower <= 8.28283 )
				if( dif_source_BBupper <= -15.1199 )
					if( dif_source_BBlower <= 7.57109 )
						if( BBlower <= 171.107 )
							if( vrsi <= 0.478589 )
								ret := 0.181818
							if( vrsi > 0.478589 )
								ret := 0.776786 // buy
						if( BBlower > 171.107 )
							if( dif_source_BBlower <= 0.233901 )
								ret := 0.928571 // buy
							if( dif_source_BBlower > 0.233901 )
								ret := -0.075000
					if( dif_source_BBlower > 7.57109 )
						if( vrsi <= 37.0478 )
							if( dif_source_BBlower <= 8.05779 )
								ret := 0.720000 // buy
							if( dif_source_BBlower > 8.05779 )
								ret := -0.142857
						if( vrsi > 37.0478 )
							if( BBupper <= 195.786 )
								ret := 1.000000 // buy
							if( BBupper > 195.786 )
								ret := -0.650000
				if( dif_source_BBupper > -15.1199 )
					if( BBupper <= 231.566 )
						if( dif_source_BBlower <= -0.477543 )
							if( dif_source_BBlower <= -1.73635 )
								ret := 0.696970
							if( dif_source_BBlower > -1.73635 )
								ret := 0.201550
						if( dif_source_BBlower > -0.477543 )
							if( BBlower <= 195.534 )
								ret := -0.330626
							if( BBlower > 195.534 )
								ret := 0.019380
					if( BBupper > 231.566 )
						if( BBlower <= 218.413 )
							if( dif_source_BBupper <= -14.6419 )
								ret := -0.352941
							if( dif_source_BBupper > -14.6419 )
								ret := -0.818182 // sell
						if( BBlower > 218.413 )
							if( BBupper <= 231.705 )
								ret := -0.571429
							if( BBupper > 231.705 )
								ret := -0.942029 // sell
			if( dif_source_BBlower > 8.28283 )
				if( vrsi <= 36.12 )
					if( dif_source_BBupper <= -16.0858 )
						if( BBlower <= 169.683 )
							ret := 1.000000 // buy
						if( BBlower > 169.683 )
							ret := 0.142857
					if( dif_source_BBupper > -16.0858 )
						if( vrsi <= 10.4757 )
							ret := -0.727273 // sell
						if( vrsi > 10.4757 )
							ret := -1.000000 // sell
				if( vrsi > 36.12 )
					if( dif_source_BBlower <= 8.80091 )
						if( BBlower <= 170.454 )
							ret := -0.545455
						if( BBlower > 170.454 )
							if( vrsi <= 54.0366 )
								ret := -0.857143 // sell
							if( vrsi > 54.0366 )
								ret := -1.000000 // sell
					if( dif_source_BBlower > 8.80091 )
						ret := -1.000000 // sell
		if( dif_source_BBupper > -8.63397 )
			if( vrsi <= 52.1369 )
				if( BBupper <= 230.268 )
					if( BBlower <= 170.892 )
						if( BBlower <= 161.023 )
							if( BBlower <= 159.784 )
								ret := 0.053636
							if( BBlower > 159.784 )
								ret := -0.154135
						if( BBlower > 161.023 )
							if( dif_source_BBlower <= 1.07122 )
								ret := 0.164397
							if( dif_source_BBlower > 1.07122 )
								ret := 0.078538
					if( BBlower > 170.892 )
						if( BBlower <= 177.337 )
							if( dif_source_BBlower <= 4.36834 )
								ret := -0.017085
							if( dif_source_BBlower > 4.36834 )
								ret := -0.604651
						if( BBlower > 177.337 )
							if( BBlower <= 202.703 )
								ret := 0.089569
							if( BBlower > 202.703 )
								ret := 0.011840
				if( BBupper > 230.268 )
					if( vrsi <= 47.1152 )
						if( dif_source_BBupper <= -1.53774 )
							if( dif_source_BBlower <= 0.539905 )
								ret := 0.060606
							if( dif_source_BBlower > 0.539905 )
								ret := 0.711538 // buy
						if( dif_source_BBupper > -1.53774 )
							if( vrsi <= 32.3099 )
								ret := -0.833333 // sell
							if( vrsi > 32.3099 )
								ret := -0.181818
					if( vrsi > 47.1152 )
						if( dif_source_BBupper <= -1.99032 )
							if( dif_source_BBupper <= -2.96566 )
								ret := -0.636364
							if( dif_source_BBupper > -2.96566 )
								ret := -0.866667 // sell
						if( dif_source_BBupper > -1.99032 )
							if( dif_source_BBlower <= 1.97126 )
								ret := 0.500000
							if( dif_source_BBlower > 1.97126 )
								ret := -0.142857
			if( vrsi > 52.1369 )
				if( dif_source_BBupper <= 0.234037 )
					if( dif_source_BBlower <= 10.2601 )
						if( BBlower <= 160.562 )
							if( dif_source_BBupper <= -6.48014 )
								ret := 0.675000
							if( dif_source_BBupper > -6.48014 )
								ret := -0.072903
						if( BBlower > 160.562 )
							if( BBupper <= 165.32 )
								ret := 0.214167
							if( BBupper > 165.32 )
								ret := 0.034834
					if( dif_source_BBlower > 10.2601 )
						if( BBlower <= 168.396 )
							if( dif_source_BBlower <= 25.1963 )
								ret := -1.000000 // sell
							if( dif_source_BBlower > 25.1963 )
								ret := -0.714286 // sell
						if( BBlower > 168.396 )
							if( BBlower <= 199.574 )
								ret := -0.097561
							if( BBlower > 199.574 )
								ret := -0.633333
				if( dif_source_BBupper > 0.234037 )
					if( BBupper <= 165.198 )
						if( BBlower <= 162.595 )
							if( BBlower <= 161.97 )
								ret := -0.436364
							if( BBlower > 161.97 )
								ret := -0.860465 // sell
						if( BBlower > 162.595 )
							ret := 0.153846
					if( BBupper > 165.198 )
						if( BBlower <= 205.911 )
							if( vrsi <= 92.0337 )
								ret := 0.050875
							if( vrsi > 92.0337 )
								ret := -0.185682
						if( BBlower > 205.911 )
							if( BBlower <= 215.746 )
								ret := -0.431973
							if( BBlower > 215.746 )
								ret := 0.136842
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_QCOM_1Min_a0b1a5fb(dif_source_BBupper, crossover_rsi_bblowerInt, BBupper, vrsi, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower)

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


