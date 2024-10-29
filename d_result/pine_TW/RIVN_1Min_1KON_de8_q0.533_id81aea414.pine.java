//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: RIVN_1Min_1KON_81aea414 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RIVN_1Min_1KON_81aea414", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RIVN_1Min_81aea414(nvimin, azul, nvim, marron_mean, marron, nvimax, pvi, pvi_ema, oscp, verde, source, stoc, verde_mean, xrsi, media, xmf, tprice, pvimin, media_azul, verde_media, BollOsc, pvimax, nvi_ema, azul_mean, pvim, nvi, verde_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( xrsi <= 50.4384 )
		if( nvim <= 0.324486 )
			if( BollOsc <= -27.5584 )
				if( verde_azul <= 44.1677 )
					if( azul_mean <= -4.34784 )
						if( tprice <= 13.9007 )
							if( verde_media <= -104.689 )
								if( xmf <= 21.2806 )
									ret := -0.392308
								if( xmf > 21.2806 )
									ret := 0.304348
							if( verde_media > -104.689 )
								if( media_azul <= 28.5538 )
									ret := 0.028448
								if( media_azul > 28.5538 )
									ret := 0.190820
						if( tprice > 13.9007 )
							if( marron <= -4.44867 )
								if( verde <= -52.0602 )
									ret := -0.076555
								if( verde > -52.0602 )
									ret := 0.431193
							if( marron > -4.44867 )
								if( verde <= 28.3694 )
									ret := -0.060173
								if( verde > 28.3694 )
									ret := 0.397727
					if( azul_mean > -4.34784 )
						if( verde_media <= -92.9406 )
							if( verde_mean <= -96.1551 )
								if( verde_azul <= -197.475 )
									ret := -0.894737 // sell
								if( verde_azul > -197.475 )
									ret := 0.310345
							if( verde_mean > -96.1551 )
								if( oscp <= -96.4927 )
									ret := 0.714286 // buy
								if( oscp > -96.4927 )
									ret := 0.405034
						if( verde_media > -92.9406 )
							if( xmf <= 18.1398 )
								if( azul <= 2.71639 )
									ret := 0.185410
								if( azul > 2.71639 )
									ret := -0.059429
							if( xmf > 18.1398 )
								if( source <= 8.5838 )
									ret := -0.415385
								if( source > 8.5838 )
									ret := 0.180160
				if( verde_azul > 44.1677 )
					if( xrsi <= 38.8329 )
						if( azul_mean <= -44.4029 )
							if( azul <= -34.8918 )
								if( marron_mean <= 45.056 )
									ret := 0.686275
								if( marron_mean > 45.056 )
									ret := -0.257143
							if( azul > -34.8918 )
								if( verde_media <= -5.64527 )
									ret := -0.823529 // sell
								if( verde_media > -5.64527 )
									ret := 0.600000
						if( azul_mean > -44.4029 )
							if( azul <= -60.7157 )
								if( marron_mean <= 31.7792 )
									ret := -0.419753
								if( marron_mean > 31.7792 )
									ret := 0.327869
							if( azul > -60.7157 )
								if( oscp <= 8.14701 )
									ret := 0.405864
								if( oscp > 8.14701 )
									ret := 0.058824
					if( xrsi > 38.8329 )
						if( pvimax <= 0.820237 )
							if( stoc <= 15.5915 )
								if( media <= 66.2804 )
									ret := -0.009662
								if( media > 66.2804 )
									ret := -0.527778
							if( stoc > 15.5915 )
								if( BollOsc <= -42.1089 )
									ret := 0.457447
								if( BollOsc > -42.1089 )
									ret := 0.186104
						if( pvimax > 0.820237 )
							if( azul_mean <= -27.5834 )
								ret := -1.000000 // sell
							if( azul_mean > -27.5834 )
								ret := -0.333333
			if( BollOsc > -27.5584 )
				if( media_azul <= 60.2237 )
					if( oscp <= -61.2515 )
						if( xmf <= 8.66768 )
							if( marron <= 35.8964 )
								ret := -0.750000 // sell
							if( marron > 35.8964 )
								ret := -1.000000 // sell
						if( xmf > 8.66768 )
							if( verde_mean <= -105.003 )
								ret := -0.666667
							if( verde_mean > -105.003 )
								if( nvimin <= 0.244075 )
									ret := 0.763636 // buy
								if( nvimin > 0.244075 )
									ret := -0.142857
					if( oscp > -61.2515 )
						if( verde_azul <= -40.7614 )
							if( media <= 81.9306 )
								if( verde_mean <= 0.568944 )
									ret := -0.441026
								if( verde_mean > 0.568944 )
									ret := -0.077586
							if( media > 81.9306 )
								ret := 1.000000 // buy
						if( verde_azul > -40.7614 )
							if( stoc <= 43.2655 )
								if( verde_azul <= 94.3632 )
									ret := -0.002850
								if( verde_azul > 94.3632 )
									ret := 0.550562
							if( stoc > 43.2655 )
								if( oscp <= -3.15763 )
									ret := 0.151194
								if( oscp > -3.15763 )
									ret := 0.000618
				if( media_azul > 60.2237 )
					if( media_azul <= 185.153 )
						if( oscp <= -1.1508 )
							if( pvi <= 0.831974 )
								if( verde_mean <= 54.5473 )
									ret := 0.121896
								if( verde_mean > 54.5473 )
									ret := 0.246589
							if( pvi > 0.831974 )
								ret := -1.000000 // sell
						if( oscp > -1.1508 )
							if( azul <= -18.8698 )
								if( nvi_ema <= 0.162211 )
									ret := 0.260383
								if( nvi_ema > 0.162211 )
									ret := 0.019313
							if( azul > -18.8698 )
								if( pvimax <= 0.650189 )
									ret := 0.074424
								if( pvimax > 0.650189 )
									ret := -0.202469
					if( media_azul > 185.153 )
						if( tprice <= 9.2025 )
							ret := -0.250000
						if( tprice > 9.2025 )
							if( xrsi <= 48.6942 )
								if( nvi <= 0.236559 )
									ret := 0.935484 // buy
								if( nvi > 0.236559 )
									ret := 0.500000
							if( xrsi > 48.6942 )
								ret := 0.250000
		if( nvim > 0.324486 )
			if( media_azul <= -4.89673 )
				if( azul <= 15.6355 )
					if( marron_mean <= -15.5387 )
						ret := 0.750000 // buy
					if( marron_mean > -15.5387 )
						if( xmf <= 21.2127 )
							if( source <= 13.3574 )
								if( oscp <= -37.1419 )
									ret := -0.600000
								if( oscp > -37.1419 )
									ret := -1.000000 // sell
							if( source > 13.3574 )
								ret := -0.500000
						if( xmf > 21.2127 )
							if( azul <= 13.5456 )
								ret := 0.600000
							if( azul > 13.5456 )
								if( oscp <= -16.3245 )
									ret := -0.500000
								if( oscp > -16.3245 )
									ret := -1.000000 // sell
				if( azul > 15.6355 )
					if( stoc <= 8.27381 )
						if( verde <= -57.9422 )
							ret := 0.333333
						if( verde > -57.9422 )
							ret := 1.000000 // buy
					if( stoc > 8.27381 )
						if( azul_mean <= 71.8743 )
							if( verde_mean <= -81.9509 )
								if( xrsi <= 11.3059 )
									ret := 0.400000
								if( xrsi > 11.3059 )
									ret := -0.891304 // sell
							if( verde_mean > -81.9509 )
								if( oscp <= -66.3521 )
									ret := 0.733333 // buy
								if( oscp > -66.3521 )
									ret := -0.214118
						if( azul_mean > 71.8743 )
							if( verde_azul <= -150.385 )
								ret := -0.285714
							if( verde_azul > -150.385 )
								if( xrsi <= 39.1924 )
									ret := 1.000000 // buy
								if( xrsi > 39.1924 )
									ret := 0.000000
			if( media_azul > -4.89673 )
				if( source <= 10.3486 )
					if( nvimin <= 0.567838 )
						if( oscp <= -39.0371 )
							if( pvi <= -0.146244 )
								if( azul_mean <= 6.08717 )
									ret := -0.200000
								if( azul_mean > 6.08717 )
									ret := 1.000000 // buy
							if( pvi > -0.146244 )
								ret := -1.000000 // sell
						if( oscp > -39.0371 )
							if( media <= 5.07105 )
								ret := -1.000000 // sell
							if( media > 5.07105 )
								if( marron <= 12.8412 )
									ret := 0.843137 // buy
								if( marron > 12.8412 )
									ret := 0.400000
					if( nvimin > 0.567838 )
						if( nvim <= 0.574424 )
							if( pvimax <= -0.228724 )
								if( media <= 43.871 )
									ret := -1.000000 // sell
								if( media > 43.871 )
									ret := 0.000000
							if( pvimax > -0.228724 )
								if( pvi_ema <= -0.233811 )
									ret := 0.250000
								if( pvi_ema > -0.233811 )
									ret := 0.000000
						if( nvim > 0.574424 )
							if( pvi <= -0.306277 )
								if( nvim <= 0.600191 )
									ret := 0.909091 // buy
								if( nvim > 0.600191 )
									ret := 0.222222
							if( pvi > -0.306277 )
								if( source <= 9.92162 )
									ret := -0.473684
								if( source > 9.92162 )
									ret := 0.137226
				if( source > 10.3486 )
					if( azul_mean <= -28.3144 )
						if( verde_mean <= -85.8007 )
							if( verde <= -123.166 )
								ret := 0.750000 // buy
							if( verde > -123.166 )
								ret := 1.000000 // buy
						if( verde_mean > -85.8007 )
							if( marron <= 52.1209 )
								if( media <= 41.9228 )
									ret := -0.083900
								if( media > 41.9228 )
									ret := -0.447368
							if( marron > 52.1209 )
								if( stoc <= 55.5627 )
									ret := 0.409524
								if( stoc > 55.5627 )
									ret := -0.371429
					if( azul_mean > -28.3144 )
						if( tprice <= 13.7882 )
							if( nvi_ema <= 0.49831 )
								if( pvi_ema <= 0.185672 )
									ret := 0.136496
								if( pvi_ema > 0.185672 )
									ret := -0.006873
							if( nvi_ema > 0.49831 )
								if( tprice <= 11.9676 )
									ret := 0.040684
								if( tprice > 11.9676 )
									ret := -0.112903
						if( tprice > 13.7882 )
							if( verde_azul <= -30.7739 )
								if( media_azul <= 61.6099 )
									ret := 0.407407
								if( media_azul > 61.6099 )
									ret := -0.800000 // sell
							if( verde_azul > -30.7739 )
								if( xmf <= 43.093 )
									ret := -0.090323
								if( xmf > 43.093 )
									ret := -0.300429
	if( xrsi > 50.4384 )
		if( media_azul <= 59.0635 )
			if( media <= 107.891 )
				if( pvimin <= -0.045945 )
					if( verde_media <= 80.2829 )
						if( xmf <= 31.8398 )
							if( azul_mean <= -13.1469 )
								if( verde_azul <= 81.0961 )
									ret := 1.000000 // buy
								if( verde_azul > 81.0961 )
									ret := 0.000000
							if( azul_mean > -13.1469 )
								if( media <= 29.4196 )
									ret := 0.392857
								if( media > 29.4196 )
									ret := -0.149644
						if( xmf > 31.8398 )
							if( media <= 96.5845 )
								if( azul <= 14.6474 )
									ret := 0.148116
								if( azul > 14.6474 )
									ret := -0.014366
							if( media > 96.5845 )
								if( marron_mean <= 98.1187 )
									ret := -0.272727
								if( marron_mean > 98.1187 )
									ret := 0.555556
					if( verde_media > 80.2829 )
						if( marron <= 113.576 )
							if( verde_mean <= 106.998 )
								if( oscp <= 52.1716 )
									ret := -0.571429
								if( oscp > 52.1716 )
									ret := 0.142857
							if( verde_mean > 106.998 )
								if( verde_mean <= 117.95 )
									ret := 1.000000 // buy
								if( verde_mean > 117.95 )
									ret := 0.500000
						if( marron > 113.576 )
							if( marron <= 144.457 )
								if( nvimin <= 0.599091 )
									ret := -0.812500 // sell
								if( nvimin > 0.599091 )
									ret := 0.000000
							if( marron > 144.457 )
								ret := 0.200000
				if( pvimin > -0.045945 )
					if( verde_media <= -26.5305 )
						if( xmf <= 53.0782 )
							if( verde_mean <= 37.4397 )
								if( verde_media <= -74.4744 )
									ret := -0.571429
								if( verde_media > -74.4744 )
									ret := 0.124352
							if( verde_mean > 37.4397 )
								if( tprice <= 17.6575 )
									ret := 0.400000
								if( tprice > 17.6575 )
									ret := -0.625000
						if( xmf > 53.0782 )
							if( xrsi <= 54.4185 )
								if( xmf <= 57.9992 )
									ret := -0.322581
								if( xmf > 57.9992 )
									ret := 0.672727
							if( xrsi > 54.4185 )
								if( stoc <= 58.1574 )
									ret := 0.428571
								if( stoc > 58.1574 )
									ret := -0.623188
					if( verde_media > -26.5305 )
						if( stoc <= 75.2825 )
							if( verde <= 101.723 )
								if( verde_media <= 30.454 )
									ret := -0.128546
								if( verde_media > 30.454 )
									ret := 0.024540
							if( verde > 101.723 )
								if( source <= 15.7944 )
									ret := -0.352222
								if( source > 15.7944 )
									ret := 0.105590
						if( stoc > 75.2825 )
							if( nvimax <= -0.096447 )
								if( verde_mean <= 102.348 )
									ret := 0.181818
								if( verde_mean > 102.348 )
									ret := 0.734694 // buy
							if( nvimax > -0.096447 )
								if( BollOsc <= 30.5121 )
									ret := 0.061080
								if( BollOsc > 30.5121 )
									ret := -0.082822
			if( media > 107.891 )
				if( verde_azul <= 88.0692 )
					if( marron <= 123.475 )
						if( media_azul <= 1.40281 )
							ret := 1.000000 // buy
						if( media_azul > 1.40281 )
							if( media <= 111.792 )
								if( source <= 12.0136 )
									ret := 0.250000
								if( source > 12.0136 )
									ret := -0.250000
							if( media > 111.792 )
								ret := -1.000000 // sell
					if( marron > 123.475 )
						if( marron <= 139.341 )
							if( verde <= 134.902 )
								ret := 0.750000 // buy
							if( verde > 134.902 )
								ret := 1.000000 // buy
						if( marron > 139.341 )
							ret := 0.571429
				if( verde_azul > 88.0692 )
					if( xrsi <= 86.7061 )
						if( media <= 109.679 )
							ret := -0.500000
						if( media > 109.679 )
							ret := -1.000000 // sell
					if( xrsi > 86.7061 )
						if( media <= 117.835 )
							if( nvim <= 0.25867 )
								ret := 1.000000 // buy
							if( nvim > 0.25867 )
								ret := 0.750000 // buy
						if( media > 117.835 )
							if( pvim <= 0.086342 )
								ret := 0.750000 // buy
							if( pvim > 0.086342 )
								ret := -0.600000
		if( media_azul > 59.0635 )
			if( oscp <= 15.9848 )
				if( xmf <= 88.9824 )
					if( xrsi <= 72.8533 )
						if( azul <= 24.0217 )
							if( azul_mean <= 16.798 )
								if( azul <= 5.00075 )
									ret := 0.066839
								if( azul > 5.00075 )
									ret := -0.018519
							if( azul_mean > 16.798 )
								if( media <= 73.0997 )
									ret := -0.310811
								if( media > 73.0997 )
									ret := 0.184009
						if( azul > 24.0217 )
							if( verde_azul <= 69.0843 )
								if( verde_media <= -54.1066 )
									ret := -0.692308
								if( verde_media > -54.1066 )
									ret := 0.092357
							if( verde_azul > 69.0843 )
								if( verde <= 114.626 )
									ret := -0.460606
								if( verde > 114.626 )
									ret := -0.129870
					if( xrsi > 72.8533 )
						if( source <= 15.2119 )
							if( oscp <= 6.24217 )
								if( xmf <= 83.0812 )
									ret := 0.027149
								if( xmf > 83.0812 )
									ret := -0.740741 // sell
							if( oscp > 6.24217 )
								if( verde_media <= 13.727 )
									ret := 0.433090
								if( verde_media > 13.727 )
									ret := 0.146110
						if( source > 15.2119 )
							if( pvimin <= 0.723527 )
								if( verde_mean <= 138.913 )
									ret := 0.736111 // buy
								if( verde_mean > 138.913 )
									ret := -0.454545
							if( pvimin > 0.723527 )
								if( azul_mean <= 36.1982 )
									ret := 0.233333
								if( azul_mean > 36.1982 )
									ret := -1.000000 // sell
				if( xmf > 88.9824 )
					if( BollOsc <= 67.0877 )
						if( xrsi <= 83.1368 )
							if( azul <= -21.5278 )
								if( azul_mean <= -9.13692 )
									ret := 0.250000
								if( azul_mean > -9.13692 )
									ret := 1.000000 // buy
							if( azul > -21.5278 )
								if( verde_media <= 49.6889 )
									ret := -0.152809
								if( verde_media > 49.6889 )
									ret := -0.652174
						if( xrsi > 83.1368 )
							if( azul_mean <= 44.4674 )
								if( nvi <= 0.136039 )
									ret := -0.375000
								if( nvi > 0.136039 )
									ret := -0.954545 // sell
							if( azul_mean > 44.4674 )
								ret := -0.166667
					if( BollOsc > 67.0877 )
						if( verde_azul <= 124.701 )
							ret := 1.000000 // buy
						if( verde_azul > 124.701 )
							if( nvi_ema <= 0.041419 )
								ret := 0.500000
							if( nvi_ema > 0.041419 )
								ret := -0.500000
			if( oscp > 15.9848 )
				if( verde_mean <= 158.178 )
					if( marron_mean <= 122.572 )
						if( oscp <= 74.556 )
							if( media_azul <= 99.1161 )
								if( media <= 112.782 )
									ret := -0.050868
								if( media > 112.782 )
									ret := 0.568182
							if( media_azul > 99.1161 )
								if( source <= 14.7325 )
									ret := 0.092459
								if( source > 14.7325 )
									ret := -0.125163
						if( oscp > 74.556 )
							if( BollOsc <= 70.6805 )
								if( stoc <= 56.2992 )
									ret := -0.518519
								if( stoc > 56.2992 )
									ret := -0.114286
							if( BollOsc > 70.6805 )
								if( nvimax <= 0.025075 )
									ret := -0.250000
								if( nvimax > 0.025075 )
									ret := -0.824324 // sell
					if( marron_mean > 122.572 )
						if( verde_mean <= 153.849 )
							if( pvim <= 0.128854 )
								if( media <= 121.632 )
									ret := -0.313253
								if( media > 121.632 )
									ret := 0.666667
							if( pvim > 0.128854 )
								if( media <= 111.009 )
									ret := -0.355556
								if( media > 111.009 )
									ret := -0.844444 // sell
						if( verde_mean > 153.849 )
							if( media_azul <= 112.851 )
								if( pvimax <= 0.462259 )
									ret := 0.500000
								if( pvimax > 0.462259 )
									ret := -0.166667
							if( media_azul > 112.851 )
								if( BollOsc <= 40.3229 )
									ret := 0.000000
								if( BollOsc > 40.3229 )
									ret := -0.944444 // sell
				if( verde_mean > 158.178 )
					if( nvim <= 0.138872 )
						if( stoc <= 78.1115 )
							if( azul_mean <= -4.72254 )
								if( azul <= -93.4929 )
									ret := 0.944444 // buy
								if( azul > -93.4929 )
									ret := 0.048387
							if( azul_mean > -4.72254 )
								if( marron <= 89.5771 )
									ret := 0.200000
								if( marron > 89.5771 )
									ret := -0.758621 // sell
						if( stoc > 78.1115 )
							if( media <= 77.8367 )
								if( marron_mean <= 90.091 )
									ret := 0.300000
								if( marron_mean > 90.091 )
									ret := -0.652174
							if( media > 77.8367 )
								if( media_azul <= 109.536 )
									ret := 0.362126
								if( media_azul > 109.536 )
									ret := 0.690058
					if( nvim > 0.138872 )
						if( verde_mean <= 174.026 )
							if( nvi_ema <= 0.363256 )
								if( xmf <= 98.1147 )
									ret := 0.355346
								if( xmf > 98.1147 )
									ret := -0.500000
							if( nvi_ema > 0.363256 )
								if( marron_mean <= 133.663 )
									ret := -0.170213
								if( marron_mean > 133.663 )
									ret := 1.000000 // buy
						if( verde_mean > 174.026 )
							if( tprice <= 11.4134 )
								if( oscp <= 83.0875 )
									ret := 0.229508
								if( oscp > 83.0875 )
									ret := -0.320388
							if( tprice > 11.4134 )
								if( verde_mean <= 323.105 )
									ret := -0.424138
								if( verde_mean > 323.105 )
									ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_RIVN_1Min_81aea414(nvimin, azul, nvim, marron_mean, marron, nvimax, pvi, pvi_ema, oscp, verde, source, stoc, verde_mean, xrsi, media, xmf, tprice, pvimin, media_azul, verde_media, BollOsc, pvimax, nvi_ema, azul_mean, pvim, nvi, verde_azul)

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


