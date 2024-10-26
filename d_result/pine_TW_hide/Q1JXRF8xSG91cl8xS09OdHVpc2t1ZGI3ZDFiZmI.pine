//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: CRWD_1Hour_1KON_db7d1bfb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_1Hour_1KON_db7d1bfb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_1Hour_db7d1bfb(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( marron_mean <= 50.7025 )
		if( xrsi <= 19.4844 )
			if( marron <= -8.94649 )
				if( media <= 15.2424 )
					if( tprice <= 146.107 )
						ret := 0.294118
					if( tprice > 146.107 )
						if( nvi_ema <= 1.57322 )
							ret := 0.900000 // buy
						if( nvi_ema > 1.57322 )
							ret := 0.400000
				if( media > 15.2424 )
					if( azul <= -6.59631 )
						if( nvimax <= 1.17947 )
							ret := 0.142857
						if( nvimax > 1.17947 )
							ret := 0.777778 // buy
					if( azul > -6.59631 )
						ret := -0.428571
			if( marron > -8.94649 )
				if( xmf <= 28.7416 )
					if( xrsi <= 17.4168 )
						if( azul_mean <= -32.5971 )
							ret := 0.944444 // buy
						if( azul_mean > -32.5971 )
							ret := 0.150943
					if( xrsi > 17.4168 )
						if( azul <= 0.951065 )
							ret := -0.443182
						if( azul > 0.951065 )
							ret := 0.333333
				if( xmf > 28.7416 )
					if( tprice <= 169.796 )
						if( marron <= 7.92351 )
							ret := 0.657143
						if( marron > 7.92351 )
							ret := 1.000000 // buy
					if( tprice > 169.796 )
						if( marron_mean <= 9.04877 )
							ret := 0.485714
						if( marron_mean > 9.04877 )
							ret := -0.300000
		if( xrsi > 19.4844 )
			if( nvi <= 0.19781 )
				if( pvi <= -0.111399 )
					if( media_azul <= 16.6272 )
						if( nvi_ema <= 0.059421 )
							ret := 0.714286 // buy
						if( nvi_ema > 0.059421 )
							ret := -0.630137
					if( media_azul > 16.6272 )
						if( marron <= 18.1928 )
							ret := -0.047059
						if( marron > 18.1928 )
							ret := 0.558559
				if( pvi > -0.111399 )
					if( nvi <= 0.01038 )
						if( oscp <= -25.4696 )
							ret := -0.266667
						if( oscp > -25.4696 )
							ret := 0.857143 // buy
					if( nvi > 0.01038 )
						if( xmf <= 11.5899 )
							ret := 0.500000
						if( xmf > 11.5899 )
							ret := -0.497921
			if( nvi > 0.19781 )
				if( tprice <= 319.336 )
					if( pvimin <= -0.110352 )
						if( marron <= 45.4243 )
							ret := 1.000000 // buy
						if( marron > 45.4243 )
							ret := 0.125000
					if( pvimin > -0.110352 )
						if( nvimin <= 1.07203 )
							ret := -0.122730
						if( nvimin > 1.07203 )
							ret := 0.027443
				if( tprice > 319.336 )
					if( pvi <= 1.24835 )
						if( media <= 42.1095 )
							ret := -0.729282 // sell
						if( media > 42.1095 )
							ret := -0.333333
					if( pvi > 1.24835 )
						if( pvimin <= 1.28431 )
							ret := 0.066667
						if( pvimin > 1.28431 )
							ret := -0.640000
	if( marron_mean > 50.7025 )
		if( xrsi <= 60.2206 )
			if( pvi_ema <= 0.649395 )
				if( xmf <= 53.9197 )
					if( nvimin <= 0.937926 )
						if( stoc <= 56.3816 )
							ret := -0.307692
						if( stoc > 56.3816 )
							ret := 0.112745
					if( nvimin > 0.937926 )
						if( marron <= 33.3158 )
							ret := -0.842105 // sell
						if( marron > 33.3158 )
							ret := 0.437811
				if( xmf > 53.9197 )
					if( verde_azul <= 96.339 )
						if( media <= 80.8091 )
							ret := 0.614203
						if( media > 80.8091 )
							ret := 0.111380
					if( verde_azul > 96.339 )
						if( nvim <= 0.038543 )
							ret := -0.888889 // sell
						if( nvim > 0.038543 )
							ret := 0.119617
			if( pvi_ema > 0.649395 )
				if( xmf <= 61.4576 )
					if( verde_azul <= 11.79 )
						if( pvi_ema <= 0.698726 )
							ret := -0.281250
						if( pvi_ema > 0.698726 )
							ret := 0.524444
					if( verde_azul > 11.79 )
						if( media <= 80.5183 )
							ret := 0.037952
						if( media > 80.5183 )
							ret := 0.294235
				if( xmf > 61.4576 )
					if( nvimin <= 0.85737 )
						if( BollOsc <= 21.5596 )
							ret := 0.202381
						if( BollOsc > 21.5596 )
							ret := 0.796875 // buy
					if( nvimin > 0.85737 )
						if( marron_mean <= 77.7734 )
							ret := -0.355993
						if( marron_mean > 77.7734 )
							ret := 0.004335
		if( xrsi > 60.2206 )
			if( xrsi <= 83.6012 )
				if( azul_mean <= -37.8263 )
					if( media <= 97.0514 )
						if( nvim <= 1.23253 )
							ret := -1.000000 // sell
						if( nvim > 1.23253 )
							ret := -0.500000
					if( media > 97.0514 )
						ret := 0.000000
				if( azul_mean > -37.8263 )
					if( nvimin <= 0.027001 )
						if( pvi <= 0.128868 )
							ret := 0.811765 // buy
						if( pvi > 0.128868 )
							ret := -0.631579
					if( nvimin > 0.027001 )
						if( nvi_ema <= 0.187683 )
							ret := -0.416393
						if( nvi_ema > 0.187683 )
							ret := -0.041935
			if( xrsi > 83.6012 )
				if( nvimin <= 0.775769 )
					if( BollOsc <= 49.8201 )
						if( verde_azul <= 151.589 )
							ret := -0.400000
						if( verde_azul > 151.589 )
							ret := -1.000000 // sell
					if( BollOsc > 49.8201 )
						if( verde_azul <= 119.364 )
							ret := -0.307692
						if( verde_azul > 119.364 )
							ret := 0.518519
				if( nvimin > 0.775769 )
					if( pvimin <= 0.533734 )
						if( xrsi <= 93.7365 )
							ret := 0.858156 // buy
						if( xrsi > 93.7365 )
							ret := -0.375000
					if( pvimin > 0.533734 )
						if( nvim <= 1.07431 )
							ret := -0.625000
						if( nvim > 1.07431 )
							ret := 0.283871
	
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
float op_operation = decision_tree_0_CRWD_1Hour_db7d1bfb(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


