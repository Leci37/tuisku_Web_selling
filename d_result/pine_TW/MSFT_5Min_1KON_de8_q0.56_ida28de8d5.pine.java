//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: MSFT_5Min_1KON_a28de8d5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_1KON_a28de8d5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_a28de8d5(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( verde <= 57.3581 )
		if( source <= 321.648 )
			if( azul_mean <= -59.8146 )
				if( xrsi <= 42.5029 )
					if( media <= 70.6218 )
						if( stoc <= 15.2801 )
							if( pvi <= 0.109647 )
								ret := 0.000000
							if( pvi > 0.109647 )
								if( pvimin <= 0.127483 )
									ret := 0.600000
								if( pvimin > 0.127483 )
									ret := 0.958333 // buy
						if( stoc > 15.2801 )
							ret := 1.000000 // buy
					if( media > 70.6218 )
						ret := 0.000000
				if( xrsi > 42.5029 )
					ret := -0.500000
			if( azul_mean > -59.8146 )
				if( xrsi <= 24.9343 )
					if( verde <= -63.0709 )
						if( media_azul <= 50.6519 )
							if( marron_mean <= -9.0165 )
								ret := 1.000000 // buy
							if( marron_mean > -9.0165 )
								if( verde_mean <= -71.9657 )
									ret := -0.933333 // sell
								if( verde_mean > -71.9657 )
									ret := -0.294118
						if( media_azul > 50.6519 )
							ret := 1.000000 // buy
					if( verde > -63.0709 )
						if( oscp <= -22.17 )
							if( pvi <= 0.091833 )
								if( oscp <= -35.5584 )
									ret := 0.555556
								if( oscp > -35.5584 )
									ret := 0.000000
							if( pvi > 0.091833 )
								if( pvimin <= 0.140468 )
									ret := 0.908046 // buy
								if( pvimin > 0.140468 )
									ret := 0.452381
						if( oscp > -22.17 )
							if( xrsi <= 23.7917 )
								if( stoc <= 6.40695 )
									ret := -0.800000 // sell
								if( stoc > 6.40695 )
									ret := 0.032258
							if( xrsi > 23.7917 )
								if( xmf <= 19.1223 )
									ret := 1.000000 // buy
								if( xmf > 19.1223 )
									ret := 0.166667
				if( xrsi > 24.9343 )
					if( media <= 28.0973 )
						if( pvimax <= 0.090856 )
							if( nvi <= 0.052248 )
								if( BollOsc <= -14.2283 )
									ret := 0.707692 // buy
								if( BollOsc > -14.2283 )
									ret := -0.166667
							if( nvi > 0.052248 )
								if( azul <= -1.5596 )
									ret := 0.052632
								if( azul > -1.5596 )
									ret := -0.250000
						if( pvimax > 0.090856 )
							if( oscp <= -10.826 )
								if( tprice <= 308.117 )
									ret := 0.178082
								if( tprice > 308.117 )
									ret := -0.387833
							if( oscp > -10.826 )
								if( azul_mean <= -40.232 )
									ret := -0.500000
								if( azul_mean > -40.232 )
									ret := 0.272727
					if( media > 28.0973 )
						if( verde_azul <= 19.312 )
							if( xmf <= 61.9418 )
								if( xmf <= 56.4541 )
									ret := 0.306554
								if( xmf > 56.4541 )
									ret := -0.250000
							if( xmf > 61.9418 )
								if( verde_media <= -37.2864 )
									ret := 0.955556 // buy
								if( verde_media > -37.2864 )
									ret := 0.576923
						if( verde_azul > 19.312 )
							if( pvi_ema <= 0.059279 )
								if( media <= 59.803 )
									ret := -0.020000
								if( media > 59.803 )
									ret := -0.790698 // sell
							if( pvi_ema > 0.059279 )
								if( nvi <= -0.045231 )
									ret := 0.545455
								if( nvi > -0.045231 )
									ret := 0.119248
		if( source > 321.648 )
			if( marron_mean <= 64.4885 )
				if( xmf <= 31.4247 )
					if( nvimin <= -0.006175 )
						if( xrsi <= 12.9955 )
							if( azul_mean <= -20.6489 )
								if( stoc <= 11.7009 )
									ret := 0.428571
								if( stoc > 11.7009 )
									ret := -0.666667
							if( azul_mean > -20.6489 )
								if( pvim <= 0.434944 )
									ret := -0.921053 // sell
								if( pvim > 0.434944 )
									ret := -0.571429
						if( xrsi > 12.9955 )
							if( tprice <= 368.929 )
								if( media <= 28.8328 )
									ret := 0.244156
								if( media > 28.8328 )
									ret := 0.000000
							if( tprice > 368.929 )
								if( nvi_ema <= -0.042829 )
									ret := -0.533333
								if( nvi_ema > -0.042829 )
									ret := -0.002331
					if( nvimin > -0.006175 )
						if( pvimin <= 0.086553 )
							if( media <= 32.3057 )
								if( verde_azul <= -42.2803 )
									ret := -0.142857
								if( verde_azul > -42.2803 )
									ret := -0.965517 // sell
							if( media > 32.3057 )
								if( verde_azul <= 3.46626 )
									ret := 0.250000
								if( verde_azul > 3.46626 )
									ret := -0.142857
						if( pvimin > 0.086553 )
							if( verde_media <= -74.8431 )
								if( media <= 57.4205 )
									ret := 0.193775
								if( media > 57.4205 )
									ret := 0.573864
							if( verde_media > -74.8431 )
								if( azul <= 53.4659 )
									ret := 0.124982
								if( azul > 53.4659 )
									ret := -0.223602
				if( xmf > 31.4247 )
					if( verde_mean <= 4.02815 )
						if( azul_mean <= 30.0527 )
							if( verde_mean <= -64.5758 )
								if( source <= 405.833 )
									ret := -0.208333
								if( source > 405.833 )
									ret := -0.774648 // sell
							if( verde_mean > -64.5758 )
								if( verde_media <= -77.4568 )
									ret := 0.324503
								if( verde_media > -77.4568 )
									ret := -0.061963
						if( azul_mean > 30.0527 )
							if( nvi <= 0.015701 )
								if( marron_mean <= 34.8037 )
									ret := 0.032520
								if( marron_mean > 34.8037 )
									ret := -0.521739
							if( nvi > 0.015701 )
								if( stoc <= 49.043 )
									ret := -0.626794
								if( stoc > 49.043 )
									ret := 0.428571
					if( verde_mean > 4.02815 )
						if( media_azul <= 52.6786 )
							if( verde_azul <= -63.8783 )
								if( nvi_ema <= 0.015732 )
									ret := -0.090909
								if( nvi_ema > 0.015732 )
									ret := -0.825000 // sell
							if( verde_azul > -63.8783 )
								if( nvimax <= 0.092287 )
									ret := 0.107758
								if( nvimax > 0.092287 )
									ret := -0.087045
						if( media_azul > 52.6786 )
							if( verde_mean <= 51.885 )
								if( nvi <= 0.020701 )
									ret := 0.035714
								if( nvi > 0.020701 )
									ret := -0.137014
							if( verde_mean > 51.885 )
								if( media <= 42.2614 )
									ret := -0.342593
								if( media > 42.2614 )
									ret := 0.131512
			if( marron_mean > 64.4885 )
				if( media_azul <= 55.0455 )
					if( BollOsc <= 20.5824 )
						if( xmf <= 64.8259 )
							if( xrsi <= 54.5818 )
								if( stoc <= 53.095 )
									ret := 0.207407
								if( stoc > 53.095 )
									ret := -0.233216
							if( xrsi > 54.5818 )
								if( tprice <= 410.56 )
									ret := 0.727273 // buy
								if( tprice > 410.56 )
									ret := 0.074074
						if( xmf > 64.8259 )
							if( verde_media <= -12.7754 )
								if( nvi <= 0.08158 )
									ret := 0.895833 // buy
								if( nvi > 0.08158 )
									ret := 0.142857
							if( verde_media > -12.7754 )
								if( marron_mean <= 66.7792 )
									ret := -0.800000 // sell
								if( marron_mean > 66.7792 )
									ret := 0.272727
					if( BollOsc > 20.5824 )
						if( media <= 74.7946 )
							if( verde_azul <= -33.2758 )
								if( verde_media <= -32.2736 )
									ret := 0.200000
								if( verde_media > -32.2736 )
									ret := 1.000000 // buy
							if( verde_azul > -33.2758 )
								if( media_azul <= 28.1444 )
									ret := -1.000000 // sell
								if( media_azul > 28.1444 )
									ret := 0.153846
						if( media > 74.7946 )
							if( nvi_ema <= -0.017458 )
								if( pvim <= 0.325906 )
									ret := -0.500000
								if( pvim > 0.325906 )
									ret := 0.400000
							if( nvi_ema > -0.017458 )
								if( marron <= 79.4121 )
									ret := -0.400000
								if( marron > 79.4121 )
									ret := -0.966667 // sell
				if( media_azul > 55.0455 )
					if( azul <= 5.57726 )
						if( pvimin <= 0.358609 )
							if( verde_azul <= 13.065 )
								if( nvim <= -0.030998 )
									ret := 0.750000 // buy
								if( nvim > -0.030998 )
									ret := -0.500000
							if( verde_azul > 13.065 )
								if( verde <= 42.2843 )
									ret := 0.217918
								if( verde > 42.2843 )
									ret := 0.023460
						if( pvimin > 0.358609 )
							if( nvimax <= 0.005968 )
								if( verde_media <= -45.3806 )
									ret := 0.461538
								if( verde_media > -45.3806 )
									ret := -0.028571
							if( nvimax > 0.005968 )
								if( azul_mean <= 12.2517 )
									ret := 0.434579
								if( azul_mean > 12.2517 )
									ret := -0.476190
					if( azul > 5.57726 )
						if( nvimin <= 0.015115 )
							if( azul_mean <= 0.679618 )
								if( azul <= 6.9729 )
									ret := -1.000000 // sell
								if( azul > 6.9729 )
									ret := 0.000000
							if( azul_mean > 0.679618 )
								if( verde_azul <= 42.7946 )
									ret := 0.635802
								if( verde_azul > 42.7946 )
									ret := 0.235294
						if( nvimin > 0.015115 )
							if( azul_mean <= 13.6613 )
								if( xmf <= 56.4858 )
									ret := 0.325926
								if( xmf > 56.4858 )
									ret := 0.728814 // buy
							if( azul_mean > 13.6613 )
								if( azul <= 17.6863 )
									ret := -0.338235
								if( azul > 17.6863 )
									ret := 0.275862
	if( verde > 57.3581 )
		if( media_azul <= 107.946 )
			if( stoc <= 37.6151 )
				if( marron <= 51.699 )
					if( verde_mean <= 81.6154 )
						if( media <= 39.06 )
							if( source <= 421.674 )
								if( oscp <= 52.8272 )
									ret := 0.353293
								if( oscp > 52.8272 )
									ret := -0.470588
							if( source > 421.674 )
								if( media_azul <= 71.475 )
									ret := -0.156250
								if( media_azul > 71.475 )
									ret := -1.000000 // sell
						if( media > 39.06 )
							if( tprice <= 409.427 )
								if( media_azul <= 41.9212 )
									ret := 0.666667
								if( media_azul > 41.9212 )
									ret := -0.419355
							if( tprice > 409.427 )
								if( oscp <= 13.7693 )
									ret := 0.566667
								if( oscp > 13.7693 )
									ret := -0.243243
					if( verde_mean > 81.6154 )
						if( nvi <= -0.004719 )
							if( verde_mean <= 82.5293 )
								ret := 0.500000
							if( verde_mean > 82.5293 )
								if( xrsi <= 44.8644 )
									ret := 0.000000
								if( xrsi > 44.8644 )
									ret := -0.250000
						if( nvi > -0.004719 )
							if( tprice <= 334.254 )
								ret := 1.000000 // buy
							if( tprice > 334.254 )
								if( verde <= 82.1263 )
									ret := 0.000000
								if( verde > 82.1263 )
									ret := 0.700000 // buy
				if( marron > 51.699 )
					if( verde <= 116.07 )
						if( verde_azul <= 67.6295 )
							if( BollOsc <= 5.95975 )
								if( verde_azul <= 40.9679 )
									ret := -0.586207
								if( verde_azul > 40.9679 )
									ret := -0.132812
							if( BollOsc > 5.95975 )
								if( source <= 421.267 )
									ret := -0.304762
								if( source > 421.267 )
									ret := -0.866667 // sell
						if( verde_azul > 67.6295 )
							if( BollOsc <= -4.04411 )
								if( tprice <= 412.725 )
									ret := -0.287719
								if( tprice > 412.725 )
									ret := 0.147368
							if( BollOsc > -4.04411 )
								if( verde <= 104.919 )
									ret := -0.021053
								if( verde > 104.919 )
									ret := 0.444444
					if( verde > 116.07 )
						if( BollOsc <= 28.9325 )
							if( xrsi <= 49.9442 )
								ret := 0.000000
							if( xrsi > 49.9442 )
								if( stoc <= 35.7589 )
									ret := -0.959184 // sell
								if( stoc > 35.7589 )
									ret := -0.400000
						if( BollOsc > 28.9325 )
							if( pvim <= 0.167713 )
								if( verde <= 134.644 )
									ret := -0.750000 // sell
								if( verde > 134.644 )
									ret := 0.529412
							if( pvim > 0.167713 )
								if( verde_media <= 126.945 )
									ret := -0.678571
								if( verde_media > 126.945 )
									ret := 0.333333
			if( stoc > 37.6151 )
				if( media <= 56.1847 )
					if( azul_mean <= -18.76 )
						if( azul_mean <= -35.4294 )
							if( marron <= 46.3312 )
								if( azul_mean <= -58.0039 )
									ret := -0.500000
								if( azul_mean > -58.0039 )
									ret := 1.000000 // buy
							if( marron > 46.3312 )
								if( verde_media <= 70.5798 )
									ret := -0.250000
								if( verde_media > 70.5798 )
									ret := 0.461538
						if( azul_mean > -35.4294 )
							if( pvimax <= 0.384803 )
								if( media <= 42.5849 )
									ret := -0.229885
								if( media > 42.5849 )
									ret := -0.669767
							if( pvimax > 0.384803 )
								if( xmf <= 67.4961 )
									ret := -0.500000
								if( xmf > 67.4961 )
									ret := 0.880000 // buy
					if( azul_mean > -18.76 )
						if( xrsi <= 62.2295 )
							if( marron_mean <= 54.1002 )
								if( oscp <= 3.6707 )
									ret := 0.215227
								if( oscp > 3.6707 )
									ret := -0.009886
							if( marron_mean > 54.1002 )
								if( media_azul <= 59.2192 )
									ret := 0.216856
								if( media_azul > 59.2192 )
									ret := 0.013263
						if( xrsi > 62.2295 )
							if( media_azul <= 43.9451 )
								if( azul <= 69.5132 )
									ret := -0.388060
								if( azul > 69.5132 )
									ret := 0.195122
							if( media_azul > 43.9451 )
								if( marron_mean <= 47.0651 )
									ret := 1.000000 // buy
								if( marron_mean > 47.0651 )
									ret := 0.089888
				if( media > 56.1847 )
					if( nvi_ema <= 0.026955 )
						if( nvim <= 0.026968 )
							if( stoc <= 91.023 )
								if( pvimin <= 0.224311 )
									ret := -0.010786
								if( pvimin > 0.224311 )
									ret := 0.061760
							if( stoc > 91.023 )
								if( media <= 89.0447 )
									ret := 0.083805
								if( media > 89.0447 )
									ret := -0.164581
						if( nvim > 0.026968 )
							if( media <= 92.5867 )
								if( azul <= 31.6584 )
									ret := 0.740741 // buy
								if( azul > 31.6584 )
									ret := -0.272727
							if( media > 92.5867 )
								if( media <= 95.739 )
									ret := -0.571429
								if( media > 95.739 )
									ret := 0.125000
					if( nvi_ema > 0.026955 )
						if( pvimax <= 0.358749 )
							if( media <= 67.0389 )
								if( BollOsc <= 10.7022 )
									ret := -0.134615
								if( BollOsc > 10.7022 )
									ret := 0.237437
							if( media > 67.0389 )
								if( nvi <= 0.095609 )
									ret := -0.075857
								if( nvi > 0.095609 )
									ret := 0.179083
						if( pvimax > 0.358749 )
							if( stoc <= 56.1612 )
								if( azul_mean <= 8.2595 )
									ret := -0.310811
								if( azul_mean > 8.2595 )
									ret := -0.867647 // sell
							if( stoc > 56.1612 )
								if( BollOsc <= 49.9056 )
									ret := -0.079341
								if( BollOsc > 49.9056 )
									ret := -0.354839
		if( media_azul > 107.946 )
			if( media <= 87.5673 )
				if( oscp <= 49.6477 )
					if( azul <= -94.9113 )
						if( nvimax <= 0.011059 )
							if( verde_mean <= 135.568 )
								if( verde_media <= 26.5467 )
									ret := 0.000000
								if( verde_media > 26.5467 )
									ret := 0.681818
							if( verde_mean > 135.568 )
								ret := -1.000000 // sell
						if( nvimax > 0.011059 )
							if( pvimax <= 0.173108 )
								ret := 0.571429
							if( pvimax > 0.173108 )
								if( pvim <= 0.452755 )
									ret := -0.961538 // sell
								if( pvim > 0.452755 )
									ret := 0.000000
					if( azul > -94.9113 )
						if( marron <= 80.8363 )
							if( verde_mean <= 103.75 )
								if( source <= 423.705 )
									ret := 0.213033
								if( source > 423.705 )
									ret := 0.630631
							if( verde_mean > 103.75 )
								if( verde_mean <= 162.665 )
									ret := 0.639706
								if( verde_mean > 162.665 )
									ret := -0.500000
						if( marron > 80.8363 )
							if( tprice <= 333.854 )
								if( BollOsc <= 21.894 )
									ret := -0.538462
								if( BollOsc > 21.894 )
									ret := 0.572650
							if( tprice > 333.854 )
								if( pvi <= 0.248807 )
									ret := -0.611111
								if( pvi > 0.248807 )
									ret := 0.095506
				if( oscp > 49.6477 )
					if( xrsi <= 54.5308 )
						if( BollOsc <= -42.0667 )
							ret := 1.000000 // buy
						if( BollOsc > -42.0667 )
							if( media_azul <= 195.377 )
								if( media_azul <= 120.384 )
									ret := 0.000000
								if( media_azul > 120.384 )
									ret := -0.762712 // sell
							if( media_azul > 195.377 )
								if( tprice <= 392.317 )
									ret := 0.750000 // buy
								if( tprice > 392.317 )
									ret := -0.166667
					if( xrsi > 54.5308 )
						if( azul <= -61.5141 )
							if( xmf <= 46.0321 )
								ret := -0.666667
							if( xmf > 46.0321 )
								if( nvim <= 0.014937 )
									ret := 0.903226 // buy
								if( nvim > 0.014937 )
									ret := 0.133333
						if( azul > -61.5141 )
							if( verde_mean <= 124.05 )
								if( nvim <= -0.013566 )
									ret := 0.000000
								if( nvim > -0.013566 )
									ret := -0.900000 // sell
							if( verde_mean > 124.05 )
								if( oscp <= 140.295 )
									ret := 0.115942
								if( oscp > 140.295 )
									ret := -1.000000 // sell
			if( media > 87.5673 )
				if( source <= 294.955 )
					if( media <= 98.0977 )
						if( stoc <= 80.9387 )
							ret := 0.666667
						if( stoc > 80.9387 )
							ret := 1.000000 // buy
					if( media > 98.0977 )
						ret := 0.250000
				if( source > 294.955 )
					if( pvimin <= 0.435703 )
						if( marron_mean <= 99.8741 )
							if( media_azul <= 192.102 )
								if( nvimax <= 0.041548 )
									ret := -0.226287
								if( nvimax > 0.041548 )
									ret := 0.186335
							if( media_azul > 192.102 )
								if( oscp <= 15.5333 )
									ret := -0.250000
								if( oscp > 15.5333 )
									ret := 1.000000 // buy
						if( marron_mean > 99.8741 )
							if( BollOsc <= 67.1997 )
								if( media_azul <= 164.851 )
									ret := 0.064220
								if( media_azul > 164.851 )
									ret := 0.450549
							if( BollOsc > 67.1997 )
								if( azul <= -28.3323 )
									ret := -1.000000 // sell
								if( azul > -28.3323 )
									ret := -0.125000
					if( pvimin > 0.435703 )
						if( BollOsc <= 52.2644 )
							if( source <= 455.01 )
								if( verde_media <= -9.66175 )
									ret := 0.806452 // buy
								if( verde_media > -9.66175 )
									ret := 0.435644
							if( source > 455.01 )
								if( media_azul <= 111.288 )
									ret := -0.250000
								if( media_azul > 111.288 )
									ret := 0.000000
						if( BollOsc > 52.2644 )
							if( BollOsc <= 61.2028 )
								if( media_azul <= 113.337 )
									ret := 0.250000
								if( media_azul > 113.337 )
									ret := -0.125000
							if( BollOsc > 61.2028 )
								ret := -0.800000 // sell
	
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
float op_operation = decision_tree_0_MSFT_5Min_a28de8d5(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


