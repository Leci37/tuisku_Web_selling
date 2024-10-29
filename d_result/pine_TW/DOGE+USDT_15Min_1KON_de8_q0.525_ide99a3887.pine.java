//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: DOGEUSDT_15Min_1KON_e99a3887 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_15Min_1KON_e99a3887", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_15Min_e99a3887(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( verde <= 153.272 )
		if( verde <= -46.44 )
			if( media <= 23.8735 )
				if( azul_mean <= -36.1243 )
					if( BollOsc <= -58.7241 )
						if( media_azul <= 112.197 )
							if( pvi <= -1.25509 )
								if( marron_mean <= -2.01674 )
									ret := -0.953488 // sell
								if( marron_mean > -2.01674 )
									ret := -0.500000
							if( pvi > -1.25509 )
								if( azul_mean <= -41.089 )
									ret := 0.250000
								if( azul_mean > -41.089 )
									ret := -0.500000
						if( media_azul > 112.197 )
							ret := 0.200000
					if( BollOsc > -58.7241 )
						if( BollOsc <= -47.2793 )
							if( xmf <= 11.3208 )
								if( nvi <= 0.179669 )
									ret := 0.750000 // buy
								if( nvi > 0.179669 )
									ret := 1.000000 // buy
							if( xmf > 11.3208 )
								if( tprice <= 0.083631 )
									ret := 0.000000
								if( tprice > 0.083631 )
									ret := 0.846154 // buy
						if( BollOsc > -47.2793 )
							if( xmf <= 14.035 )
								if( nvi_ema <= 1.37729 )
									ret := -0.750000 // sell
								if( nvi_ema > 1.37729 )
									ret := -1.000000 // sell
							if( xmf > 14.035 )
								ret := 0.250000
				if( azul_mean > -36.1243 )
					if( xmf <= 29.8309 )
						if( media_azul <= 15.6755 )
							if( verde_mean <= -30.9793 )
								if( pvi_ema <= -1.97938 )
									ret := 0.384342
								if( pvi_ema > -1.97938 )
									ret := -0.025424
							if( verde_mean > -30.9793 )
								if( azul <= 34.18 )
									ret := 0.738636 // buy
								if( azul > 34.18 )
									ret := 0.000000
						if( media_azul > 15.6755 )
							if( source <= 0.152708 )
								if( BollOsc <= -55.9347 )
									ret := 0.661400
								if( BollOsc > -55.9347 )
									ret := 0.314050
							if( source > 0.152708 )
								if( BollOsc <= -72.5005 )
									ret := 0.750000 // buy
								if( BollOsc > -72.5005 )
									ret := -0.647059
					if( xmf > 29.8309 )
						if( BollOsc <= -62.9933 )
							if( BollOsc <= -66.4033 )
								if( verde_mean <= -45.0186 )
									ret := 0.500000
								if( verde_mean > -45.0186 )
									ret := -0.200000
							if( BollOsc > -66.4033 )
								ret := 1.000000 // buy
						if( BollOsc > -62.9933 )
							if( nvi_ema <= 0.100305 )
								ret := 0.500000
							if( nvi_ema > 0.100305 )
								if( media <= 19.2708 )
									ret := -0.210526
								if( media > 19.2708 )
									ret := -0.826087 // sell
			if( media > 23.8735 )
				if( verde_azul <= -8.89006 )
					if( media_azul <= 98.2506 )
						if( stoc <= 16.339 )
							if( oscp <= -48.6577 )
								if( verde_mean <= 6.42163 )
									ret := 0.533333
								if( verde_mean > 6.42163 )
									ret := -0.666667
							if( oscp > -48.6577 )
								if( xmf <= 18.0621 )
									ret := -0.500000
								if( xmf > 18.0621 )
									ret := 0.392857
						if( stoc > 16.339 )
							if( xrsi <= 17.721 )
								if( nvimax <= 5.33361 )
									ret := 0.650794
								if( nvimax > 5.33361 )
									ret := -0.800000 // sell
							if( xrsi > 17.721 )
								if( pvi_ema <= -1.40526 )
									ret := 0.100413
								if( pvi_ema > -1.40526 )
									ret := -0.232932
					if( media_azul > 98.2506 )
						if( verde_mean <= -12.3288 )
							if( xrsi <= 13.7497 )
								ret := -0.750000 // sell
							if( xrsi > 13.7497 )
								ret := -1.000000 // sell
						if( verde_mean > -12.3288 )
							ret := -0.200000
				if( verde_azul > -8.89006 )
					if( pvi <= -1.04279 )
						if( nvi <= 5.25987 )
							if( azul_mean <= -9.04981 )
								if( media <= 26.6797 )
									ret := 0.750000 // buy
								if( media > 26.6797 )
									ret := 1.000000 // buy
							if( azul_mean > -9.04981 )
								ret := 0.500000
						if( nvi > 5.25987 )
							ret := 0.500000
					if( pvi > -1.04279 )
						ret := 0.000000
		if( verde > -46.44 )
			if( xrsi <= 30.965 )
				if( xmf <= 20.8489 )
					if( source <= 0.087044 )
						if( marron_mean <= 21.5345 )
							if( media_azul <= 20.8567 )
								if( pvimin <= -1.70871 )
									ret := 0.219178
								if( pvimin > -1.70871 )
									ret := -0.119048
							if( media_azul > 20.8567 )
								if( source <= 0.056001 )
									ret := 0.652174
								if( source > 0.056001 )
									ret := -0.266571
						if( marron_mean > 21.5345 )
							if( marron <= -4.20442 )
								if( BollOsc <= -78.4485 )
									ret := 0.250000
								if( BollOsc > -78.4485 )
									ret := 0.913043 // buy
							if( marron > -4.20442 )
								if( pvimax <= -1.04346 )
									ret := 0.125000
								if( pvimax > -1.04346 )
									ret := 0.750000 // buy
					if( source > 0.087044 )
						if( xrsi <= 16.0644 )
							if( nvi <= 5.1945 )
								if( verde <= -44.737 )
									ret := -0.600000
								if( verde > -44.737 )
									ret := 0.837838 // buy
							if( nvi > 5.1945 )
								if( xmf <= 12.1262 )
									ret := 0.428571
								if( xmf > 12.1262 )
									ret := -0.642857
						if( xrsi > 16.0644 )
							if( xrsi <= 25.9228 )
								if( media <= 24.2865 )
									ret := -0.016701
								if( media > 24.2865 )
									ret := -0.452632
							if( xrsi > 25.9228 )
								if( oscp <= -7.91828 )
									ret := 0.284091
								if( oscp > -7.91828 )
									ret := -0.254902
				if( xmf > 20.8489 )
					if( xmf <= 32.1587 )
						if( media <= 11.8866 )
							if( marron_mean <= 7.6427 )
								if( oscp <= -36.6152 )
									ret := 0.527778
								if( oscp > -36.6152 )
									ret := 0.061224
							if( marron_mean > 7.6427 )
								if( verde_media <= -11.9476 )
									ret := 0.808219 // buy
								if( verde_media > -11.9476 )
									ret := 0.400000
						if( media > 11.8866 )
							if( azul <= -33.2861 )
								if( verde_mean <= 22.0572 )
									ret := 0.264286
								if( verde_mean > 22.0572 )
									ret := 0.880000 // buy
							if( azul > -33.2861 )
								if( azul <= 43.7666 )
									ret := 0.057013
								if( azul > 43.7666 )
									ret := 0.351064
					if( xmf > 32.1587 )
						if( oscp <= -48.2529 )
							if( verde_media <= -86.3204 )
								if( marron <= 7.96749 )
									ret := 0.833333 // buy
								if( marron > 7.96749 )
									ret := -0.250000
							if( verde_media > -86.3204 )
								if( marron_mean <= -0.380278 )
									ret := 0.428571
								if( marron_mean > -0.380278 )
									ret := -0.636364
						if( oscp > -48.2529 )
							if( pvi_ema <= -0.503197 )
								if( azul_mean <= 81.6291 )
									ret := 0.325026
								if( azul_mean > 81.6291 )
									ret := -1.000000 // sell
							if( pvi_ema > -0.503197 )
								if( verde_azul <= 16.6263 )
									ret := 0.000000
								if( verde_azul > 16.6263 )
									ret := -0.806452 // sell
			if( xrsi > 30.965 )
				if( pvimax <= -0.470045 )
					if( tprice <= 0.126207 )
						if( marron_mean <= 101.429 )
							if( azul_mean <= -5.59162 )
								if( verde_media <= -7.40109 )
									ret := 0.046718
								if( verde_media > -7.40109 )
									ret := -0.018909
							if( azul_mean > -5.59162 )
								if( verde <= 102.485 )
									ret := 0.069868
								if( verde > 102.485 )
									ret := 0.005329
						if( marron_mean > 101.429 )
							if( source <= 0.085922 )
								if( pvim <= -0.614737 )
									ret := 0.171138
								if( pvim > -0.614737 )
									ret := -0.213836
							if( source > 0.085922 )
								if( pvimax <= -1.56952 )
									ret := 0.092416
								if( pvimax > -1.56952 )
									ret := -0.209703
					if( tprice > 0.126207 )
						if( BollOsc <= -52.8543 )
							if( verde <= 3.12176 )
								if( verde_media <= -42.9991 )
									ret := 0.441860
								if( verde_media > -42.9991 )
									ret := -0.437500
							if( verde > 3.12176 )
								if( azul <= -14.9706 )
									ret := 0.352941
								if( azul > -14.9706 )
									ret := -0.692308
						if( BollOsc > -52.8543 )
							if( xmf <= 32.7442 )
								if( verde_media <= -3.79754 )
									ret := -0.074182
								if( verde_media > -3.79754 )
									ret := -0.371212
							if( xmf > 32.7442 )
								if( verde_media <= 35.419 )
									ret := 0.043349
								if( verde_media > 35.419 )
									ret := -0.093492
				if( pvimax > -0.470045 )
					if( media <= 82.4433 )
						if( verde_media <= -15.2473 )
							if( verde_media <= -26.0867 )
								if( pvi <= -0.539548 )
									ret := -1.000000 // sell
								if( pvi > -0.539548 )
									ret := 0.025362
							if( verde_media > -26.0867 )
								if( nvim <= 0.127618 )
									ret := 0.189781
								if( nvim > 0.127618 )
									ret := 0.882353 // buy
						if( verde_media > -15.2473 )
							if( stoc <= 53.6892 )
								if( verde_mean <= 3.48123 )
									ret := 0.283019
								if( verde_mean > 3.48123 )
									ret := -0.320683
							if( stoc > 53.6892 )
								if( oscp <= 13.8824 )
									ret := 0.073069
								if( oscp > 13.8824 )
									ret := -0.295082
					if( media > 82.4433 )
						if( media_azul <= 86.4053 )
							if( nvimax <= -0.030924 )
								if( marron <= 90.9617 )
									ret := 0.750000 // buy
								if( marron > 90.9617 )
									ret := 0.000000
							if( nvimax > -0.030924 )
								if( marron <= 126.725 )
									ret := -0.720339 // sell
								if( marron > 126.725 )
									ret := 0.750000 // buy
						if( media_azul > 86.4053 )
							if( verde_azul <= 140.831 )
								if( source <= 0.114216 )
									ret := -0.088235
								if( source > 0.114216 )
									ret := -0.657895
							if( verde_azul > 140.831 )
								if( verde_mean <= 118.748 )
									ret := 1.000000 // buy
								if( verde_mean > 118.748 )
									ret := 0.055556
	if( verde > 153.272 )
		if( xrsi <= 82.8559 )
			if( media <= 100.591 )
				if( oscp <= 29.8761 )
					if( verde_media <= 78.0336 )
						if( pvimax <= -4.03976 )
							if( azul_mean <= 2.71248 )
								ret := 1.000000 // buy
							if( azul_mean > 2.71248 )
								if( verde_mean <= 122.638 )
									ret := -0.900000 // sell
								if( verde_mean > 122.638 )
									ret := -0.200000
						if( pvimax > -4.03976 )
							if( BollOsc <= 62.4572 )
								ret := -1.000000 // sell
							if( BollOsc > 62.4572 )
								if( source <= 0.066655 )
									ret := 0.000000
								if( source > 0.066655 )
									ret := 0.750000 // buy
					if( verde_media > 78.0336 )
						if( azul_mean <= -2.40824 )
							ret := 0.250000
						if( azul_mean > -2.40824 )
							if( tprice <= 0.072387 )
								ret := -0.400000
							if( tprice > 0.072387 )
								ret := -1.000000 // sell
				if( oscp > 29.8761 )
					if( media_azul <= 34.8684 )
						if( media <= 82.8587 )
							if( source <= 0.069571 )
								if( azul <= 44.0292 )
									ret := 0.750000 // buy
								if( azul > 44.0292 )
									ret := -0.400000
							if( source > 0.069571 )
								if( pvi <= -3.86662 )
									ret := -0.391304
								if( pvi > -3.86662 )
									ret := -0.866667 // sell
						if( media > 82.8587 )
							if( verde_azul <= 85.4439 )
								if( media <= 93.3983 )
									ret := 0.750000 // buy
								if( media > 93.3983 )
									ret := 1.000000 // buy
							if( verde_azul > 85.4439 )
								if( BollOsc <= 66.2965 )
									ret := -0.333333
								if( BollOsc > 66.2965 )
									ret := 0.500000
					if( media_azul > 34.8684 )
						if( azul_mean <= -61.0697 )
							if( verde_mean <= 134.289 )
								ret := -0.750000 // sell
							if( verde_mean > 134.289 )
								if( stoc <= 49.9691 )
									ret := -0.285714
								if( stoc > 49.9691 )
									ret := 0.804348 // buy
						if( azul_mean > -61.0697 )
							if( azul_mean <= 2.22718 )
								if( stoc <= 82.5202 )
									ret := -0.035526
								if( stoc > 82.5202 )
									ret := -0.328947
							if( azul_mean > 2.22718 )
								if( source <= 0.07091 )
									ret := -0.275641
								if( source > 0.07091 )
									ret := 0.143845
			if( media > 100.591 )
				if( source <= 0.064175 )
					if( azul_mean <= 24.4884 )
						if( pvi <= -1.3973 )
							if( media <= 102.394 )
								ret := 0.285714
							if( media > 102.394 )
								ret := 0.000000
						if( pvi > -1.3973 )
							if( marron_mean <= 120.397 )
								if( marron_mean <= 116.63 )
									ret := 1.000000 // buy
								if( marron_mean > 116.63 )
									ret := 0.625000
							if( marron_mean > 120.397 )
								ret := 0.000000
					if( azul_mean > 24.4884 )
						if( nvimin <= 0.773141 )
							ret := -1.000000 // sell
						if( nvimin > 0.773141 )
							ret := -0.500000
				if( source > 0.064175 )
					if( stoc <= 73.4658 )
						if( oscp <= 66.7562 )
							if( azul <= -64.9356 )
								ret := -0.750000 // sell
							if( azul > -64.9356 )
								if( marron_mean <= 129.85 )
									ret := 0.675676
								if( marron_mean > 129.85 )
									ret := -0.600000
						if( oscp > 66.7562 )
							if( verde_media <= 89.5819 )
								ret := -1.000000 // sell
							if( verde_media > 89.5819 )
								ret := -0.200000
					if( stoc > 73.4658 )
						if( marron <= 134.655 )
							if( media <= 115.658 )
								if( oscp <= 55.2635 )
									ret := -0.264881
								if( oscp > 55.2635 )
									ret := -0.583942
							if( media > 115.658 )
								ret := 1.000000 // buy
						if( marron > 134.655 )
							if( tprice <= 0.174635 )
								ret := 0.166667
							if( tprice > 0.174635 )
								ret := 1.000000 // buy
		if( xrsi > 82.8559 )
			if( marron_mean <= 77.8983 )
				if( marron <= 147.39 )
					ret := 0.750000 // buy
				if( marron > 147.39 )
					ret := 1.000000 // buy
			if( marron_mean > 77.8983 )
				if( stoc <= 70.8354 )
					if( media <= 90.4007 )
						if( stoc <= 68.8765 )
							if( azul <= -9.50951 )
								ret := -0.250000
							if( azul > -9.50951 )
								ret := -1.000000 // sell
						if( stoc > 68.8765 )
							ret := 0.428571
					if( media > 90.4007 )
						if( media_azul <= 113.534 )
							if( azul_mean <= -5.36173 )
								ret := 0.250000
							if( azul_mean > -5.36173 )
								if( nvi_ema <= 1.05284 )
									ret := 0.750000 // buy
								if( nvi_ema > 1.05284 )
									ret := 1.000000 // buy
						if( media_azul > 113.534 )
							if( xrsi <= 85.5046 )
								ret := 0.250000
							if( xrsi > 85.5046 )
								ret := -0.600000
				if( stoc > 70.8354 )
					if( nvim <= 1.70826 )
						if( nvi_ema <= 0.63767 )
							if( marron <= 139.046 )
								if( stoc <= 88.5097 )
									ret := -0.968750 // sell
								if( stoc > 88.5097 )
									ret := -0.705882 // sell
							if( marron > 139.046 )
								if( BollOsc <= 76.4307 )
									ret := 0.333333
								if( BollOsc > 76.4307 )
									ret := -0.692308
						if( nvi_ema > 0.63767 )
							if( nvimax <= 1.10991 )
								if( source <= 0.079702 )
									ret := -0.306122
								if( source > 0.079702 )
									ret := 0.343284
							if( nvimax > 1.10991 )
								if( pvimax <= -1.15133 )
									ret := -0.185567
								if( pvimax > -1.15133 )
									ret := -0.947368 // sell
					if( nvim > 1.70826 )
						if( nvi <= 3.5606 )
							if( media_azul <= 129.146 )
								if( stoc <= 74.0997 )
									ret := 0.000000
								if( stoc > 74.0997 )
									ret := -0.764444 // sell
							if( media_azul > 129.146 )
								if( azul_mean <= -11.3716 )
									ret := -0.400000
								if( azul_mean > -11.3716 )
									ret := 0.500000
						if( nvi > 3.5606 )
							if( BollOsc <= 50.9103 )
								if( pvimin <= -3.99596 )
									ret := -0.444444
								if( pvimin > -3.99596 )
									ret := -1.000000 // sell
							if( BollOsc > 50.9103 )
								if( xmf <= 79.3724 )
									ret := 0.240000
								if( xmf > 79.3724 )
									ret := -0.336634
	
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
float op_operation = decision_tree_0_DOGEUSDT_15Min_e99a3887(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


