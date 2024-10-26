//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: ADSK_15Min_1KON_cff94932 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_15Min_1KON_cff94932", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_15Min_cff94932(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( nvi_ema <= 1.44028 )
		if( pvimin <= 0.446821 )
			if( pvi_ema <= 0.03093 )
				if( media_azul <= 116.576 )
					if( tprice <= 179.071 )
						if( marron_mean <= 26.6034 )
							if( stoc <= 19.1686 )
								if( verde_media <= -18.3731 )
									ret := 0.177215
								if( verde_media > -18.3731 )
									ret := -0.822222 // sell
							if( stoc > 19.1686 )
								if( nvimax <= 0.003899 )
									ret := 0.941176 // buy
								if( nvimax > 0.003899 )
									ret := 0.241379
						if( marron_mean > 26.6034 )
							if( nvimax <= 0.643142 )
								if( source <= 73.0329 )
									ret := 0.409091
								if( source > 73.0329 )
									ret := 0.760181 // buy
							if( nvimax > 0.643142 )
								if( nvimin <= 1.18201 )
									ret := -0.071429
								if( nvimin > 1.18201 )
									ret := 0.526316
					if( tprice > 179.071 )
						if( verde_media <= -31.9221 )
							if( source <= 184.432 )
								ret := -0.272727
							if( source > 184.432 )
								if( BollOsc <= -58.621 )
									ret := 0.333333
								if( BollOsc > -58.621 )
									ret := 1.000000 // buy
						if( verde_media > -31.9221 )
							if( azul <= -21.5912 )
								ret := 1.000000 // buy
							if( azul > -21.5912 )
								if( xmf <= 85.0875 )
									ret := -0.196262
								if( xmf > 85.0875 )
									ret := 0.739130 // buy
				if( media_azul > 116.576 )
					if( verde_azul <= 119.118 )
						ret := -1.000000 // sell
					if( verde_azul > 119.118 )
						ret := -0.055556
			if( pvi_ema > 0.03093 )
				if( BollOsc <= 43.691 )
					if( stoc <= 42.6565 )
						if( nvimax <= 0.002963 )
							if( pvim <= 0.198514 )
								if( verde_mean <= 19.07 )
									ret := 0.531746
								if( verde_mean > 19.07 )
									ret := 0.166144
							if( pvim > 0.198514 )
								if( verde_media <= -53.9129 )
									ret := -0.415094
								if( verde_media > -53.9129 )
									ret := 0.091743
						if( nvimax > 0.002963 )
							if( media_azul <= 97.5977 )
								if( verde_media <= -167.44 )
									ret := 0.696629
								if( verde_media > -167.44 )
									ret := 0.027846
							if( media_azul > 97.5977 )
								if( BollOsc <= -48.7003 )
									ret := 0.557065
								if( BollOsc > -48.7003 )
									ret := 0.020690
					if( stoc > 42.6565 )
						if( marron_mean <= 37.025 )
							if( xrsi <= 37.9617 )
								if( nvimax <= 0.826407 )
									ret := 0.290323
								if( nvimax > 0.826407 )
									ret := 1.000000 // buy
							if( xrsi > 37.9617 )
								if( oscp <= -10.667 )
									ret := 0.043243
								if( oscp > -10.667 )
									ret := -0.342574
						if( marron_mean > 37.025 )
							if( pvim <= 0.458011 )
								if( pvimax <= 0.475367 )
									ret := -0.014068
								if( pvimax > 0.475367 )
									ret := 0.612903
							if( pvim > 0.458011 )
								if( verde <= 41.3743 )
									ret := 0.333333
								if( verde > 41.3743 )
									ret := -0.462500
				if( BollOsc > 43.691 )
					if( media_azul <= 81.4957 )
						if( xmf <= 84.7823 )
							if( xmf <= 22.6707 )
								if( media <= 32.1426 )
									ret := -0.928571 // sell
								if( media > 32.1426 )
									ret := 0.579268
							if( xmf > 22.6707 )
								if( pvimin <= 0.366638 )
									ret := 0.138377
								if( pvimin > 0.366638 )
									ret := -0.103806
						if( xmf > 84.7823 )
							if( azul_mean <= 39.2679 )
								if( nvimax <= 0.499254 )
									ret := 0.264516
								if( nvimax > 0.499254 )
									ret := 0.633634
							if( azul_mean > 39.2679 )
								if( BollOsc <= 53.5472 )
									ret := -0.515152
								if( BollOsc > 53.5472 )
									ret := 0.253968
					if( media_azul > 81.4957 )
						if( media_azul <= 113.01 )
							if( xmf <= 44.5657 )
								if( verde_mean <= 98.9668 )
									ret := -0.380952
								if( verde_mean > 98.9668 )
									ret := -0.808219 // sell
							if( xmf > 44.5657 )
								if( nvim <= 1.38612 )
									ret := -0.075021
								if( nvim > 1.38612 )
									ret := 0.551724
						if( media_azul > 113.01 )
							if( nvi <= 0.396817 )
								if( verde_mean <= 158.899 )
									ret := -0.848485 // sell
								if( verde_mean > 158.899 )
									ret := 0.302326
							if( nvi > 0.396817 )
								if( tprice <= 155.524 )
									ret := 0.859375 // buy
								if( tprice > 155.524 )
									ret := 0.114286
		if( pvimin > 0.446821 )
			if( pvi <= 0.472745 )
				if( pvimax <= 0.509453 )
					if( media <= 5.85817 )
						ret := 0.545455
					if( media > 5.85817 )
						if( verde_media <= -68.7409 )
							if( media_azul <= 53.4006 )
								ret := -0.125000
							if( media_azul > 53.4006 )
								ret := 0.300000
						if( verde_media > -68.7409 )
							if( xmf <= 28.5619 )
								if( oscp <= -29.9342 )
									ret := -0.500000
								if( oscp > -29.9342 )
									ret := -0.940299 // sell
							if( xmf > 28.5619 )
								if( nvimax <= 0.725694 )
									ret := -0.439490
								if( nvimax > 0.725694 )
									ret := 0.173913
				if( pvimax > 0.509453 )
					if( nvi <= 0.900442 )
						ret := -0.846154 // sell
					if( nvi > 0.900442 )
						ret := -1.000000 // sell
			if( pvi > 0.472745 )
				if( media_azul <= 66.2884 )
					if( nvi_ema <= 0.908201 )
						if( nvi_ema <= 0.89621 )
							if( media <= 53.3533 )
								ret := 0.333333
							if( media > 53.3533 )
								if( marron_mean <= 68.5658 )
									ret := -0.263158
								if( marron_mean > 68.5658 )
									ret := -0.076923
						if( nvi_ema > 0.89621 )
							ret := 0.764706 // buy
					if( nvi_ema > 0.908201 )
						if( nvi_ema <= 0.918469 )
							ret := -1.000000 // sell
						if( nvi_ema > 0.918469 )
							ret := -0.600000
				if( media_azul > 66.2884 )
					if( pvim <= 0.496009 )
						if( oscp <= 14.5956 )
							ret := 0.454545
						if( oscp > 14.5956 )
							ret := 1.000000 // buy
					if( pvim > 0.496009 )
						if( azul_mean <= 8.14028 )
							if( marron <= 83.4136 )
								ret := 0.222222
							if( marron > 83.4136 )
								ret := -0.083333
						if( azul_mean > 8.14028 )
							ret := 0.666667
	if( nvi_ema > 1.44028 )
		if( pvim <= -0.208568 )
			if( azul_mean <= -21.3797 )
				if( nvi <= 1.68235 )
					if( media_azul <= 80.5222 )
						if( tprice <= 176.817 )
							if( nvi <= 1.57963 )
								ret := -0.200000
							if( nvi > 1.57963 )
								if( verde_azul <= 34.5386 )
									ret := 0.964286 // buy
								if( verde_azul > 34.5386 )
									ret := 0.300000
						if( tprice > 176.817 )
							if( marron_mean <= 8.16727 )
								if( nvi <= 1.67218 )
									ret := 0.246154
								if( nvi > 1.67218 )
									ret := -0.818182 // sell
							if( marron_mean > 8.16727 )
								if( nvi <= 1.63326 )
									ret := -0.817518 // sell
								if( nvi > 1.63326 )
									ret := -0.033333
					if( media_azul > 80.5222 )
						if( azul <= -52.4189 )
							if( nvimax <= 1.67272 )
								if( nvim <= 1.61838 )
									ret := -1.000000 // sell
								if( nvim > 1.61838 )
									ret := -0.666667
							if( nvimax > 1.67272 )
								if( marron <= 2.05318 )
									ret := -0.909091 // sell
								if( marron > 2.05318 )
									ret := -1.000000 // sell
						if( azul > -52.4189 )
							if( verde_media <= -19.2066 )
								ret := -0.062500
							if( verde_media > -19.2066 )
								if( nvimin <= 1.63715 )
									ret := -0.677419
								if( nvimin > 1.63715 )
									ret := -0.950000 // sell
				if( nvi > 1.68235 )
					if( nvi_ema <= 2.30743 )
						if( BollOsc <= -40.7474 )
							if( xrsi <= 26.5898 )
								if( verde_azul <= 5.30394 )
									ret := 0.444444
								if( verde_azul > 5.30394 )
									ret := -0.200000
							if( xrsi > 26.5898 )
								if( pvi_ema <= -0.384102 )
									ret := 1.000000 // buy
								if( pvi_ema > -0.384102 )
									ret := 0.541667
						if( BollOsc > -40.7474 )
							if( pvim <= -0.231785 )
								if( azul_mean <= -37.661 )
									ret := 0.389610
								if( azul_mean > -37.661 )
									ret := -0.218241
							if( pvim > -0.231785 )
								if( nvi_ema <= 1.79955 )
									ret := 0.696429
								if( nvi_ema > 1.79955 )
									ret := 0.130435
					if( nvi_ema > 2.30743 )
						ret := -1.000000 // sell
			if( azul_mean > -21.3797 )
				if( nvimin <= 1.59529 )
					if( marron_mean <= 26.9708 )
						if( nvi <= 1.57404 )
							ret := 0.300000
						if( nvi > 1.57404 )
							if( pvimin <= -0.267072 )
								if( pvi_ema <= -0.266071 )
									ret := 0.842105 // buy
								if( pvi_ema > -0.266071 )
									ret := 0.571429
							if( pvimin > -0.267072 )
								if( media <= 23.6449 )
									ret := 1.000000 // buy
								if( media > 23.6449 )
									ret := 0.800000 // buy
					if( marron_mean > 26.9708 )
						if( pvimin <= -0.279309 )
							if( media_azul <= 79.7782 )
								if( marron <= 107.84 )
									ret := 0.629268
								if( marron > 107.84 )
									ret := -0.116279
							if( media_azul > 79.7782 )
								if( nvimin <= 1.577 )
									ret := -0.311111
								if( nvimin > 1.577 )
									ret := 0.457746
						if( pvimin > -0.279309 )
							if( nvim <= 1.59607 )
								if( azul <= 6.80102 )
									ret := 0.485714
								if( azul > 6.80102 )
									ret := -0.684211
							if( nvim > 1.59607 )
								if( verde_media <= -29.7757 )
									ret := 0.411765
								if( verde_media > -29.7757 )
									ret := -0.705882 // sell
				if( nvimin > 1.59529 )
					if( stoc <= 8.50396 )
						if( media_azul <= 25.682 )
							if( azul <= 5.11916 )
								if( nvim <= 2.0593 )
									ret := -0.840659 // sell
								if( nvim > 2.0593 )
									ret := -0.055556
							if( azul > 5.11916 )
								if( media <= 20.3718 )
									ret := 1.000000 // buy
								if( media > 20.3718 )
									ret := -0.428571
						if( media_azul > 25.682 )
							if( nvim <= 1.70682 )
								if( verde <= -33.194 )
									ret := -0.500000
								if( verde > -33.194 )
									ret := 0.427184
							if( nvim > 1.70682 )
								if( media <= 14.8443 )
									ret := 0.916667 // buy
								if( media > 14.8443 )
									ret := -0.297143
					if( stoc > 8.50396 )
						if( xmf <= 73.3745 )
							if( tprice <= 260.021 )
								if( verde_mean <= 159.223 )
									ret := 0.142371
								if( verde_mean > 159.223 )
									ret := -0.528302
							if( tprice > 260.021 )
								if( nvi <= 2.29697 )
									ret := 0.011852
								if( nvi > 2.29697 )
									ret := -0.704545 // sell
						if( xmf > 73.3745 )
							if( verde_media <= 51.0261 )
								if( nvi <= 1.63552 )
									ret := -0.702703 // sell
								if( nvi > 1.63552 )
									ret := -0.003940
							if( verde_media > 51.0261 )
								if( xrsi <= 58.1973 )
									ret := -0.780220 // sell
								if( xrsi > 58.1973 )
									ret := -0.259953
		if( pvim > -0.208568 )
			if( source <= 199.584 )
				if( tprice <= 184.811 )
					if( media_azul <= 65.2991 )
						if( pvi <= -0.203316 )
							ret := 0.000000
						if( pvi > -0.203316 )
							if( verde_media <= -28.5483 )
								if( nvi <= 1.54723 )
									ret := 1.000000 // buy
								if( nvi > 1.54723 )
									ret := 0.800000 // buy
							if( verde_media > -28.5483 )
								if( verde_mean <= 14.775 )
									ret := 0.058824
								if( verde_mean > 14.775 )
									ret := 0.725490 // buy
					if( media_azul > 65.2991 )
						if( pvim <= -0.193402 )
							ret := -0.857143 // sell
						if( pvim > -0.193402 )
							if( nvimin <= 1.45721 )
								ret := 0.818182 // buy
							if( nvimin > 1.45721 )
								ret := -0.214286
				if( tprice > 184.811 )
					if( pvimin <= -0.230027 )
						if( azul_mean <= -9.27456 )
							ret := -0.444444
						if( azul_mean > -9.27456 )
							if( pvimin <= -0.241662 )
								ret := -0.222222
							if( pvimin > -0.241662 )
								if( marron <= 99.019 )
									ret := 0.880597 // buy
								if( marron > 99.019 )
									ret := 0.411765
					if( pvimin > -0.230027 )
						if( verde_azul <= 19.6203 )
							if( pvimax <= -0.025755 )
								if( media <= 57.5499 )
									ret := 0.323171
								if( media > 57.5499 )
									ret := -0.162791
							if( pvimax > -0.025755 )
								if( BollOsc <= -35.2697 )
									ret := 0.252525
								if( BollOsc > -35.2697 )
									ret := -0.685393
						if( verde_azul > 19.6203 )
							if( oscp <= -5.5429 )
								if( verde_media <= -52.8387 )
									ret := 0.787234 // buy
								if( verde_media > -52.8387 )
									ret := -0.305936
							if( oscp > -5.5429 )
								if( media <= 63.3738 )
									ret := 0.117761
								if( media > 63.3738 )
									ret := -0.091398
			if( source > 199.584 )
				if( stoc <= 6.95251 )
					if( tprice <= 257.763 )
						if( verde_media <= -22.2604 )
							if( verde_azul <= -14.6837 )
								if( verde_media <= -31.4783 )
									ret := -0.166667
								if( verde_media > -31.4783 )
									ret := 0.833333 // buy
							if( verde_azul > -14.6837 )
								if( verde_mean <= 6.62611 )
									ret := 0.576471
								if( verde_mean > 6.62611 )
									ret := -0.028571
						if( verde_media > -22.2604 )
							if( pvimax <= 0.066746 )
								if( pvimin <= -0.044165 )
									ret := -0.309859
								if( pvimin > -0.044165 )
									ret := 0.142857
							if( pvimax > 0.066746 )
								ret := -1.000000 // sell
					if( tprice > 257.763 )
						if( xrsi <= 26.7312 )
							if( verde <= -46.7608 )
								if( nvi_ema <= 1.47864 )
									ret := 0.909091 // buy
								if( nvi_ema > 1.47864 )
									ret := 1.000000 // buy
							if( verde > -46.7608 )
								if( azul_mean <= -19.3933 )
									ret := 0.075000
								if( azul_mean > -19.3933 )
									ret := 0.640000
						if( xrsi > 26.7312 )
							if( pvi <= 0.288455 )
								if( xrsi <= 34.4878 )
									ret := 0.166667
								if( xrsi > 34.4878 )
									ret := -0.714286 // sell
							if( pvi > 0.288455 )
								ret := 0.800000 // buy
				if( stoc > 6.95251 )
					if( xrsi <= 40.6407 )
						if( BollOsc <= -49.2186 )
							if( nvimin <= 2.06924 )
								if( verde_azul <= -121.266 )
									ret := 0.777778 // buy
								if( verde_azul > -121.266 )
									ret := -0.042949
							if( nvimin > 2.06924 )
								ret := -1.000000 // sell
						if( BollOsc > -49.2186 )
							if( nvimin <= 1.52847 )
								if( stoc <= 15.1004 )
									ret := 0.267003
								if( stoc > 15.1004 )
									ret := -0.205645
							if( nvimin > 1.52847 )
								if( azul <= -0.953149 )
									ret := -0.203408
								if( azul > -0.953149 )
									ret := -0.479922
					if( xrsi > 40.6407 )
						if( BollOsc <= 66.636 )
							if( media <= 102.551 )
								if( azul <= -3.25941 )
									ret := 0.006377
								if( azul > -3.25941 )
									ret := -0.100921
							if( media > 102.551 )
								if( verde <= 158.552 )
									ret := 0.147139
								if( verde > 158.552 )
									ret := -0.303030
						if( BollOsc > 66.636 )
							if( stoc <= 91.6149 )
								if( azul_mean <= 56.0854 )
									ret := -0.264398
								if( azul_mean > 56.0854 )
									ret := -0.975610 // sell
							if( stoc > 91.6149 )
								if( xrsi <= 83.371 )
									ret := -1.000000 // sell
								if( xrsi > 83.371 )
									ret := -0.800000 // sell
	
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
float op_operation = decision_tree_0_ADSK_15Min_cff94932(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


