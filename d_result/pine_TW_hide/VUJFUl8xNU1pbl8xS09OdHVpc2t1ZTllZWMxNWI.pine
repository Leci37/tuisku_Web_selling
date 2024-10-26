//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: UBER_15Min_1KON_e9eec15b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_15Min_1KON_e9eec15b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_15Min_e9eec15b(nvi, nvi_ema, marron_mean, source, azul, verde_azul, verde_mean, xmf, pvimin, stoc, media, tprice, marron, pvim, pvimax, xrsi, oscp, pvi, nvimax, nvimin, verde, verde_media, azul_mean, nvim, BollOsc, pvi_ema, media_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( azul_mean <= 19.5295 )
		if( marron <= 31.5225 )
			if( pvi_ema <= -0.288271 )
				if( media_azul <= -2.96804 )
					if( azul <= 28.0228 )
						if( nvi <= 1.12129 )
							if( BollOsc <= -25.5131 )
								if( pvim <= -0.607791 )
									ret := -0.968254 // sell
								if( pvim > -0.607791 )
									ret := -0.658537
							if( BollOsc > -25.5131 )
								if( pvi_ema <= -0.329348 )
									ret := 0.562500
								if( pvi_ema > -0.329348 )
									ret := -0.636364
						if( nvi > 1.12129 )
							ret := 0.428571
					if( azul > 28.0228 )
						if( marron <= 26.9599 )
							if( nvimax <= 0.287669 )
								if( pvi_ema <= -0.3754 )
									ret := 0.888889 // buy
								if( pvi_ema > -0.3754 )
									ret := 0.250000
							if( nvimax > 0.287669 )
								if( source <= 33.5085 )
									ret := -0.840000 // sell
								if( source > 33.5085 )
									ret := -0.025000
						if( marron > 26.9599 )
							ret := 0.727273 // buy
				if( media_azul > -2.96804 )
					if( xrsi <= 18.5833 )
						if( verde_azul <= 48.8781 )
							if( pvim <= -0.456037 )
								if( media_azul <= 1.05794 )
									ret := -0.166667
								if( media_azul > 1.05794 )
									ret := 0.644315
							if( pvim > -0.456037 )
								if( pvi_ema <= -0.44752 )
									ret := -0.727273 // sell
								if( pvi_ema > -0.44752 )
									ret := 0.349442
						if( verde_azul > 48.8781 )
							if( BollOsc <= -49.4322 )
								if( oscp <= -1.79258 )
									ret := -0.357143
								if( oscp > -1.79258 )
									ret := 0.500000
							if( BollOsc > -49.4322 )
								ret := -0.882353 // sell
					if( xrsi > 18.5833 )
						if( nvi <= 1.2263 )
							if( verde_mean <= -8.03882 )
								if( media <= 3.08431 )
									ret := 0.800000 // buy
								if( media > 3.08431 )
									ret := 0.079218
							if( verde_mean > -8.03882 )
								if( source <= 30.4541 )
									ret := -0.097242
								if( source > 30.4541 )
									ret := 0.027581
						if( nvi > 1.2263 )
							if( pvimin <= -0.643941 )
								ret := -1.000000 // sell
							if( pvimin > -0.643941 )
								ret := -0.444444
			if( pvi_ema > -0.288271 )
				if( azul_mean <= -45.6239 )
					if( oscp <= -133.233 )
						ret := -0.846154 // sell
					if( oscp > -133.233 )
						if( media <= 18.5547 )
							if( source <= 27.5367 )
								if( azul <= -47.1046 )
									ret := 0.071429
								if( azul > -47.1046 )
									ret := -0.909091 // sell
							if( source > 27.5367 )
								if( nvi <= 0.944505 )
									ret := 0.436975
								if( nvi > 0.944505 )
									ret := -0.215686
						if( media > 18.5547 )
							if( nvi_ema <= 0.621317 )
								if( pvi <= -0.245218 )
									ret := 0.309859
								if( pvi > -0.245218 )
									ret := 0.720126 // buy
							if( nvi_ema > 0.621317 )
								if( pvi <= 0.09879 )
									ret := -0.317460
								if( pvi > 0.09879 )
									ret := 0.459627
				if( azul_mean > -45.6239 )
					if( pvimax <= 0.550797 )
						if( tprice <= 24.48 )
							if( pvim <= -0.19366 )
								if( stoc <= 15.5316 )
									ret := 0.500000
								if( stoc > 15.5316 )
									ret := 0.966667 // buy
							if( pvim > -0.19366 )
								ret := 0.375000
						if( tprice > 24.48 )
							if( media <= 16.3567 )
								if( tprice <= 26.7963 )
									ret := -0.564706
								if( tprice > 26.7963 )
									ret := 0.030103
							if( media > 16.3567 )
								if( marron_mean <= 53.3585 )
									ret := 0.135698
								if( marron_mean > 53.3585 )
									ret := -0.056834
					if( pvimax > 0.550797 )
						if( BollOsc <= -56.5408 )
							if( oscp <= -55.5668 )
								ret := 0.692308
							if( oscp > -55.5668 )
								if( xrsi <= 18.9637 )
									ret := 0.142857
								if( xrsi > 18.9637 )
									ret := -0.729508 // sell
						if( BollOsc > -56.5408 )
							if( marron_mean <= 26.4898 )
								if( verde_mean <= -83.2597 )
									ret := 1.000000 // buy
								if( verde_mean > -83.2597 )
									ret := 0.129870
							if( marron_mean > 26.4898 )
								if( pvi_ema <= 0.626547 )
									ret := -0.452381
								if( pvi_ema > 0.626547 )
									ret := 0.230769
		if( marron > 31.5225 )
			if( tprice <= 27.6686 )
				if( azul <= -27.5041 )
					if( marron_mean <= 45.1424 )
						if( pvi <= -0.240361 )
							if( verde_media <= 20.9172 )
								if( azul_mean <= -28.6308 )
									ret := 1.000000 // buy
								if( azul_mean > -28.6308 )
									ret := 0.857143 // buy
							if( verde_media > 20.9172 )
								ret := 0.500000
						if( pvi > -0.240361 )
							ret := 0.058824
					if( marron_mean > 45.1424 )
						if( pvi <= -0.787326 )
							ret := -0.833333 // sell
						if( pvi > -0.787326 )
							if( nvi <= 0.214451 )
								if( stoc <= 18.9314 )
									ret := 0.529412
								if( stoc > 18.9314 )
									ret := -0.529412
							if( nvi > 0.214451 )
								if( stoc <= 19.6734 )
									ret := -0.523810
								if( stoc > 19.6734 )
									ret := 0.418519
				if( azul > -27.5041 )
					if( marron_mean <= 52.117 )
						if( media <= 59.9086 )
							if( verde <= 37.0846 )
								if( nvi_ema <= 0.557352 )
									ret := 0.282895
								if( nvi_ema > 0.557352 )
									ret := -0.113636
							if( verde > 37.0846 )
								if( nvi_ema <= 0.028081 )
									ret := -0.733333 // sell
								if( nvi_ema > 0.028081 )
									ret := -0.194828
						if( media > 59.9086 )
							if( azul_mean <= -8.76931 )
								if( stoc <= 38.0786 )
									ret := 0.100000
								if( stoc > 38.0786 )
									ret := -0.684211
							if( azul_mean > -8.76931 )
								if( nvimax <= 0.582369 )
									ret := 0.176471
								if( nvimax > 0.582369 )
									ret := 0.800000 // buy
					if( marron_mean > 52.117 )
						if( marron <= 118.759 )
							if( verde_mean <= 133.155 )
								if( stoc <= 35.4646 )
									ret := 0.468750
								if( stoc > 35.4646 )
									ret := 0.063227
							if( verde_mean > 133.155 )
								if( xmf <= 78.9951 )
									ret := 0.331210
								if( xmf > 78.9951 )
									ret := 0.783133 // buy
						if( marron > 118.759 )
							if( azul_mean <= 13.7702 )
								if( verde <= 201.053 )
									ret := -0.592760
								if( verde > 201.053 )
									ret := 0.571429
							if( azul_mean > 13.7702 )
								if( verde_mean <= 155.333 )
									ret := 0.521739
								if( verde_mean > 155.333 )
									ret := -0.500000
			if( tprice > 27.6686 )
				if( azul <= -112.113 )
					if( xrsi <= 62.1039 )
						if( nvimax <= 0.445967 )
							ret := -0.461538
						if( nvimax > 0.445967 )
							if( azul_mean <= -103.03 )
								ret := 0.277778
							if( azul_mean > -103.03 )
								if( pvimax <= 0.297645 )
									ret := 0.962963 // buy
								if( pvimax > 0.297645 )
									ret := 0.625000
					if( xrsi > 62.1039 )
						if( media <= 97.924 )
							ret := 0.500000
						if( media > 97.924 )
							ret := -0.583333
				if( azul > -112.113 )
					if( pvi <= 0.227145 )
						if( verde <= 109.468 )
							if( marron_mean <= 85.8533 )
								if( oscp <= 10.0178 )
									ret := -0.018025
								if( oscp > 10.0178 )
									ret := -0.108499
							if( marron_mean > 85.8533 )
								if( xrsi <= 57.4396 )
									ret := -0.085372
								if( xrsi > 57.4396 )
									ret := 0.124303
						if( verde > 109.468 )
							if( marron_mean <= 109.173 )
								if( tprice <= 34.1153 )
									ret := -0.057143
								if( tprice > 34.1153 )
									ret := -0.169650
							if( marron_mean > 109.173 )
								if( BollOsc <= 85.1568 )
									ret := -0.002765
								if( BollOsc > 85.1568 )
									ret := 0.625000
					if( pvi > 0.227145 )
						if( verde <= 201.279 )
							if( pvi_ema <= 0.512313 )
								if( pvi_ema <= 0.216542 )
									ret := 0.818182 // buy
								if( pvi_ema > 0.216542 )
									ret := 0.034297
							if( pvi_ema > 0.512313 )
								if( xmf <= 86.994 )
									ret := -0.106827
								if( xmf > 86.994 )
									ret := 0.275862
						if( verde > 201.279 )
							if( verde_mean <= 190.265 )
								if( azul_mean <= 1.11657 )
									ret := 0.071429
								if( azul_mean > 1.11657 )
									ret := 0.813333 // buy
							if( verde_mean > 190.265 )
								if( nvim <= 0.762289 )
									ret := 0.818182 // buy
								if( nvim > 0.762289 )
									ret := -0.200000
	if( azul_mean > 19.5295 )
		if( media_azul <= 67.0319 )
			if( BollOsc <= -56.5033 )
				if( nvimin <= 0.122984 )
					if( media_azul <= 5.923 )
						ret := -1.000000 // sell
					if( media_azul > 5.923 )
						ret := -0.222222
				if( nvimin > 0.122984 )
					if( marron <= -11.0784 )
						if( azul_mean <= 25.4207 )
							if( marron_mean <= 21.6851 )
								ret := -0.062500
							if( marron_mean > 21.6851 )
								if( stoc <= 36.2516 )
									ret := -1.000000 // sell
								if( stoc > 36.2516 )
									ret := -0.875000 // sell
						if( azul_mean > 25.4207 )
							if( nvimin <= 0.478925 )
								ret := 0.000000
							if( nvimin > 0.478925 )
								ret := 0.846154 // buy
					if( marron > -11.0784 )
						if( pvimin <= 0.408497 )
							if( azul <= 15.0728 )
								if( verde_mean <= 8.21487 )
									ret := -0.583333
								if( verde_mean > 8.21487 )
									ret := 0.705882 // buy
							if( azul > 15.0728 )
								if( nvi <= 0.872056 )
									ret := 0.887850 // buy
								if( nvi > 0.872056 )
									ret := 0.250000
						if( pvimin > 0.408497 )
							ret := -0.687500
			if( BollOsc > -56.5033 )
				if( marron_mean <= 4.75331 )
					if( oscp <= -59.0447 )
						if( media <= 24.7275 )
							if( tprice <= 45.2716 )
								ret := -0.272727
							if( tprice > 45.2716 )
								ret := -1.000000 // sell
						if( media > 24.7275 )
							ret := -1.000000 // sell
					if( oscp > -59.0447 )
						if( azul_mean <= 50.1037 )
							if( verde_mean <= -60.8068 )
								if( oscp <= -51.4278 )
									ret := -0.307692
								if( oscp > -51.4278 )
									ret := 0.571429
							if( verde_mean > -60.8068 )
								if( xrsi <= 34.6553 )
									ret := -0.816901 // sell
								if( xrsi > 34.6553 )
									ret := -0.111111
						if( azul_mean > 50.1037 )
							ret := 0.555556
				if( marron_mean > 4.75331 )
					if( verde_azul <= -183.572 )
						ret := 1.000000 // buy
					if( verde_azul > -183.572 )
						if( pvim <= -0.244595 )
							if( verde <= 185.248 )
								if( pvimin <= -0.565216 )
									ret := -0.061020
								if( pvimin > -0.565216 )
									ret := -0.251710
							if( verde > 185.248 )
								if( nvi_ema <= 0.405623 )
									ret := -0.428571
								if( nvi_ema > 0.405623 )
									ret := 0.577320
						if( pvim > -0.244595 )
							if( source <= 25.1697 )
								if( verde <= 83.6692 )
									ret := 0.500000
								if( verde > 83.6692 )
									ret := 1.000000 // buy
							if( source > 25.1697 )
								if( verde_azul <= -24.0785 )
									ret := -0.197503
								if( verde_azul > -24.0785 )
									ret := -0.011824
		if( media_azul > 67.0319 )
			if( nvimin <= 0.392187 )
				if( xmf <= 91.3764 )
					if( source <= 44.2913 )
						if( nvimin <= 0.093009 )
							if( pvim <= 0.019695 )
								if( verde_media <= 15.9001 )
									ret := -0.735294 // sell
								if( verde_media > 15.9001 )
									ret := -0.181818
							if( pvim > 0.019695 )
								if( xrsi <= 66.9408 )
									ret := -1.000000 // sell
								if( xrsi > 66.9408 )
									ret := -0.727273 // sell
						if( nvimin > 0.093009 )
							if( stoc <= 91.3189 )
								if( oscp <= 3.59003 )
									ret := 0.385321
								if( oscp > 3.59003 )
									ret := -0.298507
							if( stoc > 91.3189 )
								if( tprice <= 35.771 )
									ret := -0.533333
								if( tprice > 35.771 )
									ret := -1.000000 // sell
					if( source > 44.2913 )
						if( BollOsc <= 45.0071 )
							ret := 0.708333 // buy
						if( BollOsc > 45.0071 )
							ret := -0.083333
				if( xmf > 91.3764 )
					if( pvimin <= -0.279502 )
						if( nvi <= 0.157818 )
							ret := -0.750000 // sell
						if( nvi > 0.157818 )
							ret := -1.000000 // sell
					if( pvimin > -0.279502 )
						if( xrsi <= 81.2412 )
							ret := -0.812500 // sell
						if( xrsi > 81.2412 )
							ret := 0.555556
			if( nvimin > 0.392187 )
				if( media <= 110.134 )
					if( pvim <= 0.355569 )
						if( pvimax <= 0.323536 )
							if( pvim <= -0.778159 )
								ret := -0.687500
							if( pvim > -0.778159 )
								if( verde_azul <= 144.068 )
									ret := 0.179465
								if( verde_azul > 144.068 )
									ret := 0.659574
						if( pvimax > 0.323536 )
							if( nvimax <= 0.869227 )
								ret := -0.133333
							if( nvimax > 0.869227 )
								if( pvi <= 0.339591 )
									ret := 0.893204 // buy
								if( pvi > 0.339591 )
									ret := 0.083333
					if( pvim > 0.355569 )
						if( oscp <= -21.7746 )
							ret := -0.944444 // sell
						if( oscp > -21.7746 )
							if( oscp <= 0.235763 )
								if( nvi <= 0.98692 )
									ret := 0.000000
								if( nvi > 0.98692 )
									ret := 0.375000
							if( oscp > 0.235763 )
								if( marron_mean <= 128.299 )
									ret := -0.384000
								if( marron_mean > 128.299 )
									ret := 0.210526
				if( media > 110.134 )
					if( tprice <= 84.2721 )
						if( verde_media <= 82.1359 )
							if( azul <= 26.1661 )
								if( xrsi <= 68.5824 )
									ret := 0.416667
								if( xrsi > 68.5824 )
									ret := -0.628713
							if( azul > 26.1661 )
								if( pvi_ema <= -0.013873 )
									ret := 0.440000
								if( pvi_ema > -0.013873 )
									ret := -0.584416
						if( verde_media > 82.1359 )
							if( tprice <= 30.9478 )
								ret := 1.000000 // buy
							if( tprice > 30.9478 )
								ret := -0.222222
					if( tprice > 84.2721 )
						if( verde <= 144.805 )
							ret := 0.875000 // buy
						if( verde > 144.805 )
							ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_UBER_15Min_e9eec15b(nvi, nvi_ema, marron_mean, source, azul, verde_azul, verde_mean, xmf, pvimin, stoc, media, tprice, marron, pvim, pvimax, xrsi, oscp, pvi, nvimax, nvimin, verde, verde_media, azul_mean, nvim, BollOsc, pvi_ema, media_azul)

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


