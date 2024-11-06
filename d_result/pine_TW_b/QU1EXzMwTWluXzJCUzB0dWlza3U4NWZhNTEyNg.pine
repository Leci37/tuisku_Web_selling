//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: AMD_30Min_2BS0_85fa5126 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_30Min_2BS0_85fa5126", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_30Min_85fa5126(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bullPower <= 0.231413 )
		if( k <= 99.1145 )
			if( rsi1 <= 66.6734 )
				if( rsi1 <= 52.883 )
					if( bbp <= -0.119557 )
						if( d_k <= 14.985 )
							if( bbm <= 0.232089 )
								if( bearPower <= -0.453383 )
									ret := 0.125380
								if( bearPower > -0.453383 )
									ret := 0.037321
							if( bbm > 0.232089 )
								if( bbp <= -1.28055 )
									ret := 0.011479
								if( bbp > -1.28055 )
									ret := -0.058287
						if( d_k > 14.985 )
							if( smoothK_k <= 59.9988 )
								if( smoothK_k <= 58.4884 )
									ret := 0.097535
								if( smoothK_k > 58.4884 )
									ret := -0.823529 // sell
							if( smoothK_k > 59.9988 )
								if( d <= 83.5802 )
									ret := 0.831325 // buy
								if( d > 83.5802 )
									ret := 0.327869
					if( bbp > -0.119557 )
						if( k <= 87.5951 )
							if( smoothK_k <= -2.88648 )
								if( d_k <= 0.250279 )
									ret := 0.575221
								if( d_k > 0.250279 )
									ret := 0.177843
							if( smoothK_k > -2.88648 )
								if( d <= 82.0733 )
									ret := 0.065508
								if( d > 82.0733 )
									ret := 0.227197
						if( k > 87.5951 )
							if( bbm <= 0.075535 )
								if( smoothK_k <= 85.0006 )
									ret := -0.769231 // sell
								if( smoothK_k > 85.0006 )
									ret := 0.114907
							if( bbm > 0.075535 )
								if( rsi1 <= 45.4268 )
									ret := -0.032000
								if( rsi1 > 45.4268 )
									ret := -0.297386
				if( rsi1 > 52.883 )
					if( k <= 0.323971 )
						if( bbp <= -0.302128 )
							ret := -0.888889 // sell
						if( bbp > -0.302128 )
							if( d <= 18.4621 )
								if( smoothD_d <= -2.71966 )
									ret := 0.222222
								if( smoothD_d > -2.71966 )
									ret := 0.600000
							if( d > 18.4621 )
								ret := -0.333333
					if( k > 0.323971 )
						if( d <= 97.9382 )
							if( bearPower <= -0.831684 )
								if( bbp <= -0.986688 )
									ret := 0.098485
								if( bbp > -0.986688 )
									ret := 0.622951
							if( bearPower > -0.831684 )
								if( smoothK_k <= 39.7897 )
									ret := 0.021598
								if( smoothK_k > 39.7897 )
									ret := -0.063606
						if( d > 97.9382 )
							if( d_k <= 0.749468 )
								if( BBPower_Color <= 0.5 )
									ret := 0.807692 // buy
								if( BBPower_Color > 0.5 )
									ret := 0.428571
							if( d_k > 0.749468 )
								if( bearPower <= -0.014259 )
									ret := 0.370370
								if( bearPower > -0.014259 )
									ret := -0.259259
			if( rsi1 > 66.6734 )
				if( smoothK_k <= 7.18998 )
					if( bearPower <= 0.030726 )
						if( k <= 6.92032 )
							if( bbp <= 0.075641 )
								ret := 0.142857
							if( bbp > 0.075641 )
								ret := -0.642857
						if( k > 6.92032 )
							ret := 0.916667 // buy
					if( bearPower > 0.030726 )
						if( rsi1 <= 71.7075 )
							if( d <= 8.85028 )
								if( d <= 7.55542 )
									ret := 0.560000
								if( d > 7.55542 )
									ret := 1.000000 // buy
							if( d > 8.85028 )
								ret := 0.000000
						if( rsi1 > 71.7075 )
							if( rsi1 <= 78.3455 )
								if( rsi1 <= 74.0622 )
									ret := 0.954545 // buy
								if( rsi1 > 74.0622 )
									ret := 0.586207
							if( rsi1 > 78.3455 )
								ret := 1.000000 // buy
				if( smoothK_k > 7.18998 )
					if( bbm <= 0.128209 )
						if( bullPower <= 0.203561 )
							if( d_k <= -26.8167 )
								if( bullPower <= 0.087048 )
									ret := 0.000000
								if( bullPower > 0.087048 )
									ret := -0.595745
							if( d_k > -26.8167 )
								if( bbm <= 0.101492 )
									ret := 0.107198
								if( bbm > 0.101492 )
									ret := 0.255208
						if( bullPower > 0.203561 )
							if( bearPower <= 0.096436 )
								if( d <= 86.3012 )
									ret := 0.333333
								if( d > 86.3012 )
									ret := 0.500000
							if( bearPower > 0.096436 )
								if( bbm <= 0.084547 )
									ret := -0.022727
								if( bbm > 0.084547 )
									ret := -0.262712
					if( bbm > 0.128209 )
						if( d_k <= -6.86639 )
							if( bearPower <= -0.026437 )
								if( d <= 81.9467 )
									ret := 0.232558
								if( d > 81.9467 )
									ret := -0.545455
							if( bearPower > -0.026437 )
								if( rsi1 <= 76.812 )
									ret := -0.677966
								if( rsi1 > 76.812 )
									ret := -0.200000
						if( d_k > -6.86639 )
							if( d <= 95.2684 )
								if( d_k <= 10.0749 )
									ret := 0.131175
								if( d_k > 10.0749 )
									ret := -0.187500
							if( d > 95.2684 )
								if( rsi1 <= 82.7098 )
									ret := -0.357143
								if( rsi1 > 82.7098 )
									ret := 0.666667
		if( k > 99.1145 )
			if( bearPower <= 0.065871 )
				if( bullPower <= -0.013575 )
					if( d_k <= -0.234167 )
						if( rsi1 <= 40.8308 )
							if( smoothK_k <= 96.9241 )
								if( bbm <= 0.067504 )
									ret := -0.333333
								if( bbm > 0.067504 )
									ret := -0.880000 // sell
							if( smoothK_k > 96.9241 )
								if( bearPower <= -0.573581 )
									ret := 0.166667
								if( bearPower > -0.573581 )
									ret := -0.581395
						if( rsi1 > 40.8308 )
							if( d_k <= -11.198 )
								if( d <= 84.3864 )
									ret := 0.300000
								if( d > 84.3864 )
									ret := -0.666667
							if( d_k > -11.198 )
								if( rsi1 <= 55.2398 )
									ret := 0.300000
								if( rsi1 > 55.2398 )
									ret := 0.000000
					if( d_k > -0.234167 )
						if( smoothD_d <= 96.9674 )
							if( k <= 99.424 )
								ret := -0.555556
							if( k > 99.424 )
								if( smoothD_d <= 96.8785 )
									ret := -1.000000 // sell
								if( smoothD_d > 96.8785 )
									ret := -0.833333 // sell
						if( smoothD_d > 96.9674 )
							if( bbp <= -0.234853 )
								if( bbp <= -0.943385 )
									ret := -0.750000 // sell
								if( bbp > -0.943385 )
									ret := 0.000000
							if( bbp > -0.234853 )
								ret := -0.681818
				if( bullPower > -0.013575 )
					if( rsi1 <= 75.1182 )
						if( d <= 76.2671 )
							ret := 0.800000 // buy
						if( d > 76.2671 )
							if( bbp <= -0.186314 )
								if( smoothK_k <= 96.7708 )
									ret := -0.375000
								if( smoothK_k > 96.7708 )
									ret := 0.466667
							if( bbp > -0.186314 )
								if( smoothD_d <= 95.4962 )
									ret := -0.122685
								if( smoothD_d > 95.4962 )
									ret := -0.443366
					if( rsi1 > 75.1182 )
						if( bbm <= 0.196747 )
							if( rsi1 <= 80.5749 )
								if( bbm <= 0.043214 )
									ret := 0.000000
								if( bbm > 0.043214 )
									ret := 0.537313
							if( rsi1 > 80.5749 )
								if( k <= 99.8469 )
									ret := -0.636364
								if( k > 99.8469 )
									ret := 0.088235
						if( bbm > 0.196747 )
							ret := -0.833333 // sell
			if( bearPower > 0.065871 )
				if( d_k <= -12.4897 )
					if( d_k <= -16.4294 )
						ret := 0.260870
					if( d_k > -16.4294 )
						if( bbp <= 0.248131 )
							ret := -1.000000 // sell
						if( bbp > 0.248131 )
							ret := -0.571429
				if( d_k > -12.4897 )
					if( d_k <= -0.00143 )
						if( bearPower <= 0.077768 )
							if( bbm <= 0.058003 )
								ret := 0.166667
							if( bbm > 0.058003 )
								if( bearPower <= 0.072301 )
									ret := 0.000000
								if( bearPower > 0.072301 )
									ret := -0.687500
						if( bearPower > 0.077768 )
							if( rsi1 <= 88.1841 )
								if( bbm <= 0.081301 )
									ret := 0.250000
								if( bbm > 0.081301 )
									ret := 0.787879 // buy
							if( rsi1 > 88.1841 )
								if( k <= 99.8156 )
									ret := 0.500000
								if( k > 99.8156 )
									ret := -0.529412
					if( d_k > -0.00143 )
						if( bullPower <= 0.200739 )
							if( d_k <= 0.086133 )
								if( smoothK_k <= 96.9999 )
									ret := 0.896552 // buy
								if( smoothK_k > 96.9999 )
									ret := 0.462963
							if( d_k > 0.086133 )
								if( rsi1 <= 82.1361 )
									ret := -0.200000
								if( rsi1 > 82.1361 )
									ret := 0.666667
						if( bullPower > 0.200739 )
							ret := -0.200000
	if( bullPower > 0.231413 )
		if( smoothK_k <= 28.8764 )
			if( rsi1 <= 72.8387 )
				if( d <= 3.16222 )
					if( smoothK_k <= -1.17934 )
						if( bearPower <= 0.232089 )
							if( bbm <= 2.06032 )
								if( bearPower <= -0.536487 )
									ret := 0.312500
								if( bearPower > -0.536487 )
									ret := -0.204082
							if( bbm > 2.06032 )
								if( k <= 0.093287 )
									ret := -0.800000 // sell
								if( k > 0.093287 )
									ret := -0.357143
						if( bearPower > 0.232089 )
							if( smoothD_d <= -2.22465 )
								if( d <= 0.021226 )
									ret := 0.473684
								if( d > 0.021226 )
									ret := 0.900000 // buy
							if( smoothD_d > -2.22465 )
								ret := -0.272727
					if( smoothK_k > -1.17934 )
						if( k <= 3.13433 )
							if( bbm <= 0.425036 )
								ret := 0.925926 // buy
							if( bbm > 0.425036 )
								if( smoothD_d <= -0.508317 )
									ret := 0.066667
								if( smoothD_d > -0.508317 )
									ret := 0.647059
						if( k > 3.13433 )
							if( smoothK_k <= 2.39109 )
								if( bearPower <= -0.507961 )
									ret := 0.368421
								if( bearPower > -0.507961 )
									ret := -0.433333
							if( smoothK_k > 2.39109 )
								if( bbm <= 0.715954 )
									ret := 0.580000
								if( bbm > 0.715954 )
									ret := -0.222222
				if( d > 3.16222 )
					if( rsi1 <= 51.3045 )
						if( bearPower <= -0.560388 )
							if( d_k <= 20.9897 )
								if( smoothD_d <= 6.48606 )
									ret := -0.065068
								if( smoothD_d > 6.48606 )
									ret := -0.357459
							if( d_k > 20.9897 )
								if( smoothK_k <= 9.45154 )
									ret := 0.833333 // buy
								if( smoothK_k > 9.45154 )
									ret := 0.333333
						if( bearPower > -0.560388 )
							if( d <= 41.6732 )
								if( k <= 26.4465 )
									ret := 0.029435
								if( k > 26.4465 )
									ret := -0.243243
							if( d > 41.6732 )
								if( bearPower <= -0.214273 )
									ret := 0.100000
								if( bearPower > -0.214273 )
									ret := 0.755102 // buy
					if( rsi1 > 51.3045 )
						if( bearPower <= -1.00096 )
							if( bullPower <= 3.54205 )
								if( bullPower <= 1.22802 )
									ret := 0.029412
								if( bullPower > 1.22802 )
									ret := 0.589286
							if( bullPower > 3.54205 )
								ret := -0.714286 // sell
						if( bearPower > -1.00096 )
							if( k <= 30.9488 )
								if( d_k <= 30.464 )
									ret := -0.177128
								if( d_k > 30.464 )
									ret := -0.846154 // sell
							if( k > 30.9488 )
								if( smoothD_d <= 24.1831 )
									ret := 0.000000
								if( smoothD_d > 24.1831 )
									ret := -0.557895
			if( rsi1 > 72.8387 )
				if( bullPower <= 0.649061 )
					if( bearPower <= 0.079299 )
						if( BBPower_Color <= 0.5 )
							ret := 0.250000
						if( BBPower_Color > 0.5 )
							if( d_k <= -0.714558 )
								ret := -1.000000 // sell
							if( d_k > -0.714558 )
								ret := -0.384615
					if( bearPower > 0.079299 )
						if( bearPower <= 0.102233 )
							ret := 0.789474 // buy
						if( bearPower > 0.102233 )
							if( d <= 16.2255 )
								if( bullPower <= 0.297706 )
									ret := -0.636364
								if( bullPower > 0.297706 )
									ret := -0.076923
							if( d > 16.2255 )
								if( d <= 34.2677 )
									ret := 0.531250
								if( d > 34.2677 )
									ret := 0.037037
				if( bullPower > 0.649061 )
					if( bbm <= 1.43367 )
						if( bbp <= 1.37422 )
							if( k <= 17.3645 )
								ret := 0.500000
							if( k > 17.3645 )
								if( bullPower <= 0.987622 )
									ret := 0.928571 // buy
								if( bullPower > 0.987622 )
									ret := 0.666667
						if( bbp > 1.37422 )
							if( d <= 43.8504 )
								if( smoothK_k <= 5.77877 )
									ret := 0.818182 // buy
								if( smoothK_k > 5.77877 )
									ret := 0.250000
							if( d > 43.8504 )
								ret := -0.800000 // sell
					if( bbm > 1.43367 )
						if( bbp <= 1.83577 )
							if( smoothD_d <= 24.5241 )
								ret := -0.222222
							if( smoothD_d > 24.5241 )
								ret := -0.727273 // sell
						if( bbp > 1.83577 )
							ret := 0.615385
		if( smoothK_k > 28.8764 )
			if( k <= 34.8323 )
				if( d <= 32.2954 )
					if( smoothD_d <= 17.6039 )
						if( smoothD_d <= 16.4032 )
							if( bearPower <= 0.245458 )
								if( bbp <= 0.623294 )
									ret := 0.000000
								if( bbp > 0.623294 )
									ret := 0.350000
							if( bearPower > 0.245458 )
								ret := -0.333333
						if( smoothD_d > 16.4032 )
							ret := -0.555556
					if( smoothD_d > 17.6039 )
						if( bearPower <= -0.157031 )
							if( bearPower <= -0.339709 )
								if( d_k <= -8.39982 )
									ret := 0.555556
								if( d_k > -8.39982 )
									ret := 0.823529 // buy
							if( bearPower > -0.339709 )
								if( rsi1 <= 58.8278 )
									ret := 1.000000 // buy
								if( rsi1 > 58.8278 )
									ret := 0.875000 // buy
						if( bearPower > -0.157031 )
							if( k <= 33.5665 )
								if( d <= 31.1806 )
									ret := 0.691489
								if( d > 31.1806 )
									ret := 0.000000
							if( k > 33.5665 )
								if( d_k <= -11.6287 )
									ret := -0.166667
								if( d_k > -11.6287 )
									ret := 0.352941
				if( d > 32.2954 )
					if( smoothD_d <= 33.6462 )
						if( d_k <= -0.24704 )
							ret := -0.090909
						if( d_k > -0.24704 )
							if( bbp <= 0.998606 )
								if( bullPower <= 0.49398 )
									ret := -0.590909
								if( bullPower > 0.49398 )
									ret := -0.960000 // sell
							if( bbp > 0.998606 )
								ret := -0.352941
					if( smoothD_d > 33.6462 )
						if( smoothD_d <= 53.6185 )
							if( d <= 39.5936 )
								if( bbp <= 1.10592 )
									ret := 0.750000 // buy
								if( bbp > 1.10592 )
									ret := 0.333333
							if( d > 39.5936 )
								if( bbp <= 0.57651 )
									ret := -0.436620
								if( bbp > 0.57651 )
									ret := 0.039474
						if( smoothD_d > 53.6185 )
							if( k <= 33.4 )
								ret := 0.250000
							if( k > 33.4 )
								if( rsi1 <= 62.4493 )
									ret := 0.777778 // buy
								if( rsi1 > 62.4493 )
									ret := 0.933333 // buy
			if( k > 34.8323 )
				if( k <= 38.8902 )
					if( smoothD_d <= 48.2356 )
						if( d <= 45.4164 )
							if( bbp <= -0.29218 )
								if( smoothK_k <= 32.758 )
									ret := 0.944444 // buy
								if( smoothK_k > 32.758 )
									ret := 0.318182
							if( bbp > -0.29218 )
								if( d <= 16.4141 )
									ret := 0.923077 // buy
								if( d > 16.4141 )
									ret := -0.245586
						if( d > 45.4164 )
							if( rsi1 <= 77.4292 )
								if( k <= 36.2273 )
									ret := -0.428571
								if( k > 36.2273 )
									ret := -0.802083 // sell
							if( rsi1 > 77.4292 )
								ret := -0.166667
					if( smoothD_d > 48.2356 )
						if( k <= 37.7684 )
							if( smoothD_d <= 60.4703 )
								if( bullPower <= 0.883886 )
									ret := 0.644737
								if( bullPower > 0.883886 )
									ret := 0.133333
							if( smoothD_d > 60.4703 )
								ret := -0.153846
						if( k > 37.7684 )
							if( bbm <= 0.327822 )
								ret := 0.636364
							if( bbm > 0.327822 )
								if( k <= 37.8487 )
									ret := -0.636364
								if( k > 37.8487 )
									ret := 0.071429
				if( k > 38.8902 )
					if( rsi1 <= 85.0641 )
						if( d <= 69.4315 )
							if( bullPower <= 3.03558 )
								if( rsi1 <= 79.9832 )
									ret := 0.036774
								if( rsi1 > 79.9832 )
									ret := -0.204348
							if( bullPower > 3.03558 )
								if( d <= 61.2442 )
									ret := 0.177419
								if( d > 61.2442 )
									ret := 0.589744
						if( d > 69.4315 )
							if( rsi1 <= 79.3658 )
								if( k <= 98.2298 )
									ret := -0.081719
								if( k > 98.2298 )
									ret := 0.026183
							if( rsi1 > 79.3658 )
								if( bbm <= 0.726052 )
									ret := 0.155844
								if( bbm > 0.726052 )
									ret := -0.207736
					if( rsi1 > 85.0641 )
						if( bearPower <= 0.541907 )
							if( d <= 97.0076 )
								if( bullPower <= 1.57003 )
									ret := 0.335731
								if( bullPower > 1.57003 )
									ret := -0.347368
							if( d > 97.0076 )
								if( bbp <= 1.38899 )
									ret := -0.125000
								if( bbp > 1.38899 )
									ret := 0.281690
						if( bearPower > 0.541907 )
							if( rsi1 <= 91.0062 )
								if( bbp <= 10.2196 )
									ret := 0.131043
								if( bbp > 10.2196 )
									ret := -0.441860
							if( rsi1 > 91.0062 )
								if( bbp <= 4.31866 )
									ret := -0.342105
								if( bbp > 4.31866 )
									ret := 0.264151
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AMD_30Min_85fa5126(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


