//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: GME_15Min_2BT0_200763c8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_15Min_2BT0_200763c8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_15Min_200763c8(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= 0.011839 )
		if( bbm <= 0.019874 )
			if( ema3 <= 5.11238 )
				if( bbp <= -0.080845 )
					if( ema13 <= 0.043015 )
						if( ema13 <= -0.032191 )
							if( ema12 <= -0.022337 )
								if( tema <= 4.55415 )
									ret := 0.631579
								if( tema > 4.55415 )
									ret := 0.166667
							if( ema12 > -0.022337 )
								if( bbm <= 0.00618 )
									ret := 0.250000
								if( bbm > 0.00618 )
									ret := -0.857143 // sell
						if( ema13 > -0.032191 )
							if( ema12 <= -0.005851 )
								if( ema3 <= 3.97106 )
									ret := 0.333333
								if( ema3 > 3.97106 )
									ret := 0.887755 // buy
							if( ema12 > -0.005851 )
								if( bearPower <= -0.057201 )
									ret := -1.000000 // sell
								if( bearPower > -0.057201 )
									ret := 0.714286 // buy
					if( ema13 > 0.043015 )
						ret := -0.428571
				if( bbp > -0.080845 )
					if( ema13 <= -0.024781 )
						if( ema2 <= 3.83785 )
							if( tema <= 3.26771 )
								if( ema1 <= 3.21583 )
									ret := 0.250000
								if( ema1 > 3.21583 )
									ret := 1.000000 // buy
							if( tema > 3.26771 )
								if( bearPower <= -0.042989 )
									ret := 0.500000
								if( bearPower > -0.042989 )
									ret := -0.630769
						if( ema2 > 3.83785 )
							if( ema1 <= 4.11279 )
								if( bearPower <= -0.041312 )
									ret := -0.400000
								if( bearPower > -0.041312 )
									ret := 0.774648 // buy
							if( ema1 > 4.11279 )
								if( ema3 <= 4.97238 )
									ret := -0.251256
								if( ema3 > 4.97238 )
									ret := 0.800000 // buy
					if( ema13 > -0.024781 )
						if( ema13 <= 0.045356 )
							if( ema2 <= 4.88334 )
								if( ema3 <= 3.93652 )
									ret := 0.562814
								if( ema3 > 3.93652 )
									ret := 0.195312
							if( ema2 > 4.88334 )
								if( bearPower <= -0.018154 )
									ret := 0.965517 // buy
								if( bearPower > -0.018154 )
									ret := 0.685714
						if( ema13 > 0.045356 )
							if( ema13 <= 0.116593 )
								if( bearPower <= 0.006541 )
									ret := -0.791667 // sell
								if( bearPower > 0.006541 )
									ret := 0.000000
							if( ema13 > 0.116593 )
								ret := 1.000000 // buy
			if( ema3 > 5.11238 )
				if( bearPower <= -0.08935 )
					if( ema1 <= 21.1154 )
						if( ema3 <= 5.2295 )
							ret := -1.000000 // sell
						if( ema3 > 5.2295 )
							if( bbm <= 0.011249 )
								if( bullPower <= -0.119295 )
									ret := 0.518634
								if( bullPower > -0.119295 )
									ret := 0.282700
							if( bbm > 0.011249 )
								if( bearPower <= -0.1091 )
									ret := 0.794872 // buy
								if( bearPower > -0.1091 )
									ret := 1.000000 // buy
					if( ema1 > 21.1154 )
						if( bbp <= -2.04657 )
							if( tema <= 120.822 )
								if( bullPower <= -1.91004 )
									ret := 0.869565 // buy
								if( bullPower > -1.91004 )
									ret := 0.294118
							if( tema > 120.822 )
								if( ema3 <= 210.084 )
									ret := 0.182482
								if( ema3 > 210.084 )
									ret := 0.653846
						if( bbp > -2.04657 )
							if( ema12 <= -0.546569 )
								if( ema1 <= 123.084 )
									ret := -0.625000
								if( ema1 > 123.084 )
									ret := -0.040541
							if( ema12 > -0.546569 )
								if( ema2 <= 170.94 )
									ret := 0.168831
								if( ema2 > 170.94 )
									ret := -0.050505
				if( bearPower > -0.08935 )
					if( ema1 <= 5.26343 )
						if( ema3 <= 5.15042 )
							ret := 0.285714
						if( ema3 > 5.15042 )
							if( bbm <= 3.4e-05 )
								if( bearPower <= -0.059725 )
									ret := 0.200000
								if( bearPower > -0.059725 )
									ret := -0.545455
							if( bbm > 3.4e-05 )
								if( bullPower <= -0.004901 )
									ret := -0.882353 // sell
								if( bullPower > -0.004901 )
									ret := -0.250000
					if( ema1 > 5.26343 )
						if( ema1 <= 5.44165 )
							if( tema <= 5.42771 )
								if( bbm <= 0.00987 )
									ret := 0.647059
								if( bbm > 0.00987 )
									ret := 0.058824
							if( tema > 5.42771 )
								ret := 1.000000 // buy
						if( ema1 > 5.44165 )
							if( bullPower <= -0.004233 )
								if( ema3 <= 17.5128 )
									ret := 0.183636
								if( ema3 > 17.5128 )
									ret := 0.055791
							if( bullPower > -0.004233 )
								if( tema <= 5.91691 )
									ret := -0.376812
								if( tema > 5.91691 )
									ret := 0.009804
		if( bbm > 0.019874 )
			if( tema <= 4.20922 )
				if( ema2 <= 4.18935 )
					if( ema2 <= 4.11634 )
						if( ema13 <= -0.207101 )
							if( tema <= 3.67197 )
								ret := 1.000000 // buy
							if( tema > 3.67197 )
								ret := 0.500000
						if( ema13 > -0.207101 )
							if( ema3 <= 4.12824 )
								if( bullPower <= -0.062624 )
									ret := -0.159509
								if( bullPower > -0.062624 )
									ret := 0.209053
							if( ema3 > 4.12824 )
								if( bbm <= 0.07825 )
									ret := -0.791667 // sell
								if( bbm > 0.07825 )
									ret := -0.250000
					if( ema2 > 4.11634 )
						if( tema <= 4.15715 )
							if( bearPower <= -0.056012 )
								if( ema3 <= 4.13495 )
									ret := 0.416667
								if( ema3 > 4.13495 )
									ret := -0.289474
							if( bearPower > -0.056012 )
								if( tema <= 4.08624 )
									ret := -0.923077 // sell
								if( tema > 4.08624 )
									ret := -0.448980
						if( tema > 4.15715 )
							if( bbp <= -0.013044 )
								if( bearPower <= -0.044624 )
									ret := 0.826087 // buy
								if( bearPower > -0.044624 )
									ret := -0.250000
							if( bbp > -0.013044 )
								if( bearPower <= -0.009437 )
									ret := -0.435897
								if( bearPower > -0.009437 )
									ret := 0.309091
				if( ema2 > 4.18935 )
					if( ema12 <= -0.040811 )
						if( bbm <= 0.020099 )
							ret := -0.250000
						if( bbm > 0.020099 )
							if( bbm <= 0.205 )
								if( tema <= 4.1829 )
									ret := 0.913793 // buy
								if( tema > 4.1829 )
									ret := 0.535714
							if( bbm > 0.205 )
								ret := -0.250000
					if( ema12 > -0.040811 )
						if( ema1 <= 4.21031 )
							if( ema12 <= -0.013911 )
								if( ema12 <= -0.027503 )
									ret := 0.310345
								if( ema12 > -0.027503 )
									ret := 0.833333 // buy
							if( ema12 > -0.013911 )
								if( bbm <= 0.0525 )
									ret := 0.146341
								if( bbm > 0.0525 )
									ret := 0.791667 // buy
						if( ema1 > 4.21031 )
							if( bbm <= 0.085 )
								if( bearPower <= -0.077215 )
									ret := 0.666667
								if( bearPower > -0.077215 )
									ret := -0.111111
							if( bbm > 0.085 )
								if( bullPower <= 0.012656 )
									ret := -0.571429
								if( bullPower > 0.012656 )
									ret := -1.000000 // sell
			if( tema > 4.20922 )
				if( bullPower <= 1.18914 )
					if( bbp <= -75.2318 )
						if( bbm <= 0.406095 )
							ret := 0.000000
						if( bbm > 0.406095 )
							if( bullPower <= -14.375 )
								if( tema <= 282.5 )
									ret := 0.951220 // buy
								if( tema > 282.5 )
									ret := 0.333333
							if( bullPower > -14.375 )
								ret := 0.200000
					if( bbp > -75.2318 )
						if( bbp <= -1.99816 )
							if( bbp <= -13.3285 )
								if( ema2 <= 81.9703 )
									ret := -0.648148
								if( ema2 > 81.9703 )
									ret := -0.055644
							if( bbp > -13.3285 )
								if( bearPower <= -1.7686 )
									ret := 0.114346
								if( bearPower > -1.7686 )
									ret := 0.286275
						if( bbp > -1.99816 )
							if( ema2 <= 4.21556 )
								if( ema3 <= 4.15076 )
									ret := 0.272727
								if( ema3 > 4.15076 )
									ret := -0.631579
							if( ema2 > 4.21556 )
								if( ema3 <= 13.6258 )
									ret := 0.086704
								if( ema3 > 13.6258 )
									ret := 0.043238
				if( bullPower > 1.18914 )
					if( tema <= 175.677 )
						if( tema <= 42.7529 )
							if( ema3 <= 34.2106 )
								if( ema12 <= 0.107255 )
									ret := -0.736842 // sell
								if( ema12 > 0.107255 )
									ret := 0.011494
							if( ema3 > 34.2106 )
								if( bbp <= 0.202117 )
									ret := 0.300000
								if( bbp > 0.202117 )
									ret := -0.800000 // sell
						if( tema > 42.7529 )
							if( ema12 <= 2.96666 )
								if( tema <= 170.389 )
									ret := 0.070671
								if( tema > 170.389 )
									ret := 0.472973
							if( ema12 > 2.96666 )
								if( ema13 <= 8.48329 )
									ret := -0.771429 // sell
								if( ema13 > 8.48329 )
									ret := 0.294118
					if( tema > 175.677 )
						if( ema13 <= 1.95814 )
							if( ema1 <= 232.96 )
								if( bullPower <= 6.67298 )
									ret := -0.409756
								if( bullPower > 6.67298 )
									ret := 0.041667
							if( ema1 > 232.96 )
								if( tema <= 340.657 )
									ret := 0.128814
								if( tema > 340.657 )
									ret := -1.000000 // sell
						if( ema13 > 1.95814 )
							if( ema2 <= 310.723 )
								if( tema <= 205.011 )
									ret := -0.138462
								if( tema > 205.011 )
									ret := 0.312268
							if( ema2 > 310.723 )
								if( bearPower <= -35.0294 )
									ret := 0.500000
								if( bearPower > -35.0294 )
									ret := -0.909091 // sell
	if( bearPower > 0.011839 )
		if( ema13 <= 0.393243 )
			if( tema <= 3.34262 )
				if( bbm <= 0.048874 )
					if( bullPower <= 0.110956 )
						if( ema12 <= 0.000962 )
							ret := 0.166667
						if( ema12 > 0.000962 )
							if( bbp <= 0.068806 )
								if( ema3 <= 3.07542 )
									ret := 0.000000
								if( ema3 > 3.07542 )
									ret := 1.000000 // buy
							if( bbp > 0.068806 )
								ret := 1.000000 // buy
					if( bullPower > 0.110956 )
						ret := 0.000000
				if( bbm > 0.048874 )
					if( ema13 <= 0.051459 )
						ret := -0.800000 // sell
					if( ema13 > 0.051459 )
						if( tema <= 3.0659 )
							ret := 1.000000 // buy
						if( tema > 3.0659 )
							ret := -0.250000
			if( tema > 3.34262 )
				if( bearPower <= 0.061176 )
					if( ema13 <= 0.082335 )
						if( ema1 <= 4.10816 )
							if( ema1 <= 3.76931 )
								if( ema2 <= 3.49439 )
									ret := 0.287500
								if( ema2 > 3.49439 )
									ret := -0.345070
							if( ema1 > 3.76931 )
								if( ema3 <= 3.7892 )
									ret := 0.820000 // buy
								if( ema3 > 3.7892 )
									ret := 0.229249
						if( ema1 > 4.10816 )
							if( ema2 <= 10.5567 )
								if( bullPower <= 0.030966 )
									ret := 0.041298
								if( bullPower > 0.030966 )
									ret := -0.228022
							if( ema2 > 10.5567 )
								if( ema3 <= 10.7432 )
									ret := 0.533333
								if( ema3 > 10.7432 )
									ret := -0.014239
					if( ema13 > 0.082335 )
						if( tema <= 13.5806 )
							if( ema2 <= 12.9699 )
								if( bbm <= 0.393217 )
									ret := 0.125609
								if( bbm > 0.393217 )
									ret := -0.600000
							if( ema2 > 12.9699 )
								if( bullPower <= 0.099304 )
									ret := -0.187500
								if( bullPower > 0.099304 )
									ret := 0.673469
						if( tema > 13.5806 )
							if( ema12 <= 0.123972 )
								if( ema1 <= 13.5985 )
									ret := -0.571429
								if( ema1 > 13.5985 )
									ret := 0.025445
							if( ema12 > 0.123972 )
								if( bbp <= 0.308594 )
									ret := -0.457944
								if( bbp > 0.308594 )
									ret := -0.065789
				if( bearPower > 0.061176 )
					if( ema3 <= 3.82709 )
						if( bbm <= 0.119022 )
							if( bearPower <= 0.078785 )
								if( ema2 <= 3.42369 )
									ret := 0.500000
								if( ema2 > 3.42369 )
									ret := -0.657143
							if( bearPower > 0.078785 )
								if( ema13 <= 0.049504 )
									ret := -0.111111
								if( ema13 > 0.049504 )
									ret := -0.919540 // sell
						if( bbm > 0.119022 )
							if( tema <= 3.87479 )
								if( bbp <= 0.35087 )
									ret := 0.909091 // buy
								if( bbp > 0.35087 )
									ret := 0.000000
							if( tema > 3.87479 )
								if( ema13 <= 0.214567 )
									ret := -1.000000 // sell
								if( ema13 > 0.214567 )
									ret := -0.750000 // sell
					if( ema3 > 3.82709 )
						if( bbm <= 0.146306 )
							if( tema <= 20.9313 )
								if( bbp <= 0.556514 )
									ret := -0.157045
								if( bbp > 0.556514 )
									ret := -0.668874
							if( tema > 20.9313 )
								if( BBPower_Color <= 0.5 )
									ret := 0.500000
								if( BBPower_Color > 0.5 )
									ret := -0.057632
						if( bbm > 0.146306 )
							if( tema <= 178.473 )
								if( bbm <= 0.60527 )
									ret := -0.035231
								if( bbm > 0.60527 )
									ret := 0.140234
							if( tema > 178.473 )
								if( ema3 <= 191.773 )
									ret := -0.591837
								if( ema3 > 191.773 )
									ret := -0.096045
		if( ema13 > 0.393243 )
			if( ema2 <= 303.975 )
				if( tema <= 12.5058 )
					if( ema1 <= 10.4334 )
						if( bbm <= 0.429343 )
							if( ema1 <= 8.09268 )
								if( ema3 <= 6.22248 )
									ret := 0.250000
								if( ema3 > 6.22248 )
									ret := 1.000000 // buy
							if( ema1 > 8.09268 )
								if( bearPower <= 0.059899 )
									ret := 0.625000
								if( bearPower > 0.059899 )
									ret := -0.750000 // sell
						if( bbm > 0.429343 )
							ret := -1.000000 // sell
					if( ema1 > 10.4334 )
						if( ema12 <= 0.337055 )
							ret := 1.000000 // buy
						if( ema12 > 0.337055 )
							if( bbp <= 1.20945 )
								ret := 0.750000 // buy
							if( bbp > 1.20945 )
								ret := 1.000000 // buy
				if( tema > 12.5058 )
					if( ema2 <= 13.2414 )
						if( ema13 <= 0.432985 )
							if( ema12 <= 0.249292 )
								ret := -0.200000
							if( ema12 > 0.249292 )
								ret := 1.000000 // buy
						if( ema13 > 0.432985 )
							if( tema <= 13.6639 )
								if( bbm <= 0.323058 )
									ret := -0.764706 // sell
								if( bbm > 0.323058 )
									ret := 0.250000
							if( tema > 13.6639 )
								if( ema2 <= 13.2102 )
									ret := -0.969697 // sell
								if( ema2 > 13.2102 )
									ret := -0.750000 // sell
					if( ema2 > 13.2414 )
						if( ema3 <= 20.9559 )
							if( tema <= 20.6405 )
								if( bbp <= 1.58342 )
									ret := 0.195446
								if( bbp > 1.58342 )
									ret := -0.378049
							if( tema > 20.6405 )
								if( ema1 <= 23.7596 )
									ret := 0.607595
								if( ema1 > 23.7596 )
									ret := -0.571429
						if( ema3 > 20.9559 )
							if( bbm <= 0.90289 )
								if( tema <= 22.795 )
									ret := -0.489130
								if( tema > 22.795 )
									ret := -0.021576
							if( bbm > 0.90289 )
								if( ema2 <= 120.678 )
									ret := 0.212802
								if( ema2 > 120.678 )
									ret := 0.063852
			if( ema2 > 303.975 )
				if( bullPower <= 40.3466 )
					if( tema <= 327.115 )
						if( ema12 <= 3.55541 )
							if( bullPower <= 5.01456 )
								if( ema2 <= 305.462 )
									ret := -1.000000 // sell
								if( ema2 > 305.462 )
									ret := -0.500000
							if( bullPower > 5.01456 )
								ret := -1.000000 // sell
						if( ema12 > 3.55541 )
							ret := 0.750000 // buy
					if( tema > 327.115 )
						if( bbp <= 39.8016 )
							ret := -1.000000 // sell
						if( bbp > 39.8016 )
							ret := -0.750000 // sell
				if( bullPower > 40.3466 )
					if( ema1 <= 417.535 )
						if( ema3 <= 315.631 )
							if( ema12 <= 28.7114 )
								if( ema12 <= 14.2385 )
									ret := -0.500000
								if( ema12 > 14.2385 )
									ret := 0.846154 // buy
							if( ema12 > 28.7114 )
								if( bearPower <= 34.9698 )
									ret := -1.000000 // sell
								if( bearPower > 34.9698 )
									ret := -0.750000 // sell
						if( ema3 > 315.631 )
							if( bearPower <= 45.583 )
								ret := 0.500000
							if( bearPower > 45.583 )
								ret := 1.000000 // buy
					if( ema1 > 417.535 )
						ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_GME_15Min_200763c8(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


