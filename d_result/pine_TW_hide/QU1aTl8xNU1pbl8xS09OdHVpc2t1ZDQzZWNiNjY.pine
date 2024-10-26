//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: AMZN_15Min_1KON_d43ecb66 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_15Min_1KON_d43ecb66", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_15Min_d43ecb66(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( media <= 90.9321 )
		if( verde_media <= 15.6604 )
			if( verde_media <= -69.205 )
				if( marron_mean <= 20.0229 )
					if( source <= 3515.16 )
						if( xmf <= 17.9999 )
							if( oscp <= -90.5862 )
								if( oscp <= -149.627 )
									ret := 0.576923
								if( oscp > -149.627 )
									ret := -0.254335
							if( oscp > -90.5862 )
								if( verde <= -44.9024 )
									ret := 0.241699
								if( verde > -44.9024 )
									ret := -0.082397
						if( xmf > 17.9999 )
							if( xmf <= 30.2593 )
								if( verde_media <= -103.146 )
									ret := 0.049505
								if( verde_media > -103.146 )
									ret := -0.192053
							if( xmf > 30.2593 )
								if( BollOsc <= -44.3634 )
									ret := 0.051471
								if( BollOsc > -44.3634 )
									ret := 0.620690
					if( source > 3515.16 )
						if( nvi_ema <= 1.84376 )
							if( xmf <= 22.6998 )
								ret := 0.000000
							if( xmf > 22.6998 )
								ret := -1.000000 // sell
						if( nvi_ema > 1.84376 )
							if( nvi_ema <= 1.88785 )
								if( nvimin <= 1.83322 )
									ret := -0.750000 // sell
								if( nvimin > 1.83322 )
									ret := -1.000000 // sell
							if( nvi_ema > 1.88785 )
								ret := -0.571429
				if( marron_mean > 20.0229 )
					if( verde_azul <= 6.68756 )
						if( pvim <= -1.32668 )
							if( media_azul <= 65.1939 )
								ret := 1.000000 // buy
							if( media_azul > 65.1939 )
								ret := -0.500000
						if( pvim > -1.32668 )
							if( verde <= -86.0135 )
								if( oscp <= -89.4483 )
									ret := -0.047210
								if( oscp > -89.4483 )
									ret := 0.540541
							if( verde > -86.0135 )
								if( verde <= -51.7468 )
									ret := -0.409009
								if( verde > -51.7468 )
									ret := -0.181136
					if( verde_azul > 6.68756 )
						if( marron <= -21.3882 )
							if( marron_mean <= 37.7524 )
								if( media_azul <= 131.05 )
									ret := -1.000000 // sell
								if( media_azul > 131.05 )
									ret := -0.571429
							if( marron_mean > 37.7524 )
								if( azul_mean <= -27.6104 )
									ret := 0.750000 // buy
								if( azul_mean > -27.6104 )
									ret := -0.250000
						if( marron > -21.3882 )
							if( tprice <= 1759.75 )
								if( marron <= 27.869 )
									ret := 0.419476
								if( marron > 27.869 )
									ret := -0.375000
							if( tprice > 1759.75 )
								if( azul_mean <= 0.586064 )
									ret := -0.170940
								if( azul_mean > 0.586064 )
									ret := 0.888889 // buy
			if( verde_media > -69.205 )
				if( pvimax <= 0.106102 )
					if( xrsi <= 2.08731 )
						if( azul_mean <= 27.0086 )
							ret := 1.000000 // buy
						if( azul_mean > 27.0086 )
							ret := 0.833333 // buy
					if( xrsi > 2.08731 )
						if( xrsi <= 8.17166 )
							if( BollOsc <= -1.05922 )
								if( stoc <= 29.9474 )
									ret := -0.468750
								if( stoc > 29.9474 )
									ret := 0.666667
							if( BollOsc > -1.05922 )
								ret := -1.000000 // sell
						if( xrsi > 8.17166 )
							if( xmf <= 29.6422 )
								if( tprice <= 1785.04 )
									ret := 0.069800
								if( tprice > 1785.04 )
									ret := 0.145574
							if( xmf > 29.6422 )
								if( media <= 24.3393 )
									ret := -0.027385
								if( media > 24.3393 )
									ret := 0.062854
				if( pvimax > 0.106102 )
					if( nvimin <= 1.27464 )
						if( stoc <= 11.8287 )
							if( pvimax <= 0.134995 )
								if( verde <= -30.5336 )
									ret := -0.363636
								if( verde > -30.5336 )
									ret := 0.339181
							if( pvimax > 0.134995 )
								if( pvimin <= 0.081233 )
									ret := -0.777778 // sell
								if( pvimin > 0.081233 )
									ret := -0.072464
						if( stoc > 11.8287 )
							if( media <= 9.51194 )
								if( stoc <= 19.4506 )
									ret := 0.117647
								if( stoc > 19.4506 )
									ret := 0.882353 // buy
							if( media > 9.51194 )
								if( xmf <= 23.1962 )
									ret := 0.028481
								if( xmf > 23.1962 )
									ret := -0.189389
					if( nvimin > 1.27464 )
						if( pvimin <= 0.040946 )
							if( media <= 6.74025 )
								ret := 1.000000 // buy
							if( media > 6.74025 )
								if( xmf <= 15.9431 )
									ret := 0.500000
								if( xmf > 15.9431 )
									ret := -0.897959 // sell
						if( pvimin > 0.040946 )
							if( tprice <= 3274.59 )
								if( BollOsc <= -37.2156 )
									ret := -0.126437
								if( BollOsc > -37.2156 )
									ret := 0.177734
							if( tprice > 3274.59 )
								if( verde <= -19.7928 )
									ret := 0.528571
								if( verde > -19.7928 )
									ret := -0.175245
		if( verde_media > 15.6604 )
			if( tprice <= 1977.02 )
				if( verde_media <= 93.2732 )
					if( xmf <= 94.5497 )
						if( BollOsc <= 58.0648 )
							if( verde_mean <= 117.228 )
								if( media <= 34.2152 )
									ret := -0.039701
								if( media > 34.2152 )
									ret := 0.055484
							if( verde_mean > 117.228 )
								if( pvimin <= -1.05118 )
									ret := 0.240964
								if( pvimin > -1.05118 )
									ret := -0.148320
						if( BollOsc > 58.0648 )
							if( tprice <= 106.166 )
								if( xmf <= 46.4998 )
									ret := 0.142857
								if( xmf > 46.4998 )
									ret := -0.535294
							if( tprice > 106.166 )
								if( pvi <= 0.134233 )
									ret := -0.132975
								if( pvi > 0.134233 )
									ret := 0.681818
					if( xmf > 94.5497 )
						if( nvi <= 1.72317 )
							if( nvimax <= 1.44989 )
								if( pvim <= 0.088161 )
									ret := 0.086806
								if( pvim > 0.088161 )
									ret := 0.530303
							if( nvimax > 1.44989 )
								if( azul_mean <= -9.3804 )
									ret := -0.212121
								if( azul_mean > -9.3804 )
									ret := 0.410811
						if( nvi > 1.72317 )
							if( verde_azul <= 98.0158 )
								if( azul_mean <= 5.44729 )
									ret := 0.777778 // buy
								if( azul_mean > 5.44729 )
									ret := -0.043478
							if( verde_azul > 98.0158 )
								if( azul <= -4.06497 )
									ret := 0.000000
								if( azul > -4.06497 )
									ret := -0.828571 // sell
				if( verde_media > 93.2732 )
					if( nvi <= 1.49764 )
						if( pvi <= -0.095047 )
							if( tprice <= 114.927 )
								if( azul_mean <= 10.6202 )
									ret := 0.875000 // buy
								if( azul_mean > 10.6202 )
									ret := -0.750000 // sell
							if( tprice > 114.927 )
								if( pvimax <= -0.865502 )
									ret := -0.853659 // sell
								if( pvimax > -0.865502 )
									ret := -0.360000
						if( pvi > -0.095047 )
							if( xrsi <= 65.3386 )
								if( media <= 53.3008 )
									ret := 0.212766
								if( media > 53.3008 )
									ret := -0.567568
							if( xrsi > 65.3386 )
								if( media_azul <= 71.2419 )
									ret := 0.043103
								if( media_azul > 71.2419 )
									ret := 0.409091
					if( nvi > 1.49764 )
						if( tprice <= 183.19 )
							if( pvi_ema <= -0.852283 )
								if( source <= 115.326 )
									ret := 0.404908
								if( source > 115.326 )
									ret := -0.027586
							if( pvi_ema > -0.852283 )
								if( marron_mean <= 124.514 )
									ret := 0.736196 // buy
								if( marron_mean > 124.514 )
									ret := -0.333333
						if( tprice > 183.19 )
							if( azul_mean <= 42.9942 )
								if( oscp <= 97.6016 )
									ret := -0.410256
								if( oscp > 97.6016 )
									ret := 0.600000
							if( azul_mean > 42.9942 )
								ret := 0.800000 // buy
			if( tprice > 1977.02 )
				if( stoc <= 65.4736 )
					if( verde_azul <= 67.1904 )
						if( pvi_ema <= 0.034493 )
							if( verde_azul <= 46.7241 )
								if( verde_media <= 24.2356 )
									ret := -0.354651
								if( verde_media > 24.2356 )
									ret := 0.158879
							if( verde_azul > 46.7241 )
								if( media <= 26.6099 )
									ret := 0.411765
								if( media > 26.6099 )
									ret := 0.106870
						if( pvi_ema > 0.034493 )
							if( xrsi <= 57.0294 )
								if( tprice <= 3159.31 )
									ret := -0.379310
								if( tprice > 3159.31 )
									ret := -0.016393
							if( xrsi > 57.0294 )
								if( verde <= 92.5087 )
									ret := 0.419355
								if( verde > 92.5087 )
									ret := -0.714286 // sell
					if( verde_azul > 67.1904 )
						if( nvimin <= 1.72382 )
							if( xrsi <= 56.2954 )
								if( pvimax <= 0.110487 )
									ret := -0.468278
								if( pvimax > 0.110487 )
									ret := -0.152381
							if( xrsi > 56.2954 )
								if( nvim <= 1.64991 )
									ret := 0.066667
								if( nvim > 1.64991 )
									ret := -0.705882 // sell
						if( nvimin > 1.72382 )
							if( xmf <= 83.4646 )
								if( pvimin <= -0.133379 )
									ret := -0.097378
								if( pvimin > -0.133379 )
									ret := 0.158798
							if( xmf > 83.4646 )
								if( pvi_ema <= -0.138562 )
									ret := -0.090164
								if( pvi_ema > -0.138562 )
									ret := -0.681818
				if( stoc > 65.4736 )
					if( stoc <= 78.9722 )
						if( media_azul <= 101.293 )
							if( xrsi <= 50.636 )
								if( azul_mean <= -5.89492 )
									ret := 0.205128
								if( azul_mean > -5.89492 )
									ret := -0.449438
							if( xrsi > 50.636 )
								if( tprice <= 3304.6 )
									ret := 0.221191
								if( tprice > 3304.6 )
									ret := 0.002083
						if( media_azul > 101.293 )
							if( xrsi <= 63.8208 )
								if( nvim <= 1.51554 )
									ret := 0.434783
								if( nvim > 1.51554 )
									ret := -0.294118
							if( xrsi > 63.8208 )
								if( nvimax <= 1.79234 )
									ret := -0.958333 // sell
								if( nvimax > 1.79234 )
									ret := -0.437500
					if( stoc > 78.9722 )
						if( verde_azul <= 61.6615 )
							if( azul <= 90.4133 )
								if( BollOsc <= 46.5566 )
									ret := -0.273684
								if( BollOsc > 46.5566 )
									ret := -0.792079 // sell
							if( azul > 90.4133 )
								if( marron_mean <= 107.42 )
									ret := 0.090909
								if( marron_mean > 107.42 )
									ret := 1.000000 // buy
						if( verde_azul > 61.6615 )
							if( tprice <= 2382.87 )
								if( xrsi <= 61.9054 )
									ret := 0.206612
								if( xrsi > 61.9054 )
									ret := -0.367698
							if( tprice > 2382.87 )
								if( xmf <= 58.0686 )
									ret := -0.151304
								if( xmf > 58.0686 )
									ret := 0.060569
	if( media > 90.9321 )
		if( pvimax <= -0.005059 )
			if( tprice <= 116.399 )
				if( media <= 99.029 )
					if( BollOsc <= 51.5439 )
						if( nvimax <= 1.64412 )
							if( BollOsc <= 4.94181 )
								if( xrsi <= 50.6511 )
									ret := -0.705882 // sell
								if( xrsi > 50.6511 )
									ret := 0.117647
							if( BollOsc > 4.94181 )
								if( pvi_ema <= -0.931204 )
									ret := 0.450462
								if( pvi_ema > -0.931204 )
									ret := -0.538462
						if( nvimax > 1.64412 )
							if( media_azul <= 80.266 )
								if( nvi_ema <= 1.66437 )
									ret := 0.928571 // buy
								if( nvi_ema > 1.66437 )
									ret := 0.333333
							if( media_azul > 80.266 )
								if( verde_azul <= 138.295 )
									ret := -0.233766
								if( verde_azul > 138.295 )
									ret := 0.545455
					if( BollOsc > 51.5439 )
						if( verde_azul <= 141.989 )
							if( pvi <= -1.28068 )
								if( pvim <= -1.30069 )
									ret := -0.428571
								if( pvim > -1.30069 )
									ret := 0.714286 // buy
							if( pvi > -1.28068 )
								if( oscp <= 15.5163 )
									ret := -0.783784 // sell
								if( oscp > 15.5163 )
									ret := -0.240000
						if( verde_azul > 141.989 )
							if( verde_azul <= 186.237 )
								if( pvimax <= -1.246 )
									ret := -0.285714
								if( pvimax > -1.246 )
									ret := 0.619048
							if( verde_azul > 186.237 )
								if( xrsi <= 69.404 )
									ret := 1.000000 // buy
								if( xrsi > 69.404 )
									ret := -0.500000
				if( media > 99.029 )
					if( verde_mean <= 150.124 )
						if( pvi <= -1.05945 )
							if( xmf <= 59.8282 )
								if( azul_mean <= 3.23519 )
									ret := -0.710526 // sell
								if( azul_mean > 3.23519 )
									ret := -0.240964
							if( xmf > 59.8282 )
								if( stoc <= 89.5859 )
									ret := 0.109974
								if( stoc > 89.5859 )
									ret := -0.207237
						if( pvi > -1.05945 )
							if( xrsi <= 73.81 )
								if( marron <= 112.602 )
									ret := 0.951220 // buy
								if( marron > 112.602 )
									ret := 0.250000
							if( xrsi > 73.81 )
								if( marron_mean <= 115.021 )
									ret := 0.312500
								if( marron_mean > 115.021 )
									ret := -0.666667
					if( verde_mean > 150.124 )
						if( xmf <= 93.1731 )
							if( nvim <= 1.65261 )
								if( azul_mean <= 21.6969 )
									ret := 0.602564
								if( azul_mean > 21.6969 )
									ret := -0.230769
							if( nvim > 1.65261 )
								if( pvim <= -1.30739 )
									ret := 0.000000
								if( pvim > -1.30739 )
									ret := 0.921875 // buy
						if( xmf > 93.1731 )
							if( media <= 116.084 )
								if( xrsi <= 83.8688 )
									ret := 0.833333 // buy
								if( xrsi > 83.8688 )
									ret := -0.300000
							if( media > 116.084 )
								if( nvimax <= 1.57878 )
									ret := -0.750000 // sell
								if( nvimax > 1.57878 )
									ret := -1.000000 // sell
			if( tprice > 116.399 )
				if( tprice <= 2184.29 )
					if( tprice <= 1957.22 )
						if( nvi_ema <= 1.07211 )
							if( xmf <= 54.9481 )
								if( xrsi <= 72.3575 )
									ret := -0.046729
								if( xrsi > 72.3575 )
									ret := -0.408602
							if( xmf > 54.9481 )
								if( pvimin <= -0.048519 )
									ret := 0.213061
								if( pvimin > -0.048519 )
									ret := -0.034884
						if( nvi_ema > 1.07211 )
							if( media <= 112.968 )
								if( verde_mean <= 148.496 )
									ret := -0.036212
								if( verde_mean > 148.496 )
									ret := 0.154967
							if( media > 112.968 )
								if( media_azul <= 112.974 )
									ret := -0.126812
								if( media_azul > 112.974 )
									ret := -0.509615
					if( tprice > 1957.22 )
						if( nvimin <= 1.11987 )
							if( pvimin <= -0.053165 )
								if( marron <= 119.619 )
									ret := -0.966667 // sell
								if( marron > 119.619 )
									ret := -0.562500
							if( pvimin > -0.053165 )
								if( pvi <= -0.020039 )
									ret := 0.166667
								if( pvi > -0.020039 )
									ret := -0.571429
						if( nvimin > 1.11987 )
							if( pvi_ema <= -0.036063 )
								if( pvimax <= -0.072809 )
									ret := 0.116667
								if( pvimax > -0.072809 )
									ret := -0.584906
							if( pvi_ema > -0.036063 )
								if( stoc <= 91.1773 )
									ret := 0.396825
								if( stoc > 91.1773 )
									ret := -0.423077
				if( tprice > 2184.29 )
					if( source <= 3736.44 )
						if( tprice <= 2229.47 )
							if( azul <= -0.633476 )
								ret := -0.250000
							if( azul > -0.633476 )
								if( oscp <= 19.6411 )
									ret := 0.937500 // buy
								if( oscp > 19.6411 )
									ret := 0.250000
						if( tprice > 2229.47 )
							if( nvimax <= 1.85733 )
								if( azul_mean <= 60.3718 )
									ret := 0.165743
								if( azul_mean > 60.3718 )
									ret := -0.514286
							if( nvimax > 1.85733 )
								if( azul_mean <= -10.5453 )
									ret := 0.353535
								if( azul_mean > -10.5453 )
									ret := -0.087931
					if( source > 3736.44 )
						if( marron_mean <= 125.396 )
							if( pvi <= -0.082305 )
								ret := -0.250000
							if( pvi > -0.082305 )
								if( nvi <= 1.82318 )
									ret := -0.750000 // sell
								if( nvi > 1.82318 )
									ret := -1.000000 // sell
						if( marron_mean > 125.396 )
							ret := 0.000000
		if( pvimax > -0.005059 )
			if( stoc <= 70.0883 )
				if( source <= 1751.02 )
					if( azul <= -47.973 )
						if( pvim <= 0.027981 )
							if( tprice <= 1062.08 )
								ret := -1.000000 // sell
							if( tprice > 1062.08 )
								ret := -0.750000 // sell
						if( pvim > 0.027981 )
							ret := -0.250000
					if( azul > -47.973 )
						if( xrsi <= 53.5325 )
							if( verde_media <= -50.6457 )
								if( azul_mean <= -2.6905 )
									ret := 0.857143 // buy
								if( azul_mean > -2.6905 )
									ret := 0.090909
							if( verde_media > -50.6457 )
								if( xrsi <= 52.1505 )
									ret := 1.000000 // buy
								if( xrsi > 52.1505 )
									ret := 0.583333
						if( xrsi > 53.5325 )
							if( azul_mean <= -4.24606 )
								if( azul <= -13.6121 )
									ret := 0.076923
								if( azul > -13.6121 )
									ret := -0.355556
							if( azul_mean > -4.24606 )
								if( pvimin <= 0.001398 )
									ret := 0.655738
								if( pvimin > 0.001398 )
									ret := 0.226667
				if( source > 1751.02 )
					if( source <= 3181.82 )
						if( media_azul <= 152.648 )
							if( nvimin <= 1.22802 )
								if( source <= 1800.27 )
									ret := -0.724138 // sell
								if( source > 1800.27 )
									ret := -0.123596
							if( nvimin > 1.22802 )
								if( stoc <= 46.5823 )
									ret := -0.625000
								if( stoc > 46.5823 )
									ret := 0.327869
						if( media_azul > 152.648 )
							if( verde <= 81.2473 )
								ret := 0.000000
							if( verde > 81.2473 )
								ret := -1.000000 // sell
					if( source > 3181.82 )
						if( source <= 3378.16 )
							if( verde_azul <= 145.666 )
								if( BollOsc <= 14.2775 )
									ret := -0.435897
								if( BollOsc > 14.2775 )
									ret := -0.903846 // sell
							if( verde_azul > 145.666 )
								if( verde <= 172.552 )
									ret := 0.500000
								if( verde > 172.552 )
									ret := -0.857143 // sell
						if( source > 3378.16 )
							ret := 1.000000 // buy
			if( stoc > 70.0883 )
				if( media <= 116.598 )
					if( verde <= 177.18 )
						if( tprice <= 3474.34 )
							if( verde_media <= 24.1753 )
								if( marron_mean <= 97.5486 )
									ret := 0.095971
								if( marron_mean > 97.5486 )
									ret := 0.232105
							if( verde_media > 24.1753 )
								if( stoc <= 90.5321 )
									ret := 0.169565
								if( stoc > 90.5321 )
									ret := 0.000954
						if( tprice > 3474.34 )
							if( stoc <= 94.325 )
								if( xmf <= 50.9 )
									ret := -0.500000
								if( xmf > 50.9 )
									ret := -0.968750 // sell
							if( stoc > 94.325 )
								if( oscp <= 6.31821 )
									ret := 1.000000 // buy
								if( oscp > 6.31821 )
									ret := 0.000000
					if( verde > 177.18 )
						if( tprice <= 1440.98 )
							if( pvimax <= 0.039484 )
								if( verde_azul <= 161.71 )
									ret := 0.250000
								if( verde_azul > 161.71 )
									ret := -0.090909
							if( pvimax > 0.039484 )
								if( marron_mean <= 124.725 )
									ret := -0.300000
								if( marron_mean > 124.725 )
									ret := -1.000000 // sell
						if( tprice > 1440.98 )
							if( stoc <= 75.7211 )
								if( nvimax <= 1.38258 )
									ret := 0.555556
								if( nvimax > 1.38258 )
									ret := -0.700000 // sell
							if( stoc > 75.7211 )
								if( xmf <= 99.2223 )
									ret := 0.700680 // buy
								if( xmf > 99.2223 )
									ret := 0.125000
				if( media > 116.598 )
					if( pvi <= 0.238765 )
						if( stoc <= 82.2816 )
							if( verde_mean <= 136.206 )
								ret := 0.000000
							if( verde_mean > 136.206 )
								if( pvi_ema <= 0.076616 )
									ret := -1.000000 // sell
								if( pvi_ema > 0.076616 )
									ret := -0.750000 // sell
						if( stoc > 82.2816 )
							if( source <= 3464.69 )
								if( nvi_ema <= 0.96774 )
									ret := 0.277592
								if( nvi_ema > 0.96774 )
									ret := 0.646825
							if( source > 3464.69 )
								ret := -1.000000 // sell
					if( pvi > 0.238765 )
						if( azul_mean <= 2.58192 )
							ret := -1.000000 // sell
						if( azul_mean > 2.58192 )
							ret := -0.500000
	
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
float op_operation = decision_tree_0_AMZN_15Min_d43ecb66(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


