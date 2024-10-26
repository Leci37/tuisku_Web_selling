//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: LYFT_1Min_1KON_b558a3ae Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_1KON_b558a3ae", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_b558a3ae(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( stoc <= 81.6497 )
		if( BollOsc <= 11.0276 )
			if( BollOsc <= -46.5992 )
				if( nvimax <= 0.494644 )
					if( verde_media <= -23.1269 )
						if( verde_media <= -43.2544 )
							if( xrsi <= 31.6579 )
								if( media_azul <= 14.207 )
									ret := 0.322034
								if( media_azul > 14.207 )
									ret := -0.061281
							if( xrsi > 31.6579 )
								if( marron_mean <= 53.9562 )
									ret := 0.258643
								if( marron_mean > 53.9562 )
									ret := -0.161905
						if( verde_media > -43.2544 )
							if( media_azul <= 57.343 )
								if( xrsi <= 14.9601 )
									ret := 0.628571
								if( xrsi > 14.9601 )
									ret := -0.253543
							if( media_azul > 57.343 )
								if( pvi_ema <= -0.668301 )
									ret := -0.666667
								if( pvi_ema > -0.668301 )
									ret := 0.227092
					if( verde_media > -23.1269 )
						if( media <= 20.1093 )
							if( xrsi <= 21.7889 )
								if( nvi <= 0.021314 )
									ret := 0.833333 // buy
								if( nvi > 0.021314 )
									ret := 0.235294
							if( xrsi > 21.7889 )
								if( verde <= -1.99785 )
									ret := -0.050000
								if( verde > -1.99785 )
									ret := -0.655172
						if( media > 20.1093 )
							if( nvimax <= 0.090314 )
								if( verde_media <= -15.3207 )
									ret := 0.583333
								if( verde_media > -15.3207 )
									ret := 1.000000 // buy
							if( nvimax > 0.090314 )
								if( media <= 27.0562 )
									ret := 0.800000 // buy
								if( media > 27.0562 )
									ret := 0.131579
				if( nvimax > 0.494644 )
					if( nvi_ema <= 1.14887 )
						if( verde_azul <= 64.0472 )
							if( verde_mean <= 29.4016 )
								if( pvimax <= -1.31117 )
									ret := -0.033445
								if( pvimax > -1.31117 )
									ret := 0.283829
							if( verde_mean > 29.4016 )
								if( marron_mean <= 27.6932 )
									ret := -0.937500 // sell
								if( marron_mean > 27.6932 )
									ret := 0.070370
						if( verde_azul > 64.0472 )
							if( marron <= 15.7166 )
								if( nvi <= 0.580607 )
									ret := 0.560000
								if( nvi > 0.580607 )
									ret := 0.904110 // buy
							if( marron > 15.7166 )
								if( pvi_ema <= -0.85455 )
									ret := 0.275862
								if( pvi_ema > -0.85455 )
									ret := 0.850000 // buy
					if( nvi_ema > 1.14887 )
						if( media_azul <= 35.9558 )
							ret := 0.208333
						if( media_azul > 35.9558 )
							if( verde_azul <= 15.4287 )
								if( pvimax <= -1.25486 )
									ret := -0.846154 // sell
								if( pvimax > -1.25486 )
									ret := -0.166667
							if( verde_azul > 15.4287 )
								ret := 0.071429
			if( BollOsc > -46.5992 )
				if( verde_mean <= 89.0754 )
					if( media_azul <= 45.4894 )
						if( media <= 52.7056 )
							if( azul <= -19.4494 )
								if( azul_mean <= -19.8764 )
									ret := 0.162562
								if( azul_mean > -19.8764 )
									ret := 0.530702
							if( azul > -19.4494 )
								if( azul_mean <= -14.0365 )
									ret := -0.163426
								if( azul_mean > -14.0365 )
									ret := -0.029183
						if( media > 52.7056 )
							if( pvi <= -0.509306 )
								if( verde <= 9.79979 )
									ret := 0.340361
								if( verde > 9.79979 )
									ret := -0.024051
							if( pvi > -0.509306 )
								if( verde_media <= -53.306 )
									ret := 0.700980 // buy
								if( verde_media > -53.306 )
									ret := 0.188571
					if( media_azul > 45.4894 )
						if( azul <= 30.7662 )
							if( tprice <= 10.8914 )
								if( nvimin <= 0.815933 )
									ret := 0.456110
								if( nvimin > 0.815933 )
									ret := 0.158159
							if( tprice > 10.8914 )
								if( oscp <= 1.62564 )
									ret := 0.119589
								if( oscp > 1.62564 )
									ret := -0.013664
						if( azul > 30.7662 )
							if( azul_mean <= 35.2422 )
								if( nvimin <= 0.953377 )
									ret := 0.300000
								if( nvimin > 0.953377 )
									ret := -0.944444 // sell
							if( azul_mean > 35.2422 )
								ret := -1.000000 // sell
				if( verde_mean > 89.0754 )
					if( media <= 97.6061 )
						if( marron <= 46.4085 )
							if( verde <= 43.4001 )
								ret := 0.210526
							if( verde > 43.4001 )
								if( verde_mean <= 113.944 )
									ret := 0.711111 // buy
								if( verde_mean > 113.944 )
									ret := 0.944444 // buy
						if( marron > 46.4085 )
							if( source <= 11.7704 )
								if( verde_mean <= 94.4651 )
									ret := 0.689119
								if( verde_mean > 94.4651 )
									ret := 0.358108
							if( source > 11.7704 )
								if( xmf <= 73.0002 )
									ret := 0.037811
								if( xmf > 73.0002 )
									ret := 0.461111
					if( media > 97.6061 )
						if( nvim <= 1.09014 )
							if( xmf <= 78.0612 )
								if( stoc <= 69.0412 )
									ret := -0.655172
								if( stoc > 69.0412 )
									ret := -0.166667
							if( xmf > 78.0612 )
								if( verde_mean <= 113.088 )
									ret := 0.111111
								if( verde_mean > 113.088 )
									ret := -0.272727
						if( nvim > 1.09014 )
							ret := 0.642857
		if( BollOsc > 11.0276 )
			if( pvi_ema <= -0.901322 )
				if( verde_mean <= 34.3206 )
					if( oscp <= 7.21576 )
						if( nvim <= 0.979544 )
							if( marron_mean <= 57.504 )
								if( xmf <= 24.748 )
									ret := -0.764706 // sell
								if( xmf > 24.748 )
									ret := -0.917808 // sell
							if( marron_mean > 57.504 )
								if( nvi_ema <= 0.873835 )
									ret := -0.272727
								if( nvi_ema > 0.873835 )
									ret := -0.800000 // sell
						if( nvim > 0.979544 )
							if( azul <= 30.141 )
								if( xmf <= 33.4537 )
									ret := -0.350000
								if( xmf > 33.4537 )
									ret := 0.392857
							if( azul > 30.141 )
								if( marron_mean <= 45.6521 )
									ret := -0.200000
								if( marron_mean > 45.6521 )
									ret := -0.789474 // sell
					if( oscp > 7.21576 )
						if( azul <= 19.1613 )
							ret := 0.200000
						if( azul > 19.1613 )
							ret := 1.000000 // buy
				if( verde_mean > 34.3206 )
					if( pvi_ema <= -1.37596 )
						if( verde <= 106.25 )
							if( azul <= 4.41232 )
								if( marron <= 68.5209 )
									ret := -0.181818
								if( marron > 68.5209 )
									ret := 0.562500
							if( azul > 4.41232 )
								if( source <= 9.18517 )
									ret := 0.478261
								if( source > 9.18517 )
									ret := 0.918919 // buy
						if( verde > 106.25 )
							ret := -0.187500
					if( pvi_ema > -1.37596 )
						if( verde_azul <= 71.5878 )
							if( media <= 82.4856 )
								if( source <= 11.7238 )
									ret := -0.301015
								if( source > 11.7238 )
									ret := -0.073770
							if( media > 82.4856 )
								if( azul <= 64.3895 )
									ret := 0.261364
								if( azul > 64.3895 )
									ret := -0.750000 // sell
						if( verde_azul > 71.5878 )
							if( oscp <= 27.7855 )
								if( oscp <= -2.49831 )
									ret := 0.503937
								if( oscp > -2.49831 )
									ret := 0.061344
							if( oscp > 27.7855 )
								if( azul <= -23.9899 )
									ret := -0.371237
								if( azul > -23.9899 )
									ret := -0.040839
			if( pvi_ema > -0.901322 )
				if( marron_mean <= 70.4043 )
					if( verde_azul <= 25.4496 )
						if( pvimin <= -0.8457 )
							if( pvimax <= -0.839567 )
								ret := -1.000000 // sell
							if( pvimax > -0.839567 )
								ret := -0.888889 // sell
						if( pvimin > -0.8457 )
							if( marron <= 88.6608 )
								if( media_azul <= 30.9022 )
									ret := -0.628362
								if( media_azul > 30.9022 )
									ret := -0.153846
							if( marron > 88.6608 )
								if( xrsi <= 74.0247 )
									ret := -0.227273
								if( xrsi > 74.0247 )
									ret := 1.000000 // buy
					if( verde_azul > 25.4496 )
						if( verde_media <= 3.02879 )
							if( xmf <= 36.4257 )
								if( nvimax <= 0.28361 )
									ret := 0.255319
								if( nvimax > 0.28361 )
									ret := -0.262195
							if( xmf > 36.4257 )
								if( stoc <= 62.7797 )
									ret := 0.022556
								if( stoc > 62.7797 )
									ret := 0.578947
						if( verde_media > 3.02879 )
							if( verde_mean <= 77.3698 )
								if( verde_mean <= 66.3522 )
									ret := -0.191043
								if( verde_mean > 66.3522 )
									ret := -0.063187
							if( verde_mean > 77.3698 )
								if( verde_azul <= 223.086 )
									ret := -0.306792
								if( verde_azul > 223.086 )
									ret := -0.925926 // sell
				if( marron_mean > 70.4043 )
					if( verde_media <= 29.2977 )
						if( xmf <= 60.6263 )
							if( oscp <= -0.770962 )
								if( source <= 17.604 )
									ret := 0.064634
								if( source > 17.604 )
									ret := -1.000000 // sell
							if( oscp > -0.770962 )
								if( marron_mean <= 79.601 )
									ret := -0.035413
								if( marron_mean > 79.601 )
									ret := -0.295824
						if( xmf > 60.6263 )
							if( tprice <= 16.8271 )
								if( media_azul <= 42.9143 )
									ret := -0.316832
								if( media_azul > 42.9143 )
									ret := 0.098192
							if( tprice > 16.8271 )
								if( verde_media <= 5.53868 )
									ret := -0.307692
								if( verde_media > 5.53868 )
									ret := 0.004082
					if( verde_media > 29.2977 )
						if( oscp <= 0.534941 )
							if( verde <= 101.373 )
								if( media <= 60.5717 )
									ret := -0.653846
								if( media > 60.5717 )
									ret := 0.200000
							if( verde > 101.373 )
								if( BollOsc <= 61.5517 )
									ret := -0.812500 // sell
								if( BollOsc > 61.5517 )
									ret := -1.000000 // sell
						if( oscp > 0.534941 )
							if( verde <= 102.956 )
								if( source <= 16.7808 )
									ret := 0.243902
								if( source > 16.7808 )
									ret := -0.705882 // sell
							if( verde > 102.956 )
								if( verde_azul <= 241.727 )
									ret := -0.268541
								if( verde_azul > 241.727 )
									ret := 0.255319
	if( stoc > 81.6497 )
		if( nvimax <= 0.115126 )
			if( verde <= 132.177 )
				if( pvimin <= -0.07256 )
					if( BollOsc <= 48.0433 )
						if( azul <= 8.39918 )
							if( nvimax <= 0.01892 )
								if( tprice <= 16.7163 )
									ret := 0.402985
								if( tprice > 16.7163 )
									ret := 1.000000 // buy
							if( nvimax > 0.01892 )
								if( verde_mean <= 97.8831 )
									ret := -0.142857
								if( verde_mean > 97.8831 )
									ret := 0.195122
						if( azul > 8.39918 )
							if( media <= 66.7308 )
								if( BollOsc <= 32.8863 )
									ret := 0.111111
								if( BollOsc > 32.8863 )
									ret := -0.250000
							if( media > 66.7308 )
								if( pvimax <= -0.146846 )
									ret := 0.928571 // buy
								if( pvimax > -0.146846 )
									ret := 0.502703
					if( BollOsc > 48.0433 )
						if( verde_mean <= 122.96 )
							if( nvim <= 0.018951 )
								if( media <= 74.1793 )
									ret := 0.400000
								if( media > 74.1793 )
									ret := 0.000000
							if( nvim > 0.018951 )
								if( nvimax <= 0.097818 )
									ret := -0.848485 // sell
								if( nvimax > 0.097818 )
									ret := -0.037037
						if( verde_mean > 122.96 )
							if( media <= 78.4738 )
								ret := 1.000000 // buy
							if( media > 78.4738 )
								ret := 0.190476
				if( pvimin > -0.07256 )
					if( BollOsc <= 37.0246 )
						if( oscp <= 3.8301 )
							if( pvimax <= -0.045054 )
								ret := 0.250000
							if( pvimax > -0.045054 )
								if( BollOsc <= 31.5222 )
									ret := 0.157895
								if( BollOsc > 31.5222 )
									ret := -0.666667
						if( oscp > 3.8301 )
							if( verde_media <= 19.5252 )
								if( verde_azul <= 96.941 )
									ret := -0.837838 // sell
								if( verde_azul > 96.941 )
									ret := -0.333333
							if( verde_media > 19.5252 )
								ret := -0.153846
					if( BollOsc > 37.0246 )
						if( stoc <= 87.1647 )
							if( pvi <= -0.04138 )
								ret := 1.000000 // buy
							if( pvi > -0.04138 )
								ret := 0.352941
						if( stoc > 87.1647 )
							if( pvim <= -0.024219 )
								ret := -0.600000
							if( pvim > -0.024219 )
								if( verde_azul <= 102.8 )
									ret := 0.222222
								if( verde_azul > 102.8 )
									ret := 0.000000
			if( verde > 132.177 )
				if( xmf <= 61.8082 )
					if( nvi <= 0.05447 )
						ret := -0.187500
					if( nvi > 0.05447 )
						ret := 1.000000 // buy
				if( xmf > 61.8082 )
					if( nvi <= 0.055088 )
						if( verde_mean <= 125.686 )
							if( media_azul <= 77.0342 )
								ret := -0.187500
							if( media_azul > 77.0342 )
								ret := -0.818182 // sell
						if( verde_mean > 125.686 )
							if( verde_mean <= 132.24 )
								ret := 0.555556
							if( verde_mean > 132.24 )
								if( tprice <= 16.8935 )
									ret := -0.082192
								if( tprice > 16.8935 )
									ret := 0.411765
					if( nvi > 0.055088 )
						if( nvi_ema <= 0.105956 )
							if( media_azul <= 51.5873 )
								ret := -1.000000 // sell
							if( media_azul > 51.5873 )
								if( nvimin <= 0.074089 )
									ret := -0.791667 // sell
								if( nvimin > 0.074089 )
									ret := -0.294118
						if( nvi_ema > 0.105956 )
							if( media_azul <= 95.1858 )
								ret := -0.105263
							if( media_azul > 95.1858 )
								ret := -0.500000
		if( nvimax > 0.115126 )
			if( pvi <= -1.32278 )
				if( source <= 10.9968 )
					if( pvi <= -1.33362 )
						if( xmf <= 60.4869 )
							if( azul <= 47.5965 )
								if( verde_mean <= 95.472 )
									ret := 0.169014
								if( verde_mean > 95.472 )
									ret := -0.470588
							if( azul > 47.5965 )
								ret := -0.526316
						if( xmf > 60.4869 )
							if( azul <= 39.6424 )
								if( pvi <= -1.34368 )
									ret := -0.372093
								if( pvi > -1.34368 )
									ret := -0.857143 // sell
							if( azul > 39.6424 )
								ret := 0.333333
					if( pvi > -1.33362 )
						if( source <= 9.65861 )
							ret := 0.875000 // buy
						if( source > 9.65861 )
							if( nvim <= 0.862398 )
								if( nvimax <= 0.856865 )
									ret := 0.368421
								if( nvimax > 0.856865 )
									ret := -0.088235
							if( nvim > 0.862398 )
								if( BollOsc <= 30.7633 )
									ret := 0.000000
								if( BollOsc > 30.7633 )
									ret := 0.814815 // buy
				if( source > 10.9968 )
					if( nvim <= 1.04649 )
						if( BollOsc <= 26.8329 )
							ret := -0.333333
						if( BollOsc > 26.8329 )
							if( tprice <= 11.4067 )
								if( verde_media <= 55.958 )
									ret := 0.918605 // buy
								if( verde_media > 55.958 )
									ret := 0.571429
							if( tprice > 11.4067 )
								ret := -0.636364
					if( nvim > 1.04649 )
						if( nvimin <= 1.03786 )
							ret := -0.421053
						if( nvimin > 1.03786 )
							if( nvim <= 1.07644 )
								if( verde_media <= 23.5579 )
									ret := 0.000000
								if( verde_media > 23.5579 )
									ret := 0.689655
							if( nvim > 1.07644 )
								if( nvimin <= 1.07367 )
									ret := 0.444444
								if( nvimin > 1.07367 )
									ret := -0.053333
			if( pvi > -1.32278 )
				if( verde_media <= 25.3075 )
					if( stoc <= 91.5127 )
						if( media <= 109.021 )
							if( media_azul <= 72.3838 )
								if( BollOsc <= 6.81188 )
									ret := 0.322581
								if( BollOsc > 6.81188 )
									ret := -0.221688
							if( media_azul > 72.3838 )
								if( media_azul <= 96.1663 )
									ret := 0.078921
								if( media_azul > 96.1663 )
									ret := -0.148148
						if( media > 109.021 )
							if( oscp <= 2.64252 )
								if( marron <= 101.992 )
									ret := 0.000000
								if( marron > 101.992 )
									ret := 0.615385
							if( oscp > 2.64252 )
								if( verde <= 125.785 )
									ret := -0.652174
								if( verde > 125.785 )
									ret := -0.193548
					if( stoc > 91.5127 )
						if( pvim <= -1.29166 )
							if( media <= 93.8755 )
								if( nvimin <= 0.990087 )
									ret := -0.900000 // sell
								if( nvimin > 0.990087 )
									ret := -0.361702
							if( media > 93.8755 )
								if( nvim <= 1.12037 )
									ret := 0.058824
								if( nvim > 1.12037 )
									ret := 0.750000 // buy
						if( pvim > -1.29166 )
							if( xmf <= 93.2017 )
								if( oscp <= 25.6961 )
									ret := 0.094608
								if( oscp > 25.6961 )
									ret := 0.952381 // buy
							if( xmf > 93.2017 )
								if( azul <= 11.566 )
									ret := 0.500000
								if( azul > 11.566 )
									ret := 1.000000 // buy
				if( verde_media > 25.3075 )
					if( xmf <= 70.3793 )
						if( azul_mean <= 15.1767 )
							if( verde_azul <= 115.34 )
								if( nvimin <= 0.826145 )
									ret := -0.278899
								if( nvimin > 0.826145 )
									ret := 0.026764
							if( verde_azul > 115.34 )
								if( media <= 78.536 )
									ret := -0.067941
								if( media > 78.536 )
									ret := 0.373116
						if( azul_mean > 15.1767 )
							if( azul_mean <= 17.8408 )
								if( pvi_ema <= -1.2389 )
									ret := -0.196429
								if( pvi_ema > -1.2389 )
									ret := -0.690789
							if( azul_mean > 17.8408 )
								if( xrsi <= 63.6377 )
									ret := -0.535211
								if( xrsi > 63.6377 )
									ret := -0.168157
					if( xmf > 70.3793 )
						if( source <= 12.5337 )
							if( nvi <= 0.543706 )
								if( nvi <= 0.53993 )
									ret := 0.112903
								if( nvi > 0.53993 )
									ret := 0.815789 // buy
							if( nvi > 0.543706 )
								if( verde_media <= 104.803 )
									ret := -0.170318
								if( verde_media > 104.803 )
									ret := 0.464286
						if( source > 12.5337 )
							if( azul_mean <= -36.7591 )
								if( azul_mean <= -61.9143 )
									ret := -0.500000
								if( azul_mean > -61.9143 )
									ret := 0.681818
							if( azul_mean > -36.7591 )
								if( pvi_ema <= -0.922628 )
									ret := -0.452454
								if( pvi_ema > -0.922628 )
									ret := -0.281580
	
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
float op_operation = decision_tree_0_LYFT_1Min_b558a3ae(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


