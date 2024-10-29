//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: PINS_15Min_2CT0_db55cf6c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_15Min_2CT0_db55cf6c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_15Min_db55cf6c(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ad <= 187.108 )
		if( ad <= -22313.5 )
			if( ad_mf <= -25350.3 )
				if( ema12 <= -0.152673 )
					if( tema <= 31.4426 )
						if( ema2 <= 30.6411 )
							if( ad <= -150780 )
								if( ad_mf <= -392338 )
									ret := 0.048356
								if( ad_mf > -392338 )
									ret := 0.316957
							if( ad > -150780 )
								if( ad_mf <= -144847 )
									ret := -0.687500
								if( ad_mf > -144847 )
									ret := 0.038462
						if( ema2 > 30.6411 )
							if( ad <= -157042 )
								if( ema1 <= 31.5601 )
									ret := 0.483146
								if( ema1 > 31.5601 )
									ret := -0.052632
							if( ad > -157042 )
								if( ema1 <= 31.4707 )
									ret := 0.656250
								if( ema1 > 31.4707 )
									ret := 1.000000 // buy
					if( tema > 31.4426 )
						if( ema13 <= -0.160027 )
							if( tema <= 71.1559 )
								if( ema12 <= -1.52432 )
									ret := -0.538462
								if( ema12 > -1.52432 )
									ret := 0.066581
							if( tema > 71.1559 )
								if( ad <= -105368 )
									ret := -0.183908
								if( ad > -105368 )
									ret := 0.258065
						if( ema13 > -0.160027 )
							if( ema1 <= 45.6295 )
								ret := -0.357143
							if( ema1 > 45.6295 )
								if( tema <= 69.7677 )
									ret := 0.527778
								if( tema > 69.7677 )
									ret := 0.937500 // buy
				if( ema12 > -0.152673 )
					if( ad <= -3.01336e+06 )
						if( ad_mf <= -3.56006e+06 )
							if( ema3 <= 48.1998 )
								ret := 0.384615
							if( ema3 > 48.1998 )
								ret := -0.555556
						if( ad_mf > -3.56006e+06 )
							if( ema3 <= 27.1523 )
								ret := -0.500000
							if( ema3 > 27.1523 )
								if( ema13 <= 0.101591 )
									ret := -1.000000 // sell
								if( ema13 > 0.101591 )
									ret := -0.800000 // sell
					if( ad > -3.01336e+06 )
						if( ad_mf <= -386499 )
							if( ad_mf <= -391936 )
								if( ad <= -395051 )
									ret := 0.049849
								if( ad > -395051 )
									ret := -0.739130 // sell
							if( ad_mf > -391936 )
								if( ema2 <= 28.8849 )
									ret := 0.454545
								if( ema2 > 28.8849 )
									ret := 0.941176 // buy
						if( ad_mf > -386499 )
							if( ad_mf <= -167521 )
								if( ema12 <= 0.173312 )
									ret := -0.108840
								if( ema12 > 0.173312 )
									ret := 0.067335
							if( ad_mf > -167521 )
								if( ema13 <= 0.993826 )
									ret := -0.001998
								if( ema13 > 0.993826 )
									ret := 0.344262
			if( ad_mf > -25350.3 )
				if( ad <= -23699.4 )
					if( ad <= -23791.5 )
						if( mf <= 0.22625 )
							if( ema2 <= 22.7897 )
								if( ad <= -24503.4 )
									ret := -0.285714
								if( ad > -24503.4 )
									ret := 0.142857
							if( ema2 > 22.7897 )
								if( ad_mf <= -25141.5 )
									ret := -0.928571 // sell
								if( ad_mf > -25141.5 )
									ret := -0.434343
						if( mf > 0.22625 )
							if( ema1 <= 28.3545 )
								ret := 0.600000
							if( ema1 > 28.3545 )
								ret := -0.235294
					if( ad > -23791.5 )
						ret := -1.000000 // sell
				if( ad > -23699.4 )
					if( ema3 <= 40.652 )
						if( ad <= -23511.8 )
							ret := 0.263158
						if( ad > -23511.8 )
							if( tema <= 34.5906 )
								if( tema <= 32.639 )
									ret := -0.529412
								if( tema > 32.639 )
									ret := 0.125000
							if( tema > 34.5906 )
								ret := -0.933333 // sell
					if( ema3 > 40.652 )
						if( ema12 <= 0.069381 )
							if( ema13 <= -0.295245 )
								ret := 0.933333 // buy
							if( ema13 > -0.295245 )
								ret := 0.611111
						if( ema12 > 0.069381 )
							ret := -0.083333
		if( ad > -22313.5 )
			if( ad_mf <= -456.365 )
				if( ema12 <= -0.020446 )
					if( tema <= 26.81 )
						if( ad <= -1475.38 )
							if( ema12 <= -0.148892 )
								if( ema13 <= -0.296256 )
									ret := 0.310345
								if( ema13 > -0.296256 )
									ret := 0.609756
							if( ema12 > -0.148892 )
								if( ema1 <= 25.216 )
									ret := 0.173913
								if( ema1 > 25.216 )
									ret := 0.305556
						if( ad > -1475.38 )
							if( ema1 <= 16.5882 )
								if( ad_mf <= -738.772 )
									ret := -0.812500 // sell
								if( ad_mf > -738.772 )
									ret := -0.111111
							if( ema1 > 16.5882 )
								if( mf <= -0.095314 )
									ret := 0.305344
								if( mf > -0.095314 )
									ret := 0.590909
					if( tema > 26.81 )
						if( ema12 <= -0.464813 )
							if( ema13 <= -0.855861 )
								if( ema12 <= -0.530388 )
									ret := 0.532258
								if( ema12 > -0.530388 )
									ret := -0.034483
							if( ema13 > -0.855861 )
								if( tema <= 67.7397 )
									ret := 0.862069 // buy
								if( tema > 67.7397 )
									ret := 1.000000 // buy
						if( ema12 > -0.464813 )
							if( ema12 <= -0.153862 )
								if( tema <= 36.8391 )
									ret := 0.159170
								if( tema > 36.8391 )
									ret := -0.153713
							if( ema12 > -0.153862 )
								if( ema13 <= -0.026329 )
									ret := 0.099121
								if( ema13 > -0.026329 )
									ret := 0.365385
				if( ema12 > -0.020446 )
					if( ad_mf <= -20153.2 )
						if( ema13 <= 0.292058 )
							if( ad_mf <= -22073.7 )
								ret := -0.692308
							if( ad_mf > -22073.7 )
								if( ad <= -22016.1 )
									ret := 0.800000 // buy
								if( ad > -22016.1 )
									ret := 0.179310
						if( ema13 > 0.292058 )
							if( ad <= -20239.5 )
								if( ema3 <= 26.9243 )
									ret := 0.454545
								if( ema3 > 26.9243 )
									ret := 0.709677 // buy
							if( ad > -20239.5 )
								ret := 1.000000 // buy
					if( ad_mf > -20153.2 )
						if( ad_mf <= -463.877 )
							if( mf <= 0.112707 )
								if( ema13 <= -0.130074 )
									ret := -0.694444
								if( ema13 > -0.130074 )
									ret := 0.017827
							if( mf > 0.112707 )
								if( ad <= -8936.3 )
									ret := -0.085770
								if( ad > -8936.3 )
									ret := 0.133723
						if( ad_mf > -463.877 )
							if( ema3 <= 35.3056 )
								ret := 0.941176 // buy
							if( ema3 > 35.3056 )
								ret := 0.384615
			if( ad_mf > -456.365 )
				if( ema13 <= 0.020429 )
					if( ema12 <= -0.01422 )
						if( tema <= 17.0715 )
							if( ema12 <= -0.165754 )
								if( mf <= 0.180874 )
									ret := -0.777778 // sell
								if( mf > 0.180874 )
									ret := -1.000000 // sell
							if( ema12 > -0.165754 )
								if( ema3 <= 15.3223 )
									ret := 0.175926
								if( ema3 > 15.3223 )
									ret := -0.438356
						if( tema > 17.0715 )
							if( ema12 <= -0.465061 )
								if( ema12 <= -0.635385 )
									ret := 0.872340 // buy
								if( ema12 > -0.635385 )
									ret := 0.475000
							if( ema12 > -0.465061 )
								if( ema13 <= -0.6231 )
									ret := -0.318182
								if( ema13 > -0.6231 )
									ret := 0.183163
					if( ema12 > -0.01422 )
						if( ema2 <= 79.9682 )
							if( ad <= -231.02 )
								if( ad <= -342.996 )
									ret := -0.064516
								if( ad > -342.996 )
									ret := -0.600000
							if( ad > -231.02 )
								if( tema <= 34.9263 )
									ret := 0.060421
								if( tema > 34.9263 )
									ret := -0.147971
						if( ema2 > 79.9682 )
							if( mf <= 0.061112 )
								ret := 0.625000
							if( mf > 0.061112 )
								ret := 1.000000 // buy
				if( ema13 > 0.020429 )
					if( mf <= -0.047065 )
						if( ema3 <= 25.9509 )
							if( ema1 <= 25.3232 )
								if( ema2 <= 25.02 )
									ret := -0.292969
								if( ema2 > 25.02 )
									ret := 0.394737
							if( ema1 > 25.3232 )
								if( ema12 <= 0.031521 )
									ret := -0.967742 // sell
								if( ema12 > 0.031521 )
									ret := -0.750000 // sell
						if( ema3 > 25.9509 )
							if( ema12 <= 0.286188 )
								if( mf <= -0.332451 )
									ret := -0.358974
								if( mf > -0.332451 )
									ret := -0.018100
							if( ema12 > 0.286188 )
								if( ema12 <= 0.704115 )
									ret := -0.872727 // sell
								if( ema12 > 0.704115 )
									ret := -0.222222
					if( mf > -0.047065 )
						if( ema2 <= 77.6592 )
							if( ad_mf <= 0.046857 )
								if( ema12 <= -0.005967 )
									ret := 0.635294
								if( ema12 > -0.005967 )
									ret := -0.083230
							if( ad_mf > 0.046857 )
								if( ema1 <= 25.9947 )
									ret := 0.785714 // buy
								if( ema1 > 25.9947 )
									ret := 0.608696
						if( ema2 > 77.6592 )
							if( ema1 <= 85.6414 )
								if( mf <= 0.434549 )
									ret := 0.617978
								if( mf > 0.434549 )
									ret := 0.000000
							if( ema1 > 85.6414 )
								if( ema13 <= 0.189682 )
									ret := -0.750000 // sell
								if( ema13 > 0.189682 )
									ret := -0.066667
	if( ad > 187.108 )
		if( tema <= 19.9064 )
			if( ad <= 4020.65 )
				if( ema13 <= -0.009415 )
					if( ad <= 663.666 )
						if( ema2 <= 19.5438 )
							if( ad <= 500.266 )
								if( ad_mf <= 283.128 )
									ret := -0.454545
								if( ad_mf > 283.128 )
									ret := 0.117647
							if( ad > 500.266 )
								if( mf <= -8.1e-05 )
									ret := 1.000000 // buy
								if( mf > -8.1e-05 )
									ret := 0.741935 // buy
						if( ema2 > 19.5438 )
							ret := -0.368421
					if( ad > 663.666 )
						if( ema13 <= -0.015903 )
							if( tema <= 16.3087 )
								if( ad <= 2683.52 )
									ret := -0.322581
								if( ad > 2683.52 )
									ret := -0.931034 // sell
							if( tema > 16.3087 )
								if( ad <= 3085.04 )
									ret := -0.170732
								if( ad > 3085.04 )
									ret := 0.294118
						if( ema13 > -0.015903 )
							ret := 0.900000 // buy
				if( ema13 > -0.009415 )
					if( ema13 <= 0.099051 )
						if( ad <= 1792.97 )
							if( ema12 <= 0.009944 )
								if( ema13 <= 0.01731 )
									ret := -0.280000
								if( ema13 > 0.01731 )
									ret := 0.190476
							if( ema12 > 0.009944 )
								if( ad_mf <= 879.895 )
									ret := -0.623377
								if( ad_mf > 879.895 )
									ret := -0.240000
						if( ad > 1792.97 )
							if( tema <= 17.7312 )
								if( ema12 <= 0.029613 )
									ret := -0.857143 // sell
								if( ema12 > 0.029613 )
									ret := -1.000000 // sell
							if( tema > 17.7312 )
								if( mf <= 0.217718 )
									ret := -0.540000
								if( mf > 0.217718 )
									ret := -1.000000 // sell
					if( ema13 > 0.099051 )
						if( mf <= -0.48274 )
							ret := 0.428571
						if( mf > -0.48274 )
							if( ad <= 2491.51 )
								if( ad <= 948.353 )
									ret := -0.350000
								if( ad > 948.353 )
									ret := 0.072289
							if( ad > 2491.51 )
								if( ema2 <= 18.6254 )
									ret := -0.973684 // sell
								if( ema2 > 18.6254 )
									ret := -0.714286 // sell
			if( ad > 4020.65 )
				if( ema2 <= 16.4434 )
					if( ad <= 649580 )
						if( mf <= -0.184586 )
							if( ema13 <= -0.223892 )
								ret := -0.250000
							if( ema13 > -0.223892 )
								if( tema <= 14.262 )
									ret := 0.909091 // buy
								if( tema > 14.262 )
									ret := 0.090909
						if( mf > -0.184586 )
							if( ema13 <= 0.018423 )
								if( mf <= 0.100849 )
									ret := -0.471591
								if( mf > 0.100849 )
									ret := -0.046875
							if( ema13 > 0.018423 )
								if( ema12 <= 0.059097 )
									ret := 0.322034
								if( ema12 > 0.059097 )
									ret := -0.261745
					if( ad > 649580 )
						if( ema3 <= 13.6821 )
							ret := 1.000000 // buy
						if( ema3 > 13.6821 )
							ret := 0.318182
				if( ema2 > 16.4434 )
					if( ad_mf <= 281262 )
						if( ema12 <= -0.573796 )
							if( ad <= 36138.7 )
								ret := -0.933333 // sell
							if( ad > 36138.7 )
								ret := -0.230769
						if( ema12 > -0.573796 )
							if( ema12 <= -0.231736 )
								if( ema1 <= 18.9516 )
									ret := 0.945946 // buy
								if( ema1 > 18.9516 )
									ret := 0.062500
							if( ema12 > -0.231736 )
								if( ad_mf <= 267979 )
									ret := 0.116147
								if( ad_mf > 267979 )
									ret := -0.531250
					if( ad_mf > 281262 )
						if( mf <= 0.075284 )
							if( ema12 <= -0.026942 )
								if( ema13 <= -0.232915 )
									ret := 0.493506
								if( ema13 > -0.232915 )
									ret := 0.890110 // buy
							if( ema12 > -0.026942 )
								if( ema13 <= -0.005385 )
									ret := -0.129032
								if( ema13 > -0.005385 )
									ret := 0.642857
						if( mf > 0.075284 )
							if( ema13 <= -0.191238 )
								ret := -0.625000
							if( ema13 > -0.191238 )
								if( ema12 <= 0.047081 )
									ret := 0.417323
								if( ema12 > 0.047081 )
									ret := 0.162500
		if( tema > 19.9064 )
			if( ema13 <= 0.222123 )
				if( ema1 <= 29.0851 )
					if( ema12 <= -0.144088 )
						if( ad_mf <= 400.011 )
							ret := -0.923077 // sell
						if( ad_mf > 400.011 )
							if( ema1 <= 24.8703 )
								if( tema <= 22.5122 )
									ret := -0.032143
								if( tema > 22.5122 )
									ret := 0.429719
							if( ema1 > 24.8703 )
								if( ema2 <= 25.5964 )
									ret := -0.353659
								if( ema2 > 25.5964 )
									ret := 0.019784
					if( ema12 > -0.144088 )
						if( tema <= 23.7401 )
							if( ad_mf <= 1.97785e+06 )
								if( ad_mf <= 281184 )
									ret := -0.070851
								if( ad_mf > 281184 )
									ret := 0.116965
							if( ad_mf > 1.97785e+06 )
								if( tema <= 22.641 )
									ret := -0.885714 // sell
								if( tema > 22.641 )
									ret := -0.250000
						if( tema > 23.7401 )
							if( ema13 <= 0.10202 )
								if( ad <= 937.768 )
									ret := -0.373476
								if( ad > 937.768 )
									ret := -0.097188
							if( ema13 > 0.10202 )
								if( ad <= 15445.7 )
									ret := -0.171018
								if( ad > 15445.7 )
									ret := 0.052797
				if( ema1 > 29.0851 )
					if( tema <= 29.364 )
						if( ema1 <= 29.1034 )
							if( ema3 <= 29.089 )
								ret := 0.500000
							if( ema3 > 29.089 )
								ret := 0.933333 // buy
						if( ema1 > 29.1034 )
							if( ema12 <= 0.04295 )
								if( ema2 <= 29.3522 )
									ret := -0.123810
								if( ema2 > 29.3522 )
									ret := 0.185841
							if( ema12 > 0.04295 )
								if( ad <= 97276 )
									ret := 0.343750
								if( ad > 97276 )
									ret := 0.772727 // buy
					if( tema > 29.364 )
						if( ema2 <= 65.3431 )
							if( ad <= 1159.95 )
								if( mf <= 0.459377 )
									ret := -0.176991
								if( mf > 0.459377 )
									ret := -0.626866
							if( ad > 1159.95 )
								if( ema1 <= 57.7635 )
									ret := -0.001325
								if( ema1 > 57.7635 )
									ret := -0.101911
						if( ema2 > 65.3431 )
							if( ema3 <= 69.7059 )
								if( ema3 <= 69.6347 )
									ret := 0.151786
								if( ema3 > 69.6347 )
									ret := 0.761905 // buy
							if( ema3 > 69.7059 )
								if( ad <= 1412.36 )
									ret := 0.195730
								if( ad > 1412.36 )
									ret := -0.046079
			if( ema13 > 0.222123 )
				if( ema2 <= 19.4034 )
					ret := -0.807692 // sell
				if( ema2 > 19.4034 )
					if( tema <= 20.8723 )
						if( ad <= 612270 )
							if( ad <= 264676 )
								if( ema1 <= 20.5885 )
									ret := 0.045455
								if( ema1 > 20.5885 )
									ret := 0.857143 // buy
							if( ad > 264676 )
								if( ema1 <= 19.9317 )
									ret := -1.000000 // sell
								if( ema1 > 19.9317 )
									ret := -0.304348
						if( ad > 612270 )
							if( ad_mf <= 1.05814e+06 )
								ret := 0.533333
							if( ad_mf > 1.05814e+06 )
								ret := 0.909091 // buy
					if( tema > 20.8723 )
						if( ema3 <= 22.6658 )
							if( mf <= 0.002905 )
								if( ema12 <= 0.129352 )
									ret := -0.588235
								if( ema12 > 0.129352 )
									ret := -0.865385 // sell
							if( mf > 0.002905 )
								if( ad <= 20361.5 )
									ret := -0.644737
								if( ad > 20361.5 )
									ret := -0.109043
						if( ema3 > 22.6658 )
							if( ad_mf <= 32937 )
								if( ema1 <= 34.8185 )
									ret := -0.312009
								if( ema1 > 34.8185 )
									ret := -0.127847
							if( ad_mf > 32937 )
								if( ad <= 414689 )
									ret := -0.018787
								if( ad > 414689 )
									ret := -0.196604
	
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

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_PINS_15Min_db55cf6c(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


