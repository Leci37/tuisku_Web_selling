//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: META_1Min_1KON_e2bc82e8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_1Min_1KON_e2bc82e8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_1Min_e2bc82e8(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( source <= 469.039 )
		if( source <= 415.217 )
			if( pvim <= -0.202107 )
				if( marron <= 25.8168 )
					if( pvi <= -0.20505 )
						if( pvimin <= -0.204734 )
							ret := 1.000000 // buy
						if( pvimin > -0.204734 )
							ret := 0.454545
					if( pvi > -0.20505 )
						ret := -0.600000
				if( marron > 25.8168 )
					if( media <= 52.6193 )
						if( stoc <= 40.3867 )
							ret := -1.000000 // sell
						if( stoc > 40.3867 )
							if( oscp <= 0.578695 )
								ret := 0.125000
							if( oscp > 0.578695 )
								ret := -0.714286 // sell
					if( media > 52.6193 )
						if( pvi <= -0.201383 )
							ret := 1.000000 // buy
						if( pvi > -0.201383 )
							ret := 0.000000
			if( pvim > -0.202107 )
				if( media <= 48.2741 )
					ret := 1.000000 // buy
				if( media > 48.2741 )
					if( BollOsc <= 5.21583 )
						if( media <= 63.5576 )
							ret := 0.750000 // buy
						if( media > 63.5576 )
							ret := 0.714286 // buy
					if( BollOsc > 5.21583 )
						ret := 1.000000 // buy
		if( source > 415.217 )
			if( azul <= -36.6016 )
				if( BollOsc <= -5.26059 )
					if( verde <= 3.29557 )
						if( verde_azul <= 24.3548 )
							if( marron <= -11.5651 )
								ret := 0.687500
							if( marron > -11.5651 )
								ret := -0.260274
						if( verde_azul > 24.3548 )
							if( media <= 54.2815 )
								ret := 0.659686
							if( media > 54.2815 )
								ret := -0.846154 // sell
					if( verde > 3.29557 )
						if( nvi_ema <= 0.145415 )
							if( marron_mean <= 37.1727 )
								ret := 0.416667
							if( marron_mean > 37.1727 )
								ret := -0.491228
						if( nvi_ema > 0.145415 )
							if( source <= 464.868 )
								ret := 0.487395
							if( source > 464.868 )
								ret := -0.122642
				if( BollOsc > -5.26059 )
					if( media <= 96.6035 )
						if( xrsi <= 68.6003 )
							if( source <= 465.375 )
								ret := 0.670886
							if( source > 465.375 )
								ret := 0.250000
						if( xrsi > 68.6003 )
							ret := -1.000000 // sell
					if( media > 96.6035 )
						if( pvimin <= -0.262161 )
							if( nvimin <= 0.124087 )
								ret := 1.000000 // buy
							if( nvimin > 0.124087 )
								ret := 0.500000
						if( pvimin > -0.262161 )
							if( media_azul <= 161.006 )
								ret := -0.066667
							if( media_azul > 161.006 )
								ret := -0.764706 // sell
			if( azul > -36.6016 )
				if( verde_media <= 169.333 )
					if( azul <= 134.901 )
						if( verde_media <= 74.914 )
							if( verde <= 161.554 )
								ret := 0.045993
							if( verde > 161.554 )
								ret := -0.475728
						if( verde_media > 74.914 )
							if( pvimax <= -0.221416 )
								ret := -0.369369
							if( pvimax > -0.221416 )
								ret := 0.555556
					if( azul > 134.901 )
						if( azul <= 141.236 )
							ret := -0.800000 // sell
						if( azul > 141.236 )
							ret := -1.000000 // sell
				if( verde_media > 169.333 )
					ret := -1.000000 // sell
	if( source > 469.039 )
		if( marron <= 6.57783 )
			if( azul_mean <= -48.7201 )
				if( azul <= -191.462 )
					if( BollOsc <= -103.892 )
						ret := -0.500000
					if( BollOsc > -103.892 )
						if( xmf <= 6.60598 )
							ret := 0.571429
						if( xmf > 6.60598 )
							ret := 1.000000 // buy
				if( azul > -191.462 )
					if( pvi <= -0.03613 )
						if( nvimin <= 0.17099 )
							if( nvi <= 0.11735 )
								ret := 0.222222
							if( nvi > 0.11735 )
								ret := -0.670391
						if( nvimin > 0.17099 )
							if( nvimin <= 0.261909 )
								ret := 0.228571
							if( nvimin > 0.261909 )
								ret := -0.733333 // sell
					if( pvi > -0.03613 )
						if( azul_mean <= -70.6254 )
							ret := 1.000000 // buy
						if( azul_mean > -70.6254 )
							ret := -0.500000
			if( azul_mean > -48.7201 )
				if( pvimax <= -0.011645 )
					if( media <= 9.46283 )
						if( nvim <= 0.152648 )
							if( pvimax <= -0.051985 )
								ret := 0.328358
							if( pvimax > -0.051985 )
								ret := -0.390244
						if( nvim > 0.152648 )
							if( pvi_ema <= -0.185666 )
								ret := 0.160494
							if( pvi_ema > -0.185666 )
								ret := 0.636364
					if( media > 9.46283 )
						if( BollOsc <= -80.3174 )
							if( oscp <= -155.421 )
								ret := -0.583333
							if( oscp > -155.421 )
								ret := 0.414557
						if( BollOsc > -80.3174 )
							if( azul <= 14.5 )
								ret := 0.109917
							if( azul > 14.5 )
								ret := -0.213836
				if( pvimax > -0.011645 )
					if( xmf <= 17.6466 )
						if( media <= 12.7806 )
							if( xrsi <= 18.7266 )
								ret := -0.680000
							if( xrsi > 18.7266 )
								ret := -0.964286 // sell
						if( media > 12.7806 )
							if( nvi_ema <= -0.03592 )
								ret := -0.833333 // sell
							if( nvi_ema > -0.03592 )
								ret := 0.205128
					if( xmf > 17.6466 )
						if( pvi_ema <= 0.008066 )
							if( verde_mean <= -38.9833 )
								ret := 1.000000 // buy
							if( verde_mean > -38.9833 )
								ret := -0.395604
						if( pvi_ema > 0.008066 )
							if( tprice <= 499.914 )
								ret := 0.800000 // buy
							if( tprice > 499.914 )
								ret := 0.382353
		if( marron > 6.57783 )
			if( media_azul <= -33.2966 )
				if( marron <= 28.7878 )
					if( verde <= -14.361 )
						if( media <= 19.6327 )
							if( nvimin <= 0.175846 )
								ret := 0.071429
							if( nvimin > 0.175846 )
								ret := 0.857143 // buy
						if( media > 19.6327 )
							if( azul <= 89.7369 )
								ret := 0.727273 // buy
							if( azul > 89.7369 )
								ret := -0.583333
					if( verde > -14.361 )
						if( nvi_ema <= 0.201173 )
							if( stoc <= 23.1169 )
								ret := -0.953125 // sell
							if( stoc > 23.1169 )
								ret := -0.550000
						if( nvi_ema > 0.201173 )
							if( source <= 518.949 )
								ret := -0.666667
							if( source > 518.949 )
								ret := 0.580645
				if( marron > 28.7878 )
					if( pvimin <= -0.130095 )
						if( azul <= 154.346 )
							if( marron <= 136.485 )
								ret := -0.308824
							if( marron > 136.485 )
								ret := 1.000000 // buy
						if( azul > 154.346 )
							if( stoc <= 67.3711 )
								ret := -1.000000 // sell
							if( stoc > 67.3711 )
								ret := -0.800000 // sell
					if( pvimin > -0.130095 )
						if( nvi_ema <= 0.261059 )
							if( media <= 81.7046 )
								ret := -0.857843 // sell
							if( media > 81.7046 )
								ret := -0.166667
						if( nvi_ema > 0.261059 )
							ret := 0.000000
			if( media_azul > -33.2966 )
				if( tprice <= 596.578 )
					if( pvi_ema <= -0.22955 )
						if( source <= 472.282 )
							if( pvi <= -0.227481 )
								ret := 0.718750 // buy
							if( pvi > -0.227481 )
								ret := -0.250000
						if( source > 472.282 )
							if( azul <= -2.6945 )
								ret := 0.719298 // buy
							if( azul > -2.6945 )
								ret := 0.011494
					if( pvi_ema > -0.22955 )
						if( marron_mean <= 22.4221 )
							if( verde_azul <= -64.384 )
								ret := 0.495327
							if( verde_azul > -64.384 )
								ret := -0.099855
						if( marron_mean > 22.4221 )
							if( pvimin <= -0.175621 )
								ret := -0.053398
							if( pvimin > -0.175621 )
								ret := -0.001220
				if( tprice > 596.578 )
					if( nvi <= 0.261659 )
						if( media_azul <= 65.7722 )
							ret := 0.125000
						if( media_azul > 65.7722 )
							ret := -0.400000
					if( nvi > 0.261659 )
						if( media_azul <= 70.7846 )
							if( source <= 596.807 )
								ret := -0.866667 // sell
							if( source > 596.807 )
								ret := -1.000000 // sell
						if( media_azul > 70.7846 )
							if( verde_media <= -6.78717 )
								ret := -0.266667
							if( verde_media > -6.78717 )
								ret := -0.758621 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_META_1Min_e2bc82e8(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


