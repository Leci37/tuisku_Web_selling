//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: QCOM_15Min_2BV0_8eb348a4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_15Min_2BV0_8eb348a4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_15Min_8eb348a4(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( BBPower_Color <= 0.5 )
		if( VIP_VIM <= -0.620919 )
			if( VIP <= 2.09954 )
				if( VIP_VIM <= -1.12701 )
					if( VIM <= 2.16802 )
						if( VIP_VIM <= -1.37538 )
							if( bbp <= -1.49814 )
								ret := 0.416667
							if( bbp > -1.49814 )
								if( bbm <= 0.110067 )
									ret := 1.000000 // buy
								if( bbm > 0.110067 )
									ret := 0.900000 // buy
						if( VIP_VIM > -1.37538 )
							if( bbp <= -2.46499 )
								if( bbm <= 0.465 )
									ret := 0.454545
								if( bbm > 0.465 )
									ret := -0.189189
							if( bbp > -2.46499 )
								if( VIM <= 1.77265 )
									ret := 0.142857
								if( VIM > 1.77265 )
									ret := 0.718750 // buy
					if( VIM > 2.16802 )
						if( bearPower <= -0.722066 )
							if( VIM <= 2.22353 )
								ret := -0.285714
							if( VIM > 2.22353 )
								if( bearPower <= -1.22433 )
									ret := 0.689655
								if( bearPower > -1.22433 )
									ret := 0.256410
						if( bearPower > -0.722066 )
							if( VIP_VIM <= -1.35108 )
								if( bbm <= 0.125 )
									ret := -0.461538
								if( bbm > 0.125 )
									ret := -0.903226 // sell
							if( VIP_VIM > -1.35108 )
								if( bbm <= 0.052185 )
									ret := -0.250000
								if( bbm > 0.052185 )
									ret := 0.323529
				if( VIP_VIM > -1.12701 )
					if( bearPower <= -2.62162 )
						if( VIP <= 0.527324 )
							if( bearPower <= -5.29182 )
								if( VIP <= 0.498901 )
									ret := 1.000000 // buy
								if( VIP > 0.498901 )
									ret := 0.714286 // buy
							if( bearPower > -5.29182 )
								if( bbp <= -5.58397 )
									ret := -0.470588
								if( bbp > -5.58397 )
									ret := 0.558824
						if( VIP > 0.527324 )
							if( bullPower <= -2.67459 )
								if( bullPower <= -3.5101 )
									ret := -0.378378
								if( bullPower > -3.5101 )
									ret := 0.493151
							if( bullPower > -2.67459 )
								if( bullPower <= -1.69264 )
									ret := -0.408046
								if( bullPower > -1.69264 )
									ret := 0.094828
					if( bearPower > -2.62162 )
						if( bearPower <= -1.14406 )
							if( bullPower <= -1.02301 )
								if( VIP_VIM <= -1.00802 )
									ret := 0.808219 // buy
								if( VIP_VIM > -1.00802 )
									ret := 0.328375
							if( bullPower > -1.02301 )
								if( bbp <= -2.52734 )
									ret := -0.388889
								if( bbp > -2.52734 )
									ret := 0.210041
						if( bearPower > -1.14406 )
							if( VIP <= 0.564941 )
								if( VIP_VIM <= -0.939058 )
									ret := 0.350000
								if( VIP_VIM > -0.939058 )
									ret := 0.706897 // buy
							if( VIP > 0.564941 )
								if( bullPower <= -0.675733 )
									ret := -0.238636
								if( bullPower > -0.675733 )
									ret := 0.051296
			if( VIP > 2.09954 )
				if( bbp <= -0.116791 )
					if( VIM <= 7.48048 )
						if( bearPower <= -0.125032 )
							if( VIM <= 6.77881 )
								if( bullPower <= -0.091205 )
									ret := 0.434650
								if( bullPower > -0.091205 )
									ret := 0.768116 // buy
							if( VIM > 6.77881 )
								ret := 1.000000 // buy
						if( bearPower > -0.125032 )
							if( bullPower <= -0.085969 )
								if( VIP_VIM <= -0.926068 )
									ret := 0.000000
								if( VIP_VIM > -0.926068 )
									ret := -0.666667
							if( bullPower > -0.085969 )
								ret := 0.526316
					if( VIM > 7.48048 )
						if( VIP_VIM <= -0.972539 )
							if( VIM <= 9.39721 )
								ret := -0.250000
							if( VIM > 9.39721 )
								ret := 0.333333
						if( VIP_VIM > -0.972539 )
							ret := -0.846154 // sell
				if( bbp > -0.116791 )
					if( bearPower <= -0.03847 )
						if( VIM <= 4.53012 )
							if( VIM <= 4.326 )
								ret := -1.000000 // sell
							if( VIM > 4.326 )
								ret := -0.916667 // sell
						if( VIM > 4.53012 )
							ret := 0.000000
					if( bearPower > -0.03847 )
						if( VIM <= 8.43727 )
							ret := 0.333333
						if( VIM > 8.43727 )
							ret := -0.090909
		if( VIP_VIM > -0.620919 )
			if( VIP_VIM <= 0.286495 )
				if( bearPower <= -4.47964 )
					if( VIP_VIM <= -0.17463 )
						if( bullPower <= -0.443416 )
							if( VIM <= 1.2831 )
								if( VIM <= 1.18085 )
									ret := -0.714286 // sell
								if( VIM > 1.18085 )
									ret := -1.000000 // sell
							if( VIM > 1.2831 )
								ret := -0.500000
						if( bullPower > -0.443416 )
							if( bullPower <= 0.274995 )
								ret := 1.000000 // buy
							if( bullPower > 0.274995 )
								ret := -0.733333 // sell
					if( VIP_VIM > -0.17463 )
						ret := -0.904762 // sell
				if( bearPower > -4.47964 )
					if( bullPower <= 0.533394 )
						if( VIM <= 1.29863 )
							if( bbm <= 0.038348 )
								if( bbp <= -0.338863 )
									ret := 0.248991
								if( bbp > -0.338863 )
									ret := 0.039814
							if( bbm > 0.038348 )
								if( bbm <= 1.13874 )
									ret := -0.008172
								if( bbm > 1.13874 )
									ret := -0.102665
						if( VIM > 1.29863 )
							if( bullPower <= -1.8411 )
								if( VIP_VIM <= -0.593338 )
									ret := 0.000000
								if( VIP_VIM > -0.593338 )
									ret := 0.794118 // buy
							if( bullPower > -1.8411 )
								if( bbm <= 0.019498 )
									ret := 0.189217
								if( bbm > 0.019498 )
									ret := 0.012346
					if( bullPower > 0.533394 )
						if( bullPower <= 2.28876 )
							if( bearPower <= -0.602301 )
								if( VIP_VIM <= 0.106767 )
									ret := 0.202290
								if( VIP_VIM > 0.106767 )
									ret := 0.626168
							if( bearPower > -0.602301 )
								ret := -0.576923
						if( bullPower > 2.28876 )
							if( bullPower <= 2.59547 )
								ret := -0.846154 // sell
							if( bullPower > 2.59547 )
								ret := -1.000000 // sell
			if( VIP_VIM > 0.286495 )
				if( VIP <= 2.31509 )
					if( VIP <= 1.67668 )
						if( bearPower <= -0.057261 )
							if( bbp <= -1.34899 )
								if( VIP <= 1.47562 )
									ret := 1.000000 // buy
								if( VIP > 1.47562 )
									ret := 0.446809
							if( bbp > -1.34899 )
								if( bbm <= 1.39629 )
									ret := 0.009780
								if( bbm > 1.39629 )
									ret := 0.750000 // buy
						if( bearPower > -0.057261 )
							if( bbm <= 0.003493 )
								if( VIP_VIM <= 0.620427 )
									ret := 0.649007
								if( VIP_VIM > 0.620427 )
									ret := -0.250000
							if( bbm > 0.003493 )
								if( bbm <= 0.064479 )
									ret := -0.342105
								if( bbm > 0.064479 )
									ret := 0.000000
					if( VIP > 1.67668 )
						if( VIP_VIM <= 0.487568 )
							if( bearPower <= -0.052848 )
								if( bullPower <= -0.051443 )
									ret := 0.637681
								if( bullPower > -0.051443 )
									ret := 0.206349
							if( bearPower > -0.052848 )
								if( bearPower <= -0.030796 )
									ret := -0.434783
								if( bearPower > -0.030796 )
									ret := 0.588235
						if( VIP_VIM > 0.487568 )
							if( bearPower <= -0.104558 )
								if( bullPower <= -0.188817 )
									ret := 0.165289
								if( bullPower > -0.188817 )
									ret := -0.263158
							if( bearPower > -0.104558 )
								if( bullPower <= -0.022772 )
									ret := 0.724138 // buy
								if( bullPower > -0.022772 )
									ret := 0.000000
				if( VIP > 2.31509 )
					if( bullPower <= -0.544384 )
						if( VIM <= 3.48909 )
							if( bullPower <= -1.23574 )
								if( bbm <= 0.055 )
									ret := 0.600000
								if( bbm > 0.055 )
									ret := -0.142857
							if( bullPower > -1.23574 )
								if( bbm <= 0.098406 )
									ret := -0.796296 // sell
								if( bbm > 0.098406 )
									ret := -0.600000
						if( VIM > 3.48909 )
							ret := 0.666667
					if( bullPower > -0.544384 )
						if( bbp <= -0.036564 )
							if( VIP <= 3.64518 )
								if( bbm <= 0.008054 )
									ret := 0.142857
								if( bbm > 0.008054 )
									ret := -0.174825
							if( VIP > 3.64518 )
								if( bearPower <= -0.258187 )
									ret := 0.157143
								if( bearPower > -0.258187 )
									ret := 0.539130
						if( bbp > -0.036564 )
							if( bbp <= 0.039374 )
								if( VIP_VIM <= 0.617817 )
									ret := -0.428571
								if( VIP_VIM > 0.617817 )
									ret := -0.761905 // sell
							if( bbp > 0.039374 )
								ret := 0.333333
	if( BBPower_Color > 0.5 )
		if( bullPower <= 0.540171 )
			if( VIP <= 11.7821 )
				if( bbm <= 0.098331 )
					if( bearPower <= 0.375864 )
						if( VIM <= 1.03624 )
							if( bearPower <= 0.119517 )
								if( bbm <= 0.067955 )
									ret := -0.080040
								if( bbm > 0.067955 )
									ret := 0.004525
							if( bearPower > 0.119517 )
								if( bullPower <= 0.385625 )
									ret := 0.099815
								if( bullPower > 0.385625 )
									ret := -0.345455
						if( VIM > 1.03624 )
							if( bullPower <= 0.136939 )
								if( bbp <= 0.039694 )
									ret := 0.054762
								if( bbp > 0.039694 )
									ret := -0.050824
							if( bullPower > 0.136939 )
								if( bbm <= 0.010017 )
									ret := -0.202606
								if( bbm > 0.010017 )
									ret := -0.062624
					if( bearPower > 0.375864 )
						if( bbp <= 0.961277 )
							if( bullPower <= 0.425698 )
								if( bbm <= 0.021477 )
									ret := -0.128767
								if( bbm > 0.021477 )
									ret := -0.478261
							if( bullPower > 0.425698 )
								if( VIM <= 0.869862 )
									ret := 0.070588
								if( VIM > 0.869862 )
									ret := -0.451730
						if( bbp > 0.961277 )
							if( bearPower <= 0.467037 )
								if( VIP_VIM <= 0.345532 )
									ret := 0.555556
								if( VIP_VIM > 0.345532 )
									ret := 0.100000
							if( bearPower > 0.467037 )
								if( bbp <= 1.02326 )
									ret := -0.169014
								if( bbp > 1.02326 )
									ret := 0.138462
				if( bbm > 0.098331 )
					if( bearPower <= -0.205412 )
						if( bullPower <= 0.491342 )
							if( bearPower <= -0.255701 )
								if( VIP_VIM <= 0.419074 )
									ret := 0.309266
								if( VIP_VIM > 0.419074 )
									ret := -0.760000 // sell
							if( bearPower > -0.255701 )
								if( VIP <= 1.51494 )
									ret := 0.229412
								if( VIP > 1.51494 )
									ret := -0.121622
						if( bullPower > 0.491342 )
							if( bearPower <= -0.484156 )
								ret := 0.407407
							if( bearPower > -0.484156 )
								if( bullPower <= 0.529241 )
									ret := -0.258621
								if( bullPower > 0.529241 )
									ret := -0.683544
					if( bearPower > -0.205412 )
						if( VIP_VIM <= -0.33154 )
							if( VIM <= 1.69757 )
								if( bearPower <= 0.086614 )
									ret := -0.434307
								if( bearPower > 0.086614 )
									ret := 0.392857
							if( VIM > 1.69757 )
								if( bbm <= 0.539204 )
									ret := -0.099656
								if( bbm > 0.539204 )
									ret := 0.666667
						if( VIP_VIM > -0.33154 )
							if( VIM <= 0.900551 )
								if( VIP <= 1.08904 )
									ret := 0.257692
								if( VIP > 1.08904 )
									ret := 0.055184
							if( VIM > 0.900551 )
								if( VIM <= 1.04235 )
									ret := -0.045705
								if( VIM > 1.04235 )
									ret := 0.022546
			if( VIP > 11.7821 )
				if( bearPower <= 0.057521 )
					ret := 0.777778 // buy
				if( bearPower > 0.057521 )
					ret := 1.000000 // buy
		if( bullPower > 0.540171 )
			if( VIP <= 1.40785 )
				if( VIP <= 0.997012 )
					if( bullPower <= 2.35446 )
						if( bbp <= 0.023372 )
							if( bearPower <= -0.645964 )
								ret := -0.700000 // sell
							if( bearPower > -0.645964 )
								ret := -1.000000 // sell
						if( bbp > 0.023372 )
							if( bbm <= 3.01326 )
								if( bearPower <= -1.20233 )
									ret := -1.000000 // sell
								if( bearPower > -1.20233 )
									ret := -0.150229
							if( bbm > 3.01326 )
								if( bbm <= 3.4656 )
									ret := 0.661017
								if( bbm > 3.4656 )
									ret := -0.190476
					if( bullPower > 2.35446 )
						if( VIM <= 0.744487 )
							if( bullPower <= 3.41141 )
								ret := -0.615385
							if( bullPower > 3.41141 )
								if( bbm <= 7.98512 )
									ret := 0.916667 // buy
								if( bbm > 7.98512 )
									ret := -0.333333
						if( VIM > 0.744487 )
							if( bullPower <= 2.40002 )
								ret := -0.555556
							if( bullPower > 2.40002 )
								if( VIP_VIM <= -0.091116 )
									ret := -0.857143 // sell
								if( VIP_VIM > -0.091116 )
									ret := -1.000000 // sell
				if( VIP > 0.997012 )
					if( bullPower <= 0.604621 )
						if( VIP <= 1.33818 )
							if( VIP <= 1.1257 )
								if( bullPower <= 0.57489 )
									ret := 0.049645
								if( bullPower > 0.57489 )
									ret := -0.158228
							if( VIP > 1.1257 )
								if( bbp <= 0.45277 )
									ret := -0.633803
								if( bbp > 0.45277 )
									ret := -0.162733
						if( VIP > 1.33818 )
							if( VIM <= 0.755823 )
								if( VIM <= 0.678946 )
									ret := 0.241379
								if( VIM > 0.678946 )
									ret := -0.387097
							if( VIM > 0.755823 )
								if( VIP_VIM <= 0.578954 )
									ret := 0.171717
								if( VIP_VIM > 0.578954 )
									ret := 0.850000 // buy
					if( bullPower > 0.604621 )
						if( VIP_VIM <= 0.048193 )
							if( VIP_VIM <= -0.214027 )
								if( bearPower <= -0.02104 )
									ret := 0.723404 // buy
								if( bearPower > -0.02104 )
									ret := -0.061538
							if( VIP_VIM > -0.214027 )
								if( bbm <= 0.016623 )
									ret := -0.891304 // sell
								if( bbm > 0.016623 )
									ret := -0.159052
						if( VIP_VIM > 0.048193 )
							if( VIM <= 0.961904 )
								if( VIP <= 1.13399 )
									ret := 0.108231
								if( VIP > 1.13399 )
									ret := -0.023362
							if( VIM > 0.961904 )
								if( bbp <= 1.96134 )
									ret := -0.060961
								if( bbp > 1.96134 )
									ret := -0.440252
			if( VIP > 1.40785 )
				if( bearPower <= 0.857346 )
					if( VIM <= 0.655606 )
						if( bbm <= 0.318794 )
							if( VIM <= 0.507295 )
								if( bbp <= 1.48086 )
									ret := -0.230769
								if( bbp > 1.48086 )
									ret := 0.615385
							if( VIM > 0.507295 )
								if( VIP <= 1.51106 )
									ret := -0.310345
								if( VIP > 1.51106 )
									ret := 0.342857
						if( bbm > 0.318794 )
							if( bbm <= 0.645 )
								if( VIP <= 1.46206 )
									ret := 0.605505
								if( VIP > 1.46206 )
									ret := 0.250000
							if( bbm > 0.645 )
								if( bbp <= 1.24321 )
									ret := 0.230769
								if( bbp > 1.24321 )
									ret := -0.071429
					if( VIM > 0.655606 )
						if( VIP_VIM <= 0.937622 )
							if( VIM <= 1.30286 )
								if( VIM <= 1.10415 )
									ret := -0.122435
								if( VIM > 1.10415 )
									ret := -0.301232
							if( VIM > 1.30286 )
								if( bearPower <= -0.087407 )
									ret := -0.217593
								if( bearPower > -0.087407 )
									ret := -0.023541
						if( VIP_VIM > 0.937622 )
							if( VIP <= 2.69675 )
								if( VIP <= 2.26091 )
									ret := 0.161074
								if( VIP > 2.26091 )
									ret := 0.583333
							if( VIP > 2.69675 )
								if( VIP <= 4.91318 )
									ret := -0.416667
								if( VIP > 4.91318 )
									ret := 0.263158
				if( bearPower > 0.857346 )
					if( bbp <= 4.86791 )
						if( VIP_VIM <= 0.366869 )
							if( VIM <= 1.84094 )
								if( bullPower <= 1.56245 )
									ret := -0.328244
								if( bullPower > 1.56245 )
									ret := -0.733333 // sell
							if( VIM > 1.84094 )
								if( VIM <= 3.53945 )
									ret := 0.107317
								if( VIM > 3.53945 )
									ret := -0.744186 // sell
						if( VIP_VIM > 0.366869 )
							if( VIP_VIM <= 0.664295 )
								if( bearPower <= 1.02729 )
									ret := -0.684211
								if( bearPower > 1.02729 )
									ret := -0.312500
							if( VIP_VIM > 0.664295 )
								if( bbp <= 2.39382 )
									ret := -0.060870
								if( bbp > 2.39382 )
									ret := -0.370432
					if( bbp > 4.86791 )
						if( bearPower <= 2.38335 )
							if( VIP <= 1.50486 )
								if( bearPower <= 2.19083 )
									ret := 0.785714 // buy
								if( bearPower > 2.19083 )
									ret := 0.000000
							if( VIP > 1.50486 )
								if( bullPower <= 2.93817 )
									ret := -0.166667
								if( bullPower > 2.93817 )
									ret := 0.476190
						if( bearPower > 2.38335 )
							if( VIP_VIM <= 1.25407 )
								if( VIM <= 0.579725 )
									ret := 0.025316
								if( VIM > 0.579725 )
									ret := -0.565217
							if( VIP_VIM > 1.25407 )
								ret := 0.937500 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_QCOM_15Min_8eb348a4(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP, VIP_VIM, VIM)

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


