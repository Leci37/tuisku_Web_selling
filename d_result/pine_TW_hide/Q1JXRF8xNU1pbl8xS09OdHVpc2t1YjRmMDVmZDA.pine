//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: CRWD_15Min_1KON_b4f05fd0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_1KON_b4f05fd0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_b4f05fd0(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( stoc <= 49.3397 )
		if( marron_mean <= -22.4226 )
			if( pvim <= 0.438972 )
				if( nvimin <= 0.044995 )
					ret := -1.000000 // sell
				if( nvimin > 0.044995 )
					ret := -0.062500
			if( pvim > 0.438972 )
				if( pvi <= 0.621482 )
					if( verde_azul <= -9.36557 )
						ret := -1.000000 // sell
					if( verde_azul > -9.36557 )
						ret := -0.909091 // sell
				if( pvi > 0.621482 )
					ret := -0.750000 // sell
		if( marron_mean > -22.4226 )
			if( nvi <= 1.03953 )
				if( pvimax <= 0.12688 )
					if( marron_mean <= -0.017558 )
						if( azul_mean <= -4.30242 )
							if( xrsi <= 16.5485 )
								ret := 0.000000
							if( xrsi > 16.5485 )
								if( tprice <= 122.093 )
									ret := 0.901316 // buy
								if( tprice > 122.093 )
									ret := 0.000000
						if( azul_mean > -4.30242 )
							if( pvimin <= -0.081631 )
								ret := -0.315789
							if( pvimin > -0.081631 )
								if( azul <= -3.05172 )
									ret := 0.909091 // buy
								if( azul > -3.05172 )
									ret := 0.200000
					if( marron_mean > -0.017558 )
						if( nvimax <= 0.415945 )
							if( nvimax <= 0.409041 )
								if( verde_azul <= -43.2163 )
									ret := -0.312821
								if( verde_azul > -43.2163 )
									ret := 0.165138
							if( nvimax > 0.409041 )
								if( oscp <= -22.155 )
									ret := 0.631579
								if( oscp > -22.155 )
									ret := -0.460000
						if( nvimax > 0.415945 )
							if( nvi <= 0.47212 )
								if( nvi_ema <= 0.476686 )
									ret := 0.708108 // buy
								if( nvi_ema > 0.476686 )
									ret := -0.400000
							if( nvi > 0.47212 )
								if( pvimax <= -0.088893 )
									ret := 0.449309
								if( pvimax > -0.088893 )
									ret := 0.177698
				if( pvimax > 0.12688 )
					if( source <= 135.784 )
						if( pvimax <= 0.622378 )
							if( xrsi <= 30.1441 )
								if( source <= 92.9902 )
									ret := 0.247263
								if( source > 92.9902 )
									ret := 0.003571
							if( xrsi > 30.1441 )
								if( nvi <= -0.303661 )
									ret := -0.228013
								if( nvi > -0.303661 )
									ret := -0.004834
						if( pvimax > 0.622378 )
							if( media_azul <= 24.1296 )
								if( pvimin <= 0.552013 )
									ret := 0.400000
								if( pvimin > 0.552013 )
									ret := -0.791667 // sell
							if( media_azul > 24.1296 )
								if( verde_azul <= 1.41209 )
									ret := 0.702703 // buy
								if( verde_azul > 1.41209 )
									ret := -0.325243
					if( source > 135.784 )
						if( verde_media <= -30.6796 )
							if( verde_media <= -116.962 )
								if( pvi <= 0.441337 )
									ret := -0.931034 // sell
								if( pvi > 0.441337 )
									ret := 0.142857
							if( verde_media > -116.962 )
								if( nvimin <= 0.996638 )
									ret := 0.503704
								if( nvimin > 0.996638 )
									ret := 0.157676
						if( verde_media > -30.6796 )
							if( azul <= -49.6913 )
								if( pvi_ema <= 0.684948 )
									ret := -0.255814
								if( pvi_ema > 0.684948 )
									ret := -0.704545 // sell
							if( azul > -49.6913 )
								if( media_azul <= 35.0603 )
									ret := -0.086188
								if( media_azul > 35.0603 )
									ret := 0.156207
			if( nvi > 1.03953 )
				if( azul_mean <= -72.4456 )
					if( pvi_ema <= 0.390142 )
						if( verde_media <= -57.1951 )
							ret := 0.636364
						if( verde_media > -57.1951 )
							if( media_azul <= 195.885 )
								if( nvimin <= 1.23417 )
									ret := -0.275000
								if( nvimin > 1.23417 )
									ret := -0.695652
							if( media_azul > 195.885 )
								ret := 0.909091 // buy
					if( pvi_ema > 0.390142 )
						if( pvi_ema <= 0.445296 )
							if( oscp <= -29.0096 )
								ret := -0.545455
							if( oscp > -29.0096 )
								if( azul_mean <= -93.4978 )
									ret := -1.000000 // sell
								if( azul_mean > -93.4978 )
									ret := -0.888889 // sell
						if( pvi_ema > 0.445296 )
							if( marron <= -6.28818 )
								if( nvimin <= 1.54198 )
									ret := -0.090909
								if( nvimin > 1.54198 )
									ret := -0.975000 // sell
							if( marron > -6.28818 )
								if( nvim <= 1.07973 )
									ret := -1.000000 // sell
								if( nvim > 1.07973 )
									ret := -0.178571
				if( azul_mean > -72.4456 )
					if( BollOsc <= -48.2984 )
						if( pvi_ema <= 0.950846 )
							if( pvi <= 0.100467 )
								if( marron_mean <= 2.9867 )
									ret := 0.862745 // buy
								if( marron_mean > 2.9867 )
									ret := 0.291262
							if( pvi > 0.100467 )
								if( xmf <= 0.16368 )
									ret := -0.883721 // sell
								if( xmf > 0.16368 )
									ret := 0.037736
						if( pvi_ema > 0.950846 )
							if( media_azul <= 74.5207 )
								if( tprice <= 280.249 )
									ret := 0.094340
								if( tprice > 280.249 )
									ret := 0.535484
							if( media_azul > 74.5207 )
								if( stoc <= 10.5872 )
									ret := -0.692308
								if( stoc > 10.5872 )
									ret := 0.042553
					if( BollOsc > -48.2984 )
						if( pvi_ema <= 0.343604 )
							if( xrsi <= 33.1489 )
								if( marron <= 3.81429 )
									ret := 0.049107
								if( marron > 3.81429 )
									ret := -0.269231
							if( xrsi > 33.1489 )
								if( azul_mean <= -8.67942 )
									ret := 0.101562
								if( azul_mean > -8.67942 )
									ret := -0.092517
						if( pvi_ema > 0.343604 )
							if( source <= 318.878 )
								if( source <= 180.016 )
									ret := -0.046587
								if( source > 180.016 )
									ret := 0.065981
							if( source > 318.878 )
								if( media_azul <= 8.24065 )
									ret := -0.468966
								if( media_azul > 8.24065 )
									ret := -0.088435
	if( stoc > 49.3397 )
		if( nvi_ema <= 0.429769 )
			if( nvimin <= -0.367806 )
				if( xmf <= 75.5148 )
					if( nvi_ema <= -0.347677 )
						if( tprice <= 51.8324 )
							if( pvim <= 0.186169 )
								ret := 0.944444 // buy
							if( pvim > 0.186169 )
								ret := 0.666667
						if( tprice > 51.8324 )
							if( azul <= 14.6592 )
								if( marron <= 95.0819 )
									ret := 0.933333 // buy
								if( marron > 95.0819 )
									ret := 0.200000
							if( azul > 14.6592 )
								ret := -0.125000
					if( nvi_ema > -0.347677 )
						if( nvim <= -0.312815 )
							if( media <= 102.062 )
								ret := -0.333333
							if( media > 102.062 )
								if( tprice <= 53.7576 )
									ret := -0.625000
								if( tprice > 53.7576 )
									ret := -1.000000 // sell
						if( nvim > -0.312815 )
							ret := 0.153846
				if( xmf > 75.5148 )
					if( verde_media <= 20.4035 )
						if( pvim <= 0.3566 )
							if( nvimax <= -0.341116 )
								ret := 0.714286 // buy
							if( nvimax > -0.341116 )
								if( verde_media <= 8.70647 )
									ret := 1.000000 // buy
								if( verde_media > 8.70647 )
									ret := 0.916667 // buy
						if( pvim > 0.3566 )
							ret := 0.529412
					if( verde_media > 20.4035 )
						if( tprice <= 56.2702 )
							if( media <= 94.6737 )
								if( nvim <= -0.348899 )
									ret := 0.818182 // buy
								if( nvim > -0.348899 )
									ret := 1.000000 // buy
							if( media > 94.6737 )
								if( pvim <= 0.245185 )
									ret := -0.041667
								if( pvim > 0.245185 )
									ret := 0.823529 // buy
						if( tprice > 56.2702 )
							ret := -0.277778
			if( nvimin > -0.367806 )
				if( nvimin <= -0.093294 )
					if( media_azul <= 74.4286 )
						if( pvi <= 0.11095 )
							if( verde <= 101.534 )
								if( source <= 56.1522 )
									ret := 0.236641
								if( source > 56.1522 )
									ret := 0.926829 // buy
							if( verde > 101.534 )
								if( oscp <= 17.8379 )
									ret := -0.627119
								if( oscp > 17.8379 )
									ret := -0.103448
						if( pvi > 0.11095 )
							if( xmf <= 60.0359 )
								if( azul_mean <= 13.5377 )
									ret := -0.250769
								if( azul_mean > 13.5377 )
									ret := -0.616279
							if( xmf > 60.0359 )
								if( xmf <= 63.7199 )
									ret := 0.320896
								if( xmf > 63.7199 )
									ret := -0.190131
					if( media_azul > 74.4286 )
						if( BollOsc <= 48.7897 )
							if( pvimin <= 0.274863 )
								if( pvim <= 0.298546 )
									ret := -0.019630
								if( pvim > 0.298546 )
									ret := 0.721311 // buy
							if( pvimin > 0.274863 )
								if( nvimin <= -0.147694 )
									ret := -0.015068
								if( nvimin > -0.147694 )
									ret := -0.434783
						if( BollOsc > 48.7897 )
							if( xmf <= 86.6869 )
								if( tprice <= 50.649 )
									ret := 0.291667
								if( tprice > 50.649 )
									ret := 0.725000 // buy
							if( xmf > 86.6869 )
								if( BollOsc <= 52.2032 )
									ret := 0.550000
								if( BollOsc > 52.2032 )
									ret := -0.423077
				if( nvimin > -0.093294 )
					if( pvi <= -0.438771 )
						if( pvi_ema <= -0.424057 )
							if( nvi <= 0.415364 )
								if( azul_mean <= 12.2725 )
									ret := 0.666667
								if( azul_mean > 12.2725 )
									ret := 1.000000 // buy
							if( nvi > 0.415364 )
								ret := -0.300000
						if( pvi_ema > -0.424057 )
							ret := -0.500000
					if( pvi > -0.438771 )
						if( BollOsc <= 75.4825 )
							if( nvimin <= 0.11092 )
								if( verde_media <= 54.9592 )
									ret := -0.322566
								if( verde_media > 54.9592 )
									ret := 0.157895
							if( nvimin > 0.11092 )
								if( nvi_ema <= 0.157147 )
									ret := 0.365854
								if( nvi_ema > 0.157147 )
									ret := -0.098802
						if( BollOsc > 75.4825 )
							if( nvimin <= 0.021702 )
								if( pvimin <= 0.123275 )
									ret := -0.700000 // sell
								if( pvimin > 0.123275 )
									ret := -1.000000 // sell
							if( nvimin > 0.021702 )
								ret := -1.000000 // sell
		if( nvi_ema > 0.429769 )
			if( verde_media <= 21.347 )
				if( tprice <= 304.135 )
					if( pvi <= 0.348545 )
						if( verde_azul <= 154.91 )
							if( azul <= -3.63316 )
								if( verde <= 97.5725 )
									ret := 0.160056
								if( verde > 97.5725 )
									ret := 0.427110
							if( azul > -3.63316 )
								if( nvimax <= 1.43393 )
									ret := 0.091338
								if( nvimax > 1.43393 )
									ret := -0.108924
						if( verde_azul > 154.91 )
							if( nvi_ema <= 0.779008 )
								ret := 0.200000
							if( nvi_ema > 0.779008 )
								if( verde_mean <= 130.403 )
									ret := -0.777778 // sell
								if( verde_mean > 130.403 )
									ret := -1.000000 // sell
					if( pvi > 0.348545 )
						if( oscp <= 8.45019 )
							if( pvimax <= 0.827262 )
								if( BollOsc <= 16.3773 )
									ret := -0.006339
								if( BollOsc > 16.3773 )
									ret := -0.116181
							if( pvimax > 0.827262 )
								if( verde_mean <= 82.8859 )
									ret := 0.026646
								if( verde_mean > 82.8859 )
									ret := 0.226876
						if( oscp > 8.45019 )
							if( verde_media <= 13.5649 )
								if( source <= 174.127 )
									ret := 0.019504
								if( source > 174.127 )
									ret := 0.280318
							if( verde_media > 13.5649 )
								if( marron <= 71.0688 )
									ret := 0.518519
								if( marron > 71.0688 )
									ret := -0.082002
				if( tprice > 304.135 )
					if( xrsi <= 69.5576 )
						if( tprice <= 322.291 )
							if( xmf <= 25.6002 )
								if( marron_mean <= 72.3333 )
									ret := 0.312500
								if( marron_mean > 72.3333 )
									ret := -0.943662 // sell
							if( xmf > 25.6002 )
								if( pvimax <= 0.974465 )
									ret := -0.476190
								if( pvimax > 0.974465 )
									ret := -0.196721
						if( tprice > 322.291 )
							if( xmf <= 51.4749 )
								if( tprice <= 330.087 )
									ret := 0.142857
								if( tprice > 330.087 )
									ret := -0.422969
							if( xmf > 51.4749 )
								if( pvi <= 0.890902 )
									ret := -1.000000 // sell
								if( pvi > 0.890902 )
									ret := 0.058962
					if( xrsi > 69.5576 )
						if( marron <= 97.4753 )
							if( nvi <= 1.3527 )
								ret := 0.454545
							if( nvi > 1.3527 )
								if( pvim <= 1.03229 )
									ret := 0.000000
								if( pvim > 1.03229 )
									ret := -0.800000 // sell
						if( marron > 97.4753 )
							if( tprice <= 366.205 )
								if( xrsi <= 79.6138 )
									ret := 0.472868
								if( xrsi > 79.6138 )
									ret := -0.333333
							if( tprice > 366.205 )
								if( tprice <= 374.918 )
									ret := -0.470588
								if( tprice > 374.918 )
									ret := 0.166667
			if( verde_media > 21.347 )
				if( BollOsc <= 56.446 )
					if( verde_azul <= 68.5048 )
						if( azul <= 63.7719 )
							if( pvi_ema <= 0.784784 )
								if( verde_media <= 50.3769 )
									ret := -0.326007
								if( verde_media > 50.3769 )
									ret := -0.802632 // sell
							if( pvi_ema > 0.784784 )
								if( nvi_ema <= 1.07289 )
									ret := -0.642857
								if( nvi_ema > 1.07289 )
									ret := 0.166667
						if( azul > 63.7719 )
							if( nvi <= 1.34424 )
								if( nvimin <= 1.11408 )
									ret := -0.063492
								if( nvimin > 1.11408 )
									ret := 0.922078 // buy
							if( nvi > 1.34424 )
								if( pvi <= 0.940841 )
									ret := -0.512195
								if( pvi > 0.940841 )
									ret := 0.500000
					if( verde_azul > 68.5048 )
						if( media <= 95.0646 )
							if( verde_media <= 85.8643 )
								if( pvim <= 0.158737 )
									ret := 0.106408
								if( pvim > 0.158737 )
									ret := -0.017199
							if( verde_media > 85.8643 )
								if( verde_media <= 123.662 )
									ret := 0.446301
								if( verde_media > 123.662 )
									ret := -0.218750
						if( media > 95.0646 )
							if( source <= 139.349 )
								if( azul <= -30.9308 )
									ret := -0.782609 // sell
								if( azul > -30.9308 )
									ret := 0.102967
							if( source > 139.349 )
								if( stoc <= 95.5789 )
									ret := -0.244661
								if( stoc > 95.5789 )
									ret := 0.101010
				if( BollOsc > 56.446 )
					if( pvim <= 0.595167 )
						if( media_azul <= -95.1089 )
							ret := 0.727273 // buy
						if( media_azul > -95.1089 )
							if( azul <= 65.9684 )
								if( nvimax <= 1.49996 )
									ret := -0.158006
								if( nvimax > 1.49996 )
									ret := -0.420455
							if( azul > 65.9684 )
								if( pvi <= 0.522427 )
									ret := -0.467742
								if( pvi > 0.522427 )
									ret := -0.975000 // sell
					if( pvim > 0.595167 )
						if( nvimin <= 0.958373 )
							if( marron <= 128.775 )
								if( verde_media <= 65.7287 )
									ret := 0.846154 // buy
								if( verde_media > 65.7287 )
									ret := 0.444444
							if( marron > 128.775 )
								ret := 0.266667
						if( nvimin > 0.958373 )
							if( verde_media <= 129.547 )
								if( nvimax <= 1.04283 )
									ret := -0.330396
								if( nvimax > 1.04283 )
									ret := -0.056860
							if( verde_media > 129.547 )
								if( pvimax <= 0.984842 )
									ret := 0.053333
								if( pvimax > 0.984842 )
									ret := 0.794872 // buy
	
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
float op_operation = decision_tree_0_CRWD_15Min_b4f05fd0(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


