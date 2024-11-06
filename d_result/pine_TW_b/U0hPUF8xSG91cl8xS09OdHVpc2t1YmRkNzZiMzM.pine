//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: SHOP_1Hour_1KON_bdd76b33 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHOP_1Hour_1KON_bdd76b33", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHOP_1Hour_bdd76b33(nvimin, azul, nvim, marron_mean, marron, nvimax, pvi, pvi_ema, oscp, verde, source, stoc, verde_mean, xrsi, media, xmf, tprice, pvimin, media_azul, verde_media, BollOsc, pvimax, nvi_ema, azul_mean, pvim, nvi, verde_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( verde_mean <= 13.6721 )
		if( pvi <= 1.02658 )
			if( tprice <= 401.127 )
				if( BollOsc <= -22.4515 )
					if( azul_mean <= -24.8601 )
						if( source <= 330.038 )
							ret := -0.504167
						if( source > 330.038 )
							ret := 0.444444
					if( azul_mean > -24.8601 )
						if( tprice <= 345.012 )
							ret := 0.070384
						if( tprice > 345.012 )
							ret := -0.544304
				if( BollOsc > -22.4515 )
					if( pvimin <= 0.986514 )
						if( nvimax <= 0.313881 )
							ret := 0.278689
						if( nvimax > 0.313881 )
							ret := -0.484472
					if( pvimin > 0.986514 )
						if( source <= 69.4869 )
							ret := 0.866667 // buy
						if( source > 69.4869 )
							ret := 0.111111
			if( tprice > 401.127 )
				if( stoc <= 22.726 )
					if( media_azul <= 44.2603 )
						if( pvimin <= 0.952264 )
							ret := 0.000000
						if( pvimin > 0.952264 )
							ret := 0.910569 // buy
					if( media_azul > 44.2603 )
						if( verde_azul <= -7.16352 )
							ret := 0.750000 // buy
						if( verde_azul > -7.16352 )
							ret := -0.409091
				if( stoc > 22.726 )
					if( nvim <= 0.324336 )
						if( tprice <= 440.907 )
							ret := -0.777778 // sell
						if( tprice > 440.907 )
							ret := -1.000000 // sell
					if( nvim > 0.324336 )
						if( azul_mean <= 5.55757 )
							ret := -0.133333
						if( azul_mean > 5.55757 )
							ret := 0.727273 // buy
		if( pvi > 1.02658 )
			if( BollOsc <= -43.2425 )
				if( nvimin <= 0.831477 )
					if( nvi_ema <= 0.836547 )
						if( nvimax <= 0.465397 )
							ret := -0.628205
						if( nvimax > 0.465397 )
							ret := -0.018817
					if( nvi_ema > 0.836547 )
						if( pvi <= 1.80164 )
							ret := -1.000000 // sell
						if( pvi > 1.80164 )
							ret := 0.000000
				if( nvimin > 0.831477 )
					if( nvi <= 0.887016 )
						if( nvimax <= 0.882759 )
							ret := 0.055556
						if( nvimax > 0.882759 )
							ret := 0.873418 // buy
					if( nvi > 0.887016 )
						if( verde_azul <= -17.2964 )
							ret := 0.360759
						if( verde_azul > -17.2964 )
							ret := -0.261745
			if( BollOsc > -43.2425 )
				if( verde_mean <= -25.5222 )
					if( xmf <= 0.909297 )
						if( azul <= -7.00721 )
							ret := -1.000000 // sell
						if( azul > -7.00721 )
							ret := -0.692308
					if( xmf > 0.909297 )
						if( azul <= -1.52859 )
							ret := 0.529412
						if( azul > -1.52859 )
							ret := -0.082569
				if( verde_mean > -25.5222 )
					if( xrsi <= 35.6093 )
						if( tprice <= 77.3488 )
							ret := 0.181818
						if( tprice > 77.3488 )
							ret := -0.559606
					if( xrsi > 35.6093 )
						if( nvimin <= 1.00996 )
							ret := -0.256677
						if( nvimin > 1.00996 )
							ret := 0.323077
	if( verde_mean > 13.6721 )
		if( nvimin <= 0.361098 )
			if( nvi <= 0.307011 )
				if( nvim <= -0.030284 )
					if( azul_mean <= -25.8674 )
						if( source <= 137.735 )
							ret := -0.250000
						if( source > 137.735 )
							ret := -1.000000 // sell
					if( azul_mean > -25.8674 )
						if( azul_mean <= 22.5622 )
							ret := 0.630952
						if( azul_mean > 22.5622 )
							ret := -0.341463
				if( nvim > -0.030284 )
					if( pvi_ema <= 1.0171 )
						if( pvim <= 0.955042 )
							ret := -0.019760
						if( pvim > 0.955042 )
							ret := 0.676190
					if( pvi_ema > 1.0171 )
						if( xrsi <= 56.0914 )
							ret := -0.661538
						if( xrsi > 56.0914 )
							ret := 0.785714 // buy
			if( nvi > 0.307011 )
				if( media_azul <= 41.6282 )
					if( media_azul <= 12.5038 )
						if( oscp <= -4.80669 )
							ret := -0.315789
						if( oscp > -4.80669 )
							ret := 0.424242
					if( media_azul > 12.5038 )
						if( xmf <= 16.0216 )
							ret := -0.916667 // sell
						if( xmf > 16.0216 )
							ret := 0.606667
				if( media_azul > 41.6282 )
					if( marron_mean <= 111.633 )
						if( xmf <= 46.3686 )
							ret := 0.285714
						if( xmf > 46.3686 )
							ret := 0.009569
					if( marron_mean > 111.633 )
						if( source <= 445.122 )
							ret := 0.190476
						if( source > 445.122 )
							ret := 0.702811 // buy
		if( nvimin > 0.361098 )
			if( tprice <= 1511.1 )
				if( verde <= 119.857 )
					if( nvim <= 0.474519 )
						if( media <= 78.8961 )
							ret := -0.075069
						if( media > 78.8961 )
							ret := -0.565574
					if( nvim > 0.474519 )
						if( oscp <= -19.5778 )
							ret := -0.374065
						if( oscp > -19.5778 )
							ret := 0.021001
				if( verde > 119.857 )
					if( BollOsc <= 36.2676 )
						if( stoc <= 91.3818 )
							ret := 0.081356
						if( stoc > 91.3818 )
							ret := -0.441860
					if( BollOsc > 36.2676 )
						if( marron <= 112.583 )
							ret := 0.340369
						if( marron > 112.583 )
							ret := 0.093055
			if( tprice > 1511.1 )
				if( pvimin <= 1.72886 )
					if( verde_media <= 50.1562 )
						if( BollOsc <= 30.7118 )
							ret := -0.702703 // sell
						if( BollOsc > 30.7118 )
							ret := -0.987013 // sell
					if( verde_media > 50.1562 )
						ret := 0.083333
				if( pvimin > 1.72886 )
					if( azul <= -10.8394 )
						if( azul_mean <= -48.4747 )
							ret := -0.055556
						if( azul_mean > -48.4747 )
							ret := -0.601626
					if( azul > -10.8394 )
						if( media <= 82.1472 )
							ret := 0.196347
						if( media > 82.1472 )
							ret := -0.315271
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Blai5_Koncorde_v10 
//@version=5
//indicator title="Koncorde v10", shorttitle="Konk_v5", overlay=false)

// Declare variables with explicit types
var float pvi = na
var float nvi = na

tprice = ohlc4
lengthEMA = input.int(255, minval=1)
m = input.int(15)
source = hlc3

// Pececillos
pvi := volume > volume[1] ? nz(pvi[1]) + (close - close[1]) / close[1] : nz(pvi[1])
pvim = ta.ema(pvi, m)
pvimax = ta.highest(pvim, 90)
pvimin = ta.lowest(pvim, 90)
oscp = (pvi - pvim) * 100 / (pvimax - pvimin)

// Tiburones
nvi := volume < volume[1] ? nz(nvi[1]) + (close - close[1]) / close[1] : nz(nvi[1])
nvim = ta.ema(nvi, m)
nvimax = ta.highest(nvim, 90)
nvimin = ta.lowest(nvim, 90)
azul = (nvi - nvim) * 100 / (nvimax - nvimin)

// // Money Flow Index
// Money Flow Index
source_positive = ta.change(source) > 0 ? source : 0
source_negative = ta.change(source) < 0 ? source : 0
upper_s = math.sum(volume * source_positive, 14)
lower_s = math.sum(volume * source_negative, 14)
// Custom Money Flow Index calculation
money_flow_ratio = upper_s / lower_s
xmf = 100 - (100 / (1 + money_flow_ratio))


// Bollinger
mult = input.float(2.0)
basis = ta.sma(tprice, 25)
dev = mult * ta.stdev(tprice, 25)
upper = basis + dev
lower = basis - dev
OB1 = (upper + lower) / 2.0
OB2 = upper - lower
BollOsc = (tprice - OB1) / OB2 * 100

xrsi = ta.rsi(tprice, 14)

// Stochastic Calculation Function
calc_stoch(src, length, smoothFastD) =>
    ll = ta.lowest(low, length)
    hh = ta.highest(high, length)
    k = 100 * (src - ll) / (hh - ll)
    ta.sma(k, smoothFastD)

stoc = calc_stoch(tprice, 21, 3)
marron = (xrsi + xmf + BollOsc + stoc / 3) / 2
verde = marron + oscp
media = ta.ema(marron, m)
bandacero = 0.0

azul_mean = ta.sma(azul, 5)
verde_mean = ta.sma(verde, 5)
marron_mean = ta.sma(marron, 5)
verde_azul = verde - azul
verde_media = verde - media
media_azul = media - azul
media_marron = media - marron
pvi_ema = pvim
nvi_ema = nvi

// PLOT
vl = plot(verde, color=color.new(#66FF66, 0), style=plot.style_area, title="verde")  // GREEN
ml = plot(marron, color=color.new(#FFCC99, 0), style=plot.style_area, title="marron")  // BEIGE
al = plot(azul, color=color.new(#00FFFF, 0), style=plot.style_area, title="azul")  // CYAN
plot(marron, color=color.new(#330000, 0), style=plot.style_line, linewidth=2, title="lmarron")  // DARK RED
plot(verde, color=color.new(#006600, 0), style=plot.style_line, linewidth=2, title="lineav")  // DARK GREEN
plot(azul, color=color.new(#000066, 0), style=plot.style_line, title="lazul")  // DARK BLUE
plot(media, color=color.new(#FF0000, 0), title="media", style=plot.style_line, linewidth=2)  // RED
plot(bandacero, color=color.new(#000000, 0), title="cero")  // BLACK

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
float op_operation = decision_tree_0_SHOP_1Hour_bdd76b33(nvimin, azul, nvim, marron_mean, marron, nvimax, pvi, pvi_ema, oscp, verde, source, stoc, verde_mean, xrsi, media, xmf, tprice, pvimin, media_azul, verde_media, BollOsc, pvimax, nvi_ema, azul_mean, pvim, nvi, verde_azul)

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


