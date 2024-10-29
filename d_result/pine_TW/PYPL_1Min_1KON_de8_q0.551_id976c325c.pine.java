//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: PYPL_1Min_1KON_976c325c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_1KON_976c325c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_976c325c(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( stoc <= 72.2487 )
		if( xrsi <= 51.8617 )
			if( BollOsc <= -69.6686 )
				if( pvim <= -0.269687 )
					if( nvimin <= 0.296913 )
						if( verde_azul <= -20.644 )
							if( xrsi <= 26.0201 )
								ret := 1.000000 // buy
							if( xrsi > 26.0201 )
								if( source <= 59.173 )
									ret := 0.375000
								if( source > 59.173 )
									ret := 0.913043 // buy
						if( verde_azul > -20.644 )
							if( marron_mean <= 26.7573 )
								ret := -0.583333
							if( marron_mean > 26.7573 )
								if( media_azul <= 82.5606 )
									ret := 0.909091 // buy
								if( media_azul > 82.5606 )
									ret := 0.600000
					if( nvimin > 0.296913 )
						if( xrsi <= 33.9888 )
							if( verde <= -30.0874 )
								if( media_azul <= 43.3814 )
									ret := 0.137931
								if( media_azul > 43.3814 )
									ret := -0.335616
							if( verde > -30.0874 )
								if( xmf <= 25.2245 )
									ret := 0.868421 // buy
								if( xmf > 25.2245 )
									ret := 0.205607
						if( xrsi > 33.9888 )
							if( BollOsc <= -72.9488 )
								if( verde <= -29.8153 )
									ret := 0.898305 // buy
								if( verde > -29.8153 )
									ret := 0.250000
							if( BollOsc > -72.9488 )
								if( pvi <= -0.337463 )
									ret := 0.000000
								if( pvi > -0.337463 )
									ret := 0.400000
				if( pvim > -0.269687 )
					if( media_azul <= 60.4133 )
						if( source <= 76.9104 )
							if( pvi <= -0.264414 )
								ret := 0.312500
							if( pvi > -0.264414 )
								if( verde_azul <= -19.4769 )
									ret := 0.782828 // buy
								if( verde_azul > -19.4769 )
									ret := 0.058824
						if( source > 76.9104 )
							if( xmf <= 35.0943 )
								if( pvimax <= -0.243238 )
									ret := 0.307692
								if( pvimax > -0.243238 )
									ret := -0.714286 // sell
							if( xmf > 35.0943 )
								ret := 1.000000 // buy
					if( media_azul > 60.4133 )
						if( verde_azul <= 26.3753 )
							if( source <= 73.3849 )
								if( media_azul <= 94.766 )
									ret := -0.288136
								if( media_azul > 94.766 )
									ret := -1.000000 // sell
							if( source > 73.3849 )
								if( pvi_ema <= -0.252323 )
									ret := 1.000000 // buy
								if( pvi_ema > -0.252323 )
									ret := 0.777778 // buy
						if( verde_azul > 26.3753 )
							if( media_azul <= 110.311 )
								ret := 0.384615
							if( media_azul > 110.311 )
								if( nvim <= 0.523318 )
									ret := 1.000000 // buy
								if( nvim > 0.523318 )
									ret := 0.416667
			if( BollOsc > -69.6686 )
				if( marron_mean <= 71.0544 )
					if( verde_media <= -16.8001 )
						if( media_azul <= 111.151 )
							if( media <= 10.4459 )
								if( nvimin <= 0.192017 )
									ret := -0.222222
								if( nvimin > 0.192017 )
									ret := 0.327664
							if( media > 10.4459 )
								if( marron <= 13.8386 )
									ret := 0.000000
								if( marron > 13.8386 )
									ret := 0.086505
						if( media_azul > 111.151 )
							if( media_azul <= 154.148 )
								if( pvi <= -0.219715 )
									ret := 0.300752
								if( pvi > -0.219715 )
									ret := 0.718750 // buy
							if( media_azul > 154.148 )
								if( verde <= -1.24411 )
									ret := 0.384615
								if( verde > -1.24411 )
									ret := 0.986111 // buy
					if( verde_media > -16.8001 )
						if( xmf <= 82.8875 )
							if( azul <= 30.9305 )
								if( verde <= -0.69011 )
									ret := 0.236842
								if( verde > -0.69011 )
									ret := -0.008342
							if( azul > 30.9305 )
								if( pvi <= -0.342644 )
									ret := 0.015625
								if( pvi > -0.342644 )
									ret := -0.308176
						if( xmf > 82.8875 )
							if( marron <= 65.379 )
								if( verde_mean <= 29.5366 )
									ret := 0.859649 // buy
								if( verde_mean > 29.5366 )
									ret := 0.509174
							if( marron > 65.379 )
								if( media_azul <= 78.8631 )
									ret := -0.315789
								if( media_azul > 78.8631 )
									ret := 0.288136
				if( marron_mean > 71.0544 )
					if( verde_azul <= 86.9009 )
						if( oscp <= -41.0859 )
							if( BollOsc <= 3.65976 )
								if( nvi_ema <= 0.449006 )
									ret := 0.753623 // buy
								if( nvi_ema > 0.449006 )
									ret := -0.300000
							if( BollOsc > 3.65976 )
								ret := -0.533333
						if( oscp > -41.0859 )
							if( source <= 69.3771 )
								if( verde <= 81.1839 )
									ret := 0.026390
								if( verde > 81.1839 )
									ret := -0.744681 // sell
							if( source > 69.3771 )
								if( azul <= 15.3613 )
									ret := 0.306220
								if( azul > 15.3613 )
									ret := -0.403846
					if( verde_azul > 86.9009 )
						if( xmf <= 73.841 )
							if( xmf <= 37.4806 )
								ret := 1.000000 // buy
							if( xmf > 37.4806 )
								if( azul_mean <= -47.258 )
									ret := -0.253731
								if( azul_mean > -47.258 )
									ret := 0.290766
						if( xmf > 73.841 )
							if( verde_azul <= 139.675 )
								if( xrsi <= 49.8738 )
									ret := 0.660920
								if( xrsi > 49.8738 )
									ret := 0.021429
							if( verde_azul > 139.675 )
								if( marron <= 81.2173 )
									ret := 0.862069 // buy
								if( marron > 81.2173 )
									ret := 0.413793
		if( xrsi > 51.8617 )
			if( azul_mean <= 58.5415 )
				if( media_azul <= 33.3088 )
					if( marron <= 46.5117 )
						if( verde_azul <= 34.3238 )
							if( media <= 40.7154 )
								ret := -0.285714
							if( media > 40.7154 )
								if( source <= 66.3913 )
									ret := 0.166667
								if( source > 66.3913 )
									ret := 0.794118 // buy
						if( verde_azul > 34.3238 )
							ret := -0.555556
					if( marron > 46.5117 )
						if( azul <= 112.093 )
							if( verde_mean <= 102.525 )
								if( azul <= 7.1975 )
									ret := 0.047619
								if( azul > 7.1975 )
									ret := -0.252781
							if( verde_mean > 102.525 )
								if( pvim <= -0.284578 )
									ret := -0.222222
								if( pvim > -0.284578 )
									ret := 0.882353 // buy
						if( azul > 112.093 )
							if( pvimin <= -0.165284 )
								if( pvim <= -0.284094 )
									ret := -1.000000 // sell
								if( pvim > -0.284094 )
									ret := -0.833333 // sell
							if( pvimin > -0.165284 )
								ret := -0.571429
				if( media_azul > 33.3088 )
					if( oscp <= 26.117 )
						if( marron <= 95.4421 )
							if( verde_azul <= 121.321 )
								if( nvimin <= 0.431488 )
									ret := -0.033261
								if( nvimin > 0.431488 )
									ret := 0.083259
							if( verde_azul > 121.321 )
								if( verde_azul <= 164.841 )
									ret := 0.361979
								if( verde_azul > 164.841 )
									ret := -0.941176 // sell
						if( marron > 95.4421 )
							if( media_azul <= 62.638 )
								if( verde_media <= 79.0338 )
									ret := -0.569565
								if( verde_media > 79.0338 )
									ret := 0.350000
							if( media_azul > 62.638 )
								if( tprice <= 72.2247 )
									ret := -0.191882
								if( tprice > 72.2247 )
									ret := 0.377049
					if( oscp > 26.117 )
						if( azul <= 0.941919 )
							if( source <= 63.6162 )
								if( verde_azul <= 203.278 )
									ret := -0.232075
								if( verde_azul > 203.278 )
									ret := 0.631579
							if( source > 63.6162 )
								if( nvimin <= 0.438533 )
									ret := -0.516995
								if( nvimin > 0.438533 )
									ret := -0.215539
						if( azul > 0.941919 )
							if( nvi <= 0.434771 )
								if( media_azul <= 42.3494 )
									ret := 0.487805
								if( media_azul > 42.3494 )
									ret := -0.321212
							if( nvi > 0.434771 )
								if( oscp <= 66.868 )
									ret := 0.658333
								if( oscp > 66.868 )
									ret := -0.318182
			if( azul_mean > 58.5415 )
				if( nvim <= 0.467232 )
					if( oscp <= -63.686 )
						if( nvimin <= 0.25459 )
							ret := -1.000000 // sell
						if( nvimin > 0.25459 )
							ret := -0.666667
					if( oscp > -63.686 )
						if( nvimax <= 0.288108 )
							if( azul <= 80.2406 )
								ret := 0.000000
							if( azul > 80.2406 )
								ret := -0.714286 // sell
						if( nvimax > 0.288108 )
							if( xrsi <= 52.8468 )
								ret := -0.142857
							if( xrsi > 52.8468 )
								if( pvimin <= -0.280619 )
									ret := -0.673684
								if( pvimin > -0.280619 )
									ret := -1.000000 // sell
				if( nvim > 0.467232 )
					if( BollOsc <= 30.6425 )
						ret := 0.727273 // buy
					if( BollOsc > 30.6425 )
						ret := -0.062500
	if( stoc > 72.2487 )
		if( verde_media <= -46.1059 )
			if( xmf <= 38.5098 )
				if( tprice <= 61.8029 )
					if( verde_media <= -56.3415 )
						ret := 0.066667
					if( verde_media > -56.3415 )
						ret := -0.727273 // sell
				if( tprice > 61.8029 )
					if( marron_mean <= 64.9558 )
						if( tprice <= 67.8926 )
							if( marron <= 39.09 )
								ret := 1.000000 // buy
							if( marron > 39.09 )
								ret := 0.666667
						if( tprice > 67.8926 )
							ret := 0.375000
					if( marron_mean > 64.9558 )
						if( pvim <= -0.246309 )
							ret := 0.181818
						if( pvim > -0.246309 )
							ret := -0.666667
			if( xmf > 38.5098 )
				if( xrsi <= 57.8443 )
					if( marron_mean <= 83.8484 )
						if( media <= 71.7754 )
							ret := 0.777778 // buy
						if( media > 71.7754 )
							ret := 0.125000
					if( marron_mean > 83.8484 )
						if( stoc <= 75.4415 )
							if( nvimin <= 0.349595 )
								ret := 0.833333 // buy
							if( nvimin > 0.349595 )
								ret := 0.300000
						if( stoc > 75.4415 )
							if( source <= 62.0732 )
								ret := 0.909091 // buy
							if( source > 62.0732 )
								ret := 1.000000 // buy
				if( xrsi > 57.8443 )
					if( source <= 66.9656 )
						ret := -0.230769
					if( source > 66.9656 )
						ret := 0.750000 // buy
		if( verde_media > -46.1059 )
			if( verde_azul <= 34.8385 )
				if( verde <= 57.3945 )
					if( verde_mean <= 85.2663 )
						if( verde_mean <= 51.5112 )
							if( azul <= 65.8013 )
								if( xrsi <= 51.1084 )
									ret := -0.358974
								if( xrsi > 51.1084 )
									ret := 0.319018
							if( azul > 65.8013 )
								if( tprice <= 61.9115 )
									ret := -1.000000 // sell
								if( tprice > 61.9115 )
									ret := -0.454545
						if( verde_mean > 51.5112 )
							if( verde <= 56.1865 )
								if( oscp <= -30.9038 )
									ret := 0.055556
								if( oscp > -30.9038 )
									ret := -0.616580
							if( verde > 56.1865 )
								ret := 0.500000
					if( verde_mean > 85.2663 )
						if( media_azul <= 73.2086 )
							if( verde <= 52.1856 )
								if( nvim <= 0.410889 )
									ret := 0.928571 // buy
								if( nvim > 0.410889 )
									ret := 0.461538
							if( verde > 52.1856 )
								ret := -0.250000
						if( media_azul > 73.2086 )
							ret := -1.000000 // sell
				if( verde > 57.3945 )
					if( verde_mean <= 124.597 )
						if( nvimin <= 0.472909 )
							if( source <= 59.7333 )
								if( azul <= 39.0824 )
									ret := 0.538462
								if( azul > 39.0824 )
									ret := -0.050000
							if( source > 59.7333 )
								if( BollOsc <= 31.4317 )
									ret := -0.424419
								if( BollOsc > 31.4317 )
									ret := -0.778502 // sell
						if( nvimin > 0.472909 )
							if( oscp <= -13.7343 )
								ret := 0.687500
							if( oscp > -13.7343 )
								if( verde_mean <= 76.7093 )
									ret := -0.083333
								if( verde_mean > 76.7093 )
									ret := 0.222222
					if( verde_mean > 124.597 )
						if( xmf <= 77.7798 )
							ret := -0.636364
						if( xmf > 77.7798 )
							ret := 0.875000 // buy
			if( verde_azul > 34.8385 )
				if( BollOsc <= 44.0228 )
					if( pvi_ema <= -0.388447 )
						if( media <= 105.075 )
							if( marron <= 97.2743 )
								if( nvi <= 0.44234 )
									ret := -0.217133
								if( nvi > 0.44234 )
									ret := 0.043668
							if( marron > 97.2743 )
								if( oscp <= 12.0541 )
									ret := 0.418994
								if( oscp > 12.0541 )
									ret := -0.111888
						if( media > 105.075 )
							if( xmf <= 61.6321 )
								ret := 0.727273 // buy
							if( xmf > 61.6321 )
								if( verde <= 133.465 )
									ret := -0.761538 // sell
								if( verde > 133.465 )
									ret := -0.083333
					if( pvi_ema > -0.388447 )
						if( azul <= 2.48956 )
							if( marron_mean <= 65.3305 )
								if( media_azul <= 44.8455 )
									ret := 0.379310
								if( media_azul > 44.8455 )
									ret := -0.335443
							if( marron_mean > 65.3305 )
								if( azul <= -91.0251 )
									ret := -0.833333 // sell
								if( azul > -91.0251 )
									ret := 0.055599
						if( azul > 2.48956 )
							if( pvi_ema <= -0.277344 )
								if( nvimax <= 0.415168 )
									ret := -0.042348
								if( nvimax > 0.415168 )
									ret := 0.088483
							if( pvi_ema > -0.277344 )
								if( pvim <= -0.026208 )
									ret := -0.076159
								if( pvim > -0.026208 )
									ret := -0.926829 // sell
				if( BollOsc > 44.0228 )
					if( pvim <= -0.276098 )
						if( azul <= 18.1579 )
							if( verde_mean <= 178.241 )
								if( source <= 60.1063 )
									ret := 0.113235
								if( source > 60.1063 )
									ret := -0.103728
							if( verde_mean > 178.241 )
								if( tprice <= 69.1141 )
									ret := 0.565022
								if( tprice > 69.1141 )
									ret := -0.116667
						if( azul > 18.1579 )
							if( pvim <= -0.365542 )
								if( verde_media <= 30.9051 )
									ret := -0.359756
								if( verde_media > 30.9051 )
									ret := 0.062053
							if( pvim > -0.365542 )
								if( verde_mean <= 163.631 )
									ret := -0.290192
								if( verde_mean > 163.631 )
									ret := 0.354430
					if( pvim > -0.276098 )
						if( xmf <= 46.3405 )
							if( pvi <= -0.213339 )
								if( nvim <= 0.249802 )
									ret := 0.555556
								if( nvim > 0.249802 )
									ret := -0.377778
							if( pvi > -0.213339 )
								if( nvim <= 0.067304 )
									ret := 0.090909
								if( nvim > 0.067304 )
									ret := -0.803279 // sell
						if( xmf > 46.3405 )
							if( pvim <= -0.261124 )
								if( xmf <= 89.4458 )
									ret := -0.285996
								if( xmf > 89.4458 )
									ret := -0.740260 // sell
							if( pvim > -0.261124 )
								if( marron_mean <= 118.916 )
									ret := -0.115990
								if( marron_mean > 118.916 )
									ret := -0.414365
	
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
float op_operation = decision_tree_0_PYPL_1Min_976c325c(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


