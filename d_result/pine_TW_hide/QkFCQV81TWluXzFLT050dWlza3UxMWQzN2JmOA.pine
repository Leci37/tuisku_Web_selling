//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: BABA_5Min_1KON_11d37bf8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BABA_5Min_1KON_11d37bf8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BABA_5Min_11d37bf8(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( verde_media <= -3.73694 )
		if( media_azul <= 91.6674 )
			if( source <= 115.096 )
				if( azul <= 35.2918 )
					if( marron_mean <= 91.6121 )
						if( azul_mean <= 2.07903 )
							if( azul <= -40.1614 )
								if( stoc <= 16.8948 )
									ret := 0.006742
								if( stoc > 16.8948 )
									ret := -0.459184
							if( azul > -40.1614 )
								if( verde <= -55.5482 )
									ret := 0.185087
								if( verde > -55.5482 )
									ret := 0.044163
						if( azul_mean > 2.07903 )
							if( xrsi <= 39.8717 )
								if( xrsi <= 24.7631 )
									ret := 0.040775
								if( xrsi > 24.7631 )
									ret := 0.226041
							if( xrsi > 39.8717 )
								if( verde_media <= -58.1184 )
									ret := 0.339130
								if( verde_media > -58.1184 )
									ret := 0.052263
					if( marron_mean > 91.6121 )
						if( verde <= 104.299 )
							if( azul_mean <= 12.9471 )
								if( verde <= 77.5621 )
									ret := 0.337931
								if( verde > 77.5621 )
									ret := -0.052980
							if( azul_mean > 12.9471 )
								if( marron <= 102.655 )
									ret := 0.399002
								if( marron > 102.655 )
									ret := -0.307692
						if( verde > 104.299 )
							if( media_azul <= 83.2743 )
								ret := -1.000000 // sell
							if( media_azul > 83.2743 )
								ret := -0.500000
				if( azul > 35.2918 )
					if( marron_mean <= 68.8427 )
						if( media <= 23.7222 )
							if( BollOsc <= -34.7618 )
								if( oscp <= -125.127 )
									ret := -0.750000 // sell
								if( oscp > -125.127 )
									ret := 0.522989
							if( BollOsc > -34.7618 )
								if( media <= 4.87195 )
									ret := -0.941176 // sell
								if( media > 4.87195 )
									ret := -0.086957
						if( media > 23.7222 )
							if( azul_mean <= 6.11804 )
								if( verde_mean <= 9.44438 )
									ret := 0.512821
								if( verde_mean > 9.44438 )
									ret := -0.121212
							if( azul_mean > 6.11804 )
								if( media <= 72.1354 )
									ret := -0.261881
								if( media > 72.1354 )
									ret := 0.090909
					if( marron_mean > 68.8427 )
						if( verde_azul <= 46.0215 )
							if( nvi_ema <= 0.407124 )
								if( azul <= 106.817 )
									ret := 0.485000
								if( azul > 106.817 )
									ret := -0.571429
							if( nvi_ema > 0.407124 )
								if( verde <= 67.7346 )
									ret := 0.260274
								if( verde > 67.7346 )
									ret := -0.263158
						if( verde_azul > 46.0215 )
							if( nvi_ema <= 0.454204 )
								ret := -1.000000 // sell
							if( nvi_ema > 0.454204 )
								ret := 0.000000
			if( source > 115.096 )
				if( nvimin <= 0.452748 )
					if( BollOsc <= 17.8415 )
						ret := 0.857143 // buy
					if( BollOsc > 17.8415 )
						ret := -0.166667
				if( nvimin > 0.452748 )
					if( BollOsc <= -30.0724 )
						if( nvi <= 0.486555 )
							if( BollOsc <= -51.2656 )
								if( verde_media <= -43.2064 )
									ret := -0.250000
								if( verde_media > -43.2064 )
									ret := -1.000000 // sell
							if( BollOsc > -51.2656 )
								if( marron <= 15.2283 )
									ret := 0.750000 // buy
								if( marron > 15.2283 )
									ret := -0.320000
						if( nvi > 0.486555 )
							ret := 1.000000 // buy
					if( BollOsc > -30.0724 )
						if( verde_media <= -24.4045 )
							if( azul_mean <= 2.31186 )
								ret := -0.714286 // sell
							if( azul_mean > 2.31186 )
								ret := 0.166667
						if( verde_media > -24.4045 )
							if( oscp <= -5.64713 )
								ret := -0.500000
							if( oscp > -5.64713 )
								if( verde_mean <= 95.3023 )
									ret := -1.000000 // sell
								if( verde_mean > 95.3023 )
									ret := -0.750000 // sell
		if( media_azul > 91.6674 )
			if( xmf <= 66.2713 )
				if( xrsi <= 16.0588 )
					if( verde_azul <= 144.187 )
						if( azul_mean <= -23.2114 )
							if( nvim <= 0.473507 )
								if( marron <= -10.6821 )
									ret := -0.607143
								if( marron > -10.6821 )
									ret := 0.500000
							if( nvim > 0.473507 )
								ret := -1.000000 // sell
						if( azul_mean > -23.2114 )
							ret := 0.400000
					if( verde_azul > 144.187 )
						ret := 1.000000 // buy
				if( xrsi > 16.0588 )
					if( verde_azul <= 43.6851 )
						if( verde_azul <= -62.6781 )
							ret := -1.000000 // sell
						if( verde_azul > -62.6781 )
							if( stoc <= 9.81114 )
								if( media <= 30.895 )
									ret := -0.833333 // sell
								if( media > 30.895 )
									ret := 0.300000
							if( stoc > 9.81114 )
								if( xrsi <= 26.1315 )
									ret := 0.843750 // buy
								if( xrsi > 26.1315 )
									ret := 0.495652
					if( verde_azul > 43.6851 )
						if( verde_azul <= 93.2972 )
							if( marron <= -16.039 )
								if( verde_media <= -69.6383 )
									ret := 0.000000
								if( verde_media > -69.6383 )
									ret := -0.947368 // sell
							if( marron > -16.039 )
								if( verde <= 26.7487 )
									ret := 0.388350
								if( verde > 26.7487 )
									ret := 0.177819
						if( verde_azul > 93.2972 )
							if( pvi <= -0.492707 )
								if( BollOsc <= 18.0567 )
									ret := 0.228873
								if( BollOsc > 18.0567 )
									ret := -0.341463
							if( pvi > -0.492707 )
								if( oscp <= -3.05125 )
									ret := -0.047619
								if( oscp > -3.05125 )
									ret := 0.460342
			if( xmf > 66.2713 )
				if( xmf <= 78.8197 )
					if( verde_azul <= 110.538 )
						if( verde_mean <= 84.8081 )
							if( marron <= 36.3938 )
								if( pvi_ema <= -0.4116 )
									ret := -0.166667
								if( pvi_ema > -0.4116 )
									ret := -1.000000 // sell
							if( marron > 36.3938 )
								if( stoc <= 29.3129 )
									ret := 0.782609 // buy
								if( stoc > 29.3129 )
									ret := 0.073171
						if( verde_mean > 84.8081 )
							if( nvimax <= 0.419504 )
								if( marron_mean <= 110.309 )
									ret := -0.228346
								if( marron_mean > 110.309 )
									ret := 0.550000
							if( nvimax > 0.419504 )
								if( nvim <= 0.50374 )
									ret := -0.593750
								if( nvim > 0.50374 )
									ret := 0.166667
					if( verde_azul > 110.538 )
						if( oscp <= 7.77886 )
							if( nvi <= 0.448774 )
								if( nvimin <= 0.108871 )
									ret := -0.500000
								if( nvimin > 0.108871 )
									ret := 0.774194 // buy
							if( nvi > 0.448774 )
								if( stoc <= 55.6583 )
									ret := -0.750000 // sell
								if( stoc > 55.6583 )
									ret := 0.250000
						if( oscp > 7.77886 )
							if( nvim <= 0.374183 )
								if( oscp <= 15.0644 )
									ret := -0.500000
								if( oscp > 15.0644 )
									ret := -1.000000 // sell
							if( nvim > 0.374183 )
								if( marron <= 82.0782 )
									ret := -0.071429
								if( marron > 82.0782 )
									ret := 0.846154 // buy
				if( xmf > 78.8197 )
					if( verde_azul <= 68.9163 )
						if( pvi_ema <= -0.286912 )
							ret := 0.750000 // buy
						if( pvi_ema > -0.286912 )
							ret := 1.000000 // buy
					if( verde_azul > 68.9163 )
						if( nvim <= 0.505829 )
							if( media <= 111.86 )
								if( marron <= 84.0925 )
									ret := 0.266667
								if( marron > 84.0925 )
									ret := -0.114286
							if( media > 111.86 )
								ret := 1.000000 // buy
						if( nvim > 0.505829 )
							ret := 1.000000 // buy
	if( verde_media > -3.73694 )
		if( xrsi <= 47.8001 )
			if( stoc <= 48.7498 )
				if( source <= 82.5909 )
					if( nvi <= 0.349581 )
						if( azul <= 32.242 )
							if( marron_mean <= 25.3405 )
								if( azul <= -1.455 )
									ret := 0.317308
								if( azul > -1.455 )
									ret := 0.635593
							if( marron_mean > 25.3405 )
								if( verde <= 47.8375 )
									ret := 0.028926
								if( verde > 47.8375 )
									ret := 0.413613
						if( azul > 32.242 )
							if( verde_mean <= 4.39335 )
								ret := -1.000000 // sell
							if( verde_mean > 4.39335 )
								if( media_azul <= -7.55501 )
									ret := 0.333333
								if( media_azul > -7.55501 )
									ret := -0.666667
					if( nvi > 0.349581 )
						if( verde_mean <= 43.921 )
							if( xmf <= 37.5092 )
								if( azul <= -11.309 )
									ret := -0.075472
								if( azul > -11.309 )
									ret := 0.250348
							if( xmf > 37.5092 )
								if( azul <= 4.09331 )
									ret := -0.129881
								if( azul > 4.09331 )
									ret := 0.033898
						if( verde_mean > 43.921 )
							if( azul_mean <= -16.4831 )
								if( oscp <= 12.8068 )
									ret := 0.622857
								if( oscp > 12.8068 )
									ret := 0.141463
							if( azul_mean > -16.4831 )
								if( source <= 72.8543 )
									ret := -0.166667
								if( source > 72.8543 )
									ret := 0.158809
				if( source > 82.5909 )
					if( xmf <= 74.8843 )
						if( verde_media <= 18.8234 )
							if( verde <= 34.4753 )
								if( media_azul <= 53.3462 )
									ret := -0.055396
								if( media_azul > 53.3462 )
									ret := -0.583333
							if( verde > 34.4753 )
								if( nvimin <= 0.240115 )
									ret := 0.196429
								if( nvimin > 0.240115 )
									ret := -0.057315
						if( verde_media > 18.8234 )
							if( media_azul <= 25.4738 )
								if( pvimin <= -0.162231 )
									ret := 0.305882
								if( pvimin > -0.162231 )
									ret := -0.229508
							if( media_azul > 25.4738 )
								if( marron_mean <= 12.2802 )
									ret := 0.666667
								if( marron_mean > 12.2802 )
									ret := -0.371134
					if( xmf > 74.8843 )
						if( verde <= 57.4114 )
							if( stoc <= 11.1195 )
								ret := -0.500000
							if( stoc > 11.1195 )
								if( nvi_ema <= 0.162354 )
									ret := 0.133333
								if( nvi_ema > 0.162354 )
									ret := 0.686567
						if( verde > 57.4114 )
							if( stoc <= 14.9997 )
								if( pvimin <= -0.277574 )
									ret := 0.000000
								if( pvimin > -0.277574 )
									ret := -1.000000 // sell
							if( stoc > 14.9997 )
								if( stoc <= 21.5599 )
									ret := 0.518519
								if( stoc > 21.5599 )
									ret := 0.025862
			if( stoc > 48.7498 )
				if( media <= 30.4814 )
					if( xrsi <= 40.8061 )
						if( oscp <= 4.67111 )
							if( marron <= 35.1135 )
								if( tprice <= 80.8681 )
									ret := 0.642857
								if( tprice > 80.8681 )
									ret := 0.000000
							if( marron > 35.1135 )
								if( nvimax <= 0.497652 )
									ret := -0.097561
								if( nvimax > 0.497652 )
									ret := -0.666667
						if( oscp > 4.67111 )
							ret := 1.000000 // buy
					if( xrsi > 40.8061 )
						if( nvim <= 0.153527 )
							if( verde_azul <= 16.3678 )
								ret := 1.000000 // buy
							if( verde_azul > 16.3678 )
								if( pvimax <= -0.095057 )
									ret := 0.000000
								if( pvimax > -0.095057 )
									ret := -0.750000 // sell
						if( nvim > 0.153527 )
							if( media_azul <= 28.6864 )
								if( BollOsc <= -11.4741 )
									ret := 0.555556
								if( BollOsc > -11.4741 )
									ret := 0.835165 // buy
							if( media_azul > 28.6864 )
								if( xrsi <= 42.9836 )
									ret := 1.000000 // buy
								if( xrsi > 42.9836 )
									ret := 0.200000
				if( media > 30.4814 )
					if( azul <= 5.3392 )
						if( azul_mean <= -56.3457 )
							if( marron <= 58.7317 )
								if( nvimin <= 0.428894 )
									ret := 1.000000 // buy
								if( nvimin > 0.428894 )
									ret := 0.750000 // buy
							if( marron > 58.7317 )
								ret := 0.250000
						if( azul_mean > -56.3457 )
							if( verde_mean <= 57.2438 )
								if( xmf <= 25.358 )
									ret := 0.522727
								if( xmf > 25.358 )
									ret := -0.161959
							if( verde_mean > 57.2438 )
								if( media <= 68.2096 )
									ret := 0.169251
								if( media > 68.2096 )
									ret := -0.216216
					if( azul > 5.3392 )
						if( verde_media <= 17.0614 )
							if( marron_mean <= 36.2552 )
								if( oscp <= -12.1183 )
									ret := 0.000000
								if( oscp > -12.1183 )
									ret := -0.666667
							if( marron_mean > 36.2552 )
								if( source <= 72.4466 )
									ret := -0.025641
								if( source > 72.4466 )
									ret := 0.460265
						if( verde_media > 17.0614 )
							if( media_azul <= 26.5543 )
								if( azul <= 20.9262 )
									ret := -0.521739
								if( azul > 20.9262 )
									ret := 0.080645
							if( media_azul > 26.5543 )
								if( BollOsc <= 29.6502 )
									ret := 0.407407
								if( BollOsc > 29.6502 )
									ret := 0.000000
		if( xrsi > 47.8001 )
			if( stoc <= 57.6157 )
				if( verde_media <= 19.2676 )
					if( marron_mean <= 70.9016 )
						if( azul_mean <= 55.8043 )
							if( azul <= 63.4295 )
								if( stoc <= 23.2865 )
									ret := -0.181818
								if( stoc > 23.2865 )
									ret := 0.092523
							if( azul > 63.4295 )
								if( verde_mean <= 37.5907 )
									ret := 0.000000
								if( verde_mean > 37.5907 )
									ret := 0.826087 // buy
						if( azul_mean > 55.8043 )
							if( xmf <= 59.9644 )
								if( verde_media <= 2.66846 )
									ret := -0.700000 // sell
								if( verde_media > 2.66846 )
									ret := -1.000000 // sell
							if( xmf > 59.9644 )
								ret := 0.000000
					if( marron_mean > 70.9016 )
						if( pvi <= -0.29189 )
							if( oscp <= 18.5046 )
								if( marron_mean <= 97.8711 )
									ret := 0.008016
								if( marron_mean > 97.8711 )
									ret := -0.540984
							if( oscp > 18.5046 )
								if( marron <= 70.1247 )
									ret := -0.333333
								if( marron > 70.1247 )
									ret := 0.682927
						if( pvi > -0.29189 )
							if( azul_mean <= 25.068 )
								if( pvimin <= -0.173152 )
									ret := -0.560811
								if( pvimin > -0.173152 )
									ret := -0.230047
							if( azul_mean > 25.068 )
								if( stoc <= 38.1161 )
									ret := 0.947368 // buy
								if( stoc > 38.1161 )
									ret := -0.111111
				if( verde_media > 19.2676 )
					if( verde <= 138.707 )
						if( azul_mean <= 26.6213 )
							if( source <= 95.0079 )
								if( oscp <= 6.62411 )
									ret := -0.044346
								if( oscp > 6.62411 )
									ret := -0.201929
							if( source > 95.0079 )
								if( media_azul <= 44.4754 )
									ret := 0.488095
								if( media_azul > 44.4754 )
									ret := -0.009434
						if( azul_mean > 26.6213 )
							if( nvimin <= 0.076723 )
								if( nvimin <= 0.044771 )
									ret := 0.250000
								if( nvimin > 0.044771 )
									ret := 1.000000 // buy
							if( nvimin > 0.076723 )
								if( oscp <= -0.771499 )
									ret := -0.137931
								if( oscp > -0.771499 )
									ret := -0.592308
					if( verde > 138.707 )
						if( verde <= 173.769 )
							if( verde_mean <= 38.9581 )
								ret := -1.000000 // sell
							if( verde_mean > 38.9581 )
								if( media_azul <= 133.884 )
									ret := 0.454082
								if( media_azul > 133.884 )
									ret := -0.555556
						if( verde > 173.769 )
							if( xmf <= 95.8039 )
								if( oscp <= 78.321 )
									ret := 0.180000
								if( oscp > 78.321 )
									ret := -0.300885
							if( xmf > 95.8039 )
								if( verde_azul <= 225.851 )
									ret := -1.000000 // sell
								if( verde_azul > 225.851 )
									ret := -0.750000 // sell
			if( stoc > 57.6157 )
				if( azul_mean <= 11.7825 )
					if( azul <= -19.6452 )
						if( tprice <= 92.1973 )
							if( verde_azul <= 90.325 )
								if( verde_mean <= 40.528 )
									ret := 0.500000
								if( verde_mean > 40.528 )
									ret := -0.882353 // sell
							if( verde_azul > 90.325 )
								if( media_azul <= 121.173 )
									ret := 0.248721
								if( media_azul > 121.173 )
									ret := 0.085635
						if( tprice > 92.1973 )
							if( xrsi <= 63.5283 )
								if( marron_mean <= 93.7882 )
									ret := -0.595890
								if( marron_mean > 93.7882 )
									ret := -0.027027
							if( xrsi > 63.5283 )
								if( media_azul <= 176.725 )
									ret := 0.285068
								if( media_azul > 176.725 )
									ret := -0.652174
					if( azul > -19.6452 )
						if( oscp <= 98.5056 )
							if( BollOsc <= 71.0235 )
								if( xmf <= 55.5544 )
									ret := 0.022992
								if( xmf > 55.5544 )
									ret := -0.057909
							if( BollOsc > 71.0235 )
								if( verde <= 203.487 )
									ret := 0.272222
								if( verde > 203.487 )
									ret := -0.245614
						if( oscp > 98.5056 )
							if( marron_mean <= 122.63 )
								if( source <= 94.5455 )
									ret := 0.142105
								if( source > 94.5455 )
									ret := -0.846154 // sell
							if( marron_mean > 122.63 )
								if( BollOsc <= 62.6439 )
									ret := 0.210526
								if( BollOsc > 62.6439 )
									ret := 0.875000 // buy
				if( azul_mean > 11.7825 )
					if( oscp <= 9.26985 )
						if( verde <= 83.6657 )
							if( verde_azul <= 33.6375 )
								if( azul <= 79.9188 )
									ret := -0.358696
								if( azul > 79.9188 )
									ret := 0.275000
							if( verde_azul > 33.6375 )
								if( azul_mean <= 41.3341 )
									ret := 0.126025
								if( azul_mean > 41.3341 )
									ret := -0.406250
						if( verde > 83.6657 )
							if( media <= 86.2562 )
								if( azul_mean <= 14.6488 )
									ret := 0.104520
								if( azul_mean > 14.6488 )
									ret := 0.317361
							if( media > 86.2562 )
								if( stoc <= 86.5707 )
									ret := -0.044405
								if( stoc > 86.5707 )
									ret := 0.189487
					if( oscp > 9.26985 )
						if( marron_mean <= 134.132 )
							if( tprice <= 110.776 )
								if( azul_mean <= 22.2065 )
									ret := 0.110538
								if( azul_mean > 22.2065 )
									ret := -0.038436
							if( tprice > 110.776 )
								if( pvim <= -0.077384 )
									ret := -0.882353 // sell
								if( pvim > -0.077384 )
									ret := -0.200000
						if( marron_mean > 134.132 )
							if( xmf <= 82.0902 )
								if( pvi_ema <= -0.132085 )
									ret := 0.428571
								if( pvi_ema > -0.132085 )
									ret := -0.750000 // sell
							if( xmf > 82.0902 )
								if( azul <= 68.1456 )
									ret := -0.683168
								if( azul > 68.1456 )
									ret := -0.048780
	
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
float op_operation = decision_tree_0_BABA_5Min_11d37bf8(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


