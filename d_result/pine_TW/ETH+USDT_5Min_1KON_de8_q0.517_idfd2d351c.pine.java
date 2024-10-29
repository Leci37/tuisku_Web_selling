//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: ETHUSDT_5Min_1KON_fd2d351c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_5Min_1KON_fd2d351c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_5Min_fd2d351c(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( stoc <= 52.8745 )
		if( xrsi <= 26.7828 )
			if( BollOsc <= -87.5015 )
				if( pvim <= -0.013793 )
					if( verde <= -48.6921 )
						if( source <= 2927.24 )
							if( media <= 37.1421 )
								if( source <= 1630.65 )
									ret := 0.125000
								if( source > 1630.65 )
									ret := 0.903448 // buy
							if( media > 37.1421 )
								if( oscp <= -84.3492 )
									ret := 0.000000
								if( oscp > -84.3492 )
									ret := 0.760000 // buy
						if( source > 2927.24 )
							if( pvi <= -0.742704 )
								if( xrsi <= 14.0313 )
									ret := -1.000000 // sell
								if( xrsi > 14.0313 )
									ret := 0.095238
							if( pvi > -0.742704 )
								if( tprice <= 3439.65 )
									ret := 0.400000
								if( tprice > 3439.65 )
									ret := 0.812500 // buy
					if( verde > -48.6921 )
						if( media <= 36.7464 )
							ret := -0.266667
						if( media > 36.7464 )
							ret := 0.500000
				if( pvim > -0.013793 )
					ret := -0.615385
			if( BollOsc > -87.5015 )
				if( verde_mean <= -46.4919 )
					if( nvi <= 0.415268 )
						if( verde <= -45.8497 )
							if( verde_azul <= -46.9849 )
								if( media_azul <= 9.42344 )
									ret := 0.535714
								if( media_azul > 9.42344 )
									ret := 0.079137
							if( verde_azul > -46.9849 )
								if( nvi <= 0.084891 )
									ret := 0.636364
								if( nvi > 0.084891 )
									ret := 0.948052 // buy
						if( verde > -45.8497 )
							if( nvi_ema <= 0.244354 )
								if( verde_azul <= -55.9269 )
									ret := 0.615385
								if( verde_azul > -55.9269 )
									ret := -0.315789
							if( nvi_ema > 0.244354 )
								ret := -0.666667
					if( nvi > 0.415268 )
						if( source <= 3772.82 )
							if( pvimax <= -2.0232 )
								if( xrsi <= 25.6041 )
									ret := 0.569231
								if( xrsi > 25.6041 )
									ret := -0.289474
							if( pvimax > -2.0232 )
								if( pvim <= -0.964993 )
									ret := -0.340129
								if( pvim > -0.964993 )
									ret := 0.012039
						if( source > 3772.82 )
							if( media_azul <= -27.7689 )
								ret := -0.666667
							if( media_azul > -27.7689 )
								if( pvimax <= -0.294221 )
									ret := 0.666667
								if( pvimax > -0.294221 )
									ret := 0.953488 // buy
				if( verde_mean > -46.4919 )
					if( pvimin <= -0.1689 )
						if( nvim <= 2.69202 )
							if( pvimax <= -1.89664 )
								if( pvimax <= -1.93547 )
									ret := 0.306428
								if( pvimax > -1.93547 )
									ret := 0.661017
							if( pvimax > -1.89664 )
								if( verde <= -81.3983 )
									ret := 0.600806
								if( verde > -81.3983 )
									ret := 0.137314
						if( nvim > 2.69202 )
							if( nvi <= 2.70857 )
								if( xrsi <= 25.4921 )
									ret := -0.887755 // sell
								if( xrsi > 25.4921 )
									ret := -0.263158
							if( nvi > 2.70857 )
								if( pvimin <= -2.2754 )
									ret := 0.739130 // buy
								if( pvimin > -2.2754 )
									ret := 0.000000
					if( pvimin > -0.1689 )
						if( media_azul <= 20.786 )
							if( pvimax <= -0.024587 )
								if( nvi <= 0.269099 )
									ret := -0.391753
								if( nvi > 0.269099 )
									ret := -0.911765 // sell
							if( pvimax > -0.024587 )
								if( xmf <= 23.5076 )
									ret := 0.571429
								if( xmf > 23.5076 )
									ret := 0.000000
						if( media_azul > 20.786 )
							if( pvi <= -0.114708 )
								if( nvimin <= 0.260802 )
									ret := 1.000000 // buy
								if( nvimin > 0.260802 )
									ret := 0.500000
							if( pvi > -0.114708 )
								if( pvi <= -0.096072 )
									ret := -0.620690
								if( pvi > -0.096072 )
									ret := 0.164557
		if( xrsi > 26.7828 )
			if( oscp <= -42.1695 )
				if( oscp <= -129.918 )
					if( media_azul <= 35.7161 )
						ret := 0.250000
					if( media_azul > 35.7161 )
						if( stoc <= 39.0803 )
							ret := 0.800000 // buy
						if( stoc > 39.0803 )
							ret := 1.000000 // buy
				if( oscp > -129.918 )
					if( nvim <= 1.26701 )
						if( pvimax <= -0.216423 )
							if( verde <= -30.9297 )
								if( source <= 3590.59 )
									ret := -0.123414
								if( source > 3590.59 )
									ret := -0.564286
							if( verde > -30.9297 )
								if( marron_mean <= 3.98329 )
									ret := 0.400000
								if( marron_mean > 3.98329 )
									ret := -0.520661
						if( pvimax > -0.216423 )
							if( BollOsc <= -47.1808 )
								if( media_azul <= 34.9015 )
									ret := -0.510791
								if( media_azul > 34.9015 )
									ret := 0.041667
							if( BollOsc > -47.1808 )
								if( tprice <= 3306.09 )
									ret := 0.257384
								if( tprice > 3306.09 )
									ret := -0.513514
					if( nvim > 1.26701 )
						if( azul_mean <= -52.8181 )
							if( verde_azul <= 20.7386 )
								ret := -1.000000 // sell
							if( verde_azul > 20.7386 )
								ret := -0.909091 // sell
						if( azul_mean > -52.8181 )
							if( nvimin <= 1.43898 )
								if( nvi_ema <= 1.37915 )
									ret := 0.095588
								if( nvi_ema > 1.37915 )
									ret := 0.850746 // buy
							if( nvimin > 1.43898 )
								if( tprice <= 3802.06 )
									ret := -0.070161
								if( tprice > 3802.06 )
									ret := 0.708333 // buy
			if( oscp > -42.1695 )
				if( nvim <= 0.108617 )
					if( azul_mean <= -49.1596 )
						if( verde_azul <= 61.3146 )
							if( media <= 38.7327 )
								if( azul <= -34.3047 )
									ret := -0.615385
								if( azul > -34.3047 )
									ret := -0.200000
							if( media > 38.7327 )
								ret := -0.923077 // sell
						if( verde_azul > 61.3146 )
							if( source <= 1592.68 )
								if( nvi_ema <= 0.100506 )
									ret := -1.000000 // sell
								if( nvi_ema > 0.100506 )
									ret := -0.437500
							if( source > 1592.68 )
								if( stoc <= 23.1573 )
									ret := 0.432432
								if( stoc > 23.1573 )
									ret := -0.256757
					if( azul_mean > -49.1596 )
						if( nvimax <= 0.104184 )
							if( xmf <= 23.8483 )
								if( pvimin <= -0.188437 )
									ret := 0.197417
								if( pvimin > -0.188437 )
									ret := -0.037296
							if( xmf > 23.8483 )
								if( marron <= 9.15957 )
									ret := -0.238971
								if( marron > 9.15957 )
									ret := -0.045068
						if( nvimax > 0.104184 )
							if( nvimin <= 0.096445 )
								ret := 0.954545 // buy
							if( nvimin > 0.096445 )
								if( nvimax <= 0.104834 )
									ret := -0.413793
								if( nvimax > 0.104834 )
									ret := -0.138018
				if( nvim > 0.108617 )
					if( nvimin <= 1.58666 )
						if( azul_mean <= 3.08512 )
							if( azul <= -77.4193 )
								if( source <= 3682.72 )
									ret := 0.310606
								if( source > 3682.72 )
									ret := 1.000000 // buy
							if( azul > -77.4193 )
								if( tprice <= 3233.87 )
									ret := 0.042727
								if( tprice > 3233.87 )
									ret := -0.031123
						if( azul_mean > 3.08512 )
							if( oscp <= 0.970209 )
								if( source <= 2569.8 )
									ret := 0.079443
								if( source > 2569.8 )
									ret := 0.157159
							if( oscp > 0.970209 )
								if( nvimin <= 1.56324 )
									ret := -0.119529
								if( nvimin > 1.56324 )
									ret := 0.750000 // buy
					if( nvimin > 1.58666 )
						if( pvi <= -2.26818 )
							if( pvimax <= -2.26027 )
								if( pvi <= -2.31086 )
									ret := 0.944444 // buy
								if( pvi > -2.31086 )
									ret := 0.107143
							if( pvimax > -2.26027 )
								if( pvi <= -2.27633 )
									ret := 0.931818 // buy
								if( pvi > -2.27633 )
									ret := 0.421053
						if( pvi > -2.26818 )
							if( source <= 3181.24 )
								if( pvim <= -2.07328 )
									ret := -0.063425
								if( pvim > -2.07328 )
									ret := 0.038078
							if( source > 3181.24 )
								if( media <= 33.0177 )
									ret := -0.191858
								if( media > 33.0177 )
									ret := -0.021812
	if( stoc > 52.8745 )
		if( nvimax <= 1.43296 )
			if( xmf <= 44.6207 )
				if( xrsi <= 42.6273 )
					if( pvimin <= -0.302364 )
						if( pvim <= -0.38951 )
							if( pvimin <= -0.677244 )
								ret := 0.600000
							if( pvimin > -0.677244 )
								if( xmf <= 31.4442 )
									ret := 0.521739
								if( xmf > 31.4442 )
									ret := -0.557143
						if( pvim > -0.38951 )
							if( oscp <= -28.2168 )
								ret := 0.500000
							if( oscp > -28.2168 )
								if( verde_media <= 0.216358 )
									ret := -0.880952 // sell
								if( verde_media > 0.216358 )
									ret := -0.454545
					if( pvimin > -0.302364 )
						if( pvi <= -0.295516 )
							if( pvi_ema <= -0.291407 )
								ret := 0.250000
							if( pvi_ema > -0.291407 )
								ret := 0.916667 // buy
						if( pvi > -0.295516 )
							if( nvi <= 0.726022 )
								if( azul_mean <= 9.09883 )
									ret := -0.195531
								if( azul_mean > 9.09883 )
									ret := 0.204545
							if( nvi > 0.726022 )
								if( xrsi <= 41.9389 )
									ret := -0.933333 // sell
								if( xrsi > 41.9389 )
									ret := -0.437500
				if( xrsi > 42.6273 )
					if( verde_mean <= 32.1355 )
						if( pvi <= -0.548187 )
							if( stoc <= 60.1935 )
								if( verde_mean <= 21.5927 )
									ret := 0.000000
								if( verde_mean > 21.5927 )
									ret := 0.730769 // buy
							if( stoc > 60.1935 )
								if( nvimin <= 1.35219 )
									ret := 0.800000 // buy
								if( nvimin > 1.35219 )
									ret := 1.000000 // buy
						if( pvi > -0.548187 )
							if( source <= 2791.61 )
								if( tprice <= 2272.29 )
									ret := 0.108475
								if( tprice > 2272.29 )
									ret := 0.464789
							if( source > 2791.61 )
								if( verde <= 38.8604 )
									ret := 0.047619
								if( verde > 38.8604 )
									ret := -0.682927
					if( verde_mean > 32.1355 )
						if( pvimax <= -0.543299 )
							if( stoc <= 54.7572 )
								if( azul <= 13.6077 )
									ret := -0.115385
								if( azul > 13.6077 )
									ret := -0.913043 // sell
							if( stoc > 54.7572 )
								if( nvimax <= 1.32252 )
									ret := 0.336478
								if( nvimax > 1.32252 )
									ret := -0.020661
						if( pvimax > -0.543299 )
							if( tprice <= 2016.28 )
								if( nvi_ema <= 0.162353 )
									ret := -0.064131
								if( nvi_ema > 0.162353 )
									ret := 0.221429
							if( tprice > 2016.28 )
								if( pvimax <= -0.541521 )
									ret := -0.955556 // sell
								if( pvimax > -0.541521 )
									ret := -0.191781
			if( xmf > 44.6207 )
				if( source <= 1628.15 )
					if( pvimax <= -0.24719 )
						if( verde_mean <= 134.847 )
							if( xrsi <= 74.6088 )
								if( BollOsc <= 41.8529 )
									ret := 0.036138
								if( BollOsc > 41.8529 )
									ret := 0.254579
							if( xrsi > 74.6088 )
								if( oscp <= 17.1805 )
									ret := 0.000000
								if( oscp > 17.1805 )
									ret := 0.614458
						if( verde_mean > 134.847 )
							if( nvimax <= 0.132461 )
								if( marron_mean <= 115.027 )
									ret := -0.440559
								if( marron_mean > 115.027 )
									ret := 0.346591
							if( nvimax > 0.132461 )
								if( pvi <= -0.305923 )
									ret := 0.000000
								if( pvi > -0.305923 )
									ret := -0.792683 // sell
					if( pvimax > -0.24719 )
						if( verde_azul <= 41.4727 )
							if( marron_mean <= 67.1713 )
								ret := -0.090909
							if( marron_mean > 67.1713 )
								ret := -0.777778 // sell
						if( verde_azul > 41.4727 )
							if( xmf <= 71.4366 )
								if( verde_azul <= 122.825 )
									ret := 0.255814
								if( verde_azul > 122.825 )
									ret := -0.190476
							if( xmf > 71.4366 )
								if( nvimin <= 0.082175 )
									ret := -0.025641
								if( nvimin > 0.082175 )
									ret := 0.685714
				if( source > 1628.15 )
					if( media_azul <= -19.0221 )
						if( nvi <= 0.311933 )
							if( pvim <= -0.20018 )
								ret := -0.500000
							if( pvim > -0.20018 )
								if( media <= 70.6574 )
									ret := -0.105263
								if( media > 70.6574 )
									ret := 0.400000
						if( nvi > 0.311933 )
							if( xrsi <= 50.5096 )
								ret := -0.083333
							if( xrsi > 50.5096 )
								if( azul <= 129.884 )
									ret := 0.873239 // buy
								if( azul > 129.884 )
									ret := 0.470588
					if( media_azul > -19.0221 )
						if( pvimax <= -0.251673 )
							if( azul_mean <= 47.6564 )
								if( verde_mean <= 57.7293 )
									ret := -0.156331
								if( verde_mean > 57.7293 )
									ret := 0.026463
							if( azul_mean > 47.6564 )
								if( tprice <= 2280.52 )
									ret := -0.029940
								if( tprice > 2280.52 )
									ret := 0.418239
						if( pvimax > -0.251673 )
							if( nvimax <= 0.758855 )
								if( nvi_ema <= 0.312367 )
									ret := -0.026201
								if( nvi_ema > 0.312367 )
									ret := -0.144720
							if( nvimax > 0.758855 )
								if( tprice <= 3426.55 )
									ret := 0.294508
								if( tprice > 3426.55 )
									ret := -0.033708
		if( nvimax > 1.43296 )
			if( media_azul <= 100.797 )
				if( nvi_ema <= 2.7272 )
					if( source <= 2289.19 )
						if( verde_media <= 19.1079 )
							if( tprice <= 2247.58 )
								if( azul <= 18.0319 )
									ret := 0.976471 // buy
								if( azul > 18.0319 )
									ret := 0.769231 // buy
							if( tprice > 2247.58 )
								if( azul <= -3.51756 )
									ret := -0.160000
								if( azul > -3.51756 )
									ret := 0.634921
						if( verde_media > 19.1079 )
							if( xmf <= 78.0742 )
								if( pvimin <= -2.1196 )
									ret := 0.219178
								if( pvimin > -2.1196 )
									ret := 0.787234 // buy
							if( xmf > 78.0742 )
								if( pvim <= -2.18941 )
									ret := -0.250000
								if( pvim > -2.18941 )
									ret := -1.000000 // sell
					if( source > 2289.19 )
						if( media_azul <= -6.45431 )
							if( pvim <= -1.17268 )
								if( nvimax <= 2.68301 )
									ret := -0.140244
								if( nvimax > 2.68301 )
									ret := 0.828571 // buy
							if( pvim > -1.17268 )
								if( marron_mean <= 35.045 )
									ret := -0.235294
								if( marron_mean > 35.045 )
									ret := 0.530864
						if( media_azul > -6.45431 )
							if( verde <= 202.31 )
								if( tprice <= 3222.66 )
									ret := -0.085461
								if( tprice > 3222.66 )
									ret := -0.006081
							if( verde > 202.31 )
								if( marron <= 146.157 )
									ret := -0.390110
								if( marron > 146.157 )
									ret := 0.523810
				if( nvi_ema > 2.7272 )
					if( pvimax <= -2.25573 )
						if( nvimax <= 2.73147 )
							ret := 0.071429
						if( nvimax > 2.73147 )
							if( pvimax <= -2.26 )
								ret := 1.000000 // buy
							if( pvimax > -2.26 )
								ret := 0.916667 // buy
					if( pvimax > -2.25573 )
						ret := -0.416667
			if( media_azul > 100.797 )
				if( xrsi <= 52.1541 )
					if( tprice <= 2644.09 )
						if( pvimax <= -1.90118 )
							if( media <= 91.1987 )
								if( verde_azul <= 108.598 )
									ret := -0.057143
								if( verde_azul > 108.598 )
									ret := 0.560976
							if( media > 91.1987 )
								ret := 0.875000 // buy
						if( pvimax > -1.90118 )
							if( verde_azul <= 89.9151 )
								ret := 1.000000 // buy
							if( verde_azul > 89.9151 )
								ret := 0.684211
					if( tprice > 2644.09 )
						if( BollOsc <= -26.0588 )
							ret := 0.882353 // buy
						if( BollOsc > -26.0588 )
							if( marron_mean <= 90.1376 )
								if( BollOsc <= -4.2199 )
									ret := -0.547945
								if( BollOsc > -4.2199 )
									ret := 0.069444
							if( marron_mean > 90.1376 )
								if( stoc <= 63.6938 )
									ret := 0.675000
								if( stoc > 63.6938 )
									ret := 0.052632
				if( xrsi > 52.1541 )
					if( oscp <= 30.4053 )
						if( pvi_ema <= -0.719313 )
							if( verde_mean <= 101.678 )
								if( marron <= 72.3684 )
									ret := -0.037344
								if( marron > 72.3684 )
									ret := -0.459235
							if( verde_mean > 101.678 )
								if( pvimin <= -2.25958 )
									ret := 0.294118
								if( pvimin > -2.25958 )
									ret := -0.047974
						if( pvi_ema > -0.719313 )
							if( verde_mean <= 90.8489 )
								ret := 0.388889
							if( verde_mean > 90.8489 )
								if( nvi_ema <= 1.54336 )
									ret := -0.502463
								if( nvi_ema > 1.54336 )
									ret := -0.972973 // sell
					if( oscp > 30.4053 )
						if( pvim <= -0.682372 )
							if( tprice <= 2379.18 )
								if( azul <= -1.00717 )
									ret := 0.716216 // buy
								if( azul > -1.00717 )
									ret := -0.826087 // sell
							if( tprice > 2379.18 )
								if( nvimin <= 2.71123 )
									ret := -0.262936
								if( nvimin > 2.71123 )
									ret := -0.811321 // sell
						if( pvim > -0.682372 )
							if( pvimax <= -0.662319 )
								if( azul_mean <= -33.5357 )
									ret := 1.000000 // buy
								if( azul_mean > -33.5357 )
									ret := 0.888889 // buy
							if( pvimax > -0.662319 )
								ret := -0.761905 // sell
	
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
float op_operation = decision_tree_0_ETHUSDT_5Min_fd2d351c(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


