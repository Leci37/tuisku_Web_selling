//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: MSFT_30Min_1KON_da77efff Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_30Min_1KON_da77efff", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_30Min_da77efff(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( stoc <= 69.8237 )
		if( nvi_ema <= 2.27309 )
			if( media_azul <= 6.116 )
				if( tprice <= 267.557 )
					if( source <= 234.493 )
						if( xrsi <= 19.9352 )
							if( azul_mean <= 19.7215 )
								if( verde_mean <= -22.4921 )
									ret := 0.102564
								if( verde_mean > -22.4921 )
									ret := 0.875000 // buy
							if( azul_mean > 19.7215 )
								if( azul_mean <= 39.9403 )
									ret := 1.000000 // buy
								if( azul_mean > 39.9403 )
									ret := 0.500000
						if( xrsi > 19.9352 )
							if( pvi <= -0.04048 )
								if( BollOsc <= -62.8014 )
									ret := -0.823529 // sell
								if( BollOsc > -62.8014 )
									ret := 0.011289
							if( pvi > -0.04048 )
								if( media <= 19.6085 )
									ret := -0.425287
								if( media > 19.6085 )
									ret := -0.082067
					if( source > 234.493 )
						if( nvi_ema <= 2.16587 )
							if( pvimax <= -0.372669 )
								if( source <= 246.358 )
									ret := 0.500000
								if( source > 246.358 )
									ret := 0.000000
							if( pvimax > -0.372669 )
								if( xmf <= 82.2798 )
									ret := -0.615741
								if( xmf > 82.2798 )
									ret := 0.181818
						if( nvi_ema > 2.16587 )
							if( tprice <= 251.949 )
								if( BollOsc <= -21.2744 )
									ret := 1.000000 // buy
								if( BollOsc > -21.2744 )
									ret := 0.750000 // buy
							if( tprice > 251.949 )
								if( nvi_ema <= 2.20999 )
									ret := -0.194444
								if( nvi_ema > 2.20999 )
									ret := 1.000000 // buy
				if( tprice > 267.557 )
					if( verde_mean <= -21.2084 )
						if( stoc <= 13.2609 )
							if( nvimax <= 2.25363 )
								if( xrsi <= 14.4012 )
									ret := -0.916667 // sell
								if( xrsi > 14.4012 )
									ret := -0.181818
							if( nvimax > 2.25363 )
								if( nvi_ema <= 2.26085 )
									ret := 0.950000 // buy
								if( nvi_ema > 2.26085 )
									ret := 0.250000
						if( stoc > 13.2609 )
							if( azul <= 59.5419 )
								if( pvi_ema <= 0.296191 )
									ret := 0.657718
								if( pvi_ema > 0.296191 )
									ret := 0.000000
							if( azul > 59.5419 )
								if( verde_mean <= -78.5492 )
									ret := -0.625000
								if( verde_mean > -78.5492 )
									ret := 0.117647
					if( verde_mean > -21.2084 )
						if( xmf <= 5.1406 )
							if( nvi_ema <= 2.19184 )
								if( oscp <= -30.1666 )
									ret := 0.666667
								if( oscp > -30.1666 )
									ret := 0.000000
							if( nvi_ema > 2.19184 )
								if( verde_media <= -4.34571 )
									ret := -0.833333 // sell
								if( verde_media > -4.34571 )
									ret := 0.500000
						if( xmf > 5.1406 )
							if( pvimin <= -0.362569 )
								if( verde_media <= 25.4547 )
									ret := 0.952381 // buy
								if( verde_media > 25.4547 )
									ret := 0.142857
							if( pvimin > -0.362569 )
								if( xrsi <= 50.0053 )
									ret := 0.103641
								if( xrsi > 50.0053 )
									ret := -0.256000
			if( media_azul > 6.116 )
				if( media <= 50.199 )
					if( nvimin <= 2.23439 )
						if( verde_mean <= 78.7273 )
							if( media_azul <= 29.3926 )
								if( verde_media <= -8.02561 )
									ret := 0.127457
								if( verde_media > -8.02561 )
									ret := 0.000555
							if( media_azul > 29.3926 )
								if( media <= 2.43471 )
									ret := 0.612245
								if( media > 2.43471 )
									ret := 0.139874
						if( verde_mean > 78.7273 )
							if( nvi <= 1.86612 )
								if( nvi <= 0.743266 )
									ret := 0.147541
								if( nvi > 0.743266 )
									ret := -0.702970 // sell
							if( nvi > 1.86612 )
								if( stoc <= 55.4475 )
									ret := -0.171429
								if( stoc > 55.4475 )
									ret := 0.360656
					if( nvimin > 2.23439 )
						if( marron_mean <= 6.10671 )
							if( media <= -3.84436 )
								if( media_azul <= 10.3132 )
									ret := 1.000000 // buy
								if( media_azul > 10.3132 )
									ret := 0.222222
							if( media > -3.84436 )
								if( pvi <= -0.375131 )
									ret := -0.216216
								if( pvi > -0.375131 )
									ret := -0.742647 // sell
						if( marron_mean > 6.10671 )
							if( verde_mean <= 27.3455 )
								if( verde_azul <= 61.8672 )
									ret := 0.284091
								if( verde_azul > 61.8672 )
									ret := -0.518519
							if( verde_mean > 27.3455 )
								if( pvi <= -0.37301 )
									ret := 0.666667
								if( pvi > -0.37301 )
									ret := -0.420118
				if( media > 50.199 )
					if( pvi <= -0.39833 )
						if( xmf <= 71.6071 )
							if( azul <= -42.8736 )
								ret := -0.500000
							if( azul > -42.8736 )
								if( verde_media <= -60.125 )
									ret := 0.210526
								if( verde_media > -60.125 )
									ret := 0.797619 // buy
						if( xmf > 71.6071 )
							if( pvi <= -0.404026 )
								if( media <= 72.8407 )
									ret := -0.076923
								if( media > 72.8407 )
									ret := -1.000000 // sell
							if( pvi > -0.404026 )
								ret := 1.000000 // buy
					if( pvi > -0.39833 )
						if( xmf <= 11.3963 )
							if( pvimax <= 0.342647 )
								if( azul_mean <= -30.8397 )
									ret := -0.482759
								if( azul_mean > -30.8397 )
									ret := -0.015220
							if( pvimax > 0.342647 )
								if( xmf <= 2.08319 )
									ret := -0.291667
								if( xmf > 2.08319 )
									ret := -0.812500 // sell
						if( xmf > 11.3963 )
							if( stoc <= 54.0694 )
								if( BollOsc <= -19.9932 )
									ret := 0.099104
								if( BollOsc > -19.9932 )
									ret := -0.021625
							if( stoc > 54.0694 )
								if( xmf <= 92.8967 )
									ret := 0.103142
								if( xmf > 92.8967 )
									ret := -0.056671
		if( nvi_ema > 2.27309 )
			if( oscp <= 22.9802 )
				if( azul_mean <= 12.078 )
					if( marron <= -16.6336 )
						if( source <= 292.337 )
							if( BollOsc <= -71.9896 )
								ret := -0.500000
							if( BollOsc > -71.9896 )
								ret := 0.200000
						if( source > 292.337 )
							if( verde_mean <= -11.9729 )
								ret := 0.750000 // buy
							if( verde_mean > -11.9729 )
								ret := 1.000000 // buy
					if( marron > -16.6336 )
						if( tprice <= 298.146 )
							if( verde_mean <= -37.9407 )
								if( media <= 17.4843 )
									ret := 0.000000
								if( media > 17.4843 )
									ret := -0.250000
							if( verde_mean > -37.9407 )
								if( stoc <= 6.22107 )
									ret := -0.125000
								if( stoc > 6.22107 )
									ret := -0.867347 // sell
						if( tprice > 298.146 )
							if( pvimax <= -0.310246 )
								if( nvi_ema <= 2.27613 )
									ret := -0.714286 // sell
								if( nvi_ema > 2.27613 )
									ret := 0.122807
							if( pvimax > -0.310246 )
								if( pvim <= -0.321623 )
									ret := -0.226415
								if( pvim > -0.321623 )
									ret := -0.597015
				if( azul_mean > 12.078 )
					if( nvi <= 2.278 )
						if( pvimin <= -0.331875 )
							ret := -1.000000 // sell
						if( pvimin > -0.331875 )
							if( xmf <= 36.1835 )
								ret := -0.250000
							if( xmf > 36.1835 )
								ret := 0.000000
					if( nvi > 2.278 )
						if( stoc <= 44.4135 )
							if( source <= 308.08 )
								if( media_azul <= -15.8442 )
									ret := 0.555556
								if( media_azul > -15.8442 )
									ret := 0.933333 // buy
							if( source > 308.08 )
								ret := -0.200000
						if( stoc > 44.4135 )
							if( azul <= 13.037 )
								ret := 0.250000
							if( azul > 13.037 )
								ret := 0.000000
			if( oscp > 22.9802 )
				if( xrsi <= 58.9486 )
					if( tprice <= 303.818 )
						ret := -0.250000
					if( tprice > 303.818 )
						if( xmf <= 62.3221 )
							if( marron <= 62.7078 )
								ret := 1.000000 // buy
							if( marron > 62.7078 )
								ret := 0.500000
						if( xmf > 62.3221 )
							ret := 1.000000 // buy
				if( xrsi > 58.9486 )
					ret := -0.200000
	if( stoc > 69.8237 )
		if( nvim <= 2.15551 )
			if( pvimax <= -0.05756 )
				if( pvim <= -0.382028 )
					if( verde_mean <= 109.803 )
						if( media_azul <= -23.7549 )
							ret := -1.000000 // sell
						if( media_azul > -23.7549 )
							if( tprice <= 245.637 )
								if( media <= 94.2878 )
									ret := 0.809091 // buy
								if( media > 94.2878 )
									ret := 0.333333
							if( tprice > 245.637 )
								if( pvi_ema <= -0.384692 )
									ret := 0.215686
								if( pvi_ema > -0.384692 )
									ret := 0.875000 // buy
					if( verde_mean > 109.803 )
						if( source <= 235.253 )
							if( marron <= 115.835 )
								if( media <= 107.984 )
									ret := 0.837838 // buy
								if( media > 107.984 )
									ret := 0.200000
							if( marron > 115.835 )
								if( BollOsc <= 42.8157 )
									ret := -0.500000
								if( BollOsc > 42.8157 )
									ret := 0.153846
						if( source > 235.253 )
							if( nvim <= 2.08037 )
								if( media_azul <= 103.14 )
									ret := -0.200000
								if( media_azul > 103.14 )
									ret := -1.000000 // sell
							if( nvim > 2.08037 )
								if( nvim <= 2.11395 )
									ret := 0.147059
								if( nvim > 2.11395 )
									ret := -1.000000 // sell
				if( pvim > -0.382028 )
					if( verde_mean <= 207.787 )
						if( verde_azul <= 149.02 )
							if( azul_mean <= 23.4751 )
								if( source <= 50.9877 )
									ret := 0.462810
								if( source > 50.9877 )
									ret := 0.027046
							if( azul_mean > 23.4751 )
								if( media <= 108.732 )
									ret := 0.204403
								if( media > 108.732 )
									ret := -0.201878
						if( verde_azul > 149.02 )
							if( source <= 239.773 )
								if( marron_mean <= 112.513 )
									ret := 0.116608
								if( marron_mean > 112.513 )
									ret := 0.486880
							if( source > 239.773 )
								if( tprice <= 265.231 )
									ret := -0.173077
								if( tprice > 265.231 )
									ret := 0.280992
					if( verde_mean > 207.787 )
						if( pvi_ema <= -0.306329 )
							if( oscp <= 59.6916 )
								ret := 0.250000
							if( oscp > 59.6916 )
								ret := 0.000000
						if( pvi_ema > -0.306329 )
							if( azul_mean <= 3.55341 )
								ret := 0.000000
							if( azul_mean > 3.55341 )
								if( stoc <= 92.649 )
									ret := -0.904762 // sell
								if( stoc > 92.649 )
									ret := 0.000000
			if( pvimax > -0.05756 )
				if( media <= 68.8408 )
					if( pvi <= 0.03197 )
						if( oscp <= 12.5559 )
							if( marron <= 63.2363 )
								if( source <= 73.6202 )
									ret := -0.072464
								if( source > 73.6202 )
									ret := 0.507143
							if( marron > 63.2363 )
								if( source <= 72.605 )
									ret := 0.218232
								if( source > 72.605 )
									ret := -0.112613
						if( oscp > 12.5559 )
							if( azul <= -1.55295 )
								if( azul_mean <= -46.2939 )
									ret := -0.666667
								if( azul_mean > -46.2939 )
									ret := 0.542986
							if( azul > -1.55295 )
								if( azul_mean <= 14.7222 )
									ret := -0.041916
								if( azul_mean > 14.7222 )
									ret := 0.506024
					if( pvi > 0.03197 )
						if( tprice <= 318.494 )
							if( nvi_ema <= -0.060887 )
								ret := 0.833333 // buy
							if( nvi_ema > -0.060887 )
								if( verde <= 72.0548 )
									ret := 0.103448
								if( verde > 72.0548 )
									ret := -0.411765
						if( tprice > 318.494 )
							if( tprice <= 335.472 )
								if( verde_media <= 72.7271 )
									ret := 0.307692
								if( verde_media > 72.7271 )
									ret := 1.000000 // buy
							if( tprice > 335.472 )
								if( xmf <= 72.5773 )
									ret := 0.061475
								if( xmf > 72.5773 )
									ret := -0.447154
				if( media > 68.8408 )
					if( xrsi <= 64.6288 )
						if( azul <= 0.111502 )
							if( azul_mean <= -8.11792 )
								if( stoc <= 87.82 )
									ret := -0.287671
								if( stoc > 87.82 )
									ret := 0.447368
							if( azul_mean > -8.11792 )
								if( pvim <= -0.067371 )
									ret := 0.657895
								if( pvim > -0.067371 )
									ret := 0.036574
						if( azul > 0.111502 )
							if( pvi_ema <= -0.067265 )
								if( azul_mean <= 1.99859 )
									ret := 0.250000
								if( azul_mean > 1.99859 )
									ret := -0.775000 // sell
							if( pvi_ema > -0.067265 )
								if( xmf <= 18.7657 )
									ret := -0.476684
								if( xmf > 18.7657 )
									ret := -0.148201
					if( xrsi > 64.6288 )
						if( pvi <= -0.048482 )
							if( xrsi <= 75.2959 )
								if( verde_mean <= 110.906 )
									ret := -0.386207
								if( verde_mean > 110.906 )
									ret := 0.040230
							if( xrsi > 75.2959 )
								if( xmf <= 43.006 )
									ret := 0.400000
								if( xmf > 43.006 )
									ret := -0.743243 // sell
						if( pvi > -0.048482 )
							if( verde_media <= 89.855 )
								if( xrsi <= 84.1002 )
									ret := 0.036441
								if( xrsi > 84.1002 )
									ret := -0.239362
							if( verde_media > 89.855 )
								if( verde_media <= 128.083 )
									ret := -0.357759
								if( verde_media > 128.083 )
									ret := 0.093750
		if( nvim > 2.15551 )
			if( pvi <= -0.349167 )
				if( media_azul <= 70.7097 )
					if( pvi_ema <= -0.372776 )
						if( verde <= 126.344 )
							if( media <= 71.0157 )
								if( stoc <= 82.8907 )
									ret := 0.875000 // buy
								if( stoc > 82.8907 )
									ret := 0.384615
							if( media > 71.0157 )
								if( pvim <= -0.375598 )
									ret := -0.038462
								if( pvim > -0.375598 )
									ret := 0.888889 // buy
						if( verde > 126.344 )
							if( tprice <= 284.87 )
								if( BollOsc <= 43.7313 )
									ret := 0.400000
								if( BollOsc > 43.7313 )
									ret := -0.714286 // sell
							if( tprice > 284.87 )
								ret := 1.000000 // buy
					if( pvi_ema > -0.372776 )
						if( azul_mean <= 3.04874 )
							if( xrsi <= 56.9475 )
								if( BollOsc <= 25.0794 )
									ret := 1.000000 // buy
								if( BollOsc > 25.0794 )
									ret := 0.750000 // buy
							if( xrsi > 56.9475 )
								if( BollOsc <= 59.641 )
									ret := 0.000000
								if( BollOsc > 59.641 )
									ret := -0.750000 // sell
						if( azul_mean > 3.04874 )
							if( azul <= 15.9171 )
								if( verde_media <= -51.9494 )
									ret := 0.250000
								if( verde_media > -51.9494 )
									ret := -0.829787 // sell
							if( azul > 15.9171 )
								if( oscp <= 2.12789 )
									ret := -0.750000 // sell
								if( oscp > 2.12789 )
									ret := 0.088235
				if( media_azul > 70.7097 )
					if( xmf <= 64.0161 )
						if( pvi <= -0.377734 )
							if( verde_mean <= 114.198 )
								if( source <= 281.495 )
									ret := -0.983607 // sell
								if( source > 281.495 )
									ret := -0.727273 // sell
							if( verde_mean > 114.198 )
								ret := 0.166667
						if( pvi > -0.377734 )
							if( nvim <= 2.26887 )
								if( nvimax <= 2.19693 )
									ret := -0.125000
								if( nvimax > 2.19693 )
									ret := -0.877193 // sell
							if( nvim > 2.26887 )
								if( source <= 284.015 )
									ret := 0.750000 // buy
								if( source > 284.015 )
									ret := 0.000000
					if( xmf > 64.0161 )
						if( media <= 77.2877 )
							if( xmf <= 66.2669 )
								ret := 0.750000 // buy
							if( xmf > 66.2669 )
								ret := 1.000000 // buy
						if( media > 77.2877 )
							if( xrsi <= 65.5746 )
								if( pvim <= -0.3567 )
									ret := 0.094118
								if( pvim > -0.3567 )
									ret := -1.000000 // sell
							if( xrsi > 65.5746 )
								if( nvimin <= 2.26376 )
									ret := -0.695122
								if( nvimin > 2.26376 )
									ret := -0.150000
			if( pvi > -0.349167 )
				if( marron <= 129.638 )
					if( xmf <= 94.6378 )
						if( marron_mean <= 126.212 )
							if( pvimax <= -0.33695 )
								if( verde_mean <= 118.86 )
									ret := 0.500000
								if( verde_mean > 118.86 )
									ret := -0.266667
							if( pvimax > -0.33695 )
								if( pvimax <= -0.328812 )
									ret := -0.357143
								if( pvimax > -0.328812 )
									ret := -0.013383
						if( marron_mean > 126.212 )
							if( verde_mean <= 148.934 )
								if( stoc <= 87.2134 )
									ret := 0.400000
								if( stoc > 87.2134 )
									ret := 0.961538 // buy
							if( verde_mean > 148.934 )
								if( stoc <= 89.8291 )
									ret := 0.666667
								if( stoc > 89.8291 )
									ret := -0.222222
					if( xmf > 94.6378 )
						if( tprice <= 300.117 )
							if( stoc <= 70.8352 )
								ret := 1.000000 // buy
							if( stoc > 70.8352 )
								if( nvi <= 2.21881 )
									ret := -0.330579
								if( nvi > 2.21881 )
									ret := -0.828571 // sell
						if( tprice > 300.117 )
							if( azul <= 8.55257 )
								if( BollOsc <= 47.19 )
									ret := -0.118280
								if( BollOsc > 47.19 )
									ret := -0.777778 // sell
							if( azul > 8.55257 )
								if( BollOsc <= 53.0485 )
									ret := 0.068966
								if( BollOsc > 53.0485 )
									ret := 0.909091 // buy
				if( marron > 129.638 )
					if( oscp <= 11.141 )
						if( verde_media <= 38.892 )
							ret := -0.333333
						if( verde_media > 38.892 )
							ret := 0.714286 // buy
					if( oscp > 11.141 )
						if( verde_azul <= 188.476 )
							if( verde_azul <= 153.444 )
								if( source <= 328.936 )
									ret := -0.850000 // sell
								if( source > 328.936 )
									ret := -0.100000
							if( verde_azul > 153.444 )
								if( media_azul <= 68.1563 )
									ret := -0.750000 // sell
								if( media_azul > 68.1563 )
									ret := 0.294118
						if( verde_azul > 188.476 )
							if( verde_mean <= 174.118 )
								if( media <= 95.6128 )
									ret := -1.000000 // sell
								if( media > 95.6128 )
									ret := -0.750000 // sell
							if( verde_mean > 174.118 )
								ret := -0.500000
	
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
float op_operation = decision_tree_0_MSFT_30Min_da77efff(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


