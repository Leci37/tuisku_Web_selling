//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: AMD_1Hour_1KON_6280ea70 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_1Hour_1KON_6280ea70", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_1Hour_6280ea70(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( oscp <= 12.8049 )
		if( xrsi <= 66.2616 )
			if( verde_media <= -32.0517 )
				if( marron <= -2.55135 )
					if( marron_mean <= 9.35087 )
						if( pvimin <= -0.185259 )
							ret := 0.364286
						if( pvimin > -0.185259 )
							ret := -0.137376
					if( marron_mean > 9.35087 )
						if( pvi_ema <= 0.154309 )
							ret := -0.004049
						if( pvi_ema > 0.154309 )
							ret := 0.507874
				if( marron > -2.55135 )
					if( verde <= 33.6233 )
						if( stoc <= 53.5046 )
							ret := -0.138953
						if( stoc > 53.5046 )
							ret := -0.453865
					if( verde > 33.6233 )
						if( tprice <= 81.378 )
							ret := 0.381295
						if( tprice > 81.378 )
							ret := -0.160401
			if( verde_media > -32.0517 )
				if( oscp <= -11.983 )
					if( source <= 80.2921 )
						if( media <= 27.8331 )
							ret := 0.516717
						if( media > 27.8331 )
							ret := 0.184615
					if( source > 80.2921 )
						if( media <= 6.1596 )
							ret := -0.382775
						if( media > 6.1596 )
							ret := 0.111940
				if( oscp > -11.983 )
					if( verde_mean <= 96.8833 )
						if( nvimax <= 2.12447 )
							ret := -0.004199
						if( nvimax > 2.12447 )
							ret := -0.144252
					if( verde_mean > 96.8833 )
						if( nvimin <= 2.19339 )
							ret := 0.188303
						if( nvimin > 2.19339 )
							ret := -0.666667
		if( xrsi > 66.2616 )
			if( pvimin <= 0.443879 )
				if( azul <= 49.3284 )
					if( source <= 20.3532 )
						if( xmf <= 76.3737 )
							ret := -0.571429
						if( xmf > 76.3737 )
							ret := 0.800000 // buy
					if( source > 20.3532 )
						if( nvimax <= -0.196762 )
							ret := -0.841463 // sell
						if( nvimax > -0.196762 )
							ret := -0.214779
				if( azul > 49.3284 )
					if( verde_media <= 24.5801 )
						if( verde_azul <= 34.0421 )
							ret := -0.666667
						if( verde_azul > 34.0421 )
							ret := 0.224490
					if( verde_media > 24.5801 )
						if( xmf <= 72.2167 )
							ret := 0.777778 // buy
						if( xmf > 72.2167 )
							ret := -0.160000
			if( pvimin > 0.443879 )
				if( oscp <= -4.10757 )
					ret := -0.500000
				if( oscp > -4.10757 )
					if( oscp <= 6.22053 )
						if( oscp <= -0.785231 )
							ret := 0.555556
						if( oscp > -0.785231 )
							ret := 1.000000 // buy
					if( oscp > 6.22053 )
						if( oscp <= 10.4544 )
							ret := 0.113208
						if( oscp > 10.4544 )
							ret := 0.735294 // buy
	if( oscp > 12.8049 )
		if( oscp <= 82.0529 )
			if( azul <= 37.5082 )
				if( azul <= -27.0944 )
					if( verde <= 82.6824 )
						if( azul_mean <= -22.0295 )
							ret := 0.237705
						if( azul_mean > -22.0295 )
							ret := -0.800000 // sell
					if( verde > 82.6824 )
						if( verde <= 109.985 )
							ret := 0.681529
						if( verde > 109.985 )
							ret := 0.152174
				if( azul > -27.0944 )
					if( azul_mean <= -14.9554 )
						if( stoc <= 24.2375 )
							ret := -0.827586 // sell
						if( stoc > 24.2375 )
							ret := -0.144509
					if( azul_mean > -14.9554 )
						if( stoc <= 89.5294 )
							ret := 0.119306
						if( stoc > 89.5294 )
							ret := -0.045233
			if( azul > 37.5082 )
				if( tprice <= 82.2812 )
					if( pvi_ema <= 0.064135 )
						if( media <= 99.0624 )
							ret := -0.500000
						if( media > 99.0624 )
							ret := 0.210526
					if( pvi_ema > 0.064135 )
						if( marron_mean <= 131.113 )
							ret := 0.835714 // buy
						if( marron_mean > 131.113 )
							ret := 0.090909
				if( tprice > 82.2812 )
					if( pvimin <= 0.076384 )
						if( xrsi <= 81.4929 )
							ret := 0.545455
						if( xrsi > 81.4929 )
							ret := -0.125000
					if( pvimin > 0.076384 )
						if( media <= 88.7762 )
							ret := -0.136364
						if( media > 88.7762 )
							ret := -0.947368 // sell
		if( oscp > 82.0529 )
			if( verde_media <= 225.415 )
				if( pvi_ema <= 0.29084 )
					if( marron <= 132.521 )
						if( xmf <= 85.6941 )
							ret := 0.642857
						if( xmf > 85.6941 )
							ret := -0.200000
					if( marron > 132.521 )
						ret := 1.000000 // buy
				if( pvi_ema > 0.29084 )
					if( source <= 167.397 )
						if( tprice <= 91.8477 )
							ret := 0.454545
						if( tprice > 91.8477 )
							ret := -0.782609 // sell
					if( source > 167.397 )
						ret := 1.000000 // buy
			if( verde_media > 225.415 )
				if( media <= 51.6631 )
					ret := -0.928571 // sell
				if( media > 51.6631 )
					ret := 0.166667
	
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
float op_operation = decision_tree_0_AMD_1Hour_6280ea70(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


