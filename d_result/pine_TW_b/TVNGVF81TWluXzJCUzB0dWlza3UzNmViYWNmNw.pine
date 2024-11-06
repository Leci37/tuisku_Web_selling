//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: MSFT_5Min_2BS0_36ebacf7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_2BS0_36ebacf7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_36ebacf7(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbp <= -0.100573 )
		if( bbm <= 0.619971 )
			if( d <= 0.442529 )
				if( rsi1 <= 26.4226 )
					if( d <= 0.258517 )
						if( rsi1 <= 15.0053 )
							if( bullPower <= -0.696386 )
								if( smoothD_d <= -2.99042 )
									ret := 0.076923
								if( smoothD_d > -2.99042 )
									ret := -0.531250
							if( bullPower > -0.696386 )
								if( bullPower <= -0.571779 )
									ret := 1.000000 // buy
								if( bullPower > -0.571779 )
									ret := 0.437500
						if( rsi1 > 15.0053 )
							if( smoothD_d <= -2.97597 )
								if( bearPower <= -0.999474 )
									ret := 0.850000 // buy
								if( bearPower > -0.999474 )
									ret := 0.066667
							if( smoothD_d > -2.97597 )
								if( d <= 0.144642 )
									ret := 0.909091 // buy
								if( d > 0.144642 )
									ret := 0.409091
					if( d > 0.258517 )
						if( bbm <= 0.104642 )
							ret := 0.058824
						if( bbm > 0.104642 )
							if( k <= 0.865617 )
								if( smoothK_k <= -2.9891 )
									ret := 0.500000
								if( smoothK_k > -2.9891 )
									ret := 0.964912 // buy
							if( k > 0.865617 )
								ret := 0.222222
				if( rsi1 > 26.4226 )
					if( smoothK_k <= -2.56285 )
						if( d_k <= -0.010913 )
							if( bbm <= 0.366949 )
								ret := 0.076923
							if( bbm > 0.366949 )
								if( k <= 0.095816 )
									ret := -1.000000 // sell
								if( k > 0.095816 )
									ret := -0.888889 // sell
						if( d_k > -0.010913 )
							if( rsi1 <= 39.1311 )
								if( d <= 0.396492 )
									ret := -0.049020
								if( d > 0.396492 )
									ret := 0.833333 // buy
							if( rsi1 > 39.1311 )
								if( k <= 0.002285 )
									ret := 0.558140
								if( k > 0.002285 )
									ret := 0.866667 // buy
					if( smoothK_k > -2.56285 )
						if( rsi1 <= 33.0612 )
							ret := -0.083333
						if( rsi1 > 33.0612 )
							ret := -0.625000
			if( d > 0.442529 )
				if( rsi1 <= 50.6483 )
					if( rsi1 <= 19.1304 )
						if( smoothD_d <= 1.14856 )
							if( smoothD_d <= -2.37419 )
								if( bearPower <= -0.996198 )
									ret := 0.380952
								if( bearPower > -0.996198 )
									ret := -0.600000
							if( smoothD_d > -2.37419 )
								if( bullPower <= -0.518786 )
									ret := 0.665323
								if( bullPower > -0.518786 )
									ret := -0.090164
						if( smoothD_d > 1.14856 )
							if( rsi1 <= 14.8674 )
								if( k <= 20.12 )
									ret := 0.017316
								if( k > 20.12 )
									ret := -0.913043 // sell
							if( rsi1 > 14.8674 )
								if( smoothD_d <= 2.74776 )
									ret := -0.173077
								if( smoothD_d > 2.74776 )
									ret := 0.286154
					if( rsi1 > 19.1304 )
						if( d_k <= 9.19967 )
							if( rsi1 <= 35.5442 )
								if( k <= 11.3652 )
									ret := 0.019389
								if( k > 11.3652 )
									ret := 0.178837
							if( rsi1 > 35.5442 )
								if( d <= 46.2929 )
									ret := -0.025527
								if( d > 46.2929 )
									ret := 0.098600
						if( d_k > 9.19967 )
							if( rsi1 <= 33.3448 )
								if( d <= 38.2711 )
									ret := -0.099869
								if( d > 38.2711 )
									ret := 0.161765
							if( rsi1 > 33.3448 )
								if( d_k <= 9.71609 )
									ret := 0.378049
								if( d_k > 9.71609 )
									ret := 0.145380
				if( rsi1 > 50.6483 )
					if( bullPower <= -0.148165 )
						if( bbm <= 0.310983 )
							if( bearPower <= -0.37059 )
								if( smoothK_k <= 57.8758 )
									ret := 0.802198 // buy
								if( smoothK_k > 57.8758 )
									ret := 0.224138
							if( bearPower > -0.37059 )
								if( d_k <= 17.9208 )
									ret := 0.204545
								if( d_k > 17.9208 )
									ret := -0.538462
						if( bbm > 0.310983 )
							if( smoothK_k <= 42.1502 )
								if( smoothD_d <= 17.1588 )
									ret := 0.083333
								if( smoothD_d > 17.1588 )
									ret := -0.522727
							if( smoothK_k > 42.1502 )
								if( rsi1 <= 51.7596 )
									ret := -0.578947
								if( rsi1 > 51.7596 )
									ret := 0.155844
					if( bullPower > -0.148165 )
						if( bbp <= -0.287788 )
							if( d <= 55.2883 )
								if( smoothD_d <= 32.0941 )
									ret := -0.100000
								if( smoothD_d > 32.0941 )
									ret := -0.482051
							if( d > 55.2883 )
								if( smoothK_k <= 67.3236 )
									ret := 0.105085
								if( smoothK_k > 67.3236 )
									ret := -0.212707
						if( bbp > -0.287788 )
							if( rsi1 <= 52.5938 )
								if( k <= 1.7042 )
									ret := 0.708333 // buy
								if( k > 1.7042 )
									ret := -0.196544
							if( rsi1 > 52.5938 )
								if( bullPower <= 0.136546 )
									ret := 0.079717
								if( bullPower > 0.136546 )
									ret := -0.169643
		if( bbm > 0.619971 )
			if( d_k <= -10.6706 )
				if( d_k <= -14.502 )
					if( d <= 33.0791 )
						if( bbm <= 1.66306 )
							if( rsi1 <= 28.3378 )
								if( bbm <= 0.918043 )
									ret := -0.500000
								if( bbm > 0.918043 )
									ret := -0.777778 // sell
							if( rsi1 > 28.3378 )
								if( d_k <= -15.7007 )
									ret := 0.538462
								if( d_k > -15.7007 )
									ret := -0.155172
						if( bbm > 1.66306 )
							if( smoothD_d <= 15.3356 )
								ret := -0.812500 // sell
							if( smoothD_d > 15.3356 )
								ret := -0.333333
					if( d > 33.0791 )
						if( smoothD_d <= 30.7986 )
							ret := -0.900000 // sell
						if( smoothD_d > 30.7986 )
							if( rsi1 <= 24.3445 )
								if( d <= 50.5838 )
									ret := -1.000000 // sell
								if( d > 50.5838 )
									ret := -0.888889 // sell
							if( rsi1 > 24.3445 )
								if( rsi1 <= 60.5448 )
									ret := -0.155039
								if( rsi1 > 60.5448 )
									ret := -0.800000 // sell
				if( d_k > -14.502 )
					if( bbm <= 4.01975 )
						if( d <= 61.3193 )
							if( rsi1 <= 27.8234 )
								if( bullPower <= -1.12297 )
									ret := -0.150000
								if( bullPower > -1.12297 )
									ret := -0.715447 // sell
							if( rsi1 > 27.8234 )
								if( d_k <= -13.372 )
									ret := -0.553719
								if( d_k > -13.372 )
									ret := -0.060317
						if( d > 61.3193 )
							if( k <= 92.0213 )
								if( rsi1 <= 38.6464 )
									ret := -1.000000 // sell
								if( rsi1 > 38.6464 )
									ret := -0.608696
							if( k > 92.0213 )
								if( k <= 94.9275 )
									ret := 0.416667
								if( k > 94.9275 )
									ret := -0.500000
					if( bbm > 4.01975 )
						ret := 0.666667
			if( d_k > -10.6706 )
				if( bbm <= 1.61122 )
					if( bbp <= -1.79414 )
						if( bbm <= 1.59172 )
							if( d_k <= 21.6174 )
								if( k <= 61.3819 )
									ret := -0.124142
								if( k > 61.3819 )
									ret := 0.142132
							if( d_k > 21.6174 )
								if( rsi1 <= 37.8915 )
									ret := 0.119565
								if( rsi1 > 37.8915 )
									ret := 0.916667 // buy
						if( bbm > 1.59172 )
							if( smoothD_d <= 10.6058 )
								ret := -0.500000
							if( smoothD_d > 10.6058 )
								ret := -1.000000 // sell
					if( bbp > -1.79414 )
						if( bbm <= 0.633916 )
							if( d <= 1.96958 )
								ret := -0.750000 // sell
							if( d > 1.96958 )
								if( d_k <= 26.0309 )
									ret := -0.063218
								if( d_k > 26.0309 )
									ret := -1.000000 // sell
						if( bbm > 0.633916 )
							if( d <= 92.9167 )
								if( rsi1 <= 60.1114 )
									ret := 0.059742
								if( rsi1 > 60.1114 )
									ret := -0.315534
							if( d > 92.9167 )
								if( smoothK_k <= 91.1774 )
									ret := -0.050000
								if( smoothK_k > 91.1774 )
									ret := -0.468085
				if( bbm > 1.61122 )
					if( bbp <= -8.41318 )
						if( k <= 25.1939 )
							if( bbm <= 3.22785 )
								if( bbm <= 2.08718 )
									ret := 0.888889 // buy
								if( bbm > 2.08718 )
									ret := 1.000000 // buy
							if( bbm > 3.22785 )
								ret := -0.538462
						if( k > 25.1939 )
							if( bbm <= 3.96206 )
								ret := 0.777778 // buy
							if( bbm > 3.96206 )
								ret := 1.000000 // buy
					if( bbp > -8.41318 )
						if( smoothD_d <= 75.2687 )
							if( bbp <= -2.57898 )
								if( d_k <= 8.02078 )
									ret := 0.146520
								if( d_k > 8.02078 )
									ret := -0.328947
							if( bbp > -2.57898 )
								if( smoothD_d <= 50.9057 )
									ret := 0.309701
								if( smoothD_d > 50.9057 )
									ret := -0.181818
						if( smoothD_d > 75.2687 )
							if( d_k <= 14.2037 )
								if( k <= 89.1025 )
									ret := -0.061538
								if( k > 89.1025 )
									ret := 0.596491
							if( d_k > 14.2037 )
								if( k <= 65.416 )
									ret := 0.777778 // buy
								if( k > 65.416 )
									ret := 1.000000 // buy
	if( bbp > -0.100573 )
		if( smoothK_k <= 96.6052 )
			if( bearPower <= -0.260477 )
				if( smoothK_k <= 10.5086 )
					if( smoothK_k <= 4.40558 )
						if( smoothK_k <= 0.687911 )
							if( bullPower <= 0.321893 )
								if( bbp <= -0.05269 )
									ret := -0.500000
								if( bbp > -0.05269 )
									ret := -0.100000
							if( bullPower > 0.321893 )
								if( smoothK_k <= -1.55933 )
									ret := 0.000000
								if( smoothK_k > -1.55933 )
									ret := 0.787879 // buy
						if( smoothK_k > 0.687911 )
							if( bearPower <= -0.372066 )
								if( d_k <= 0.364013 )
									ret := -0.384615
								if( d_k > 0.364013 )
									ret := -0.928571 // sell
							if( bearPower > -0.372066 )
								if( bbp <= -0.070523 )
									ret := 0.391304
								if( bbp > -0.070523 )
									ret := -0.280000
					if( smoothK_k > 4.40558 )
						if( rsi1 <= 57.4128 )
							if( d_k <= 5.66332 )
								if( smoothD_d <= 4.14465 )
									ret := 0.000000
								if( smoothD_d > 4.14465 )
									ret := 0.500000
							if( d_k > 5.66332 )
								if( bbm <= 0.841618 )
									ret := -0.666667
								if( bbm > 0.841618 )
									ret := 0.107143
						if( rsi1 > 57.4128 )
							if( bearPower <= -0.363985 )
								ret := 1.000000 // buy
							if( bearPower > -0.363985 )
								ret := 0.888889 // buy
				if( smoothK_k > 10.5086 )
					if( d_k <= 18.3439 )
						if( d <= 79.9589 )
							if( bullPower <= 0.930983 )
								if( k <= 92.6381 )
									ret := -0.171998
								if( k > 92.6381 )
									ret := 0.655172
							if( bullPower > 0.930983 )
								if( rsi1 <= 31.4512 )
									ret := 0.538462
								if( rsi1 > 31.4512 )
									ret := -0.405956
						if( d > 79.9589 )
							if( smoothD_d <= 78.4232 )
								if( bullPower <= 0.532542 )
									ret := 0.066667
								if( bullPower > 0.532542 )
									ret := 0.666667
							if( smoothD_d > 78.4232 )
								if( k <= 75.328 )
									ret := 0.416667
								if( k > 75.328 )
									ret := -0.150492
					if( d_k > 18.3439 )
						if( bbm <= 0.811016 )
							if( rsi1 <= 42.78 )
								ret := 0.545455
							if( rsi1 > 42.78 )
								if( k <= 46.1046 )
									ret := -0.405797
								if( k > 46.1046 )
									ret := 0.217391
						if( bbm > 0.811016 )
							if( smoothD_d <= 66.1218 )
								if( d <= 55.3154 )
									ret := 0.757576 // buy
								if( d > 55.3154 )
									ret := -0.350000
							if( smoothD_d > 66.1218 )
								if( d <= 77.4878 )
									ret := 0.964286 // buy
								if( d > 77.4878 )
									ret := 0.400000
			if( bearPower > -0.260477 )
				if( bbp <= 1.15565 )
					if( bbp <= 0.919317 )
						if( bbm <= 0.645206 )
							if( rsi1 <= 49.6645 )
								if( d <= 98.1496 )
									ret := 0.051294
								if( d > 98.1496 )
									ret := -0.785714 // sell
							if( rsi1 > 49.6645 )
								if( smoothK_k <= 95.8319 )
									ret := -0.027751
								if( smoothK_k > 95.8319 )
									ret := 0.218023
						if( bbm > 0.645206 )
							if( bullPower <= 1.02636 )
								if( k <= 2.55507 )
									ret := 0.530612
								if( k > 2.55507 )
									ret := -0.099676
							if( bullPower > 1.02636 )
								if( bullPower <= 1.0938 )
									ret := -0.774194 // sell
								if( bullPower > 1.0938 )
									ret := -0.333333
					if( bbp > 0.919317 )
						if( d_k <= 26.17 )
							if( rsi1 <= 40.9049 )
								ret := -0.750000 // sell
							if( rsi1 > 40.9049 )
								if( bullPower <= 1.05123 )
									ret := 0.050030
								if( bullPower > 1.05123 )
									ret := 0.257246
						if( d_k > 26.17 )
							ret := 0.833333 // buy
				if( bbp > 1.15565 )
					if( d <= 17.5006 )
						if( d_k <= 6.82388 )
							if( rsi1 <= 70.7115 )
								if( bearPower <= 0.773896 )
									ret := -0.313084
								if( bearPower > 0.773896 )
									ret := -0.771429 // sell
							if( rsi1 > 70.7115 )
								if( d <= 11.8142 )
									ret := 0.549020
								if( d > 11.8142 )
									ret := -0.296296
						if( d_k > 6.82388 )
							if( bearPower <= 0.60379 )
								if( k <= 3.96373 )
									ret := -0.956522 // sell
								if( k > 3.96373 )
									ret := -0.750000 // sell
							if( bearPower > 0.60379 )
								ret := -0.250000
					if( d > 17.5006 )
						if( k <= 99.027 )
							if( rsi1 <= 85.1727 )
								if( bbm <= 0.285817 )
									ret := -0.220818
								if( bbm > 0.285817 )
									ret := -0.036762
							if( rsi1 > 85.1727 )
								if( k <= 97.1923 )
									ret := 0.306667
								if( k > 97.1923 )
									ret := -0.028090
						if( k > 99.027 )
							if( k <= 99.5037 )
								if( d <= 94.9971 )
									ret := -0.509091
								if( d > 94.9971 )
									ret := -0.186869
							if( k > 99.5037 )
								if( d <= 99.6855 )
									ret := 0.232877
								if( d > 99.6855 )
									ret := -0.333333
		if( smoothK_k > 96.6052 )
			if( bbp <= 2.87054 )
				if( rsi1 <= 76.0796 )
					if( d <= 73.3587 )
						if( k <= 99.9482 )
							ret := -1.000000 // sell
						if( k > 99.9482 )
							ret := -0.642857
					if( d > 73.3587 )
						if( smoothD_d <= 91.71 )
							if( bbp <= 0.417409 )
								if( smoothD_d <= 87.2278 )
									ret := 0.204082
								if( smoothD_d > 87.2278 )
									ret := -0.326733
							if( bbp > 0.417409 )
								if( bullPower <= 1.04259 )
									ret := 0.298734
								if( bullPower > 1.04259 )
									ret := 0.015748
						if( smoothD_d > 91.71 )
							if( rsi1 <= 42.2482 )
								ret := -1.000000 // sell
							if( rsi1 > 42.2482 )
								if( bbm <= 0.50005 )
									ret := 0.064465
								if( bbm > 0.50005 )
									ret := -0.246883
				if( rsi1 > 76.0796 )
					if( bbp <= 2.25609 )
						if( rsi1 <= 89.2048 )
							if( bbp <= 0.805429 )
								if( rsi1 <= 80.8636 )
									ret := 0.454545
								if( rsi1 > 80.8636 )
									ret := -0.083333
							if( bbp > 0.805429 )
								if( bbm <= 0.806583 )
									ret := -0.265207
								if( bbm > 0.806583 )
									ret := -0.725490 // sell
						if( rsi1 > 89.2048 )
							if( rsi1 <= 92.96 )
								if( bullPower <= 0.821094 )
									ret := -0.886364 // sell
								if( bullPower > 0.821094 )
									ret := -0.625000
							if( rsi1 > 92.96 )
								ret := -0.083333
					if( bbp > 2.25609 )
						if( d_k <= -0.027284 )
							if( k <= 99.9215 )
								ret := 0.692308
							if( k > 99.9215 )
								if( d <= 97.0519 )
									ret := 0.315789
								if( d > 97.0519 )
									ret := -0.360000
						if( d_k > -0.027284 )
							if( rsi1 <= 84.3861 )
								ret := -0.684211
							if( rsi1 > 84.3861 )
								ret := 0.000000
			if( bbp > 2.87054 )
				if( bbp <= 3.56763 )
					if( d <= 86.326 )
						ret := 0.052632
					if( d > 86.326 )
						if( rsi1 <= 80.4076 )
							if( bbm <= 1.13845 )
								ret := -0.823529 // sell
							if( bbm > 1.13845 )
								ret := -0.333333
						if( rsi1 > 80.4076 )
							if( rsi1 <= 83.5093 )
								if( smoothK_k <= 96.9554 )
									ret := -0.909091 // sell
								if( smoothK_k > 96.9554 )
									ret := -0.975000 // sell
							if( rsi1 > 83.5093 )
								if( smoothD_d <= 96.5935 )
									ret := -0.962963 // sell
								if( smoothD_d > 96.5935 )
									ret := -0.714286 // sell
				if( bbp > 3.56763 )
					if( bbp <= 6.15921 )
						if( smoothD_d <= 96.1901 )
							if( d_k <= -17.2204 )
								ret := -0.352941
							if( d_k > -17.2204 )
								if( bbp <= 5.23316 )
									ret := 0.446809
								if( bbp > 5.23316 )
									ret := -0.600000
						if( smoothD_d > 96.1901 )
							if( bullPower <= 3.4178 )
								if( rsi1 <= 89.3144 )
									ret := -0.437500
								if( rsi1 > 89.3144 )
									ret := -0.863636 // sell
							if( bullPower > 3.4178 )
								ret := 0.470588
					if( bbp > 6.15921 )
						if( d_k <= -6.10764 )
							ret := -0.733333 // sell
						if( d_k > -6.10764 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_MSFT_5Min_36ebacf7(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


