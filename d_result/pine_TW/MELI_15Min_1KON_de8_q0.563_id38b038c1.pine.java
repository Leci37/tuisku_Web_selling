//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: MELI_15Min_1KON_38b038c1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_15Min_1KON_38b038c1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_15Min_38b038c1(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( pvimin <= 1.63839 )
		if( marron_mean <= 31.1145 )
			if( nvimax <= -0.23006 )
				if( pvim <= 1.5512 )
					if( nvimin <= -0.276546 )
						ret := 1.000000 // buy
					if( nvimin > -0.276546 )
						if( source <= 485.112 )
							if( xrsi <= 32.704 )
								ret := 0.928571 // buy
							if( xrsi > 32.704 )
								ret := 0.000000
						if( source > 485.112 )
							ret := 0.933333 // buy
				if( pvim > 1.5512 )
					if( stoc <= 6.11578 )
						ret := -0.727273 // sell
					if( stoc > 6.11578 )
						if( azul_mean <= -16.3009 )
							ret := 0.785714 // buy
						if( azul_mean > -16.3009 )
							if( media_azul <= 21.4661 )
								ret := 0.545455
							if( media_azul > 21.4661 )
								ret := -0.333333
			if( nvimax > -0.23006 )
				if( tprice <= 340.155 )
					if( pvi_ema <= 0.620784 )
						if( marron_mean <= 11.2409 )
							if( xmf <= 11.118 )
								if( BollOsc <= -54.5797 )
									ret := 0.645833
								if( BollOsc > -54.5797 )
									ret := 0.204545
							if( xmf > 11.118 )
								if( pvimax <= 0.384627 )
									ret := -0.014085
								if( pvimax > 0.384627 )
									ret := -0.525773
						if( marron_mean > 11.2409 )
							if( nvimax <= 0.144769 )
								if( pvim <= -0.021269 )
									ret := -0.336538
								if( pvim > -0.021269 )
									ret := 0.200980
							if( nvimax > 0.144769 )
								if( verde_media <= -38.4342 )
									ret := 0.428571
								if( verde_media > -38.4342 )
									ret := -0.447653
					if( pvi_ema > 0.620784 )
						if( pvimax <= 1.03735 )
							if( verde_mean <= -70.5593 )
								if( source <= 298.657 )
									ret := -1.000000 // sell
								if( source > 298.657 )
									ret := -0.454545
							if( verde_mean > -70.5593 )
								if( media <= 46.5891 )
									ret := 0.229346
								if( media > 46.5891 )
									ret := -0.386364
						if( pvimax > 1.03735 )
							if( xrsi <= 24.5149 )
								if( source <= 301.475 )
									ret := -0.520000
								if( source > 301.475 )
									ret := 0.607843
							if( xrsi > 24.5149 )
								if( nvi <= -0.161767 )
									ret := -0.840708 // sell
								if( nvi > -0.161767 )
									ret := -0.171429
				if( tprice > 340.155 )
					if( pvi_ema <= 1.09519 )
						if( tprice <= 1388.47 )
							if( media <= 14.2992 )
								if( azul <= -10.604 )
									ret := -0.498099
								if( azul > -10.604 )
									ret := -0.213253
							if( media > 14.2992 )
								if( source <= 363.625 )
									ret := -0.399682
								if( source > 363.625 )
									ret := -0.072706
						if( tprice > 1388.47 )
							if( xmf <= 21.4727 )
								if( BollOsc <= -33.3394 )
									ret := -0.341463
								if( BollOsc > -33.3394 )
									ret := 0.428571
							if( xmf > 21.4727 )
								if( azul <= -5.93178 )
									ret := -0.054688
								if( azul > -5.93178 )
									ret := 0.417293
					if( pvi_ema > 1.09519 )
						if( pvimin <= 1.47431 )
							if( media <= 22.6186 )
								if( pvimax <= 1.21873 )
									ret := -0.044828
								if( pvimax > 1.21873 )
									ret := 0.216393
							if( media > 22.6186 )
								if( nvimin <= 1.29097 )
									ret := 0.132338
								if( nvimin > 1.29097 )
									ret := -0.080882
						if( pvimin > 1.47431 )
							if( tprice <= 446.426 )
								ret := 1.000000 // buy
							if( tprice > 446.426 )
								if( pvi <= 1.63018 )
									ret := -0.102976
								if( pvi > 1.63018 )
									ret := -0.510917
		if( marron_mean > 31.1145 )
			if( tprice <= 268.363 )
				if( pvi_ema <= 0.408346 )
					if( media <= 77.1035 )
						if( azul_mean <= 5.1176 )
							if( marron <= 16.9817 )
								if( media <= 47.729 )
									ret := 0.187500
								if( media > 47.729 )
									ret := 0.764706 // buy
							if( marron > 16.9817 )
								if( pvim <= -0.049471 )
									ret := 0.625000
								if( pvim > -0.049471 )
									ret := 0.061813
						if( azul_mean > 5.1176 )
							if( pvimax <= 0.392957 )
								if( pvi_ema <= 0.302901 )
									ret := 0.362403
								if( pvi_ema > 0.302901 )
									ret := 0.595420
							if( pvimax > 0.392957 )
								if( BollOsc <= -2.98838 )
									ret := -0.400000
								if( BollOsc > -2.98838 )
									ret := 0.187500
					if( media > 77.1035 )
						if( oscp <= 18.6026 )
							if( media <= 95.1256 )
								if( xmf <= 80.8675 )
									ret := -0.047970
								if( xmf > 80.8675 )
									ret := 0.441176
							if( media > 95.1256 )
								if( tprice <= 225.718 )
									ret := -0.140845
								if( tprice > 225.718 )
									ret := -0.637168
						if( oscp > 18.6026 )
							if( verde_mean <= 136.566 )
								if( verde_mean <= 127.496 )
									ret := 0.173913
								if( verde_mean > 127.496 )
									ret := 0.790698 // buy
							if( verde_mean > 136.566 )
								if( nvimin <= -0.022823 )
									ret := 0.530864
								if( nvimin > -0.022823 )
									ret := -0.165680
				if( pvi_ema > 0.408346 )
					if( nvi_ema <= 0.068587 )
						if( azul_mean <= 5.13781 )
							if( verde <= 115.815 )
								ret := 1.000000 // buy
							if( verde > 115.815 )
								ret := 0.818182 // buy
						if( azul_mean > 5.13781 )
							ret := 0.411765
					if( nvi_ema > 0.068587 )
						if( verde <= 42.4288 )
							if( verde_mean <= 48.6572 )
								if( pvim <= 0.429489 )
									ret := 0.972222 // buy
								if( pvim > 0.429489 )
									ret := 0.525424
							if( verde_mean > 48.6572 )
								ret := -0.750000 // sell
						if( verde > 42.4288 )
							if( azul <= -15.5733 )
								ret := -0.866667 // sell
							if( azul > -15.5733 )
								if( xmf <= 82.7576 )
									ret := 0.330645
								if( xmf > 82.7576 )
									ret := -0.636364
			if( tprice > 268.363 )
				if( pvi_ema <= 1.03712 )
					if( nvi_ema <= 1.84821 )
						if( nvimax <= 1.87119 )
							if( nvimin <= 1.81445 )
								if( marron <= 122.684 )
									ret := -0.016206
								if( marron > 122.684 )
									ret := -0.321127
							if( nvimin > 1.81445 )
								if( pvimin <= 0.630268 )
									ret := 0.777778 // buy
								if( pvimin > 0.630268 )
									ret := 0.235577
						if( nvimax > 1.87119 )
							if( media <= 37.8048 )
								ret := -0.083333
							if( media > 37.8048 )
								if( nvi_ema <= 1.80859 )
									ret := 0.125000
								if( nvi_ema > 1.80859 )
									ret := -0.880000 // sell
					if( nvi_ema > 1.84821 )
						if( nvimin <= 1.76525 )
							if( source <= 1032.26 )
								ret := 1.000000 // buy
							if( source > 1032.26 )
								ret := 0.750000 // buy
						if( nvimin > 1.76525 )
							if( nvimax <= 1.89892 )
								if( azul_mean <= -25.3693 )
									ret := 0.117647
								if( azul_mean > -25.3693 )
									ret := -0.690632
							if( nvimax > 1.89892 )
								if( pvi <= 1.03819 )
									ret := -0.213235
								if( pvi > 1.03819 )
									ret := 1.000000 // buy
				if( pvi_ema > 1.03712 )
					if( media <= 70.23 )
						if( nvim <= 1.53451 )
							if( pvim <= 1.61993 )
								if( nvimin <= -0.179726 )
									ret := -0.085356
								if( nvimin > -0.179726 )
									ret := 0.187428
							if( pvim > 1.61993 )
								if( nvi <= -0.251779 )
									ret := 1.000000 // buy
								if( nvi > -0.251779 )
									ret := -0.257800
						if( nvim > 1.53451 )
							if( pvi <= 1.23865 )
								if( source <= 1235.53 )
									ret := 0.256055
								if( source > 1235.53 )
									ret := 0.028633
							if( pvi > 1.23865 )
								if( source <= 1884.15 )
									ret := -0.017900
								if( source > 1884.15 )
									ret := -0.400612
					if( media > 70.23 )
						if( nvi <= -0.266291 )
							if( marron <= 75.7544 )
								if( pvim <= 1.56003 )
									ret := 0.409091
								if( pvim > 1.56003 )
									ret := 0.938272 // buy
							if( marron > 75.7544 )
								if( xmf <= 31.8558 )
									ret := 1.000000 // buy
								if( xmf > 31.8558 )
									ret := 0.034091
						if( nvi > -0.266291 )
							if( BollOsc <= -64.596 )
								if( source <= 1254.47 )
									ret := 0.914286 // buy
								if( source > 1254.47 )
									ret := 0.357143
							if( BollOsc > -64.596 )
								if( tprice <= 1545.39 )
									ret := 0.024845
								if( tprice > 1545.39 )
									ret := -0.096301
	if( pvimin > 1.63839 )
		if( pvi <= 1.62788 )
			if( xrsi <= 18.8279 )
				ret := 1.000000 // buy
			if( xrsi > 18.8279 )
				ret := 0.428571
		if( pvi > 1.62788 )
			if( tprice <= 548.629 )
				if( source <= 542.558 )
					ret := 1.000000 // buy
				if( source > 542.558 )
					ret := 0.800000 // buy
			if( tprice > 548.629 )
				if( marron_mean <= 36.6225 )
					if( nvi <= -0.225074 )
						ret := 0.722222 // buy
					if( nvi > -0.225074 )
						if( media_azul <= 18.4615 )
							if( pvim <= 1.67861 )
								ret := 0.444444
							if( pvim > 1.67861 )
								ret := -0.600000
						if( media_azul > 18.4615 )
							if( nvi_ema <= 0.08388 )
								if( nvimin <= -0.134978 )
									ret := -0.750000 // sell
								if( nvimin > -0.134978 )
									ret := -0.960396 // sell
							if( nvi_ema > 0.08388 )
								if( stoc <= 19.447 )
									ret := -0.153846
								if( stoc > 19.447 )
									ret := -0.600000
				if( marron_mean > 36.6225 )
					if( stoc <= 44.1711 )
						if( marron_mean <= 58.8746 )
							if( azul <= -3.57023 )
								if( verde_azul <= 65.709 )
									ret := 0.767442 // buy
								if( verde_azul > 65.709 )
									ret := -0.312500
							if( azul > -3.57023 )
								if( marron_mean <= 43.9347 )
									ret := -0.812500 // sell
								if( marron_mean > 43.9347 )
									ret := 0.166667
						if( marron_mean > 58.8746 )
							ret := -0.923077 // sell
					if( stoc > 44.1711 )
						if( pvim <= 1.69182 )
							if( pvimax <= 1.74704 )
								if( azul <= 7.75836 )
									ret := -0.794118 // sell
								if( azul > 7.75836 )
									ret := -0.058824
							if( pvimax > 1.74704 )
								if( azul <= 3.31486 )
									ret := 1.000000 // buy
								if( azul > 3.31486 )
									ret := -0.607143
						if( pvim > 1.69182 )
							if( azul_mean <= -7.32499 )
								ret := -0.476190
							if( azul_mean > -7.32499 )
								if( verde <= 87.669 )
									ret := -0.796296 // sell
								if( verde > 87.669 )
									ret := -0.962963 // sell
	
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
float op_operation = decision_tree_0_MELI_15Min_38b038c1(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


