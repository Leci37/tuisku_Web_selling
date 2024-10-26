//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: GOOG_1Min_1KON_673aedaf Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GOOG_1Min_1KON_673aedaf", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GOOG_1Min_673aedaf(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( marron <= 56.1763 )
		if( media_azul <= 91.1946 )
			if( BollOsc <= -76.0738 )
				if( verde_media <= -295.071 )
					ret := -1.000000 // sell
				if( verde_media > -295.071 )
					if( oscp <= -17.3313 )
						if( azul <= -8.09387 )
							if( nvim <= 0.236629 )
								if( verde_media <= -152.892 )
									ret := 1.000000 // buy
								if( verde_media > -152.892 )
									ret := 0.415385
							if( nvim > 0.236629 )
								if( nvim <= 0.267552 )
									ret := -0.518519
								if( nvim > 0.267552 )
									ret := 0.444444
						if( azul > -8.09387 )
							if( BollOsc <= -80.5434 )
								if( media <= 23.0777 )
									ret := -0.300000
								if( media > 23.0777 )
									ret := 0.585859
							if( BollOsc > -80.5434 )
								if( azul <= 11.4107 )
									ret := 0.863636 // buy
								if( azul > 11.4107 )
									ret := 0.250000
					if( oscp > -17.3313 )
						if( azul_mean <= -0.779631 )
							if( oscp <= -15.7996 )
								ret := -0.714286 // sell
							if( oscp > -15.7996 )
								if( stoc <= 6.1449 )
									ret := -0.285714
								if( stoc > 6.1449 )
									ret := 0.555556
						if( azul_mean > -0.779631 )
							if( xmf <= 32.3721 )
								if( tprice <= 164.997 )
									ret := -0.250000
								if( tprice > 164.997 )
									ret := -1.000000 // sell
							if( xmf > 32.3721 )
								ret := 0.000000
			if( BollOsc > -76.0738 )
				if( source <= 152.811 )
					if( nvimin <= 0.292517 )
						if( azul_mean <= 2.26409 )
							if( media <= 41.6003 )
								if( source <= 149.857 )
									ret := -0.227545
								if( source > 149.857 )
									ret := -0.542125
							if( media > 41.6003 )
								if( xrsi <= 40.1696 )
									ret := 0.413793
								if( xrsi > 40.1696 )
									ret := -0.122449
						if( azul_mean > 2.26409 )
							if( media <= 20.8101 )
								if( nvimax <= 0.272315 )
									ret := -0.729730 // sell
								if( nvimax > 0.272315 )
									ret := 0.040000
							if( media > 20.8101 )
								if( marron <= 20.4688 )
									ret := 0.772727 // buy
								if( marron > 20.4688 )
									ret := 0.098592
					if( nvimin > 0.292517 )
						if( media <= 55.3672 )
							if( nvi_ema <= 0.310285 )
								if( azul <= 6.04391 )
									ret := 1.000000 // buy
								if( azul > 6.04391 )
									ret := 0.750000 // buy
							if( nvi_ema > 0.310285 )
								if( source <= 152.677 )
									ret := 0.513514
								if( source > 152.677 )
									ret := -0.142857
						if( media > 55.3672 )
							if( media_azul <= 85.6939 )
								if( marron_mean <= 67.9919 )
									ret := 0.066667
								if( marron_mean > 67.9919 )
									ret := -0.250000
							if( media_azul > 85.6939 )
								ret := 0.750000 // buy
				if( source > 152.811 )
					if( xrsi <= 12.0834 )
						if( tprice <= 170.383 )
							if( nvim <= 0.375657 )
								if( marron <= -4.16222 )
									ret := 0.807018 // buy
								if( marron > -4.16222 )
									ret := 0.133333
							if( nvim > 0.375657 )
								if( tprice <= 164.329 )
									ret := 0.428571
								if( tprice > 164.329 )
									ret := -1.000000 // sell
						if( tprice > 170.383 )
							if( verde_mean <= -79.4336 )
								ret := 0.857143 // buy
							if( verde_mean > -79.4336 )
								if( xrsi <= 9.9545 )
									ret := 0.000000
								if( xrsi > 9.9545 )
									ret := -0.526316
					if( xrsi > 12.0834 )
						if( verde_mean <= -31.1459 )
							if( nvimin <= 0.076916 )
								if( tprice <= 177.214 )
									ret := -0.551471
								if( tprice > 177.214 )
									ret := 0.125000
							if( nvimin > 0.076916 )
								if( xmf <= 43.0268 )
									ret := -0.027470
								if( xmf > 43.0268 )
									ret := 0.394737
						if( verde_mean > -31.1459 )
							if( verde_mean <= 7.17005 )
								if( nvimax <= 0.002296 )
									ret := -0.833333 // sell
								if( nvimax > 0.002296 )
									ret := 0.116934
							if( verde_mean > 7.17005 )
								if( media_azul <= 30.3539 )
									ret := -0.017571
								if( media_azul > 30.3539 )
									ret := 0.074462
		if( media_azul > 91.1946 )
			if( azul <= -126.203 )
				if( verde_media <= -71.6905 )
					if( azul <= -138.298 )
						ret := -1.000000 // sell
					if( azul > -138.298 )
						ret := 0.166667
				if( verde_media > -71.6905 )
					if( stoc <= 51.8257 )
						if( verde <= -4.58963 )
							if( xmf <= 28.4177 )
								if( verde_media <= -49.4913 )
									ret := 0.750000 // buy
								if( verde_media > -49.4913 )
									ret := 1.000000 // buy
							if( xmf > 28.4177 )
								ret := -0.250000
						if( verde > -4.58963 )
							if( verde_media <= 49.7534 )
								if( BollOsc <= -24.5837 )
									ret := 0.965116 // buy
								if( BollOsc > -24.5837 )
									ret := 0.500000
							if( verde_media > 49.7534 )
								ret := 0.250000
					if( stoc > 51.8257 )
						ret := 0.000000
			if( azul > -126.203 )
				if( verde_azul <= -101.913 )
					if( xrsi <= 23.3938 )
						ret := -1.000000 // sell
					if( xrsi > 23.3938 )
						ret := -0.250000
				if( verde_azul > -101.913 )
					if( marron <= 26.5482 )
						if( verde <= -32.9077 )
							if( xmf <= 20.574 )
								if( pvimin <= -0.012715 )
									ret := 0.763158 // buy
								if( pvimin > -0.012715 )
									ret := 0.100000
							if( xmf > 20.574 )
								if( BollOsc <= -80.7428 )
									ret := 0.714286 // buy
								if( BollOsc > -80.7428 )
									ret := -0.561404
						if( verde > -32.9077 )
							if( xrsi <= 33.9075 )
								if( verde_mean <= -8.05906 )
									ret := 0.285714
								if( verde_mean > -8.05906 )
									ret := 0.644444
							if( xrsi > 33.9075 )
								if( azul_mean <= -28.8993 )
									ret := 0.160377
								if( azul_mean > -28.8993 )
									ret := 0.555556
					if( marron > 26.5482 )
						if( marron_mean <= 62.9104 )
							if( verde_mean <= 72.4112 )
								if( nvimax <= 0.131639 )
									ret := 0.259690
								if( nvimax > 0.131639 )
									ret := 0.002427
							if( verde_mean > 72.4112 )
								if( azul <= -41.4956 )
									ret := -0.024390
								if( azul > -41.4956 )
									ret := -0.603448
						if( marron_mean > 62.9104 )
							if( verde_media <= -45.0839 )
								if( azul_mean <= -6.48742 )
									ret := 0.228070
								if( azul_mean > -6.48742 )
									ret := -0.321429
							if( verde_media > -45.0839 )
								if( media <= 67.103 )
									ret := 0.565891
								if( media > 67.103 )
									ret := 0.242485
	if( marron > 56.1763 )
		if( verde_azul <= 50.1034 )
			if( verde_media <= 33.5348 )
				if( source <= 184.917 )
					if( tprice <= 173.963 )
						if( media <= 81.4624 )
							if( stoc <= 57.5634 )
								if( pvi <= -0.134486 )
									ret := -0.007968
								if( pvi > -0.134486 )
									ret := 0.291005
							if( stoc > 57.5634 )
								if( nvim <= 0.108026 )
									ret := -0.348548
								if( nvim > 0.108026 )
									ret := -0.054005
						if( media > 81.4624 )
							if( source <= 157.174 )
								if( verde_azul <= 39.0619 )
									ret := 0.500000
								if( verde_azul > 39.0619 )
									ret := -0.031250
							if( source > 157.174 )
								if( media <= 98.938 )
									ret := -0.316498
								if( media > 98.938 )
									ret := 0.328358
					if( tprice > 173.963 )
						if( verde_azul <= -86.1599 )
							if( marron_mean <= 41.8916 )
								ret := 0.500000
							if( marron_mean > 41.8916 )
								if( oscp <= -89.4354 )
									ret := -0.437500
								if( oscp > -89.4354 )
									ret := -0.913043 // sell
						if( verde_azul > -86.1599 )
							if( azul_mean <= 5.82537 )
								if( azul <= 14.414 )
									ret := 0.078261
								if( azul > 14.414 )
									ret := -0.533333
							if( azul_mean > 5.82537 )
								if( nvimax <= 0.118525 )
									ret := 0.093413
								if( nvimax > 0.118525 )
									ret := 0.295154
				if( source > 184.917 )
					if( marron <= 61.2087 )
						if( pvi_ema <= 0.098418 )
							if( marron_mean <= 52.4011 )
								if( pvimin <= 0.095468 )
									ret := -0.320000
								if( pvimin > 0.095468 )
									ret := 0.600000
							if( marron_mean > 52.4011 )
								if( verde_media <= 12.4776 )
									ret := 0.240741
								if( verde_media > 12.4776 )
									ret := 1.000000 // buy
						if( pvi_ema > 0.098418 )
							if( media <= 44.796 )
								ret := -1.000000 // sell
							if( media > 44.796 )
								ret := -0.166667
					if( marron > 61.2087 )
						if( xrsi <= 52.5693 )
							if( pvi <= 0.029028 )
								ret := -0.857143 // sell
							if( pvi > 0.029028 )
								if( azul <= 4.43269 )
									ret := 0.800000 // buy
								if( azul > 4.43269 )
									ret := -0.014706
						if( xrsi > 52.5693 )
							if( tprice <= 191.092 )
								if( oscp <= -3.0715 )
									ret := -0.578313
								if( oscp > -3.0715 )
									ret := -0.171429
							if( tprice > 191.092 )
								if( nvimin <= 0.130552 )
									ret := -0.256410
								if( nvimin > 0.130552 )
									ret := 0.750000 // buy
			if( verde_media > 33.5348 )
				if( azul <= 60.4136 )
					if( media <= 58.6192 )
						if( marron <= 68.8039 )
							if( marron <= 62.2491 )
								if( source <= 184.228 )
									ret := 0.000000
								if( source > 184.228 )
									ret := -0.800000 // sell
							if( marron > 62.2491 )
								if( verde_media <= 35.1676 )
									ret := -0.333333
								if( verde_media > 35.1676 )
									ret := -0.826087 // sell
						if( marron > 68.8039 )
							if( tprice <= 169.422 )
								if( media <= 55.1576 )
									ret := 0.357143
								if( media > 55.1576 )
									ret := -0.857143 // sell
							if( tprice > 169.422 )
								if( media <= 27.4375 )
									ret := 0.750000 // buy
								if( media > 27.4375 )
									ret := -0.382979
					if( media > 58.6192 )
						if( verde_mean <= 85.1498 )
							ret := 0.600000
						if( verde_mean > 85.1498 )
							ret := 1.000000 // buy
				if( azul > 60.4136 )
					if( verde_media <= 102.133 )
						if( azul_mean <= 20.4148 )
							if( nvimin <= 0.2651 )
								ret := -1.000000 // sell
							if( nvimin > 0.2651 )
								ret := -0.500000
						if( azul_mean > 20.4148 )
							if( nvi <= 0.116415 )
								if( pvi <= 0.041248 )
									ret := -0.151515
								if( pvi > 0.041248 )
									ret := -0.640000
							if( nvi > 0.116415 )
								if( xmf <= 78.1004 )
									ret := -0.584615
								if( xmf > 78.1004 )
									ret := -0.921053 // sell
					if( verde_media > 102.133 )
						if( verde_mean <= 189.939 )
							ret := 0.166667
						if( verde_mean > 189.939 )
							ret := 1.000000 // buy
		if( verde_azul > 50.1034 )
			if( tprice <= 173.758 )
				if( marron_mean <= 40.8509 )
					if( BollOsc <= 16.3048 )
						if( verde <= 76.2656 )
							if( pvi <= -0.140992 )
								if( nvimin <= 0.276844 )
									ret := 0.212766
								if( nvimin > 0.276844 )
									ret := -0.411765
							if( pvi > -0.140992 )
								if( xrsi <= 48.3401 )
									ret := -0.956522 // sell
								if( xrsi > 48.3401 )
									ret := -0.309524
						if( verde > 76.2656 )
							if( verde_media <= 57.3317 )
								if( verde_mean <= 30.9409 )
									ret := 0.851852 // buy
								if( verde_mean > 30.9409 )
									ret := 0.250000
							if( verde_media > 57.3317 )
								if( marron <= 61.3476 )
									ret := 0.428571
								if( marron > 61.3476 )
									ret := -0.657143
					if( BollOsc > 16.3048 )
						if( media_azul <= 46.0998 )
							if( xrsi <= 52.0172 )
								ret := 0.400000
							if( xrsi > 52.0172 )
								if( verde_media <= 37.3251 )
									ret := 0.000000
								if( verde_media > 37.3251 )
									ret := -0.791667 // sell
						if( media_azul > 46.0998 )
							if( media_azul <= 67.4487 )
								if( verde_media <= 171.92 )
									ret := 0.111111
								if( verde_media > 171.92 )
									ret := 1.000000 // buy
							if( media_azul > 67.4487 )
								ret := -0.714286 // sell
				if( marron_mean > 40.8509 )
					if( pvi <= 0.028886 )
						if( oscp <= -1.31726 )
							if( nvim <= 0.315032 )
								if( source <= 157.723 )
									ret := 0.471264
								if( source > 157.723 )
									ret := 0.205191
							if( nvim > 0.315032 )
								if( tprice <= 168.002 )
									ret := 0.080834
								if( tprice > 168.002 )
									ret := -0.530612
						if( oscp > -1.31726 )
							if( marron_mean <= 102.826 )
								if( azul_mean <= 26.232 )
									ret := 0.027706
								if( azul_mean > 26.232 )
									ret := -0.201807
							if( marron_mean > 102.826 )
								if( nvi_ema <= 0.295938 )
									ret := 0.073585
								if( nvi_ema > 0.295938 )
									ret := 0.215152
					if( pvi > 0.028886 )
						if( BollOsc <= 0.536864 )
							if( azul_mean <= -17.8167 )
								ret := -1.000000 // sell
							if( azul_mean > -17.8167 )
								ret := 0.250000
						if( BollOsc > 0.536864 )
							if( pvimax <= 0.032208 )
								if( pvi <= 0.029757 )
									ret := 0.846154 // buy
								if( pvi > 0.029757 )
									ret := 0.160000
							if( pvimax > 0.032208 )
								if( marron_mean <= 64.5322 )
									ret := 0.333333
								if( marron_mean > 64.5322 )
									ret := 0.925926 // buy
			if( tprice > 173.758 )
				if( verde_azul <= 186.731 )
					if( verde_mean <= 57.9191 )
						if( azul_mean <= 11.7055 )
							if( xmf <= 49.461 )
								if( marron <= 73.1131 )
									ret := 0.135371
								if( marron > 73.1131 )
									ret := -0.361111
							if( xmf > 49.461 )
								if( verde <= 59.2015 )
									ret := 0.652174
								if( verde > 59.2015 )
									ret := 0.247655
						if( azul_mean > 11.7055 )
							if( nvim <= 0.207675 )
								if( source <= 179.481 )
									ret := -0.362637
								if( source > 179.481 )
									ret := -0.022222
							if( nvim > 0.207675 )
								ret := 0.857143 // buy
					if( verde_mean > 57.9191 )
						if( azul_mean <= -36.3972 )
							if( xmf <= 65.6336 )
								if( stoc <= 51.2084 )
									ret := -0.802326 // sell
								if( stoc > 51.2084 )
									ret := -0.266667
							if( xmf > 65.6336 )
								if( verde_mean <= 139.364 )
									ret := -0.048193
								if( verde_mean > 139.364 )
									ret := 0.846154 // buy
						if( azul_mean > -36.3972 )
							if( azul_mean <= -12.8933 )
								if( tprice <= 179.986 )
									ret := -0.011478
								if( tprice > 179.986 )
									ret := 0.299587
							if( azul_mean > -12.8933 )
								if( stoc <= 91.5294 )
									ret := -0.014409
								if( stoc > 91.5294 )
									ret := -0.116129
				if( verde_azul > 186.731 )
					if( xmf <= 83.5818 )
						if( xrsi <= 74.39 )
							if( xmf <= 39.4907 )
								ret := 1.000000 // buy
							if( xmf > 39.4907 )
								if( marron_mean <= 104.479 )
									ret := -0.570423
								if( marron_mean > 104.479 )
									ret := 0.052632
						if( xrsi > 74.39 )
							if( media_azul <= 88.036 )
								if( azul_mean <= 6.92797 )
									ret := -0.909091 // sell
								if( azul_mean > 6.92797 )
									ret := 0.333333
							if( media_azul > 88.036 )
								if( pvi <= -0.006981 )
									ret := -0.750000 // sell
								if( pvi > -0.006981 )
									ret := -1.000000 // sell
					if( xmf > 83.5818 )
						if( stoc <= 84.9486 )
							if( BollOsc <= 79.1328 )
								if( azul <= -14.237 )
									ret := 0.285714
								if( azul > -14.237 )
									ret := -0.642857
							if( BollOsc > 79.1328 )
								if( azul_mean <= -4.89623 )
									ret := -0.400000
								if( azul_mean > -4.89623 )
									ret := 0.884615 // buy
						if( stoc > 84.9486 )
							if( tprice <= 187.152 )
								if( nvi <= 0.150384 )
									ret := -0.875000 // sell
								if( nvi > 0.150384 )
									ret := -0.363636
							if( tprice > 187.152 )
								ret := 0.166667
	
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
float op_operation = decision_tree_0_GOOG_1Min_673aedaf(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


