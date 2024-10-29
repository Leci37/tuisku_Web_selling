//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: MATICUSDT_15Min_1KON_8e0b0e76 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_15Min_1KON_8e0b0e76", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_15Min_8e0b0e76(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( marron <= 14.7349 )
		if( stoc <= 13.4132 )
			if( marron_mean <= -5.25258 )
				if( verde_media <= -75.5338 )
					if( nvimax <= 0.064385 )
						if( stoc <= 12.5988 )
							if( verde_mean <= -102.295 )
								if( pvimin <= 0.839404 )
									ret := -0.250000
								if( pvimin > 0.839404 )
									ret := 0.250000
							if( verde_mean > -102.295 )
								if( azul <= -58.9784 )
									ret := 0.000000
								if( azul > -58.9784 )
									ret := -0.884058 // sell
						if( stoc > 12.5988 )
							if( tprice <= 1.03688 )
								if( marron_mean <= -12.9104 )
									ret := -0.250000
								if( marron_mean > -12.9104 )
									ret := -0.750000 // sell
							if( tprice > 1.03688 )
								ret := 1.000000 // buy
					if( nvimax > 0.064385 )
						if( stoc <= 8.22684 )
							if( tprice <= 0.5299 )
								ret := -0.250000
							if( tprice > 0.5299 )
								ret := -1.000000 // sell
						if( stoc > 8.22684 )
							if( stoc <= 13.0396 )
								if( nvi_ema <= 2.50347 )
									ret := 0.920000 // buy
								if( nvi_ema > 2.50347 )
									ret := 0.000000
							if( stoc > 13.0396 )
								ret := -0.200000
				if( verde_media > -75.5338 )
					if( source <= 0.854605 )
						if( verde <= -25.4082 )
							if( azul_mean <= -5.51154 )
								if( tprice <= 0.507987 )
									ret := -0.291667
								if( tprice > 0.507987 )
									ret := 0.377551
							if( azul_mean > -5.51154 )
								if( xmf <= 14.7217 )
									ret := -0.550000
								if( xmf > 14.7217 )
									ret := 0.314286
						if( verde > -25.4082 )
							if( verde_mean <= -23.6068 )
								if( verde_azul <= -21.4946 )
									ret := 0.100000
								if( verde_azul > -21.4946 )
									ret := -0.640625
							if( verde_mean > -23.6068 )
								if( verde_media <= -38.7118 )
									ret := -0.800000 // sell
								if( verde_media > -38.7118 )
									ret := 0.190476
					if( source > 0.854605 )
						if( media <= 19.0462 )
							if( pvi <= 1.32623 )
								if( azul_mean <= -64.5467 )
									ret := -0.750000 // sell
								if( azul_mean > -64.5467 )
									ret := 0.792793 // buy
							if( pvi > 1.32623 )
								if( nvi_ema <= -0.91474 )
									ret := 0.200000
								if( nvi_ema > -0.91474 )
									ret := -0.666667
						if( media > 19.0462 )
							if( oscp <= -30.2952 )
								if( oscp <= -33.2638 )
									ret := -0.285714
								if( oscp > -33.2638 )
									ret := -1.000000 // sell
							if( oscp > -30.2952 )
								ret := 0.142857
			if( marron_mean > -5.25258 )
				if( pvimin <= 1.24746 )
					if( xrsi <= 34.4858 )
						if( media <= 54.2937 )
							if( oscp <= -21.9398 )
								if( verde_azul <= -35.3488 )
									ret := 0.241206
								if( verde_azul > -35.3488 )
									ret := 0.469154
							if( oscp > -21.9398 )
								if( pvi <= -0.200154 )
									ret := 0.107325
								if( pvi > -0.200154 )
									ret := 0.326603
						if( media > 54.2937 )
							if( marron_mean <= 27.8873 )
								if( tprice <= 0.826312 )
									ret := 0.142857
								if( tprice > 0.826312 )
									ret := -0.750000 // sell
							if( marron_mean > 27.8873 )
								if( azul <= -7.99329 )
									ret := -1.000000 // sell
								if( azul > -7.99329 )
									ret := -0.500000
					if( xrsi > 34.4858 )
						if( pvi <= 0.230773 )
							if( verde_azul <= 26.5804 )
								if( verde_azul <= 7.14465 )
									ret := -0.045455
								if( verde_azul > 7.14465 )
									ret := -0.529412
							if( verde_azul > 26.5804 )
								if( nvi_ema <= -0.500918 )
									ret := -1.000000 // sell
								if( nvi_ema > -0.500918 )
									ret := 0.320000
						if( pvi > 0.230773 )
							if( nvimax <= -0.078483 )
								if( verde_mean <= -2.58765 )
									ret := 0.548387
								if( verde_mean > -2.58765 )
									ret := 0.050360
							if( nvimax > -0.078483 )
								if( oscp <= -4.4051 )
									ret := 1.000000 // buy
								if( oscp > -4.4051 )
									ret := 0.750000 // buy
				if( pvimin > 1.24746 )
					if( xmf <= 14.2624 )
						if( nvi_ema <= -0.859412 )
							ret := -1.000000 // sell
						if( nvi_ema > -0.859412 )
							ret := 0.000000
					if( xmf > 14.2624 )
						if( xrsi <= 33.7627 )
							if( azul <= -9.56927 )
								if( pvimax <= 1.35952 )
									ret := -0.100000
								if( pvimax > 1.35952 )
									ret := 0.684211
							if( azul > -9.56927 )
								if( xmf <= 18.2803 )
									ret := -0.461538
								if( xmf > 18.2803 )
									ret := 0.054054
						if( xrsi > 33.7627 )
							if( source <= 0.975283 )
								if( verde_media <= -31.1307 )
									ret := -0.500000
								if( verde_media > -31.1307 )
									ret := 0.000000
							if( source > 0.975283 )
								ret := -0.833333 // sell
		if( stoc > 13.4132 )
			if( marron <= -28.9929 )
				if( verde_media <= -114.194 )
					if( nvimin <= -0.84033 )
						ret := 0.250000
					if( nvimin > -0.84033 )
						if( stoc <= 22.4447 )
							ret := 0.500000
						if( stoc > 22.4447 )
							ret := 1.000000 // buy
				if( verde_media > -114.194 )
					if( source <= 0.664724 )
						ret := -0.750000 // sell
					if( source > 0.664724 )
						if( verde_media <= -101.936 )
							ret := 0.250000
						if( verde_media > -101.936 )
							ret := 0.800000 // buy
			if( marron > -28.9929 )
				if( xmf <= 21.9561 )
					if( verde_media <= -158.116 )
						if( verde <= -149.595 )
							if( verde <= -178.689 )
								if( nvimax <= -0.347679 )
									ret := 0.500000
								if( nvimax > -0.347679 )
									ret := 1.000000 // buy
							if( verde > -178.689 )
								if( pvimin <= 0.914436 )
									ret := -0.450000
								if( pvimin > 0.914436 )
									ret := 0.888889 // buy
						if( verde > -149.595 )
							if( verde_media <= -164.153 )
								if( media_azul <= 64.8159 )
									ret := 1.000000 // buy
								if( media_azul > 64.8159 )
									ret := 0.750000 // buy
							if( verde_media > -164.153 )
								ret := 0.428571
					if( verde_media > -158.116 )
						if( marron_mean <= 12.9187 )
							if( media <= 6.70125 )
								if( oscp <= -33.7675 )
									ret := 0.013636
								if( oscp > -33.7675 )
									ret := -0.345890
							if( media > 6.70125 )
								if( BollOsc <= -69.7946 )
									ret := -0.146814
								if( BollOsc > -69.7946 )
									ret := 0.118577
						if( marron_mean > 12.9187 )
							if( verde_mean <= 28.7012 )
								if( xrsi <= 31.9259 )
									ret := -0.024390
								if( xrsi > 31.9259 )
									ret := -0.240122
							if( verde_mean > 28.7012 )
								if( xmf <= 20.4288 )
									ret := -0.303030
								if( xmf > 20.4288 )
									ret := -0.833333 // sell
				if( xmf > 21.9561 )
					if( media_azul <= 15.0882 )
						if( stoc <= 23.4273 )
							if( verde_mean <= -19.2434 )
								if( oscp <= -26.4721 )
									ret := 0.342541
								if( oscp > -26.4721 )
									ret := 0.661017
							if( verde_mean > -19.2434 )
								if( verde <= -33.0752 )
									ret := 0.704545 // buy
								if( verde > -33.0752 )
									ret := 0.172107
						if( stoc > 23.4273 )
							if( nvim <= -0.22701 )
								if( verde <= -20.4826 )
									ret := 0.113821
								if( verde > -20.4826 )
									ret := -0.295918
							if( nvim > -0.22701 )
								if( azul <= 13.8041 )
									ret := -0.225806
								if( azul > 13.8041 )
									ret := 0.441489
					if( media_azul > 15.0882 )
						if( azul <= -84.6425 )
							if( xmf <= 31.6802 )
								if( nvim <= -0.320205 )
									ret := -0.944444 // sell
								if( nvim > -0.320205 )
									ret := -0.600000
							if( xmf > 31.6802 )
								if( xmf <= 36.8567 )
									ret := 0.363636
								if( xmf > 36.8567 )
									ret := -0.800000 // sell
						if( azul > -84.6425 )
							if( verde_azul <= -89.8315 )
								if( marron <= -7.53657 )
									ret := 0.250000
								if( marron > -7.53657 )
									ret := -0.740000 // sell
							if( verde_azul > -89.8315 )
								if( nvimax <= 1.80241 )
									ret := 0.111586
								if( nvimax > 1.80241 )
									ret := -0.072674
	if( marron > 14.7349 )
		if( source <= 1.1303 )
			if( nvimax <= 0.950893 )
				if( media <= 24.3706 )
					if( pvi <= -0.477808 )
						if( xrsi <= 31.1306 )
							if( azul <= -23.1424 )
								if( source <= 0.776791 )
									ret := -0.954545 // sell
								if( source > 0.776791 )
									ret := 0.500000
							if( azul > -23.1424 )
								if( azul <= 0.94912 )
									ret := 0.532258
								if( azul > 0.94912 )
									ret := -0.162791
						if( xrsi > 31.1306 )
							if( tprice <= 0.342625 )
								ret := 1.000000 // buy
							if( tprice > 0.342625 )
								if( marron_mean <= 34.2289 )
									ret := -0.587719
								if( marron_mean > 34.2289 )
									ret := 0.444444
					if( pvi > -0.477808 )
						if( verde_mean <= -50.1673 )
							if( stoc <= 34.4908 )
								if( oscp <= -60.9512 )
									ret := -1.000000 // sell
								if( oscp > -60.9512 )
									ret := -0.250000
							if( stoc > 34.4908 )
								if( verde_mean <= -61.0235 )
									ret := -1.000000 // sell
								if( verde_mean > -61.0235 )
									ret := -0.600000
						if( verde_mean > -50.1673 )
							if( media_azul <= -76.2501 )
								if( verde_mean <= -21.6444 )
									ret := 0.000000
								if( verde_mean > -21.6444 )
									ret := 0.739130 // buy
							if( media_azul > -76.2501 )
								if( BollOsc <= -28.3107 )
									ret := 0.085266
								if( BollOsc > -28.3107 )
									ret := -0.056569
				if( media > 24.3706 )
					if( media_azul <= 109.801 )
						if( azul_mean <= 30.894 )
							if( pvimin <= 1.13772 )
								if( media <= 117.334 )
									ret := 0.064407
								if( media > 117.334 )
									ret := -0.524590
							if( pvimin > 1.13772 )
								if( media_azul <= 91.9675 )
									ret := -0.033314
								if( media_azul > 91.9675 )
									ret := 0.145631
						if( azul_mean > 30.894 )
							if( stoc <= 90.8447 )
								if( BollOsc <= 59.49 )
									ret := 0.160809
								if( BollOsc > 59.49 )
									ret := -0.230769
							if( stoc > 90.8447 )
								if( xrsi <= 70.1312 )
									ret := -0.022222
								if( xrsi > 70.1312 )
									ret := 0.602339
					if( media_azul > 109.801 )
						if( pvi_ema <= -0.32579 )
							if( media_azul <= 127.991 )
								if( xmf <= 45.2305 )
									ret := 0.633333
								if( xmf > 45.2305 )
									ret := 0.018868
							if( media_azul > 127.991 )
								if( nvi <= -0.187743 )
									ret := 0.820513 // buy
								if( nvi > -0.187743 )
									ret := 0.112500
						if( pvi_ema > -0.32579 )
							if( BollOsc <= 37.3135 )
								if( marron_mean <= 88.9356 )
									ret := -0.087678
								if( marron_mean > 88.9356 )
									ret := 0.057299
							if( BollOsc > 37.3135 )
								if( media <= 115.06 )
									ret := -0.157343
								if( media > 115.06 )
									ret := 0.268293
			if( nvimax > 0.950893 )
				if( verde_azul <= 103.165 )
					if( media <= 52.7687 )
						if( verde_mean <= 18.853 )
							if( media_azul <= -50.8699 )
								if( verde_mean <= -45.9651 )
									ret := -0.571429
								if( verde_mean > -45.9651 )
									ret := 0.416667
							if( media_azul > -50.8699 )
								if( azul_mean <= 47.0603 )
									ret := -0.034708
								if( azul_mean > 47.0603 )
									ret := -0.401786
						if( verde_mean > 18.853 )
							if( verde_media <= -37.0015 )
								if( pvim <= -0.505254 )
									ret := 0.492537
								if( pvim > -0.505254 )
									ret := -0.333333
							if( verde_media > -37.0015 )
								if( verde_azul <= 10.3068 )
									ret := 0.247059
								if( verde_azul > 10.3068 )
									ret := 0.028362
					if( media > 52.7687 )
						if( media_azul <= 118.813 )
							if( media_azul <= 41.9954 )
								if( xmf <= 66.825 )
									ret := -0.023504
								if( xmf > 66.825 )
									ret := 0.333333
							if( media_azul > 41.9954 )
								if( verde_media <= -55.6533 )
									ret := -0.316279
								if( verde_media > -55.6533 )
									ret := -0.073196
						if( media_azul > 118.813 )
							if( source <= 0.521483 )
								ret := 0.000000
							if( source > 0.521483 )
								if( marron <= 68.4994 )
									ret := 0.813953 // buy
								if( marron > 68.4994 )
									ret := -0.250000
				if( verde_azul > 103.165 )
					if( BollOsc <= 86.1179 )
						if( azul <= -44.0759 )
							if( verde <= 24.4234 )
								ret := 1.000000 // buy
							if( verde > 24.4234 )
								if( verde_azul <= 160.781 )
									ret := -0.335766
								if( verde_azul > 160.781 )
									ret := 0.028571
						if( azul > -44.0759 )
							if( verde <= 118.533 )
								if( oscp <= 16.3766 )
									ret := 0.234498
								if( oscp > 16.3766 )
									ret := 0.039120
							if( verde > 118.533 )
								if( verde_mean <= 139.596 )
									ret := -0.011015
								if( verde_mean > 139.596 )
									ret := 0.173307
					if( BollOsc > 86.1179 )
						if( marron <= 132.188 )
							ret := -1.000000 // sell
						if( marron > 132.188 )
							if( verde_azul <= 200.318 )
								if( source <= 0.640801 )
									ret := 0.000000
								if( source > 0.640801 )
									ret := 0.500000
							if( verde_azul > 200.318 )
								if( verde_mean <= 142.189 )
									ret := -0.916667 // sell
								if( verde_mean > 142.189 )
									ret := -0.250000
		if( source > 1.1303 )
			if( media_azul <= 98.2939 )
				if( media <= 23.8737 )
					if( verde_azul <= 27.5131 )
						if( xrsi <= 34.1972 )
							if( verde <= -3.81655 )
								if( xrsi <= 31.0076 )
									ret := -0.857143 // sell
								if( xrsi > 31.0076 )
									ret := 0.636364
							if( verde > -3.81655 )
								if( BollOsc <= -32.1812 )
									ret := 0.000000
								if( BollOsc > -32.1812 )
									ret := 0.695652
						if( xrsi > 34.1972 )
							if( verde_azul <= -16.4001 )
								if( xmf <= 34.626 )
									ret := 0.000000
								if( xmf > 34.626 )
									ret := 1.000000 // buy
							if( verde_azul > -16.4001 )
								if( stoc <= 25.3055 )
									ret := 0.090909
								if( stoc > 25.3055 )
									ret := -0.411765
					if( verde_azul > 27.5131 )
						if( media <= 13.7214 )
							if( xmf <= 30.4389 )
								ret := 0.200000
							if( xmf > 30.4389 )
								ret := -0.600000
						if( media > 13.7214 )
							if( oscp <= -3.49187 )
								if( source <= 1.20739 )
									ret := 0.857143 // buy
								if( source > 1.20739 )
									ret := 1.000000 // buy
							if( oscp > -3.49187 )
								if( nvimax <= -0.803295 )
									ret := 0.666667
								if( nvimax > -0.803295 )
									ret := 0.052632
				if( media > 23.8737 )
					if( verde_azul <= -22.6555 )
						if( verde <= 17.5266 )
							if( nvim <= -0.307645 )
								if( verde <= 10.2027 )
									ret := 0.360656
								if( verde > 10.2027 )
									ret := -0.400000
							if( nvim > -0.307645 )
								if( marron_mean <= 35.9183 )
									ret := 0.000000
								if( marron_mean > 35.9183 )
									ret := -0.818182 // sell
						if( verde > 17.5266 )
							if( pvi <= 1.29262 )
								if( verde <= 57.9725 )
									ret := 0.962963 // buy
								if( verde > 57.9725 )
									ret := 0.250000
							if( pvi > 1.29262 )
								if( media_azul <= -20.485 )
									ret := -0.222222
								if( media_azul > -20.485 )
									ret := 1.000000 // buy
					if( verde_azul > -22.6555 )
						if( nvim <= 0.786565 )
							if( xmf <= 25.6926 )
								if( marron <= 18.2838 )
									ret := -0.833333 // sell
								if( marron > 18.2838 )
									ret := -0.409836
							if( xmf > 25.6926 )
								if( nvimax <= -0.907798 )
									ret := -0.293578
								if( nvimax > -0.907798 )
									ret := -0.062313
						if( nvim > 0.786565 )
							if( pvi_ema <= -0.105976 )
								if( media <= 63.1309 )
									ret := 0.857143 // buy
								if( media > 63.1309 )
									ret := -0.368421
							if( pvi_ema > -0.105976 )
								if( tprice <= 1.20697 )
									ret := -0.918919 // sell
								if( tprice > 1.20697 )
									ret := -0.511628
			if( media_azul > 98.2939 )
				if( verde_media <= -11.2011 )
					if( tprice <= 1.19124 )
						if( verde_azul <= 95.3636 )
							if( verde_azul <= 70.4574 )
								if( BollOsc <= -13.5327 )
									ret := 0.000000
								if( BollOsc > -13.5327 )
									ret := -0.750000 // sell
							if( verde_azul > 70.4574 )
								if( pvimin <= 1.01204 )
									ret := 0.900000 // buy
								if( pvimin > 1.01204 )
									ret := 0.304348
						if( verde_azul > 95.3636 )
							if( stoc <= 66.0153 )
								if( source <= 1.16645 )
									ret := -0.142857
								if( source > 1.16645 )
									ret := -1.000000 // sell
							if( stoc > 66.0153 )
								ret := 0.000000
					if( tprice > 1.19124 )
						if( xmf <= 69.1544 )
							if( oscp <= 7.76114 )
								if( azul <= -12.4277 )
									ret := 0.903846 // buy
								if( azul > -12.4277 )
									ret := 0.375000
							if( oscp > 7.76114 )
								if( stoc <= 39.1837 )
									ret := 0.833333 // buy
								if( stoc > 39.1837 )
									ret := 0.000000
						if( xmf > 69.1544 )
							ret := -0.500000
				if( verde_media > -11.2011 )
					if( marron <= 131.739 )
						if( marron_mean <= 120.087 )
							if( xmf <= 87.439 )
								if( stoc <= 54.3798 )
									ret := -0.404255
								if( stoc > 54.3798 )
									ret := 0.077369
							if( xmf > 87.439 )
								if( stoc <= 93.1642 )
									ret := -0.500000
								if( stoc > 93.1642 )
									ret := -1.000000 // sell
						if( marron_mean > 120.087 )
							if( media <= 123.276 )
								if( xmf <= 76.8706 )
									ret := -0.444444
								if( xmf > 76.8706 )
									ret := 0.750000 // buy
							if( media > 123.276 )
								ret := -0.714286 // sell
					if( marron > 131.739 )
						if( nvi_ema <= -0.870498 )
							ret := -0.250000
						if( nvi_ema > -0.870498 )
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
float op_operation = decision_tree_0_MATICUSDT_15Min_8e0b0e76(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


