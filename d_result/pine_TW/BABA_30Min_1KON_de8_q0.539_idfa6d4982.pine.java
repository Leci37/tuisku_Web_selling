//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: BABA_30Min_1KON_fa6d4982 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BABA_30Min_1KON_fa6d4982", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BABA_30Min_fa6d4982(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( marron_mean <= -7.77415 )
		if( pvimin <= -0.005026 )
			if( verde_azul <= -49.062 )
				ret := 0.000000
			if( verde_azul > -49.062 )
				if( stoc <= 17.4341 )
					if( media <= -2.85153 )
						ret := 0.000000
					if( media > -2.85153 )
						if( oscp <= -8.26917 )
							if( pvimax <= -0.009251 )
								if( azul_mean <= 3.1188 )
									ret := 0.975610 // buy
								if( azul_mean > 3.1188 )
									ret := 0.538462
							if( pvimax > -0.009251 )
								if( verde_azul <= -0.646033 )
									ret := 0.871795 // buy
								if( verde_azul > -0.646033 )
									ret := 0.083333
						if( oscp > -8.26917 )
							ret := -0.250000
				if( stoc > 17.4341 )
					if( xmf <= 14.4193 )
						ret := -0.181818
					if( xmf > 14.4193 )
						if( source <= 111.871 )
							ret := 0.500000
						if( source > 111.871 )
							ret := 1.000000 // buy
		if( pvimin > -0.005026 )
			if( verde_azul <= -5.00026 )
				if( verde_media <= -71.5517 )
					if( verde <= -92.1723 )
						if( pvi_ema <= 0.289218 )
							ret := -0.230769
						if( pvi_ema > 0.289218 )
							if( verde_azul <= -117.365 )
								ret := -0.125000
							if( verde_azul > -117.365 )
								if( pvi_ema <= 0.563021 )
									ret := 0.930233 // buy
								if( pvi_ema > 0.563021 )
									ret := 0.555556
					if( verde > -92.1723 )
						if( azul <= 11.5685 )
							if( nvi_ema <= 0.417793 )
								if( verde_mean <= -50.1683 )
									ret := -0.166667
								if( verde_mean > -50.1683 )
									ret := -0.875000 // sell
							if( nvi_ema > 0.417793 )
								if( oscp <= -63.7711 )
									ret := -0.583333
								if( oscp > -63.7711 )
									ret := 0.257143
						if( azul > 11.5685 )
							if( oscp <= -68.4072 )
								if( pvimin <= 0.340731 )
									ret := -1.000000 // sell
								if( pvimin > 0.340731 )
									ret := -0.800000 // sell
							if( oscp > -68.4072 )
								ret := -0.500000
				if( verde_media > -71.5517 )
					if( nvim <= 1.0978 )
						if( media_azul <= 17.1559 )
							if( BollOsc <= -38.395 )
								if( stoc <= 4.90659 )
									ret := 0.147059
								if( stoc > 4.90659 )
									ret := 0.626459
							if( BollOsc > -38.395 )
								if( pvimin <= 0.370114 )
									ret := 0.391304
								if( pvimin > 0.370114 )
									ret := -0.583333
						if( media_azul > 17.1559 )
							if( azul <= -32.765 )
								if( verde <= -59.7476 )
									ret := 0.555556
								if( verde > -59.7476 )
									ret := 1.000000 // buy
							if( azul > -32.765 )
								if( oscp <= -18.9197 )
									ret := 0.028571
								if( oscp > -18.9197 )
									ret := 0.603774
					if( nvim > 1.0978 )
						if( tprice <= 230.031 )
							if( pvimax <= 0.281473 )
								ret := 0.000000
							if( pvimax > 0.281473 )
								ret := -0.500000
						if( tprice > 230.031 )
							ret := 0.066667
			if( verde_azul > -5.00026 )
				if( pvimax <= 0.168934 )
					if( xmf <= 8.70006 )
						ret := 0.944444 // buy
					if( xmf > 8.70006 )
						ret := 0.437500
				if( pvimax > 0.168934 )
					if( pvi_ema <= 0.352566 )
						if( azul_mean <= -21.0902 )
							if( media <= -0.107202 )
								ret := 0.600000
							if( media > -0.107202 )
								if( azul <= -68.1456 )
									ret := -0.909091 // sell
								if( azul > -68.1456 )
									ret := -0.507246
						if( azul_mean > -21.0902 )
							if( nvimin <= 0.557946 )
								ret := -0.166667
							if( nvimin > 0.557946 )
								ret := 0.533333
					if( pvi_ema > 0.352566 )
						if( pvimin <= 0.523121 )
							if( BollOsc <= -52.3155 )
								if( nvi <= 0.573011 )
									ret := 0.666667
								if( nvi > 0.573011 )
									ret := 0.058824
							if( BollOsc > -52.3155 )
								if( nvi <= 0.564492 )
									ret := -0.533333
								if( nvi > 0.564492 )
									ret := 0.050000
						if( pvimin > 0.523121 )
							ret := -0.800000 // sell
	if( marron_mean > -7.77415 )
		if( media_azul <= 65.7071 )
			if( nvim <= 0.923485 )
				if( pvim <= -0.252143 )
					if( media <= 66.4126 )
						if( azul <= 37.5599 )
							if( stoc <= 85.0868 )
								if( media <= 11.635 )
									ret := 0.894737 // buy
								if( media > 11.635 )
									ret := 0.351585
							if( stoc > 85.0868 )
								ret := -1.000000 // sell
						if( azul > 37.5599 )
							ret := -1.000000 // sell
					if( media > 66.4126 )
						if( media <= 70.49 )
							ret := 1.000000 // buy
						if( media > 70.49 )
							ret := 0.900000 // buy
				if( pvim > -0.252143 )
					if( azul <= 6.82522 )
						if( media_azul <= 7.5771 )
							if( xmf <= 6.39234 )
								if( marron <= -1.31134 )
									ret := 0.000000
								if( marron > -1.31134 )
									ret := -0.700000 // sell
							if( xmf > 6.39234 )
								if( stoc <= 14.0475 )
									ret := 0.531915
								if( stoc > 14.0475 )
									ret := 0.154930
						if( media_azul > 7.5771 )
							if( nvi <= 0.654875 )
								if( nvi <= 0.332471 )
									ret := 0.056853
								if( nvi > 0.332471 )
									ret := -0.043019
							if( nvi > 0.654875 )
								if( verde_media <= 10.9517 )
									ret := 0.132376
								if( verde_media > 10.9517 )
									ret := -0.043810
					if( azul > 6.82522 )
						if( xmf <= 54.8148 )
							if( media <= 33.5252 )
								if( pvimax <= 0.092884 )
									ret := -0.333333
								if( pvimax > 0.092884 )
									ret := -0.041008
							if( media > 33.5252 )
								if( marron <= 97.4219 )
									ret := 0.030919
								if( marron > 97.4219 )
									ret := -0.322727
						if( xmf > 54.8148 )
							if( verde <= 174.584 )
								if( nvim <= 0.866613 )
									ret := -0.143192
								if( nvim > 0.866613 )
									ret := -0.492958
							if( verde > 174.584 )
								if( tprice <= 93.6343 )
									ret := 0.496454
								if( tprice > 93.6343 )
									ret := -0.105263
			if( nvim > 0.923485 )
				if( media <= 24.0169 )
					if( stoc <= 11.8456 )
						if( marron_mean <= 2.84961 )
							if( media_azul <= 28.2068 )
								if( media_azul <= -22.3203 )
									ret := -0.857143 // sell
								if( media_azul > -22.3203 )
									ret := 0.329545
							if( media_azul > 28.2068 )
								if( azul <= -30.1103 )
									ret := 0.148148
								if( azul > -30.1103 )
									ret := -0.647887
						if( marron_mean > 2.84961 )
							if( azul <= 26.9209 )
								if( pvimin <= 0.137248 )
									ret := -0.451613
								if( pvimin > 0.137248 )
									ret := -0.681682
							if( azul > 26.9209 )
								ret := 0.615385
					if( stoc > 11.8456 )
						if( pvi_ema <= 0.197579 )
							if( xmf <= 2.68825 )
								if( pvimin <= -0.207131 )
									ret := 0.333333
								if( pvimin > -0.207131 )
									ret := -0.805556 // sell
							if( xmf > 2.68825 )
								if( tprice <= 168.425 )
									ret := -0.099711
								if( tprice > 168.425 )
									ret := -0.467811
						if( pvi_ema > 0.197579 )
							if( nvi_ema <= 1.10038 )
								if( source <= 266.613 )
									ret := 0.344828
								if( source > 266.613 )
									ret := -0.840000 // sell
							if( nvi_ema > 1.10038 )
								if( marron <= -5.16239 )
									ret := 0.571429
								if( marron > -5.16239 )
									ret := -0.210884
				if( media > 24.0169 )
					if( source <= 100.027 )
						if( verde_media <= -64.5743 )
							if( media <= 39.5433 )
								ret := -1.000000 // sell
							if( media > 39.5433 )
								ret := -0.888889 // sell
						if( verde_media > -64.5743 )
							if( stoc <= 53.8481 )
								if( nvi <= 0.94186 )
									ret := 0.500000
								if( nvi > 0.94186 )
									ret := 0.976744 // buy
							if( stoc > 53.8481 )
								if( media_azul <= 60.0779 )
									ret := -0.529412
								if( media_azul > 60.0779 )
									ret := 1.000000 // buy
					if( source > 100.027 )
						if( marron <= 38.3868 )
							if( pvim <= 0.649447 )
								if( oscp <= 1.3917 )
									ret := 0.051689
								if( oscp > 1.3917 )
									ret := -0.500000
							if( pvim > 0.649447 )
								if( nvi_ema <= 0.923131 )
									ret := -0.545455
								if( nvi_ema > 0.923131 )
									ret := -1.000000 // sell
						if( marron > 38.3868 )
							if( xrsi <= 65.8884 )
								if( azul <= 42.0398 )
									ret := -0.141160
								if( azul > 42.0398 )
									ret := -0.532258
							if( xrsi > 65.8884 )
								if( source <= 119.092 )
									ret := -0.612903
								if( source > 119.092 )
									ret := 0.124506
		if( media_azul > 65.7071 )
			if( nvi <= 0.637929 )
				if( azul <= -13.2825 )
					if( media <= 93.3944 )
						if( pvimin <= 0.627225 )
							if( media_azul <= 106.555 )
								if( nvimax <= 0.591164 )
									ret := 0.189519
								if( nvimax > 0.591164 )
									ret := 0.038406
							if( media_azul > 106.555 )
								if( verde_mean <= 68.0775 )
									ret := 0.201481
								if( verde_mean > 68.0775 )
									ret := -0.101345
						if( pvimin > 0.627225 )
							if( oscp <= 0.576862 )
								ret := 0.363636
							if( oscp > 0.576862 )
								if( pvimax <= 0.67234 )
									ret := 0.700000 // buy
								if( pvimax > 0.67234 )
									ret := 0.969697 // buy
					if( media > 93.3944 )
						if( azul_mean <= -23.6263 )
							if( oscp <= 31.9567 )
								if( media_azul <= 216.711 )
									ret := 0.125926
								if( media_azul > 216.711 )
									ret := 0.892857 // buy
							if( oscp > 31.9567 )
								if( nvim <= 0.589733 )
									ret := -0.589041
								if( nvim > 0.589733 )
									ret := 0.562500
						if( azul_mean > -23.6263 )
							if( pvi_ema <= 0.559198 )
								if( media <= 103.652 )
									ret := 0.301205
								if( media > 103.652 )
									ret := 0.674641
							if( pvi_ema > 0.559198 )
								if( nvim <= 0.16556 )
									ret := -0.142857
								if( nvim > 0.16556 )
									ret := -0.533333
				if( azul > -13.2825 )
					if( source <= 75.9576 )
						if( pvimin <= 0.038661 )
							if( source <= 71.5731 )
								if( pvimin <= -0.255431 )
									ret := -0.317647
								if( pvimin > -0.255431 )
									ret := 0.335180
							if( source > 71.5731 )
								if( tprice <= 72.0485 )
									ret := -0.657534
								if( tprice > 72.0485 )
									ret := -0.035343
						if( pvimin > 0.038661 )
							if( media <= 80.8077 )
								if( verde_media <= -40.0261 )
									ret := -0.521739
								if( verde_media > -40.0261 )
									ret := 0.207692
							if( media > 80.8077 )
								if( verde_mean <= 130.065 )
									ret := 0.549327
								if( verde_mean > 130.065 )
									ret := 0.036697
					if( source > 75.9576 )
						if( verde_media <= -64.6744 )
							if( source <= 95.62 )
								if( nvimin <= 0.570467 )
									ret := -0.309524
								if( nvimin > 0.570467 )
									ret := 0.558140
							if( source > 95.62 )
								if( media_azul <= 67.9242 )
									ret := -0.021739
								if( media_azul > 67.9242 )
									ret := 0.582609
						if( verde_media > -64.6744 )
							if( pvi <= 0.722623 )
								if( nvimin <= 0.631787 )
									ret := 0.025755
								if( nvimin > 0.631787 )
									ret := 0.387324
							if( pvi > 0.722623 )
								if( source <= 117.572 )
									ret := -0.523810
								if( source > 117.572 )
									ret := -0.962963 // sell
			if( nvi > 0.637929 )
				if( oscp <= 53.6208 )
					if( pvim <= -0.434244 )
						if( azul <= 6.7507 )
							ret := 0.538462
						if( azul > 6.7507 )
							ret := 1.000000 // buy
					if( pvim > -0.434244 )
						if( pvimin <= 0.361329 )
							if( nvimin <= 0.959327 )
								if( media_azul <= 91.3708 )
									ret := -0.021306
								if( media_azul > 91.3708 )
									ret := -0.243706
							if( nvimin > 0.959327 )
								if( marron <= 130.488 )
									ret := 0.003540
								if( marron > 130.488 )
									ret := 0.610169
						if( pvimin > 0.361329 )
							if( verde_azul <= 109.682 )
								if( marron <= -8.84501 )
									ret := 0.625000
								if( marron > -8.84501 )
									ret := 0.140119
							if( verde_azul > 109.682 )
								if( source <= 218.824 )
									ret := 0.107251
								if( source > 218.824 )
									ret := -0.160115
				if( oscp > 53.6208 )
					if( pvimax <= -0.104642 )
						if( oscp <= 64.9833 )
							if( verde_media <= 82.3295 )
								ret := 0.181818
							if( verde_media > 82.3295 )
								ret := 0.941176 // buy
						if( oscp > 64.9833 )
							if( media <= 74.7351 )
								ret := 0.200000
							if( media > 74.7351 )
								ret := -0.533333
					if( pvimax > -0.104642 )
						if( marron <= 100.283 )
							if( oscp <= 56.327 )
								ret := -0.842105 // sell
							if( oscp > 56.327 )
								if( verde_azul <= 181.395 )
									ret := 0.000000
								if( verde_azul > 181.395 )
									ret := 0.888889 // buy
						if( marron > 100.283 )
							if( verde_azul <= 167.99 )
								ret := 0.142857
							if( verde_azul > 167.99 )
								if( marron_mean <= 78.9594 )
									ret := 0.111111
								if( marron_mean > 78.9594 )
									ret := -0.625571
	
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
float op_operation = decision_tree_0_BABA_30Min_fa6d4982(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


