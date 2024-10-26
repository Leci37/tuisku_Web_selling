//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: PINS_15Min_1KON_b0f4678e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_15Min_1KON_b0f4678e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_15Min_b0f4678e(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( stoc <= 27.5695 )
		if( xrsi <= 26.201 )
			if( nvimax <= 1.91542 )
				if( pvim <= -0.651561 )
					if( verde_media <= -85.2993 )
						if( verde_media <= -132.144 )
							if( media <= 37.2132 )
								ret := -0.312500
							if( media > 37.2132 )
								ret := 0.833333 // buy
						if( verde_media > -132.144 )
							if( stoc <= 22.268 )
								if( azul_mean <= -13.4025 )
									ret := 0.333333
								if( azul_mean > -13.4025 )
									ret := 0.964912 // buy
							if( stoc > 22.268 )
								ret := 0.363636
					if( verde_media > -85.2993 )
						if( media_azul <= 66.0626 )
							if( media_azul <= 15.4338 )
								if( BollOsc <= -61.491 )
									ret := -0.888889 // sell
								if( BollOsc > -61.491 )
									ret := -0.057851
							if( media_azul > 15.4338 )
								if( marron_mean <= -2.02684 )
									ret := -0.011111
								if( marron_mean > -2.02684 )
									ret := 0.334375
						if( media_azul > 66.0626 )
							if( nvim <= 1.78985 )
								if( nvi <= 1.63453 )
									ret := -1.000000 // sell
								if( nvi > 1.63453 )
									ret := -0.500000
							if( nvim > 1.78985 )
								ret := 0.277778
				if( pvim > -0.651561 )
					if( verde_media <= -59.3553 )
						if( pvi <= -0.269131 )
							if( oscp <= -21.1016 )
								if( source <= 17.9596 )
									ret := 0.076923
								if( source > 17.9596 )
									ret := 0.783333 // buy
							if( oscp > -21.1016 )
								ret := -0.066667
						if( pvi > -0.269131 )
							if( nvi_ema <= 1.02165 )
								if( verde_azul <= -32.7262 )
									ret := 0.341137
								if( verde_azul > -32.7262 )
									ret := 0.884615 // buy
							if( nvi_ema > 1.02165 )
								if( marron_mean <= -3.11355 )
									ret := 0.683761
								if( marron_mean > -3.11355 )
									ret := -0.048128
					if( verde_media > -59.3553 )
						if( media <= 9.11603 )
							if( media_azul <= 64.3741 )
								if( source <= 27.3961 )
									ret := 0.405660
								if( source > 27.3961 )
									ret := -0.088106
							if( media_azul > 64.3741 )
								if( media_azul <= 100.393 )
									ret := -0.918367 // sell
								if( media_azul > 100.393 )
									ret := -0.090909
						if( media > 9.11603 )
							if( pvi_ema <= 0.205466 )
								if( tprice <= 20.2124 )
									ret := 0.010526
								if( tprice > 20.2124 )
									ret := 0.442177
							if( pvi_ema > 0.205466 )
								if( nvim <= 1.50629 )
									ret := 0.252212
								if( nvim > 1.50629 )
									ret := -0.750000 // sell
			if( nvimax > 1.91542 )
				if( verde_media <= -71.1359 )
					if( source <= 68.7738 )
						if( xmf <= 0.325553 )
							ret := 0.000000
						if( xmf > 0.325553 )
							if( pvimax <= -0.439902 )
								if( marron_mean <= -4.37192 )
									ret := -1.000000 // sell
								if( marron_mean > -4.37192 )
									ret := -0.785714 // sell
							if( pvimax > -0.439902 )
								if( nvimax <= 2.01513 )
									ret := 0.000000
								if( nvimax > 2.01513 )
									ret := -0.833333 // sell
					if( source > 68.7738 )
						if( nvimax <= 2.0279 )
							ret := 0.857143 // buy
						if( nvimax > 2.0279 )
							if( pvi <= -0.308286 )
								ret := 0.187500
							if( pvi > -0.308286 )
								ret := -0.615385
				if( verde_media > -71.1359 )
					if( BollOsc <= -19.2701 )
						if( xmf <= 22.9902 )
							if( pvi <= -0.31378 )
								if( nvimin <= 1.98751 )
									ret := -0.175000
								if( nvimin > 1.98751 )
									ret := 0.371795
							if( pvi > -0.31378 )
								if( nvi <= 2.00197 )
									ret := -0.791667 // sell
								if( nvi > 2.00197 )
									ret := -0.266667
						if( xmf > 22.9902 )
							if( media <= 6.56556 )
								if( xrsi <= 22.1972 )
									ret := 0.058824
								if( xrsi > 22.1972 )
									ret := -0.600000
							if( media > 6.56556 )
								if( media_azul <= 17.6566 )
									ret := -0.081081
								if( media_azul > 17.6566 )
									ret := 0.606667
					if( BollOsc > -19.2701 )
						if( stoc <= 6.31843 )
							ret := -0.700000 // sell
						if( stoc > 6.31843 )
							ret := -1.000000 // sell
		if( xrsi > 26.201 )
			if( nvim <= 1.70218 )
				if( media <= 47.5422 )
					if( verde_media <= 17.6742 )
						if( source <= 16.9419 )
							if( verde_mean <= 4.68034 )
								if( xmf <= 2.51757 )
									ret := -0.647059
								if( xmf > 2.51757 )
									ret := 0.171271
							if( verde_mean > 4.68034 )
								if( nvim <= 0.380537 )
									ret := 0.260000
								if( nvim > 0.380537 )
									ret := -0.612167
						if( source > 16.9419 )
							if( marron <= 30.1307 )
								if( marron_mean <= 17.5122 )
									ret := 0.019220
								if( marron_mean > 17.5122 )
									ret := 0.137491
							if( marron > 30.1307 )
								if( verde_azul <= 77.315 )
									ret := -0.083514
								if( verde_azul > 77.315 )
									ret := 0.707317 // buy
					if( verde_media > 17.6742 )
						if( nvimin <= 1.22845 )
							if( nvi_ema <= 0.14094 )
								if( tprice <= 26.7025 )
									ret := -0.142857
								if( tprice > 26.7025 )
									ret := 0.566667
							if( nvi_ema > 0.14094 )
								if( source <= 34.8491 )
									ret := -0.501754
								if( source > 34.8491 )
									ret := -0.012500
						if( nvimin > 1.22845 )
							if( marron <= 38.8694 )
								if( verde_mean <= 34.6787 )
									ret := -0.629032
								if( verde_mean > 34.6787 )
									ret := 0.222222
							if( marron > 38.8694 )
								if( media <= 35.0436 )
									ret := 0.186441
								if( media > 35.0436 )
									ret := 0.617647
				if( media > 47.5422 )
					if( azul <= 25.7614 )
						if( source <= 12.191 )
							ret := -0.840000 // sell
						if( source > 12.191 )
							if( pvi_ema <= -0.356481 )
								if( stoc <= 9.58583 )
									ret := 0.760684 // buy
								if( stoc > 9.58583 )
									ret := 0.251566
							if( pvi_ema > -0.356481 )
								if( verde <= 3.1961 )
									ret := 0.270898
								if( verde > 3.1961 )
									ret := 0.092028
					if( azul > 25.7614 )
						if( xmf <= 67.4925 )
							if( stoc <= 23.4037 )
								if( pvimin <= 0.182917 )
									ret := -0.119048
								if( pvimin > 0.182917 )
									ret := -0.923077 // sell
							if( stoc > 23.4037 )
								if( source <= 27.3186 )
									ret := 0.888889 // buy
								if( source > 27.3186 )
									ret := 0.111111
						if( xmf > 67.4925 )
							if( verde_azul <= 3.92867 )
								ret := -0.615385
							if( verde_azul > 3.92867 )
								ret := -1.000000 // sell
			if( nvim > 1.70218 )
				if( xrsi <= 45.0957 )
					if( verde_azul <= 26.0849 )
						if( media_azul <= 16.1417 )
							if( azul_mean <= 9.06339 )
								if( tprice <= 57.645 )
									ret := -0.305085
								if( tprice > 57.645 )
									ret := -0.679245
							if( azul_mean > 9.06339 )
								if( media <= 19.7443 )
									ret := 0.607843
								if( media > 19.7443 )
									ret := -0.166667
						if( media_azul > 16.1417 )
							if( source <= 60.6778 )
								if( verde_azul <= -39.2674 )
									ret := 0.350000
								if( verde_azul > -39.2674 )
									ret := -0.225714
							if( source > 60.6778 )
								if( tprice <= 73.8805 )
									ret := 0.318052
								if( tprice > 73.8805 )
									ret := -0.481481
					if( verde_azul > 26.0849 )
						if( media_azul <= 33.7193 )
							if( media_azul <= 19.1489 )
								if( oscp <= -1.77094 )
									ret := -0.066667
								if( oscp > -1.77094 )
									ret := 0.818182 // buy
							if( media_azul > 19.1489 )
								if( xrsi <= 36.4915 )
									ret := -0.085714
								if( xrsi > 36.4915 )
									ret := -0.448598
						if( media_azul > 33.7193 )
							if( pvim <= -0.113831 )
								if( xmf <= 72.8037 )
									ret := 0.169837
								if( xmf > 72.8037 )
									ret := 0.600000
							if( pvim > -0.113831 )
								ret := -0.600000
				if( xrsi > 45.0957 )
					if( pvi_ema <= -0.782007 )
						if( stoc <= 26.1614 )
							if( xrsi <= 54.7022 )
								if( BollOsc <= -10.5986 )
									ret := -0.867470 // sell
								if( BollOsc > -10.5986 )
									ret := -0.428571
							if( xrsi > 54.7022 )
								ret := -0.222222
						if( stoc > 26.1614 )
							if( nvim <= 1.76785 )
								ret := -1.000000 // sell
							if( nvim > 1.76785 )
								ret := 0.461538
					if( pvi_ema > -0.782007 )
						if( nvimin <= 1.77961 )
							if( nvi <= 1.70968 )
								ret := 0.066667
							if( nvi > 1.70968 )
								ret := 0.823529 // buy
						if( nvimin > 1.77961 )
							if( oscp <= 0.676193 )
								if( verde_mean <= 55.802 )
									ret := -0.342541
								if( verde_mean > 55.802 )
									ret := 0.538462
							if( oscp > 0.676193 )
								if( verde <= 53.0719 )
									ret := 0.333333
								if( verde > 53.0719 )
									ret := -0.095238
	if( stoc > 27.5695 )
		if( BollOsc <= 29.8029 )
			if( media_azul <= 104.592 )
				if( verde_media <= -13.5897 )
					if( pvimax <= 0.101396 )
						if( marron_mean <= 86.1407 )
							if( marron <= -20.8568 )
								if( stoc <= 41.2159 )
									ret := -0.704082 // sell
								if( stoc > 41.2159 )
									ret := 0.619048
							if( marron > -20.8568 )
								if( verde <= 23.3749 )
									ret := 0.121725
								if( verde > 23.3749 )
									ret := -0.009421
						if( marron_mean > 86.1407 )
							if( azul <= 36.1431 )
								if( source <= 22.4463 )
									ret := 0.604762
								if( source > 22.4463 )
									ret := 0.154265
							if( azul > 36.1431 )
								if( verde_azul <= 28.2912 )
									ret := -0.296296
								if( verde_azul > 28.2912 )
									ret := -1.000000 // sell
					if( pvimax > 0.101396 )
						if( tprice <= 70.5035 )
							if( verde_azul <= -150.83 )
								if( stoc <= 44.8036 )
									ret := -0.825000 // sell
								if( stoc > 44.8036 )
									ret := 0.625000
							if( verde_azul > -150.83 )
								if( verde_mean <= -77.6091 )
									ret := 0.772727 // buy
								if( verde_mean > -77.6091 )
									ret := 0.018725
						if( tprice > 70.5035 )
							if( azul_mean <= 12.1014 )
								if( nvimax <= 1.47085 )
									ret := -0.611465
								if( nvimax > 1.47085 )
									ret := -0.172414
							if( azul_mean > 12.1014 )
								if( media <= 58.4892 )
									ret := -0.352941
								if( media > 58.4892 )
									ret := 0.338710
				if( verde_media > -13.5897 )
					if( pvimax <= 0.029439 )
						if( pvimax <= -0.907471 )
							if( oscp <= -8.89289 )
								if( nvim <= 1.68163 )
									ret := 1.000000 // buy
								if( nvim > 1.68163 )
									ret := 0.465116
							if( oscp > -8.89289 )
								if( nvim <= 1.72662 )
									ret := 0.163121
								if( nvim > 1.72662 )
									ret := -0.167224
						if( pvimax > -0.907471 )
							if( source <= 19.568 )
								if( oscp <= -1.37768 )
									ret := -0.307509
								if( oscp > -1.37768 )
									ret := -0.118957
							if( source > 19.568 )
								if( azul <= -15.0687 )
									ret := 0.065521
								if( azul > -15.0687 )
									ret := -0.067635
					if( pvimax > 0.029439 )
						if( media_azul <= 35.3205 )
							if( xrsi <= 54.0086 )
								if( nvi_ema <= -0.037102 )
									ret := 0.608247
								if( nvi_ema > -0.037102 )
									ret := -0.057343
							if( xrsi > 54.0086 )
								if( pvimax <= 0.985255 )
									ret := -0.382979
								if( pvimax > 0.985255 )
									ret := 0.769231 // buy
						if( media_azul > 35.3205 )
							if( verde_azul <= 44.1547 )
								if( tprice <= 29.0106 )
									ret := 0.146789
								if( tprice > 29.0106 )
									ret := -0.241597
							if( verde_azul > 44.1547 )
								if( nvimin <= 0.993658 )
									ret := 0.037951
								if( nvimin > 0.993658 )
									ret := 0.154508
			if( media_azul > 104.592 )
				if( pvi <= -0.589541 )
					if( pvim <= -0.830656 )
						if( oscp <= -6.59209 )
							ret := 0.666667
						if( oscp > -6.59209 )
							if( media <= 88.4897 )
								if( BollOsc <= 18.0416 )
									ret := -0.783505 // sell
								if( BollOsc > 18.0416 )
									ret := -0.379310
							if( media > 88.4897 )
								if( tprice <= 24.4722 )
									ret := -0.265060
								if( tprice > 24.4722 )
									ret := 0.620690
					if( pvim > -0.830656 )
						if( verde_mean <= 100.427 )
							if( pvim <= -0.772805 )
								if( verde_mean <= 90.4753 )
									ret := 0.945946 // buy
								if( verde_mean > 90.4753 )
									ret := 0.100000
							if( pvim > -0.772805 )
								if( pvi_ema <= -0.749088 )
									ret := -0.448276
								if( pvi_ema > -0.749088 )
									ret := 0.142857
						if( verde_mean > 100.427 )
							if( verde_mean <= 112.589 )
								if( media <= 97.6749 )
									ret := -0.671429
								if( media > 97.6749 )
									ret := 0.214286
							if( verde_mean > 112.589 )
								if( nvimin <= 1.61527 )
									ret := 0.300000
								if( nvimin > 1.61527 )
									ret := -0.466667
				if( pvi > -0.589541 )
					if( pvimin <= -0.540224 )
						if( nvi_ema <= 2.03865 )
							if( media <= 48.278 )
								ret := -0.333333
							if( media > 48.278 )
								if( verde_media <= 16.021 )
									ret := 0.630189
								if( verde_media > 16.021 )
									ret := 0.302632
						if( nvi_ema > 2.03865 )
							ret := -0.888889 // sell
					if( pvimin > -0.540224 )
						if( tprice <= 36.3803 )
							if( verde_media <= 7.82577 )
								if( xrsi <= 53.9614 )
									ret := 0.127841
								if( xrsi > 53.9614 )
									ret := 0.385305
							if( verde_media > 7.82577 )
								if( stoc <= 91.1656 )
									ret := -0.088561
								if( stoc > 91.1656 )
									ret := 0.557143
						if( tprice > 36.3803 )
							if( stoc <= 86.9374 )
								if( azul <= -76.9283 )
									ret := 0.762590 // buy
								if( azul > -76.9283 )
									ret := 0.287154
							if( stoc > 86.9374 )
								if( marron_mean <= 98.8737 )
									ret := 0.444444
								if( marron_mean > 98.8737 )
									ret := -0.197531
		if( BollOsc > 29.8029 )
			if( azul <= 73.5912 )
				if( media <= 66.3733 )
					if( marron_mean <= 71.2764 )
						if( verde <= 184.871 )
							if( marron <= 103.092 )
								if( verde_media <= 118.165 )
									ret := -0.255799
								if( verde_media > 118.165 )
									ret := 1.000000 // buy
							if( marron > 103.092 )
								if( nvimin <= 1.23201 )
									ret := -0.120805
								if( nvimin > 1.23201 )
									ret := -0.666667
						if( verde > 184.871 )
							if( verde <= 203.323 )
								if( pvimax <= -0.308746 )
									ret := 0.709091 // buy
								if( pvimax > -0.308746 )
									ret := 0.000000
							if( verde > 203.323 )
								if( azul <= -35.003 )
									ret := -0.866667 // sell
								if( azul > -35.003 )
									ret := -0.013699
					if( marron_mean > 71.2764 )
						if( azul_mean <= -1.88393 )
							if( verde <= 191.47 )
								if( media <= 56.7717 )
									ret := -0.164835
								if( media > 56.7717 )
									ret := 0.268382
							if( verde > 191.47 )
								if( nvimin <= 1.67283 )
									ret := -1.000000 // sell
								if( nvimin > 1.67283 )
									ret := -0.227273
						if( azul_mean > -1.88393 )
							if( BollOsc <= 65.9318 )
								if( verde <= 142.901 )
									ret := -0.165289
								if( verde > 142.901 )
									ret := 0.473684
							if( BollOsc > 65.9318 )
								if( tprice <= 42.2925 )
									ret := -0.741379 // sell
								if( tprice > 42.2925 )
									ret := -0.166667
				if( media > 66.3733 )
					if( marron <= 71.1745 )
						if( stoc <= 89.2616 )
							if( media <= 77.0096 )
								if( nvim <= 1.1963 )
									ret := 0.000000
								if( nvim > 1.1963 )
									ret := -0.730769 // sell
							if( media > 77.0096 )
								if( verde_mean <= 77.077 )
									ret := -1.000000 // sell
								if( verde_mean > 77.077 )
									ret := -0.627907
						if( stoc > 89.2616 )
							ret := 0.117647
					if( marron > 71.1745 )
						if( xrsi <= 63.4735 )
							if( pvimin <= -0.57928 )
								if( azul <= -66.3435 )
									ret := 1.000000 // buy
								if( azul > -66.3435 )
									ret := -0.370107
							if( pvimin > -0.57928 )
								if( nvi <= 1.20532 )
									ret := -0.042062
								if( nvi > 1.20532 )
									ret := -0.169899
						if( xrsi > 63.4735 )
							if( nvim <= 0.637933 )
								if( marron <= 131.124 )
									ret := 0.109419
								if( marron > 131.124 )
									ret := -0.269006
							if( nvim > 0.637933 )
								if( verde_azul <= 272.564 )
									ret := -0.058156
								if( verde_azul > 272.564 )
									ret := 0.331288
			if( azul > 73.5912 )
				if( nvimin <= 1.49663 )
					if( pvimax <= -0.471157 )
						if( azul_mean <= 56.6085 )
							if( marron <= 85.6692 )
								ret := -1.000000 // sell
							if( marron > 85.6692 )
								ret := -0.416667
						if( azul_mean > 56.6085 )
							ret := 0.500000
					if( pvimax > -0.471157 )
						if( verde_azul <= 26.1724 )
							if( media_azul <= -16.1283 )
								if( oscp <= 4.74975 )
									ret := -0.890625 // sell
								if( oscp > 4.74975 )
									ret := -0.586207
							if( media_azul > -16.1283 )
								ret := -0.400000
						if( verde_azul > 26.1724 )
							if( media <= 62.7484 )
								ret := 0.500000
							if( media > 62.7484 )
								if( azul_mean <= 35.669 )
									ret := -0.933333 // sell
								if( azul_mean > 35.669 )
									ret := -0.408451
				if( nvimin > 1.49663 )
					if( pvimax <= -0.324417 )
						if( pvi <= -0.887932 )
							ret := -0.733333 // sell
						if( pvi > -0.887932 )
							if( verde <= 81.3374 )
								if( verde <= 52.0625 )
									ret := 0.083333
								if( verde > 52.0625 )
									ret := -1.000000 // sell
							if( verde > 81.3374 )
								if( nvim <= 1.93097 )
									ret := 0.795455 // buy
								if( nvim > 1.93097 )
									ret := 0.135135
					if( pvimax > -0.324417 )
						if( BollOsc <= 74.5161 )
							ret := -0.333333
						if( BollOsc > 74.5161 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_PINS_15Min_b0f4678e(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


