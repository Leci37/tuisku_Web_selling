//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: CRWD_30Min_1KON_bf26e533 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_30Min_1KON_bf26e533", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_30Min_bf26e533(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( pvimin <= 0.139271 )
		if( nvimax <= -0.079226 )
			if( media_azul <= 56.6634 )
				if( pvimin <= 0.126494 )
					if( pvim <= 0.16789 )
						if( pvi_ema <= -0.081913 )
							ret := -0.333333
						if( pvi_ema > -0.081913 )
							ret := 0.955056 // buy
					if( pvim > 0.16789 )
						ret := 0.000000
				if( pvimin > 0.126494 )
					ret := -0.166667
			if( media_azul > 56.6634 )
				if( verde_mean <= 133.571 )
					if( media_azul <= 57.7436 )
						ret := -1.000000 // sell
					if( media_azul > 57.7436 )
						if( xmf <= 43.9915 )
							ret := 0.966667 // buy
						if( xmf > 43.9915 )
							ret := 0.343750
				if( verde_mean > 133.571 )
					if( pvi <= 0.255358 )
						if( verde_mean <= 159.508 )
							ret := -0.941176 // sell
						if( verde_mean > 159.508 )
							ret := 0.000000
					if( pvi > 0.255358 )
						ret := 1.000000 // buy
		if( nvimax > -0.079226 )
			if( azul <= 12.0721 )
				if( xrsi <= 24.4695 )
					if( verde_azul <= -21.6452 )
						if( nvi_ema <= 0.829104 )
							ret := 0.573171
						if( nvi_ema > 0.829104 )
							ret := -0.173160
					if( verde_azul > -21.6452 )
						if( xmf <= 0.104822 )
							ret := -0.533333
						if( xmf > 0.104822 )
							ret := 0.575281
				if( xrsi > 24.4695 )
					if( xrsi <= 35.2069 )
						if( azul_mean <= -40.6945 )
							ret := 0.408867
						if( azul_mean > -40.6945 )
							ret := -0.091389
					if( xrsi > 35.2069 )
						if( xrsi <= 59.0142 )
							ret := 0.137052
						if( xrsi > 59.0142 )
							ret := -0.011218
			if( azul > 12.0721 )
				if( BollOsc <= 43.0382 )
					if( nvim <= 0.158535 )
						if( verde_media <= -65.405 )
							ret := 0.411765
						if( verde_media > -65.405 )
							ret := -0.432432
					if( nvim > 0.158535 )
						if( BollOsc <= -19.7678 )
							ret := 0.161512
						if( BollOsc > -19.7678 )
							ret := -0.105415
				if( BollOsc > 43.0382 )
					if( xmf <= 52.0196 )
						if( BollOsc <= 81.5047 )
							ret := 0.616740
						if( BollOsc > 81.5047 )
							ret := -0.666667
					if( xmf > 52.0196 )
						if( verde_media <= 31.7661 )
							ret := 0.437500
						if( verde_media > 31.7661 )
							ret := -0.173299
	if( pvimin > 0.139271 )
		if( media_azul <= 20.4405 )
			if( azul_mean <= -4.93341 )
				if( tprice <= 294.173 )
					if( media_azul <= 12.1914 )
						if( xrsi <= 13.9004 )
							ret := 0.750000 // buy
						if( xrsi > 13.9004 )
							ret := -0.217822
					if( media_azul > 12.1914 )
						if( tprice <= 64.2431 )
							ret := 1.000000 // buy
						if( tprice > 64.2431 )
							ret := 0.191837
				if( tprice > 294.173 )
					if( media <= 14.5224 )
						if( oscp <= -23.8622 )
							ret := 0.000000
						if( oscp > -23.8622 )
							ret := 0.951220 // buy
					if( media > 14.5224 )
						ret := -0.125000
			if( azul_mean > -4.93341 )
				if( marron_mean <= -6.47287 )
					if( media <= 13.4166 )
						if( tprice <= 232.466 )
							ret := 0.953488 // buy
						if( tprice > 232.466 )
							ret := 0.000000
					if( media > 13.4166 )
						ret := 0.000000
				if( marron_mean > -6.47287 )
					if( nvi <= 1.55168 )
						if( verde_mean <= 64.4625 )
							ret := -0.441568
						if( verde_mean > 64.4625 )
							ret := 0.146552
					if( nvi > 1.55168 )
						if( source <= 377.874 )
							ret := -0.155340
						if( source > 377.874 )
							ret := 0.569231
		if( media_azul > 20.4405 )
			if( verde_media <= -12.6661 )
				if( nvimin <= -0.079689 )
					if( verde_mean <= 10.975 )
						if( source <= 58.309 )
							ret := 0.857143 // buy
						if( source > 58.309 )
							ret := -0.742857 // sell
					if( verde_mean > 10.975 )
						if( verde_mean <= 13.4806 )
							ret := 0.789474 // buy
						if( verde_mean > 13.4806 )
							ret := -0.223404
				if( nvimin > -0.079689 )
					if( media <= 3.68987 )
						if( tprice <= 170.671 )
							ret := 0.000000
						if( tprice > 170.671 )
							ret := 0.919355 // buy
					if( media > 3.68987 )
						if( nvimax <= 1.37322 )
							ret := 0.229479
						if( nvimax > 1.37322 )
							ret := 0.059915
			if( verde_media > -12.6661 )
				if( pvimax <= 0.701624 )
					if( nvim <= -0.05368 )
						if( marron_mean <= 81.989 )
							ret := -0.556075
						if( marron_mean > 81.989 )
							ret := 0.248408
					if( nvim > -0.05368 )
						if( media <= 43.2348 )
							ret := 0.053869
						if( media > 43.2348 )
							ret := -0.070748
				if( pvimax > 0.701624 )
					if( tprice <= 384.665 )
						if( verde_mean <= 38.5786 )
							ret := -0.333333
						if( verde_mean > 38.5786 )
							ret := -0.821918 // sell
					if( tprice > 384.665 )
						if( verde_mean <= 35.3606 )
							ret := 1.000000 // buy
						if( verde_mean > 35.3606 )
							ret := 0.000000
	
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
float op_operation = decision_tree_0_CRWD_30Min_bf26e533(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


