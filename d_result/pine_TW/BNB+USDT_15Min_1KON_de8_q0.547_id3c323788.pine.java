//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: BNBUSDT_15Min_1KON_3c323788 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_15Min_1KON_3c323788", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_15Min_3c323788(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( verde <= -29.1545 )
		if( xrsi <= 24.0161 )
			if( pvi <= -2.06326 )
				if( source <= 566.256 )
					if( verde_azul <= -94.0991 )
						if( tprice <= 219.906 )
							if( azul <= -3.72112 )
								if( verde <= -125.077 )
									ret := -1.000000 // sell
								if( verde > -125.077 )
									ret := 0.000000
							if( azul > -3.72112 )
								if( nvi_ema <= 1.90499 )
									ret := 0.833333 // buy
								if( nvi_ema > 1.90499 )
									ret := 0.000000
						if( tprice > 219.906 )
							if( stoc <= 14.4815 )
								if( media_azul <= -27.7258 )
									ret := 1.000000 // buy
								if( media_azul > -27.7258 )
									ret := -0.833333 // sell
							if( stoc > 14.4815 )
								if( azul <= 95.831 )
									ret := 0.875000 // buy
								if( azul > 95.831 )
									ret := 0.250000
					if( verde_azul > -94.0991 )
						if( azul_mean <= 29.8157 )
							if( xmf <= 23.4227 )
								if( tprice <= 506.732 )
									ret := 0.359736
								if( tprice > 506.732 )
									ret := 0.706731 // buy
							if( xmf > 23.4227 )
								if( marron_mean <= -11.2745 )
									ret := -1.000000 // sell
								if( marron_mean > -11.2745 )
									ret := 0.166667
						if( azul_mean > 29.8157 )
							if( marron_mean <= -0.008857 )
								ret := 0.428571
							if( marron_mean > -0.008857 )
								ret := -1.000000 // sell
				if( source > 566.256 )
					if( nvi_ema <= 5.01439 )
						if( oscp <= -105.036 )
							if( pvimin <= -2.93276 )
								ret := -1.000000 // sell
							if( pvimin > -2.93276 )
								ret := 0.250000
						if( oscp > -105.036 )
							if( marron <= -0.561883 )
								if( marron_mean <= -14.6288 )
									ret := -0.259259
								if( marron_mean > -14.6288 )
									ret := 0.385768
							if( marron > -0.561883 )
								if( azul_mean <= 24.0815 )
									ret := -0.421053
								if( azul_mean > 24.0815 )
									ret := 0.666667
					if( nvi_ema > 5.01439 )
						if( nvimin <= 5.0119 )
							ret := -1.000000 // sell
						if( nvimin > 5.0119 )
							ret := -0.166667
			if( pvi > -2.06326 )
				if( BollOsc <= -52.1182 )
					if( tprice <= 254.346 )
						if( tprice <= 242.575 )
							if( tprice <= 224.91 )
								if( xrsi <= 11.4764 )
									ret := 1.000000 // buy
								if( xrsi > 11.4764 )
									ret := -0.584615
							if( tprice > 224.91 )
								if( azul_mean <= -13.753 )
									ret := 0.686275
								if( azul_mean > -13.753 )
									ret := 0.017857
						if( tprice > 242.575 )
							if( azul_mean <= 13.215 )
								if( verde_mean <= -6.21317 )
									ret := -0.724771 // sell
								if( verde_mean > -6.21317 )
									ret := 1.000000 // buy
							if( azul_mean > 13.215 )
								ret := 1.000000 // buy
					if( tprice > 254.346 )
						if( verde_azul <= -173.001 )
							if( source <= 290.41 )
								ret := -0.571429
							if( source > 290.41 )
								if( azul <= 2.75399 )
									ret := -0.666667
								if( azul > 2.75399 )
									ret := -1.000000 // sell
						if( verde_azul > -173.001 )
							if( source <= 267.65 )
								if( marron_mean <= -6.77945 )
									ret := 0.153846
								if( marron_mean > -6.77945 )
									ret := 0.779221 // buy
							if( source > 267.65 )
								if( oscp <= -23.1733 )
									ret := 0.154263
								if( oscp > -23.1733 )
									ret := 0.634146
				if( BollOsc > -52.1182 )
					if( azul_mean <= -0.128112 )
						if( verde_azul <= -25.3717 )
							if( nvimin <= 1.74707 )
								if( pvim <= 0.016803 )
									ret := 0.846154 // buy
								if( pvim > 0.016803 )
									ret := 0.000000
							if( nvimin > 1.74707 )
								ret := 0.000000
						if( verde_azul > -25.3717 )
							if( azul_mean <= -51.0011 )
								if( media <= 5.30767 )
									ret := -1.000000 // sell
								if( media > 5.30767 )
									ret := 0.000000
							if( azul_mean > -51.0011 )
								if( azul_mean <= -24.5835 )
									ret := 0.571429
								if( azul_mean > -24.5835 )
									ret := 0.027027
					if( azul_mean > -0.128112 )
						if( stoc <= 11.0242 )
							if( verde <= -39.3601 )
								if( pvi_ema <= -1.43469 )
									ret := -0.500000
								if( pvi_ema > -1.43469 )
									ret := -1.000000 // sell
							if( verde > -39.3601 )
								if( verde <= -32.338 )
									ret := 0.250000
								if( verde > -32.338 )
									ret := -0.250000
						if( stoc > 11.0242 )
							if( azul_mean <= 12.5843 )
								if( verde_mean <= -24.1062 )
									ret := 0.127660
								if( verde_mean > -24.1062 )
									ret := -1.000000 // sell
							if( azul_mean > 12.5843 )
								if( verde_azul <= -84.0084 )
									ret := -0.142857
								if( verde_azul > -84.0084 )
									ret := 0.684211
		if( xrsi > 24.0161 )
			if( nvimax <= 4.41299 )
				if( xmf <= 17.7754 )
					if( marron_mean <= 8.81411 )
						if( tprice <= 592.92 )
							if( xrsi <= 25.906 )
								if( marron_mean <= 4.03382 )
									ret := 0.293103
								if( marron_mean > 4.03382 )
									ret := -0.375000
							if( xrsi > 25.906 )
								if( nvimax <= 1.68779 )
									ret := -0.550725
								if( nvimax > 1.68779 )
									ret := -0.061538
						if( tprice > 592.92 )
							if( azul_mean <= 2.54502 )
								if( azul_mean <= -0.101932 )
									ret := -0.750000 // sell
								if( azul_mean > -0.101932 )
									ret := -1.000000 // sell
							if( azul_mean > 2.54502 )
								ret := 0.000000
					if( marron_mean > 8.81411 )
						if( marron <= -11.0563 )
							if( tprice <= 289.145 )
								if( oscp <= -36.4825 )
									ret := 0.000000
								if( oscp > -36.4825 )
									ret := 0.750000 // buy
							if( tprice > 289.145 )
								if( nvimax <= 1.73548 )
									ret := -0.500000
								if( nvimax > 1.73548 )
									ret := -1.000000 // sell
						if( marron > -11.0563 )
							if( xrsi <= 25.8908 )
								if( verde_azul <= -42.1903 )
									ret := -0.833333 // sell
								if( verde_azul > -42.1903 )
									ret := 0.600000
							if( xrsi > 25.8908 )
								if( source <= 291.683 )
									ret := -0.027778
								if( source > 291.683 )
									ret := 0.500000
				if( xmf > 17.7754 )
					if( marron_mean <= 74.3257 )
						if( pvimin <= 0.013358 )
							if( nvimin <= 0.54096 )
								if( verde_azul <= -53.3616 )
									ret := 0.034483
								if( verde_azul > -53.3616 )
									ret := 0.484733
							if( nvimin > 0.54096 )
								if( azul_mean <= 8.46418 )
									ret := 0.074398
								if( azul_mean > 8.46418 )
									ret := 0.274964
						if( pvimin > 0.013358 )
							ret := -1.000000 // sell
					if( marron_mean > 74.3257 )
						if( oscp <= -83.1951 )
							ret := 0.000000
						if( oscp > -83.1951 )
							if( marron <= 38.052 )
								ret := -1.000000 // sell
							if( marron > 38.052 )
								ret := -0.500000
			if( nvimax > 4.41299 )
				if( azul_mean <= 4.62525 )
					if( source <= 498.083 )
						if( nvim <= 4.90349 )
							ret := -1.000000 // sell
						if( nvim > 4.90349 )
							ret := -0.500000
					if( source > 498.083 )
						if( BollOsc <= -46.6635 )
							if( azul <= -2.2242 )
								if( pvimin <= -4.01756 )
									ret := 0.692308
								if( pvimin > -4.01756 )
									ret := 0.062500
							if( azul > -2.2242 )
								if( source <= 564.822 )
									ret := 0.076923
								if( source > 564.822 )
									ret := -0.933333 // sell
						if( BollOsc > -46.6635 )
							if( azul_mean <= 0.531364 )
								if( media <= 79.5536 )
									ret := 0.300000
								if( media > 79.5536 )
									ret := 1.000000 // buy
							if( azul_mean > 0.531364 )
								ret := 1.000000 // buy
				if( azul_mean > 4.62525 )
					if( media_azul <= -11.6891 )
						if( media <= 12.9935 )
							if( verde_mean <= -56.9174 )
								ret := -0.250000
							if( verde_mean > -56.9174 )
								ret := 0.000000
						if( media > 12.9935 )
							ret := 1.000000 // buy
					if( media_azul > -11.6891 )
						if( media <= 43.086 )
							if( source <= 483.733 )
								ret := 0.250000
							if( source > 483.733 )
								if( verde_media <= -59.3345 )
									ret := -0.780822 // sell
								if( verde_media > -59.3345 )
									ret := -0.272727
						if( media > 43.086 )
							if( verde_media <= -141.183 )
								if( oscp <= -133.672 )
									ret := -1.000000 // sell
								if( oscp > -133.672 )
									ret := -0.750000 // sell
							if( verde_media > -141.183 )
								if( xrsi <= 33.0593 )
									ret := -0.250000
								if( xrsi > 33.0593 )
									ret := 0.583333
	if( verde > -29.1545 )
		if( verde <= 175.659 )
			if( pvim <= -0.597518 )
				if( oscp <= -8.5011 )
					if( media <= 100.127 )
						if( pvimax <= -0.886925 )
							if( tprice <= 280.461 )
								if( source <= 243.372 )
									ret := 0.055882
								if( source > 243.372 )
									ret := -0.055396
							if( tprice > 280.461 )
								if( tprice <= 572.759 )
									ret := 0.126039
								if( tprice > 572.759 )
									ret := 0.001233
						if( pvimax > -0.886925 )
							if( tprice <= 215.312 )
								if( BollOsc <= -55.7764 )
									ret := -0.500000
								if( BollOsc > -55.7764 )
									ret := 0.657895
							if( tprice > 215.312 )
								if( nvim <= 0.175515 )
									ret := -0.313869
								if( nvim > 0.175515 )
									ret := 0.158041
					if( media > 100.127 )
						if( source <= 288.545 )
							if( nvi <= 0.586237 )
								ret := 0.666667
							if( nvi > 0.586237 )
								if( verde_media <= -26.5402 )
									ret := 0.000000
								if( verde_media > -26.5402 )
									ret := -0.250000
						if( source > 288.545 )
							if( xrsi <= 58.6933 )
								if( stoc <= 78.7927 )
									ret := 0.714286 // buy
								if( stoc > 78.7927 )
									ret := -0.333333
							if( xrsi > 58.6933 )
								if( verde <= 86.127 )
									ret := 0.857143 // buy
								if( verde > 86.127 )
									ret := 0.000000
				if( oscp > -8.5011 )
					if( source <= 582.994 )
						if( pvi <= -2.54356 )
							if( tprice <= 518.423 )
								if( nvimax <= 2.86231 )
									ret := 0.041121
								if( nvimax > 2.86231 )
									ret := 0.233932
							if( tprice > 518.423 )
								if( marron <= 17.9346 )
									ret := -0.305970
								if( marron > 17.9346 )
									ret := 0.053533
						if( pvi > -2.54356 )
							if( verde <= 100.768 )
								if( marron_mean <= 87.6496 )
									ret := 0.030570
								if( marron_mean > 87.6496 )
									ret := 0.114270
							if( verde > 100.768 )
								if( verde_mean <= 123.747 )
									ret := -0.060112
								if( verde_mean > 123.747 )
									ret := 0.049936
					if( source > 582.994 )
						if( azul <= 5.69807 )
							if( pvi <= -3.01487 )
								if( azul <= -12.9844 )
									ret := 0.109620
								if( azul > -12.9844 )
									ret := -0.145683
							if( pvi > -3.01487 )
								if( nvim <= 3.55643 )
									ret := -0.095406
								if( nvim > 3.55643 )
									ret := 0.108356
						if( azul > 5.69807 )
							if( xrsi <= 54.8467 )
								if( verde_media <= 0.063835 )
									ret := -0.061017
								if( verde_media > 0.063835 )
									ret := -0.401274
							if( xrsi > 54.8467 )
								if( tprice <= 604.537 )
									ret := 0.002988
								if( tprice > 604.537 )
									ret := -0.207358
			if( pvim > -0.597518 )
				if( tprice <= 246.283 )
					if( source <= 220.501 )
						if( azul_mean <= -4.22957 )
							if( pvimax <= -0.593497 )
								ret := 0.750000 // buy
							if( pvimax > -0.593497 )
								ret := 1.000000 // buy
						if( azul_mean > -4.22957 )
							if( azul <= 10.754 )
								if( BollOsc <= -51.7716 )
									ret := 1.000000 // buy
								if( BollOsc > -51.7716 )
									ret := -0.625000
							if( azul > 10.754 )
								if( nvi_ema <= 0.070778 )
									ret := 0.500000
								if( nvi_ema > 0.070778 )
									ret := 1.000000 // buy
					if( source > 220.501 )
						if( nvim <= 0.143629 )
							if( nvi_ema <= 0.075949 )
								if( source <= 235.55 )
									ret := 0.560000
								if( source > 235.55 )
									ret := -1.000000 // sell
							if( nvi_ema > 0.075949 )
								if( oscp <= 15.2137 )
									ret := -0.729008 // sell
								if( oscp > 15.2137 )
									ret := 0.019231
						if( nvim > 0.143629 )
							if( BollOsc <= 43.243 )
								if( nvi_ema <= 0.172196 )
									ret := 0.095101
								if( nvi_ema > 0.172196 )
									ret := -0.222543
							if( BollOsc > 43.243 )
								if( marron <= 120.019 )
									ret := -0.692308
								if( marron > 120.019 )
									ret := 0.125000
				if( tprice > 246.283 )
					if( xrsi <= 63.2342 )
						if( stoc <= 92.2639 )
							if( pvi_ema <= 0.038582 )
								if( azul <= 69.0811 )
									ret := 0.012197
								if( azul > 69.0811 )
									ret := 0.580645
							if( pvi_ema > 0.038582 )
								if( pvimax <= 0.050304 )
									ret := 0.200000
								if( pvimax > 0.050304 )
									ret := -1.000000 // sell
						if( stoc > 92.2639 )
							if( pvimin <= -0.431023 )
								ret := 1.000000 // buy
							if( pvimin > -0.431023 )
								ret := 0.285714
					if( xrsi > 63.2342 )
						if( verde_azul <= 116.126 )
							if( marron <= 111.301 )
								if( azul <= 33.377 )
									ret := -0.263251
								if( azul > 33.377 )
									ret := 0.409836
							if( marron > 111.301 )
								if( xmf <= 65.2767 )
									ret := 0.833333 // buy
								if( xmf > 65.2767 )
									ret := -0.621795
						if( verde_azul > 116.126 )
							if( verde <= 161.553 )
								if( pvimin <= -0.243071 )
									ret := -0.044199
								if( pvimin > -0.243071 )
									ret := 0.315789
							if( verde > 161.553 )
								if( BollOsc <= 70.4063 )
									ret := -0.263158
								if( BollOsc > 70.4063 )
									ret := -0.965517 // sell
		if( verde > 175.659 )
			if( pvimax <= -1.61822 )
				if( source <= 244.05 )
					if( BollOsc <= 79.2936 )
						if( azul_mean <= 11.3515 )
							if( verde_azul <= 229.262 )
								if( verde_mean <= 186.76 )
									ret := -0.548387
								if( verde_mean > 186.76 )
									ret := 0.222222
							if( verde_azul > 229.262 )
								if( stoc <= 83.9384 )
									ret := 0.391304
								if( stoc > 83.9384 )
									ret := -0.750000 // sell
						if( azul_mean > 11.3515 )
							if( azul <= 29.7123 )
								if( tprice <= 220.557 )
									ret := -0.187500
								if( tprice > 220.557 )
									ret := 0.720000 // buy
							if( azul > 29.7123 )
								if( pvi <= -2.25111 )
									ret := 0.000000
								if( pvi > -2.25111 )
									ret := -0.750000 // sell
					if( BollOsc > 79.2936 )
						if( source <= 218.717 )
							if( pvi_ema <= -2.23574 )
								if( azul <= -8.97224 )
									ret := 0.000000
								if( azul > -8.97224 )
									ret := -0.833333 // sell
							if( pvi_ema > -2.23574 )
								ret := 0.000000
						if( source > 218.717 )
							if( media <= 66.2048 )
								ret := -0.200000
							if( media > 66.2048 )
								if( pvi <= -2.41364 )
									ret := -0.500000
								if( pvi > -2.41364 )
									ret := -0.961538 // sell
				if( source > 244.05 )
					if( stoc <= 71.1224 )
						if( tprice <= 561.225 )
							if( azul_mean <= -40.3654 )
								ret := 0.000000
							if( azul_mean > -40.3654 )
								if( nvi_ema <= 1.83937 )
									ret := 0.500000
								if( nvi_ema > 1.83937 )
									ret := 0.916667 // buy
						if( tprice > 561.225 )
							if( marron <= 123.057 )
								ret := 0.600000
							if( marron > 123.057 )
								ret := -0.200000
					if( stoc > 71.1224 )
						if( pvi <= -2.53511 )
							if( xrsi <= 77.7769 )
								if( pvimin <= -2.59705 )
									ret := 0.444444
								if( pvimin > -2.59705 )
									ret := -0.818182 // sell
							if( xrsi > 77.7769 )
								if( verde <= 215.178 )
									ret := -0.261364
								if( verde > 215.178 )
									ret := 0.274194
						if( pvi > -2.53511 )
							if( pvi <= -2.46609 )
								if( BollOsc <= 70.2762 )
									ret := 0.875000 // buy
								if( BollOsc > 70.2762 )
									ret := 0.000000
							if( pvi > -2.46609 )
								if( oscp <= 57.1071 )
									ret := 0.473684
								if( oscp > 57.1071 )
									ret := -0.117647
			if( pvimax > -1.61822 )
				if( media <= 87.0619 )
					if( verde_azul <= 108.729 )
						ret := -1.000000 // sell
					if( verde_azul > 108.729 )
						if( media_azul <= 86.9749 )
							if( azul_mean <= 2.46326 )
								if( pvi <= -0.591221 )
									ret := -0.200000
								if( pvi > -0.591221 )
									ret := 0.687500
							if( azul_mean > 2.46326 )
								if( verde <= 196.276 )
									ret := 0.111111
								if( verde > 196.276 )
									ret := 0.688525
						if( media_azul > 86.9749 )
							if( pvi <= -0.842588 )
								if( verde <= 209.684 )
									ret := 0.500000
								if( verde > 209.684 )
									ret := -0.600000
							if( pvi > -0.842588 )
								if( azul_mean <= -13.7724 )
									ret := -1.000000 // sell
								if( azul_mean > -13.7724 )
									ret := -0.636364
				if( media > 87.0619 )
					if( pvi <= -0.551533 )
						if( marron_mean <= 138.916 )
							if( stoc <= 61.3118 )
								ret := -1.000000 // sell
							if( stoc > 61.3118 )
								if( marron <= 126.975 )
									ret := 0.766082 // buy
								if( marron > 126.975 )
									ret := 0.533981
						if( marron_mean > 138.916 )
							if( marron_mean <= 143.78 )
								if( stoc <= 91.9358 )
									ret := -0.333333
								if( stoc > 91.9358 )
									ret := 0.500000
							if( marron_mean > 143.78 )
								ret := -0.833333 // sell
					if( pvi > -0.551533 )
						if( marron <= 125.778 )
							if( verde_media <= 98.9033 )
								ret := 0.400000
							if( verde_media > 98.9033 )
								ret := 1.000000 // buy
						if( marron > 125.778 )
							if( nvi <= 0.047736 )
								if( verde_media <= 128.733 )
									ret := -0.333333
								if( verde_media > 128.733 )
									ret := 0.750000 // buy
							if( nvi > 0.047736 )
								if( verde_azul <= 197.764 )
									ret := -1.000000 // sell
								if( verde_azul > 197.764 )
									ret := -0.375000
	
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
float op_operation = decision_tree_0_BNBUSDT_15Min_3c323788(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


