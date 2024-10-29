//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: TSLA_15Min_1KON_90f48684 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_15Min_1KON_90f48684", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_15Min_90f48684(nvi, nvi_ema, marron_mean, source, azul, verde_azul, verde_mean, xmf, pvimin, stoc, media, tprice, marron, pvim, pvimax, xrsi, oscp, pvi, nvimax, nvimin, verde, verde_media, azul_mean, nvim, BollOsc, pvi_ema, media_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( nvimax <= -2.22614 )
		if( media <= 86.0793 )
			if( pvi_ema <= 4.12905 )
				if( media_azul <= 100.011 )
					if( verde_azul <= -38.296 )
						ret := -0.428571
					if( verde_azul > -38.296 )
						if( nvimax <= -2.31577 )
							if( pvi <= 4.1294 )
								if( pvim <= 4.12127 )
									ret := 0.940741 // buy
								if( pvim > 4.12127 )
									ret := 0.181818
							if( pvi > 4.1294 )
								ret := 0.000000
						if( nvimax > -2.31577 )
							if( pvi_ema <= 4.12352 )
								if( tprice <= 109.081 )
									ret := -0.291667
								if( tprice > 109.081 )
									ret := 0.458333
							if( pvi_ema > 4.12352 )
								if( xrsi <= 21.2511 )
									ret := 1.000000 // buy
								if( xrsi > 21.2511 )
									ret := 0.777778 // buy
				if( media_azul > 100.011 )
					if( stoc <= 59.518 )
						ret := -0.300000
					if( stoc > 59.518 )
						ret := -1.000000 // sell
			if( pvi_ema > 4.12905 )
				if( source <= 115.922 )
					if( xmf <= 14.797 )
						if( nvim <= -2.36391 )
							ret := -0.666667
						if( nvim > -2.36391 )
							ret := -1.000000 // sell
					if( xmf > 14.797 )
						if( media_azul <= 52.1087 )
							if( pvimax <= 4.16899 )
								ret := -0.111111
							if( pvimax > 4.16899 )
								ret := 1.000000 // buy
						if( media_azul > 52.1087 )
							if( pvi_ema <= 4.1387 )
								if( BollOsc <= 18.5271 )
									ret := 0.210526
								if( BollOsc > 18.5271 )
									ret := -0.133333
							if( pvi_ema > 4.1387 )
								if( pvim <= 4.14234 )
									ret := -0.600000
								if( pvim > 4.14234 )
									ret := -1.000000 // sell
				if( source > 115.922 )
					if( pvim <= 4.53977 )
						if( verde_mean <= 62.0777 )
							if( media <= 57.1202 )
								if( xrsi <= 29.002 )
									ret := 0.562814
								if( xrsi > 29.002 )
									ret := 0.084722
							if( media > 57.1202 )
								if( pvimin <= 4.45843 )
									ret := 0.675393
								if( pvimin > 4.45843 )
									ret := 0.178571
						if( verde_mean > 62.0777 )
							if( azul_mean <= -8.67107 )
								if( BollOsc <= 18.9821 )
									ret := 0.218182
								if( BollOsc > 18.9821 )
									ret := 0.780000 // buy
							if( azul_mean > -8.67107 )
								if( source <= 154.885 )
									ret := -0.337793
								if( source > 154.885 )
									ret := 0.063107
					if( pvim > 4.53977 )
						if( azul <= 2.07355 )
							if( xmf <= 31.6364 )
								if( azul <= -62.5079 )
									ret := 0.651163
								if( azul > -62.5079 )
									ret := -0.292517
							if( xmf > 31.6364 )
								if( source <= 200.367 )
									ret := 0.039062
								if( source > 200.367 )
									ret := -0.278571
						if( azul > 2.07355 )
							if( oscp <= 37.0029 )
								if( xrsi <= 25.3598 )
									ret := 0.627907
								if( xrsi > 25.3598 )
									ret := 0.088550
							if( oscp > 37.0029 )
								if( media_azul <= 60.332 )
									ret := -1.000000 // sell
								if( media_azul > 60.332 )
									ret := -0.636364
		if( media > 86.0793 )
			if( source <= 122.002 )
				if( verde_mean <= 128.452 )
					if( oscp <= -3.92764 )
						ret := -0.583333
					if( oscp > -3.92764 )
						if( verde <= 133.92 )
							if( verde_mean <= 94.288 )
								ret := 0.333333
							if( verde_mean > 94.288 )
								if( media <= 90.6673 )
									ret := 0.641509
								if( media > 90.6673 )
									ret := 0.928230 // buy
						if( verde > 133.92 )
							ret := -0.166667
				if( verde_mean > 128.452 )
					if( stoc <= 86.2812 )
						ret := 0.687500
					if( stoc > 86.2812 )
						if( marron <= 116.789 )
							ret := -0.375000
						if( marron > 116.789 )
							if( pvi_ema <= 4.08535 )
								ret := -0.500000
							if( pvi_ema > 4.08535 )
								ret := -1.000000 // sell
			if( source > 122.002 )
				if( oscp <= 8.65598 )
					if( pvimin <= 4.15484 )
						if( verde <= 112.152 )
							if( nvim <= -2.28078 )
								if( nvi_ema <= -2.29733 )
									ret := -0.444444
								if( nvi_ema > -2.29733 )
									ret := 0.333333
							if( nvim > -2.28078 )
								ret := -1.000000 // sell
						if( verde > 112.152 )
							if( nvim <= -2.30566 )
								ret := -1.000000 // sell
							if( nvim > -2.30566 )
								ret := -0.600000
					if( pvimin > 4.15484 )
						if( nvimin <= -2.32547 )
							if( xmf <= 65.1147 )
								if( azul_mean <= 8.98251 )
									ret := 0.076923
								if( azul_mean > 8.98251 )
									ret := 0.842857 // buy
							if( xmf > 65.1147 )
								if( media <= 97.3089 )
									ret := -0.785714 // sell
								if( media > 97.3089 )
									ret := 0.615385
						if( nvimin > -2.32547 )
							if( pvimax <= 4.47644 )
								if( stoc <= 81.8379 )
									ret := 0.651376
								if( stoc > 81.8379 )
									ret := -0.307692
							if( pvimax > 4.47644 )
								if( xrsi <= 62.0737 )
									ret := 0.195531
								if( xrsi > 62.0737 )
									ret := -0.269962
				if( oscp > 8.65598 )
					if( verde_azul <= 105.428 )
						if( nvimin <= -2.33082 )
							ret := 0.166667
						if( nvimin > -2.33082 )
							if( stoc <= 91.2961 )
								if( marron <= 93.5235 )
									ret := 0.297297
								if( marron > 93.5235 )
									ret := 0.836364 // buy
							if( stoc > 91.2961 )
								if( source <= 184.616 )
									ret := -0.380952
								if( source > 184.616 )
									ret := 0.750000 // buy
					if( verde_azul > 105.428 )
						if( pvi_ema <= 4.19185 )
							if( xmf <= 81.5857 )
								if( xrsi <= 70.5131 )
									ret := 0.769231 // buy
								if( xrsi > 70.5131 )
									ret := 1.000000 // buy
							if( xmf > 81.5857 )
								ret := -0.235294
						if( pvi_ema > 4.19185 )
							if( stoc <= 86.412 )
								if( verde_mean <= 105.878 )
									ret := 0.540000
								if( verde_mean > 105.878 )
									ret := -0.041237
							if( stoc > 86.412 )
								if( stoc <= 93.9735 )
									ret := 0.360000
								if( stoc > 93.9735 )
									ret := -0.181818
	if( nvimax > -2.22614 )
		if( oscp <= 24.2276 )
			if( pvi_ema <= 4.17531 )
				if( nvimin <= -2.06941 )
					if( pvi <= 3.96147 )
						ret := 1.000000 // buy
					if( pvi > 3.96147 )
						if( azul <= 2.16589 )
							if( oscp <= -41.0996 )
								if( nvimax <= -2.06287 )
									ret := -0.980769 // sell
								if( nvimax > -2.06287 )
									ret := -0.800000 // sell
							if( oscp > -41.0996 )
								if( azul_mean <= -9.49297 )
									ret := -0.139860
								if( azul_mean > -9.49297 )
									ret := -0.556604
						if( azul > 2.16589 )
							if( pvimax <= 4.14839 )
								if( nvimin <= -2.23604 )
									ret := -0.187500
								if( nvimin > -2.23604 )
									ret := -0.750000 // sell
							if( pvimax > 4.14839 )
								if( xmf <= 41.6618 )
									ret := 0.525000
								if( xmf > 41.6618 )
									ret := -0.117647
				if( nvimin > -2.06941 )
					if( nvimax <= -0.896031 )
						if( oscp <= -100.94 )
							if( stoc <= 47.3863 )
								if( BollOsc <= -67.0298 )
									ret := 0.873016 // buy
								if( BollOsc > -67.0298 )
									ret := 0.181818
							if( stoc > 47.3863 )
								ret := -0.416667
						if( oscp > -100.94 )
							if( tprice <= 1775.41 )
								if( source <= 1507.12 )
									ret := 0.056961
								if( source > 1507.12 )
									ret := -0.258520
							if( tprice > 1775.41 )
								if( BollOsc <= -29.3526 )
									ret := 0.727273 // buy
								if( BollOsc > -29.3526 )
									ret := 0.218375
					if( nvimax > -0.896031 )
						if( nvimin <= -0.936248 )
							if( pvi_ema <= 3.15386 )
								if( pvi_ema <= 2.94215 )
									ret := 0.111111
								if( pvi_ema > 2.94215 )
									ret := -0.821561 // sell
							if( pvi_ema > 3.15386 )
								if( verde_mean <= 11.074 )
									ret := 0.040984
								if( verde_mean > 11.074 )
									ret := -0.525362
						if( nvimin > -0.936248 )
							if( media_azul <= 17.9952 )
								if( media_azul <= -84.6258 )
									ret := 0.362500
								if( media_azul > -84.6258 )
									ret := -0.101296
							if( media_azul > 17.9952 )
								if( media <= 110.751 )
									ret := 0.003122
								if( media > 110.751 )
									ret := 0.221294
			if( pvi_ema > 4.17531 )
				if( oscp <= -25.6856 )
					if( BollOsc <= -19.6948 )
						if( nvimin <= -1.99126 )
							if( media_azul <= -4.12537 )
								if( tprice <= 198.845 )
									ret := 0.894737 // buy
								if( tprice > 198.845 )
									ret := 0.486111
							if( media_azul > -4.12537 )
								if( azul_mean <= 17.6894 )
									ret := -0.018310
								if( azul_mean > 17.6894 )
									ret := -0.565217
						if( nvimin > -1.99126 )
							if( source <= 189.361 )
								if( marron <= -13.554 )
									ret := 0.714286 // buy
								if( marron > -13.554 )
									ret := 0.079787
							if( source > 189.361 )
								if( nvimin <= -0.864579 )
									ret := -0.288763
								if( nvimin > -0.864579 )
									ret := 0.678571
					if( BollOsc > -19.6948 )
						if( marron <= 48.573 )
							if( verde_mean <= 85.0878 )
								if( verde_azul <= -56.0022 )
									ret := 0.777778 // buy
								if( verde_azul > -56.0022 )
									ret := -0.228070
							if( verde_mean > 85.0878 )
								ret := 0.888889 // buy
						if( marron > 48.573 )
							if( nvi <= -1.91528 )
								if( azul_mean <= 11.0046 )
									ret := 0.000000
								if( azul_mean > 11.0046 )
									ret := 0.955556 // buy
							if( nvi > -1.91528 )
								if( nvimax <= -1.59437 )
									ret := 0.021978
								if( nvimax > -1.59437 )
									ret := 0.605263
				if( oscp > -25.6856 )
					if( marron <= 64.9556 )
						if( nvi_ema <= -0.961091 )
							if( pvim <= 4.27307 )
								if( verde_mean <= 46.1713 )
									ret := -0.170949
								if( verde_mean > 46.1713 )
									ret := 0.051695
							if( pvim > 4.27307 )
								if( oscp <= -3.5414 )
									ret := -0.029719
								if( oscp > -3.5414 )
									ret := 0.062175
						if( nvi_ema > -0.961091 )
							if( media_azul <= 89.7011 )
								if( nvi_ema <= -0.894836 )
									ret := 0.278043
								if( nvi_ema > -0.894836 )
									ret := 0.011873
							if( media_azul > 89.7011 )
								if( pvim <= 4.2549 )
									ret := 0.153846
								if( pvim > 4.2549 )
									ret := 0.822222 // buy
					if( marron > 64.9556 )
						if( nvi_ema <= -0.887052 )
							if( pvim <= 4.97117 )
								if( nvimin <= -0.90409 )
									ret := -0.076757
								if( nvimin > -0.90409 )
									ret := 0.331658
							if( pvim > 4.97117 )
								if( source <= 929.237 )
									ret := 0.206725
								if( source > 929.237 )
									ret := -0.634615
						if( nvi_ema > -0.887052 )
							if( nvimin <= -0.843965 )
								if( verde_azul <= 112.718 )
									ret := -0.625874
								if( verde_azul > 112.718 )
									ret := -0.111111
							if( nvimin > -0.843965 )
								if( media_azul <= 71.2116 )
									ret := 1.000000 // buy
								if( media_azul > 71.2116 )
									ret := -0.400000
		if( oscp > 24.2276 )
			if( xrsi <= 71.0747 )
				if( source <= 993.315 )
					if( xrsi <= 56.6469 )
						if( nvi <= -0.799688 )
							if( verde_media <= 17.8351 )
								if( pvimin <= 4.37971 )
									ret := -0.510204
								if( pvimin > 4.37971 )
									ret := 0.648649
							if( verde_media > 17.8351 )
								if( stoc <= 23.4606 )
									ret := -0.538462
								if( stoc > 23.4606 )
									ret := 0.477477
						if( nvi > -0.799688 )
							if( pvi <= 2.02567 )
								if( source <= 251.47 )
									ret := -0.136752
								if( source > 251.47 )
									ret := 0.189055
							if( pvi > 2.02567 )
								if( pvim <= 2.93179 )
									ret := -0.829268 // sell
								if( pvim > 2.93179 )
									ret := -0.250000
					if( xrsi > 56.6469 )
						if( nvimin <= 0.241342 )
							if( nvi <= 0.241696 )
								if( xrsi <= 61.9907 )
									ret := -0.142744
								if( xrsi > 61.9907 )
									ret := 0.025732
							if( nvi > 0.241696 )
								if( xmf <= 63.7985 )
									ret := -0.900000 // sell
								if( xmf > 63.7985 )
									ret := -1.000000 // sell
						if( nvimin > 0.241342 )
							if( nvim <= 0.243829 )
								ret := 1.000000 // buy
							if( nvim > 0.243829 )
								if( pvimin <= 0.358112 )
									ret := 0.280000
								if( pvimin > 0.358112 )
									ret := 0.640000
				if( source > 993.315 )
					if( nvi <= -1.26938 )
						if( media <= 76.183 )
							ret := -0.230769
						if( media > 76.183 )
							if( media_azul <= 104.663 )
								ret := 1.000000 // buy
							if( media_azul > 104.663 )
								ret := 0.833333 // buy
					if( nvi > -1.26938 )
						if( verde_azul <= 191.824 )
							if( media <= 78.4763 )
								if( xmf <= 93.2839 )
									ret := -0.523810
								if( xmf > 93.2839 )
									ret := 0.833333 // buy
							if( media > 78.4763 )
								if( nvi <= -0.973054 )
									ret := -0.347222
								if( nvi > -0.973054 )
									ret := 0.580645
						if( verde_azul > 191.824 )
							if( nvimax <= -0.879493 )
								if( azul <= -9.4681 )
									ret := -0.333333
								if( azul > -9.4681 )
									ret := -1.000000 // sell
							if( nvimax > -0.879493 )
								ret := -1.000000 // sell
			if( xrsi > 71.0747 )
				if( verde <= 255.206 )
					if( pvi <= 4.26724 )
						if( nvimax <= -0.322647 )
							if( xmf <= 86.2009 )
								if( tprice <= 947.244 )
									ret := 0.068575
								if( tprice > 947.244 )
									ret := 0.456446
							if( xmf > 86.2009 )
								if( nvimax <= -0.862011 )
									ret := 0.372236
								if( nvimax > -0.862011 )
									ret := 0.189565
						if( nvimax > -0.322647 )
							if( verde <= 157.019 )
								if( media_azul <= 10.6204 )
									ret := 0.964286 // buy
								if( media_azul > 10.6204 )
									ret := 0.183771
							if( verde > 157.019 )
								if( media_azul <= 72.4125 )
									ret := 0.155039
								if( media_azul > 72.4125 )
									ret := -0.122699
					if( pvi > 4.26724 )
						if( verde <= 156.565 )
							if( pvim <= 4.6091 )
								if( marron_mean <= 118.061 )
									ret := 0.180982
								if( marron_mean > 118.061 )
									ret := -0.242857
							if( pvim > 4.6091 )
								if( marron <= 106.07 )
									ret := -0.551724
								if( marron > 106.07 )
									ret := 0.400651
						if( verde > 156.565 )
							if( BollOsc <= 90.7406 )
								if( verde <= 182.58 )
									ret := -0.307107
								if( verde > 182.58 )
									ret := 0.067024
							if( BollOsc > 90.7406 )
								if( pvim <= 4.43506 )
									ret := 0.630137
								if( pvim > 4.43506 )
									ret := 0.024390
				if( verde > 255.206 )
					if( xmf <= 67.7162 )
						ret := 0.083333
					if( xmf > 67.7162 )
						if( azul <= 17.4968 )
							if( stoc <= 81.1683 )
								if( media_azul <= 63.5681 )
									ret := 0.727273 // buy
								if( media_azul > 63.5681 )
									ret := 0.936170 // buy
							if( stoc > 81.1683 )
								ret := 0.666667
						if( azul > 17.4968 )
							if( pvi_ema <= 3.70901 )
								if( azul <= 64.3316 )
									ret := 0.333333
								if( azul > 64.3316 )
									ret := 0.944444 // buy
							if( pvi_ema > 3.70901 )
								ret := -0.583333
	
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
float op_operation = decision_tree_0_TSLA_15Min_90f48684(nvi, nvi_ema, marron_mean, source, azul, verde_azul, verde_mean, xmf, pvimin, stoc, media, tprice, marron, pvim, pvimax, xrsi, oscp, pvi, nvimax, nvimin, verde, verde_media, azul_mean, nvim, BollOsc, pvi_ema, media_azul)

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


