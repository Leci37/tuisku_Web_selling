//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: UBER_1Min_1KON_d10b0034 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_1KON_d10b0034", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_d10b0034(nvi, nvi_ema, marron_mean, source, azul, verde_azul, verde_mean, xmf, pvimin, stoc, media, tprice, marron, pvim, pvimax, xrsi, oscp, pvi, nvimax, nvimin, verde, verde_media, azul_mean, nvim, BollOsc, pvi_ema, media_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( oscp <= -21.5743 )
		if( xrsi <= 53.9419 )
			if( xrsi <= 22.2395 )
				if( pvi_ema <= -0.325671 )
					if( oscp <= -42.4356 )
						if( azul <= -5.67403 )
							ret := 1.000000 // buy
						if( azul > -5.67403 )
							ret := 0.444444
					if( oscp > -42.4356 )
						if( verde_media <= -39.9533 )
							ret := 0.083333
						if( verde_media > -39.9533 )
							ret := 0.538462
				if( pvi_ema > -0.325671 )
					if( verde_mean <= -185.521 )
						ret := 1.000000 // buy
					if( verde_mean > -185.521 )
						if( verde <= -146.31 )
							if( oscp <= -187.038 )
								ret := -0.100000
							if( oscp > -187.038 )
								if( source <= 69.2132 )
									ret := -0.976190 // sell
								if( source > 69.2132 )
									ret := -0.700000 // sell
						if( verde > -146.31 )
							if( nvi_ema <= 0.176163 )
								if( marron <= -12.3996 )
									ret := -0.260274
								if( marron > -12.3996 )
									ret := 0.215457
							if( nvi_ema > 0.176163 )
								if( nvi <= 0.183595 )
									ret := -0.649718
								if( nvi > 0.183595 )
									ret := -0.107784
			if( xrsi > 22.2395 )
				if( nvim <= 0.233403 )
					if( media_azul <= 38.6524 )
						if( pvimin <= -0.094306 )
							if( source <= 63.2302 )
								if( BollOsc <= -33.4533 )
									ret := 0.054545
								if( BollOsc > -33.4533 )
									ret := -0.735849 // sell
							if( source > 63.2302 )
								if( verde_azul <= -22.6934 )
									ret := 0.267770
								if( verde_azul > -22.6934 )
									ret := 0.020243
						if( pvimin > -0.094306 )
							if( marron <= -3.3539 )
								if( verde_mean <= -14.5044 )
									ret := 0.545455
								if( verde_mean > -14.5044 )
									ret := 0.923077 // buy
							if( marron > -3.3539 )
								if( media <= 36.9552 )
									ret := -0.404762
								if( media > 36.9552 )
									ret := 0.255319
					if( media_azul > 38.6524 )
						if( marron <= -6.28421 )
							if( azul <= -67.1891 )
								ret := -0.428571
							if( azul > -67.1891 )
								if( source <= 71.4967 )
									ret := 0.820513 // buy
								if( source > 71.4967 )
									ret := 0.304348
						if( marron > -6.28421 )
							if( stoc <= 69.0821 )
								if( source <= 69.672 )
									ret := 0.320271
								if( source > 69.672 )
									ret := 0.084848
							if( stoc > 69.0821 )
								if( pvimin <= -0.109938 )
									ret := 0.773050 // buy
								if( pvimin > -0.109938 )
									ret := -0.071429
				if( nvim > 0.233403 )
					if( xmf <= 52.4909 )
						if( pvimin <= -0.428441 )
							if( verde_azul <= -4.78893 )
								ret := 1.000000 // buy
							if( verde_azul > -4.78893 )
								ret := 0.357143
						if( pvimin > -0.428441 )
							if( oscp <= -100.973 )
								if( xrsi <= 41.6489 )
									ret := 0.428571
								if( xrsi > 41.6489 )
									ret := 1.000000 // buy
							if( oscp > -100.973 )
								if( marron_mean <= 16.8332 )
									ret := 0.137276
								if( marron_mean > 16.8332 )
									ret := -0.104343
					if( xmf > 52.4909 )
						if( media_azul <= 78.8937 )
							if( pvim <= -0.189364 )
								if( nvim <= 0.251952 )
									ret := 0.075949
								if( nvim > 0.251952 )
									ret := 0.589404
							if( pvim > -0.189364 )
								if( azul <= -18.8021 )
									ret := -1.000000 // sell
								if( azul > -18.8021 )
									ret := 0.172414
						if( media_azul > 78.8937 )
							if( xmf <= 55.4308 )
								ret := 0.272727
							if( xmf > 55.4308 )
								if( marron <= 22.434 )
									ret := 1.000000 // buy
								if( marron > 22.434 )
									ret := 0.804878 // buy
		if( xrsi > 53.9419 )
			if( azul_mean <= 11.5317 )
				if( marron <= 61.1378 )
					if( nvimin <= 0.185882 )
						ret := 1.000000 // buy
					if( nvimin > 0.185882 )
						ret := 0.888889 // buy
				if( marron > 61.1378 )
					if( source <= 70.585 )
						if( pvimin <= -0.19209 )
							ret := 0.222222
						if( pvimin > -0.19209 )
							if( verde_media <= -31.5481 )
								ret := 0.833333 // buy
							if( verde_media > -31.5481 )
								ret := 1.000000 // buy
					if( source > 70.585 )
						if( tprice <= 72.6003 )
							ret := -0.363636
						if( tprice > 72.6003 )
							ret := 0.454545
			if( azul_mean > 11.5317 )
				if( verde_azul <= -61.4932 )
					if( oscp <= -132.76 )
						ret := 0.000000
					if( oscp > -132.76 )
						if( marron <= 77.1845 )
							if( verde_media <= -94.9123 )
								ret := -0.222222
							if( verde_media > -94.9123 )
								if( azul <= 84.8054 )
									ret := -0.625000
								if( azul > 84.8054 )
									ret := -1.000000 // sell
						if( marron > 77.1845 )
							if( verde_media <= -60.4615 )
								ret := -1.000000 // sell
							if( verde_media > -60.4615 )
								ret := -0.923077 // sell
				if( verde_azul > -61.4932 )
					if( verde_mean <= 53.4147 )
						if( nvi <= 0.295329 )
							if( xrsi <= 61.184 )
								if( nvi <= 0.167736 )
									ret := -0.674699
								if( nvi > 0.167736 )
									ret := -0.296610
							if( xrsi > 61.184 )
								if( pvimax <= -0.238112 )
									ret := -1.000000 // sell
								if( pvimax > -0.238112 )
									ret := -0.733333 // sell
						if( nvi > 0.295329 )
							ret := 0.333333
					if( verde_mean > 53.4147 )
						if( source <= 66.0488 )
							if( nvimax <= 0.111258 )
								ret := 0.071429
							if( nvimax > 0.111258 )
								if( source <= 65.2184 )
									ret := 0.533333
								if( source > 65.2184 )
									ret := 0.888889 // buy
						if( source > 66.0488 )
							if( azul_mean <= 18.5519 )
								if( nvimax <= 0.217297 )
									ret := -0.733333 // sell
								if( nvimax > 0.217297 )
									ret := 0.000000
							if( azul_mean > 18.5519 )
								if( xmf <= 60.4123 )
									ret := 0.356164
								if( xmf > 60.4123 )
									ret := -0.400000
	if( oscp > -21.5743 )
		if( marron <= 116.192 )
			if( nvimax <= 0.319627 )
				if( media_azul <= 172.552 )
					if( verde_media <= -17.9609 )
						if( xmf <= 28.529 )
							if( verde <= 36.4405 )
								if( pvi <= -0.189383 )
									ret := 0.300357
								if( pvi > -0.189383 )
									ret := 0.077391
							if( verde > 36.4405 )
								if( verde_azul <= 41.1447 )
									ret := 0.007692
								if( verde_azul > 41.1447 )
									ret := -0.597122
						if( xmf > 28.529 )
							if( pvi <= -0.270483 )
								if( pvimax <= -0.456834 )
									ret := 0.456522
								if( pvimax > -0.456834 )
									ret := -0.129534
							if( pvi > -0.270483 )
								if( xmf <= 79.5709 )
									ret := 0.029409
								if( xmf > 79.5709 )
									ret := 0.529915
					if( verde_media > -17.9609 )
						if( azul <= 26.1764 )
							if( pvi_ema <= -0.509385 )
								if( azul <= 6.9509 )
									ret := 0.909091 // buy
								if( azul > 6.9509 )
									ret := 1.000000 // buy
							if( pvi_ema > -0.509385 )
								if( verde <= 129.377 )
									ret := -0.007985
								if( verde > 129.377 )
									ret := -0.119298
						if( azul > 26.1764 )
							if( marron_mean <= 108.668 )
								if( tprice <= 58.9214 )
									ret := 0.376471
								if( tprice > 58.9214 )
									ret := -0.187870
							if( marron_mean > 108.668 )
								if( xrsi <= 73.4407 )
									ret := 0.403846
								if( xrsi > 73.4407 )
									ret := -0.167539
				if( media_azul > 172.552 )
					if( verde <= 95.5421 )
						if( tprice <= 72.1623 )
							if( oscp <= 12.7836 )
								if( azul <= -131.061 )
									ret := 0.954545 // buy
								if( azul > -131.061 )
									ret := 0.612903
							if( oscp > 12.7836 )
								if( verde_media <= 3.22643 )
									ret := 1.000000 // buy
								if( verde_media > 3.22643 )
									ret := 0.900000 // buy
						if( tprice > 72.1623 )
							if( stoc <= 46.6054 )
								ret := -0.300000
							if( stoc > 46.6054 )
								if( xmf <= 37.0669 )
									ret := 0.625000
								if( xmf > 37.0669 )
									ret := 1.000000 // buy
					if( verde > 95.5421 )
						if( xrsi <= 56.5508 )
							if( azul_mean <= -36.7512 )
								if( pvi_ema <= -0.170554 )
									ret := 0.755102 // buy
								if( pvi_ema > -0.170554 )
									ret := 0.266667
							if( azul_mean > -36.7512 )
								if( oscp <= 38.3058 )
									ret := 1.000000 // buy
								if( oscp > 38.3058 )
									ret := 0.800000 // buy
						if( xrsi > 56.5508 )
							if( verde_media <= 21.8256 )
								if( nvimin <= 0.27805 )
									ret := -0.600000
								if( nvimin > 0.27805 )
									ret := -1.000000 // sell
							if( verde_media > 21.8256 )
								if( nvimax <= 0.219546 )
									ret := -0.500000
								if( nvimax > 0.219546 )
									ret := 0.578947
			if( nvimax > 0.319627 )
				if( pvi <= -0.125387 )
					if( media <= 51.4538 )
						if( source <= 81.8368 )
							if( pvi_ema <= -0.128359 )
								if( xrsi <= 34.7594 )
									ret := 0.400000
								if( xrsi > 34.7594 )
									ret := -0.280000
							if( pvi_ema > -0.128359 )
								ret := -0.714286 // sell
						if( source > 81.8368 )
							if( marron <= 32.5383 )
								ret := 1.000000 // buy
							if( marron > 32.5383 )
								ret := 0.600000
					if( media > 51.4538 )
						if( tprice <= 81.965 )
							ret := -0.263158
						if( tprice > 81.965 )
							if( verde_mean <= 80.4279 )
								ret := -1.000000 // sell
							if( verde_mean > 80.4279 )
								ret := -0.750000 // sell
				if( pvi > -0.125387 )
					if( oscp <= 4.15525 )
						if( azul_mean <= -2.34106 )
							if( nvimax <= 0.319872 )
								ret := 0.315789
							if( nvimax > 0.319872 )
								if( media_azul <= 99.9311 )
									ret := -0.555556
								if( media_azul > 99.9311 )
									ret := -0.111111
						if( azul_mean > -2.34106 )
							if( media <= 96.406 )
								if( azul_mean <= 12.7697 )
									ret := 0.866667 // buy
								if( azul_mean > 12.7697 )
									ret := 0.250000
							if( media > 96.406 )
								ret := -0.333333
					if( oscp > 4.15525 )
						if( xrsi <= 77.8802 )
							if( media <= 103.615 )
								if( nvi_ema <= 0.317827 )
									ret := 0.895604 // buy
								if( nvi_ema > 0.317827 )
									ret := 0.351852
							if( media > 103.615 )
								ret := -0.263158
						if( xrsi > 77.8802 )
							ret := -0.777778 // sell
		if( marron > 116.192 )
			if( media_azul <= 35.2006 )
				if( pvi <= -0.242139 )
					if( verde <= 129.823 )
						ret := 0.692308
					if( verde > 129.823 )
						if( source <= 64.2908 )
							ret := 0.666667
						if( source > 64.2908 )
							if( nvi_ema <= 0.246911 )
								ret := -1.000000 // sell
							if( nvi_ema > 0.246911 )
								ret := -0.666667
				if( pvi > -0.242139 )
					if( pvi_ema <= -0.168924 )
						if( azul <= 135.761 )
							if( pvi <= -0.186824 )
								if( nvimin <= 0.266941 )
									ret := -0.828125 // sell
								if( nvimin > 0.266941 )
									ret := -0.312500
							if( pvi > -0.186824 )
								if( media_azul <= -7.44077 )
									ret := -0.666667
								if( media_azul > -7.44077 )
									ret := -0.234043
						if( azul > 135.761 )
							ret := 0.200000
					if( pvi_ema > -0.168924 )
						if( marron <= 126.239 )
							if( xrsi <= 66.7943 )
								ret := -1.000000 // sell
							if( xrsi > 66.7943 )
								if( pvimin <= -0.158966 )
									ret := -0.923077 // sell
								if( pvimin > -0.158966 )
									ret := -0.257143
						if( marron > 126.239 )
							if( nvim <= 0.135227 )
								if( nvim <= 0.01945 )
									ret := -0.888889 // sell
								if( nvim > 0.01945 )
									ret := -1.000000 // sell
							if( nvim > 0.135227 )
								ret := -0.705882 // sell
			if( media_azul > 35.2006 )
				if( nvi_ema <= 0.037894 )
					if( oscp <= 7.20277 )
						if( marron_mean <= 117.211 )
							ret := -0.842105 // sell
						if( marron_mean > 117.211 )
							ret := 0.400000
					if( oscp > 7.20277 )
						if( stoc <= 94.1746 )
							if( verde_media <= 58.1686 )
								if( media <= 113.715 )
									ret := 0.790000 // buy
								if( media > 113.715 )
									ret := 0.357143
							if( verde_media > 58.1686 )
								if( tprice <= 70.2787 )
									ret := 0.312500
								if( tprice > 70.2787 )
									ret := -0.409091
						if( stoc > 94.1746 )
							if( xmf <= 88.431 )
								ret := -1.000000 // sell
							if( xmf > 88.431 )
								ret := -0.750000 // sell
				if( nvi_ema > 0.037894 )
					if( marron_mean <= 135.544 )
						if( source <= 68.3261 )
							if( nvi <= 0.095501 )
								if( oscp <= 49.3713 )
									ret := 0.023041
								if( oscp > 49.3713 )
									ret := -0.764706 // sell
							if( nvi > 0.095501 )
								if( azul <= -0.828916 )
									ret := -0.142077
								if( azul > -0.828916 )
									ret := -0.432877
						if( source > 68.3261 )
							if( pvi <= -0.295528 )
								if( tprice <= 69.2507 )
									ret := 0.117647
								if( tprice > 69.2507 )
									ret := 0.823529 // buy
							if( pvi > -0.295528 )
								if( oscp <= 12.1168 )
									ret := 0.161585
								if( oscp > 12.1168 )
									ret := -0.200574
					if( marron_mean > 135.544 )
						if( pvim <= -0.173415 )
							if( nvimax <= 0.216634 )
								ret := -0.090909
							if( nvimax > 0.216634 )
								ret := -1.000000 // sell
						if( pvim > -0.173415 )
							if( tprice <= 76.3405 )
								ret := 0.583333
							if( tprice > 76.3405 )
								ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_UBER_1Min_d10b0034(nvi, nvi_ema, marron_mean, source, azul, verde_azul, verde_mean, xmf, pvimin, stoc, media, tprice, marron, pvim, pvimax, xrsi, oscp, pvi, nvimax, nvimin, verde, verde_media, azul_mean, nvim, BollOsc, pvi_ema, media_azul)

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


