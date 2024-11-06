//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: UPST_1Min_2BT0_70129e5f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_2BT0_70129e5f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_70129e5f(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= 0.034005 )
		if( bbm <= 0.009362 )
			if( bbp <= -0.078449 )
				if( ema2 <= 37.633 )
					if( ema12 <= -0.099802 )
						if( ema13 <= -0.438357 )
							if( ema1 <= 22.4262 )
								ret := 1.000000 // buy
							if( ema1 > 22.4262 )
								ret := 0.714286 // buy
						if( ema13 > -0.438357 )
							if( ema1 <= 22.1531 )
								if( bullPower <= -0.178312 )
									ret := -0.906250 // sell
								if( bullPower > -0.178312 )
									ret := 0.500000
							if( ema1 > 22.1531 )
								if( ema1 <= 27.8051 )
									ret := 0.714286 // buy
								if( ema1 > 27.8051 )
									ret := -0.031746
					if( ema12 > -0.099802 )
						if( bbp <= -0.110702 )
							if( ema3 <= 21.4359 )
								if( ema3 <= 21.0126 )
									ret := 0.818182 // buy
								if( ema3 > 21.0126 )
									ret := -0.720000 // sell
							if( ema3 > 21.4359 )
								if( ema2 <= 22.0894 )
									ret := 0.965517 // buy
								if( ema2 > 22.0894 )
									ret := 0.501774
						if( bbp > -0.110702 )
							if( bbm <= 1e-06 )
								if( ema13 <= 0.031157 )
									ret := 0.188679
								if( ema13 > 0.031157 )
									ret := 0.666667
							if( bbm > 1e-06 )
								if( ema2 <= 25.5326 )
									ret := 0.695906
								if( ema2 > 25.5326 )
									ret := 0.287671
				if( ema2 > 37.633 )
					if( ema3 <= 38.665 )
						if( bbm <= 0.003629 )
							if( bbp <= -0.179996 )
								if( ema3 <= 37.8149 )
									ret := 0.866667 // buy
								if( ema3 > 37.8149 )
									ret := 0.166667
							if( bbp > -0.179996 )
								if( ema13 <= -0.003924 )
									ret := -0.225000
								if( ema13 > -0.003924 )
									ret := 0.080000
						if( bbm > 0.003629 )
							ret := -0.875000 // sell
					if( ema3 > 38.665 )
						if( ema1 <= 39.8497 )
							if( ema13 <= -0.020454 )
								if( ema12 <= -0.110784 )
									ret := 0.666667
								if( ema12 > -0.110784 )
									ret := 0.218750
							if( ema13 > -0.020454 )
								if( ema1 <= 38.8358 )
									ret := 0.363636
								if( ema1 > 38.8358 )
									ret := 0.880952 // buy
						if( ema1 > 39.8497 )
							if( ema1 <= 40.0472 )
								ret := -0.500000
							if( ema1 > 40.0472 )
								if( ema13 <= -0.220108 )
									ret := -0.416667
								if( ema13 > -0.220108 )
									ret := 0.156716
			if( bbp > -0.078449 )
				if( ema12 <= -0.004655 )
					if( ema13 <= -0.017694 )
						if( ema1 <= 27.869 )
							if( bbp <= -0.055331 )
								if( ema12 <= -0.016047 )
									ret := 0.033333
								if( ema12 > -0.016047 )
									ret := 0.656716
							if( bbp > -0.055331 )
								if( ema1 <= 21.7189 )
									ret := 0.370370
								if( ema1 > 21.7189 )
									ret := -0.111475
						if( ema1 > 27.869 )
							if( tema <= 30.3548 )
								if( bullPower <= -0.017918 )
									ret := 0.742857 // buy
								if( bullPower > -0.017918 )
									ret := 0.317073
							if( tema > 30.3548 )
								if( ema1 <= 35.7723 )
									ret := -0.211382
								if( ema1 > 35.7723 )
									ret := 0.177340
					if( ema13 > -0.017694 )
						if( tema <= 29.0085 )
							if( BBPower_Color <= 0.5 )
								if( ema2 <= 28.0818 )
									ret := 0.021918
								if( ema2 > 28.0818 )
									ret := 0.850000 // buy
							if( BBPower_Color > 0.5 )
								if( bbp <= 0.008121 )
									ret := -0.125000
								if( bbp > 0.008121 )
									ret := -0.500000
						if( tema > 29.0085 )
							if( ema2 <= 37.6003 )
								if( bearPower <= -0.035411 )
									ret := 0.000000
								if( bearPower > -0.035411 )
									ret := -0.622378
							if( ema2 > 37.6003 )
								if( ema2 <= 38.6045 )
									ret := 0.384615
								if( ema2 > 38.6045 )
									ret := -0.061538
				if( ema12 > -0.004655 )
					if( bullPower <= -0.011319 )
						if( ema1 <= 21.092 )
							ret := -1.000000 // sell
						if( ema1 > 21.092 )
							if( ema2 <= 22.1338 )
								if( tema <= 21.934 )
									ret := 0.550000
								if( tema > 21.934 )
									ret := 1.000000 // buy
							if( ema2 > 22.1338 )
								if( bbp <= -0.075189 )
									ret := 0.800000 // buy
								if( bbp > -0.075189 )
									ret := 0.243902
					if( bullPower > -0.011319 )
						if( tema <= 23.4914 )
							if( bullPower <= 0.017058 )
								if( ema2 <= 21.3733 )
									ret := 0.769231 // buy
								if( ema2 > 21.3733 )
									ret := -0.022222
							if( bullPower > 0.017058 )
								ret := -0.428571
						if( tema > 23.4914 )
							if( ema13 <= 0.085423 )
								if( ema13 <= 0.034754 )
									ret := 0.137472
								if( ema13 > 0.034754 )
									ret := 0.315217
							if( ema13 > 0.085423 )
								if( bbp <= 0.018475 )
									ret := -0.560000
								if( bbp > 0.018475 )
									ret := 0.370370
		if( bbm > 0.009362 )
			if( tema <= 23.1446 )
				if( ema12 <= -0.041323 )
					if( ema2 <= 20.7665 )
						if( ema3 <= 20.5102 )
							if( bearPower <= -0.208632 )
								ret := 0.777778 // buy
							if( bearPower > -0.208632 )
								ret := 1.000000 // buy
						if( ema3 > 20.5102 )
							if( tema <= 20.5895 )
								ret := -1.000000 // sell
							if( tema > 20.5895 )
								ret := -0.750000 // sell
					if( ema2 > 20.7665 )
						if( ema1 <= 22.5284 )
							if( ema1 <= 22.22 )
								if( bbp <= -0.669312 )
									ret := 0.941176 // buy
								if( bbp > -0.669312 )
									ret := 0.404082
							if( ema1 > 22.22 )
								if( ema3 <= 22.5025 )
									ret := 0.192053
								if( ema3 > 22.5025 )
									ret := -0.553846
						if( ema1 > 22.5284 )
							if( bullPower <= -0.218761 )
								ret := -0.545455
							if( bullPower > -0.218761 )
								if( ema2 <= 22.6643 )
									ret := 0.934211 // buy
								if( ema2 > 22.6643 )
									ret := 0.547368
				if( ema12 > -0.041323 )
					if( ema3 <= 22.7542 )
						if( ema2 <= 22.4453 )
							if( ema3 <= 22.4358 )
								if( ema1 <= 20.6651 )
									ret := 0.888889 // buy
								if( ema1 > 20.6651 )
									ret := 0.057640
							if( ema3 > 22.4358 )
								if( ema2 <= 22.4428 )
									ret := 0.642857
								if( ema2 > 22.4428 )
									ret := 0.083333
						if( ema2 > 22.4453 )
							if( ema2 <= 22.5215 )
								if( ema12 <= 0.007296 )
									ret := -0.444828
								if( ema12 > 0.007296 )
									ret := 0.022727
							if( ema2 > 22.5215 )
								if( ema1 <= 22.6608 )
									ret := 0.113333
								if( ema1 > 22.6608 )
									ret := -0.392045
					if( ema3 > 22.7542 )
						if( ema13 <= -0.027052 )
							if( bullPower <= 0.050877 )
								if( ema13 <= -0.040686 )
									ret := 0.103139
								if( ema13 > -0.040686 )
									ret := -0.164234
							if( bullPower > 0.050877 )
								if( ema13 <= -0.07764 )
									ret := 1.000000 // buy
								if( ema13 > -0.07764 )
									ret := 0.500000
						if( ema13 > -0.027052 )
							if( ema13 <= 0.043506 )
								if( bullPower <= -0.047761 )
									ret := 0.746032 // buy
								if( bullPower > -0.047761 )
									ret := 0.208880
							if( ema13 > 0.043506 )
								if( bbm <= 0.044999 )
									ret := 0.047619
								if( bbm > 0.044999 )
									ret := 0.794521 // buy
			if( tema > 23.1446 )
				if( tema <= 54.589 )
					if( bearPower <= -0.52461 )
						if( tema <= 34.7652 )
							if( ema2 <= 34.2506 )
								if( ema3 <= 33.3074 )
									ret := 0.168000
								if( ema3 > 33.3074 )
									ret := 0.964286 // buy
							if( ema2 > 34.2506 )
								if( ema13 <= -0.334542 )
									ret := -0.821429 // sell
								if( ema13 > -0.334542 )
									ret := -0.090909
						if( tema > 34.7652 )
							if( ema13 <= -0.440623 )
								if( bbm <= 0.160209 )
									ret := -0.428571
								if( bbm > 0.160209 )
									ret := 0.405405
							if( ema13 > -0.440623 )
								if( bullPower <= -0.088603 )
									ret := 0.756579 // buy
								if( bullPower > -0.088603 )
									ret := 0.263158
					if( bearPower > -0.52461 )
						if( bbm <= 0.176025 )
							if( bearPower <= -0.41926 )
								if( bbm <= 0.083141 )
									ret := 0.684211
								if( bbm > 0.083141 )
									ret := -0.577540
							if( bearPower > -0.41926 )
								if( ema2 <= 43.3985 )
									ret := -0.022133
								if( ema2 > 43.3985 )
									ret := -0.197699
						if( bbm > 0.176025 )
							if( ema12 <= 0.02471 )
								if( ema3 <= 54.6497 )
									ret := 0.115352
								if( ema3 > 54.6497 )
									ret := 0.914286 // buy
							if( ema12 > 0.02471 )
								if( ema13 <= 0.04103 )
									ret := 0.384615
								if( ema13 > 0.04103 )
									ret := -0.267399
				if( tema > 54.589 )
					if( ema3 <= 55.2099 )
						if( ema1 <= 54.7721 )
							ret := -0.736842 // sell
						if( ema1 > 54.7721 )
							if( bearPower <= -0.180451 )
								ret := -1.000000 // sell
							if( bearPower > -0.180451 )
								ret := -0.900000 // sell
					if( ema3 > 55.2099 )
						if( tema <= 55.03 )
							ret := 0.333333
						if( tema > 55.03 )
							if( ema3 <= 55.4724 )
								if( tema <= 55.1287 )
									ret := -1.000000 // sell
								if( tema > 55.1287 )
									ret := -0.052632
							if( ema3 > 55.4724 )
								ret := -1.000000 // sell
	if( bbp > 0.034005 )
		if( bbm <= 0.028265 )
			if( bbm <= 0.008958 )
				if( ema2 <= 33.2939 )
					if( bearPower <= 0.058571 )
						if( ema3 <= 30.209 )
							if( ema3 <= 21.5992 )
								if( ema13 <= 0.053652 )
									ret := -0.750000 // sell
								if( ema13 > 0.053652 )
									ret := -1.000000 // sell
							if( ema3 > 21.5992 )
								if( ema12 <= 0.026299 )
									ret := -0.022017
								if( ema12 > 0.026299 )
									ret := -0.265306
						if( ema3 > 30.209 )
							if( tema <= 32.0602 )
								if( ema12 <= 0.020167 )
									ret := -0.931034 // sell
								if( ema12 > 0.020167 )
									ret := -0.714286 // sell
							if( tema > 32.0602 )
								if( ema2 <= 33.2229 )
									ret := -0.055556
								if( ema2 > 33.2229 )
									ret := -0.538462
					if( bearPower > 0.058571 )
						if( ema13 <= 0.212968 )
							if( ema3 <= 23.5439 )
								if( tema <= 23.5675 )
									ret := -0.676471
								if( tema > 23.5675 )
									ret := -0.902778 // sell
							if( ema3 > 23.5439 )
								if( tema <= 23.9126 )
									ret := 0.490196
								if( tema > 23.9126 )
									ret := -0.516613
						if( ema13 > 0.212968 )
							if( ema2 <= 26.7515 )
								ret := 0.153846
							if( ema2 > 26.7515 )
								if( ema12 <= 0.150824 )
									ret := 0.608696
								if( ema12 > 0.150824 )
									ret := 0.902439 // buy
				if( ema2 > 33.2939 )
					if( bullPower <= 0.037704 )
						if( tema <= 39.8166 )
							if( ema3 <= 38.5772 )
								if( ema13 <= -0.032196 )
									ret := -0.615385
								if( ema13 > -0.032196 )
									ret := 0.187135
							if( ema3 > 38.5772 )
								if( bbp <= 0.071819 )
									ret := 0.530303
								if( bbp > 0.071819 )
									ret := 1.000000 // buy
						if( tema > 39.8166 )
							if( tema <= 43.1609 )
								if( ema1 <= 42.4602 )
									ret := -0.030928
								if( ema1 > 42.4602 )
									ret := -0.333333
							if( tema > 43.1609 )
								if( ema12 <= 0.020217 )
									ret := 0.000000
								if( ema12 > 0.020217 )
									ret := 0.631579
					if( bullPower > 0.037704 )
						if( ema2 <= 33.4834 )
							ret := 0.857143 // buy
						if( ema2 > 33.4834 )
							if( ema13 <= 0.189419 )
								if( ema1 <= 40.4395 )
									ret := -0.159672
								if( ema1 > 40.4395 )
									ret := -0.376712
							if( ema13 > 0.189419 )
								if( bbp <= 0.224638 )
									ret := 0.730769 // buy
								if( bbp > 0.224638 )
									ret := -0.066667
			if( bbm > 0.008958 )
				if( bbp <= 0.190192 )
					if( ema13 <= 0.075226 )
						if( ema12 <= 0.047043 )
							if( ema2 <= 39.7215 )
								if( bullPower <= 0.049526 )
									ret := -0.058445
								if( bullPower > 0.049526 )
									ret := -0.163409
							if( ema2 > 39.7215 )
								if( ema3 <= 40.0024 )
									ret := -0.823529 // sell
								if( ema3 > 40.0024 )
									ret := -0.242038
						if( ema12 > 0.047043 )
							ret := 0.625000
					if( ema13 > 0.075226 )
						if( ema12 <= 0.059102 )
							if( ema1 <= 28.0559 )
								if( ema3 <= 23.7081 )
									ret := 0.157576
								if( ema3 > 23.7081 )
									ret := -0.134969
							if( ema1 > 28.0559 )
								if( ema3 <= 38.3491 )
									ret := 0.611111
								if( ema3 > 38.3491 )
									ret := 0.057692
						if( ema12 > 0.059102 )
							if( ema12 <= 0.061204 )
								if( bullPower <= 0.089972 )
									ret := -0.571429
								if( bullPower > 0.089972 )
									ret := -0.857143 // sell
							if( ema12 > 0.061204 )
								if( ema12 <= 0.107206 )
									ret := -0.146552
								if( ema12 > 0.107206 )
									ret := 0.666667
				if( bbp > 0.190192 )
					if( ema3 <= 37.5413 )
						if( ema3 <= 29.3961 )
							if( tema <= 29.4815 )
								if( ema12 <= 0.149953 )
									ret := -0.405248
								if( ema12 > 0.149953 )
									ret := 0.555556
							if( tema > 29.4815 )
								ret := 0.923077 // buy
						if( ema3 > 29.3961 )
							if( ema2 <= 31.1303 )
								if( bearPower <= 0.145378 )
									ret := -0.791667 // sell
								if( bearPower > 0.145378 )
									ret := -1.000000 // sell
							if( ema2 > 31.1303 )
								if( bearPower <= 0.222296 )
									ret := -0.225490
								if( bearPower > 0.222296 )
									ret := -1.000000 // sell
					if( ema3 > 37.5413 )
						if( bbp <= 0.220093 )
							if( bearPower <= 0.092542 )
								ret := -0.375000
							if( bearPower > 0.092542 )
								ret := 1.000000 // buy
						if( bbp > 0.220093 )
							if( ema13 <= 0.20487 )
								if( ema2 <= 40.9531 )
									ret := -0.769231 // sell
								if( ema2 > 40.9531 )
									ret := -0.238095
							if( ema13 > 0.20487 )
								if( tema <= 40.1354 )
									ret := 0.904762 // buy
								if( tema > 40.1354 )
									ret := -0.064516
		if( bbm > 0.028265 )
			if( ema3 <= 54.6024 )
				if( bearPower <= -0.172916 )
					if( bbm <= 0.510612 )
						ret := -0.571429
					if( bbm > 0.510612 )
						if( bearPower <= -0.21279 )
							ret := -0.823529 // sell
						if( bearPower > -0.21279 )
							ret := -1.000000 // sell
				if( bearPower > -0.172916 )
					if( ema1 <= 45.545 )
						if( bearPower <= 0.397427 )
							if( ema12 <= 0.112093 )
								if( tema <= 20.3873 )
									ret := 0.872340 // buy
								if( tema > 20.3873 )
									ret := -0.025202
							if( ema12 > 0.112093 )
								if( bearPower <= 0.239078 )
									ret := 0.123574
								if( bearPower > 0.239078 )
									ret := -0.045767
						if( bearPower > 0.397427 )
							if( tema <= 27.0678 )
								if( ema13 <= 0.535111 )
									ret := 1.000000 // buy
								if( ema13 > 0.535111 )
									ret := -0.823529 // sell
							if( tema > 27.0678 )
								if( ema12 <= 0.27514 )
									ret := 0.000000
								if( ema12 > 0.27514 )
									ret := -0.774834 // sell
					if( ema1 > 45.545 )
						if( ema2 <= 54.6916 )
							if( ema3 <= 46.5872 )
								if( ema12 <= 0.134194 )
									ret := 0.833333 // buy
								if( ema12 > 0.134194 )
									ret := 0.166667
							if( ema3 > 46.5872 )
								if( tema <= 48.5815 )
									ret := -0.284091
								if( tema > 48.5815 )
									ret := 0.497207
						if( ema2 > 54.6916 )
							ret := -0.764706 // sell
			if( ema3 > 54.6024 )
				if( bbm <= 0.102995 )
					ret := 0.000000
				if( bbm > 0.102995 )
					if( ema13 <= 0.341317 )
						if( ema3 <= 54.6407 )
							ret := -0.695652
						if( ema3 > 54.6407 )
							if( bbp <= 0.063403 )
								ret := -0.500000
							if( bbp > 0.063403 )
								if( ema13 <= 0.213487 )
									ret := -1.000000 // sell
								if( ema13 > 0.213487 )
									ret := -0.789474 // sell
					if( ema13 > 0.341317 )
						ret := -0.166667
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_UPST_1Min_70129e5f(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)

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


