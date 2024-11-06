//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: SOLUSDT_30Min_1KON_e0d91e91 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_30Min_1KON_e0d91e91", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_30Min_e0d91e91(nvimin, azul, nvim, marron_mean, marron, nvimax, pvi, pvi_ema, oscp, verde, source, stoc, verde_mean, xrsi, media, xmf, tprice, pvimin, media_azul, verde_media, BollOsc, pvimax, nvi_ema, azul_mean, pvim, nvi, verde_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( source <= 140.09 )
		if( xrsi <= 51.4049 )
			if( BollOsc <= -38.648 )
				if( pvim <= 2.11622 )
					if( pvimin <= 0.727576 )
						if( xmf <= 38.0176 )
							if( pvi_ema <= 0.742063 )
								if( tprice <= 14.1017 )
									ret := 0.274041
								if( tprice > 14.1017 )
									ret := 0.084211
							if( pvi_ema > 0.742063 )
								if( pvimin <= 0.710187 )
									ret := 0.872727 // buy
								if( pvimin > 0.710187 )
									ret := 0.461538
						if( xmf > 38.0176 )
							if( azul <= -6.55933 )
								if( pvi_ema <= 0.420157 )
									ret := -0.022831
								if( pvi_ema > 0.420157 )
									ret := 0.640000
							if( azul > -6.55933 )
								if( marron_mean <= 56.409 )
									ret := -0.174419
								if( marron_mean > 56.409 )
									ret := 0.437500
					if( pvimin > 0.727576 )
						if( xrsi <= 17.8913 )
							if( media_azul <= -11.6306 )
								if( xmf <= 30.0385 )
									ret := 0.068966
								if( xmf > 30.0385 )
									ret := -0.833333 // sell
							if( media_azul > -11.6306 )
								if( media <= 2.88587 )
									ret := 0.628571
								if( media > 2.88587 )
									ret := 0.255556
						if( xrsi > 17.8913 )
							if( source <= 67.2959 )
								if( xmf <= 17.6241 )
									ret := -0.195691
								if( xmf > 17.6241 )
									ret := 0.044538
							if( source > 67.2959 )
								if( xmf <= 16.1214 )
									ret := 0.301887
								if( xmf > 16.1214 )
									ret := -0.228243
				if( pvim > 2.11622 )
					if( media <= 23.685 )
						if( media_azul <= -32.8247 )
							if( marron <= -5.40645 )
								ret := 0.600000
							if( marron > -5.40645 )
								if( verde_media <= -60.9579 )
									ret := -1.000000 // sell
								if( verde_media > -60.9579 )
									ret := -0.214286
						if( media_azul > -32.8247 )
							if( BollOsc <= -50.6036 )
								if( source <= 134.814 )
									ret := 0.618474
								if( source > 134.814 )
									ret := 0.206897
							if( BollOsc > -50.6036 )
								if( xrsi <= 18.2158 )
									ret := -0.142857
								if( xrsi > 18.2158 )
									ret := 0.426573
					if( media > 23.685 )
						if( tprice <= 56.5291 )
							if( verde_media <= -27.8591 )
								if( verde_mean <= 17.4221 )
									ret := 0.794872 // buy
								if( verde_mean > 17.4221 )
									ret := -0.111111
							if( verde_media > -27.8591 )
								if( pvim <= 2.43513 )
									ret := 0.000000
								if( pvim > 2.43513 )
									ret := -1.000000 // sell
						if( tprice > 56.5291 )
							if( pvim <= 2.93694 )
								if( verde_mean <= -68.6435 )
									ret := -0.923077 // sell
								if( verde_mean > -68.6435 )
									ret := 0.053787
							if( pvim > 2.93694 )
								if( source <= 132.688 )
									ret := 0.418301
								if( source > 132.688 )
									ret := -0.010638
			if( BollOsc > -38.648 )
				if( xmf <= 32.655 )
					if( verde_azul <= 61.2508 )
						if( source <= 101.772 )
							if( tprice <= 17.125 )
								if( media <= 16.2837 )
									ret := -0.058559
								if( media > 16.2837 )
									ret := 0.201561
							if( tprice > 17.125 )
								if( verde_media <= -19.0089 )
									ret := 0.084596
								if( verde_media > -19.0089 )
									ret := -0.091260
						if( source > 101.772 )
							if( nvi <= 4.1229 )
								if( xmf <= 31.8995 )
									ret := 0.435976
								if( xmf > 31.8995 )
									ret := -0.175000
							if( nvi > 4.1229 )
								if( source <= 136.62 )
									ret := -0.047945
								if( source > 136.62 )
									ret := 0.260274
					if( verde_azul > 61.2508 )
						if( pvimin <= 0.63641 )
							if( xmf <= 30.2697 )
								if( media_azul <= 100.952 )
									ret := -0.200000
								if( media_azul > 100.952 )
									ret := 0.800000 // buy
							if( xmf > 30.2697 )
								ret := 1.000000 // buy
						if( pvimin > 0.63641 )
							if( stoc <= 28.018 )
								if( verde_mean <= 41.0498 )
									ret := 0.180328
								if( verde_mean > 41.0498 )
									ret := -0.812500 // sell
							if( stoc > 28.018 )
								if( azul_mean <= -12.9853 )
									ret := -0.533835
								if( azul_mean > -12.9853 )
									ret := -0.045455
				if( xmf > 32.655 )
					if( stoc <= 45.0435 )
						if( tprice <= 33.1335 )
							if( source <= 21.7304 )
								if( pvimin <= -0.62574 )
									ret := 0.038671
								if( pvimin > -0.62574 )
									ret := -0.088351
							if( source > 21.7304 )
								if( media <= 40.9956 )
									ret := 0.152130
								if( media > 40.9956 )
									ret := -0.013751
						if( tprice > 33.1335 )
							if( nvim <= 2.84825 )
								if( pvimin <= 0.830732 )
									ret := 0.812500 // buy
								if( pvimin > 0.830732 )
									ret := 0.134328
							if( nvim > 2.84825 )
								if( pvimin <= 0.387269 )
									ret := -0.450000
								if( pvimin > 0.387269 )
									ret := -0.073514
					if( stoc > 45.0435 )
						if( BollOsc <= -17.7599 )
							if( nvimin <= 3.2362 )
								if( source <= 136.668 )
									ret := -0.382199
								if( source > 136.668 )
									ret := 1.000000 // buy
							if( nvimin > 3.2362 )
								if( verde_media <= -63.7392 )
									ret := 0.636364
								if( verde_media > -63.7392 )
									ret := -0.065891
						if( BollOsc > -17.7599 )
							if( marron_mean <= 78.1869 )
								if( verde_mean <= 22.1247 )
									ret := -0.203252
								if( verde_mean > 22.1247 )
									ret := 0.101612
							if( marron_mean > 78.1869 )
								if( nvimax <= 1.41181 )
									ret := -0.405229
								if( nvimax > 1.41181 )
									ret := 0.003436
		if( xrsi > 51.4049 )
			if( nvim <= 1.41887 )
				if( nvimax <= 1.4292 )
					if( verde_mean <= 80.7246 )
						if( nvimin <= 0.278 )
							if( verde_azul <= 48.8186 )
								ret := -0.285714
							if( verde_azul > 48.8186 )
								if( oscp <= 20.9332 )
									ret := 0.914286 // buy
								if( oscp > 20.9332 )
									ret := 0.000000
						if( nvimin > 0.278 )
							if( nvim <= 0.452462 )
								if( xmf <= 61.037 )
									ret := -1.000000 // sell
								if( xmf > 61.037 )
									ret := 0.000000
							if( nvim > 0.452462 )
								if( pvimin <= -1.06212 )
									ret := -0.016064
								if( pvimin > -1.06212 )
									ret := 0.217314
					if( verde_mean > 80.7246 )
						if( media_azul <= 25.2814 )
							if( stoc <= 85.4961 )
								if( media_azul <= -2.85857 )
									ret := -0.500000
								if( media_azul > -2.85857 )
									ret := -0.974359 // sell
							if( stoc > 85.4961 )
								if( media_azul <= 10.1798 )
									ret := -1.000000 // sell
								if( media_azul > 10.1798 )
									ret := 0.000000
						if( media_azul > 25.2814 )
							if( media_azul <= 122.203 )
								if( media_azul <= 68.6556 )
									ret := 0.090909
								if( media_azul > 68.6556 )
									ret := -0.133411
							if( media_azul > 122.203 )
								if( nvimax <= 1.409 )
									ret := 0.491667
								if( nvimax > 1.409 )
									ret := -0.769231 // sell
				if( nvimax > 1.4292 )
					if( tprice <= 3.22538 )
						if( verde_media <= 12.1308 )
							if( verde_media <= -22.4174 )
								ret := 0.500000
							if( verde_media > -22.4174 )
								if( nvimin <= 1.36777 )
									ret := -0.333333
								if( nvimin > 1.36777 )
									ret := -0.954545 // sell
						if( verde_media > 12.1308 )
							if( media <= 96.5976 )
								if( pvi_ema <= -1.30758 )
									ret := 0.130435
								if( pvi_ema > -1.30758 )
									ret := 0.840000 // buy
							if( media > 96.5976 )
								if( nvimax <= 1.45928 )
									ret := -1.000000 // sell
								if( nvimax > 1.45928 )
									ret := -0.750000 // sell
					if( tprice > 3.22538 )
						if( nvimin <= 1.38555 )
							if( nvimax <= 1.43283 )
								if( source <= 3.52146 )
									ret := -0.476190
								if( source > 3.52146 )
									ret := -0.952381 // sell
							if( nvimax > 1.43283 )
								if( verde_mean <= 63.6649 )
									ret := -0.500000
								if( verde_mean > 63.6649 )
									ret := -1.000000 // sell
						if( nvimin > 1.38555 )
							ret := 0.142857
			if( nvim > 1.41887 )
				if( pvi_ema <= 3.26841 )
					if( media <= 112.314 )
						if( stoc <= 89.3617 )
							if( xmf <= 69.8026 )
								if( azul <= 27.5467 )
									ret := 0.084278
								if( azul > 27.5467 )
									ret := 0.206138
							if( xmf > 69.8026 )
								if( nvimax <= 2.61503 )
									ret := 0.332961
								if( nvimax > 2.61503 )
									ret := 0.145441
						if( stoc > 89.3617 )
							if( BollOsc <= 41.8945 )
								if( pvimin <= 1.44212 )
									ret := -0.066148
								if( pvimin > 1.44212 )
									ret := 0.251012
							if( BollOsc > 41.8945 )
								if( source <= 25.275 )
									ret := 0.104418
								if( source > 25.275 )
									ret := -0.269903
					if( media > 112.314 )
						if( pvimin <= 3.03939 )
							if( marron_mean <= 116.58 )
								if( nvimin <= 1.73996 )
									ret := -0.750000 // sell
								if( nvimin > 1.73996 )
									ret := 0.333333
							if( marron_mean > 116.58 )
								if( azul <= -54.3126 )
									ret := 0.714286 // buy
								if( azul > -54.3126 )
									ret := -0.340594
						if( pvimin > 3.03939 )
							if( pvim <= 3.26846 )
								if( stoc <= 83.8504 )
									ret := 0.750000 // buy
								if( stoc > 83.8504 )
									ret := 1.000000 // buy
							if( pvim > 3.26846 )
								ret := -0.714286 // sell
				if( pvi_ema > 3.26841 )
					if( azul_mean <= 10.8567 )
						if( nvi <= 3.46865 )
							if( stoc <= 84.8805 )
								if( verde_media <= 42.9967 )
									ret := -0.291667
								if( verde_media > 42.9967 )
									ret := 0.750000 // buy
							if( stoc > 84.8805 )
								ret := -1.000000 // sell
						if( nvi > 3.46865 )
							if( pvi <= 3.30804 )
								if( marron_mean <= 87.5913 )
									ret := -0.900000 // sell
								if( marron_mean > 87.5913 )
									ret := -0.400000
							if( pvi > 3.30804 )
								if( xmf <= 79.7479 )
									ret := -1.000000 // sell
								if( xmf > 79.7479 )
									ret := -0.750000 // sell
					if( azul_mean > 10.8567 )
						if( xmf <= 63.2073 )
							if( source <= 112.67 )
								ret := 0.200000
							if( source > 112.67 )
								ret := 1.000000 // buy
						if( xmf > 63.2073 )
							ret := -0.600000
	if( source > 140.09 )
		if( verde_mean <= 126.616 )
			if( pvi <= 2.28342 )
				if( verde_media <= 26.6991 )
					if( source <= 141.278 )
						if( nvi <= 3.31934 )
							if( marron_mean <= 18.8888 )
								ret := -0.500000
							if( marron_mean > 18.8888 )
								ret := -1.000000 // sell
						if( nvi > 3.31934 )
							ret := 0.000000
					if( source > 141.278 )
						ret := -1.000000 // sell
				if( verde_media > 26.6991 )
					ret := 0.250000
			if( pvi > 2.28342 )
				if( nvi <= 3.01062 )
					if( marron <= -12.834 )
						ret := 0.800000 // buy
					if( marron > -12.834 )
						if( nvi <= 2.96303 )
							if( nvi <= 2.95552 )
								ret := -1.000000 // sell
							if( nvi > 2.95552 )
								ret := -0.500000
						if( nvi > 2.96303 )
							ret := -1.000000 // sell
				if( nvi > 3.01062 )
					if( nvi <= 3.05773 )
						if( source <= 179.953 )
							if( nvimin <= 3.03449 )
								if( azul_mean <= 0.312847 )
									ret := 1.000000 // buy
								if( azul_mean > 0.312847 )
									ret := 0.833333 // buy
							if( nvimin > 3.03449 )
								if( verde_mean <= 102.469 )
									ret := 0.552632
								if( verde_mean > 102.469 )
									ret := -0.250000
						if( source > 179.953 )
							if( nvi_ema <= 3.06783 )
								if( azul_mean <= -21.5714 )
									ret := -0.782609 // sell
								if( azul_mean > -21.5714 )
									ret := 0.142292
							if( nvi_ema > 3.06783 )
								if( verde_azul <= 63.8283 )
									ret := 1.000000 // buy
								if( verde_azul > 63.8283 )
									ret := -0.250000
					if( nvi > 3.05773 )
						if( marron_mean <= 95.7917 )
							if( xrsi <= 60.4372 )
								if( verde_azul <= -49.8083 )
									ret := -0.214123
								if( verde_azul > -49.8083 )
									ret := -0.016692
							if( xrsi > 60.4372 )
								if( nvimin <= 4.0805 )
									ret := 0.226872
								if( nvimin > 4.0805 )
									ret := -0.039829
						if( marron_mean > 95.7917 )
							if( nvi <= 4.00245 )
								if( azul_mean <= 41.1997 )
									ret := -0.293831
								if( azul_mean > 41.1997 )
									ret := 0.531250
							if( nvi > 4.00245 )
								if( verde <= 133.061 )
									ret := -0.001592
								if( verde > 133.061 )
									ret := -0.439024
		if( verde_mean > 126.616 )
			if( BollOsc <= 41.2049 )
				if( media <= 112.684 )
					if( source <= 155.146 )
						if( media <= 90.8765 )
							if( azul_mean <= -22.6211 )
								if( nvimin <= 4.14747 )
									ret := 0.956522 // buy
								if( nvimin > 4.14747 )
									ret := 0.222222
							if( azul_mean > -22.6211 )
								if( stoc <= 78.0858 )
									ret := 0.500000
								if( stoc > 78.0858 )
									ret := -0.052632
						if( media > 90.8765 )
							if( nvim <= 4.10318 )
								if( verde_media <= 14.6381 )
									ret := 0.300000
								if( verde_media > 14.6381 )
									ret := -0.558824
							if( nvim > 4.10318 )
								if( verde_mean <= 165.953 )
									ret := 0.043478
								if( verde_mean > 165.953 )
									ret := 0.642857
					if( source > 155.146 )
						if( azul_mean <= -21.8206 )
							if( oscp <= 42.1866 )
								if( stoc <= 82.3909 )
									ret := 0.076923
								if( stoc > 82.3909 )
									ret := -0.666667
							if( oscp > 42.1866 )
								if( marron <= 101.275 )
									ret := -0.250000
								if( marron > 101.275 )
									ret := 0.916667 // buy
						if( azul_mean > -21.8206 )
							if( media_azul <= 106.645 )
								if( pvi <= 3.33211 )
									ret := 0.401316
								if( pvi > 3.33211 )
									ret := -0.500000
							if( media_azul > 106.645 )
								if( nvi_ema <= 4.14938 )
									ret := 0.794118 // buy
								if( nvi_ema > 4.14938 )
									ret := 0.117647
				if( media > 112.684 )
					if( xmf <= 78.1241 )
						if( marron_mean <= 117.236 )
							ret := -1.000000 // sell
						if( marron_mean > 117.236 )
							if( marron <= 107.255 )
								ret := -0.750000 // sell
							if( marron > 107.255 )
								ret := 0.000000
					if( xmf > 78.1241 )
						if( pvi_ema <= 2.436 )
							ret := -0.250000
						if( pvi_ema > 2.436 )
							ret := 0.000000
			if( BollOsc > 41.2049 )
				if( pvi <= 2.65628 )
					if( source <= 152.559 )
						if( xrsi <= 76.424 )
							if( media_azul <= 76.287 )
								ret := 0.285714
							if( media_azul > 76.287 )
								if( azul_mean <= -18.3418 )
									ret := -0.956522 // sell
								if( azul_mean > -18.3418 )
									ret := -0.454545
						if( xrsi > 76.424 )
							if( verde_azul <= 152.461 )
								if( pvim <= 2.55643 )
									ret := -0.692308
								if( pvim > 2.55643 )
									ret := 0.142857
							if( verde_azul > 152.461 )
								if( marron <= 128.502 )
									ret := 0.882353 // buy
								if( marron > 128.502 )
									ret := -0.333333
					if( source > 152.559 )
						if( media_azul <= 31.2574 )
							if( verde_azul <= 14.7839 )
								ret := -1.000000 // sell
							if( verde_azul > 14.7839 )
								ret := 0.000000
						if( media_azul > 31.2574 )
							if( azul <= -8.86785 )
								ret := 0.000000
							if( azul > -8.86785 )
								if( verde_azul <= 115.435 )
									ret := 0.000000
								if( verde_azul > 115.435 )
									ret := 0.833333 // buy
				if( pvi > 2.65628 )
					if( marron_mean <= 105.752 )
						if( pvimax <= 3.19452 )
							if( pvi <= 3.12757 )
								if( xrsi <= 67.7848 )
									ret := -0.333333
								if( xrsi > 67.7848 )
									ret := 0.378049
							if( pvi > 3.12757 )
								if( azul <= 1.8026 )
									ret := 1.000000 // buy
								if( azul > 1.8026 )
									ret := 0.250000
						if( pvimax > 3.19452 )
							if( marron <= 118.597 )
								if( pvi_ema <= 3.26213 )
									ret := 0.250000
								if( pvi_ema > 3.26213 )
									ret := 0.000000
							if( marron > 118.597 )
								if( xmf <= 79.8703 )
									ret := 0.000000
								if( xmf > 79.8703 )
									ret := -0.777778 // sell
					if( marron_mean > 105.752 )
						if( source <= 191.396 )
							if( verde <= 132.901 )
								if( xmf <= 76.089 )
									ret := 0.520833
								if( xmf > 76.089 )
									ret := -0.083333
							if( verde > 132.901 )
								if( marron <= 108.349 )
									ret := -0.739130 // sell
								if( marron > 108.349 )
									ret := -0.066914
						if( source > 191.396 )
							if( azul_mean <= 3.28821 )
								if( azul <= -15.4315 )
									ret := -0.083333
								if( azul > -15.4315 )
									ret := -0.701493 // sell
							if( azul_mean > 3.28821 )
								if( azul <= 3.58615 )
									ret := 1.000000 // buy
								if( azul > 3.58615 )
									ret := -0.195122
	
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
float op_operation = decision_tree_0_SOLUSDT_30Min_e0d91e91(nvimin, azul, nvim, marron_mean, marron, nvimax, pvi, pvi_ema, oscp, verde, source, stoc, verde_mean, xrsi, media, xmf, tprice, pvimin, media_azul, verde_media, BollOsc, pvimax, nvi_ema, azul_mean, pvim, nvi, verde_azul)

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


