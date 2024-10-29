//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: BTCUSDT_15Min_1KON_1ec79cda Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_15Min_1KON_1ec79cda", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_15Min_1ec79cda(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( oscp <= -2.42817 )
		if( source <= 67814 )
			if( pvi_ema <= -0.916071 )
				if( pvi_ema <= -0.945273 )
					if( pvi <= -0.992435 )
						if( oscp <= -6.55788 )
							if( pvimax <= -0.984174 )
								ret := 0.400000
							if( pvimax > -0.984174 )
								if( azul_mean <= 25.3086 )
									ret := 1.000000 // buy
								if( azul_mean > 25.3086 )
									ret := 0.833333 // buy
						if( oscp > -6.55788 )
							ret := 0.100000
					if( pvi > -0.992435 )
						if( nvimax <= 1.67735 )
							if( pvi <= -0.973549 )
								if( verde_media <= -50.882 )
									ret := -0.444444
								if( verde_media > -50.882 )
									ret := -0.902913 // sell
							if( pvi > -0.973549 )
								if( nvimin <= 1.6407 )
									ret := -0.600000
								if( nvimin > 1.6407 )
									ret := 0.300000
						if( nvimax > 1.67735 )
							if( source <= 59994.1 )
								if( verde <= 25.3618 )
									ret := 0.789474 // buy
								if( verde > 25.3618 )
									ret := 0.964286 // buy
							if( source > 59994.1 )
								if( tprice <= 60785.7 )
									ret := 0.192308
								if( tprice > 60785.7 )
									ret := -0.375000
				if( pvi_ema > -0.945273 )
					if( media <= 61.2349 )
						if( pvi <= -0.926934 )
							if( nvi <= 1.61799 )
								ret := -0.500000
							if( nvi > 1.61799 )
								if( media <= 14.2809 )
									ret := -0.100000
								if( media > 14.2809 )
									ret := 0.597143
						if( pvi > -0.926934 )
							if( verde_azul <= -4.03564 )
								if( nvim <= 1.7457 )
									ret := 0.875000 // buy
								if( nvim > 1.7457 )
									ret := 0.400000
							if( verde_azul > -4.03564 )
								if( pvim <= -0.919795 )
									ret := -0.125000
								if( pvim > -0.919795 )
									ret := 0.588235
					if( media > 61.2349 )
						if( pvimax <= -0.901769 )
							if( source <= 61084.8 )
								if( nvim <= 1.66915 )
									ret := -0.133333
								if( nvim > 1.66915 )
									ret := 0.761905 // buy
							if( source > 61084.8 )
								if( azul <= 5.91615 )
									ret := -0.055556
								if( azul > 5.91615 )
									ret := -0.520000
						if( pvimax > -0.901769 )
							ret := -0.650000
			if( pvi_ema > -0.916071 )
				if( marron <= 2.10728 )
					if( verde_azul <= 19.6634 )
						if( azul <= 34.9966 )
							if( marron <= -19.766 )
								if( nvim <= 1.60701 )
									ret := -0.289037
								if( nvim > 1.60701 )
									ret := 0.850000 // buy
							if( marron > -19.766 )
								if( tprice <= 66862.7 )
									ret := 0.094545
								if( tprice > 66862.7 )
									ret := 0.737864 // buy
						if( azul > 34.9966 )
							if( pvimax <= -0.350168 )
								if( pvimax <= -0.638904 )
									ret := 0.734375 // buy
								if( pvimax > -0.638904 )
									ret := 0.090909
							if( pvimax > -0.350168 )
								if( marron_mean <= -7.54781 )
									ret := 0.978723 // buy
								if( marron_mean > -7.54781 )
									ret := 0.405405
					if( verde_azul > 19.6634 )
						if( pvimax <= -0.483951 )
							if( azul_mean <= -18.5778 )
								if( nvimin <= 1.46082 )
									ret := 0.142857
								if( nvimin > 1.46082 )
									ret := 0.875000 // buy
							if( azul_mean > -18.5778 )
								ret := -0.642857
						if( pvimax > -0.483951 )
							if( verde_mean <= -46.5667 )
								ret := -0.187500
							if( verde_mean > -46.5667 )
								if( pvi <= -0.463335 )
									ret := 0.885714 // buy
								if( pvi > -0.463335 )
									ret := 0.550000
				if( marron > 2.10728 )
					if( media <= 89.3704 )
						if( pvi <= -0.911862 )
							if( pvimax <= -0.891904 )
								if( verde_azul <= 27.3654 )
									ret := 0.553571
								if( verde_azul > 27.3654 )
									ret := -0.259259
							if( pvimax > -0.891904 )
								if( verde_media <= 8.16479 )
									ret := -0.517483
								if( verde_media > 8.16479 )
									ret := -1.000000 // sell
						if( pvi > -0.911862 )
							if( nvim <= 0.430505 )
								if( pvim <= -0.555726 )
									ret := -0.252918
								if( pvim > -0.555726 )
									ret := 0.011469
							if( nvim > 0.430505 )
								if( media <= 7.50708 )
									ret := 0.497608
								if( media > 7.50708 )
									ret := 0.048891
					if( media > 89.3704 )
						if( tprice <= 23416.5 )
							if( nvi_ema <= -0.152922 )
								if( pvimax <= -0.496011 )
									ret := 0.500000
								if( pvimax > -0.496011 )
									ret := -0.363636
							if( nvi_ema > -0.152922 )
								if( pvimax <= -0.391228 )
									ret := 0.849315 // buy
								if( pvimax > -0.391228 )
									ret := 0.552632
						if( tprice > 23416.5 )
							if( verde_media <= -27.4535 )
								if( pvim <= -0.257027 )
									ret := -0.196347
								if( pvim > -0.257027 )
									ret := 0.084034
							if( verde_media > -27.4535 )
								if( nvimax <= 1.26837 )
									ret := 0.424437
								if( nvimax > 1.26837 )
									ret := -0.102041
		if( source > 67814 )
			if( nvim <= 1.2412 )
				if( stoc <= 69.4314 )
					if( media_azul <= 14.0131 )
						if( pvimin <= -0.125222 )
							if( marron <= -10.3065 )
								ret := 0.809524 // buy
							if( marron > -10.3065 )
								if( xmf <= 44.9738 )
									ret := -0.299578
								if( xmf > 44.9738 )
									ret := 0.375000
						if( pvimin > -0.125222 )
							if( pvim <= -0.066471 )
								if( tprice <= 70098.6 )
									ret := -0.666667
								if( tprice > 70098.6 )
									ret := -1.000000 // sell
							if( pvim > -0.066471 )
								if( nvi_ema <= 0.878092 )
									ret := -0.389474
								if( nvi_ema > 0.878092 )
									ret := 0.121212
					if( media_azul > 14.0131 )
						if( verde <= -2.66482 )
							if( tprice <= 69745.2 )
								if( azul_mean <= 26.9845 )
									ret := 0.510373
								if( azul_mean > 26.9845 )
									ret := -0.878788 // sell
							if( tprice > 69745.2 )
								if( nvi_ema <= 0.810319 )
									ret := 0.888889 // buy
								if( nvi_ema > 0.810319 )
									ret := -0.266667
						if( verde > -2.66482 )
							if( verde <= 6.86144 )
								if( verde <= 6.17637 )
									ret := -0.449438
								if( verde > 6.17637 )
									ret := -0.900000 // sell
							if( verde > 6.86144 )
								if( xrsi <= 38.9288 )
									ret := 0.406504
								if( xrsi > 38.9288 )
									ret := -0.072930
				if( stoc > 69.4314 )
					if( azul_mean <= 10.0358 )
						if( tprice <= 69620.1 )
							ret := -1.000000 // sell
						if( tprice > 69620.1 )
							ret := -0.142857
					if( azul_mean > 10.0358 )
						if( pvimax <= 0.088389 )
							if( pvimin <= -0.173136 )
								ret := 0.000000
							if( pvimin > -0.173136 )
								if( verde <= 58.4952 )
									ret := 0.315789
								if( verde > 58.4952 )
									ret := 0.875000 // buy
						if( pvimax > 0.088389 )
							ret := -0.700000 // sell
			if( nvim > 1.2412 )
				if( azul <= -12.9641 )
					if( pvimin <= -0.360063 )
						if( verde <= 21.7352 )
							if( xrsi <= 32.5595 )
								ret := -0.923077 // sell
							if( xrsi > 32.5595 )
								ret := -0.200000
						if( verde > 21.7352 )
							if( verde_azul <= 50.5066 )
								ret := -1.000000 // sell
							if( verde_azul > 50.5066 )
								ret := -0.818182 // sell
					if( pvimin > -0.360063 )
						ret := -0.153846
				if( azul > -12.9641 )
					if( marron_mean <= 69.8287 )
						if( source <= 68901 )
							if( media_azul <= -19.4839 )
								ret := 0.333333
							if( media_azul > -19.4839 )
								if( nvi_ema <= 1.25624 )
									ret := -0.277778
								if( nvi_ema > 1.25624 )
									ret := -0.748466 // sell
						if( source > 68901 )
							if( source <= 70957.2 )
								if( nvi <= 1.24762 )
									ret := -0.444444
								if( nvi > 1.24762 )
									ret := 0.048780
							if( source > 70957.2 )
								if( verde_azul <= 14.9545 )
									ret := -0.150000
								if( verde_azul > 14.9545 )
									ret := -0.890909 // sell
					if( marron_mean > 69.8287 )
						if( xmf <= 46.2023 )
							if( pvim <= -0.343246 )
								if( azul_mean <= 20.1976 )
									ret := 0.500000
								if( azul_mean > 20.1976 )
									ret := 0.125000
							if( pvim > -0.343246 )
								ret := 1.000000 // buy
						if( xmf > 46.2023 )
							if( pvi_ema <= -0.378021 )
								if( xrsi <= 50.3404 )
									ret := -0.300000
								if( xrsi > 50.3404 )
									ret := 0.000000
							if( pvi_ema > -0.378021 )
								ret := -0.375000
	if( oscp > -2.42817 )
		if( marron_mean <= 124.819 )
			if( source <= 71738.9 )
				if( nvi <= 0.020121 )
					if( pvi_ema <= -0.533991 )
						if( pvi <= -0.525169 )
							if( BollOsc <= 19.6968 )
								if( marron <= 23.683 )
									ret := -0.351351
								if( marron > 23.683 )
									ret := 0.293224
							if( BollOsc > 19.6968 )
								if( marron <= 122.873 )
									ret := 0.024859
								if( marron > 122.873 )
									ret := 0.750000 // buy
						if( pvi > -0.525169 )
							if( verde_mean <= 129.687 )
								if( nvim <= -0.111924 )
									ret := -0.860000 // sell
								if( nvim > -0.111924 )
									ret := -0.230769
							if( verde_mean > 129.687 )
								if( pvi <= -0.501795 )
									ret := 0.090909
								if( pvi > -0.501795 )
									ret := 1.000000 // buy
					if( pvi_ema > -0.533991 )
						if( tprice <= 24622.6 )
							if( media <= 16.8161 )
								if( media_azul <= 40.3352 )
									ret := -0.785714 // sell
								if( media_azul > 40.3352 )
									ret := 0.133333
							if( media > 16.8161 )
								if( stoc <= 27.7644 )
									ret := -0.203230
								if( stoc > 27.7644 )
									ret := -0.045289
						if( tprice > 24622.6 )
							if( pvi_ema <= -0.004875 )
								if( pvi <= -0.219261 )
									ret := -0.552764
								if( pvi > -0.219261 )
									ret := -0.190139
							if( pvi_ema > -0.004875 )
								if( pvim <= 0.011632 )
									ret := 0.561798
								if( pvim > 0.011632 )
									ret := 0.082508
				if( nvi > 0.020121 )
					if( source <= 26037.9 )
						if( pvimin <= -0.492319 )
							if( xmf <= 46.5708 )
								if( media <= 74.1938 )
									ret := 0.158730
								if( media > 74.1938 )
									ret := -0.690909
							if( xmf > 46.5708 )
								if( oscp <= 5.11044 )
									ret := 0.176678
								if( oscp > 5.11044 )
									ret := 0.491917
						if( pvimin > -0.492319 )
							if( media <= 37.7107 )
								if( nvi_ema <= 0.292869 )
									ret := -0.155660
								if( nvi_ema > 0.292869 )
									ret := -0.866667 // sell
							if( media > 37.7107 )
								if( verde_mean <= 147.358 )
									ret := 0.093173
								if( verde_mean > 147.358 )
									ret := -0.370000
					if( source > 26037.9 )
						if( verde_azul <= 126.773 )
							if( source <= 61682.6 )
								if( tprice <= 60991.1 )
									ret := -0.007559
								if( tprice > 60991.1 )
									ret := 0.257209
							if( source > 61682.6 )
								if( media_azul <= 35.7896 )
									ret := -0.248560
								if( media_azul > 35.7896 )
									ret := -0.044114
						if( verde_azul > 126.773 )
							if( source <= 70598.9 )
								if( nvimin <= 0.742217 )
									ret := 0.006197
								if( nvimin > 0.742217 )
									ret := 0.117938
							if( source > 70598.9 )
								if( source <= 71277.6 )
									ret := -0.306452
								if( source > 71277.6 )
									ret := -0.780488 // sell
			if( source > 71738.9 )
				if( nvim <= 0.844596 )
					if( pvim <= 0.068977 )
						if( source <= 73115.5 )
							if( nvim <= 0.832563 )
								if( pvi <= 0.064761 )
									ret := 0.000000
								if( pvi > 0.064761 )
									ret := 0.400000
							if( nvim > 0.832563 )
								if( pvi <= 0.067028 )
									ret := 1.000000 // buy
								if( pvi > 0.067028 )
									ret := 0.666667
						if( source > 73115.5 )
							ret := -0.352941
					if( pvim > 0.068977 )
						if( BollOsc <= -10.644 )
							ret := 0.076923
						if( BollOsc > -10.644 )
							if( nvi_ema <= 0.803558 )
								ret := -0.357143
							if( nvi_ema > 0.803558 )
								if( pvimax <= 0.08825 )
									ret := -0.600000
								if( pvimax > 0.08825 )
									ret := -0.900000 // sell
				if( nvim > 0.844596 )
					if( nvimin <= 1.02353 )
						if( nvi <= 1.02329 )
							ret := -1.000000 // sell
						if( nvi > 1.02329 )
							ret := -0.750000 // sell
					if( nvimin > 1.02353 )
						ret := -0.272727
		if( marron_mean > 124.819 )
			if( nvimin <= 1.16499 )
				if( verde_azul <= 169.799 )
					if( nvim <= 0.766906 )
						if( tprice <= 38495.1 )
							if( pvi_ema <= -0.487563 )
								if( verde_media <= 67.7631 )
									ret := -0.357143
								if( verde_media > 67.7631 )
									ret := 0.736842 // buy
							if( pvi_ema > -0.487563 )
								if( pvimin <= -0.311206 )
									ret := 0.682135
								if( pvimin > -0.311206 )
									ret := 0.239264
						if( tprice > 38495.1 )
							if( stoc <= 89.2366 )
								if( verde_mean <= 178.673 )
									ret := -0.300000
								if( verde_mean > 178.673 )
									ret := 0.542857
							if( stoc > 89.2366 )
								if( media_azul <= 84.8841 )
									ret := -0.428571
								if( media_azul > 84.8841 )
									ret := -0.933333 // sell
					if( nvim > 0.766906 )
						if( pvimin <= -0.011818 )
							if( xrsi <= 85.5892 )
								ret := 1.000000 // buy
							if( xrsi > 85.5892 )
								ret := 0.818182 // buy
						if( pvimin > -0.011818 )
							ret := 0.555556
				if( verde_azul > 169.799 )
					if( pvimax <= -0.15387 )
						if( source <= 20233.2 )
							if( pvim <= -0.481143 )
								if( azul_mean <= 1.80292 )
									ret := -0.666667
								if( azul_mean > 1.80292 )
									ret := 0.333333
							if( pvim > -0.481143 )
								if( nvi_ema <= -0.12175 )
									ret := 0.090909
								if( nvi_ema > -0.12175 )
									ret := 0.925926 // buy
						if( source > 20233.2 )
							if( nvimax <= 0.323897 )
								if( xrsi <= 81.7191 )
									ret := 0.323529
								if( xrsi > 81.7191 )
									ret := -0.666667
							if( nvimax > 0.323897 )
								if( pvim <= -0.192063 )
									ret := 0.430556
								if( pvim > -0.192063 )
									ret := -0.730769 // sell
					if( pvimax > -0.15387 )
						if( xrsi <= 91.8736 )
							if( media <= 109.673 )
								if( pvimin <= -0.150829 )
									ret := 0.823529 // buy
								if( pvimin > -0.150829 )
									ret := 0.000000
							if( media > 109.673 )
								if( azul <= -40.5877 )
									ret := 0.818182 // buy
								if( azul > -40.5877 )
									ret := 1.000000 // buy
						if( xrsi > 91.8736 )
							ret := -0.818182 // sell
			if( nvimin > 1.16499 )
				if( azul <= 13.0909 )
					if( BollOsc <= 52.664 )
						if( nvim <= 1.3263 )
							ret := 0.812500 // buy
						if( nvim > 1.3263 )
							if( source <= 63289.9 )
								if( xmf <= 85.3081 )
									ret := 0.000000
								if( xmf > 85.3081 )
									ret := 0.866667 // buy
							if( source > 63289.9 )
								ret := -0.071429
					if( BollOsc > 52.664 )
						if( azul_mean <= 10.2884 )
							if( tprice <= 61248 )
								ret := -0.375000
							if( tprice > 61248 )
								ret := -1.000000 // sell
						if( azul_mean > 10.2884 )
							ret := 0.214286
				if( azul > 13.0909 )
					if( stoc <= 81.9404 )
						ret := 0.333333
					if( stoc > 81.9404 )
						if( nvimax <= 1.748 )
							if( media <= 101.974 )
								if( tprice <= 63598.5 )
									ret := 0.083333
								if( tprice > 63598.5 )
									ret := -0.666667
							if( media > 101.974 )
								if( nvimin <= 1.60887 )
									ret := -0.661017
								if( nvimin > 1.60887 )
									ret := -0.971429 // sell
						if( nvimax > 1.748 )
							ret := 0.000000
	
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
float op_operation = decision_tree_0_BTCUSDT_15Min_1ec79cda(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


