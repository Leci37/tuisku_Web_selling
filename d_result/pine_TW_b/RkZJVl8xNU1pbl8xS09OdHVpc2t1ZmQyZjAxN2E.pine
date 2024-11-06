//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: FFIV_15Min_1KON_fd2f017a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_15Min_1KON_fd2f017a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_15Min_fd2f017a(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( tprice <= 144.292 )
		if( pvimax <= 0.698817 )
			if( azul_mean <= -52.5313 )
				if( xmf <= 10.2171 )
					if( media <= 6.27288 )
						ret := -0.500000
					if( media > 6.27288 )
						ret := -1.000000 // sell
				if( xmf > 10.2171 )
					if( stoc <= 6.74618 )
						if( verde_media <= 8.09686 )
							if( nvim <= -0.295783 )
								if( nvimax <= -0.452425 )
									ret := 0.200000
								if( nvimax > -0.452425 )
									ret := 1.000000 // buy
							if( nvim > -0.295783 )
								ret := -0.750000 // sell
						if( verde_media > 8.09686 )
							ret := 1.000000 // buy
					if( stoc > 6.74618 )
						if( verde_azul <= 183.716 )
							if( oscp <= -65.9357 )
								if( media <= 15.51 )
									ret := 0.750000 // buy
								if( media > 15.51 )
									ret := 1.000000 // buy
							if( oscp > -65.9357 )
								if( source <= 136.665 )
									ret := -0.507389
								if( source > 136.665 )
									ret := -0.092593
						if( verde_azul > 183.716 )
							if( oscp <= 34.4561 )
								ret := 1.000000 // buy
							if( oscp > 34.4561 )
								if( xrsi <= 54.4835 )
									ret := 0.000000
								if( xrsi > 54.4835 )
									ret := 0.666667
			if( azul_mean > -52.5313 )
				if( pvim <= 0.668023 )
					if( nvimax <= -0.646696 )
						if( BollOsc <= 48.3349 )
							if( nvimin <= -0.889845 )
								if( pvi_ema <= 0.637001 )
									ret := -0.625000
								if( pvi_ema > 0.637001 )
									ret := 0.628571
							if( nvimin > -0.889845 )
								if( verde_media <= 18.2262 )
									ret := 0.545455
								if( verde_media > 18.2262 )
									ret := 0.104651
						if( BollOsc > 48.3349 )
							if( BollOsc <= 77.1555 )
								if( xrsi <= 64.0475 )
									ret := -0.250000
								if( xrsi > 64.0475 )
									ret := -0.902439 // sell
							if( BollOsc > 77.1555 )
								ret := 0.333333
					if( nvimax > -0.646696 )
						if( nvimin <= -0.695358 )
							if( nvim <= -0.750449 )
								if( verde_media <= -21.3276 )
									ret := -0.500000
								if( verde_media > -21.3276 )
									ret := 0.666667
							if( nvim > -0.750449 )
								if( nvi_ema <= -0.648713 )
									ret := -0.758065 // sell
								if( nvi_ema > -0.648713 )
									ret := 0.500000
						if( nvimin > -0.695358 )
							if( media <= 2.94058 )
								if( verde_azul <= -18.0334 )
									ret := 0.183333
								if( verde_azul > -18.0334 )
									ret := 0.683168
							if( media > 2.94058 )
								if( BollOsc <= 51.0484 )
									ret := 0.087601
								if( BollOsc > 51.0484 )
									ret := -0.027569
				if( pvim > 0.668023 )
					if( nvim <= -0.692844 )
						if( pvimin <= 0.646055 )
							if( oscp <= -21.1533 )
								if( oscp <= -32.5955 )
									ret := -1.000000 // sell
								if( oscp > -32.5955 )
									ret := -0.250000
							if( oscp > -21.1533 )
								if( azul <= -19.9234 )
									ret := -0.750000 // sell
								if( azul > -19.9234 )
									ret := -1.000000 // sell
						if( pvimin > 0.646055 )
							ret := 0.000000
					if( nvim > -0.692844 )
						if( tprice <= 123.702 )
							if( azul_mean <= -0.658213 )
								if( verde <= 37.3024 )
									ret := 0.857143 // buy
								if( verde > 37.3024 )
									ret := -0.500000
							if( azul_mean > -0.658213 )
								ret := 1.000000 // buy
						if( tprice > 123.702 )
							if( verde_media <= 22.8625 )
								if( verde_azul <= -33.9099 )
									ret := 0.653846
								if( verde_azul > -33.9099 )
									ret := -0.050147
							if( verde_media > 22.8625 )
								if( pvimin <= 0.668073 )
									ret := -0.538462
								if( pvimin > 0.668073 )
									ret := 0.190476
		if( pvimax > 0.698817 )
			if( BollOsc <= 7.99651 )
				if( verde_azul <= -22.1045 )
					if( verde <= -47.9185 )
						if( media_azul <= 58.7929 )
							if( oscp <= -33.698 )
								if( marron_mean <= -17.0667 )
									ret := -0.400000
								if( marron_mean > -17.0667 )
									ret := 0.793103 // buy
							if( oscp > -33.698 )
								ret := -0.800000 // sell
						if( media_azul > 58.7929 )
							if( azul_mean <= -37.4687 )
								if( verde_azul <= -49.9282 )
									ret := -0.500000
								if( verde_azul > -49.9282 )
									ret := 0.857143 // buy
							if( azul_mean > -37.4687 )
								if( nvimax <= -0.545689 )
									ret := -0.500000
								if( nvimax > -0.545689 )
									ret := -1.000000 // sell
					if( verde > -47.9185 )
						if( azul_mean <= 4.05498 )
							if( pvim <= 0.792501 )
								if( xrsi <= 15.7637 )
									ret := 0.250000
								if( xrsi > 15.7637 )
									ret := -0.905405 // sell
							if( pvim > 0.792501 )
								if( verde_mean <= -24.1638 )
									ret := 0.291667
								if( verde_mean > -24.1638 )
									ret := -0.560976
						if( azul_mean > 4.05498 )
							if( verde <= -14.7712 )
								if( marron_mean <= -1.66068 )
									ret := -1.000000 // sell
								if( marron_mean > -1.66068 )
									ret := 0.545455
							if( verde > -14.7712 )
								if( azul_mean <= 25.3236 )
									ret := -0.920000 // sell
								if( azul_mean > 25.3236 )
									ret := 0.500000
				if( verde_azul > -22.1045 )
					if( stoc <= 9.60202 )
						if( verde <= 35.5272 )
							if( oscp <= -0.762612 )
								if( azul_mean <= -45.3792 )
									ret := -0.187500
								if( azul_mean > -45.3792 )
									ret := 0.684466
							if( oscp > -0.762612 )
								if( pvi_ema <= 0.902124 )
									ret := -0.750000 // sell
								if( pvi_ema > 0.902124 )
									ret := -0.076923
						if( verde > 35.5272 )
							ret := -1.000000 // sell
					if( stoc > 9.60202 )
						if( media <= 14.8942 )
							if( verde <= 7.50804 )
								if( verde_media <= -20.1466 )
									ret := -0.409091
								if( verde_media > -20.1466 )
									ret := 0.207547
							if( verde > 7.50804 )
								if( pvi <= 0.750411 )
									ret := 0.000000
								if( pvi > 0.750411 )
									ret := -0.830769 // sell
						if( media > 14.8942 )
							if( verde_mean <= 13.7723 )
								if( azul <= 8.95008 )
									ret := 0.421466
								if( azul > 8.95008 )
									ret := -0.177419
							if( verde_mean > 13.7723 )
								if( verde_media <= 26.8614 )
									ret := 0.017173
								if( verde_media > 26.8614 )
									ret := 0.572368
			if( BollOsc > 7.99651 )
				if( pvimin <= 0.74865 )
					if( xrsi <= 58.3967 )
						if( marron <= 70.1991 )
							if( verde_azul <= 86.474 )
								if( BollOsc <= 21.6789 )
									ret := 0.750000 // buy
								if( BollOsc > 21.6789 )
									ret := -0.500000
							if( verde_azul > 86.474 )
								ret := -0.800000 // sell
						if( marron > 70.1991 )
							if( nvimin <= -0.476903 )
								if( verde <= 111.392 )
									ret := 0.956522 // buy
								if( verde > 111.392 )
									ret := 0.250000
							if( nvimin > -0.476903 )
								ret := 0.000000
					if( xrsi > 58.3967 )
						if( verde_mean <= 48.9586 )
							if( pvimin <= 0.698515 )
								ret := -0.500000
							if( pvimin > 0.698515 )
								ret := -1.000000 // sell
						if( verde_mean > 48.9586 )
							if( marron <= 114.115 )
								if( media <= 102.036 )
									ret := 0.424242
								if( media > 102.036 )
									ret := -0.179487
							if( marron > 114.115 )
								if( marron_mean <= 87.7081 )
									ret := -0.333333
								if( marron_mean > 87.7081 )
									ret := 0.704082 // buy
				if( pvimin > 0.74865 )
					if( oscp <= 31.1149 )
						if( stoc <= 87.3023 )
							if( nvimin <= -0.578154 )
								if( verde_media <= 7.44577 )
									ret := 0.152709
								if( verde_media > 7.44577 )
									ret := 0.521277
							if( nvimin > -0.578154 )
								if( pvimax <= 0.927798 )
									ret := 0.230366
								if( pvimax > 0.927798 )
									ret := -0.463415
						if( stoc > 87.3023 )
							if( xmf <= 85.0408 )
								if( tprice <= 140.13 )
									ret := -0.310345
								if( tprice > 140.13 )
									ret := 0.066225
							if( xmf > 85.0408 )
								if( nvim <= -0.577616 )
									ret := 0.318182
								if( nvim > -0.577616 )
									ret := 0.869565 // buy
					if( oscp > 31.1149 )
						if( verde_media <= 132.278 )
							if( media_azul <= 64.4341 )
								if( xmf <= 51.1452 )
									ret := -0.300000
								if( xmf > 51.1452 )
									ret := -0.857143 // sell
							if( media_azul > 64.4341 )
								if( verde_azul <= 122.882 )
									ret := -1.000000 // sell
								if( verde_azul > 122.882 )
									ret := 0.064516
						if( verde_media > 132.278 )
							ret := 0.800000 // buy
	if( tprice > 144.292 )
		if( xrsi <= 70.1568 )
			if( verde_media <= -132.865 )
				if( nvimin <= -0.320445 )
					if( marron_mean <= 49.1821 )
						if( pvi <= 0.719689 )
							if( oscp <= -93.6193 )
								if( verde_mean <= -47.5865 )
									ret := -0.250000
								if( verde_mean > -47.5865 )
									ret := -1.000000 // sell
							if( oscp > -93.6193 )
								ret := 0.600000
						if( pvi > 0.719689 )
							if( pvi <= 1.00807 )
								if( BollOsc <= -61.1803 )
									ret := -1.000000 // sell
								if( BollOsc > -61.1803 )
									ret := -0.857143 // sell
							if( pvi > 1.00807 )
								if( verde_media <= -173.148 )
									ret := -0.750000 // sell
								if( verde_media > -173.148 )
									ret := -0.250000
					if( marron_mean > 49.1821 )
						if( verde <= -80.3444 )
							if( verde_mean <= 29.8003 )
								ret := 0.000000
							if( verde_mean > 29.8003 )
								ret := 1.000000 // buy
						if( verde > -80.3444 )
							ret := -1.000000 // sell
				if( nvimin > -0.320445 )
					if( media_azul <= 70.1179 )
						if( media_azul <= 50.6704 )
							if( verde_media <= -135.739 )
								if( xrsi <= 13.5205 )
									ret := -0.833333 // sell
								if( xrsi > 13.5205 )
									ret := 0.320000
							if( verde_media > -135.739 )
								if( nvim <= -0.233946 )
									ret := -1.000000 // sell
								if( nvim > -0.233946 )
									ret := -0.750000 // sell
						if( media_azul > 50.6704 )
							if( azul <= 0.848693 )
								ret := 1.000000 // buy
							if( azul > 0.848693 )
								if( verde_media <= -139.131 )
									ret := -0.400000
								if( verde_media > -139.131 )
									ret := 1.000000 // buy
					if( media_azul > 70.1179 )
						if( oscp <= -95.6826 )
							if( pvim <= 0.479669 )
								ret := -0.250000
							if( pvim > 0.479669 )
								if( pvi_ema <= 0.651451 )
									ret := -1.000000 // sell
								if( pvi_ema > 0.651451 )
									ret := -0.500000
						if( oscp > -95.6826 )
							ret := 0.400000
			if( verde_media > -132.865 )
				if( azul_mean <= -57.9054 )
					if( media <= 20.7314 )
						if( pvi_ema <= 0.984264 )
							if( stoc <= 6.04041 )
								if( media_azul <= 56.0835 )
									ret := 0.714286 // buy
								if( media_azul > 56.0835 )
									ret := 0.000000
							if( stoc > 6.04041 )
								if( BollOsc <= -64.2043 )
									ret := 0.363636
								if( BollOsc > -64.2043 )
									ret := -0.576923
						if( pvi_ema > 0.984264 )
							if( oscp <= 58.5169 )
								if( xrsi <= 20.2698 )
									ret := 1.000000 // buy
								if( xrsi > 20.2698 )
									ret := 0.250000
							if( oscp > 58.5169 )
								ret := -0.333333
					if( media > 20.7314 )
						if( azul <= -41.8753 )
							if( pvimax <= 0.418005 )
								if( nvimin <= -0.080753 )
									ret := 0.784615 // buy
								if( nvimin > -0.080753 )
									ret := 0.250000
							if( pvimax > 0.418005 )
								if( tprice <= 145.842 )
									ret := -0.857143 // sell
								if( tprice > 145.842 )
									ret := 0.353896
						if( azul > -41.8753 )
							if( verde_media <= -3.31835 )
								if( xrsi <= 24.7621 )
									ret := 1.000000 // buy
								if( xrsi > 24.7621 )
									ret := 0.100000
							if( verde_media > -3.31835 )
								if( nvi <= -0.329159 )
									ret := -0.125000
								if( nvi > -0.329159 )
									ret := -0.812500 // sell
				if( azul_mean > -57.9054 )
					if( marron <= -9.03825 )
						if( media_azul <= 73.3588 )
							if( tprice <= 181.181 )
								if( tprice <= 156.567 )
									ret := 0.523179
								if( tprice > 156.567 )
									ret := 0.027650
							if( tprice > 181.181 )
								if( verde_mean <= 37.7718 )
									ret := 0.633721
								if( verde_mean > 37.7718 )
									ret := -0.800000 // sell
						if( media_azul > 73.3588 )
							if( pvim <= 0.912082 )
								if( stoc <= 39.9164 )
									ret := -0.560748
								if( stoc > 39.9164 )
									ret := 1.000000 // buy
							if( pvim > 0.912082 )
								if( xmf <= 16.9446 )
									ret := 0.741935 // buy
								if( xmf > 16.9446 )
									ret := -0.222222
					if( marron > -9.03825 )
						if( azul_mean <= 35.6075 )
							if( source <= 162.13 )
								if( verde <= 91.0779 )
									ret := -0.046916
								if( verde > 91.0779 )
									ret := 0.084387
							if( source > 162.13 )
								if( verde_media <= -39.2929 )
									ret := 0.130160
								if( verde_media > -39.2929 )
									ret := 0.031597
						if( azul_mean > 35.6075 )
							if( pvi <= 0.395041 )
								if( nvimax <= -0.238338 )
									ret := 0.142857
								if( nvimax > -0.238338 )
									ret := 0.666667
							if( pvi > 0.395041 )
								if( verde_azul <= -43.0593 )
									ret := -0.403509
								if( verde_azul > -43.0593 )
									ret := 0.170213
		if( xrsi > 70.1568 )
			if( BollOsc <= 55.7118 )
				if( xrsi <= 88.648 )
					if( azul <= -1.86939 )
						if( stoc <= 64.0316 )
							if( azul <= -24.3066 )
								ret := 1.000000 // buy
							if( azul > -24.3066 )
								if( media_azul <= 116.176 )
									ret := 0.000000
								if( media_azul > 116.176 )
									ret := 0.250000
						if( stoc > 64.0316 )
							if( marron_mean <= 90.465 )
								if( BollOsc <= 38.7585 )
									ret := -0.200000
								if( BollOsc > 38.7585 )
									ret := 0.888889 // buy
							if( marron_mean > 90.465 )
								if( nvim <= -0.549647 )
									ret := -0.733333 // sell
								if( nvim > -0.549647 )
									ret := -0.266376
					if( azul > -1.86939 )
						if( verde_azul <= 109.45 )
							if( nvi <= -0.407499 )
								if( xrsi <= 82.2832 )
									ret := -0.026316
								if( xrsi > 82.2832 )
									ret := 0.493333
							if( nvi > -0.407499 )
								if( marron_mean <= 106.82 )
									ret := -0.118932
								if( marron_mean > 106.82 )
									ret := -0.419913
						if( verde_azul > 109.45 )
							if( nvimin <= -0.552312 )
								if( pvimin <= 0.89477 )
									ret := -0.550562
								if( pvimin > 0.89477 )
									ret := -0.020115
							if( nvimin > -0.552312 )
								if( verde_media <= 34.5836 )
									ret := 0.261398
								if( verde_media > 34.5836 )
									ret := -0.025510
				if( xrsi > 88.648 )
					if( verde_media <= 21.094 )
						if( verde_azul <= 126.719 )
							if( media_azul <= 101.749 )
								ret := -0.250000
							if( media_azul > 101.749 )
								ret := 0.000000
						if( verde_azul > 126.719 )
							ret := -1.000000 // sell
					if( verde_media > 21.094 )
						if( source <= 165.382 )
							if( pvimax <= 0.389789 )
								ret := 0.000000
							if( pvimax > 0.389789 )
								if( tprice <= 156.36 )
									ret := 0.972973 // buy
								if( tprice > 156.36 )
									ret := 0.600000
						if( source > 165.382 )
							ret := 0.000000
			if( BollOsc > 55.7118 )
				if( marron_mean <= 114.932 )
					if( xmf <= 65.1749 )
						if( source <= 164.49 )
							if( source <= 155.617 )
								if( azul_mean <= 69.9511 )
									ret := -0.149660
								if( azul_mean > 69.9511 )
									ret := 1.000000 // buy
							if( source > 155.617 )
								if( azul <= 10.0323 )
									ret := -0.700000 // sell
								if( azul > 10.0323 )
									ret := 0.661017
						if( source > 164.49 )
							if( azul_mean <= 100.453 )
								if( azul_mean <= 25.7893 )
									ret := -0.340659
								if( azul_mean > 25.7893 )
									ret := 0.034884
							if( azul_mean > 100.453 )
								if( verde_mean <= 116.351 )
									ret := -1.000000 // sell
								if( verde_mean > 116.351 )
									ret := -0.600000
					if( xmf > 65.1749 )
						if( oscp <= 3.44786 )
							if( pvimax <= 0.901861 )
								if( stoc <= 79.0918 )
									ret := -0.444444
								if( stoc > 79.0918 )
									ret := 0.761905 // buy
							if( pvimax > 0.901861 )
								if( verde_azul <= 101.22 )
									ret := -0.789474 // sell
								if( verde_azul > 101.22 )
									ret := 1.000000 // buy
						if( oscp > 3.44786 )
							if( xmf <= 92.3478 )
								if( xrsi <= 71.7723 )
									ret := -0.155844
								if( xrsi > 71.7723 )
									ret := -0.483680
							if( xmf > 92.3478 )
								if( BollOsc <= 61.4944 )
									ret := -0.333333
								if( BollOsc > 61.4944 )
									ret := 0.529412
				if( marron_mean > 114.932 )
					if( azul <= 64.8462 )
						if( azul_mean <= 36.2649 )
							if( nvi_ema <= -0.146485 )
								if( stoc <= 90.808 )
									ret := 0.436548
								if( stoc > 90.808 )
									ret := -0.139785
							if( nvi_ema > -0.146485 )
								if( verde_media <= 48.9829 )
									ret := 0.000000
								if( verde_media > 48.9829 )
									ret := -0.866667 // sell
						if( azul_mean > 36.2649 )
							if( pvimin <= 1.09265 )
								if( azul <= 46.7225 )
									ret := -0.720930 // sell
								if( azul > 46.7225 )
									ret := 0.000000
							if( pvimin > 1.09265 )
								if( verde <= 154.467 )
									ret := 1.000000 // buy
								if( verde > 154.467 )
									ret := 0.000000
					if( azul > 64.8462 )
						if( oscp <= 13.6457 )
							if( pvim <= 0.927933 )
								if( pvim <= 0.737973 )
									ret := 0.583333
								if( pvim > 0.737973 )
									ret := -0.100000
							if( pvim > 0.927933 )
								ret := -1.000000 // sell
						if( oscp > 13.6457 )
							if( xrsi <= 84.4407 )
								ret := -0.142857
							if( xrsi > 84.4407 )
								if( tprice <= 160.944 )
									ret := -0.500000
								if( tprice > 160.944 )
									ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_FFIV_15Min_fd2f017a(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


