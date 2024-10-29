//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: TTD_15Min_2ST0_3e459f22 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TTD_15Min_2ST0_3e459f22", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TTD_15Min_3e459f22(rsi1, d, k, smoothD_d, d_k, smoothK_k, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema2 <= 42.7305 )
		if( rsi1 <= 28.0515 )
			if( smoothD_d <= 4.15706 )
				if( ema13 <= -0.430055 )
					if( ema12 <= -0.281203 )
						if( smoothD_d <= 0.817734 )
							ret := 1.000000 // buy
						if( smoothD_d > 0.817734 )
							ret := 0.909091 // buy
					if( ema12 > -0.281203 )
						ret := 0.666667
				if( ema13 > -0.430055 )
					if( d_k <= 1.19301 )
						if( rsi1 <= 19.7407 )
							ret := -0.583333
						if( rsi1 > 19.7407 )
							if( rsi1 <= 24.9491 )
								ret := 0.857143 // buy
							if( rsi1 > 24.9491 )
								ret := 0.000000
					if( d_k > 1.19301 )
						if( d_k <= 3.09326 )
							if( tema <= 37.3248 )
								ret := -1.000000 // sell
							if( tema > 37.3248 )
								ret := -0.900000 // sell
						if( d_k > 3.09326 )
							ret := -0.294118
			if( smoothD_d > 4.15706 )
				if( d_k <= -3.71982 )
					if( ema3 <= 36.8788 )
						ret := 1.000000 // buy
					if( ema3 > 36.8788 )
						if( ema13 <= -0.738443 )
							ret := 0.555556
						if( ema13 > -0.738443 )
							ret := -0.500000
				if( d_k > -3.71982 )
					if( d_k <= 0.47393 )
						if( d <= 16.8216 )
							ret := 1.000000 // buy
						if( d > 16.8216 )
							ret := 0.833333 // buy
					if( d_k > 0.47393 )
						if( d <= 10.2864 )
							if( ema12 <= -0.168994 )
								ret := 0.000000
							if( ema12 > -0.168994 )
								ret := 0.888889 // buy
						if( d > 10.2864 )
							if( k <= 8.62041 )
								if( smoothK_k <= 1.28702 )
									ret := 0.866667 // buy
								if( smoothK_k > 1.28702 )
									ret := 1.000000 // buy
							if( k > 8.62041 )
								if( ema12 <= -0.402549 )
									ret := 0.950000 // buy
								if( ema12 > -0.402549 )
									ret := 0.410256
		if( rsi1 > 28.0515 )
			if( ema2 <= 27.3273 )
				if( k <= 47.4852 )
					if( smoothD_d <= 8.28049 )
						if( ema2 <= 27.1215 )
							ret := 0.583333
						if( ema2 > 27.1215 )
							ret := -0.181818
					if( smoothD_d > 8.28049 )
						if( smoothK_k <= 18.2654 )
							if( ema1 <= 26.2395 )
								ret := 0.909091 // buy
							if( ema1 > 26.2395 )
								ret := 1.000000 // buy
						if( smoothK_k > 18.2654 )
							if( d <= 43.137 )
								if( ema1 <= 26.665 )
									ret := 0.000000
								if( ema1 > 26.665 )
									ret := 0.687500
							if( d > 43.137 )
								if( d_k <= 14.3223 )
									ret := 1.000000 // buy
								if( d_k > 14.3223 )
									ret := 0.777778 // buy
				if( k > 47.4852 )
					if( k <= 82.7328 )
						if( rsi1 <= 44.7593 )
							if( smoothK_k <= 55.2497 )
								ret := 1.000000 // buy
							if( smoothK_k > 55.2497 )
								ret := 0.450000
						if( rsi1 > 44.7593 )
							if( ema1 <= 26.6004 )
								if( ema13 <= 0.107811 )
									ret := 0.545455
								if( ema13 > 0.107811 )
									ret := 0.000000
							if( ema1 > 26.6004 )
								if( d_k <= -6.64041 )
									ret := 0.300000
								if( d_k > -6.64041 )
									ret := -0.742857 // sell
					if( k > 82.7328 )
						if( ema12 <= 0.011961 )
							if( ema13 <= -0.188037 )
								ret := 0.615385
							if( ema13 > -0.188037 )
								if( ema12 <= -0.033017 )
									ret := -0.200000
								if( ema12 > -0.033017 )
									ret := -0.900000 // sell
						if( ema12 > 0.011961 )
							if( tema <= 27.5134 )
								if( smoothK_k <= 82.1454 )
									ret := 0.545455
								if( smoothK_k > 82.1454 )
									ret := 0.901961 // buy
							if( tema > 27.5134 )
								if( d <= 93.0691 )
									ret := 0.800000 // buy
								if( d > 93.0691 )
									ret := 0.307692
			if( ema2 > 27.3273 )
				if( ema2 <= 30.0629 )
					if( rsi1 <= 54.9173 )
						if( ema13 <= 0.144992 )
							if( rsi1 <= 40.8205 )
								if( smoothD_d <= 11.1558 )
									ret := 0.620690
								if( smoothD_d > 11.1558 )
									ret := 0.250000
							if( rsi1 > 40.8205 )
								if( rsi1 <= 47.028 )
									ret := -0.115242
								if( rsi1 > 47.028 )
									ret := 0.184751
						if( ema13 > 0.144992 )
							if( d <= 52.8107 )
								ret := -0.500000
							if( d > 52.8107 )
								ret := -0.916667 // sell
					if( rsi1 > 54.9173 )
						if( k <= 62.4286 )
							if( tema <= 28.7529 )
								if( d <= 45.1715 )
									ret := -0.866667 // sell
								if( d > 45.1715 )
									ret := -0.210526
							if( tema > 28.7529 )
								if( smoothK_k <= 38.1451 )
									ret := 0.048387
								if( smoothK_k > 38.1451 )
									ret := 0.500000
						if( k > 62.4286 )
							if( ema13 <= 0.022105 )
								if( ema12 <= -0.014923 )
									ret := -0.272727
								if( ema12 > -0.014923 )
									ret := -0.877193 // sell
							if( ema13 > 0.022105 )
								if( ema3 <= 29.5591 )
									ret := -0.290323
								if( ema3 > 29.5591 )
									ret := -0.726190 // sell
				if( ema2 > 30.0629 )
					if( ema3 <= 36.685 )
						if( ema1 <= 31.7363 )
							if( ema13 <= 0.571423 )
								if( smoothD_d <= 4.06447 )
									ret := -0.522727
								if( smoothD_d > 4.06447 )
									ret := 0.395652
							if( ema13 > 0.571423 )
								if( ema2 <= 30.6096 )
									ret := -0.625000
								if( ema2 > 30.6096 )
									ret := -1.000000 // sell
						if( ema1 > 31.7363 )
							if( rsi1 <= 77.4661 )
								if( d <= 80.0253 )
									ret := 0.340796
								if( d > 80.0253 )
									ret := 0.719298 // buy
							if( rsi1 > 77.4661 )
								if( ema2 <= 35.9521 )
									ret := -0.888889 // sell
								if( ema2 > 35.9521 )
									ret := -0.133333
					if( ema3 > 36.685 )
						if( ema13 <= 0.941262 )
							if( ema2 <= 38.7138 )
								if( k <= 3.24536 )
									ret := 0.529412
								if( k > 3.24536 )
									ret := -0.223176
							if( ema2 > 38.7138 )
								if( rsi1 <= 30.1895 )
									ret := -0.870968 // sell
								if( rsi1 > 30.1895 )
									ret := 0.205464
						if( ema13 > 0.941262 )
							if( rsi1 <= 89.989 )
								if( smoothK_k <= 93.9139 )
									ret := 0.912281 // buy
								if( smoothK_k > 93.9139 )
									ret := 0.625000
							if( rsi1 > 89.989 )
								ret := 0.071429
	if( ema2 > 42.7305 )
		if( smoothK_k <= 32.4933 )
			if( d_k <= -11.8315 )
				if( ema1 <= 82.6568 )
					if( tema <= 61.3084 )
						if( tema <= 52.4733 )
							if( ema13 <= 0.376554 )
								if( ema13 <= -1.02847 )
									ret := 0.727273 // buy
								if( ema13 > -1.02847 )
									ret := -0.165680
							if( ema13 > 0.376554 )
								ret := 0.565217
						if( tema > 52.4733 )
							if( d_k <= -12.6186 )
								if( smoothK_k <= 30.4998 )
									ret := -0.752688 // sell
								if( smoothK_k > 30.4998 )
									ret := 0.111111
							if( d_k > -12.6186 )
								if( ema13 <= -0.174891 )
									ret := 0.315789
								if( ema13 > -0.174891 )
									ret := -0.466667
					if( tema > 61.3084 )
						if( d <= 12.1519 )
							if( rsi1 <= 44.0409 )
								if( ema1 <= 65.0277 )
									ret := 0.904762 // buy
								if( ema1 > 65.0277 )
									ret := -0.166667
							if( rsi1 > 44.0409 )
								if( rsi1 <= 52.6444 )
									ret := -0.913043 // sell
								if( rsi1 > 52.6444 )
									ret := -0.375000
						if( d > 12.1519 )
							if( smoothD_d <= 13.8949 )
								if( k <= 30.5118 )
									ret := 0.550000
								if( k > 30.5118 )
									ret := 0.055556
							if( smoothD_d > 13.8949 )
								if( d <= 18.0469 )
									ret := -0.333333
								if( d > 18.0469 )
									ret := 0.183333
				if( ema1 > 82.6568 )
					if( ema2 <= 474.345 )
						if( rsi1 <= 68.6075 )
							if( smoothD_d <= 11.5985 )
								if( smoothK_k <= 20.1196 )
									ret := -0.677419
								if( smoothK_k > 20.1196 )
									ret := -0.117318
							if( smoothD_d > 11.5985 )
								if( ema12 <= -1.23173 )
									ret := 0.393939
								if( ema12 > -1.23173 )
									ret := -0.500000
						if( rsi1 > 68.6075 )
							if( ema2 <= 107.473 )
								ret := -0.090909
							if( ema2 > 107.473 )
								ret := 0.823529 // buy
					if( ema2 > 474.345 )
						if( rsi1 <= 54.8311 )
							if( ema1 <= 658.88 )
								if( rsi1 <= 45.8297 )
									ret := 0.222222
								if( rsi1 > 45.8297 )
									ret := 0.777778 // buy
							if( ema1 > 658.88 )
								ret := -0.066667
						if( rsi1 > 54.8311 )
							if( smoothD_d <= 8.38607 )
								ret := -0.692308
							if( smoothD_d > 8.38607 )
								ret := 0.000000
			if( d_k > -11.8315 )
				if( k <= 24.0194 )
					if( smoothD_d <= -0.501089 )
						if( smoothD_d <= -2.99948 )
							if( ema3 <= 69.1395 )
								if( ema12 <= -0.684774 )
									ret := 0.923077 // buy
								if( ema12 > -0.684774 )
									ret := -0.064815
							if( ema3 > 69.1395 )
								if( ema2 <= 96.4887 )
									ret := -0.657143
								if( ema2 > 96.4887 )
									ret := -0.143646
						if( smoothD_d > -2.99948 )
							if( ema2 <= 67.9456 )
								if( ema13 <= -2.39167 )
									ret := 0.978261 // buy
								if( ema13 > -2.39167 )
									ret := 0.249561
							if( ema2 > 67.9456 )
								if( tema <= 70.9455 )
									ret := -0.275281
								if( tema > 70.9455 )
									ret := 0.094460
					if( smoothD_d > -0.501089 )
						if( k <= 5.75485 )
							if( rsi1 <= 38.0809 )
								if( ema12 <= -13.1593 )
									ret := -0.714286 // sell
								if( ema12 > -13.1593 )
									ret := 0.085544
							if( rsi1 > 38.0809 )
								if( ema12 <= 0.046628 )
									ret := -0.107540
								if( ema12 > 0.046628 )
									ret := 0.039396
						if( k > 5.75485 )
							if( d_k <= 28.0083 )
								if( rsi1 <= 23.4983 )
									ret := 0.103952
								if( rsi1 > 23.4983 )
									ret := -0.020837
							if( d_k > 28.0083 )
								if( ema1 <= 54.6782 )
									ret := -0.690476
								if( ema1 > 54.6782 )
									ret := -0.155378
				if( k > 24.0194 )
					if( rsi1 <= 18.9104 )
						if( d_k <= -3.93506 )
							if( ema2 <= 388.88 )
								if( tema <= 192.452 )
									ret := 0.000000
								if( tema > 192.452 )
									ret := 0.615385
							if( ema2 > 388.88 )
								ret := -0.727273 // sell
						if( d_k > -3.93506 )
							if( d_k <= 12.0141 )
								if( d <= 32.8072 )
									ret := 0.886364 // buy
								if( d > 32.8072 )
									ret := 0.652174
							if( d_k > 12.0141 )
								if( k <= 31.8543 )
									ret := -0.043478
								if( k > 31.8543 )
									ret := 0.812500 // buy
					if( rsi1 > 18.9104 )
						if( ema13 <= 4.98249 )
							if( d_k <= 28.9327 )
								if( ema12 <= 0.15245 )
									ret := 0.103080
								if( ema12 > 0.15245 )
									ret := -0.002296
							if( d_k > 28.9327 )
								if( tema <= 72.815 )
									ret := -0.383178
								if( tema > 72.815 )
									ret := 0.141026
						if( ema13 > 4.98249 )
							if( ema3 <= 783.655 )
								if( ema1 <= 637.429 )
									ret := 0.069767
								if( ema1 > 637.429 )
									ret := 0.744186 // buy
							if( ema3 > 783.655 )
								if( ema1 <= 867.669 )
									ret := 0.000000
								if( ema1 > 867.669 )
									ret := -0.545455
		if( smoothK_k > 32.4933 )
			if( d <= 25.4058 )
				if( rsi1 <= 56.9305 )
					if( tema <= 86.4526 )
						if( ema1 <= 48.7157 )
							if( tema <= 45.859 )
								if( ema12 <= -0.043733 )
									ret := -0.629630
								if( ema12 > -0.043733 )
									ret := 0.583333
							if( tema > 45.859 )
								if( ema12 <= -0.123023 )
									ret := 0.733333 // buy
								if( ema12 > -0.123023 )
									ret := 0.333333
						if( ema1 > 48.7157 )
							if( ema13 <= 0.112786 )
								if( smoothK_k <= 42.7359 )
									ret := -0.393293
								if( smoothK_k > 42.7359 )
									ret := 0.210526
							if( ema13 > 0.112786 )
								ret := -0.950000 // sell
					if( tema > 86.4526 )
						if( smoothK_k <= 32.742 )
							ret := -0.733333 // sell
						if( smoothK_k > 32.742 )
							if( ema13 <= -0.028896 )
								if( d <= 25.1108 )
									ret := 0.188406
								if( d > 25.1108 )
									ret := -0.416667
							if( ema13 > -0.028896 )
								if( k <= 43.2541 )
									ret := -0.021739
								if( k > 43.2541 )
									ret := -0.666667
				if( rsi1 > 56.9305 )
					if( ema2 <= 824.58 )
						if( d <= 24.7147 )
							if( ema12 <= 0.077294 )
								if( rsi1 <= 60.422 )
									ret := -0.548387
								if( rsi1 > 60.422 )
									ret := 0.400000
							if( ema12 > 0.077294 )
								if( ema13 <= 0.346107 )
									ret := -0.734848 // sell
								if( ema13 > 0.346107 )
									ret := -0.376000
						if( d > 24.7147 )
							if( tema <= 65.5653 )
								ret := 0.454545
							if( tema > 65.5653 )
								if( ema1 <= 92.6411 )
									ret := -0.600000
								if( ema1 > 92.6411 )
									ret := -0.285714
					if( ema2 > 824.58 )
						ret := 0.176471
			if( d > 25.4058 )
				if( ema3 <= 780.097 )
					if( rsi1 <= 85.0058 )
						if( ema1 <= 764.589 )
							if( ema12 <= 4.53006 )
								if( ema13 <= 1.721 )
									ret := -0.030539
								if( ema13 > 1.721 )
									ret := 0.080599
							if( ema12 > 4.53006 )
								if( ema3 <= 114.248 )
									ret := 1.000000 // buy
								if( ema3 > 114.248 )
									ret := -0.320856
						if( ema1 > 764.589 )
							if( smoothD_d <= 51.1552 )
								if( ema12 <= -0.871711 )
									ret := -0.888889 // sell
								if( ema12 > -0.871711 )
									ret := 0.069767
							if( smoothD_d > 51.1552 )
								if( ema3 <= 762.536 )
									ret := 0.872093 // buy
								if( ema3 > 762.536 )
									ret := 0.359606
					if( rsi1 > 85.0058 )
						if( ema3 <= 601.074 )
							if( d_k <= 6.03285 )
								if( k <= 83.1989 )
									ret := 0.494792
								if( k > 83.1989 )
									ret := 0.129693
							if( d_k > 6.03285 )
								if( smoothK_k <= 52.648 )
									ret := 0.076923
								if( smoothK_k > 52.648 )
									ret := -0.440678
						if( ema3 > 601.074 )
							if( ema2 <= 777.166 )
								if( ema3 <= 719.813 )
									ret := -0.571429
								if( ema3 > 719.813 )
									ret := 0.318182
							if( ema2 > 777.166 )
								ret := -0.933333 // sell
				if( ema3 > 780.097 )
					if( rsi1 <= 58.1186 )
						if( ema2 <= 807.521 )
							if( ema1 <= 776.82 )
								if( smoothK_k <= 54.5143 )
									ret := 0.812500 // buy
								if( smoothK_k > 54.5143 )
									ret := 0.400000
							if( ema1 > 776.82 )
								if( ema2 <= 797.317 )
									ret := -0.204225
								if( ema2 > 797.317 )
									ret := -0.743902 // sell
						if( ema2 > 807.521 )
							if( ema13 <= 2.15401 )
								if( tema <= 944.054 )
									ret := 0.248062
								if( tema > 944.054 )
									ret := -0.714286 // sell
							if( ema13 > 2.15401 )
								if( tema <= 865.547 )
									ret := 0.217391
								if( tema > 865.547 )
									ret := -0.573529
					if( rsi1 > 58.1186 )
						if( smoothD_d <= 88.5205 )
							if( ema12 <= 1.51511 )
								if( ema2 <= 848.434 )
									ret := -0.763158 // sell
								if( ema2 > 848.434 )
									ret := -0.245902
							if( ema12 > 1.51511 )
								if( smoothK_k <= 59.4919 )
									ret := -0.383721
								if( smoothK_k > 59.4919 )
									ret := -0.025237
						if( smoothD_d > 88.5205 )
							if( ema1 <= 922.753 )
								if( ema2 <= 820.413 )
									ret := -0.645455
								if( ema2 > 820.413 )
									ret := -0.276243
							if( ema1 > 922.753 )
								if( tema <= 937.389 )
									ret := -1.000000 // sell
								if( tema > 937.389 )
									ret := -0.750000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_TTD_15Min_3e459f22(rsi1, d, k, smoothD_d, d_k, smoothK_k, ema2, ema1, ema12, ema3, ema13, tema)

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


