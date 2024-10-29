//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: META_30Min_1KON_5fc77934 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_30Min_1KON_5fc77934", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_30Min_5fc77934(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( nvimin <= 1.17254 )
		if( xrsi <= 55.8968 )
			if( nvimax <= 0.946003 )
				if( nvimax <= 0.881604 )
					if( verde_media <= 23.9439 )
						if( source <= 165.887 )
							if( xmf <= 22.4982 )
								if( media_azul <= 79.4559 )
									ret := 0.027121
								if( media_azul > 79.4559 )
									ret := -0.331190
							if( xmf > 22.4982 )
								if( pvim <= 0.168817 )
									ret := 0.131603
								if( pvim > 0.168817 )
									ret := -0.014003
						if( source > 165.887 )
							if( media_azul <= -58.8273 )
								if( media <= 26.9464 )
									ret := 0.400000
								if( media > 26.9464 )
									ret := 0.978261 // buy
							if( media_azul > -58.8273 )
								if( verde <= -110.435 )
									ret := -0.621359
								if( verde > -110.435 )
									ret := -0.017796
					if( verde_media > 23.9439 )
						if( marron_mean <= 20.3923 )
							if( xmf <= 26.2449 )
								ret := -0.555556
							if( xmf > 26.2449 )
								if( BollOsc <= -5.34231 )
									ret := 0.724138 // buy
								if( BollOsc > -5.34231 )
									ret := 0.250000
						if( marron_mean > 20.3923 )
							if( pvim <= 0.01363 )
								if( nvimax <= 0.05813 )
									ret := 0.285714
								if( nvimax > 0.05813 )
									ret := -0.266888
							if( pvim > 0.01363 )
								if( oscp <= 7.38307 )
									ret := -0.156425
								if( oscp > 7.38307 )
									ret := 0.140351
				if( nvimax > 0.881604 )
					if( media <= 25.519 )
						if( nvimin <= 0.912176 )
							if( verde_mean <= 22.8591 )
								if( marron_mean <= -7.938 )
									ret := -0.214286
								if( marron_mean > -7.938 )
									ret := 0.490119
							if( verde_mean > 22.8591 )
								ret := -0.642857
						if( nvimin > 0.912176 )
							if( pvimax <= -0.076474 )
								ret := 0.818182 // buy
							if( pvimax > -0.076474 )
								if( verde_azul <= -6.73449 )
									ret := -0.041667
								if( verde_azul > -6.73449 )
									ret := -0.793103 // sell
					if( media > 25.519 )
						if( verde_azul <= -28.0677 )
							if( pvimin <= -0.038483 )
								if( media_azul <= 36.7204 )
									ret := -0.640000
								if( media_azul > 36.7204 )
									ret := 0.000000
							if( pvimin > -0.038483 )
								if( pvimin <= -0.01417 )
									ret := -0.969697 // sell
								if( pvimin > -0.01417 )
									ret := -0.583333
						if( verde_azul > -28.0677 )
							if( verde_media <= -56.942 )
								if( azul <= -14.3521 )
									ret := -0.310345
								if( azul > -14.3521 )
									ret := 0.700000 // buy
							if( verde_media > -56.942 )
								if( verde_mean <= 11.0649 )
									ret := -0.634146
								if( verde_mean > 11.0649 )
									ret := -0.201336
			if( nvimax > 0.946003 )
				if( xmf <= 62.0839 )
					if( nvi <= 1.17957 )
						if( marron_mean <= 28.2218 )
							if( azul_mean <= -17.3398 )
								if( media_azul <= 62.9273 )
									ret := -0.118927
								if( media_azul > 62.9273 )
									ret := 0.229955
							if( azul_mean > -17.3398 )
								if( stoc <= 6.72978 )
									ret := -0.103030
								if( stoc > 6.72978 )
									ret := 0.194965
						if( marron_mean > 28.2218 )
							if( nvi <= 1.0693 )
								if( tprice <= 117.544 )
									ret := 0.941176 // buy
								if( tprice > 117.544 )
									ret := 0.073624
							if( nvi > 1.0693 )
								if( pvi <= 0.410576 )
									ret := -0.014146
								if( pvi > 0.410576 )
									ret := -0.304991
					if( nvi > 1.17957 )
						if( tprice <= 366.258 )
							if( pvimin <= -0.823242 )
								if( media <= 49.0865 )
									ret := 1.000000 // buy
								if( media > 49.0865 )
									ret := 0.666667
							if( pvimin > -0.823242 )
								if( oscp <= -2.53125 )
									ret := 0.527094
								if( oscp > -2.53125 )
									ret := 0.017544
						if( tprice > 366.258 )
							ret := -0.500000
				if( xmf > 62.0839 )
					if( oscp <= 23.1517 )
						if( verde <= 81.3666 )
							if( pvim <= 1.35885 )
								if( pvimax <= -0.490236 )
									ret := 1.000000 // buy
								if( pvimax > -0.490236 )
									ret := 0.173112
							if( pvim > 1.35885 )
								ret := -0.888889 // sell
						if( verde > 81.3666 )
							if( verde <= 101.766 )
								if( BollOsc <= 21.9711 )
									ret := 0.316229
								if( BollOsc > 21.9711 )
									ret := 0.676329
							if( verde > 101.766 )
								if( media <= 49.05 )
									ret := 0.511111
								if( media > 49.05 )
									ret := -0.138554
					if( oscp > 23.1517 )
						if( azul <= -29.552 )
							if( xmf <= 86.1724 )
								if( xmf <= 71.4525 )
									ret := -0.600000
								if( xmf > 71.4525 )
									ret := -1.000000 // sell
							if( xmf > 86.1724 )
								ret := -0.090909
						if( azul > -29.552 )
							if( azul_mean <= -9.03312 )
								if( verde_azul <= 143.813 )
									ret := 0.500000
								if( verde_azul > 143.813 )
									ret := -0.454545
							if( azul_mean > -9.03312 )
								if( nvimin <= 1.10076 )
									ret := -0.700000 // sell
								if( nvimin > 1.10076 )
									ret := 0.235294
		if( xrsi > 55.8968 )
			if( marron <= 96.8085 )
				if( oscp <= 19.9555 )
					if( nvim <= 0.037863 )
						if( marron <= 58.7919 )
							if( verde_mean <= 59.2584 )
								ret := -0.285714
							if( verde_mean > 59.2584 )
								if( pvim <= 0.167068 )
									ret := -1.000000 // sell
								if( pvim > 0.167068 )
									ret := -0.843750 // sell
						if( marron > 58.7919 )
							if( nvimin <= -0.005979 )
								if( xmf <= 41.9287 )
									ret := 0.461538
								if( xmf > 41.9287 )
									ret := -0.297297
							if( nvimin > -0.005979 )
								if( nvi_ema <= 0.003337 )
									ret := 0.352941
								if( nvi_ema > 0.003337 )
									ret := -0.308682
					if( nvim > 0.037863 )
						if( tprice <= 111.686 )
							if( pvi_ema <= -0.724319 )
								if( pvimin <= -0.828386 )
									ret := -0.095238
								if( pvimin > -0.828386 )
									ret := -0.954545 // sell
							if( pvi_ema > -0.724319 )
								if( azul <= 6.59425 )
									ret := 0.070423
								if( azul > 6.59425 )
									ret := 0.619883
						if( tprice > 111.686 )
							if( marron <= 61.0212 )
								if( media <= 85.5565 )
									ret := -0.072398
								if( media > 85.5565 )
									ret := -0.471074
							if( marron > 61.0212 )
								if( verde_azul <= 85.1101 )
									ret := 0.029073
								if( verde_azul > 85.1101 )
									ret := -0.070611
				if( oscp > 19.9555 )
					if( nvimin <= 0.056342 )
						if( azul_mean <= -6.36823 )
							if( pvi_ema <= 0.094825 )
								if( source <= 99.519 )
									ret := 0.133333
								if( source > 99.519 )
									ret := 0.794118 // buy
							if( pvi_ema > 0.094825 )
								if( oscp <= 33.2274 )
									ret := -0.217391
								if( oscp > 33.2274 )
									ret := 0.500000
						if( azul_mean > -6.36823 )
							if( nvi_ema <= 0.022143 )
								if( nvim <= 0.013311 )
									ret := -0.333333
								if( nvim > 0.013311 )
									ret := -1.000000 // sell
							if( nvi_ema > 0.022143 )
								if( nvimin <= 0.025172 )
									ret := -0.909091 // sell
								if( nvimin > 0.025172 )
									ret := -0.038462
					if( nvimin > 0.056342 )
						if( pvi_ema <= 0.149023 )
							if( nvi <= 0.830717 )
								if( pvi <= 0.108161 )
									ret := -0.185012
								if( pvi > 0.108161 )
									ret := -0.550725
							if( nvi > 0.830717 )
								if( media_azul <= 115.314 )
									ret := -0.555556
								if( media_azul > 115.314 )
									ret := -0.085714
						if( pvi_ema > 0.149023 )
							if( nvi <= 1.08997 )
								if( nvi <= 0.985603 )
									ret := -0.074534
								if( nvi > 0.985603 )
									ret := -0.359712
							if( nvi > 1.08997 )
								if( pvim <= 0.208187 )
									ret := 0.875000 // buy
								if( pvim > 0.208187 )
									ret := -0.033333
			if( marron > 96.8085 )
				if( pvi_ema <= -0.684302 )
					if( azul <= -4.88831 )
						ret := 0.133333
					if( azul > -4.88831 )
						if( BollOsc <= 44.0424 )
							ret := 1.000000 // buy
						if( BollOsc > 44.0424 )
							if( source <= 98.062 )
								ret := 0.400000
							if( source > 98.062 )
								if( pvim <= -0.702681 )
									ret := 1.000000 // buy
								if( pvim > -0.702681 )
									ret := 0.777778 // buy
				if( pvi_ema > -0.684302 )
					if( nvimax <= 1.14834 )
						if( oscp <= 9.55091 )
							if( nvim <= 1.12776 )
								if( nvimax <= 1.03512 )
									ret := -0.013658
								if( nvimax > 1.03512 )
									ret := -0.268293
							if( nvim > 1.12776 )
								if( media <= 105.572 )
									ret := 0.157895
								if( media > 105.572 )
									ret := 0.658537
						if( oscp > 9.55091 )
							if( pvi_ema <= 1.22068 )
								if( nvi <= 0.98032 )
									ret := 0.031731
								if( nvi > 0.98032 )
									ret := 0.142571
							if( pvi_ema > 1.22068 )
								if( verde_media <= 56.3153 )
									ret := -0.063291
								if( verde_media > 56.3153 )
									ret := -0.732824 // sell
					if( nvimax > 1.14834 )
						if( pvimax <= -0.072724 )
							if( marron_mean <= 116.768 )
								if( stoc <= 67.6293 )
									ret := 0.629630
								if( stoc > 67.6293 )
									ret := -0.038314
							if( marron_mean > 116.768 )
								if( stoc <= 81.0416 )
									ret := 0.954545 // buy
								if( stoc > 81.0416 )
									ret := 0.333333
						if( pvimax > -0.072724 )
							if( nvimin <= 1.15707 )
								if( source <= 263.442 )
									ret := -0.639456
								if( source > 263.442 )
									ret := -0.261242
							if( nvimin > 1.15707 )
								if( media <= 96.0772 )
									ret := 0.123077
								if( media > 96.0772 )
									ret := -0.231343
	if( nvimin > 1.17254 )
		if( nvimax <= 1.52577 )
			if( verde <= 172.695 )
				if( verde_azul <= 132.183 )
					if( xrsi <= 74.3805 )
						if( tprice <= 327.873 )
							if( azul_mean <= -55.4358 )
								if( tprice <= 153.785 )
									ret := 0.500000
								if( tprice > 153.785 )
									ret := -0.683544
							if( azul_mean > -55.4358 )
								if( pvimax <= 0.186915 )
									ret := -0.060810
								if( pvimax > 0.186915 )
									ret := 0.209265
						if( tprice > 327.873 )
							if( media <= 104.548 )
								if( BollOsc <= 58.2618 )
									ret := -0.203471
								if( BollOsc > 58.2618 )
									ret := 0.338462
							if( media > 104.548 )
								if( pvimax <= 0.158595 )
									ret := -0.142857
								if( pvimax > 0.158595 )
									ret := 0.939394 // buy
					if( xrsi > 74.3805 )
						if( verde_mean <= 136.131 )
							if( oscp <= 11.2087 )
								if( nvi_ema <= 1.46056 )
									ret := 0.644269
								if( nvi_ema > 1.46056 )
									ret := 0.162162
							if( oscp > 11.2087 )
								if( nvimax <= 1.22608 )
									ret := -0.333333
								if( nvimax > 1.22608 )
									ret := 0.252747
						if( verde_mean > 136.131 )
							if( azul <= 26.941 )
								if( BollOsc <= 34.2347 )
									ret := 0.355556
								if( BollOsc > 34.2347 )
									ret := -0.155844
							if( azul > 26.941 )
								if( marron <= 125.312 )
									ret := -0.781818 // sell
								if( marron > 125.312 )
									ret := -0.052632
				if( verde_azul > 132.183 )
					if( nvi_ema <= 1.25701 )
						if( pvim <= -0.501799 )
							if( xrsi <= 66.4707 )
								ret := 0.315789
							if( xrsi > 66.4707 )
								if( verde_azul <= 156.499 )
									ret := -0.978261 // sell
								if( verde_azul > 156.499 )
									ret := -0.615385
						if( pvim > -0.501799 )
							if( stoc <= 70.9362 )
								if( marron <= 126.803 )
									ret := -0.433566
								if( marron > 126.803 )
									ret := 0.666667
							if( stoc > 70.9362 )
								if( nvi <= 1.19828 )
									ret := -0.346667
								if( nvi > 1.19828 )
									ret := 0.243478
					if( nvi_ema > 1.25701 )
						if( pvim <= -0.350134 )
							if( xmf <= 62.8573 )
								ret := -0.944444 // sell
							if( xmf > 62.8573 )
								if( verde <= 133.623 )
									ret := 0.535714
								if( verde > 133.623 )
									ret := -0.012658
						if( pvim > -0.350134 )
							if( azul <= 2.86934 )
								if( pvimax <= 0.077181 )
									ret := -0.747082 // sell
								if( pvimax > 0.077181 )
									ret := -0.527132
							if( azul > 2.86934 )
								if( media_azul <= 78.2457 )
									ret := 0.444444
								if( media_azul > 78.2457 )
									ret := -0.272727
			if( verde > 172.695 )
				if( verde <= 176.008 )
					if( tprice <= 180.925 )
						if( nvi_ema <= 1.23953 )
							ret := 0.857143 // buy
						if( nvi_ema > 1.23953 )
							ret := 1.000000 // buy
					if( tprice > 180.925 )
						ret := 0.466667
				if( verde > 176.008 )
					if( nvi <= 1.299 )
						if( nvi <= 1.22022 )
							if( media_azul <= 91.3284 )
								if( pvimax <= -0.018675 )
									ret := 0.769231 // buy
								if( pvimax > -0.018675 )
									ret := -0.350000
							if( media_azul > 91.3284 )
								if( media <= 102.119 )
									ret := -0.833333 // sell
								if( media > 102.119 )
									ret := -0.333333
						if( nvi > 1.22022 )
							if( stoc <= 79.789 )
								if( tprice <= 245.513 )
									ret := 1.000000 // buy
								if( tprice > 245.513 )
									ret := 0.818182 // buy
							if( stoc > 79.789 )
								if( azul <= 33.3447 )
									ret := 0.000000
								if( azul > 33.3447 )
									ret := 0.818182 // buy
					if( nvi > 1.299 )
						if( source <= 207.606 )
							if( tprice <= 167.868 )
								ret := 1.000000 // buy
							if( tprice > 167.868 )
								if( pvi <= -0.280731 )
									ret := -0.951220 // sell
								if( pvi > -0.280731 )
									ret := -0.600000
						if( source > 207.606 )
							if( nvim <= 1.36723 )
								if( nvim <= 1.34247 )
									ret := 0.583333
								if( nvim > 1.34247 )
									ret := 0.875000 // buy
							if( nvim > 1.36723 )
								if( nvi <= 1.40694 )
									ret := -0.769231 // sell
								if( nvi > 1.40694 )
									ret := 0.473684
		if( nvimax > 1.52577 )
			if( media <= 14.1035 )
				if( pvi <= -0.312322 )
					ret := -0.909091 // sell
				if( pvi > -0.312322 )
					ret := 1.000000 // buy
			if( media > 14.1035 )
				if( verde <= 61.1629 )
					if( tprice <= 241.499 )
						if( verde_media <= 8.07414 )
							if( media <= 33.7958 )
								ret := -0.705882 // sell
							if( media > 33.7958 )
								ret := -1.000000 // sell
						if( verde_media > 8.07414 )
							ret := -0.363636
					if( tprice > 241.499 )
						if( verde <= 4.78116 )
							ret := -0.777778 // sell
						if( verde > 4.78116 )
							if( verde_azul <= 21.0024 )
								ret := -0.900000 // sell
							if( verde_azul > 21.0024 )
								ret := -1.000000 // sell
				if( verde > 61.1629 )
					if( azul <= 4.94531 )
						ret := -0.250000
					if( azul > 4.94531 )
						ret := 0.307692
	
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
float op_operation = decision_tree_0_META_30Min_5fc77934(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


