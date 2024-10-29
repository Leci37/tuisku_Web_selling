//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: VETUSDT_15Min_1KON_e25537ee Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_15Min_1KON_e25537ee", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_15Min_e25537ee(oscp, verde_media, verde, marron, azul, media, tprice, xrsi, pvimax, media_azul, nvi_ema, azul_mean, pvim, verde_mean, pvi_ema, xmf, nvi, BollOsc, source, nvimax, pvimin, stoc, marron_mean, pvi, nvim, nvimin, verde_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( oscp <= -9.31923 )
		if( xmf <= 29.9297 )
			if( nvimin <= 0.534279 )
				if( verde_azul <= -1.17643 )
					if( media <= 8.48194 )
						if( azul <= -17.2923 )
							if( stoc <= 9.80761 )
								ret := 0.913043 // buy
							if( stoc > 9.80761 )
								ret := 0.545455
						if( azul > -17.2923 )
							if( marron <= -9.61716 )
								ret := 0.500000
							if( marron > -9.61716 )
								if( pvim <= -0.643062 )
									ret := -0.444444
								if( pvim > -0.643062 )
									ret := -0.750000 // sell
					if( media > 8.48194 )
						if( marron <= -4.75548 )
							if( xmf <= 27.0967 )
								if( verde_media <= -141.402 )
									ret := -0.900000 // sell
								if( verde_media > -141.402 )
									ret := 0.397059
							if( xmf > 27.0967 )
								ret := -0.909091 // sell
						if( marron > -4.75548 )
							if( pvim <= -0.801228 )
								if( stoc <= 13.9562 )
									ret := 0.802632 // buy
								if( stoc > 13.9562 )
									ret := 0.292818
							if( pvim > -0.801228 )
								if( nvim <= 0.065707 )
									ret := 0.292683
								if( nvim > 0.065707 )
									ret := 0.735669 // buy
				if( verde_azul > -1.17643 )
					if( verde_mean <= 3.40829 )
						if( pvimax <= -0.403075 )
							if( verde <= -8.17998 )
								if( source <= 0.032162 )
									ret := 0.585366
								if( source > 0.032162 )
									ret := -0.428571
							if( verde > -8.17998 )
								if( azul_mean <= -0.301806 )
									ret := 0.927273 // buy
								if( azul_mean > -0.301806 )
									ret := 0.384615
						if( pvimax > -0.403075 )
							if( verde_mean <= -7.2596 )
								if( oscp <= -20.593 )
									ret := -0.250000
								if( oscp > -20.593 )
									ret := -0.888889 // sell
							if( verde_mean > -7.2596 )
								ret := 0.615385
					if( verde_mean > 3.40829 )
						if( BollOsc <= -29.4464 )
							if( pvimax <= -0.891776 )
								ret := 0.400000
							if( pvimax > -0.891776 )
								if( azul <= -40.4653 )
									ret := 0.555556
								if( azul > -40.4653 )
									ret := -0.431818
						if( BollOsc > -29.4464 )
							if( verde_media <= -15.7027 )
								if( verde_mean <= 39.1586 )
									ret := 0.062500
								if( verde_mean > 39.1586 )
									ret := -0.454545
							if( verde_media > -15.7027 )
								ret := 1.000000 // buy
			if( nvimin > 0.534279 )
				if( xrsi <= 14.6493 )
					if( azul <= -73.1441 )
						if( verde_mean <= -89.2971 )
							ret := 0.882353 // buy
						if( verde_mean > -89.2971 )
							if( verde_mean <= -62.6591 )
								if( verde_media <= -65.7692 )
									ret := -1.000000 // sell
								if( verde_media > -65.7692 )
									ret := -0.800000 // sell
							if( verde_mean > -62.6591 )
								ret := -0.500000
					if( azul > -73.1441 )
						if( pvi <= -1.02249 )
							if( pvim <= -6.29586 )
								if( marron_mean <= -12.844 )
									ret := -0.769231 // sell
								if( marron_mean > -12.844 )
									ret := 0.416667
							if( pvim > -6.29586 )
								if( pvi_ema <= -4.29756 )
									ret := 0.737327 // buy
								if( pvi_ema > -4.29756 )
									ret := 0.369369
						if( pvi > -1.02249 )
							ret := -0.800000 // sell
				if( xrsi > 14.6493 )
					if( verde_mean <= -61.1895 )
						if( pvi <= -6.67574 )
							if( pvimin <= -6.72926 )
								ret := 0.388889
							if( pvimin > -6.72926 )
								ret := 0.785714 // buy
						if( pvi > -6.67574 )
							if( marron <= 0.207299 )
								if( verde_media <= -89.9212 )
									ret := -0.065844
								if( verde_media > -89.9212 )
									ret := -0.613527
							if( marron > 0.207299 )
								if( azul_mean <= -7.72046 )
									ret := 0.788462 // buy
								if( azul_mean > -7.72046 )
									ret := -0.094203
					if( verde_mean > -61.1895 )
						if( pvim <= -5.94757 )
							if( oscp <= -38.6096 )
								if( marron <= 0.567345 )
									ret := 0.672316
								if( marron > 0.567345 )
									ret := 0.081761
							if( oscp > -38.6096 )
								if( BollOsc <= -43.3156 )
									ret := -0.208850
								if( BollOsc > -43.3156 )
									ret := 0.057325
						if( pvim > -5.94757 )
							if( stoc <= 41.9428 )
								if( verde_media <= -10.4536 )
									ret := 0.137076
								if( verde_media > -10.4536 )
									ret := -0.103757
							if( stoc > 41.9428 )
								if( media_azul <= 43.0005 )
									ret := 0.430233
								if( media_azul > 43.0005 )
									ret := 0.038043
		if( xmf > 29.9297 )
			if( azul_mean <= 82.2713 )
				if( pvim <= -0.393752 )
					if( xrsi <= 35.8072 )
						if( azul <= 29.1811 )
							if( verde_mean <= -37.2142 )
								if( oscp <= -71.6129 )
									ret := -0.544444
								if( oscp > -71.6129 )
									ret := -0.061856
							if( verde_mean > -37.2142 )
								if( media_azul <= 31.2449 )
									ret := 0.213180
								if( media_azul > 31.2449 )
									ret := 0.042560
						if( azul > 29.1811 )
							if( nvimin <= 3.85554 )
								if( verde_mean <= 5.64272 )
									ret := 0.282443
								if( verde_mean > 5.64272 )
									ret := -0.187500
							if( nvimin > 3.85554 )
								if( pvi_ema <= -4.59173 )
									ret := 0.379808
								if( pvi_ema > -4.59173 )
									ret := 0.795918 // buy
					if( xrsi > 35.8072 )
						if( pvimin <= -0.634959 )
							if( verde <= -7.41472 )
								if( pvimax <= -4.33465 )
									ret := 0.073892
								if( pvimax > -4.33465 )
									ret := -0.282486
							if( verde > -7.41472 )
								if( marron_mean <= 94.5671 )
									ret := 0.008655
								if( marron_mean > 94.5671 )
									ret := 0.339956
						if( pvimin > -0.634959 )
							if( source <= 0.033 )
								if( verde_azul <= 15.2577 )
									ret := 0.197917
								if( verde_azul > 15.2577 )
									ret := 0.586777
							if( source > 0.033 )
								if( media_azul <= 8.66197 )
									ret := -0.916667 // sell
								if( media_azul > 8.66197 )
									ret := 0.000000
				if( pvim > -0.393752 )
					if( media <= 24.5499 )
						if( verde_azul <= -25.9599 )
							if( stoc <= 16.2677 )
								ret := 0.588235
							if( stoc > 16.2677 )
								if( nvimin <= 0.016513 )
									ret := -0.636364
								if( nvimin > 0.016513 )
									ret := -1.000000 // sell
						if( verde_azul > -25.9599 )
							if( marron_mean <= 15.5321 )
								ret := 1.000000 // buy
							if( marron_mean > 15.5321 )
								if( BollOsc <= -25.6542 )
									ret := 0.727273 // buy
								if( BollOsc > -25.6542 )
									ret := 0.428571
					if( media > 24.5499 )
						if( media <= 36.3149 )
							if( nvi <= 0.060599 )
								if( pvi_ema <= -0.055797 )
									ret := -0.500000
								if( pvi_ema > -0.055797 )
									ret := -0.230769
							if( nvi > 0.060599 )
								if( marron_mean <= 25.2057 )
									ret := -0.588235
								if( marron_mean > 25.2057 )
									ret := -0.952381 // sell
						if( media > 36.3149 )
							if( azul <= -10.6543 )
								if( verde_mean <= 41.44 )
									ret := -0.913043 // sell
								if( verde_mean > 41.44 )
									ret := -0.222222
							if( azul > -10.6543 )
								if( media <= 58.683 )
									ret := 0.134146
								if( media > 58.683 )
									ret := -0.586957
			if( azul_mean > 82.2713 )
				if( source <= 0.023068 )
					if( xmf <= 36.0893 )
						ret := 0.882353 // buy
					if( xmf > 36.0893 )
						if( nvi_ema <= 3.76471 )
							if( nvim <= 3.13422 )
								ret := -0.500000
							if( nvim > 3.13422 )
								ret := -0.900000 // sell
						if( nvi_ema > 3.76471 )
							ret := -0.363636
				if( source > 0.023068 )
					if( pvi <= -6.25134 )
						ret := 0.428571
					if( pvi > -6.25134 )
						if( verde_media <= 0.302953 )
							if( source <= 0.026772 )
								if( nvim <= 2.44748 )
									ret := -0.800000 // sell
								if( nvim > 2.44748 )
									ret := -0.954545 // sell
							if( source > 0.026772 )
								if( BollOsc <= -12.0458 )
									ret := -1.000000 // sell
								if( BollOsc > -12.0458 )
									ret := -0.928571 // sell
						if( verde_media > 0.302953 )
							ret := -0.066667
	if( oscp > -9.31923 )
		if( pvi_ema <= -0.892325 )
			if( tprice <= 0.022742 )
				if( xmf <= 85.8569 )
					if( marron_mean <= 47.7526 )
						if( nvi_ema <= 0.224169 )
							if( verde_azul <= 33.7835 )
								ret := 0.944444 // buy
							if( verde_azul > 33.7835 )
								ret := 0.300000
						if( nvi_ema > 0.224169 )
							if( nvimax <= 3.87379 )
								if( media_azul <= 27.0012 )
									ret := 0.005974
								if( media_azul > 27.0012 )
									ret := -0.132316
							if( nvimax > 3.87379 )
								if( azul <= -26.44 )
									ret := -0.209003
								if( azul > -26.44 )
									ret := 0.057298
					if( marron_mean > 47.7526 )
						if( BollOsc <= -29.7246 )
							if( pvi <= -4.20065 )
								if( verde <= 39.1662 )
									ret := 0.268041
								if( verde > 39.1662 )
									ret := -0.416667
							if( pvi > -4.20065 )
								if( media_azul <= 87.8212 )
									ret := -0.284211
								if( media_azul > 87.8212 )
									ret := -0.654545
						if( BollOsc > -29.7246 )
							if( media <= 114.31 )
								if( oscp <= 13.9837 )
									ret := 0.046239
								if( oscp > 13.9837 )
									ret := 0.117832
							if( media > 114.31 )
								if( tprice <= 0.02225 )
									ret := 0.638095
								if( tprice > 0.02225 )
									ret := -0.181818
				if( xmf > 85.8569 )
					if( pvi <= -2.95518 )
						if( pvim <= -3.52775 )
							if( xrsi <= 82.6501 )
								if( BollOsc <= 58.497 )
									ret := -0.132867
								if( BollOsc > 58.497 )
									ret := -0.454545
							if( xrsi > 82.6501 )
								if( pvim <= -4.49011 )
									ret := -0.267857
								if( pvim > -4.49011 )
									ret := -0.617647
						if( pvim > -3.52775 )
							ret := -1.000000 // sell
					if( pvi > -2.95518 )
						if( pvim <= -2.54479 )
							if( pvimax <= -2.52359 )
								ret := 0.454545
							if( pvimax > -2.52359 )
								ret := 0.916667 // buy
						if( pvim > -2.54479 )
							if( oscp <= 53.8055 )
								if( verde_media <= 68.2159 )
									ret := -0.077586
								if( verde_media > 68.2159 )
									ret := -0.600000
							if( oscp > 53.8055 )
								if( pvi_ema <= -2.36951 )
									ret := -0.100000
								if( pvi_ema > -2.36951 )
									ret := 0.615385
			if( tprice > 0.022742 )
				if( pvimin <= -4.52605 )
					if( BollOsc <= 64.2822 )
						if( nvimax <= 5.49998 )
							if( verde_mean <= 211.531 )
								if( BollOsc <= -21.8531 )
									ret := 0.150110
								if( BollOsc > -21.8531 )
									ret := 0.016593
							if( verde_mean > 211.531 )
								if( nvimin <= 4.71565 )
									ret := 0.090909
								if( nvimin > 4.71565 )
									ret := 0.730769 // buy
						if( nvimax > 5.49998 )
							if( azul <= -0.177752 )
								if( pvi <= -4.91724 )
									ret := 0.017570
								if( pvi > -4.91724 )
									ret := -0.435484
							if( azul > -0.177752 )
								if( verde_azul <= -14.577 )
									ret := -0.800000 // sell
								if( verde_azul > -14.577 )
									ret := -0.078639
					if( BollOsc > 64.2822 )
						if( verde_azul <= 140.367 )
							if( nvi_ema <= 5.207 )
								if( nvimax <= 4.77333 )
									ret := -0.718750 // sell
								if( nvimax > 4.77333 )
									ret := 0.050633
							if( nvi_ema > 5.207 )
								if( oscp <= 25.42 )
									ret := -0.386740
								if( oscp > 25.42 )
									ret := -0.878788 // sell
						if( verde_azul > 140.367 )
							if( pvi <= -5.05347 )
								if( azul <= 21.2163 )
									ret := 0.090278
								if( azul > 21.2163 )
									ret := 0.913043 // buy
							if( pvi > -5.05347 )
								if( media_azul <= 71.8492 )
									ret := 0.096774
								if( media_azul > 71.8492 )
									ret := -0.506494
				if( pvimin > -4.52605 )
					if( tprice <= 0.026326 )
						if( verde <= 30.1224 )
							if( verde_azul <= 61.6191 )
								if( stoc <= 28.8488 )
									ret := -0.043326
								if( stoc > 28.8488 )
									ret := 0.224274
							if( verde_azul > 61.6191 )
								if( stoc <= 31.0709 )
									ret := 0.869565 // buy
								if( stoc > 31.0709 )
									ret := 0.416667
						if( verde > 30.1224 )
							if( xmf <= 74.886 )
								if( BollOsc <= 42.31 )
									ret := -0.040956
								if( BollOsc > 42.31 )
									ret := -0.205198
							if( xmf > 74.886 )
								if( pvim <= -2.51903 )
									ret := 0.224816
								if( pvim > -2.51903 )
									ret := -0.038741
					if( tprice > 0.026326 )
						if( verde <= 176.79 )
							if( verde_mean <= 29.3258 )
								if( media <= 44.5347 )
									ret := -0.066830
								if( media > 44.5347 )
									ret := 0.400901
							if( verde_mean > 29.3258 )
								if( source <= 0.050738 )
									ret := -0.144891
								if( source > 0.050738 )
									ret := -0.958333 // sell
						if( verde > 176.79 )
							if( marron <= 114.4 )
								if( azul_mean <= -4.74512 )
									ret := -0.954545 // sell
								if( azul_mean > -4.74512 )
									ret := 0.000000
							if( marron > 114.4 )
								if( nvi <= 4.82376 )
									ret := 0.396552
								if( nvi > 4.82376 )
									ret := -0.615385
		if( pvi_ema > -0.892325 )
			if( media <= 29.3708 )
				if( source <= 0.021845 )
					if( tprice <= 0.021361 )
						ret := 1.000000 // buy
					if( tprice > 0.021361 )
						ret := 0.727273 // buy
				if( source > 0.021845 )
					if( nvi_ema <= 0.132566 )
						if( xrsi <= 35.4738 )
							if( oscp <= -6.28786 )
								ret := 0.882353 // buy
							if( oscp > -6.28786 )
								if( tprice <= 0.029155 )
									ret := 0.583333
								if( tprice > 0.029155 )
									ret := 0.000000
						if( xrsi > 35.4738 )
							if( tprice <= 0.042662 )
								if( nvimin <= 0.054405 )
									ret := -0.062500
								if( nvimin > 0.054405 )
									ret := -0.672131
							if( tprice > 0.042662 )
								if( pvimin <= -0.138028 )
									ret := 0.454545
								if( pvimin > -0.138028 )
									ret := -0.153846
					if( nvi_ema > 0.132566 )
						if( nvim <= 0.424011 )
							if( pvi <= -0.882379 )
								ret := 0.176471
							if( pvi > -0.882379 )
								if( nvimin <= 0.121187 )
									ret := -0.864198 // sell
								if( nvimin > 0.121187 )
									ret := -0.562667
						if( nvim > 0.424011 )
							if( nvi <= 0.523071 )
								if( nvi_ema <= 0.490207 )
									ret := 0.538462
								if( nvi_ema > 0.490207 )
									ret := 1.000000 // buy
							if( nvi > 0.523071 )
								if( oscp <= -3.10263 )
									ret := 0.000000
								if( oscp > -3.10263 )
									ret := -0.642857
			if( media > 29.3708 )
				if( BollOsc <= 0.961677 )
					if( nvi <= 0.051812 )
						if( media <= 63.1583 )
							if( pvi <= -0.778705 )
								ret := -0.272727
							if( pvi > -0.778705 )
								if( pvi_ema <= -0.128353 )
									ret := 0.746479 // buy
								if( pvi_ema > -0.128353 )
									ret := 0.344828
						if( media > 63.1583 )
							if( verde_media <= -21.6117 )
								if( nvimin <= 0.026518 )
									ret := 0.928571 // buy
								if( nvimin > 0.026518 )
									ret := 0.272727
							if( verde_media > -21.6117 )
								if( marron <= 56.3814 )
									ret := -0.827586 // sell
								if( marron > 56.3814 )
									ret := -0.200000
					if( nvi > 0.051812 )
						if( azul <= 6.08062 )
							if( marron <= 46.7996 )
								if( media <= 38.9327 )
									ret := -0.410448
								if( media > 38.9327 )
									ret := -0.024148
							if( marron > 46.7996 )
								if( verde_mean <= 57.5037 )
									ret := -0.027211
								if( verde_mean > 57.5037 )
									ret := 0.241026
						if( azul > 6.08062 )
							if( azul <= 11.4109 )
								if( marron_mean <= 38.0521 )
									ret := 0.895833 // buy
								if( marron_mean > 38.0521 )
									ret := 0.459770
							if( azul > 11.4109 )
								if( pvimin <= -0.570342 )
									ret := 0.239726
								if( pvimin > -0.570342 )
									ret := -0.474576
				if( BollOsc > 0.961677 )
					if( verde_mean <= 139.466 )
						if( oscp <= -1.73368 )
							if( pvimax <= -0.3939 )
								if( nvimin <= 0.133326 )
									ret := 0.400000
								if( nvimin > 0.133326 )
									ret := -0.090226
							if( pvimax > -0.3939 )
								if( verde_mean <= 62.2879 )
									ret := -0.707317 // sell
								if( verde_mean > 62.2879 )
									ret := -0.111111
						if( oscp > -1.73368 )
							if( stoc <= 50.577 )
								if( nvi_ema <= 0.253373 )
									ret := 0.179931
								if( nvi_ema > 0.253373 )
									ret := -0.160000
							if( stoc > 50.577 )
								if( media <= 110.446 )
									ret := -0.306268
								if( media > 110.446 )
									ret := 0.750000 // buy
					if( verde_mean > 139.466 )
						if( xrsi <= 65.698 )
							if( verde_mean <= 146.301 )
								if( nvi_ema <= 0.083306 )
									ret := 1.000000 // buy
								if( nvi_ema > 0.083306 )
									ret := -0.666667
							if( verde_mean > 146.301 )
								if( stoc <= 77.9594 )
									ret := 0.586207
								if( stoc > 77.9594 )
									ret := 0.951220 // buy
						if( xrsi > 65.698 )
							if( xmf <= 82.2175 )
								if( marron_mean <= 113.96 )
									ret := -0.091667
								if( marron_mean > 113.96 )
									ret := 0.400000
							if( xmf > 82.2175 )
								if( media <= 86.7503 )
									ret := 0.888889 // buy
								if( media > 86.7503 )
									ret := -0.313333
	
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
float op_operation = decision_tree_0_VETUSDT_15Min_e25537ee(oscp, verde_media, verde, marron, azul, media, tprice, xrsi, pvimax, media_azul, nvi_ema, azul_mean, pvim, verde_mean, pvi_ema, xmf, nvi, BollOsc, source, nvimax, pvimin, stoc, marron_mean, pvi, nvim, nvimin, verde_azul)

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


