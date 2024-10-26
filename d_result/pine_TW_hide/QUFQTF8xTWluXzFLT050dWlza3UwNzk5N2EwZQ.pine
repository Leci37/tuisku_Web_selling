//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: AAPL_1Min_1KON_07997a0e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_1Min_1KON_07997a0e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_1Min_07997a0e(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( oscp <= -4.31762 )
		if( source <= 227.999 )
			if( media <= 72.6756 )
				if( xrsi <= 47.3471 )
					if( pvi <= 0.197132 )
						if( oscp <= -83.5636 )
							if( BollOsc <= -47.7339 )
								if( verde_mean <= -61.8901 )
									ret := 0.565553
								if( verde_mean > -61.8901 )
									ret := 0.311475
							if( BollOsc > -47.7339 )
								if( verde_azul <= -157.656 )
									ret := -0.595238
								if( verde_azul > -157.656 )
									ret := 0.194444
						if( oscp > -83.5636 )
							if( stoc <= 9.27843 )
								if( nvi_ema <= 0.013942 )
									ret := -0.336134
								if( nvi_ema > 0.013942 )
									ret := 0.172805
							if( stoc > 9.27843 )
								if( nvimin <= 0.037543 )
									ret := 0.173151
								if( nvimin > 0.037543 )
									ret := 0.040659
					if( pvi > 0.197132 )
						if( verde_media <= -39.4603 )
							if( verde <= -82.6551 )
								ret := -0.857143 // sell
							if( verde > -82.6551 )
								ret := -1.000000 // sell
						if( verde_media > -39.4603 )
							ret := 0.909091 // buy
				if( xrsi > 47.3471 )
					if( tprice <= 221.557 )
						if( pvi_ema <= -0.023139 )
							if( xmf <= 44.1671 )
								if( media_azul <= 14.9946 )
									ret := 0.327869
								if( media_azul > 14.9946 )
									ret := -0.257862
							if( xmf > 44.1671 )
								if( BollOsc <= -11.0039 )
									ret := -0.205128
								if( BollOsc > -11.0039 )
									ret := 0.379808
						if( pvi_ema > -0.023139 )
							if( tprice <= 191.472 )
								if( pvi_ema <= 0.087415 )
									ret := -0.113636
								if( pvi_ema > 0.087415 )
									ret := 0.503817
							if( tprice > 191.472 )
								if( azul_mean <= 18.5343 )
									ret := -0.299078
								if( azul_mean > 18.5343 )
									ret := -0.124748
					if( tprice > 221.557 )
						if( azul <= 31.5961 )
							if( source <= 226.301 )
								if( verde_azul <= 59.7737 )
									ret := 0.172764
								if( verde_azul > 59.7737 )
									ret := -0.388060
							if( source > 226.301 )
								if( azul <= 9.40814 )
									ret := -0.326923
								if( azul > 9.40814 )
									ret := 0.148936
						if( azul > 31.5961 )
							if( verde_media <= 20.9967 )
								if( marron_mean <= 73.7756 )
									ret := -0.147493
								if( marron_mean > 73.7756 )
									ret := -0.914894 // sell
							if( verde_media > 20.9967 )
								if( xrsi <= 57.674 )
									ret := 0.675000
								if( xrsi > 57.674 )
									ret := -0.100000
			if( media > 72.6756 )
				if( azul <= -23.8241 )
					if( verde_mean <= 86.8276 )
						if( pvim <= 0.089675 )
							if( stoc <= 26.1988 )
								ret := 0.588235
							if( stoc > 26.1988 )
								if( verde <= 37.1273 )
									ret := 0.930556 // buy
								if( verde > 37.1273 )
									ret := 0.636364
						if( pvim > 0.089675 )
							if( pvi_ema <= 0.106363 )
								ret := 0.100000
							if( pvi_ema > 0.106363 )
								if( pvimax <= 0.152161 )
									ret := 0.870968 // buy
								if( pvimax > 0.152161 )
									ret := 0.480000
					if( verde_mean > 86.8276 )
						if( pvi <= 0.051741 )
							if( media <= 88.6688 )
								ret := 0.928571 // buy
							if( media > 88.6688 )
								ret := 0.357143
						if( pvi > 0.051741 )
							if( verde_mean <= 96.4119 )
								ret := -0.600000
							if( verde_mean > 96.4119 )
								ret := 0.300000
				if( azul > -23.8241 )
					if( verde <= -19.3832 )
						if( stoc <= 52.7486 )
							if( stoc <= 45.8444 )
								if( nvimax <= 0.088167 )
									ret := 0.746032 // buy
								if( nvimax > 0.088167 )
									ret := -0.027027
							if( stoc > 45.8444 )
								if( verde_azul <= -72.3507 )
									ret := -0.500000
								if( verde_azul > -72.3507 )
									ret := 0.200000
						if( stoc > 52.7486 )
							if( media_azul <= 71.3295 )
								if( pvimax <= 0.039693 )
									ret := 1.000000 // buy
								if( pvimax > 0.039693 )
									ret := 0.000000
							if( media_azul > 71.3295 )
								if( media_azul <= 85.571 )
									ret := 1.000000 // buy
								if( media_azul > 85.571 )
									ret := 0.850000 // buy
					if( verde > -19.3832 )
						if( pvimax <= 0.180629 )
							if( azul <= 77.9985 )
								if( pvi <= 0.037154 )
									ret := 0.172220
								if( pvi > 0.037154 )
									ret := 0.036582
							if( azul > 77.9985 )
								if( nvi <= 0.163817 )
									ret := 0.142857
								if( nvi > 0.163817 )
									ret := 0.883721 // buy
						if( pvimax > 0.180629 )
							if( pvim <= 0.190264 )
								if( pvim <= 0.186182 )
									ret := 0.633588
								if( pvim > 0.186182 )
									ret := -0.250000
							if( pvim > 0.190264 )
								if( media_azul <= 90.7779 )
									ret := 1.000000 // buy
								if( media_azul > 90.7779 )
									ret := 0.818182 // buy
		if( source > 227.999 )
			if( azul_mean <= 1.75743 )
				if( verde_mean <= -52.5885 )
					if( marron <= 1.40931 )
						if( media_azul <= 76.317 )
							if( pvimin <= 0.152103 )
								if( nvi_ema <= 0.446743 )
									ret := -1.000000 // sell
								if( nvi_ema > 0.446743 )
									ret := -0.818182 // sell
							if( pvimin > 0.152103 )
								ret := -0.500000
						if( media_azul > 76.317 )
							ret := 0.333333
					if( marron > 1.40931 )
						ret := 0.111111
				if( verde_mean > -52.5885 )
					if( media_azul <= 1.60945 )
						if( verde_media <= -20.6708 )
							if( azul_mean <= -4.80311 )
								ret := -0.866667 // sell
							if( azul_mean > -4.80311 )
								ret := -1.000000 // sell
						if( verde_media > -20.6708 )
							ret := 0.272727
					if( media_azul > 1.60945 )
						if( marron <= -3.88237 )
							if( pvim <= -0.000587 )
								if( oscp <= -41.0706 )
									ret := -0.233333
								if( oscp > -41.0706 )
									ret := 0.690476
							if( pvim > -0.000587 )
								if( nvi_ema <= 0.184202 )
									ret := 0.593220
								if( nvi_ema > 0.184202 )
									ret := 1.000000 // buy
						if( marron > -3.88237 )
							if( media <= 1.9513 )
								ret := -0.894737 // sell
							if( media > 1.9513 )
								if( media <= 29.23 )
									ret := 0.223124
								if( media > 29.23 )
									ret := 0.006228
			if( azul_mean > 1.75743 )
				if( verde <= -35 )
					if( marron_mean <= -0.710167 )
						if( nvi_ema <= 0.199923 )
							ret := 0.000000
						if( nvi_ema > 0.199923 )
							ret := 0.933333 // buy
					if( marron_mean > -0.710167 )
						if( tprice <= 234.76 )
							if( source <= 232.38 )
								if( nvi_ema <= 0.352536 )
									ret := -0.218182
								if( nvi_ema > 0.352536 )
									ret := -0.758621 // sell
							if( source > 232.38 )
								if( marron <= -3.08406 )
									ret := -0.733333 // sell
								if( marron > -3.08406 )
									ret := -0.978261 // sell
						if( tprice > 234.76 )
							ret := 0.200000
				if( verde > -35 )
					if( marron_mean <= 7.92643 )
						if( pvimin <= 0.174974 )
							if( tprice <= 228.958 )
								if( verde_mean <= -15.6869 )
									ret := 0.363636
								if( verde_mean > -15.6869 )
									ret := -0.750000 // sell
							if( tprice > 228.958 )
								if( source <= 229.944 )
									ret := -0.953488 // sell
								if( source > 229.944 )
									ret := -0.450000
						if( pvimin > 0.174974 )
							ret := 0.166667
					if( marron_mean > 7.92643 )
						if( marron <= 19.7856 )
							if( verde_mean <= -25.1152 )
								ret := -0.941176 // sell
							if( verde_mean > -25.1152 )
								if( xrsi <= 27.4866 )
									ret := 0.886792 // buy
								if( xrsi > 27.4866 )
									ret := -0.016026
						if( marron > 19.7856 )
							if( media <= 95.2637 )
								if( xrsi <= 32.8801 )
									ret := 0.509091
								if( xrsi > 32.8801 )
									ret := -0.158937
							if( media > 95.2637 )
								if( xrsi <= 72.8587 )
									ret := 0.252174
								if( xrsi > 72.8587 )
									ret := -0.812500 // sell
	if( oscp > -4.31762 )
		if( media_azul <= 57.3849 )
			if( pvim <= -0.021623 )
				if( verde <= 219.639 )
					if( nvimin <= 0.001156 )
						if( marron_mean <= 37.6676 )
							if( xrsi <= 41.288 )
								ret := 1.000000 // buy
							if( xrsi > 41.288 )
								ret := 0.900000 // buy
						if( marron_mean > 37.6676 )
							if( azul <= 19.5238 )
								ret := 0.000000
							if( azul > 19.5238 )
								ret := 1.000000 // buy
					if( nvimin > 0.001156 )
						if( stoc <= 83.153 )
							if( marron <= 107.715 )
								if( nvimin <= 0.435359 )
									ret := 0.080867
								if( nvimin > 0.435359 )
									ret := -0.070502
							if( marron > 107.715 )
								if( pvi <= -0.055907 )
									ret := 0.635593
								if( pvi > -0.055907 )
									ret := 0.056604
						if( stoc > 83.153 )
							if( marron <= 127.906 )
								if( media_azul <= 56.6446 )
									ret := -0.261628
								if( media_azul > 56.6446 )
									ret := 0.588235
							if( marron > 127.906 )
								if( xmf <= 92.0906 )
									ret := 0.540541
								if( xmf > 92.0906 )
									ret := -0.285714
				if( verde > 219.639 )
					if( nvimin <= 0.426588 )
						if( oscp <= 146.955 )
							ret := -1.000000 // sell
						if( oscp > 146.955 )
							ret := -0.916667 // sell
					if( nvimin > 0.426588 )
						ret := -0.250000
			if( pvim > -0.021623 )
				if( media_azul <= -7.29008 )
					if( verde <= 121.707 )
						if( oscp <= 12.2518 )
							if( media_azul <= -39.9027 )
								if( nvim <= 0.075138 )
									ret := 0.464286
								if( nvim > 0.075138 )
									ret := -0.777778 // sell
							if( media_azul > -39.9027 )
								if( pvi_ema <= 0.147687 )
									ret := 0.384615
								if( pvi_ema > 0.147687 )
									ret := 0.806818 // buy
						if( oscp > 12.2518 )
							if( pvi <= 0.050583 )
								ret := 0.642857
							if( pvi > 0.050583 )
								ret := -0.700000 // sell
					if( verde > 121.707 )
						if( nvim <= 0.143463 )
							if( source <= 188.105 )
								ret := 0.000000
							if( source > 188.105 )
								if( media <= 97.4662 )
									ret := -0.875000 // sell
								if( media > 97.4662 )
									ret := -0.117647
						if( nvim > 0.143463 )
							if( media <= 98.3481 )
								if( media <= 70.1595 )
									ret := 0.368421
								if( media > 70.1595 )
									ret := -0.727273 // sell
							if( media > 98.3481 )
								ret := 1.000000 // buy
				if( media_azul > -7.29008 )
					if( oscp <= 1.47554 )
						if( media <= 85.1818 )
							if( verde_mean <= 61.8485 )
								if( nvi <= 0.047752 )
									ret := -0.136695
								if( nvi > 0.047752 )
									ret := 0.003489
							if( verde_mean > 61.8485 )
								if( verde_media <= -8.31068 )
									ret := -0.769231 // sell
								if( verde_media > -8.31068 )
									ret := -0.211433
						if( media > 85.1818 )
							if( azul <= 57.0233 )
								if( stoc <= 76.3552 )
									ret := -0.030303
								if( stoc > 76.3552 )
									ret := 0.694030
							if( azul > 57.0233 )
								if( nvi_ema <= 0.288325 )
									ret := -0.666667
								if( nvi_ema > 0.288325 )
									ret := 0.000000
					if( oscp > 1.47554 )
						if( verde <= 349.607 )
							if( nvimax <= 0.054837 )
								if( pvim <= 0.113565 )
									ret := -0.215355
								if( pvim > 0.113565 )
									ret := 0.269663
							if( nvimax > 0.054837 )
								if( verde_mean <= 14.1122 )
									ret := 0.100223
								if( verde_mean > 14.1122 )
									ret := -0.134129
						if( verde > 349.607 )
							ret := 0.904762 // buy
		if( media_azul > 57.3849 )
			if( nvimin <= 0.025037 )
				if( source <= 166.414 )
					if( media <= 53.7441 )
						if( pvimax <= -0.018677 )
							if( pvimin <= -0.021941 )
								if( pvi_ema <= -0.021709 )
									ret := 0.857143 // buy
								if( pvi_ema > -0.021709 )
									ret := 0.250000
							if( pvimin > -0.021941 )
								ret := 0.000000
						if( pvimax > -0.018677 )
							if( pvim <= -0.020386 )
								ret := -0.352941
							if( pvim > -0.020386 )
								if( marron <= 51.9768 )
									ret := -0.722222 // sell
								if( marron > 51.9768 )
									ret := -1.000000 // sell
					if( media > 53.7441 )
						if( BollOsc <= 23.7706 )
							if( pvimin <= -0.023565 )
								if( media_azul <= 95.8463 )
									ret := 0.663866
								if( media_azul > 95.8463 )
									ret := 0.120000
							if( pvimin > -0.023565 )
								if( media_azul <= 114.124 )
									ret := 0.141732
								if( media_azul > 114.124 )
									ret := -0.636364
						if( BollOsc > 23.7706 )
							if( oscp <= 30.395 )
								if( stoc <= 91.3808 )
									ret := -0.112994
								if( stoc > 91.3808 )
									ret := -0.652174
							if( oscp > 30.395 )
								if( pvi_ema <= -0.024434 )
									ret := -0.411765
								if( pvi_ema > -0.024434 )
									ret := 0.607843
				if( source > 166.414 )
					if( pvimax <= -0.017315 )
						if( pvimin <= -0.023809 )
							if( marron_mean <= 94.9351 )
								if( verde_mean <= 95.8159 )
									ret := -0.083333
								if( verde_mean > 95.8159 )
									ret := 0.863636 // buy
							if( marron_mean > 94.9351 )
								if( media_azul <= 117.361 )
									ret := -0.862500 // sell
								if( media_azul > 117.361 )
									ret := -0.147059
						if( pvimin > -0.023809 )
							if( pvimin <= -0.022301 )
								if( verde_azul <= 146.44 )
									ret := 0.860000 // buy
								if( verde_azul > 146.44 )
									ret := -0.666667
							if( pvimin > -0.022301 )
								if( nvi_ema <= 0.022414 )
									ret := -0.441176
								if( nvi_ema > 0.022414 )
									ret := 0.186813
					if( pvimax > -0.017315 )
						if( marron_mean <= 54.1029 )
							if( verde_azul <= 92.188 )
								if( azul_mean <= -7.00441 )
									ret := -0.740964 // sell
								if( azul_mean > -7.00441 )
									ret := -0.107143
							if( verde_azul > 92.188 )
								if( verde <= 87.7491 )
									ret := 0.470588
								if( verde > 87.7491 )
									ret := -0.214286
						if( marron_mean > 54.1029 )
							if( xrsi <= 60.4518 )
								if( BollOsc <= 26.2208 )
									ret := -0.043411
								if( BollOsc > 26.2208 )
									ret := -0.372973
							if( xrsi > 60.4518 )
								if( pvi_ema <= 0.073582 )
									ret := -0.398660
								if( pvi_ema > 0.073582 )
									ret := 0.028571
			if( nvimin > 0.025037 )
				if( marron <= 108.947 )
					if( media <= 107.855 )
						if( marron_mean <= 60.6965 )
							if( verde <= 45.9627 )
								if( pvimax <= 0.147298 )
									ret := 0.037528
								if( pvimax > 0.147298 )
									ret := -0.165278
							if( verde > 45.9627 )
								if( xrsi <= 35.7855 )
									ret := -0.625000
								if( xrsi > 35.7855 )
									ret := 0.118410
						if( marron_mean > 60.6965 )
							if( azul <= 32.4012 )
								if( verde <= 98.5367 )
									ret := 0.016682
								if( verde > 98.5367 )
									ret := -0.047000
							if( azul > 32.4012 )
								if( tprice <= 213.449 )
									ret := 0.771429 // buy
								if( tprice > 213.449 )
									ret := 0.255172
					if( media > 107.855 )
						if( azul_mean <= 14.9248 )
							if( tprice <= 203.498 )
								if( marron <= 97.1085 )
									ret := 0.285714
								if( marron > 97.1085 )
									ret := 0.854077 // buy
							if( tprice > 203.498 )
								if( nvimin <= 0.087881 )
									ret := -0.566667
								if( nvimin > 0.087881 )
									ret := 0.289157
						if( azul_mean > 14.9248 )
							if( pvi_ema <= 0.164426 )
								if( tprice <= 195.1 )
									ret := 0.447368
								if( tprice > 195.1 )
									ret := -0.314516
							if( pvi_ema > 0.164426 )
								if( verde_mean <= 137.838 )
									ret := 0.821429 // buy
								if( verde_mean > 137.838 )
									ret := 0.083333
				if( marron > 108.947 )
					if( azul <= 22.0665 )
						if( verde_azul <= 266.434 )
							if( pvimax <= 0.004296 )
								if( media <= 114.755 )
									ret := -0.004486
								if( media > 114.755 )
									ret := -0.604938
							if( pvimax > 0.004296 )
								if( source <= 210.114 )
									ret := -0.052089
								if( source > 210.114 )
									ret := -0.214433
						if( verde_azul > 266.434 )
							if( nvim <= 0.070503 )
								if( nvi <= 0.053552 )
									ret := 0.307692
								if( nvi > 0.053552 )
									ret := 1.000000 // buy
							if( nvim > 0.070503 )
								if( verde <= 209.284 )
									ret := 0.833333 // buy
								if( verde > 209.284 )
									ret := -0.111111
					if( azul > 22.0665 )
						if( pvim <= -0.144523 )
							ret := -1.000000 // sell
						if( pvim > -0.144523 )
							if( nvimin <= 0.061393 )
								if( xrsi <= 86.3345 )
									ret := 0.114943
								if( xrsi > 86.3345 )
									ret := 0.888889 // buy
							if( nvimin > 0.061393 )
								if( azul_mean <= 18.9321 )
									ret := 0.357934
								if( azul_mean > 18.9321 )
									ret := -0.090909
	
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
float op_operation = decision_tree_0_AAPL_1Min_07997a0e(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


