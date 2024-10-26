//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: UPST_1Min_2BV0_3779656d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_2BV0_3779656d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_3779656d(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= 0.027532 )
		if( VIP <= 1.44199 )
			if( bearPower <= -0.527141 )
				if( VIM <= 1.73381 )
					if( bbm <= 1.24928 )
						if( bullPower <= -0.434825 )
							if( VIP_VIM <= -0.555728 )
								if( bearPower <= -0.671575 )
									ret := 0.952381 // buy
								if( bearPower > -0.671575 )
									ret := 0.750000 // buy
							if( VIP_VIM > -0.555728 )
								ret := 0.500000
						if( bullPower > -0.434825 )
							if( bbm <= 0.148617 )
								ret := -1.000000 // sell
							if( bbm > 0.148617 )
								if( bearPower <= -0.72774 )
									ret := 0.177215
								if( bearPower > -0.72774 )
									ret := 0.577617
					if( bbm > 1.24928 )
						if( VIP <= 0.52447 )
							ret := -0.142857
						if( VIP > 0.52447 )
							ret := -1.000000 // sell
				if( VIM > 1.73381 )
					if( VIP_VIM <= -1.32744 )
						if( VIM <= 2.01744 )
							ret := -0.571429
						if( VIM > 2.01744 )
							ret := -1.000000 // sell
					if( VIP_VIM > -1.32744 )
						if( VIP <= 0.920506 )
							if( VIM <= 1.86913 )
								ret := -0.833333 // sell
							if( VIM > 1.86913 )
								ret := 0.250000
						if( VIP > 0.920506 )
							if( VIP <= 0.98034 )
								ret := 0.750000 // buy
							if( VIP > 0.98034 )
								ret := 1.000000 // buy
			if( bearPower > -0.527141 )
				if( VIP <= 0.738487 )
					if( VIM <= 1.16821 )
						if( bbm <= 0.125 )
							ret := 0.000000
						if( bbm > 0.125 )
							if( bearPower <= -0.286558 )
								ret := 0.200000
							if( bearPower > -0.286558 )
								if( bullPower <= 0.026713 )
									ret := 0.966667 // buy
								if( bullPower > 0.026713 )
									ret := 0.714286 // buy
					if( VIM > 1.16821 )
						if( bbp <= -0.418901 )
							if( VIP_VIM <= -1.28969 )
								if( VIP_VIM <= -1.62384 )
									ret := 1.000000 // buy
								if( VIP_VIM > -1.62384 )
									ret := 0.428571
							if( VIP_VIM > -1.28969 )
								if( bearPower <= -0.335863 )
									ret := -0.036193
								if( bearPower > -0.335863 )
									ret := -0.269231
						if( bbp > -0.418901 )
							if( bbp <= -0.360668 )
								if( VIP <= 0.579456 )
									ret := 0.461538
								if( VIP > 0.579456 )
									ret := 0.117808
							if( bbp > -0.360668 )
								if( bullPower <= -0.125089 )
									ret := -0.194805
								if( bullPower > -0.125089 )
									ret := -0.000307
				if( VIP > 0.738487 )
					if( bearPower <= -0.332998 )
						if( bullPower <= -0.264397 )
							if( bearPower <= -0.401794 )
								if( bearPower <= -0.474557 )
									ret := -0.045455
								if( bearPower > -0.474557 )
									ret := -0.549020
							if( bearPower > -0.401794 )
								if( VIM <= 1.3542 )
									ret := -0.750000 // sell
								if( VIM > 1.3542 )
									ret := 0.923077 // buy
						if( bullPower > -0.264397 )
							if( bbp <= -0.204708 )
								if( VIP_VIM <= -0.527991 )
									ret := 0.043011
								if( VIP_VIM > -0.527991 )
									ret := 0.410256
							if( bbp > -0.204708 )
								if( VIP <= 0.981637 )
									ret := -0.888889 // sell
								if( VIP > 0.981637 )
									ret := 0.125000
					if( bearPower > -0.332998 )
						if( bbm <= 0.009797 )
							if( bearPower <= -0.034241 )
								if( bearPower <= -0.141053 )
									ret := 0.634409
								if( bearPower > -0.141053 )
									ret := 0.286598
							if( bearPower > -0.034241 )
								if( bearPower <= -0.002933 )
									ret := 0.146580
								if( bearPower > -0.002933 )
									ret := 0.001859
						if( bbm > 0.009797 )
							if( VIM <= 1.30477 )
								if( bullPower <= 0.102503 )
									ret := 0.035468
								if( bullPower > 0.102503 )
									ret := 0.107177
							if( VIM > 1.30477 )
								if( VIP_VIM <= -1.21383 )
									ret := -0.536585
								if( VIP_VIM > -1.21383 )
									ret := 0.172027
		if( VIP > 1.44199 )
			if( bullPower <= -0.03354 )
				if( VIM <= 1.57272 )
					if( bullPower <= -0.045084 )
						if( VIP <= 1.44848 )
							ret := 0.000000
						if( VIP > 1.44848 )
							if( VIP <= 1.53039 )
								if( bbm <= 0.020746 )
									ret := 0.769231 // buy
								if( bbm > 0.020746 )
									ret := 1.000000 // buy
							if( VIP > 1.53039 )
								if( bbm <= 0.035136 )
									ret := 0.704000 // buy
								if( bbm > 0.035136 )
									ret := 0.000000
					if( bullPower > -0.045084 )
						if( VIP <= 2.14964 )
							if( VIP <= 1.93426 )
								if( VIP <= 1.51265 )
									ret := 0.500000
								if( VIP > 1.51265 )
									ret := 0.105263
							if( VIP > 1.93426 )
								ret := -0.800000 // sell
						if( VIP > 2.14964 )
							if( VIM <= 1.43982 )
								ret := 0.666667
							if( VIM > 1.43982 )
								ret := 1.000000 // buy
				if( VIM > 1.57272 )
					if( bbm <= 0.009997 )
						if( VIM <= 3790.07 )
							if( VIP_VIM <= 0.079748 )
								if( VIP_VIM <= -1.00094 )
									ret := 0.483471
								if( VIP_VIM > -1.00094 )
									ret := 0.252950
							if( VIP_VIM > 0.079748 )
								if( VIM <= 1.9798 )
									ret := 0.244755
								if( VIM > 1.9798 )
									ret := 0.513600
						if( VIM > 3790.07 )
							ret := -0.857143 // sell
					if( bbm > 0.009997 )
						if( VIP_VIM <= -0.958333 )
							if( VIP_VIM <= -1.14648 )
								if( VIM <= 2.77663 )
									ret := 0.833333 // buy
								if( VIM > 2.77663 )
									ret := 0.133929
							if( VIP_VIM > -1.14648 )
								if( VIP <= 5.73171 )
									ret := 0.740741 // buy
								if( VIP > 5.73171 )
									ret := 0.263158
						if( VIP_VIM > -0.958333 )
							if( VIM <= 2.24154 )
								if( VIP <= 1.74944 )
									ret := 0.102273
								if( VIP > 1.74944 )
									ret := -0.329897
							if( VIM > 2.24154 )
								if( VIP <= 14.8726 )
									ret := 0.171986
								if( VIP > 14.8726 )
									ret := -0.521739
			if( bullPower > -0.03354 )
				if( bullPower <= 0.205048 )
					if( bbp <= 0.035531 )
						if( VIM <= 1.29214 )
							if( VIP_VIM <= 0.287186 )
								if( bbp <= -0.053262 )
									ret := 0.250000
								if( bbp > -0.053262 )
									ret := 1.000000 // buy
							if( VIP_VIM > 0.287186 )
								if( VIP <= 1.71468 )
									ret := 0.149533
								if( VIP > 1.71468 )
									ret := 0.520000
						if( VIM > 1.29214 )
							if( bbm <= 0.000606 )
								if( VIM <= 7.00635 )
									ret := -0.000558
								if( VIM > 7.00635 )
									ret := 0.162963
							if( bbm > 0.000606 )
								if( VIP <= 3.28301 )
									ret := 0.223549
								if( VIP > 3.28301 )
									ret := 0.024578
					if( bbp > 0.035531 )
						if( bearPower <= 0.027487 )
							if( bbp <= 0.180253 )
								if( bbp <= 0.145767 )
									ret := -0.037992
								if( bbp > 0.145767 )
									ret := 0.500000
							if( bbp > 0.180253 )
								if( bullPower <= 0.198655 )
									ret := -0.923077 // sell
								if( bullPower > 0.198655 )
									ret := 0.000000
						if( bearPower > 0.027487 )
							ret := 1.000000 // buy
				if( bullPower > 0.205048 )
					if( VIM <= 1.93938 )
						if( bbp <= 0.089759 )
							ret := 0.200000
						if( bbp > 0.089759 )
							if( bearPower <= 0.002644 )
								if( VIP_VIM <= 0.322294 )
									ret := 0.000000
								if( VIP_VIM > 0.322294 )
									ret := -0.907407 // sell
							if( bearPower > 0.002644 )
								if( VIP_VIM <= 0.638874 )
									ret := -0.500000
								if( VIP_VIM > 0.638874 )
									ret := 0.714286 // buy
					if( VIM > 1.93938 )
						if( VIM <= 2.2753 )
							ret := 1.000000 // buy
						if( VIM > 2.2753 )
							ret := -0.666667
	if( bearPower > 0.027532 )
		if( VIP_VIM <= -0.105538 )
			if( bearPower <= 0.037574 )
				if( VIP <= 0.920837 )
					if( VIP_VIM <= -0.215825 )
						if( VIP_VIM <= -0.257268 )
							ret := 0.750000 // buy
						if( VIP_VIM > -0.257268 )
							ret := 0.200000
					if( VIP_VIM > -0.215825 )
						ret := 1.000000 // buy
				if( VIP > 0.920837 )
					if( VIP_VIM <= -0.441734 )
						if( VIP <= 4.31159 )
							if( VIM <= 4.62825 )
								if( VIP <= 2.53793 )
									ret := 0.228070
								if( VIP > 2.53793 )
									ret := -0.357143
							if( VIM > 4.62825 )
								if( VIM <= 5.30687 )
									ret := 0.500000
								if( VIM > 5.30687 )
									ret := 1.000000 // buy
						if( VIP > 4.31159 )
							if( bullPower <= 0.051798 )
								if( VIM <= 5.67533 )
									ret := -0.555556
								if( VIM > 5.67533 )
									ret := -0.016949
							if( bullPower > 0.051798 )
								ret := -1.000000 // sell
					if( VIP_VIM > -0.441734 )
						if( bearPower <= 0.027847 )
							ret := 0.750000 // buy
						if( bearPower > 0.027847 )
							if( bbp <= 0.160585 )
								if( VIP <= 1.26493 )
									ret := -0.527273
								if( VIP > 1.26493 )
									ret := -0.197802
							if( bbp > 0.160585 )
								if( VIP_VIM <= -0.138459 )
									ret := 0.545455
								if( VIP_VIM > -0.138459 )
									ret := -0.428571
			if( bearPower > 0.037574 )
				if( bearPower <= 0.092235 )
					if( VIP_VIM <= -1.80149 )
						if( VIP <= 6.04222 )
							if( VIP <= 3.31223 )
								ret := -0.250000
							if( VIP > 3.31223 )
								if( VIP_VIM <= -1.92519 )
									ret := 0.611111
								if( VIP_VIM > -1.92519 )
									ret := 1.000000 // buy
						if( VIP > 6.04222 )
							if( bearPower <= 0.062049 )
								if( bbp <= 0.081719 )
									ret := -0.500000
								if( bbp > 0.081719 )
									ret := 0.083333
							if( bearPower > 0.062049 )
								if( bbp <= 0.143266 )
									ret := -1.000000 // sell
								if( bbp > 0.143266 )
									ret := -0.200000
					if( VIP_VIM > -1.80149 )
						if( bbp <= 0.242479 )
							if( VIP <= 0.885557 )
								ret := -1.000000 // sell
							if( VIP > 0.885557 )
								if( VIM <= 3.72639 )
									ret := -0.264851
								if( VIM > 3.72639 )
									ret := -0.450920
						if( bbp > 0.242479 )
							if( VIP <= 0.953155 )
								if( bullPower <= 0.213135 )
									ret := 0.846154 // buy
								if( bullPower > 0.213135 )
									ret := 0.090909
							if( VIP > 0.953155 )
								if( bearPower <= 0.06606 )
									ret := -1.000000 // sell
								if( bearPower > 0.06606 )
									ret := 0.250000
				if( bearPower > 0.092235 )
					if( VIM <= 2.89522 )
						if( VIP_VIM <= -0.172159 )
							if( VIP <= 2.0137 )
								if( VIM <= 1.35525 )
									ret := -0.250000
								if( VIM > 1.35525 )
									ret := -0.932203 // sell
							if( VIP > 2.0137 )
								if( VIM <= 2.58251 )
									ret := 0.000000
								if( VIM > 2.58251 )
									ret := -0.769231 // sell
						if( VIP_VIM > -0.172159 )
							if( bullPower <= 0.152208 )
								ret := -0.571429
							if( bullPower > 0.152208 )
								if( bullPower <= 0.233292 )
									ret := 0.000000
								if( bullPower > 0.233292 )
									ret := -0.250000
					if( VIM > 2.89522 )
						if( bbm <= 0.045 )
							if( bbm <= 0.005657 )
								if( VIM <= 3.28511 )
									ret := 0.000000
								if( VIM > 3.28511 )
									ret := -0.635135
							if( bbm > 0.005657 )
								if( bbm <= 0.008977 )
									ret := 0.200000
								if( bbm > 0.008977 )
									ret := -0.344828
						if( bbm > 0.045 )
							if( VIM <= 6.20815 )
								ret := 0.500000
							if( VIM > 6.20815 )
								ret := 1.000000 // buy
		if( VIP_VIM > -0.105538 )
			if( VIM <= 1.07668 )
				if( bbp <= 1.23122 )
					if( VIP_VIM <= 0.49618 )
						if( VIP <= 1.17754 )
							if( bearPower <= 0.043786 )
								if( bullPower <= 0.289954 )
									ret := -0.041304
								if( bullPower > 0.289954 )
									ret := -0.692308
							if( bearPower > 0.043786 )
								if( bbm <= 0.517444 )
									ret := 0.090591
								if( bbm > 0.517444 )
									ret := -0.888889 // sell
						if( VIP > 1.17754 )
							if( VIP <= 1.33568 )
								if( bullPower <= 0.463044 )
									ret := 0.146355
								if( bullPower > 0.463044 )
									ret := 0.522936
							if( VIP > 1.33568 )
								if( bbm <= 0.092594 )
									ret := -0.078431
								if( bbm > 0.092594 )
									ret := -0.722222 // sell
					if( VIP_VIM > 0.49618 )
						if( bbm <= 0.241687 )
							if( bbm <= 0.206316 )
								if( VIP_VIM <= 0.568563 )
									ret := -0.082535
								if( VIP_VIM > 0.568563 )
									ret := 0.022031
							if( bbm > 0.206316 )
								if( VIP_VIM <= 0.782134 )
									ret := -0.114583
								if( VIP_VIM > 0.782134 )
									ret := -0.645833
						if( bbm > 0.241687 )
							if( VIM <= 0.675969 )
								if( VIP <= 1.39827 )
									ret := 0.637500
								if( VIP > 1.39827 )
									ret := 0.000000
							if( VIM > 0.675969 )
								if( VIM <= 0.723018 )
									ret := -0.280000
								if( VIM > 0.723018 )
									ret := 0.440299
				if( bbp > 1.23122 )
					if( VIM <= 0.672413 )
						if( VIP <= 1.37171 )
							if( bearPower <= 0.504724 )
								if( VIP <= 1.28259 )
									ret := 1.000000 // buy
								if( VIP > 1.28259 )
									ret := -0.562500
							if( bearPower > 0.504724 )
								if( bbm <= 0.43905 )
									ret := 1.000000 // buy
								if( bbm > 0.43905 )
									ret := 0.153846
						if( VIP > 1.37171 )
							if( bearPower <= 0.527232 )
								if( VIP_VIM <= 0.886934 )
									ret := -0.777778 // sell
								if( VIP_VIM > 0.886934 )
									ret := -1.000000 // sell
							if( bearPower > 0.527232 )
								if( bullPower <= 0.758484 )
									ret := 0.750000 // buy
								if( bullPower > 0.758484 )
									ret := -0.576923
					if( VIM > 0.672413 )
						if( bbp <= 1.36758 )
							if( bullPower <= 0.744168 )
								ret := -1.000000 // sell
							if( bullPower > 0.744168 )
								if( bbp <= 1.28612 )
									ret := -0.750000 // sell
								if( bbp > 1.28612 )
									ret := 0.000000
						if( bbp > 1.36758 )
							ret := -1.000000 // sell
			if( VIM > 1.07668 )
				if( bullPower <= 0.096844 )
					if( VIP <= 6.61076 )
						if( VIP <= 5.07263 )
							if( VIP_VIM <= 1.63904 )
								if( VIP <= 4.41734 )
									ret := -0.173275
								if( VIP > 4.41734 )
									ret := 0.125000
							if( VIP_VIM > 1.63904 )
								if( VIP <= 4.11904 )
									ret := 1.000000 // buy
								if( VIP > 4.11904 )
									ret := 0.625000
						if( VIP > 5.07263 )
							if( bullPower <= 0.06646 )
								if( VIP_VIM <= 0.820758 )
									ret := 0.061728
								if( VIP_VIM > 0.820758 )
									ret := -0.562500
							if( bullPower > 0.06646 )
								if( VIP_VIM <= 0.229978 )
									ret := 0.250000
								if( VIP_VIM > 0.229978 )
									ret := -0.734940 // sell
					if( VIP > 6.61076 )
						if( VIM <= 14.6483 )
							if( VIM <= 12.99 )
								if( VIM <= 10.3491 )
									ret := 0.106122
								if( VIM > 10.3491 )
									ret := -0.337500
							if( VIM > 12.99 )
								if( VIP <= 14.8089 )
									ret := 0.690476
								if( VIP > 14.8089 )
									ret := 0.153846
						if( VIM > 14.6483 )
							if( VIM <= 14.8344 )
								ret := -1.000000 // sell
							if( VIM > 14.8344 )
								if( bullPower <= 0.085909 )
									ret := -0.221557
								if( bullPower > 0.085909 )
									ret := -0.555556
				if( bullPower > 0.096844 )
					if( VIP <= 11.4383 )
						if( VIP <= 7.41871 )
							if( VIP_VIM <= 1.69762 )
								if( bearPower <= 0.209016 )
									ret := -0.232765
								if( bearPower > 0.209016 )
									ret := -0.617021
							if( VIP_VIM > 1.69762 )
								if( VIM <= 2.10809 )
									ret := 0.606061
								if( VIM > 2.10809 )
									ret := -0.230769
						if( VIP > 7.41871 )
							if( VIP <= 8.79521 )
								if( VIP <= 8.55577 )
									ret := 0.047619
								if( VIP > 8.55577 )
									ret := 0.666667
							if( VIP > 8.79521 )
								if( VIM <= 9.45611 )
									ret := -0.650000
								if( VIM > 9.45611 )
									ret := 0.216216
					if( VIP > 11.4383 )
						if( VIP <= 12.15 )
							if( bearPower <= 0.125798 )
								ret := -0.750000 // sell
							if( bearPower > 0.125798 )
								if( VIM <= 11.5081 )
									ret := -1.000000 // sell
								if( VIM > 11.5081 )
									ret := -0.750000 // sell
						if( VIP > 12.15 )
							if( VIP_VIM <= 0.000669 )
								if( VIM <= 36.5969 )
									ret := 0.117647
								if( VIM > 36.5969 )
									ret := -0.545455
							if( VIP_VIM > 0.000669 )
								if( bullPower <= 0.116559 )
									ret := -0.434783
								if( bullPower > 0.116559 )
									ret := -0.716667 // sell
	
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


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_UPST_1Min_3779656d(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP, VIP_VIM, VIM)

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


