//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: RIVN_1Min_2CS0_e29c25ab Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RIVN_1Min_2CS0_e29c25ab", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RIVN_1Min_e29c25ab(mf, ad, ad_mf, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ad_mf <= -204.799 )
		if( ad_mf <= -6350.42 )
			if( mf <= -0.313888 )
				if( smoothD_d <= 5.07868 )
					if( ad_mf <= -156222 )
						if( smoothK_k <= -2.69701 )
							if( smoothD_d <= -2.40795 )
								ret := 0.000000
							if( smoothD_d > -2.40795 )
								ret := -0.400000
						if( smoothK_k > -2.69701 )
							if( rsi1 <= 25.174 )
								if( smoothK_k <= 2.24257 )
									ret := 0.875000 // buy
								if( smoothK_k > 2.24257 )
									ret := 0.076923
							if( rsi1 > 25.174 )
								ret := -0.100000
					if( ad_mf > -156222 )
						if( ad_mf <= -100171 )
							if( ad <= -110377 )
								if( ad_mf <= -133478 )
									ret := -0.555556
								if( ad_mf > -133478 )
									ret := 0.307692
							if( ad > -110377 )
								ret := -1.000000 // sell
						if( ad_mf > -100171 )
							if( rsi1 <= 32.0324 )
								if( d <= 2.32265 )
									ret := 0.052632
								if( d > 2.32265 )
									ret := -0.227723
							if( rsi1 > 32.0324 )
								if( d <= 6.29521 )
									ret := 0.433333
								if( d > 6.29521 )
									ret := 0.058824
				if( smoothD_d > 5.07868 )
					if( d <= 69.7486 )
						if( ad <= -29080.7 )
							if( k <= 2.53466 )
								if( ad_mf <= -73451.6 )
									ret := -0.619048
								if( ad_mf > -73451.6 )
									ret := 0.333333
							if( k > 2.53466 )
								if( ad <= -139016 )
									ret := 0.407942
								if( ad > -139016 )
									ret := 0.121753
						if( ad > -29080.7 )
							if( ad_mf <= -13611.9 )
								if( rsi1 <= 52.9654 )
									ret := 0.605364
								if( rsi1 > 52.9654 )
									ret := -0.235294
							if( ad_mf > -13611.9 )
								if( ad <= -13383.5 )
									ret := -0.846154 // sell
								if( ad > -13383.5 )
									ret := 0.287709
					if( d > 69.7486 )
						if( ad <= -310141 )
							if( ad <= -554463 )
								if( smoothK_k <= 71.4646 )
									ret := 0.888889 // buy
								if( smoothK_k > 71.4646 )
									ret := 0.666667
							if( ad > -554463 )
								ret := 1.000000 // buy
						if( ad > -310141 )
							if( smoothK_k <= 69.6622 )
								if( ad <= -27569.6 )
									ret := -0.610169
								if( ad > -27569.6 )
									ret := -0.041667
							if( smoothK_k > 69.6622 )
								if( d_k <= -4.30544 )
									ret := -0.145631
								if( d_k > -4.30544 )
									ret := 0.277778
			if( mf > -0.313888 )
				if( d_k <= -15.565 )
					if( ad_mf <= -422872 )
						ret := -0.933333 // sell
					if( ad_mf > -422872 )
						if( ad_mf <= -137801 )
							if( ad_mf <= -211729 )
								if( mf <= 0.055589 )
									ret := 0.214286
								if( mf > 0.055589 )
									ret := -1.000000 // sell
							if( ad_mf > -211729 )
								if( d <= 30.6728 )
									ret := 0.000000
								if( d > 30.6728 )
									ret := 0.675676
						if( ad_mf > -137801 )
							if( ad <= -52960.7 )
								if( smoothD_d <= 71.7965 )
									ret := -0.291096
								if( smoothD_d > 71.7965 )
									ret := -0.840000 // sell
							if( ad > -52960.7 )
								if( rsi1 <= 77.1254 )
									ret := -0.109356
								if( rsi1 > 77.1254 )
									ret := 0.769231 // buy
				if( d_k > -15.565 )
					if( d_k <= 22.0292 )
						if( ad <= -19360.4 )
							if( d_k <= 0.67759 )
								if( ad <= -19831.5 )
									ret := 0.000782
								if( ad > -19831.5 )
									ret := -0.390071
							if( d_k > 0.67759 )
								if( ad <= -21562.1 )
									ret := 0.046205
								if( ad > -21562.1 )
									ret := -0.158416
						if( ad > -19360.4 )
							if( ad <= -19162.8 )
								if( d <= 50.0165 )
									ret := 0.311111
								if( d > 50.0165 )
									ret := 0.833333 // buy
							if( ad > -19162.8 )
								if( k <= 98.2356 )
									ret := 0.078051
								if( k > 98.2356 )
									ret := -0.210280
					if( d_k > 22.0292 )
						if( ad_mf <= -310987 )
							if( d_k <= 23.6486 )
								ret := 0.200000
							if( d_k > 23.6486 )
								ret := -0.888889 // sell
						if( ad_mf > -310987 )
							if( rsi1 <= 40.9182 )
								if( smoothK_k <= 37.1253 )
									ret := 0.279245
								if( smoothK_k > 37.1253 )
									ret := 0.492308
							if( rsi1 > 40.9182 )
								if( ad_mf <= -59268.6 )
									ret := 0.390533
								if( ad_mf > -59268.6 )
									ret := 0.064690
		if( ad_mf > -6350.42 )
			if( ad <= -6260.41 )
				if( smoothD_d <= 79.1782 )
					if( d_k <= 10.0081 )
						if( mf <= -0.149277 )
							ret := 0.545455
						if( mf > -0.149277 )
							if( d_k <= 1.7622 )
								if( ad <= -6321.59 )
									ret := 1.000000 // buy
								if( ad > -6321.59 )
									ret := 0.500000
							if( d_k > 1.7622 )
								ret := 1.000000 // buy
					if( d_k > 10.0081 )
						ret := 0.400000
				if( smoothD_d > 79.1782 )
					ret := 0.315789
			if( ad > -6260.41 )
				if( smoothK_k <= 62.8878 )
					if( k <= 28.4311 )
						if( ad_mf <= -759.629 )
							if( ad <= -803.596 )
								if( rsi1 <= 51.752 )
									ret := 0.142336
								if( rsi1 > 51.752 )
									ret := -0.066890
							if( ad > -803.596 )
								if( ad <= -789.612 )
									ret := -0.594595
								if( ad > -789.612 )
									ret := 0.037037
						if( ad_mf > -759.629 )
							if( ad_mf <= -500.651 )
								if( rsi1 <= 47.2673 )
									ret := 0.562290
								if( rsi1 > 47.2673 )
									ret := -0.137931
							if( ad_mf > -500.651 )
								if( d <= 7.11368 )
									ret := -0.027397
								if( d > 7.11368 )
									ret := 0.271523
					if( k > 28.4311 )
						if( ad <= -5212.77 )
							if( ad <= -5976.77 )
								if( rsi1 <= 51.0171 )
									ret := 0.525424
								if( rsi1 > 51.0171 )
									ret := -0.200000
							if( ad > -5976.77 )
								if( ad_mf <= -5957.25 )
									ret := -1.000000 // sell
								if( ad_mf > -5957.25 )
									ret := 0.033175
						if( ad > -5212.77 )
							if( k <= 30.4492 )
								if( rsi1 <= 30.9105 )
									ret := 0.066667
								if( rsi1 > 30.9105 )
									ret := 0.629870
							if( k > 30.4492 )
								if( ad_mf <= -4889.49 )
									ret := 0.559211
								if( ad_mf > -4889.49 )
									ret := 0.247089
				if( smoothK_k > 62.8878 )
					if( d <= 93.0309 )
						if( mf <= -0.133348 )
							if( mf <= -0.288885 )
								if( d <= 87.1632 )
									ret := -0.017032
								if( d > 87.1632 )
									ret := 0.309211
							if( mf > -0.288885 )
								if( d_k <= 6.17308 )
									ret := 0.287946
								if( d_k > 6.17308 )
									ret := 0.594203
						if( mf > -0.133348 )
							if( d_k <= -11.1379 )
								if( d_k <= -11.7945 )
									ret := 0.176692
								if( d_k > -11.7945 )
									ret := 0.653846
							if( d_k > -11.1379 )
								if( rsi1 <= 62.7329 )
									ret := 0.080492
								if( rsi1 > 62.7329 )
									ret := -0.103753
					if( d > 93.0309 )
						if( ad_mf <= -1184.18 )
							if( ad_mf <= -1395.65 )
								if( k <= 96.51 )
									ret := -0.219512
								if( k > 96.51 )
									ret := 0.046512
							if( ad_mf > -1395.65 )
								if( smoothK_k <= 89.7843 )
									ret := 0.833333 // buy
								if( smoothK_k > 89.7843 )
									ret := 0.360000
						if( ad_mf > -1184.18 )
							if( mf <= 0.127423 )
								if( ad <= -952.264 )
									ret := -0.606061
								if( ad > -952.264 )
									ret := 0.149425
							if( mf > 0.127423 )
								if( d_k <= -0.928363 )
									ret := -0.100000
								if( d_k > -0.928363 )
									ret := -0.680000
	if( ad_mf > -204.799 )
		if( k <= 4.88272 )
			if( smoothD_d <= -2.2743 )
				if( d_k <= 0.237861 )
					if( d <= 0.592158 )
						if( rsi1 <= 50.0773 )
							if( smoothK_k <= -2.89101 )
								if( smoothK_k <= -2.99953 )
									ret := 0.195035
								if( smoothK_k > -2.99953 )
									ret := 0.631579
							if( smoothK_k > -2.89101 )
								if( d <= 0.161166 )
									ret := -0.311111
								if( d > 0.161166 )
									ret := 0.173077
						if( rsi1 > 50.0773 )
							if( k <= 0.022188 )
								ret := 0.750000 // buy
							if( k > 0.022188 )
								ret := 0.958333 // buy
					if( d > 0.592158 )
						if( k <= 1.30831 )
							ret := 0.384615
						if( k > 1.30831 )
							if( smoothD_d <= -2.32413 )
								ret := 0.666667
							if( smoothD_d > -2.32413 )
								ret := 1.000000 // buy
				if( d_k > 0.237861 )
					if( smoothK_k <= -2.99639 )
						if( d_k <= 0.425673 )
							ret := -0.600000
						if( d_k > 0.425673 )
							if( d <= 0.54262 )
								ret := 0.500000
							if( d > 0.54262 )
								ret := 0.000000
					if( smoothK_k > -2.99639 )
						ret := -0.642857
			if( smoothD_d > -2.2743 )
				if( mf <= 0.080746 )
					if( ad_mf <= 35162.4 )
						if( k <= 0.073 )
							if( d_k <= 12.6336 )
								if( d <= 1.70225 )
									ret := -0.393443
								if( d > 1.70225 )
									ret := 0.030303
							if( d_k > 12.6336 )
								if( d <= 13.8314 )
									ret := -0.843750 // sell
								if( d > 13.8314 )
									ret := -0.158537
						if( k > 0.073 )
							if( rsi1 <= 8.71212 )
								if( rsi1 <= 7.18985 )
									ret := -0.160000
								if( rsi1 > 7.18985 )
									ret := -0.954545 // sell
							if( rsi1 > 8.71212 )
								if( ad_mf <= 29930.4 )
									ret := 0.064561
								if( ad_mf > 29930.4 )
									ret := 0.638889
					if( ad_mf > 35162.4 )
						if( ad_mf <= 42287.6 )
							if( smoothD_d <= 0.070347 )
								if( d <= 1.96037 )
									ret := -1.000000 // sell
								if( d > 1.96037 )
									ret := -0.875000 // sell
							if( smoothD_d > 0.070347 )
								if( d <= 7.26676 )
									ret := -0.090909
								if( d > 7.26676 )
									ret := -0.692308
						if( ad_mf > 42287.6 )
							if( d <= 5.17935 )
								if( ad <= 108900 )
									ret := -0.051095
								if( ad > 108900 )
									ret := -0.728814 // sell
							if( d > 5.17935 )
								if( rsi1 <= 22.0014 )
									ret := 0.529412
								if( rsi1 > 22.0014 )
									ret := -0.065789
				if( mf > 0.080746 )
					if( ad <= 68147.2 )
						if( smoothK_k <= 1.55374 )
							if( d_k <= 2.62406 )
								if( rsi1 <= 39.6792 )
									ret := 0.086758
								if( rsi1 > 39.6792 )
									ret := -0.216463
							if( d_k > 2.62406 )
								if( ad_mf <= 742.562 )
									ret := 0.245283
								if( ad_mf > 742.562 )
									ret := 0.032258
						if( smoothK_k > 1.55374 )
							if( smoothK_k <= 1.76326 )
								if( smoothD_d <= 5.22664 )
									ret := 0.666667
								if( smoothD_d > 5.22664 )
									ret := 0.263158
							if( smoothK_k > 1.76326 )
								if( ad_mf <= 6211.81 )
									ret := 0.300000
								if( ad_mf > 6211.81 )
									ret := 1.000000 // buy
					if( ad > 68147.2 )
						if( d_k <= 6.7684 )
							if( ad <= 126419 )
								if( k <= 1.35815 )
									ret := 0.100000
								if( k > 1.35815 )
									ret := 0.666667
							if( ad > 126419 )
								if( d_k <= -1.28537 )
									ret := -0.444444
								if( d_k > -1.28537 )
									ret := 0.285714
						if( d_k > 6.7684 )
							if( rsi1 <= 50.6753 )
								ret := 0.666667
							if( rsi1 > 50.6753 )
								ret := 0.958333 // buy
		if( k > 4.88272 )
			if( ad_mf <= 496.507 )
				if( d_k <= 5.75344 )
					if( rsi1 <= 53.7276 )
						if( rsi1 <= 41.6736 )
							if( d_k <= -22.6743 )
								if( d_k <= -24.3032 )
									ret := -0.714286 // sell
								if( d_k > -24.3032 )
									ret := -0.407407
							if( d_k > -22.6743 )
								if( d <= 19.6356 )
									ret := 0.009026
								if( d > 19.6356 )
									ret := 0.213462
						if( rsi1 > 41.6736 )
							if( ad <= 415.611 )
								if( d_k <= -2.08998 )
									ret := -0.044552
								if( d_k > -2.08998 )
									ret := 0.102849
							if( ad > 415.611 )
								if( k <= 20.8322 )
									ret := 0.230769
								if( k > 20.8322 )
									ret := -0.617647
					if( rsi1 > 53.7276 )
						if( smoothD_d <= 96.3111 )
							if( ad <= -169.201 )
								if( k <= 73.4641 )
									ret := -0.500000
								if( k > 73.4641 )
									ret := -0.903226 // sell
							if( ad > -169.201 )
								if( d_k <= -11.9182 )
									ret := 0.009211
								if( d_k > -11.9182 )
									ret := -0.168403
						if( smoothD_d > 96.3111 )
							if( k <= 99.9994 )
								if( smoothD_d <= 96.7426 )
									ret := 0.234568
								if( smoothD_d > 96.7426 )
									ret := 0.575758
							if( k > 99.9994 )
								if( mf <= -0.201968 )
									ret := 0.285714
								if( mf > -0.201968 )
									ret := -0.126904
				if( d_k > 5.75344 )
					if( ad_mf <= -0.264722 )
						if( smoothD_d <= 18.3318 )
							if( d_k <= 12.2062 )
								if( mf <= 0.327307 )
									ret := -0.464286
								if( mf > 0.327307 )
									ret := 0.050000
							if( d_k > 12.2062 )
								ret := -0.636364
						if( smoothD_d > 18.3318 )
							if( rsi1 <= 53.8453 )
								if( rsi1 <= 44.407 )
									ret := 0.266667
								if( rsi1 > 44.407 )
									ret := 0.015000
							if( rsi1 > 53.8453 )
								if( rsi1 <= 70.6293 )
									ret := -0.219462
								if( rsi1 > 70.6293 )
									ret := 0.114943
					if( ad_mf > -0.264722 )
						if( smoothK_k <= 46.2968 )
							if( mf <= -0.32069 )
								if( ad_mf <= 0.679752 )
									ret := 0.287411
								if( ad_mf > 0.679752 )
									ret := 0.015873
							if( mf > -0.32069 )
								if( d_k <= 6.97867 )
									ret := -0.209924
								if( d_k > 6.97867 )
									ret := 0.055095
						if( smoothK_k > 46.2968 )
							if( rsi1 <= 68.6912 )
								if( mf <= -0.342313 )
									ret := -0.096591
								if( mf > -0.342313 )
									ret := 0.182796
							if( rsi1 > 68.6912 )
								if( rsi1 <= 73.8185 )
									ret := -0.275000
								if( rsi1 > 73.8185 )
									ret := 0.136986
			if( ad_mf > 496.507 )
				if( k <= 5.29064 )
					if( ad_mf <= 5187.56 )
						if( d <= 4.39444 )
							ret := -1.000000 // sell
						if( d > 4.39444 )
							if( mf <= 0.068574 )
								ret := -0.615385
							if( mf > 0.068574 )
								ret := -0.800000 // sell
					if( ad_mf > 5187.56 )
						if( ad_mf <= 91836.2 )
							if( d_k <= 14.5276 )
								if( rsi1 <= 34.4383 )
									ret := -0.224490
								if( rsi1 > 34.4383 )
									ret := 0.172414
							if( d_k > 14.5276 )
								ret := -0.800000 // sell
						if( ad_mf > 91836.2 )
							if( smoothD_d <= 5.48644 )
								ret := -0.555556
							if( smoothD_d > 5.48644 )
								ret := -1.000000 // sell
				if( k > 5.29064 )
					if( ad <= 7509.52 )
						if( smoothD_d <= 75.1218 )
							if( k <= 71.6458 )
								if( d_k <= -4.61125 )
									ret := -0.218694
								if( d_k > -4.61125 )
									ret := -0.110734
							if( k > 71.6458 )
								if( ad_mf <= 5722.5 )
									ret := 0.069416
								if( ad_mf > 5722.5 )
									ret := -0.421384
						if( smoothD_d > 75.1218 )
							if( rsi1 <= 86.6166 )
								if( smoothD_d <= 86.7227 )
									ret := -0.278784
								if( smoothD_d > 86.7227 )
									ret := -0.106657
							if( rsi1 > 86.6166 )
								if( k <= 92.716 )
									ret := -0.962963 // sell
								if( k > 92.716 )
									ret := -0.457143
					if( ad > 7509.52 )
						if( ad <= 1.45255e+06 )
							if( d_k <= 8.4164 )
								if( d <= 93.5798 )
									ret := -0.066682
								if( d > 93.5798 )
									ret := 0.035947
							if( d_k > 8.4164 )
								if( smoothK_k <= 74.8877 )
									ret := 0.055902
								if( smoothK_k > 74.8877 )
									ret := -0.448276
						if( ad > 1.45255e+06 )
							if( d <= 58.3692 )
								ret := 1.000000 // buy
							if( d > 58.3692 )
								ret := 0.647059
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_RIVN_1Min_e29c25ab(mf, ad, ad_mf, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


