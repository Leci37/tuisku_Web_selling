//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: AMZN_30Min_1KON_7c9cdd78 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_30Min_1KON_7c9cdd78", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_30Min_7c9cdd78(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( oscp <= 12.8073 )
		if( source <= 3205.07 )
			if( nvimin <= 0.003959 )
				if( verde_azul <= 55.9206 )
					if( azul <= -23.6145 )
						if( nvim <= 0.003068 )
							ret := -0.888889 // sell
						if( nvim > 0.003068 )
							ret := -1.000000 // sell
					if( azul > -23.6145 )
						if( source <= 613.761 )
							if( nvim <= 0.042914 )
								if( xmf <= 31.746 )
									ret := 0.000000
								if( xmf > 31.746 )
									ret := 0.550000
							if( nvim > 0.042914 )
								if( stoc <= 19.0394 )
									ret := -0.897436 // sell
								if( stoc > 19.0394 )
									ret := 0.150000
						if( source > 613.761 )
							if( pvimin <= -0.097677 )
								if( marron <= 46.2998 )
									ret := 0.400000
								if( marron > 46.2998 )
									ret := -0.600000
							if( pvimin > -0.097677 )
								if( source <= 618.169 )
									ret := -1.000000 // sell
								if( source > 618.169 )
									ret := -0.900000 // sell
				if( verde_azul > 55.9206 )
					if( verde <= 88.1215 )
						if( nvimin <= 0.00353 )
							if( verde_mean <= 86.6666 )
								if( nvim <= -0.000695 )
									ret := -0.625000
								if( nvim > -0.000695 )
									ret := -0.980583 // sell
							if( verde_mean > 86.6666 )
								ret := -0.454545
						if( nvimin > 0.00353 )
							ret := -0.210526
					if( verde > 88.1215 )
						if( verde_azul <= 97.8694 )
							ret := -0.300000
						if( verde_azul > 97.8694 )
							ret := 0.000000
			if( nvimin > 0.003959 )
				if( nvi_ema <= 0.057567 )
					if( pvi <= -0.311194 )
						if( pvi_ema <= -0.348462 )
							ret := -0.692308
						if( pvi_ema > -0.348462 )
							ret := 1.000000 // buy
					if( pvi > -0.311194 )
						if( nvimax <= 0.078742 )
							if( verde_mean <= -0.611689 )
								if( source <= 560.316 )
									ret := 0.888000 // buy
								if( source > 560.316 )
									ret := 0.166667
							if( verde_mean > -0.611689 )
								if( media_azul <= 23.3103 )
									ret := 0.672566
								if( media_azul > 23.3103 )
									ret := 0.069523
						if( nvimax > 0.078742 )
							if( verde_media <= -10.8463 )
								ret := -0.875000 // sell
							if( verde_media > -10.8463 )
								ret := -1.000000 // sell
				if( nvi_ema > 0.057567 )
					if( stoc <= 7.55737 )
						if( pvimin <= -0.253209 )
							if( verde_media <= -40.3359 )
								if( verde_mean <= -52.7772 )
									ret := 0.617647
								if( verde_mean > -52.7772 )
									ret := 0.118881
							if( verde_media > -40.3359 )
								if( nvi_ema <= 0.090267 )
									ret := -0.960000 // sell
								if( nvi_ema > 0.090267 )
									ret := -0.154472
						if( pvimin > -0.253209 )
							if( tprice <= 2962.7 )
								if( BollOsc <= -30.9557 )
									ret := 0.359010
								if( BollOsc > -30.9557 )
									ret := -0.090426
							if( tprice > 2962.7 )
								if( stoc <= 2.07161 )
									ret := 0.000000
								if( stoc > 2.07161 )
									ret := 0.894118 // buy
					if( stoc > 7.55737 )
						if( media_azul <= 49.9263 )
							if( pvi_ema <= -1.57164 )
								if( verde_mean <= 2.62615 )
									ret := -0.329787
								if( verde_mean > 2.62615 )
									ret := 0.592105
							if( pvi_ema > -1.57164 )
								if( BollOsc <= -63.1431 )
									ret := 0.156394
								if( BollOsc > -63.1431 )
									ret := -0.059801
						if( media_azul > 49.9263 )
							if( pvim <= -1.53087 )
								if( azul_mean <= 19.9387 )
									ret := 0.284393
								if( azul_mean > 19.9387 )
									ret := -0.295455
							if( pvim > -1.53087 )
								if( pvimin <= -1.12154 )
									ret := -0.060811
								if( pvimin > -1.12154 )
									ret := 0.031851
		if( source > 3205.07 )
			if( pvi <= -0.253763 )
				if( stoc <= 31.0398 )
					if( verde_azul <= -24.6452 )
						if( stoc <= 9.81158 )
							ret := -0.071429
						if( stoc > 9.81158 )
							if( azul_mean <= -6.21859 )
								ret := 0.000000
							if( azul_mean > -6.21859 )
								if( xrsi <= 27.7696 )
									ret := -1.000000 // sell
								if( xrsi > 27.7696 )
									ret := -0.741935 // sell
					if( verde_azul > -24.6452 )
						if( media <= 39.8754 )
							if( media <= 17.368 )
								if( pvi <= -0.276128 )
									ret := -0.036364
								if( pvi > -0.276128 )
									ret := -0.577236
							if( media > 17.368 )
								if( media <= 25.9844 )
									ret := 0.661538
								if( media > 25.9844 )
									ret := 0.085106
						if( media > 39.8754 )
							if( verde <= -2.52613 )
								ret := -1.000000 // sell
							if( verde > -2.52613 )
								if( verde_media <= -8.99193 )
									ret := -0.121951
								if( verde_media > -8.99193 )
									ret := -0.911765 // sell
				if( stoc > 31.0398 )
					if( pvimin <= -0.273796 )
						if( xmf <= 21.14 )
							if( tprice <= 3228.49 )
								ret := -1.000000 // sell
							if( tprice > 3228.49 )
								if( source <= 3399.66 )
									ret := 0.040000
								if( source > 3399.66 )
									ret := -0.870968 // sell
						if( xmf > 21.14 )
							if( verde_mean <= 45.1224 )
								if( media <= 59.9192 )
									ret := -0.650000
								if( media > 59.9192 )
									ret := 0.142857
							if( verde_mean > 45.1224 )
								if( nvi_ema <= 2.17965 )
									ret := 0.275335
								if( nvi_ema > 2.17965 )
									ret := -0.678571
					if( pvimin > -0.273796 )
						if( media <= 48.0423 )
							if( verde_media <= 34.368 )
								if( marron_mean <= 38.6621 )
									ret := 0.357143
								if( marron_mean > 38.6621 )
									ret := 0.843478 // buy
							if( verde_media > 34.368 )
								ret := 0.000000
						if( media > 48.0423 )
							if( nvi <= 2.17461 )
								if( nvi_ema <= 2.14258 )
									ret := -0.007042
								if( nvi_ema > 2.14258 )
									ret := 0.800000 // buy
							if( nvi > 2.17461 )
								ret := -1.000000 // sell
			if( pvi > -0.253763 )
				if( nvimax <= 1.74548 )
					if( azul_mean <= 14.895 )
						if( nvi_ema <= 1.7212 )
							if( pvim <= 0.093081 )
								ret := 1.000000 // buy
							if( pvim > 0.093081 )
								if( verde <= 41.3077 )
									ret := 0.215385
								if( verde > 41.3077 )
									ret := -0.297619
						if( nvi_ema > 1.7212 )
							if( xrsi <= 57.734 )
								if( nvi_ema <= 1.73679 )
									ret := 0.918919 // buy
								if( nvi_ema > 1.73679 )
									ret := 0.500000
							if( xrsi > 57.734 )
								if( pvi_ema <= 0.14479 )
									ret := -0.083333
								if( pvi_ema > 0.14479 )
									ret := 1.000000 // buy
					if( azul_mean > 14.895 )
						if( nvi <= 1.6858 )
							if( nvi_ema <= 1.66951 )
								ret := -0.071429
							if( nvi_ema > 1.66951 )
								if( marron_mean <= 56.0775 )
									ret := -0.777778 // sell
								if( marron_mean > 56.0775 )
									ret := -1.000000 // sell
						if( nvi > 1.6858 )
							if( nvi <= 1.7406 )
								if( verde_mean <= 84.1611 )
									ret := 0.562500
								if( verde_mean > 84.1611 )
									ret := 0.000000
							if( nvi > 1.7406 )
								if( azul <= 33.9618 )
									ret := -0.111111
								if( azul > 33.9618 )
									ret := -0.900000 // sell
				if( nvimax > 1.74548 )
					if( nvimin <= 1.82412 )
						if( stoc <= 13.4276 )
							ret := 0.857143 // buy
						if( stoc > 13.4276 )
							if( marron <= 37.8127 )
								if( BollOsc <= -18.8238 )
									ret := -0.550000
								if( BollOsc > -18.8238 )
									ret := 0.583333
							if( marron > 37.8127 )
								if( media_azul <= 78.4706 )
									ret := -0.812834 // sell
								if( media_azul > 78.4706 )
									ret := -0.426230
					if( nvimin > 1.82412 )
						if( pvi <= -0.009827 )
							if( stoc <= 89.6454 )
								if( azul <= -20.8026 )
									ret := 0.094595
								if( azul > -20.8026 )
									ret := -0.176058
							if( stoc > 89.6454 )
								if( pvimax <= -0.168944 )
									ret := -0.060440
								if( pvimax > -0.168944 )
									ret := 0.561538
						if( pvi > -0.009827 )
							if( verde_azul <= 25.0194 )
								if( azul_mean <= -9.2502 )
									ret := -0.875000 // sell
								if( azul_mean > -9.2502 )
									ret := 0.038462
							if( verde_azul > 25.0194 )
								if( pvi_ema <= -0.004666 )
									ret := -0.142857
								if( pvi_ema > -0.004666 )
									ret := -0.910256 // sell
	if( oscp > 12.8073 )
		if( nvi_ema <= 0.118575 )
			if( xrsi <= 75.0707 )
				if( pvi <= -0.269328 )
					if( nvi <= 0.023059 )
						ret := 0.333333
					if( nvi > 0.023059 )
						if( verde_mean <= 100.151 )
							if( oscp <= 16.7806 )
								ret := -1.000000 // sell
							if( oscp > 16.7806 )
								if( pvimax <= -0.317983 )
									ret := -0.818182 // sell
								if( pvimax > -0.317983 )
									ret := -0.300000
						if( verde_mean > 100.151 )
							ret := -1.000000 // sell
				if( pvi > -0.269328 )
					if( pvimin <= -0.24719 )
						if( media_azul <= 102.113 )
							if( nvimax <= 0.037538 )
								ret := 0.900000 // buy
							if( nvimax > 0.037538 )
								if( nvimin <= 0.054912 )
									ret := -0.214286
								if( nvimin > 0.054912 )
									ret := 0.714286 // buy
						if( media_azul > 102.113 )
							if( oscp <= 30.0592 )
								if( pvimax <= -0.209052 )
									ret := 0.454545
								if( pvimax > -0.209052 )
									ret := 0.882353 // buy
							if( oscp > 30.0592 )
								ret := 1.000000 // buy
					if( pvimin > -0.24719 )
						if( verde <= 134.4 )
							if( media <= 33.3476 )
								if( stoc <= 44.4669 )
									ret := 0.111111
								if( stoc > 44.4669 )
									ret := 1.000000 // buy
							if( media > 33.3476 )
								if( azul <= -13.7406 )
									ret := 0.054545
								if( azul > -13.7406 )
									ret := -0.343243
						if( verde > 134.4 )
							if( nvim <= 0.045149 )
								if( media <= 74.5406 )
									ret := 0.733333 // buy
								if( media > 74.5406 )
									ret := -0.909091 // sell
							if( nvim > 0.045149 )
								if( verde_mean <= 160.628 )
									ret := 0.701493 // buy
								if( verde_mean > 160.628 )
									ret := -0.230769
			if( xrsi > 75.0707 )
				if( source <= 598.515 )
					if( pvimin <= -0.213067 )
						ret := -0.133333
					if( pvimin > -0.213067 )
						if( source <= 578.056 )
							ret := 0.857143 // buy
						if( source > 578.056 )
							ret := 0.333333
				if( source > 598.515 )
					if( media <= 86.6868 )
						ret := 0.250000
					if( media > 86.6868 )
						if( tprice <= 681.172 )
							if( nvi <= 0.03764 )
								ret := -0.428571
							if( nvi > 0.03764 )
								if( verde_mean <= 177.265 )
									ret := -0.815789 // sell
								if( verde_mean > 177.265 )
									ret := -1.000000 // sell
						if( tprice > 681.172 )
							if( nvimin <= 0.052172 )
								if( verde_media <= 36.1064 )
									ret := -0.692308
								if( verde_media > 36.1064 )
									ret := -1.000000 // sell
							if( nvimin > 0.052172 )
								if( source <= 764.633 )
									ret := -0.060000
								if( source > 764.633 )
									ret := -1.000000 // sell
		if( nvi_ema > 0.118575 )
			if( nvi_ema <= 1.98444 )
				if( nvi_ema <= 1.53801 )
					if( source <= 2408.34 )
						if( nvimax <= 0.211424 )
							if( pvim <= 0.032858 )
								if( nvim <= 0.145555 )
									ret := 0.170455
								if( nvim > 0.145555 )
									ret := 0.744966 // buy
							if( pvim > 0.032858 )
								if( verde_mean <= 132.987 )
									ret := -0.084746
								if( verde_mean > 132.987 )
									ret := 0.200000
						if( nvimax > 0.211424 )
							if( nvim <= 0.228702 )
								if( media <= 85.0695 )
									ret := -0.775281 // sell
								if( media > 85.0695 )
									ret := -0.104478
							if( nvim > 0.228702 )
								if( azul_mean <= -23.8509 )
									ret := 0.362924
								if( azul_mean > -23.8509 )
									ret := 0.082433
					if( source > 2408.34 )
						if( pvimin <= -0.010672 )
							if( verde_mean <= 147.497 )
								if( nvi_ema <= 1.51563 )
									ret := -0.888889 // sell
								if( nvi_ema > 1.51563 )
									ret := 0.028571
							if( verde_mean > 147.497 )
								ret := 0.692308
						if( pvimin > -0.010672 )
							if( pvim <= 0.022651 )
								if( nvimin <= 1.51168 )
									ret := -0.900000 // sell
								if( nvimin > 1.51168 )
									ret := 0.200000
							if( pvim > 0.022651 )
								if( BollOsc <= 45.1314 )
									ret := -0.986301 // sell
								if( BollOsc > 45.1314 )
									ret := -0.500000
				if( nvi_ema > 1.53801 )
					if( media_azul <= 117.792 )
						if( nvim <= 1.85788 )
							if( verde_mean <= 78.8072 )
								if( BollOsc <= 8.48862 )
									ret := 0.341463
								if( BollOsc > 8.48862 )
									ret := -0.523810
							if( verde_mean > 78.8072 )
								if( tprice <= 3293.41 )
									ret := 0.562674
								if( tprice > 3293.41 )
									ret := -0.488095
						if( nvim > 1.85788 )
							if( tprice <= 108.632 )
								if( BollOsc <= 50.1533 )
									ret := 0.616279
								if( BollOsc > 50.1533 )
									ret := -0.020408
							if( tprice > 108.632 )
								if( verde <= 126.399 )
									ret := -0.041516
								if( verde > 126.399 )
									ret := 0.248895
					if( media_azul > 117.792 )
						if( pvi <= 0.071949 )
							if( pvimax <= -1.34687 )
								ret := 0.444444
							if( pvimax > -1.34687 )
								if( pvimin <= -0.113437 )
									ret := -0.739130 // sell
								if( pvimin > -0.113437 )
									ret := -0.060000
						if( pvi > 0.071949 )
							ret := 0.714286 // buy
			if( nvi_ema > 1.98444 )
				if( BollOsc <= 84.4925 )
					if( nvi_ema <= 1.99182 )
						if( verde <= 130.231 )
							if( pvim <= -1.36245 )
								ret := 0.600000
							if( pvim > -1.36245 )
								if( marron <= 74.468 )
									ret := 0.121212
								if( marron > 74.468 )
									ret := -0.373333
						if( verde > 130.231 )
							if( verde_azul <= 159.57 )
								if( oscp <= 19.7393 )
									ret := -0.125000
								if( oscp > 19.7393 )
									ret := -0.795455 // sell
							if( verde_azul > 159.57 )
								if( pvi_ema <= -1.53189 )
									ret := -0.777778 // sell
								if( pvi_ema > -1.53189 )
									ret := -0.064516
					if( nvi_ema > 1.99182 )
						if( pvimax <= -1.35473 )
							if( pvi <= -1.57294 )
								if( nvimin <= 1.98281 )
									ret := -0.187500
								if( nvimin > 1.98281 )
									ret := 0.623188
							if( pvi > -1.57294 )
								if( media_azul <= 12.5522 )
									ret := 1.000000 // buy
								if( media_azul > 12.5522 )
									ret := -0.226027
						if( pvimax > -1.35473 )
							if( azul <= 3.31692 )
								if( pvimax <= -0.919593 )
									ret := 0.240546
								if( pvimax > -0.919593 )
									ret := 0.036228
							if( azul > 3.31692 )
								if( BollOsc <= 63.6474 )
									ret := -0.016730
								if( BollOsc > 63.6474 )
									ret := -0.325444
				if( BollOsc > 84.4925 )
					if( azul <= 5.08587 )
						if( stoc <= 64.5985 )
							ret := 0.153846
						if( stoc > 64.5985 )
							if( pvimin <= -1.11398 )
								if( media_azul <= 106.581 )
									ret := 1.000000 // buy
								if( media_azul > 106.581 )
									ret := 0.888889 // buy
							if( pvimin > -1.11398 )
								if( xrsi <= 77.826 )
									ret := 0.928571 // buy
								if( xrsi > 77.826 )
									ret := 0.647059
					if( azul > 5.08587 )
						if( verde_azul <= 227.974 )
							if( nvimax <= 2.02367 )
								ret := -0.470588
							if( nvimax > 2.02367 )
								if( pvimin <= -1.08891 )
									ret := 0.526316
								if( pvimin > -1.08891 )
									ret := -0.058824
						if( verde_azul > 227.974 )
							ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_AMZN_30Min_7c9cdd78(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


