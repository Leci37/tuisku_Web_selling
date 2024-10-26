//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: TRXUSDT_30Min_1KON_d532700f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_30Min_1KON_d532700f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_30Min_d532700f(nvimin, azul, nvim, marron_mean, marron, nvimax, pvi, pvi_ema, oscp, verde, source, stoc, verde_mean, xrsi, media, xmf, tprice, pvimin, media_azul, verde_media, BollOsc, pvimax, nvi_ema, azul_mean, pvim, nvi, verde_azul)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( nvimax <= 5.00002 )
		if( xrsi <= 63.6475 )
			if( azul_mean <= -36.2003 )
				if( source <= 0.033328 )
					if( pvimax <= -0.560856 )
						if( marron_mean <= 32.2386 )
							if( nvimin <= 0.199372 )
								ret := 0.400000
							if( nvimin > 0.199372 )
								ret := 1.000000 // buy
						if( marron_mean > 32.2386 )
							if( media <= 41.1606 )
								if( xmf <= 51.7526 )
									ret := -1.000000 // sell
								if( xmf > 51.7526 )
									ret := -0.500000
							if( media > 41.1606 )
								if( BollOsc <= -16.3965 )
									ret := 1.000000 // buy
								if( BollOsc > -16.3965 )
									ret := 0.000000
					if( pvimax > -0.560856 )
						if( verde_mean <= 19.4279 )
							ret := -0.750000 // sell
						if( verde_mean > 19.4279 )
							ret := -1.000000 // sell
				if( source > 0.033328 )
					if( verde <= -14.7284 )
						if( xmf <= 21.1497 )
							if( media_azul <= 30.8102 )
								ret := -0.571429
							if( media_azul > 30.8102 )
								if( oscp <= -21.5503 )
									ret := 0.885714 // buy
								if( oscp > -21.5503 )
									ret := 0.333333
						if( xmf > 21.1497 )
							if( media_azul <= 60.0225 )
								if( BollOsc <= -43.1798 )
									ret := 0.750000 // buy
								if( BollOsc > -43.1798 )
									ret := -0.666667
							if( media_azul > 60.0225 )
								if( nvimin <= 3.93669 )
									ret := -0.861111 // sell
								if( nvimin > 3.93669 )
									ret := -0.194444
					if( verde > -14.7284 )
						if( media_azul <= 166.018 )
							if( azul <= -16.2777 )
								if( nvimax <= 4.97787 )
									ret := 0.590842
								if( nvimax > 4.97787 )
									ret := -0.777778 // sell
							if( azul > -16.2777 )
								if( pvi_ema <= -0.914729 )
									ret := 0.000000
								if( pvi_ema > -0.914729 )
									ret := -0.900000 // sell
						if( media_azul > 166.018 )
							if( marron_mean <= 103.026 )
								if( BollOsc <= -24.2436 )
									ret := 1.000000 // buy
								if( BollOsc > -24.2436 )
									ret := -0.581395
							if( marron_mean > 103.026 )
								if( BollOsc <= 20.3523 )
									ret := 1.000000 // buy
								if( BollOsc > 20.3523 )
									ret := 0.250000
			if( azul_mean > -36.2003 )
				if( nvimax <= 4.4106 )
					if( tprice <= 0.146296 )
						if( nvi <= 0.282588 )
							if( nvi <= 0.19597 )
								if( verde_azul <= 69.2719 )
									ret := 0.601942
								if( verde_azul > 69.2719 )
									ret := 0.106667
							if( nvi > 0.19597 )
								if( verde_azul <= 20.7524 )
									ret := 0.107826
								if( verde_azul > 20.7524 )
									ret := -0.129559
						if( nvi > 0.282588 )
							if( media_azul <= 33.8256 )
								if( xrsi <= 35.3442 )
									ret := 0.172270
								if( xrsi > 35.3442 )
									ret := 0.020345
							if( media_azul > 33.8256 )
								if( xmf <= 76.3882 )
									ret := 0.162626
								if( xmf > 76.3882 )
									ret := -0.204918
					if( tprice > 0.146296 )
						if( stoc <= 27.9726 )
							if( nvim <= 1.88152 )
								if( pvim <= -0.025754 )
									ret := 0.400000
								if( pvim > -0.025754 )
									ret := -0.894737 // sell
							if( nvim > 1.88152 )
								ret := -1.000000 // sell
						if( stoc > 27.9726 )
							if( xmf <= 64.8358 )
								if( verde_media <= -8.61449 )
									ret := -0.382353
								if( verde_media > -8.61449 )
									ret := 0.387097
							if( xmf > 64.8358 )
								if( stoc <= 66.2671 )
									ret := -0.500000
								if( stoc > 66.2671 )
									ret := -1.000000 // sell
				if( nvimax > 4.4106 )
					if( source <= 0.056195 )
						if( media <= 85.3816 )
							if( azul_mean <= 36.1607 )
								if( BollOsc <= 33.8047 )
									ret := 0.543210
								if( BollOsc > 33.8047 )
									ret := -0.285714
							if( azul_mean > 36.1607 )
								ret := -1.000000 // sell
						if( media > 85.3816 )
							if( verde_media <= -11.0573 )
								ret := 0.250000
							if( verde_media > -11.0573 )
								if( pvimin <= -3.57423 )
									ret := -0.750000 // sell
								if( pvimin > -3.57423 )
									ret := -1.000000 // sell
					if( source > 0.056195 )
						if( pvi_ema <= -2.48034 )
							if( verde_media <= 7.84889 )
								if( media_azul <= 1.7002 )
									ret := 0.312500
								if( media_azul > 1.7002 )
									ret := -0.013171
							if( verde_media > 7.84889 )
								if( verde_azul <= 27.6707 )
									ret := -0.184211
								if( verde_azul > 27.6707 )
									ret := 0.166174
						if( pvi_ema > -2.48034 )
							if( media <= 46.2509 )
								if( marron_mean <= 5.59254 )
									ret := -0.800000 // sell
								if( marron_mean > 5.59254 )
									ret := -1.000000 // sell
							if( media > 46.2509 )
								if( nvimax <= 4.42475 )
									ret := -1.000000 // sell
								if( nvimax > 4.42475 )
									ret := 0.000000
		if( xrsi > 63.6475 )
			if( media <= 92.8666 )
				if( marron_mean <= 89.4945 )
					if( pvi_ema <= -0.805368 )
						if( xmf <= 51.9385 )
							if( marron_mean <= 68.6122 )
								if( verde <= 147.695 )
									ret := 0.746032 // buy
								if( verde > 147.695 )
									ret := -1.000000 // sell
							if( marron_mean > 68.6122 )
								if( azul_mean <= 15.6621 )
									ret := 0.051282
								if( azul_mean > 15.6621 )
									ret := 0.818182 // buy
						if( xmf > 51.9385 )
							if( oscp <= 25.5195 )
								if( oscp <= 2.49158 )
									ret := 0.302752
								if( oscp > 2.49158 )
									ret := -0.130882
							if( oscp > 25.5195 )
								if( verde <= 149.445 )
									ret := 0.369458
								if( verde > 149.445 )
									ret := -0.063492
					if( pvi_ema > -0.805368 )
						if( media_azul <= 87.3173 )
							if( verde_media <= 8.27418 )
								if( nvimin <= 0.293 )
									ret := 0.000000
								if( nvimin > 0.293 )
									ret := -0.870968 // sell
							if( verde_media > 8.27418 )
								if( xrsi <= 67.8889 )
									ret := -0.028169
								if( xrsi > 67.8889 )
									ret := -0.602941
						if( media_azul > 87.3173 )
							if( media_azul <= 94.9662 )
								if( nvi_ema <= 0.209733 )
									ret := 0.000000
								if( nvi_ema > 0.209733 )
									ret := 0.852941 // buy
							if( media_azul > 94.9662 )
								if( stoc <= 80.76 )
									ret := -0.645161
								if( stoc > 80.76 )
									ret := 0.500000
				if( marron_mean > 89.4945 )
					if( pvim <= -3.33277 )
						if( tprice <= 0.059098 )
							if( oscp <= 9.88498 )
								ret := 0.200000
							if( oscp > 9.88498 )
								if( pvi <= -3.51851 )
									ret := -0.250000
								if( pvi > -3.51851 )
									ret := -1.000000 // sell
						if( tprice > 0.059098 )
							if( azul_mean <= 31.2847 )
								if( media_azul <= 82.8184 )
									ret := 0.743243 // buy
								if( media_azul > 82.8184 )
									ret := -0.105263
							if( azul_mean > 31.2847 )
								if( marron <= 111.437 )
									ret := 0.200000
								if( marron > 111.437 )
									ret := -1.000000 // sell
					if( pvim > -3.33277 )
						if( verde_media <= 47.5341 )
							if( azul <= 22.1023 )
								if( xmf <= 46.8429 )
									ret := 0.541667
								if( xmf > 46.8429 )
									ret := -0.333091
							if( azul > 22.1023 )
								if( verde <= 120.423 )
									ret := 0.248649
								if( verde > 120.423 )
									ret := -0.542373
						if( verde_media > 47.5341 )
							if( stoc <= 88.7332 )
								if( verde_mean <= 119.045 )
									ret := 0.029070
								if( verde_mean > 119.045 )
									ret := -0.312373
							if( stoc > 88.7332 )
								if( media <= 78.5685 )
									ret := 0.526882
								if( media > 78.5685 )
									ret := 0.090909
			if( media > 92.8666 )
				if( nvi <= 1.13043 )
					if( azul <= 35.6403 )
						if( azul_mean <= -18.3003 )
							if( media <= 102.019 )
								if( source <= 0.036075 )
									ret := 0.041667
								if( source > 0.036075 )
									ret := -1.000000 // sell
							if( media > 102.019 )
								if( verde <= 142.13 )
									ret := 0.882353 // buy
								if( verde > 142.13 )
									ret := 0.357143
						if( azul_mean > -18.3003 )
							if( media <= 97.8118 )
								if( xmf <= 64.2135 )
									ret := 0.204301
								if( xmf > 64.2135 )
									ret := -0.221053
							if( media > 97.8118 )
								if( BollOsc <= 32.6652 )
									ret := -0.186813
								if( BollOsc > 32.6652 )
									ret := -0.625000
					if( azul > 35.6403 )
						if( media <= 110.667 )
							if( pvi_ema <= -1.06377 )
								ret := -0.250000
							if( pvi_ema > -1.06377 )
								if( azul_mean <= 76.5225 )
									ret := 0.840909 // buy
								if( azul_mean > 76.5225 )
									ret := 0.000000
						if( media > 110.667 )
							if( xrsi <= 88.7157 )
								ret := -0.500000
							if( xrsi > 88.7157 )
								ret := -1.000000 // sell
				if( nvi > 1.13043 )
					if( xrsi <= 78.2625 )
						if( marron_mean <= 115.241 )
							if( verde_azul <= 92.6572 )
								if( pvim <= -1.18544 )
									ret := 0.182844
								if( pvim > -1.18544 )
									ret := 0.705357 // buy
							if( verde_azul > 92.6572 )
								if( verde_media <= 5.54903 )
									ret := -0.273356
								if( verde_media > 5.54903 )
									ret := 0.100121
						if( marron_mean > 115.241 )
							if( verde_azul <= 80.5455 )
								if( source <= 0.066581 )
									ret := 0.000000
								if( source > 0.066581 )
									ret := -0.882353 // sell
							if( verde_azul > 80.5455 )
								if( verde_media <= 23.8702 )
									ret := 0.721393 // buy
								if( verde_media > 23.8702 )
									ret := 0.186364
					if( xrsi > 78.2625 )
						if( verde_azul <= 234.016 )
							if( verde_azul <= 96.7248 )
								if( media_azul <= 43.7844 )
									ret := 0.222222
								if( media_azul > 43.7844 )
									ret := -0.763889 // sell
							if( verde_azul > 96.7248 )
								if( azul_mean <= 9.56226 )
									ret := -0.163551
								if( azul_mean > 9.56226 )
									ret := 0.171111
						if( verde_azul > 234.016 )
							if( media <= 102.753 )
								if( verde_azul <= 250.139 )
									ret := -1.000000 // sell
								if( verde_azul > 250.139 )
									ret := 0.625000
							if( media > 102.753 )
								if( verde_mean <= 168.892 )
									ret := -0.538462
								if( verde_mean > 168.892 )
									ret := -0.968750 // sell
	if( nvimax > 5.00002 )
		if( azul <= 0.526422 )
			if( source <= 0.066281 )
				if( pvi <= -3.72149 )
					if( stoc <= 13.5253 )
						if( marron_mean <= -2.96109 )
							if( verde_azul <= -11.5765 )
								if( media <= 18.9365 )
									ret := -0.521739
								if( media > 18.9365 )
									ret := 0.571429
							if( verde_azul > -11.5765 )
								if( media <= 0.419852 )
									ret := 1.000000 // buy
								if( media > 0.419852 )
									ret := 0.200000
						if( marron_mean > -2.96109 )
							if( azul_mean <= -74.466 )
								ret := -0.750000 // sell
							if( azul_mean > -74.466 )
								if( azul <= -3.8174 )
									ret := 0.689320
								if( azul > -3.8174 )
									ret := 0.157895
					if( stoc > 13.5253 )
						if( oscp <= -19.0955 )
							if( nvim <= 5.19606 )
								if( verde_azul <= -9.41518 )
									ret := 0.111111
								if( verde_azul > -9.41518 )
									ret := 1.000000 // buy
							if( nvim > 5.19606 )
								if( azul_mean <= -23.2222 )
									ret := 0.095238
								if( azul_mean > -23.2222 )
									ret := -0.389831
						if( oscp > -19.0955 )
							if( marron <= 110.357 )
								if( verde_azul <= 118.791 )
									ret := 0.112045
								if( verde_azul > 118.791 )
									ret := 0.352679
							if( marron > 110.357 )
								if( verde_media <= 67.5608 )
									ret := -0.714286 // sell
								if( verde_media > 67.5608 )
									ret := 0.111111
				if( pvi > -3.72149 )
					if( BollOsc <= -74.8997 )
						if( verde_mean <= 22.0618 )
							if( azul_mean <= -17.8889 )
								if( nvimin <= 5.13406 )
									ret := -0.500000
								if( nvimin > 5.13406 )
									ret := 0.166667
							if( azul_mean > -17.8889 )
								if( verde <= -29.7254 )
									ret := -0.765957 // sell
								if( verde > -29.7254 )
									ret := 0.000000
						if( verde_mean > 22.0618 )
							if( verde <= -48.3465 )
								ret := 1.000000 // buy
							if( verde > -48.3465 )
								if( nvim <= 5.20027 )
									ret := 0.250000
								if( nvim > 5.20027 )
									ret := -0.250000
					if( BollOsc > -74.8997 )
						if( xrsi <= 33.3341 )
							if( source <= 0.051847 )
								if( pvi_ema <= -3.68653 )
									ret := 0.250000
								if( pvi_ema > -3.68653 )
									ret := -1.000000 // sell
							if( source > 0.051847 )
								if( nvimin <= 5.40466 )
									ret := 0.165029
								if( nvimin > 5.40466 )
									ret := 0.750000 // buy
						if( xrsi > 33.3341 )
							if( media <= 37.4509 )
								if( verde_azul <= 13.5806 )
									ret := -0.586207
								if( verde_azul > 13.5806 )
									ret := -0.096515
							if( media > 37.4509 )
								if( azul_mean <= -73.5892 )
									ret := -0.640000
								if( azul_mean > -73.5892 )
									ret := 0.022895
			if( source > 0.066281 )
				if( verde_mean <= 148.026 )
					if( oscp <= 3.70249 )
						if( oscp <= -129.752 )
							if( stoc <= 12.0167 )
								ret := -0.250000
							if( stoc > 12.0167 )
								if( verde_mean <= -70.769 )
									ret := -1.000000 // sell
								if( verde_mean > -70.769 )
									ret := -0.666667
						if( oscp > -129.752 )
							if( azul <= -81.3657 )
								if( verde <= 39.0436 )
									ret := 0.387097
								if( verde > 39.0436 )
									ret := -0.750000 // sell
							if( azul > -81.3657 )
								if( pvim <= -3.2612 )
									ret := -0.086473
								if( pvim > -3.2612 )
									ret := -0.456790
					if( oscp > 3.70249 )
						if( stoc <= 27.943 )
							if( verde_azul <= 116.968 )
								if( pvim <= -3.5649 )
									ret := 0.097315
								if( pvim > -3.5649 )
									ret := 0.514286
							if( verde_azul > 116.968 )
								if( media_azul <= 147.833 )
									ret := -0.769231 // sell
								if( media_azul > 147.833 )
									ret := 0.000000
						if( stoc > 27.943 )
							if( pvi <= -3.67041 )
								if( xmf <= 59.4595 )
									ret := -0.042126
								if( xmf > 59.4595 )
									ret := 0.053878
							if( pvi > -3.67041 )
								if( media <= 81.9627 )
									ret := 0.035578
								if( media > 81.9627 )
									ret := -0.221498
				if( verde_mean > 148.026 )
					if( xmf <= 69.3196 )
						if( verde_media <= 28.3885 )
							if( azul_mean <= -14.0183 )
								if( xmf <= 61.8871 )
									ret := 0.400000
								if( xmf > 61.8871 )
									ret := 1.000000 // buy
							if( azul_mean > -14.0183 )
								ret := 0.000000
						if( verde_media > 28.3885 )
							if( verde_azul <= 249.348 )
								if( xrsi <= 79.4526 )
									ret := -0.177778
								if( xrsi > 79.4526 )
									ret := 0.600000
							if( verde_azul > 249.348 )
								ret := 0.800000 // buy
					if( xmf > 69.3196 )
						if( pvi <= -3.69951 )
							if( nvimin <= 5.66757 )
								if( source <= 0.067408 )
									ret := -0.066667
								if( source > 0.067408 )
									ret := -0.697674
							if( nvimin > 5.66757 )
								if( media <= 90.3333 )
									ret := -0.500000
								if( media > 90.3333 )
									ret := -0.040323
						if( pvi > -3.69951 )
							if( media <= 116.054 )
								if( xmf <= 80.8955 )
									ret := -0.825000 // sell
								if( xmf > 80.8955 )
									ret := -0.482143
							if( media > 116.054 )
								if( media_azul <= 133.703 )
									ret := 0.200000
								if( media_azul > 133.703 )
									ret := 0.750000 // buy
		if( azul > 0.526422 )
			if( BollOsc <= 53.403 )
				if( media <= 67.2437 )
					if( stoc <= 76.7079 )
						if( source <= 0.060055 )
							if( pvimin <= -3.74356 )
								if( verde_azul <= 41.8314 )
									ret := 0.429668
								if( verde_azul > 41.8314 )
									ret := 0.039216
							if( pvimin > -3.74356 )
								if( nvi <= 5.10671 )
									ret := 0.591837
								if( nvi > 5.10671 )
									ret := 0.031977
						if( source > 0.060055 )
							if( azul_mean <= 59.6222 )
								if( azul <= 30.0522 )
									ret := 0.003140
								if( azul > 30.0522 )
									ret := 0.134891
							if( azul_mean > 59.6222 )
								if( source <= 0.087006 )
									ret := -0.011111
								if( source > 0.087006 )
									ret := -0.578947
					if( stoc > 76.7079 )
						if( verde_mean <= 79.8498 )
							if( verde <= 97.4276 )
								if( azul_mean <= 63.3392 )
									ret := 0.224599
								if( azul_mean > 63.3392 )
									ret := -0.545455
							if( verde > 97.4276 )
								if( verde_media <= 42.8833 )
									ret := 0.153846
								if( verde_media > 42.8833 )
									ret := 0.635294
						if( verde_mean > 79.8498 )
							if( BollOsc <= 47.5115 )
								if( oscp <= -10.1794 )
									ret := -0.800000 // sell
								if( oscp > -10.1794 )
									ret := 0.125698
							if( BollOsc > 47.5115 )
								if( nvimax <= 5.06813 )
									ret := 0.500000
								if( nvimax > 5.06813 )
									ret := -0.313725
				if( media > 67.2437 )
					if( nvimin <= 5.43632 )
						if( oscp <= -72.0208 )
							if( verde_azul <= -71.1788 )
								ret := 1.000000 // buy
							if( verde_azul > -71.1788 )
								ret := 0.500000
						if( oscp > -72.0208 )
							if( nvi <= 5.43287 )
								if( oscp <= 48.2196 )
									ret := -0.068109
								if( oscp > 48.2196 )
									ret := -0.777778 // sell
							if( nvi > 5.43287 )
								if( marron_mean <= 106.594 )
									ret := -0.246032
								if( marron_mean > 106.594 )
									ret := -0.833333 // sell
					if( nvimin > 5.43632 )
						if( azul <= 28.202 )
							if( marron_mean <= 127.466 )
								if( xrsi <= 79.9542 )
									ret := 0.031573
								if( xrsi > 79.9542 )
									ret := 0.210084
							if( marron_mean > 127.466 )
								if( tprice <= 0.081499 )
									ret := -1.000000 // sell
								if( tprice > 0.081499 )
									ret := -0.206897
						if( azul > 28.202 )
							if( nvi_ema <= 6.85485 )
								if( verde_media <= 13.3283 )
									ret := -0.053435
								if( verde_media > 13.3283 )
									ret := -0.243542
							if( nvi_ema > 6.85485 )
								if( media <= 112.018 )
									ret := 0.053097
								if( media > 112.018 )
									ret := 0.400000
			if( BollOsc > 53.403 )
				if( verde_azul <= 136.083 )
					if( xrsi <= 85.2988 )
						if( pvimin <= -3.63663 )
							if( stoc <= 91.82 )
								if( pvim <= -3.78547 )
									ret := 0.250000
								if( pvim > -3.78547 )
									ret := 0.054711
							if( stoc > 91.82 )
								if( marron <= 115.372 )
									ret := 0.096774
								if( marron > 115.372 )
									ret := -0.222222
						if( pvimin > -3.63663 )
							if( marron <= 121.294 )
								if( verde_mean <= 87.8561 )
									ret := -0.034483
								if( verde_mean > 87.8561 )
									ret := 0.525926
							if( marron > 121.294 )
								if( verde_media <= 75.2275 )
									ret := -0.242424
								if( verde_media > 75.2275 )
									ret := 0.500000
					if( xrsi > 85.2988 )
						if( verde_azul <= 87.8063 )
							if( azul_mean <= 85.4677 )
								if( stoc <= 85.0328 )
									ret := 0.250000
								if( stoc > 85.0328 )
									ret := -0.200000
							if( azul_mean > 85.4677 )
								ret := -0.800000 // sell
						if( verde_azul > 87.8063 )
							if( marron_mean <= 136.1 )
								if( pvimin <= -4.43977 )
									ret := 1.000000 // buy
								if( pvimin > -4.43977 )
									ret := 0.698630
							if( marron_mean > 136.1 )
								if( marron <= 133.652 )
									ret := -1.000000 // sell
								if( marron > 133.652 )
									ret := 0.600000
				if( verde_azul > 136.083 )
					if( marron_mean <= 137.434 )
						if( xrsi <= 75.6203 )
							if( pvi <= -3.64033 )
								if( marron_mean <= 114.892 )
									ret := -0.065421
								if( marron_mean > 114.892 )
									ret := -0.714286 // sell
							if( pvi > -3.64033 )
								if( media <= 71.4164 )
									ret := 0.083333
								if( media > 71.4164 )
									ret := -0.673469
						if( xrsi > 75.6203 )
							if( stoc <= 67.4355 )
								if( source <= 0.064876 )
									ret := 0.000000
								if( source > 0.064876 )
									ret := -0.777778 // sell
							if( stoc > 67.4355 )
								if( nvi_ema <= 5.17755 )
									ret := 0.452055
								if( nvi_ema > 5.17755 )
									ret := 0.122905
					if( marron_mean > 137.434 )
						if( nvi_ema <= 6.06301 )
							ret := -1.000000 // sell
						if( nvi_ema > 6.06301 )
							if( media <= 125.748 )
								ret := 0.000000
							if( media > 125.748 )
								ret := -0.500000
	
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
float op_operation = decision_tree_0_TRXUSDT_30Min_d532700f(nvimin, azul, nvim, marron_mean, marron, nvimax, pvi, pvi_ema, oscp, verde, source, stoc, verde_mean, xrsi, media, xmf, tprice, pvimin, media_azul, verde_media, BollOsc, pvimax, nvi_ema, azul_mean, pvim, nvi, verde_azul)

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


