//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: PYPL_15Min_1KON_4dd583d1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_15Min_1KON_4dd583d1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_15Min_4dd583d1(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( stoc <= 53.0327 )
		if( tprice <= 242.753 )
			if( nvimax <= 2.76693 )
				if( marron <= 19.4145 )
					if( pvi <= -1.51945 )
						if( source <= 84.8523 )
							if( xrsi <= 31.5696 )
								if( verde_azul <= -16.9141 )
									ret := 0.291845
								if( verde_azul > -16.9141 )
									ret := 0.630631
							if( xrsi > 31.5696 )
								if( marron_mean <= 7.8667 )
									ret := -0.441860
								if( marron_mean > 7.8667 )
									ret := 0.241228
						if( source > 84.8523 )
							ret := -0.923077 // sell
					if( pvi > -1.51945 )
						if( media_azul <= 179.678 )
							if( source <= 61.6745 )
								if( BollOsc <= -42.6475 )
									ret := 0.353846
								if( BollOsc > -42.6475 )
									ret := 0.129902
							if( source > 61.6745 )
								if( media_azul <= 57.8598 )
									ret := 0.088700
								if( media_azul > 57.8598 )
									ret := -0.007780
						if( media_azul > 179.678 )
							if( nvim <= 2.07729 )
								if( nvi <= 0.729949 )
									ret := 0.818182 // buy
								if( nvi > 0.729949 )
									ret := 1.000000 // buy
							if( nvim > 2.07729 )
								if( verde <= -19.6118 )
									ret := 0.636364
								if( verde > -19.6118 )
									ret := 0.000000
				if( marron > 19.4145 )
					if( azul_mean <= -33.1717 )
						if( media_azul <= 158.084 )
							if( nvi <= 1.99408 )
								if( pvi <= -0.690107 )
									ret := 0.409091
								if( pvi > -0.690107 )
									ret := -0.035824
							if( nvi > 1.99408 )
								if( verde_mean <= 70.5989 )
									ret := -0.381053
								if( verde_mean > 70.5989 )
									ret := -0.087838
						if( media_azul > 158.084 )
							if( xmf <= 48.607 )
								if( source <= 95.69 )
									ret := -0.933333 // sell
								if( source > 95.69 )
									ret := -0.100000
							if( xmf > 48.607 )
								if( pvi <= -1.49776 )
									ret := -0.800000 // sell
								if( pvi > -1.49776 )
									ret := 0.800000 // buy
					if( azul_mean > -33.1717 )
						if( source <= 238.423 )
							if( media_azul <= 49.8234 )
								if( media_azul <= -116.059 )
									ret := -0.880000 // sell
								if( media_azul > -116.059 )
									ret := 0.011456
							if( media_azul > 49.8234 )
								if( media_azul <= 75.6829 )
									ret := 0.137200
								if( media_azul > 75.6829 )
									ret := 0.053411
						if( source > 238.423 )
							if( verde_media <= -42.32 )
								ret := -0.875000 // sell
							if( verde_media > -42.32 )
								if( azul <= 4.36433 )
									ret := 0.701571 // buy
								if( azul > 4.36433 )
									ret := 0.179310
			if( nvimax > 2.76693 )
				if( verde_media <= -81.6948 )
					if( xmf <= 1.11669 )
						if( nvimin <= 2.95062 )
							if( marron_mean <= -24.6723 )
								ret := 0.615385
							if( marron_mean > -24.6723 )
								if( marron <= -30.7643 )
									ret := -0.764706 // sell
								if( marron > -30.7643 )
									ret := -0.092308
						if( nvimin > 2.95062 )
							if( azul_mean <= -18.332 )
								ret := 0.454545
							if( azul_mean > -18.332 )
								ret := 0.933333 // buy
					if( xmf > 1.11669 )
						if( azul_mean <= -75.9773 )
							if( nvi <= 2.9001 )
								ret := -0.571429
							if( nvi > 2.9001 )
								if( nvim <= 3.06921 )
									ret := 1.000000 // buy
								if( nvim > 3.06921 )
									ret := 0.700000 // buy
						if( azul_mean > -75.9773 )
							if( BollOsc <= -55.95 )
								if( marron <= -35.5633 )
									ret := 0.750000 // buy
								if( marron > -35.5633 )
									ret := -0.465248
							if( BollOsc > -55.95 )
								if( pvimin <= -1.57554 )
									ret := 0.054795
								if( pvimin > -1.57554 )
									ret := -0.565217
				if( verde_media > -81.6948 )
					if( nvimin <= 2.74599 )
						if( pvim <= -0.723699 )
							if( media_azul <= 70.7587 )
								if( nvimin <= 2.74016 )
									ret := -0.379487
								if( nvimin > 2.74016 )
									ret := 0.428571
							if( media_azul > 70.7587 )
								if( nvim <= 2.74742 )
									ret := -0.948718 // sell
								if( nvim > 2.74742 )
									ret := -0.500000
						if( pvim > -0.723699 )
							if( pvi <= -0.698212 )
								if( nvi_ema <= 2.77215 )
									ret := -0.923077 // sell
								if( nvi_ema > 2.77215 )
									ret := -1.000000 // sell
							if( pvi > -0.698212 )
								ret := -0.416667
					if( nvimin > 2.74599 )
						if( nvimin <= 2.74705 )
							if( media <= 7.8633 )
								ret := 0.200000
							if( media > 7.8633 )
								if( azul <= -10.5856 )
									ret := 0.454545
								if( azul > -10.5856 )
									ret := 0.923077 // buy
						if( nvimin > 2.74705 )
							if( media_azul <= 45.4185 )
								if( pvimax <= -0.616479 )
									ret := -0.053379
								if( pvimax > -0.616479 )
									ret := -0.514706
							if( media_azul > 45.4185 )
								if( stoc <= 11.441 )
									ret := -0.197343
								if( stoc > 11.441 )
									ret := 0.044658
		if( tprice > 242.753 )
			if( verde_mean <= 61.5142 )
				if( pvi_ema <= -0.216925 )
					if( marron <= 25.9523 )
						if( oscp <= -17.5325 )
							if( pvi_ema <= -0.553811 )
								if( marron <= 13.0372 )
									ret := 0.247423
								if( marron > 13.0372 )
									ret := 0.666667
							if( pvi_ema > -0.553811 )
								if( media_azul <= 25.7233 )
									ret := 0.240933
								if( media_azul > 25.7233 )
									ret := -0.100143
						if( oscp > -17.5325 )
							if( media <= 7.29892 )
								if( oscp <= -6.96299 )
									ret := 0.784615 // buy
								if( oscp > -6.96299 )
									ret := -0.187500
							if( media > 7.29892 )
								if( xmf <= 46.0298 )
									ret := -0.208941
								if( xmf > 46.0298 )
									ret := 0.477612
					if( marron > 25.9523 )
						if( pvi_ema <= -0.265713 )
							if( tprice <= 269.163 )
								if( verde <= 74.7692 )
									ret := -0.060957
								if( verde > 74.7692 )
									ret := -0.723214 // sell
							if( tprice > 269.163 )
								if( verde <= 29.791 )
									ret := -0.487395
								if( verde > 29.791 )
									ret := -0.183292
						if( pvi_ema > -0.265713 )
							if( azul <= -2.93227 )
								if( nvim <= 2.57556 )
									ret := 1.000000 // buy
								if( nvim > 2.57556 )
									ret := 0.363636
							if( azul > -2.93227 )
								if( source <= 249.867 )
									ret := -0.476190
								if( source > 249.867 )
									ret := 0.346154
				if( pvi_ema > -0.216925 )
					if( verde_media <= -45.9237 )
						if( nvimin <= 2.32846 )
							ret := -1.000000 // sell
						if( nvimin > 2.32846 )
							ret := -0.733333 // sell
					if( verde_media > -45.9237 )
						ret := 0.111111
			if( verde_mean > 61.5142 )
				if( tprice <= 258.561 )
					if( azul <= -40.5219 )
						if( source <= 248.236 )
							ret := -0.666667
						if( source > 248.236 )
							ret := -1.000000 // sell
					if( azul > -40.5219 )
						if( pvim <= -0.431715 )
							if( azul <= -0.790333 )
								if( pvimax <= -0.592442 )
									ret := -0.222222
								if( pvimax > -0.592442 )
									ret := 0.400000
							if( azul > -0.790333 )
								ret := -0.631579
						if( pvim > -0.431715 )
							if( nvimin <= 2.31855 )
								ret := 0.000000
							if( nvimin > 2.31855 )
								ret := 1.000000 // buy
				if( tprice > 258.561 )
					if( nvimin <= 2.84286 )
						if( media_azul <= 57.2792 )
							if( nvim <= 2.70256 )
								if( verde <= 66.8693 )
									ret := -1.000000 // sell
								if( verde > 66.8693 )
									ret := -0.727273 // sell
							if( nvim > 2.70256 )
								if( xrsi <= 48.8206 )
									ret := 0.130435
								if( xrsi > 48.8206 )
									ret := -0.368421
						if( media_azul > 57.2792 )
							if( nvim <= 2.77031 )
								if( xmf <= 75.0426 )
									ret := 0.462687
								if( xmf > 75.0426 )
									ret := -0.150000
							if( nvim > 2.77031 )
								if( xmf <= 47.5346 )
									ret := 0.069767
								if( xmf > 47.5346 )
									ret := 0.820652 // buy
					if( nvimin > 2.84286 )
						if( pvimax <= -0.540137 )
							if( nvimax <= 2.85845 )
								if( BollOsc <= -10.3277 )
									ret := -0.666667
								if( BollOsc > -10.3277 )
									ret := -0.888889 // sell
							if( nvimax > 2.85845 )
								ret := 0.000000
						if( pvimax > -0.540137 )
							ret := 0.000000
	if( stoc > 53.0327 )
		if( BollOsc <= 51.363 )
			if( verde_media <= -24.0466 )
				if( oscp <= -7.63371 )
					if( oscp <= -24.0398 )
						if( verde_mean <= 37.6086 )
							if( verde <= 1.25327 )
								if( BollOsc <= -61.9075 )
									ret := -0.888889 // sell
								if( BollOsc > -61.9075 )
									ret := 0.238710
							if( verde > 1.25327 )
								if( pvi_ema <= -0.095585 )
									ret := -0.671329
								if( pvi_ema > -0.095585 )
									ret := -0.182927
						if( verde_mean > 37.6086 )
							if( azul_mean <= 5.69325 )
								if( xrsi <= 36.8262 )
									ret := -0.646154
								if( xrsi > 36.8262 )
									ret := 0.004115
							if( azul_mean > 5.69325 )
								if( verde <= 8.18395 )
									ret := 0.443366
								if( verde > 8.18395 )
									ret := -0.007286
					if( oscp > -24.0398 )
						if( marron <= 26.6585 )
							if( nvi_ema <= 1.59644 )
								if( marron_mean <= 56.7375 )
									ret := 0.586207
								if( marron_mean > 56.7375 )
									ret := 0.000000
							if( nvi_ema > 1.59644 )
								if( nvimin <= 2.81549 )
									ret := -0.688889
								if( nvimin > 2.81549 )
									ret := 0.294118
						if( marron > 26.6585 )
							if( verde_azul <= 24.3455 )
								if( nvimin <= 2.68681 )
									ret := 0.596774
								if( nvimin > 2.68681 )
									ret := 0.159483
							if( verde_azul > 24.3455 )
								if( marron_mean <= 87.1159 )
									ret := 0.114010
								if( marron_mean > 87.1159 )
									ret := 0.400000
				if( oscp > -7.63371 )
					if( verde_mean <= 51.8913 )
						if( xrsi <= 47.1597 )
							if( verde <= 21.9768 )
								if( azul_mean <= -0.630906 )
									ret := -0.421053
								if( azul_mean > -0.630906 )
									ret := -0.933333 // sell
							if( verde > 21.9768 )
								if( tprice <= 77.915 )
									ret := 0.700000 // buy
								if( tprice > 77.915 )
									ret := 0.250000
						if( xrsi > 47.1597 )
							if( pvimax <= -0.860232 )
								ret := -1.000000 // sell
							if( pvimax > -0.860232 )
								if( nvim <= 2.19393 )
									ret := -0.766667 // sell
								if( nvim > 2.19393 )
									ret := 0.058824
					if( verde_mean > 51.8913 )
						if( source <= 184.622 )
							if( pvimax <= -1.79326 )
								if( nvim <= 2.90998 )
									ret := -0.714286 // sell
								if( nvim > 2.90998 )
									ret := 0.391892
							if( pvimax > -1.79326 )
								if( oscp <= 2.7229 )
									ret := -0.188851
								if( oscp > 2.7229 )
									ret := 0.161850
						if( source > 184.622 )
							if( nvimin <= 2.75724 )
								if( marron <= 31.1509 )
									ret := -0.769231 // sell
								if( marron > 31.1509 )
									ret := 0.604651
							if( nvimin > 2.75724 )
								if( azul <= 5.48027 )
									ret := 0.220000
								if( azul > 5.48027 )
									ret := -0.800000 // sell
			if( verde_media > -24.0466 )
				if( tprice <= 75.8325 )
					if( oscp <= 9.92984 )
						if( marron_mean <= 73.6016 )
							if( xmf <= 28.5666 )
								if( xmf <= 1.70708 )
									ret := 0.289855
								if( xmf > 1.70708 )
									ret := -0.212072
							if( xmf > 28.5666 )
								if( tprice <= 73.5843 )
									ret := 0.137945
								if( tprice > 73.5843 )
									ret := -0.147700
						if( marron_mean > 73.6016 )
							if( pvi <= -1.96501 )
								if( pvi <= -2.00325 )
									ret := 0.027027
								if( pvi > -2.00325 )
									ret := -0.351906
							if( pvi > -1.96501 )
								if( pvimax <= -1.93603 )
									ret := 0.224138
								if( pvimax > -1.93603 )
									ret := -0.044916
					if( oscp > 9.92984 )
						if( verde_azul <= 186.061 )
							if( tprice <= 49.8469 )
								if( xrsi <= 56.0466 )
									ret := 0.323741
								if( xrsi > 56.0466 )
									ret := -0.166667
							if( tprice > 49.8469 )
								if( nvi <= 2.64031 )
									ret := 0.248479
								if( nvi > 2.64031 )
									ret := 0.084990
						if( verde_azul > 186.061 )
							if( pvimax <= -1.98758 )
								if( azul_mean <= 23.7297 )
									ret := 0.555556
								if( azul_mean > 23.7297 )
									ret := 1.000000 // buy
							if( pvimax > -1.98758 )
								if( pvimax <= -1.85608 )
									ret := -0.663366
								if( pvimax > -1.85608 )
									ret := -0.093750
				if( tprice > 75.8325 )
					if( tprice <= 134.562 )
						if( verde_mean <= 91.0239 )
							if( media_azul <= 90.4979 )
								if( tprice <= 94.6941 )
									ret := -0.160802
								if( tprice > 94.6941 )
									ret := -0.059537
							if( media_azul > 90.4979 )
								if( nvimin <= 0.594198 )
									ret := -0.735632 // sell
								if( nvimin > 0.594198 )
									ret := -0.235507
						if( verde_mean > 91.0239 )
							if( nvi_ema <= 0.794824 )
								if( media <= 93.3408 )
									ret := 0.174000
								if( media > 93.3408 )
									ret := -0.043546
							if( nvi_ema > 0.794824 )
								if( tprice <= 121.394 )
									ret := -0.069453
								if( tprice > 121.394 )
									ret := -0.426901
					if( tprice > 134.562 )
						if( xmf <= 31.8393 )
							if( source <= 161.53 )
								if( source <= 148.68 )
									ret := 0.055556
								if( source > 148.68 )
									ret := -0.725664 // sell
							if( source > 161.53 )
								if( tprice <= 178.145 )
									ret := 0.555556
								if( tprice > 178.145 )
									ret := -0.195203
						if( xmf > 31.8393 )
							if( verde_azul <= 3.64862 )
								if( nvim <= 1.60624 )
									ret := -0.625000
								if( nvim > 1.60624 )
									ret := 0.625000
							if( verde_azul > 3.64862 )
								if( media_azul <= -1.36555 )
									ret := -0.614035
								if( media_azul > -1.36555 )
									ret := 0.029836
		if( BollOsc > 51.363 )
			if( nvim <= 2.92171 )
				if( nvimax <= 1.80346 )
					if( pvi_ema <= -0.159556 )
						if( nvimin <= 1.36452 )
							if( pvimin <= -0.233765 )
								if( verde_media <= 37.8801 )
									ret := -0.655172
								if( verde_media > 37.8801 )
									ret := 0.214286
							if( pvimin > -0.233765 )
								if( media <= 63.2988 )
									ret := 0.047619
								if( media > 63.2988 )
									ret := -0.800000 // sell
						if( nvimin > 1.36452 )
							if( nvimin <= 1.74439 )
								if( verde_media <= 72.707 )
									ret := -0.377483
								if( verde_media > 72.707 )
									ret := -0.728395 // sell
							if( nvimin > 1.74439 )
								ret := 0.400000
					if( pvi_ema > -0.159556 )
						if( xrsi <= 62.1835 )
							if( verde_media <= 79.6632 )
								if( marron <= 96.5359 )
									ret := -0.526316
								if( marron > 96.5359 )
									ret := -0.108333
							if( verde_media > 79.6632 )
								if( pvim <= 0.392413 )
									ret := -0.777778 // sell
								if( pvim > 0.392413 )
									ret := -1.000000 // sell
						if( xrsi > 62.1835 )
							if( verde_azul <= 172.46 )
								if( verde_azul <= 137.508 )
									ret := -0.067575
								if( verde_azul > 137.508 )
									ret := 0.245974
							if( verde_azul > 172.46 )
								if( verde <= 154.18 )
									ret := 0.900000 // buy
								if( verde > 154.18 )
									ret := -0.320896
				if( nvimax > 1.80346 )
					if( verde <= 217.718 )
						if( pvimax <= -1.2306 )
							if( stoc <= 57.2625 )
								if( pvimin <= -1.66428 )
									ret := 0.000000
								if( pvimin > -1.66428 )
									ret := 0.695652
							if( stoc > 57.2625 )
								if( media <= 78.2709 )
									ret := -0.018550
								if( media > 78.2709 )
									ret := -0.232143
						if( pvimax > -1.2306 )
							if( pvimax <= -0.355705 )
								if( nvim <= 2.78894 )
									ret := -0.415512
								if( nvim > 2.78894 )
									ret := -0.140244
							if( pvimax > -0.355705 )
								if( nvi <= 2.3411 )
									ret := -0.263415
								if( nvi > 2.3411 )
									ret := 0.205263
					if( verde > 217.718 )
						if( azul <= -2.0071 )
							if( pvimax <= -1.20037 )
								if( nvim <= 2.73836 )
									ret := 0.972222 // buy
								if( nvim > 2.73836 )
									ret := 0.200000
							if( pvimax > -1.20037 )
								ret := -0.272727
						if( azul > -2.0071 )
							if( BollOsc <= 89.9388 )
								if( azul <= 10.2877 )
									ret := -0.302326
								if( azul > 10.2877 )
									ret := 0.351648
							if( BollOsc > 89.9388 )
								if( verde <= 249.866 )
									ret := 0.111111
								if( verde > 249.866 )
									ret := -0.916667 // sell
			if( nvim > 2.92171 )
				if( verde_media <= 191.221 )
					if( azul_mean <= -2.91806 )
						if( xmf <= 73.8858 )
							if( BollOsc <= 65.0364 )
								if( pvimax <= -1.95288 )
									ret := -0.190476
								if( pvimax > -1.95288 )
									ret := 0.435484
							if( BollOsc > 65.0364 )
								if( marron <= 115.107 )
									ret := -0.941176 // sell
								if( marron > 115.107 )
									ret := -0.384615
						if( xmf > 73.8858 )
							if( marron <= 116.749 )
								if( verde_media <= 93.041 )
									ret := 1.000000 // buy
								if( verde_media > 93.041 )
									ret := 0.750000 // buy
							if( marron > 116.749 )
								if( media_azul <= 100.443 )
									ret := 0.417722
								if( media_azul > 100.443 )
									ret := -0.049180
					if( azul_mean > -2.91806 )
						if( source <= 72.0576 )
							if( pvi_ema <= -1.81084 )
								if( marron <= 125.873 )
									ret := -0.091880
								if( marron > 125.873 )
									ret := 0.155709
							if( pvi_ema > -1.81084 )
								if( stoc <= 90.9749 )
									ret := -0.724771 // sell
								if( stoc > 90.9749 )
									ret := 0.125000
						if( source > 72.0576 )
							if( stoc <= 79.4153 )
								if( xmf <= 82.2918 )
									ret := 0.230769
								if( xmf > 82.2918 )
									ret := 0.935484 // buy
							if( stoc > 79.4153 )
								if( media <= 104.919 )
									ret := -0.250000
								if( media > 104.919 )
									ret := 0.456522
				if( verde_media > 191.221 )
					if( pvim <= -1.98814 )
						ret := 0.230769
					if( pvim > -1.98814 )
						if( nvi_ema <= 2.96361 )
							ret := 0.818182 // buy
						if( nvi_ema > 2.96361 )
							ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_PYPL_15Min_4dd583d1(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


