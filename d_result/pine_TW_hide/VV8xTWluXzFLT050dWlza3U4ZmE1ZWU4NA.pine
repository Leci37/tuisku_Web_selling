//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: U_1Min_1KON_8fa5ee84 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_1KON_8fa5ee84", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_8fa5ee84(nvi, nvi_ema, marron_mean, source, azul, verde_azul, verde_mean, xmf, pvimin, stoc, media, tprice, marron, pvim, pvimax, xrsi, oscp, pvi, nvimax, nvimin, verde, verde_media, azul_mean, nvim, BollOsc, pvi_ema, media_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( verde_media <= -31.1047 )
		if( stoc <= 25.1996 )
			if( marron <= 27.193 )
				if( azul <= -4.73003 )
					if( stoc <= 5.69654 )
						if( azul_mean <= -25.4417 )
							if( xrsi <= 13.4482 )
								ret := 0.600000
							if( xrsi > 13.4482 )
								ret := -0.267516
						if( azul_mean > -25.4417 )
							if( verde_media <= -35.2298 )
								ret := 0.604478
							if( verde_media > -35.2298 )
								ret := 0.084337
					if( stoc > 5.69654 )
						if( xrsi <= 39.5294 )
							if( verde <= -12.3179 )
								ret := 0.110107
							if( verde > -12.3179 )
								ret := -0.058711
						if( xrsi > 39.5294 )
							if( nvimax <= 0.408529 )
								ret := 0.115385
							if( nvimax > 0.408529 )
								ret := 0.540650
				if( azul > -4.73003 )
					if( tprice <= 15.899 )
						if( nvi <= 0.550785 )
							if( pvi_ema <= -0.95731 )
								ret := -0.468085
							if( pvi_ema > -0.95731 )
								ret := 0.156740
						if( nvi > 0.550785 )
							if( xrsi <= 42.401 )
								ret := 0.528037
							if( xrsi > 42.401 )
								ret := -0.187500
					if( tprice > 15.899 )
						if( marron <= -9.38153 )
							if( azul_mean <= 30.5864 )
								ret := 0.376471
							if( azul_mean > 30.5864 )
								ret := -0.565217
						if( marron > -9.38153 )
							if( verde_mean <= -72.254 )
								ret := -0.476923
							if( verde_mean > -72.254 )
								ret := -0.035771
			if( marron > 27.193 )
				if( azul <= -4.86665 )
					if( xmf <= 38.2638 )
						if( media_azul <= 75.9666 )
							if( stoc <= 13.7772 )
								ret := 0.800000 // buy
							if( stoc > 13.7772 )
								ret := -0.133333
						if( media_azul > 75.9666 )
							if( verde_media <= -38.4436 )
								ret := 0.923077 // buy
							if( verde_media > -38.4436 )
								ret := 0.000000
					if( xmf > 38.2638 )
						if( tprice <= 15.9338 )
							if( BollOsc <= -36.4691 )
								ret := 0.900000 // buy
							if( BollOsc > -36.4691 )
								ret := 0.000000
						if( tprice > 15.9338 )
							if( azul_mean <= -1.20488 )
								ret := -0.219251
							if( azul_mean > -1.20488 )
								ret := 0.560000
				if( azul > -4.86665 )
					if( xrsi <= 47.7021 )
						if( azul_mean <= 37.4841 )
							if( verde_azul <= 10.3949 )
								ret := -0.452599
							if( verde_azul > 10.3949 )
								ret := -0.014286
						if( azul_mean > 37.4841 )
							if( marron <= 41.6 )
								ret := 0.862069 // buy
							if( marron > 41.6 )
								ret := -0.500000
					if( xrsi > 47.7021 )
						if( source <= 18.2807 )
							if( verde_azul <= 26.8182 )
								ret := -0.815217 // sell
							if( verde_azul > 26.8182 )
								ret := 0.000000
						if( source > 18.2807 )
							if( verde_azul <= -76.4412 )
								ret := -1.000000 // sell
							if( verde_azul > -76.4412 )
								ret := -0.104167
		if( stoc > 25.1996 )
			if( BollOsc <= -10.665 )
				if( azul_mean <= 11.1682 )
					if( verde <= 4.97121 )
						if( xmf <= 5.33375 )
							if( tprice <= 16.6167 )
								ret := 0.529412
							if( tprice > 16.6167 )
								ret := -0.646341
						if( xmf > 5.33375 )
							if( marron_mean <= 16.1358 )
								ret := -0.215385
							if( marron_mean > 16.1358 )
								ret := 0.311206
					if( verde > 4.97121 )
						if( source <= 16.1461 )
							if( BollOsc <= -30.4826 )
								ret := -0.033333
							if( BollOsc > -30.4826 )
								ret := 0.406844
						if( source > 16.1461 )
							if( verde_azul <= 54.9164 )
								ret := -0.039790
							if( verde_azul > 54.9164 )
								ret := 0.240876
				if( azul_mean > 11.1682 )
					if( nvim <= 0.329455 )
						if( xmf <= 11.798 )
							if( media_azul <= -102.836 )
								ret := 0.500000
							if( media_azul > -102.836 )
								ret := -0.896552 // sell
						if( xmf > 11.798 )
							if( BollOsc <= -22.6745 )
								ret := 0.385714
							if( BollOsc > -22.6745 )
								ret := -0.040000
					if( nvim > 0.329455 )
						if( nvi <= 1.04447 )
							if( marron_mean <= 68.6116 )
								ret := 0.431144
							if( marron_mean > 68.6116 )
								ret := 0.808000 // buy
						if( nvi > 1.04447 )
							if( xrsi <= 43.5572 )
								ret := -0.541667
							if( xrsi > 43.5572 )
								ret := 0.035714
			if( BollOsc > -10.665 )
				if( media_azul <= -23.6283 )
					if( oscp <= -38.9688 )
						if( source <= 15.984 )
							if( azul_mean <= 90.6563 )
								ret := 0.142857
							if( azul_mean > 90.6563 )
								ret := -0.800000 // sell
						if( source > 15.984 )
							if( verde_mean <= -2.95436 )
								ret := -0.876712 // sell
							if( verde_mean > -2.95436 )
								ret := -0.523810
					if( oscp > -38.9688 )
						if( nvi_ema <= 0.307179 )
							ret := 0.500000
						if( nvi_ema > 0.307179 )
							ret := 0.000000
				if( media_azul > -23.6283 )
					if( verde_media <= -38.9007 )
						if( stoc <= 75.899 )
							if( pvi <= -0.814318 )
								ret := -0.200935
							if( pvi > -0.814318 )
								ret := 0.074074
						if( stoc > 75.899 )
							if( azul_mean <= 30.0835 )
								ret := -0.012987
							if( azul_mean > 30.0835 )
								ret := 0.767857 // buy
					if( verde_media > -38.9007 )
						if( xrsi <= 61.698 )
							if( stoc <= 31.4161 )
								ret := -0.432432
							if( stoc > 31.4161 )
								ret := 0.220174
						if( xrsi > 61.698 )
							if( pvimax <= -0.808048 )
								ret := 0.000000
							if( pvimax > -0.808048 )
								ret := -0.750000 // sell
	if( verde_media > -31.1047 )
		if( azul <= -1.55455 )
			if( media_azul <= 130.012 )
				if( oscp <= 27.3413 )
					if( pvim <= -0.88745 )
						if( marron <= 22.3124 )
							if( media_azul <= 45.1358 )
								ret := 0.022801
							if( media_azul > 45.1358 )
								ret := -0.278008
						if( marron > 22.3124 )
							if( oscp <= 4.22826 )
								ret := 0.215539
							if( oscp > 4.22826 )
								ret := 0.090450
					if( pvim > -0.88745 )
						if( media <= 48.4643 )
							if( BollOsc <= -42.3773 )
								ret := -0.089161
							if( BollOsc > -42.3773 )
								ret := 0.097692
						if( media > 48.4643 )
							if( verde_mean <= 137.848 )
								ret := -0.059042
							if( verde_mean > 137.848 )
								ret := 0.404412
				if( oscp > 27.3413 )
					if( xrsi <= 69.8796 )
						if( azul_mean <= -53.1708 )
							if( verde_media <= 64.6627 )
								ret := 0.723684 // buy
							if( verde_media > 64.6627 )
								ret := -0.022727
						if( azul_mean > -53.1708 )
							if( marron_mean <= 107.501 )
								ret := -0.227709
							if( marron_mean > 107.501 )
								ret := 0.257143
					if( xrsi > 69.8796 )
						if( BollOsc <= 59.3246 )
							if( media_azul <= 107.013 )
								ret := 0.328767
							if( media_azul > 107.013 )
								ret := -0.076667
						if( BollOsc > 59.3246 )
							if( nvimax <= 1.06553 )
								ret := 0.536946
							if( nvimax > 1.06553 )
								ret := -0.666667
			if( media_azul > 130.012 )
				if( stoc <= 88.6646 )
					if( xrsi <= 46.3489 )
						if( tprice <= 21.1411 )
							if( verde <= 45.016 )
								ret := 0.166667
							if( verde > 45.016 )
								ret := 0.854922 // buy
						if( tprice > 21.1411 )
							if( verde_mean <= 96.759 )
								ret := -0.205882
							if( verde_mean > 96.759 )
								ret := 0.812500 // buy
					if( xrsi > 46.3489 )
						if( source <= 16.1599 )
							if( pvimin <= -0.812 )
								ret := 0.827273 // buy
							if( pvimin > -0.812 )
								ret := 0.300000
						if( source > 16.1599 )
							if( azul <= -44.9222 )
								ret := 0.121061
							if( azul > -44.9222 )
								ret := 0.486188
				if( stoc > 88.6646 )
					if( pvi_ema <= -1.15466 )
						ret := -1.000000 // sell
					if( pvi_ema > -1.15466 )
						if( azul_mean <= 7.25311 )
							if( xmf <= 76.4847 )
								ret := -0.071429
							if( xmf > 76.4847 )
								ret := -0.789474 // sell
						if( azul_mean > 7.25311 )
							if( nvimin <= 0.510453 )
								ret := 0.000000
							if( nvimin > 0.510453 )
								ret := 0.750000 // buy
		if( azul > -1.55455 )
			if( marron_mean <= 118.537 )
				if( media <= 90.4716 )
					if( verde <= 50.9457 )
						if( tprice <= 14.9485 )
							if( azul <= 33.927 )
								ret := 0.398214
							if( azul > 33.927 )
								ret := -0.515625
						if( tprice > 14.9485 )
							if( media_azul <= 2.08964 )
								ret := -0.193795
							if( media_azul > 2.08964 )
								ret := -0.028913
					if( verde > 50.9457 )
						if( media_azul <= -62.2211 )
							if( azul_mean <= 104.275 )
								ret := -0.902174 // sell
							if( azul_mean > 104.275 )
								ret := 0.750000 // buy
						if( media_azul > -62.2211 )
							if( nvimin <= 0.975819 )
								ret := -0.139448
							if( nvimin > 0.975819 )
								ret := -0.026893
				if( media > 90.4716 )
					if( verde_azul <= 151.894 )
						if( pvimax <= -1.15803 )
							if( verde_azul <= 38.2342 )
								ret := -0.800000 // sell
							if( verde_azul > 38.2342 )
								ret := 0.276235
						if( pvimax > -1.15803 )
							if( xmf <= 67.2974 )
								ret := 0.119555
							if( xmf > 67.2974 )
								ret := -0.036179
					if( verde_azul > 151.894 )
						if( media <= 103.773 )
							if( nvimax <= 0.529498 )
								ret := -0.313953
							if( nvimax > 0.529498 )
								ret := -0.812500 // sell
						if( media > 103.773 )
							if( nvimax <= 0.722965 )
								ret := 0.791667 // buy
							if( nvimax > 0.722965 )
								ret := -0.312500
			if( marron_mean > 118.537 )
				if( source <= 17.9592 )
					if( media <= 101.902 )
						if( pvi_ema <= -1.03191 )
							if( pvi <= -1.14059 )
								ret := -0.076923
							if( pvi > -1.14059 )
								ret := 0.560976
						if( pvi_ema > -1.03191 )
							if( verde <= 117.292 )
								ret := 0.900000 // buy
							if( verde > 117.292 )
								ret := -0.380000
					if( media > 101.902 )
						if( azul <= 20.4923 )
							if( azul <= 9.32934 )
								ret := 0.542056
							if( azul > 9.32934 )
								ret := 0.003436
						if( azul > 20.4923 )
							if( xrsi <= 74.6993 )
								ret := -0.307692
							if( xrsi > 74.6993 )
								ret := 0.628916
				if( source > 17.9592 )
					if( media <= 108.658 )
						if( media_azul <= 75.6254 )
							if( azul <= 39.7375 )
								ret := 0.700000 // buy
							if( azul > 39.7375 )
								ret := 0.205128
						if( media_azul > 75.6254 )
							if( verde_mean <= 172.06 )
								ret := 0.026316
							if( verde_mean > 172.06 )
								ret := -0.511111
					if( media > 108.658 )
						if( pvimin <= -1.18642 )
							if( pvim <= -1.1823 )
								ret := -0.600000
							if( pvim > -1.1823 )
								ret := 0.866667 // buy
						if( pvimin > -1.18642 )
							if( xmf <= 94.0259 )
								ret := -0.304462
							if( xmf > 94.0259 )
								ret := -0.852459 // sell
	
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
float op_operation = decision_tree_0_U_1Min_8fa5ee84(nvi, nvi_ema, marron_mean, source, azul, verde_azul, verde_mean, xmf, pvimin, stoc, media, tprice, marron, pvim, pvimax, xrsi, oscp, pvi, nvimax, nvimin, verde, verde_media, azul_mean, nvim, BollOsc, pvi_ema, media_azul)

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


