//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: ZI_1Hour_1KON_24e9805a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ZI_1Hour_1KON_24e9805a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ZI_1Hour_24e9805a(oscp, verde_media, verde, marron, azul, media, tprice, xrsi, pvimax, media_azul, nvi_ema, azul_mean, pvim, verde_mean, pvi_ema, xmf, nvi, BollOsc, source, nvimax, pvimin, stoc, marron_mean, pvi, nvim, nvimin, verde_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( xrsi <= 64.152 )
		if( pvimin <= -0.593659 )
			if( pvi <= -0.376143 )
				if( nvim <= 0.678667 )
					if( nvim <= 0.658294 )
						if( pvi_ema <= -0.537989 )
							ret := 0.522491
						if( pvi_ema > -0.537989 )
							ret := 0.073529
					if( nvim > 0.658294 )
						if( BollOsc <= -39.4835 )
							ret := -0.514286
						if( BollOsc > -39.4835 )
							ret := 0.091954
				if( nvim > 0.678667 )
					if( nvim <= 0.715698 )
						if( stoc <= 77.0269 )
							ret := 0.807692 // buy
						if( stoc > 77.0269 )
							ret := 0.066667
					if( nvim > 0.715698 )
						if( media <= 57.613 )
							ret := 0.863636 // buy
						if( media > 57.613 )
							ret := -0.178571
			if( pvi > -0.376143 )
				if( pvi <= -0.342585 )
					if( nvi_ema <= 0.629526 )
						ret := -1.000000 // sell
					if( nvi_ema > 0.629526 )
						if( xrsi <= 59.5061 )
							ret := 0.000000
						if( xrsi > 59.5061 )
							ret := -0.750000 // sell
				if( pvi > -0.342585 )
					ret := -0.909091 // sell
		if( pvimin > -0.593659 )
			if( nvi_ema <= 0.593836 )
				if( pvi_ema <= 0.352966 )
					if( azul <= 41.0711 )
						if( azul_mean <= -43.2214 )
							ret := -0.457364
						if( azul_mean > -43.2214 )
							ret := 0.116091
					if( azul > 41.0711 )
						if( xmf <= 57.7832 )
							ret := -0.511236
						if( xmf > 57.7832 )
							ret := 0.333333
				if( pvi_ema > 0.352966 )
					if( verde_media <= 18.7004 )
						if( media_azul <= 98.6129 )
							ret := -0.077758
						if( media_azul > 98.6129 )
							ret := 0.468750
					if( verde_media > 18.7004 )
						if( media <= 70.0707 )
							ret := -0.520202
						if( media > 70.0707 )
							ret := 0.142857
			if( nvi_ema > 0.593836 )
				if( verde_media <= -44.6955 )
					if( nvi_ema <= 1.04336 )
						if( xrsi <= 50.4199 )
							ret := 0.307692
						if( xrsi > 50.4199 )
							ret := -0.516129
					if( nvi_ema > 1.04336 )
						if( pvimin <= -0.034867 )
							ret := -0.843750 // sell
						if( pvimin > -0.034867 )
							ret := 0.071429
				if( verde_media > -44.6955 )
					if( verde_mean <= -6.23179 )
						if( oscp <= -23.1025 )
							ret := -0.100917
						if( oscp > -23.1025 )
							ret := -0.600000
					if( verde_mean > -6.23179 )
						if( stoc <= 81.9058 )
							ret := -0.106824
						if( stoc > 81.9058 )
							ret := 0.353535
	if( xrsi > 64.152 )
		if( nvi_ema <= 0.578718 )
			if( oscp <= 31.2741 )
				if( pvi <= -0.326532 )
					if( media <= 61.8397 )
						ret := 0.000000
					if( media > 61.8397 )
						if( media_azul <= 103.797 )
							ret := -0.821429 // sell
						if( media_azul > 103.797 )
							ret := 0.000000
				if( pvi > -0.326532 )
					if( BollOsc <= 34.7048 )
						if( xrsi <= 66.2246 )
							ret := 0.209091
						if( xrsi > 66.2246 )
							ret := -0.314961
					if( BollOsc > 34.7048 )
						if( azul_mean <= 15.7067 )
							ret := -0.352000
						if( azul_mean > 15.7067 )
							ret := -0.709677 // sell
			if( oscp > 31.2741 )
				if( verde <= 145.277 )
					if( nvimax <= 0.259692 )
						if( nvimax <= -0.062896 )
							ret := -1.000000 // sell
						if( nvimax > -0.062896 )
							ret := 0.200000
					if( nvimax > 0.259692 )
						if( pvimax <= 0.015453 )
							ret := 0.000000
						if( pvimax > 0.015453 )
							ret := 0.918033 // buy
				if( verde > 145.277 )
					if( verde_media <= 63.0403 )
						if( verde_azul <= 161.004 )
							ret := -0.775862 // sell
						if( verde_azul > 161.004 )
							ret := 0.444444
					if( verde_media > 63.0403 )
						if( oscp <= 54.1708 )
							ret := 0.214286
						if( oscp > 54.1708 )
							ret := -0.406977
		if( nvi_ema > 0.578718 )
			if( media <= 100.893 )
				if( marron_mean <= 101.773 )
					if( stoc <= 93.4698 )
						if( tprice <= 18.3973 )
							ret := -0.461538
						if( tprice > 18.3973 )
							ret := -0.002674
					if( stoc > 93.4698 )
						if( tprice <= 33.8512 )
							ret := 0.666667
						if( tprice > 33.8512 )
							ret := -1.000000 // sell
				if( marron_mean > 101.773 )
					if( source <= 65.7017 )
						if( marron_mean <= 119.492 )
							ret := 0.547771
						if( marron_mean > 119.492 )
							ret := -0.235294
					if( source > 65.7017 )
						if( verde_mean <= 132.478 )
							ret := -0.115385
						if( verde_mean > 132.478 )
							ret := -1.000000 // sell
			if( media > 100.893 )
				if( pvimin <= -0.418304 )
					if( verde_media <= 3.34234 )
						ret := 0.000000
					if( verde_media > 3.34234 )
						if( nvim <= 0.675936 )
							ret := -0.444444
						if( nvim > 0.675936 )
							ret := -1.000000 // sell
				if( pvimin > -0.418304 )
					if( azul_mean <= -2.2115 )
						if( xrsi <= 73.6577 )
							ret := -0.750000 // sell
						if( xrsi > 73.6577 )
							ret := 0.000000
					if( azul_mean > -2.2115 )
						if( BollOsc <= 35.6788 )
							ret := 0.327869
						if( BollOsc > 35.6788 )
							ret := -0.269841
	
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
float op_operation = decision_tree_0_ZI_1Hour_24e9805a(oscp, verde_media, verde, marron, azul, media, tprice, xrsi, pvimax, media_azul, nvi_ema, azul_mean, pvim, verde_mean, pvi_ema, xmf, nvi, BollOsc, source, nvimax, pvimin, stoc, marron_mean, pvi, nvim, nvimin, verde_azul)

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


