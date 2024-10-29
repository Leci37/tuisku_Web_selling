//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Blai5_Koncorde_v10
// ID_model: AMD_30Min_1KON_eb405075 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_30Min_1KON_eb405075", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_30Min_eb405075(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( oscp <= 24.7058 )
		if( pvimin <= 0.442118 )
			if( verde_azul <= -33.9553 )
				if( media_azul <= 8.92812 )
					if( media <= 53.6832 )
						if( oscp <= -21.9642 )
							if( pvim <= 0.443108 )
								if( nvim <= 1.41452 )
									ret := 0.663043
								if( nvim > 1.41452 )
									ret := 0.229885
							if( pvim > 0.443108 )
								ret := -0.692308
						if( oscp > -21.9642 )
							if( verde_azul <= -55.9207 )
								ret := 0.384615
							if( verde_azul > -55.9207 )
								if( verde_media <= -28.5609 )
									ret := 0.083333
								if( verde_media > -28.5609 )
									ret := -0.756757 // sell
					if( media > 53.6832 )
						ret := -1.000000 // sell
				if( media_azul > 8.92812 )
					if( source <= 4.63913 )
						if( pvimin <= -0.102153 )
							ret := 0.000000
						if( pvimin > -0.102153 )
							ret := 1.000000 // buy
					if( source > 4.63913 )
						if( marron_mean <= 10.4568 )
							if( pvim <= 0.217244 )
								ret := 0.315789
							if( pvim > 0.217244 )
								if( BollOsc <= -52.6126 )
									ret := 0.947368 // buy
								if( BollOsc > -52.6126 )
									ret := 0.526316
						if( marron_mean > 10.4568 )
							if( verde_mean <= 25.1065 )
								if( xmf <= 0.438034 )
									ret := -0.526316
								if( xmf > 0.438034 )
									ret := 0.587156
							if( verde_mean > 25.1065 )
								if( verde_media <= -91.6941 )
									ret := -0.703704 // sell
								if( verde_media > -91.6941 )
									ret := 0.166667
			if( verde_azul > -33.9553 )
				if( azul <= -8.81192 )
					if( verde_mean <= 101.029 )
						if( nvim <= 1.69352 )
							if( nvi_ema <= 1.22838 )
								if( azul <= -14.2699 )
									ret := 0.405117
								if( azul > -14.2699 )
									ret := 0.016722
							if( nvi_ema > 1.22838 )
								if( source <= 10.4227 )
									ret := -0.333333
								if( source > 10.4227 )
									ret := 0.040794
						if( nvim > 1.69352 )
							if( media_azul <= 65.0105 )
								if( marron_mean <= 31.9562 )
									ret := 0.277419
								if( marron_mean > 31.9562 )
									ret := -0.328358
							if( media_azul > 65.0105 )
								if( BollOsc <= -47.4529 )
									ret := 0.824324 // buy
								if( BollOsc > -47.4529 )
									ret := 0.372483
					if( verde_mean > 101.029 )
						if( verde_media <= 22.7637 )
							if( azul <= -12.9952 )
								if( nvimax <= 1.59755 )
									ret := 0.663551
								if( nvimax > 1.59755 )
									ret := 0.211765
							if( azul > -12.9952 )
								if( oscp <= 6.46756 )
									ret := 0.578947
								if( oscp > 6.46756 )
									ret := 0.887850 // buy
						if( verde_media > 22.7637 )
							if( verde_media <= 23.6347 )
								ret := -0.666667
							if( verde_media > 23.6347 )
								if( verde_mean <= 134.805 )
									ret := 0.600000
								if( verde_mean > 134.805 )
									ret := -0.476190
				if( azul > -8.81192 )
					if( nvimax <= 0.074447 )
						if( pvi_ema <= -0.210094 )
							if( xmf <= 17.0014 )
								if( verde <= -12.2305 )
									ret := -1.000000 // sell
								if( verde > -12.2305 )
									ret := -0.818182 // sell
							if( xmf > 17.0014 )
								if( BollOsc <= -30.9824 )
									ret := -0.750000 // sell
								if( BollOsc > -30.9824 )
									ret := 0.532051
						if( pvi_ema > -0.210094 )
							if( xrsi <= 45.998 )
								if( verde_media <= -11.5212 )
									ret := -0.253247
								if( verde_media > -11.5212 )
									ret := 0.432624
							if( xrsi > 45.998 )
								if( media <= 117.784 )
									ret := -0.326797
								if( media > 117.784 )
									ret := 0.947368 // buy
					if( nvimax > 0.074447 )
						if( pvi <= 0.590557 )
							if( pvimax <= 0.605467 )
								if( verde_azul <= 125.793 )
									ret := 0.051485
								if( verde_azul > 125.793 )
									ret := -0.290837
							if( pvimax > 0.605467 )
								if( nvi <= 2.10605 )
									ret := -0.810811 // sell
								if( nvi > 2.10605 )
									ret := 0.076923
						if( pvi > 0.590557 )
							if( nvim <= 0.500026 )
								if( media_azul <= 90.5943 )
									ret := 0.090909
								if( media_azul > 90.5943 )
									ret := -0.500000
							if( nvim > 0.500026 )
								if( verde_mean <= 92.9761 )
									ret := -0.692308
								if( verde_mean > 92.9761 )
									ret := -1.000000 // sell
		if( pvimin > 0.442118 )
			if( azul <= 10.0728 )
				if( nvimin <= 0.79502 )
					if( pvimax <= 0.836102 )
						if( pvimax <= 0.610366 )
							if( verde_media <= 10.9968 )
								if( pvim <= 0.480734 )
									ret := -0.239130
								if( pvim > 0.480734 )
									ret := 0.374286
							if( verde_media > 10.9968 )
								if( xmf <= 80.6885 )
									ret := -0.319277
								if( xmf > 80.6885 )
									ret := 0.378378
						if( pvimax > 0.610366 )
							if( marron <= 122.114 )
								if( stoc <= 11.7391 )
									ret := -0.589744
								if( stoc > 11.7391 )
									ret := 0.032293
							if( marron > 122.114 )
								if( verde_mean <= 123.114 )
									ret := -1.000000 // sell
								if( verde_mean > 123.114 )
									ret := -0.437500
					if( pvimax > 0.836102 )
						if( pvimin <= 0.877971 )
							if( xrsi <= 55.2684 )
								if( media <= 40.9911 )
									ret := 0.666667
								if( media > 40.9911 )
									ret := 0.955556 // buy
							if( xrsi > 55.2684 )
								if( media <= 69.1192 )
									ret := -0.133333
								if( media > 69.1192 )
									ret := 0.588235
						if( pvimin > 0.877971 )
							if( pvimax <= 0.944746 )
								if( nvi <= 0.801245 )
									ret := -0.888889 // sell
								if( nvi > 0.801245 )
									ret := -0.033333
							if( pvimax > 0.944746 )
								if( pvi_ema <= 0.923792 )
									ret := 0.894737 // buy
								if( pvi_ema > 0.923792 )
									ret := 0.104167
				if( nvimin > 0.79502 )
					if( oscp <= 9.0224 )
						if( azul_mean <= 2.79512 )
							if( pvi_ema <= 2.03574 )
								if( stoc <= 4.74067 )
									ret := -0.333333
								if( stoc > 4.74067 )
									ret := 0.007413
							if( pvi_ema > 2.03574 )
								if( marron_mean <= -12.7323 )
									ret := 0.806452 // buy
								if( marron_mean > -12.7323 )
									ret := -0.188375
						if( azul_mean > 2.79512 )
							if( xrsi <= 35.9991 )
								if( media_azul <= 16.8133 )
									ret := -0.038123
								if( media_azul > 16.8133 )
									ret := -0.311828
							if( xrsi > 35.9991 )
								if( pvi_ema <= 2.17924 )
									ret := -0.061265
								if( pvi_ema > 2.17924 )
									ret := -0.675676
					if( oscp > 9.0224 )
						if( stoc <= 97.29 )
							if( verde_azul <= 122.304 )
								if( verde <= 22.3741 )
									ret := 0.680000
								if( verde > 22.3741 )
									ret := -0.080232
							if( verde_azul > 122.304 )
								if( xmf <= 99.0332 )
									ret := -0.243850
								if( xmf > 99.0332 )
									ret := 0.192593
						if( stoc > 97.29 )
							if( verde_mean <= 126.905 )
								if( pvimax <= 0.952202 )
									ret := 0.000000
								if( pvimax > 0.952202 )
									ret := 0.357143
							if( verde_mean > 126.905 )
								if( xrsi <= 78.6946 )
									ret := 0.181818
								if( xrsi > 78.6946 )
									ret := 0.885714 // buy
			if( azul > 10.0728 )
				if( verde_azul <= -110.929 )
					if( pvimin <= 1.93738 )
						if( verde_media <= -45.402 )
							if( nvimin <= 3.46293 )
								if( media <= 55.5623 )
									ret := 0.684685
								if( media > 55.5623 )
									ret := -0.062500
							if( nvimin > 3.46293 )
								ret := -0.166667
						if( verde_media > -45.402 )
							if( stoc <= 33.023 )
								ret := 0.900000 // buy
							if( stoc > 33.023 )
								ret := 1.000000 // buy
					if( pvimin > 1.93738 )
						ret := -0.333333
				if( verde_azul > -110.929 )
					if( BollOsc <= 89.3326 )
						if( pvimax <= 0.607315 )
							if( xmf <= 49.4154 )
								if( BollOsc <= 49.3017 )
									ret := 0.037685
								if( BollOsc > 49.3017 )
									ret := -0.500000
							if( xmf > 49.4154 )
								if( oscp <= 2.59778 )
									ret := -0.348624
								if( oscp > 2.59778 )
									ret := -0.034409
						if( pvimax > 0.607315 )
							if( pvi_ema <= 0.619669 )
								if( pvimin <= 0.540535 )
									ret := 0.519149
								if( pvimin > 0.540535 )
									ret := 0.155047
							if( pvi_ema > 0.619669 )
								if( pvi_ema <= 1.07886 )
									ret := -0.026887
								if( pvi_ema > 1.07886 )
									ret := 0.075320
					if( BollOsc > 89.3326 )
						if( source <= 90.2491 )
							if( pvimin <= 0.653955 )
								if( pvi_ema <= 0.626494 )
									ret := 0.636364
								if( pvi_ema > 0.626494 )
									ret := 1.000000 // buy
							if( pvimin > 0.653955 )
								ret := -0.181818
						if( source > 90.2491 )
							if( pvi <= 1.81327 )
								ret := 1.000000 // buy
							if( pvi > 1.81327 )
								ret := 0.666667
	if( oscp > 24.7058 )
		if( nvimin <= 1.36865 )
			if( verde_media <= 35.3497 )
				if( azul <= -26.94 )
					if( verde_mean <= 152.619 )
						if( oscp <= 27.3105 )
							ret := -0.666667
						if( oscp > 27.3105 )
							if( media_azul <= 135.403 )
								ret := -0.750000 // sell
							if( media_azul > 135.403 )
								ret := -1.000000 // sell
					if( verde_mean > 152.619 )
						ret := -0.250000
				if( azul > -26.94 )
					if( verde_media <= 28.047 )
						if( nvi <= 0.101971 )
							ret := 1.000000 // buy
						if( nvi > 0.101971 )
							if( media_azul <= 86.5429 )
								ret := -0.600000
							if( media_azul > 86.5429 )
								if( nvim <= 0.668588 )
									ret := -0.090909
								if( nvim > 0.668588 )
									ret := 0.536585
					if( verde_media > 28.047 )
						if( nvimax <= 0.75312 )
							if( verde_azul <= 134.6 )
								if( verde_mean <= 86.4291 )
									ret := -0.800000 // sell
								if( verde_mean > 86.4291 )
									ret := -1.000000 // sell
							if( verde_azul > 134.6 )
								ret := -0.230769
						if( nvimax > 0.75312 )
							if( nvimin <= 1.0881 )
								ret := 0.500000
							if( nvimin > 1.0881 )
								if( stoc <= 89.5916 )
									ret := -0.176471
								if( stoc > 89.5916 )
									ret := -0.900000 // sell
			if( verde_media > 35.3497 )
				if( xmf <= 98.7443 )
					if( xrsi <= 86.5742 )
						if( verde_mean <= 161.233 )
							if( nvi <= 1.29845 )
								if( verde_media <= 104.424 )
									ret := 0.103960
								if( verde_media > 104.424 )
									ret := -0.333333
							if( nvi > 1.29845 )
								if( verde_mean <= 139.977 )
									ret := 0.634146
								if( verde_mean > 139.977 )
									ret := 1.000000 // buy
						if( verde_mean > 161.233 )
							if( nvim <= 1.08029 )
								if( azul <= 21.6808 )
									ret := 0.829545 // buy
								if( azul > 21.6808 )
									ret := 0.363636
							if( nvim > 1.08029 )
								if( tprice <= 14.1658 )
									ret := 0.480769
								if( tprice > 14.1658 )
									ret := -0.642857
					if( xrsi > 86.5742 )
						if( pvi <= 0.602439 )
							if( pvi_ema <= 0.451406 )
								ret := -1.000000 // sell
							if( pvi_ema > 0.451406 )
								ret := -0.800000 // sell
						if( pvi > 0.602439 )
							if( nvimax <= 1.04235 )
								ret := 0.235294
							if( nvimax > 1.04235 )
								if( pvim <= 0.79313 )
									ret := -0.625000
								if( pvim > 0.79313 )
									ret := -0.866667 // sell
				if( xmf > 98.7443 )
					if( oscp <= 73.2834 )
						if( pvim <= 0.741842 )
							if( azul <= -1.37723 )
								ret := 0.333333
							if( azul > -1.37723 )
								if( azul_mean <= 28.9572 )
									ret := 0.870504 // buy
								if( azul_mean > 28.9572 )
									ret := -0.222222
						if( pvim > 0.741842 )
							if( nvimin <= 0.951826 )
								ret := -0.166667
							if( nvimin > 0.951826 )
								ret := 0.666667
					if( oscp > 73.2834 )
						if( pvi <= 0.670073 )
							ret := -0.666667
						if( pvi > 0.670073 )
							if( BollOsc <= 84.4089 )
								ret := 1.000000 // buy
							if( BollOsc > 84.4089 )
								ret := 0.909091 // buy
		if( nvimin > 1.36865 )
			if( pvim <= 0.480458 )
				if( oscp <= 33.4766 )
					if( pvi <= 0.476556 )
						if( BollOsc <= 73.2146 )
							if( verde_mean <= 139.322 )
								if( xmf <= 81.8563 )
									ret := -0.163265
								if( xmf > 81.8563 )
									ret := 0.293103
							if( verde_mean > 139.322 )
								if( media <= 113.889 )
									ret := -0.209302
								if( media > 113.889 )
									ret := -0.871795 // sell
						if( BollOsc > 73.2146 )
							ret := -0.916667 // sell
					if( pvi > 0.476556 )
						if( tprice <= 15.567 )
							if( oscp <= 27.1558 )
								ret := -0.727273 // sell
							if( oscp > 27.1558 )
								ret := -0.142857
						if( tprice > 15.567 )
							if( pvimax <= 0.474772 )
								ret := -0.375000
							if( pvimax > 0.474772 )
								if( stoc <= 77.9543 )
									ret := -0.583333
								if( stoc > 77.9543 )
									ret := -1.000000 // sell
				if( oscp > 33.4766 )
					if( verde <= 155.048 )
						if( verde_mean <= 163.104 )
							if( source <= 11.9808 )
								if( source <= 10.9818 )
									ret := 0.647059
								if( source > 10.9818 )
									ret := -0.166667
							if( source > 11.9808 )
								if( verde_azul <= 133.148 )
									ret := 0.176471
								if( verde_azul > 133.148 )
									ret := 0.840000 // buy
						if( verde_mean > 163.104 )
							ret := -0.384615
					if( verde > 155.048 )
						if( azul <= 10.2709 )
							if( verde <= 178.13 )
								if( pvimin <= 0.41203 )
									ret := -0.611940
								if( pvimin > 0.41203 )
									ret := 0.300000
							if( verde > 178.13 )
								if( marron_mean <= 99.429 )
									ret := 0.783784 // buy
								if( marron_mean > 99.429 )
									ret := 0.184615
						if( azul > 10.2709 )
							if( verde <= 193.814 )
								if( oscp <= 38.0817 )
									ret := 0.090909
								if( oscp > 38.0817 )
									ret := -0.819672 // sell
							if( verde > 193.814 )
								if( verde_azul <= 191.712 )
									ret := 0.357143
								if( verde_azul > 191.712 )
									ret := -0.538462
			if( pvim > 0.480458 )
				if( nvimin <= 2.74102 )
					if( pvi <= 0.726004 )
						if( nvimin <= 1.44242 )
							if( marron_mean <= 102.078 )
								ret := 0.333333
							if( marron_mean > 102.078 )
								if( verde <= 172.735 )
									ret := -0.368421
								if( verde > 172.735 )
									ret := -0.969697 // sell
						if( nvimin > 1.44242 )
							if( pvimax <= 0.681749 )
								if( media <= 83.7042 )
									ret := 0.026066
								if( media > 83.7042 )
									ret := 0.365231
							if( pvimax > 0.681749 )
								if( oscp <= 49.998 )
									ret := -0.073529
								if( oscp > 49.998 )
									ret := -0.736842 // sell
					if( pvi > 0.726004 )
						if( verde <= 173.83 )
							if( xmf <= 82.8706 )
								if( marron <= 111.997 )
									ret := 0.304348
								if( marron > 111.997 )
									ret := 0.787879 // buy
							if( xmf > 82.8706 )
								if( pvimax <= 0.823553 )
									ret := 0.366667
								if( pvimax > 0.823553 )
									ret := -0.863636 // sell
						if( verde > 173.83 )
							if( stoc <= 77.517 )
								ret := 0.300000
							if( stoc > 77.517 )
								if( nvimax <= 1.9597 )
									ret := 0.888889 // buy
								if( nvimax > 1.9597 )
									ret := 1.000000 // buy
				if( nvimin > 2.74102 )
					if( verde_media <= 182.111 )
						if( pvimin <= 0.618361 )
							if( verde_mean <= 161.227 )
								if( media <= 81.5405 )
									ret := 0.687500
								if( media > 81.5405 )
									ret := -0.181818
							if( verde_mean > 161.227 )
								if( nvi <= 3.25101 )
									ret := 1.000000 // buy
								if( nvi > 3.25101 )
									ret := 0.636364
						if( pvimin > 0.618361 )
							if( azul_mean <= -16.6217 )
								if( verde_mean <= 108.387 )
									ret := 0.130000
								if( verde_mean > 108.387 )
									ret := -0.281947
							if( azul_mean > -16.6217 )
								if( oscp <= 54.2642 )
									ret := 0.055714
								if( oscp > 54.2642 )
									ret := 0.261682
					if( verde_media > 182.111 )
						if( BollOsc <= 103.394 )
							if( nvi <= 3.28426 )
								ret := -0.294118
							if( nvi > 3.28426 )
								if( verde_mean <= 157.086 )
									ret := -1.000000 // sell
								if( verde_mean > 157.086 )
									ret := -0.666667
						if( BollOsc > 103.394 )
							ret := 0.066667
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AMD_30Min_eb405075(oscp, media, media_azul, verde_media, azul, tprice, azul_mean, verde, nvim, marron, pvimin, pvi, nvimax, verde_mean, xmf, source, stoc, pvimax, nvi_ema, nvi, xrsi, pvim, marron_mean, nvimin, BollOsc, verde_azul, pvi_ema)

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


