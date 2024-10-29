//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: ETSY_15Min_1KON_80fa3424 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETSY_15Min_1KON_80fa3424", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETSY_15Min_80fa3424(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( verde <= 58.8511 )
		if( nvi_ema <= 2.79957 )
			if( pvi <= 0.93118 )
				if( verde_media <= -75.5043 )
					if( xrsi <= 18.0568 )
						if( nvimax <= 2.72977 )
							if( media_azul <= 67.3702 )
								if( pvimin <= 0.945538 )
									ret := 0.822430 // buy
								if( pvimin > 0.945538 )
									ret := -0.250000
							if( media_azul > 67.3702 )
								if( verde_azul <= 51.9831 )
									ret := -0.312500
								if( verde_azul > 51.9831 )
									ret := 1.000000 // buy
						if( nvimax > 2.72977 )
							if( nvi_ema <= 2.7403 )
								if( BollOsc <= -61.8618 )
									ret := -1.000000 // sell
								if( BollOsc > -61.8618 )
									ret := -0.500000
							if( nvi_ema > 2.7403 )
								ret := 0.800000 // buy
					if( xrsi > 18.0568 )
						if( azul <= -7.24049 )
							if( media <= 61.3109 )
								if( marron <= 8.9162 )
									ret := 0.084967
								if( marron > 8.9162 )
									ret := -0.666667
							if( media > 61.3109 )
								if( nvi_ema <= -0.001696 )
									ret := -0.545455
								if( nvi_ema > -0.001696 )
									ret := 0.591398
						if( azul > -7.24049 )
							if( BollOsc <= -29.9238 )
								if( oscp <= -51.4628 )
									ret := 0.259045
								if( oscp > -51.4628 )
									ret := 0.460993
							if( BollOsc > -29.9238 )
								if( source <= 99.7183 )
									ret := 0.097015
								if( source > 99.7183 )
									ret := -0.538462
				if( verde_media > -75.5043 )
					if( media_azul <= 83.3836 )
						if( pvimin <= 0.936794 )
							if( verde_media <= -0.235702 )
								if( pvimin <= -0.136854 )
									ret := -0.111732
								if( pvimin > -0.136854 )
									ret := 0.112034
							if( verde_media > -0.235702 )
								if( verde_azul <= -8.00923 )
									ret := -0.335714
								if( verde_azul > -8.00923 )
									ret := 0.045378
						if( pvimin > 0.936794 )
							if( xmf <= 31.9006 )
								if( azul <= 20.5672 )
									ret := 0.483871
								if( azul > 20.5672 )
									ret := -0.750000 // sell
							if( xmf > 31.9006 )
								if( oscp <= -10.2007 )
									ret := 0.913043 // buy
								if( oscp > -10.2007 )
									ret := 0.250000
					if( media_azul > 83.3836 )
						if( stoc <= 30.1887 )
							if( verde <= 18.3119 )
								if( pvi <= 0.584695 )
									ret := 0.538961
								if( pvi > 0.584695 )
									ret := 0.132716
							if( verde > 18.3119 )
								if( source <= 93.4866 )
									ret := -0.177326
								if( source > 93.4866 )
									ret := 0.263514
						if( stoc > 30.1887 )
							if( xrsi <= 33.721 )
								if( verde_azul <= 33.3852 )
									ret := -0.250000
								if( verde_azul > 33.3852 )
									ret := 0.759494 // buy
							if( xrsi > 33.721 )
								if( verde_mean <= 101.375 )
									ret := 0.266722
								if( verde_mean > 101.375 )
									ret := 0.837209 // buy
			if( pvi > 0.93118 )
				if( nvi <= 2.7181 )
					if( azul <= -72.0015 )
						if( nvim <= 2.53695 )
							if( verde_media <= -161.182 )
								ret := -1.000000 // sell
							if( verde_media > -161.182 )
								if( media <= 13.2063 )
									ret := 0.000000
								if( media > 13.2063 )
									ret := 0.736364 // buy
						if( nvim > 2.53695 )
							if( verde_media <= -48.1784 )
								if( stoc <= 26.4793 )
									ret := -0.916667 // sell
								if( stoc > 26.4793 )
									ret := -0.500000
							if( verde_media > -48.1784 )
								if( BollOsc <= -58.8456 )
									ret := 1.000000 // buy
								if( BollOsc > -58.8456 )
									ret := 0.250000
					if( azul > -72.0015 )
						if( stoc <= 34.8031 )
							if( xrsi <= 16.9668 )
								if( nvimin <= 0.879828 )
									ret := -0.071429
								if( nvimin > 0.879828 )
									ret := 0.707965 // buy
							if( xrsi > 16.9668 )
								if( media_azul <= 117.439 )
									ret := -0.017473
								if( media_azul > 117.439 )
									ret := -0.679245
						if( stoc > 34.8031 )
							if( pvimin <= 1.26452 )
								if( verde_azul <= 64.2706 )
									ret := 0.071890
								if( verde_azul > 64.2706 )
									ret := 0.297688
							if( pvimin > 1.26452 )
								if( BollOsc <= -52.7387 )
									ret := 0.666667
								if( BollOsc > -52.7387 )
									ret := -0.391753
				if( nvi > 2.7181 )
					if( azul_mean <= 18.8535 )
						if( pvim <= 1.02351 )
							if( BollOsc <= -48.7939 )
								ret := -0.666667
							if( BollOsc > -48.7939 )
								if( source <= 226.528 )
									ret := 1.000000 // buy
								if( source > 226.528 )
									ret := 0.214286
						if( pvim > 1.02351 )
							if( pvimax <= 1.2789 )
								if( xrsi <= 50.7315 )
									ret := -0.700000 // sell
								if( xrsi > 50.7315 )
									ret := -0.166667
							if( pvimax > 1.2789 )
								if( pvimin <= 1.24599 )
									ret := -0.200000
								if( pvimin > 1.24599 )
									ret := -1.000000 // sell
					if( azul_mean > 18.8535 )
						if( source <= 274.885 )
							if( azul <= 26.143 )
								if( azul <= 22.7437 )
									ret := 0.625000
								if( azul > 22.7437 )
									ret := 1.000000 // buy
							if( azul > 26.143 )
								if( nvim <= 2.74084 )
									ret := 0.750000 // buy
								if( nvim > 2.74084 )
									ret := 0.000000
						if( source > 274.885 )
							if( verde_mean <= 35.5149 )
								ret := 0.000000
							if( verde_mean > 35.5149 )
								ret := -0.250000
		if( nvi_ema > 2.79957 )
			if( azul <= -23.0514 )
				if( source <= 122.353 )
					if( media <= 57.4507 )
						if( source <= 102.112 )
							if( nvi_ema <= 2.81074 )
								ret := 1.000000 // buy
							if( nvi_ema > 2.81074 )
								ret := 0.500000
						if( source > 102.112 )
							if( xrsi <= 20.1008 )
								if( azul_mean <= -28.0535 )
									ret := 0.909091 // buy
								if( azul_mean > -28.0535 )
									ret := 0.000000
							if( xrsi > 20.1008 )
								if( pvimin <= 0.464302 )
									ret := -0.571429
								if( pvimin > 0.464302 )
									ret := -0.027027
					if( media > 57.4507 )
						if( pvim <= 0.56362 )
							if( verde <= 30.2367 )
								ret := -1.000000 // sell
							if( verde > 30.2367 )
								ret := -0.750000 // sell
						if( pvim > 0.56362 )
							if( nvi <= 2.84981 )
								ret := -0.250000
							if( nvi > 2.84981 )
								ret := -0.500000
				if( source > 122.353 )
					if( source <= 157.699 )
						if( xmf <= 67.0398 )
							if( BollOsc <= -33.7736 )
								if( pvi <= 0.604883 )
									ret := 0.320755
								if( pvi > 0.604883 )
									ret := 0.886792 // buy
							if( BollOsc > -33.7736 )
								if( azul_mean <= -33.7605 )
									ret := 0.625000
								if( azul_mean > -33.7605 )
									ret := -0.076923
						if( xmf > 67.0398 )
							if( verde_mean <= 63.4517 )
								ret := 1.000000 // buy
							if( verde_mean > 63.4517 )
								ret := 0.714286 // buy
					if( source > 157.699 )
						if( marron_mean <= 48.1887 )
							if( oscp <= -1.53294 )
								if( azul_mean <= -67.1709 )
									ret := -0.714286 // sell
								if( azul_mean > -67.1709 )
									ret := 0.131579
							if( oscp > -1.53294 )
								if( verde_azul <= 74.6214 )
									ret := 0.066667
								if( verde_azul > 74.6214 )
									ret := -0.680000
						if( marron_mean > 48.1887 )
							if( oscp <= 4.70588 )
								if( verde_azul <= 84.0769 )
									ret := 1.000000 // buy
								if( verde_azul > 84.0769 )
									ret := 0.500000
							if( oscp > 4.70588 )
								ret := 0.000000
			if( azul > -23.0514 )
				if( nvimin <= 2.76825 )
					if( media_azul <= 47.5175 )
						if( media_azul <= 15.0754 )
							ret := -0.142857
						if( media_azul > 15.0754 )
							if( azul_mean <= -6.10638 )
								ret := 0.200000
							if( azul_mean > -6.10638 )
								if( stoc <= 57.9024 )
									ret := 0.911111 // buy
								if( stoc > 57.9024 )
									ret := 0.333333
					if( media_azul > 47.5175 )
						if( xmf <= 37.1606 )
							if( oscp <= 0.481339 )
								if( pvim <= 0.504738 )
									ret := 1.000000 // buy
								if( pvim > 0.504738 )
									ret := 0.750000 // buy
							if( oscp > 0.481339 )
								ret := 0.200000
						if( xmf > 37.1606 )
							if( verde_media <= -17.3236 )
								if( azul <= 4.58665 )
									ret := -0.125000
								if( azul > 4.58665 )
									ret := 0.500000
							if( verde_media > -17.3236 )
								if( azul_mean <= -3.96366 )
									ret := -0.750000 // sell
								if( azul_mean > -3.96366 )
									ret := -1.000000 // sell
				if( nvimin > 2.76825 )
					if( pvim <= 0.563998 )
						if( media_azul <= 29.1835 )
							if( nvim <= 2.83803 )
								if( tprice <= 125.018 )
									ret := 0.165217
								if( tprice > 125.018 )
									ret := -0.484848
							if( nvim > 2.83803 )
								if( oscp <= -52.6396 )
									ret := -0.666667
								if( oscp > -52.6396 )
									ret := 0.496644
						if( media_azul > 29.1835 )
							if( azul_mean <= 1.69322 )
								if( xrsi <= 28.4797 )
									ret := 0.296296
								if( xrsi > 28.4797 )
									ret := -0.331620
							if( azul_mean > 1.69322 )
								if( xmf <= 56.8425 )
									ret := 0.356643
								if( xmf > 56.8425 )
									ret := -0.257143
					if( pvim > 0.563998 )
						if( tprice <= 193.196 )
							if( media_azul <= -25.4697 )
								if( verde_mean <= -30.171 )
									ret := -0.444444
								if( verde_mean > -30.171 )
									ret := 1.000000 // buy
							if( media_azul > -25.4697 )
								if( stoc <= 80.0241 )
									ret := -0.287839
								if( stoc > 80.0241 )
									ret := 0.833333 // buy
						if( tprice > 193.196 )
							if( oscp <= -15.4097 )
								if( xmf <= 20.1522 )
									ret := 0.275000
								if( xmf > 20.1522 )
									ret := -0.470320
							if( oscp > -15.4097 )
								if( source <= 221.088 )
									ret := 0.255952
								if( source > 221.088 )
									ret := -0.550000
	if( verde > 58.8511 )
		if( azul <= 33.4316 )
			if( nvimin <= -0.087367 )
				if( marron_mean <= 124.18 )
					if( xrsi <= 71.516 )
						if( tprice <= 17.2488 )
							if( marron_mean <= 101.45 )
								if( tprice <= 10.4269 )
									ret := 0.409449
								if( tprice > 10.4269 )
									ret := 0.056447
							if( marron_mean > 101.45 )
								if( xmf <= 83.6416 )
									ret := 0.457286
								if( xmf > 83.6416 )
									ret := -0.030769
						if( tprice > 17.2488 )
							if( verde_azul <= 58.0088 )
								if( pvimax <= 0.624974 )
									ret := 0.571429
								if( pvimax > 0.624974 )
									ret := -0.407407
							if( verde_azul > 58.0088 )
								if( BollOsc <= 33.6937 )
									ret := 0.446575
								if( BollOsc > 33.6937 )
									ret := 0.054054
					if( xrsi > 71.516 )
						if( tprice <= 14.8658 )
							if( verde <= 134.54 )
								if( tprice <= 11.5643 )
									ret := 0.019231
								if( tprice > 11.5643 )
									ret := -0.740741 // sell
							if( verde > 134.54 )
								if( media_azul <= 115.98 )
									ret := 0.673913
								if( media_azul > 115.98 )
									ret := -0.500000
						if( tprice > 14.8658 )
							if( pvimax <= 0.620536 )
								if( verde_mean <= 93.6496 )
									ret := 0.500000
								if( verde_mean > 93.6496 )
									ret := -0.353741
							if( pvimax > 0.620536 )
								if( tprice <= 22.1186 )
									ret := 0.054688
								if( tprice > 22.1186 )
									ret := -1.000000 // sell
				if( marron_mean > 124.18 )
					if( verde_media <= 69.6398 )
						if( marron <= 120.465 )
							ret := 0.000000
						if( marron > 120.465 )
							if( nvi_ema <= -0.27334 )
								ret := 1.000000 // buy
							if( nvi_ema > -0.27334 )
								if( marron <= 130.836 )
									ret := 0.810811 // buy
								if( marron > 130.836 )
									ret := 0.000000
					if( verde_media > 69.6398 )
						if( xmf <= 90.4788 )
							ret := 0.166667
						if( xmf > 90.4788 )
							if( xmf <= 96.1937 )
								ret := -1.000000 // sell
							if( xmf > 96.1937 )
								ret := -0.500000
			if( nvimin > -0.087367 )
				if( source <= 219.302 )
					if( media_azul <= 97.8968 )
						if( verde_media <= 33.744 )
							if( source <= 56.751 )
								if( media_azul <= 39.3652 )
									ret := -0.174342
								if( media_azul > 39.3652 )
									ret := 0.099580
							if( source > 56.751 )
								if( tprice <= 198.931 )
									ret := 0.001710
								if( tprice > 198.931 )
									ret := 0.161116
						if( verde_media > 33.744 )
							if( pvim <= 0.407099 )
								if( nvi <= 0.060015 )
									ret := -0.590604
								if( nvi > 0.060015 )
									ret := -0.155449
							if( pvim > 0.407099 )
								if( nvimax <= 2.45217 )
									ret := -0.062000
								if( nvimax > 2.45217 )
									ret := 0.038925
					if( media_azul > 97.8968 )
						if( verde <= 202.825 )
							if( xrsi <= 77.872 )
								if( verde_media <= 98.8533 )
									ret := 0.102841
								if( verde_media > 98.8533 )
									ret := -0.463415
							if( xrsi > 77.872 )
								if( tprice <= 86.5139 )
									ret := -0.305177
								if( tprice > 86.5139 )
									ret := 0.071942
						if( verde > 202.825 )
							if( pvimin <= 0.797921 )
								if( marron_mean <= 97.2061 )
									ret := -0.428571
								if( marron_mean > 97.2061 )
									ret := 0.750000 // buy
							if( pvimin > 0.797921 )
								if( verde <= 237.252 )
									ret := 0.000000
								if( verde > 237.252 )
									ret := -0.833333 // sell
				if( source > 219.302 )
					if( stoc <= 71.2068 )
						if( nvimin <= 2.63611 )
							if( azul <= -52.3892 )
								if( nvimin <= 2.5539 )
									ret := -0.750000 // sell
								if( nvimin > 2.5539 )
									ret := -1.000000 // sell
							if( azul > -52.3892 )
								if( BollOsc <= 12.9472 )
									ret := 0.195489
								if( BollOsc > 12.9472 )
									ret := -0.191781
						if( nvimin > 2.63611 )
							if( verde_mean <= 41.1767 )
								if( oscp <= 6.36565 )
									ret := -0.200000
								if( oscp > 6.36565 )
									ret := 0.750000 // buy
							if( verde_mean > 41.1767 )
								if( nvim <= 2.66221 )
									ret := -0.879518 // sell
								if( nvim > 2.66221 )
									ret := -0.360000
					if( stoc > 71.2068 )
						if( pvim <= 0.970436 )
							if( verde_mean <= 122.216 )
								if( marron <= 104.539 )
									ret := -0.336538
								if( marron > 104.539 )
									ret := 0.658537
							if( verde_mean > 122.216 )
								if( nvi_ema <= 2.85331 )
									ret := -0.682927
								if( nvi_ema > 2.85331 )
									ret := 0.200000
						if( pvim > 0.970436 )
							if( xrsi <= 46.309 )
								if( xrsi <= 45.311 )
									ret := -1.000000 // sell
								if( xrsi > 45.311 )
									ret := -0.750000 // sell
							if( xrsi > 46.309 )
								if( media_azul <= 54.268 )
									ret := -0.316456
								if( media_azul > 54.268 )
									ret := 0.092548
		if( azul > 33.4316 )
			if( verde_mean <= 118.673 )
				if( stoc <= 62.4021 )
					if( pvimin <= 0.78191 )
						if( azul_mean <= 31.2149 )
							if( media_azul <= -18.7722 )
								if( verde <= 67.3908 )
									ret := -0.333333
								if( verde > 67.3908 )
									ret := 0.743590 // buy
							if( media_azul > -18.7722 )
								if( stoc <= 45.1435 )
									ret := 0.343750
								if( stoc > 45.1435 )
									ret := -0.346774
						if( azul_mean > 31.2149 )
							if( xrsi <= 62.2438 )
								if( nvimin <= 0.062827 )
									ret := -0.250000
								if( nvimin > 0.062827 )
									ret := 0.619048
							if( xrsi > 62.2438 )
								if( media <= 66.1785 )
									ret := 0.466667
								if( media > 66.1785 )
									ret := -0.640000
					if( pvimin > 0.78191 )
						if( nvim <= 0.780046 )
							if( xmf <= 61.7861 )
								if( azul_mean <= 43.3989 )
									ret := -0.535714
								if( azul_mean > 43.3989 )
									ret := 1.000000 // buy
							if( xmf > 61.7861 )
								if( verde_media <= -8.51666 )
									ret := -0.250000
								if( verde_media > -8.51666 )
									ret := 0.954545 // buy
						if( nvim > 0.780046 )
							if( azul_mean <= 6.03858 )
								if( marron_mean <= 42.1007 )
									ret := 1.000000 // buy
								if( marron_mean > 42.1007 )
									ret := -0.090909
							if( azul_mean > 6.03858 )
								if( oscp <= -16.8085 )
									ret := 0.500000
								if( oscp > -16.8085 )
									ret := -0.619048
				if( stoc > 62.4021 )
					if( oscp <= -17.7361 )
						if( azul <= 42.8239 )
							if( azul <= 35.6048 )
								ret := 0.333333
							if( azul > 35.6048 )
								ret := 1.000000 // buy
						if( azul > 42.8239 )
							if( media <= 69.394 )
								if( verde_azul <= -21.5612 )
									ret := 0.900000 // buy
								if( verde_azul > -21.5612 )
									ret := 0.083333
							if( media > 69.394 )
								if( xmf <= 60.4058 )
									ret := -0.800000 // sell
								if( xmf > 60.4058 )
									ret := 0.333333
					if( oscp > -17.7361 )
						if( nvi_ema <= 0.918512 )
							if( nvimin <= 0.787663 )
								if( media_azul <= -60.8411 )
									ret := 0.750000 // buy
								if( media_azul > -60.8411 )
									ret := -0.263279
							if( nvimin > 0.787663 )
								if( nvi <= 0.845335 )
									ret := 0.814815 // buy
								if( nvi > 0.845335 )
									ret := 0.116883
						if( nvi_ema > 0.918512 )
							if( media_azul <= 46.243 )
								if( marron_mean <= 54.3191 )
									ret := -0.018182
								if( marron_mean > 54.3191 )
									ret := -0.454315
							if( media_azul > 46.243 )
								if( nvi <= 2.53264 )
									ret := -0.227941
								if( nvi > 2.53264 )
									ret := 0.275510
			if( verde_mean > 118.673 )
				if( nvimax <= 2.79003 )
					if( tprice <= 70.4409 )
						if( BollOsc <= 57.1355 )
							if( pvi_ema <= 1.0993 )
								if( verde_azul <= 77.6131 )
									ret := -0.230769
								if( verde_azul > 77.6131 )
									ret := 0.355072
							if( pvi_ema > 1.0993 )
								if( oscp <= 27.8523 )
									ret := -0.941176 // sell
								if( oscp > 27.8523 )
									ret := -0.250000
						if( BollOsc > 57.1355 )
							if( verde <= 145.907 )
								if( media_azul <= 28.8886 )
									ret := 0.789474 // buy
								if( media_azul > 28.8886 )
									ret := -0.272727
							if( verde > 145.907 )
								if( media <= 95.5725 )
									ret := -0.261905
								if( media > 95.5725 )
									ret := -0.863636 // sell
					if( tprice > 70.4409 )
						if( marron <= 123.801 )
							if( source <= 216.396 )
								if( verde_azul <= 58.7088 )
									ret := -0.263158
								if( verde_azul > 58.7088 )
									ret := 0.616505
							if( source > 216.396 )
								if( azul <= 36.8198 )
									ret := -0.800000 // sell
								if( azul > 36.8198 )
									ret := 0.100000
						if( marron > 123.801 )
							if( verde_mean <= 168.417 )
								if( stoc <= 85.7139 )
									ret := 0.254237
								if( stoc > 85.7139 )
									ret := -0.306931
							if( verde_mean > 168.417 )
								if( pvim <= 0.464991 )
									ret := -1.000000 // sell
								if( pvim > 0.464991 )
									ret := 0.512500
				if( nvimax > 2.79003 )
					if( azul_mean <= 58.9199 )
						if( verde_media <= 71.9896 )
							if( nvimax <= 2.97941 )
								if( media <= 82.1948 )
									ret := -0.500000
								if( media > 82.1948 )
									ret := -0.967742 // sell
							if( nvimax > 2.97941 )
								ret := -0.250000
						if( verde_media > 71.9896 )
							if( pvi_ema <= 0.604255 )
								ret := 0.750000 // buy
							if( pvi_ema > 0.604255 )
								if( tprice <= 204.82 )
									ret := -0.750000 // sell
								if( tprice > 204.82 )
									ret := 0.000000
					if( azul_mean > 58.9199 )
						if( marron_mean <= 133.807 )
							ret := -0.250000
						if( marron_mean > 133.807 )
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
float op_operation = decision_tree_0_ETSY_15Min_80fa3424(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


