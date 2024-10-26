//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: SOLUSDT_30Min_1T00_e9caeaa2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_30Min_1T00_e9caeaa2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_30Min_e9caeaa2(ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -1.2175 )
		if( ema2 <= 199.062 )
			if( ema12 <= -4.32739 )
				if( ema13 <= -7.67848 )
					if( ema3 <= 164.251 )
						ret := 1.000000 // buy
					if( ema3 > 164.251 )
						if( ema1 <= 157.124 )
							ret := 0.250000
						if( ema1 > 157.124 )
							if( ema12 <= -5.10023 )
								if( ema13 <= -8.59363 )
									ret := 1.000000 // buy
								if( ema13 > -8.59363 )
									ret := 0.750000 // buy
							if( ema12 > -5.10023 )
								if( ema12 <= -4.71349 )
									ret := 0.333333
								if( ema12 > -4.71349 )
									ret := 1.000000 // buy
				if( ema13 > -7.67848 )
					if( ema13 <= -6.70594 )
						if( tema <= 161.541 )
							ret := -0.200000
						if( tema > 161.541 )
							ret := 0.750000 // buy
					if( ema13 > -6.70594 )
						ret := 1.000000 // buy
			if( ema12 > -4.32739 )
				if( ema3 <= 147.862 )
					if( ema12 <= -2.6648 )
						if( ema2 <= 130.728 )
							if( ema3 <= 120.606 )
								if( ema12 <= -3.1231 )
									ret := 0.863636 // buy
								if( ema12 > -3.1231 )
									ret := 0.439024
							if( ema3 > 120.606 )
								if( ema1 <= 120.353 )
									ret := 0.923077 // buy
								if( ema1 > 120.353 )
									ret := 1.000000 // buy
						if( ema2 > 130.728 )
							if( tema <= 130.787 )
								if( ema13 <= -6.75441 )
									ret := 0.000000
								if( ema13 > -6.75441 )
									ret := -0.952381 // sell
							if( tema > 130.787 )
								if( tema <= 137.809 )
									ret := 0.739130 // buy
								if( tema > 137.809 )
									ret := 0.000000
					if( ema12 > -2.6648 )
						if( ema13 <= -4.29834 )
							if( ema3 <= 129.469 )
								if( ema2 <= 52.5611 )
									ret := 1.000000 // buy
								if( ema2 > 52.5611 )
									ret := -0.538462
							if( ema3 > 129.469 )
								if( ema13 <= -4.74221 )
									ret := 0.750000 // buy
								if( ema13 > -4.74221 )
									ret := 0.125000
						if( ema13 > -4.29834 )
							if( tema <= 137.091 )
								if( ema1 <= 138.355 )
									ret := 0.247594
								if( ema1 > 138.355 )
									ret := -0.346154
							if( tema > 137.091 )
								if( tema <= 138.391 )
									ret := 0.809524 // buy
								if( tema > 138.391 )
									ret := 0.241667
				if( ema3 > 147.862 )
					if( ema3 <= 152.264 )
						if( ema3 <= 148.986 )
							if( ema12 <= -3.093 )
								ret := -0.750000 // sell
							if( ema12 > -3.093 )
								if( tema <= 141.288 )
									ret := 0.750000 // buy
								if( tema > 141.288 )
									ret := 0.076923
						if( ema3 > 148.986 )
							if( ema2 <= 149.826 )
								if( ema3 <= 150.974 )
									ret := -0.670588
								if( ema3 > 150.974 )
									ret := 0.153846
							if( ema2 > 149.826 )
								if( ema3 <= 152.001 )
									ret := -0.882353 // sell
								if( ema3 > 152.001 )
									ret := -0.384615
					if( ema3 > 152.264 )
						if( ema13 <= -2.0819 )
							if( tema <= 194.579 )
								if( ema1 <= 191.766 )
									ret := 0.249518
								if( ema1 > 191.766 )
									ret := -0.268657
							if( tema > 194.579 )
								if( ema1 <= 196.998 )
									ret := 0.913043 // buy
								if( ema1 > 196.998 )
									ret := 0.250000
						if( ema13 > -2.0819 )
							if( ema3 <= 178.436 )
								if( ema13 <= -1.61844 )
									ret := -0.022222
								if( ema13 > -1.61844 )
									ret := 0.857143 // buy
							if( ema3 > 178.436 )
								if( tema <= 177.532 )
									ret := -1.000000 // sell
								if( tema > 177.532 )
									ret := -0.333333
		if( ema2 > 199.062 )
			if( tema <= 214.196 )
				if( ema3 <= 202.819 )
					if( ema2 <= 199.45 )
						ret := -0.166667
					if( ema2 > 199.45 )
						if( tema <= 194.923 )
							ret := -1.000000 // sell
						if( tema > 194.923 )
							if( tema <= 196.805 )
								if( ema13 <= -2.4487 )
									ret := -0.714286 // sell
								if( ema13 > -2.4487 )
									ret := -0.200000
							if( tema > 196.805 )
								ret := -1.000000 // sell
				if( ema3 > 202.819 )
					if( ema1 <= 198.157 )
						if( ema13 <= -7.62689 )
							ret := 0.400000
						if( ema13 > -7.62689 )
							if( ema13 <= -6.33922 )
								ret := 1.000000 // buy
							if( ema13 > -6.33922 )
								ret := 0.500000
					if( ema1 > 198.157 )
						if( ema13 <= -3.46485 )
							if( ema13 <= -3.78548 )
								if( ema1 <= 206.024 )
									ret := -0.107143
								if( ema1 > 206.024 )
									ret := -0.704545 // sell
							if( ema13 > -3.78548 )
								if( ema1 <= 206.274 )
									ret := -1.000000 // sell
								if( ema1 > 206.274 )
									ret := -0.750000 // sell
						if( ema13 > -3.46485 )
							if( ema13 <= -3.35762 )
								if( ema12 <= -2.10418 )
									ret := 0.750000 // buy
								if( ema12 > -2.10418 )
									ret := 1.000000 // buy
							if( ema13 > -3.35762 )
								if( ema12 <= -1.72784 )
									ret := 0.653846
								if( ema12 > -1.72784 )
									ret := -0.400000
			if( tema > 214.196 )
				if( ema3 <= 229.868 )
					if( ema12 <= -2.01491 )
						if( ema12 <= -2.33983 )
							ret := 0.666667
						if( ema12 > -2.33983 )
							if( ema12 <= -2.13519 )
								ret := -0.400000
							if( ema12 > -2.13519 )
								ret := 0.000000
					if( ema12 > -2.01491 )
						if( ema13 <= -2.04457 )
							if( ema1 <= 222.334 )
								if( ema1 <= 219.199 )
									ret := 0.850000 // buy
								if( ema1 > 219.199 )
									ret := -0.250000
							if( ema1 > 222.334 )
								if( ema13 <= -3.02021 )
									ret := 0.750000 // buy
								if( ema13 > -3.02021 )
									ret := 1.000000 // buy
						if( ema13 > -2.04457 )
							ret := 0.250000
				if( ema3 > 229.868 )
					if( ema1 <= 244.524 )
						if( tema <= 225.745 )
							ret := -0.857143 // sell
						if( tema > 225.745 )
							if( ema13 <= -5.45162 )
								ret := 1.000000 // buy
							if( ema13 > -5.45162 )
								if( ema3 <= 240.428 )
									ret := -0.081633
								if( ema3 > 240.428 )
									ret := -0.352941
					if( ema1 > 244.524 )
						if( ema1 <= 246.04 )
							ret := 1.000000 // buy
						if( ema1 > 246.04 )
							ret := 0.500000
	if( ema12 > -1.2175 )
		if( ema13 <= 0.025909 )
			if( tema <= 14.1221 )
				if( ema12 <= -0.077182 )
					if( ema13 <= -0.149827 )
						if( ema13 <= -0.381533 )
							if( ema13 <= -0.718615 )
								ret := 1.000000 // buy
							if( ema13 > -0.718615 )
								if( ema3 <= 14.448 )
									ret := 0.637427
								if( ema3 > 14.448 )
									ret := 0.212121
						if( ema13 > -0.381533 )
							if( tema <= 11.6761 )
								if( tema <= 7.73283 )
									ret := 0.343195
								if( tema > 7.73283 )
									ret := 0.595745
							if( tema > 11.6761 )
								if( ema3 <= 13.8537 )
									ret := 0.077586
								if( ema3 > 13.8537 )
									ret := 0.472527
					if( ema13 > -0.149827 )
						if( tema <= 2.79172 )
							if( ema1 <= 2.11204 )
								ret := 1.000000 // buy
							if( ema1 > 2.11204 )
								if( ema13 <= -0.128887 )
									ret := -0.200000
								if( ema13 > -0.128887 )
									ret := 1.000000 // buy
						if( tema > 2.79172 )
							if( ema3 <= 3.37532 )
								if( ema12 <= -0.087811 )
									ret := -0.750000 // sell
								if( ema12 > -0.087811 )
									ret := -1.000000 // sell
							if( ema3 > 3.37532 )
								if( tema <= 7.89888 )
									ret := 0.857143 // buy
								if( tema > 7.89888 )
									ret := 0.000000
				if( ema12 > -0.077182 )
					if( ema13 <= -0.020138 )
						if( ema3 <= 6.06453 )
							if( tema <= 5.12253 )
								if( ema12 <= -0.021918 )
									ret := 0.245675
								if( ema12 > -0.021918 )
									ret := 0.071149
							if( tema > 5.12253 )
								if( tema <= 5.96106 )
									ret := 1.000000 // buy
								if( tema > 5.96106 )
									ret := 0.750000 // buy
						if( ema3 > 6.06453 )
							if( tema <= 11.0334 )
								if( ema12 <= -0.065399 )
									ret := 0.088608
								if( ema12 > -0.065399 )
									ret := -0.425197
							if( tema > 11.0334 )
								if( ema13 <= -0.05052 )
									ret := -0.057011
								if( ema13 > -0.05052 )
									ret := 0.168639
					if( ema13 > -0.020138 )
						if( ema12 <= -0.003618 )
							if( ema3 <= 3.70266 )
								if( ema2 <= 3.54698 )
									ret := -0.141631
								if( ema2 > 3.54698 )
									ret := -0.892857 // sell
							if( ema3 > 3.70266 )
								if( ema2 <= 8.6579 )
									ret := 0.543103
								if( ema2 > 8.6579 )
									ret := -0.144231
						if( ema12 > -0.003618 )
							if( ema13 <= 0.01167 )
								if( ema12 <= 0.003479 )
									ret := 0.014894
								if( ema12 > 0.003479 )
									ret := 0.213429
							if( ema13 > 0.01167 )
								if( ema1 <= 2.36714 )
									ret := 0.018545
								if( ema1 > 2.36714 )
									ret := -0.194192
			if( tema > 14.1221 )
				if( ema1 <= 17.3223 )
					if( ema2 <= 17.1754 )
						if( ema2 <= 16.0972 )
							if( ema3 <= 16.1454 )
								if( tema <= 15.9431 )
									ret := -0.154749
								if( tema > 15.9431 )
									ret := 0.261905
							if( ema3 > 16.1454 )
								if( ema12 <= -0.04345 )
									ret := 0.000000
								if( ema12 > -0.04345 )
									ret := -0.941176 // sell
						if( ema2 > 16.0972 )
							if( ema3 <= 16.8244 )
								if( tema <= 16.0286 )
									ret := 0.543478
								if( tema > 16.0286 )
									ret := 0.074074
							if( ema3 > 16.8244 )
								if( ema2 <= 16.7653 )
									ret := -0.656250
								if( ema2 > 16.7653 )
									ret := -0.052632
					if( ema2 > 17.1754 )
						if( ema13 <= -0.487699 )
							ret := -1.000000 // sell
						if( ema13 > -0.487699 )
							if( tema <= 16.7758 )
								if( ema1 <= 17.0119 )
									ret := 0.000000
								if( ema1 > 17.0119 )
									ret := 1.000000 // buy
							if( tema > 16.7758 )
								if( ema3 <= 17.2433 )
									ret := -1.000000 // sell
								if( ema3 > 17.2433 )
									ret := -0.400000
				if( ema1 > 17.3223 )
					if( ema1 <= 140.889 )
						if( ema3 <= 18.872 )
							if( ema1 <= 18.6137 )
								if( tema <= 18.2887 )
									ret := 0.228814
								if( tema > 18.2887 )
									ret := -0.255814
							if( ema1 > 18.6137 )
								if( ema12 <= 0.009692 )
									ret := 0.731183 // buy
								if( ema12 > 0.009692 )
									ret := 0.000000
						if( ema3 > 18.872 )
							if( ema1 <= 18.8609 )
								if( ema13 <= -0.110101 )
									ret := -0.633333
								if( ema13 > -0.110101 )
									ret := 0.142857
							if( ema1 > 18.8609 )
								if( ema12 <= -0.231847 )
									ret := 0.055487
								if( ema12 > -0.231847 )
									ret := -0.006598
					if( ema1 > 140.889 )
						if( ema2 <= 166.513 )
							if( ema3 <= 162.169 )
								if( ema1 <= 157.62 )
									ret := -0.125000
								if( ema1 > 157.62 )
									ret := 0.100575
							if( ema3 > 162.169 )
								if( ema1 <= 162.436 )
									ret := -0.818182 // sell
								if( ema1 > 162.436 )
									ret := -0.239130
						if( ema2 > 166.513 )
							if( ema2 <= 173.043 )
								if( ema3 <= 173.326 )
									ret := 0.193146
								if( ema3 > 173.326 )
									ret := 0.694444
							if( ema2 > 173.043 )
								if( ema2 <= 177.121 )
									ret := -0.265928
								if( ema2 > 177.121 )
									ret := -0.022920
		if( ema13 > 0.025909 )
			if( ema2 <= 240.566 )
				if( ema1 <= 4.01566 )
					if( tema <= 3.43968 )
						if( tema <= 1.72727 )
							if( ema13 <= 0.066714 )
								if( ema12 <= 0.021457 )
									ret := 0.422857
								if( ema12 > 0.021457 )
									ret := -0.093023
							if( ema13 > 0.066714 )
								if( ema13 <= 0.08332 )
									ret := 0.952381 // buy
								if( ema13 > 0.08332 )
									ret := 0.000000
						if( tema > 1.72727 )
							if( tema <= 2.48218 )
								if( tema <= 2.39104 )
									ret := -0.066059
								if( tema > 2.39104 )
									ret := -0.790000 // sell
							if( tema > 2.48218 )
								if( ema3 <= 2.54591 )
									ret := 0.609929
								if( ema3 > 2.54591 )
									ret := 0.079082
					if( tema > 3.43968 )
						if( ema12 <= 0.039837 )
							if( ema1 <= 3.49329 )
								if( ema3 <= 3.36594 )
									ret := 0.777778 // buy
								if( ema3 > 3.36594 )
									ret := -0.566038
							if( ema1 > 3.49329 )
								if( ema2 <= 3.55266 )
									ret := 0.554054
								if( ema2 > 3.55266 )
									ret := -0.113514
						if( ema12 > 0.039837 )
							if( ema3 <= 3.51073 )
								if( tema <= 3.48629 )
									ret := -0.457143
								if( tema > 3.48629 )
									ret := -0.905660 // sell
							if( ema3 > 3.51073 )
								if( ema3 <= 3.601 )
									ret := 0.478261
								if( ema3 > 3.601 )
									ret := -0.659341
				if( ema1 > 4.01566 )
					if( tema <= 8.27144 )
						if( ema13 <= 0.368736 )
							if( ema1 <= 6.8771 )
								if( ema2 <= 6.72776 )
									ret := 0.319672
								if( ema2 > 6.72776 )
									ret := -0.777778 // sell
							if( ema1 > 6.8771 )
								if( tema <= 7.91761 )
									ret := 0.937500 // buy
								if( tema > 7.91761 )
									ret := 0.269231
						if( ema13 > 0.368736 )
							if( ema1 <= 7.20806 )
								if( ema12 <= 0.22265 )
									ret := -0.750000 // sell
								if( ema12 > 0.22265 )
									ret := 0.250000
							if( ema1 > 7.20806 )
								ret := -1.000000 // sell
					if( tema > 8.27144 )
						if( ema2 <= 8.26335 )
							if( ema12 <= 0.148756 )
								if( tema <= 8.31109 )
									ret := -0.500000
								if( tema > 8.31109 )
									ret := -0.923077 // sell
							if( ema12 > 0.148756 )
								ret := 0.000000
						if( ema2 > 8.26335 )
							if( ema3 <= 8.60595 )
								if( tema <= 9.14763 )
									ret := 0.753425 // buy
								if( tema > 9.14763 )
									ret := -1.000000 // sell
							if( ema3 > 8.60595 )
								if( ema1 <= 9.13561 )
									ret := -0.640625
								if( ema1 > 9.13561 )
									ret := 0.077092
			if( ema2 > 240.566 )
				if( ema2 <= 244.469 )
					if( ema3 <= 241.304 )
						if( ema2 <= 240.775 )
							if( ema2 <= 240.63 )
								ret := -1.000000 // sell
							if( ema2 > 240.63 )
								ret := -0.714286 // sell
						if( ema2 > 240.775 )
							if( ema3 <= 240.532 )
								if( ema2 <= 241.274 )
									ret := -0.166667
								if( ema2 > 241.274 )
									ret := 0.250000
							if( ema3 > 240.532 )
								if( ema12 <= 0.492286 )
									ret := 0.000000
								if( ema12 > 0.492286 )
									ret := -0.600000
					if( ema3 > 241.304 )
						if( ema13 <= 1.44102 )
							if( ema12 <= 0.405361 )
								if( ema2 <= 242.219 )
									ret := -0.750000 // sell
								if( ema2 > 242.219 )
									ret := -1.000000 // sell
							if( ema12 > 0.405361 )
								ret := -0.250000
						if( ema13 > 1.44102 )
							ret := -1.000000 // sell
				if( ema2 > 244.469 )
					if( ema2 <= 250.591 )
						if( ema1 <= 248.643 )
							if( ema13 <= 2.31837 )
								ret := 0.000000
							if( ema13 > 2.31837 )
								ret := -0.750000 // sell
						if( ema1 > 248.643 )
							if( ema12 <= 2.07421 )
								ret := 0.750000 // buy
							if( ema12 > 2.07421 )
								ret := 0.000000
					if( ema2 > 250.591 )
						if( ema12 <= 0.470895 )
							ret := -0.333333
						if( ema12 > 0.470895 )
							if( ema1 <= 255.151 )
								if( ema13 <= 1.86293 )
									ret := -0.833333 // sell
								if( ema13 > 1.86293 )
									ret := -0.250000
							if( ema1 > 255.151 )
								if( tema <= 256.835 )
									ret := -0.750000 // sell
								if( tema > 256.835 )
									ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_SOLUSDT_30Min_e9caeaa2(ema1, tema, ema12, ema2, ema3, ema13)

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


