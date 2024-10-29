//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: BTCUSDT_5Min_1KON_bc4b7b56 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_5Min_1KON_bc4b7b56", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_5Min_bc4b7b56(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( stoc <= 53.4002 )
		if( source <= 67893.9 )
			if( source <= 67430.7 )
				if( xrsi <= 26.7952 )
					if( pvi <= -0.881202 )
						if( nvim <= 1.95044 )
							if( source <= 54045.2 )
								if( nvim <= 1.6946 )
									ret := 0.357143
								if( nvim > 1.6946 )
									ret := 1.000000 // buy
							if( source > 54045.2 )
								if( nvi <= 1.75967 )
									ret := -0.399293
								if( nvi > 1.75967 )
									ret := -0.052301
						if( nvim > 1.95044 )
							if( verde_media <= -64.3311 )
								if( nvi_ema <= 2.01112 )
									ret := 0.717949 // buy
								if( nvi_ema > 2.01112 )
									ret := 0.250000
							if( verde_media > -64.3311 )
								if( pvimin <= -1.08988 )
									ret := -0.007067
								if( pvimin > -1.08988 )
									ret := 0.460000
					if( pvi > -0.881202 )
						if( marron_mean <= -1.95435 )
							if( source <= 65532.1 )
								if( tprice <= 61027.1 )
									ret := 0.067961
								if( tprice > 61027.1 )
									ret := -0.244048
							if( source > 65532.1 )
								if( pvi_ema <= -0.467993 )
									ret := 0.123457
								if( pvi_ema > -0.467993 )
									ret := 0.554286
						if( marron_mean > -1.95435 )
							if( xmf <= 30.8446 )
								if( media_azul <= 46.3448 )
									ret := 0.147255
								if( media_azul > 46.3448 )
									ret := 0.386085
							if( xmf > 30.8446 )
								if( pvimax <= 0.078513 )
									ret := 0.294974
								if( pvimax > 0.078513 )
									ret := 0.568720
				if( xrsi > 26.7952 )
					if( verde_mean <= 11.6605 )
						if( oscp <= -12.4566 )
							if( azul_mean <= 40.8453 )
								if( azul <= 57.542 )
									ret := 0.041826
								if( azul > 57.542 )
									ret := -0.286458
							if( azul_mean > 40.8453 )
								if( source <= 65976.1 )
									ret := -0.265399
								if( source > 65976.1 )
									ret := 0.615385
						if( oscp > -12.4566 )
							if( nvim <= 1.09802 )
								if( media <= 32.2768 )
									ret := -0.092073
								if( media > 32.2768 )
									ret := -0.243062
							if( nvim > 1.09802 )
								if( verde_media <= -12.9548 )
									ret := 0.111111
								if( verde_media > -12.9548 )
									ret := -0.117076
					if( verde_mean > 11.6605 )
						if( verde <= 28.6979 )
							if( pvimax <= 0.201865 )
								if( verde_mean <= 34.6021 )
									ret := 0.104122
								if( verde_mean > 34.6021 )
									ret := 0.029826
							if( pvimax > 0.201865 )
								if( verde_mean <= 44.6033 )
									ret := 0.781609 // buy
								if( verde_mean > 44.6033 )
									ret := 0.250000
						if( verde > 28.6979 )
							if( media <= 69.9421 )
								if( pvimax <= -0.093875 )
									ret := -0.002338
								if( pvimax > -0.093875 )
									ret := -0.060090
							if( media > 69.9421 )
								if( source <= 65155.8 )
									ret := 0.118342
								if( source > 65155.8 )
									ret := -0.103679
			if( source > 67430.7 )
				if( pvi_ema <= -0.414274 )
					if( xmf <= 20.2684 )
						if( pvi <= -0.67062 )
							if( nvimin <= 1.62565 )
								ret := -0.100000
							if( nvimin > 1.62565 )
								ret := 0.750000 // buy
						if( pvi > -0.67062 )
							if( azul <= 3.11883 )
								ret := 1.000000 // buy
							if( azul > 3.11883 )
								ret := 0.200000
					if( xmf > 20.2684 )
						if( azul_mean <= 5.35195 )
							if( nvimax <= 1.36121 )
								if( marron_mean <= 11.2578 )
									ret := 0.812500 // buy
								if( marron_mean > 11.2578 )
									ret := -0.100917
							if( nvimax > 1.36121 )
								if( stoc <= 36.6548 )
									ret := 0.140496
								if( stoc > 36.6548 )
									ret := 0.697917
						if( azul_mean > 5.35195 )
							if( source <= 67829.4 )
								if( nvi <= 1.3856 )
									ret := -0.100719
								if( nvi > 1.3856 )
									ret := -0.567010
							if( source > 67829.4 )
								if( stoc <= 28.1917 )
									ret := 0.904762 // buy
								if( stoc > 28.1917 )
									ret := 0.222222
				if( pvi_ema > -0.414274 )
					if( verde_azul <= -9.88212 )
						if( media <= 20.8825 )
							if( media <= 8.53667 )
								ret := 0.769231 // buy
							if( media > 8.53667 )
								if( media_azul <= 19.0226 )
									ret := 0.977011 // buy
								if( media_azul > 19.0226 )
									ret := 0.888889 // buy
						if( media > 20.8825 )
							if( media <= 30.0018 )
								if( verde <= -28.4739 )
									ret := -0.904762 // sell
								if( verde > -28.4739 )
									ret := 0.653846
							if( media > 30.0018 )
								if( verde_media <= -76.5441 )
									ret := 0.187500
								if( verde_media > -76.5441 )
									ret := 0.886076 // buy
					if( verde_azul > -9.88212 )
						if( verde_mean <= 27.3138 )
							if( oscp <= -17.4316 )
								if( marron <= 18.9609 )
									ret := 0.848485 // buy
								if( marron > 18.9609 )
									ret := 0.333333
							if( oscp > -17.4316 )
								if( nvimax <= 1.33353 )
									ret := -0.390805
								if( nvimax > 1.33353 )
									ret := 0.785714 // buy
						if( verde_mean > 27.3138 )
							if( media_azul <= 20.4188 )
								ret := -0.809524 // sell
							if( media_azul > 20.4188 )
								if( media_azul <= 76.9725 )
									ret := 0.652542
								if( media_azul > 76.9725 )
									ret := 0.261538
		if( source > 67893.9 )
			if( nvi_ema <= 1.37859 )
				if( nvimax <= 0.94072 )
					if( pvim <= 0.047426 )
						if( azul_mean <= 25.7665 )
							if( nvi_ema <= 0.897723 )
								if( verde <= 62.9287 )
									ret := -0.154135
								if( verde > 62.9287 )
									ret := 0.575758
							if( nvi_ema > 0.897723 )
								if( nvimax <= 0.919053 )
									ret := 0.753731 // buy
								if( nvimax > 0.919053 )
									ret := 0.265018
						if( azul_mean > 25.7665 )
							if( tprice <= 69226.1 )
								if( nvi_ema <= 0.886937 )
									ret := 0.187500
								if( nvi_ema > 0.886937 )
									ret := 0.800000 // buy
							if( tprice > 69226.1 )
								if( marron_mean <= 30.4653 )
									ret := -0.382353
								if( marron_mean > 30.4653 )
									ret := -1.000000 // sell
					if( pvim > 0.047426 )
						if( media_azul <= 69.8391 )
							if( stoc <= 21.7763 )
								ret := 0.500000
							if( stoc > 21.7763 )
								if( azul_mean <= 11.1121 )
									ret := -0.695652
								if( azul_mean > 11.1121 )
									ret := -0.062500
						if( media_azul > 69.8391 )
							if( tprice <= 73059.3 )
								if( source <= 72941.9 )
									ret := 0.285714
								if( source > 72941.9 )
									ret := 0.909091 // buy
							if( tprice > 73059.3 )
								if( verde_azul <= 72.6174 )
									ret := 0.125000
								if( verde_azul > 72.6174 )
									ret := -0.583333
				if( nvimax > 0.94072 )
					if( pvi_ema <= -0.108596 )
						if( nvi <= 1.13009 )
							if( nvi <= 1.0852 )
								if( pvimax <= -0.150228 )
									ret := -0.571429
								if( pvimax > -0.150228 )
									ret := -0.040741
							if( nvi > 1.0852 )
								if( verde_mean <= 51.134 )
									ret := 0.199416
								if( verde_mean > 51.134 )
									ret := -0.029703
						if( nvi > 1.13009 )
							if( media_azul <= 36.8802 )
								if( marron <= -0.800089 )
									ret := 0.350000
								if( marron > -0.800089 )
									ret := -0.216049
							if( media_azul > 36.8802 )
								if( source <= 71670 )
									ret := 0.030078
								if( source > 71670 )
									ret := -0.666667
					if( pvi_ema > -0.108596 )
						if( media_azul <= 75.8651 )
							if( verde_media <= 5.55961 )
								if( nvi_ema <= 0.945886 )
									ret := -0.854545 // sell
								if( nvi_ema > 0.945886 )
									ret := -0.461111
							if( verde_media > 5.55961 )
								if( nvi <= 0.971383 )
									ret := 0.894737 // buy
								if( nvi > 0.971383 )
									ret := -0.370370
						if( media_azul > 75.8651 )
							if( pvimax <= -0.092221 )
								if( verde_azul <= 68.0576 )
									ret := 0.000000
								if( verde_azul > 68.0576 )
									ret := -0.800000 // sell
							if( pvimax > -0.092221 )
								if( verde_mean <= 54.8152 )
									ret := 1.000000 // buy
								if( verde_mean > 54.8152 )
									ret := 0.062500
			if( nvi_ema > 1.37859 )
				if( oscp <= -5.0609 )
					if( marron_mean <= 40.5275 )
						if( xrsi <= 35.876 )
							if( pvi <= -0.492754 )
								if( source <= 68416.5 )
									ret := -0.920000 // sell
								if( source > 68416.5 )
									ret := -0.185185
							if( pvi > -0.492754 )
								ret := 0.428571
						if( xrsi > 35.876 )
							if( xrsi <= 42.8938 )
								if( azul <= -2.14011 )
									ret := -0.818182 // sell
								if( azul > -2.14011 )
									ret := -0.986301 // sell
							if( xrsi > 42.8938 )
								if( media <= 41.3405 )
									ret := 0.000000
								if( media > 41.3405 )
									ret := -0.800000 // sell
					if( marron_mean > 40.5275 )
						if( BollOsc <= -33.3405 )
							ret := 0.461538
						if( BollOsc > -33.3405 )
							if( media_azul <= 69.9394 )
								ret := -0.700000 // sell
							if( media_azul > 69.9394 )
								ret := -0.090909
				if( oscp > -5.0609 )
					if( azul <= -10.4989 )
						if( nvi <= 1.55216 )
							if( stoc <= 41.4827 )
								ret := -0.625000
							if( stoc > 41.4827 )
								ret := 0.333333
						if( nvi > 1.55216 )
							if( media_azul <= 87.8536 )
								if( nvimin <= 1.64168 )
									ret := 0.857143 // buy
								if( nvimin > 1.64168 )
									ret := 0.400000
							if( media_azul > 87.8536 )
								if( media <= 67.3111 )
									ret := 0.555556
								if( media > 67.3111 )
									ret := 0.000000
					if( azul > -10.4989 )
						if( marron_mean <= 23.0595 )
							if( pvimax <= -0.689896 )
								ret := -1.000000 // sell
							if( pvimax > -0.689896 )
								ret := -0.736842 // sell
						if( marron_mean > 23.0595 )
							if( stoc <= 36.4514 )
								if( pvimin <= -0.702947 )
									ret := -0.033333
								if( pvimin > -0.702947 )
									ret := 0.900000 // buy
							if( stoc > 36.4514 )
								if( marron_mean <= 55.1584 )
									ret := -0.121951
								if( marron_mean > 55.1584 )
									ret := -0.693878
	if( stoc > 53.4002 )
		if( source <= 71007.2 )
			if( media <= 43.5804 )
				if( source <= 40242.1 )
					if( tprice <= 26259.9 )
						if( oscp <= -7.2296 )
							if( verde_mean <= -19.6112 )
								ret := -0.166667
							if( verde_mean > -19.6112 )
								if( verde_mean <= 21.8387 )
									ret := 0.652174
								if( verde_mean > 21.8387 )
									ret := 0.095238
						if( oscp > -7.2296 )
							if( nvimin <= 0.018556 )
								if( verde_azul <= 68.9629 )
									ret := -0.282051
								if( verde_azul > 68.9629 )
									ret := 0.101695
							if( nvimin > 0.018556 )
								if( nvi <= 0.026498 )
									ret := -0.815385 // sell
								if( nvi > 0.026498 )
									ret := -0.282051
					if( tprice > 26259.9 )
						if( nvimin <= 0.197215 )
							if( nvi <= 0.153555 )
								if( source <= 34196.4 )
									ret := 0.040562
								if( source > 34196.4 )
									ret := 0.330544
							if( nvi > 0.153555 )
								if( nvimax <= 0.181048 )
									ret := -0.540230
								if( nvimax > 0.181048 )
									ret := 0.089744
						if( nvimin > 0.197215 )
							if( media_azul <= 19.5814 )
								if( oscp <= 2.78739 )
									ret := 0.928571 // buy
								if( oscp > 2.78739 )
									ret := 0.400000
							if( media_azul > 19.5814 )
								ret := 0.000000
				if( source > 40242.1 )
					if( nvimin <= 1.08228 )
						if( source <= 68591.1 )
							if( marron <= 43.6273 )
								if( pvimax <= 0.119557 )
									ret := -0.405594
								if( pvimax > 0.119557 )
									ret := 0.142857
							if( marron > 43.6273 )
								if( azul_mean <= -11.4725 )
									ret := 0.075472
								if( azul_mean > -11.4725 )
									ret := -0.450640
						if( source > 68591.1 )
							if( verde_azul <= 26.214 )
								if( nvi <= 0.901498 )
									ret := 0.818182 // buy
								if( nvi > 0.901498 )
									ret := 0.916667 // buy
							if( verde_azul > 26.214 )
								ret := 0.076923
					if( nvimin > 1.08228 )
						if( marron <= 78.9022 )
							if( source <= 66941.5 )
								if( BollOsc <= -13.7105 )
									ret := -0.300971
								if( BollOsc > -13.7105 )
									ret := 0.040932
							if( source > 66941.5 )
								if( oscp <= -0.387364 )
									ret := -0.446154
								if( oscp > -0.387364 )
									ret := 0.119205
						if( marron > 78.9022 )
							if( verde_azul <= 61.26 )
								if( oscp <= 3.22239 )
									ret := -0.636364
								if( oscp > 3.22239 )
									ret := -1.000000 // sell
							if( verde_azul > 61.26 )
								if( tprice <= 64541.1 )
									ret := -0.394958
								if( tprice > 64541.1 )
									ret := 0.243243
			if( media > 43.5804 )
				if( nvi_ema <= 1.33051 )
					if( pvimax <= 0.09189 )
						if( verde_azul <= 73.0046 )
							if( verde_media <= -25.5961 )
								if( tprice <= 68283.5 )
									ret := 0.006623
								if( tprice > 68283.5 )
									ret := -0.500000
							if( verde_media > -25.5961 )
								if( nvi_ema <= 1.1788 )
									ret := 0.126718
								if( nvi_ema > 1.1788 )
									ret := 0.001176
						if( verde_azul > 73.0046 )
							if( source <= 28847.2 )
								if( pvim <= -0.051001 )
									ret := -0.050827
								if( pvim > -0.051001 )
									ret := -0.688679
							if( source > 28847.2 )
								if( pvimax <= -0.559345 )
									ret := 0.785714 // buy
								if( pvimax > -0.559345 )
									ret := 0.010207
					if( pvimax > 0.09189 )
						if( source <= 43829.1 )
							if( pvimin <= 0.088143 )
								if( marron_mean <= 72.9999 )
									ret := 0.099291
								if( marron_mean > 72.9999 )
									ret := -0.296935
							if( pvimin > 0.088143 )
								if( nvi_ema <= 0.046113 )
									ret := 0.655556
								if( nvi_ema > 0.046113 )
									ret := 0.014444
						if( source > 43829.1 )
							if( verde_media <= -45.3565 )
								if( verde_azul <= 8.75574 )
									ret := 1.000000 // buy
								if( verde_azul > 8.75574 )
									ret := 0.350000
							if( verde_media > -45.3565 )
								if( pvi_ema <= 0.109597 )
									ret := 0.006764
								if( pvi_ema > 0.109597 )
									ret := -0.229608
				if( nvi_ema > 1.33051 )
					if( xrsi <= 66.8601 )
						if( pvi <= -1.21531 )
							if( marron_mean <= 85.6076 )
								if( nvimax <= 1.96342 )
									ret := 0.960000 // buy
								if( nvimax > 1.96342 )
									ret := 0.575758
							if( marron_mean > 85.6076 )
								if( stoc <= 69.1958 )
									ret := 0.300000
								if( stoc > 69.1958 )
									ret := 0.037037
						if( pvi > -1.21531 )
							if( pvi_ema <= -1.12923 )
								if( tprice <= 57208.1 )
									ret := -0.119632
								if( tprice > 57208.1 )
									ret := 0.174271
							if( pvi_ema > -1.12923 )
								if( source <= 60891.9 )
									ret := 0.028037
								if( source > 60891.9 )
									ret := -0.088037
					if( xrsi > 66.8601 )
						if( xmf <= 85.9688 )
							if( verde_mean <= 122.688 )
								if( verde_azul <= 138.773 )
									ret := -0.294504
								if( verde_azul > 138.773 )
									ret := 0.007491
							if( verde_mean > 122.688 )
								if( verde_media <= 13.1168 )
									ret := -0.468013
								if( verde_media > 13.1168 )
									ret := -0.042541
						if( xmf > 85.9688 )
							if( nvimax <= 1.35755 )
								if( nvimin <= 1.32889 )
									ret := 0.454545
								if( nvimin > 1.32889 )
									ret := -0.788462 // sell
							if( nvimax > 1.35755 )
								if( media <= 118.524 )
									ret := 0.068306
								if( media > 118.524 )
									ret := 0.520000
		if( source > 71007.2 )
			if( nvimin <= 0.904073 )
				if( azul <= 19.4597 )
					if( nvi <= 0.916038 )
						if( azul_mean <= -6.14645 )
							if( verde_mean <= 97.1409 )
								ret := 0.473684
							if( verde_mean > 97.1409 )
								if( xrsi <= 65.0777 )
									ret := -0.714286 // sell
								if( xrsi > 65.0777 )
									ret := -0.133333
						if( azul_mean > -6.14645 )
							if( pvimin <= 0.029823 )
								if( verde <= 97.3092 )
									ret := 0.566265
								if( verde > 97.3092 )
									ret := -0.270270
							if( pvimin > 0.029823 )
								if( tprice <= 72692 )
									ret := 1.000000 // buy
								if( tprice > 72692 )
									ret := 0.704225 // buy
					if( nvi > 0.916038 )
						if( xrsi <= 62.3293 )
							ret := -0.222222
						if( xrsi > 62.3293 )
							if( media_azul <= 77.6729 )
								ret := -0.555556
							if( media_azul > 77.6729 )
								ret := -1.000000 // sell
				if( azul > 19.4597 )
					if( tprice <= 72650.4 )
						if( azul_mean <= 16.3984 )
							ret := -0.583333
						if( azul_mean > 16.3984 )
							ret := 0.444444
					if( tprice > 72650.4 )
						ret := -0.947368 // sell
			if( nvimin > 0.904073 )
				if( verde_mean <= 119.444 )
					if( stoc <= 72.1458 )
						if( azul <= 14.6687 )
							if( oscp <= 6.86159 )
								if( verde_media <= 33.279 )
									ret := -0.193237
								if( verde_media > 33.279 )
									ret := 0.928571 // buy
							if( oscp > 6.86159 )
								if( BollOsc <= 13.9605 )
									ret := 0.000000
								if( BollOsc > 13.9605 )
									ret := -0.698276
						if( azul > 14.6687 )
							if( media <= 79.8705 )
								if( xmf <= 48.7106 )
									ret := -0.469136
								if( xmf > 48.7106 )
									ret := -0.931818 // sell
							if( media > 79.8705 )
								ret := 0.571429
					if( stoc > 72.1458 )
						if( media_azul <= 92.3389 )
							if( verde_media <= 8.92106 )
								if( nvim <= 0.918997 )
									ret := -1.000000 // sell
								if( nvim > 0.918997 )
									ret := 0.132353
							if( verde_media > 8.92106 )
								if( media <= 92.3834 )
									ret := -0.646617
								if( media > 92.3834 )
									ret := -0.055556
						if( media_azul > 92.3389 )
							if( xrsi <= 66.4937 )
								if( oscp <= 16.3179 )
									ret := -0.962617 // sell
								if( oscp > 16.3179 )
									ret := -0.555556
							if( xrsi > 66.4937 )
								if( nvi <= 1.19955 )
									ret := -0.416667
								if( nvi > 1.19955 )
									ret := -0.894737 // sell
				if( verde_mean > 119.444 )
					if( oscp <= 39.1521 )
						if( media_azul <= 114.426 )
							if( media <= 114.397 )
								if( azul_mean <= -16.2619 )
									ret := 0.783784 // buy
								if( azul_mean > -16.2619 )
									ret := -0.186441
							if( media > 114.397 )
								ret := 1.000000 // buy
						if( media_azul > 114.426 )
							if( verde_mean <= 144.182 )
								if( nvi_ema <= 1.29985 )
									ret := -0.846154 // sell
								if( nvi_ema > 1.29985 )
									ret := -0.923077 // sell
							if( verde_mean > 144.182 )
								ret := -0.444444
					if( oscp > 39.1521 )
						if( pvimax <= -0.348053 )
							if( xmf <= 67.0383 )
								ret := -1.000000 // sell
							if( xmf > 67.0383 )
								ret := 0.473684
						if( pvimax > -0.348053 )
							if( nvimax <= 1.15917 )
								if( verde_azul <= 180.566 )
									ret := -0.277778
								if( verde_azul > 180.566 )
									ret := -0.933333 // sell
							if( nvimax > 1.15917 )
								if( marron <= 126.542 )
									ret := -0.888889 // sell
								if( marron > 126.542 )
									ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_BTCUSDT_5Min_bc4b7b56(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


