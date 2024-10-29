//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: UPST_1Min_1KON_d6f00744 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_1KON_d6f00744", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_d6f00744(nvi, nvi_ema, marron_mean, source, azul, verde_azul, verde_mean, xmf, pvimin, stoc, media, tprice, marron, pvim, pvimax, xrsi, oscp, pvi, nvimax, nvimin, verde, verde_media, azul_mean, nvim, BollOsc, pvi_ema, media_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( oscp <= -27.9164 )
		if( xrsi <= 49.2631 )
			if( media_azul <= 56.3643 )
				if( marron_mean <= 13.7331 )
					if( verde_azul <= -29.8208 )
						if( azul <= -14.3387 )
							if( xrsi <= 17.6299 )
								if( nvimax <= -0.086053 )
									ret := 0.666667
								if( nvimax > -0.086053 )
									ret := 0.966667 // buy
							if( xrsi > 17.6299 )
								if( pvi_ema <= 0.315413 )
									ret := 0.180556
								if( pvi_ema > 0.315413 )
									ret := -0.823529 // sell
						if( azul > -14.3387 )
							if( tprice <= 38.8645 )
								if( nvimax <= 0.232648 )
									ret := -0.146560
								if( nvimax > 0.232648 )
									ret := 0.217090
							if( tprice > 38.8645 )
								if( media <= 37.5531 )
									ret := -0.468165
								if( media > 37.5531 )
									ret := 0.923077 // buy
					if( verde_azul > -29.8208 )
						if( source <= 38.6514 )
							if( verde_media <= -48.4124 )
								if( nvim <= 0.474361 )
									ret := 0.430851
								if( nvim > 0.474361 )
									ret := -0.084746
							if( verde_media > -48.4124 )
								if( nvi_ema <= -0.02959 )
									ret := 0.423913
								if( nvi_ema > -0.02959 )
									ret := 0.786885 // buy
						if( source > 38.6514 )
							if( pvimin <= 0.288125 )
								if( nvimin <= 0.746989 )
									ret := -0.133333
								if( nvimin > 0.746989 )
									ret := -0.750000 // sell
							if( pvimin > 0.288125 )
								if( BollOsc <= -48.1933 )
									ret := -0.066667
								if( BollOsc > -48.1933 )
									ret := 1.000000 // buy
				if( marron_mean > 13.7331 )
					if( tprice <= 43.1655 )
						if( marron <= -19.1136 )
							ret := -0.857143 // sell
						if( marron > -19.1136 )
							if( verde_mean <= -67.8369 )
								if( pvim <= 0.152557 )
									ret := 0.166667
								if( pvim > 0.152557 )
									ret := 0.967742 // buy
							if( verde_mean > -67.8369 )
								if( pvimin <= 0.071299 )
									ret := 0.390181
								if( pvimin > 0.071299 )
									ret := 0.173636
					if( tprice > 43.1655 )
						if( pvimin <= 0.282519 )
							ret := 0.157895
						if( pvimin > 0.282519 )
							if( BollOsc <= -44.4979 )
								ret := -0.636364
							if( BollOsc > -44.4979 )
								ret := -0.937500 // sell
			if( media_azul > 56.3643 )
				if( stoc <= 7.02382 )
					if( source <= 25.5623 )
						if( verde <= -28.5266 )
							if( xmf <= 39.5482 )
								if( pvimin <= 0.208904 )
									ret := 0.461538
								if( pvimin > 0.208904 )
									ret := -0.444444
							if( xmf > 39.5482 )
								ret := 1.000000 // buy
						if( verde > -28.5266 )
							ret := -0.466667
					if( source > 25.5623 )
						if( tprice <= 30.0589 )
							if( oscp <= -35.4976 )
								ret := -1.000000 // sell
							if( oscp > -35.4976 )
								ret := -0.750000 // sell
						if( tprice > 30.0589 )
							if( oscp <= -37.9697 )
								ret := -0.533333
							if( oscp > -37.9697 )
								ret := 0.375000
				if( stoc > 7.02382 )
					if( pvimax <= 0.331796 )
						if( tprice <= 40.3402 )
							if( xmf <= 13.0317 )
								if( stoc <= 13.2347 )
									ret := -0.608696
								if( stoc > 13.2347 )
									ret := 0.365079
							if( xmf > 13.0317 )
								if( verde_media <= -105.803 )
									ret := 0.758140 // buy
								if( verde_media > -105.803 )
									ret := 0.374046
						if( tprice > 40.3402 )
							if( nvim <= 0.741125 )
								if( media <= 64.4596 )
									ret := 0.875000 // buy
								if( media > 64.4596 )
									ret := 0.388889
							if( nvim > 0.741125 )
								ret := 1.000000 // buy
					if( pvimax > 0.331796 )
						if( azul_mean <= -28.1535 )
							if( oscp <= -35.1312 )
								ret := -0.285714
							if( oscp > -35.1312 )
								ret := -1.000000 // sell
						if( azul_mean > -28.1535 )
							if( pvimax <= 0.396476 )
								if( pvim <= 0.36821 )
									ret := 0.200000
								if( pvim > 0.36821 )
									ret := -0.750000 // sell
							if( pvimax > 0.396476 )
								ret := 0.777778 // buy
		if( xrsi > 49.2631 )
			if( verde_mean <= 58.1859 )
				if( nvimin <= 0.53706 )
					if( pvim <= -0.072879 )
						ret := 1.000000 // buy
					if( pvim > -0.072879 )
						if( azul <= 21.9236 )
							if( marron_mean <= 70.6804 )
								if( marron <= 53.9173 )
									ret := 0.571429
								if( marron > 53.9173 )
									ret := 0.160000
							if( marron_mean > 70.6804 )
								if( verde_media <= -54.3302 )
									ret := -0.222222
								if( verde_media > -54.3302 )
									ret := -1.000000 // sell
						if( azul > 21.9236 )
							if( azul_mean <= 36.1969 )
								if( marron_mean <= 69.2553 )
									ret := -0.123810
								if( marron_mean > 69.2553 )
									ret := -0.658537
							if( azul_mean > 36.1969 )
								if( nvi <= -0.171719 )
									ret := -0.320000
								if( nvi > -0.171719 )
									ret := -0.658654
				if( nvimin > 0.53706 )
					if( pvim <= 0.117764 )
						if( marron <= 66.2874 )
							if( marron_mean <= 49.6872 )
								ret := 0.500000
							if( marron_mean > 49.6872 )
								if( marron_mean <= 53.9105 )
									ret := 1.000000 // buy
								if( marron_mean > 53.9105 )
									ret := 0.750000 // buy
						if( marron > 66.2874 )
							ret := -0.333333
					if( pvim > 0.117764 )
						if( source <= 43.2299 )
							ret := 0.111111
						if( source > 43.2299 )
							ret := -0.444444
			if( verde_mean > 58.1859 )
				if( marron_mean <= 81.0791 )
					if( verde_media <= -27.217 )
						if( verde_azul <= 18.0452 )
							ret := -0.066667
						if( verde_azul > 18.0452 )
							ret := 0.363636
					if( verde_media > -27.217 )
						ret := -0.923077 // sell
				if( marron_mean > 81.0791 )
					if( stoc <= 73.9667 )
						if( xmf <= 50.2742 )
							if( nvi <= 0.154316 )
								ret := -0.090909
							if( nvi > 0.154316 )
								ret := -0.812500 // sell
						if( xmf > 50.2742 )
							if( verde_mean <= 66.0491 )
								ret := 0.600000
							if( verde_mean > 66.0491 )
								if( stoc <= 70.5754 )
									ret := 0.333333
								if( stoc > 70.5754 )
									ret := -0.500000
					if( stoc > 73.9667 )
						if( azul_mean <= 21.9923 )
							if( verde_mean <= 76.6651 )
								ret := 0.600000
							if( verde_mean > 76.6651 )
								ret := -0.062500
						if( azul_mean > 21.9923 )
							if( oscp <= -33.5688 )
								if( pvi <= 0.054092 )
									ret := 0.571429
								if( pvi > 0.054092 )
									ret := 0.898305 // buy
							if( oscp > -33.5688 )
								if( media <= 85.5201 )
									ret := 0.285714
								if( media > 85.5201 )
									ret := 0.733333 // buy
	if( oscp > -27.9164 )
		if( azul <= 10.0579 )
			if( pvi_ema <= 0.282249 )
				if( media_azul <= 131.085 )
					if( azul_mean <= -13.7788 )
						if( tprice <= 52.4445 )
							if( verde_azul <= 196.284 )
								if( verde <= -5.25031 )
									ret := -0.162084
								if( verde > -5.25031 )
									ret := -0.011270
							if( verde_azul > 196.284 )
								if( xrsi <= 56.8407 )
									ret := 0.909091 // buy
								if( xrsi > 56.8407 )
									ret := -0.631206
						if( tprice > 52.4445 )
							if( tprice <= 53.8288 )
								if( verde_media <= -24.1133 )
									ret := 0.857143 // buy
								if( verde_media > -24.1133 )
									ret := 1.000000 // buy
							if( tprice > 53.8288 )
								ret := 0.615385
					if( azul_mean > -13.7788 )
						if( verde <= 110.929 )
							if( source <= 40.5096 )
								if( oscp <= -24.2339 )
									ret := 0.272455
								if( oscp > -24.2339 )
									ret := 0.069047
							if( source > 40.5096 )
								if( BollOsc <= 27.5279 )
									ret := -0.068227
								if( BollOsc > 27.5279 )
									ret := 0.167849
						if( verde > 110.929 )
							if( verde_media <= 131.884 )
								if( pvimax <= 0.068915 )
									ret := 0.099400
								if( pvimax > 0.068915 )
									ret := -0.069654
							if( verde_media > 131.884 )
								if( BollOsc <= 48.4856 )
									ret := 0.125000
								if( BollOsc > 48.4856 )
									ret := -0.690000
				if( media_azul > 131.085 )
					if( xrsi <= 65.0773 )
						if( media_azul <= 215.424 )
							if( verde <= 72.0885 )
								if( azul <= -114.763 )
									ret := -0.282051
								if( azul > -114.763 )
									ret := 0.426184
							if( verde > 72.0885 )
								if( oscp <= 11.4367 )
									ret := -0.626667
								if( oscp > 11.4367 )
									ret := -0.102128
						if( media_azul > 215.424 )
							if( media <= 60.9281 )
								ret := -0.071429
							if( media > 60.9281 )
								if( nvimax <= -0.028225 )
									ret := 0.851852 // buy
								if( nvimax > -0.028225 )
									ret := 1.000000 // buy
					if( xrsi > 65.0773 )
						if( nvi_ema <= 0.258339 )
							if( BollOsc <= 36.1696 )
								if( marron_mean <= 115.341 )
									ret := 0.968085 // buy
								if( marron_mean > 115.341 )
									ret := 0.300000
							if( BollOsc > 36.1696 )
								if( azul <= -36.5087 )
									ret := -0.180000
								if( azul > -36.5087 )
									ret := 0.756757 // buy
						if( nvi_ema > 0.258339 )
							if( verde_azul <= 213.107 )
								if( oscp <= 14.507 )
									ret := 0.714286 // buy
								if( oscp > 14.507 )
									ret := -0.181208
							if( verde_azul > 213.107 )
								if( verde_mean <= 194.493 )
									ret := 0.815789 // buy
								if( verde_mean > 194.493 )
									ret := -0.600000
			if( pvi_ema > 0.282249 )
				if( source <= 37.0391 )
					if( oscp <= 36.9865 )
						if( azul_mean <= -78.4416 )
							if( pvimin <= 0.32478 )
								ret := -0.571429
							if( pvimin > 0.32478 )
								ret := -1.000000 // sell
						if( azul_mean > -78.4416 )
							if( media_azul <= 150.866 )
								if( nvi_ema <= 0.340418 )
									ret := -0.043988
								if( nvi_ema > 0.340418 )
									ret := 0.243038
							if( media_azul > 150.866 )
								if( pvimin <= 0.280765 )
									ret := 0.825000 // buy
								if( pvimin > 0.280765 )
									ret := 0.538462
					if( oscp > 36.9865 )
						if( xrsi <= 54.5546 )
							if( oscp <= 56.3793 )
								if( xrsi <= 49.509 )
									ret := -0.761905 // sell
								if( xrsi > 49.509 )
									ret := -0.105263
							if( oscp > 56.3793 )
								if( media <= 45.1425 )
									ret := -0.125000
								if( media > 45.1425 )
									ret := 0.894737 // buy
						if( xrsi > 54.5546 )
							if( verde_azul <= 155.066 )
								if( pvi <= 0.295547 )
									ret := -0.500000
								if( pvi > 0.295547 )
									ret := -0.843750 // sell
							if( verde_azul > 155.066 )
								if( source <= 32.4597 )
									ret := -0.305263
								if( source > 32.4597 )
									ret := -0.709091 // sell
				if( source > 37.0391 )
					if( nvimin <= 0.309603 )
						ret := 1.000000 // buy
					if( nvimin > 0.309603 )
						if( nvi <= 0.408418 )
							if( verde <= 3.1572 )
								ret := 0.266667
							if( verde > 3.1572 )
								if( nvimax <= 0.418326 )
									ret := -0.627219
								if( nvimax > 0.418326 )
									ret := -0.976744 // sell
						if( nvi > 0.408418 )
							if( media_azul <= 31.0216 )
								if( xmf <= 28.46 )
									ret := 0.036585
								if( xmf > 28.46 )
									ret := -0.688312
							if( media_azul > 31.0216 )
								if( marron <= 70.7097 )
									ret := -0.051491
								if( marron > 70.7097 )
									ret := -0.300699
		if( azul > 10.0579 )
			if( xrsi <= 48.4682 )
				if( pvimin <= 0.355005 )
					if( pvi_ema <= 0.081021 )
						if( xrsi <= 41.8344 )
							if( media <= 14.2391 )
								if( oscp <= -16.0084 )
									ret := -0.695652
								if( oscp > -16.0084 )
									ret := -0.185185
							if( media > 14.2391 )
								if( media <= 19.5835 )
									ret := 0.605634
								if( media > 19.5835 )
									ret := 0.112245
						if( xrsi > 41.8344 )
							if( BollOsc <= -10.8642 )
								if( verde_media <= -37.1472 )
									ret := 0.175000
								if( verde_media > -37.1472 )
									ret := -0.574468
							if( BollOsc > -10.8642 )
								if( verde_media <= -27.783 )
									ret := -0.923077 // sell
								if( verde_media > -27.783 )
									ret := 0.092437
					if( pvi_ema > 0.081021 )
						if( xrsi <= 48.4413 )
							if( media <= 40.4242 )
								if( marron <= 23.2956 )
									ret := -0.003896
								if( marron > 23.2956 )
									ret := 0.181908
							if( media > 40.4242 )
								if( marron_mean <= 42.4161 )
									ret := -0.241525
								if( marron_mean > 42.4161 )
									ret := 0.022198
						if( xrsi > 48.4413 )
							ret := 0.888889 // buy
				if( pvimin > 0.355005 )
					if( nvi <= -0.23064 )
						ret := 0.071429
					if( nvi > -0.23064 )
						if( verde_azul <= -1.55922 )
							ret := -0.333333
						if( verde_azul > -1.55922 )
							if( verde_azul <= 22.951 )
								if( pvi_ema <= 0.362391 )
									ret := 0.714286 // buy
								if( pvi_ema > 0.362391 )
									ret := 0.980392 // buy
							if( verde_azul > 22.951 )
								ret := 0.391304
			if( xrsi > 48.4682 )
				if( oscp <= 12.3054 )
					if( xmf <= 58.4893 )
						if( verde_azul <= -18.0049 )
							if( marron_mean <= 82.3326 )
								if( tprice <= 40.9498 )
									ret := -0.668966
								if( tprice > 40.9498 )
									ret := 0.000000
							if( marron_mean > 82.3326 )
								ret := 0.700000 // buy
						if( verde_azul > -18.0049 )
							if( media <= 94.5034 )
								if( azul <= 37.2332 )
									ret := -0.117899
								if( azul > 37.2332 )
									ret := -0.314748
							if( media > 94.5034 )
								if( xmf <= 51.6398 )
									ret := 0.466667
								if( xmf > 51.6398 )
									ret := -0.057778
					if( xmf > 58.4893 )
						if( verde_media <= 38.989 )
							if( verde_mean <= 137.497 )
								if( xmf <= 88.7123 )
									ret := -0.012877
								if( xmf > 88.7123 )
									ret := -0.486364
							if( verde_mean > 137.497 )
								if( source <= 38.3017 )
									ret := 0.137500
								if( source > 38.3017 )
									ret := 0.720000 // buy
						if( verde_media > 38.989 )
							if( verde <= 127.776 )
								if( nvim <= -0.168348 )
									ret := -0.291667
								if( nvim > -0.168348 )
									ret := 0.341823
							if( verde > 127.776 )
								if( stoc <= 94.6469 )
									ret := -0.462963
								if( stoc > 94.6469 )
									ret := 0.800000 // buy
				if( oscp > 12.3054 )
					if( nvim <= 0.569133 )
						if( media <= 118.223 )
							if( marron_mean <= 121.021 )
								if( pvi <= 0.180351 )
									ret := -0.176876
								if( pvi > 0.180351 )
									ret := -0.378229
							if( marron_mean > 121.021 )
								if( media_azul <= 91.6357 )
									ret := -0.176152
								if( media_azul > 91.6357 )
									ret := 0.477778
						if( media > 118.223 )
							if( pvimin <= 0.121838 )
								if( nvim <= 0.022847 )
									ret := -0.647059
								if( nvim > 0.022847 )
									ret := -1.000000 // sell
							if( pvimin > 0.121838 )
								if( verde_azul <= 119.943 )
									ret := -1.000000 // sell
								if( verde_azul > 119.943 )
									ret := 0.153846
					if( nvim > 0.569133 )
						if( nvi_ema <= 0.599881 )
							if( verde <= 150.931 )
								if( oscp <= 13.5257 )
									ret := -0.470588
								if( oscp > 13.5257 )
									ret := 0.509259
							if( verde > 150.931 )
								if( azul <= 38.8792 )
									ret := -0.394366
								if( azul > 38.8792 )
									ret := 0.625000
						if( nvi_ema > 0.599881 )
							if( nvim <= 0.702385 )
								if( media <= 107.707 )
									ret := -0.404762
								if( media > 107.707 )
									ret := 0.062500
							if( nvim > 0.702385 )
								if( marron_mean <= 58.6131 )
									ret := -0.950000 // sell
								if( marron_mean > 58.6131 )
									ret := 0.154822
	
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
float op_operation = decision_tree_0_UPST_1Min_d6f00744(nvi, nvi_ema, marron_mean, source, azul, verde_azul, verde_mean, xmf, pvimin, stoc, media, tprice, marron, pvim, pvimax, xrsi, oscp, pvi, nvimax, nvimin, verde, verde_media, azul_mean, nvim, BollOsc, pvi_ema, media_azul)

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


