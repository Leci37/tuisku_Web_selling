//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: CRWD_1Min_1KON_0311d088 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_1Min_1KON_0311d088", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_1Min_0311d088(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( verde <= 128.722 )
		if( verde <= -14.213 )
			if( azul_mean <= 1.23551 )
				if( nvi_ema <= 0.169998 )
					if( pvimax <= -0.046374 )
						if( xrsi <= 26.1836 )
							if( verde_azul <= -41.8793 )
								if( nvim <= 0.069031 )
									ret := -0.200000
								if( nvim > 0.069031 )
									ret := 0.764706 // buy
							if( verde_azul > -41.8793 )
								if( source <= 314.66 )
									ret := -0.280000
								if( source > 314.66 )
									ret := 1.000000 // buy
						if( xrsi > 26.1836 )
							if( nvimax <= 0.064431 )
								if( xmf <= 21.7526 )
									ret := 0.888889 // buy
								if( xmf > 21.7526 )
									ret := -0.214286
							if( nvimax > 0.064431 )
								if( media_azul <= 79.2143 )
									ret := -0.552632
								if( media_azul > 79.2143 )
									ret := 0.333333
					if( pvimax > -0.046374 )
						if( azul_mean <= -52.175 )
							ret := -0.750000 // sell
						if( azul_mean > -52.175 )
							if( xmf <= 14.7486 )
								if( azul_mean <= -0.663289 )
									ret := 0.000000
								if( azul_mean > -0.663289 )
									ret := -0.500000
							if( xmf > 14.7486 )
								if( verde <= -26.6143 )
									ret := 0.653061
								if( verde > -26.6143 )
									ret := 0.205882
				if( nvi_ema > 0.169998 )
					if( oscp <= -13.5118 )
						if( media_azul <= 28.8221 )
							if( verde_mean <= -54.6972 )
								if( oscp <= -43.4981 )
									ret := 0.189189
								if( oscp > -43.4981 )
									ret := -0.657143
							if( verde_mean > -54.6972 )
								if( nvi_ema <= 0.220727 )
									ret := 0.886364 // buy
								if( nvi_ema > 0.220727 )
									ret := 0.422943
						if( media_azul > 28.8221 )
							if( pvi_ema <= -0.819054 )
								if( BollOsc <= -66.447 )
									ret := 0.502128
								if( BollOsc > -66.447 )
									ret := 0.225251
							if( pvi_ema > -0.819054 )
								if( media <= 67.5645 )
									ret := 0.132570
								if( media > 67.5645 )
									ret := -0.589744
					if( oscp > -13.5118 )
						if( xrsi <= 14.8451 )
							if( azul_mean <= -6.1074 )
								ret := -1.000000 // sell
							if( azul_mean > -6.1074 )
								ret := 0.000000
						if( xrsi > 14.8451 )
							if( azul_mean <= -3.67817 )
								if( nvimax <= 0.488 )
									ret := 0.354839
								if( nvimax > 0.488 )
									ret := -0.228916
							if( azul_mean > -3.67817 )
								if( marron_mean <= 13.4877 )
									ret := 0.833333 // buy
								if( marron_mean > 13.4877 )
									ret := 0.166667
			if( azul_mean > 1.23551 )
				if( azul_mean <= 8.29698 )
					if( stoc <= 21.179 )
						if( verde_mean <= -37.3662 )
							if( tprice <= 232.116 )
								if( oscp <= -51.2838 )
									ret := 1.000000 // buy
								if( oscp > -51.2838 )
									ret := 0.500000
							if( tprice > 232.116 )
								if( azul <= 16.7147 )
									ret := -0.631579
								if( azul > 16.7147 )
									ret := 0.444444
						if( verde_mean > -37.3662 )
							if( marron_mean <= 19.7498 )
								if( tprice <= 252.527 )
									ret := 0.557692
								if( tprice > 252.527 )
									ret := 0.037855
							if( marron_mean > 19.7498 )
								if( verde_media <= -47.1934 )
									ret := -0.359116
								if( verde_media > -47.1934 )
									ret := 0.714286 // buy
					if( stoc > 21.179 )
						if( BollOsc <= -83.7359 )
							if( pvi <= -0.409587 )
								if( tprice <= 259.101 )
									ret := -0.333333
								if( tprice > 259.101 )
									ret := -1.000000 // sell
							if( pvi > -0.409587 )
								ret := 0.250000
						if( BollOsc > -83.7359 )
							if( pvi_ema <= -1.00854 )
								ret := -0.857143 // sell
							if( pvi_ema > -1.00854 )
								if( BollOsc <= -70.3166 )
									ret := 0.700000 // buy
								if( BollOsc > -70.3166 )
									ret := 0.239766
				if( azul_mean > 8.29698 )
					if( marron_mean <= -3.81376 )
						if( xrsi <= 10.9957 )
							ret := 1.000000 // buy
						if( xrsi > 10.9957 )
							if( media_azul <= -40.4594 )
								if( nvi_ema <= 0.833287 )
									ret := -1.000000 // sell
								if( nvi_ema > 0.833287 )
									ret := -0.250000
							if( media_azul > -40.4594 )
								if( azul_mean <= 18.1099 )
									ret := -0.571429
								if( azul_mean > 18.1099 )
									ret := 0.375000
					if( marron_mean > -3.81376 )
						if( stoc <= 10.2909 )
							if( stoc <= 2.85479 )
								if( pvi <= -0.880562 )
									ret := -0.250000
								if( pvi > -0.880562 )
									ret := -0.923077 // sell
							if( stoc > 2.85479 )
								if( xmf <= 24.7036 )
									ret := 0.747826 // buy
								if( xmf > 24.7036 )
									ret := 0.271845
						if( stoc > 10.2909 )
							if( stoc <= 46.4067 )
								if( verde <= -25.6842 )
									ret := -0.014354
								if( verde > -25.6842 )
									ret := 0.241176
							if( stoc > 46.4067 )
								if( nvimax <= 0.875313 )
									ret := 0.625000
								if( nvimax > 0.875313 )
									ret := -0.375000
		if( verde > -14.213 )
			if( azul <= -39.698 )
				if( pvi <= -0.035372 )
					if( verde_mean <= -25.7924 )
						if( tprice <= 345.691 )
							if( marron <= 6.34107 )
								ret := -1.000000 // sell
							if( marron > 6.34107 )
								if( verde_azul <= 55.3007 )
									ret := 1.000000 // buy
								if( verde_azul > 55.3007 )
									ret := 0.000000
						if( tprice > 345.691 )
							ret := -1.000000 // sell
					if( verde_mean > -25.7924 )
						if( xmf <= 66.2431 )
							if( nvi_ema <= 0.848097 )
								if( marron <= 35.8857 )
									ret := 0.327979
								if( marron > 35.8857 )
									ret := 0.127148
							if( nvi_ema > 0.848097 )
								if( pvi_ema <= -0.85959 )
									ret := 0.051587
								if( pvi_ema > -0.85959 )
									ret := -0.625000
						if( xmf > 66.2431 )
							if( xmf <= 91.2368 )
								if( pvim <= -0.181215 )
									ret := 0.442804
								if( pvim > -0.181215 )
									ret := 0.811765 // buy
							if( xmf > 91.2368 )
								if( verde_mean <= 100.117 )
									ret := -0.777778 // sell
								if( verde_mean > 100.117 )
									ret := 0.000000
				if( pvi > -0.035372 )
					if( pvimin <= -0.034515 )
						if( xmf <= 27.041 )
							ret := -1.000000 // sell
						if( xmf > 27.041 )
							ret := -0.750000 // sell
					if( pvimin > -0.034515 )
						if( BollOsc <= 8.01379 )
							ret := 0.000000
						if( BollOsc > 8.01379 )
							ret := -1.000000 // sell
			if( azul > -39.698 )
				if( oscp <= -27.8012 )
					if( oscp <= -53.0129 )
						if( verde_mean <= 8.86257 )
							if( BollOsc <= 5.74534 )
								if( pvimax <= -0.201359 )
									ret := 0.000000
								if( pvimax > -0.201359 )
									ret := 0.875000 // buy
							if( BollOsc > 5.74534 )
								if( tprice <= 371.855 )
									ret := -0.900000 // sell
								if( tprice > 371.855 )
									ret := -0.250000
						if( verde_mean > 8.86257 )
							if( media <= 95.8925 )
								if( azul_mean <= 57.6095 )
									ret := 0.742857 // buy
								if( azul_mean > 57.6095 )
									ret := 0.277778
							if( media > 95.8925 )
								ret := -0.500000
					if( oscp > -53.0129 )
						if( BollOsc <= -7.72676 )
							if( azul_mean <= 25.2847 )
								if( xrsi <= 38.5962 )
									ret := 0.328358
								if( xrsi > 38.5962 )
									ret := 0.099656
							if( azul_mean > 25.2847 )
								if( marron <= 23.1073 )
									ret := -0.318182
								if( marron > 23.1073 )
									ret := 0.470803
						if( BollOsc > -7.72676 )
							if( media_azul <= 41.7361 )
								if( nvimin <= 0.760277 )
									ret := -0.027132
								if( nvimin > 0.760277 )
									ret := -0.379518
							if( media_azul > 41.7361 )
								if( marron <= 61.1862 )
									ret := -0.064516
								if( marron > 61.1862 )
									ret := 0.333333
				if( oscp > -27.8012 )
					if( tprice <= 258.589 )
						if( pvimax <= -0.94691 )
							if( pvim <= -0.988465 )
								if( pvimax <= -1.02623 )
									ret := 0.740000 // buy
								if( pvimax > -1.02623 )
									ret := -0.394737
							if( pvim > -0.988465 )
								if( media_azul <= 122.413 )
									ret := 0.535948
								if( media_azul > 122.413 )
									ret := -0.833333 // sell
						if( pvimax > -0.94691 )
							if( media <= 95.6936 )
								if( azul <= 30.9462 )
									ret := 0.108437
								if( azul > 30.9462 )
									ret := -0.108475
							if( media > 95.6936 )
								if( BollOsc <= 46.9261 )
									ret := -0.249141
								if( BollOsc > 46.9261 )
									ret := 0.583333
					if( tprice > 258.589 )
						if( nvim <= 0.47705 )
							if( media_azul <= -24.4694 )
								if( media <= 23.0737 )
									ret := -0.125000
								if( media > 23.0737 )
									ret := 0.660494
							if( media_azul > -24.4694 )
								if( verde_azul <= -7.53831 )
									ret := -0.190128
								if( verde_azul > -7.53831 )
									ret := 0.065724
						if( nvim > 0.47705 )
							if( marron_mean <= 7.36773 )
								if( pvim <= -0.857195 )
									ret := 0.157205
								if( pvim > -0.857195 )
									ret := -0.331683
							if( marron_mean > 7.36773 )
								if( media <= 13.5523 )
									ret := 0.385057
								if( media > 13.5523 )
									ret := 0.007217
	if( verde > 128.722 )
		if( nvi_ema <= 0.835892 )
			if( tprice <= 385.504 )
				if( azul <= 85.6144 )
					if( oscp <= 122.303 )
						if( xmf <= 73.0275 )
							if( media <= 95.2208 )
								if( nvi <= 0.32488 )
									ret := -0.104587
								if( nvi > 0.32488 )
									ret := 0.099660
							if( media > 95.2208 )
								if( azul <= 28.6117 )
									ret := -0.326446
								if( azul > 28.6117 )
									ret := 0.600000
						if( xmf > 73.0275 )
							if( tprice <= 287.062 )
								if( pvim <= -0.814115 )
									ret := -0.149941
								if( pvim > -0.814115 )
									ret := -0.558394
							if( tprice > 287.062 )
								if( verde_mean <= 147.926 )
									ret := 0.005882
								if( verde_mean > 147.926 )
									ret := -0.209476
					if( oscp > 122.303 )
						if( xrsi <= 88.3042 )
							if( nvimin <= 0.200602 )
								ret := 0.250000
							if( nvimin > 0.200602 )
								if( nvimax <= 0.527666 )
									ret := -0.942857 // sell
								if( nvimax > 0.527666 )
									ret := -0.590909
						if( xrsi > 88.3042 )
							ret := 0.750000 // buy
				if( azul > 85.6144 )
					if( BollOsc <= 98.8571 )
						if( BollOsc <= 64.9274 )
							if( verde_azul <= 38.3523 )
								if( xrsi <= 74.0436 )
									ret := -0.750000 // sell
								if( xrsi > 74.0436 )
									ret := -1.000000 // sell
							if( verde_azul > 38.3523 )
								if( source <= 320.737 )
									ret := -0.571429
								if( source > 320.737 )
									ret := 0.600000
						if( BollOsc > 64.9274 )
							ret := -1.000000 // sell
					if( BollOsc > 98.8571 )
						ret := 0.250000
			if( tprice > 385.504 )
				if( pvimax <= -0.246371 )
					if( verde_azul <= 197.101 )
						if( azul_mean <= -1.1527 )
							if( azul <= -19.9344 )
								if( marron <= 92.7226 )
									ret := -1.000000 // sell
								if( marron > 92.7226 )
									ret := 0.000000
							if( azul > -19.9344 )
								if( azul <= -5.7305 )
									ret := 0.400000
								if( azul > -5.7305 )
									ret := 0.000000
						if( azul_mean > -1.1527 )
							if( xrsi <= 70.6813 )
								if( nvim <= 0.585103 )
									ret := -0.383333
								if( nvim > 0.585103 )
									ret := 0.500000
							if( xrsi > 70.6813 )
								if( verde_azul <= 118.393 )
									ret := -0.300000
								if( verde_azul > 118.393 )
									ret := 0.043478
					if( verde_azul > 197.101 )
						if( pvi <= -0.257307 )
							if( source <= 387.637 )
								ret := -0.500000
							if( source > 387.637 )
								ret := 0.000000
						if( pvi > -0.257307 )
							if( pvimin <= -0.25667 )
								ret := -1.000000 // sell
							if( pvimin > -0.25667 )
								ret := -0.400000
				if( pvimax > -0.246371 )
					if( media <= 96.6414 )
						if( stoc <= 92.3297 )
							if( xrsi <= 72.0542 )
								if( xmf <= 73.8649 )
									ret := -0.931818 // sell
								if( xmf > 73.8649 )
									ret := -0.709091 // sell
							if( xrsi > 72.0542 )
								if( verde_media <= 47.2763 )
									ret := -0.900000 // sell
								if( verde_media > 47.2763 )
									ret := -0.166667
						if( stoc > 92.3297 )
							ret := 0.166667
					if( media > 96.6414 )
						if( marron <= 116.638 )
							if( verde <= 139.045 )
								ret := 0.666667
							if( verde > 139.045 )
								ret := 0.000000
						if( marron > 116.638 )
							if( pvimin <= -0.19162 )
								ret := -1.000000 // sell
							if( pvimin > -0.19162 )
								if( tprice <= 389.589 )
									ret := 0.000000
								if( tprice > 389.589 )
									ret := -0.500000
		if( nvi_ema > 0.835892 )
			if( xrsi <= 67.4347 )
				if( nvi_ema <= 0.85758 )
					if( BollOsc <= 42.9302 )
						if( verde_media <= 96.6326 )
							if( pvi <= -0.841027 )
								if( media <= 95.2311 )
									ret := 0.151515
								if( media > 95.2311 )
									ret := 0.857143 // buy
							if( pvi > -0.841027 )
								ret := -0.714286 // sell
						if( verde_media > 96.6326 )
							if( BollOsc <= 33.1495 )
								ret := -0.500000
							if( BollOsc > 33.1495 )
								ret := -1.000000 // sell
					if( BollOsc > 42.9302 )
						if( stoc <= 89.6178 )
							if( nvimax <= 0.853837 )
								if( verde_azul <= 152.398 )
									ret := 0.866667 // buy
								if( verde_azul > 152.398 )
									ret := 0.388889
							if( nvimax > 0.853837 )
								if( marron <= 107.034 )
									ret := 0.800000 // buy
								if( marron > 107.034 )
									ret := -0.300000
						if( stoc > 89.6178 )
							ret := -0.428571
				if( nvi_ema > 0.85758 )
					if( verde_media <= 147.807 )
						if( verde_mean <= 121.622 )
							if( tprice <= 263.587 )
								if( BollOsc <= 47.3614 )
									ret := -1.000000 // sell
								if( BollOsc > 47.3614 )
									ret := -0.500000
							if( tprice > 263.587 )
								if( media_azul <= 79.1637 )
									ret := -0.208333
								if( media_azul > 79.1637 )
									ret := 0.283019
						if( verde_mean > 121.622 )
							if( tprice <= 313.527 )
								if( stoc <= 95.1162 )
									ret := -0.549550
								if( stoc > 95.1162 )
									ret := 0.500000
							if( tprice > 313.527 )
								ret := 1.000000 // buy
					if( verde_media > 147.807 )
						if( pvim <= -0.910928 )
							ret := 1.000000 // buy
						if( pvim > -0.910928 )
							ret := 0.750000 // buy
			if( xrsi > 67.4347 )
				if( stoc <= 91.631 )
					if( xmf <= 67.4983 )
						if( verde_mean <= 160.38 )
							if( media_azul <= 125.946 )
								if( marron_mean <= 104.175 )
									ret := -0.009346
								if( marron_mean > 104.175 )
									ret := 0.666667
							if( media_azul > 125.946 )
								ret := 1.000000 // buy
						if( verde_mean > 160.38 )
							if( tprice <= 262.655 )
								ret := -0.285714
							if( tprice > 262.655 )
								if( pvim <= -0.962808 )
									ret := -0.500000
								if( pvim > -0.962808 )
									ret := -1.000000 // sell
					if( xmf > 67.4983 )
						if( azul_mean <= 45.8424 )
							if( tprice <= 284.457 )
								if( nvimin <= 0.837458 )
									ret := 0.680000
								if( nvimin > 0.837458 )
									ret := 0.166667
							if( tprice > 284.457 )
								if( nvim <= 1.06929 )
									ret := 0.779661 // buy
								if( nvim > 1.06929 )
									ret := 0.375000
						if( azul_mean > 45.8424 )
							if( nvimin <= 0.840409 )
								ret := 0.500000
							if( nvimin > 0.840409 )
								if( tprice <= 282.017 )
									ret := -1.000000 // sell
								if( tprice > 282.017 )
									ret := -0.750000 // sell
				if( stoc > 91.631 )
					if( BollOsc <= 41.2884 )
						if( verde_azul <= 129.08 )
							if( azul <= 6.75582 )
								ret := 0.500000
							if( azul > 6.75582 )
								if( verde <= 129.984 )
									ret := 0.500000
								if( verde > 129.984 )
									ret := -0.100000
						if( verde_azul > 129.08 )
							if( xmf <= 71.9461 )
								ret := 0.000000
							if( xmf > 71.9461 )
								if( xrsi <= 75.277 )
									ret := 1.000000 // buy
								if( xrsi > 75.277 )
									ret := 0.684211
					if( BollOsc > 41.2884 )
						if( pvimax <= -0.854961 )
							if( xmf <= 81.8868 )
								if( verde_media <= 42.4834 )
									ret := 0.551724
								if( verde_media > 42.4834 )
									ret := -0.160714
							if( xmf > 81.8868 )
								if( source <= 314.436 )
									ret := -0.220779
								if( source > 314.436 )
									ret := -0.928571 // sell
						if( pvimax > -0.854961 )
							if( oscp <= 18.1162 )
								if( azul_mean <= 15.8692 )
									ret := 0.142857
								if( azul_mean > 15.8692 )
									ret := -0.500000
							if( oscp > 18.1162 )
								if( pvi_ema <= -0.816369 )
									ret := -0.888889 // sell
								if( pvi_ema > -0.816369 )
									ret := 0.000000
	
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
float op_operation = decision_tree_0_CRWD_1Min_0311d088(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


