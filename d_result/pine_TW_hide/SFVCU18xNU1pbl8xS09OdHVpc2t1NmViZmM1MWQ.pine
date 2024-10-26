//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: HUBS_15Min_1KON_6ebfc51d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_15Min_1KON_6ebfc51d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_15Min_6ebfc51d(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( nvi <= 2.28394 )
		if( media_azul <= 19.0696 )
			if( xrsi <= 33.9802 )
				if( marron_mean <= -4.39674 )
					if( nvimax <= 2.09447 )
						if( pvimax <= 0.27569 )
							if( azul <= -18.6773 )
								ret := 1.000000 // buy
							if( azul > -18.6773 )
								ret := 0.000000
						if( pvimax > 0.27569 )
							if( media <= -10.2532 )
								ret := 0.400000
							if( media > -10.2532 )
								if( xrsi <= 13.8063 )
									ret := -0.906977 // sell
								if( xrsi > 13.8063 )
									ret := -0.532468
					if( nvimax > 2.09447 )
						if( nvi_ema <= 2.23474 )
							if( marron_mean <= -6.42859 )
								if( media <= 4.54523 )
									ret := 0.750000 // buy
								if( media > 4.54523 )
									ret := 1.000000 // buy
							if( marron_mean > -6.42859 )
								ret := 0.200000
						if( nvi_ema > 2.23474 )
							if( azul_mean <= -19.0107 )
								ret := 0.000000
							if( azul_mean > -19.0107 )
								ret := -1.000000 // sell
				if( marron_mean > -4.39674 )
					if( verde_mean <= -4.44681 )
						if( tprice <= 271.731 )
							if( nvim <= -0.058117 )
								if( tprice <= 66.7602 )
									ret := 0.090909
								if( tprice > 66.7602 )
									ret := -0.800000 // sell
							if( nvim > -0.058117 )
								if( azul_mean <= 37.1981 )
									ret := 0.503650
								if( azul_mean > 37.1981 )
									ret := -0.461538
						if( tprice > 271.731 )
							if( tprice <= 406.956 )
								if( azul_mean <= 5.30558 )
									ret := -0.254386
								if( azul_mean > 5.30558 )
									ret := 0.411765
							if( tprice > 406.956 )
								if( pvimax <= 0.867448 )
									ret := 0.800000 // buy
								if( pvimax > 0.867448 )
									ret := -0.117647
					if( verde_mean > -4.44681 )
						if( azul <= -4.61124 )
							if( nvim <= 0.682853 )
								if( pvimin <= 0.241372 )
									ret := 0.500000
								if( pvimin > 0.241372 )
									ret := 0.000000
							if( nvim > 0.682853 )
								if( xmf <= 30.0329 )
									ret := 0.947368 // buy
								if( xmf > 30.0329 )
									ret := 0.200000
						if( azul > -4.61124 )
							if( marron <= 18.9377 )
								if( media <= 8.12643 )
									ret := 0.600000
								if( media > 8.12643 )
									ret := -0.714286 // sell
							if( marron > 18.9377 )
								if( source <= 173.014 )
									ret := -0.155556
								if( source > 173.014 )
									ret := 0.403846
			if( xrsi > 33.9802 )
				if( verde_mean <= -47.736 )
					if( nvi <= 0.845403 )
						if( media_azul <= 13.9956 )
							if( marron_mean <= 14.7748 )
								ret := 0.000000
							if( marron_mean > 14.7748 )
								ret := -0.250000
						if( media_azul > 13.9956 )
							ret := 0.500000
					if( nvi > 0.845403 )
						if( nvi_ema <= 2.14114 )
							if( BollOsc <= -36.816 )
								if( nvim <= 1.92199 )
									ret := -1.000000 // sell
								if( nvim > 1.92199 )
									ret := -0.666667
							if( BollOsc > -36.816 )
								ret := -1.000000 // sell
						if( nvi_ema > 2.14114 )
							ret := 0.000000
				if( verde_mean > -47.736 )
					if( verde_media <= -16.9657 )
						if( verde_media <= -41.6083 )
							if( verde_azul <= -33.4516 )
								if( nvim <= 0.025315 )
									ret := 0.764706 // buy
								if( nvim > 0.025315 )
									ret := -0.116667
							if( verde_azul > -33.4516 )
								if( marron_mean <= 25.1411 )
									ret := -0.911765 // sell
								if( marron_mean > 25.1411 )
									ret := 0.200000
						if( verde_media > -41.6083 )
							if( verde_azul <= -85.1847 )
								if( nvi_ema <= 0.097981 )
									ret := -1.000000 // sell
								if( nvi_ema > 0.097981 )
									ret := -0.250000
							if( verde_azul > -85.1847 )
								if( BollOsc <= -41.689 )
									ret := -0.750000 // sell
								if( BollOsc > -41.689 )
									ret := 0.261364
					if( verde_media > -16.9657 )
						if( source <= 428.924 )
							if( pvimin <= 0.658409 )
								if( pvi_ema <= 0.542895 )
									ret := -0.208383
								if( pvi_ema > 0.542895 )
									ret := 0.144578
							if( pvimin > 0.658409 )
								if( stoc <= 72.8676 )
									ret := -0.258760
								if( stoc > 72.8676 )
									ret := -0.652174
						if( source > 428.924 )
							if( verde_mean <= -2.22318 )
								if( source <= 458.109 )
									ret := 1.000000 // buy
								if( source > 458.109 )
									ret := -0.526316
							if( verde_mean > -2.22318 )
								if( xmf <= 63.0909 )
									ret := 0.258706
								if( xmf > 63.0909 )
									ret := -0.227273
		if( media_azul > 19.0696 )
			if( media <= 7.21121 )
				if( source <= 306.014 )
					if( nvimax <= -0.067952 )
						if( pvim <= 0.329827 )
							if( verde <= -6.11122 )
								ret := 0.250000
							if( verde > -6.11122 )
								ret := 0.000000
						if( pvim > 0.329827 )
							ret := -0.750000 // sell
					if( nvimax > -0.067952 )
						if( marron <= 16.9646 )
							if( xmf <= 13.9916 )
								if( pvim <= 0.38689 )
									ret := 0.833333 // buy
								if( pvim > 0.38689 )
									ret := 0.235294
							if( xmf > 13.9916 )
								if( verde_media <= 15.5206 )
									ret := 0.872549 // buy
								if( verde_media > 15.5206 )
									ret := 0.200000
						if( marron > 16.9646 )
							ret := -0.200000
				if( source > 306.014 )
					if( azul <= -20.5983 )
						if( verde_media <= -51.4669 )
							if( stoc <= 13.6982 )
								ret := 0.750000 // buy
							if( stoc > 13.6982 )
								ret := 1.000000 // buy
						if( verde_media > -51.4669 )
							if( nvi_ema <= 2.04011 )
								ret := 0.250000
							if( nvi_ema > 2.04011 )
								ret := 0.000000
					if( azul > -20.5983 )
						if( azul_mean <= -16.4637 )
							ret := -0.750000 // sell
						if( azul_mean > -16.4637 )
							ret := -1.000000 // sell
			if( media > 7.21121 )
				if( media_azul <= 80.0736 )
					if( verde <= 144.621 )
						if( verde_azul <= -82.0338 )
							if( nvi <= -0.080154 )
								ret := -1.000000 // sell
							if( nvi > -0.080154 )
								if( BollOsc <= -39.7045 )
									ret := 0.625000
								if( BollOsc > -39.7045 )
									ret := -0.227273
						if( verde_azul > -82.0338 )
							if( source <= 317 )
								if( tprice <= 312.466 )
									ret := 0.053031
								if( tprice > 312.466 )
									ret := -0.417355
							if( source > 317 )
								if( verde_media <= 48.9458 )
									ret := 0.099875
								if( verde_media > 48.9458 )
									ret := 0.373333
					if( verde > 144.621 )
						if( verde_media <= 113.924 )
							if( azul_mean <= 73.8799 )
								if( nvimax <= 2.32081 )
									ret := -0.270492
								if( nvimax > 2.32081 )
									ret := 0.857143 // buy
							if( azul_mean > 73.8799 )
								if( source <= 286.943 )
									ret := 0.250000
								if( source > 286.943 )
									ret := 0.928571 // buy
						if( verde_media > 113.924 )
							if( stoc <= 82.9064 )
								if( marron <= 73.7002 )
									ret := -0.500000
								if( marron > 73.7002 )
									ret := 0.708861 // buy
							if( stoc > 82.9064 )
								if( marron <= 124.367 )
									ret := 0.125000
								if( marron > 124.367 )
									ret := -0.750000 // sell
				if( media_azul > 80.0736 )
					if( pvim <= 0.402214 )
						if( source <= 85.2458 )
							if( xmf <= 51.9312 )
								if( stoc <= 11.4112 )
									ret := 0.939394 // buy
								if( stoc > 11.4112 )
									ret := 0.311538
							if( xmf > 51.9312 )
								if( azul <= -4.24566 )
									ret := 0.171271
								if( azul > -4.24566 )
									ret := -0.009685
						if( source > 85.2458 )
							if( azul <= -11.8246 )
								if( pvimax <= 0.377912 )
									ret := 0.451852
								if( pvimax > 0.377912 )
									ret := -0.004854
							if( azul > -11.8246 )
								if( pvim <= 0.352432 )
									ret := 0.766393 // buy
								if( pvim > 0.352432 )
									ret := 0.396907
					if( pvim > 0.402214 )
						if( marron_mean <= 71.7571 )
							if( nvimax <= 2.17873 )
								if( nvim <= 0.845356 )
									ret := 0.152078
								if( nvim > 0.845356 )
									ret := 0.376559
							if( nvimax > 2.17873 )
								if( BollOsc <= -36.6968 )
									ret := -0.353448
								if( BollOsc > -36.6968 )
									ret := 0.152318
						if( marron_mean > 71.7571 )
							if( verde_media <= -18.6374 )
								if( nvimax <= 0.068021 )
									ret := -0.444444
								if( nvimax > 0.068021 )
									ret := 0.221734
							if( verde_media > -18.6374 )
								if( BollOsc <= 22.8026 )
									ret := -0.083374
								if( BollOsc > 22.8026 )
									ret := 0.084845
	if( nvi > 2.28394 )
		if( media_azul <= 8.71945 )
			if( pvim <= 0.969553 )
				if( pvim <= 0.64984 )
					if( verde_mean <= 113.255 )
						if( verde_azul <= -5.80078 )
							if( xrsi <= 38.8862 )
								if( verde_mean <= 10.7696 )
									ret := -0.597938
								if( verde_mean > 10.7696 )
									ret := 0.750000 // buy
							if( xrsi > 38.8862 )
								if( azul <= 68.9543 )
									ret := 0.532258
								if( azul > 68.9543 )
									ret := -0.347826
						if( verde_azul > -5.80078 )
							if( nvi <= 2.31058 )
								if( pvimax <= 0.417458 )
									ret := 0.714286 // buy
								if( pvimax > 0.417458 )
									ret := -0.666667
							if( nvi > 2.31058 )
								if( nvi <= 2.3446 )
									ret := -0.953488 // sell
								if( nvi > 2.3446 )
									ret := -0.594406
					if( verde_mean > 113.255 )
						if( verde_mean <= 143.47 )
							ret := 0.750000 // buy
						if( verde_mean > 143.47 )
							ret := 1.000000 // buy
				if( pvim > 0.64984 )
					if( tprice <= 785.19 )
						if( pvi <= 0.8514 )
							if( xrsi <= 82.1434 )
								if( nvi <= 2.69103 )
									ret := 0.234432
								if( nvi > 2.69103 )
									ret := -0.500000
							if( xrsi > 82.1434 )
								if( pvim <= 0.666691 )
									ret := -0.250000
								if( pvim > 0.666691 )
									ret := -1.000000 // sell
						if( pvi > 0.8514 )
							if( pvi_ema <= 0.931716 )
								if( verde_mean <= -35.0176 )
									ret := 0.166667
								if( verde_mean > -35.0176 )
									ret := -0.716418 // sell
							if( pvi_ema > 0.931716 )
								if( xmf <= 29.3904 )
									ret := -0.056604
								if( xmf > 29.3904 )
									ret := 0.434783
					if( tprice > 785.19 )
						if( pvimin <= 0.838444 )
							ret := -1.000000 // sell
						if( pvimin > 0.838444 )
							if( tprice <= 822.173 )
								if( media <= 30.6948 )
									ret := 0.500000
								if( media > 30.6948 )
									ret := -0.066667
							if( tprice > 822.173 )
								ret := -1.000000 // sell
			if( pvim > 0.969553 )
				if( xmf <= 26.588 )
					if( xmf <= 16.7224 )
						if( pvi_ema <= 1.00744 )
							ret := 0.000000
						if( pvi_ema > 1.00744 )
							ret := -0.428571
					if( xmf > 16.7224 )
						ret := -1.000000 // sell
				if( xmf > 26.588 )
					if( marron_mean <= 51.6991 )
						if( marron_mean <= 18.9032 )
							ret := 0.250000
						if( marron_mean > 18.9032 )
							if( xrsi <= 45.6443 )
								ret := -0.250000
							if( xrsi > 45.6443 )
								ret := 0.000000
					if( marron_mean > 51.6991 )
						if( media <= 61.0707 )
							ret := -1.000000 // sell
						if( media > 61.0707 )
							ret := -0.500000
		if( media_azul > 8.71945 )
			if( media_azul <= 51.1383 )
				if( tprice <= 810.479 )
					if( pvi <= 0.561049 )
						if( marron <= 19.9326 )
							if( tprice <= 343.377 )
								if( media_azul <= 44.5075 )
									ret := 0.650307
								if( media_azul > 44.5075 )
									ret := -0.285714
							if( tprice > 343.377 )
								if( oscp <= -1.33744 )
									ret := 0.099865
								if( oscp > -1.33744 )
									ret := -0.725000 // sell
						if( marron > 19.9326 )
							if( xrsi <= 35.7209 )
								if( pvi_ema <= 0.257655 )
									ret := 0.705882 // buy
								if( pvi_ema > 0.257655 )
									ret := -0.427083
							if( xrsi > 35.7209 )
								if( verde_media <= 9.24972 )
									ret := 0.070796
								if( verde_media > 9.24972 )
									ret := -0.188976
					if( pvi > 0.561049 )
						if( xmf <= 7.77345 )
							if( verde_media <= -50.1837 )
								if( verde_azul <= -22.9228 )
									ret := -0.294118
								if( verde_azul > -22.9228 )
									ret := 0.800000 // buy
							if( verde_media > -50.1837 )
								if( media <= 2.69193 )
									ret := 0.400000
								if( media > 2.69193 )
									ret := -0.673077
						if( xmf > 7.77345 )
							if( tprice <= 633.407 )
								if( source <= 613.493 )
									ret := 0.110236
								if( source > 613.493 )
									ret := -0.241228
							if( tprice > 633.407 )
								if( xmf <= 69.8625 )
									ret := 0.307143
								if( xmf > 69.8625 )
									ret := -0.392857
				if( tprice > 810.479 )
					if( verde_mean <= 12.483 )
						if( xmf <= 24.7704 )
							if( stoc <= 11.4826 )
								ret := 0.000000
							if( stoc > 11.4826 )
								ret := -0.666667
						if( xmf > 24.7704 )
							if( xrsi <= 34.6122 )
								if( source <= 821.763 )
									ret := -1.000000 // sell
								if( source > 821.763 )
									ret := -0.500000
							if( xrsi > 34.6122 )
								ret := -1.000000 // sell
					if( verde_mean > 12.483 )
						if( oscp <= -8.93475 )
							if( pvimax <= 0.881486 )
								if( marron <= 66.702 )
									ret := -0.250000
								if( marron > 66.702 )
									ret := 0.000000
							if( pvimax > 0.881486 )
								ret := 0.500000
						if( oscp > -8.93475 )
							if( pvi_ema <= 0.860863 )
								if( media_azul <= 41.7641 )
									ret := 0.000000
								if( media_azul > 41.7641 )
									ret := -0.250000
							if( pvi_ema > 0.860863 )
								if( nvi_ema <= 2.39938 )
									ret := -0.913043 // sell
								if( nvi_ema > 2.39938 )
									ret := -0.500000
			if( media_azul > 51.1383 )
				if( media <= 33.2375 )
					if( nvi <= 2.50184 )
						if( azul_mean <= -40.8514 )
							if( BollOsc <= -38.8441 )
								if( media_azul <= 93.2369 )
									ret := 0.800000 // buy
								if( media_azul > 93.2369 )
									ret := 1.000000 // buy
							if( BollOsc > -38.8441 )
								if( marron_mean <= 16.6021 )
									ret := 0.600000
								if( marron_mean > 16.6021 )
									ret := -0.333333
						if( azul_mean > -40.8514 )
							if( source <= 435.733 )
								if( nvi_ema <= 2.32663 )
									ret := -0.333333
								if( nvi_ema > 2.32663 )
									ret := 0.649351
							if( source > 435.733 )
								if( azul <= -57.4422 )
									ret := -0.733333 // sell
								if( azul > -57.4422 )
									ret := 0.218750
					if( nvi > 2.50184 )
						if( pvi <= 0.734453 )
							if( verde_media <= -23.8014 )
								if( azul <= -53.6334 )
									ret := -0.300000
								if( azul > -53.6334 )
									ret := -0.935484 // sell
							if( verde_media > -23.8014 )
								if( verde_mean <= 29.3098 )
									ret := -0.320000
								if( verde_mean > 29.3098 )
									ret := 1.000000 // buy
						if( pvi > 0.734453 )
							if( xmf <= 22.9973 )
								if( media_azul <= 60.0331 )
									ret := 0.142857
								if( media_azul > 60.0331 )
									ret := -0.666667
							if( xmf > 22.9973 )
								if( nvimin <= 2.51896 )
									ret := -0.600000
								if( nvimin > 2.51896 )
									ret := 0.817073 // buy
				if( media > 33.2375 )
					if( pvimax <= 0.30157 )
						if( BollOsc <= 38.8505 )
							if( verde_azul <= 21.0895 )
								if( xrsi <= 33.1989 )
									ret := -0.750000 // sell
								if( xrsi > 33.1989 )
									ret := 1.000000 // buy
							if( verde_azul > 21.0895 )
								if( pvimax <= 0.248898 )
									ret := 0.000000
								if( pvimax > 0.248898 )
									ret := -0.720339 // sell
						if( BollOsc > 38.8505 )
							if( xmf <= 76.4317 )
								ret := 1.000000 // buy
							if( xmf > 76.4317 )
								if( pvi_ema <= 0.257977 )
									ret := 0.000000
								if( pvi_ema > 0.257977 )
									ret := 1.000000 // buy
					if( pvimax > 0.30157 )
						if( marron_mean <= 11.2939 )
							if( media_azul <= 95.4299 )
								if( pvi <= 0.935666 )
									ret := -0.769231 // sell
								if( pvi > 0.935666 )
									ret := 0.000000
							if( media_azul > 95.4299 )
								if( pvimax <= 0.657145 )
									ret := 0.857143 // buy
								if( pvimax > 0.657145 )
									ret := -0.500000
						if( marron_mean > 11.2939 )
							if( nvimin <= 2.21927 )
								if( nvi_ema <= 2.27161 )
									ret := 0.250000
								if( nvi_ema > 2.27161 )
									ret := -0.722222 // sell
							if( nvimin > 2.21927 )
								if( tprice <= 305.204 )
									ret := 0.402985
								if( tprice > 305.204 )
									ret := -0.031801
	
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
float op_operation = decision_tree_0_HUBS_15Min_6ebfc51d(verde_mean, verde, marron, media_azul, verde_media, nvi_ema, stoc, azul, verde_azul, pvi_ema, tprice, pvi, marron_mean, pvimax, azul_mean, xrsi, nvimin, media, source, oscp, nvim, xmf, pvimin, BollOsc, nvi, pvim, nvimax)

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


