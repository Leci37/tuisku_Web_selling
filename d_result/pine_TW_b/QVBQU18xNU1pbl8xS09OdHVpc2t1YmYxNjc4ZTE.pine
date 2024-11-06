//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: APPS_15Min_1KON_bf1678e1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_15Min_1KON_bf1678e1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_15Min_bf1678e1(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( azul_mean <= 1.85375 )
		if( source <= 14.9963 )
			if( verde_azul <= 34.8273 )
				if( media_azul <= 62.109 )
					if( azul <= -4.10551 )
						if( marron_mean <= 6.43415 )
							if( BollOsc <= -39.9013 )
								if( nvi_ema <= 2.92839 )
									ret := 0.643678
								if( nvi_ema > 2.92839 )
									ret := 0.293103
							if( BollOsc > -39.9013 )
								if( nvimax <= 1.57523 )
									ret := -0.594203
								if( nvimax > 1.57523 )
									ret := 0.171429
						if( marron_mean > 6.43415 )
							if( xmf <= 65.1311 )
								if( verde_media <= -28.1108 )
									ret := 0.262934
								if( verde_media > -28.1108 )
									ret := 0.049519
							if( xmf > 65.1311 )
								if( verde_azul <= -2.53228 )
									ret := -0.904762 // sell
								if( verde_azul > -2.53228 )
									ret := -0.393939
					if( azul > -4.10551 )
						if( pvimax <= 0.506765 )
							if( verde <= 45.9811 )
								if( nvimin <= 7.92963 )
									ret := -0.057064
								if( nvimin > 7.92963 )
									ret := 0.115385
							if( verde > 45.9811 )
								if( verde_azul <= 31.7079 )
									ret := -0.813953 // sell
								if( verde_azul > 31.7079 )
									ret := -0.076923
						if( pvimax > 0.506765 )
							if( pvi_ema <= 1.73656 )
								if( verde_media <= -71.4634 )
									ret := -0.238095
								if( verde_media > -71.4634 )
									ret := 0.252240
							if( pvi_ema > 1.73656 )
								if( nvi_ema <= -0.054232 )
									ret := -0.866667 // sell
								if( nvi_ema > -0.054232 )
									ret := -0.375000
				if( media_azul > 62.109 )
					if( tprice <= 1.50486 )
						if( oscp <= -28.4925 )
							ret := 0.500000
						if( oscp > -28.4925 )
							if( pvim <= 0.75004 )
								if( azul <= -4.40787 )
									ret := 0.969388 // buy
								if( azul > -4.40787 )
									ret := 0.724138 // buy
							if( pvim > 0.75004 )
								if( pvi <= 0.793855 )
									ret := 0.272727
								if( pvi > 0.793855 )
									ret := 0.800000 // buy
					if( tprice > 1.50486 )
						if( nvim <= 7.78722 )
							if( BollOsc <= -74.9962 )
								if( verde_media <= -79.0252 )
									ret := 0.648649
								if( verde_media > -79.0252 )
									ret := 0.926471 // buy
							if( BollOsc > -74.9962 )
								if( pvimin <= 1.33821 )
									ret := 0.430314
								if( pvimin > 1.33821 )
									ret := -0.054795
						if( nvim > 7.78722 )
							if( nvim <= 7.92277 )
								if( verde <= -20.9904 )
									ret := -0.882353 // sell
								if( verde > -20.9904 )
									ret := 0.090909
							if( nvim > 7.92277 )
								if( verde_mean <= 31.6449 )
									ret := 0.006410
								if( verde_mean > 31.6449 )
									ret := 0.429864
			if( verde_azul > 34.8273 )
				if( verde_media <= 17.6446 )
					if( BollOsc <= -66.4528 )
						if( verde <= -15.6466 )
							if( xmf <= 22.0201 )
								ret := 0.250000
							if( xmf > 22.0201 )
								if( xmf <= 32.0763 )
									ret := -1.000000 // sell
								if( xmf > 32.0763 )
									ret := -0.555556
						if( verde > -15.6466 )
							if( azul_mean <= -23.2323 )
								if( marron <= 6.17597 )
									ret := 0.640000
								if( marron > 6.17597 )
									ret := 0.153846
							if( azul_mean > -23.2323 )
								if( azul <= -25.2766 )
									ret := 0.968421 // buy
								if( azul > -25.2766 )
									ret := 0.428571
					if( BollOsc > -66.4528 )
						if( nvimin <= 0.122545 )
							if( media_azul <= 69.4745 )
								if( marron <= 63.1519 )
									ret := 0.076779
								if( marron > 63.1519 )
									ret := -0.346774
							if( media_azul > 69.4745 )
								if( pvimax <= 0.445085 )
									ret := 0.680000
								if( pvimax > 0.445085 )
									ret := 0.285526
						if( nvimin > 0.122545 )
							if( xmf <= 64.8269 )
								if( verde_mean <= 22.8543 )
									ret := 0.263619
								if( verde_mean > 22.8543 )
									ret := 0.037116
							if( xmf > 64.8269 )
								if( stoc <= 38.7394 )
									ret := -0.035040
								if( stoc > 38.7394 )
									ret := 0.222534
				if( verde_media > 17.6446 )
					if( media_azul <= 90.714 )
						if( verde_mean <= 132.235 )
							if( azul <= -42.314 )
								if( pvi <= 0.170655 )
									ret := 0.671233
								if( pvi > 0.170655 )
									ret := 0.035714
							if( azul > -42.314 )
								if( oscp <= 34.9582 )
									ret := -0.157923
								if( oscp > 34.9582 )
									ret := -0.385556
						if( verde_mean > 132.235 )
							if( media <= 83.7191 )
								if( marron_mean <= 109.695 )
									ret := 0.529730
								if( marron_mean > 109.695 )
									ret := -0.375000
							if( media > 83.7191 )
								if( media_azul <= 86.63 )
									ret := 0.218182
								if( media_azul > 86.63 )
									ret := -0.541667
					if( media_azul > 90.714 )
						if( source <= 12.6336 )
							if( marron <= 115.272 )
								if( nvimax <= 0.196551 )
									ret := 0.354108
								if( nvimax > 0.196551 )
									ret := 0.080000
							if( marron > 115.272 )
								if( verde_mean <= 163.709 )
									ret := -0.301818
								if( verde_mean > 163.709 )
									ret := 0.259615
						if( source > 12.6336 )
							if( media_azul <= 118.677 )
								if( verde_media <= 22.6894 )
									ret := -0.450000
								if( verde_media > 22.6894 )
									ret := 0.752000 // buy
							if( media_azul > 118.677 )
								if( media <= 94.563 )
									ret := 0.600000
								if( media > 94.563 )
									ret := -0.750000 // sell
		if( source > 14.9963 )
			if( media <= 94.7047 )
				if( verde_azul <= 97.6581 )
					if( nvi <= 4.71422 )
						if( pvi_ema <= 0.794354 )
							if( tprice <= 24.971 )
								if( verde <= 62.0085 )
									ret := 0.672727
								if( verde > 62.0085 )
									ret := 0.033333
							if( tprice > 24.971 )
								ret := 1.000000 // buy
						if( pvi_ema > 0.794354 )
							if( nvi_ema <= 4.02829 )
								if( pvim <= 0.965543 )
									ret := 0.304348
								if( pvim > 0.965543 )
									ret := 0.925000 // buy
							if( nvi_ema > 4.02829 )
								if( azul_mean <= -4.75197 )
									ret := -0.015198
								if( azul_mean > -4.75197 )
									ret := 0.346429
					if( nvi > 4.71422 )
						if( media_azul <= 36.029 )
							if( stoc <= 19.0218 )
								if( azul <= -1.7807 )
									ret := 0.087028
								if( azul > -1.7807 )
									ret := -0.221411
							if( stoc > 19.0218 )
								if( pvimax <= 0.50635 )
									ret := -0.252971
								if( pvimax > 0.50635 )
									ret := 0.126984
						if( media_azul > 36.029 )
							if( xmf <= 80.7596 )
								if( marron_mean <= 16.7808 )
									ret := 0.133503
								if( marron_mean > 16.7808 )
									ret := -0.024994
							if( xmf > 80.7596 )
								if( nvi_ema <= 7.95867 )
									ret := 0.415512
								if( nvi_ema > 7.95867 )
									ret := -0.080357
				if( verde_azul > 97.6581 )
					if( verde_azul <= 202.493 )
						if( verde <= 120.49 )
							if( xrsi <= 58.6742 )
								if( nvim <= 4.23217 )
									ret := 0.807692 // buy
								if( nvim > 4.23217 )
									ret := -0.251340
							if( xrsi > 58.6742 )
								if( stoc <= 80.3003 )
									ret := -0.214133
								if( stoc > 80.3003 )
									ret := 0.099099
						if( verde > 120.49 )
							if( source <= 52.119 )
								if( pvi <= -1.65196 )
									ret := 0.200000
								if( pvi > -1.65196 )
									ret := -0.447368
							if( source > 52.119 )
								if( verde_media <= 73.6745 )
									ret := -0.010753
								if( verde_media > 73.6745 )
									ret := 0.536232
					if( verde_azul > 202.493 )
						if( BollOsc <= 24.043 )
							if( xrsi <= 47.8654 )
								ret := 0.214286
							if( xrsi > 47.8654 )
								if( stoc <= 45.9764 )
									ret := -1.000000 // sell
								if( stoc > 45.9764 )
									ret := -0.083333
						if( BollOsc > 24.043 )
							if( xmf <= 47.6471 )
								ret := -0.222222
							if( xmf > 47.6471 )
								if( verde_mean <= 156.181 )
									ret := 0.732394 // buy
								if( verde_mean > 156.181 )
									ret := 0.227273
			if( media > 94.7047 )
				if( pvi_ema <= 0.907081 )
					if( oscp <= 16.7921 )
						if( xrsi <= 78.508 )
							if( azul <= -9.94899 )
								if( source <= 81.7835 )
									ret := 0.427673
								if( source > 81.7835 )
									ret := -0.888889 // sell
							if( azul > -9.94899 )
								if( verde_mean <= 134.389 )
									ret := -0.013477
								if( verde_mean > 134.389 )
									ret := 0.565217
						if( xrsi > 78.508 )
							ret := -0.800000 // sell
					if( oscp > 16.7921 )
						if( azul <= -1.32257 )
							if( pvimax <= -0.544738 )
								if( nvimin <= 8.20232 )
									ret := 0.372642
								if( nvimin > 8.20232 )
									ret := -0.208333
							if( pvimax > -0.544738 )
								if( marron <= 117.182 )
									ret := 0.715481 // buy
								if( marron > 117.182 )
									ret := 0.181818
						if( azul > -1.32257 )
							if( xmf <= 98.1008 )
								if( source <= 21.4992 )
									ret := 0.607143
								if( source > 21.4992 )
									ret := -0.119565
							if( xmf > 98.1008 )
								if( oscp <= 39.3345 )
									ret := -0.200000
								if( oscp > 39.3345 )
									ret := -0.761905 // sell
				if( pvi_ema > 0.907081 )
					if( pvimax <= 0.97886 )
						if( azul_mean <= -6.5514 )
							ret := -1.000000 // sell
						if( azul_mean > -6.5514 )
							ret := -0.818182 // sell
					if( pvimax > 0.97886 )
						if( stoc <= 77.7785 )
							ret := 0.250000
						if( stoc > 77.7785 )
							ret := -0.705882 // sell
	if( azul_mean > 1.85375 )
		if( verde <= 51.4757 )
			if( azul <= 97.1224 )
				if( nvimax <= 8.21333 )
					if( media <= 45.7971 )
						if( oscp <= -32.8088 )
							if( verde <= -41.6307 )
								if( pvimin <= -2.79659 )
									ret := -0.151515
								if( pvimin > -2.79659 )
									ret := 0.374036
							if( verde > -41.6307 )
								if( source <= 1.55196 )
									ret := 0.560345
								if( source > 1.55196 )
									ret := 0.001754
						if( oscp > -32.8088 )
							if( tprice <= 16.839 )
								if( oscp <= 5.31948 )
									ret := 0.002217
								if( oscp > 5.31948 )
									ret := -0.770833 // sell
							if( tprice > 16.839 )
								if( verde_mean <= -18.9354 )
									ret := -0.441520
								if( verde_mean > -18.9354 )
									ret := -0.114101
					if( media > 45.7971 )
						if( verde_media <= -58.7355 )
							if( pvimax <= 0.471097 )
								if( oscp <= -101.876 )
									ret := -0.740741 // sell
								if( oscp > -101.876 )
									ret := 0.220513
							if( pvimax > 0.471097 )
								if( azul <= -0.138787 )
									ret := -0.200000
								if( azul > -0.138787 )
									ret := 0.581930
						if( verde_media > -58.7355 )
							if( tprice <= 1.09354 )
								if( media_azul <= 15.2874 )
									ret := -0.535714
								if( media_azul > 15.2874 )
									ret := 0.393182
							if( tprice > 1.09354 )
								if( source <= 2.55333 )
									ret := -0.138868
								if( source > 2.55333 )
									ret := 0.074133
				if( nvimax > 8.21333 )
					if( pvimin <= -2.41133 )
						if( pvi <= -3.59029 )
							if( verde_mean <= 32.0794 )
								if( verde_mean <= 6.67209 )
									ret := 0.294118
								if( verde_mean > 6.67209 )
									ret := 0.875000 // buy
							if( verde_mean > 32.0794 )
								if( nvim <= 8.23635 )
									ret := -0.375000
								if( nvim > 8.23635 )
									ret := 0.076923
						if( pvi > -3.59029 )
							if( media <= 16.451 )
								if( nvimin <= 8.19391 )
									ret := 0.923077 // buy
								if( nvimin > 8.19391 )
									ret := 0.170940
							if( media > 16.451 )
								if( verde_media <= -84.7099 )
									ret := 0.368421
								if( verde_media > -84.7099 )
									ret := -0.187144
					if( pvimin > -2.41133 )
						if( verde_azul <= 2.38999 )
							if( verde_azul <= -22.6352 )
								ret := -0.700000 // sell
							if( verde_azul > -22.6352 )
								ret := -0.150000
						if( verde_azul > 2.38999 )
							if( pvimin <= -2.3446 )
								ret := -1.000000 // sell
							if( pvimin > -2.3446 )
								ret := -0.571429
			if( azul > 97.1224 )
				if( source <= 8.166 )
					if( verde <= -122.022 )
						ret := -0.111111
					if( verde > -122.022 )
						if( verde_mean <= 18.5434 )
							ret := -1.000000 // sell
						if( verde_mean > 18.5434 )
							if( verde_media <= -20.3401 )
								if( oscp <= -39.5766 )
									ret := -0.833333 // sell
								if( oscp > -39.5766 )
									ret := -1.000000 // sell
							if( verde_media > -20.3401 )
								ret := -0.583333
				if( source > 8.166 )
					if( marron <= 42.0874 )
						if( tprice <= 49.6876 )
							if( tprice <= 13.39 )
								ret := 0.500000
							if( tprice > 13.39 )
								ret := 1.000000 // buy
						if( tprice > 49.6876 )
							ret := 0.083333
					if( marron > 42.0874 )
						if( stoc <= 49.75 )
							ret := -0.125000
						if( stoc > 49.75 )
							if( verde_azul <= -114.942 )
								ret := -0.625000
							if( verde_azul > -114.942 )
								ret := -1.000000 // sell
		if( verde > 51.4757 )
			if( pvi <= -0.693191 )
				if( media_azul <= 51.0694 )
					if( azul <= 19.3259 )
						if( pvimin <= -3.62341 )
							if( stoc <= 27.4981 )
								ret := -0.866667 // sell
							if( stoc > 27.4981 )
								if( marron_mean <= 54.4895 )
									ret := 0.864865 // buy
								if( marron_mean > 54.4895 )
									ret := 0.113208
						if( pvimin > -3.62341 )
							if( verde <= 90.2276 )
								if( marron_mean <= 30.4694 )
									ret := 0.555556
								if( marron_mean > 30.4694 )
									ret := -0.141600
							if( verde > 90.2276 )
								if( nvi_ema <= 8.31332 )
									ret := -0.374707
								if( nvi_ema > 8.31332 )
									ret := 0.666667
					if( azul > 19.3259 )
						if( nvimin <= 5.60959 )
							if( xrsi <= 68.1207 )
								if( nvimin <= 5.24391 )
									ret := -0.479452
								if( nvimin > 5.24391 )
									ret := -0.941176 // sell
							if( xrsi > 68.1207 )
								ret := -1.000000 // sell
						if( nvimin > 5.60959 )
							if( pvi <= -3.39949 )
								if( verde_mean <= 148.513 )
									ret := -0.616715
								if( verde_mean > 148.513 )
									ret := 0.461538
							if( pvi > -3.39949 )
								if( pvi <= -1.62716 )
									ret := -0.264819
								if( pvi > -1.62716 )
									ret := 0.009112
				if( media_azul > 51.0694 )
					if( azul <= 0.120721 )
						if( azul <= -25.6344 )
							if( media <= 60.5339 )
								ret := -0.600000
							if( media > 60.5339 )
								if( oscp <= 24.8755 )
									ret := 0.898305 // buy
								if( oscp > 24.8755 )
									ret := 0.176471
						if( azul > -25.6344 )
							if( oscp <= 37.8599 )
								if( xmf <= 69.476 )
									ret := -0.060201
								if( xmf > 69.476 )
									ret := 0.369492
							if( oscp > 37.8599 )
								if( verde_mean <= 182.807 )
									ret := -0.535211
								if( verde_mean > 182.807 )
									ret := 0.148148
					if( azul > 0.120721 )
						if( xrsi <= 75.0471 )
							if( stoc <= 78.1407 )
								if( nvimin <= 8.185 )
									ret := -0.206211
								if( nvimin > 8.185 )
									ret := 0.014535
							if( stoc > 78.1407 )
								if( verde_media <= 62.3016 )
									ret := -0.072940
								if( verde_media > 62.3016 )
									ret := 0.327935
						if( xrsi > 75.0471 )
							if( tprice <= 38.5156 )
								if( verde_mean <= 163.474 )
									ret := -0.296012
								if( verde_mean > 163.474 )
									ret := -0.638655
							if( tprice > 38.5156 )
								if( azul_mean <= 12.9116 )
									ret := 0.350000
								if( azul_mean > 12.9116 )
									ret := -0.326316
			if( pvi > -0.693191 )
				if( verde_azul <= 4.56686 )
					if( pvimax <= 1.56396 )
						if( verde_mean <= 68.653 )
							if( source <= 63.8582 )
								if( BollOsc <= 25.6704 )
									ret := -0.717391 // sell
								if( BollOsc > 25.6704 )
									ret := -0.946154 // sell
							if( source > 63.8582 )
								if( xrsi <= 59.5948 )
									ret := -0.863636 // sell
								if( xrsi > 59.5948 )
									ret := 0.000000
						if( verde_mean > 68.653 )
							if( verde <= 57.5557 )
								ret := 0.444444
							if( verde > 57.5557 )
								if( verde_azul <= -1.33899 )
									ret := -0.760000 // sell
								if( verde_azul > -1.33899 )
									ret := -0.055556
					if( pvimax > 1.56396 )
						ret := 0.375000
				if( verde_azul > 4.56686 )
					if( nvimin <= 1.08452 )
						if( verde <= 141.027 )
							if( media_azul <= 91.767 )
								if( verde_mean <= 29.4773 )
									ret := -0.675676
								if( verde_mean > 29.4773 )
									ret := -0.116671
							if( media_azul > 91.767 )
								if( stoc <= 92.5144 )
									ret := 0.264605
								if( stoc > 92.5144 )
									ret := -0.631579
						if( verde > 141.027 )
							if( media_azul <= 61.2932 )
								if( source <= 1.25663 )
									ret := -0.769231 // sell
								if( source > 1.25663 )
									ret := -0.975000 // sell
							if( media_azul > 61.2932 )
								if( verde_media <= 59.7439 )
									ret := 0.065789
								if( verde_media > 59.7439 )
									ret := -0.442922
					if( nvimin > 1.08452 )
						if( BollOsc <= 39.9185 )
							if( media <= 92.2603 )
								if( azul <= 17.6309 )
									ret := 0.077029
								if( azul > 17.6309 )
									ret := -0.117073
							if( media > 92.2603 )
								if( nvi <= 6.03517 )
									ret := 0.305660
								if( nvi > 6.03517 )
									ret := -0.120200
						if( BollOsc > 39.9185 )
							if( stoc <= 58.033 )
								if( media <= 58.9811 )
									ret := -0.812500 // sell
								if( media > 58.9811 )
									ret := -0.310000
							if( stoc > 58.033 )
								if( media <= 95.0932 )
									ret := -0.007486
								if( media > 95.0932 )
									ret := -0.233099
	
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
float op_operation = decision_tree_0_APPS_15Min_bf1678e1(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


