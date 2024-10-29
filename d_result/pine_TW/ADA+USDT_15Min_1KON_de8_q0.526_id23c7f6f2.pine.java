//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: ADAUSDT_15Min_1KON_23c7f6f2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_15Min_1KON_23c7f6f2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_15Min_23c7f6f2(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( marron_mean <= 13.3637 )
		if( nvi_ema <= 0.716461 )
			if( verde_azul <= -66.6059 )
				if( verde_azul <= -90.8883 )
					if( media <= 17.0753 )
						if( marron_mean <= -14.7811 )
							ret := -0.777778 // sell
						if( marron_mean > -14.7811 )
							if( BollOsc <= -36.6306 )
								if( nvim <= 0.434389 )
									ret := 0.723404 // buy
								if( nvim > 0.434389 )
									ret := -0.062500
							if( BollOsc > -36.6306 )
								ret := -0.583333
					if( media > 17.0753 )
						if( verde_azul <= -94.9715 )
							if( xmf <= 15.4754 )
								if( source <= 0.427969 )
									ret := 0.000000
								if( source > 0.427969 )
									ret := -0.300000
							if( xmf > 15.4754 )
								if( media <= 27.7487 )
									ret := -0.837838 // sell
								if( media > 27.7487 )
									ret := -0.454545
						if( verde_azul > -94.9715 )
							ret := 0.421053
				if( verde_azul > -90.8883 )
					if( marron_mean <= -13.0235 )
						ret := 0.187500
					if( marron_mean > -13.0235 )
						if( oscp <= -61.4544 )
							if( xrsi <= 21.3248 )
								ret := -0.500000
							if( xrsi > 21.3248 )
								if( media <= 24.0808 )
									ret := -1.000000 // sell
								if( media > 24.0808 )
									ret := -0.826087 // sell
						if( oscp > -61.4544 )
							if( verde_azul <= -75.2187 )
								if( verde_azul <= -86.0857 )
									ret := -0.266667
								if( verde_azul > -86.0857 )
									ret := -0.672414
							if( verde_azul > -75.2187 )
								if( nvi_ema <= 0.10057 )
									ret := 0.230769
								if( nvi_ema > 0.10057 )
									ret := -0.342857
			if( verde_azul > -66.6059 )
				if( stoc <= 13.7646 )
					if( nvim <= 0.070005 )
						if( pvim <= -0.3233 )
							if( verde_mean <= -2.9773 )
								if( verde_media <= -17.5455 )
									ret := 0.831325 // buy
								if( verde_media > -17.5455 )
									ret := 0.200000
							if( verde_mean > -2.9773 )
								ret := -0.187500
						if( pvim > -0.3233 )
							if( media_azul <= 40.0644 )
								if( verde_media <= -36.4547 )
									ret := 0.448276
								if( verde_media > -36.4547 )
									ret := 0.075472
							if( media_azul > 40.0644 )
								if( stoc <= 12.0068 )
									ret := -0.566038
								if( stoc > 12.0068 )
									ret := 0.187500
					if( nvim > 0.070005 )
						if( pvimin <= -0.579042 )
							if( azul <= 11.6291 )
								if( azul <= 4.15626 )
									ret := 0.192308
								if( azul > 4.15626 )
									ret := -0.412698
							if( azul > 11.6291 )
								if( oscp <= -21.821 )
									ret := 0.757576 // buy
								if( oscp > -21.821 )
									ret := 0.333333
						if( pvimin > -0.579042 )
							if( tprice <= 0.477172 )
								if( pvimax <= -0.455273 )
									ret := 0.095238
								if( pvimax > -0.455273 )
									ret := -0.796610 // sell
							if( tprice > 0.477172 )
								if( stoc <= 8.22012 )
									ret := -0.500000
								if( stoc > 8.22012 )
									ret := 0.157895
				if( stoc > 13.7646 )
					if( marron <= 1.33699 )
						if( verde_media <= -51.7391 )
							if( verde_mean <= -54.8757 )
								if( nvimin <= 0.148772 )
									ret := -0.076923
								if( nvimin > 0.148772 )
									ret := 0.857143 // buy
							if( verde_mean > -54.8757 )
								if( xrsi <= 20.103 )
									ret := 0.205607
								if( xrsi > 20.103 )
									ret := -0.348148
						if( verde_media > -51.7391 )
							if( nvimin <= 0.328681 )
								if( media_azul <= 11.7721 )
									ret := 0.214286
								if( media_azul > 11.7721 )
									ret := 0.732558 // buy
							if( nvimin > 0.328681 )
								if( marron <= -6.2314 )
									ret := -0.588235
								if( marron > -6.2314 )
									ret := 0.197531
					if( marron > 1.33699 )
						if( media_azul <= 38.277 )
							if( nvi <= -0.087667 )
								if( nvi <= -0.136339 )
									ret := -0.251429
								if( nvi > -0.136339 )
									ret := -0.703704 // sell
							if( nvi > -0.087667 )
								if( nvim <= -0.079884 )
									ret := 0.418605
								if( nvim > -0.079884 )
									ret := -0.152591
						if( media_azul > 38.277 )
							if( pvim <= -0.869382 )
								if( verde_mean <= -23.3001 )
									ret := -0.785714 // sell
								if( verde_mean > -23.3001 )
									ret := -0.034483
							if( pvim > -0.869382 )
								if( azul <= -15.7003 )
									ret := 0.562500
								if( azul > -15.7003 )
									ret := -0.030303
		if( nvi_ema > 0.716461 )
			if( media_azul <= 33.8479 )
				if( oscp <= -73.8488 )
					if( verde <= -99.5326 )
						if( marron_mean <= 0.798454 )
							if( verde_mean <= -90.8468 )
								if( nvimax <= 4.03593 )
									ret := 0.884615 // buy
								if( nvimax > 4.03593 )
									ret := 0.428571
							if( verde_mean > -90.8468 )
								if( verde_mean <= -66.917 )
									ret := -0.196429
								if( verde_mean > -66.917 )
									ret := 0.692308
						if( marron_mean > 0.798454 )
							if( nvimax <= 3.52311 )
								if( tprice <= 0.473135 )
									ret := -0.333333
								if( tprice > 0.473135 )
									ret := 0.636364
							if( nvimax > 3.52311 )
								ret := -0.875000 // sell
					if( verde > -99.5326 )
						if( nvi <= 5.2724 )
							if( nvi_ema <= 1.33155 )
								ret := 0.333333
							if( nvi_ema > 1.33155 )
								if( nvi_ema <= 3.73389 )
									ret := 0.890110 // buy
								if( nvi_ema > 3.73389 )
									ret := 0.592593
						if( nvi > 5.2724 )
							ret := 0.000000
				if( oscp > -73.8488 )
					if( verde_media <= -90.6369 )
						if( verde_azul <= -99.942 )
							if( marron <= -9.97347 )
								ret := -1.000000 // sell
							if( marron > -9.97347 )
								ret := -0.750000 // sell
						if( verde_azul > -99.942 )
							if( verde <= -67.4899 )
								if( marron <= -11.6976 )
									ret := -0.402985
								if( marron > -11.6976 )
									ret := 0.551724
							if( verde > -67.4899 )
								if( azul_mean <= -0.408003 )
									ret := -1.000000 // sell
								if( azul_mean > -0.408003 )
									ret := -0.480000
					if( verde_media > -90.6369 )
						if( marron <= -9.30894 )
							if( media <= 18.4736 )
								if( media_azul <= -26.9186 )
									ret := -0.888889 // sell
								if( media_azul > -26.9186 )
									ret := 0.320652
							if( media > 18.4736 )
								if( nvi <= 1.90656 )
									ret := 0.216216
								if( nvi > 1.90656 )
									ret := 0.904762 // buy
						if( marron > -9.30894 )
							if( stoc <= 18.0866 )
								if( azul <= 13.4011 )
									ret := 0.073327
								if( azul > 13.4011 )
									ret := 0.331731
							if( stoc > 18.0866 )
								if( azul <= 80.5475 )
									ret := -0.020650
								if( azul > 80.5475 )
									ret := 0.414966
			if( media_azul > 33.8479 )
				if( pvimin <= -5.04902 )
					if( verde <= 13.3846 )
						if( azul <= -35.3378 )
							if( nvi <= 5.08715 )
								ret := 0.111111
							if( nvi > 5.08715 )
								if( verde <= 4.33835 )
									ret := 0.765957 // buy
								if( verde > 4.33835 )
									ret := 0.200000
						if( azul > -35.3378 )
							if( verde_mean <= -36.3145 )
								if( stoc <= 13.9396 )
									ret := 0.666667
								if( stoc > 13.9396 )
									ret := 0.000000
							if( verde_mean > -36.3145 )
								if( marron_mean <= 10.1982 )
									ret := -0.392308
								if( marron_mean > 10.1982 )
									ret := 0.306122
					if( verde > 13.3846 )
						if( pvim <= -5.51511 )
							if( pvi <= -5.56305 )
								ret := -0.363636
							if( pvi > -5.56305 )
								ret := 0.222222
						if( pvim > -5.51511 )
							if( media <= 24.9482 )
								ret := -0.526316
							if( media > 24.9482 )
								if( source <= 0.36525 )
									ret := -1.000000 // sell
								if( source > 0.36525 )
									ret := -0.818182 // sell
				if( pvimin > -5.04902 )
					if( BollOsc <= -73.5617 )
						if( pvimax <= -2.17383 )
							if( xmf <= 13.3249 )
								if( pvim <= -2.63888 )
									ret := 0.968750 // buy
								if( pvim > -2.63888 )
									ret := 0.666667
							if( xmf > 13.3249 )
								if( azul_mean <= -15.7947 )
									ret := -0.550000
								if( azul_mean > -15.7947 )
									ret := 0.620690
						if( pvimax > -2.17383 )
							if( nvi_ema <= 0.998405 )
								ret := 0.727273 // buy
							if( nvi_ema > 0.998405 )
								if( nvimin <= 1.66408 )
									ret := 1.000000 // buy
								if( nvimin > 1.66408 )
									ret := 0.866667 // buy
					if( BollOsc > -73.5617 )
						if( azul <= -45.9805 )
							if( pvim <= -2.28106 )
								if( xrsi <= 28.1011 )
									ret := 0.458015
								if( xrsi > 28.1011 )
									ret := -0.321429
							if( pvim > -2.28106 )
								if( oscp <= -43.3015 )
									ret := 0.500000
								if( oscp > -43.3015 )
									ret := -0.551724
						if( azul > -45.9805 )
							if( media <= 14.7165 )
								if( BollOsc <= -44.7257 )
									ret := 0.714286 // buy
								if( BollOsc > -44.7257 )
									ret := 0.318584
							if( media > 14.7165 )
								if( verde_media <= -38.3882 )
									ret := 0.155374
								if( verde_media > -38.3882 )
									ret := 0.517510
	if( marron_mean > 13.3637 )
		if( xmf <= 34.7697 )
			if( tprice <= 0.554805 )
				if( oscp <= 3.65272 )
					if( media_azul <= 53.9881 )
						if( nvimin <= -0.131648 )
							if( stoc <= 47.0009 )
								if( stoc <= 16.1594 )
									ret := -0.566038
								if( stoc > 16.1594 )
									ret := -0.158621
							if( stoc > 47.0009 )
								if( nvim <= -0.270827 )
									ret := 0.333333
								if( nvim > -0.270827 )
									ret := 0.800000 // buy
						if( nvimin > -0.131648 )
							if( pvimin <= -3.0805 )
								if( verde_azul <= -48.1623 )
									ret := 0.186391
								if( verde_azul > -48.1623 )
									ret := -0.062250
							if( pvimin > -3.0805 )
								if( marron_mean <= 16.6593 )
									ret := -0.030069
								if( marron_mean > 16.6593 )
									ret := 0.100806
					if( media_azul > 53.9881 )
						if( oscp <= -73.7226 )
							if( media <= 60.7703 )
								if( source <= 0.273536 )
									ret := 0.600000
								if( source > 0.273536 )
									ret := 0.941176 // buy
							if( media > 60.7703 )
								ret := 0.250000
						if( oscp > -73.7226 )
							if( xrsi <= 27.8679 )
								if( media <= 54.9258 )
									ret := -0.276471
								if( media > 54.9258 )
									ret := 0.521739
							if( xrsi > 27.8679 )
								if( media <= 24.8867 )
									ret := -0.355932
								if( media > 24.8867 )
									ret := 0.139909
				if( oscp > 3.65272 )
					if( nvi_ema <= 2.43664 )
						if( pvimax <= -0.306052 )
							if( xrsi <= 40.6782 )
								if( nvi <= 1.72094 )
									ret := 0.472222
								if( nvi > 1.72094 )
									ret := -0.461538
							if( xrsi > 40.6782 )
								if( stoc <= 18.8227 )
									ret := -0.878049 // sell
								if( stoc > 18.8227 )
									ret := -0.312896
						if( pvimax > -0.306052 )
							if( media_azul <= 63.9693 )
								if( pvimax <= -0.243759 )
									ret := 0.300000
								if( pvimax > -0.243759 )
									ret := -0.166667
							if( media_azul > 63.9693 )
								if( nvimax <= -0.139137 )
									ret := 0.555556
								if( nvimax > -0.139137 )
									ret := 0.846154 // buy
					if( nvi_ema > 2.43664 )
						if( media_azul <= 75.8121 )
							if( oscp <= 15.5513 )
								if( verde_azul <= 78.4011 )
									ret := -0.031915
								if( verde_azul > 78.4011 )
									ret := 0.705882 // buy
							if( oscp > 15.5513 )
								if( azul <= -24.9765 )
									ret := 0.076923
								if( azul > -24.9765 )
									ret := -0.608696
						if( media_azul > 75.8121 )
							if( azul_mean <= -35.2762 )
								if( azul_mean <= -48.4412 )
									ret := 0.470588
								if( azul_mean > -48.4412 )
									ret := 1.000000 // buy
							if( azul_mean > -35.2762 )
								if( azul_mean <= -24.5445 )
									ret := -0.400000
								if( azul_mean > -24.5445 )
									ret := 0.461538
			if( tprice > 0.554805 )
				if( pvi_ema <= -0.075394 )
					if( pvim <= -0.097154 )
						if( pvimin <= -2.65279 )
							if( source <= 0.630373 )
								if( BollOsc <= -62.1624 )
									ret := -0.322581
								if( BollOsc > -62.1624 )
									ret := 0.342975
							if( source > 0.630373 )
								if( verde_mean <= 24.5311 )
									ret := 0.195846
								if( verde_mean > 24.5311 )
									ret := -0.181818
						if( pvimin > -2.65279 )
							if( verde_azul <= -14.6131 )
								if( verde_mean <= -19.4162 )
									ret := -0.578947
								if( verde_mean > -19.4162 )
									ret := 0.412903
							if( verde_azul > -14.6131 )
								if( tprice <= 0.555646 )
									ret := 0.684211
								if( tprice > 0.555646 )
									ret := -0.175947
					if( pvim > -0.097154 )
						if( oscp <= -6.73591 )
							ret := 0.312500
						if( oscp > -6.73591 )
							if( BollOsc <= -18.4637 )
								ret := 1.000000 // buy
							if( BollOsc > -18.4637 )
								ret := 0.636364
				if( pvi_ema > -0.075394 )
					if( verde_azul <= -44.299 )
						if( marron_mean <= 31.4309 )
							ret := -0.600000
						if( marron_mean > 31.4309 )
							ret := -1.000000 // sell
					if( verde_azul > -44.299 )
						if( oscp <= -9.34713 )
							if( media_azul <= 24.0835 )
								ret := 0.846154 // buy
							if( media_azul > 24.0835 )
								if( source <= 0.7871 )
									ret := 0.083333
								if( source > 0.7871 )
									ret := -0.307692
						if( oscp > -9.34713 )
							if( pvimin <= -0.048943 )
								if( pvimax <= -0.049434 )
									ret := 0.100000
								if( pvimax > -0.049434 )
									ret := -0.638298
							if( pvimin > -0.048943 )
								if( source <= 0.837733 )
									ret := 0.026316
								if( source > 0.837733 )
									ret := -0.500000
		if( xmf > 34.7697 )
			if( verde <= 155.651 )
				if( azul_mean <= 93.4848 )
					if( nvi_ema <= -0.313336 )
						if( verde_media <= 1.4322 )
							if( verde_azul <= 46.7627 )
								ret := -1.000000 // sell
							if( verde_azul > 46.7627 )
								ret := -0.900000 // sell
						if( verde_media > 1.4322 )
							if( stoc <= 74.8363 )
								ret := 0.388889
							if( stoc > 74.8363 )
								ret := -0.761905 // sell
					if( nvi_ema > -0.313336 )
						if( nvimax <= -0.272897 )
							if( media <= 92.6043 )
								if( media_azul <= 22.072 )
									ret := -0.090909
								if( media_azul > 22.072 )
									ret := 0.644444
							if( media > 92.6043 )
								if( oscp <= 21.5149 )
									ret := -0.111111
								if( oscp > 21.5149 )
									ret := -0.500000
						if( nvimax > -0.272897 )
							if( verde_mean <= 112.65 )
								if( media <= 68.0204 )
									ret := -0.014148
								if( media > 68.0204 )
									ret := -0.058892
							if( verde_mean > 112.65 )
								if( oscp <= 20.898 )
									ret := 0.060629
								if( oscp > 20.898 )
									ret := -0.035920
				if( azul_mean > 93.4848 )
					if( nvimin <= 2.62716 )
						if( stoc <= 60.7909 )
							if( azul_mean <= 121.298 )
								if( pvimax <= -2.46017 )
									ret := -0.625000
								if( pvimax > -2.46017 )
									ret := -1.000000 // sell
							if( azul_mean > 121.298 )
								ret := -1.000000 // sell
						if( stoc > 60.7909 )
							if( verde_azul <= -29.1582 )
								if( nvimax <= 1.24227 )
									ret := -1.000000 // sell
								if( nvimax > 1.24227 )
									ret := -0.529412
							if( verde_azul > -29.1582 )
								ret := -0.142857
					if( nvimin > 2.62716 )
						if( verde_media <= -6.85515 )
							ret := 0.615385
						if( verde_media > -6.85515 )
							if( media <= 26.2735 )
								ret := 0.363636
							if( media > 26.2735 )
								if( media_azul <= -37.345 )
									ret := -0.935484 // sell
								if( media_azul > -37.345 )
									ret := 0.090909
			if( verde > 155.651 )
				if( azul_mean <= -15.8425 )
					if( marron_mean <= 115.895 )
						if( marron <= 108.653 )
							if( media <= 81.5299 )
								if( xrsi <= 60.7678 )
									ret := 0.615385
								if( xrsi > 60.7678 )
									ret := -0.263158
							if( media > 81.5299 )
								if( nvim <= 1.97722 )
									ret := 0.470588
								if( nvim > 1.97722 )
									ret := 0.909091 // buy
						if( marron > 108.653 )
							if( xrsi <= 75.5318 )
								if( tprice <= 0.330537 )
									ret := 0.142857
								if( tprice > 0.330537 )
									ret := -0.683168
							if( xrsi > 75.5318 )
								if( source <= 0.379555 )
									ret := -0.205882
								if( source > 0.379555 )
									ret := 0.560976
					if( marron_mean > 115.895 )
						if( xmf <= 80.456 )
							if( xrsi <= 75.8817 )
								ret := 0.227273
							if( xrsi > 75.8817 )
								if( azul_mean <= -34.2644 )
									ret := -0.846154 // sell
								if( azul_mean > -34.2644 )
									ret := -0.500000
						if( xmf > 80.456 )
							if( azul <= -35.7338 )
								ret := -0.368421
							if( azul > -35.7338 )
								if( stoc <= 90.2609 )
									ret := -0.902778 // sell
								if( stoc > 90.2609 )
									ret := -0.692308
				if( azul_mean > -15.8425 )
					if( pvim <= -1.50006 )
						if( oscp <= 38.8974 )
							if( marron_mean <= 102.006 )
								if( nvi <= 1.7709 )
									ret := 0.307692
								if( nvi > 1.7709 )
									ret := 0.756757 // buy
							if( marron_mean > 102.006 )
								if( media_azul <= 79.1252 )
									ret := -0.389474
								if( media_azul > 79.1252 )
									ret := 0.083721
						if( oscp > 38.8974 )
							if( xmf <= 75.0239 )
								if( verde_media <= 108.812 )
									ret := 0.548837
								if( verde_media > 108.812 )
									ret := 0.120690
							if( xmf > 75.0239 )
								if( stoc <= 81.5043 )
									ret := -0.059155
								if( stoc > 81.5043 )
									ret := 0.226461
					if( pvim > -1.50006 )
						if( azul <= 43.4977 )
							if( media <= 112.436 )
								if( xrsi <= 85.4967 )
									ret := -0.120000
								if( xrsi > 85.4967 )
									ret := 0.333333
							if( media > 112.436 )
								if( oscp <= 36.7548 )
									ret := -0.852941 // sell
								if( oscp > 36.7548 )
									ret := -0.318182
						if( azul > 43.4977 )
							if( verde_mean <= 148.153 )
								if( oscp <= 50.646 )
									ret := 0.238095
								if( oscp > 50.646 )
									ret := -0.857143 // sell
							if( verde_mean > 148.153 )
								if( verde_azul <= 94.154 )
									ret := -0.125000
								if( verde_azul > 94.154 )
									ret := 0.843750 // buy
	
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
float op_operation = decision_tree_0_ADAUSDT_15Min_23c7f6f2(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


