//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: LTCUSDT_15Min_1KON_3359162c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_15Min_1KON_3359162c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_15Min_3359162c(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( oscp <= -9.83065 )
		if( marron <= 18.3622 )
			if( media <= -4.95658 )
				if( azul_mean <= -92.2828 )
					ret := 0.400000
				if( azul_mean > -92.2828 )
					if( xrsi <= 12.4111 )
						if( stoc <= 18.7088 )
							ret := -0.166667
						if( stoc > 18.7088 )
							ret := -1.000000 // sell
					if( xrsi > 12.4111 )
						ret := -1.000000 // sell
			if( media > -4.95658 )
				if( xrsi <= 36.3969 )
					if( nvimin <= 3.99434 )
						if( pvimin <= -0.481647 )
							if( tprice <= 45.4491 )
								if( nvimax <= 0.028216 )
									ret := 0.500000
								if( nvimax > 0.028216 )
									ret := 0.985075 // buy
							if( tprice > 45.4491 )
								if( marron <= -8.77576 )
									ret := 0.393182
								if( marron > -8.77576 )
									ret := 0.226675
						if( pvimin > -0.481647 )
							if( tprice <= 70.6873 )
								if( verde_mean <= 9.87489 )
									ret := -0.120643
								if( verde_mean > 9.87489 )
									ret := 0.380597
							if( tprice > 70.6873 )
								if( tprice <= 97.7762 )
									ret := 0.397933
								if( tprice > 97.7762 )
									ret := -0.108108
					if( nvimin > 3.99434 )
						if( verde_media <= -121.864 )
							if( marron_mean <= 37.7216 )
								if( BollOsc <= -80.4453 )
									ret := 0.369565
								if( BollOsc > -80.4453 )
									ret := 0.767677 // buy
							if( marron_mean > 37.7216 )
								ret := -0.428571
						if( verde_media > -121.864 )
							if( azul_mean <= 0.87482 )
								if( media <= 4.86139 )
									ret := 0.393939
								if( media > 4.86139 )
									ret := -0.080365
							if( azul_mean > 0.87482 )
								if( verde_mean <= 2.57505 )
									ret := 0.084270
								if( verde_mean > 2.57505 )
									ret := 0.484163
				if( xrsi > 36.3969 )
					if( azul <= 34.6219 )
						if( nvi <= 0.099479 )
							if( stoc <= 24.132 )
								if( nvimax <= 0.100698 )
									ret := -0.054054
								if( nvimax > 0.100698 )
									ret := -1.000000 // sell
							if( stoc > 24.132 )
								if( xmf <= 40.7555 )
									ret := -0.843750 // sell
								if( xmf > 40.7555 )
									ret := 0.200000
						if( nvi > 0.099479 )
							if( stoc <= 17.5505 )
								if( media <= 39.0069 )
									ret := 0.460674
								if( media > 39.0069 )
									ret := 0.052980
							if( stoc > 17.5505 )
								if( verde_mean <= 56.0608 )
									ret := -0.043348
								if( verde_mean > 56.0608 )
									ret := -0.923077 // sell
					if( azul > 34.6219 )
						if( marron_mean <= 21.1512 )
							if( BollOsc <= -34.0224 )
								if( tprice <= 68.5138 )
									ret := 0.000000
								if( tprice > 68.5138 )
									ret := 0.815789 // buy
							if( BollOsc > -34.0224 )
								ret := -0.200000
						if( marron_mean > 21.1512 )
							if( verde_mean <= 32.421 )
								if( oscp <= -44.3614 )
									ret := -0.500000
								if( oscp > -44.3614 )
									ret := 0.000000
							if( verde_mean > 32.421 )
								ret := 0.750000 // buy
		if( marron > 18.3622 )
			if( tprice <= 93.9435 )
				if( media_azul <= 74.1312 )
					if( nvi <= 4.25608 )
						if( azul <= 62.8465 )
							if( source <= 44.4897 )
								if( pvi <= -0.783728 )
									ret := -0.500000
								if( pvi > -0.783728 )
									ret := -1.000000 // sell
							if( source > 44.4897 )
								if( pvimax <= -0.309951 )
									ret := 0.121750
								if( pvimax > -0.309951 )
									ret := -0.261364
						if( azul > 62.8465 )
							if( xmf <= 24.0194 )
								if( verde_azul <= -68.6655 )
									ret := -0.886364 // sell
								if( verde_azul > -68.6655 )
									ret := 0.000000
							if( xmf > 24.0194 )
								if( media <= 75.2429 )
									ret := 0.068627
								if( media > 75.2429 )
									ret := -0.688889
					if( nvi > 4.25608 )
						if( tprice <= 83.6813 )
							if( xmf <= 54.8257 )
								if( verde_azul <= -11.9943 )
									ret := -0.039936
								if( verde_azul > -11.9943 )
									ret := 0.125554
							if( xmf > 54.8257 )
								if( verde_mean <= 14.1211 )
									ret := 0.466667
								if( verde_mean > 14.1211 )
									ret := -0.200647
						if( tprice > 83.6813 )
							if( verde_azul <= -34.1863 )
								if( xmf <= 30.9285 )
									ret := 0.000000
								if( xmf > 30.9285 )
									ret := -0.704545 // sell
							if( verde_azul > -34.1863 )
								if( pvimin <= -3.94242 )
									ret := -0.055000
								if( pvimin > -3.94242 )
									ret := -0.520000
				if( media_azul > 74.1312 )
					if( BollOsc <= -38.0133 )
						if( stoc <= 36.1896 )
							if( source <= 79.835 )
								if( verde <= 4.98534 )
									ret := -0.803030 // sell
								if( verde > 4.98534 )
									ret := -0.033333
							if( source > 79.835 )
								if( media <= 64.8619 )
									ret := 0.727273 // buy
								if( media > 64.8619 )
									ret := -0.285714
						if( stoc > 36.1896 )
							if( xrsi <= 39.1488 )
								if( media_azul <= 77.6412 )
									ret := 0.000000
								if( media_azul > 77.6412 )
									ret := 0.680000
							if( xrsi > 39.1488 )
								if( media_azul <= 77.7545 )
									ret := 0.800000 // buy
								if( media_azul > 77.7545 )
									ret := -0.578947
					if( BollOsc > -38.0133 )
						if( xmf <= 51.4306 )
							if( azul_mean <= -9.20954 )
								if( source <= 67.4683 )
									ret := -0.277778
								if( source > 67.4683 )
									ret := 0.330769
							if( azul_mean > -9.20954 )
								if( pvi <= -4.1978 )
									ret := 0.140845
								if( pvi > -4.1978 )
									ret := 0.553476
						if( xmf > 51.4306 )
							if( source <= 57.6964 )
								if( azul_mean <= 2.21852 )
									ret := 0.428571
								if( azul_mean > 2.21852 )
									ret := 0.928571 // buy
							if( source > 57.6964 )
								if( nvim <= 0.479956 )
									ret := -0.383333
								if( nvim > 0.479956 )
									ret := 0.179221
			if( tprice > 93.9435 )
				if( azul_mean <= -5.93506 )
					if( xrsi <= 33.5892 )
						if( pvimin <= -0.714089 )
							ret := -1.000000 // sell
						if( pvimin > -0.714089 )
							ret := -0.500000
					if( xrsi > 33.5892 )
						if( azul <= 18.7355 )
							if( pvimin <= -1.14334 )
								if( nvi_ema <= 4.1466 )
									ret := 0.891892 // buy
								if( nvi_ema > 4.1466 )
									ret := 0.222222
							if( pvimin > -1.14334 )
								if( tprice <= 97.4734 )
									ret := 0.000000
								if( tprice > 97.4734 )
									ret := 0.606061
						if( azul > 18.7355 )
							if( source <= 95.9634 )
								ret := -1.000000 // sell
							if( source > 95.9634 )
								ret := -0.250000
				if( azul_mean > -5.93506 )
					if( oscp <= -17.8373 )
						if( stoc <= 24.5318 )
							if( media_azul <= 11.0127 )
								if( media <= 31.9339 )
									ret := 0.166667
								if( media > 31.9339 )
									ret := -0.500000
							if( media_azul > 11.0127 )
								if( xmf <= 28.6937 )
									ret := 0.000000
								if( xmf > 28.6937 )
									ret := -0.830508 // sell
						if( stoc > 24.5318 )
							if( media <= 59.9833 )
								if( xrsi <= 32.9996 )
									ret := 0.476190
								if( xrsi > 32.9996 )
									ret := -0.368889
							if( media > 59.9833 )
								if( xmf <= 44.1319 )
									ret := 0.555556
								if( xmf > 44.1319 )
									ret := -0.147541
					if( oscp > -17.8373 )
						if( azul <= 53.2604 )
							if( verde <= 78.0418 )
								if( tprice <= 95.4544 )
									ret := 0.125828
								if( tprice > 95.4544 )
									ret := -0.158025
							if( verde > 78.0418 )
								if( nvi_ema <= 0.579648 )
									ret := 1.000000 // buy
								if( nvi_ema > 0.579648 )
									ret := 0.750000 // buy
						if( azul > 53.2604 )
							if( azul_mean <= 58.6337 )
								if( source <= 100.61 )
									ret := 0.956522 // buy
								if( source > 100.61 )
									ret := 0.500000
							if( azul_mean > 58.6337 )
								if( oscp <= -11.8025 )
									ret := 0.000000
								if( oscp > -11.8025 )
									ret := -1.000000 // sell
	if( oscp > -9.83065 )
		if( azul <= -2.57537 )
			if( nvimax <= 0.097689 )
				if( xrsi <= 47.453 )
					if( verde_media <= -6.42978 )
						if( tprice <= 57.6605 )
							if( oscp <= 6.89244 )
								if( nvimin <= -0.027467 )
									ret := 0.225000
								if( nvimin > -0.027467 )
									ret := 0.734082 // buy
							if( oscp > 6.89244 )
								ret := -0.750000 // sell
						if( tprice > 57.6605 )
							if( xmf <= 21.4188 )
								if( pvimax <= -0.409018 )
									ret := -1.000000 // sell
								if( pvimax > -0.409018 )
									ret := -0.500000
							if( xmf > 21.4188 )
								if( tprice <= 103.037 )
									ret := 0.392638
								if( tprice > 103.037 )
									ret := -0.714286 // sell
					if( verde_media > -6.42978 )
						if( verde_mean <= 51.63 )
							if( verde_mean <= 8.92609 )
								if( BollOsc <= -28.6625 )
									ret := 0.071429
								if( BollOsc > -28.6625 )
									ret := 0.709677 // buy
							if( verde_mean > 8.92609 )
								if( tprice <= 46.2313 )
									ret := 0.692308
								if( tprice > 46.2313 )
									ret := -0.166667
						if( verde_mean > 51.63 )
							if( verde_media <= 0.868968 )
								if( tprice <= 55.2513 )
									ret := 0.750000 // buy
								if( tprice > 55.2513 )
									ret := -0.466667
							if( verde_media > 0.868968 )
								if( stoc <= 54.8769 )
									ret := 0.368421
								if( stoc > 54.8769 )
									ret := 0.842105 // buy
				if( xrsi > 47.453 )
					if( marron_mean <= 48.7211 )
						if( xmf <= 31.8516 )
							if( pvi_ema <= -0.451268 )
								if( nvim <= 0.040967 )
									ret := 1.000000 // buy
								if( nvim > 0.040967 )
									ret := 0.750000 // buy
							if( pvi_ema > -0.451268 )
								ret := -0.800000 // sell
						if( xmf > 31.8516 )
							if( verde <= 63.7484 )
								if( pvimax <= -0.528814 )
									ret := 0.400000
								if( pvimax > -0.528814 )
									ret := -0.710526 // sell
							if( verde > 63.7484 )
								if( verde <= 79.0334 )
									ret := 0.360000
								if( verde > 79.0334 )
									ret := -0.450000
					if( marron_mean > 48.7211 )
						if( stoc <= 88.4465 )
							if( verde_mean <= 161.854 )
								if( BollOsc <= 34.9983 )
									ret := 0.206985
								if( BollOsc > 34.9983 )
									ret := -0.152985
							if( verde_mean > 161.854 )
								if( media <= 103.222 )
									ret := 0.841270 // buy
								if( media > 103.222 )
									ret := 0.125000
						if( stoc > 88.4465 )
							if( media_azul <= 116.054 )
								if( marron_mean <= 102.811 )
									ret := -0.444444
								if( marron_mean > 102.811 )
									ret := 0.294118
							if( media_azul > 116.054 )
								if( marron_mean <= 117.766 )
									ret := -0.538462
								if( marron_mean > 117.766 )
									ret := -1.000000 // sell
			if( nvimax > 0.097689 )
				if( tprice <= 45.4724 )
					if( nvi <= 0.046667 )
						if( azul_mean <= -7.59939 )
							ret := 0.166667
						if( azul_mean > -7.59939 )
							ret := 1.000000 // buy
					if( nvi > 0.046667 )
						if( media_azul <= 83.7845 )
							if( verde_mean <= 50.6012 )
								if( source <= 42.7471 )
									ret := -0.750000 // sell
								if( source > 42.7471 )
									ret := -1.000000 // sell
							if( verde_mean > 50.6012 )
								if( tprice <= 43.9694 )
									ret := -0.500000
								if( tprice > 43.9694 )
									ret := -1.000000 // sell
						if( media_azul > 83.7845 )
							ret := 0.000000
				if( tprice > 45.4724 )
					if( azul_mean <= -74.5784 )
						if( pvimax <= -0.504411 )
							if( xmf <= 30.7707 )
								if( xrsi <= 29.5674 )
									ret := 0.166667
								if( xrsi > 29.5674 )
									ret := -0.666667
							if( xmf > 30.7707 )
								if( media <= 89.4071 )
									ret := 0.763158 // buy
								if( media > 89.4071 )
									ret := 0.269231
						if( pvimax > -0.504411 )
							if( xmf <= 67.8899 )
								if( pvim <= -0.477756 )
									ret := 0.800000 // buy
								if( pvim > -0.477756 )
									ret := 0.000000
							if( xmf > 67.8899 )
								ret := -1.000000 // sell
					if( azul_mean > -74.5784 )
						if( media <= 108.519 )
							if( oscp <= 6.94884 )
								if( tprice <= 67.3748 )
									ret := 0.127916
								if( tprice > 67.3748 )
									ret := 0.024160
							if( oscp > 6.94884 )
								if( nvimax <= 0.50557 )
									ret := -0.098102
								if( nvimax > 0.50557 )
									ret := 0.023340
						if( media > 108.519 )
							if( tprice <= 73.5011 )
								if( marron <= 118.417 )
									ret := -0.270270
								if( marron > 118.417 )
									ret := 0.540000
							if( tprice > 73.5011 )
								if( nvim <= 0.693814 )
									ret := -0.208333
								if( nvim > 0.693814 )
									ret := 0.498113
		if( azul > -2.57537 )
			if( media <= 84.1778 )
				if( source <= 89.1086 )
					if( media_azul <= -8.55413 )
						if( nvi_ema <= 1.20078 )
							if( verde_mean <= 44.4775 )
								if( xrsi <= 44.1819 )
									ret := -0.578947
								if( xrsi > 44.1819 )
									ret := -0.126984
							if( verde_mean > 44.4775 )
								if( media <= 51.773 )
									ret := -0.571429
								if( media > 51.773 )
									ret := -0.939394 // sell
						if( nvi_ema > 1.20078 )
							if( verde_mean <= 25.1073 )
								if( media <= 10.4337 )
									ret := -0.882353 // sell
								if( media > 10.4337 )
									ret := -0.254237
							if( verde_mean > 25.1073 )
								if( BollOsc <= 86.189 )
									ret := 0.137363
								if( BollOsc > 86.189 )
									ret := -0.875000 // sell
					if( media_azul > -8.55413 )
						if( marron_mean <= 43.3281 )
							if( nvimin <= 0.176289 )
								if( oscp <= -2.51937 )
									ret := 0.077287
								if( oscp > -2.51937 )
									ret := -0.184579
							if( nvimin > 0.176289 )
								if( tprice <= 51.5201 )
									ret := 0.712329 // buy
								if( tprice > 51.5201 )
									ret := 0.106164
						if( marron_mean > 43.3281 )
							if( azul <= 0.381713 )
								if( verde_media <= -41.9422 )
									ret := -0.685714
								if( verde_media > -41.9422 )
									ret := -0.058177
							if( azul > 0.381713 )
								if( stoc <= 45.2674 )
									ret := -0.077354
								if( stoc > 45.2674 )
									ret := 0.043728
				if( source > 89.1086 )
					if( marron_mean <= 51.1966 )
						if( tprice <= 96.5414 )
							if( xmf <= 56.4065 )
								if( azul_mean <= -5.47963 )
									ret := -0.333333
								if( azul_mean > -5.47963 )
									ret := -0.016000
							if( xmf > 56.4065 )
								if( oscp <= -2.36024 )
									ret := 0.085714
								if( oscp > -2.36024 )
									ret := -0.648649
						if( tprice > 96.5414 )
							if( verde_azul <= 13.8379 )
								if( marron <= 62.355 )
									ret := -0.013333
								if( marron > 62.355 )
									ret := 0.909091 // buy
							if( verde_azul > 13.8379 )
								if( media <= 34.9883 )
									ret := -0.641509
								if( media > 34.9883 )
									ret := -0.217514
					if( marron_mean > 51.1966 )
						if( nvim <= 0.884811 )
							if( tprice <= 100.763 )
								if( stoc <= 52.7215 )
									ret := -0.124138
								if( stoc > 52.7215 )
									ret := 0.184573
							if( tprice > 100.763 )
								if( pvi <= -0.014309 )
									ret := -0.478261
								if( pvi > -0.014309 )
									ret := 0.444444
						if( nvim > 0.884811 )
							if( BollOsc <= 74.9784 )
								if( nvi <= 4.09587 )
									ret := -0.064989
								if( nvi > 4.09587 )
									ret := 0.209424
							if( BollOsc > 74.9784 )
								if( verde_azul <= 229.214 )
									ret := -0.740000 // sell
								if( verde_azul > 229.214 )
									ret := 0.750000 // buy
			if( media > 84.1778 )
				if( marron_mean <= 118.173 )
					if( tprice <= 48.1712 )
						if( marron_mean <= 112.39 )
							if( media <= 101.581 )
								if( pvi_ema <= -0.766134 )
									ret := -0.250000
								if( pvi_ema > -0.766134 )
									ret := -0.933333 // sell
							if( media > 101.581 )
								ret := 0.000000
						if( marron_mean > 112.39 )
							ret := 0.500000
					if( tprice > 48.1712 )
						if( verde_azul <= 55.0619 )
							if( verde_mean <= 111.211 )
								if( tprice <= 78.5134 )
									ret := 0.334347
								if( tprice > 78.5134 )
									ret := -0.075145
							if( verde_mean > 111.211 )
								if( media <= 101.162 )
									ret := -0.717391 // sell
								if( media > 101.162 )
									ret := 0.470588
						if( verde_azul > 55.0619 )
							if( pvimin <= -0.399791 )
								if( nvimin <= -0.021257 )
									ret := 0.155080
								if( nvimin > -0.021257 )
									ret := -0.095434
							if( pvimin > -0.399791 )
								if( verde_mean <= 128.768 )
									ret := -0.683453
								if( verde_mean > 128.768 )
									ret := 0.333333
				if( marron_mean > 118.173 )
					if( verde_mean <= 208.341 )
						if( xrsi <= 81.7639 )
							if( source <= 84.6083 )
								if( pvim <= -0.502735 )
									ret := -0.028953
								if( pvim > -0.502735 )
									ret := 0.507042
							if( source > 84.6083 )
								if( verde <= 165.521 )
									ret := 0.365482
								if( verde > 165.521 )
									ret := 0.951220 // buy
						if( xrsi > 81.7639 )
							if( source <= 99.8946 )
								if( source <= 63.9405 )
									ret := 0.115385
								if( source > 63.9405 )
									ret := -0.256364
							if( source > 99.8946 )
								if( tprice <= 102.397 )
									ret := 0.793103 // buy
								if( tprice > 102.397 )
									ret := 0.083333
					if( verde_mean > 208.341 )
						if( pvi <= -0.521339 )
							if( media <= 99.5535 )
								if( marron <= 121.884 )
									ret := 0.863636 // buy
								if( marron > 121.884 )
									ret := -0.521739
							if( media > 99.5535 )
								if( xmf <= 96.1045 )
									ret := 0.803419 // buy
								if( xmf > 96.1045 )
									ret := 0.000000
						if( pvi > -0.521339 )
							if( azul <= 32.0929 )
								ret := -0.142857
							if( azul > 32.0929 )
								if( azul_mean <= 34.8924 )
									ret := -0.500000
								if( azul_mean > 34.8924 )
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
float op_operation = decision_tree_0_LTCUSDT_15Min_3359162c(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


