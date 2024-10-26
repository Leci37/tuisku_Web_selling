//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: ADBE_15Min_1T00_7d35070c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADBE_15Min_1T00_7d35070c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADBE_15Min_7d35070c(ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( tema <= 515.247 )
		if( ema12 <= -0.239413 )
			if( ema13 <= -0.786762 )
				if( ema13 <= -5.15654 )
					if( tema <= 246.406 )
						if( tema <= 221.257 )
							ret := 0.200000
						if( tema > 221.257 )
							if( ema3 <= 233.511 )
								ret := -1.000000 // sell
							if( ema3 > 233.511 )
								if( tema <= 242.16 )
									ret := -0.142857
								if( tema > 242.16 )
									ret := -1.000000 // sell
					if( tema > 246.406 )
						if( ema13 <= -10.0866 )
							if( ema1 <= 294.371 )
								if( tema <= 267.734 )
									ret := 1.000000 // buy
								if( tema > 267.734 )
									ret := 0.600000
							if( ema1 > 294.371 )
								if( ema3 <= 434.893 )
									ret := -0.525424
								if( ema3 > 434.893 )
									ret := 0.030612
						if( ema13 > -10.0866 )
							if( tema <= 290.574 )
								if( tema <= 285.386 )
									ret := 0.157895
								if( tema > 285.386 )
									ret := 0.850000 // buy
							if( tema > 290.574 )
								if( ema1 <= 307.318 )
									ret := -0.608696
								if( ema1 > 307.318 )
									ret := 0.274094
				if( ema13 > -5.15654 )
					if( ema2 <= 334.292 )
						if( tema <= 325.473 )
							if( ema13 <= -3.40335 )
								if( ema1 <= 243.54 )
									ret := 0.350000
								if( ema1 > 243.54 )
									ret := -0.248945
							if( ema13 > -3.40335 )
								if( ema2 <= 143.038 )
									ret := -0.203980
								if( ema2 > 143.038 )
									ret := 0.121067
						if( tema > 325.473 )
							if( tema <= 329.343 )
								if( ema2 <= 333.421 )
									ret := 0.655431
								if( ema2 > 333.421 )
									ret := -0.750000 // sell
							if( tema > 329.343 )
								if( ema2 <= 332.879 )
									ret := 0.008333
								if( ema2 > 332.879 )
									ret := 0.571429
					if( ema2 > 334.292 )
						if( ema1 <= 337.894 )
							if( ema13 <= -2.66545 )
								if( ema3 <= 337.535 )
									ret := -0.787234 // sell
								if( ema3 > 337.535 )
									ret := -0.380435
							if( ema13 > -2.66545 )
								if( tema <= 335.273 )
									ret := 0.023952
								if( tema > 335.273 )
									ret := -0.666667
						if( ema1 > 337.894 )
							if( ema1 <= 512.121 )
								if( ema2 <= 463.278 )
									ret := 0.070601
								if( ema2 > 463.278 )
									ret := -0.008459
							if( ema1 > 512.121 )
								if( ema12 <= -0.530595 )
									ret := 0.342742
								if( ema12 > -0.530595 )
									ret := -0.523077
			if( ema13 > -0.786762 )
				if( ema1 <= 202.535 )
					if( ema3 <= 182.879 )
						if( ema2 <= 180.342 )
							if( tema <= 141.826 )
								if( ema2 <= 134.094 )
									ret := 0.098485
								if( ema2 > 134.094 )
									ret := -0.596154
							if( tema > 141.826 )
								if( tema <= 175.539 )
									ret := 0.178125
								if( tema > 175.539 )
									ret := -0.379310
						if( ema2 > 180.342 )
							if( tema <= 180.842 )
								if( ema2 <= 180.806 )
									ret := 0.960000 // buy
								if( ema2 > 180.806 )
									ret := 0.842105 // buy
							if( tema > 180.842 )
								ret := 0.000000
					if( ema3 > 182.879 )
						if( ema1 <= 190.095 )
							if( ema12 <= -0.389973 )
								if( tema <= 183.047 )
									ret := 0.600000
								if( tema > 183.047 )
									ret := -0.500000
							if( ema12 > -0.389973 )
								if( ema13 <= -0.479001 )
									ret := -0.937500 // sell
								if( ema13 > -0.479001 )
									ret := -0.500000
						if( ema1 > 190.095 )
							if( ema1 <= 199.415 )
								if( ema13 <= -0.587367 )
									ret := -0.236842
								if( ema13 > -0.587367 )
									ret := 0.384615
							if( ema1 > 199.415 )
								if( ema2 <= 201.632 )
									ret := -0.750000 // sell
								if( ema2 > 201.632 )
									ret := 0.000000
				if( ema1 > 202.535 )
					if( ema1 <= 514.305 )
						if( ema2 <= 510.8 )
							if( ema12 <= -0.548028 )
								if( ema1 <= 508.473 )
									ret := 0.085048
								if( ema1 > 508.473 )
									ret := -0.857143 // sell
							if( ema12 > -0.548028 )
								if( ema13 <= 0.271515 )
									ret := 0.206905
								if( ema13 > 0.271515 )
									ret := -0.210526
						if( ema2 > 510.8 )
							if( ema13 <= -0.103293 )
								if( tema <= 510.544 )
									ret := -0.869565 // sell
								if( tema > 510.544 )
									ret := -0.428571
							if( ema13 > -0.103293 )
								if( tema <= 510.888 )
									ret := 0.000000
								if( tema > 510.888 )
									ret := 1.000000 // buy
					if( ema1 > 514.305 )
						if( tema <= 514.322 )
							if( ema3 <= 515.195 )
								if( ema3 <= 514.888 )
									ret := 0.500000
								if( ema3 > 514.888 )
									ret := 0.956522 // buy
							if( ema3 > 515.195 )
								if( ema2 <= 515.661 )
									ret := 0.166667
								if( ema2 > 515.661 )
									ret := 0.888889 // buy
						if( tema > 514.322 )
							if( ema13 <= -0.133404 )
								if( tema <= 514.884 )
									ret := -0.142857
								if( tema > 514.884 )
									ret := 0.500000
							if( ema13 > -0.133404 )
								ret := -0.500000
		if( ema12 > -0.239413 )
			if( ema2 <= 512.429 )
				if( ema2 <= 483.469 )
					if( ema2 <= 479.005 )
						if( ema3 <= 477.9 )
							if( ema3 <= 104.914 )
								if( ema13 <= -0.305878 )
									ret := -0.400000
								if( ema13 > -0.305878 )
									ret := 0.288747
							if( ema3 > 104.914 )
								if( ema13 <= 1.26018 )
									ret := 0.025587
								if( ema13 > 1.26018 )
									ret := 0.079119
						if( ema3 > 477.9 )
							if( ema13 <= 1.04893 )
								if( ema3 <= 478.118 )
									ret := -1.000000 // sell
								if( ema3 > 478.118 )
									ret := -0.696970
							if( ema13 > 1.04893 )
								if( ema13 <= 1.82042 )
									ret := 0.625000
								if( ema13 > 1.82042 )
									ret := -0.500000
					if( ema2 > 479.005 )
						if( ema3 <= 480.872 )
							if( ema3 <= 479.73 )
								if( ema12 <= 3.28633 )
									ret := 0.070796
								if( ema12 > 3.28633 )
									ret := 0.941176 // buy
							if( ema3 > 479.73 )
								if( ema13 <= 3.54208 )
									ret := 0.622517
								if( ema13 > 3.54208 )
									ret := -0.090909
						if( ema3 > 480.872 )
							if( ema3 <= 481.348 )
								if( ema1 <= 482.447 )
									ret := -0.659574
								if( ema1 > 482.447 )
									ret := 0.090909
							if( ema3 > 481.348 )
								if( ema12 <= -0.156653 )
									ret := -0.185185
								if( ema12 > -0.156653 )
									ret := 0.402878
				if( ema2 > 483.469 )
					if( ema2 <= 488.105 )
						if( ema3 <= 486.902 )
							if( ema1 <= 488.57 )
								if( ema1 <= 486.845 )
									ret := -0.067851
								if( ema1 > 486.845 )
									ret := -0.394089
							if( ema1 > 488.57 )
								if( ema13 <= 5.47814 )
									ret := 0.659091
								if( ema13 > 5.47814 )
									ret := -0.368421
						if( ema3 > 486.902 )
							if( ema3 <= 487.647 )
								if( ema12 <= 0.63972 )
									ret := -0.886364 // sell
								if( ema12 > 0.63972 )
									ret := -0.125000
							if( ema3 > 487.647 )
								ret := 0.400000
					if( ema2 > 488.105 )
						if( ema1 <= 490.798 )
							if( ema12 <= 0.442173 )
								if( ema3 <= 489.118 )
									ret := 0.692308
								if( ema3 > 489.118 )
									ret := 0.276596
							if( ema12 > 0.442173 )
								if( ema12 <= 1.7761 )
									ret := -0.046512
								if( ema12 > 1.7761 )
									ret := 0.545455
						if( ema1 > 490.798 )
							if( ema12 <= 1.76504 )
								if( ema1 <= 507.065 )
									ret := -0.024064
								if( ema1 > 507.065 )
									ret := 0.144975
							if( ema12 > 1.76504 )
								if( ema13 <= 2.59899 )
									ret := -0.864865 // sell
								if( ema13 > 2.59899 )
									ret := -0.089744
			if( ema2 > 512.429 )
				if( ema12 <= 0.23924 )
					if( ema13 <= 1.21311 )
						if( tema <= 512.326 )
							if( ema3 <= 512.175 )
								if( ema3 <= 511.742 )
									ret := 0.500000
								if( ema3 > 511.742 )
									ret := 1.000000 // buy
							if( ema3 > 512.175 )
								ret := 0.250000
						if( tema > 512.326 )
							if( ema3 <= 513.376 )
								ret := -0.500000
							if( ema3 > 513.376 )
								if( ema13 <= 0.509902 )
									ret := 0.275362
								if( ema13 > 0.509902 )
									ret := 0.900000 // buy
					if( ema13 > 1.21311 )
						ret := -0.857143 // sell
				if( ema12 > 0.23924 )
					if( ema2 <= 513.616 )
						if( ema12 <= 0.773092 )
							if( ema1 <= 513.863 )
								if( ema3 <= 511.975 )
									ret := 0.600000
								if( ema3 > 511.975 )
									ret := 0.200000
							if( ema1 > 513.863 )
								ret := 0.833333 // buy
						if( ema12 > 0.773092 )
							if( ema12 <= 1.00997 )
								ret := 0.000000
							if( ema12 > 1.00997 )
								ret := 0.750000 // buy
					if( ema2 > 513.616 )
						if( ema2 <= 514.137 )
							if( ema2 <= 514.005 )
								if( tema <= 515.01 )
									ret := 0.923077 // buy
								if( tema > 515.01 )
									ret := 0.400000
							if( ema2 > 514.005 )
								ret := 0.000000
						if( ema2 > 514.137 )
							ret := 1.000000 // buy
	if( tema > 515.247 )
		if( ema1 <= 666.5 )
			if( ema2 <= 543.243 )
				if( ema3 <= 541.43 )
					if( ema1 <= 539.553 )
						if( ema13 <= -3.71357 )
							if( ema2 <= 531.885 )
								if( ema1 <= 519.422 )
									ret := 0.037037
								if( ema1 > 519.422 )
									ret := -0.581250
							if( ema2 > 531.885 )
								if( ema1 <= 531.512 )
									ret := 0.303030
								if( ema1 > 531.512 )
									ret := -0.403226
						if( ema13 > -3.71357 )
							if( ema2 <= 515.01 )
								if( ema3 <= 509.901 )
									ret := -0.259740
								if( ema3 > 509.901 )
									ret := 0.340996
							if( ema2 > 515.01 )
								if( ema2 <= 517.188 )
									ret := -0.318681
								if( ema2 > 517.188 )
									ret := -0.017812
					if( ema1 > 539.553 )
						if( tema <= 541.441 )
							if( ema1 <= 539.702 )
								ret := 0.600000
							if( ema1 > 539.702 )
								if( ema3 <= 538.536 )
									ret := 0.818182 // buy
								if( ema3 > 538.536 )
									ret := 1.000000 // buy
						if( tema > 541.441 )
							if( ema1 <= 541.012 )
								if( ema2 <= 539.503 )
									ret := -0.111111
								if( ema2 > 539.503 )
									ret := -0.818182 // sell
							if( ema1 > 541.012 )
								if( ema12 <= 3.71981 )
									ret := 0.542056
								if( ema12 > 3.71981 )
									ret := -0.615385
				if( ema3 > 541.43 )
					if( ema13 <= -7.4197 )
						if( tema <= 533.316 )
							ret := 0.500000
						if( tema > 533.316 )
							ret := 1.000000 // buy
					if( ema13 > -7.4197 )
						if( ema2 <= 541.966 )
							if( ema3 <= 543.035 )
								if( ema3 <= 542.164 )
									ret := -0.600000
								if( ema3 > 542.164 )
									ret := -0.935484 // sell
							if( ema3 > 543.035 )
								if( tema <= 537.87 )
									ret := -0.800000 // sell
								if( tema > 537.87 )
									ret := 0.000000
						if( ema2 > 541.966 )
							if( ema2 <= 542.31 )
								if( ema13 <= -0.921136 )
									ret := -0.307692
								if( ema13 > -0.921136 )
									ret := 0.800000 // buy
							if( ema2 > 542.31 )
								if( ema3 <= 543.67 )
									ret := -0.244444
								if( ema3 > 543.67 )
									ret := -0.714286 // sell
			if( ema2 > 543.243 )
				if( tema <= 539.813 )
					if( ema3 <= 546.147 )
						if( ema1 <= 541.889 )
							ret := 0.000000
						if( ema1 > 541.889 )
							ret := 1.000000 // buy
					if( ema3 > 546.147 )
						if( ema12 <= -7.44825 )
							if( ema12 <= -16.776 )
								ret := 1.000000 // buy
							if( ema12 > -16.776 )
								if( tema <= 526.703 )
									ret := 0.000000
								if( tema > 526.703 )
									ret := 0.500000
						if( ema12 > -7.44825 )
							if( ema13 <= -4.37786 )
								if( ema12 <= -3.92788 )
									ret := 1.000000 // buy
								if( ema12 > -3.92788 )
									ret := 0.923077 // buy
							if( ema13 > -4.37786 )
								ret := 0.666667
				if( tema > 539.813 )
					if( tema <= 567.336 )
						if( ema13 <= -4.73714 )
							if( ema2 <= 547.107 )
								if( ema1 <= 544.034 )
									ret := 0.125000
								if( ema1 > 544.034 )
									ret := 1.000000 // buy
							if( ema2 > 547.107 )
								if( ema1 <= 565.114 )
									ret := -0.438017
								if( ema1 > 565.114 )
									ret := -0.048780
						if( ema13 > -4.73714 )
							if( ema3 <= 557.865 )
								if( tema <= 554.953 )
									ret := 0.134413
								if( tema > 554.953 )
									ret := -0.173246
							if( ema3 > 557.865 )
								if( ema1 <= 562.157 )
									ret := 0.288022
								if( ema1 > 562.157 )
									ret := 0.067879
					if( tema > 567.336 )
						if( ema1 <= 568.732 )
							if( ema13 <= -0.003073 )
								if( ema3 <= 569.294 )
									ret := 0.000000
								if( ema3 > 569.294 )
									ret := 0.375000
							if( ema13 > -0.003073 )
								if( ema13 <= 2.09523 )
									ret := -0.551181
								if( ema13 > 2.09523 )
									ret := -0.216667
						if( ema1 > 568.732 )
							if( ema12 <= -6.05927 )
								if( ema1 <= 612.034 )
									ret := -0.026316
								if( ema1 > 612.034 )
									ret := -0.722222 // sell
							if( ema12 > -6.05927 )
								if( ema12 <= -0.453734 )
									ret := 0.074212
								if( ema12 > -0.453734 )
									ret := -0.022243
		if( ema1 > 666.5 )
			if( ema1 <= 694.134 )
				if( tema <= 682.901 )
					if( ema2 <= 675.643 )
						if( ema12 <= -0.606962 )
							if( ema1 <= 669.092 )
								if( ema12 <= -1.04018 )
									ret := -0.607143
								if( ema12 > -1.04018 )
									ret := 0.333333
							if( ema1 > 669.092 )
								if( ema13 <= -4.47142 )
									ret := -0.833333 // sell
								if( ema13 > -4.47142 )
									ret := 0.679245
						if( ema12 > -0.606962 )
							if( ema12 <= 1.18211 )
								if( ema13 <= -0.107866 )
									ret := -0.787234 // sell
								if( ema13 > -0.107866 )
									ret := -0.391892
							if( ema12 > 1.18211 )
								if( ema12 <= 4.31271 )
									ret := 0.058824
								if( ema12 > 4.31271 )
									ret := -0.846154 // sell
					if( ema2 > 675.643 )
						if( ema12 <= -2.26715 )
							if( ema3 <= 678.597 )
								if( ema12 <= -2.51349 )
									ret := 0.000000
								if( ema12 > -2.51349 )
									ret := -1.000000 // sell
							if( ema3 > 678.597 )
								if( ema1 <= 677.584 )
									ret := 0.400000
								if( ema1 > 677.584 )
									ret := -0.071429
						if( ema12 > -2.26715 )
							if( ema2 <= 679.805 )
								if( ema12 <= 0.486487 )
									ret := -0.980392 // sell
								if( ema12 > 0.486487 )
									ret := -0.750000 // sell
							if( ema2 > 679.805 )
								if( tema <= 679.85 )
									ret := -0.400000
								if( tema > 679.85 )
									ret := -0.800000 // sell
				if( tema > 682.901 )
					if( ema12 <= -0.151159 )
						if( ema2 <= 691.566 )
							if( ema2 <= 689.051 )
								ret := 0.750000 // buy
							if( ema2 > 689.051 )
								ret := 1.000000 // buy
						if( ema2 > 691.566 )
							ret := 0.000000
					if( ema12 > -0.151159 )
						if( ema2 <= 675.028 )
							ret := 1.000000 // buy
						if( ema2 > 675.028 )
							if( ema3 <= 690.848 )
								if( ema3 <= 687.75 )
									ret := 0.000000
								if( ema3 > 687.75 )
									ret := -0.750000 // sell
							if( ema3 > 690.848 )
								if( ema3 <= 691.273 )
									ret := 0.750000 // buy
								if( ema3 > 691.273 )
									ret := 0.250000
			if( ema1 > 694.134 )
				if( ema3 <= 691.625 )
					ret := -0.400000
				if( ema3 > 691.625 )
					if( ema2 <= 695.013 )
						ret := -1.000000 // sell
					if( ema2 > 695.013 )
						ret := -0.750000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_ADBE_15Min_7d35070c(ema3, tema, ema2, ema12, ema13, ema1)

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


