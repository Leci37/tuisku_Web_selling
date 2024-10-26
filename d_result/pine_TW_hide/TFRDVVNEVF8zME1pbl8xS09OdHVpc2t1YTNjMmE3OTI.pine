//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: LTCUSDT_30Min_1KON_a3c2a792 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_30Min_1KON_a3c2a792", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_30Min_a3c2a792(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( nvi_ema <= 2.79043 )
		if( BollOsc <= -41.4637 )
			if( marron_mean <= 2.46674 )
				if( verde_azul <= -79.4561 )
					if( oscp <= -104.905 )
						ret := 0.500000
					if( oscp > -104.905 )
						if( nvi_ema <= 0.753805 )
							if( azul_mean <= 8.54589 )
								ret := -0.250000
							if( azul_mean > 8.54589 )
								if( azul <= 74.8385 )
									ret := 0.000000
								if( azul > 74.8385 )
									ret := 0.250000
						if( nvi_ema > 0.753805 )
							if( source <= 197.843 )
								if( pvi <= -0.819018 )
									ret := -0.625000
								if( pvi > -0.819018 )
									ret := -1.000000 // sell
							if( source > 197.843 )
								ret := -0.333333
				if( verde_azul > -79.4561 )
					if( oscp <= -23.7868 )
						if( marron_mean <= -13.4759 )
							ret := -1.000000 // sell
						if( marron_mean > -13.4759 )
							if( media <= 20.5501 )
								if( nvimin <= 2.7766 )
									ret := 0.604651
								if( nvimin > 2.7766 )
									ret := -1.000000 // sell
							if( media > 20.5501 )
								if( xrsi <= 21.0854 )
									ret := 0.857143 // buy
								if( xrsi > 21.0854 )
									ret := -0.452381
					if( oscp > -23.7868 )
						if( verde_media <= -28.8678 )
							if( verde_azul <= 25.1319 )
								if( media_azul <= 29.1391 )
									ret := -0.791667 // sell
								if( media_azul > 29.1391 )
									ret := 0.214286
							if( verde_azul > 25.1319 )
								if( tprice <= 48.6925 )
									ret := -0.750000 // sell
								if( tprice > 48.6925 )
									ret := -1.000000 // sell
						if( verde_media > -28.8678 )
							if( xmf <= 22.0823 )
								ret := 1.000000 // buy
							if( xmf > 22.0823 )
								if( tprice <= 127.644 )
									ret := 0.500000
								if( tprice > 127.644 )
									ret := -0.777778 // sell
			if( marron_mean > 2.46674 )
				if( nvimax <= 0.113781 )
					if( pvi_ema <= -0.203287 )
						if( pvimin <= -0.218401 )
							ret := -0.250000
						if( pvimin > -0.218401 )
							ret := -1.000000 // sell
					if( pvi_ema > -0.203287 )
						if( tprice <= 46.3712 )
							ret := 0.666667
						if( tprice > 46.3712 )
							if( xmf <= 23.8364 )
								ret := 0.428571
							if( xmf > 23.8364 )
								if( pvimax <= -0.060101 )
									ret := -0.103448
								if( pvimax > -0.060101 )
									ret := 0.400000
				if( nvimax > 0.113781 )
					if( azul_mean <= -14.1695 )
						if( xmf <= 37.7085 )
							if( BollOsc <= -44.2137 )
								if( source <= 47.7147 )
									ret := -0.250000
								if( source > 47.7147 )
									ret := 0.728571 // buy
							if( BollOsc > -44.2137 )
								if( oscp <= -9.08543 )
									ret := 0.666667
								if( oscp > -9.08543 )
									ret := -0.461538
						if( xmf > 37.7085 )
							if( media <= 40.1484 )
								if( azul <= -31.4587 )
									ret := -0.761905 // sell
								if( azul > -31.4587 )
									ret := 0.291667
							if( media > 40.1484 )
								if( media <= 61.3611 )
									ret := 0.607143
								if( media > 61.3611 )
									ret := 0.000000
					if( azul_mean > -14.1695 )
						if( media <= 63.2822 )
							if( azul_mean <= -5.90973 )
								if( verde <= -75.3663 )
									ret := 0.809524 // buy
								if( verde > -75.3663 )
									ret := -0.014925
							if( azul_mean > -5.90973 )
								if( pvimin <= -0.344021 )
									ret := 0.523490
								if( pvimin > -0.344021 )
									ret := 0.261416
						if( media > 63.2822 )
							if( stoc <= 33.0254 )
								if( xrsi <= 42.2689 )
									ret := 1.000000 // buy
								if( xrsi > 42.2689 )
									ret := 0.500000
							if( stoc > 33.0254 )
								if( xmf <= 32.9853 )
									ret := -0.600000
								if( xmf > 32.9853 )
									ret := 0.666667
		if( BollOsc > -41.4637 )
			if( tprice <= 312.851 )
				if( stoc <= 84.8277 )
					if( media <= 99.9138 )
						if( pvi_ema <= 0.623895 )
							if( nvi_ema <= 2.776 )
								if( azul_mean <= -23.1211 )
									ret := 0.309656
								if( azul_mean > -23.1211 )
									ret := 0.087269
							if( nvi_ema > 2.776 )
								if( nvi <= 2.76554 )
									ret := -0.555556
								if( nvi > 2.76554 )
									ret := 0.432432
						if( pvi_ema > 0.623895 )
							if( nvim <= 0.750499 )
								ret := 0.600000
							if( nvim > 0.750499 )
								if( azul_mean <= -23.3582 )
									ret := -0.250000
								if( azul_mean > -23.3582 )
									ret := -0.948718 // sell
					if( media > 99.9138 )
						if( source <= 243.84 )
							if( verde <= 147.639 )
								if( source <= 52.5533 )
									ret := -0.285714
								if( source > 52.5533 )
									ret := 0.522556
							if( verde > 147.639 )
								if( source <= 158.078 )
									ret := 0.189655
								if( source > 158.078 )
									ret := -0.764706 // sell
						if( source > 243.84 )
							if( stoc <= 75.312 )
								if( media_azul <= 86.9356 )
									ret := 0.500000
								if( media_azul > 86.9356 )
									ret := 1.000000 // buy
							if( stoc > 75.312 )
								if( verde_media <= 21.6774 )
									ret := -0.166667
								if( verde_media > 21.6774 )
									ret := -0.739130 // sell
				if( stoc > 84.8277 )
					if( verde_mean <= 120.241 )
						if( marron <= 99.378 )
							if( pvimin <= -0.957061 )
								if( pvi <= -0.963532 )
									ret := 0.214286
								if( pvi > -0.963532 )
									ret := 0.954545 // buy
							if( pvimin > -0.957061 )
								if( media <= 99.8321 )
									ret := -0.012048
								if( media > 99.8321 )
									ret := -0.793103 // sell
						if( marron > 99.378 )
							if( azul_mean <= 2.73071 )
								if( verde <= 131.671 )
									ret := -0.792793 // sell
								if( verde > 131.671 )
									ret := 0.071429
							if( azul_mean > 2.73071 )
								if( verde_media <= 56.5908 )
									ret := -0.356890
								if( verde_media > 56.5908 )
									ret := 0.571429
					if( verde_mean > 120.241 )
						if( oscp <= 30.4644 )
							if( xrsi <= 86.9227 )
								if( pvimin <= -0.642862 )
									ret := 0.656250
								if( pvimin > -0.642862 )
									ret := 0.222222
							if( xrsi > 86.9227 )
								if( nvim <= 0.655592 )
									ret := 0.000000
								if( nvim > 0.655592 )
									ret := -1.000000 // sell
						if( oscp > 30.4644 )
							if( verde_mean <= 141.54 )
								if( verde_azul <= 115.594 )
									ret := 0.833333 // buy
								if( verde_azul > 115.594 )
									ret := -0.638554
							if( verde_mean > 141.54 )
								if( xmf <= 74.0932 )
									ret := -0.533333
								if( xmf > 74.0932 )
									ret := 0.099631
			if( tprice > 312.851 )
				if( pvi <= 0.17193 )
					if( nvi_ema <= 2.43861 )
						if( nvi_ema <= 2.39086 )
							if( tprice <= 353.068 )
								if( verde_media <= 15.9222 )
									ret := 0.453901
								if( verde_media > 15.9222 )
									ret := -0.182927
							if( tprice > 353.068 )
								if( azul_mean <= -1.59852 )
									ret := 0.000000
								if( azul_mean > -1.59852 )
									ret := -0.833333 // sell
						if( nvi_ema > 2.39086 )
							if( marron_mean <= 55.3045 )
								if( azul <= 13.9962 )
									ret := -1.000000 // sell
								if( azul > 13.9962 )
									ret := -0.500000
							if( marron_mean > 55.3045 )
								if( xmf <= 75.2806 )
									ret := 0.859649 // buy
								if( xmf > 75.2806 )
									ret := -0.142857
					if( nvi_ema > 2.43861 )
						if( marron <= 25.4093 )
							if( pvim <= -0.055621 )
								ret := 1.000000 // buy
							if( pvim > -0.055621 )
								ret := 0.250000
						if( marron > 25.4093 )
							if( pvim <= -0.154744 )
								if( media_azul <= 91.1719 )
									ret := 0.197183
								if( media_azul > 91.1719 )
									ret := -0.958333 // sell
							if( pvim > -0.154744 )
								if( xmf <= 42.419 )
									ret := -0.214286
								if( xmf > 42.419 )
									ret := -0.864078 // sell
				if( pvi > 0.17193 )
					if( pvimax <= 0.226618 )
						if( nvi_ema <= 2.29769 )
							if( marron_mean <= 87.5026 )
								if( verde <= 74.8122 )
									ret := -0.500000
								if( verde > 74.8122 )
									ret := -1.000000 // sell
							if( marron_mean > 87.5026 )
								ret := 0.000000
						if( nvi_ema > 2.29769 )
							if( nvim <= 2.30899 )
								if( pvi <= 0.181851 )
									ret := -0.250000
								if( pvi > 0.181851 )
									ret := 0.960000 // buy
							if( nvim > 2.30899 )
								if( BollOsc <= 33.7036 )
									ret := 0.400000
								if( BollOsc > 33.7036 )
									ret := -0.833333 // sell
					if( pvimax > 0.226618 )
						if( xrsi <= 74.4988 )
							if( verde <= 3.20705 )
								ret := 0.500000
							if( verde > 3.20705 )
								if( nvi <= 2.03528 )
									ret := 0.000000
								if( nvi > 2.03528 )
									ret := -0.884298 // sell
						if( xrsi > 74.4988 )
							if( verde_mean <= 175.871 )
								if( xrsi <= 80.6971 )
									ret := 0.250000
								if( xrsi > 80.6971 )
									ret := -0.833333 // sell
							if( verde_mean > 175.871 )
								ret := 1.000000 // buy
	if( nvi_ema > 2.79043 )
		if( pvimin <= -0.91895 )
			if( BollOsc <= -42.962 )
				if( nvim <= 7.94286 )
					if( tprice <= 45.5464 )
						if( media <= 45.4554 )
							if( marron <= 3.66261 )
								ret := 1.000000 // buy
							if( marron > 3.66261 )
								if( verde_media <= -52.0358 )
									ret := 0.500000
								if( verde_media > -52.0358 )
									ret := 1.000000 // buy
						if( media > 45.4554 )
							ret := 0.250000
					if( tprice > 45.5464 )
						if( verde_mean <= -24.1625 )
							if( xmf <= 13.2226 )
								if( verde_media <= -55.4616 )
									ret := 0.132479
								if( verde_media > -55.4616 )
									ret := 0.522936
							if( xmf > 13.2226 )
								if( oscp <= -38.9826 )
									ret := 0.078629
								if( oscp > -38.9826 )
									ret := -0.182624
						if( verde_mean > -24.1625 )
							if( media <= 71.9768 )
								if( marron_mean <= 3.1341 )
									ret := 0.414815
								if( marron_mean > 3.1341 )
									ret := 0.135072
							if( media > 71.9768 )
								if( verde_azul <= 3.31207 )
									ret := 0.854545 // buy
								if( verde_azul > 3.31207 )
									ret := 0.000000
				if( nvim > 7.94286 )
					if( media_azul <= 90.5984 )
						if( source <= 62.9988 )
							if( marron_mean <= 27.0125 )
								if( oscp <= -42.3205 )
									ret := 0.406250
								if( oscp > -42.3205 )
									ret := -0.290909
							if( marron_mean > 27.0125 )
								if( media_azul <= 38.3233 )
									ret := 0.200000
								if( media_azul > 38.3233 )
									ret := 0.937500 // buy
						if( source > 62.9988 )
							if( xrsi <= 12.9491 )
								if( marron_mean <= -10.826 )
									ret := 0.875000 // buy
								if( marron_mean > -10.826 )
									ret := 0.000000
							if( xrsi > 12.9491 )
								if( xrsi <= 18.3537 )
									ret := -0.482759
								if( xrsi > 18.3537 )
									ret := -0.152610
					if( media_azul > 90.5984 )
						if( marron_mean <= 51.1841 )
							if( xrsi <= 12.505 )
								ret := 0.857143 // buy
							if( xrsi > 12.505 )
								if( marron <= -4.20897 )
									ret := -0.500000
								if( marron > -4.20897 )
									ret := 0.214286
						if( marron_mean > 51.1841 )
							if( nvimax <= 8.58435 )
								ret := 1.000000 // buy
							if( nvimax > 8.58435 )
								ret := 0.571429
			if( BollOsc > -42.962 )
				if( azul <= 70.0261 )
					if( tprice <= 267.851 )
						if( verde_media <= 93.8748 )
							if( tprice <= 63.184 )
								if( media <= 80.2708 )
									ret := 0.107017
								if( media > 80.2708 )
									ret := -0.027900
							if( tprice > 63.184 )
								if( oscp <= -6.1926 )
									ret := 0.056582
								if( oscp > -6.1926 )
									ret := -0.002675
						if( verde_media > 93.8748 )
							if( azul_mean <= -19.1141 )
								if( marron <= 121.537 )
									ret := 0.760000 // buy
								if( marron > 121.537 )
									ret := 0.309524
							if( azul_mean > -19.1141 )
								if( stoc <= 58.9766 )
									ret := -0.428571
								if( stoc > 58.9766 )
									ret := 0.184900
					if( tprice > 267.851 )
						if( verde_mean <= 139.323 )
							if( azul_mean <= -9.01301 )
								if( xmf <= 68.3171 )
									ret := -0.500000
								if( xmf > 68.3171 )
									ret := 1.000000 // buy
							if( azul_mean > -9.01301 )
								if( azul <= -7.96998 )
									ret := 0.000000
								if( azul > -7.96998 )
									ret := -0.789474 // sell
						if( verde_mean > 139.323 )
							if( BollOsc <= 47.3055 )
								ret := 1.000000 // buy
							if( BollOsc > 47.3055 )
								ret := 0.500000
				if( azul > 70.0261 )
					if( media <= 97.1596 )
						if( BollOsc <= -34.9994 )
							if( verde_azul <= -143.488 )
								ret := -0.714286 // sell
							if( verde_azul > -143.488 )
								if( xmf <= 37.838 )
									ret := 0.666667
								if( xmf > 37.838 )
									ret := -0.222222
						if( BollOsc > -34.9994 )
							if( azul_mean <= 115.502 )
								if( media_azul <= -31.6993 )
									ret := -0.497890
								if( media_azul > -31.6993 )
									ret := -0.220588
							if( azul_mean > 115.502 )
								ret := 0.833333 // buy
					if( media > 97.1596 )
						if( marron <= 92.2246 )
							ret := 1.000000 // buy
						if( marron > 92.2246 )
							if( marron <= 131.54 )
								if( media_azul <= -14.6128 )
									ret := -1.000000 // sell
								if( media_azul > -14.6128 )
									ret := -0.142857
							if( marron > 131.54 )
								if( stoc <= 86.4006 )
									ret := 0.937500 // buy
								if( stoc > 86.4006 )
									ret := 0.200000
		if( pvimin > -0.91895 )
			if( azul <= -4.65983 )
				if( verde_mean <= 11.4674 )
					if( media <= 28.9983 )
						if( media <= 18.5735 )
							if( stoc <= 12.4162 )
								if( pvimax <= -0.801252 )
									ret := 0.000000
								if( pvimax > -0.801252 )
									ret := 0.750000 // buy
							if( stoc > 12.4162 )
								if( media <= 13.6199 )
									ret := -0.387097
								if( media > 13.6199 )
									ret := -0.961538 // sell
						if( media > 18.5735 )
							if( nvimax <= 2.83174 )
								if( verde_mean <= -11.5353 )
									ret := -0.928571 // sell
								if( verde_mean > -11.5353 )
									ret := -0.142857
							if( nvimax > 2.83174 )
								if( marron_mean <= 14.7763 )
									ret := 0.520000
								if( marron_mean > 14.7763 )
									ret := -0.500000
					if( media > 28.9983 )
						if( verde_media <= -95.9656 )
							ret := 0.500000
						if( verde_media > -95.9656 )
							if( BollOsc <= -55.4839 )
								if( verde_azul <= -25.0522 )
									ret := -1.000000 // sell
								if( verde_azul > -25.0522 )
									ret := -0.500000
							if( BollOsc > -55.4839 )
								if( verde_azul <= 28.2178 )
									ret := -0.980769 // sell
								if( verde_azul > 28.2178 )
									ret := -0.750000 // sell
				if( verde_mean > 11.4674 )
					if( media_azul <= 86.3173 )
						if( media_azul <= 54.7346 )
							if( marron_mean <= 43.5154 )
								if( nvim <= 2.80762 )
									ret := 0.200000
								if( nvim > 2.80762 )
									ret := -0.763158 // sell
							if( marron_mean > 43.5154 )
								ret := 0.428571
						if( media_azul > 54.7346 )
							if( tprice <= 181.969 )
								if( BollOsc <= -14.2847 )
									ret := 0.166667
								if( BollOsc > -14.2847 )
									ret := -0.730769 // sell
							if( tprice > 181.969 )
								if( media <= 39.2993 )
									ret := -0.666667
								if( media > 39.2993 )
									ret := 0.382022
					if( media_azul > 86.3173 )
						if( source <= 264.482 )
							if( media <= 54.4594 )
								ret := 0.428571
							if( media > 54.4594 )
								if( azul_mean <= -2.24366 )
									ret := -0.675000
								if( azul_mean > -2.24366 )
									ret := -0.233333
						if( source > 264.482 )
							if( nvi <= 2.95753 )
								ret := 0.500000
							if( nvi > 2.95753 )
								ret := 1.000000 // buy
			if( azul > -4.65983 )
				if( tprice <= 213.645 )
					if( azul_mean <= -5.92019 )
						if( nvimin <= 2.7877 )
							ret := -1.000000 // sell
						if( nvimin > 2.7877 )
							if( tprice <= 178.198 )
								if( oscp <= -25.736 )
									ret := -0.833333 // sell
								if( oscp > -25.736 )
									ret := 0.320000
							if( tprice > 178.198 )
								if( azul <= 11.0375 )
									ret := -0.214286
								if( azul > 11.0375 )
									ret := -1.000000 // sell
					if( azul_mean > -5.92019 )
						if( verde_azul <= 24.107 )
							if( pvi <= -0.897483 )
								if( xrsi <= 22.0916 )
									ret := 1.000000 // buy
								if( xrsi > 22.0916 )
									ret := -0.375000
							if( pvi > -0.897483 )
								if( media_azul <= -27.6854 )
									ret := -0.363636
								if( media_azul > -27.6854 )
									ret := 0.609589
						if( verde_azul > 24.107 )
							if( source <= 210.706 )
								if( pvimax <= -0.721553 )
									ret := 0.058824
								if( pvimax > -0.721553 )
									ret := -0.426471
							if( source > 210.706 )
								if( marron <= 89.7003 )
									ret := 1.000000 // buy
								if( marron > 89.7003 )
									ret := 0.000000
				if( tprice > 213.645 )
					if( verde_media <= 10.6898 )
						if( azul <= 4.73154 )
							if( source <= 216.271 )
								ret := -0.500000
							if( source > 216.271 )
								if( nvi_ema <= 3.24382 )
									ret := 0.913043 // buy
								if( nvi_ema > 3.24382 )
									ret := 0.000000
						if( azul > 4.73154 )
							if( BollOsc <= 24.9461 )
								if( azul <= 42.5297 )
									ret := -0.545455
								if( azul > 42.5297 )
									ret := 0.833333 // buy
							if( BollOsc > 24.9461 )
								if( nvi_ema <= 3.07091 )
									ret := 1.000000 // buy
								if( nvi_ema > 3.07091 )
									ret := 0.500000
					if( verde_media > 10.6898 )
						if( xmf <= 78.873 )
							if( xmf <= 69.8809 )
								if( media <= 83.3323 )
									ret := -0.763158 // sell
								if( media > 83.3323 )
									ret := 0.000000
							if( xmf > 69.8809 )
								ret := -1.000000 // sell
						if( xmf > 78.873 )
							if( verde_media <= 51.5184 )
								ret := 0.000000
							if( verde_media > 51.5184 )
								ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_LTCUSDT_30Min_a3c2a792(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


