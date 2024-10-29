//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: ETHUSDT_30Min_1KON_625f6c9f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_30Min_1KON_625f6c9f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_30Min_625f6c9f(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( nvimin <= 4.49911 )
		if( verde_media <= 90.5594 )
			if( oscp <= 1.17725 )
				if( source <= 1770.43 )
					if( nvimin <= 0.655745 )
						if( oscp <= -40.1947 )
							if( nvimin <= 0.131975 )
								ret := -0.581395
							if( nvimin > 0.131975 )
								ret := 0.030303
						if( oscp > -40.1947 )
							if( azul_mean <= 63.1821 )
								ret := 0.132111
							if( azul_mean > 63.1821 )
								ret := -0.782609 // sell
					if( nvimin > 0.655745 )
						if( source <= 728.84 )
							if( pvimax <= -0.146038 )
								ret := -0.062500
							if( pvimax > -0.146038 )
								ret := 0.806250 // buy
						if( source > 728.84 )
							if( tprice <= 1719.23 )
								ret := 0.235515
							if( tprice > 1719.23 )
								ret := 0.536926
				if( source > 1770.43 )
					if( media_azul <= 54.7458 )
						if( azul_mean <= -7.36192 )
							if( xrsi <= 23.487 )
								ret := 0.174888
							if( xrsi > 23.487 )
								ret := -0.295903
						if( azul_mean > -7.36192 )
							if( pvimax <= -0.549435 )
								ret := 0.105564
							if( pvimax > -0.549435 )
								ret := -0.095420
					if( media_azul > 54.7458 )
						if( nvi_ema <= 3.54536 )
							if( nvi_ema <= 1.75643 )
								ret := -0.448276
							if( nvi_ema > 1.75643 )
								ret := 0.404975
						if( nvi_ema > 3.54536 )
							if( nvimin <= 3.54542 )
								ret := -0.237569
							if( nvimin > 3.54542 )
								ret := 0.119956
			if( oscp > 1.17725 )
				if( pvimin <= -0.028876 )
					if( BollOsc <= -4.29211 )
						if( xrsi <= 41.3051 )
							if( source <= 3119.56 )
								ret := -0.050000
							if( source > 3119.56 )
								ret := 0.705882 // buy
						if( xrsi > 41.3051 )
							if( tprice <= 2508.22 )
								ret := -0.124521
							if( tprice > 2508.22 )
								ret := -0.437500
					if( BollOsc > -4.29211 )
						if( source <= 340.595 )
							if( xrsi <= 51.2703 )
								ret := 0.571429
							if( xrsi > 51.2703 )
								ret := 0.934783 // buy
						if( source > 340.595 )
							if( azul_mean <= 4.6131 )
								ret := 0.031757
							if( azul_mean > 4.6131 )
								ret := 0.144782
				if( pvimin > -0.028876 )
					if( verde_media <= 24.7639 )
						if( nvi_ema <= 0.410056 )
							ret := 0.461538
						if( nvi_ema > 0.410056 )
							if( oscp <= 20.579 )
								ret := -0.551282
							if( oscp > 20.579 )
								ret := 0.461538
					if( verde_media > 24.7639 )
						if( pvi_ema <= 0.320644 )
							if( nvim <= 1.70787 )
								ret := -0.419580
							if( nvim > 1.70787 )
								ret := 0.096774
						if( pvi_ema > 0.320644 )
							if( stoc <= 88.5883 )
								ret := 0.644068
							if( stoc > 88.5883 )
								ret := -0.750000 // sell
		if( verde_media > 90.5594 )
			if( marron_mean <= 135.433 )
				if( media <= 72.2627 )
					if( oscp <= 105.286 )
						if( tprice <= 3572.36 )
							if( azul_mean <= 24.0397 )
								ret := 0.918367 // buy
							if( azul_mean > 24.0397 )
								ret := 0.545455
						if( tprice > 3572.36 )
							ret := 0.111111
					if( oscp > 105.286 )
						ret := 0.000000
				if( media > 72.2627 )
					if( nvim <= 0.36437 )
						if( azul <= 21.7105 )
							if( verde_azul <= 179.785 )
								ret := 0.571429
							if( verde_azul > 179.785 )
								ret := 0.000000
						if( azul > 21.7105 )
							ret := -0.636364
					if( nvim > 0.36437 )
						if( oscp <= 41.8487 )
							ret := -0.571429
						if( oscp > 41.8487 )
							if( azul_mean <= -13.0521 )
								ret := -0.200000
							if( azul_mean > -13.0521 )
								ret := 0.649351
			if( marron_mean > 135.433 )
				ret := -0.888889 // sell
	if( nvimin > 4.49911 )
		if( tprice <= 4203.56 )
			if( nvimin <= 4.5367 )
				if( nvimin <= 4.49919 )
					if( azul_mean <= 0.028472 )
						ret := 0.181818
					if( azul_mean > 0.028472 )
						if( pvi <= -1.45695 )
							if( media_azul <= 36.8618 )
								ret := -0.714286 // sell
							if( media_azul > 36.8618 )
								ret := -1.000000 // sell
						if( pvi > -1.45695 )
							ret := -0.285714
				if( nvimin > 4.49919 )
					if( media_azul <= 29.5651 )
						if( xrsi <= 51.117 )
							if( verde_mean <= -13.654 )
								ret := 0.439024
							if( verde_mean > -13.654 )
								ret := -0.284091
						if( xrsi > 51.117 )
							ret := 0.923077 // buy
					if( media_azul > 29.5651 )
						if( xmf <= 61.8904 )
							if( pvimin <= -1.56794 )
								ret := 0.319588
							if( pvimin > -1.56794 )
								ret := 0.651822
						if( xmf > 61.8904 )
							if( pvi <= -1.92022 )
								ret := 0.600000
							if( pvi > -1.92022 )
								ret := -0.095238
			if( nvimin > 4.5367 )
				if( source <= 3509.72 )
					if( xrsi <= 52.6303 )
						if( tprice <= 1061.04 )
							if( nvimax <= 4.97098 )
								ret := 0.064815
							if( nvimax > 4.97098 )
								ret := 0.680000
						if( tprice > 1061.04 )
							if( azul <= -58.1025 )
								ret := 0.258523
							if( azul > -58.1025 )
								ret := -0.000648
					if( xrsi > 52.6303 )
						if( media_azul <= 69.7636 )
							if( BollOsc <= 16.9448 )
								ret := 0.003333
							if( BollOsc > 16.9448 )
								ret := 0.154650
						if( media_azul > 69.7636 )
							if( verde_azul <= 256.08 )
								ret := 0.024256
							if( verde_azul > 256.08 )
								ret := 0.547368
				if( source > 3509.72 )
					if( tprice <= 3637.14 )
						if( verde <= 161.781 )
							if( tprice <= 3595.5 )
								ret := -0.155458
							if( tprice > 3595.5 )
								ret := -0.537906
						if( verde > 161.781 )
							if( tprice <= 3592.8 )
								ret := 0.911765 // buy
							if( tprice > 3592.8 )
								ret := 0.200000
					if( tprice > 3637.14 )
						if( tprice <= 3773.66 )
							if( marron_mean <= 7.32237 )
								ret := 0.742857 // buy
							if( marron_mean > 7.32237 )
								ret := 0.088077
						if( tprice > 3773.66 )
							if( verde_mean <= 117.414 )
								ret := -0.132325
							if( verde_mean > 117.414 )
								ret := 0.178914
		if( tprice > 4203.56 )
			if( xrsi <= 30.8438 )
				if( azul <= 36.1306 )
					if( marron_mean <= 26.0035 )
						if( pvi_ema <= -1.37362 )
							if( verde_mean <= -23.6834 )
								ret := -0.666667
							if( verde_mean > -23.6834 )
								ret := -0.948718 // sell
						if( pvi_ema > -1.37362 )
							if( nvi <= 4.52653 )
								ret := -0.142857
							if( nvi > 4.52653 )
								ret := -0.666667
					if( marron_mean > 26.0035 )
						ret := 0.428571
				if( azul > 36.1306 )
					ret := 0.307692
			if( xrsi > 30.8438 )
				if( media <= 34.0602 )
					if( pvi <= -1.37062 )
						if( marron <= 13.0299 )
							ret := -0.428571
						if( marron > 13.0299 )
							if( azul <= -7.31931 )
								ret := 0.200000
							if( azul > -7.31931 )
								ret := 0.797297 // buy
					if( pvi > -1.37062 )
						ret := -0.555556
				if( media > 34.0602 )
					if( nvim <= 4.51028 )
						if( verde_media <= 43.8341 )
							if( azul_mean <= -4.65938 )
								ret := -0.970588 // sell
							if( azul_mean > -4.65938 )
								ret := -0.214286
						if( verde_media > 43.8341 )
							if( stoc <= 80.1409 )
								ret := 0.750000 // buy
							if( stoc > 80.1409 )
								ret := -0.307692
					if( nvim > 4.51028 )
						if( xmf <= 39.3929 )
							if( pvimin <= -1.50419 )
								ret := 0.557377
							if( pvimin > -1.50419 )
								ret := -0.089744
						if( xmf > 39.3929 )
							if( verde_mean <= 133.407 )
								ret := -0.265018
							if( verde_mean > 133.407 )
								ret := 0.410256
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_ETHUSDT_30Min_625f6c9f(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


