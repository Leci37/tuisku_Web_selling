//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: AAVEUSDT_30Min_1KON_9b7c2517 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_30Min_1KON_9b7c2517", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_30Min_9b7c2517(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( oscp <= -9.66003 )
		if( source <= 327.646 )
			if( pvi_ema <= -1.30857 )
				if( pvi_ema <= -3.64736 )
					if( azul <= -38.6008 )
						if( nvim <= 6.39678 )
							if( pvim <= -3.6734 )
								ret := -0.230769
							if( pvim > -3.6734 )
								ret := 0.500000
						if( nvim > 6.39678 )
							if( azul_mean <= -43.4693 )
								if( xrsi <= 21.5654 )
									ret := 0.636364
								if( xrsi > 21.5654 )
									ret := 0.978261 // buy
							if( azul_mean > -43.4693 )
								if( pvi <= -4.05965 )
									ret := 0.718750 // buy
								if( pvi > -4.05965 )
									ret := 0.352941
					if( azul > -38.6008 )
						if( verde_media <= -18.1538 )
							if( media <= 51.0658 )
								if( marron_mean <= -10.4104 )
									ret := -0.640625
								if( marron_mean > -10.4104 )
									ret := 0.168550
							if( media > 51.0658 )
								if( verde <= 3.75033 )
									ret := -0.410256
								if( verde > 3.75033 )
									ret := 0.084507
						if( verde_media > -18.1538 )
							if( BollOsc <= -4.58977 )
								if( media <= 19.7021 )
									ret := 0.141026
								if( media > 19.7021 )
									ret := 0.507886
							if( BollOsc > -4.58977 )
								if( xmf <= 42.489 )
									ret := 0.565217
								if( xmf > 42.489 )
									ret := -0.196970
				if( pvi_ema > -3.64736 )
					if( verde_azul <= -36.3508 )
						if( azul <= 43.5293 )
							if( verde_mean <= -89.0573 )
								if( nvim <= 6.29654 )
									ret := -0.710145 // sell
								if( nvim > 6.29654 )
									ret := 0.370370
							if( verde_mean > -89.0573 )
								if( pvim <= -3.63029 )
									ret := -0.622222
								if( pvim > -3.63029 )
									ret := 0.215123
						if( azul > 43.5293 )
							if( nvi_ema <= 6.98587 )
								if( verde_media <= -14.0657 )
									ret := -0.259336
								if( verde_media > -14.0657 )
									ret := 0.204724
							if( nvi_ema > 6.98587 )
								if( verde_azul <= -55.0882 )
									ret := 0.380952
								if( verde_azul > -55.0882 )
									ret := 0.848485 // buy
					if( verde_azul > -36.3508 )
						if( marron_mean <= -8.51461 )
							if( BollOsc <= -55.1109 )
								if( pvimin <= -2.98082 )
									ret := -0.489362
								if( pvimin > -2.98082 )
									ret := 0.527778
							if( BollOsc > -55.1109 )
								if( pvimax <= -3.42393 )
									ret := -0.117647
								if( pvimax > -3.42393 )
									ret := 0.677725
						if( marron_mean > -8.51461 )
							if( verde_mean <= -0.430234 )
								if( azul <= 26.4877 )
									ret := -0.089316
								if( azul > 26.4877 )
									ret := 0.181481
							if( verde_mean > -0.430234 )
								if( tprice <= 294.842 )
									ret := 0.024864
								if( tprice > 294.842 )
									ret := 0.249333
			if( pvi_ema > -1.30857 )
				if( pvimax <= -0.29595 )
					if( nvimax <= 0.054522 )
						if( xmf <= 20.8197 )
							if( pvimax <= -0.413082 )
								ret := 0.818182 // buy
							if( pvimax > -0.413082 )
								ret := 0.312500
						if( xmf > 20.8197 )
							if( xmf <= 25.3424 )
								if( BollOsc <= -37.6346 )
									ret := -1.000000 // sell
								if( BollOsc > -37.6346 )
									ret := -0.571429
							if( xmf > 25.3424 )
								if( xrsi <= 44.3312 )
									ret := -0.103448
								if( xrsi > 44.3312 )
									ret := -0.900000 // sell
					if( nvimax > 0.054522 )
						if( azul_mean <= 29.8737 )
							if( stoc <= 22.8435 )
								if( marron_mean <= -9.19502 )
									ret := -0.437500
								if( marron_mean > -9.19502 )
									ret := 0.554276
							if( stoc > 22.8435 )
								if( stoc <= 42.2351 )
									ret := 0.011864
								if( stoc > 42.2351 )
									ret := 0.496203
						if( azul_mean > 29.8737 )
							if( source <= 81.6895 )
								if( media_azul <= -69.1309 )
									ret := 0.800000 // buy
								if( media_azul > -69.1309 )
									ret := 1.000000 // buy
							if( source > 81.6895 )
								if( stoc <= 66.2333 )
									ret := 0.289474
								if( stoc > 66.2333 )
									ret := 0.947368 // buy
				if( pvimax > -0.29595 )
					if( media_azul <= 14.5737 )
						if( verde_mean <= -42.5119 )
							if( tprice <= 71.9277 )
								if( pvi <= -0.182318 )
									ret := 1.000000 // buy
								if( pvi > -0.182318 )
									ret := 0.909091 // buy
							if( tprice > 71.9277 )
								ret := 0.571429
						if( verde_mean > -42.5119 )
							if( nvi <= -0.125845 )
								if( pvimax <= -0.133143 )
									ret := 1.000000 // buy
								if( pvimax > -0.133143 )
									ret := 0.555556
							if( nvi > -0.125845 )
								if( marron_mean <= 39.3018 )
									ret := 0.035857
								if( marron_mean > 39.3018 )
									ret := 0.931034 // buy
					if( media_azul > 14.5737 )
						if( pvimax <= -0.053126 )
							if( azul_mean <= 8.50606 )
								if( nvim <= 0.859926 )
									ret := -0.421801
								if( nvim > 0.859926 )
									ret := 0.279412
							if( azul_mean > 8.50606 )
								if( nvimax <= -0.121036 )
									ret := 0.818182 // buy
								if( nvimax > -0.121036 )
									ret := -0.607595
						if( pvimax > -0.053126 )
							if( media_azul <= 45.946 )
								if( media_azul <= 38.8453 )
									ret := 0.139535
								if( media_azul > 38.8453 )
									ret := -0.672727
							if( media_azul > 45.946 )
								if( verde_media <= -66.3087 )
									ret := -0.076923
								if( verde_media > -66.3087 )
									ret := 0.772727 // buy
		if( source > 327.646 )
			if( media_azul <= 81.848 )
				if( verde_media <= -23.9231 )
					if( verde_azul <= -4.47434 )
						if( nvi <= 5.35691 )
							if( source <= 385.407 )
								if( oscp <= -54.2519 )
									ret := 0.317757
								if( oscp > -54.2519 )
									ret := -0.235921
							if( source > 385.407 )
								if( pvimin <= -1.80821 )
									ret := 0.682540
								if( pvimin > -1.80821 )
									ret := 0.031980
						if( nvi > 5.35691 )
							if( nvi_ema <= 5.57435 )
								if( stoc <= 17.3499 )
									ret := 0.307692
								if( stoc > 17.3499 )
									ret := -0.950820 // sell
							if( nvi_ema > 5.57435 )
								if( media_azul <= -1.74828 )
									ret := -0.733333 // sell
								if( media_azul > -1.74828 )
									ret := 0.083333
					if( verde_azul > -4.47434 )
						if( stoc <= 12.6665 )
							if( nvi_ema <= 2.9439 )
								ret := -0.700000 // sell
							if( nvi_ema > 2.9439 )
								if( azul <= -23.6308 )
									ret := -0.764706 // sell
								if( azul > -23.6308 )
									ret := -0.949153 // sell
						if( stoc > 12.6665 )
							if( stoc <= 32.1612 )
								if( xmf <= 30.6847 )
									ret := -0.382716
								if( xmf > 30.6847 )
									ret := 0.088652
							if( stoc > 32.1612 )
								if( verde_media <= -38.4948 )
									ret := -0.704545 // sell
								if( verde_media > -38.4948 )
									ret := -0.096154
				if( verde_media > -23.9231 )
					if( nvi <= 5.31583 )
						if( pvi <= 0.120287 )
							if( tprice <= 520.87 )
								if( nvimin <= 3.01593 )
									ret := 0.590909
								if( nvimin > 3.01593 )
									ret := 0.175641
							if( tprice > 520.87 )
								if( media_azul <= 6.39622 )
									ret := -0.555556
								if( media_azul > 6.39622 )
									ret := -1.000000 // sell
						if( pvi > 0.120287 )
							if( pvi <= 0.126253 )
								ret := -0.800000 // sell
							if( pvi > 0.126253 )
								ret := -1.000000 // sell
					if( nvi > 5.31583 )
						if( verde_mean <= 15.1871 )
							if( nvimin <= 5.29931 )
								ret := 0.636364
							if( nvimin > 5.29931 )
								if( media <= 23.7598 )
									ret := 0.095238
								if( media > 23.7598 )
									ret := -0.500000
						if( verde_mean > 15.1871 )
							if( source <= 383.068 )
								if( verde_azul <= 0.588958 )
									ret := -1.000000 // sell
								if( verde_azul > 0.588958 )
									ret := -0.634146
							if( source > 383.068 )
								if( stoc <= 50.6165 )
									ret := -0.125000
								if( stoc > 50.6165 )
									ret := 0.000000
			if( media_azul > 81.848 )
				if( xmf <= 23.548 )
					ret := -0.692308
				if( xmf > 23.548 )
					if( verde_mean <= 55.8802 )
						if( pvi_ema <= -0.770952 )
							if( oscp <= -16.3045 )
								ret := 0.333333
							if( oscp > -16.3045 )
								ret := 0.777778 // buy
						if( pvi_ema > -0.770952 )
							if( verde_azul <= 36.3382 )
								ret := 1.000000 // buy
							if( verde_azul > 36.3382 )
								ret := 0.785714 // buy
					if( verde_mean > 55.8802 )
						if( azul <= 1.66468 )
							if( nvi <= 4.75347 )
								if( marron <= 58.1716 )
									ret := -0.105263
								if( marron > 58.1716 )
									ret := 0.500000
							if( nvi > 4.75347 )
								if( azul <= -8.38132 )
									ret := 1.000000 // buy
								if( azul > -8.38132 )
									ret := 0.600000
						if( azul > 1.66468 )
							ret := -0.538462
	if( oscp > -9.66003 )
		if( pvi <= 0.133488 )
			if( nvimin <= 0.039494 )
				if( marron <= 33.2729 )
					if( azul <= -25.7783 )
						if( nvimin <= -0.137816 )
							ret := 0.300000
						if( nvimin > -0.137816 )
							ret := 0.900000 // buy
					if( azul > -25.7783 )
						if( media <= 26.4901 )
							if( azul_mean <= -2.96601 )
								if( nvimin <= -0.147504 )
									ret := 0.200000
								if( nvimin > -0.147504 )
									ret := -0.333333
							if( azul_mean > -2.96601 )
								if( stoc <= 26.6227 )
									ret := 0.960000 // buy
								if( stoc > 26.6227 )
									ret := 0.166667
						if( media > 26.4901 )
							if( stoc <= 34.2763 )
								if( pvimax <= -0.000831 )
									ret := -0.584906
								if( pvimax > -0.000831 )
									ret := 0.250000
							if( stoc > 34.2763 )
								ret := 0.818182 // buy
				if( marron > 33.2729 )
					if( nvim <= -0.122644 )
						if( pvimin <= -0.257894 )
							if( oscp <= -1.20514 )
								if( azul_mean <= 8.01981 )
									ret := -0.500000
								if( azul_mean > 8.01981 )
									ret := -1.000000 // sell
							if( oscp > -1.20514 )
								if( media <= 89.7285 )
									ret := 0.588235
								if( media > 89.7285 )
									ret := -0.421053
						if( pvimin > -0.257894 )
							if( xmf <= 41.1265 )
								if( media <= 61.1398 )
									ret := 0.227273
								if( media > 61.1398 )
									ret := -0.923077 // sell
							if( xmf > 41.1265 )
								if( verde_mean <= 108.72 )
									ret := -0.791444 // sell
								if( verde_mean > 108.72 )
									ret := 0.200000
					if( nvim > -0.122644 )
						if( nvi <= -0.083728 )
							if( nvimin <= -0.145417 )
								if( nvimin <= -0.157693 )
									ret := -0.400000
								if( nvimin > -0.157693 )
									ret := 0.855670 // buy
							if( nvimin > -0.145417 )
								if( xrsi <= 54.2277 )
									ret := -0.413333
								if( xrsi > 54.2277 )
									ret := 0.300000
						if( nvi > -0.083728 )
							if( xrsi <= 41.7034 )
								ret := 0.736842 // buy
							if( xrsi > 41.7034 )
								if( pvimax <= -0.450581 )
									ret := 0.000000
								if( pvimax > -0.450581 )
									ret := -0.528529
			if( nvimin > 0.039494 )
				if( nvi <= 0.161173 )
					if( verde <= 127.792 )
						if( pvimin <= -0.483396 )
							if( nvi <= 0.065241 )
								if( nvim <= 0.047156 )
									ret := 0.875000 // buy
								if( nvim > 0.047156 )
									ret := 1.000000 // buy
							if( nvi > 0.065241 )
								if( nvimax <= 0.078887 )
									ret := 0.076923
								if( nvimax > 0.078887 )
									ret := 1.000000 // buy
						if( pvimin > -0.483396 )
							if( nvimin <= 0.046138 )
								if( media <= 76.0281 )
									ret := 0.500000
								if( media > 76.0281 )
									ret := -0.250000
							if( nvimin > 0.046138 )
								if( azul_mean <= -4.4053 )
									ret := 1.000000 // buy
								if( azul_mean > -4.4053 )
									ret := 0.620690
					if( verde > 127.792 )
						if( azul_mean <= 3.69281 )
							ret := 0.538462
						if( azul_mean > 3.69281 )
							if( marron <= 121.812 )
								ret := -1.000000 // sell
							if( marron > 121.812 )
								ret := -0.750000 // sell
				if( nvi > 0.161173 )
					if( pvim <= -4.21696 )
						if( pvimax <= -4.20498 )
							if( BollOsc <= 3.7517 )
								if( nvi <= 7.7655 )
									ret := 0.000000
								if( nvi > 7.7655 )
									ret := 0.730769 // buy
							if( BollOsc > 3.7517 )
								if( media_azul <= 77.342 )
									ret := -0.281250
								if( media_azul > 77.342 )
									ret := 0.000000
						if( pvimax > -4.20498 )
							if( media_azul <= 4.94598 )
								ret := -0.125000
							if( media_azul > 4.94598 )
								if( oscp <= -2.10177 )
									ret := 0.241935
								if( oscp > -2.10177 )
									ret := 0.684211
					if( pvim > -4.21696 )
						if( tprice <= 85.5289 )
							if( oscp <= 0.334813 )
								if( tprice <= 58.0638 )
									ret := 0.106285
								if( tprice > 58.0638 )
									ret := -0.052960
							if( oscp > 0.334813 )
								if( stoc <= 60.6135 )
									ret := 0.185497
								if( stoc > 60.6135 )
									ret := 0.048684
						if( tprice > 85.5289 )
							if( verde_media <= 50.1214 )
								if( tprice <= 565.226 )
									ret := -0.046469
								if( tprice > 565.226 )
									ret := -0.494083
							if( verde_media > 50.1214 )
								if( media_azul <= 45.5545 )
									ret := 0.277939
								if( media_azul > 45.5545 )
									ret := -0.026850
		if( pvi > 0.133488 )
			if( source <= 492.607 )
				if( pvimin <= 0.092711 )
					if( nvi_ema <= 2.72778 )
						if( verde <= 112.209 )
							ret := -1.000000 // sell
						if( verde > 112.209 )
							ret := -0.777778 // sell
					if( nvi_ema > 2.72778 )
						if( verde_azul <= 53.364 )
							if( azul_mean <= 2.22539 )
								ret := -0.444444
							if( azul_mean > 2.22539 )
								if( nvimin <= 2.74268 )
									ret := -0.875000 // sell
								if( nvimin > 2.74268 )
									ret := -1.000000 // sell
						if( verde_azul > 53.364 )
							if( nvimin <= 2.73716 )
								if( BollOsc <= 56.7839 )
									ret := 0.833333 // buy
								if( BollOsc > 56.7839 )
									ret := -0.166667
							if( nvimin > 2.73716 )
								if( pvimax <= 0.16626 )
									ret := 0.216867
								if( pvimax > 0.16626 )
									ret := -0.631579
				if( pvimin > 0.092711 )
					if( pvi <= 0.182548 )
						ret := -1.000000 // sell
					if( pvi > 0.182548 )
						ret := -0.333333
			if( source > 492.607 )
				if( verde_mean <= 161.526 )
					if( marron_mean <= 72.6454 )
						if( verde <= 20.4002 )
							ret := -0.375000
						if( verde > 20.4002 )
							if( pvimax <= 0.244669 )
								if( pvi_ema <= 0.134816 )
									ret := -0.923077 // sell
								if( pvi_ema > 0.134816 )
									ret := -1.000000 // sell
							if( pvimax > 0.244669 )
								if( oscp <= -3.10156 )
									ret := -0.700000 // sell
								if( oscp > -3.10156 )
									ret := -1.000000 // sell
					if( marron_mean > 72.6454 )
						if( source <= 537.684 )
							if( pvimin <= 0.107795 )
								if( verde_mean <= 99.4196 )
									ret := 0.000000
								if( verde_mean > 99.4196 )
									ret := -0.915254 // sell
							if( pvimin > 0.107795 )
								if( xrsi <= 65.3686 )
									ret := -0.214286
								if( xrsi > 65.3686 )
									ret := 0.857143 // buy
						if( source > 537.684 )
							ret := -1.000000 // sell
				if( verde_mean > 161.526 )
					ret := -0.066667
	
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
float op_operation = decision_tree_0_AAVEUSDT_30Min_9b7c2517(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


