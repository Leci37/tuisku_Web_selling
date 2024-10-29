//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: GME_1Min_1KON_6f21ef84 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_1Min_1KON_6f21ef84", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_1Min_6f21ef84(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( stoc <= 15.5295 )
		if( media <= 20.2341 )
			if( azul_mean <= -12.7142 )
				if( pvimin <= 2.23609 )
					if( oscp <= -14.4348 )
						if( stoc <= 3.16051 )
							if( pvi <= 1.71602 )
								if( azul <= -39.4899 )
									ret := 0.750000 // buy
								if( azul > -39.4899 )
									ret := -0.066667
							if( pvi > 1.71602 )
								if( azul_mean <= -25.9075 )
									ret := -1.000000 // sell
								if( azul_mean > -25.9075 )
									ret := -0.750000 // sell
						if( stoc > 3.16051 )
							if( nvimax <= 0.94134 )
								if( marron_mean <= 0.16762 )
									ret := 0.483461
								if( marron_mean > 0.16762 )
									ret := 0.698473
							if( nvimax > 0.94134 )
								if( stoc <= 9.57739 )
									ret := 0.366667
								if( stoc > 9.57739 )
									ret := -0.208333
					if( oscp > -14.4348 )
						if( BollOsc <= -41.4303 )
							if( stoc <= 10.3195 )
								if( verde_mean <= -22.6461 )
									ret := 0.735294 // buy
								if( verde_mean > -22.6461 )
									ret := 0.170213
							if( stoc > 10.3195 )
								if( nvi <= -0.526549 )
									ret := 0.714286 // buy
								if( nvi > -0.526549 )
									ret := -0.320513
						if( BollOsc > -41.4303 )
							if( xrsi <= 36.0514 )
								if( verde <= -3.89821 )
									ret := 0.081633
								if( verde > -3.89821 )
									ret := 0.560000
							if( xrsi > 36.0514 )
								if( oscp <= -0.011996 )
									ret := 0.428571
								if( oscp > -0.011996 )
									ret := -0.523810
				if( pvimin > 2.23609 )
					if( verde <= -30.6801 )
						if( nvi_ema <= -0.398324 )
							if( verde_azul <= 28.1286 )
								if( tprice <= 44.8687 )
									ret := -0.800000 // sell
								if( tprice > 44.8687 )
									ret := 0.500000
							if( verde_azul > 28.1286 )
								if( media <= 7.12766 )
									ret := 1.000000 // buy
								if( media > 7.12766 )
									ret := 0.500000
						if( nvi_ema > -0.398324 )
							if( marron <= -13.6503 )
								ret := 0.000000
							if( marron > -13.6503 )
								if( pvimax <= 2.32959 )
									ret := -0.750000 // sell
								if( pvimax > 2.32959 )
									ret := -0.978723 // sell
					if( verde > -30.6801 )
						if( media_azul <= 83.0931 )
							if( verde_mean <= -7.70652 )
								if( tprice <= 30.0404 )
									ret := -0.150000
								if( tprice > 30.0404 )
									ret := 0.884615 // buy
							if( verde_mean > -7.70652 )
								if( BollOsc <= -43.6978 )
									ret := 0.750000 // buy
								if( BollOsc > -43.6978 )
									ret := 1.000000 // buy
						if( media_azul > 83.0931 )
							ret := -1.000000 // sell
			if( azul_mean > -12.7142 )
				if( pvimax <= 2.30386 )
					if( nvimin <= 0.644859 )
						if( pvimax <= 1.68133 )
							if( verde_azul <= -59.5019 )
								if( nvim <= 0.628274 )
									ret := -0.500000
								if( nvim > 0.628274 )
									ret := 0.375000
							if( verde_azul > -59.5019 )
								if( oscp <= -21.5697 )
									ret := 0.569395
								if( oscp > -21.5697 )
									ret := 0.232673
						if( pvimax > 1.68133 )
							if( marron <= -14.9661 )
								if( azul <= -5.55084 )
									ret := 0.900000 // buy
								if( azul > -5.55084 )
									ret := 0.192308
							if( marron > -14.9661 )
								if( xrsi <= 17.3882 )
									ret := 0.439024
								if( xrsi > 17.3882 )
									ret := 0.000000
					if( nvimin > 0.644859 )
						if( pvimax <= 1.28717 )
							if( xmf <= 27.9837 )
								if( media <= 10.1755 )
									ret := 0.325758
								if( media > 10.1755 )
									ret := -0.052863
							if( xmf > 27.9837 )
								if( tprice <= 20.156 )
									ret := 0.080000
								if( tprice > 20.156 )
									ret := 0.660377
						if( pvimax > 1.28717 )
							if( nvi <= 0.88968 )
								if( source <= 24.0584 )
									ret := 0.038760
								if( source > 24.0584 )
									ret := -0.631579
							if( nvi > 0.88968 )
								if( verde_azul <= -3.82476 )
									ret := -0.807692 // sell
								if( verde_azul > -3.82476 )
									ret := 0.714286 // buy
				if( pvimax > 2.30386 )
					if( marron <= -23.9352 )
						ret := -1.000000 // sell
					if( marron > -23.9352 )
						if( azul_mean <= -2.13945 )
							if( pvimin <= 2.33336 )
								if( pvi <= 2.24172 )
									ret := -0.666667
								if( pvi > 2.24172 )
									ret := 0.923077 // buy
							if( pvimin > 2.33336 )
								if( azul_mean <= -9.75476 )
									ret := 0.647059
								if( azul_mean > -9.75476 )
									ret := -0.400000
						if( azul_mean > -2.13945 )
							if( media <= 15.356 )
								if( xrsi <= 27.6582 )
									ret := 0.939850 // buy
								if( xrsi > 27.6582 )
									ret := 0.227273
							if( media > 15.356 )
								if( azul_mean <= 7.94676 )
									ret := 0.210526
								if( azul_mean > 7.94676 )
									ret := 0.844444 // buy
		if( media > 20.2341 )
			if( BollOsc <= -68.2516 )
				if( nvimin <= 0.495846 )
					if( BollOsc <= -86.6254 )
						if( azul <= -14.8916 )
							ret := 0.000000
						if( azul > -14.8916 )
							ret := -1.000000 // sell
					if( BollOsc > -86.6254 )
						if( marron_mean <= 11.2539 )
							if( marron <= -25.7249 )
								ret := -0.500000
							if( marron > -25.7249 )
								if( azul_mean <= 4.04809 )
									ret := 0.821053 // buy
								if( azul_mean > 4.04809 )
									ret := 0.125000
						if( marron_mean > 11.2539 )
							if( xmf <= 25.211 )
								if( pvi <= 2.05432 )
									ret := -0.451613
								if( pvi > 2.05432 )
									ret := 1.000000 // buy
							if( xmf > 25.211 )
								if( marron_mean <= 37.7475 )
									ret := 0.604938
								if( marron_mean > 37.7475 )
									ret := -0.800000 // sell
				if( nvimin > 0.495846 )
					if( pvimin <= 1.13204 )
						if( marron_mean <= 14.1573 )
							if( xrsi <= 27.769 )
								if( media_azul <= 25.5057 )
									ret := 0.500000
								if( media_azul > 25.5057 )
									ret := 1.000000 // buy
							if( xrsi > 27.769 )
								ret := 0.200000
						if( marron_mean > 14.1573 )
							if( xrsi <= 22.635 )
								ret := -0.750000 // sell
							if( xrsi > 22.635 )
								if( xrsi <= 26.1384 )
									ret := 0.800000 // buy
								if( xrsi > 26.1384 )
									ret := 0.166667
					if( pvimin > 1.13204 )
						if( verde_azul <= -50.8773 )
							if( media <= 38.1184 )
								if( pvi_ema <= 1.56303 )
									ret := -1.000000 // sell
								if( pvi_ema > 1.56303 )
									ret := -0.750000 // sell
							if( media > 38.1184 )
								if( marron <= -8.97207 )
									ret := -0.500000
								if( marron > -8.97207 )
									ret := 0.750000 // buy
						if( verde_azul > -50.8773 )
							if( media_azul <= 52.3255 )
								if( verde <= -45.3177 )
									ret := 0.916667 // buy
								if( verde > -45.3177 )
									ret := 0.130435
							if( media_azul > 52.3255 )
								if( tprice <= 22.6329 )
									ret := -0.035714
								if( tprice > 22.6329 )
									ret := -0.611111
			if( BollOsc > -68.2516 )
				if( verde_azul <= 33.7522 )
					if( nvimin <= 0.299758 )
						if( verde_media <= -17.7816 )
							if( tprice <= 30.2237 )
								if( pvim <= 1.89834 )
									ret := 0.163624
								if( pvim > 1.89834 )
									ret := 0.412141
							if( tprice > 30.2237 )
								if( marron_mean <= 23.7166 )
									ret := -0.245211
								if( marron_mean > 23.7166 )
									ret := 0.353535
						if( verde_media > -17.7816 )
							if( xrsi <= 42.187 )
								if( pvimin <= 2.5936 )
									ret := -0.223496
								if( pvimin > 2.5936 )
									ret := 0.687500
							if( xrsi > 42.187 )
								if( media_azul <= 16.4295 )
									ret := -0.555556
								if( media_azul > 16.4295 )
									ret := 0.478873
					if( nvimin > 0.299758 )
						if( xmf <= 30.3817 )
							if( verde <= -38.9176 )
								if( verde <= -77.7025 )
									ret := 0.325000
								if( verde > -77.7025 )
									ret := -0.272340
							if( verde > -38.9176 )
								if( oscp <= -30.8311 )
									ret := 0.297436
								if( oscp > -30.8311 )
									ret := -0.035807
						if( xmf > 30.3817 )
							if( azul_mean <= -10.6835 )
								if( verde_mean <= 1.81702 )
									ret := 0.242718
								if( verde_mean > 1.81702 )
									ret := -0.122807
							if( azul_mean > -10.6835 )
								if( azul <= -2.25615 )
									ret := 0.260870
								if( azul > -2.25615 )
									ret := 0.063910
				if( verde_azul > 33.7522 )
					if( verde <= 3.43525 )
						if( azul <= -76.4441 )
							if( source <= 21.6418 )
								if( pvimax <= 0.197578 )
									ret := -0.500000
								if( pvimax > 0.197578 )
									ret := 0.000000
							if( source > 21.6418 )
								if( pvimax <= 1.7881 )
									ret := 1.000000 // buy
								if( pvimax > 1.7881 )
									ret := 0.250000
						if( azul > -76.4441 )
							if( xrsi <= 31.5007 )
								if( source <= 20.8129 )
									ret := -0.851852 // sell
								if( source > 20.8129 )
									ret := -0.069767
							if( xrsi > 31.5007 )
								if( media <= 45.3383 )
									ret := -0.892857 // sell
								if( media > 45.3383 )
									ret := -0.200000
					if( verde > 3.43525 )
						if( oscp <= -1.60272 )
							if( media_azul <= 112.525 )
								if( media <= 22.9941 )
									ret := 0.571429
								if( media > 22.9941 )
									ret := -0.236585
							if( media_azul > 112.525 )
								if( azul_mean <= -49.1367 )
									ret := 0.750000 // buy
								if( azul_mean > -49.1367 )
									ret := 1.000000 // buy
						if( oscp > -1.60272 )
							if( nvimax <= -0.379804 )
								if( media <= 32.0214 )
									ret := 0.500000
								if( media > 32.0214 )
									ret := -0.364486
							if( nvimax > -0.379804 )
								if( azul_mean <= -117.671 )
									ret := -1.000000 // sell
								if( azul_mean > -117.671 )
									ret := 0.154806
	if( stoc > 15.5295 )
		if( tprice <= 22.1396 )
			if( nvi <= 0.644957 )
				if( media <= 108.386 )
					if( pvi <= 1.28716 )
						if( BollOsc <= 53.6677 )
							if( BollOsc <= -35.0258 )
								if( source <= 20.6469 )
									ret := 0.208531
								if( source > 20.6469 )
									ret := -0.733333 // sell
							if( BollOsc > -35.0258 )
								if( tprice <= 15.9411 )
									ret := 0.075207
								if( tprice > 15.9411 )
									ret := -0.021125
						if( BollOsc > 53.6677 )
							if( xrsi <= 63.241 )
								if( media <= 58.972 )
									ret := 0.500000
								if( media > 58.972 )
									ret := -0.659091
							if( xrsi > 63.241 )
								if( verde_media <= 210.232 )
									ret := 0.308307
								if( verde_media > 210.232 )
									ret := -0.736842 // sell
					if( pvi > 1.28716 )
						if( xmf <= 61.931 )
							if( oscp <= 21.5453 )
								if( azul_mean <= -11.65 )
									ret := 0.043478
								if( azul_mean > -11.65 )
									ret := 0.175308
							if( oscp > 21.5453 )
								if( azul <= -123.218 )
									ret := -1.000000 // sell
								if( azul > -123.218 )
									ret := 0.440994
						if( xmf > 61.931 )
							if( media_azul <= 122.376 )
								if( marron_mean <= 123.189 )
									ret := 0.003300
								if( marron_mean > 123.189 )
									ret := 0.690141
							if( media_azul > 122.376 )
								if( oscp <= 91.674 )
									ret := 0.442953
								if( oscp > 91.674 )
									ret := -0.545455
				if( media > 108.386 )
					if( pvi <= 0.907432 )
						if( nvi_ema <= -0.266006 )
							if( marron_mean <= 107.796 )
								if( media_azul <= 126.696 )
									ret := -0.875000 // sell
								if( media_azul > 126.696 )
									ret := 0.600000
							if( marron_mean > 107.796 )
								if( verde_mean <= 160.672 )
									ret := 0.872642 // buy
								if( verde_mean > 160.672 )
									ret := -0.285714
						if( nvi_ema > -0.266006 )
							if( marron_mean <= 101.26 )
								ret := -1.000000 // sell
							if( marron_mean > 101.26 )
								if( xmf <= 85.0824 )
									ret := 0.529412
								if( xmf > 85.0824 )
									ret := 0.000000
					if( pvi > 0.907432 )
						if( stoc <= 89.3091 )
							if( verde_mean <= 147.949 )
								if( verde_media <= 8.6185 )
									ret := -0.195652
								if( verde_media > 8.6185 )
									ret := 0.873418 // buy
							if( verde_mean > 147.949 )
								if( media <= 114.245 )
									ret := 0.214286
								if( media > 114.245 )
									ret := -0.645161
						if( stoc > 89.3091 )
							if( BollOsc <= 48.695 )
								if( azul_mean <= 45.6598 )
									ret := -0.760000 // sell
								if( azul_mean > 45.6598 )
									ret := 0.500000
							if( BollOsc > 48.695 )
								if( verde_mean <= 154.057 )
									ret := 0.650000
								if( verde_mean > 154.057 )
									ret := -0.454545
			if( nvi > 0.644957 )
				if( verde <= 195.173 )
					if( media_azul <= -30.7493 )
						if( verde_azul <= -64.6091 )
							if( pvimax <= 1.13589 )
								if( nvim <= 1.24863 )
									ret := -0.041667
								if( nvim > 1.24863 )
									ret := -0.500000
							if( pvimax > 1.13589 )
								if( BollOsc <= -54.4566 )
									ret := 0.250000
								if( BollOsc > -54.4566 )
									ret := -0.818182 // sell
						if( verde_azul > -64.6091 )
							if( verde_azul <= -19.1763 )
								if( azul <= 85.5577 )
									ret := -0.017241
								if( azul > 85.5577 )
									ret := 0.600000
							if( verde_azul > -19.1763 )
								if( verde_media <= 31.9312 )
									ret := -0.647059
								if( verde_media > 31.9312 )
									ret := 0.000000
					if( media_azul > -30.7493 )
						if( verde <= -77.1052 )
							if( xmf <= 28.0652 )
								if( nvi_ema <= 0.648524 )
									ret := 0.000000
								if( nvi_ema > 0.648524 )
									ret := 0.818182 // buy
							if( xmf > 28.0652 )
								if( nvimin <= 1.04439 )
									ret := 0.333333
								if( nvimin > 1.04439 )
									ret := -0.166667
						if( verde > -77.1052 )
							if( BollOsc <= -96.825 )
								ret := -1.000000 // sell
							if( BollOsc > -96.825 )
								if( stoc <= 84.0606 )
									ret := 0.046306
								if( stoc > 84.0606 )
									ret := -0.028270
				if( verde > 195.173 )
					if( oscp <= 173.9 )
						if( media_azul <= 19.6623 )
							ret := 0.600000
						if( media_azul > 19.6623 )
							if( BollOsc <= 49.4464 )
								if( marron_mean <= 104.375 )
									ret := 0.000000
								if( marron_mean > 104.375 )
									ret := 0.400000
							if( BollOsc > 49.4464 )
								if( BollOsc <= 69.101 )
									ret := -0.661538
								if( BollOsc > 69.101 )
									ret := -0.277778
					if( oscp > 173.9 )
						ret := 0.833333 // buy
		if( tprice > 22.1396 )
			if( pvimin <= 2.70481 )
				if( xrsi <= 76.2922 )
					if( pvi_ema <= 2.73011 )
						if( media <= 103.241 )
							if( oscp <= 54.9865 )
								if( verde_azul <= 133.003 )
									ret := 0.019987
								if( verde_azul > 133.003 )
									ret := 0.123576
							if( oscp > 54.9865 )
								if( azul_mean <= -29.4178 )
									ret := 0.036585
								if( azul_mean > -29.4178 )
									ret := -0.288889
						if( media > 103.241 )
							if( tprice <= 27.8506 )
								if( pvi_ema <= 1.43558 )
									ret := 0.029167
								if( pvi_ema > 1.43558 )
									ret := -0.437396
							if( tprice > 27.8506 )
								if( xrsi <= 63.8778 )
									ret := 0.523256
								if( xrsi > 63.8778 )
									ret := -0.078652
					if( pvi_ema > 2.73011 )
						if( source <= 39.366 )
							if( verde_azul <= 90.0998 )
								if( azul <= 3.43616 )
									ret := -0.179487
								if( azul > 3.43616 )
									ret := 0.585366
							if( verde_azul > 90.0998 )
								if( verde_media <= 3.93012 )
									ret := 0.111111
								if( verde_media > 3.93012 )
									ret := -1.000000 // sell
						if( source > 39.366 )
							if( azul_mean <= 15.6699 )
								if( media_azul <= 36.4283 )
									ret := -0.872549 // sell
								if( media_azul > 36.4283 )
									ret := -0.445255
							if( azul_mean > 15.6699 )
								if( BollOsc <= 11.1514 )
									ret := 0.909091 // buy
								if( BollOsc > 11.1514 )
									ret := 0.000000
				if( xrsi > 76.2922 )
					if( nvim <= -0.372554 )
						if( media <= 116.384 )
							if( azul_mean <= -49.1861 )
								if( verde_mean <= 201.723 )
									ret := 0.947368 // buy
								if( verde_mean > 201.723 )
									ret := -1.000000 // sell
							if( azul_mean > -49.1861 )
								if( marron <= 110.68 )
									ret := -0.733333 // sell
								if( marron > 110.68 )
									ret := 0.021008
						if( media > 116.384 )
							if( xmf <= 92.1177 )
								if( azul <= -33.2679 )
									ret := -0.857143 // sell
								if( azul > -33.2679 )
									ret := 0.754902 // buy
							if( xmf > 92.1177 )
								if( pvim <= 1.73667 )
									ret := 0.600000
								if( pvim > 1.73667 )
									ret := -0.909091 // sell
					if( nvim > -0.372554 )
						if( media_azul <= 182.714 )
							if( verde_azul <= 130.39 )
								if( marron_mean <= 117.447 )
									ret := -0.184953
								if( marron_mean > 117.447 )
									ret := -0.685185
							if( verde_azul > 130.39 )
								if( verde_mean <= 235.386 )
									ret := -0.126984
								if( verde_mean > 235.386 )
									ret := -0.796610 // sell
						if( media_azul > 182.714 )
							if( verde_media <= 40.3389 )
								if( media <= 118.486 )
									ret := -0.250000
								if( media > 118.486 )
									ret := -1.000000 // sell
							if( verde_media > 40.3389 )
								if( pvim <= 2.17109 )
									ret := 0.974359 // buy
								if( pvim > 2.17109 )
									ret := 0.000000
			if( pvimin > 2.70481 )
				if( verde_mean <= 151.814 )
					if( nvi <= -0.406639 )
						if( pvimax <= 3.19041 )
							if( media <= 112.198 )
								if( marron_mean <= 23.9498 )
									ret := -0.183824
								if( marron_mean > 23.9498 )
									ret := 0.213080
							if( media > 112.198 )
								if( xmf <= 70.5029 )
									ret := -1.000000 // sell
								if( xmf > 70.5029 )
									ret := -0.230769
						if( pvimax > 3.19041 )
							if( pvimax <= 3.2439 )
								if( media <= 118.095 )
									ret := 0.584906
								if( media > 118.095 )
									ret := -1.000000 // sell
							if( pvimax > 3.2439 )
								if( stoc <= 39.7179 )
									ret := 0.000000
								if( stoc > 39.7179 )
									ret := 0.958333 // buy
					if( nvi > -0.406639 )
						if( pvim <= 3.24068 )
							if( pvimax <= 3.2803 )
								if( azul_mean <= -0.994128 )
									ret := -0.795455 // sell
								if( azul_mean > -0.994128 )
									ret := 0.006667
							if( pvimax > 3.2803 )
								if( verde_mean <= 79.9336 )
									ret := 0.820513 // buy
								if( verde_mean > 79.9336 )
									ret := -0.375000
						if( pvim > 3.24068 )
							if( BollOsc <= 42.9477 )
								if( stoc <= 38.0541 )
									ret := -0.666667
								if( stoc > 38.0541 )
									ret := -0.972973 // sell
							if( BollOsc > 42.9477 )
								ret := -0.400000
				if( verde_mean > 151.814 )
					if( nvi_ema <= -0.653819 )
						if( BollOsc <= 60.6466 )
							ret := 0.200000
						if( BollOsc > 60.6466 )
							ret := -0.666667
					if( nvi_ema > -0.653819 )
						if( verde_mean <= 238.188 )
							if( azul <= 44.8594 )
								if( marron <= 134.506 )
									ret := 0.974026 // buy
								if( marron > 134.506 )
									ret := 0.714286 // buy
							if( azul > 44.8594 )
								ret := 0.428571
						if( verde_mean > 238.188 )
							ret := -0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_GME_1Min_6f21ef84(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


