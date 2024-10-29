//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: ATOMUSDT_15Min_1KON_e2ffdf5b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_15Min_1KON_e2ffdf5b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_15Min_e2ffdf5b(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( marron <= 31.1065 )
		if( tprice <= 7.40748 )
			if( verde_azul <= -81.9516 )
				if( verde_media <= -160.759 )
					if( marron_mean <= 3.53002 )
						if( marron <= -20.4544 )
							if( xmf <= 9.50605 )
								ret := 0.200000
							if( xmf > 9.50605 )
								ret := 1.000000 // buy
						if( marron > -20.4544 )
							ret := -0.500000
					if( marron_mean > 3.53002 )
						if( source <= 7.00476 )
							if( source <= 6.27372 )
								if( media <= 42.273 )
									ret := -0.750000 // sell
								if( media > 42.273 )
									ret := -1.000000 // sell
							if( source > 6.27372 )
								ret := -0.571429
						if( source > 7.00476 )
							if( nvimax <= 0.798323 )
								ret := -0.200000
							if( nvimax > 0.798323 )
								ret := 0.500000
				if( verde_media > -160.759 )
					if( pvi <= -1.23549 )
						if( xmf <= 14.0839 )
							if( verde_mean <= -40.5047 )
								if( verde_azul <= -106.087 )
									ret := -0.333333
								if( verde_azul > -106.087 )
									ret := 0.636364
							if( verde_mean > -40.5047 )
								ret := -1.000000 // sell
						if( xmf > 14.0839 )
							if( xrsi <= 29.5904 )
								if( marron_mean <= -14.8828 )
									ret := -0.400000
								if( marron_mean > -14.8828 )
									ret := 0.737705 // buy
							if( xrsi > 29.5904 )
								if( media_azul <= -95.65 )
									ret := 1.000000 // buy
								if( media_azul > -95.65 )
									ret := -0.090909
					if( pvi > -1.23549 )
						if( BollOsc <= -61.343 )
							if( media <= 22.1472 )
								if( tprice <= 6.7015 )
									ret := -0.250000
								if( tprice > 6.7015 )
									ret := 0.142857
							if( media > 22.1472 )
								if( marron_mean <= -1.14406 )
									ret := 1.000000 // buy
								if( marron_mean > -1.14406 )
									ret := 0.142857
						if( BollOsc > -61.343 )
							if( verde_mean <= -19.6639 )
								if( nvimin <= 0.742228 )
									ret := 0.000000
								if( nvimin > 0.742228 )
									ret := -0.250000
							if( verde_mean > -19.6639 )
								if( BollOsc <= -52.3106 )
									ret := -1.000000 // sell
								if( BollOsc > -52.3106 )
									ret := -0.142857
			if( verde_azul > -81.9516 )
				if( azul <= -15.7967 )
					if( marron <= -6.64098 )
						if( xmf <= 28.3423 )
							if( stoc <= 19.1156 )
								if( tprice <= 5.99031 )
									ret := 0.724138 // buy
								if( tprice > 5.99031 )
									ret := 0.373626
							if( stoc > 19.1156 )
								if( BollOsc <= -61.5649 )
									ret := 0.030303
								if( BollOsc > -61.5649 )
									ret := 0.833333 // buy
						if( xmf > 28.3423 )
							if( source <= 4.32403 )
								ret := -1.000000 // sell
							if( source > 4.32403 )
								ret := 0.000000
					if( marron > -6.64098 )
						if( verde_media <= 14.8847 )
							if( pvi_ema <= -0.789645 )
								if( pvimax <= -1.04882 )
									ret := 0.040604
								if( pvimax > -1.04882 )
									ret := 0.602273
							if( pvi_ema > -0.789645 )
								if( source <= 6.60833 )
									ret := 0.555556
								if( source > 6.60833 )
									ret := -0.620690
						if( verde_media > 14.8847 )
							if( media_azul <= 39.737 )
								if( marron <= 28.0719 )
									ret := -0.500000
								if( marron > 28.0719 )
									ret := -1.000000 // sell
							if( media_azul > 39.737 )
								ret := 0.200000
				if( azul > -15.7967 )
					if( xrsi <= 24.8897 )
						if( xmf <= 26.3202 )
							if( media_azul <= 17.9167 )
								if( media_azul <= -21.0468 )
									ret := -0.652174
								if( media_azul > -21.0468 )
									ret := 0.050000
							if( media_azul > 17.9167 )
								if( verde_media <= -52.591 )
									ret := -0.559140
								if( verde_media > -52.591 )
									ret := -0.046154
						if( xmf > 26.3202 )
							if( pvi_ema <= -0.870804 )
								if( pvim <= -1.22088 )
									ret := -0.471831
								if( pvim > -1.22088 )
									ret := 0.214286
							if( pvi_ema > -0.870804 )
								if( verde_media <= -23.3269 )
									ret := -0.969697 // sell
								if( verde_media > -23.3269 )
									ret := -0.250000
					if( xrsi > 24.8897 )
						if( azul_mean <= 7.10836 )
							if( verde_media <= -24.123 )
								if( media <= 19.8184 )
									ret := -0.464567
								if( media > 19.8184 )
									ret := -0.067164
							if( verde_media > -24.123 )
								if( tprice <= 6.60259 )
									ret := 0.126316
								if( tprice > 6.60259 )
									ret := -0.125731
						if( azul_mean > 7.10836 )
							if( media_azul <= 54.2619 )
								if( azul_mean <= 20.3459 )
									ret := 0.278752
								if( azul_mean > 20.3459 )
									ret := 0.015094
							if( media_azul > 54.2619 )
								if( verde_mean <= 35.6326 )
									ret := -0.833333 // sell
								if( verde_mean > 35.6326 )
									ret := 0.100000
		if( tprice > 7.40748 )
			if( verde <= -33.7898 )
				if( nvimin <= 0.250258 )
					if( stoc <= 38.3727 )
						if( verde_media <= -159.177 )
							if( nvi_ema <= 0.192123 )
								if( azul <= -8.84737 )
									ret := 0.936170 // buy
								if( azul > -8.84737 )
									ret := 0.500000
							if( nvi_ema > 0.192123 )
								ret := -0.285714
						if( verde_media > -159.177 )
							if( media <= -2.79807 )
								if( media_azul <= 16.0347 )
									ret := 0.090909
								if( media_azul > 16.0347 )
									ret := 0.903226 // buy
							if( media > -2.79807 )
								if( nvi_ema <= -0.623994 )
									ret := -0.126904
								if( nvi_ema > -0.623994 )
									ret := 0.118234
					if( stoc > 38.3727 )
						if( verde_azul <= -127.273 )
							if( BollOsc <= -101.478 )
								ret := -0.500000
							if( BollOsc > -101.478 )
								ret := -1.000000 // sell
						if( verde_azul > -127.273 )
							if( pvim <= 0.206896 )
								if( marron_mean <= 29.4755 )
									ret := 0.857143 // buy
								if( marron_mean > 29.4755 )
									ret := -0.050000
							if( pvim > 0.206896 )
								if( marron <= 15.2576 )
									ret := -0.703704 // sell
								if( marron > 15.2576 )
									ret := 0.250000
				if( nvimin > 0.250258 )
					if( marron_mean <= 52.183 )
						if( verde_azul <= -127.886 )
							if( verde_mean <= -165.293 )
								ret := -0.200000
							if( verde_mean > -165.293 )
								if( xmf <= 36.4629 )
									ret := 0.710938 // buy
								if( xmf > 36.4629 )
									ret := -0.333333
						if( verde_azul > -127.886 )
							if( oscp <= -93.7067 )
								if( azul_mean <= 0.855736 )
									ret := -0.447368
								if( azul_mean > 0.855736 )
									ret := 0.166667
							if( oscp > -93.7067 )
								if( azul_mean <= 69.6942 )
									ret := 0.337321
								if( azul_mean > 69.6942 )
									ret := -0.800000 // sell
					if( marron_mean > 52.183 )
						if( verde_media <= -88.0593 )
							if( azul_mean <= 22.5475 )
								if( oscp <= -62.1715 )
									ret := -0.961538 // sell
								if( oscp > -62.1715 )
									ret := -0.500000
							if( azul_mean > 22.5475 )
								ret := 0.500000
						if( verde_media > -88.0593 )
							ret := 1.000000 // buy
			if( verde > -33.7898 )
				if( verde_mean <= 36.4072 )
					if( azul_mean <= -55.7155 )
						if( verde_media <= -41.7132 )
							if( tprice <= 8.2178 )
								ret := 1.000000 // buy
							if( tprice > 8.2178 )
								if( verde_media <= -54.0237 )
									ret := 0.133333
								if( verde_media > -54.0237 )
									ret := -0.888889 // sell
						if( verde_media > -41.7132 )
							if( xmf <= 39.9027 )
								if( pvim <= -0.747918 )
									ret := 0.895833 // buy
								if( pvim > -0.747918 )
									ret := 0.468750
							if( xmf > 39.9027 )
								if( verde_azul <= 73.9035 )
									ret := -0.857143 // sell
								if( verde_azul > 73.9035 )
									ret := 0.111111
					if( azul_mean > -55.7155 )
						if( azul_mean <= 90.4182 )
							if( azul <= 52.7898 )
								if( marron_mean <= 1.4425 )
									ret := -0.003981
								if( marron_mean > 1.4425 )
									ret := 0.098260
							if( azul > 52.7898 )
								if( verde_azul <= -121.152 )
									ret := -0.500000
								if( verde_azul > -121.152 )
									ret := 0.363057
						if( azul_mean > 90.4182 )
							if( media <= 15.7929 )
								if( verde_azul <= -103.479 )
									ret := -0.500000
								if( verde_azul > -103.479 )
									ret := 1.000000 // buy
							if( media > 15.7929 )
								if( pvimax <= -1.60431 )
									ret := -0.333333
								if( pvimax > -1.60431 )
									ret := -0.950000 // sell
				if( verde_mean > 36.4072 )
					if( marron_mean <= 31.2563 )
						if( azul <= -32.4912 )
							if( source <= 8.77683 )
								ret := 0.000000
							if( source > 8.77683 )
								if( source <= 12.2938 )
									ret := -0.956522 // sell
								if( source > 12.2938 )
									ret := -0.500000
						if( azul > -32.4912 )
							if( verde_mean <= 38.208 )
								ret := 0.500000
							if( verde_mean > 38.208 )
								ret := 0.000000
					if( marron_mean > 31.2563 )
						if( xrsi <= 43.9827 )
							if( nvimin <= -0.730385 )
								if( xmf <= 40.5575 )
									ret := -0.545455
								if( xmf > 40.5575 )
									ret := -1.000000 // sell
							if( nvimin > -0.730385 )
								if( xrsi <= 34.5145 )
									ret := 0.365591
								if( xrsi > 34.5145 )
									ret := 0.143478
						if( xrsi > 43.9827 )
							if( xmf <= 29.9651 )
								if( pvim <= -1.89239 )
									ret := -0.769231 // sell
								if( pvim > -1.89239 )
									ret := 0.318182
							if( xmf > 29.9651 )
								if( verde_media <= -36.9424 )
									ret := 0.733333 // buy
								if( verde_media > -36.9424 )
									ret := 0.378788
	if( marron > 31.1065 )
		if( source <= 12.5058 )
			if( marron_mean <= 77.8643 )
				if( nvi <= 2.74768 )
					if( azul <= -76.4891 )
						if( media <= 45.1042 )
							ret := 0.750000 // buy
						if( media > 45.1042 )
							if( nvim <= 1.74497 )
								if( verde_mean <= 92.9903 )
									ret := -0.910714 // sell
								if( verde_mean > 92.9903 )
									ret := -0.250000
							if( nvim > 1.74497 )
								ret := 0.166667
					if( azul > -76.4891 )
						if( marron <= 104.494 )
							if( BollOsc <= -31.9898 )
								if( verde_azul <= -28.8383 )
									ret := -0.545455
								if( verde_azul > -28.8383 )
									ret := 0.261682
							if( BollOsc > -31.9898 )
								if( azul_mean <= 81.7596 )
									ret := 0.033857
								if( azul_mean > 81.7596 )
									ret := -0.531646
						if( marron > 104.494 )
							if( verde_media <= 127.916 )
								if( verde_azul <= 129.703 )
									ret := -0.164706
								if( verde_azul > 129.703 )
									ret := -0.627273
							if( verde_media > 127.916 )
								if( verde <= 231.525 )
									ret := 0.882353 // buy
								if( verde > 231.525 )
									ret := -0.500000
				if( nvi > 2.74768 )
					if( azul_mean <= 44.1284 )
						if( pvimax <= -4.61018 )
							if( media_azul <= 64.4285 )
								if( azul <= -20.749 )
									ret := -0.800000 // sell
								if( azul > -20.749 )
									ret := -0.011152
							if( media_azul > 64.4285 )
								if( media <= 72.444 )
									ret := 0.070064
								if( media > 72.444 )
									ret := 0.385135
						if( pvimax > -4.61018 )
							if( oscp <= -35.7004 )
								if( azul <= 36.4181 )
									ret := 0.477612
								if( azul > 36.4181 )
									ret := -0.312500
							if( oscp > -35.7004 )
								if( tprice <= 9.2185 )
									ret := -0.066943
								if( tprice > 9.2185 )
									ret := -0.205882
					if( azul_mean > 44.1284 )
						if( verde <= 43.6699 )
							if( verde_azul <= -34.993 )
								if( oscp <= -12.0675 )
									ret := 0.030303
								if( oscp > -12.0675 )
									ret := 0.600000
							if( verde_azul > -34.993 )
								if( marron_mean <= 36.4913 )
									ret := 0.366667
								if( marron_mean > 36.4913 )
									ret := 0.864407 // buy
						if( verde > 43.6699 )
							if( marron_mean <= 46.8717 )
								if( xrsi <= 51.1739 )
									ret := -0.733333 // sell
								if( xrsi > 51.1739 )
									ret := -0.222222
							if( marron_mean > 46.8717 )
								if( xmf <= 72.3643 )
									ret := 0.266667
								if( xmf > 72.3643 )
									ret := -0.875000 // sell
			if( marron_mean > 77.8643 )
				if( marron <= 114.134 )
					if( verde_azul <= 161.637 )
						if( marron_mean <= 116.219 )
							if( verde_mean <= 144.449 )
								if( xmf <= 61.4697 )
									ret := 0.113764
								if( xmf > 61.4697 )
									ret := 0.059268
							if( verde_mean > 144.449 )
								if( source <= 6.73315 )
									ret := -0.134615
								if( source > 6.73315 )
									ret := 0.326437
						if( marron_mean > 116.219 )
							if( verde_azul <= 139.365 )
								if( verde_mean <= 154.139 )
									ret := 0.203804
								if( verde_mean > 154.139 )
									ret := 0.712871 // buy
							if( verde_azul > 139.365 )
								if( oscp <= 39.5818 )
									ret := -0.197917
								if( oscp > 39.5818 )
									ret := 0.590909
					if( verde_azul > 161.637 )
						if( nvimax <= -0.305017 )
							if( azul <= -72.1827 )
								if( pvi <= 0.294222 )
									ret := -0.733333 // sell
								if( pvi > 0.294222 )
									ret := 0.000000
							if( azul > -72.1827 )
								if( media_azul <= 130.191 )
									ret := 0.063830
								if( media_azul > 130.191 )
									ret := 0.619565
						if( nvimax > -0.305017 )
							if( source <= 9.77247 )
								if( BollOsc <= 22.2292 )
									ret := -0.620690
								if( BollOsc > 22.2292 )
									ret := 0.050000
							if( source > 9.77247 )
								if( azul_mean <= -67.9002 )
									ret := 0.684211
								if( azul_mean > -67.9002 )
									ret := -0.390313
				if( marron > 114.134 )
					if( BollOsc <= 72.0518 )
						if( verde_media <= 31.9056 )
							if( verde <= 135.835 )
								if( stoc <= 93.5801 )
									ret := -0.245383
								if( stoc > 93.5801 )
									ret := 0.320000
							if( verde > 135.835 )
								if( pvi <= -1.78048 )
									ret := -0.200000
								if( pvi > -1.78048 )
									ret := -0.620000
						if( verde_media > 31.9056 )
							if( media <= 92.0312 )
								if( verde <= 146.535 )
									ret := 0.026984
								if( verde > 146.535 )
									ret := -0.225700
							if( media > 92.0312 )
								if( verde_media <= 69.8307 )
									ret := -0.007864
								if( verde_media > 69.8307 )
									ret := 0.240557
					if( BollOsc > 72.0518 )
						if( verde_media <= 134.127 )
							if( media_azul <= 61.1107 )
								if( BollOsc <= 84.1293 )
									ret := 0.195122
								if( BollOsc > 84.1293 )
									ret := -0.500000
							if( media_azul > 61.1107 )
								if( marron_mean <= 117.328 )
									ret := 0.437888
								if( marron_mean > 117.328 )
									ret := -0.014493
						if( verde_media > 134.127 )
							if( verde_azul <= 288.262 )
								if( marron_mean <= 85.9639 )
									ret := 0.250000
								if( marron_mean > 85.9639 )
									ret := -0.772727 // sell
							if( verde_azul > 288.262 )
								if( xrsi <= 85.1022 )
									ret := 0.888889 // buy
								if( xrsi > 85.1022 )
									ret := -0.875000 // sell
		if( source > 12.5058 )
			if( media <= 48.716 )
				if( azul <= -2.34634 )
					if( azul_mean <= -18.4496 )
						if( media_azul <= 43.2026 )
							if( stoc <= 28.0994 )
								ret := 0.250000
							if( stoc > 28.0994 )
								if( azul <= -10.7421 )
									ret := 0.750000 // buy
								if( azul > -10.7421 )
									ret := 1.000000 // buy
						if( media_azul > 43.2026 )
							if( media_azul <= 80.0252 )
								if( xrsi <= 37.1289 )
									ret := 0.214286
								if( xrsi > 37.1289 )
									ret := -0.416667
							if( media_azul > 80.0252 )
								if( verde_mean <= 52.6971 )
									ret := -0.363636
								if( verde_mean > 52.6971 )
									ret := 0.640000
					if( azul_mean > -18.4496 )
						if( oscp <= -0.485923 )
							if( oscp <= -4.76105 )
								if( verde_azul <= 59.7479 )
									ret := 0.528571
								if( verde_azul > 59.7479 )
									ret := -0.750000 // sell
							if( oscp > -4.76105 )
								if( azul <= -7.32018 )
									ret := 0.134615
								if( azul > -7.32018 )
									ret := -0.533333
						if( oscp > -0.485923 )
							if( verde_media <= 11.8695 )
								if( source <= 15.8712 )
									ret := 0.702128 // buy
								if( source > 15.8712 )
									ret := 0.100000
							if( verde_media > 11.8695 )
								if( nvimax <= -0.375746 )
									ret := -0.038760
								if( nvimax > -0.375746 )
									ret := 0.533333
				if( azul > -2.34634 )
					if( azul_mean <= 10.1417 )
						if( oscp <= -2.16132 )
							if( marron_mean <= 29.7873 )
								if( media <= 36.3836 )
									ret := -0.467532
								if( media > 36.3836 )
									ret := 0.312500
							if( marron_mean > 29.7873 )
								if( azul_mean <= 6.47705 )
									ret := 0.448980
								if( azul_mean > 6.47705 )
									ret := -0.076087
						if( oscp > -2.16132 )
							if( verde_mean <= 59.7525 )
								if( media_azul <= 10.1422 )
									ret := -0.750000 // sell
								if( media_azul > 10.1422 )
									ret := -0.279070
							if( verde_mean > 59.7525 )
								if( tprice <= 12.8093 )
									ret := -0.416667
								if( tprice > 12.8093 )
									ret := 0.372881
					if( azul_mean > 10.1417 )
						if( azul <= 27.2838 )
							if( BollOsc <= -19.1452 )
								if( media <= 31.1531 )
									ret := 0.333333
								if( media > 31.1531 )
									ret := -0.288136
							if( BollOsc > -19.1452 )
								if( xrsi <= 59.2646 )
									ret := 0.339785
								if( xrsi > 59.2646 )
									ret := -0.769231 // sell
						if( azul > 27.2838 )
							if( xmf <= 60.4349 )
								if( verde_azul <= 20.1607 )
									ret := -0.081633
								if( verde_azul > 20.1607 )
									ret := -0.659091
							if( xmf > 60.4349 )
								if( pvimax <= 0.5735 )
									ret := 0.742857 // buy
								if( pvimax > 0.5735 )
									ret := -0.066667
			if( media > 48.716 )
				if( azul <= 92.0211 )
					if( verde_mean <= 155.462 )
						if( verde_mean <= 53.9014 )
							if( verde <= 31.9444 )
								if( verde_mean <= 22.3034 )
									ret := 0.390244
								if( verde_mean > 22.3034 )
									ret := -0.379808
							if( verde > 31.9444 )
								if( verde_media <= -27.8524 )
									ret := -0.317460
								if( verde_media > -27.8524 )
									ret := 0.214286
						if( verde_mean > 53.9014 )
							if( media_azul <= 79.9867 )
								if( tprice <= 13.8286 )
									ret := -0.140118
								if( tprice > 13.8286 )
									ret := -0.283672
							if( media_azul > 79.9867 )
								if( BollOsc <= 35.2061 )
									ret := -0.010606
								if( BollOsc > 35.2061 )
									ret := -0.165089
					if( verde_mean > 155.462 )
						if( azul_mean <= 43.6578 )
							if( BollOsc <= 69.8055 )
								if( marron <= 134.059 )
									ret := 0.531250
								if( marron > 134.059 )
									ret := -0.666667
							if( BollOsc > 69.8055 )
								if( pvimax <= 0.1937 )
									ret := 0.600000
								if( pvimax > 0.1937 )
									ret := -0.750000 // sell
						if( azul_mean > 43.6578 )
							if( azul_mean <= 73.2382 )
								if( pvim <= 0.422299 )
									ret := -1.000000 // sell
								if( pvim > 0.422299 )
									ret := -0.750000 // sell
							if( azul_mean > 73.2382 )
								ret := -0.166667
				if( azul > 92.0211 )
					if( nvimax <= -0.250493 )
						ret := -0.250000
					if( nvimax > -0.250493 )
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
float op_operation = decision_tree_0_ATOMUSDT_15Min_e2ffdf5b(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


