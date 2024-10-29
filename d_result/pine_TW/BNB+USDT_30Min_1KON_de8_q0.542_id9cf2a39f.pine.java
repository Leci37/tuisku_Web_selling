//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: BNBUSDT_30Min_1KON_9cf2a39f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_30Min_1KON_9cf2a39f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_30Min_9cf2a39f(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( oscp <= -44.5179 )
		if( source <= 240.655 )
			if( nvimin <= -0.125175 )
				if( xrsi <= 26.8903 )
					if( tprice <= 27.002 )
						if( azul <= 0.152696 )
							ret := 0.375000
						if( azul > 0.152696 )
							ret := 1.000000 // buy
					if( tprice > 27.002 )
						ret := -0.333333
				if( xrsi > 26.8903 )
					if( pvim <= 0.543729 )
						if( azul_mean <= 12.5363 )
							if( xrsi <= 29.2106 )
								ret := -0.750000 // sell
							if( xrsi > 29.2106 )
								ret := -1.000000 // sell
						if( azul_mean > 12.5363 )
							ret := -0.166667
					if( pvim > 0.543729 )
						ret := 0.375000
			if( nvimin > -0.125175 )
				if( xmf <= 26.9675 )
					if( pvimin <= -2.13191 )
						if( nvimin <= 5.94366 )
							if( nvimax <= 5.8471 )
								ret := 0.000000
							if( nvimax > 5.8471 )
								ret := -0.125000
						if( nvimin > 5.94366 )
							ret := 0.466667
					if( pvimin > -2.13191 )
						if( xrsi <= 33.8217 )
							if( tprice <= 238.532 )
								if( verde_azul <= -27.5585 )
									ret := 0.809917 // buy
								if( verde_azul > -27.5585 )
									ret := 0.000000
							if( tprice > 238.532 )
								ret := 0.076923
						if( xrsi > 33.8217 )
							ret := -0.416667
				if( xmf > 26.9675 )
					if( pvi_ema <= 0.444104 )
						if( azul <= -26.9318 )
							ret := 0.894737 // buy
						if( azul > -26.9318 )
							if( media <= 23.3287 )
								if( tprice <= 236.68 )
									ret := -0.868421 // sell
								if( tprice > 236.68 )
									ret := 0.615385
							if( media > 23.3287 )
								if( nvimax <= 0.033948 )
									ret := -0.388889
								if( nvimax > 0.033948 )
									ret := 0.248062
					if( pvi_ema > 0.444104 )
						if( pvim <= 2.08114 )
							if( azul <= 37.8171 )
								if( verde_media <= -101.918 )
									ret := 1.000000 // buy
								if( verde_media > -101.918 )
									ret := 0.602941
							if( azul > 37.8171 )
								ret := 0.250000
						if( pvim > 2.08114 )
							if( verde_azul <= -70.8418 )
								if( marron_mean <= 12.7151 )
									ret := 1.000000 // buy
								if( marron_mean > 12.7151 )
									ret := 0.400000
							if( verde_azul > -70.8418 )
								ret := -0.263158
		if( source > 240.655 )
			if( stoc <= 18.1919 )
				if( verde_azul <= -59.2068 )
					if( pvimax <= -1.23005 )
						if( azul <= -22.6402 )
							ret := -0.833333 // sell
						if( azul > -22.6402 )
							if( verde_mean <= -63.0766 )
								if( media <= 7.20625 )
									ret := 0.333333
								if( media > 7.20625 )
									ret := -0.074074
							if( verde_mean > -63.0766 )
								if( stoc <= 15.5699 )
									ret := 0.161290
								if( stoc > 15.5699 )
									ret := 0.575000
					if( pvimax > -1.23005 )
						if( nvimax <= 5.0017 )
							if( pvi_ema <= 1.6521 )
								if( pvi <= 1.10537 )
									ret := 0.487705
								if( pvi > 1.10537 )
									ret := -0.480000
							if( pvi_ema > 1.6521 )
								if( azul_mean <= 13.6802 )
									ret := 0.708333 // buy
								if( azul_mean > 13.6802 )
									ret := 1.000000 // buy
						if( nvimax > 5.0017 )
							ret := 1.000000 // buy
				if( verde_azul > -59.2068 )
					if( stoc <= 12.253 )
						if( verde_mean <= -67.6649 )
							ret := -0.333333
						if( verde_mean > -67.6649 )
							if( azul_mean <= -6.05634 )
								if( nvimax <= 4.65275 )
									ret := 1.000000 // buy
								if( nvimax > 4.65275 )
									ret := 0.800000 // buy
							if( azul_mean > -6.05634 )
								if( marron_mean <= 6.07727 )
									ret := 0.694444
								if( marron_mean > 6.07727 )
									ret := 0.181818
					if( stoc > 12.253 )
						if( media_azul <= 48.8445 )
							if( oscp <= -45.7532 )
								if( verde_mean <= -24.3115 )
									ret := 0.206667
								if( verde_mean > -24.3115 )
									ret := -0.488372
							if( oscp > -45.7532 )
								ret := 0.900000 // buy
						if( media_azul > 48.8445 )
							if( media <= 58.4595 )
								if( verde_azul <= -9.90379 )
									ret := -0.722222 // sell
								if( verde_azul > -9.90379 )
									ret := 0.642857
							if( media > 58.4595 )
								ret := 0.888889 // buy
			if( stoc > 18.1919 )
				if( verde_mean <= -33.7719 )
					if( azul <= -90.3685 )
						if( pvi <= -1.62647 )
							ret := 0.538462
						if( pvi > -1.62647 )
							ret := 1.000000 // buy
					if( azul > -90.3685 )
						if( pvimax <= 1.53051 )
							if( media <= 26.5139 )
								if( marron_mean <= -7.42128 )
									ret := 0.395062
								if( marron_mean > -7.42128 )
									ret := -0.347134
							if( media > 26.5139 )
								if( media_azul <= 41.6761 )
									ret := -0.320000
								if( media_azul > 41.6761 )
									ret := -0.818182 // sell
						if( pvimax > 1.53051 )
							if( oscp <= -62.3804 )
								if( verde_mean <= -66.0615 )
									ret := 1.000000 // buy
								if( verde_mean > -66.0615 )
									ret := 0.333333
							if( oscp > -62.3804 )
								if( marron <= 13.3759 )
									ret := 1.000000 // buy
								if( marron > 13.3759 )
									ret := -0.916667 // sell
				if( verde_mean > -33.7719 )
					if( nvi <= 5.69105 )
						if( xmf <= 45.8795 )
							if( media <= 22.3771 )
								if( xmf <= 26.1341 )
									ret := 0.815385 // buy
								if( xmf > 26.1341 )
									ret := -0.157895
							if( media > 22.3771 )
								if( nvim <= 3.8029 )
									ret := 0.093878
								if( nvim > 3.8029 )
									ret := -0.236674
						if( xmf > 45.8795 )
							if( verde_azul <= -20.9831 )
								if( marron <= 27.3332 )
									ret := 0.451613
								if( marron > 27.3332 )
									ret := 0.833333 // buy
							if( verde_azul > -20.9831 )
								ret := 0.047619
					if( nvi > 5.69105 )
						if( source <= 591.099 )
							if( marron <= 51.2909 )
								if( tprice <= 567.42 )
									ret := 0.623377
								if( tprice > 567.42 )
									ret := 0.220588
							if( marron > 51.2909 )
								ret := -0.238095
						if( source > 591.099 )
							if( media <= 43.1625 )
								if( pvim <= -2.55996 )
									ret := -0.722222 // sell
								if( pvim > -2.55996 )
									ret := -1.000000 // sell
							if( media > 43.1625 )
								ret := 0.166667
	if( oscp > -44.5179 )
		if( marron_mean <= 123.812 )
			if( xrsi <= 23.5405 )
				if( media_azul <= 54.6306 )
					if( azul <= -28.7066 )
						if( source <= 279.417 )
							if( xmf <= 21.7343 )
								if( verde <= -39.82 )
									ret := 0.750000 // buy
								if( verde > -39.82 )
									ret := 0.272727
							if( xmf > 21.7343 )
								ret := -0.588235
						if( source > 279.417 )
							if( marron_mean <= 17.0999 )
								if( nvi <= 4.03725 )
									ret := 1.000000 // buy
								if( nvi > 4.03725 )
									ret := 0.658065
							if( marron_mean > 17.0999 )
								ret := -0.833333 // sell
					if( azul > -28.7066 )
						if( verde <= -9.15249 )
							if( nvi_ema <= -0.158415 )
								ret := -0.933333 // sell
							if( nvi_ema > -0.158415 )
								if( source <= 333.58 )
									ret := 0.351974
								if( source > 333.58 )
									ret := 0.082786
						if( verde > -9.15249 )
							if( pvimin <= -0.942733 )
								if( verde_media <= -17.3955 )
									ret := -0.240000
								if( verde_media > -17.3955 )
									ret := 0.535714
							if( pvimin > -0.942733 )
								if( xrsi <= 21.1314 )
									ret := -0.983871 // sell
								if( xrsi > 21.1314 )
									ret := -0.333333
				if( media_azul > 54.6306 )
					if( media <= 5.22853 )
						if( source <= 458.944 )
							if( xrsi <= 13.3365 )
								ret := -1.000000 // sell
							if( xrsi > 13.3365 )
								ret := -0.571429
						if( source > 458.944 )
							ret := -0.363636
					if( media > 5.22853 )
						if( verde_azul <= 33.2336 )
							if( pvi_ema <= 0.033379 )
								if( verde <= -54.4689 )
									ret := 0.388889
								if( verde > -54.4689 )
									ret := -0.475862
							if( pvi_ema > 0.033379 )
								if( oscp <= -31.1812 )
									ret := 0.062500
								if( oscp > -31.1812 )
									ret := 0.791667 // buy
						if( verde_azul > 33.2336 )
							if( oscp <= -15.8754 )
								if( xrsi <= 17.7745 )
									ret := 0.791667 // buy
								if( xrsi > 17.7745 )
									ret := -0.466667
							if( oscp > -15.8754 )
								if( azul <= -50.1719 )
									ret := 0.830189 // buy
								if( azul > -50.1719 )
									ret := 0.210526
			if( xrsi > 23.5405 )
				if( source <= 582.783 )
					if( verde_mean <= -28.3418 )
						if( azul <= 40.9264 )
							if( pvi <= 2.63454 )
								if( pvimin <= -3.52382 )
									ret := -0.807018 // sell
								if( pvimin > -3.52382 )
									ret := -0.305531
							if( pvi > 2.63454 )
								if( BollOsc <= -40.9693 )
									ret := 0.842105 // buy
								if( BollOsc > -40.9693 )
									ret := 0.444444
						if( azul > 40.9264 )
							if( marron <= 29.2428 )
								if( nvimin <= 4.08283 )
									ret := 0.708861 // buy
								if( nvimin > 4.08283 )
									ret := 0.072000
							if( marron > 29.2428 )
								if( media <= 32.7083 )
									ret := -0.780000 // sell
								if( media > 32.7083 )
									ret := 0.750000 // buy
					if( verde_mean > -28.3418 )
						if( pvimax <= 2.53696 )
							if( tprice <= 27.1283 )
								if( media <= 40.1437 )
									ret := 0.426267
								if( media > 40.1437 )
									ret := 0.128834
							if( tprice > 27.1283 )
								if( marron_mean <= 119.732 )
									ret := 0.000209
								if( marron_mean > 119.732 )
									ret := -0.220000
						if( pvimax > 2.53696 )
							if( nvim <= 1.45911 )
								if( pvimin <= 2.80983 )
									ret := 0.123918
								if( pvimin > 2.80983 )
									ret := -0.352113
							if( nvim > 1.45911 )
								if( verde_azul <= -4.53151 )
									ret := 0.428571
								if( verde_azul > -4.53151 )
									ret := 0.970588 // buy
				if( source > 582.783 )
					if( pvim <= 2.7557 )
						if( verde <= 45.1822 )
							if( pvimin <= 2.63417 )
								if( xmf <= 22.0763 )
									ret := 0.205128
								if( xmf > 22.0763 )
									ret := -0.279646
							if( pvimin > 2.63417 )
								if( xrsi <= 34.2616 )
									ret := 0.891304 // buy
								if( xrsi > 34.2616 )
									ret := -0.131737
						if( verde > 45.1822 )
							if( verde_mean <= 69.1439 )
								if( nvi <= 3.89916 )
									ret := 0.261789
								if( nvi > 3.89916 )
									ret := -0.066148
							if( verde_mean > 69.1439 )
								if( nvim <= 1.26437 )
									ret := 0.294118
								if( nvim > 1.26437 )
									ret := -0.138045
					if( pvim > 2.7557 )
						if( media <= 88.9462 )
							if( verde_media <= -17.2909 )
								ret := -0.833333 // sell
							if( verde_media > -17.2909 )
								ret := -1.000000 // sell
						if( media > 88.9462 )
							if( azul <= 27.2189 )
								if( pvimax <= 2.77181 )
									ret := 0.000000
								if( pvimax > 2.77181 )
									ret := -0.812500 // sell
							if( azul > 27.2189 )
								if( pvi <= 2.90405 )
									ret := 0.416667
								if( pvi > 2.90405 )
									ret := -0.272727
		if( marron_mean > 123.812 )
			if( pvimax <= 1.11063 )
				if( verde_media <= 57.849 )
					if( source <= 244.414 )
						if( verde_mean <= 146.769 )
							if( verde_azul <= 111.226 )
								ret := -0.272727
							if( verde_azul > 111.226 )
								if( pvim <= 0.461415 )
									ret := 0.000000
								if( pvim > 0.461415 )
									ret := 0.833333 // buy
						if( verde_mean > 146.769 )
							if( nvim <= 0.359094 )
								ret := -0.111111
							if( nvim > 0.359094 )
								if( pvi <= -1.75258 )
									ret := -0.545455
								if( pvi > -1.75258 )
									ret := -0.976744 // sell
					if( source > 244.414 )
						if( verde_media <= 33.8435 )
							if( verde_azul <= 129.079 )
								if( nvi_ema <= 5.24449 )
									ret := 0.000000
								if( nvi_ema > 5.24449 )
									ret := 0.333333
							if( verde_azul > 129.079 )
								if( pvimin <= -2.39292 )
									ret := 0.800000 // buy
								if( pvimin > -2.39292 )
									ret := 0.333333
						if( verde_media > 33.8435 )
							if( source <= 645.38 )
								if( nvi <= 5.79429 )
									ret := 0.016949
								if( nvi > 5.79429 )
									ret := -0.640000
							if( source > 645.38 )
								if( media_azul <= 62.1027 )
									ret := 1.000000 // buy
								if( media_azul > 62.1027 )
									ret := 0.666667
				if( verde_media > 57.849 )
					if( verde_azul <= 196.711 )
						if( oscp <= 69.3262 )
							if( stoc <= 90.2165 )
								if( pvi_ema <= -1.14898 )
									ret := 0.771429 // buy
								if( pvi_ema > -1.14898 )
									ret := 0.474138
							if( stoc > 90.2165 )
								if( BollOsc <= 54.6788 )
									ret := -0.531250
								if( BollOsc > 54.6788 )
									ret := 0.444444
						if( oscp > 69.3262 )
							if( pvi <= -0.253846 )
								if( verde_media <= 101.811 )
									ret := -0.529412
								if( verde_media > 101.811 )
									ret := -0.210526
							if( pvi > -0.253846 )
								ret := -0.800000 // sell
					if( verde_azul > 196.711 )
						if( pvi <= -1.28135 )
							if( media_azul <= 107.281 )
								if( azul <= 7.85609 )
									ret := 0.000000
								if( azul > 7.85609 )
									ret := -0.933333 // sell
							if( media_azul > 107.281 )
								if( pvim <= -2.30124 )
									ret := -0.315789
								if( pvim > -2.30124 )
									ret := 0.520833
						if( pvi > -1.28135 )
							if( pvimax <= -0.250497 )
								if( marron_mean <= 129.207 )
									ret := -0.400000
								if( marron_mean > 129.207 )
									ret := -1.000000 // sell
							if( pvimax > -0.250497 )
								ret := -0.208333
			if( pvimax > 1.11063 )
				if( pvimin <= 1.4254 )
					if( pvi <= 1.57682 )
						if( nvimin <= 2.17971 )
							if( nvimin <= 2.02306 )
								ret := 1.000000 // buy
							if( nvimin > 2.02306 )
								ret := 0.923077 // buy
						if( nvimin > 2.17971 )
							if( pvi_ema <= 1.14487 )
								ret := 1.000000 // buy
							if( pvi_ema > 1.14487 )
								ret := 0.100000
					if( pvi > 1.57682 )
						if( nvimin <= 0.595174 )
							if( marron <= 122.482 )
								ret := 1.000000 // buy
							if( marron > 122.482 )
								ret := 0.800000 // buy
						if( nvimin > 0.595174 )
							ret := -0.555556
				if( pvimin > 1.4254 )
					if( stoc <= 89.987 )
						if( pvimin <= 2.41086 )
							ret := 1.000000 // buy
						if( pvimin > 2.41086 )
							if( verde <= 162.188 )
								ret := 0.700000 // buy
							if( verde > 162.188 )
								if( verde_mean <= 199.845 )
									ret := -0.400000
								if( verde_mean > 199.845 )
									ret := -0.888889 // sell
					if( stoc > 89.987 )
						if( media <= 111.41 )
							ret := -1.000000 // sell
						if( media > 111.41 )
							ret := -0.500000
	
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
float op_operation = decision_tree_0_BNBUSDT_30Min_9cf2a39f(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


