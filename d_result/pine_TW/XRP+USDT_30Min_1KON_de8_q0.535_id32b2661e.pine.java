//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: XRPUSDT_30Min_1KON_32b2661e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_30Min_1KON_32b2661e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_30Min_32b2661e(oscp, verde_media, verde, marron, azul, media, tprice, xrsi, pvimax, media_azul, nvi_ema, azul_mean, pvim, verde_mean, pvi_ema, xmf, nvi, BollOsc, source, nvimax, pvimin, stoc, marron_mean, pvi, nvim, nvimin, verde_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( oscp <= -13.9303 )
		if( nvi_ema <= 1.41433 )
			if( verde_azul <= 48.9901 )
				if( pvimin <= 0.560684 )
					if( media <= 48.9342 )
						if( azul <= -14.9897 )
							if( BollOsc <= -35.0317 )
								if( tprice <= 0.249683 )
									ret := -0.037037
								if( tprice > 0.249683 )
									ret := 0.613793
							if( BollOsc > -35.0317 )
								if( nvimin <= 0.556643 )
									ret := 0.000000
								if( nvimin > 0.556643 )
									ret := -0.500000
						if( azul > -14.9897 )
							if( azul_mean <= 45.6772 )
								if( BollOsc <= -49.8465 )
									ret := 0.174142
								if( BollOsc > -49.8465 )
									ret := -0.112053
							if( azul_mean > 45.6772 )
								if( pvi <= 0.434933 )
									ret := 0.861111 // buy
								if( pvi > 0.434933 )
									ret := 0.350000
					if( media > 48.9342 )
						if( marron_mean <= 60.7963 )
							if( pvimin <= -0.173928 )
								if( pvimin <= -0.329802 )
									ret := 0.812500 // buy
								if( pvimin > -0.329802 )
									ret := 0.099338
							if( pvimin > -0.173928 )
								if( azul <= 22.2683 )
									ret := 0.524887
								if( azul > 22.2683 )
									ret := 0.868687 // buy
						if( marron_mean > 60.7963 )
							if( verde_azul <= 12.4549 )
								if( nvimin <= 0.444591 )
									ret := 0.096774
								if( nvimin > 0.444591 )
									ret := -0.560976
							if( verde_azul > 12.4549 )
								if( azul <= 11.843 )
									ret := -0.333333
								if( azul > 11.843 )
									ret := 0.642857
				if( pvimin > 0.560684 )
					if( azul_mean <= 26.7461 )
						if( pvimax <= 2.0784 )
							if( stoc <= 53.8574 )
								if( BollOsc <= -42.5302 )
									ret := 0.594595
								if( BollOsc > -42.5302 )
									ret := 0.108187
							if( stoc > 53.8574 )
								if( pvim <= 1.70761 )
									ret := -0.531250
								if( pvim > 1.70761 )
									ret := 0.500000
						if( pvimax > 2.0784 )
							if( verde <= -10.5927 )
								if( azul <= 4.18427 )
									ret := -0.727273 // sell
								if( azul > 4.18427 )
									ret := 0.791667 // buy
							if( verde > -10.5927 )
								if( media_azul <= 38.0656 )
									ret := -0.818182 // sell
								if( media_azul > 38.0656 )
									ret := 0.090909
					if( azul_mean > 26.7461 )
						if( marron_mean <= 9.57516 )
							ret := -0.230769
						if( marron_mean > 9.57516 )
							if( pvimax <= 1.79148 )
								if( xrsi <= 41.3531 )
									ret := 0.661017
								if( xrsi > 41.3531 )
									ret := 0.134615
							if( pvimax > 1.79148 )
								if( source <= 1.17301 )
									ret := 0.666667
								if( source > 1.17301 )
									ret := 1.000000 // buy
			if( verde_azul > 48.9901 )
				if( media <= 82.9203 )
					if( pvi <= 0.326769 )
						ret := 0.000000
					if( pvi > 0.326769 )
						if( BollOsc <= -40.1681 )
							ret := -0.909091 // sell
						if( BollOsc > -40.1681 )
							ret := -0.700000 // sell
				if( media > 82.9203 )
					ret := -1.000000 // sell
		if( nvi_ema > 1.41433 )
			if( verde <= -105.925 )
				if( BollOsc <= -71.8327 )
					if( verde_mean <= -44.2457 )
						if( verde_media <= -160.862 )
							if( stoc <= 27.1259 )
								if( azul_mean <= -17.3303 )
									ret := 0.200000
								if( azul_mean > -17.3303 )
									ret := -1.000000 // sell
							if( stoc > 27.1259 )
								if( verde_media <= -176.246 )
									ret := 0.846154 // buy
								if( verde_media > -176.246 )
									ret := -0.333333
						if( verde_media > -160.862 )
							if( marron_mean <= 4.14642 )
								if( verde <= -125.671 )
									ret := 0.600000
								if( verde > -125.671 )
									ret := -0.214286
							if( marron_mean > 4.14642 )
								ret := 1.000000 // buy
					if( verde_mean > -44.2457 )
						if( oscp <= -132.717 )
							ret := 0.450000
						if( oscp > -132.717 )
							if( verde_mean <= 2.55763 )
								if( tprice <= 0.373209 )
									ret := 0.500000
								if( tprice > 0.373209 )
									ret := 0.912500 // buy
							if( verde_mean > 2.55763 )
								ret := 0.461538
				if( BollOsc > -71.8327 )
					if( stoc <= 29.9871 )
						if( verde_mean <= -77.3015 )
							if( verde_media <= -161.509 )
								ret := 0.083333
							if( verde_media > -161.509 )
								if( source <= 0.5069 )
									ret := -0.500000
								if( source > 0.5069 )
									ret := -1.000000 // sell
						if( verde_mean > -77.3015 )
							ret := 0.666667
					if( stoc > 29.9871 )
						if( verde_media <= -160.824 )
							ret := 0.090909
						if( verde_media > -160.824 )
							ret := 1.000000 // buy
			if( verde > -105.925 )
				if( stoc <= 16.3563 )
					if( azul <= -34.9195 )
						if( BollOsc <= -69.119 )
							ret := 0.117647
						if( BollOsc > -69.119 )
							if( tprice <= 0.929304 )
								if( media <= 42.9081 )
									ret := 0.802920 // buy
								if( media > 42.9081 )
									ret := 0.280000
							if( tprice > 0.929304 )
								ret := 0.000000
					if( azul > -34.9195 )
						if( pvim <= -0.022936 )
							if( nvimax <= 11.3117 )
								if( pvi_ema <= -1.76933 )
									ret := 0.264295
								if( pvi_ema > -1.76933 )
									ret := 0.108148
							if( nvimax > 11.3117 )
								if( source <= 0.592556 )
									ret := 0.016129
								if( source > 0.592556 )
									ret := -0.827586 // sell
						if( pvim > -0.022936 )
							if( verde_media <= -58.0349 )
								if( pvimax <= 0.43282 )
									ret := 0.583333
								if( pvimax > 0.43282 )
									ret := 1.000000 // buy
							if( verde_media > -58.0349 )
								if( marron_mean <= -5.13174 )
									ret := -0.820000 // sell
								if( marron_mean > -5.13174 )
									ret := -0.246753
				if( stoc > 16.3563 )
					if( media_azul <= -80.5399 )
						if( xrsi <= 26.6625 )
							if( media_azul <= -132.605 )
								ret := 0.200000
							if( media_azul > -132.605 )
								ret := 0.863636 // buy
						if( xrsi > 26.6625 )
							if( xrsi <= 31.6008 )
								if( verde_azul <= -135.927 )
									ret := -0.884615 // sell
								if( verde_azul > -135.927 )
									ret := 0.529412
							if( xrsi > 31.6008 )
								if( stoc <= 31.1811 )
									ret := -0.391304
								if( stoc > 31.1811 )
									ret := -0.906667 // sell
					if( media_azul > -80.5399 )
						if( nvimin <= 9.54922 )
							if( verde <= -81.7139 )
								if( BollOsc <= -88.7943 )
									ret := 0.176471
								if( BollOsc > -88.7943 )
									ret := -0.473282
							if( verde > -81.7139 )
								if( nvi_ema <= 9.51246 )
									ret := 0.034231
								if( nvi_ema > 9.51246 )
									ret := -0.440000
						if( nvimin > 9.54922 )
							if( xmf <= 43.7251 )
								if( source <= 0.665263 )
									ret := 0.177585
								if( source > 0.665263 )
									ret := -0.473684
							if( xmf > 43.7251 )
								if( marron_mean <= 26.8585 )
									ret := 0.405405
								if( marron_mean > 26.8585 )
									ret := -0.034562
	if( oscp > -13.9303 )
		if( source <= 1.42481 )
			if( azul_mean <= 37.6841 )
				if( xrsi <= 79.1437 )
					if( pvimin <= 0.938242 )
						if( nvimin <= 10.8096 )
							if( azul_mean <= 3.9352 )
								if( xmf <= 62.7143 )
									ret := -0.012907
								if( xmf > 62.7143 )
									ret := -0.088775
							if( azul_mean > 3.9352 )
								if( marron <= 37.9126 )
									ret := 0.106354
								if( marron > 37.9126 )
									ret := 0.015347
						if( nvimin > 10.8096 )
							if( source <= 0.620868 )
								if( source <= 0.498469 )
									ret := 0.064945
								if( source > 0.498469 )
									ret := -0.074116
							if( source > 0.620868 )
								if( nvim <= 11.2857 )
									ret := -0.253918
								if( nvim > 11.2857 )
									ret := -0.537190
					if( pvimin > 0.938242 )
						if( BollOsc <= 48.5169 )
							if( media_azul <= 62.0206 )
								if( stoc <= 51.9188 )
									ret := 0.209877
								if( stoc > 51.9188 )
									ret := -0.192434
							if( media_azul > 62.0206 )
								if( xmf <= 48.7269 )
									ret := 0.067039
								if( xmf > 48.7269 )
									ret := 0.441517
						if( BollOsc > 48.5169 )
							if( source <= 1.04371 )
								if( nvi_ema <= 0.620481 )
									ret := 0.140625
								if( nvi_ema > 0.620481 )
									ret := -0.565217
							if( source > 1.04371 )
								if( azul_mean <= 5.31946 )
									ret := -0.236842
								if( azul_mean > 5.31946 )
									ret := -1.000000 // sell
				if( xrsi > 79.1437 )
					if( stoc <= 78.1912 )
						if( pvimin <= 0.95697 )
							if( pvi <= -0.208317 )
								if( verde_media <= 209.259 )
									ret := -0.460606
								if( verde_media > 209.259 )
									ret := -0.060000
							if( pvi > -0.208317 )
								if( nvim <= 0.465946 )
									ret := -0.461538
								if( nvim > 0.465946 )
									ret := -0.939394 // sell
						if( pvimin > 0.95697 )
							ret := 1.000000 // buy
					if( stoc > 78.1912 )
						if( BollOsc <= 92.2488 )
							if( pvim <= -8.87317 )
								if( media <= 107.141 )
									ret := -0.211538
								if( media > 107.141 )
									ret := 0.756410 // buy
							if( pvim > -8.87317 )
								if( oscp <= 44.0561 )
									ret := -0.234432
								if( oscp > 44.0561 )
									ret := -0.006494
						if( BollOsc > 92.2488 )
							ret := 1.000000 // buy
			if( azul_mean > 37.6841 )
				if( BollOsc <= -6.26868 )
					if( pvi <= -0.737805 )
						if( pvim <= -4.09127 )
							if( marron_mean <= 27.2432 )
								if( source <= 0.519033 )
									ret := 0.052632
								if( source > 0.519033 )
									ret := -0.100000
							if( marron_mean > 27.2432 )
								if( nvi <= 12.0909 )
									ret := -0.500000
								if( nvi > 12.0909 )
									ret := -1.000000 // sell
						if( pvim > -4.09127 )
							if( verde_media <= 3.42888 )
								if( verde_mean <= 25.6336 )
									ret := -0.441176
								if( verde_mean > 25.6336 )
									ret := -0.933333 // sell
							if( verde_media > 3.42888 )
								if( oscp <= -10.866 )
									ret := -0.846154 // sell
								if( oscp > -10.866 )
									ret := -1.000000 // sell
					if( pvi > -0.737805 )
						if( verde_media <= 4.43875 )
							if( verde_media <= -3.24299 )
								if( pvimin <= -0.239443 )
									ret := -0.793103 // sell
								if( pvimin > -0.239443 )
									ret := 0.513514
							if( verde_media > -3.24299 )
								if( verde_mean <= 28.5078 )
									ret := 0.911111 // buy
								if( verde_mean > 28.5078 )
									ret := 0.181818
						if( verde_media > 4.43875 )
							if( nvimax <= 0.63751 )
								if( verde_mean <= 5.81207 )
									ret := 0.300000
								if( verde_mean > 5.81207 )
									ret := -0.272727
							if( nvimax > 0.63751 )
								if( nvimax <= 2.18772 )
									ret := -0.894737 // sell
								if( nvimax > 2.18772 )
									ret := -0.500000
				if( BollOsc > -6.26868 )
					if( pvimax <= 0.644364 )
						if( azul <= 30.6055 )
							if( pvi <= -3.72401 )
								if( azul_mean <= 51.4301 )
									ret := -0.443548
								if( azul_mean > 51.4301 )
									ret := 0.500000
							if( pvi > -3.72401 )
								if( verde_azul <= 66.6667 )
									ret := -0.080808
								if( verde_azul > 66.6667 )
									ret := 0.417808
						if( azul > 30.6055 )
							if( pvim <= 0.201658 )
								if( xmf <= 56.6267 )
									ret := -0.058621
								if( xmf > 56.6267 )
									ret := -0.298604
							if( pvim > 0.201658 )
								if( media <= 102.298 )
									ret := -0.787234 // sell
								if( media > 102.298 )
									ret := 0.000000
					if( pvimax > 0.644364 )
						if( pvim <= 0.754754 )
							if( azul <= 43.8038 )
								ret := 0.800000 // buy
							if( azul > 43.8038 )
								ret := 1.000000 // buy
						if( pvim > 0.754754 )
							if( media_azul <= 13.1624 )
								ret := 0.923077 // buy
							if( media_azul > 13.1624 )
								if( BollOsc <= 41.493 )
									ret := -0.230769
								if( BollOsc > 41.493 )
									ret := -0.727273 // sell
		if( source > 1.42481 )
			if( nvi_ema <= 0.626345 )
				if( media_azul <= 67.6712 )
					if( source <= 1.79773 )
						if( BollOsc <= 27.3813 )
							ret := 1.000000 // buy
						if( BollOsc > 27.3813 )
							if( pvi <= 2.12789 )
								ret := 0.250000
							if( pvi > 2.12789 )
								ret := 0.947368 // buy
					if( source > 1.79773 )
						ret := -1.000000 // sell
				if( media_azul > 67.6712 )
					if( nvi_ema <= 0.528846 )
						ret := 0.307692
					if( nvi_ema > 0.528846 )
						if( oscp <= 15.2335 )
							if( pvimax <= 2.36882 )
								ret := -1.000000 // sell
							if( pvimax > 2.36882 )
								ret := -0.555556
						if( oscp > 15.2335 )
							if( xrsi <= 77.7024 )
								ret := 0.416667
							if( xrsi > 77.7024 )
								ret := -0.800000 // sell
			if( nvi_ema > 0.626345 )
				if( media <= 94.5606 )
					if( media <= 42.7909 )
						if( BollOsc <= -36.1661 )
							if( azul_mean <= -0.635965 )
								if( marron_mean <= 15.7144 )
									ret := 0.909091 // buy
								if( marron_mean > 15.7144 )
									ret := 0.200000
							if( azul_mean > -0.635965 )
								ret := -0.500000
						if( BollOsc > -36.1661 )
							if( pvim <= 2.06346 )
								if( source <= 1.55315 )
									ret := -0.934783 // sell
								if( source > 1.55315 )
									ret := -0.613636
							if( pvim > 2.06346 )
								ret := 0.100000
					if( media > 42.7909 )
						if( tprice <= 1.6677 )
							if( nvim <= 1.653 )
								if( nvi <= 1.20856 )
									ret := -0.250000
								if( nvi > 1.20856 )
									ret := 0.125850
							if( nvim > 1.653 )
								if( source <= 1.47823 )
									ret := -0.130435
								if( source > 1.47823 )
									ret := -0.837838 // sell
						if( tprice > 1.6677 )
							if( tprice <= 1.75279 )
								if( media_azul <= 65.1497 )
									ret := 0.000000
								if( media_azul > 65.1497 )
									ret := -1.000000 // sell
							if( tprice > 1.75279 )
								ret := -1.000000 // sell
				if( media > 94.5606 )
					if( pvimin <= 1.63944 )
						if( pvimin <= 1.58329 )
							if( xrsi <= 71.8998 )
								if( stoc <= 74.8866 )
									ret := -1.000000 // sell
								if( stoc > 74.8866 )
									ret := -0.750000 // sell
							if( xrsi > 71.8998 )
								ret := -1.000000 // sell
						if( pvimin > 1.58329 )
							if( nvimin <= 1.18265 )
								ret := -1.000000 // sell
							if( nvimin > 1.18265 )
								if( nvi <= 1.2324 )
									ret := -0.222222
								if( nvi > 1.2324 )
									ret := -0.909091 // sell
					if( pvimin > 1.63944 )
						if( verde <= 101.785 )
							ret := 0.545455
						if( verde > 101.785 )
							if( azul <= 14.4933 )
								if( BollOsc <= 34.9964 )
									ret := -0.800000 // sell
								if( BollOsc > 34.9964 )
									ret := -1.000000 // sell
							if( azul > 14.4933 )
								ret := -0.166667
	
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
float op_operation = decision_tree_0_XRPUSDT_30Min_32b2661e(oscp, verde_media, verde, marron, azul, media, tprice, xrsi, pvimax, media_azul, nvi_ema, azul_mean, pvim, verde_mean, pvi_ema, xmf, nvi, BollOsc, source, nvimax, pvimin, stoc, marron_mean, pvi, nvim, nvimin, verde_azul)

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


