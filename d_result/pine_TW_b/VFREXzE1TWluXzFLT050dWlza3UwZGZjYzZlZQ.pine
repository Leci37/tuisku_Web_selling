//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: TTD_15Min_1KON_0dfcc6ee Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TTD_15Min_1KON_0dfcc6ee", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TTD_15Min_0dfcc6ee(nvi, nvi_ema, marron_mean, source, azul, verde_azul, verde_mean, xmf, pvimin, stoc, media, tprice, marron, pvim, pvimax, xrsi, oscp, pvi, nvimax, nvimin, verde, verde_media, azul_mean, nvim, BollOsc, pvi_ema, media_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( verde_media <= -0.5421 )
		if( source <= 48.4577 )
			if( verde_azul <= -26.1399 )
				if( azul <= -2.1772 )
					if( BollOsc <= -36.656 )
						if( stoc <= 5.21359 )
							ret := -0.571429
						if( stoc > 5.21359 )
							if( pvimin <= 0.897711 )
								if( oscp <= -33.4605 )
									ret := 0.807453 // buy
								if( oscp > -33.4605 )
									ret := 0.200000
							if( pvimin > 0.897711 )
								if( verde <= -66.8465 )
									ret := 0.500000
								if( verde > -66.8465 )
									ret := -0.400000
					if( BollOsc > -36.656 )
						ret := -1.000000 // sell
				if( azul > -2.1772 )
					if( azul_mean <= 4.62845 )
						if( nvimin <= 2.34068 )
							if( oscp <= -69.3 )
								if( xrsi <= 24.9821 )
									ret := -0.500000
								if( xrsi > 24.9821 )
									ret := 1.000000 // buy
							if( oscp > -69.3 )
								if( pvimax <= 0.171219 )
									ret := 0.333333
								if( pvimax > 0.171219 )
									ret := -0.577465
						if( nvimin > 2.34068 )
							if( verde_mean <= -22.0476 )
								if( nvim <= 2.58571 )
									ret := 0.750000 // buy
								if( nvim > 2.58571 )
									ret := 1.000000 // buy
							if( verde_mean > -22.0476 )
								if( marron <= -3.62329 )
									ret := -0.750000 // sell
								if( marron > -3.62329 )
									ret := 0.666667
					if( azul_mean > 4.62845 )
						if( media_azul <= 42.5761 )
							if( nvim <= 0.570246 )
								if( verde_mean <= -11.1999 )
									ret := 0.041667
								if( verde_mean > -11.1999 )
									ret := 0.681159
							if( nvim > 0.570246 )
								if( media_azul <= 3.29978 )
									ret := 0.913043 // buy
								if( media_azul > 3.29978 )
									ret := 0.564103
						if( media_azul > 42.5761 )
							if( nvim <= 2.36569 )
								if( marron <= 4.2467 )
									ret := -0.833333 // sell
								if( marron > 4.2467 )
									ret := 0.631579
							if( nvim > 2.36569 )
								ret := -1.000000 // sell
			if( verde_azul > -26.1399 )
				if( pvimin <= 0.875291 )
					if( xrsi <= 44.1754 )
						if( marron_mean <= -0.00367 )
							if( stoc <= 4.67183 )
								if( verde_azul <= -18.6195 )
									ret := -1.000000 // sell
								if( verde_azul > -18.6195 )
									ret := 0.214286
							if( stoc > 4.67183 )
								if( xmf <= 20.2352 )
									ret := 0.777778 // buy
								if( xmf > 20.2352 )
									ret := 0.370370
						if( marron_mean > -0.00367 )
							if( source <= 36.0686 )
								if( verde_mean <= 47.0602 )
									ret := 0.390449
								if( verde_mean > 47.0602 )
									ret := -0.454545
							if( source > 36.0686 )
								if( nvimax <= 0.387975 )
									ret := -0.154034
								if( nvimax > 0.387975 )
									ret := 0.125490
					if( xrsi > 44.1754 )
						if( xrsi <= 60.6755 )
							if( verde_media <= -7.47412 )
								if( verde_azul <= 9.19793 )
									ret := 0.086093
								if( verde_azul > 9.19793 )
									ret := 0.437919
							if( verde_media > -7.47412 )
								if( marron <= 47.8762 )
									ret := 0.493506
								if( marron > 47.8762 )
									ret := 0.000000
						if( xrsi > 60.6755 )
							if( azul_mean <= 7.16048 )
								if( nvi <= 0.230661 )
									ret := -0.588235
								if( nvi > 0.230661 )
									ret := 0.472727
							if( azul_mean > 7.16048 )
								if( media_azul <= 65.1968 )
									ret := 0.363636
								if( media_azul > 65.1968 )
									ret := -0.423423
				if( pvimin > 0.875291 )
					if( BollOsc <= -80.4499 )
						ret := 1.000000 // buy
					if( BollOsc > -80.4499 )
						if( oscp <= -17.0279 )
							if( pvi_ema <= 0.907408 )
								if( nvim <= 2.31093 )
									ret := 0.294118
								if( nvim > 2.31093 )
									ret := -0.714286 // sell
							if( pvi_ema > 0.907408 )
								if( marron_mean <= 5.63336 )
									ret := 0.000000
								if( marron_mean > 5.63336 )
									ret := -0.810811 // sell
						if( oscp > -17.0279 )
							if( xrsi <= 34.5806 )
								if( nvimax <= 2.31335 )
									ret := 0.733333 // buy
								if( nvimax > 2.31335 )
									ret := 0.083333
							if( xrsi > 34.5806 )
								if( azul <= -41.3005 )
									ret := -0.900000 // sell
								if( azul > -41.3005 )
									ret := -0.105263
		if( source > 48.4577 )
			if( nvimin <= 3.34296 )
				if( azul <= -125.789 )
					if( oscp <= 12.4088 )
						if( xrsi <= 28.1134 )
							if( pvi_ema <= 1.70653 )
								if( verde_mean <= -58.6129 )
									ret := 0.000000
								if( verde_mean > -58.6129 )
									ret := 0.857143 // buy
							if( pvi_ema > 1.70653 )
								ret := -0.500000
						if( xrsi > 28.1134 )
							if( BollOsc <= -69.8434 )
								ret := -1.000000 // sell
							if( BollOsc > -69.8434 )
								if( azul_mean <= -39.1571 )
									ret := 0.750000 // buy
								if( azul_mean > -39.1571 )
									ret := -0.250000
					if( oscp > 12.4088 )
						ret := -0.500000
				if( azul > -125.789 )
					if( xmf <= 71.9106 )
						if( azul <= 60.6875 )
							if( stoc <= 79.1264 )
								if( media <= -2.29626 )
									ret := -0.407407
								if( media > -2.29626 )
									ret := 0.065138
							if( stoc > 79.1264 )
								if( pvimax <= 1.43714 )
									ret := 0.206628
								if( pvimax > 1.43714 )
									ret := -0.031519
						if( azul > 60.6875 )
							if( xmf <= 22.464 )
								if( verde_mean <= 59.7443 )
									ret := 0.456140
								if( verde_mean > 59.7443 )
									ret := -0.800000 // sell
							if( xmf > 22.464 )
								if( tprice <= 53.0608 )
									ret := 0.207547
								if( tprice > 53.0608 )
									ret := -0.379447
					if( xmf > 71.9106 )
						if( verde_mean <= 45.0526 )
							if( azul <= -46.4583 )
								if( pvi <= 1.06524 )
									ret := 0.200000
								if( pvi > 1.06524 )
									ret := -0.769231 // sell
							if( azul > -46.4583 )
								if( xmf <= 97.8916 )
									ret := 0.502538
								if( xmf > 97.8916 )
									ret := 0.127660
						if( verde_mean > 45.0526 )
							if( nvim <= 0.365839 )
								if( marron_mean <= 96.9487 )
									ret := 0.000000
								if( marron_mean > 96.9487 )
									ret := -0.718750 // sell
							if( nvim > 0.365839 )
								if( tprice <= 56.6364 )
									ret := 0.533835
								if( tprice > 56.6364 )
									ret := 0.112331
			if( nvimin > 3.34296 )
				if( nvi <= 3.34183 )
					if( verde_azul <= 32.5455 )
						if( tprice <= 70.6648 )
							ret := 0.285714
						if( tprice > 70.6648 )
							if( verde_mean <= -25.6073 )
								ret := 0.600000
							if( verde_mean > -25.6073 )
								if( verde_azul <= 2.59889 )
									ret := 0.750000 // buy
								if( verde_azul > 2.59889 )
									ret := 1.000000 // buy
					if( verde_azul > 32.5455 )
						if( xrsi <= 40.2952 )
							if( media <= 14.3705 )
								ret := 0.750000 // buy
							if( media > 14.3705 )
								if( pvimin <= -0.142388 )
									ret := 0.000000
								if( pvimin > -0.142388 )
									ret := -1.000000 // sell
						if( xrsi > 40.2952 )
							if( verde_media <= -13.0792 )
								ret := 1.000000 // buy
							if( verde_media > -13.0792 )
								ret := 0.750000 // buy
				if( nvi > 3.34183 )
					if( azul <= -24.5981 )
						if( media <= 19.098 )
							if( oscp <= -4.38415 )
								if( verde_media <= -25.7029 )
									ret := 0.275000
								if( verde_media > -25.7029 )
									ret := -0.255814
							if( oscp > -4.38415 )
								if( tprice <= 74.4588 )
									ret := 1.000000 // buy
								if( tprice > 74.4588 )
									ret := 0.500000
						if( media > 19.098 )
							if( xmf <= 59.9466 )
								if( pvimax <= 0.251625 )
									ret := -0.576923
								if( pvimax > 0.251625 )
									ret := 0.409091
							if( xmf > 59.9466 )
								if( media <= 83.1986 )
									ret := 0.619048
								if( media > 83.1986 )
									ret := -0.133333
					if( azul > -24.5981 )
						if( nvi_ema <= 3.36572 )
							if( verde_mean <= 40.4852 )
								if( nvi_ema <= 3.35789 )
									ret := -0.189189
								if( nvi_ema > 3.35789 )
									ret := -0.537815
							if( verde_mean > 40.4852 )
								if( nvim <= 3.35725 )
									ret := 0.252427
								if( nvim > 3.35725 )
									ret := -0.150000
						if( nvi_ema > 3.36572 )
							if( source <= 76.4482 )
								if( oscp <= -54.998 )
									ret := -0.526316
								if( oscp > -54.998 )
									ret := 0.337793
							if( source > 76.4482 )
								if( BollOsc <= -8.55135 )
									ret := 0.027778
								if( BollOsc > -8.55135 )
									ret := -0.189415
	if( verde_media > -0.5421 )
		if( xrsi <= 82.6719 )
			if( verde_media <= 37.4872 )
				if( azul <= -21.0449 )
					if( pvimax <= 1.45371 )
						if( media <= 101.245 )
							if( nvimin <= 3.36319 )
								if( pvi <= 0.813498 )
									ret := 0.227158
								if( pvi > 0.813498 )
									ret := 0.043611
							if( nvimin > 3.36319 )
								if( marron_mean <= 15.2443 )
									ret := 0.473684
								if( marron_mean > 15.2443 )
									ret := -0.440476
						if( media > 101.245 )
							if( nvim <= 2.7307 )
								if( pvimin <= 1.26599 )
									ret := -0.662162
								if( pvimin > 1.26599 )
									ret := 0.125000
							if( nvim > 2.7307 )
								if( azul_mean <= -41.023 )
									ret := -0.571429
								if( azul_mean > -41.023 )
									ret := 0.354839
					if( pvimax > 1.45371 )
						if( pvimin <= 1.45319 )
							if( nvi_ema <= 2.77162 )
								if( nvimax <= 1.24222 )
									ret := 0.166667
								if( nvimax > 1.24222 )
									ret := 0.808989 // buy
							if( nvi_ema > 2.77162 )
								if( nvi_ema <= 2.79176 )
									ret := 0.100000
								if( nvi_ema > 2.79176 )
									ret := -0.250000
						if( pvimin > 1.45319 )
							if( xmf <= 17.2523 )
								if( pvi_ema <= 1.63635 )
									ret := 1.000000 // buy
								if( pvi_ema > 1.63635 )
									ret := 0.750000 // buy
							if( xmf > 17.2523 )
								if( xrsi <= 48.3225 )
									ret := 0.406593
								if( xrsi > 48.3225 )
									ret := 0.053571
				if( azul > -21.0449 )
					if( nvi <= 3.01615 )
						if( pvi_ema <= 1.71002 )
							if( azul_mean <= 74.5422 )
								if( stoc <= 75.3459 )
									ret := 0.006280
								if( stoc > 75.3459 )
									ret := 0.073080
							if( azul_mean > 74.5422 )
								if( xrsi <= 59.729 )
									ret := 0.142857
								if( xrsi > 59.729 )
									ret := -0.607143
						if( pvi_ema > 1.71002 )
							if( nvimin <= 2.29551 )
								if( nvim <= 2.05504 )
									ret := -0.403226
								if( nvim > 2.05504 )
									ret := -0.928571 // sell
							if( nvimin > 2.29551 )
								if( source <= 829.82 )
									ret := 0.708333 // buy
								if( source > 829.82 )
									ret := -0.174863
					if( nvi > 3.01615 )
						if( pvimin <= -0.074219 )
							if( media_azul <= 87.9611 )
								if( pvimax <= 0.072792 )
									ret := -0.030482
								if( pvimax > 0.072792 )
									ret := -0.589286
							if( media_azul > 87.9611 )
								if( BollOsc <= 38.2539 )
									ret := 0.385042
								if( BollOsc > 38.2539 )
									ret := -0.165049
						if( pvimin > -0.074219 )
							if( BollOsc <= -23.1371 )
								if( verde_azul <= 67.0004 )
									ret := -0.565891
								if( verde_azul > 67.0004 )
									ret := 0.411765
							if( BollOsc > -23.1371 )
								if( BollOsc <= 30.7928 )
									ret := -0.045008
								if( BollOsc > 30.7928 )
									ret := -0.189448
			if( verde_media > 37.4872 )
				if( azul <= 4.10926 )
					if( azul_mean <= -1.59588 )
						if( nvi_ema <= 0.150341 )
							if( xmf <= 84.9291 )
								if( verde_media <= 48.4426 )
									ret := -0.176471
								if( verde_media > 48.4426 )
									ret := 0.609375
							if( xmf > 84.9291 )
								if( xrsi <= 80.082 )
									ret := -0.250000
								if( xrsi > 80.082 )
									ret := -1.000000 // sell
						if( nvi_ema > 0.150341 )
							if( verde_mean <= 177.133 )
								if( nvi_ema <= 3.42461 )
									ret := -0.173230
								if( nvi_ema > 3.42461 )
									ret := 0.653846
							if( verde_mean > 177.133 )
								if( marron <= 92.0184 )
									ret := -0.714286 // sell
								if( marron > 92.0184 )
									ret := 0.368000
					if( azul_mean > -1.59588 )
						if( tprice <= 863.911 )
							if( media <= 113.038 )
								if( BollOsc <= 66.7345 )
									ret := 0.033795
								if( BollOsc > 66.7345 )
									ret := -0.259912
							if( media > 113.038 )
								if( verde_media <= 42.6053 )
									ret := -0.428571
								if( verde_media > 42.6053 )
									ret := 0.956522 // buy
						if( tprice > 863.911 )
							if( nvi <= 2.47902 )
								ret := 0.000000
							if( nvi > 2.47902 )
								if( verde <= 174 )
									ret := -0.930233 // sell
								if( verde > 174 )
									ret := 0.200000
				if( azul > 4.10926 )
					if( xmf <= 85.5481 )
						if( verde_azul <= 32.7344 )
							if( stoc <= 75.2055 )
								if( marron_mean <= 29.1307 )
									ret := 0.285714
								if( marron_mean > 29.1307 )
									ret := -0.802632 // sell
							if( stoc > 75.2055 )
								if( xmf <= 53.9495 )
									ret := 0.789474 // buy
								if( xmf > 53.9495 )
									ret := -0.571429
						if( verde_azul > 32.7344 )
							if( source <= 452.737 )
								if( verde_media <= 61.5987 )
									ret := 0.007287
								if( verde_media > 61.5987 )
									ret := -0.158318
							if( source > 452.737 )
								if( verde_azul <= 119.464 )
									ret := 0.315018
								if( verde_azul > 119.464 )
									ret := -0.150000
					if( xmf > 85.5481 )
						if( media <= 45.7884 )
							if( marron <= 111.535 )
								if( xmf <= 98.9686 )
									ret := 0.845070 // buy
								if( xmf > 98.9686 )
									ret := -0.142857
							if( marron > 111.535 )
								ret := -0.333333
						if( media > 45.7884 )
							if( pvi <= 1.72734 )
								if( nvi <= 3.38999 )
									ret := 0.162899
								if( nvi > 3.38999 )
									ret := -0.408163
							if( pvi > 1.72734 )
								if( nvim <= 2.37113 )
									ret := -0.500000
								if( nvim > 2.37113 )
									ret := -1.000000 // sell
		if( xrsi > 82.6719 )
			if( nvim <= 1.5363 )
				if( pvim <= 0.295595 )
					if( media <= 114.881 )
						if( azul_mean <= 53.5169 )
							ret := -1.000000 // sell
						if( azul_mean > 53.5169 )
							ret := -0.500000
					if( media > 114.881 )
						if( verde_azul <= 174.804 )
							if( nvimax <= 0.498808 )
								ret := 1.000000 // buy
							if( nvimax > 0.498808 )
								ret := 0.000000
						if( verde_azul > 174.804 )
							ret := -0.833333 // sell
				if( pvim > 0.295595 )
					if( media_azul <= 80.3424 )
						if( source <= 268.371 )
							if( oscp <= 2.58925 )
								if( azul <= 95.6369 )
									ret := 0.750000 // buy
								if( azul > 95.6369 )
									ret := 1.000000 // buy
							if( oscp > 2.58925 )
								if( verde <= 201.495 )
									ret := 0.241758
								if( verde > 201.495 )
									ret := 0.794118 // buy
						if( source > 268.371 )
							if( azul <= 61.0131 )
								if( stoc <= 94.7946 )
									ret := 0.986486 // buy
								if( stoc > 94.7946 )
									ret := 0.714286 // buy
							if( azul > 61.0131 )
								ret := 0.000000
					if( media_azul > 80.3424 )
						if( BollOsc <= 82.2967 )
							if( azul <= 16.9458 )
								if( media_azul <= 111.629 )
									ret := 0.545113
								if( media_azul > 111.629 )
									ret := -0.010204
							if( azul > 16.9458 )
								if( nvim <= 0.693349 )
									ret := 0.500000
								if( nvim > 0.693349 )
									ret := -0.125984
						if( BollOsc > 82.2967 )
							if( verde_mean <= 146.09 )
								ret := -1.000000 // sell
							if( verde_mean > 146.09 )
								if( marron_mean <= 114.66 )
									ret := 0.750000 // buy
								if( marron_mean > 114.66 )
									ret := -0.500000
			if( nvim > 1.5363 )
				if( marron_mean <= 128.097 )
					if( marron_mean <= 113.698 )
						if( nvi_ema <= 1.66 )
							if( media_azul <= 102.304 )
								ret := 0.500000
							if( media_azul > 102.304 )
								ret := 1.000000 // buy
						if( nvi_ema > 1.66 )
							if( pvimin <= 1.27812 )
								if( stoc <= 77.759 )
									ret := 0.666667
								if( stoc > 77.759 )
									ret := 0.052632
							if( pvimin > 1.27812 )
								if( marron <= 124.495 )
									ret := 0.083333
								if( marron > 124.495 )
									ret := -0.777778 // sell
					if( marron_mean > 113.698 )
						if( verde_azul <= 161.976 )
							if( pvimin <= 1.14027 )
								if( tprice <= 52.133 )
									ret := 0.142857
								if( tprice > 52.133 )
									ret := -0.712963 // sell
							if( pvimin > 1.14027 )
								if( nvimax <= 2.79656 )
									ret := -0.275000
								if( nvimax > 2.79656 )
									ret := 0.857143 // buy
						if( verde_azul > 161.976 )
							if( pvi <= 0.989941 )
								if( verde_azul <= 223.868 )
									ret := 0.071429
								if( verde_azul > 223.868 )
									ret := -0.866667 // sell
							if( pvi > 0.989941 )
								if( azul <= 8.31018 )
									ret := 0.263158
								if( azul > 8.31018 )
									ret := 1.000000 // buy
				if( marron_mean > 128.097 )
					if( tprice <= 531.849 )
						if( BollOsc <= 41.0623 )
							if( pvi_ema <= 1.09679 )
								if( pvi_ema <= 0.071541 )
									ret := -1.000000 // sell
								if( pvi_ema > 0.071541 )
									ret := -0.750000 // sell
							if( pvi_ema > 1.09679 )
								ret := 0.000000
						if( BollOsc > 41.0623 )
							if( verde_azul <= 93.0616 )
								if( media <= 115.129 )
									ret := -1.000000 // sell
								if( media > 115.129 )
									ret := 0.000000
							if( verde_azul > 93.0616 )
								if( azul <= 7.85542 )
									ret := 0.000000
								if( azul > 7.85542 )
									ret := 0.619792
					if( tprice > 531.849 )
						if( marron <= 141.17 )
							if( verde_azul <= 139.741 )
								ret := 0.000000
							if( verde_azul > 139.741 )
								ret := -1.000000 // sell
						if( marron > 141.17 )
							if( azul_mean <= 14.8975 )
								ret := 1.000000 // buy
							if( azul_mean > 14.8975 )
								ret := 0.000000
	
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
float op_operation = decision_tree_0_TTD_15Min_0dfcc6ee(nvi, nvi_ema, marron_mean, source, azul, verde_azul, verde_mean, xmf, pvimin, stoc, media, tprice, marron, pvim, pvimax, xrsi, oscp, pvi, nvimax, nvimin, verde, verde_media, azul_mean, nvim, BollOsc, pvi_ema, media_azul)

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


