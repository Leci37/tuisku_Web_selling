//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: SNAP_1Min_1KON_cd66fb47 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_1KON_cd66fb47", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_cd66fb47(nvimin, azul, nvim, marron_mean, marron, nvimax, pvi, pvi_ema, oscp, verde, source, stoc, verde_mean, xrsi, media, xmf, tprice, pvimin, media_azul, verde_media, BollOsc, pvimax, nvi_ema, azul_mean, pvim, nvi, verde_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( verde_media <= 0.061563 )
		if( pvimin <= 0.478974 )
			if( BollOsc <= -49.2706 )
				if( media_azul <= 54.4406 )
					if( media_azul <= 32.8335 )
						if( nvim <= -0.167518 )
							if( pvimin <= 0.36858 )
								if( verde_azul <= -159.469 )
									ret := 0.950000 // buy
								if( verde_azul > -159.469 )
									ret := 0.233161
							if( pvimin > 0.36858 )
								if( media_azul <= 18.402 )
									ret := 0.500000
								if( media_azul > 18.402 )
									ret := -0.585366
						if( nvim > -0.167518 )
							if( nvi_ema <= -0.144752 )
								if( pvimin <= 0.461646 )
									ret := 0.733333 // buy
								if( pvimin > 0.461646 )
									ret := -0.600000
							if( nvi_ema > -0.144752 )
								if( xrsi <= 24.4494 )
									ret := 0.550847
								if( xrsi > 24.4494 )
									ret := 0.253623
					if( media_azul > 32.8335 )
						if( xrsi <= 35.7714 )
							if( verde <= -15.6375 )
								if( verde <= -25.8859 )
									ret := 0.162791
								if( verde > -25.8859 )
									ret := -0.423611
							if( verde > -15.6375 )
								if( pvimin <= 0.176677 )
									ret := 0.035088
								if( pvimin > 0.176677 )
									ret := 0.534483
						if( xrsi > 35.7714 )
							if( oscp <= -31.7112 )
								if( nvim <= -0.16438 )
									ret := 0.250000
								if( nvim > -0.16438 )
									ret := 0.914286 // buy
							if( oscp > -31.7112 )
								if( media <= 43.654 )
									ret := 0.586207
								if( media > 43.654 )
									ret := -0.142857
				if( media_azul > 54.4406 )
					if( source <= 15.8377 )
						if( xmf <= 37.8323 )
							if( xrsi <= 18.1904 )
								if( verde <= -97.2611 )
									ret := 1.000000 // buy
								if( verde > -97.2611 )
									ret := -0.562500
							if( xrsi > 18.1904 )
								if( stoc <= 6.69263 )
									ret := 0.000000
								if( stoc > 6.69263 )
									ret := 0.630332
						if( xmf > 37.8323 )
							if( xmf <= 63.5355 )
								if( xrsi <= 32.075 )
									ret := 0.000000
								if( xrsi > 32.075 )
									ret := 0.351449
							if( xmf > 63.5355 )
								if( marron_mean <= 36.4538 )
									ret := 0.000000
								if( marron_mean > 36.4538 )
									ret := 0.883333 // buy
					if( source > 15.8377 )
						if( nvimax <= -0.012564 )
							if( BollOsc <= -66.2526 )
								ret := 1.000000 // buy
							if( BollOsc > -66.2526 )
								if( media <= 55.196 )
									ret := -0.809524 // sell
								if( media > 55.196 )
									ret := 0.076923
						if( nvimax > -0.012564 )
							if( verde_mean <= 1.07854 )
								if( xrsi <= 20.8187 )
									ret := 1.000000 // buy
								if( xrsi > 20.8187 )
									ret := -0.333333
							if( verde_mean > 1.07854 )
								if( verde_media <= -24.9695 )
									ret := 0.710526 // buy
								if( verde_media > -24.9695 )
									ret := -0.222222
			if( BollOsc > -49.2706 )
				if( verde_media <= -39.4868 )
					if( stoc <= 25.547 )
						if( source <= 9.73619 )
							if( marron <= 14.6956 )
								if( stoc <= 17.3478 )
									ret := 0.069264
								if( stoc > 17.3478 )
									ret := 0.642857
							if( marron > 14.6956 )
								if( BollOsc <= -46.0394 )
									ret := 0.482759
								if( BollOsc > -46.0394 )
									ret := -0.203390
						if( source > 9.73619 )
							if( stoc <= 2.9081 )
								if( azul_mean <= 11.6442 )
									ret := 0.958333 // buy
								if( azul_mean > 11.6442 )
									ret := 0.250000
							if( stoc > 2.9081 )
								if( azul_mean <= 19.5053 )
									ret := 0.198079
								if( azul_mean > 19.5053 )
									ret := 0.605263
					if( stoc > 25.547 )
						if( xrsi <= 49.5522 )
							if( xmf <= 41.3107 )
								if( verde <= 12.8891 )
									ret := 0.368519
								if( verde > 12.8891 )
									ret := 0.637860
							if( xmf > 41.3107 )
								if( marron_mean <= 81.7178 )
									ret := 0.183529
								if( marron_mean > 81.7178 )
									ret := 0.700000 // buy
						if( xrsi > 49.5522 )
							if( pvi <= 0.137144 )
								if( pvimax <= 0.085718 )
									ret := -0.046512
								if( pvimax > 0.085718 )
									ret := 0.483871
							if( pvi > 0.137144 )
								if( media <= 61.9707 )
									ret := -0.564103
								if( media > 61.9707 )
									ret := 0.097701
				if( verde_media > -39.4868 )
					if( marron <= 20.216 )
						if( oscp <= -19.0479 )
							if( pvimin <= 0.413131 )
								if( source <= 9.91486 )
									ret := 0.128866
								if( source > 9.91486 )
									ret := 0.483568
							if( pvimin > 0.413131 )
								if( xmf <= 14.6363 )
									ret := 0.750000 // buy
								if( xmf > 14.6363 )
									ret := -0.250000
						if( oscp > -19.0479 )
							if( media_azul <= 16.3786 )
								if( BollOsc <= -39.6926 )
									ret := 0.041096
								if( BollOsc > -39.6926 )
									ret := -0.451477
							if( media_azul > 16.3786 )
								if( verde <= 2.29603 )
									ret := 0.146552
								if( verde > 2.29603 )
									ret := -0.096174
					if( marron > 20.216 )
						if( stoc <= 67.1139 )
							if( xrsi <= 53.9502 )
								if( azul <= 6.91837 )
									ret := 0.177173
								if( azul > 6.91837 )
									ret := 0.045808
							if( xrsi > 53.9502 )
								if( nvim <= -0.15624 )
									ret := -0.278689
								if( nvim > -0.15624 )
									ret := 0.039052
						if( stoc > 67.1139 )
							if( azul <= 23.7145 )
								if( xrsi <= 48.925 )
									ret := 0.567073
								if( xrsi > 48.925 )
									ret := 0.223529
							if( azul > 23.7145 )
								if( azul_mean <= 53.9613 )
									ret := -0.119122
								if( azul_mean > 53.9613 )
									ret := 0.370787
		if( pvimin > 0.478974 )
			if( pvi_ema <= 0.682209 )
				if( BollOsc <= -71.437 )
					if( media_azul <= 110.132 )
						if( verde_mean <= 19.6726 )
							if( media_azul <= 31.9319 )
								if( xmf <= 27.0869 )
									ret := 0.730769 // buy
								if( xmf > 27.0869 )
									ret := 0.000000
							if( media_azul > 31.9319 )
								if( verde_media <= -50.5928 )
									ret := 0.036364
								if( verde_media > -50.5928 )
									ret := -0.727273 // sell
						if( verde_mean > 19.6726 )
							if( media_azul <= 44.7334 )
								ret := 0.000000
							if( media_azul > 44.7334 )
								if( nvimin <= -0.134986 )
									ret := 0.888889 // buy
								if( nvimin > -0.134986 )
									ret := 0.421053
					if( media_azul > 110.132 )
						if( xrsi <= 29.5663 )
							ret := 1.000000 // buy
						if( xrsi > 29.5663 )
							ret := 0.428571
				if( BollOsc > -71.437 )
					if( media <= 2.61057 )
						if( verde_mean <= -45.7144 )
							if( nvi_ema <= -0.105227 )
								if( oscp <= -27.7413 )
									ret := 1.000000 // buy
								if( oscp > -27.7413 )
									ret := 0.800000 // buy
							if( nvi_ema > -0.105227 )
								ret := 0.500000
						if( verde_mean > -45.7144 )
							if( BollOsc <= -41.4492 )
								if( verde <= -29.6896 )
									ret := 0.350000
								if( verde > -29.6896 )
									ret := -0.222222
							if( BollOsc > -41.4492 )
								if( source <= 15.0435 )
									ret := -0.250000
								if( source > 15.0435 )
									ret := 0.758621 // buy
					if( media > 2.61057 )
						if( media_azul <= 31.1673 )
							if( verde_mean <= -61.2621 )
								if( nvi_ema <= -0.152507 )
									ret := 0.700000 // buy
								if( nvi_ema > -0.152507 )
									ret := 0.232558
							if( verde_mean > -61.2621 )
								if( xmf <= 57.038 )
									ret := -0.025122
								if( xmf > 57.038 )
									ret := -0.379032
						if( media_azul > 31.1673 )
							if( verde_mean <= 76.191 )
								if( nvimax <= -0.109406 )
									ret := 0.123330
								if( nvimax > -0.109406 )
									ret := -0.002326
							if( verde_mean > 76.191 )
								if( BollOsc <= 46.6684 )
									ret := -0.043581
								if( BollOsc > 46.6684 )
									ret := 0.875000 // buy
			if( pvi_ema > 0.682209 )
				if( verde <= 30.3465 )
					if( verde_media <= -23.8054 )
						if( marron_mean <= -12.7079 )
							ret := -0.500000
						if( marron_mean > -12.7079 )
							ret := -1.000000 // sell
					if( verde_media > -23.8054 )
						ret := -0.200000
				if( verde > 30.3465 )
					if( BollOsc <= -4.79517 )
						if( pvimin <= 0.671012 )
							ret := 0.500000
						if( pvimin > 0.671012 )
							ret := 1.000000 // buy
					if( BollOsc > -4.79517 )
						if( BollOsc <= 8.03774 )
							ret := 0.000000
						if( BollOsc > 8.03774 )
							ret := -0.250000
	if( verde_media > 0.061563 )
		if( BollOsc <= 3.9451 )
			if( verde_mean <= 76.1205 )
				if( media <= 12.473 )
					if( azul <= -8.13002 )
						if( xmf <= 14.8954 )
							if( BollOsc <= -23.1497 )
								if( nvimin <= -0.157502 )
									ret := 0.000000
								if( nvimin > -0.157502 )
									ret := 0.250000
							if( BollOsc > -23.1497 )
								ret := -1.000000 // sell
						if( xmf > 14.8954 )
							if( BollOsc <= -18.8913 )
								if( stoc <= 16.0531 )
									ret := 0.475610
								if( stoc > 16.0531 )
									ret := 0.816667 // buy
							if( BollOsc > -18.8913 )
								if( source <= 15.178 )
									ret := -0.333333
								if( source > 15.178 )
									ret := 0.454545
					if( azul > -8.13002 )
						if( verde_azul <= 3.9242 )
							if( marron_mean <= 5.10358 )
								if( tprice <= 12.4932 )
									ret := 0.000000
								if( tprice > 12.4932 )
									ret := 0.750000 // buy
							if( marron_mean > 5.10358 )
								if( pvi_ema <= 0.498086 )
									ret := 1.000000 // buy
								if( pvi_ema > 0.498086 )
									ret := 0.500000
						if( verde_azul > 3.9242 )
							if( verde_mean <= 7.01804 )
								if( nvimax <= -0.134404 )
									ret := 0.180328
								if( nvimax > -0.134404 )
									ret := -0.392157
							if( verde_mean > 7.01804 )
								if( nvi <= -0.215184 )
									ret := -1.000000 // sell
								if( nvi > -0.215184 )
									ret := -0.300000
				if( media > 12.473 )
					if( xmf <= 42.9199 )
						if( verde_mean <= 65.0209 )
							if( marron <= 35.1455 )
								if( azul <= -2.2012 )
									ret := -0.107143
								if( azul > -2.2012 )
									ret := -0.388889
							if( marron > 35.1455 )
								if( verde_azul <= 44.9896 )
									ret := 0.130952
								if( verde_azul > 44.9896 )
									ret := -0.107374
						if( verde_mean > 65.0209 )
							if( xrsi <= 51.37 )
								if( marron_mean <= 34.6211 )
									ret := -0.166667
								if( marron_mean > 34.6211 )
									ret := 0.714286 // buy
							if( xrsi > 51.37 )
								if( media <= 61.6939 )
									ret := 0.000000
								if( media > 61.6939 )
									ret := -0.750000 // sell
					if( xmf > 42.9199 )
						if( verde <= 53.4027 )
							if( xmf <= 49.2154 )
								if( azul <= 32.5894 )
									ret := 0.035061
								if( azul > 32.5894 )
									ret := 0.642857
							if( xmf > 49.2154 )
								if( nvi_ema <= -0.182935 )
									ret := -0.011719
								if( nvi_ema > -0.182935 )
									ret := 0.297125
						if( verde > 53.4027 )
							if( verde_media <= 15.9509 )
								if( xrsi <= 51.7821 )
									ret := 0.055616
								if( xrsi > 51.7821 )
									ret := 0.393548
							if( verde_media > 15.9509 )
								if( stoc <= 50.0037 )
									ret := -0.142041
								if( stoc > 50.0037 )
									ret := 0.058011
			if( verde_mean > 76.1205 )
				if( xrsi <= 49.0639 )
					if( azul_mean <= -23.0172 )
						if( verde_mean <= 115.716 )
							if( marron_mean <= 60.0688 )
								if( stoc <= 46.7187 )
									ret := 0.175000
								if( stoc > 46.7187 )
									ret := 0.702703 // buy
							if( marron_mean > 60.0688 )
								if( xmf <= 54.8785 )
									ret := -0.692308
								if( xmf > 54.8785 )
									ret := 0.011628
						if( verde_mean > 115.716 )
							if( media_azul <= 117.737 )
								if( nvi <= -0.198384 )
									ret := 0.857143 // buy
								if( nvi > -0.198384 )
									ret := 0.000000
							if( media_azul > 117.737 )
								if( nvim <= -0.081562 )
									ret := 0.914894 // buy
								if( nvim > -0.081562 )
									ret := 0.230769
					if( azul_mean > -23.0172 )
						if( verde_azul <= 96.6366 )
							if( stoc <= 38.5729 )
								if( media <= 59.7298 )
									ret := -0.750000 // sell
								if( media > 59.7298 )
									ret := 0.142857
							if( stoc > 38.5729 )
								if( nvi <= -0.22343 )
									ret := -0.400000
								if( nvi > -0.22343 )
									ret := 0.532258
						if( verde_azul > 96.6366 )
							if( azul <= -34.8166 )
								if( nvi <= -0.155943 )
									ret := 0.705882 // buy
								if( nvi > -0.155943 )
									ret := 0.181818
							if( azul > -34.8166 )
								if( azul_mean <= -3.29549 )
									ret := 0.798165 // buy
								if( azul_mean > -3.29549 )
									ret := -0.250000
				if( xrsi > 49.0639 )
					if( xmf <= 87.05 )
						if( media <= 88.0243 )
							if( nvimax <= -0.215004 )
								if( verde <= 87.6885 )
									ret := -1.000000 // sell
								if( verde > 87.6885 )
									ret := 0.000000
							if( nvimax > -0.215004 )
								if( oscp <= 22.2127 )
									ret := 0.145631
								if( oscp > 22.2127 )
									ret := -0.138889
						if( media > 88.0243 )
							if( xmf <= 78.6122 )
								ret := 1.000000 // buy
							if( xmf > 78.6122 )
								ret := 0.750000 // buy
					if( xmf > 87.05 )
						if( tprice <= 15.38 )
							if( nvimax <= -0.16369 )
								ret := -0.200000
							if( nvimax > -0.16369 )
								if( media_azul <= 111.638 )
									ret := -0.750000 // sell
								if( media_azul > 111.638 )
									ret := -1.000000 // sell
						if( tprice > 15.38 )
							if( verde <= 97.232 )
								ret := 0.000000
							if( verde > 97.232 )
								ret := -0.250000
		if( BollOsc > 3.9451 )
			if( BollOsc <= 69.2036 )
				if( verde_mean <= 23.2387 )
					if( oscp <= -13.9342 )
						if( pvimin <= 0.498205 )
							if( stoc <= 73.8176 )
								ret := -1.000000 // sell
							if( stoc > 73.8176 )
								ret := -0.250000
						if( pvimin > 0.498205 )
							ret := -0.200000
					if( oscp > -13.9342 )
						if( stoc <= 53.8403 )
							if( verde_mean <= 6.93898 )
								if( pvi_ema <= 0.516724 )
									ret := -1.000000 // sell
								if( pvi_ema > 0.516724 )
									ret := -0.750000 // sell
							if( verde_mean > 6.93898 )
								if( azul <= 21.9571 )
									ret := -0.291667
								if( azul > 21.9571 )
									ret := -0.666667
						if( stoc > 53.8403 )
							if( pvim <= 0.508126 )
								if( xrsi <= 52.4774 )
									ret := -0.333333
								if( xrsi > 52.4774 )
									ret := 0.647059
							if( pvim > 0.508126 )
								if( BollOsc <= 30.981 )
									ret := -0.666667
								if( BollOsc > 30.981 )
									ret := 0.571429
				if( verde_mean > 23.2387 )
					if( azul <= -26.3156 )
						if( azul_mean <= -71.2174 )
							if( pvi <= 0.235183 )
								if( verde_mean <= 131.579 )
									ret := -0.125000
								if( verde_mean > 131.579 )
									ret := 0.588235
							if( pvi > 0.235183 )
								if( media <= 95.9523 )
									ret := -0.290909
								if( media > 95.9523 )
									ret := -0.810811 // sell
						if( azul_mean > -71.2174 )
							if( pvimin <= 0.081585 )
								if( xmf <= 93.454 )
									ret := -0.316327
								if( xmf > 93.454 )
									ret := 1.000000 // buy
							if( pvimin > 0.081585 )
								if( oscp <= 19.3143 )
									ret := -0.029289
								if( oscp > 19.3143 )
									ret := 0.223930
					if( azul > -26.3156 )
						if( azul_mean <= -12.5606 )
							if( verde_azul <= 134.865 )
								if( nvimax <= -0.102236 )
									ret := -0.005525
								if( nvimax > -0.102236 )
									ret := -0.232000
							if( verde_azul > 134.865 )
								if( source <= 14.5525 )
									ret := -0.498652
								if( source > 14.5525 )
									ret := -0.113043
						if( azul_mean > -12.5606 )
							if( verde_azul <= 190.108 )
								if( marron <= 129.541 )
									ret := -0.028348
								if( marron > 129.541 )
									ret := -0.364198
							if( verde_azul > 190.108 )
								if( verde_mean <= 277.352 )
									ret := -0.539062
								if( verde_mean > 277.352 )
									ret := 1.000000 // buy
			if( BollOsc > 69.2036 )
				if( nvimin <= -0.202274 )
					if( pvimin <= 0.088017 )
						if( source <= 8.81168 )
							if( azul_mean <= 15.3044 )
								ret := -0.250000
							if( azul_mean > 15.3044 )
								ret := -0.800000 // sell
						if( source > 8.81168 )
							ret := 1.000000 // buy
					if( pvimin > 0.088017 )
						if( xrsi <= 68.9143 )
							if( nvi <= -0.204183 )
								if( media_azul <= 61.5383 )
									ret := 0.500000
								if( media_azul > 61.5383 )
									ret := -0.214286
							if( nvi > -0.204183 )
								ret := -1.000000 // sell
						if( xrsi > 68.9143 )
							if( azul <= -1.78067 )
								if( azul_mean <= -17.3222 )
									ret := -1.000000 // sell
								if( azul_mean > -17.3222 )
									ret := -0.222222
							if( azul > -1.78067 )
								if( marron <= 127.865 )
									ret := -0.736842 // sell
								if( marron > 127.865 )
									ret := -1.000000 // sell
				if( nvimin > -0.202274 )
					if( media_azul <= 63.2859 )
						if( verde_azul <= 88.9425 )
							if( verde_media <= 47.6574 )
								if( azul_mean <= 45.0959 )
									ret := -0.571429
								if( azul_mean > 45.0959 )
									ret := 0.916667 // buy
							if( verde_media > 47.6574 )
								if( pvi <= 0.501569 )
									ret := -0.857143 // sell
								if( pvi > 0.501569 )
									ret := -0.100000
						if( verde_azul > 88.9425 )
							if( pvimin <= 0.39766 )
								if( azul_mean <= -2.34447 )
									ret := 1.000000 // buy
								if( azul_mean > -2.34447 )
									ret := -0.378049
							if( pvimin > 0.39766 )
								if( verde_azul <= 123.758 )
									ret := 0.435897
								if( verde_azul > 123.758 )
									ret := -0.076923
					if( media_azul > 63.2859 )
						if( azul <= 8.87386 )
							if( nvimax <= -0.119625 )
								if( xrsi <= 82.7883 )
									ret := -0.557522
								if( xrsi > 82.7883 )
									ret := 0.666667
							if( nvimax > -0.119625 )
								if( verde_mean <= 86.2824 )
									ret := -0.928571 // sell
								if( verde_mean > 86.2824 )
									ret := 0.132653
						if( azul > 8.87386 )
							if( azul <= 29.6273 )
								if( pvimin <= 0.48879 )
									ret := -0.873016 // sell
								if( pvimin > 0.48879 )
									ret := -0.393939
							if( azul > 29.6273 )
								ret := 0.400000
	
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
float op_operation = decision_tree_0_SNAP_1Min_cd66fb47(nvimin, azul, nvim, marron_mean, marron, nvimax, pvi, pvi_ema, oscp, verde, source, stoc, verde_mean, xrsi, media, xmf, tprice, pvimin, media_azul, verde_media, BollOsc, pvimax, nvi_ema, azul_mean, pvim, nvi, verde_azul)

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


