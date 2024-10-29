//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: BTCUSDT_30Min_1KON_912c2b25 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_30Min_1KON_912c2b25", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_30Min_912c2b25(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( nvi_ema <= 1.79953 )
		if( source <= 10093.6 )
			if( verde_azul <= -20.6328 )
				if( verde_azul <= -32.6581 )
					ret := 0.700000 // buy
				if( verde_azul > -32.6581 )
					ret := 0.461538
			if( verde_azul > -20.6328 )
				if( pvi <= -0.111063 )
					ret := 0.692308
				if( pvi > -0.111063 )
					ret := 1.000000 // buy
		if( source > 10093.6 )
			if( azul <= 59.6594 )
				if( pvimax <= 0.458486 )
					if( nvim <= 0.070858 )
						if( nvimax <= 0.075029 )
							if( pvi <= 0.198 )
								if( pvimax <= 0.196968 )
									ret := 0.053200
								if( pvimax > 0.196968 )
									ret := -0.371134
							if( pvi > 0.198 )
								if( marron <= 118.764 )
									ret := -0.625000
								if( marron > 118.764 )
									ret := -1.000000 // sell
						if( nvimax > 0.075029 )
							if( verde_media <= 29.2397 )
								if( verde <= 50.8447 )
									ret := -0.382979
								if( verde > 50.8447 )
									ret := -0.823529 // sell
							if( verde_media > 29.2397 )
								ret := 0.000000
					if( nvim > 0.070858 )
						if( tprice <= 15424.4 )
							if( verde_azul <= -5.83009 )
								if( pvi_ema <= 0.278669 )
									ret := 0.025641
								if( pvi_ema > 0.278669 )
									ret := -0.787879 // sell
							if( verde_azul > -5.83009 )
								if( azul <= -6.25323 )
									ret := 0.627803
								if( azul > -6.25323 )
									ret := 0.318280
						if( tprice > 15424.4 )
							if( nvi_ema <= 0.109516 )
								if( pvi <= 0.294558 )
									ret := -0.062500
								if( pvi > 0.294558 )
									ret := -0.717172 // sell
							if( nvi_ema > 0.109516 )
								if( oscp <= 7.26145 )
									ret := 0.149902
								if( oscp > 7.26145 )
									ret := 0.016511
				if( pvimax > 0.458486 )
					if( nvimax <= 0.728369 )
						if( nvi_ema <= 0.712832 )
							if( verde_media <= 0.044188 )
								if( azul <= -16.4093 )
									ret := 0.833333 // buy
								if( azul > -16.4093 )
									ret := 0.212121
							if( verde_media > 0.044188 )
								if( azul <= 31.0238 )
									ret := -0.201970
								if( azul > 31.0238 )
									ret := 0.520833
						if( nvi_ema > 0.712832 )
							ret := 1.000000 // buy
					if( nvimax > 0.728369 )
						if( stoc <= 34.6125 )
							if( pvimin <= 0.394112 )
								if( pvimax <= 0.490556 )
									ret := -0.392157
								if( pvimax > 0.490556 )
									ret := 0.727273 // buy
							if( pvimin > 0.394112 )
								if( marron <= 18.0607 )
									ret := 0.033898
								if( marron > 18.0607 )
									ret := 0.857143 // buy
						if( stoc > 34.6125 )
							if( nvim <= 1.21248 )
								if( tprice <= 32434.9 )
									ret := 0.857143 // buy
								if( tprice > 32434.9 )
									ret := -0.481188
							if( nvim > 1.21248 )
								if( pvimax <= 0.481496 )
									ret := 0.261745
								if( pvimax > 0.481496 )
									ret := -0.676471
			if( azul > 59.6594 )
				if( source <= 46251.3 )
					if( marron <= 136.62 )
						if( pvi_ema <= 0.269023 )
							if( verde_mean <= 104.326 )
								if( media <= 36.1237 )
									ret := 0.941176 // buy
								if( media > 36.1237 )
									ret := 0.409091
							if( verde_mean > 104.326 )
								ret := 1.000000 // buy
						if( pvi_ema > 0.269023 )
							if( verde_mean <= -12.4861 )
								if( nvimin <= 0.331355 )
									ret := 1.000000 // buy
								if( nvimin > 0.331355 )
									ret := 0.357143
							if( verde_mean > -12.4861 )
								if( media <= 46.1187 )
									ret := -0.263158
								if( media > 46.1187 )
									ret := 0.687500
					if( marron > 136.62 )
						ret := -0.500000
				if( source > 46251.3 )
					if( marron_mean <= 63.2286 )
						ret := -0.727273 // sell
					if( marron_mean > 63.2286 )
						ret := 0.733333 // buy
	if( nvi_ema > 1.79953 )
		if( pvimax <= -0.64988 )
			if( source <= 69885.2 )
				if( nvi <= 2.24865 )
					if( stoc <= 19.8147 )
						if( pvim <= -0.770129 )
							if( nvimin <= 2.19405 )
								if( media <= 28.4992 )
									ret := 1.000000 // buy
								if( media > 28.4992 )
									ret := 0.750000 // buy
							if( nvimin > 2.19405 )
								if( pvi <= -0.784237 )
									ret := 0.500000
								if( pvi > -0.784237 )
									ret := 0.750000 // buy
						if( pvim > -0.770129 )
							if( nvimax <= 2.25397 )
								if( pvim <= -0.717178 )
									ret := 0.511111
								if( pvim > -0.717178 )
									ret := -0.632653
							if( nvimax > 2.25397 )
								if( marron_mean <= 6.98418 )
									ret := -0.208333
								if( marron_mean > 6.98418 )
									ret := -0.929825 // sell
					if( stoc > 19.8147 )
						if( pvim <= -0.723591 )
							if( source <= 32522.5 )
								if( tprice <= 32138.2 )
									ret := 0.237037
								if( tprice > 32138.2 )
									ret := -0.657143
							if( source > 32522.5 )
								if( marron <= 103.044 )
									ret := 0.775120 // buy
								if( marron > 103.044 )
									ret := 0.000000
						if( pvim > -0.723591 )
							if( oscp <= 6.07065 )
								if( nvi <= 2.11883 )
									ret := -0.600000
								if( nvi > 2.11883 )
									ret := 0.459770
							if( oscp > 6.07065 )
								if( xrsi <= 56.5457 )
									ret := -0.708333 // sell
								if( xrsi > 56.5457 )
									ret := 0.038278
				if( nvi > 2.24865 )
					if( media_azul <= 71.0478 )
						if( media <= 7.01847 )
							if( tprice <= 18657.7 )
								if( nvi_ema <= 3.27222 )
									ret := 0.705882 // buy
								if( nvi_ema > 3.27222 )
									ret := 1.000000 // buy
							if( tprice > 18657.7 )
								if( nvi_ema <= 3.43766 )
									ret := -0.422297
								if( nvi_ema > 3.43766 )
									ret := 0.054545
						if( media > 7.01847 )
							if( tprice <= 60828.2 )
								if( tprice <= 16449.6 )
									ret := 0.387879
								if( tprice > 16449.6 )
									ret := -0.005921
							if( tprice > 60828.2 )
								if( pvi_ema <= -1.32108 )
									ret := -0.077961
								if( pvi_ema > -1.32108 )
									ret := -0.307000
					if( media_azul > 71.0478 )
						if( verde <= 180.744 )
							if( azul_mean <= 35.7183 )
								if( nvi <= 3.21665 )
									ret := -0.050442
								if( nvi > 3.21665 )
									ret := 0.059959
							if( azul_mean > 35.7183 )
								if( stoc <= 88.5156 )
									ret := 0.304348
								if( stoc > 88.5156 )
									ret := 0.734375 // buy
						if( verde > 180.744 )
							if( nvim <= 3.35281 )
								if( source <= 46985.3 )
									ret := 0.576023
								if( source > 46985.3 )
									ret := -0.377778
							if( nvim > 3.35281 )
								if( verde_azul <= 194.267 )
									ret := 0.357895
								if( verde_azul > 194.267 )
									ret := -0.176955
			if( source > 69885.2 )
				if( pvi_ema <= -1.54106 )
					if( nvi_ema <= 4.37422 )
						if( verde_azul <= 119.294 )
							if( azul <= 0.49788 )
								if( nvimax <= 4.2607 )
									ret := -0.537313
								if( nvimax > 4.2607 )
									ret := -0.950000 // sell
							if( azul > 0.49788 )
								if( media_azul <= 18.3174 )
									ret := -0.416667
								if( media_azul > 18.3174 )
									ret := -0.991379 // sell
						if( verde_azul > 119.294 )
							if( pvimin <= -1.60269 )
								ret := -1.000000 // sell
							if( pvimin > -1.60269 )
								if( verde_media <= 37.6546 )
									ret := -0.428571
								if( verde_media > 37.6546 )
									ret := 0.380952
					if( nvi_ema > 4.37422 )
						if( verde_media <= -64.0968 )
							ret := -0.950000 // sell
						if( verde_media > -64.0968 )
							if( verde_media <= 14.4773 )
								if( source <= 71265.6 )
									ret := -0.052632
								if( source > 71265.6 )
									ret := -0.272727
							if( verde_media > 14.4773 )
								if( verde_azul <= 104.331 )
									ret := -0.609756
								if( verde_azul > 104.331 )
									ret := -0.138889
				if( pvi_ema > -1.54106 )
					if( stoc <= 56.2364 )
						if( verde_azul <= -62.5202 )
							ret := 0.846154 // buy
						if( verde_azul > -62.5202 )
							if( azul_mean <= 0.435837 )
								if( source <= 70505.2 )
									ret := -0.392857
								if( source > 70505.2 )
									ret := -0.816667 // sell
							if( azul_mean > 0.435837 )
								if( oscp <= 2.56915 )
									ret := -0.176471
								if( oscp > 2.56915 )
									ret := -0.821429 // sell
					if( stoc > 56.2364 )
						if( verde_azul <= 57.9644 )
							if( marron_mean <= 54.7753 )
								if( source <= 71358 )
									ret := -0.333333
								if( source > 71358 )
									ret := -0.916667 // sell
							if( marron_mean > 54.7753 )
								if( xrsi <= 57.0462 )
									ret := 0.924528 // buy
								if( xrsi > 57.0462 )
									ret := 0.571429
						if( verde_azul > 57.9644 )
							if( nvimin <= 4.17906 )
								if( nvimax <= 4.08914 )
									ret := 0.205357
								if( nvimax > 4.08914 )
									ret := -0.728155 // sell
							if( nvimin > 4.17906 )
								if( marron <= 83.5535 )
									ret := 0.680851
								if( marron > 83.5535 )
									ret := 0.033333
		if( pvimax > -0.64988 )
			if( verde_media <= -7.80659 )
				if( xmf <= 44.1232 )
					if( tprice <= 33745.1 )
						if( oscp <= -23.4957 )
							if( azul_mean <= 10.5754 )
								ret := 1.000000 // buy
							if( azul_mean > 10.5754 )
								ret := 0.785714 // buy
						if( oscp > -23.4957 )
							if( verde <= 1.36526 )
								if( oscp <= -20.5682 )
									ret := -0.111111
								if( oscp > -20.5682 )
									ret := -0.812500 // sell
							if( verde > 1.36526 )
								if( media_azul <= 55.496 )
									ret := 0.621622
								if( media_azul > 55.496 )
									ret := -0.400000
					if( tprice > 33745.1 )
						if( azul <= 19.3152 )
							if( nvim <= 2.84882 )
								if( media <= 12.1153 )
									ret := 0.325581
								if( media > 12.1153 )
									ret := -0.125088
							if( nvim > 2.84882 )
								if( nvim <= 2.87054 )
									ret := 0.372549
								if( nvim > 2.87054 )
									ret := -0.347826
						if( azul > 19.3152 )
							if( nvimin <= 2.21429 )
								if( media <= 28.146 )
									ret := 0.543750
								if( media > 28.146 )
									ret := 0.140496
							if( nvimin > 2.21429 )
								if( media <= 54.8202 )
									ret := -0.261146
								if( media > 54.8202 )
									ret := 0.360000
				if( xmf > 44.1232 )
					if( media <= 59.526 )
						if( verde_mean <= 24.0936 )
							if( pvimax <= -0.616024 )
								if( verde_mean <= 15.4683 )
									ret := 0.058824
								if( verde_mean > 15.4683 )
									ret := 0.954545 // buy
							if( pvimax > -0.616024 )
								if( pvimax <= -0.583181 )
									ret := -0.846154 // sell
								if( pvimax > -0.583181 )
									ret := 0.075342
						if( verde_mean > 24.0936 )
							if( verde_media <= -35.7907 )
								if( azul <= -0.842446 )
									ret := 0.333333
								if( azul > -0.842446 )
									ret := -0.476190
							if( verde_media > -35.7907 )
								if( stoc <= 45.0333 )
									ret := 0.726027 // buy
								if( stoc > 45.0333 )
									ret := 0.165049
					if( media > 59.526 )
						if( pvi <= -0.68686 )
							if( pvimax <= -0.617034 )
								if( verde_azul <= 48.9638 )
									ret := 1.000000 // buy
								if( verde_azul > 48.9638 )
									ret := -0.700000 // sell
							if( pvimax > -0.617034 )
								if( media_azul <= 72.8903 )
									ret := 0.928571 // buy
								if( media_azul > 72.8903 )
									ret := 0.846154 // buy
						if( pvi > -0.68686 )
							if( tprice <= 39923.2 )
								if( pvim <= -0.669962 )
									ret := -0.500000
								if( pvim > -0.669962 )
									ret := 0.558442
							if( tprice > 39923.2 )
								if( source <= 40212.5 )
									ret := -0.828571 // sell
								if( source > 40212.5 )
									ret := -0.037196
			if( verde_media > -7.80659 )
				if( azul_mean <= -24.832 )
					if( azul_mean <= -48.4223 )
						if( pvi <= -0.500087 )
							ret := -0.312500
						if( pvi > -0.500087 )
							ret := 0.318182
					if( azul_mean > -48.4223 )
						if( verde_mean <= -2.3766 )
							ret := 0.444444
						if( verde_mean > -2.3766 )
							if( nvi_ema <= 2.41986 )
								if( oscp <= 15.9169 )
									ret := -0.586957
								if( oscp > 15.9169 )
									ret := -0.933333 // sell
							if( nvi_ema > 2.41986 )
								if( nvimin <= 2.46973 )
									ret := 0.750000 // buy
								if( nvimin > 2.46973 )
									ret := -0.573171
				if( azul_mean > -24.832 )
					if( pvimin <= -0.706544 )
						if( verde_mean <= 28.2732 )
							if( nvim <= 2.63051 )
								if( verde <= 25.8985 )
									ret := 1.000000 // buy
								if( verde > 25.8985 )
									ret := 0.392857
							if( nvim > 2.63051 )
								ret := -0.368421
						if( verde_mean > 28.2732 )
							if( stoc <= 85.0951 )
								if( azul <= -5.14249 )
									ret := -0.833333 // sell
								if( azul > -5.14249 )
									ret := -0.340278
							if( stoc > 85.0951 )
								if( verde_azul <= 130.298 )
									ret := 0.310345
								if( verde_azul > 130.298 )
									ret := -1.000000 // sell
					if( pvimin > -0.706544 )
						if( stoc <= 92.3649 )
							if( verde_media <= 61.8954 )
								if( tprice <= 57092 )
									ret := -0.058587
								if( tprice > 57092 )
									ret := -0.203574
							if( verde_media > 61.8954 )
								if( source <= 59148.1 )
									ret := 0.242623
								if( source > 59148.1 )
									ret := -0.377358
						if( stoc > 92.3649 )
							if( azul_mean <= 24.4265 )
								if( BollOsc <= 34.1558 )
									ret := 0.100000
								if( BollOsc > 34.1558 )
									ret := -0.887324 // sell
							if( azul_mean > 24.4265 )
								ret := 0.600000
	
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
float op_operation = decision_tree_0_BTCUSDT_30Min_912c2b25(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


