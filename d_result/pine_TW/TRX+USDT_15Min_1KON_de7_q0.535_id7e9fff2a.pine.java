//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: TRXUSDT_15Min_1KON_7e9fff2a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_15Min_1KON_7e9fff2a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_15Min_7e9fff2a(nvimin, azul, nvim, marron_mean, marron, nvimax, pvi, pvi_ema, oscp, verde, source, stoc, verde_mean, xrsi, media, xmf, tprice, pvimin, media_azul, verde_media, BollOsc, pvimax, nvi_ema, azul_mean, pvim, nvi, verde_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( source <= 0.065235 )
		if( verde <= 26.4897 )
			if( azul_mean <= -15.5897 )
				if( marron_mean <= -13.2675 )
					if( verde_mean <= -46.0374 )
						if( marron_mean <= -21.1786 )
							if( nvimin <= -0.574959 )
								ret := 1.000000 // buy
							if( nvimin > -0.574959 )
								ret := -0.562500
						if( marron_mean > -21.1786 )
							if( xmf <= 17.0131 )
								ret := -0.787037 // sell
							if( xmf > 17.0131 )
								ret := 0.666667
					if( verde_mean > -46.0374 )
						if( verde_media <= -27.4607 )
							if( verde <= -34.9229 )
								ret := 0.500000
							if( verde > -34.9229 )
								ret := 1.000000 // buy
						if( verde_media > -27.4607 )
							ret := 0.000000
				if( marron_mean > -13.2675 )
					if( oscp <= -2.77686 )
						if( marron <= 5.51464 )
							if( verde <= -38.0177 )
								ret := -0.031088
							if( verde > -38.0177 )
								ret := 0.410596
						if( marron > 5.51464 )
							if( verde <= 9.88048 )
								ret := -0.238916
							if( verde > 9.88048 )
								ret := 0.262712
					if( oscp > -2.77686 )
						if( verde_mean <= 7.07901 )
							if( verde_mean <= -3.85142 )
								ret := -0.100000
							if( verde_mean > -3.85142 )
								ret := 0.769231 // buy
						if( verde_mean > 7.07901 )
							if( azul <= -39.3701 )
								ret := 0.166667
							if( azul > -39.3701 )
								ret := -0.586957
			if( azul_mean > -15.5897 )
				if( nvimax <= -0.394473 )
					if( azul <= 2.19823 )
						if( verde_media <= -97.8918 )
							if( verde_mean <= -68.442 )
								ret := 0.576923
							if( verde_mean > -68.442 )
								ret := -0.482143
						if( verde_media > -97.8918 )
							if( oscp <= -14.1767 )
								ret := 0.420863
							if( oscp > -14.1767 )
								ret := 0.151079
					if( azul > 2.19823 )
						if( source <= 0.051927 )
							if( marron <= 13.2585 )
								ret := -0.650602
							if( marron > 13.2585 )
								ret := 0.080882
						if( source > 0.051927 )
							if( media_azul <= 13.4577 )
								ret := 0.213675
							if( media_azul > 13.4577 )
								ret := 0.041667
				if( nvimax > -0.394473 )
					if( tprice <= 0.057958 )
						if( nvi_ema <= -0.27478 )
							if( tprice <= 0.056992 )
								ret := 0.678571
							if( tprice > 0.056992 )
								ret := -0.120000
						if( nvi_ema > -0.27478 )
							if( pvim <= 0.381826 )
								ret := 0.666667
							if( pvim > 0.381826 )
								ret := -0.888889 // sell
					if( tprice > 0.057958 )
						if( marron_mean <= -1.1212 )
							if( azul <= -27.8304 )
								ret := -0.111111
							if( azul > -27.8304 )
								ret := 0.782609 // buy
						if( marron_mean > -1.1212 )
							if( verde_media <= -7.53977 )
								ret := 0.286004
							if( verde_media > -7.53977 )
								ret := 0.611940
		if( verde > 26.4897 )
			if( pvi <= 0.542512 )
				if( media <= 35.4719 )
					if( xmf <= 43.6739 )
						if( azul <= -4.68261 )
							if( pvi_ema <= 0.541205 )
								ret := 0.978261 // buy
							if( pvi_ema > 0.541205 )
								ret := 0.500000
						if( azul > -4.68261 )
							if( verde_mean <= 15.9113 )
								ret := -0.307692
							if( verde_mean > 15.9113 )
								ret := 0.631579
					if( xmf > 43.6739 )
						if( media <= 26.6467 )
							if( verde_mean <= 36.0376 )
								ret := -0.500000
							if( verde_mean > 36.0376 )
								ret := -1.000000 // sell
						if( media > 26.6467 )
							if( xmf <= 53.3509 )
								ret := -0.138889
							if( xmf > 53.3509 )
								ret := 0.733333 // buy
				if( media > 35.4719 )
					if( media_azul <= 7.91758 )
						if( media <= 43.8896 )
							if( verde <= 45.0707 )
								ret := -0.250000
							if( verde > 45.0707 )
								ret := 0.800000 // buy
						if( media > 43.8896 )
							if( pvimin <= 0.418404 )
								ret := -0.500000
							if( pvimin > 0.418404 )
								ret := -1.000000 // sell
					if( media_azul > 7.91758 )
						if( azul_mean <= -54.4918 )
							if( xrsi <= 44.17 )
								ret := -0.571429
							if( xrsi > 44.17 )
								ret := -1.000000 // sell
						if( azul_mean > -54.4918 )
							if( azul <= -8.59704 )
								ret := 0.342491
							if( azul > -8.59704 )
								ret := 0.059529
			if( pvi > 0.542512 )
				if( verde_azul <= 126.872 )
					if( verde_mean <= 82.4616 )
						if( azul <= -67.3758 )
							ret := 1.000000 // buy
						if( azul > -67.3758 )
							if( azul_mean <= 36.7063 )
								ret := -0.049520
							if( azul_mean > 36.7063 )
								ret := 0.320285
					if( verde_mean > 82.4616 )
						if( nvimax <= -0.70769 )
							if( oscp <= 6.27168 )
								ret := 0.082418
							if( oscp > 6.27168 )
								ret := 0.608069
						if( nvimax > -0.70769 )
							if( source <= 0.058829 )
								ret := 0.181197
							if( source > 0.058829 )
								ret := -0.023741
				if( verde_azul > 126.872 )
					if( azul <= -52.3535 )
						if( verde <= 143.833 )
							if( media_azul <= 143.696 )
								ret := 0.736842 // buy
							if( media_azul > 143.696 )
								ret := -0.327731
						if( verde > 143.833 )
							if( tprice <= 0.053355 )
								ret := -0.800000 // sell
							if( tprice > 0.053355 )
								ret := 0.700000 // buy
					if( azul > -52.3535 )
						if( xmf <= 59.7243 )
							if( verde_media <= 32.3634 )
								ret := -0.188119
							if( verde_media > 32.3634 )
								ret := 0.254464
						if( xmf > 59.7243 )
							if( media <= 120.017 )
								ret := -0.223200
							if( media > 120.017 )
								ret := 0.518519
	if( source > 0.065235 )
		if( xrsi <= 29.9742 )
			if( source <= 0.102134 )
				if( media <= -2.42539 )
					if( azul <= -78.9331 )
						if( verde_mean <= -107.442 )
							ret := -0.500000
						if( verde_mean > -107.442 )
							ret := -1.000000 // sell
					if( azul > -78.9331 )
						if( media_azul <= 43.9208 )
							if( marron <= -5.56081 )
								ret := 0.849558 // buy
							if( marron > -5.56081 )
								ret := 0.378378
						if( media_azul > 43.9208 )
							if( verde_mean <= -66.5948 )
								ret := 1.000000 // buy
							if( verde_mean > -66.5948 )
								ret := -0.312500
				if( media > -2.42539 )
					if( azul <= -5.72742 )
						if( tprice <= 0.081425 )
							if( verde <= -37.8753 )
								ret := -0.212000
							if( verde > -37.8753 )
								ret := 0.033408
						if( tprice > 0.081425 )
							if( oscp <= -77.1002 )
								ret := 0.586957
							if( oscp > -77.1002 )
								ret := -0.316886
					if( azul > -5.72742 )
						if( oscp <= -116.387 )
							if( tprice <= 0.067749 )
								ret := 0.428571
							if( tprice > 0.067749 )
								ret := 0.842105 // buy
						if( oscp > -116.387 )
							if( pvim <= 1.03111 )
								ret := 0.073622
							if( pvim > 1.03111 )
								ret := -0.313043
			if( source > 0.102134 )
				if( azul_mean <= 3.79543 )
					if( verde_media <= -143.743 )
						if( pvim <= -0.689463 )
							if( verde_media <= -188.192 )
								ret := 0.571429
							if( verde_media > -188.192 )
								ret := -0.100000
						if( pvim > -0.689463 )
							if( tprice <= 0.108096 )
								ret := 0.333333
							if( tprice > 0.108096 )
								ret := 0.891892 // buy
					if( verde_media > -143.743 )
						if( xmf <= 14.0045 )
							if( stoc <= 4.10923 )
								ret := 0.666667
							if( stoc > 4.10923 )
								ret := -0.448171
						if( xmf > 14.0045 )
							if( verde_mean <= -77.9177 )
								ret := 0.487179
							if( verde_mean > -77.9177 )
								ret := -0.227606
				if( azul_mean > 3.79543 )
					if( verde_mean <= -47.1302 )
						if( marron_mean <= 22.8182 )
							if( xmf <= 6.26666 )
								ret := 0.600000
							if( xmf > 6.26666 )
								ret := -0.440367
						if( marron_mean > 22.8182 )
							if( verde_azul <= -161.495 )
								ret := 0.750000 // buy
							if( verde_azul > -161.495 )
								ret := 1.000000 // buy
					if( verde_mean > -47.1302 )
						if( verde <= -33.6093 )
							if( media_azul <= 31.5561 )
								ret := 0.385057
							if( media_azul > 31.5561 )
								ret := 0.000000
						if( verde > -33.6093 )
							if( verde_azul <= -44.2367 )
								ret := -0.366667
							if( verde_azul > -44.2367 )
								ret := -0.003333
		if( xrsi > 29.9742 )
			if( nvi <= -0.101454 )
				if( verde_mean <= 125.278 )
					if( oscp <= -4.75397 )
						if( source <= 0.080721 )
							if( pvimin <= 1.00088 )
								ret := 0.112366
							if( pvimin > 1.00088 )
								ret := -0.074113
						if( source > 0.080721 )
							if( verde <= 27.5467 )
								ret := -0.351485
							if( verde > 27.5467 )
								ret := 0.049793
					if( oscp > -4.75397 )
						if( verde_media <= -2.3138 )
							if( tprice <= 0.073863 )
								ret := -0.102745
							if( tprice > 0.073863 )
								ret := -0.366530
						if( verde_media > -2.3138 )
							if( xmf <= 53.5472 )
								ret := 0.036966
							if( xmf > 53.5472 )
								ret := -0.069868
				if( verde_mean > 125.278 )
					if( nvi_ema <= -0.810028 )
						if( pvimin <= 1.01511 )
							if( marron_mean <= 124.278 )
								ret := -0.240964
							if( marron_mean > 124.278 )
								ret := 0.789474 // buy
						if( pvimin > 1.01511 )
							if( source <= 0.069903 )
								ret := 0.519685
							if( source > 0.069903 )
								ret := -0.375000
					if( nvi_ema > -0.810028 )
						if( azul <= -17.5719 )
							if( stoc <= 83.5896 )
								ret := -0.181481
							if( stoc > 83.5896 )
								ret := 0.570093
						if( azul > -17.5719 )
							if( marron_mean <= 108.458 )
								ret := -0.563715
							if( marron_mean > 108.458 )
								ret := -0.251816
			if( nvi > -0.101454 )
				if( stoc <= 84.8488 )
					if( marron <= 113.5 )
						if( verde <= 164.748 )
							if( media <= 56.4686 )
								ret := 0.016657
							if( media > 56.4686 )
								ret := -0.033497
						if( verde > 164.748 )
							if( verde_media <= 75.4762 )
								ret := -0.320000
							if( verde_media > 75.4762 )
								ret := 0.619048
					if( marron > 113.5 )
						if( oscp <= 36.4979 )
							if( nvi <= 0.19628 )
								ret := -0.138462
							if( nvi > 0.19628 )
								ret := 0.348066
						if( oscp > 36.4979 )
							if( xrsi <= 73.6969 )
								ret := 0.233871
							if( xrsi > 73.6969 )
								ret := -0.174629
				if( stoc > 84.8488 )
					if( source <= 0.127072 )
						if( pvimin <= 0.216022 )
							if( nvimin <= -0.005789 )
								ret := 0.635036
							if( nvimin > -0.005789 )
								ret := 0.052755
						if( pvimin > 0.216022 )
							if( azul_mean <= 17.0544 )
								ret := -0.050817
							if( azul_mean > 17.0544 )
								ret := -0.306998
					if( source > 0.127072 )
						if( verde_media <= 23.517 )
							if( verde_azul <= 134.868 )
								ret := 0.115875
							if( verde_azul > 134.868 )
								ret := -0.381818
						if( verde_media > 23.517 )
							if( xrsi <= 79.3049 )
								ret := 0.218254
							if( xrsi > 79.3049 )
								ret := 0.507071
	
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
float op_operation = decision_tree_0_TRXUSDT_15Min_7e9fff2a(nvimin, azul, nvim, marron_mean, marron, nvimax, pvi, pvi_ema, oscp, verde, source, stoc, verde_mean, xrsi, media, xmf, tprice, pvimin, media_azul, verde_media, BollOsc, pvimax, nvi_ema, azul_mean, pvim, nvi, verde_azul)

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


