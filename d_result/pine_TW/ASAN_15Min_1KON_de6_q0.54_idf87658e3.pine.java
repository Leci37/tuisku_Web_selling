//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: ASAN_15Min_1KON_f87658e3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ASAN_15Min_1KON_f87658e3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ASAN_15Min_f87658e3(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6,max_features=sqrt, min_samples_split=10,random_state=843828734)
	if( azul_mean <= 1.78683 )
		if( pvimin <= 0.296507 )
			if( media <= 97.3766 )
				if( media_azul <= 157.396 )
					if( stoc <= 3.79941 )
						if( oscp <= -10.448 )
							ret := 0.315217
						if( oscp > -10.448 )
							ret := 0.712871 // buy
					if( stoc > 3.79941 )
						if( source <= 51.0695 )
							ret := 0.043764
						if( source > 51.0695 )
							ret := 0.570312
				if( media_azul > 157.396 )
					if( azul_mean <= -78.9388 )
						if( nvimax <= 0.44319 )
							ret := 1.000000 // buy
						if( nvimax > 0.44319 )
							ret := -0.333333
					if( azul_mean > -78.9388 )
						if( stoc <= 76.0018 )
							ret := 0.882353 // buy
						if( stoc > 76.0018 )
							ret := -0.500000
			if( media > 97.3766 )
				if( source <= 16.404 )
					if( marron <= 100.666 )
						if( pvimax <= 0.078551 )
							ret := 0.777778 // buy
						if( pvimax > 0.078551 )
							ret := 0.094340
					if( marron > 100.666 )
						if( verde <= 121.084 )
							ret := -0.071429
						if( verde > 121.084 )
							ret := -0.604167
				if( source > 16.404 )
					if( xrsi <= 80.2263 )
						if( verde_mean <= 126.238 )
							ret := 0.236515
						if( verde_mean > 126.238 )
							ret := 0.623563
					if( xrsi > 80.2263 )
						if( xmf <= 81.9148 )
							ret := 0.500000
						if( xmf > 81.9148 )
							ret := -0.655172
		if( pvimin > 0.296507 )
			if( azul <= -12.0067 )
				if( BollOsc <= -42.5133 )
					if( verde_azul <= -32.7731 )
						if( pvi_ema <= 0.539138 )
							ret := -0.194030
						if( pvi_ema > 0.539138 )
							ret := -0.784810 // sell
					if( verde_azul > -32.7731 )
						if( oscp <= 19.9297 )
							ret := 0.000736
						if( oscp > 19.9297 )
							ret := -0.763158 // sell
				if( BollOsc > -42.5133 )
					if( verde_mean <= 79.3341 )
						if( verde_media <= 34.4194 )
							ret := 0.253467
						if( verde_media > 34.4194 )
							ret := -0.302564
					if( verde_mean > 79.3341 )
						if( media_azul <= 133.945 )
							ret := -0.053707
						if( media_azul > 133.945 )
							ret := 0.386364
			if( azul > -12.0067 )
				if( verde_media <= 92.1627 )
					if( BollOsc <= -1.78455 )
						if( marron_mean <= 7.2238 )
							ret := -0.190551
						if( marron_mean > 7.2238 )
							ret := 0.014603
					if( BollOsc > -1.78455 )
						if( xrsi <= 52.8974 )
							ret := -0.306569
						if( xrsi > 52.8974 )
							ret := -0.058750
				if( verde_media > 92.1627 )
					if( verde <= 208.198 )
						if( verde_mean <= 91.1848 )
							ret := -0.189655
						if( verde_mean > 91.1848 )
							ret := 0.741379 // buy
					if( verde > 208.198 )
						if( tprice <= 21.9812 )
							ret := 0.300000
						if( tprice > 21.9812 )
							ret := -0.888889 // sell
	if( azul_mean > 1.78683 )
		if( BollOsc <= 5.72657 )
			if( source <= 132.682 )
				if( media_azul <= 31.5832 )
					if( pvimax <= -0.134771 )
						if( verde <= 25.782 )
							ret := 0.773333 // buy
						if( verde > 25.782 )
							ret := 0.078431
					if( pvimax > -0.134771 )
						if( nvimin <= 0.991878 )
							ret := -0.040389
						if( nvimin > 0.991878 )
							ret := 0.426901
				if( media_azul > 31.5832 )
					if( verde_mean <= -6.78378 )
						if( verde_media <= -76.1988 )
							ret := 0.281690
						if( verde_media > -76.1988 )
							ret := -0.455357
					if( verde_mean > -6.78378 )
						if( pvimin <= 0.099715 )
							ret := 0.228479
						if( pvimin > 0.099715 )
							ret := 0.101336
			if( source > 132.682 )
				if( marron_mean <= 66.451 )
					if( pvimax <= 0.806554 )
						if( nvi <= 1.15749 )
							ret := 0.285714
						if( nvi > 1.15749 )
							ret := -0.800000 // sell
					if( pvimax > 0.806554 )
						if( verde_mean <= 53.4794 )
							ret := -0.968750 // sell
						if( verde_mean > 53.4794 )
							ret := 0.000000
				if( marron_mean > 66.451 )
					ret := 0.428571
		if( BollOsc > 5.72657 )
			if( media <= 68.2904 )
				if( media_azul <= 21.6222 )
					if( verde_mean <= 94.9235 )
						if( azul <= 7.58617 )
							ret := 0.636364
						if( azul > 7.58617 )
							ret := -0.486778
					if( verde_mean > 94.9235 )
						if( pvi <= 0.12238 )
							ret := 0.761905 // buy
						if( pvi > 0.12238 )
							ret := -0.076923
				if( media_azul > 21.6222 )
					if( nvimax <= 1.1696 )
						if( nvimin <= 0.874079 )
							ret := -0.161302
						if( nvimin > 0.874079 )
							ret := -0.591304
					if( nvimax > 1.1696 )
						if( xrsi <= 57.0638 )
							ret := 0.733333 // buy
						if( xrsi > 57.0638 )
							ret := -0.461538
			if( media > 68.2904 )
				if( pvim <= 0.766783 )
					if( oscp <= -20.2675 )
						if( verde_mean <= 26.0545 )
							ret := -0.642857
						if( verde_mean > 26.0545 )
							ret := 0.371336
					if( oscp > -20.2675 )
						if( verde_azul <= 115.102 )
							ret := -0.029939
						if( verde_azul > 115.102 )
							ret := -0.166968
				if( pvim > 0.766783 )
					if( media_azul <= 103.803 )
						if( media_azul <= 80.5261 )
							ret := -0.141361
						if( media_azul > 80.5261 )
							ret := -0.438356
					if( media_azul > 103.803 )
						if( media <= 117.828 )
							ret := 0.452381
						if( media > 117.828 )
							ret := -0.818182 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_ASAN_15Min_f87658e3(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


