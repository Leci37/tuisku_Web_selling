//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: NFLX_30Min_1KON_28265549 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NFLX_30Min_1KON_28265549", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NFLX_30Min_28265549(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( stoc <= 14.8388 )
		if( nvim <= -0.030955 )
			if( pvi <= 1.45826 )
				if( azul_mean <= -18.1354 )
					if( oscp <= -22.6186 )
						if( azul <= -48.9006 )
							ret := 0.607143
						if( azul > -48.9006 )
							ret := -0.586441
					if( oscp > -22.6186 )
						if( marron_mean <= -4.44358 )
							ret := 0.561224
						if( marron_mean > -4.44358 )
							ret := -0.175141
				if( azul_mean > -18.1354 )
					if( verde_mean <= -5.36884 )
						if( nvim <= -0.16269 )
							ret := 0.114047
						if( nvim > -0.16269 )
							ret := -0.435345
					if( verde_mean > -5.36884 )
						if( pvimin <= 1.39391 )
							ret := 0.351609
						if( pvimin > 1.39391 )
							ret := -0.428571
			if( pvi > 1.45826 )
				if( xmf <= 20.1901 )
					if( xmf <= 9.56706 )
						if( media_azul <= 9.96434 )
							ret := -0.092308
						if( media_azul > 9.96434 )
							ret := 0.351351
					if( xmf > 9.56706 )
						if( source <= 432.738 )
							ret := 0.077037
						if( source > 432.738 )
							ret := -0.263736
				if( xmf > 20.1901 )
					if( verde <= -6.82313 )
						if( source <= 310.504 )
							ret := 0.805128 // buy
						if( source > 310.504 )
							ret := 0.341577
					if( verde > -6.82313 )
						if( nvimin <= -0.043836 )
							ret := 0.192620
						if( nvimin > -0.043836 )
							ret := 0.708333 // buy
		if( nvim > -0.030955 )
			if( BollOsc <= -28.7478 )
				if( xmf <= 15.3393 )
					if( oscp <= -4.91904 )
						if( stoc <= 4.74998 )
							ret := -0.152174
						if( stoc > 4.74998 )
							ret := 0.369048
					if( oscp > -4.91904 )
						if( source <= 360.32 )
							ret := -0.920000 // sell
						if( source > 360.32 )
							ret := 0.111111
				if( xmf > 15.3393 )
					if( BollOsc <= -46.2776 )
						if( pvi <= 1.86865 )
							ret := 0.145695
						if( pvi > 1.86865 )
							ret := -0.561338
					if( BollOsc > -46.2776 )
						if( tprice <= 524.254 )
							ret := -0.114486
						if( tprice > 524.254 )
							ret := 0.342857
			if( BollOsc > -28.7478 )
				if( media <= 23.268 )
					if( verde_mean <= 11.4335 )
						if( media <= 9.9928 )
							ret := -0.412698
						if( media > 9.9928 )
							ret := -0.850000 // sell
					if( verde_mean > 11.4335 )
						if( marron_mean <= 17.3296 )
							ret := 0.800000 // buy
						if( marron_mean > 17.3296 )
							ret := 0.000000
				if( media > 23.268 )
					if( verde_mean <= 41.0775 )
						if( azul <= -2.52249 )
							ret := 0.000000
						if( azul > -2.52249 )
							ret := 0.714286 // buy
					if( verde_mean > 41.0775 )
						ret := -1.000000 // sell
	if( stoc > 14.8388 )
		if( marron_mean <= 127.399 )
			if( nvi_ema <= -0.127348 )
				if( xmf <= 79.6455 )
					if( verde_media <= -148.384 )
						if( tprice <= 504.421 )
							ret := 0.639785
						if( tprice > 504.421 )
							ret := -0.315789
					if( verde_media > -148.384 )
						if( nvi <= -0.143187 )
							ret := 0.016323
						if( nvi > -0.143187 )
							ret := 0.159543
				if( xmf > 79.6455 )
					if( BollOsc <= -7.14637 )
						if( nvimax <= -0.247988 )
							ret := 0.339130
						if( nvimax > -0.247988 )
							ret := -0.053299
					if( BollOsc > -7.14637 )
						if( media <= 109.497 )
							ret := -0.087202
						if( media > 109.497 )
							ret := -0.301991
			if( nvi_ema > -0.127348 )
				if( marron <= 114.783 )
					if( oscp <= 45.2591 )
						if( verde_mean <= -2.5106 )
							ret := -0.230684
						if( verde_mean > -2.5106 )
							ret := -0.053465
					if( oscp > 45.2591 )
						if( verde_mean <= 75.2114 )
							ret := 0.052632
						if( verde_mean > 75.2114 )
							ret := -0.505917
				if( marron > 114.783 )
					if( verde_mean <= 173.798 )
						if( source <= 523.739 )
							ret := 0.229771
						if( source > 523.739 )
							ret := -0.185294
					if( verde_mean > 173.798 )
						if( xrsi <= 83.7847 )
							ret := -0.747126 // sell
						if( xrsi > 83.7847 )
							ret := 0.392857
		if( marron_mean > 127.399 )
			if( media <= 96.8024 )
				if( source <= 531.949 )
					if( nvimax <= -0.310681 )
						if( BollOsc <= 46.3973 )
							ret := 0.833333 // buy
						if( BollOsc > 46.3973 )
							ret := 0.025641
					if( nvimax > -0.310681 )
						if( verde_mean <= 149.186 )
							ret := 0.875000 // buy
						if( verde_mean > 149.186 )
							ret := -0.656566
				if( source > 531.949 )
					if( verde_mean <= 246.507 )
						if( verde_mean <= 152.198 )
							ret := 1.000000 // buy
						if( verde_mean > 152.198 )
							ret := 0.071429
					if( verde_mean > 246.507 )
						ret := 1.000000 // buy
			if( media > 96.8024 )
				if( verde_mean <= 143.16 )
					if( verde_azul <= 129.739 )
						if( BollOsc <= 53.4409 )
							ret := -0.639344
						if( BollOsc > 53.4409 )
							ret := 0.086957
					if( verde_azul > 129.739 )
						ret := 1.000000 // buy
				if( verde_mean > 143.16 )
					if( xmf <= 91.3818 )
						if( media <= 124.446 )
							ret := 0.327907
						if( media > 124.446 )
							ret := -0.517241
					if( xmf > 91.3818 )
						if( verde_azul <= 119.808 )
							ret := 0.223881
						if( verde_azul > 119.808 )
							ret := 0.607981
	
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
float op_operation = decision_tree_0_NFLX_30Min_28265549(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


