//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: XLMUSDT_15Min_1KON_2d08e6c3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_15Min_1KON_2d08e6c3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_15Min_2d08e6c3(oscp, verde_media, verde, marron, azul, media, tprice, xrsi, pvimax, media_azul, nvi_ema, azul_mean, pvim, verde_mean, pvi_ema, xmf, nvi, BollOsc, source, nvimax, pvimin, stoc, marron_mean, pvi, nvim, nvimin, verde_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( verde_media <= -2.01032 )
		if( verde <= -25.4081 )
			if( xmf <= 34.0422 )
				if( nvim <= 4.81374 )
					if( azul_mean <= -15.1467 )
						if( verde_mean <= -20.0163 )
							if( tprice <= 0.080381 )
								if( source <= 0.074095 )
									ret := 0.117647
								if( source > 0.074095 )
									ret := -0.707317 // sell
							if( tprice > 0.080381 )
								if( azul_mean <= -63.0097 )
									ret := -0.350000
								if( azul_mean > -63.0097 )
									ret := 0.291287
						if( verde_mean > -20.0163 )
							if( verde <= -45.2826 )
								if( verde <= -104.832 )
									ret := 0.777778 // buy
								if( verde > -104.832 )
									ret := -0.504132
							if( verde > -45.2826 )
								if( media_azul <= 40.7584 )
									ret := -0.375000
								if( media_azul > 40.7584 )
									ret := 0.165414
					if( azul_mean > -15.1467 )
						if( xrsi <= 15.8827 )
							if( media_azul <= 16.8991 )
								if( media <= -4.34141 )
									ret := 0.806452 // buy
								if( media > -4.34141 )
									ret := 0.254658
							if( media_azul > 16.8991 )
								if( source <= 0.081025 )
									ret := 0.000000
								if( source > 0.081025 )
									ret := 0.835616 // buy
						if( xrsi > 15.8827 )
							if( media_azul <= -35.8115 )
								if( xmf <= 29.827 )
									ret := 0.738095 // buy
								if( xmf > 29.827 )
									ret := -0.285714
							if( media_azul > -35.8115 )
								if( xmf <= 17.3799 )
									ret := 0.142697
								if( xmf > 17.3799 )
									ret := 0.294088
				if( nvim > 4.81374 )
					if( stoc <= 35.4192 )
						if( verde_azul <= -11.2325 )
							if( xrsi <= 11.3324 )
								if( tprice <= 0.116484 )
									ret := 0.750000 // buy
								if( tprice > 0.116484 )
									ret := -0.714286 // sell
							if( xrsi > 11.3324 )
								if( stoc <= 12.5011 )
									ret := 0.338028
								if( stoc > 12.5011 )
									ret := -0.097429
						if( verde_azul > -11.2325 )
							if( verde_media <= -71.5893 )
								if( marron_mean <= 5.31332 )
									ret := 0.363636
								if( marron_mean > 5.31332 )
									ret := -0.562500
							if( verde_media > -71.5893 )
								if( stoc <= 10.5708 )
									ret := -0.500000
								if( stoc > 10.5708 )
									ret := 0.702381 // buy
					if( stoc > 35.4192 )
						if( oscp <= -55.6058 )
							if( verde_mean <= -102.452 )
								if( source <= 0.101763 )
									ret := 0.500000
								if( source > 0.101763 )
									ret := 1.000000 // buy
							if( verde_mean > -102.452 )
								if( marron <= 2.17477 )
									ret := 0.692308
								if( marron > 2.17477 )
									ret := -0.083333
						if( oscp > -55.6058 )
							if( source <= 0.091983 )
								ret := 0.200000
							if( source > 0.091983 )
								if( pvimax <= -5.33201 )
									ret := 0.911765 // buy
								if( pvimax > -5.33201 )
									ret := 0.400000
			if( xmf > 34.0422 )
				if( BollOsc <= -48.6681 )
					if( verde_azul <= -90.6424 )
						if( azul_mean <= 62.6909 )
							if( tprice <= 0.118704 )
								if( BollOsc <= -65.1114 )
									ret := 0.692308
								if( BollOsc > -65.1114 )
									ret := 0.062500
							if( tprice > 0.118704 )
								if( verde <= -83.9068 )
									ret := 1.000000 // buy
								if( verde > -83.9068 )
									ret := 0.250000
						if( azul_mean > 62.6909 )
							ret := -1.000000 // sell
					if( verde_azul > -90.6424 )
						if( verde_media <= -126.423 )
							if( xmf <= 35.6281 )
								ret := -0.333333
							if( xmf > 35.6281 )
								if( tprice <= 0.115394 )
									ret := -1.000000 // sell
								if( tprice > 0.115394 )
									ret := -0.500000
						if( verde_media > -126.423 )
							if( stoc <= 37.004 )
								if( tprice <= 0.090372 )
									ret := 0.159420
								if( tprice > 0.090372 )
									ret := -0.343137
							if( stoc > 37.004 )
								if( oscp <= -44.3116 )
									ret := 0.517857
								if( oscp > -44.3116 )
									ret := -0.333333
				if( BollOsc > -48.6681 )
					if( marron_mean <= 37.2102 )
						if( azul <= 49.6424 )
							if( pvim <= -3.41113 )
								if( marron_mean <= 13.0135 )
									ret := -0.307692
								if( marron_mean > 13.0135 )
									ret := 0.684211
							if( pvim > -3.41113 )
								if( azul <= 36.1916 )
									ret := -0.212766
								if( azul > 36.1916 )
									ret := -0.857143 // sell
						if( azul > 49.6424 )
							if( marron <= 28.7794 )
								if( media_azul <= -25.9169 )
									ret := 0.538462
								if( media_azul > -25.9169 )
									ret := 1.000000 // buy
							if( marron > 28.7794 )
								ret := 0.000000
					if( marron_mean > 37.2102 )
						if( verde_mean <= 46.8375 )
							if( azul_mean <= -9.65188 )
								if( verde_media <= -95.4664 )
									ret := -0.750000 // sell
								if( verde_media > -95.4664 )
									ret := 0.000000
							if( azul_mean > -9.65188 )
								if( media <= 38.8635 )
									ret := -0.333333
								if( media > 38.8635 )
									ret := 0.725352 // buy
						if( verde_mean > 46.8375 )
							if( tprice <= 0.104976 )
								if( verde_mean <= 57.6668 )
									ret := -0.285714
								if( verde_mean > 57.6668 )
									ret := 0.916667 // buy
							if( tprice > 0.104976 )
								if( verde_mean <= 50.2367 )
									ret := 0.250000
								if( verde_mean > 50.2367 )
									ret := -0.727273 // sell
		if( verde > -25.4081 )
			if( source <= 0.146901 )
				if( verde_media <= -94.3355 )
					if( stoc <= 46.5419 )
						if( verde <= -16.5483 )
							if( oscp <= -65.1393 )
								ret := 0.500000
							if( oscp > -65.1393 )
								if( media <= 73.4582 )
									ret := 0.750000 // buy
								if( media > 73.4582 )
									ret := 1.000000 // buy
						if( verde > -16.5483 )
							ret := 0.200000
					if( stoc > 46.5419 )
						if( verde_media <= -106.556 )
							ret := -0.750000 // sell
						if( verde_media > -106.556 )
							if( pvimax <= -2.28859 )
								if( pvimax <= -3.01316 )
									ret := 0.142857
								if( pvimax > -3.01316 )
									ret := -0.250000
							if( pvimax > -2.28859 )
								if( oscp <= -64.597 )
									ret := 1.000000 // buy
								if( oscp > -64.597 )
									ret := 0.250000
				if( verde_media > -94.3355 )
					if( xrsi <= 25.9628 )
						if( marron_mean <= 5.06335 )
							if( nvi <= 0.007675 )
								if( marron_mean <= -5.03939 )
									ret := 0.294118
								if( marron_mean > -5.03939 )
									ret := 0.935484 // buy
							if( nvi > 0.007675 )
								if( verde_media <= -41.9582 )
									ret := -0.352273
								if( verde_media > -41.9582 )
									ret := 0.082474
						if( marron_mean > 5.06335 )
							if( xrsi <= 21.2304 )
								if( pvimax <= -1.35049 )
									ret := 0.510204
								if( pvimax > -1.35049 )
									ret := 0.871795 // buy
							if( xrsi > 21.2304 )
								if( xmf <= 14.4442 )
									ret := -0.529412
								if( xmf > 14.4442 )
									ret := 0.312036
					if( xrsi > 25.9628 )
						if( verde_mean <= 79.0051 )
							if( verde <= 41.5832 )
								if( nvimin <= 5.24467 )
									ret := 0.095148
								if( nvimin > 5.24467 )
									ret := 0.029092
							if( verde > 41.5832 )
								if( stoc <= 52.3029 )
									ret := -0.055112
								if( stoc > 52.3029 )
									ret := 0.080326
						if( verde_mean > 79.0051 )
							if( xmf <= 41.696 )
								if( media_azul <= 78.58 )
									ret := 0.070513
								if( media_azul > 78.58 )
									ret := 0.409091
							if( xmf > 41.696 )
								if( media_azul <= 99.6004 )
									ret := 0.082226
								if( media_azul > 99.6004 )
									ret := 0.197643
			if( source > 0.146901 )
				if( marron <= -2.04104 )
					if( tprice <= 0.149583 )
						ret := -0.333333
					if( tprice > 0.149583 )
						if( xrsi <= 28.5517 )
							ret := -1.000000 // sell
						if( xrsi > 28.5517 )
							ret := -0.600000
				if( marron > -2.04104 )
					if( verde_azul <= 83.7966 )
						if( media_azul <= 39.9964 )
							if( xrsi <= 41.8359 )
								if( oscp <= -28.093 )
									ret := -0.400000
								if( oscp > -28.093 )
									ret := 0.304734
							if( xrsi > 41.8359 )
								if( verde_azul <= 11.5233 )
									ret := 0.015873
								if( verde_azul > 11.5233 )
									ret := -0.769231 // sell
						if( media_azul > 39.9964 )
							if( BollOsc <= 11.2597 )
								if( media_azul <= 93.8095 )
									ret := -0.183673
								if( media_azul > 93.8095 )
									ret := 0.416667
							if( BollOsc > 11.2597 )
								if( xrsi <= 56.1212 )
									ret := 0.166667
								if( xrsi > 56.1212 )
									ret := -0.633333
					if( verde_azul > 83.7966 )
						if( oscp <= 11.6807 )
							if( tprice <= 0.152089 )
								if( marron_mean <= 67.8942 )
									ret := 0.000000
								if( marron_mean > 67.8942 )
									ret := 0.914286 // buy
							if( tprice > 0.152089 )
								if( pvimin <= -2.51449 )
									ret := -0.571429
								if( pvimin > -2.51449 )
									ret := 0.437500
						if( oscp > 11.6807 )
							if( marron_mean <= 93.2371 )
								ret := 0.000000
							if( marron_mean > 93.2371 )
								ret := -0.750000 // sell
	if( verde_media > -2.01032 )
		if( source <= 0.140537 )
			if( media <= 126.103 )
				if( azul_mean <= 63.4562 )
					if( verde_media <= 29.8469 )
						if( nvi_ema <= 2.5926 )
							if( pvimax <= -0.19715 )
								if( media <= 37.1183 )
									ret := -0.006443
								if( media > 37.1183 )
									ret := 0.063725
							if( pvimax > -0.19715 )
								if( pvi <= -0.229995 )
									ret := 0.861538 // buy
								if( pvi > -0.229995 )
									ret := 0.038462
						if( nvi_ema > 2.5926 )
							if( media <= 12.5567 )
								if( azul <= 45.1153 )
									ret := 0.186441
								if( azul > 45.1153 )
									ret := 0.920000 // buy
							if( media > 12.5567 )
								if( media_azul <= -4.93517 )
									ret := -0.214286
								if( media_azul > -4.93517 )
									ret := 0.001710
					if( verde_media > 29.8469 )
						if( BollOsc <= 12.8175 )
							if( pvimin <= -0.265475 )
								if( tprice <= 0.127496 )
									ret := -0.146778
								if( tprice > 0.127496 )
									ret := -0.434286
							if( pvimin > -0.265475 )
								if( verde_media <= 41.5168 )
									ret := -1.000000 // sell
								if( verde_media > 41.5168 )
									ret := -0.750000 // sell
						if( BollOsc > 12.8175 )
							if( azul_mean <= -6.54798 )
								if( verde_mean <= 147.298 )
									ret := -0.136745
								if( verde_mean > 147.298 )
									ret := 0.054867
							if( azul_mean > -6.54798 )
								if( verde_azul <= 160.938 )
									ret := 0.007622
								if( verde_azul > 160.938 )
									ret := 0.139932
				if( azul_mean > 63.4562 )
					if( marron_mean <= 45.8639 )
						if( media_azul <= -47.0973 )
							if( marron_mean <= 27.2991 )
								if( pvim <= -2.37337 )
									ret := 0.000000
								if( pvim > -2.37337 )
									ret := 0.250000
							if( marron_mean > 27.2991 )
								if( marron_mean <= 31.6708 )
									ret := -1.000000 // sell
								if( marron_mean > 31.6708 )
									ret := -0.214286
						if( media_azul > -47.0973 )
							if( xmf <= 43.8004 )
								if( marron <= 42.8988 )
									ret := 0.000000
								if( marron > 42.8988 )
									ret := 0.826087 // buy
							if( xmf > 43.8004 )
								if( source <= 0.09565 )
									ret := 0.250000
								if( source > 0.09565 )
									ret := -0.500000
					if( marron_mean > 45.8639 )
						if( media <= 63.0618 )
							if( source <= 0.122467 )
								if( xmf <= 52.8021 )
									ret := -0.480000
								if( xmf > 52.8021 )
									ret := -0.861538 // sell
							if( source > 0.122467 )
								ret := 0.000000
						if( media > 63.0618 )
							if( pvimax <= -2.40333 )
								if( verde_mean <= 155.853 )
									ret := -0.187500
								if( verde_mean > 155.853 )
									ret := 0.523810
							if( pvimax > -2.40333 )
								if( verde_azul <= 50.492 )
									ret := -0.285714
								if( verde_azul > 50.492 )
									ret := -0.789474 // sell
			if( media > 126.103 )
				if( xmf <= 87.9238 )
					ret := 0.250000
				if( xmf > 87.9238 )
					if( pvi <= -1.78858 )
						if( pvim <= -6.19824 )
							ret := 0.750000 // buy
						if( pvim > -6.19824 )
							ret := 1.000000 // buy
					if( pvi > -1.78858 )
						if( BollOsc <= 43.198 )
							ret := 0.250000
						if( BollOsc > 43.198 )
							ret := 0.800000 // buy
		if( source > 0.140537 )
			if( xmf <= 59.0317 )
				if( azul <= -10.4027 )
					if( azul <= -14.6245 )
						if( marron_mean <= 46.0796 )
							if( media_azul <= 70.5985 )
								if( source <= 0.141517 )
									ret := 0.833333 // buy
								if( source > 0.141517 )
									ret := -0.275862
							if( media_azul > 70.5985 )
								if( media <= 53.4463 )
									ret := 0.737705 // buy
								if( media > 53.4463 )
									ret := -1.000000 // sell
						if( marron_mean > 46.0796 )
							if( verde_azul <= 102.231 )
								if( marron <= 63.861 )
									ret := -0.210526
								if( marron > 63.861 )
									ret := 0.842105 // buy
							if( verde_azul > 102.231 )
								if( pvimax <= -0.124085 )
									ret := -0.618557
								if( pvimax > -0.124085 )
									ret := 0.076923
					if( azul > -14.6245 )
						if( nvimax <= 2.37442 )
							if( azul_mean <= -10.4282 )
								if( azul <= -12.3 )
									ret := -0.727273 // sell
								if( azul > -12.3 )
									ret := 0.000000
							if( azul_mean > -10.4282 )
								if( verde_mean <= 60.9298 )
									ret := -0.066667
								if( verde_mean > 60.9298 )
									ret := 0.714286 // buy
						if( nvimax > 2.37442 )
							if( media <= 30.7291 )
								if( verde <= 47.1696 )
									ret := 0.500000
								if( verde > 47.1696 )
									ret := 0.000000
							if( media > 30.7291 )
								if( azul <= -11.1505 )
									ret := 0.955556 // buy
								if( azul > -11.1505 )
									ret := 0.333333
				if( azul > -10.4027 )
					if( azul_mean <= 10.7785 )
						if( oscp <= -4.32768 )
							if( pvi <= -2.26779 )
								if( oscp <= -7.19013 )
									ret := -1.000000 // sell
								if( oscp > -7.19013 )
									ret := 0.200000
							if( pvi > -2.26779 )
								if( marron <= 47.8154 )
									ret := 0.452381
								if( marron > 47.8154 )
									ret := -0.600000
						if( oscp > -4.32768 )
							if( pvim <= 0.003895 )
								if( BollOsc <= -23.8697 )
									ret := 0.368421
								if( BollOsc > -23.8697 )
									ret := -0.494721
							if( pvim > 0.003895 )
								if( azul_mean <= -1.51731 )
									ret := 0.000000
								if( azul_mean > -1.51731 )
									ret := 0.666667
					if( azul_mean > 10.7785 )
						if( pvi <= -1.45846 )
							if( verde_azul <= -0.168415 )
								if( stoc <= 32.2981 )
									ret := 0.250000
								if( stoc > 32.2981 )
									ret := 0.941176 // buy
							if( verde_azul > -0.168415 )
								if( verde_media <= 15.0215 )
									ret := 0.528302
								if( verde_media > 15.0215 )
									ret := -0.181818
						if( pvi > -1.45846 )
							if( azul_mean <= 17.1354 )
								if( marron <= 63.2746 )
									ret := 0.545455
								if( marron > 63.2746 )
									ret := -0.200000
							if( azul_mean > 17.1354 )
								if( BollOsc <= 23.0194 )
									ret := -0.676471
								if( BollOsc > 23.0194 )
									ret := 0.312500
			if( xmf > 59.0317 )
				if( oscp <= 19.4805 )
					if( oscp <= 8.2579 )
						if( marron_mean <= 107.701 )
							if( marron_mean <= 97.3075 )
								if( media <= 42.2371 )
									ret := 0.424242
								if( media > 42.2371 )
									ret := -0.213235
							if( marron_mean > 97.3075 )
								if( oscp <= 5.99505 )
									ret := 0.222222
								if( oscp > 5.99505 )
									ret := 0.894737 // buy
						if( marron_mean > 107.701 )
							if( media_azul <= 93.3719 )
								if( BollOsc <= 47.4077 )
									ret := -1.000000 // sell
								if( BollOsc > 47.4077 )
									ret := -0.500000
							if( media_azul > 93.3719 )
								ret := -0.250000
					if( oscp > 8.2579 )
						if( azul <= 1.85325 )
							if( verde_azul <= 115.923 )
								if( media <= 100.807 )
									ret := 0.357576
								if( media > 100.807 )
									ret := 0.965517 // buy
							if( verde_azul > 115.923 )
								if( xrsi <= 66.8961 )
									ret := 0.255319
								if( xrsi > 66.8961 )
									ret := -0.264151
						if( azul > 1.85325 )
							if( azul_mean <= 0.817729 )
								if( azul <= 3.493 )
									ret := -0.083333
								if( azul > 3.493 )
									ret := -0.875000 // sell
							if( azul_mean > 0.817729 )
								if( stoc <= 75.1428 )
									ret := 0.529412
								if( stoc > 75.1428 )
									ret := 0.005882
				if( oscp > 19.4805 )
					if( media <= 108.893 )
						if( media <= 87.6018 )
							if( media_azul <= 57.2668 )
								if( pvimax <= -4.00648 )
									ret := 0.000000
								if( pvimax > -4.00648 )
									ret := -0.739130 // sell
							if( media_azul > 57.2668 )
								if( BollOsc <= 67.4625 )
									ret := -0.070248
								if( BollOsc > 67.4625 )
									ret := 0.647059
						if( media > 87.6018 )
							if( verde_mean <= 207.393 )
								if( nvimin <= 2.40117 )
									ret := -0.282486
								if( nvimin > 2.40117 )
									ret := -0.704918 // sell
							if( verde_mean > 207.393 )
								if( BollOsc <= 64.3902 )
									ret := 1.000000 // buy
								if( BollOsc > 64.3902 )
									ret := 0.000000
					if( media > 108.893 )
						if( BollOsc <= 44.9984 )
							if( oscp <= 26.5848 )
								if( media <= 111.64 )
									ret := -1.000000 // sell
								if( media > 111.64 )
									ret := -0.750000 // sell
							if( oscp > 26.5848 )
								if( source <= 0.148833 )
									ret := 0.961538 // buy
								if( source > 0.148833 )
									ret := -0.222222
						if( BollOsc > 44.9984 )
							if( pvi_ema <= -2.86918 )
								if( stoc <= 88.4664 )
									ret := 1.000000 // buy
								if( stoc > 88.4664 )
									ret := -0.500000
							if( pvi_ema > -2.86918 )
								if( azul_mean <= 12.7804 )
									ret := -0.350000
								if( azul_mean > 12.7804 )
									ret := -0.933333 // sell
	
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
float op_operation = decision_tree_0_XLMUSDT_15Min_2d08e6c3(oscp, verde_media, verde, marron, azul, media, tprice, xrsi, pvimax, media_azul, nvi_ema, azul_mean, pvim, verde_mean, pvi_ema, xmf, nvi, BollOsc, source, nvimax, pvimin, stoc, marron_mean, pvi, nvim, nvimin, verde_azul)

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


