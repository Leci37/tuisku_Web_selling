//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: CRWD_15Min_2CS0_260012f3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_2CS0_260012f3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_260012f3(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( k <= 65.5456 )
		if( rsi1 <= 42.1105 )
			if( ad_mf <= -6702.28 )
				if( rsi1 <= 26.3095 )
					if( ad <= -9955.93 )
						if( smoothD_d <= 66.2424 )
							if( ad <= -120215 )
								if( smoothK_k <= 26.6695 )
									ret := 0.231183
								if( smoothK_k > 26.6695 )
									ret := -0.156250
							if( ad > -120215 )
								if( ad_mf <= -82380.2 )
									ret := -0.141509
								if( ad_mf > -82380.2 )
									ret := 0.091609
						if( smoothD_d > 66.2424 )
							ret := -0.764706 // sell
					if( ad > -9955.93 )
						if( ad <= -9653.17 )
							ret := -1.000000 // sell
						if( ad > -9653.17 )
							if( ad_mf <= -8523.76 )
								if( rsi1 <= 24.5453 )
									ret := 0.300000
								if( rsi1 > 24.5453 )
									ret := -0.210526
							if( ad_mf > -8523.76 )
								if( smoothD_d <= -0.299792 )
									ret := -0.033333
								if( smoothD_d > -0.299792 )
									ret := -0.644737
				if( rsi1 > 26.3095 )
					if( d_k <= -10.1484 )
						if( d_k <= -20.5384 )
							if( k <= 54.3997 )
								ret := 0.444444
							if( k > 54.3997 )
								if( ad_mf <= -46751.9 )
									ret := 0.250000
								if( ad_mf > -46751.9 )
									ret := -0.500000
						if( d_k > -20.5384 )
							if( d_k <= -17.6874 )
								if( d <= 32.5998 )
									ret := 0.772727 // buy
								if( d > 32.5998 )
									ret := 0.176471
							if( d_k > -17.6874 )
								if( d_k <= -17.146 )
									ret := -0.384615
								if( d_k > -17.146 )
									ret := 0.212851
					if( d_k > -10.1484 )
						if( d_k <= -6.87914 )
							if( d_k <= -7.24377 )
								if( ad_mf <= -66971.7 )
									ret := -0.324074
								if( ad_mf > -66971.7 )
									ret := -0.055249
							if( d_k > -7.24377 )
								if( d <= 32.4967 )
									ret := -0.447368
								if( d > 32.4967 )
									ret := -0.882353 // sell
						if( d_k > -6.87914 )
							if( ad_mf <= -53628.6 )
								if( ad <= -55831.8 )
									ret := -0.010706
								if( ad > -55831.8 )
									ret := 0.646341
							if( ad_mf > -53628.6 )
								if( ad <= -52406.4 )
									ret := -0.565217
								if( ad > -52406.4 )
									ret := -0.066509
			if( ad_mf > -6702.28 )
				if( ad_mf <= 836.66 )
					if( smoothD_d <= 70.7902 )
						if( ad <= -1962.83 )
							if( d_k <= -3.44278 )
								if( mf <= -0.452871 )
									ret := 0.916667 // buy
								if( mf > -0.452871 )
									ret := 0.045045
							if( d_k > -3.44278 )
								if( mf <= 0.05101 )
									ret := 0.443182
								if( mf > 0.05101 )
									ret := 0.247423
						if( ad > -1962.83 )
							if( mf <= -0.031047 )
								if( d_k <= -6.66321 )
									ret := 0.116761
								if( d_k > -6.66321 )
									ret := 0.321583
							if( mf > -0.031047 )
								if( ad_mf <= -1402.61 )
									ret := -0.310185
								if( ad_mf > -1402.61 )
									ret := 0.152274
					if( smoothD_d > 70.7902 )
						if( d_k <= 16.0997 )
							if( d_k <= 13.7404 )
								ret := -0.400000
							if( d_k > 13.7404 )
								ret := 0.733333 // buy
						if( d_k > 16.0997 )
							if( ad <= -572 )
								if( k <= 56.0591 )
									ret := 0.071429
								if( k > 56.0591 )
									ret := -0.200000
							if( ad > -572 )
								if( k <= 57.784 )
									ret := -0.195122
								if( k > 57.784 )
									ret := -0.925000 // sell
				if( ad_mf > 836.66 )
					if( ad_mf <= 633733 )
						if( ad_mf <= 433385 )
							if( ad_mf <= 255962 )
								if( mf <= -0.506755 )
									ret := 0.363636
								if( mf > -0.506755 )
									ret := 0.037245
							if( ad_mf > 255962 )
								if( ad <= 265768 )
									ret := 0.847826 // buy
								if( ad > 265768 )
									ret := 0.207373
						if( ad_mf > 433385 )
							if( ad <= 491460 )
								if( d <= 17.1623 )
									ret := -0.428571
								if( d > 17.1623 )
									ret := -0.923077 // sell
							if( ad > 491460 )
								if( d_k <= 5.13815 )
									ret := -0.366667
								if( d_k > 5.13815 )
									ret := 0.100000
					if( ad_mf > 633733 )
						if( d_k <= -6.50874 )
							ret := 0.416667
						if( d_k > -6.50874 )
							if( rsi1 <= 33.3463 )
								ret := 0.750000 // buy
							if( rsi1 > 33.3463 )
								ret := 1.000000 // buy
		if( rsi1 > 42.1105 )
			if( ad_mf <= -229.339 )
				if( d <= 74.4414 )
					if( rsi1 <= 66.222 )
						if( smoothD_d <= 69.8594 )
							if( k <= 45.6352 )
								if( ad_mf <= -865.851 )
									ret := -0.014529
								if( ad_mf > -865.851 )
									ret := 0.277860
							if( k > 45.6352 )
								if( ad_mf <= -1290 )
									ret := 0.054626
								if( ad_mf > -1290 )
									ret := 0.288066
						if( smoothD_d > 69.8594 )
							if( k <= 62.4357 )
								if( smoothK_k <= 51.0092 )
									ret := -0.583333
								if( smoothK_k > 51.0092 )
									ret := 0.120690
							if( k > 62.4357 )
								if( ad_mf <= -71967.1 )
									ret := 0.000000
								if( ad_mf > -71967.1 )
									ret := -0.774194 // sell
					if( rsi1 > 66.222 )
						if( mf <= -0.195392 )
							if( ad_mf <= -52764.5 )
								ret := 0.900000 // buy
							if( ad_mf > -52764.5 )
								ret := 0.055556
						if( mf > -0.195392 )
							if( ad <= -58292.9 )
								if( ad <= -68612.1 )
									ret := -0.080537
								if( ad > -68612.1 )
									ret := 0.629630
							if( ad > -58292.9 )
								if( k <= 39.3981 )
									ret := -0.040816
								if( k > 39.3981 )
									ret := -0.244713
				if( d > 74.4414 )
					if( ad_mf <= -17409.8 )
						if( ad_mf <= -43169.2 )
							if( smoothK_k <= 60.7858 )
								if( ad <= -143925 )
									ret := 0.477612
								if( ad > -143925 )
									ret := 0.102564
							if( smoothK_k > 60.7858 )
								if( smoothD_d <= 74.4896 )
									ret := -0.642857
								if( smoothD_d > 74.4896 )
									ret := 0.050000
						if( ad_mf > -43169.2 )
							if( mf <= 0.136389 )
								if( smoothD_d <= 73.5321 )
									ret := 0.000000
								if( smoothD_d > 73.5321 )
									ret := -0.222222
							if( mf > 0.136389 )
								ret := -0.684211
					if( ad_mf > -17409.8 )
						if( mf <= 0.406419 )
							if( mf <= 0.296664 )
								if( mf <= 0.171419 )
									ret := 0.574468
								if( mf > 0.171419 )
									ret := 0.076923
							if( mf > 0.296664 )
								ret := 0.928571 // buy
						if( mf > 0.406419 )
							ret := -0.200000
			if( ad_mf > -229.339 )
				if( smoothD_d <= 47.0489 )
					if( k <= 6.96425 )
						if( rsi1 <= 54.5275 )
							if( smoothK_k <= 3.58218 )
								if( smoothK_k <= 0.927537 )
									ret := 0.180258
								if( smoothK_k > 0.927537 )
									ret := 0.011429
							if( smoothK_k > 3.58218 )
								if( ad <= 491.757 )
									ret := 0.806452 // buy
								if( ad > 491.757 )
									ret := 0.250000
						if( rsi1 > 54.5275 )
							if( ad <= 92.8 )
								if( k <= 0.050575 )
									ret := 0.157895
								if( k > 0.050575 )
									ret := -0.633333
							if( ad > 92.8 )
								if( mf <= 0.433377 )
									ret := 0.020408
								if( mf > 0.433377 )
									ret := 0.607143
					if( k > 6.96425 )
						if( d_k <= -4.60573 )
							if( ad_mf <= 63275.6 )
								if( rsi1 <= 59.9126 )
									ret := -0.006783
								if( rsi1 > 59.9126 )
									ret := -0.268509
							if( ad_mf > 63275.6 )
								if( smoothD_d <= 41.4146 )
									ret := 0.093009
								if( smoothD_d > 41.4146 )
									ret := -0.216080
						if( d_k > -4.60573 )
							if( rsi1 <= 68.9228 )
								if( mf <= -0.173754 )
									ret := 0.004723
								if( mf > -0.173754 )
									ret := -0.127057
							if( rsi1 > 68.9228 )
								if( d_k <= -3.60736 )
									ret := 0.684211
								if( d_k > -3.60736 )
									ret := 0.038217
				if( smoothD_d > 47.0489 )
					if( mf <= -0.070901 )
						if( smoothD_d <= 60.4548 )
							if( ad_mf <= 167896 )
								if( d_k <= -6.69707 )
									ret := 0.011765
								if( d_k > -6.69707 )
									ret := 0.271157
							if( ad_mf > 167896 )
								if( rsi1 <= 49.2109 )
									ret := 0.285714
								if( rsi1 > 49.2109 )
									ret := -0.937500 // sell
						if( smoothD_d > 60.4548 )
							if( ad_mf <= 200921 )
								if( rsi1 <= 64.7484 )
									ret := -0.071895
								if( rsi1 > 64.7484 )
									ret := 0.300000
							if( ad_mf > 200921 )
								ret := -0.785714 // sell
					if( mf > -0.070901 )
						if( smoothK_k <= 46.7234 )
							if( k <= 43.4619 )
								if( smoothD_d <= 62.8195 )
									ret := -0.056995
								if( smoothD_d > 62.8195 )
									ret := 0.440000
							if( k > 43.4619 )
								if( d_k <= 21.0795 )
									ret := 0.153989
								if( d_k > 21.0795 )
									ret := 0.611111
						if( smoothK_k > 46.7234 )
							if( ad <= -26.8723 )
								ret := -0.909091 // sell
							if( ad > -26.8723 )
								if( smoothD_d <= 78.2683 )
									ret := -0.037591
								if( smoothD_d > 78.2683 )
									ret := 0.736842 // buy
	if( k > 65.5456 )
		if( ad <= -472.714 )
			if( ad_mf <= -19073.6 )
				if( mf <= -0.669881 )
					if( smoothK_k <= 78.6258 )
						if( k <= 75.4272 )
							if( ad <= -356020 )
								ret := -0.722222 // sell
							if( ad > -356020 )
								ret := -1.000000 // sell
						if( k > 75.4272 )
							ret := -0.333333
					if( smoothK_k > 78.6258 )
						ret := -1.000000 // sell
				if( mf > -0.669881 )
					if( ad <= -378503 )
						if( rsi1 <= 47.5395 )
							if( d <= 75.3938 )
								ret := 0.300000
							if( d > 75.3938 )
								if( smoothD_d <= 80.9806 )
									ret := 1.000000 // buy
								if( smoothD_d > 80.9806 )
									ret := 0.720000 // buy
						if( rsi1 > 47.5395 )
							if( d <= 92.5331 )
								if( d_k <= -14.0701 )
									ret := -0.562500
								if( d_k > -14.0701 )
									ret := 0.265487
							if( d > 92.5331 )
								if( d <= 94.2527 )
									ret := 0.833333 // buy
								if( d > 94.2527 )
									ret := 0.307692
					if( ad > -378503 )
						if( ad_mf <= -323955 )
							if( rsi1 <= 75.8337 )
								if( mf <= -0.119956 )
									ret := -0.472727
								if( mf > -0.119956 )
									ret := -0.750000 // sell
							if( rsi1 > 75.8337 )
								ret := 0.692308
						if( ad_mf > -323955 )
							if( ad <= -117031 )
								if( rsi1 <= 57.4474 )
									ret := 0.206751
								if( rsi1 > 57.4474 )
									ret := -0.080808
							if( ad > -117031 )
								if( d_k <= 7.96521 )
									ret := -0.126038
								if( d_k > 7.96521 )
									ret := 0.064159
			if( ad_mf > -19073.6 )
				if( rsi1 <= 62.6709 )
					if( d_k <= 13.7548 )
						if( mf <= -0.476499 )
							if( ad_mf <= -626.074 )
								if( d <= 69.1662 )
									ret := 0.266667
								if( d > 69.1662 )
									ret := -0.353333
							if( ad_mf > -626.074 )
								ret := 0.722222 // buy
						if( mf > -0.476499 )
							if( smoothK_k <= 67.6238 )
								if( smoothK_k <= 63.1659 )
									ret := 0.311475
								if( smoothK_k > 63.1659 )
									ret := -0.100962
							if( smoothK_k > 67.6238 )
								if( rsi1 <= 49.5162 )
									ret := 0.013767
								if( rsi1 > 49.5162 )
									ret := 0.175104
					if( d_k > 13.7548 )
						if( k <= 67.1546 )
							ret := 0.800000 // buy
						if( k > 67.1546 )
							if( ad_mf <= -8692.02 )
								ret := 0.733333 // buy
							if( ad_mf > -8692.02 )
								if( smoothK_k <= 66.2248 )
									ret := -0.076923
								if( smoothK_k > 66.2248 )
									ret := 0.200000
				if( rsi1 > 62.6709 )
					if( ad <= -485.159 )
						if( smoothD_d <= 79.6229 )
							if( d <= 76.522 )
								if( mf <= -0.197132 )
									ret := -0.525424
								if( mf > -0.197132 )
									ret := 0.052897
							if( d > 76.522 )
								if( mf <= 0.359328 )
									ret := -0.389474
								if( mf > 0.359328 )
									ret := 0.055556
						if( smoothD_d > 79.6229 )
							if( mf <= 0.54261 )
								if( ad_mf <= -783.034 )
									ret := 0.065200
								if( ad_mf > -783.034 )
									ret := -0.254335
							if( mf > 0.54261 )
								if( smoothD_d <= 84.5982 )
									ret := 0.000000
								if( smoothD_d > 84.5982 )
									ret := 0.666667
					if( ad > -485.159 )
						ret := 0.736842 // buy
		if( ad > -472.714 )
			if( smoothD_d <= 39.496 )
				if( k <= 66.2051 )
					if( smoothK_k <= 62.7981 )
						ret := 0.416667
					if( smoothK_k > 62.7981 )
						ret := 0.000000
				if( k > 66.2051 )
					if( rsi1 <= 62.3206 )
						if( d <= 41.4219 )
							if( ad_mf <= 36955.3 )
								if( rsi1 <= 48.3949 )
									ret := -0.727273 // sell
								if( rsi1 > 48.3949 )
									ret := -1.000000 // sell
							if( ad_mf > 36955.3 )
								ret := 0.176471
						if( d > 41.4219 )
							ret := -1.000000 // sell
					if( rsi1 > 62.3206 )
						if( smoothD_d <= 37.1543 )
							if( d <= 37.7061 )
								ret := -0.090909
							if( d > 37.7061 )
								ret := -0.866667 // sell
						if( smoothD_d > 37.1543 )
							ret := 0.071429
			if( smoothD_d > 39.496 )
				if( mf <= -0.000473 )
					if( d_k <= 3.0793 )
						if( smoothD_d <= 48.2754 )
							if( ad <= 141866 )
								if( d_k <= -29.4657 )
									ret := 0.769231 // buy
								if( d_k > -29.4657 )
									ret := 0.202247
							if( ad > 141866 )
								ret := -0.625000
						if( smoothD_d > 48.2754 )
							if( smoothK_k <= 87.9913 )
								if( rsi1 <= 58.7546 )
									ret := -0.099677
								if( rsi1 > 58.7546 )
									ret := -0.304813
							if( smoothK_k > 87.9913 )
								if( d <= 86.0744 )
									ret := 0.017241
								if( d > 86.0744 )
									ret := -0.128584
					if( d_k > 3.0793 )
						if( rsi1 <= 38.3448 )
							if( ad_mf <= 0.212566 )
								if( smoothK_k <= 77.4521 )
									ret := 0.777778 // buy
								if( smoothK_k > 77.4521 )
									ret := 0.900000 // buy
							if( ad_mf > 0.212566 )
								if( smoothD_d <= 78.3677 )
									ret := 0.511111
								if( smoothD_d > 78.3677 )
									ret := 0.102041
						if( rsi1 > 38.3448 )
							if( ad <= 1104.21 )
								if( rsi1 <= 66.0329 )
									ret := -0.085366
								if( rsi1 > 66.0329 )
									ret := 0.353383
							if( ad > 1104.21 )
								if( ad <= 1216.33 )
									ret := -0.941176 // sell
								if( ad > 1216.33 )
									ret := -0.111498
				if( mf > -0.000473 )
					if( mf <= 0.011822 )
						if( rsi1 <= 70.4103 )
							if( d_k <= -19.502 )
								ret := 0.714286 // buy
							if( d_k > -19.502 )
								if( ad_mf <= 1333.37 )
									ret := -0.022556
								if( ad_mf > 1333.37 )
									ret := 0.342857
						if( rsi1 > 70.4103 )
							if( rsi1 <= 75.2723 )
								if( smoothD_d <= 91.7072 )
									ret := -0.218750
								if( smoothD_d > 91.7072 )
									ret := -0.894737 // sell
							if( rsi1 > 75.2723 )
								if( d <= 85.6472 )
									ret := 0.533333
								if( d > 85.6472 )
									ret := -0.250000
					if( mf > 0.011822 )
						if( ad <= 301807 )
							if( ad <= 114635 )
								if( rsi1 <= 57.9237 )
									ret := 0.028683
								if( rsi1 > 57.9237 )
									ret := -0.103376
							if( ad > 114635 )
								if( ad_mf <= 295134 )
									ret := 0.056905
								if( ad_mf > 295134 )
									ret := 0.916667 // buy
						if( ad > 301807 )
							if( ad_mf <= 363513 )
								if( d_k <= -0.166096 )
									ret := -0.849206 // sell
								if( d_k > -0.166096 )
									ret := -0.181818
							if( ad_mf > 363513 )
								if( mf <= 0.509973 )
									ret := 0.000000
								if( mf > 0.509973 )
									ret := -0.375635
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_CRWD_15Min_260012f3(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


