//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: NVDA_30Min_1KON_fe3d6510 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_1KON_fe3d6510", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_fe3d6510(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( verde_mean <= 131.255 )
		if( tprice <= 106.477 )
			if( verde <= 118.237 )
				if( nvimin <= -0.056033 )
					if( pvi <= -0.110424 )
						if( verde_media <= 11.7163 )
							if( media <= 77.4314 )
								if( source <= 29.9071 )
									ret := 0.933333 // buy
								if( source > 29.9071 )
									ret := 0.461538
							if( media > 77.4314 )
								if( pvim <= -0.117457 )
									ret := 0.988636 // buy
								if( pvim > -0.117457 )
									ret := 0.727273 // buy
						if( verde_media > 11.7163 )
							if( media_azul <= 70.0494 )
								ret := 0.125000
							if( media_azul > 70.0494 )
								ret := 0.571429
					if( pvi > -0.110424 )
						ret := -0.100000
				if( nvimin > -0.056033 )
					if( tprice <= 32.5192 )
						if( BollOsc <= 32.4225 )
							if( xrsi <= 23.833 )
								if( nvim <= -0.031257 )
									ret := 0.000000
								if( nvim > -0.031257 )
									ret := -0.861111 // sell
							if( xrsi > 23.833 )
								if( nvim <= -0.035228 )
									ret := 0.511364
								if( nvim > -0.035228 )
									ret := -0.068155
						if( BollOsc > 32.4225 )
							if( pvim <= -0.0706 )
								if( verde_azul <= 83.7224 )
									ret := -0.583333
								if( verde_azul > 83.7224 )
									ret := -0.879518 // sell
							if( pvim > -0.0706 )
								if( oscp <= 7.49035 )
									ret := 0.800000 // buy
								if( oscp > 7.49035 )
									ret := -0.812500 // sell
					if( tprice > 32.5192 )
						if( media <= 27.2584 )
							if( pvim <= 0.82104 )
								if( marron_mean <= 12.1182 )
									ret := 0.151402
								if( marron_mean > 12.1182 )
									ret := 0.497238
							if( pvim > 0.82104 )
								if( verde_mean <= -17.6406 )
									ret := -0.761905 // sell
								if( verde_mean > -17.6406 )
									ret := 0.111111
						if( media > 27.2584 )
							if( media <= 48.0268 )
								if( pvi <= 0.633861 )
									ret := 0.131890
								if( pvi > 0.633861 )
									ret := -0.222222
							if( media > 48.0268 )
								if( pvim <= 0.613471 )
									ret := 0.029905
								if( pvim > 0.613471 )
									ret := 0.283069
			if( verde > 118.237 )
				if( verde <= 146.478 )
					if( nvimin <= -0.055392 )
						if( pvim <= -0.120988 )
							ret := 0.300000
						if( pvim > -0.120988 )
							ret := 0.923077 // buy
					if( nvimin > -0.055392 )
						if( verde_azul <= 166.447 )
							if( verde_media <= 32.7762 )
								if( verde_azul <= 71.8173 )
									ret := -1.000000 // sell
								if( verde_azul > 71.8173 )
									ret := -0.023810
							if( verde_media > 32.7762 )
								if( nvi_ema <= 0.073393 )
									ret := -0.765957 // sell
								if( nvi_ema > 0.073393 )
									ret := -0.293447
						if( verde_azul > 166.447 )
							ret := 0.769231 // buy
				if( verde > 146.478 )
					if( pvimax <= 0.028412 )
						ret := -0.307692
					if( pvimax > 0.028412 )
						if( nvimin <= 0.250087 )
							if( nvimax <= 0.133095 )
								if( azul_mean <= 5.59159 )
									ret := 0.176471
								if( azul_mean > 5.59159 )
									ret := 0.800000 // buy
							if( nvimax > 0.133095 )
								ret := 1.000000 // buy
						if( nvimin > 0.250087 )
							if( stoc <= 69.5506 )
								ret := -0.357143
							if( stoc > 69.5506 )
								if( nvimin <= 0.432279 )
									ret := 0.687500
								if( nvimin > 0.432279 )
									ret := 0.090909
		if( tprice > 106.477 )
			if( tprice <= 113.178 )
				if( stoc <= 44.0849 )
					if( nvimin <= 3.19567 )
						if( pvi <= 0.425013 )
							if( media <= 24.5763 )
								ret := 0.733333 // buy
							if( media > 24.5763 )
								ret := 0.200000
						if( pvi > 0.425013 )
							if( xrsi <= 19.1924 )
								ret := 0.642857
							if( xrsi > 19.1924 )
								if( media_azul <= 23.3385 )
									ret := 0.000000
								if( media_azul > 23.3385 )
									ret := -0.511062
					if( nvimin > 3.19567 )
						if( media <= 21.0155 )
							if( oscp <= -41.7049 )
								ret := -0.666667
							if( oscp > -41.7049 )
								if( pvi <= 0.684256 )
									ret := -0.916667 // sell
								if( pvi > 0.684256 )
									ret := -1.000000 // sell
						if( media > 21.0155 )
							if( nvi_ema <= 3.54616 )
								if( marron <= 21.7888 )
									ret := 0.076923
								if( marron > 21.7888 )
									ret := -0.880000 // sell
							if( nvi_ema > 3.54616 )
								if( media <= 45.5366 )
									ret := -0.238095
								if( media > 45.5366 )
									ret := 0.100000
				if( stoc > 44.0849 )
					if( media <= 93.1046 )
						if( nvim <= 3.53965 )
							if( media <= 75.6031 )
								if( azul_mean <= -1.88008 )
									ret := -0.576923
								if( azul_mean > -1.88008 )
									ret := 0.189320
							if( media > 75.6031 )
								if( verde_mean <= 82.4825 )
									ret := 0.789474 // buy
								if( verde_mean > 82.4825 )
									ret := 0.092308
						if( nvim > 3.53965 )
							if( xrsi <= 40.1664 )
								ret := 0.777778 // buy
							if( xrsi > 40.1664 )
								ret := 1.000000 // buy
					if( media > 93.1046 )
						if( pvimax <= 0.830973 )
							if( azul_mean <= 22.0035 )
								if( pvi_ema <= 0.770793 )
									ret := -0.662162
								if( pvi_ema > 0.770793 )
									ret := 0.268293
							if( azul_mean > 22.0035 )
								ret := 0.812500 // buy
						if( pvimax > 0.830973 )
							if( source <= 109.68 )
								if( verde_mean <= 125.538 )
									ret := -0.052632
								if( verde_mean > 125.538 )
									ret := -0.375000
							if( source > 109.68 )
								if( stoc <= 86.0102 )
									ret := -1.000000 // sell
								if( stoc > 86.0102 )
									ret := -0.692308
			if( tprice > 113.178 )
				if( oscp <= -6.70777 )
					if( xrsi <= 29.1782 )
						if( nvi_ema <= 3.50778 )
							if( source <= 182.508 )
								if( nvimax <= 2.5126 )
									ret := 0.016358
								if( nvimax > 2.5126 )
									ret := -0.215686
							if( source > 182.508 )
								if( nvimin <= 2.30561 )
									ret := 0.211998
								if( nvimin > 2.30561 )
									ret := 0.016878
						if( nvi_ema > 3.50778 )
							if( marron <= -3.94099 )
								if( nvim <= 3.5438 )
									ret := -0.260870
								if( nvim > 3.5438 )
									ret := 0.888889 // buy
							if( marron > -3.94099 )
								if( stoc <= 4.64126 )
									ret := -0.121951
								if( stoc > 4.64126 )
									ret := -0.806122 // sell
					if( xrsi > 29.1782 )
						if( tprice <= 910.615 )
							if( verde_media <= -29.0321 )
								if( tprice <= 438.96 )
									ret := -0.170487
								if( tprice > 438.96 )
									ret := -0.016981
							if( verde_media > -29.0321 )
								if( nvimax <= 3.52495 )
									ret := -0.044272
								if( nvimax > 3.52495 )
									ret := -0.601942
						if( tprice > 910.615 )
							if( oscp <= -15.9151 )
								if( pvi <= 1.64398 )
									ret := 0.819820 // buy
								if( pvi > 1.64398 )
									ret := -0.400000
							if( oscp > -15.9151 )
								if( nvi_ema <= 3.48493 )
									ret := -0.441176
								if( nvi_ema > 3.48493 )
									ret := 0.619048
				if( oscp > -6.70777 )
					if( nvim <= 0.459661 )
						if( pvim <= 1.07559 )
							if( pvi <= 1.07168 )
								if( xmf <= 70.4697 )
									ret := 0.333333
								if( xmf > 70.4697 )
									ret := 0.840000 // buy
							if( pvi > 1.07168 )
								ret := 0.090909
						if( pvim > 1.07559 )
							ret := -0.739130 // sell
					if( nvim > 0.459661 )
						if( BollOsc <= -28.6113 )
							if( source <= 159.078 )
								if( source <= 119.52 )
									ret := -0.235294
								if( source > 119.52 )
									ret := 0.378738
							if( source > 159.078 )
								if( verde_media <= -34.6832 )
									ret := 0.283122
								if( verde_media > -34.6832 )
									ret := -0.009758
						if( BollOsc > -28.6113 )
							if( media <= 57.4155 )
								if( pvim <= 1.50483 )
									ret := -0.055676
								if( pvim > 1.50483 )
									ret := -0.604651
							if( media > 57.4155 )
								if( pvimax <= 1.69336 )
									ret := 0.017198
								if( pvimax > 1.69336 )
									ret := -0.958333 // sell
	if( verde_mean > 131.255 )
		if( nvimax <= 2.80301 )
			if( nvimax <= 1.0438 )
				if( verde_azul <= 167.667 )
					if( pvimin <= 0.761924 )
						if( xmf <= 76.9683 )
							if( tprice <= 62.5233 )
								if( verde_mean <= 141.749 )
									ret := 0.738636 // buy
								if( verde_mean > 141.749 )
									ret := 0.000000
							if( tprice > 62.5233 )
								if( marron_mean <= 104.305 )
									ret := 0.312500
								if( marron_mean > 104.305 )
									ret := -0.441176
						if( xmf > 76.9683 )
							if( BollOsc <= 46.6095 )
								if( nvi <= 0.089617 )
									ret := -0.200000
								if( nvi > 0.089617 )
									ret := 0.299363
							if( BollOsc > 46.6095 )
								if( azul_mean <= -4.15582 )
									ret := 0.150000
								if( azul_mean > -4.15582 )
									ret := -0.361538
					if( pvimin > 0.761924 )
						if( BollOsc <= 59.9268 )
							if( verde <= 158.151 )
								if( marron <= 110.772 )
									ret := 0.006250
								if( marron > 110.772 )
									ret := 0.428177
							if( verde > 158.151 )
								if( azul <= 20.3669 )
									ret := 0.906250 // buy
								if( azul > 20.3669 )
									ret := 0.458333
						if( BollOsc > 59.9268 )
							if( verde_mean <= 154.99 )
								if( pvimin <= 0.937252 )
									ret := 0.647059
								if( pvimin > 0.937252 )
									ret := -0.050000
							if( verde_mean > 154.99 )
								if( media <= 111.886 )
									ret := -0.636364
								if( media > 111.886 )
									ret := -0.888889 // sell
				if( verde_azul > 167.667 )
					if( tprice <= 93.5177 )
						if( verde <= 167.241 )
							if( verde_azul <= 177.826 )
								ret := 0.750000 // buy
							if( verde_azul > 177.826 )
								if( BollOsc <= 45.6215 )
									ret := 1.000000 // buy
								if( BollOsc > 45.6215 )
									ret := 0.909091 // buy
						if( verde > 167.241 )
							if( nvimin <= 0.229013 )
								if( nvimax <= 0.103407 )
									ret := 0.347826
								if( nvimax > 0.103407 )
									ret := -0.166667
							if( nvimin > 0.229013 )
								if( nvi_ema <= 0.274062 )
									ret := 0.647059
								if( nvi_ema > 0.274062 )
									ret := 1.000000 // buy
					if( tprice > 93.5177 )
						if( verde <= 177.745 )
							if( oscp <= 34.5085 )
								ret := 0.333333
							if( oscp > 34.5085 )
								if( source <= 106.487 )
									ret := -0.444444
								if( source > 106.487 )
									ret := -0.875000 // sell
						if( verde > 177.745 )
							if( pvimax <= 1.05246 )
								if( nvim <= 0.476705 )
									ret := 0.318182
								if( nvim > 0.476705 )
									ret := 0.902439 // buy
							if( pvimax > 1.05246 )
								ret := 0.181818
			if( nvimax > 1.0438 )
				if( xrsi <= 71.266 )
					if( media <= 108.211 )
						if( source <= 212.668 )
							if( azul <= 8.28138 )
								if( media_azul <= 98.3671 )
									ret := -0.645985
								if( media_azul > 98.3671 )
									ret := -0.220472
							if( azul > 8.28138 )
								if( pvi <= 0.300651 )
									ret := -0.208333
								if( pvi > 0.300651 )
									ret := 0.698630
						if( source > 212.668 )
							if( verde_azul <= 112.191 )
								if( BollOsc <= 30.2565 )
									ret := 0.476190
								if( BollOsc > 30.2565 )
									ret := -0.561905
							if( verde_azul > 112.191 )
								if( verde_azul <= 202.125 )
									ret := 0.146868
								if( verde_azul > 202.125 )
									ret := -0.684211
					if( media > 108.211 )
						if( stoc <= 86.7047 )
							if( media <= 111.472 )
								if( pvi <= 0.802913 )
									ret := 0.200000
								if( pvi > 0.802913 )
									ret := 0.727273 // buy
							if( media > 111.472 )
								if( nvi <= 1.72964 )
									ret := 0.900000 // buy
								if( nvi > 1.72964 )
									ret := 1.000000 // buy
						if( stoc > 86.7047 )
							ret := 0.200000
				if( xrsi > 71.266 )
					if( source <= 136.515 )
						if( pvi_ema <= 0.719886 )
							if( BollOsc <= 64.6109 )
								if( oscp <= 30.357 )
									ret := -0.943662 // sell
								if( oscp > 30.357 )
									ret := -0.545455
							if( BollOsc > 64.6109 )
								ret := 0.666667
						if( pvi_ema > 0.719886 )
							if( marron_mean <= 116.988 )
								ret := -0.444444
							if( marron_mean > 116.988 )
								if( marron <= 123.713 )
									ret := 1.000000 // buy
								if( marron > 123.713 )
									ret := 0.400000
					if( source > 136.515 )
						if( verde <= 118.288 )
							if( nvi <= 2.36022 )
								if( verde_media <= 7.83771 )
									ret := -0.250000
								if( verde_media > 7.83771 )
									ret := 0.555556
							if( nvi > 2.36022 )
								if( media_azul <= 91.2354 )
									ret := -0.250000
								if( media_azul > 91.2354 )
									ret := -0.784314 // sell
						if( verde > 118.288 )
							if( pvim <= 0.234906 )
								if( media_azul <= 102.22 )
									ret := 0.741935 // buy
								if( media_azul > 102.22 )
									ret := 1.000000 // buy
							if( pvim > 0.234906 )
								if( nvi_ema <= 2.19393 )
									ret := 0.058069
								if( nvi_ema > 2.19393 )
									ret := 0.199686
		if( nvimax > 2.80301 )
			if( media <= 95.4453 )
				if( verde_media <= 155.179 )
					if( xmf <= 73.6015 )
						if( media <= 68.8783 )
							ret := -0.272727
						if( media > 68.8783 )
							if( azul <= -0.239045 )
								if( pvim <= 1.27241 )
									ret := 0.828125 // buy
								if( pvim > 1.27241 )
									ret := 0.176471
							if( azul > -0.239045 )
								if( pvimin <= 0.701346 )
									ret := 0.769231 // buy
								if( pvimin > 0.701346 )
									ret := 0.970588 // buy
					if( xmf > 73.6015 )
						if( pvim <= 1.47124 )
							if( BollOsc <= 34.3512 )
								ret := 1.000000 // buy
							if( BollOsc > 34.3512 )
								if( nvimax <= 2.91016 )
									ret := 0.657143
								if( nvimax > 2.91016 )
									ret := 0.323529
						if( pvim > 1.47124 )
							ret := -0.153846
				if( verde_media > 155.179 )
					ret := 1.000000 // buy
			if( media > 95.4453 )
				if( media <= 126.244 )
					if( pvi_ema <= 1.57624 )
						if( nvimin <= 2.8068 )
							if( pvi <= 0.604031 )
								ret := -0.285714
							if( pvi > 0.604031 )
								if( verde_mean <= 139.893 )
									ret := 0.285714
								if( verde_mean > 139.893 )
									ret := 0.943662 // buy
						if( nvimin > 2.8068 )
							if( nvi <= 2.88328 )
								if( nvi <= 2.88019 )
									ret := -0.108108
								if( nvi > 2.88019 )
									ret := -1.000000 // sell
							if( nvi > 2.88328 )
								if( pvimax <= 1.55117 )
									ret := 0.216912
								if( pvimax > 1.55117 )
									ret := -0.761905 // sell
					if( pvi_ema > 1.57624 )
						if( verde_mean <= 142.311 )
							if( verde_media <= 22.7542 )
								if( stoc <= 87.8736 )
									ret := 0.857143 // buy
								if( stoc > 87.8736 )
									ret := 0.384615
							if( verde_media > 22.7542 )
								if( nvi_ema <= 3.48753 )
									ret := 0.833333 // buy
								if( nvi_ema > 3.48753 )
									ret := 1.000000 // buy
						if( verde_mean > 142.311 )
							ret := 0.166667
				if( media > 126.244 )
					ret := -0.956522 // sell
	
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
float op_operation = decision_tree_0_NVDA_30Min_fe3d6510(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


