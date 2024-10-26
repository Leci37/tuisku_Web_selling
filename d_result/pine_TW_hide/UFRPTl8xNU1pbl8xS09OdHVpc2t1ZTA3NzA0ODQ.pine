//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: PTON_15Min_1KON_e0770484 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PTON_15Min_1KON_e0770484", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PTON_15Min_e0770484(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( verde <= 54.9942 )
		if( verde_media <= -1.03226 )
			if( nvimin <= 0.279728 )
				if( verde <= 41.7498 )
					if( azul_mean <= 25.1502 )
						if( source <= 2.94976 )
							if( verde <= -46.0789 )
								ret := -0.166667
							if( verde > -46.0789 )
								ret := 0.888889 // buy
						if( source > 2.94976 )
							if( xrsi <= 35.3261 )
								ret := 0.163595
							if( xrsi > 35.3261 )
								ret := 0.006008
					if( azul_mean > 25.1502 )
						if( oscp <= -48.1947 )
							if( pvimin <= 0.009967 )
								ret := 0.714286 // buy
							if( pvimin > 0.009967 )
								ret := -0.166667
						if( oscp > -48.1947 )
							if( media_azul <= -37.2505 )
								ret := -0.509804
							if( media_azul > -37.2505 )
								ret := 0.247232
				if( verde > 41.7498 )
					if( tprice <= 7.43671 )
						if( pvi_ema <= -0.050248 )
							if( oscp <= -22.6884 )
								ret := -0.473684
							if( oscp > -22.6884 )
								ret := 0.374477
						if( pvi_ema > -0.050248 )
							if( media_azul <= 59.9676 )
								ret := -0.388889
							if( media_azul > 59.9676 )
								ret := 0.157895
					if( tprice > 7.43671 )
						if( xmf <= 90.0005 )
							if( pvimin <= -0.205149 )
								ret := 0.920000 // buy
							if( pvimin > -0.205149 )
								ret := 0.449511
						if( xmf > 90.0005 )
							if( nvim <= 0.149383 )
								ret := -1.000000 // sell
							if( nvim > 0.149383 )
								ret := -0.750000 // sell
			if( nvimin > 0.279728 )
				if( azul <= -90.3411 )
					if( azul <= -132.487 )
						if( nvim <= 0.662745 )
							if( verde_mean <= 52.4006 )
								ret := 0.600000
							if( verde_mean > 52.4006 )
								ret := -0.250000
						if( nvim > 0.662745 )
							if( pvi <= 0.3863 )
								ret := -0.833333 // sell
							if( pvi > 0.3863 )
								ret := 0.000000
					if( azul > -132.487 )
						if( oscp <= -65.3774 )
							ret := -1.000000 // sell
						if( oscp > -65.3774 )
							if( xmf <= 41.643 )
								ret := 0.661616
							if( xmf > 41.643 )
								ret := 0.192982
				if( azul > -90.3411 )
					if( azul_mean <= -11.6699 )
						if( verde_mean <= -56.1725 )
							if( stoc <= 6.29563 )
								ret := -0.868421 // sell
							if( stoc > 6.29563 )
								ret := -0.253644
						if( verde_mean > -56.1725 )
							if( pvimin <= -0.638099 )
								ret := 0.532710
							if( pvimin > -0.638099 )
								ret := -0.025661
					if( azul_mean > -11.6699 )
						if( media_azul <= 30.4695 )
							if( marron_mean <= 24.386 )
								ret := 0.039452
							if( marron_mean > 24.386 )
								ret := -0.115676
						if( media_azul > 30.4695 )
							if( pvimax <= -0.500289 )
								ret := 0.330404
							if( pvimax > -0.500289 )
								ret := 0.089029
		if( verde_media > -1.03226 )
			if( tprice <= 9.29739 )
				if( xmf <= 58.6265 )
					if( xrsi <= 55.1742 )
						if( marron <= 36.7746 )
							if( verde_mean <= 47.4496 )
								ret := 0.093426
							if( verde_mean > 47.4496 )
								ret := 0.694444
						if( marron > 36.7746 )
							if( marron_mean <= 21.5516 )
								ret := -0.402299
							if( marron_mean > 21.5516 )
								ret := 0.005540
					if( xrsi > 55.1742 )
						if( media_azul <= 12.3349 )
							ret := -0.285714
						if( media_azul > 12.3349 )
							ret := -1.000000 // sell
				if( xmf > 58.6265 )
					if( verde_azul <= 91.3216 )
						if( pvi <= -0.300075 )
							if( verde_media <= -0.298692 )
								ret := -0.500000
							if( verde_media > -0.298692 )
								ret := 0.596330
						if( pvi > -0.300075 )
							if( azul_mean <= 8.36317 )
								ret := 0.021277
							if( azul_mean > 8.36317 )
								ret := 0.509804
					if( verde_azul > 91.3216 )
						if( verde_mean <= 43.2462 )
							ret := -0.750000 // sell
						if( verde_mean > 43.2462 )
							ret := -1.000000 // sell
			if( tprice > 9.29739 )
				if( verde_azul <= 42.4687 )
					if( pvimax <= -0.359954 )
						if( azul <= 4.86314 )
							if( stoc <= 23.5103 )
								ret := -0.414286
							if( stoc > 23.5103 )
								ret := 0.209302
						if( azul > 4.86314 )
							if( nvimin <= 1.2852 )
								ret := -0.840708 // sell
							if( nvimin > 1.2852 )
								ret := -0.304348
					if( pvimax > -0.359954 )
						if( pvi <= -0.449485 )
							if( media_azul <= -14.2313 )
								ret := 0.000000
							if( media_azul > -14.2313 )
								ret := 0.962963 // buy
						if( pvi > -0.449485 )
							if( nvimin <= 0.471839 )
								ret := -0.384454
							if( nvimin > 0.471839 )
								ret := -0.107670
				if( verde_azul > 42.4687 )
					if( nvi_ema <= 0.647993 )
						if( xrsi <= 37.4608 )
							if( xmf <= 66.6474 )
								ret := 0.647343
							if( xmf > 66.6474 )
								ret := -0.346154
						if( xrsi > 37.4608 )
							if( tprice <= 25.7294 )
								ret := -0.191067
							if( tprice > 25.7294 )
								ret := 0.178378
					if( nvi_ema > 0.647993 )
						if( xrsi <= 41.3085 )
							if( nvi <= 1.37945 )
								ret := -0.351297
							if( nvi > 1.37945 )
								ret := -0.059829
						if( xrsi > 41.3085 )
							if( source <= 11.6307 )
								ret := 0.676471
							if( source > 11.6307 )
								ret := 0.046957
	if( verde > 54.9942 )
		if( media_azul <= 72.0376 )
			if( verde_mean <= 133.296 )
				if( oscp <= 38.6636 )
					if( xmf <= 38.3357 )
						if( nvim <= 0.62215 )
							if( stoc <= 74.4069 )
								ret := -0.457974
							if( stoc > 74.4069 )
								ret := -0.163677
						if( nvim > 0.62215 )
							if( azul_mean <= 4.37677 )
								ret := 0.018553
							if( azul_mean > 4.37677 )
								ret := -0.274336
					if( xmf > 38.3357 )
						if( media_azul <= 4.95236 )
							if( verde_media <= 80.8884 )
								ret := -0.336842
							if( verde_media > 80.8884 )
								ret := 0.706897 // buy
						if( media_azul > 4.95236 )
							if( pvimin <= -0.130581 )
								ret := -0.024096
							if( pvimin > -0.130581 )
								ret := -0.103681
				if( oscp > 38.6636 )
					if( azul_mean <= -24.6746 )
						if( tprice <= 41.0462 )
							if( nvim <= 0.408631 )
								ret := 0.166667
							if( nvim > 0.408631 )
								ret := 0.937500 // buy
						if( tprice > 41.0462 )
							if( stoc <= 48.7111 )
								ret := -0.250000
							if( stoc > 48.7111 )
								ret := -1.000000 // sell
					if( azul_mean > -24.6746 )
						if( media <= 63.5976 )
							if( pvim <= -0.444121 )
								ret := -0.084746
							if( pvim > -0.444121 )
								ret := -0.586580
						if( media > 63.5976 )
							if( pvimin <= -0.485343 )
								ret := 0.576923
							if( pvimin > -0.485343 )
								ret := -0.210692
			if( verde_mean > 133.296 )
				if( nvi <= 0.320539 )
					if( verde_media <= 98.7871 )
						if( verde_azul <= 116.199 )
							if( marron_mean <= 131.555 )
								ret := -0.727273 // sell
							if( marron_mean > 131.555 )
								ret := 1.000000 // buy
						if( verde_azul > 116.199 )
							if( BollOsc <= 70.3992 )
								ret := 0.319149
							if( BollOsc > 70.3992 )
								ret := -0.687500
					if( verde_media > 98.7871 )
						if( nvimin <= 0.150095 )
							if( nvimin <= 0.067198 )
								ret := -1.000000 // sell
							if( nvimin > 0.067198 )
								ret := -0.500000
						if( nvimin > 0.150095 )
							ret := -1.000000 // sell
				if( nvi > 0.320539 )
					if( marron <= 136.855 )
						if( pvi <= 0.420863 )
							if( marron_mean <= 119.06 )
								ret := 0.211429
							if( marron_mean > 119.06 )
								ret := 0.601023
						if( pvi > 0.420863 )
							if( nvi_ema <= 1.44142 )
								ret := -0.176471
							if( nvi_ema > 1.44142 )
								ret := -0.833333 // sell
					if( marron > 136.855 )
						if( azul_mean <= 28.0231 )
							if( verde_mean <= 150.425 )
								ret := 0.565217
							if( verde_mean > 150.425 )
								ret := -0.300000
						if( azul_mean > 28.0231 )
							if( xrsi <= 87.124 )
								ret := -0.712329 // sell
							if( xrsi > 87.124 )
								ret := 0.142857
		if( media_azul > 72.0376 )
			if( BollOsc <= 19.3785 )
				if( media <= 71.0663 )
					if( pvimax <= -0.325363 )
						if( stoc <= 52.4869 )
							if( verde_azul <= 94.3936 )
								ret := 0.028986
							if( verde_azul > 94.3936 )
								ret := 0.714286 // buy
						if( stoc > 52.4869 )
							if( media <= 68.9843 )
								ret := -0.252632
							if( media > 68.9843 )
								ret := 0.733333 // buy
					if( pvimax > -0.325363 )
						if( tprice <= 8.13209 )
							if( azul_mean <= -20.8524 )
								ret := -0.457143
							if( azul_mean > -20.8524 )
								ret := -0.035398
						if( tprice > 8.13209 )
							if( nvi <= 0.412933 )
								ret := 0.248031
							if( nvi > 0.412933 )
								ret := -0.082540
				if( media > 71.0663 )
					if( xmf <= 32.1437 )
						if( verde_mean <= 106.374 )
							if( media_azul <= 84.6129 )
								ret := 0.065421
							if( media_azul > 84.6129 )
								ret := -0.496403
						if( verde_mean > 106.374 )
							if( verde <= 61.1676 )
								ret := -0.500000
							if( verde > 61.1676 )
								ret := 1.000000 // buy
					if( xmf > 32.1437 )
						if( media_azul <= 82.555 )
							if( azul_mean <= -3.86629 )
								ret := -0.139373
							if( azul_mean > -3.86629 )
								ret := 0.344700
						if( media_azul > 82.555 )
							if( azul <= -35.3586 )
								ret := 0.303691
							if( azul > -35.3586 )
								ret := 0.072928
			if( BollOsc > 19.3785 )
				if( nvim <= 0.261931 )
					if( nvimax <= 0.085328 )
						if( pvim <= -0.157828 )
							if( azul <= 5.74158 )
								ret := 0.575221
							if( azul > 5.74158 )
								ret := -0.379310
						if( pvim > -0.157828 )
							if( marron_mean <= 91.8861 )
								ret := -0.274131
							if( marron_mean > 91.8861 )
								ret := 0.047880
					if( nvimax > 0.085328 )
						if( xrsi <= 70.5372 )
							if( azul_mean <= -20.5631 )
								ret := 0.281250
							if( azul_mean > -20.5631 )
								ret := -0.211982
						if( xrsi > 70.5372 )
							if( verde_mean <= 108.233 )
								ret := 0.157895
							if( verde_mean > 108.233 )
								ret := -0.523697
				if( nvim > 0.261931 )
					if( marron_mean <= 93.9001 )
						if( BollOsc <= 27.5851 )
							if( nvimax <= 1.34118 )
								ret := 0.084864
							if( nvimax > 1.34118 )
								ret := -0.136519
						if( BollOsc > 27.5851 )
							if( tprice <= 151.182 )
								ret := -0.142155
							if( tprice > 151.182 )
								ret := 0.444444
					if( marron_mean > 93.9001 )
						if( verde_azul <= 114.99 )
							if( pvimin <= -0.507947 )
								ret := 0.340385
							if( pvimin > -0.507947 )
								ret := 0.081081
						if( verde_azul > 114.99 )
							if( stoc <= 88.0405 )
								ret := 0.057692
							if( stoc > 88.0405 )
								ret := -0.102020
	
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
float op_operation = decision_tree_0_PTON_15Min_e0770484(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


