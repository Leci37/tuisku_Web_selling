//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: TSLA_30Min_1KON_b394cc90 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_30Min_1KON_b394cc90", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_30Min_b394cc90(nvi, nvi_ema, marron_mean, source, azul, verde_azul, verde_mean, xmf, pvimin, stoc, media, tprice, marron, pvim, pvimax, xrsi, oscp, pvi, nvimax, nvimin, verde, verde_media, azul_mean, nvim, BollOsc, pvi_ema, media_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( media <= 83.1085 )
		if( pvimin <= 2.65171 )
			if( oscp <= -22.721 )
				if( source <= 191.171 )
					if( stoc <= 20.2206 )
						if( verde_media <= -38.2856 )
							if( marron_mean <= -5.29886 )
								ret := 0.055172
							if( marron_mean > -5.29886 )
								ret := -0.376569
						if( verde_media > -38.2856 )
							if( nvim <= 0.674315 )
								ret := 0.581633
							if( nvim > 0.674315 )
								ret := -0.727273 // sell
					if( stoc > 20.2206 )
						if( xrsi <= 38.8596 )
							if( nvimax <= 0.121811 )
								ret := 0.034884
							if( nvimax > 0.121811 )
								ret := 0.502924
						if( xrsi > 38.8596 )
							if( stoc <= 34.8274 )
								ret := -0.711111 // sell
							if( stoc > 34.8274 )
								ret := 0.136752
				if( source > 191.171 )
					if( nvimin <= -0.125032 )
						if( pvi_ema <= 2.06122 )
							if( marron <= -3.8215 )
								ret := 0.335227
							if( marron > -3.8215 )
								ret := -0.129524
						if( pvi_ema > 2.06122 )
							if( pvi_ema <= 2.11006 )
								ret := 0.825397 // buy
							if( pvi_ema > 2.11006 )
								ret := 0.300000
					if( nvimin > -0.125032 )
						if( source <= 704.474 )
							if( source <= 303.528 )
								ret := -0.189149
							if( source > 303.528 )
								ret := 0.011449
						if( source > 704.474 )
							if( media <= 25.7246 )
								ret := -0.169279
							if( media > 25.7246 )
								ret := -0.487476
			if( oscp > -22.721 )
				if( azul <= 78.241 )
					if( tprice <= 111.553 )
						if( nvimin <= 0.142146 )
							if( pvimin <= 1.47512 )
								ret := 0.930556 // buy
							if( pvimin > 1.47512 )
								ret := 0.000000
						if( nvimin > 0.142146 )
							if( pvim <= 1.48092 )
								ret := 0.642857
							if( pvim > 1.48092 )
								ret := -0.520000
					if( tprice > 111.553 )
						if( xmf <= 4.42917 )
							if( BollOsc <= -12.259 )
								ret := 0.184103
							if( BollOsc > -12.259 )
								ret := -0.052319
						if( xmf > 4.42917 )
							if( verde_mean <= -22.9853 )
								ret := -0.204142
							if( verde_mean > -22.9853 )
								ret := -0.009195
				if( azul > 78.241 )
					if( xmf <= 56.8358 )
						if( verde_mean <= -7.15472 )
							if( nvimin <= 0.289457 )
								ret := 0.857143 // buy
							if( nvimin > 0.289457 )
								ret := -0.300000
						if( verde_mean > -7.15472 )
							if( source <= 150.152 )
								ret := 0.800000 // buy
							if( source > 150.152 )
								ret := -0.619048
					if( xmf > 56.8358 )
						if( source <= 228.666 )
							if( media <= 78.6377 )
								ret := -0.629630
							if( media > 78.6377 )
								ret := 1.000000 // buy
						if( source > 228.666 )
							if( verde_azul <= 73.8045 )
								ret := 0.281250
							if( verde_azul > 73.8045 )
								ret := -0.562500
		if( pvimin > 2.65171 )
			if( tprice <= 1096.28 )
				if( nvimax <= 0.257246 )
					if( pvi <= 2.78547 )
						if( nvi <= 0.206401 )
							if( oscp <= -2.10147 )
								ret := -0.875000 // sell
							if( oscp > -2.10147 )
								ret := 0.400000
						if( nvi > 0.206401 )
							if( marron <= 98.5592 )
								ret := 0.750000 // buy
							if( marron > 98.5592 )
								ret := 0.000000
					if( pvi > 2.78547 )
						if( tprice <= 792.077 )
							if( media_azul <= 81.1252 )
								ret := 0.000000
							if( media_azul > 81.1252 )
								ret := 0.692308
						if( tprice > 792.077 )
							ret := -1.000000 // sell
				if( nvimax > 0.257246 )
					if( stoc <= 85.7557 )
						if( verde_azul <= 39.448 )
							if( verde_mean <= -21.0935 )
								ret := 0.198556
							if( verde_mean > -21.0935 )
								ret := -0.317881
						if( verde_azul > 39.448 )
							if( marron <= 72.0074 )
								ret := 0.143401
							if( marron > 72.0074 )
								ret := -0.235931
					if( stoc > 85.7557 )
						if( oscp <= 14.9837 )
							if( marron <= 80.7733 )
								ret := -0.777778 // sell
							if( marron > 80.7733 )
								ret := -1.000000 // sell
						if( oscp > 14.9837 )
							if( tprice <= 925.307 )
								ret := -0.888889 // sell
							if( tprice > 925.307 )
								ret := 0.200000
			if( tprice > 1096.28 )
				if( marron <= 18.0499 )
					if( xmf <= 18.7106 )
						if( tprice <= 1124.33 )
							if( nvim <= 0.579357 )
								ret := 0.750000 // buy
							if( nvim > 0.579357 )
								ret := -1.000000 // sell
						if( tprice > 1124.33 )
							if( azul_mean <= -1.75821 )
								ret := 0.444444
							if( azul_mean > -1.75821 )
								ret := 0.966667 // buy
					if( xmf > 18.7106 )
						if( xrsi <= 40.654 )
							if( media <= 35.9082 )
								ret := 0.285714
							if( media > 35.9082 )
								ret := -0.851064 // sell
						if( xrsi > 40.654 )
							ret := 1.000000 // buy
				if( marron > 18.0499 )
					if( nvi <= 0.054835 )
						if( azul_mean <= 1.57317 )
							if( stoc <= 50.1189 )
								ret := 0.656250
							if( stoc > 50.1189 )
								ret := 0.000000
						if( azul_mean > 1.57317 )
							if( marron_mean <= 64.0142 )
								ret := -0.333333
							if( marron_mean > 64.0142 )
								ret := -0.868421 // sell
					if( nvi > 0.054835 )
						if( tprice <= 1158.31 )
							if( BollOsc <= -18.6492 )
								ret := 0.072727
							if( BollOsc > -18.6492 )
								ret := -0.640719
						if( tprice > 1158.31 )
							if( media_azul <= 38.6381 )
								ret := -0.705882 // sell
							if( media_azul > 38.6381 )
								ret := -0.964912 // sell
	if( media > 83.1085 )
		if( source <= 463.742 )
			if( source <= 177.575 )
				if( oscp <= 11.2488 )
					if( stoc <= 77.7456 )
						if( marron <= 48.125 )
							if( verde_media <= -54.9216 )
								ret := -0.807692 // sell
							if( verde_media > -54.9216 )
								ret := 0.333333
						if( marron > 48.125 )
							if( nvi_ema <= 0.475043 )
								ret := 0.774648 // buy
							if( nvi_ema > 0.475043 )
								ret := 0.301587
					if( stoc > 77.7456 )
						if( pvimin <= 1.68863 )
							if( nvi_ema <= 0.174302 )
								ret := -0.577586
							if( nvi_ema > 0.174302 )
								ret := -0.020833
						if( pvimin > 1.68863 )
							if( pvi_ema <= 1.76046 )
								ret := 0.965517 // buy
							if( pvi_ema > 1.76046 )
								ret := 0.138462
				if( oscp > 11.2488 )
					if( pvimax <= 1.8949 )
						if( azul_mean <= 34.4834 )
							if( verde_media <= -8.59783 )
								ret := -0.700000 // sell
							if( verde_media > -8.59783 )
								ret := 0.656794
						if( azul_mean > 34.4834 )
							if( oscp <= 29.9637 )
								ret := 0.272727
							if( oscp > 29.9637 )
								ret := -0.812500 // sell
					if( pvimax > 1.8949 )
						if( azul <= -5.87037 )
							ret := -1.000000 // sell
						if( azul > -5.87037 )
							if( pvi <= 1.93353 )
								ret := 0.550000
							if( pvi > 1.93353 )
								ret := -0.312500
			if( source > 177.575 )
				if( BollOsc <= 93.8006 )
					if( source <= 431.392 )
						if( source <= 387.265 )
							if( BollOsc <= 7.24609 )
								ret := 0.162281
							if( BollOsc > 7.24609 )
								ret := -0.013229
						if( source > 387.265 )
							if( verde <= 141.361 )
								ret := 0.462141
							if( verde > 141.361 )
								ret := -0.320000
					if( source > 431.392 )
						if( media_azul <= 94.8784 )
							if( verde_media <= -2.77907 )
								ret := -0.841667 // sell
							if( verde_media > -2.77907 )
								ret := -0.310881
						if( media_azul > 94.8784 )
							if( oscp <= 15.0304 )
								ret := 0.608696
							if( oscp > 15.0304 )
								ret := -0.500000
				if( BollOsc > 93.8006 )
					if( nvimax <= -0.029201 )
						ret := 0.500000
					if( nvimax > -0.029201 )
						if( verde_media <= 102.232 )
							ret := 0.600000
						if( verde_media > 102.232 )
							ret := 1.000000 // buy
		if( source > 463.742 )
			if( nvimax <= 0.379127 )
				if( marron_mean <= 111.419 )
					if( media <= 105.216 )
						if( source <= 774.865 )
							if( azul_mean <= -1.98958 )
								ret := 0.086022
							if( azul_mean > -1.98958 )
								ret := 0.471316
						if( source > 774.865 )
							if( source <= 1024.48 )
								ret := -0.084125
							if( source > 1024.48 )
								ret := 0.401442
					if( media > 105.216 )
						if( nvimax <= -0.157565 )
							if( stoc <= 84.6899 )
								ret := -0.181818
							if( stoc > 84.6899 )
								ret := -0.956522 // sell
						if( nvimax > -0.157565 )
							if( media <= 114.608 )
								ret := -0.129825
							if( media > 114.608 )
								ret := 0.566038
				if( marron_mean > 111.419 )
					if( oscp <= 18.6935 )
						if( verde_azul <= 123.685 )
							if( tprice <= 938.367 )
								ret := 0.622642
							if( tprice > 938.367 )
								ret := 0.044444
						if( verde_azul > 123.685 )
							if( nvi <= 0.027515 )
								ret := -0.730337 // sell
							if( nvi > 0.027515 )
								ret := 0.317460
					if( oscp > 18.6935 )
						if( pvi_ema <= 2.57238 )
							if( verde_mean <= 130.262 )
								ret := -0.600000
							if( verde_mean > 130.262 )
								ret := 0.710392 // buy
						if( pvi_ema > 2.57238 )
							if( xrsi <= 70.6764 )
								ret := -0.789474 // sell
							if( xrsi > 70.6764 )
								ret := 0.256983
			if( nvimax > 0.379127 )
				if( pvi <= 1.97338 )
					if( xmf <= 70.4862 )
						if( marron_mean <= 87.7852 )
							ret := 0.500000
						if( marron_mean > 87.7852 )
							if( marron_mean <= 102.481 )
								ret := -0.875000 // sell
							if( marron_mean > 102.481 )
								ret := 0.000000
					if( xmf > 70.4862 )
						if( marron_mean <= 133.116 )
							if( nvimax <= 0.427184 )
								ret := 0.500000
							if( nvimax > 0.427184 )
								ret := 1.000000 // buy
						if( marron_mean > 133.116 )
							ret := 0.250000
				if( pvi > 1.97338 )
					if( marron <= 85.6223 )
						if( pvimin <= 2.61326 )
							if( pvimax <= 2.35886 )
								ret := 0.029570
							if( pvimax > 2.35886 )
								ret := 0.557870
						if( pvimin > 2.61326 )
							if( azul_mean <= -1.4599 )
								ret := -0.714286 // sell
							if( azul_mean > -1.4599 )
								ret := 0.000000
					if( marron > 85.6223 )
						if( azul <= 32.8614 )
							if( azul <= 15.4262 )
								ret := 0.017167
							if( azul > 15.4262 )
								ret := -0.335341
						if( azul > 32.8614 )
							if( pvim <= 2.46752 )
								ret := 0.142857
							if( pvim > 2.46752 )
								ret := 0.642857
	
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
float op_operation = decision_tree_0_TSLA_30Min_b394cc90(nvi, nvi_ema, marron_mean, source, azul, verde_azul, verde_mean, xmf, pvimin, stoc, media, tprice, marron, pvim, pvimax, xrsi, oscp, pvi, nvimax, nvimin, verde, verde_media, azul_mean, nvim, BollOsc, pvi_ema, media_azul)

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


