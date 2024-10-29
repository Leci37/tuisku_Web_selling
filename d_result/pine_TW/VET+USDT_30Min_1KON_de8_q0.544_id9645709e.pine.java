//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: VETUSDT_30Min_1KON_9645709e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_30Min_1KON_9645709e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_30Min_9645709e(oscp, verde_media, verde, marron, azul, media, tprice, xrsi, pvimax, media_azul, nvi_ema, azul_mean, pvim, verde_mean, pvi_ema, xmf, nvi, BollOsc, source, nvimax, pvimin, stoc, marron_mean, pvi, nvim, nvimin, verde_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( nvi <= 3.54169 )
		if( pvi <= -0.627875 )
			if( xmf <= 31.3639 )
				if( verde <= -128.574 )
					ret := -0.428571
				if( verde > -128.574 )
					if( azul_mean <= -12.4981 )
						if( oscp <= -14.3372 )
							ret := 1.000000 // buy
						if( oscp > -14.3372 )
							if( BollOsc <= -57.4875 )
								ret := -0.400000
							if( BollOsc > -57.4875 )
								if( verde_mean <= 32.973 )
									ret := 0.756757 // buy
								if( verde_mean > 32.973 )
									ret := -0.062500
					if( azul_mean > -12.4981 )
						if( pvim <= -0.822741 )
							if( azul_mean <= -6.32848 )
								if( source <= 0.050476 )
									ret := 0.882353 // buy
								if( source > 0.050476 )
									ret := 0.181818
							if( azul_mean > -6.32848 )
								if( verde_media <= -11.2767 )
									ret := 0.124138
								if( verde_media > -11.2767 )
									ret := -0.736842 // sell
						if( pvim > -0.822741 )
							if( BollOsc <= -21.9339 )
								if( xrsi <= 34.9581 )
									ret := 0.395522
								if( xrsi > 34.9581 )
									ret := 0.757576 // buy
							if( BollOsc > -21.9339 )
								if( pvimin <= -0.682274 )
									ret := -0.565217
								if( pvimin > -0.682274 )
									ret := 0.750000 // buy
			if( xmf > 31.3639 )
				if( azul <= -3.66107 )
					if( nvimin <= 1.94315 )
						if( marron <= 16.4668 )
							ret := -0.083333
						if( marron > 16.4668 )
							if( verde_media <= -30.6962 )
								if( nvimin <= 1.52788 )
									ret := -0.750000 // sell
								if( nvimin > 1.52788 )
									ret := 0.086957
							if( verde_media > -30.6962 )
								if( pvim <= -0.691959 )
									ret := 0.774011 // buy
								if( pvim > -0.691959 )
									ret := 0.308219
					if( nvimin > 1.94315 )
						if( oscp <= 22.3917 )
							if( source <= 0.058375 )
								if( xmf <= 34.7359 )
									ret := 0.607143
								if( xmf > 34.7359 )
									ret := -0.171254
							if( source > 0.058375 )
								if( verde <= 94.9713 )
									ret := 0.147208
								if( verde > 94.9713 )
									ret := 0.816327 // buy
						if( oscp > 22.3917 )
							if( nvim <= 2.47963 )
								if( media_azul <= 105.635 )
									ret := 0.333333
								if( media_azul > 105.635 )
									ret := -0.400000
							if( nvim > 2.47963 )
								if( marron_mean <= 109.616 )
									ret := 0.709677 // buy
								if( marron_mean > 109.616 )
									ret := 0.190476
				if( azul > -3.66107 )
					if( BollOsc <= -21.076 )
						if( pvim <= -1.16494 )
							if( oscp <= -15.9756 )
								if( azul_mean <= 13.5868 )
									ret := 0.454545
								if( azul_mean > 13.5868 )
									ret := -0.636364
							if( oscp > -15.9756 )
								ret := -1.000000 // sell
						if( pvim > -1.16494 )
							if( nvim <= 1.84807 )
								if( xmf <= 37.2703 )
									ret := -0.500000
								if( xmf > 37.2703 )
									ret := 0.177419
							if( nvim > 1.84807 )
								if( media_azul <= 54.0121 )
									ret := 0.504950
								if( media_azul > 54.0121 )
									ret := -0.229508
					if( BollOsc > -21.076 )
						if( marron <= 36.7127 )
							if( azul_mean <= 18.9895 )
								if( pvi <= -0.802368 )
									ret := -1.000000 // sell
								if( pvi > -0.802368 )
									ret := -0.636364
							if( azul_mean > 18.9895 )
								ret := -0.285714
						if( marron > 36.7127 )
							if( pvimin <= -0.752117 )
								if( marron <= 112.971 )
									ret := 0.136808
								if( marron > 112.971 )
									ret := -0.226190
							if( pvimin > -0.752117 )
								if( verde <= 68.465 )
									ret := -0.253906
								if( verde > 68.465 )
									ret := 0.126667
		if( pvi > -0.627875 )
			if( marron_mean <= 103.13 )
				if( BollOsc <= 5.43147 )
					if( oscp <= 0.167266 )
						if( marron <= 3.1139 )
							if( nvi <= 1.33221 )
								if( verde <= -64.783 )
									ret := -0.617021
								if( verde > -64.783 )
									ret := 0.225694
							if( nvi > 1.33221 )
								if( verde_media <= -59.5751 )
									ret := 0.912621 // buy
								if( verde_media > -59.5751 )
									ret := 0.393162
						if( marron > 3.1139 )
							if( azul <= -4.39414 )
								if( pvi <= -0.200671 )
									ret := 0.313384
								if( pvi > -0.200671 )
									ret := 0.016224
							if( azul > -4.39414 )
								if( pvim <= 0.306008 )
									ret := -0.006080
								if( pvim > 0.306008 )
									ret := -0.337531
					if( oscp > 0.167266 )
						if( pvi <= 0.702339 )
							if( marron_mean <= 43.3239 )
								if( verde_mean <= 1.09811 )
									ret := 0.772727 // buy
								if( verde_mean > 1.09811 )
									ret := -0.094099
							if( marron_mean > 43.3239 )
								if( tprice <= 0.12108 )
									ret := -0.403315
								if( tprice > 0.12108 )
									ret := 0.198020
						if( pvi > 0.702339 )
							if( oscp <= 5.30546 )
								ret := -1.000000 // sell
							if( oscp > 5.30546 )
								ret := -0.700000 // sell
				if( BollOsc > 5.43147 )
					if( nvimin <= 0.053929 )
						if( nvimax <= 0.055919 )
							if( nvi_ema <= 0.021431 )
								if( marron <= 79.7075 )
									ret := -0.571429
								if( marron > 79.7075 )
									ret := -1.000000 // sell
							if( nvi_ema > 0.021431 )
								if( source <= 0.011638 )
									ret := 0.142857
								if( source > 0.011638 )
									ret := -0.511628
						if( nvimax > 0.055919 )
							if( verde_media <= 25.4073 )
								if( media <= 70.1715 )
									ret := 0.425926
								if( media > 70.1715 )
									ret := -0.130952
							if( verde_media > 25.4073 )
								if( source <= 0.013044 )
									ret := -0.500000
								if( source > 0.013044 )
									ret := 0.097561
					if( nvimin > 0.053929 )
						if( xrsi <= 66.9452 )
							if( media_azul <= 65.8403 )
								if( xrsi <= 60.2695 )
									ret := 0.180305
								if( xrsi > 60.2695 )
									ret := -0.133588
							if( media_azul > 65.8403 )
								if( media_azul <= 90.3297 )
									ret := 0.384381
								if( media_azul > 90.3297 )
									ret := 0.186349
						if( xrsi > 66.9452 )
							if( marron_mean <= 79.5269 )
								if( marron_mean <= 76.3423 )
									ret := 0.093750
								if( marron_mean > 76.3423 )
									ret := 0.875000 // buy
							if( marron_mean > 79.5269 )
								if( pvimin <= -0.244556 )
									ret := -0.117326
								if( pvimin > -0.244556 )
									ret := -0.480916
			if( marron_mean > 103.13 )
				if( nvi <= 3.0569 )
					if( pvimax <= -0.012777 )
						if( azul <= 6.13161 )
							if( nvi_ema <= 0.097119 )
								if( media_azul <= 100.033 )
									ret := 0.060606
								if( media_azul > 100.033 )
									ret := -0.613333
							if( nvi_ema > 0.097119 )
								if( marron_mean <= 112.95 )
									ret := -0.186893
								if( marron_mean > 112.95 )
									ret := 0.541850
						if( azul > 6.13161 )
							if( azul_mean <= 15.2409 )
								if( nvimax <= 1.10963 )
									ret := -0.333333
								if( nvimax > 1.10963 )
									ret := -0.760684 // sell
							if( azul_mean > 15.2409 )
								if( source <= 0.03325 )
									ret := -0.163934
								if( source > 0.03325 )
									ret := 0.333333
					if( pvimax > -0.012777 )
						if( nvi <= 2.35605 )
							if( nvi <= 0.303391 )
								ret := -0.538462
							if( nvi > 0.303391 )
								ret := -1.000000 // sell
						if( nvi > 2.35605 )
							if( nvim <= 2.74654 )
								ret := 0.090909
							if( nvim > 2.74654 )
								if( pvi <= 0.537113 )
									ret := -0.750000 // sell
								if( pvi > 0.537113 )
									ret := -1.000000 // sell
				if( nvi > 3.0569 )
					if( marron <= 120.328 )
						if( nvi <= 3.17647 )
							if( pvimin <= -0.435344 )
								if( BollOsc <= 54.4747 )
									ret := 0.541667
								if( BollOsc > 54.4747 )
									ret := -0.173913
							if( pvimin > -0.435344 )
								if( pvi_ema <= 0.617292 )
									ret := 0.965517 // buy
								if( pvi_ema > 0.617292 )
									ret := 0.500000
						if( nvi > 3.17647 )
							if( verde_mean <= 167.207 )
								if( oscp <= 21.8449 )
									ret := -0.343137
								if( oscp > 21.8449 )
									ret := 0.416667
							if( verde_mean > 167.207 )
								if( verde_azul <= 167.609 )
									ret := 0.555556
								if( verde_azul > 167.609 )
									ret := 0.866667 // buy
					if( marron > 120.328 )
						if( nvi_ema <= 3.15878 )
							ret := -0.944444 // sell
						if( nvi_ema > 3.15878 )
							if( nvi <= 3.3361 )
								if( xmf <= 82.6483 )
									ret := -0.450000
								if( xmf > 82.6483 )
									ret := 0.500000
							if( nvi > 3.3361 )
								ret := -0.923077 // sell
	if( nvi > 3.54169 )
		if( verde_mean <= 4.4077 )
			if( azul <= -15.6948 )
				if( verde_media <= -127.848 )
					if( pvi <= -6.52501 )
						ret := 0.470588
					if( pvi > -6.52501 )
						if( marron <= -19.0663 )
							ret := 0.642857
						if( marron > -19.0663 )
							ret := 1.000000 // buy
				if( verde_media > -127.848 )
					if( media_azul <= 51.6392 )
						if( verde_mean <= -49.2577 )
							if( nvi <= 10.0437 )
								if( azul <= -25.0654 )
									ret := 0.566667
								if( azul > -25.0654 )
									ret := -0.186047
							if( nvi > 10.0437 )
								if( tprice <= 0.031269 )
									ret := -0.125000
								if( tprice > 0.031269 )
									ret := -0.916667 // sell
						if( verde_mean > -49.2577 )
							if( oscp <= -15.9649 )
								if( xrsi <= 22.9951 )
									ret := 0.593750
								if( xrsi > 22.9951 )
									ret := 0.234450
							if( oscp > -15.9649 )
								if( BollOsc <= -37.224 )
									ret := 0.350000
								if( BollOsc > -37.224 )
									ret := -0.033981
					if( media_azul > 51.6392 )
						if( verde_azul <= -51.2852 )
							ret := 0.857143 // buy
						if( verde_azul > -51.2852 )
							if( azul_mean <= -14.784 )
								if( stoc <= 16.9191 )
									ret := -0.201878
								if( stoc > 16.9191 )
									ret := 0.084932
							if( azul_mean > -14.784 )
								if( xmf <= 36.6382 )
									ret := 0.442424
								if( xmf > 36.6382 )
									ret := -0.541667
			if( azul > -15.6948 )
				if( xrsi <= 13.1816 )
					if( xmf <= 17.0511 )
						if( verde_media <= -53.6121 )
							ret := 0.647059
						if( verde_media > -53.6121 )
							if( verde_media <= -35.5329 )
								ret := -0.300000
							if( verde_media > -35.5329 )
								ret := 0.538462
					if( xmf > 17.0511 )
						if( BollOsc <= -70.869 )
							if( marron <= -17.1808 )
								ret := 0.937500 // buy
							if( marron > -17.1808 )
								ret := 0.181818
						if( BollOsc > -70.869 )
							ret := 1.000000 // buy
				if( xrsi > 13.1816 )
					if( verde_mean <= -29.8273 )
						if( nvimin <= 8.1768 )
							if( azul <= 17.6937 )
								if( media <= 18.733 )
									ret := -0.354916
								if( media > 18.733 )
									ret := 0.057762
							if( azul > 17.6937 )
								if( verde_azul <= -98.8686 )
									ret := 0.000000
								if( verde_azul > -98.8686 )
									ret := -0.642173
						if( nvimin > 8.1768 )
							if( xrsi <= 19.2901 )
								if( nvi_ema <= 10.3061 )
									ret := 0.164634
								if( nvi_ema > 10.3061 )
									ret := 0.736364 // buy
							if( xrsi > 19.2901 )
								if( azul_mean <= 14.121 )
									ret := -0.074219
								if( azul_mean > 14.121 )
									ret := 0.220290
					if( verde_mean > -29.8273 )
						if( oscp <= -30.9898 )
							if( stoc <= 16.5965 )
								if( pvi <= -4.28136 )
									ret := 0.454810
								if( pvi > -4.28136 )
									ret := 0.145749
							if( stoc > 16.5965 )
								if( media_azul <= 44.3757 )
									ret := 0.003788
								if( media_azul > 44.3757 )
									ret := 0.617284
						if( oscp > -30.9898 )
							if( nvi <= 4.7902 )
								if( tprice <= 0.176125 )
									ret := 0.395415
								if( tprice > 0.176125 )
									ret := -0.333333
							if( nvi > 4.7902 )
								if( media_azul <= 25.6622 )
									ret := 0.032478
								if( media_azul > 25.6622 )
									ret := -0.096718
		if( verde_mean > 4.4077 )
			if( source <= 0.022126 )
				if( nvi_ema <= 8.91641 )
					if( xmf <= 32.6955 )
						if( nvim <= 7.98839 )
							ret := -0.857143 // sell
						if( nvim > 7.98839 )
							if( oscp <= -3.96496 )
								if( pvi_ema <= -5.83101 )
									ret := 0.833333 // buy
								if( pvi_ema > -5.83101 )
									ret := 0.114286
							if( oscp > -3.96496 )
								ret := -0.666667
					if( xmf > 32.6955 )
						if( pvimax <= -6.08091 )
							if( nvi_ema <= 8.86674 )
								ret := 0.076923
							if( nvi_ema > 8.86674 )
								ret := -0.833333 // sell
						if( pvimax > -6.08091 )
							if( source <= 0.017327 )
								ret := -0.625000
							if( source > 0.017327 )
								if( media <= 49.8878 )
									ret := 0.278146
								if( media > 49.8878 )
									ret := 0.621622
				if( nvi_ema > 8.91641 )
					if( nvi <= 9.15576 )
						if( nvimin <= 9.11592 )
							if( media <= 51.0822 )
								if( BollOsc <= -28.5386 )
									ret := -0.150602
								if( BollOsc > -28.5386 )
									ret := 0.135255
							if( media > 51.0822 )
								if( tprice <= 0.019883 )
									ret := -0.047304
								if( tprice > 0.019883 )
									ret := -0.440000
						if( nvimin > 9.11592 )
							if( nvi_ema <= 9.14894 )
								if( xrsi <= 45.671 )
									ret := -1.000000 // sell
								if( xrsi > 45.671 )
									ret := -0.727273 // sell
							if( nvi_ema > 9.14894 )
								ret := -0.083333
					if( nvi > 9.15576 )
						if( marron_mean <= 115.409 )
							if( xrsi <= 33.3802 )
								if( marron_mean <= 26.0631 )
									ret := 0.422594
								if( marron_mean > 26.0631 )
									ret := 0.063953
							if( xrsi > 33.3802 )
								if( nvimin <= 12.6867 )
									ret := 0.028396
								if( nvimin > 12.6867 )
									ret := -0.750000 // sell
						if( marron_mean > 115.409 )
							if( pvimin <= -6.8347 )
								if( pvimin <= -7.58066 )
									ret := 0.656250
								if( pvimin > -7.58066 )
									ret := 0.210300
							if( pvimin > -6.8347 )
								if( BollOsc <= 51.4813 )
									ret := 0.291667
								if( BollOsc > 51.4813 )
									ret := 0.950617 // buy
			if( source > 0.022126 )
				if( pvimin <= -0.566007 )
					if( verde_media <= 75.0913 )
						if( verde <= 170.921 )
							if( xrsi <= 83.2356 )
								if( BollOsc <= 12.337 )
									ret := -0.023067
								if( BollOsc > 12.337 )
									ret := -0.063745
							if( xrsi > 83.2356 )
								if( verde_media <= 33.2002 )
									ret := -0.070423
								if( verde_media > 33.2002 )
									ret := 0.412017
						if( verde > 170.921 )
							if( azul <= 19.639 )
								if( xmf <= 85.053 )
									ret := -0.464286
								if( xmf > 85.053 )
									ret := -0.802083 // sell
							if( azul > 19.639 )
								if( nvi_ema <= 8.72677 )
									ret := 0.500000
								if( nvi_ema > 8.72677 )
									ret := -0.727273 // sell
					if( verde_media > 75.0913 )
						if( verde_mean <= 231.706 )
							if( BollOsc <= 67.972 )
								if( nvimin <= 7.64511 )
									ret := 0.411622
								if( nvimin > 7.64511 )
									ret := 0.130758
							if( BollOsc > 67.972 )
								if( azul <= 3.92235 )
									ret := 0.087866
								if( azul > 3.92235 )
									ret := -0.344710
						if( verde_mean > 231.706 )
							if( pvi <= -4.69635 )
								ret := 0.375000
							if( pvi > -4.69635 )
								if( verde_media <= 115.807 )
									ret := 1.000000 // buy
								if( verde_media > 115.807 )
									ret := 0.857143 // buy
				if( pvimin > -0.566007 )
					if( pvi <= -0.504542 )
						if( azul <= 4.80527 )
							ret := -0.066667
						if( azul > 4.80527 )
							if( xmf <= 42.6318 )
								ret := -1.000000 // sell
							if( xmf > 42.6318 )
								ret := -0.555556
					if( pvi > -0.504542 )
						if( tprice <= 0.177956 )
							if( verde_media <= 28.3248 )
								if( oscp <= -8.91547 )
									ret := -0.200000
								if( oscp > -8.91547 )
									ret := 0.314961
							if( verde_media > 28.3248 )
								if( stoc <= 74.0489 )
									ret := -0.307692
								if( stoc > 74.0489 )
									ret := -0.809524 // sell
						if( tprice > 0.177956 )
							if( oscp <= -5.05779 )
								if( xrsi <= 41.2501 )
									ret := -0.083333
								if( xrsi > 41.2501 )
									ret := -0.670886
							if( oscp > -5.05779 )
								if( stoc <= 75.3449 )
									ret := 0.020833
								if( stoc > 75.3449 )
									ret := -0.429752
	
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
float op_operation = decision_tree_0_VETUSDT_30Min_9645709e(oscp, verde_media, verde, marron, azul, media, tprice, xrsi, pvimax, media_azul, nvi_ema, azul_mean, pvim, verde_mean, pvi_ema, xmf, nvi, BollOsc, source, nvimax, pvimin, stoc, marron_mean, pvi, nvim, nvimin, verde_azul)

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


