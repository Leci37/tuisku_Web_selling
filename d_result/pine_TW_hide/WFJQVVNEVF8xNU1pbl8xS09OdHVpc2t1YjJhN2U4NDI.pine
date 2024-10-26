//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: XRPUSDT_15Min_1KON_b2a7e842 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_15Min_1KON_b2a7e842", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_15Min_b2a7e842(oscp, verde_media, verde, marron, azul, media, tprice, xrsi, pvimax, media_azul, nvi_ema, azul_mean, pvim, verde_mean, pvi_ema, xmf, nvi, BollOsc, source, nvimax, pvimin, stoc, marron_mean, pvi, nvim, nvimin, verde_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( oscp <= -0.723464 )
		if( xmf <= 33.6363 )
			if( pvi <= -0.624537 )
				if( verde <= -46.4722 )
					if( nvi <= 4.31001 )
						if( marron_mean <= -7.00792 )
							if( BollOsc <= -84.0606 )
								if( marron <= -30.8201 )
									ret := 1.000000 // buy
								if( marron > -30.8201 )
									ret := 0.888889 // buy
							if( BollOsc > -84.0606 )
								if( pvim <= -1.15901 )
									ret := 0.159292
								if( pvim > -1.15901 )
									ret := 0.500000
						if( marron_mean > -7.00792 )
							if( marron <= -28.8304 )
								if( marron <= -36.4582 )
									ret := 1.000000 // buy
								if( marron > -36.4582 )
									ret := 0.500000
							if( marron > -28.8304 )
								if( media_azul <= 33.7642 )
									ret := -0.206107
								if( media_azul > 33.7642 )
									ret := 0.072423
					if( nvi > 4.31001 )
						if( BollOsc <= -63.782 )
							if( oscp <= -153.343 )
								ret := 1.000000 // buy
							if( oscp > -153.343 )
								if( verde_azul <= -16.1647 )
									ret := 0.183463
								if( verde_azul > -16.1647 )
									ret := 0.849057 // buy
						if( BollOsc > -63.782 )
							if( verde_media <= -87.9702 )
								if( pvi_ema <= -6.52808 )
									ret := 0.478528
								if( pvi_ema > -6.52808 )
									ret := 0.167785
							if( verde_media > -87.9702 )
								if( nvimin <= 9.4538 )
									ret := 0.739583 // buy
								if( nvimin > 9.4538 )
									ret := 0.294118
				if( verde > -46.4722 )
					if( nvim <= 7.35909 )
						if( azul_mean <= -18.6819 )
							if( pvim <= -4.27794 )
								if( pvim <= -4.28005 )
									ret := -0.016340
								if( pvim > -4.28005 )
									ret := -1.000000 // sell
							if( pvim > -4.27794 )
								if( BollOsc <= -35.8132 )
									ret := 0.316731
								if( BollOsc > -35.8132 )
									ret := 0.577947
						if( azul_mean > -18.6819 )
							if( marron <= -12.3174 )
								if( verde <= -37.4475 )
									ret := -0.702128 // sell
								if( verde > -37.4475 )
									ret := 0.500000
							if( marron > -12.3174 )
								if( verde_media <= -15.5487 )
									ret := 0.098543
								if( verde_media > -15.5487 )
									ret := 0.205128
					if( nvim > 7.35909 )
						if( verde_mean <= -35.312 )
							if( marron_mean <= -5.41143 )
								if( pvimin <= -8.78996 )
									ret := -0.235294
								if( pvimin > -8.78996 )
									ret := 0.574074
							if( marron_mean > -5.41143 )
								if( azul <= 19.6195 )
									ret := -0.803030 // sell
								if( azul > 19.6195 )
									ret := -0.230303
						if( verde_mean > -35.312 )
							if( source <= 0.608683 )
								if( media <= 35.4535 )
									ret := 0.098485
								if( media > 35.4535 )
									ret := -0.111838
							if( source > 0.608683 )
								if( BollOsc <= -31.8246 )
									ret := -0.075269
								if( BollOsc > -31.8246 )
									ret := -0.441624
			if( pvi > -0.624537 )
				if( xrsi <= 28.2495 )
					if( marron_mean <= 6.94114 )
						if( azul_mean <= -24.6797 )
							if( azul_mean <= -36.4095 )
								ret := 1.000000 // buy
							if( azul_mean > -36.4095 )
								ret := 0.368421
						if( azul_mean > -24.6797 )
							if( verde_media <= -52.3924 )
								if( pvimin <= -0.421516 )
									ret := -0.416667
								if( pvimin > -0.421516 )
									ret := 0.680000
							if( verde_media > -52.3924 )
								if( azul_mean <= -1.53298 )
									ret := -0.604762
								if( azul_mean > -1.53298 )
									ret := -0.080000
					if( marron_mean > 6.94114 )
						if( verde <= -35.6788 )
							if( media_azul <= 42.5182 )
								if( verde <= -44.9267 )
									ret := -0.750000 // sell
								if( verde > -44.9267 )
									ret := 0.800000 // buy
							if( media_azul > 42.5182 )
								if( nvimax <= 0.103472 )
									ret := -0.750000 // sell
								if( nvimax > 0.103472 )
									ret := -1.000000 // sell
						if( verde > -35.6788 )
							if( marron <= 6.73811 )
								if( BollOsc <= -69.8109 )
									ret := -0.900000 // sell
								if( BollOsc > -69.8109 )
									ret := -1.000000 // sell
							if( marron > 6.73811 )
								if( pvimin <= -0.269355 )
									ret := -1.000000 // sell
								if( pvimin > -0.269355 )
									ret := 0.083333
				if( xrsi > 28.2495 )
					if( BollOsc <= -35.5019 )
						if( verde_media <= -38.4057 )
							if( azul_mean <= 9.93658 )
								if( oscp <= -32.6899 )
									ret := -0.714286 // sell
								if( oscp > -32.6899 )
									ret := 0.363057
							if( azul_mean > 9.93658 )
								if( xrsi <= 37.721 )
									ret := 0.000000
								if( xrsi > 37.721 )
									ret := -0.933333 // sell
						if( verde_media > -38.4057 )
							if( marron <= 17.0414 )
								if( verde <= 5.86729 )
									ret := -0.766355 // sell
								if( verde > 5.86729 )
									ret := 0.037037
							if( marron > 17.0414 )
								if( xmf <= 29.8765 )
									ret := -0.437500
								if( xmf > 29.8765 )
									ret := 0.583333
					if( BollOsc > -35.5019 )
						if( pvimax <= -0.183549 )
							if( xmf <= 31.5199 )
								if( media <= 63.6069 )
									ret := 0.629371
								if( media > 63.6069 )
									ret := -0.454545
							if( xmf > 31.5199 )
								if( nvimax <= -0.016945 )
									ret := -0.666667
								if( nvimax > -0.016945 )
									ret := 0.262295
						if( pvimax > -0.183549 )
							if( source <= 0.588097 )
								ret := -0.550000
							if( source > 0.588097 )
								if( source <= 0.61165 )
									ret := 0.200000
								if( source > 0.61165 )
									ret := -0.615385
		if( xmf > 33.6363 )
			if( pvimax <= -0.379209 )
				if( tprice <= 0.611473 )
					if( xrsi <= 37.7077 )
						if( stoc <= 24.4223 )
							if( media_azul <= 22.082 )
								if( media <= 39.9047 )
									ret := 0.219980
								if( media > 39.9047 )
									ret := -0.621622
							if( media_azul > 22.082 )
								if( verde_azul <= 9.23182 )
									ret := -0.166184
								if( verde_azul > 9.23182 )
									ret := 0.042084
						if( stoc > 24.4223 )
							if( verde_media <= -56.146 )
								if( verde <= -72.3386 )
									ret := 0.628571
								if( verde > -72.3386 )
									ret := -0.056489
							if( verde_media > -56.146 )
								if( verde <= 18.3575 )
									ret := 0.241713
								if( verde > 18.3575 )
									ret := 0.047658
					if( xrsi > 37.7077 )
						if( tprice <= 0.451672 )
							if( azul <= 55.4852 )
								if( xmf <= 44.3772 )
									ret := -0.013514
								if( xmf > 44.3772 )
									ret := 0.122897
							if( azul > 55.4852 )
								if( source <= 0.367333 )
									ret := -0.573099
								if( source > 0.367333 )
									ret := -0.129032
						if( tprice > 0.451672 )
							if( marron_mean <= 107.728 )
								if( pvi_ema <= -5.1179 )
									ret := 0.031201
								if( pvi_ema > -5.1179 )
									ret := -0.066837
							if( marron_mean > 107.728 )
								if( verde_mean <= 111.069 )
									ret := -0.125000
								if( verde_mean > 111.069 )
									ret := 0.705128 // buy
				if( tprice > 0.611473 )
					if( media <= 74.615 )
						if( source <= 0.78825 )
							if( xmf <= 35.2894 )
								if( media_azul <= 12.047 )
									ret := 0.202899
								if( media_azul > 12.047 )
									ret := -0.433898
							if( xmf > 35.2894 )
								if( marron <= 50.1585 )
									ret := -0.051920
								if( marron > 50.1585 )
									ret := 0.076277
						if( source > 0.78825 )
							if( azul_mean <= 5.70679 )
								ret := -0.578947
							if( azul_mean > 5.70679 )
								ret := -1.000000 // sell
					if( media > 74.615 )
						if( verde_media <= -35.9692 )
							if( source <= 0.647491 )
								if( azul <= 12.16 )
									ret := -0.259259
								if( azul > 12.16 )
									ret := 0.857143 // buy
							if( source > 0.647491 )
								if( stoc <= 44.2223 )
									ret := -0.062500
								if( stoc > 44.2223 )
									ret := 0.851064 // buy
						if( verde_media > -35.9692 )
							if( stoc <= 77.2213 )
								if( stoc <= 52.2694 )
									ret := -0.089431
								if( stoc > 52.2694 )
									ret := -0.467480
							if( stoc > 77.2213 )
								if( oscp <= -1.16136 )
									ret := 0.048387
								if( oscp > -1.16136 )
									ret := 0.818182 // buy
			if( pvimax > -0.379209 )
				if( pvi <= -0.359427 )
					if( pvimin <= -0.49278 )
						if( azul_mean <= 8.97847 )
							if( xmf <= 42.3248 )
								ret := 0.400000
							if( xmf > 42.3248 )
								ret := -1.000000 // sell
						if( azul_mean > 8.97847 )
							ret := 0.875000 // buy
					if( pvimin > -0.49278 )
						if( nvimax <= 0.044916 )
							if( pvi <= -0.394797 )
								if( verde_media <= 7.56281 )
									ret := 0.102564
								if( verde_media > 7.56281 )
									ret := 0.592593
							if( pvi > -0.394797 )
								if( media_azul <= 49.7841 )
									ret := -0.750000 // sell
								if( media_azul > 49.7841 )
									ret := -0.121212
						if( nvimax > 0.044916 )
							if( verde <= 2.53513 )
								ret := -0.578947
							if( verde > 2.53513 )
								if( media_azul <= 76.4378 )
									ret := -0.976744 // sell
								if( media_azul > 76.4378 )
									ret := -0.555556
				if( pvi > -0.359427 )
					if( nvimax <= -0.023408 )
						if( oscp <= -7.61136 )
							if( tprice <= 0.564222 )
								if( pvi <= -0.303548 )
									ret := 0.486111
								if( pvi > -0.303548 )
									ret := -0.444444
							if( tprice > 0.564222 )
								if( nvi <= -0.040083 )
									ret := 0.700000 // buy
								if( nvi > -0.040083 )
									ret := 1.000000 // buy
						if( oscp > -7.61136 )
							if( xrsi <= 53.8709 )
								if( source <= 0.416005 )
									ret := 0.636364
								if( source > 0.416005 )
									ret := -0.052632
							if( xrsi > 53.8709 )
								if( verde_azul <= 65.077 )
									ret := -0.454545
								if( verde_azul > 65.077 )
									ret := -0.833333 // sell
					if( nvimax > -0.023408 )
						if( nvimin <= -0.03397 )
							if( marron_mean <= 55.199 )
								if( oscp <= -3.05835 )
									ret := 0.484211
								if( oscp > -3.05835 )
									ret := -0.391304
							if( marron_mean > 55.199 )
								if( nvi_ema <= -0.028521 )
									ret := 0.117647
								if( nvi_ema > -0.028521 )
									ret := -0.600000
						if( nvimin > -0.03397 )
							if( pvi_ema <= -0.243286 )
								if( pvimin <= -0.332758 )
									ret := -0.320513
								if( pvimin > -0.332758 )
									ret := 0.245614
							if( pvi_ema > -0.243286 )
								if( verde_mean <= 12.674 )
									ret := -0.033333
								if( verde_mean > 12.674 )
									ret := -0.486339
	if( oscp > -0.723464 )
		if( verde_mean <= 186.048 )
			if( source <= 0.616334 )
				if( verde_mean <= 128.218 )
					if( pvimax <= -5.29636 )
						if( azul <= -74.6594 )
							if( source <= 0.530795 )
								ret := 0.125000
							if( source > 0.530795 )
								if( source <= 0.545127 )
									ret := -0.888889 // sell
								if( source > 0.545127 )
									ret := -1.000000 // sell
						if( azul > -74.6594 )
							if( xrsi <= 46.1796 )
								if( nvi_ema <= 9.16531 )
									ret := -0.300708
								if( nvi_ema > 9.16531 )
									ret := 0.050218
							if( xrsi > 46.1796 )
								if( verde <= 148.602 )
									ret := 0.024517
								if( verde > 148.602 )
									ret := 0.337580
					if( pvimax > -5.29636 )
						if( oscp <= 2.1496 )
							if( stoc <= 87.7485 )
								if( azul <= -17.7595 )
									ret := 0.315152
								if( azul > -17.7595 )
									ret := 0.013493
							if( stoc > 87.7485 )
								if( tprice <= 0.321875 )
									ret := 0.500000
								if( tprice > 0.321875 )
									ret := -0.330612
						if( oscp > 2.1496 )
							if( azul_mean <= -0.643122 )
								if( tprice <= 0.479226 )
									ret := -0.012999
								if( tprice > 0.479226 )
									ret := -0.145727
							if( azul_mean > -0.643122 )
								if( verde_azul <= 166.239 )
									ret := -0.132251
								if( verde_azul > 166.239 )
									ret := 0.427632
				if( verde_mean > 128.218 )
					if( source <= 0.533773 )
						if( BollOsc <= 72.6271 )
							if( pvi <= -0.882399 )
								if( xrsi <= 74.7043 )
									ret := 0.245841
								if( xrsi > 74.7043 )
									ret := 0.083043
							if( pvi > -0.882399 )
								if( verde_mean <= 135.309 )
									ret := -0.402878
								if( verde_mean > 135.309 )
									ret := -0.035971
						if( BollOsc > 72.6271 )
							if( verde <= 194.285 )
								if( verde_mean <= 156.697 )
									ret := -0.074766
								if( verde_mean > 156.697 )
									ret := 0.675000
							if( verde > 194.285 )
								if( media <= 100.559 )
									ret := -0.080247
								if( media > 100.559 )
									ret := -0.884615 // sell
					if( source > 0.533773 )
						if( media <= 105.753 )
							if( BollOsc <= 19.292 )
								if( nvimin <= 7.02471 )
									ret := 1.000000 // buy
								if( nvimin > 7.02471 )
									ret := 0.333333
							if( BollOsc > 19.292 )
								if( xrsi <= 69.3263 )
									ret := -0.189610
								if( xrsi > 69.3263 )
									ret := 0.041333
						if( media > 105.753 )
							if( azul_mean <= 26.472 )
								if( source <= 0.609062 )
									ret := -0.626087
								if( source > 0.609062 )
									ret := 0.187500
							if( azul_mean > 26.472 )
								if( xmf <= 78.6012 )
									ret := 0.875000 // buy
								if( xmf > 78.6012 )
									ret := -0.687500
			if( source > 0.616334 )
				if( nvimin <= 7.92761 )
					if( source <= 0.656949 )
						if( marron_mean <= 97.8408 )
							if( tprice <= 0.637338 )
								if( azul_mean <= 10.848 )
									ret := -0.077771
								if( azul_mean > 10.848 )
									ret := 0.185771
							if( tprice > 0.637338 )
								if( pvi <= -6.66258 )
									ret := -0.265625
								if( pvi > -6.66258 )
									ret := 0.181329
						if( marron_mean > 97.8408 )
							if( marron <= 130.711 )
								if( nvimin <= 7.65955 )
									ret := -0.289510
								if( nvimin > 7.65955 )
									ret := 0.100840
							if( marron > 130.711 )
								if( verde_azul <= 247.285 )
									ret := 0.628571
								if( verde_azul > 247.285 )
									ret := -0.545455
					if( source > 0.656949 )
						if( azul_mean <= -8.52922 )
							if( verde_mean <= 144.048 )
								if( marron_mean <= 93.716 )
									ret := -0.098947
								if( marron_mean > 93.716 )
									ret := 0.509554
							if( verde_mean > 144.048 )
								if( verde <= 148.39 )
									ret := -0.921053 // sell
								if( verde > 148.39 )
									ret := -0.606061
						if( azul_mean > -8.52922 )
							if( nvi <= 6.38521 )
								if( nvim <= 4.54908 )
									ret := -0.456693
								if( nvim > 4.54908 )
									ret := -0.158484
							if( nvi > 6.38521 )
								if( media <= 59.265 )
									ret := -0.266667
								if( media > 59.265 )
									ret := -0.823944 // sell
				if( nvimin > 7.92761 )
					if( pvi <= -8.83999 )
						if( media <= 99.5065 )
							if( verde_media <= 47.7119 )
								if( verde_azul <= 102.144 )
									ret := -0.035714
								if( verde_azul > 102.144 )
									ret := 0.500000
							if( verde_media > 47.7119 )
								ret := 0.909091 // buy
						if( media > 99.5065 )
							if( media_azul <= 93.9669 )
								ret := -1.000000 // sell
							if( media_azul > 93.9669 )
								if( pvim <= -8.89021 )
									ret := -0.642857
								if( pvim > -8.89021 )
									ret := -0.333333
					if( pvi > -8.83999 )
						if( verde_media <= 9.16241 )
							if( pvim <= -7.61917 )
								if( nvimin <= 9.35877 )
									ret := 0.243590
								if( nvimin > 9.35877 )
									ret := -0.586207
							if( pvim > -7.61917 )
								if( verde_media <= -5.17173 )
									ret := -0.952381 // sell
								if( verde_media > -5.17173 )
									ret := -0.176471
						if( verde_media > 9.16241 )
							if( xmf <= 92.8818 )
								if( BollOsc <= 56.2397 )
									ret := -0.718354 // sell
								if( BollOsc > 56.2397 )
									ret := -0.258065
							if( xmf > 92.8818 )
								ret := 0.833333 // buy
		if( verde_mean > 186.048 )
			if( verde_mean <= 273.366 )
				if( verde <= 296.188 )
					if( stoc <= 71.8392 )
						if( oscp <= 61.5292 )
							if( nvimin <= 6.64376 )
								if( stoc <= 64.5639 )
									ret := 0.466667
								if( stoc > 64.5639 )
									ret := -0.612903
							if( nvimin > 6.64376 )
								if( azul_mean <= -35.0593 )
									ret := -1.000000 // sell
								if( azul_mean > -35.0593 )
									ret := -0.500000
						if( oscp > 61.5292 )
							if( verde_azul <= 188.208 )
								if( tprice <= 0.482565 )
									ret := 1.000000 // buy
								if( tprice > 0.482565 )
									ret := 0.750000 // buy
							if( verde_azul > 188.208 )
								if( BollOsc <= 61.0203 )
									ret := 0.211538
								if( BollOsc > 61.0203 )
									ret := -0.655172
					if( stoc > 71.8392 )
						if( nvi_ema <= 0.639821 )
							if( media_azul <= 93.8051 )
								ret := -0.928571 // sell
							if( media_azul > 93.8051 )
								if( xmf <= 81.946 )
									ret := 0.818182 // buy
								if( xmf > 81.946 )
									ret := 0.187500
						if( nvi_ema > 0.639821 )
							if( source <= 0.686025 )
								if( media <= 119.512 )
									ret := -0.611722
								if( media > 119.512 )
									ret := -0.025000
							if( source > 0.686025 )
								ret := 0.400000
				if( verde > 296.188 )
					if( BollOsc <= 97.5096 )
						if( verde_azul <= 320.091 )
							ret := 0.842105 // buy
						if( verde_azul > 320.091 )
							if( marron <= 146.721 )
								ret := -0.875000 // sell
							if( marron > 146.721 )
								if( source <= 0.558178 )
									ret := 1.000000 // buy
								if( source > 0.558178 )
									ret := 0.750000 // buy
					if( BollOsc > 97.5096 )
						ret := -0.705882 // sell
			if( verde_mean > 273.366 )
				if( azul <= -57.7 )
					if( pvi <= -4.04291 )
						ret := 1.000000 // buy
					if( pvi > -4.04291 )
						ret := 0.700000 // buy
				if( azul > -57.7 )
					if( pvimin <= -1.27079 )
						if( pvi <= -6.56478 )
							ret := 0.800000 // buy
						if( pvi > -6.56478 )
							if( verde_mean <= 294.817 )
								ret := -0.086957
							if( verde_mean > 294.817 )
								ret := -0.958333 // sell
					if( pvimin > -1.27079 )
						ret := 0.789474 // buy
	
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
float op_operation = decision_tree_0_XRPUSDT_15Min_b2a7e842(oscp, verde_media, verde, marron, azul, media, tprice, xrsi, pvimax, media_azul, nvi_ema, azul_mean, pvim, verde_mean, pvi_ema, xmf, nvi, BollOsc, source, nvimax, pvimin, stoc, marron_mean, pvi, nvim, nvimin, verde_azul)

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


