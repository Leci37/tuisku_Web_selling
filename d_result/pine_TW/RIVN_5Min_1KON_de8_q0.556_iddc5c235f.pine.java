//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: RIVN_5Min_1KON_dc5c235f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RIVN_5Min_1KON_dc5c235f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RIVN_5Min_dc5c235f(nvimin, azul, nvim, marron_mean, marron, nvimax, pvi, pvi_ema, oscp, verde, source, stoc, verde_mean, xrsi, media, xmf, tprice, pvimin, media_azul, verde_media, BollOsc, pvimax, nvi_ema, azul_mean, pvim, nvi, verde_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( marron_mean <= 4.04496 )
		if( azul_mean <= 40.5147 )
			if( azul_mean <= -56.0687 )
				if( verde_mean <= -99.8783 )
					if( BollOsc <= -48.9025 )
						if( tprice <= 10.4026 )
							if( pvi_ema <= -0.446491 )
								if( pvi_ema <= -0.480405 )
									ret := 0.500000
								if( pvi_ema > -0.480405 )
									ret := 1.000000 // buy
							if( pvi_ema > -0.446491 )
								ret := -0.600000
						if( tprice > 10.4026 )
							if( verde_mean <= -107.799 )
								ret := 1.000000 // buy
							if( verde_mean > -107.799 )
								ret := 0.250000
					if( BollOsc > -48.9025 )
						ret := -0.400000
				if( verde_mean > -99.8783 )
					if( verde_mean <= -54.8057 )
						if( media <= 5.63847 )
							if( pvimin <= -0.278672 )
								ret := -0.750000 // sell
							if( pvimin > -0.278672 )
								ret := -1.000000 // sell
						if( media > 5.63847 )
							if( verde_azul <= -18.5118 )
								if( xmf <= 1.03386 )
									ret := 0.500000
								if( xmf > 1.03386 )
									ret := -0.933333 // sell
							if( verde_azul > -18.5118 )
								if( xmf <= 18.4932 )
									ret := 0.425000
								if( xmf > 18.4932 )
									ret := -0.440000
					if( verde_mean > -54.8057 )
						if( marron <= 1.10231 )
							if( verde_mean <= -18.5278 )
								if( xmf <= 26.7235 )
									ret := 0.769231 // buy
								if( xmf > 26.7235 )
									ret := -0.833333 // sell
							if( verde_mean > -18.5278 )
								if( media_azul <= 61.8403 )
									ret := -0.888889 // sell
								if( media_azul > 61.8403 )
									ret := 0.142857
						if( marron > 1.10231 )
							if( azul <= -22.144 )
								if( verde_media <= 12.6652 )
									ret := -0.692308
								if( verde_media > 12.6652 )
									ret := 0.250000
							if( azul > -22.144 )
								ret := 0.333333
			if( azul_mean > -56.0687 )
				if( tprice <= 18.8051 )
					if( pvim <= -0.057067 )
						if( media <= 5.23637 )
							if( azul <= 11.537 )
								if( media <= -2.23479 )
									ret := 0.666667
								if( media > -2.23479 )
									ret := -0.077720
							if( azul > 11.537 )
								if( verde <= -21.6495 )
									ret := -0.789474 // sell
								if( verde > -21.6495 )
									ret := 0.363636
						if( media > 5.23637 )
							if( azul_mean <= 5.40717 )
								if( oscp <= -18.9407 )
									ret := 0.415441
								if( oscp > -18.9407 )
									ret := 0.121019
							if( azul_mean > 5.40717 )
								if( media <= 19.1595 )
									ret := 0.126761
								if( media > 19.1595 )
									ret := -0.461538
					if( pvim > -0.057067 )
						if( media <= 27.0947 )
							if( azul <= -52.9184 )
								if( media_azul <= 91.4211 )
									ret := -0.863636 // sell
								if( media_azul > 91.4211 )
									ret := 0.727273 // buy
							if( azul > -52.9184 )
								if( verde_media <= 5.18844 )
									ret := 0.467160
								if( verde_media > 5.18844 )
									ret := -0.526316
						if( media > 27.0947 )
							if( verde_azul <= -12.6287 )
								if( marron <= -15.2469 )
									ret := 0.277778
								if( marron > -15.2469 )
									ret := -0.400000
							if( verde_azul > -12.6287 )
								if( media <= 30.1596 )
									ret := -0.090909
								if( media > 30.1596 )
									ret := 0.888889 // buy
				if( tprice > 18.8051 )
					if( azul_mean <= -36.7842 )
						if( media <= 5.08445 )
							if( media <= -4.21034 )
								if( stoc <= 10.2962 )
									ret := 1.000000 // buy
								if( stoc > 10.2962 )
									ret := 0.250000
							if( media > -4.21034 )
								if( nvim <= -0.043106 )
									ret := -0.750000 // sell
								if( nvim > -0.043106 )
									ret := -1.000000 // sell
						if( media > 5.08445 )
							if( verde <= -35.9835 )
								if( tprice <= 25.0023 )
									ret := 0.819672 // buy
								if( tprice > 25.0023 )
									ret := -0.250000
							if( verde > -35.9835 )
								if( stoc <= 16.3612 )
									ret := -0.300000
								if( stoc > 16.3612 )
									ret := 0.800000 // buy
					if( azul_mean > -36.7842 )
						if( verde_mean <= -66.7374 )
							if( oscp <= -116.559 )
								if( azul <= -39.995 )
									ret := -0.857143 // sell
								if( azul > -39.995 )
									ret := 0.653846
							if( oscp > -116.559 )
								if( pvimax <= 0.719019 )
									ret := -0.645161
								if( pvimax > 0.719019 )
									ret := 0.068966
						if( verde_mean > -66.7374 )
							if( azul_mean <= -19.4743 )
								if( verde_azul <= 10.512 )
									ret := 0.559140
								if( verde_azul > 10.512 )
									ret := -0.028571
							if( azul_mean > -19.4743 )
								if( BollOsc <= -36.5737 )
									ret := -0.061765
								if( BollOsc > -36.5737 )
									ret := 0.318966
		if( azul_mean > 40.5147 )
			if( pvi <= 0.540022 )
				if( BollOsc <= -36.386 )
					if( oscp <= -68.5016 )
						if( tprice <= 11.3679 )
							ret := -0.250000
						if( tprice > 11.3679 )
							if( stoc <= 10.2443 )
								ret := -0.857143 // sell
							if( stoc > 10.2443 )
								ret := -1.000000 // sell
					if( oscp > -68.5016 )
						if( nvi <= 0.222192 )
							ret := 0.142857
						if( nvi > 0.222192 )
							if( media <= 3.43248 )
								ret := 0.142857
							if( media > 3.43248 )
								if( xmf <= 12.2669 )
									ret := -0.500000
								if( xmf > 12.2669 )
									ret := -1.000000 // sell
				if( BollOsc > -36.386 )
					if( pvi <= -0.125764 )
						if( verde_mean <= -39.1235 )
							ret := -0.833333 // sell
						if( verde_mean > -39.1235 )
							ret := 0.200000
					if( pvi > -0.125764 )
						if( media_azul <= -61.8781 )
							ret := 0.285714
						if( media_azul > -61.8781 )
							ret := 1.000000 // buy
			if( pvi > 0.540022 )
				if( azul <= 42.2908 )
					ret := -0.500000
				if( azul > 42.2908 )
					if( azul <= 68.417 )
						if( pvi_ema <= 0.663333 )
							ret := 1.000000 // buy
						if( pvi_ema > 0.663333 )
							ret := 0.250000
					if( azul > 68.417 )
						ret := 1.000000 // buy
	if( marron_mean > 4.04496 )
		if( oscp <= 16.5782 )
			if( media_azul <= 20.5033 )
				if( azul_mean <= 15.3499 )
					if( BollOsc <= -38.9933 )
						if( media_azul <= 10.0703 )
							if( marron <= 9.91896 )
								if( nvimax <= -0.073078 )
									ret := -0.705882 // sell
								if( nvimax > -0.073078 )
									ret := -0.018519
							if( marron > 9.91896 )
								if( pvi <= 0.001225 )
									ret := -0.178571
								if( pvi > 0.001225 )
									ret := 0.681818
						if( media_azul > 10.0703 )
							if( source <= 20.951 )
								if( oscp <= -14.3678 )
									ret := 0.000000
								if( oscp > -14.3678 )
									ret := -0.490741
							if( source > 20.951 )
								if( verde_azul <= -13.3828 )
									ret := -0.666667
								if( verde_azul > -13.3828 )
									ret := 0.037037
					if( BollOsc > -38.9933 )
						if( nvimax <= 0.3591 )
							if( media <= 9.50234 )
								if( azul_mean <= 7.10095 )
									ret := 0.627273
								if( azul_mean > 7.10095 )
									ret := -0.142857
							if( media > 9.50234 )
								if( verde <= 18.0271 )
									ret := 0.041878
								if( verde > 18.0271 )
									ret := 0.241758
						if( nvimax > 0.3591 )
							if( verde_media <= 38.0641 )
								if( BollOsc <= 0.119868 )
									ret := 0.021543
								if( BollOsc > 0.119868 )
									ret := -0.336538
							if( verde_media > 38.0641 )
								if( oscp <= 10.2378 )
									ret := 0.671642
								if( oscp > 10.2378 )
									ret := -0.142857
				if( azul_mean > 15.3499 )
					if( tprice <= 17.7315 )
						if( azul <= 64.7556 )
							if( media <= 46.7945 )
								if( pvi <= 0.158368 )
									ret := -0.088235
								if( pvi > 0.158368 )
									ret := 0.204360
							if( media > 46.7945 )
								if( xrsi <= 36.612 )
									ret := 0.909091 // buy
								if( xrsi > 36.612 )
									ret := -0.315000
						if( azul > 64.7556 )
							if( verde_media <= -40.3197 )
								if( source <= 15.1472 )
									ret := 0.113208
								if( source > 15.1472 )
									ret := -0.685185
							if( verde_media > -40.3197 )
								if( nvimax <= -0.050652 )
									ret := 0.712121 // buy
								if( nvimax > -0.050652 )
									ret := 0.228381
					if( tprice > 17.7315 )
						if( pvimax <= 0.86416 )
							if( pvimax <= 0.69572 )
								if( verde <= -16.6623 )
									ret := -0.451613
								if( verde > -16.6623 )
									ret := -0.143820
							if( pvimax > 0.69572 )
								if( azul_mean <= 19.8494 )
									ret := -0.078125
								if( azul_mean > 19.8494 )
									ret := -0.600806
						if( pvimax > 0.86416 )
							if( pvimin <= 0.938053 )
								if( tprice <= 25.0744 )
									ret := 0.513274
								if( tprice > 25.0744 )
									ret := -0.207547
							if( pvimin > 0.938053 )
								if( verde_media <= -82.186 )
									ret := 0.722222 // buy
								if( verde_media > -82.186 )
									ret := -0.355556
			if( media_azul > 20.5033 )
				if( azul_mean <= -39.4562 )
					if( nvim <= 0.780259 )
						if( verde_azul <= -0.097898 )
							if( marron <= -30.2344 )
								ret := 1.000000 // buy
							if( marron > -30.2344 )
								if( BollOsc <= -69.5779 )
									ret := -0.914894 // sell
								if( BollOsc > -69.5779 )
									ret := -0.145455
						if( verde_azul > -0.097898 )
							if( stoc <= 71.8703 )
								if( verde_media <= -38.1481 )
									ret := 0.117048
								if( verde_media > -38.1481 )
									ret := -0.155172
							if( stoc > 71.8703 )
								if( marron_mean <= 80.8762 )
									ret := -0.333333
								if( marron_mean > 80.8762 )
									ret := 0.818182 // buy
					if( nvim > 0.780259 )
						if( marron <= 12.1064 )
							if( nvimax <= 0.796586 )
								ret := -0.833333 // sell
							if( nvimax > 0.796586 )
								ret := 0.142857
						if( marron > 12.1064 )
							if( pvimin <= -0.331994 )
								if( xrsi <= 39.394 )
									ret := -0.666667
								if( xrsi > 39.394 )
									ret := -1.000000 // sell
							if( pvimin > -0.331994 )
								ret := -1.000000 // sell
				if( azul_mean > -39.4562 )
					if( marron <= 9.08429 )
						if( azul <= 2.55145 )
							if( tprice <= 17.5409 )
								if( xrsi <= 18.136 )
									ret := 0.800000 // buy
								if( xrsi > 18.136 )
									ret := 0.176126
							if( tprice > 17.5409 )
								if( nvimax <= 0.411274 )
									ret := 0.005988
								if( nvimax > 0.411274 )
									ret := -0.772727 // sell
						if( azul > 2.55145 )
							if( stoc <= 27.5183 )
								if( marron <= 5.37537 )
									ret := 0.626984
								if( marron > 5.37537 )
									ret := 0.272727
							if( stoc > 27.5183 )
								if( media <= 38.8318 )
									ret := -0.655172
								if( media > 38.8318 )
									ret := 0.187970
					if( marron > 9.08429 )
						if( verde_mean <= -25.153 )
							if( xrsi <= 28.8569 )
								if( azul <= -34.6077 )
									ret := -0.857143 // sell
								if( azul > -34.6077 )
									ret := 0.431034
							if( xrsi > 28.8569 )
								if( xmf <= 64.1195 )
									ret := -0.380137
								if( xmf > 64.1195 )
									ret := 1.000000 // buy
						if( verde_mean > -25.153 )
							if( verde_media <= -137.975 )
								if( azul_mean <= -4.71277 )
									ret := -0.111111
								if( azul_mean > -4.71277 )
									ret := 0.865672 // buy
							if( verde_media > -137.975 )
								if( stoc <= 9.91639 )
									ret := -0.078222
								if( stoc > 9.91639 )
									ret := 0.060004
		if( oscp > 16.5782 )
			if( source <= 25.2199 )
				if( verde_mean <= 205.692 )
					if( BollOsc <= 36.6635 )
						if( stoc <= 47.5676 )
							if( azul_mean <= -38.4036 )
								if( media_azul <= 78.291 )
									ret := -0.316456
								if( media_azul > 78.291 )
									ret := 0.214286
							if( azul_mean > -38.4036 )
								if( marron_mean <= 79.8932 )
									ret := -0.226840
								if( marron_mean > 79.8932 )
									ret := 0.307692
						if( stoc > 47.5676 )
							if( marron <= 94.2562 )
								if( pvi <= -0.19821 )
									ret := 0.236131
								if( pvi > -0.19821 )
									ret := 0.004102
							if( marron > 94.2562 )
								if( nvimin <= 0.370055 )
									ret := 0.319149
								if( nvimin > 0.370055 )
									ret := 0.024176
					if( BollOsc > 36.6635 )
						if( nvim <= 0.0524 )
							if( pvimin <= 0.607061 )
								if( azul <= -42.6289 )
									ret := 0.442308
								if( azul > -42.6289 )
									ret := -0.300797
							if( pvimin > 0.607061 )
								if( media_azul <= 128.165 )
									ret := -0.027491
								if( media_azul > 128.165 )
									ret := -0.738095 // sell
						if( nvim > 0.0524 )
							if( verde_media <= 32.7738 )
								if( stoc <= 91.8652 )
									ret := -0.152416
								if( stoc > 91.8652 )
									ret := -0.666667
							if( verde_media > 32.7738 )
								if( verde_media <= 217.403 )
									ret := 0.007851
								if( verde_media > 217.403 )
									ret := 0.584906
				if( verde_mean > 205.692 )
					if( media <= 116.383 )
						if( media_azul <= 165.959 )
							if( stoc <= 72.1706 )
								if( verde_mean <= 254.814 )
									ret := 0.233333
								if( verde_mean > 254.814 )
									ret := -0.818182 // sell
							if( stoc > 72.1706 )
								if( stoc <= 86.443 )
									ret := 0.638462
								if( stoc > 86.443 )
									ret := 0.347619
						if( media_azul > 165.959 )
							if( pvi <= -0.283578 )
								ret := 1.000000 // buy
							if( pvi > -0.283578 )
								if( xrsi <= 65.3841 )
									ret := 0.428571
								if( xrsi > 65.3841 )
									ret := -0.857143 // sell
					if( media > 116.383 )
						if( source <= 12.8287 )
							if( pvi_ema <= -0.428177 )
								ret := 0.000000
							if( pvi_ema > -0.428177 )
								if( BollOsc <= 45.3719 )
									ret := -0.750000 // sell
								if( BollOsc > 45.3719 )
									ret := -1.000000 // sell
						if( source > 12.8287 )
							if( stoc <= 92.6385 )
								if( verde_mean <= 248.257 )
									ret := 0.710526 // buy
								if( verde_mean > 248.257 )
									ret := -1.000000 // sell
							if( stoc > 92.6385 )
								if( azul_mean <= 8.42269 )
									ret := -1.000000 // sell
								if( azul_mean > 8.42269 )
									ret := -0.750000 // sell
			if( source > 25.2199 )
				if( azul_mean <= -18.7339 )
					if( pvimin <= 1.03083 )
						if( marron <= 71.3833 )
							if( nvi <= -0.170677 )
								ret := -1.000000 // sell
							if( nvi > -0.170677 )
								if( pvi <= 0.971402 )
									ret := 0.500000
								if( pvi > 0.971402 )
									ret := 1.000000 // buy
						if( marron > 71.3833 )
							if( BollOsc <= 68.0707 )
								if( xmf <= 70.3568 )
									ret := -0.982759 // sell
								if( xmf > 70.3568 )
									ret := -0.846154 // sell
							if( BollOsc > 68.0707 )
								ret := -0.666667
					if( pvimin > 1.03083 )
						if( pvi_ema <= 1.10173 )
							ret := 1.000000 // buy
						if( pvi_ema > 1.10173 )
							if( BollOsc <= 38.008 )
								ret := -0.750000 // sell
							if( BollOsc > 38.008 )
								ret := -0.250000
				if( azul_mean > -18.7339 )
					if( verde_mean <= 140.845 )
						if( xrsi <= 79.5649 )
							if( pvimax <= 0.862239 )
								ret := 1.000000 // buy
							if( pvimax > 0.862239 )
								if( nvimin <= -0.081444 )
									ret := -0.010309
								if( nvimin > -0.081444 )
									ret := -0.576923
						if( xrsi > 79.5649 )
							if( tprice <= 26.7189 )
								if( xrsi <= 80.2995 )
									ret := 0.750000 // buy
								if( xrsi > 80.2995 )
									ret := -0.200000
							if( tprice > 26.7189 )
								if( pvimin <= 1.01217 )
									ret := 1.000000 // buy
								if( pvimin > 1.01217 )
									ret := 0.750000 // buy
					if( verde_mean > 140.845 )
						if( azul <= -23.9843 )
							if( pvim <= 0.849294 )
								ret := 1.000000 // buy
							if( pvim > 0.849294 )
								ret := 0.250000
						if( azul > -23.9843 )
							if( nvi_ema <= -0.177064 )
								if( BollOsc <= 41.2626 )
									ret := -0.560000
								if( BollOsc > 41.2626 )
									ret := 0.044444
							if( nvi_ema > -0.177064 )
								if( tprice <= 26.8945 )
									ret := -0.884615 // sell
								if( tprice > 26.8945 )
									ret := -0.538462
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_RIVN_5Min_dc5c235f(nvimin, azul, nvim, marron_mean, marron, nvimax, pvi, pvi_ema, oscp, verde, source, stoc, verde_mean, xrsi, media, xmf, tprice, pvimin, media_azul, verde_media, BollOsc, pvimax, nvi_ema, azul_mean, pvim, nvi, verde_azul)

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


