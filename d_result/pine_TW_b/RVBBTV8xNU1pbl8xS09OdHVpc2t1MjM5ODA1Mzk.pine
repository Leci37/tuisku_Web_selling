//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: EPAM_15Min_1KON_23980539 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_EPAM_15Min_1KON_23980539", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_EPAM_15Min_23980539(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( pvimax <= 1.66117 )
		if( nvimax <= 2.26412 )
			if( marron <= -6.02647 )
				if( verde_mean <= -35.1977 )
					if( xmf <= 15.4742 )
						if( pvi <= 1.12206 )
							if( verde <= -35.2928 )
								ret := 0.808889 // buy
							if( verde > -35.2928 )
								ret := 0.187500
						if( pvi > 1.12206 )
							if( media <= 12.7339 )
								ret := 0.500000
							if( media > 12.7339 )
								ret := -0.157895
					if( xmf > 15.4742 )
						if( media <= 40.6708 )
							if( xrsi <= 20.1121 )
								ret := 0.412500
							if( xrsi > 20.1121 )
								ret := -0.225806
						if( media > 40.6708 )
							ret := -0.700000 // sell
				if( verde_mean > -35.1977 )
					if( xmf <= 44.2891 )
						if( media_azul <= 21.5391 )
							if( pvi <= 1.32765 )
								ret := 0.662500
							if( pvi > 1.32765 )
								ret := -0.214286
						if( media_azul > 21.5391 )
							if( pvi <= 1.22856 )
								ret := -0.026273
							if( pvi > 1.22856 )
								ret := 0.452381
					if( xmf > 44.2891 )
						if( pvim <= 1.29017 )
							if( media <= 60.6621 )
								ret := 1.000000 // buy
							if( media > 60.6621 )
								ret := 0.714286 // buy
						if( pvim > 1.29017 )
							ret := 0.428571
			if( marron > -6.02647 )
				if( media_azul <= 163.427 )
					if( pvimin <= 0.028138 )
						if( nvim <= 2.20098 )
							if( nvimax <= 1.93985 )
								ret := 0.169538
							if( nvimax > 1.93985 )
								ret := -0.124113
						if( nvim > 2.20098 )
							if( stoc <= 85.0431 )
								ret := 0.630631
							if( stoc > 85.0431 )
								ret := -0.210526
					if( pvimin > 0.028138 )
						if( azul <= 128.604 )
							if( marron_mean <= 42.9393 )
								ret := 0.022260
							if( marron_mean > 42.9393 )
								ret := 0.062471
						if( azul > 128.604 )
							if( nvim <= 0.276021 )
								ret := -0.400000
							if( nvim > 0.276021 )
								ret := -0.852941 // sell
				if( media_azul > 163.427 )
					if( tprice <= 74.9469 )
						if( stoc <= 47.0525 )
							ret := 0.000000
						if( stoc > 47.0525 )
							ret := -0.916667 // sell
					if( tprice > 74.9469 )
						if( azul <= -121.614 )
							if( source <= 264.134 )
								ret := 0.705882 // buy
							if( source > 264.134 )
								ret := -0.214286
						if( azul > -121.614 )
							if( nvi_ema <= 0.418224 )
								ret := 0.391304
							if( nvi_ema > 0.418224 )
								ret := 0.901408 // buy
		if( nvimax > 2.26412 )
			if( pvimax <= 0.127978 )
				if( source <= 456.043 )
					if( nvi_ema <= 2.24874 )
						if( tprice <= 435.087 )
							if( source <= 428.115 )
								ret := 0.678571
							if( source > 428.115 )
								ret := -0.629630
						if( tprice > 435.087 )
							if( azul <= 1.61812 )
								ret := 0.752688 // buy
							if( azul > 1.61812 )
								ret := 0.208333
					if( nvi_ema > 2.24874 )
						if( verde <= 10.2566 )
							if( nvim <= 2.25791 )
								ret := -0.533333
							if( nvim > 2.25791 )
								ret := 0.658537
						if( verde > 10.2566 )
							if( pvimax <= 0.066609 )
								ret := -0.780000 // sell
							if( pvimax > 0.066609 )
								ret := 0.172414
				if( source > 456.043 )
					if( pvi <= 0.036354 )
						if( nvi <= 2.34129 )
							if( azul <= -14.6996 )
								ret := 0.363636
							if( azul > -14.6996 )
								ret := -0.769231 // sell
						if( nvi > 2.34129 )
							if( verde_azul <= 25.5184 )
								ret := 0.760000 // buy
							if( verde_azul > 25.5184 )
								ret := 0.150000
					if( pvi > 0.036354 )
						if( BollOsc <= -38.4329 )
							if( azul_mean <= -6.06433 )
								ret := 0.260870
							if( azul_mean > -6.06433 )
								ret := -0.848485 // sell
						if( BollOsc > -38.4329 )
							if( pvi_ema <= 0.034387 )
								ret := -0.071429
							if( pvi_ema > 0.034387 )
								ret := -0.882576 // sell
			if( pvimax > 0.127978 )
				if( tprice <= 572.127 )
					if( nvi_ema <= 2.38714 )
						if( verde_media <= -25.9835 )
							if( media_azul <= 41.2751 )
								ret := 0.615385
							if( media_azul > 41.2751 )
								ret := -0.395833
						if( verde_media > -25.9835 )
							if( xrsi <= 61.695 )
								ret := 0.747525 // buy
							if( xrsi > 61.695 )
								ret := 0.000000
					if( nvi_ema > 2.38714 )
						if( pvim <= 0.094648 )
							ret := -1.000000 // sell
						if( pvim > 0.094648 )
							ret := -0.625000
				if( tprice > 572.127 )
					if( nvi <= 2.49108 )
						if( nvi <= 2.40369 )
							if( nvimax <= 2.36232 )
								ret := 0.065539
							if( nvimax > 2.36232 )
								ret := -0.188435
						if( nvi > 2.40369 )
							if( pvimin <= 0.146671 )
								ret := 0.350679
							if( pvimin > 0.146671 )
								ret := -0.019284
					if( nvi > 2.49108 )
						if( media <= 40.4223 )
							if( source <= 673.925 )
								ret := 0.826087 // buy
							if( source > 673.925 )
								ret := -0.142857
						if( media > 40.4223 )
							if( pvi_ema <= 0.120301 )
								ret := -0.285714
							if( pvi_ema > 0.120301 )
								ret := -0.903614 // sell
	if( pvimax > 1.66117 )
		if( verde_mean <= -98.6457 )
			if( nvi <= 0.313204 )
				ret := -0.600000
			if( nvi > 0.313204 )
				ret := -1.000000 // sell
		if( verde_mean > -98.6457 )
			if( xrsi <= 9.31117 )
				if( xmf <= 34.0924 )
					if( verde_media <= -18.4712 )
						ret := -0.125000
					if( verde_media > -18.4712 )
						ret := -1.000000 // sell
				if( xmf > 34.0924 )
					if( xrsi <= 5.05741 )
						ret := -0.857143 // sell
					if( xrsi > 5.05741 )
						ret := -1.000000 // sell
			if( xrsi > 9.31117 )
				if( pvim <= 1.64766 )
					if( media <= 80.9562 )
						if( azul <= 2.1527 )
							if( azul_mean <= 4.25046 )
								ret := 0.427835
							if( azul_mean > 4.25046 )
								ret := -0.266667
						if( azul > 2.1527 )
							if( source <= 210.587 )
								ret := -0.147541
							if( source > 210.587 )
								ret := 0.285714
					if( media > 80.9562 )
						if( nvi_ema <= 0.370709 )
							if( verde_mean <= 98.3187 )
								ret := -1.000000 // sell
							if( verde_mean > 98.3187 )
								ret := -0.125000
						if( nvi_ema > 0.370709 )
							if( media <= 103.755 )
								ret := 0.250000
							if( media > 103.755 )
								ret := -0.571429
				if( pvim > 1.64766 )
					if( pvimax <= 1.66677 )
						if( pvimin <= 1.63271 )
							if( verde_media <= -25.6625 )
								ret := -0.296296
							if( verde_media > -25.6625 )
								ret := -0.836364 // sell
						if( pvimin > 1.63271 )
							if( xmf <= 13.4466 )
								ret := -0.769231 // sell
							if( xmf > 13.4466 )
								ret := -0.155080
					if( pvimax > 1.66677 )
						if( verde_media <= 13.4217 )
							if( pvi <= 1.69187 )
								ret := 0.150082
							if( pvi > 1.69187 )
								ret := -0.103560
						if( verde_media > 13.4217 )
							if( azul_mean <= 37.4723 )
								ret := -0.261101
							if( azul_mean > 37.4723 )
								ret := 0.355556
	
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
float op_operation = decision_tree_0_EPAM_15Min_23980539(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


