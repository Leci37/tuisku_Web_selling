//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: SHIBUSDT_30Min_1KON_f53eb12b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHIBUSDT_30Min_1KON_f53eb12b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHIBUSDT_30Min_f53eb12b(nvimin, azul, nvim, marron_mean, marron, nvimax, pvi, pvi_ema, oscp, verde, source, stoc, verde_mean, xrsi, media, xmf, tprice, pvimin, media_azul, verde_media, BollOsc, pvimax, nvi_ema, azul_mean, pvim, nvi, verde_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( xrsi <= 30.5331 )
		if( xrsi <= 14.9845 )
			if( verde_mean <= -12.3026 )
				if( source <= 1.1e-05 )
					if( stoc <= 13.8105 )
						if( verde_azul <= -51.1091 )
							if( verde_media <= -48.9125 )
								ret := -0.750000 // sell
							if( verde_media > -48.9125 )
								ret := -1.000000 // sell
						if( verde_azul > -51.1091 )
							if( BollOsc <= -51.0523 )
								ret := 0.000000
							if( BollOsc > -51.0523 )
								ret := 0.500000
					if( stoc > 13.8105 )
						if( stoc <= 25.7161 )
							if( marron <= -9.6526 )
								if( verde_mean <= -29.3627 )
									ret := 0.808824 // buy
								if( verde_mean > -29.3627 )
									ret := 0.000000
							if( marron > -9.6526 )
								if( nvi_ema <= 0.41666 )
									ret := -0.400000
								if( nvi_ema > 0.41666 )
									ret := 0.714286 // buy
						if( stoc > 25.7161 )
							if( xmf <= 16.0588 )
								if( pvi <= -0.921081 )
									ret := 0.272727
								if( pvi > -0.921081 )
									ret := -0.461538
							if( xmf > 16.0588 )
								if( media <= 27.2247 )
									ret := 0.555556
								if( media > 27.2247 )
									ret := -0.750000 // sell
				if( source > 1.1e-05 )
					if( azul <= 73.2389 )
						if( pvi_ema <= -0.080069 )
							if( azul <= -69.1664 )
								ret := -0.500000
							if( azul > -69.1664 )
								if( verde <= -237.397 )
									ret := 0.000000
								if( verde > -237.397 )
									ret := 0.923913 // buy
						if( pvi_ema > -0.080069 )
							if( nvi_ema <= 1.12229 )
								if( media <= 6.80675 )
									ret := 0.757895 // buy
								if( media > 6.80675 )
									ret := 0.380000
							if( nvi_ema > 1.12229 )
								if( tprice <= 1.2e-05 )
									ret := -0.666667
								if( tprice > 1.2e-05 )
									ret := 0.500000
					if( azul > 73.2389 )
						ret := -0.500000
			if( verde_mean > -12.3026 )
				if( xmf <= 17.405 )
					ret := -0.750000 // sell
				if( xmf > 17.405 )
					ret := -1.000000 // sell
		if( xrsi > 14.9845 )
			if( nvi_ema <= -0.596517 )
				if( nvi_ema <= -0.6106 )
					if( pvimin <= -0.163909 )
						if( oscp <= -29.7261 )
							ret := -0.500000
						if( oscp > -29.7261 )
							if( xrsi <= 28.3517 )
								ret := 1.000000 // buy
							if( xrsi > 28.3517 )
								ret := 0.166667
					if( pvimin > -0.163909 )
						if( azul_mean <= -2.13069 )
							if( media <= 14.9897 )
								ret := -0.571429
							if( media > 14.9897 )
								ret := -1.000000 // sell
						if( azul_mean > -2.13069 )
							if( marron_mean <= 25.575 )
								if( media_azul <= -2.06732 )
									ret := 0.285714
								if( media_azul > -2.06732 )
									ret := -0.642857
							if( marron_mean > 25.575 )
								ret := 1.000000 // buy
				if( nvi_ema > -0.6106 )
					if( oscp <= -37.2443 )
						if( xmf <= 27.1245 )
							ret := 1.000000 // buy
						if( xmf > 27.1245 )
							ret := -0.666667
					if( oscp > -37.2443 )
						if( nvimax <= -0.588807 )
							if( marron <= 9.11752 )
								ret := 0.000000
							if( marron > 9.11752 )
								ret := -0.500000
						if( nvimax > -0.588807 )
							if( verde_mean <= -38.4367 )
								ret := -0.750000 // sell
							if( verde_mean > -38.4367 )
								ret := -1.000000 // sell
			if( nvi_ema > -0.596517 )
				if( pvimin <= 0.521264 )
					if( nvi <= 5.05018 )
						if( xrsi <= 24.0127 )
							if( verde <= -97.3859 )
								if( azul_mean <= 17.5196 )
									ret := 0.731959 // buy
								if( azul_mean > 17.5196 )
									ret := -0.076923
							if( verde > -97.3859 )
								if( nvimax <= -0.26919 )
									ret := 0.010101
								if( nvimax > -0.26919 )
									ret := 0.352542
						if( xrsi > 24.0127 )
							if( verde_azul <= -133.822 )
								if( verde_media <= -182.535 )
									ret := 0.555556
								if( verde_media > -182.535 )
									ret := -0.800000 // sell
							if( verde_azul > -133.822 )
								if( marron_mean <= -0.19805 )
									ret := -0.056522
								if( marron_mean > -0.19805 )
									ret := 0.245607
					if( nvi > 5.05018 )
						if( nvim <= 5.06113 )
							if( xmf <= 16.1494 )
								if( marron <= -4.07108 )
									ret := -0.500000
								if( marron > -4.07108 )
									ret := -1.000000 // sell
							if( xmf > 16.1494 )
								if( oscp <= -45.8467 )
									ret := -0.250000
								if( oscp > -45.8467 )
									ret := 0.750000 // buy
						if( nvim > 5.06113 )
							if( media <= 32.9382 )
								if( marron_mean <= 12.8785 )
									ret := -0.013937
								if( marron_mean > 12.8785 )
									ret := 0.406504
							if( media > 32.9382 )
								if( azul_mean <= -14.1467 )
									ret := 0.400000
								if( azul_mean > -14.1467 )
									ret := -0.463768
				if( pvimin > 0.521264 )
					if( BollOsc <= -73.268 )
						if( marron <= -17.2978 )
							if( verde <= -109.498 )
								if( pvimin <= 0.867649 )
									ret := 1.000000 // buy
								if( pvimin > 0.867649 )
									ret := 0.400000
							if( verde > -109.498 )
								if( xmf <= 10.4575 )
									ret := 0.125000
								if( xmf > 10.4575 )
									ret := -0.600000
						if( marron > -17.2978 )
							if( media <= 16.8569 )
								ret := -0.285714
							if( media > 16.8569 )
								if( verde_media <= -59.5267 )
									ret := 0.653846
								if( verde_media > -59.5267 )
									ret := -0.375000
					if( BollOsc > -73.268 )
						if( azul_mean <= 43.3883 )
							if( media_azul <= 0.899221 )
								if( azul <= 31.7834 )
									ret := -0.418367
								if( azul > 31.7834 )
									ret := 0.127517
							if( media_azul > 0.899221 )
								if( verde_media <= -5.04492 )
									ret := 0.113475
								if( verde_media > -5.04492 )
									ret := -0.410959
						if( azul_mean > 43.3883 )
							if( marron_mean <= -1.59264 )
								ret := -0.500000
							if( marron_mean > -1.59264 )
								if( azul <= 60.2042 )
									ret := 1.000000 // buy
								if( azul > 60.2042 )
									ret := 0.736842 // buy
	if( xrsi > 30.5331 )
		if( pvi <= 0.960554 )
			if( media_azul <= 114.091 )
				if( marron <= 136.698 )
					if( azul_mean <= 44.5284 )
						if( media <= 48.2716 )
							if( xrsi <= 33.3661 )
								if( oscp <= -40.9089 )
									ret := -0.142857
								if( oscp > -40.9089 )
									ret := 0.165705
							if( xrsi > 33.3661 )
								if( nvim <= -0.277541 )
									ret := -0.173394
								if( nvim > -0.277541 )
									ret := 0.006643
						if( media > 48.2716 )
							if( nvimin <= 3.85695 )
								if( nvi <= 3.86903 )
									ret := 0.077446
								if( nvi > 3.86903 )
									ret := 0.540000
							if( nvimin > 3.85695 )
								if( pvi <= -1.28437 )
									ret := 0.002896
								if( pvi > -1.28437 )
									ret := -0.697674
					if( azul_mean > 44.5284 )
						if( xrsi <= 38.6687 )
							if( xmf <= 23.2227 )
								if( pvimin <= -2.30758 )
									ret := -0.823529 // sell
								if( pvimin > -2.30758 )
									ret := 0.090909
							if( xmf > 23.2227 )
								if( marron_mean <= 37.9223 )
									ret := 0.256410
								if( marron_mean > 37.9223 )
									ret := -0.500000
						if( xrsi > 38.6687 )
							if( BollOsc <= 15.6298 )
								if( verde_media <= 5.37431 )
									ret := -0.148571
								if( verde_media > 5.37431 )
									ret := -0.542751
							if( BollOsc > 15.6298 )
								if( stoc <= 82.2964 )
									ret := 0.159780
								if( stoc > 82.2964 )
									ret := -0.303318
				if( marron > 136.698 )
					if( verde_media <= 307.939 )
						if( azul <= 8.25449 )
							if( marron <= 151.832 )
								if( nvim <= -0.043548 )
									ret := -0.200000
								if( nvim > -0.043548 )
									ret := -0.755725 // sell
							if( marron > 151.832 )
								ret := 0.333333
						if( azul > 8.25449 )
							if( xrsi <= 85.9637 )
								if( media <= 93.0088 )
									ret := -0.267606
								if( media > 93.0088 )
									ret := 0.800000 // buy
							if( xrsi > 85.9637 )
								if( pvi_ema <= 0.119563 )
									ret := -0.862745 // sell
								if( pvi_ema > 0.119563 )
									ret := 0.076923
					if( verde_media > 307.939 )
						ret := 1.000000 // buy
			if( media_azul > 114.091 )
				if( pvimin <= -0.463042 )
					if( verde_azul <= 126.748 )
						if( azul_mean <= -37.6786 )
							if( marron <= 77.8338 )
								if( BollOsc <= 11.8899 )
									ret := 0.171717
								if( BollOsc > 11.8899 )
									ret := -0.933333 // sell
							if( marron > 77.8338 )
								if( xrsi <= 60.73 )
									ret := 0.500000
								if( xrsi > 60.73 )
									ret := 1.000000 // buy
						if( azul_mean > -37.6786 )
							if( tprice <= 2.3e-05 )
								if( azul <= -67.1573 )
									ret := -0.200000
								if( azul > -67.1573 )
									ret := 0.652542
							if( tprice > 2.3e-05 )
								if( BollOsc <= 2.48694 )
									ret := 0.727273 // buy
								if( BollOsc > 2.48694 )
									ret := -0.153846
					if( verde_azul > 126.748 )
						if( BollOsc <= 32.6314 )
							if( verde_media <= 15.4114 )
								if( source <= 3.1e-05 )
									ret := 0.215909
								if( source > 3.1e-05 )
									ret := 1.000000 // buy
							if( verde_media > 15.4114 )
								if( media_azul <= 180.552 )
									ret := -0.128514
								if( media_azul > 180.552 )
									ret := 0.550000
						if( BollOsc > 32.6314 )
							if( tprice <= 1.1e-05 )
								if( marron <= 111.418 )
									ret := 0.328063
								if( marron > 111.418 )
									ret := -0.157895
							if( tprice > 1.1e-05 )
								if( nvim <= 4.97603 )
									ret := 0.551724
								if( nvim > 4.97603 )
									ret := 0.201754
				if( pvimin > -0.463042 )
					if( xrsi <= 85.3945 )
						if( verde_mean <= 211.288 )
							if( verde_media <= -12.7937 )
								if( xrsi <= 41.3872 )
									ret := -0.378378
								if( xrsi > 41.3872 )
									ret := 0.512346
							if( verde_media > -12.7937 )
								if( xmf <= 60.6501 )
									ret := -0.213816
								if( xmf > 60.6501 )
									ret := 0.117581
						if( verde_mean > 211.288 )
							if( media <= 101.134 )
								ret := 0.000000
							if( media > 101.134 )
								if( stoc <= 71.97 )
									ret := 0.500000
								if( stoc > 71.97 )
									ret := 1.000000 // buy
					if( xrsi > 85.3945 )
						if( azul <= -112.512 )
							ret := 0.500000
						if( azul > -112.512 )
							if( media <= 111.746 )
								if( xmf <= 84.6038 )
									ret := 0.000000
								if( xmf > 84.6038 )
									ret := -0.833333 // sell
							if( media > 111.746 )
								if( marron_mean <= 124.81 )
									ret := -0.571429
								if( marron_mean > 124.81 )
									ret := -0.968750 // sell
		if( pvi > 0.960554 )
			if( media <= 94.4019 )
				if( xrsi <= 60.6368 )
					if( xmf <= 45.3229 )
						if( pvim <= 1.70923 )
							if( source <= 2e-05 )
								if( marron <= 30.788 )
									ret := -0.526316
								if( marron > 30.788 )
									ret := -0.072464
							if( source > 2e-05 )
								if( nvimin <= 0.300719 )
									ret := -0.018293
								if( nvimin > 0.300719 )
									ret := -0.156763
						if( pvim > 1.70923 )
							if( stoc <= 32.7295 )
								ret := 0.500000
							if( stoc > 32.7295 )
								ret := 1.000000 // buy
					if( xmf > 45.3229 )
						if( pvim <= 1.46638 )
							if( media <= 78.481 )
								if( oscp <= 3.01619 )
									ret := 0.133143
								if( oscp > 3.01619 )
									ret := -0.014545
							if( media > 78.481 )
								if( media <= 92.7971 )
									ret := -0.145833
								if( media > 92.7971 )
									ret := 0.500000
						if( pvim > 1.46638 )
							if( azul_mean <= 9.62611 )
								if( oscp <= -1.07008 )
									ret := 0.204082
								if( oscp > -1.07008 )
									ret := -0.415584
							if( azul_mean > 9.62611 )
								if( marron <= 75.7648 )
									ret := -0.805970 // sell
								if( marron > 75.7648 )
									ret := 0.083333
				if( xrsi > 60.6368 )
					if( azul_mean <= -14.2462 )
						if( xmf <= 51.966 )
							if( pvimin <= 0.945942 )
								if( pvim <= 1.17611 )
									ret := 1.000000 // buy
								if( pvim > 1.17611 )
									ret := 0.750000 // buy
							if( pvimin > 0.945942 )
								if( xmf <= 49.36 )
									ret := -0.833333 // sell
								if( xmf > 49.36 )
									ret := 0.285714
						if( xmf > 51.966 )
							if( pvi_ema <= 0.904437 )
								if( BollOsc <= 46.6965 )
									ret := 0.785714 // buy
								if( BollOsc > 46.6965 )
									ret := -0.500000
							if( pvi_ema > 0.904437 )
								if( pvi <= 1.60865 )
									ret := -0.618644
								if( pvi > 1.60865 )
									ret := 1.000000 // buy
					if( azul_mean > -14.2462 )
						if( media_azul <= 63.2604 )
							if( tprice <= 4.3e-05 )
								if( azul_mean <= 35.5714 )
									ret := -0.185022
								if( azul_mean > 35.5714 )
									ret := -0.725000 // sell
							if( tprice > 4.3e-05 )
								if( BollOsc <= 79.3881 )
									ret := -0.880952 // sell
								if( BollOsc > 79.3881 )
									ret := 0.250000
						if( media_azul > 63.2604 )
							if( azul_mean <= 8.81685 )
								if( marron_mean <= 94.0119 )
									ret := 0.047319
								if( marron_mean > 94.0119 )
									ret := -0.359862
							if( azul_mean > 8.81685 )
								if( oscp <= 21.7609 )
									ret := 0.007092
								if( oscp > 21.7609 )
									ret := 0.600000
			if( media > 94.4019 )
				if( azul <= 50.4509 )
					if( tprice <= 2.9e-05 )
						if( verde_azul <= 100.283 )
							if( xrsi <= 72.7343 )
								if( verde_azul <= 53.0194 )
									ret := 1.000000 // buy
								if( verde_azul > 53.0194 )
									ret := 0.027397
							if( xrsi > 72.7343 )
								if( nvimin <= 0.282838 )
									ret := 1.000000 // buy
								if( nvimin > 0.282838 )
									ret := 0.750000 // buy
						if( verde_azul > 100.283 )
							if( azul <= -21.4653 )
								if( oscp <= 58.7928 )
									ret := 0.282353
								if( oscp > 58.7928 )
									ret := -0.333333
							if( azul > -21.4653 )
								if( azul_mean <= 0.116653 )
									ret := -0.509091
								if( azul_mean > 0.116653 )
									ret := 0.000000
					if( tprice > 2.9e-05 )
						if( xrsi <= 85.3472 )
							if( nvimax <= 0.237038 )
								if( pvimin <= 0.877256 )
									ret := 0.033333
								if( pvimin > 0.877256 )
									ret := 0.759740 // buy
							if( nvimax > 0.237038 )
								if( azul <= -6.10187 )
									ret := -0.183099
								if( azul > -6.10187 )
									ret := 0.413265
						if( xrsi > 85.3472 )
							if( stoc <= 77.9255 )
								ret := 0.714286 // buy
							if( stoc > 77.9255 )
								if( marron_mean <= 117.004 )
									ret := -0.250000
								if( marron_mean > 117.004 )
									ret := -1.000000 // sell
				if( azul > 50.4509 )
					if( BollOsc <= 32.4118 )
						if( media <= 101.615 )
							ret := -0.600000
						if( media > 101.615 )
							ret := 0.800000 // buy
					if( BollOsc > 32.4118 )
						if( oscp <= 40.1347 )
							if( verde_azul <= 68.0805 )
								ret := -1.000000 // sell
							if( verde_azul > 68.0805 )
								if( marron_mean <= 119.69 )
									ret := -0.500000
								if( marron_mean > 119.69 )
									ret := -1.000000 // sell
						if( oscp > 40.1347 )
							if( pvi <= 1.11234 )
								ret := 0.400000
							if( pvi > 1.11234 )
								ret := -0.800000 // sell
	
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
float op_operation = decision_tree_0_SHIBUSDT_30Min_f53eb12b(nvimin, azul, nvim, marron_mean, marron, nvimax, pvi, pvi_ema, oscp, verde, source, stoc, verde_mean, xrsi, media, xmf, tprice, pvimin, media_azul, verde_media, BollOsc, pvimax, nvi_ema, azul_mean, pvim, nvi, verde_azul)

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


