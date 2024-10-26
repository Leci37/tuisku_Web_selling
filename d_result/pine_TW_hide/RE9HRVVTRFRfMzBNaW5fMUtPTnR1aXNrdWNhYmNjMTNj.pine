//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: DOGEUSDT_30Min_1KON_cabcc13c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_30Min_1KON_cabcc13c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_30Min_cabcc13c(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( source <= 0.124388 )
		if( BollOsc <= -60.356 )
			if( pvim <= 5.3155 )
				if( nvim <= 4.01333 )
					if( verde <= -45.2705 )
						if( pvimin <= 4.7904 )
							if( media <= 31.3847 )
								if( media_azul <= 40.4325 )
									ret := 0.911215 // buy
								if( media_azul > 40.4325 )
									ret := 0.428571
							if( media > 31.3847 )
								if( azul_mean <= -5.69686 )
									ret := 0.780488 // buy
								if( azul_mean > -5.69686 )
									ret := 0.148936
						if( pvimin > 4.7904 )
							if( nvimin <= 1.76255 )
								ret := 1.000000 // buy
							if( nvimin > 1.76255 )
								if( tprice <= 0.071222 )
									ret := 0.090909
								if( tprice > 0.071222 )
									ret := 0.487179
					if( verde > -45.2705 )
						if( tprice <= 0.08458 )
							if( media <= 26.7755 )
								if( nvim <= 1.74998 )
									ret := 0.738095 // buy
								if( nvim > 1.74998 )
									ret := 0.054054
							if( media > 26.7755 )
								if( nvi <= -0.070802 )
									ret := 0.923077 // buy
								if( nvi > -0.070802 )
									ret := -0.037815
						if( tprice > 0.08458 )
							if( verde_media <= -51.6381 )
								if( azul_mean <= 1.95308 )
									ret := 0.645161
								if( azul_mean > 1.95308 )
									ret := 0.060606
							if( verde_media > -51.6381 )
								if( marron <= 4.01065 )
									ret := 0.916667 // buy
								if( marron > 4.01065 )
									ret := 0.454545
				if( nvim > 4.01333 )
					if( nvi <= 4.06482 )
						ret := -0.842105 // sell
					if( nvi > 4.06482 )
						if( pvim <= 3.71508 )
							if( pvimax <= 3.6473 )
								ret := -0.583333
							if( pvimax > 3.6473 )
								if( marron_mean <= 10.9046 )
									ret := 0.666667
								if( marron_mean > 10.9046 )
									ret := 0.240000
						if( pvim > 3.71508 )
							if( pvimax <= 3.97444 )
								if( pvi <= 3.71829 )
									ret := -0.857143 // sell
								if( pvi > 3.71829 )
									ret := -0.357143
							if( pvimax > 3.97444 )
								ret := 0.357143
			if( pvim > 5.3155 )
				if( source <= 0.054745 )
					if( media_azul <= 38.669 )
						ret := -0.066667
					if( media_azul > 38.669 )
						if( media_azul <= 44.7304 )
							ret := 1.000000 // buy
						if( media_azul > 44.7304 )
							if( pvim <= 5.53263 )
								ret := 0.100000
							if( pvim > 5.53263 )
								ret := 0.789474 // buy
				if( source > 0.054745 )
					if( nvim <= 0.236688 )
						if( azul <= 12.2418 )
							if( verde_azul <= -6.92886 )
								if( verde <= -44.046 )
									ret := 0.100917
								if( verde > -44.046 )
									ret := -0.400000
							if( verde_azul > -6.92886 )
								if( media <= 54.3496 )
									ret := 0.627907
								if( media > 54.3496 )
									ret := -0.888889 // sell
						if( azul > 12.2418 )
							if( media <= 28.9934 )
								ret := 0.473684
							if( media > 28.9934 )
								if( marron <= -1.64151 )
									ret := 1.000000 // buy
								if( marron > -1.64151 )
									ret := 0.785714 // buy
					if( nvim > 0.236688 )
						if( pvi <= 6.1698 )
							if( pvimax <= 6.31265 )
								if( verde <= -43.4997 )
									ret := 0.175978
								if( verde > -43.4997 )
									ret := -0.095238
							if( pvimax > 6.31265 )
								ret := 1.000000 // buy
						if( pvi > 6.1698 )
							if( pvimax <= 6.51334 )
								if( stoc <= 35.2994 )
									ret := -0.475309
								if( stoc > 35.2994 )
									ret := 0.051282
							if( pvimax > 6.51334 )
								if( tprice <= 0.111623 )
									ret := 0.571429
								if( tprice > 0.111623 )
									ret := -0.181818
		if( BollOsc > -60.356 )
			if( pvi_ema <= 7.02423 )
				if( marron_mean <= 130.504 )
					if( oscp <= 66.7901 )
						if( media_azul <= -65.5126 )
							if( stoc <= 14.6678 )
								if( nvim <= 2.66093 )
									ret := 0.916667 // buy
								if( nvim > 2.66093 )
									ret := 1.000000 // buy
							if( stoc > 14.6678 )
								if( media <= 4.12276 )
									ret := -0.538462
								if( media > 4.12276 )
									ret := 0.425000
						if( media_azul > -65.5126 )
							if( verde_media <= 94.8359 )
								if( marron <= 120.17 )
									ret := 0.017298
								if( marron > 120.17 )
									ret := 0.165106
							if( verde_media > 94.8359 )
								if( verde <= 151.465 )
									ret := 0.250000
								if( verde > 151.465 )
									ret := -0.402597
					if( oscp > 66.7901 )
						if( media <= 109.576 )
							if( verde_media <= 79.9008 )
								if( pvimax <= 1.59441 )
									ret := 0.416667
								if( pvimax > 1.59441 )
									ret := 0.857143 // buy
							if( verde_media > 79.9008 )
								if( azul_mean <= 5.83225 )
									ret := -0.194521
								if( azul_mean > 5.83225 )
									ret := -0.494792
						if( media > 109.576 )
							if( verde_azul <= 219.815 )
								ret := 1.000000 // buy
							if( verde_azul > 219.815 )
								ret := 0.250000
				if( marron_mean > 130.504 )
					if( nvimin <= 0.228022 )
						if( pvimax <= 0.704353 )
							ret := -0.444444
						if( pvimax > 0.704353 )
							if( oscp <= 46.8504 )
								ret := -0.769231 // sell
							if( oscp > 46.8504 )
								ret := -1.000000 // sell
					if( nvimin > 0.228022 )
						if( nvim <= 2.98577 )
							if( marron <= 140.505 )
								if( verde_mean <= 177.343 )
									ret := -0.128205
								if( verde_mean > 177.343 )
									ret := -0.718310 // sell
							if( marron > 140.505 )
								ret := 0.125000
						if( nvim > 2.98577 )
							if( nvi_ema <= 3.27671 )
								ret := 1.000000 // buy
							if( nvi_ema > 3.27671 )
								ret := -0.461538
			if( pvi_ema > 7.02423 )
				if( oscp <= -4.43422 )
					if( azul <= 4.70189 )
						if( verde_mean <= 2.84795 )
							ret := 0.666667
						if( verde_mean > 2.84795 )
							ret := 1.000000 // buy
					if( azul > 4.70189 )
						if( tprice <= 0.12267 )
							ret := 0.850000 // buy
						if( tprice > 0.12267 )
							ret := 0.083333
				if( oscp > -4.43422 )
					if( verde <= 113.718 )
						if( nvimin <= -0.157412 )
							if( stoc <= 66.1472 )
								ret := -0.200000
							if( stoc > 66.1472 )
								ret := 0.000000
						if( nvimin > -0.157412 )
							ret := 0.416667
					if( verde > 113.718 )
						ret := 0.562500
	if( source > 0.124388 )
		if( nvim <= -1.03622 )
			if( stoc <= 63.4978 )
				if( verde_azul <= 49.8735 )
					if( oscp <= -0.466049 )
						if( pvim <= 7.40124 )
							if( media_azul <= 43.6933 )
								ret := -1.000000 // sell
							if( media_azul > 43.6933 )
								ret := 0.000000
						if( pvim > 7.40124 )
							if( azul_mean <= -6.94809 )
								if( pvim <= 7.95669 )
									ret := 0.566667
								if( pvim > 7.95669 )
									ret := -0.273973
							if( azul_mean > -6.94809 )
								if( media <= 38.5036 )
									ret := 0.053097
								if( media > 38.5036 )
									ret := 0.479638
					if( oscp > -0.466049 )
						if( marron_mean <= 34.246 )
							if( nvimin <= -1.2668 )
								if( pvi_ema <= 7.92276 )
									ret := 1.000000 // buy
								if( pvi_ema > 7.92276 )
									ret := 0.052632
							if( nvimin > -1.2668 )
								if( nvi <= -1.20127 )
									ret := -1.000000 // sell
								if( nvi > -1.20127 )
									ret := 0.230769
						if( marron_mean > 34.246 )
							if( pvi <= 7.94467 )
								ret := -0.538462
							if( pvi > 7.94467 )
								if( oscp <= 1.62346 )
									ret := -1.000000 // sell
								if( oscp > 1.62346 )
									ret := -0.900000 // sell
				if( verde_azul > 49.8735 )
					if( nvi <= -1.34979 )
						if( pvim <= 8.00084 )
							ret := 0.888889 // buy
						if( pvim > 8.00084 )
							if( nvimin <= -1.37637 )
								ret := -0.333333
							if( nvimin > -1.37637 )
								ret := -0.916667 // sell
					if( nvi > -1.34979 )
						if( azul_mean <= -16.8988 )
							if( stoc <= 51.4263 )
								if( nvimax <= -1.09839 )
									ret := 0.461538
								if( nvimax > -1.09839 )
									ret := 0.785714 // buy
							if( stoc > 51.4263 )
								if( verde_mean <= 90.4614 )
									ret := -0.956522 // sell
								if( verde_mean > 90.4614 )
									ret := 0.357143
						if( azul_mean > -16.8988 )
							if( nvim <= -1.14475 )
								if( nvimin <= -1.41687 )
									ret := 0.217391
								if( nvimin > -1.41687 )
									ret := 0.741538 // buy
							if( nvim > -1.14475 )
								if( xrsi <= 50.3942 )
									ret := -0.322581
								if( xrsi > 50.3942 )
									ret := 0.543478
			if( stoc > 63.4978 )
				if( nvim <= -1.10765 )
					if( BollOsc <= 14.8646 )
						if( marron_mean <= 93.0844 )
							if( tprice <= 0.234081 )
								ret := 0.692308
							if( tprice > 0.234081 )
								ret := 0.200000
						if( marron_mean > 93.0844 )
							ret := 0.944444 // buy
					if( BollOsc > 14.8646 )
						if( media <= 115.324 )
							if( azul_mean <= 35.5976 )
								if( xrsi <= 61.6815 )
									ret := -0.436620
								if( xrsi > 61.6815 )
									ret := 0.141618
							if( azul_mean > 35.5976 )
								if( verde <= 83.2011 )
									ret := -0.500000
								if( verde > 83.2011 )
									ret := -0.935484 // sell
						if( media > 115.324 )
							ret := -1.000000 // sell
				if( nvim > -1.10765 )
					if( verde_media <= 29.8064 )
						if( media_azul <= 88.9202 )
							if( nvimin <= -1.12255 )
								if( pvimin <= 7.94457 )
									ret := 0.500000
								if( pvimin > 7.94457 )
									ret := -0.166667
							if( nvimin > -1.12255 )
								if( source <= 0.338909 )
									ret := 0.000000
								if( source > 0.338909 )
									ret := 0.851852 // buy
						if( media_azul > 88.9202 )
							if( nvimin <= -1.04774 )
								if( tprice <= 0.35631 )
									ret := -0.200000
								if( tprice > 0.35631 )
									ret := -0.961538 // sell
							if( nvimin > -1.04774 )
								ret := 0.400000
					if( verde_media > 29.8064 )
						if( pvimin <= 8.10718 )
							if( xrsi <= 65.2452 )
								ret := -0.416667
							if( xrsi > 65.2452 )
								if( verde_mean <= 139.835 )
									ret := 1.000000 // buy
								if( verde_mean > 139.835 )
									ret := 0.500000
						if( pvimin > 8.10718 )
							if( verde <= 149.441 )
								ret := 1.000000 // buy
							if( verde > 149.441 )
								ret := 0.700000 // buy
		if( nvim > -1.03622 )
			if( verde <= 14.8634 )
				if( media <= 3.65861 )
					if( nvim <= 2.44353 )
						if( media_azul <= -56.2984 )
							ret := -0.235294
						if( media_azul > -56.2984 )
							if( pvimax <= 7.01756 )
								ret := 0.666667
							if( pvimax > 7.01756 )
								if( pvim <= 7.77637 )
									ret := 1.000000 // buy
								if( pvim > 7.77637 )
									ret := 0.956522 // buy
					if( nvim > 2.44353 )
						ret := -0.166667
				if( media > 3.65861 )
					if( verde_mean <= -6.30406 )
						if( BollOsc <= -46.1566 )
							if( oscp <= -38.4401 )
								if( nvimax <= -0.91229 )
									ret := 1.000000 // buy
								if( nvimax > -0.91229 )
									ret := 0.163366
							if( oscp > -38.4401 )
								if( media_azul <= 32.3135 )
									ret := -0.190476
								if( media_azul > 32.3135 )
									ret := 0.210692
						if( BollOsc > -46.1566 )
							if( marron <= 14.9639 )
								if( verde_azul <= 21.4538 )
									ret := -0.229526
								if( verde_azul > 21.4538 )
									ret := -0.868132 // sell
							if( marron > 14.9639 )
								if( BollOsc <= -38.1854 )
									ret := -0.421384
								if( BollOsc > -38.1854 )
									ret := 0.056645
					if( verde_mean > -6.30406 )
						if( xrsi <= 29.0931 )
							if( tprice <= 0.205729 )
								if( pvi <= 7.43494 )
									ret := 0.193093
								if( pvi > 7.43494 )
									ret := -0.436170
							if( tprice > 0.205729 )
								if( marron <= -7.44867 )
									ret := -0.175000
								if( marron > -7.44867 )
									ret := 0.616327
						if( xrsi > 29.0931 )
							if( nvi <= -0.324401 )
								if( xmf <= 43.6493 )
									ret := 0.216290
								if( xmf > 43.6493 )
									ret := -0.185185
							if( nvi > -0.324401 )
								if( verde_mean <= -5.3025 )
									ret := 0.549020
								if( verde_mean > -5.3025 )
									ret := -0.013730
			if( verde > 14.8634 )
				if( pvi <= 8.49439 )
					if( media <= 110.249 )
						if( verde_mean <= 28.3723 )
							if( marron <= 48.2681 )
								if( verde <= 52.6913 )
									ret := -0.128992
								if( verde > 52.6913 )
									ret := 0.607595
							if( marron > 48.2681 )
								if( pvi_ema <= 6.43811 )
									ret := -0.171233
								if( pvi_ema > 6.43811 )
									ret := -0.502941
						if( verde_mean > 28.3723 )
							if( verde_media <= -30.0495 )
								if( nvi_ema <= 3.73396 )
									ret := 0.227682
								if( nvi_ema > 3.73396 )
									ret := -0.211340
							if( verde_media > -30.0495 )
								if( tprice <= 0.170221 )
									ret := -0.007637
								if( tprice > 0.170221 )
									ret := -0.087490
					if( media > 110.249 )
						if( pvim <= 7.70038 )
							if( pvimax <= 4.97911 )
								if( xrsi <= 85.4905 )
									ret := -0.463918
								if( xrsi > 85.4905 )
									ret := 0.257143
							if( pvimax > 4.97911 )
								if( xrsi <= 85.449 )
									ret := -0.580882
								if( xrsi > 85.449 )
									ret := -0.927835 // sell
						if( pvim > 7.70038 )
							if( pvim <= 7.83902 )
								if( source <= 0.271225 )
									ret := 0.880000 // buy
								if( source > 0.271225 )
									ret := 0.000000
							if( pvim > 7.83902 )
								if( azul <= 13.7909 )
									ret := -1.000000 // sell
								if( azul > 13.7909 )
									ret := -0.818182 // sell
				if( pvi > 8.49439 )
					if( xmf <= 70.0583 )
						if( pvimin <= 8.35587 )
							if( source <= 0.430083 )
								if( nvim <= -0.977847 )
									ret := -0.909091 // sell
								if( nvim > -0.977847 )
									ret := -0.555556
							if( source > 0.430083 )
								ret := -1.000000 // sell
						if( pvimin > 8.35587 )
							if( azul <= 12.1778 )
								if( media <= 78.3821 )
									ret := -0.505376
								if( media > 78.3821 )
									ret := -0.916667 // sell
							if( azul > 12.1778 )
								ret := 0.375000
					if( xmf > 70.0583 )
						if( marron_mean <= 99.99 )
							ret := 1.000000 // buy
						if( marron_mean > 99.99 )
							if( BollOsc <= 63.7162 )
								ret := 0.411765
							if( BollOsc > 63.7162 )
								ret := -0.538462
	
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
float op_operation = decision_tree_0_DOGEUSDT_30Min_cabcc13c(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


