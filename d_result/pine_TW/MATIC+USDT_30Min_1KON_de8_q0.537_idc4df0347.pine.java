//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: MATICUSDT_30Min_1KON_c4df0347 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_1KON_c4df0347", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_c4df0347(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( source <= 1.47033 )
		if( nvi_ema <= 1.94354 )
			if( verde_azul <= 1.00422 )
				if( xrsi <= 46.4378 )
					if( nvi <= 0.35929 )
						if( pvi_ema <= -0.14163 )
							if( BollOsc <= -31.1016 )
								if( xrsi <= 20.8355 )
									ret := 0.256410
								if( xrsi > 20.8355 )
									ret := -0.358491
							if( BollOsc > -31.1016 )
								if( xmf <= 37.1438 )
									ret := 0.267857
								if( xmf > 37.1438 )
									ret := -0.200000
						if( pvi_ema > -0.14163 )
							if( verde_media <= -40.0448 )
								if( media <= 44.7845 )
									ret := 0.072464
								if( media > 44.7845 )
									ret := -0.480000
							if( verde_media > -40.0448 )
								if( verde_media <= 1.23491 )
									ret := 0.775862 // buy
								if( verde_media > 1.23491 )
									ret := -0.600000
					if( nvi > 0.35929 )
						if( pvimax <= 4.41991 )
							if( marron <= 0.07814 )
								if( azul <= 0.429363 )
									ret := 0.727660 // buy
								if( azul > 0.429363 )
									ret := 0.333333
							if( marron > 0.07814 )
								if( verde_azul <= -28.6038 )
									ret := 0.101928
								if( verde_azul > -28.6038 )
									ret := 0.381151
						if( pvimax > 4.41991 )
							if( xrsi <= 44.7963 )
								if( xmf <= 20.3168 )
									ret := 0.347826
								if( xmf > 20.3168 )
									ret := 0.089037
							if( xrsi > 44.7963 )
								if( xrsi <= 45.8507 )
									ret := -0.809524 // sell
								if( xrsi > 45.8507 )
									ret := -0.166667
				if( xrsi > 46.4378 )
					if( oscp <= -28.9855 )
						if( verde_mean <= 8.17422 )
							if( xrsi <= 47.8635 )
								ret := 0.500000
							if( xrsi > 47.8635 )
								ret := 1.000000 // buy
						if( verde_mean > 8.17422 )
							if( oscp <= -41.0536 )
								ret := -0.571429
							if( oscp > -41.0536 )
								if( BollOsc <= -6.3076 )
									ret := 0.714286 // buy
								if( BollOsc > -6.3076 )
									ret := -0.250000
					if( oscp > -28.9855 )
						if( tprice <= 0.52767 )
							if( verde_azul <= -35.8928 )
								if( pvimin <= -0.228455 )
									ret := -0.750000 // sell
								if( pvimin > -0.228455 )
									ret := -1.000000 // sell
							if( verde_azul > -35.8928 )
								if( stoc <= 21.6153 )
									ret := 1.000000 // buy
								if( stoc > 21.6153 )
									ret := -0.147727
						if( tprice > 0.52767 )
							if( BollOsc <= -13.9893 )
								if( media_azul <= 3.25904 )
									ret := 0.833333 // buy
								if( media_azul > 3.25904 )
									ret := -0.400000
							if( BollOsc > -13.9893 )
								if( azul <= 33.6937 )
									ret := 0.250000
								if( azul > 33.6937 )
									ret := -0.784810 // sell
			if( verde_azul > 1.00422 )
				if( verde_media <= 7.4641 )
					if( marron <= 38.8821 )
						if( verde_media <= -18.4333 )
							if( stoc <= 52.0489 )
								if( verde_media <= -40.0513 )
									ret := -0.020024
								if( verde_media > -40.0513 )
									ret := 0.160256
							if( stoc > 52.0489 )
								if( pvi_ema <= -0.089495 )
									ret := 0.083333
								if( pvi_ema > -0.089495 )
									ret := -0.848485 // sell
						if( verde_media > -18.4333 )
							if( azul_mean <= 0.394986 )
								if( stoc <= 44.5118 )
									ret := -0.192541
								if( stoc > 44.5118 )
									ret := 0.446809
							if( azul_mean > 0.394986 )
								if( marron_mean <= 34.278 )
									ret := 0.047809
								if( marron_mean > 34.278 )
									ret := 0.355330
					if( marron > 38.8821 )
						if( verde_media <= -22.6924 )
							if( azul_mean <= 19.0528 )
								if( pvimin <= 5.07016 )
									ret := 0.406275
								if( pvimin > 5.07016 )
									ret := -0.288889
							if( azul_mean > 19.0528 )
								if( pvi_ema <= 0.316709 )
									ret := 0.115385
								if( pvi_ema > 0.316709 )
									ret := -0.489796
						if( verde_media > -22.6924 )
							if( media <= 101.447 )
								if( xrsi <= 63.1433 )
									ret := 0.164859
								if( xrsi > 63.1433 )
									ret := -0.055441
							if( media > 101.447 )
								if( xrsi <= 72.8853 )
									ret := 0.662162
								if( xrsi > 72.8853 )
									ret := -0.023810
				if( verde_media > 7.4641 )
					if( pvimax <= 5.3993 )
						if( marron_mean <= 136.168 )
							if( verde <= 64.2473 )
								if( BollOsc <= -8.12559 )
									ret := 0.060606
								if( BollOsc > -8.12559 )
									ret := -0.171908
							if( verde > 64.2473 )
								if( media <= 79.3049 )
									ret := 0.095951
								if( media > 79.3049 )
									ret := -0.016171
						if( marron_mean > 136.168 )
							if( media <= 111.218 )
								ret := 1.000000 // buy
							if( media > 111.218 )
								ret := 0.000000
					if( pvimax > 5.3993 )
						if( azul <= -27.0524 )
							ret := 1.000000 // buy
						if( azul > -27.0524 )
							if( source <= 1.36842 )
								if( nvi_ema <= 1.21761 )
									ret := -0.052632
								if( nvi_ema > 1.21761 )
									ret := -0.777778 // sell
							if( source > 1.36842 )
								if( media_azul <= 1.7558 )
									ret := -0.250000
								if( media_azul > 1.7558 )
									ret := -0.829268 // sell
		if( nvi_ema > 1.94354 )
			if( verde_media <= 25.6478 )
				if( azul <= -27.6009 )
					if( oscp <= 11.2411 )
						if( pvimin <= 4.53371 )
							if( source <= 0.898611 )
								if( xmf <= 12.0314 )
									ret := -0.288136
								if( xmf > 12.0314 )
									ret := 0.223446
							if( source > 0.898611 )
								if( marron_mean <= 86.3413 )
									ret := 0.625000
								if( marron_mean > 86.3413 )
									ret := 0.000000
						if( pvimin > 4.53371 )
							if( marron_mean <= -0.505055 )
								if( xmf <= 20.2678 )
									ret := 0.163934
								if( xmf > 20.2678 )
									ret := 1.000000 // buy
							if( marron_mean > -0.505055 )
								if( media <= 37.843 )
									ret := -0.219512
								if( media > 37.843 )
									ret := 0.089974
					if( oscp > 11.2411 )
						if( source <= 1.15018 )
							if( azul <= -60.0488 )
								if( azul <= -74.1044 )
									ret := -0.106383
								if( azul > -74.1044 )
									ret := 0.560000
							if( azul > -60.0488 )
								if( verde_mean <= 129.406 )
									ret := -0.108642
								if( verde_mean > 129.406 )
									ret := 0.357143
						if( source > 1.15018 )
							if( pvimax <= 5.18353 )
								if( xmf <= 61.4389 )
									ret := -0.333333
								if( xmf > 61.4389 )
									ret := -0.807692 // sell
							if( pvimax > 5.18353 )
								ret := 0.285714
				if( azul > -27.6009 )
					if( source <= 0.358072 )
						if( oscp <= -0.553594 )
							if( azul_mean <= 28.818 )
								if( BollOsc <= 24.2646 )
									ret := 0.095890
								if( BollOsc > 24.2646 )
									ret := -1.000000 // sell
							if( azul_mean > 28.818 )
								ret := 1.000000 // buy
						if( oscp > -0.553594 )
							if( verde_media <= 17.0093 )
								if( marron_mean <= 29.5144 )
									ret := -0.200000
								if( marron_mean > 29.5144 )
									ret := 0.790323 // buy
							if( verde_media > 17.0093 )
								if( azul_mean <= 9.04244 )
									ret := 0.363636
								if( azul_mean > 9.04244 )
									ret := -1.000000 // sell
					if( source > 0.358072 )
						if( xmf <= 59.4158 )
							if( oscp <= -0.974821 )
								if( marron <= -22.8245 )
									ret := 0.464286
								if( marron > -22.8245 )
									ret := -0.002720
							if( oscp > -0.974821 )
								if( oscp <= 2.58154 )
									ret := 0.122545
								if( oscp > 2.58154 )
									ret := 0.022461
						if( xmf > 59.4158 )
							if( azul <= 19.1426 )
								if( media_azul <= 120.081 )
									ret := -0.074106
								if( media_azul > 120.081 )
									ret := 0.165000
							if( azul > 19.1426 )
								if( verde_media <= 22.3233 )
									ret := 0.027180
								if( verde_media > 22.3233 )
									ret := 0.367925
			if( verde_media > 25.6478 )
				if( pvi <= 4.98869 )
					if( nvi_ema <= 2.59739 )
						if( verde_azul <= 105.025 )
							if( verde_azul <= 89.169 )
								if( tprice <= 1.02951 )
									ret := 0.090487
								if( tprice > 1.02951 )
									ret := 0.321267
							if( verde_azul > 89.169 )
								if( stoc <= 30.2922 )
									ret := -1.000000 // sell
								if( stoc > 30.2922 )
									ret := 0.357035
						if( verde_azul > 105.025 )
							if( verde_media <= 54.9736 )
								if( pvim <= 3.66658 )
									ret := 0.326087
								if( pvim > 3.66658 )
									ret := -0.012640
							if( verde_media > 54.9736 )
								if( azul_mean <= 59.4929 )
									ret := 0.247681
								if( azul_mean > 59.4929 )
									ret := -1.000000 // sell
					if( nvi_ema > 2.59739 )
						if( azul_mean <= 57.5526 )
							if( xrsi <= 87.1998 )
								if( xrsi <= 81.3985 )
									ret := 0.056199
								if( xrsi > 81.3985 )
									ret := 0.422680
							if( xrsi > 87.1998 )
								if( oscp <= 65.5222 )
									ret := -0.491803
								if( oscp > 65.5222 )
									ret := 0.307692
						if( azul_mean > 57.5526 )
							if( xrsi <= 56.8302 )
								ret := -1.000000 // sell
							if( xrsi > 56.8302 )
								if( BollOsc <= 54.0011 )
									ret := -0.225806
								if( BollOsc > 54.0011 )
									ret := -0.777778 // sell
				if( pvi > 4.98869 )
					if( marron <= 124.208 )
						if( verde_media <= 51.1437 )
							if( nvi <= 2.04724 )
								if( tprice <= 0.931475 )
									ret := 0.058824
								if( tprice > 0.931475 )
									ret := -0.500000
							if( nvi > 2.04724 )
								if( nvimax <= 2.07205 )
									ret := 0.687500
								if( nvimax > 2.07205 )
									ret := 0.022222
						if( verde_media > 51.1437 )
							if( pvi_ema <= 5.04085 )
								if( xmf <= 80.3363 )
									ret := -0.175926
								if( xmf > 80.3363 )
									ret := 0.444444
							if( pvi_ema > 5.04085 )
								if( nvimin <= 2.13729 )
									ret := -0.750000 // sell
								if( nvimin > 2.13729 )
									ret := -0.275862
					if( marron > 124.208 )
						if( media_azul <= 92.9397 )
							if( marron_mean <= 132.227 )
								if( azul_mean <= 65.4264 )
									ret := 0.263158
								if( azul_mean > 65.4264 )
									ret := 1.000000 // buy
							if( marron_mean > 132.227 )
								if( pvim <= 5.06105 )
									ret := 0.750000 // buy
								if( pvim > 5.06105 )
									ret := 1.000000 // buy
						if( media_azul > 92.9397 )
							if( verde <= 199.137 )
								if( azul <= 13.4784 )
									ret := 0.172414
								if( azul > 13.4784 )
									ret := -0.833333 // sell
							if( verde > 199.137 )
								ret := -1.000000 // sell
	if( source > 1.47033 )
		if( xrsi <= 24.5961 )
			if( verde_media <= -62.7354 )
				if( xmf <= 25.3717 )
					if( source <= 2.00517 )
						if( pvimax <= 5.25292 )
							if( stoc <= 20.9028 )
								if( BollOsc <= -59.6418 )
									ret := -0.933333 // sell
								if( BollOsc > -59.6418 )
									ret := -0.166667
							if( stoc > 20.9028 )
								ret := -0.142857
						if( pvimax > 5.25292 )
							if( verde_mean <= -31.8424 )
								if( azul <= -18.012 )
									ret := -0.035714
								if( azul > -18.012 )
									ret := 0.785714 // buy
							if( verde_mean > -31.8424 )
								if( media <= 46.0866 )
									ret := -0.480000
								if( media > 46.0866 )
									ret := 1.000000 // buy
					if( source > 2.00517 )
						if( media_azul <= 29.4686 )
							ret := -0.333333
						if( media_azul > 29.4686 )
							ret := -1.000000 // sell
				if( xmf > 25.3717 )
					if( marron <= -11.8233 )
						ret := -0.250000
					if( marron > -11.8233 )
						if( oscp <= -64.5658 )
							ret := 0.250000
						if( oscp > -64.5658 )
							if( xmf <= 31.5829 )
								ret := 1.000000 // buy
							if( xmf > 31.5829 )
								ret := 0.500000
			if( verde_media > -62.7354 )
				if( verde_mean <= 0.775745 )
					if( marron_mean <= 11.9531 )
						if( xmf <= 27.0404 )
							if( nvimin <= 1.99634 )
								if( marron_mean <= 8.28639 )
									ret := 0.557823
								if( marron_mean > 8.28639 )
									ret := -0.181818
							if( nvimin > 1.99634 )
								if( marron_mean <= -4.32298 )
									ret := -0.857143 // sell
								if( marron_mean > -4.32298 )
									ret := 0.428571
						if( xmf > 27.0404 )
							if( pvi <= 5.22665 )
								if( azul <= 0.023407 )
									ret := -0.923077 // sell
								if( azul > 0.023407 )
									ret := 0.000000
							if( pvi > 5.22665 )
								if( BollOsc <= -54.5471 )
									ret := -0.400000
								if( BollOsc > -54.5471 )
									ret := 0.464286
					if( marron_mean > 11.9531 )
						if( media <= 18.8594 )
							if( BollOsc <= -54.638 )
								ret := 0.500000
							if( BollOsc > -54.638 )
								ret := 1.000000 // buy
						if( media > 18.8594 )
							ret := 0.333333
				if( verde_mean > 0.775745 )
					if( verde_mean <= 6.02218 )
						ret := -1.000000 // sell
					if( verde_mean > 6.02218 )
						if( nvimin <= 1.5696 )
							ret := 0.500000
						if( nvimin > 1.5696 )
							ret := -0.500000
		if( xrsi > 24.5961 )
			if( media <= 27.4482 )
				if( nvi_ema <= 1.62036 )
					if( verde_azul <= -30.5111 )
						if( oscp <= -34.5809 )
							if( azul_mean <= 47.4413 )
								if( xmf <= 37.5388 )
									ret := -0.086957
								if( xmf > 37.5388 )
									ret := -0.666667
							if( azul_mean > 47.4413 )
								ret := -1.000000 // sell
						if( oscp > -34.5809 )
							if( nvimin <= 1.54087 )
								if( stoc <= 26.8901 )
									ret := 0.363636
								if( stoc > 26.8901 )
									ret := 1.000000 // buy
							if( nvimin > 1.54087 )
								ret := -0.857143 // sell
					if( verde_azul > -30.5111 )
						if( marron_mean <= 6.03326 )
							if( pvimax <= 5.66976 )
								if( azul_mean <= -12.2876 )
									ret := 0.645161
								if( azul_mean > -12.2876 )
									ret := -0.038462
							if( pvimax > 5.66976 )
								ret := -1.000000 // sell
						if( marron_mean > 6.03326 )
							if( azul_mean <= 3.16542 )
								if( oscp <= 8.85559 )
									ret := -0.660714
								if( oscp > 8.85559 )
									ret := 0.272727
							if( azul_mean > 3.16542 )
								if( BollOsc <= -22.775 )
									ret := -0.056000
								if( BollOsc > -22.775 )
									ret := -0.623377
				if( nvi_ema > 1.62036 )
					if( tprice <= 2.12288 )
						if( nvimin <= 1.83147 )
							if( BollOsc <= -21.4706 )
								if( stoc <= 14.3856 )
									ret := -0.357143
								if( stoc > 14.3856 )
									ret := 0.432161
							if( BollOsc > -21.4706 )
								if( nvi <= 1.77898 )
									ret := -0.343750
								if( nvi > 1.77898 )
									ret := 0.466667
						if( nvimin > 1.83147 )
							if( stoc <= 21.7006 )
								if( azul_mean <= 4.32478 )
									ret := -0.125000
								if( azul_mean > 4.32478 )
									ret := -0.920000 // sell
							if( stoc > 21.7006 )
								if( source <= 1.69561 )
									ret := -0.120000
								if( source > 1.69561 )
									ret := 0.636364
					if( tprice > 2.12288 )
						if( verde_azul <= 31.4267 )
							if( source <= 2.44217 )
								if( stoc <= 40.668 )
									ret := -0.210526
								if( stoc > 40.668 )
									ret := -1.000000 // sell
							if( source > 2.44217 )
								if( verde_mean <= 16.9537 )
									ret := -0.086957
								if( verde_mean > 16.9537 )
									ret := 0.777778 // buy
						if( verde_azul > 31.4267 )
							if( media <= 26.3116 )
								if( verde_azul <= 53.6723 )
									ret := -1.000000 // sell
								if( verde_azul > 53.6723 )
									ret := -0.400000
							if( media > 26.3116 )
								ret := 0.000000
			if( media > 27.4482 )
				if( verde_media <= -104.841 )
					if( stoc <= 20.8784 )
						ret := -0.250000
					if( stoc > 20.8784 )
						if( azul <= 3.84074 )
							if( tprice <= 1.71237 )
								ret := -0.400000
							if( tprice > 1.71237 )
								ret := -1.000000 // sell
						if( azul > 3.84074 )
							ret := -1.000000 // sell
				if( verde_media > -104.841 )
					if( azul <= -0.83671 )
						if( azul_mean <= -32.1451 )
							if( BollOsc <= -38.6186 )
								if( xrsi <= 36.2969 )
									ret := 0.769231 // buy
								if( xrsi > 36.2969 )
									ret := -0.181818
							if( BollOsc > -38.6186 )
								if( pvi_ema <= 5.03351 )
									ret := 0.113636
								if( pvi_ema > 5.03351 )
									ret := -0.443548
						if( azul_mean > -32.1451 )
							if( pvi <= 5.87507 )
								if( nvi_ema <= 1.68128 )
									ret := 0.108464
								if( nvi_ema > 1.68128 )
									ret := -0.034644
							if( pvi > 5.87507 )
								if( pvi_ema <= 5.85462 )
									ret := -1.000000 // sell
								if( pvi_ema > 5.85462 )
									ret := -0.750000 // sell
					if( azul > -0.83671 )
						if( azul <= 3.81621 )
							if( marron <= 6.0754 )
								if( nvi_ema <= 1.79304 )
									ret := 0.857143 // buy
								if( nvi_ema > 1.79304 )
									ret := -0.200000
							if( marron > 6.0754 )
								if( media <= 34.6925 )
									ret := -0.546296
								if( media > 34.6925 )
									ret := -0.180723
						if( azul > 3.81621 )
							if( stoc <= 85.1731 )
								if( verde_mean <= 106.763 )
									ret := -0.027499
								if( verde_mean > 106.763 )
									ret := 0.284615
							if( stoc > 85.1731 )
								if( BollOsc <= 24.9576 )
									ret := 0.500000
								if( BollOsc > 24.9576 )
									ret := -0.250000
	
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
float op_operation = decision_tree_0_MATICUSDT_30Min_c4df0347(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


