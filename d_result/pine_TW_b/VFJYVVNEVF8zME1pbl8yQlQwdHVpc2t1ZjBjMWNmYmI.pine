//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: TRXUSDT_30Min_2BT0_f0c1cfbb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_30Min_2BT0_f0c1cfbb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_30Min_f0c1cfbb(bbm, bearPower, bbp, bullPower, BBPower_Color, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( tema <= 0.061464 )
		if( bearPower <= -0.000549 )
			if( ema13 <= -0.002428 )
				if( tema <= 0.04254 )
					if( bullPower <= -0.000937 )
						if( bbp <= -0.005504 )
							if( ema1 <= 0.037469 )
								ret := 0.500000
							if( ema1 > 0.037469 )
								if( bbp <= -0.007062 )
									ret := -1.000000 // sell
								if( bbp > -0.007062 )
									ret := -0.750000 // sell
						if( bbp > -0.005504 )
							if( bbp <= -0.00503 )
								ret := 0.571429
							if( bbp > -0.00503 )
								ret := 1.000000 // buy
					if( bullPower > -0.000937 )
						ret := -0.857143 // sell
				if( tema > 0.04254 )
					if( tema <= 0.059395 )
						if( bullPower <= -0.001521 )
							if( ema12 <= -0.002271 )
								if( bearPower <= -0.005716 )
									ret := 1.000000 // buy
								if( bearPower > -0.005716 )
									ret := 0.111111
							if( ema12 > -0.002271 )
								if( bullPower <= -0.001948 )
									ret := 1.000000 // buy
								if( bullPower > -0.001948 )
									ret := 0.829268 // buy
						if( bullPower > -0.001521 )
							if( bearPower <= -0.003576 )
								ret := -0.333333
							if( bearPower > -0.003576 )
								if( bbm <= 0.000724 )
									ret := -0.400000
								if( bbm > 0.000724 )
									ret := 0.860000 // buy
					if( tema > 0.059395 )
						if( ema12 <= -0.002719 )
							ret := 0.500000
						if( ema12 > -0.002719 )
							ret := -0.800000 // sell
			if( ema13 > -0.002428 )
				if( ema3 <= 0.031475 )
					if( bbp <= -0.001161 )
						if( bbm <= 0.001005 )
							if( ema13 <= -0.001052 )
								if( bbp <= -0.001376 )
									ret := 0.960000 // buy
								if( bbp > -0.001376 )
									ret := 0.600000
							if( ema13 > -0.001052 )
								if( ema12 <= -0.000627 )
									ret := -0.250000
								if( ema12 > -0.000627 )
									ret := 0.660494
						if( bbm > 0.001005 )
							if( ema3 <= 0.0295 )
								if( ema2 <= 0.028529 )
									ret := 0.833333 // buy
								if( ema2 > 0.028529 )
									ret := 1.000000 // buy
							if( ema3 > 0.0295 )
								if( bbp <= -0.002465 )
									ret := 0.888889 // buy
								if( bbp > -0.002465 )
									ret := -0.352941
					if( bbp > -0.001161 )
						if( ema1 <= 0.02962 )
							if( ema1 <= 0.029368 )
								if( ema1 <= 0.028874 )
									ret := 0.124498
								if( ema1 > 0.028874 )
									ret := 0.540984
							if( ema1 > 0.029368 )
								if( bbm <= 0.000375 )
									ret := 0.000000
								if( bbm > 0.000375 )
									ret := -0.920000 // sell
						if( ema1 > 0.02962 )
							if( ema13 <= 0.000294 )
								if( ema3 <= 0.030326 )
									ret := 0.844828 // buy
								if( ema3 > 0.030326 )
									ret := 0.434343
							if( ema13 > 0.000294 )
								ret := -1.000000 // sell
				if( ema3 > 0.031475 )
					if( tema <= 0.03364 )
						if( bbp <= -0.003741 )
							if( ema12 <= -0.000879 )
								if( ema1 <= 0.032151 )
									ret := 1.000000 // buy
								if( ema1 > 0.032151 )
									ret := 0.500000
							if( ema12 > -0.000879 )
								ret := -0.250000
						if( bbp > -0.003741 )
							if( ema3 <= 0.034774 )
								if( ema3 <= 0.032741 )
									ret := -0.236111
								if( ema3 > 0.032741 )
									ret := 0.205128
							if( ema3 > 0.034774 )
								if( bbm <= 0.001533 )
									ret := -0.906250 // sell
								if( bbm > 0.001533 )
									ret := 1.000000 // buy
					if( tema > 0.03364 )
						if( bbm <= 0.000587 )
							if( ema3 <= 0.060827 )
								if( ema1 <= 0.034829 )
									ret := 0.888889 // buy
								if( ema1 > 0.034829 )
									ret := 0.397516
							if( ema3 > 0.060827 )
								if( ema12 <= -0.000227 )
									ret := 0.040359
								if( ema12 > -0.000227 )
									ret := 0.781250 // buy
						if( bbm > 0.000587 )
							if( ema2 <= 0.051229 )
								if( tema <= 0.048905 )
									ret := 0.175610
								if( tema > 0.048905 )
									ret := 0.823899 // buy
							if( ema2 > 0.051229 )
								if( bullPower <= 0.000277 )
									ret := 0.059231
								if( bullPower > 0.000277 )
									ret := 0.389474
		if( bearPower > -0.000549 )
			if( bullPower <= 0.001017 )
				if( bbm <= 0.00013 )
					if( tema <= 0.025486 )
						if( tema <= 0.024042 )
							if( ema12 <= -3.9e-05 )
								if( ema2 <= 0.023988 )
									ret := 0.666667
								if( ema2 > 0.023988 )
									ret := 0.000000
							if( ema12 > -3.9e-05 )
								if( bullPower <= 2.9e-05 )
									ret := 0.800000 // buy
								if( bullPower > 2.9e-05 )
									ret := 1.000000 // buy
						if( tema > 0.024042 )
							if( tema <= 0.024771 )
								if( ema2 <= 0.024322 )
									ret := 0.121951
								if( ema2 > 0.024322 )
									ret := -0.538462
							if( tema > 0.024771 )
								if( tema <= 0.025476 )
									ret := 0.218232
								if( tema > 0.025476 )
									ret := 1.000000 // buy
					if( tema > 0.025486 )
						if( bbp <= 9.6e-05 )
							if( bbp <= -0.000719 )
								if( bbm <= 0.000116 )
									ret := 1.000000 // buy
								if( bbm > 0.000116 )
									ret := 0.400000
							if( bbp > -0.000719 )
								if( ema1 <= 0.026406 )
									ret := 0.125000
								if( ema1 > 0.026406 )
									ret := -0.023521
						if( bbp > 9.6e-05 )
							if( tema <= 0.031838 )
								if( ema2 <= 0.030128 )
									ret := -0.204651
								if( ema2 > 0.030128 )
									ret := -0.593220
							if( tema > 0.031838 )
								if( tema <= 0.053349 )
									ret := 0.360656
								if( tema > 0.053349 )
									ret := -0.042017
				if( bbm > 0.00013 )
					if( ema1 <= 0.024996 )
						if( ema13 <= 0.000167 )
							if( bullPower <= -0.000197 )
								if( ema13 <= -0.000501 )
									ret := 0.500000
								if( ema13 > -0.000501 )
									ret := -0.857143 // sell
							if( bullPower > -0.000197 )
								if( ema3 <= 0.024691 )
									ret := 0.328358
								if( ema3 > 0.024691 )
									ret := 0.722628 // buy
						if( ema13 > 0.000167 )
							if( ema2 <= 0.024221 )
								if( ema3 <= 0.023804 )
									ret := -0.777778 // sell
								if( ema3 > 0.023804 )
									ret := -1.000000 // sell
							if( ema2 > 0.024221 )
								ret := 0.250000
					if( ema1 > 0.024996 )
						if( ema13 <= 0.00103 )
							if( ema13 <= 0.000454 )
								if( ema1 <= 0.060894 )
									ret := 0.118096
								if( ema1 > 0.060894 )
									ret := 0.280057
							if( ema13 > 0.000454 )
								if( ema3 <= 0.035705 )
									ret := -0.134058
								if( ema3 > 0.035705 )
									ret := 0.072534
						if( ema13 > 0.00103 )
							if( ema2 <= 0.058217 )
								if( bearPower <= 0.000459 )
									ret := 0.697248
								if( bearPower > 0.000459 )
									ret := -0.333333
							if( ema2 > 0.058217 )
								if( ema3 <= 0.059342 )
									ret := -0.250000
								if( ema3 > 0.059342 )
									ret := -0.666667
			if( bullPower > 0.001017 )
				if( bbm <= 0.000908 )
					if( ema1 <= 0.050952 )
						if( tema <= 0.03018 )
							if( ema12 <= 0.0004 )
								if( bullPower <= 0.001063 )
									ret := 0.000000
								if( bullPower > 0.001063 )
									ret := 1.000000 // buy
							if( ema12 > 0.0004 )
								ret := -0.571429
						if( tema > 0.03018 )
							if( ema13 <= 0.001002 )
								if( bearPower <= 0.000463 )
									ret := -0.507463
								if( bearPower > 0.000463 )
									ret := -0.858491 // sell
							if( ema13 > 0.001002 )
								if( ema3 <= 0.031976 )
									ret := 0.300000
								if( ema3 > 0.031976 )
									ret := -0.650000
					if( ema1 > 0.050952 )
						if( ema3 <= 0.050917 )
							if( bearPower <= 0.000587 )
								ret := 1.000000 // buy
							if( bearPower > 0.000587 )
								ret := 0.000000
						if( ema3 > 0.050917 )
							if( bearPower <= 0.000581 )
								if( ema1 <= 0.059739 )
									ret := -0.321429
								if( ema1 > 0.059739 )
									ret := -0.789474 // sell
							if( bearPower > 0.000581 )
								if( ema1 <= 0.057931 )
									ret := -0.281250
								if( ema1 > 0.057931 )
									ret := 0.357143
				if( bbm > 0.000908 )
					if( ema12 <= 0.001832 )
						if( ema2 <= 0.030817 )
							if( bullPower <= 0.001836 )
								if( ema12 <= 0.000436 )
									ret := -0.692308
								if( ema12 > 0.000436 )
									ret := 0.333333
							if( bullPower > 0.001836 )
								if( ema13 <= 0.000528 )
									ret := -0.833333 // sell
								if( ema13 > 0.000528 )
									ret := -1.000000 // sell
						if( ema2 > 0.030817 )
							if( ema1 <= 0.055363 )
								if( ema2 <= 0.031528 )
									ret := 0.833333 // buy
								if( ema2 > 0.031528 )
									ret := -0.072464
							if( ema1 > 0.055363 )
								if( tema <= 0.056449 )
									ret := 0.923077 // buy
								if( tema > 0.056449 )
									ret := 0.145349
					if( ema12 > 0.001832 )
						ret := -1.000000 // sell
	if( tema > 0.061464 )
		if( bullPower <= 0.005734 )
			if( bbp <= -0.003123 )
				if( ema3 <= 0.155163 )
					if( ema1 <= 0.146259 )
						if( ema2 <= 0.130827 )
							if( ema3 <= 0.128552 )
								if( tema <= 0.122688 )
									ret := 0.172556
								if( tema > 0.122688 )
									ret := -0.666667
							if( ema3 > 0.128552 )
								if( bearPower <= -0.00651 )
									ret := 0.970588 // buy
								if( bearPower > -0.00651 )
									ret := 0.493506
						if( ema2 > 0.130827 )
							if( bbp <= -0.012669 )
								if( ema13 <= -0.005264 )
									ret := 1.000000 // buy
								if( ema13 > -0.005264 )
									ret := 0.500000
							if( bbp > -0.012669 )
								if( ema13 <= -0.005272 )
									ret := -0.755556 // sell
								if( ema13 > -0.005272 )
									ret := 0.000000
					if( ema1 > 0.146259 )
						if( tema <= 0.14711 )
							ret := 1.000000 // buy
						if( tema > 0.14711 )
							if( ema1 <= 0.15022 )
								if( ema13 <= -0.000488 )
									ret := -0.428571
								if( ema13 > -0.000488 )
									ret := 0.800000 // buy
							if( ema1 > 0.15022 )
								if( ema2 <= 0.152964 )
									ret := 1.000000 // buy
								if( ema2 > 0.152964 )
									ret := 0.400000
				if( ema3 > 0.155163 )
					if( ema1 <= 0.156696 )
						if( bbm <= 0.00204 )
							ret := 0.000000
						if( bbm > 0.00204 )
							if( bbm <= 0.005677 )
								if( bbm <= 0.003245 )
									ret := -0.909091 // sell
								if( bbm > 0.003245 )
									ret := -1.000000 // sell
							if( bbm > 0.005677 )
								ret := -0.600000
					if( ema1 > 0.156696 )
						if( bearPower <= -0.004942 )
							if( bullPower <= -0.001393 )
								if( ema1 <= 0.164205 )
									ret := -0.250000
								if( ema1 > 0.164205 )
									ret := 0.888889 // buy
							if( bullPower > -0.001393 )
								if( ema1 <= 0.15978 )
									ret := 1.000000 // buy
								if( ema1 > 0.15978 )
									ret := 0.750000 // buy
						if( bearPower > -0.004942 )
							if( bbm <= 0.003046 )
								if( ema3 <= 0.161782 )
									ret := -0.600000
								if( ema3 > 0.161782 )
									ret := 0.380952
							if( bbm > 0.003046 )
								if( ema12 <= -0.000933 )
									ret := -1.000000 // sell
								if( ema12 > -0.000933 )
									ret := -0.666667
			if( bbp > -0.003123 )
				if( ema2 <= 0.160404 )
					if( bullPower <= 0.000355 )
						if( ema3 <= 0.103249 )
							if( bearPower <= -0.000308 )
								if( tema <= 0.062022 )
									ret := -0.249231
								if( tema > 0.062022 )
									ret := 0.076246
							if( bearPower > -0.000308 )
								if( ema1 <= 0.09704 )
									ret := -0.025072
								if( ema1 > 0.09704 )
									ret := 0.199214
						if( ema3 > 0.103249 )
							if( ema3 <= 0.105128 )
								if( ema1 <= 0.104564 )
									ret := -0.136830
								if( ema1 > 0.104564 )
									ret := -0.620968
							if( ema3 > 0.105128 )
								if( ema1 <= 0.10532 )
									ret := 0.256158
								if( ema1 > 0.10532 )
									ret := -0.055186
					if( bullPower > 0.000355 )
						if( ema12 <= -0.000288 )
							if( ema2 <= 0.134481 )
								if( ema13 <= -0.000491 )
									ret := -0.233062
								if( ema13 > -0.000491 )
									ret := 0.521739
							if( ema2 > 0.134481 )
								if( bearPower <= -0.003064 )
									ret := 1.000000 // buy
								if( bearPower > -0.003064 )
									ret := -0.731481 // sell
						if( ema12 > -0.000288 )
							if( bearPower <= -0.001066 )
								if( bullPower <= 0.001139 )
									ret := 0.261364
								if( bullPower > 0.001139 )
									ret := 0.685484
							if( bearPower > -0.001066 )
								if( bearPower <= 0.000695 )
									ret := 0.068697
								if( bearPower > 0.000695 )
									ret := -0.040860
				if( ema2 > 0.160404 )
					if( bbm <= 0.000915 )
						if( tema <= 0.164747 )
							if( ema3 <= 0.160457 )
								if( ema1 <= 0.16096 )
									ret := -0.100000
								if( ema1 > 0.16096 )
									ret := -0.833333 // sell
							if( ema3 > 0.160457 )
								if( tema <= 0.164308 )
									ret := -0.099174
								if( tema > 0.164308 )
									ret := -0.833333 // sell
						if( tema > 0.164747 )
							if( tema <= 0.166654 )
								if( ema13 <= 0.000249 )
									ret := 0.000000
								if( ema13 > 0.000249 )
									ret := 0.800000 // buy
							if( tema > 0.166654 )
								ret := -0.333333
					if( bbm > 0.000915 )
						if( ema12 <= 0.001712 )
							if( ema1 <= 0.160399 )
								ret := 0.250000
							if( ema1 > 0.160399 )
								if( bbp <= -0.001157 )
									ret := -0.974359 // sell
								if( bbp > -0.001157 )
									ret := -0.721311 // sell
						if( ema12 > 0.001712 )
							if( bbp <= 0.003998 )
								ret := 1.000000 // buy
							if( bbp > 0.003998 )
								ret := -0.750000 // sell
		if( bullPower > 0.005734 )
			if( tema <= 0.136699 )
				if( tema <= 0.133713 )
					if( bbp <= 0.008625 )
						if( bearPower <= 0.001244 )
							if( bearPower <= 0.000967 )
								if( ema13 <= 0.001359 )
									ret := -0.600000
								if( ema13 > 0.001359 )
									ret := -1.000000 // sell
							if( bearPower > 0.000967 )
								ret := 0.000000
						if( bearPower > 0.001244 )
							ret := -1.000000 // sell
					if( bbp > 0.008625 )
						if( bullPower <= 0.010851 )
							if( ema1 <= 0.080379 )
								if( bbm <= 0.002643 )
									ret := 0.400000
								if( bbm > 0.002643 )
									ret := -0.933333 // sell
							if( ema1 > 0.080379 )
								if( tema <= 0.089213 )
									ret := 1.000000 // buy
								if( tema > 0.089213 )
									ret := 0.000000
						if( bullPower > 0.010851 )
							ret := -1.000000 // sell
				if( tema > 0.133713 )
					if( ema13 <= 0.008018 )
						ret := 0.333333
					if( ema13 > 0.008018 )
						ret := 1.000000 // buy
			if( tema > 0.136699 )
				if( ema12 <= 0.001534 )
					if( ema1 <= 0.155982 )
						ret := 0.750000 // buy
					if( ema1 > 0.155982 )
						ret := 1.000000 // buy
				if( ema12 > 0.001534 )
					if( ema12 <= 0.00242 )
						if( ema2 <= 0.157355 )
							if( ema1 <= 0.141324 )
								ret := -1.000000 // sell
							if( ema1 > 0.141324 )
								if( bbp <= 0.009225 )
									ret := 0.750000 // buy
								if( bbp > 0.009225 )
									ret := 1.000000 // buy
						if( ema2 > 0.157355 )
							if( ema12 <= 0.002301 )
								ret := -1.000000 // sell
							if( ema12 > 0.002301 )
								ret := -0.500000
					if( ema12 > 0.00242 )
						if( ema3 <= 0.158131 )
							if( bearPower <= 0.000809 )
								ret := -0.400000
							if( bearPower > 0.000809 )
								if( ema13 <= 0.003916 )
									ret := -0.500000
								if( ema13 > 0.003916 )
									ret := -0.978723 // sell
						if( ema3 > 0.158131 )
							if( ema3 <= 0.160534 )
								ret := 1.000000 // buy
							if( ema3 > 0.160534 )
								ret := -0.500000
	
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
float op_operation = decision_tree_0_TRXUSDT_30Min_f0c1cfbb(bbm, bearPower, bbp, bullPower, BBPower_Color, ema1, tema, ema12, ema2, ema3, ema13)

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


