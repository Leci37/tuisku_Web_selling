//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: SNOW_5Min_1KON_db75467f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_5Min_1KON_db75467f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_5Min_db75467f(nvimin, azul, nvim, marron_mean, marron, nvimax, pvi, pvi_ema, oscp, verde, source, stoc, verde_mean, xrsi, media, xmf, tprice, pvimin, media_azul, verde_media, BollOsc, pvimax, nvi_ema, azul_mean, pvim, nvi, verde_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( BollOsc <= 22.145 )
		if( source <= 111.035 )
			if( media_azul <= 48.9457 )
				if( nvimax <= -0.005334 )
					if( pvimin <= -0.015396 )
						if( media <= 39.1521 )
							ret := 0.943396 // buy
						if( media > 39.1521 )
							ret := 0.638889
					if( pvimin > -0.015396 )
						if( nvi <= -0.040312 )
							ret := 0.692308
						if( nvi > -0.040312 )
							ret := 0.066667
				if( nvimax > -0.005334 )
					if( stoc <= 53.7737 )
						if( marron_mean <= 1.12004 )
							ret := -0.666667
						if( marron_mean > 1.12004 )
							ret := 0.409091
					if( stoc > 53.7737 )
						if( media <= 39.8777 )
							ret := 0.031250
						if( media > 39.8777 )
							ret := -0.625000
			if( media_azul > 48.9457 )
				if( pvimin <= -0.016272 )
					if( pvimin <= -0.030421 )
						if( pvim <= -0.126246 )
							ret := 0.863636 // buy
						if( pvim > -0.126246 )
							ret := 0.029091
					if( pvimin > -0.030421 )
						if( stoc <= 70.2982 )
							ret := -0.690909
						if( stoc > 70.2982 )
							ret := 0.375000
				if( pvimin > -0.016272 )
					if( stoc <= 61.9532 )
						if( stoc <= 25.6779 )
							ret := 0.739130 // buy
						if( stoc > 25.6779 )
							ret := -0.080000
					if( stoc > 61.9532 )
						ret := 0.800000 // buy
		if( source > 111.035 )
			if( azul <= -6.60693 )
				if( pvimax <= 0.810981 )
					if( source <= 195.337 )
						if( nvimin <= -0.079733 )
							ret := 0.055935
						if( nvimin > -0.079733 )
							ret := 0.140802
					if( source > 195.337 )
						if( BollOsc <= -66.7106 )
							ret := -0.653595
						if( BollOsc > -66.7106 )
							ret := -0.042813
				if( pvimax > 0.810981 )
					if( media <= 37.063 )
						if( marron <= -4.34428 )
							ret := -0.111111
						if( marron > -4.34428 )
							ret := 0.847328 // buy
					if( media > 37.063 )
						if( verde_azul <= 96.5444 )
							ret := -0.066298
						if( verde_azul > 96.5444 )
							ret := 0.693878
			if( azul > -6.60693 )
				if( azul_mean <= 73.1913 )
					if( xrsi <= 15.8587 )
						if( marron_mean <= -1.18172 )
							ret := -0.758621 // sell
						if( marron_mean > -1.18172 )
							ret := -0.137931
					if( xrsi > 15.8587 )
						if( source <= 136.725 )
							ret := -0.080986
						if( source > 136.725 )
							ret := 0.018096
				if( azul_mean > 73.1913 )
					if( azul_mean <= 117.49 )
						if( nvim <= -0.076005 )
							ret := 0.833333 // buy
						if( nvim > -0.076005 )
							ret := 0.071429
					if( azul_mean > 117.49 )
						ret := -0.538462
	if( BollOsc > 22.145 )
		if( azul <= -34.8168 )
			if( oscp <= 90.2682 )
				if( verde_media <= 37.0491 )
					if( media <= 91.9193 )
						if( verde_media <= 24.4062 )
							ret := 0.837838 // buy
						if( verde_media > 24.4062 )
							ret := 0.027778
					if( media > 91.9193 )
						if( tprice <= 156.754 )
							ret := -0.711538 // sell
						if( tprice > 156.754 )
							ret := -0.027523
				if( verde_media > 37.0491 )
					if( source <= 167.991 )
						if( source <= 142.022 )
							ret := 0.112500
						if( source > 142.022 )
							ret := 0.809836 // buy
					if( source > 167.991 )
						if( nvimin <= -0.22939 )
							ret := -0.846154 // sell
						if( nvimin > -0.22939 )
							ret := 0.189189
			if( oscp > 90.2682 )
				if( azul_mean <= -34.7487 )
					if( stoc <= 66.8388 )
						ret := -0.600000
					if( stoc > 66.8388 )
						ret := -0.083333
				if( azul_mean > -34.7487 )
					if( azul_mean <= -10.3043 )
						ret := -1.000000 // sell
					if( azul_mean > -10.3043 )
						ret := -0.571429
		if( azul > -34.8168 )
			if( pvim <= 0.809138 )
				if( BollOsc <= 40.2568 )
					if( verde_media <= 18.0258 )
						if( media <= 101.166 )
							ret := -0.058673
						if( media > 101.166 )
							ret := -0.311966
					if( verde_media > 18.0258 )
						if( marron <= 109.823 )
							ret := 0.012953
						if( marron > 109.823 )
							ret := 0.325052
				if( BollOsc > 40.2568 )
					if( oscp <= 20.7853 )
						if( source <= 227.926 )
							ret := -0.216585
						if( source > 227.926 )
							ret := 0.547368
					if( oscp > 20.7853 )
						if( azul_mean <= 11.0275 )
							ret := -0.126655
						if( azul_mean > 11.0275 )
							ret := 0.105233
			if( pvim > 0.809138 )
				if( nvim <= -0.228246 )
					if( oscp <= -3.01958 )
						ret := 0.533333
					if( oscp > -3.01958 )
						if( BollOsc <= 49.8289 )
							ret := -0.163636
						if( BollOsc > 49.8289 )
							ret := -0.928571 // sell
				if( nvim > -0.228246 )
					if( media <= 109.593 )
						if( media <= 68.9366 )
							ret := 0.090909
						if( media > 68.9366 )
							ret := -0.893130 // sell
					if( media > 109.593 )
						ret := -0.095238
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_SNOW_5Min_db75467f(nvimin, azul, nvim, marron_mean, marron, nvimax, pvi, pvi_ema, oscp, verde, source, stoc, verde_mean, xrsi, media, xmf, tprice, pvimin, media_azul, verde_media, BollOsc, pvimax, nvi_ema, azul_mean, pvim, nvi, verde_azul)

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


