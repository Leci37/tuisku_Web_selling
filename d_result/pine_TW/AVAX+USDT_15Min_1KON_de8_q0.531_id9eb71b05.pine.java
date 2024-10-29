//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: AVAXUSDT_15Min_1KON_9eb71b05 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_15Min_1KON_9eb71b05", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_15Min_9eb71b05(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( marron <= 14.4062 )
		if( xrsi <= 27.0515 )
			if( source <= 57.1698 )
				if( verde_media <= -43.0022 )
					if( marron <= -26.6856 )
						if( pvi <= -3.56228 )
							ret := -0.666667
						if( pvi > -3.56228 )
							if( xmf <= 7.28892 )
								if( azul_mean <= -7.01827 )
									ret := 1.000000 // buy
								if( azul_mean > -7.01827 )
									ret := 0.722222 // buy
							if( xmf > 7.28892 )
								if( xrsi <= 14.3997 )
									ret := -0.062500
								if( xrsi > 14.3997 )
									ret := 0.608696
					if( marron > -26.6856 )
						if( azul_mean <= 6.04614 )
							if( BollOsc <= -76.8007 )
								if( stoc <= 17.5817 )
									ret := -0.493151
								if( stoc > 17.5817 )
									ret := -0.009259
							if( BollOsc > -76.8007 )
								if( marron_mean <= -8.11718 )
									ret := 0.017422
								if( marron_mean > -8.11718 )
									ret := 0.242582
						if( azul_mean > 6.04614 )
							if( BollOsc <= -54.2313 )
								if( azul <= 35.78 )
									ret := -0.025943
								if( azul > 35.78 )
									ret := 0.663636
							if( BollOsc > -54.2313 )
								if( marron <= 8.56595 )
									ret := -0.288660
								if( marron > 8.56595 )
									ret := 0.370370
				if( verde_media > -43.0022 )
					if( pvimin <= -1.68126 )
						if( xmf <= 17.5092 )
							if( marron <= -2.52856 )
								if( oscp <= -9.81263 )
									ret := 0.333333
								if( oscp > -9.81263 )
									ret := -0.521739
							if( marron > -2.52856 )
								if( marron_mean <= 3.93306 )
									ret := -0.314381
								if( marron_mean > 3.93306 )
									ret := 0.089888
						if( xmf > 17.5092 )
							if( oscp <= -9.12593 )
								if( azul_mean <= -30.4133 )
									ret := 0.708738 // buy
								if( azul_mean > -30.4133 )
									ret := 0.275492
							if( oscp > -9.12593 )
								if( azul_mean <= -44.6437 )
									ret := -0.666667
								if( azul_mean > -44.6437 )
									ret := 0.095808
					if( pvimin > -1.68126 )
						if( media_azul <= 73.3326 )
							if( azul_mean <= -63.5978 )
								if( stoc <= 8.94463 )
									ret := -0.500000
								if( stoc > 8.94463 )
									ret := -1.000000 // sell
							if( azul_mean > -63.5978 )
								if( xrsi <= 23.3243 )
									ret := 0.636605
								if( xrsi > 23.3243 )
									ret := 0.411765
						if( media_azul > 73.3326 )
							if( azul_mean <= -74.1403 )
								ret := -1.000000 // sell
							if( azul_mean > -74.1403 )
								ret := 0.000000
			if( source > 57.1698 )
				if( oscp <= -50.5923 )
					if( azul_mean <= -30.8276 )
						ret := 1.000000 // buy
					if( azul_mean > -30.8276 )
						ret := 0.000000
				if( oscp > -50.5923 )
					if( nvi_ema <= -0.003323 )
						if( nvimin <= -0.010887 )
							ret := 1.000000 // buy
						if( nvimin > -0.010887 )
							ret := 0.000000
					if( nvi_ema > -0.003323 )
						if( stoc <= 13.2046 )
							if( azul_mean <= -3.53876 )
								if( verde_media <= -18.2759 )
									ret := -0.600000
								if( verde_media > -18.2759 )
									ret := 0.142857
							if( azul_mean > -3.53876 )
								ret := 0.750000 // buy
						if( stoc > 13.2046 )
							if( xmf <= 9.45862 )
								ret := -0.400000
							if( xmf > 9.45862 )
								if( pvimax <= -0.02082 )
									ret := -0.940000 // sell
								if( pvimax > -0.02082 )
									ret := -0.500000
		if( xrsi > 27.0515 )
			if( marron_mean <= 15.9901 )
				if( nvimax <= -0.135431 )
					if( media <= 33.6876 )
						if( pvimax <= -0.571636 )
							if( xrsi <= 28.3716 )
								if( nvimax <= -0.157073 )
									ret := 0.583333
								if( nvimax > -0.157073 )
									ret := -0.727273 // sell
							if( xrsi > 28.3716 )
								if( marron <= 4.82829 )
									ret := 0.052632
								if( marron > 4.82829 )
									ret := -0.621622
						if( pvimax > -0.571636 )
							if( media <= 23.8829 )
								if( media_azul <= 16.1774 )
									ret := 0.750000 // buy
								if( media_azul > 16.1774 )
									ret := 1.000000 // buy
							if( media > 23.8829 )
								if( azul_mean <= 7.16286 )
									ret := 0.250000
								if( azul_mean > 7.16286 )
									ret := -0.250000
					if( media > 33.6876 )
						if( verde <= -14.6055 )
							if( marron_mean <= 13.2645 )
								ret := 0.500000
							if( marron_mean > 13.2645 )
								ret := -0.250000
						if( verde > -14.6055 )
							if( nvimax <= -0.223264 )
								ret := -0.250000
							if( nvimax > -0.223264 )
								ret := -1.000000 // sell
				if( nvimax > -0.135431 )
					if( tprice <= 17.9509 )
						if( azul <= -39.7383 )
							if( marron <= 11.2191 )
								if( verde_azul <= 42.1978 )
									ret := 0.409091
								if( verde_azul > 42.1978 )
									ret := 0.904762 // buy
							if( marron > 11.2191 )
								if( media_azul <= 73.5466 )
									ret := 0.444444
								if( media_azul > 73.5466 )
									ret := -1.000000 // sell
						if( azul > -39.7383 )
							if( marron <= 5.17655 )
								if( verde_media <= -43.4524 )
									ret := -0.070866
								if( verde_media > -43.4524 )
									ret := -0.437500
							if( marron > 5.17655 )
								if( xrsi <= 29.744 )
									ret := 0.117438
								if( xrsi > 29.744 )
									ret := -0.135870
					if( tprice > 17.9509 )
						if( media <= 24.6034 )
							if( verde <= -27.6786 )
								if( verde <= -35.9796 )
									ret := 0.107143
								if( verde > -35.9796 )
									ret := -0.447368
							if( verde > -27.6786 )
								if( media <= 8.03288 )
									ret := -0.500000
								if( media > 8.03288 )
									ret := 0.287449
						if( media > 24.6034 )
							if( oscp <= -37.3475 )
								if( stoc <= 24.7357 )
									ret := 0.479675
								if( stoc > 24.7357 )
									ret := -0.416667
							if( oscp > -37.3475 )
								if( stoc <= 17.5532 )
									ret := -0.182779
								if( stoc > 17.5532 )
									ret := 0.150877
			if( marron_mean > 15.9901 )
				if( verde_media <= -38.9191 )
					if( BollOsc <= -48.6108 )
						if( azul <= 44.407 )
							if( azul <= 1.49652 )
								if( pvimax <= -2.45348 )
									ret := -0.031519
								if( pvimax > -2.45348 )
									ret := 0.191162
							if( azul > 1.49652 )
								if( pvi_ema <= -3.05188 )
									ret := 0.233645
								if( pvi_ema > -3.05188 )
									ret := -0.193015
						if( azul > 44.407 )
							if( tprice <= 17.9738 )
								ret := 0.000000
							if( tprice > 17.9738 )
								if( verde_mean <= 6.1942 )
									ret := 0.896552 // buy
								if( verde_mean > 6.1942 )
									ret := 0.500000
					if( BollOsc > -48.6108 )
						if( marron <= 4.65883 )
							if( xmf <= 11.1969 )
								if( pvi_ema <= -2.83249 )
									ret := -0.750000 // sell
								if( pvi_ema > -2.83249 )
									ret := -1.000000 // sell
							if( xmf > 11.1969 )
								if( verde <= -18.282 )
									ret := 0.000000
								if( verde > -18.282 )
									ret := -0.750000 // sell
						if( marron > 4.65883 )
							if( stoc <= 12.9787 )
								if( xrsi <= 42.5819 )
									ret := -0.142857
								if( xrsi > 42.5819 )
									ret := 1.000000 // buy
							if( stoc > 12.9787 )
								if( verde <= -0.75922 )
									ret := 0.385827
								if( verde > -0.75922 )
									ret := 0.066038
				if( verde_media > -38.9191 )
					if( xrsi <= 32.868 )
						if( source <= 34.36 )
							if( stoc <= 27.1704 )
								if( tprice <= 23.685 )
									ret := 0.500000
								if( tprice > 23.685 )
									ret := 0.017857
							if( stoc > 27.1704 )
								if( nvi <= 2.58702 )
									ret := -0.212766
								if( nvi > 2.58702 )
									ret := 0.555556
						if( source > 34.36 )
							if( verde_media <= -20.079 )
								if( media <= 21.8762 )
									ret := -0.200000
								if( media > 21.8762 )
									ret := 0.878378 // buy
							if( verde_media > -20.079 )
								if( source <= 56.4984 )
									ret := -0.125000
								if( source > 56.4984 )
									ret := 0.750000 // buy
					if( xrsi > 32.868 )
						if( verde_azul <= 2.40639 )
							if( tprice <= 20.0251 )
								if( BollOsc <= -45.8627 )
									ret := -0.379310
								if( BollOsc > -45.8627 )
									ret := 0.423077
							if( tprice > 20.0251 )
								if( marron_mean <= 20.8328 )
									ret := 0.045455
								if( marron_mean > 20.8328 )
									ret := 0.910714 // buy
						if( verde_azul > 2.40639 )
							if( stoc <= 17.6677 )
								if( verde_azul <= 39.9029 )
									ret := -0.366667
								if( verde_azul > 39.9029 )
									ret := 0.259259
							if( stoc > 17.6677 )
								if( azul <= -8.8272 )
									ret := 0.378947
								if( azul > -8.8272 )
									ret := -0.321429
	if( marron > 14.4062 )
		if( pvimax <= -0.924913 )
			if( source <= 56.8805 )
				if( xrsi <= 57.3753 )
					if( nvi <= 3.19797 )
						if( azul_mean <= -1.76626 )
							if( stoc <= 22.7229 )
								if( tprice <= 50.7143 )
									ret := -0.079048
								if( tprice > 50.7143 )
									ret := 0.324138
							if( stoc > 22.7229 )
								if( azul <= -7.40643 )
									ret := 0.060668
								if( azul > -7.40643 )
									ret := -0.019276
						if( azul_mean > -1.76626 )
							if( BollOsc <= 16.0653 )
								if( azul <= 27.3433 )
									ret := 0.090945
								if( azul > 27.3433 )
									ret := -0.015103
							if( BollOsc > 16.0653 )
								if( xrsi <= 52.545 )
									ret := -0.161832
								if( xrsi > 52.545 )
									ret := 0.005790
					if( nvi > 3.19797 )
						if( verde <= 98.2207 )
							if( marron <= 39.3143 )
								if( nvim <= 3.20538 )
									ret := -0.508197
								if( nvim > 3.20538 )
									ret := 0.040863
							if( marron > 39.3143 )
								if( pvi_ema <= -2.45372 )
									ret := -0.088824
								if( pvi_ema > -2.45372 )
									ret := 0.509434
						if( verde > 98.2207 )
							if( azul <= -69.9428 )
								if( nvimax <= 3.49757 )
									ret := -1.000000 // sell
								if( nvimax > 3.49757 )
									ret := -0.500000
							if( azul > -69.9428 )
								if( azul <= -39.2975 )
									ret := 0.852941 // buy
								if( azul > -39.2975 )
									ret := 0.228395
				if( xrsi > 57.3753 )
					if( marron <= 113.965 )
						if( tprice <= 35.1916 )
							if( marron_mean <= 109.787 )
								if( nvi_ema <= 2.7415 )
									ret := 0.070503
								if( nvi_ema > 2.7415 )
									ret := 0.160760
							if( marron_mean > 109.787 )
								if( nvimin <= 3.35663 )
									ret := 0.262088
								if( nvimin > 3.35663 )
									ret := -0.116162
						if( tprice > 35.1916 )
							if( nvi_ema <= 3.14719 )
								if( pvimax <= -2.44871 )
									ret := -0.157143
								if( pvimax > -2.44871 )
									ret := 0.039624
							if( nvi_ema > 3.14719 )
								if( xmf <= 60.6247 )
									ret := -0.046296
								if( xmf > 60.6247 )
									ret := 0.505882
					if( marron > 113.965 )
						if( xmf <= 92.7227 )
							if( verde_media <= 75.9293 )
								if( nvimax <= 0.945918 )
									ret := -0.226629
								if( nvimax > 0.945918 )
									ret := -0.006163
							if( verde_media > 75.9293 )
								if( nvimin <= 0.606307 )
									ret := 0.420765
								if( nvimin > 0.606307 )
									ret := 0.037118
						if( xmf > 92.7227 )
							if( source <= 10.6798 )
								if( tprice <= 9.6225 )
									ret := -0.166667
								if( tprice > 9.6225 )
									ret := -0.923077 // sell
							if( source > 10.6798 )
								if( nvim <= 3.149 )
									ret := 0.421927
								if( nvim > 3.149 )
									ret := -0.078125
			if( source > 56.8805 )
				if( media <= 70.4604 )
					if( xrsi <= 42.3139 )
						if( marron_mean <= 48.9656 )
							if( verde_azul <= 21.3548 )
								if( stoc <= 15.5962 )
									ret := 0.142857
								if( stoc > 15.5962 )
									ret := -0.909091 // sell
							if( verde_azul > 21.3548 )
								if( BollOsc <= -41.5729 )
									ret := -0.750000 // sell
								if( BollOsc > -41.5729 )
									ret := -1.000000 // sell
						if( marron_mean > 48.9656 )
							ret := 0.750000 // buy
					if( xrsi > 42.3139 )
						if( verde_azul <= 146.053 )
							if( media_azul <= 66.1852 )
								if( azul <= 17.796 )
									ret := 0.053763
								if( azul > 17.796 )
									ret := 0.782609 // buy
							if( media_azul > 66.1852 )
								if( stoc <= 36.1126 )
									ret := -0.181818
								if( stoc > 36.1126 )
									ret := 0.895833 // buy
						if( verde_azul > 146.053 )
							if( nvim <= 3.31955 )
								ret := -1.000000 // sell
							if( nvim > 3.31955 )
								ret := -0.250000
				if( media > 70.4604 )
					if( azul_mean <= -19.2219 )
						if( oscp <= 14.9376 )
							if( xmf <= 58.6593 )
								ret := 1.000000 // buy
							if( xmf > 58.6593 )
								ret := 0.750000 // buy
						if( oscp > 14.9376 )
							ret := -0.142857
					if( azul_mean > -19.2219 )
						if( xmf <= 34.8644 )
							ret := 1.000000 // buy
						if( xmf > 34.8644 )
							if( oscp <= 4.36981 )
								if( verde <= 82.7718 )
									ret := -0.581395
								if( verde > 82.7718 )
									ret := 0.133333
							if( oscp > 4.36981 )
								if( verde <= 138.77 )
									ret := -0.768595 // sell
								if( verde > 138.77 )
									ret := -0.343750
		if( pvimax > -0.924913 )
			if( azul <= -45.2061 )
				if( azul <= -64.4549 )
					if( verde_mean <= 102.143 )
						if( source <= 26.5283 )
							if( pvimax <= -0.679424 )
								if( pvimin <= -0.828995 )
									ret := 1.000000 // buy
								if( pvimin > -0.828995 )
									ret := 0.000000
							if( pvimax > -0.679424 )
								ret := 1.000000 // buy
						if( source > 26.5283 )
							ret := -0.285714
					if( verde_mean > 102.143 )
						if( nvi_ema <= 0.038332 )
							if( verde_mean <= 109.264 )
								ret := -0.750000 // sell
							if( verde_mean > 109.264 )
								ret := 0.000000
						if( nvi_ema > 0.038332 )
							ret := -1.000000 // sell
				if( azul > -64.4549 )
					if( verde_media <= 48.1403 )
						if( azul_mean <= -60.3595 )
							if( verde_mean <= 20.2872 )
								ret := 0.800000 // buy
							if( verde_mean > 20.2872 )
								ret := -0.166667
						if( azul_mean > -60.3595 )
							if( xmf <= 31.7561 )
								if( nvi <= -0.17044 )
									ret := -0.750000 // sell
								if( nvi > -0.17044 )
									ret := 0.250000
							if( xmf > 31.7561 )
								if( azul_mean <= -1.59747 )
									ret := -0.739130 // sell
								if( azul_mean > -1.59747 )
									ret := 0.200000
					if( verde_media > 48.1403 )
						if( pvi <= -0.656695 )
							ret := 0.000000
						if( pvi > -0.656695 )
							ret := 1.000000 // buy
			if( azul > -45.2061 )
				if( nvimin <= -0.117615 )
					if( pvi_ema <= -0.91572 )
						if( xmf <= 42.1268 )
							if( stoc <= 21.3442 )
								if( azul <= -8.10427 )
									ret := 0.285714
								if( azul > -8.10427 )
									ret := -0.611111
							if( stoc > 21.3442 )
								if( media <= 57.2459 )
									ret := 1.000000 // buy
								if( media > 57.2459 )
									ret := 0.000000
						if( xmf > 42.1268 )
							if( pvi <= -1.03069 )
								if( pvi <= -1.05054 )
									ret := 0.000000
								if( pvi > -1.05054 )
									ret := 1.000000 // buy
							if( pvi > -1.03069 )
								if( verde_azul <= 124.236 )
									ret := -0.502857
								if( verde_azul > 124.236 )
									ret := 0.466667
					if( pvi_ema > -0.91572 )
						if( nvim <= -0.263434 )
							if( pvi <= -0.666005 )
								if( nvi <= -0.272877 )
									ret := 0.000000
								if( nvi > -0.272877 )
									ret := 0.478873
							if( pvi > -0.666005 )
								ret := -1.000000 // sell
						if( nvim > -0.263434 )
							if( nvi_ema <= -0.101829 )
								if( tprice <= 27.99 )
									ret := 0.032675
								if( tprice > 27.99 )
									ret := -0.677419
							if( nvi_ema > -0.101829 )
								if( nvi_ema <= -0.084022 )
									ret := 0.435028
								if( nvi_ema > -0.084022 )
									ret := -0.583333
				if( nvimin > -0.117615 )
					if( xmf <= 70.805 )
						if( verde <= 46.0186 )
							if( verde <= 12.8947 )
								if( azul <= -32.9155 )
									ret := -0.684211
								if( azul > -32.9155 )
									ret := 0.120160
							if( verde > 12.8947 )
								if( source <= 58.8526 )
									ret := -0.135723
								if( source > 58.8526 )
									ret := -0.515924
						if( verde > 46.0186 )
							if( BollOsc <= -7.77695 )
								if( verde_media <= -22.1124 )
									ret := -0.529412
								if( verde_media > -22.1124 )
									ret := 0.399254
							if( BollOsc > -7.77695 )
								if( pvi <= -1.03171 )
									ret := 0.553571
								if( pvi > -1.03171 )
									ret := -0.009718
					if( xmf > 70.805 )
						if( pvim <= -0.711368 )
							if( pvimin <= -0.755277 )
								if( verde_azul <= 166.005 )
									ret := -0.050725
								if( verde_azul > 166.005 )
									ret := -0.709677 // sell
							if( pvimin > -0.755277 )
								if( verde <= 144.508 )
									ret := 0.238095
								if( verde > 144.508 )
									ret := 0.933333 // buy
						if( pvim > -0.711368 )
							if( BollOsc <= 64.8491 )
								if( stoc <= 90.1069 )
									ret := -0.500000
								if( stoc > 90.1069 )
									ret := 0.153846
							if( BollOsc > 64.8491 )
								if( pvim <= -0.602008 )
									ret := -0.352941
								if( pvim > -0.602008 )
									ret := 0.419355
	
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
float op_operation = decision_tree_0_AVAXUSDT_15Min_9eb71b05(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


