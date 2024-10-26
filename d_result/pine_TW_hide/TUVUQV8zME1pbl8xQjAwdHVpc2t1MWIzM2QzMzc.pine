//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: META_30Min_1B00_1b33d337 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_30Min_1B00_1b33d337", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_30Min_1b33d337(bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbp <= -0.202046 )
		if( bbm <= 0.77995 )
			if( bearPower <= -1.32646 )
				if( bbm <= 0.072546 )
					if( bbp <= -3.26182 )
						if( bearPower <= -2.04229 )
							if( bullPower <= -2.28817 )
								ret := 0.333333
							if( bullPower > -2.28817 )
								ret := 0.785714 // buy
						if( bearPower > -2.04229 )
							if( bbp <= -3.60103 )
								ret := 0.250000
							if( bbp > -3.60103 )
								ret := -0.066667
					if( bbp > -3.26182 )
						if( bbm <= 0.02104 )
							if( bullPower <= -1.49293 )
								if( bearPower <= -1.60588 )
									ret := 0.764706 // buy
								if( bearPower > -1.60588 )
									ret := 0.538462
							if( bullPower > -1.49293 )
								if( bearPower <= -1.41665 )
									ret := 0.428571
								if( bearPower > -1.41665 )
									ret := 0.166667
						if( bbm > 0.02104 )
							ret := 0.833333 // buy
				if( bbm > 0.072546 )
					if( bbm <= 0.29995 )
						if( bearPower <= -1.77445 )
							if( bullPower <= -2.17254 )
								if( bbp <= -6.23077 )
									ret := 0.733333 // buy
								if( bbp > -6.23077 )
									ret := 0.538462
							if( bullPower > -2.17254 )
								if( bbm <= 0.119143 )
									ret := 0.727273 // buy
								if( bbm > 0.119143 )
									ret := 0.101266
						if( bearPower > -1.77445 )
							if( bearPower <= -1.35626 )
								if( bbp <= -2.64766 )
									ret := -0.298507
								if( bbp > -2.64766 )
									ret := -0.733333 // sell
							if( bearPower > -1.35626 )
								ret := 0.400000
					if( bbm > 0.29995 )
						if( bbp <= -2.34492 )
							if( bullPower <= -0.896484 )
								if( bullPower <= -1.21648 )
									ret := 0.087956
								if( bullPower > -1.21648 )
									ret := 0.260805
							if( bullPower > -0.896484 )
								if( bearPower <= -1.59415 )
									ret := 0.444444
								if( bearPower > -1.59415 )
									ret := -0.483516
						if( bbp > -2.34492 )
							if( bbp <= -2.30276 )
								if( bearPower <= -1.35382 )
									ret := 0.765432 // buy
								if( bearPower > -1.35382 )
									ret := 0.375000
							if( bbp > -2.30276 )
								if( bearPower <= -1.36315 )
									ret := 0.055777
								if( bearPower > -1.36315 )
									ret := 0.530000
			if( bearPower > -1.32646 )
				if( bbm <= 0.719563 )
					if( bbp <= -1.81997 )
						if( bbm <= 0.009338 )
							if( bearPower <= -1.17409 )
								if( bullPower <= -1.22459 )
									ret := 0.238095
								if( bullPower > -1.22459 )
									ret := 0.954545 // buy
							if( bearPower > -1.17409 )
								if( bullPower <= -1.08258 )
									ret := 0.000000
								if( bullPower > -1.08258 )
									ret := 0.407407
						if( bbm > 0.009338 )
							if( bbp <= -1.89598 )
								if( bbp <= -2.18779 )
									ret := -0.304348
								if( bbp > -2.18779 )
									ret := 0.022876
							if( bbp > -1.89598 )
								if( bearPower <= -1.2082 )
									ret := -0.600000
								if( bearPower > -1.2082 )
									ret := -0.272059
					if( bbp > -1.81997 )
						if( bbm <= 0.568014 )
							if( bullPower <= 0.136519 )
								if( bbp <= -0.415558 )
									ret := 0.087980
								if( bbp > -0.415558 )
									ret := -0.004930
							if( bullPower > 0.136519 )
								if( bullPower <= 0.14323 )
									ret := 0.904762 // buy
								if( bullPower > 0.14323 )
									ret := 0.529412
						if( bbm > 0.568014 )
							if( bbp <= -0.233168 )
								if( bullPower <= 0.180607 )
									ret := -0.001583
								if( bullPower > 0.180607 )
									ret := -0.424528
							if( bbp > -0.233168 )
								if( bbm <= 0.649687 )
									ret := 0.764706 // buy
								if( bbm > 0.649687 )
									ret := 0.318182
				if( bbm > 0.719563 )
					if( bbm <= 0.752053 )
						if( bearPower <= -0.503343 )
							if( bullPower <= 0.044302 )
								if( bbp <= -0.986539 )
									ret := 0.014851
								if( bbp > -0.986539 )
									ret := 0.663866
							if( bullPower > 0.044302 )
								if( bbm <= 0.721297 )
									ret := 0.133333
								if( bbm > 0.721297 )
									ret := -0.225564
						if( bearPower > -0.503343 )
							if( bearPower <= -0.485008 )
								ret := 0.588235
							if( bearPower > -0.485008 )
								ret := 0.833333 // buy
					if( bbm > 0.752053 )
						if( bbp <= -0.303463 )
							if( bearPower <= -1.13322 )
								if( bullPower <= -0.452175 )
									ret := 0.888889 // buy
								if( bullPower > -0.452175 )
									ret := 0.666667
							if( bearPower > -1.13322 )
								if( bullPower <= -0.039333 )
									ret := 0.032609
								if( bullPower > -0.039333 )
									ret := 0.427350
						if( bbp > -0.303463 )
							if( bullPower <= 0.25618 )
								ret := -0.461538
							if( bullPower > 0.25618 )
								ret := -0.400000
		if( bbm > 0.77995 )
			if( bbp <= -0.493118 )
				if( bearPower <= -18.5601 )
					if( bullPower <= -39.5263 )
						ret := 0.076923
					if( bullPower > -39.5263 )
						if( bullPower <= -8.25005 )
							if( bbm <= 10.315 )
								if( bearPower <= -21.8283 )
									ret := 1.000000 // buy
								if( bearPower > -21.8283 )
									ret := 0.714286 // buy
							if( bbm > 10.315 )
								ret := 0.166667
						if( bullPower > -8.25005 )
							ret := 0.250000
				if( bearPower > -18.5601 )
					if( bbp <= -0.641095 )
						if( bbm <= 2.74793 )
							if( bbm <= 2.41988 )
								if( bearPower <= -0.92555 )
									ret := -0.016892
								if( bearPower > -0.92555 )
									ret := 0.173765
							if( bbm > 2.41988 )
								if( bbp <= -1.01892 )
									ret := 0.115174
								if( bbp > -1.01892 )
									ret := 0.756757 // buy
						if( bbm > 2.74793 )
							if( bullPower <= 1.38059 )
								if( bearPower <= -11.0357 )
									ret := 0.412500
								if( bearPower > -11.0357 )
									ret := -0.062835
							if( bullPower > 1.38059 )
								if( bbp <= -2.32018 )
									ret := -0.053398
								if( bbp > -2.32018 )
									ret := -0.401442
					if( bbp > -0.641095 )
						if( bbm <= 2.77252 )
							if( bearPower <= -1.0517 )
								if( bbp <= -0.630265 )
									ret := -0.870968 // sell
								if( bbp > -0.630265 )
									ret := -0.369919
							if( bearPower > -1.0517 )
								if( bullPower <= 0.371256 )
									ret := -0.168906
								if( bullPower > 0.371256 )
									ret := 0.446154
						if( bbm > 2.77252 )
							if( bbm <= 3.8 )
								if( bbp <= -0.623365 )
									ret := -0.250000
								if( bbp > -0.623365 )
									ret := 0.815385 // buy
							if( bbm > 3.8 )
								if( bbm <= 3.982 )
									ret := -1.000000 // sell
								if( bbm > 3.982 )
									ret := -0.027778
			if( bbp > -0.493118 )
				if( bearPower <= -0.589309 )
					if( bullPower <= 0.454194 )
						if( bearPower <= -0.848071 )
							if( bullPower <= 0.413659 )
								ret := 0.181818
							if( bullPower > 0.413659 )
								if( bearPower <= -0.877366 )
									ret := 0.533333
								if( bearPower > -0.877366 )
									ret := 1.000000 // buy
						if( bearPower > -0.848071 )
							if( bbp <= -0.255108 )
								if( bearPower <= -0.789594 )
									ret := -0.202532
								if( bearPower > -0.789594 )
									ret := 0.193916
							if( bbp > -0.255108 )
								if( bbm <= 1.01941 )
									ret := 0.522727
								if( bbm > 1.01941 )
									ret := 0.854545 // buy
					if( bullPower > 0.454194 )
						if( bearPower <= -0.725027 )
							if( bullPower <= 0.484405 )
								if( bbp <= -0.422858 )
									ret := 0.157895
								if( bbp > -0.422858 )
									ret := -0.595238
							if( bullPower > 0.484405 )
								if( bullPower <= 0.688901 )
									ret := 0.255914
								if( bullPower > 0.688901 )
									ret := 0.058981
						if( bearPower > -0.725027 )
							ret := -0.833333 // sell
				if( bearPower > -0.589309 )
					if( bullPower <= 0.305777 )
						if( bbm <= 0.79944 )
							if( bullPower <= 0.230158 )
								ret := -1.000000 // sell
							if( bullPower > 0.230158 )
								if( bbp <= -0.251347 )
									ret := 0.500000
								if( bbp > -0.251347 )
									ret := -0.777778 // sell
						if( bbm > 0.79944 )
							if( bearPower <= -0.561619 )
								if( bbp <= -0.317552 )
									ret := -0.800000 // sell
								if( bbp > -0.317552 )
									ret := 0.193548
							if( bearPower > -0.561619 )
								if( bearPower <= -0.551259 )
									ret := 1.000000 // buy
								if( bearPower > -0.551259 )
									ret := 0.475000
					if( bullPower > 0.305777 )
						if( bullPower <= 0.323751 )
							if( bbp <= -0.232788 )
								ret := -1.000000 // sell
							if( bbp > -0.232788 )
								ret := -0.538462
						if( bullPower > 0.323751 )
							if( bbp <= -0.227224 )
								ret := -0.636364
							if( bbp > -0.227224 )
								ret := -0.500000
	if( bbp > -0.202046 )
		if( bbp <= 4.34279 )
			if( bbm <= 1.65386 )
				if( bbm <= 0.145855 )
					if( bearPower <= 1.46839 )
						if( bullPower <= 0.019688 )
							if( bbp <= -0.063215 )
								if( bullPower <= -0.014597 )
									ret := -0.136449
								if( bullPower > -0.014597 )
									ret := 0.012397
							if( bbp > -0.063215 )
								if( bearPower <= -0.054558 )
									ret := 0.500000
								if( bearPower > -0.054558 )
									ret := 0.159322
						if( bullPower > 0.019688 )
							if( bearPower <= 0.015632 )
								if( bbp <= 0.1109 )
									ret := -0.141321
								if( bbp > 0.1109 )
									ret := -0.683673
							if( bearPower > 0.015632 )
								if( bearPower <= 0.024406 )
									ret := 0.369565
								if( bearPower > 0.024406 )
									ret := -0.071503
					if( bearPower > 1.46839 )
						if( bbm <= 0.025 )
							if( bbp <= 3.62821 )
								ret := 0.000000
							if( bbp > 3.62821 )
								if( bearPower <= 1.91931 )
									ret := -0.500000
								if( bearPower > 1.91931 )
									ret := 0.000000
						if( bbm > 0.025 )
							if( bullPower <= 1.63319 )
								ret := -0.916667 // sell
							if( bullPower > 1.63319 )
								if( bbp <= 3.45518 )
									ret := -0.352941
								if( bbp > 3.45518 )
									ret := -0.761905 // sell
				if( bbm > 0.145855 )
					if( bearPower <= -0.795472 )
						if( bbp <= -0.171881 )
							ret := -0.642857
						if( bbp > -0.171881 )
							if( bbp <= -0.11879 )
								ret := -1.000000 // sell
							if( bbp > -0.11879 )
								ret := -0.736842 // sell
					if( bearPower > -0.795472 )
						if( bbm <= 1.26844 )
							if( bearPower <= -0.349487 )
								if( bbm <= 0.765867 )
									ret := -0.268559
								if( bbm > 0.765867 )
									ret := -0.048955
							if( bearPower > -0.349487 )
								if( bbp <= 0.514654 )
									ret := 0.040640
								if( bbp > 0.514654 )
									ret := -0.012929
						if( bbm > 1.26844 )
							if( bbp <= 0.307208 )
								if( bullPower <= 0.641394 )
									ret := 0.349057
								if( bullPower > 0.641394 )
									ret := -0.126126
							if( bbp > 0.307208 )
								if( bbp <= 0.744244 )
									ret := 0.262243
								if( bbp > 0.744244 )
									ret := 0.074498
			if( bbm > 1.65386 )
				if( bullPower <= 2.2603 )
					if( bbm <= 3.57303 )
						if( bearPower <= -1.42537 )
							if( bbm <= 3.24755 )
								if( bbm <= 2.95005 )
									ret := 0.241379
								if( bbm > 2.95005 )
									ret := 0.772727 // buy
							if( bbm > 3.24755 )
								if( bbm <= 3.46832 )
									ret := -0.267442
								if( bbm > 3.46832 )
									ret := 0.370370
						if( bearPower > -1.42537 )
							if( bbp <= 2.32111 )
								if( bbp <= 0.447033 )
									ret := -0.224774
								if( bbp > 0.447033 )
									ret := -0.064046
							if( bbp > 2.32111 )
								if( bullPower <= 2.12791 )
									ret := -0.766667 // sell
								if( bullPower > 2.12791 )
									ret := -0.322785
					if( bbm > 3.57303 )
						if( bullPower <= 2.18714 )
							if( bullPower <= 2.08062 )
								if( bearPower <= -1.77729 )
									ret := -0.861111 // sell
								if( bearPower > -1.77729 )
									ret := 0.000000
							if( bullPower > 2.08062 )
								if( bearPower <= -2.00351 )
									ret := 0.400000
								if( bearPower > -2.00351 )
									ret := -0.444444
						if( bullPower > 2.18714 )
							if( bbm <= 4.15589 )
								ret := -0.875000 // sell
							if( bbm > 4.15589 )
								ret := -1.000000 // sell
				if( bullPower > 2.2603 )
					if( bearPower <= 1.18488 )
						if( bbm <= 8.19 )
							if( bullPower <= 2.45592 )
								if( bearPower <= 0.179788 )
									ret := 0.474138
								if( bearPower > 0.179788 )
									ret := -0.051402
							if( bullPower > 2.45592 )
								if( bbm <= 2.16227 )
									ret := 0.122302
								if( bbm > 2.16227 )
									ret := -0.149772
						if( bbm > 8.19 )
							if( bearPower <= -5.62392 )
								ret := -0.500000
							if( bearPower > -5.62392 )
								if( bbm <= 8.82202 )
									ret := 0.818182 // buy
								if( bbm > 8.82202 )
									ret := 0.500000
					if( bearPower > 1.18488 )
						if( bearPower <= 1.2469 )
							if( bearPower <= 1.2306 )
								ret := -0.833333 // sell
							if( bearPower > 1.2306 )
								ret := -1.000000 // sell
						if( bearPower > 1.2469 )
							ret := -0.333333
		if( bbp > 4.34279 )
			if( bullPower <= 5.85161 )
				if( bbp <= 5.15486 )
					if( bullPower <= 3.04596 )
						if( bullPower <= 2.95134 )
							if( bullPower <= 2.79002 )
								if( bbp <= 4.35756 )
									ret := 0.277778
								if( bbp > 4.35756 )
									ret := -0.250755
							if( bullPower > 2.79002 )
								if( bbm <= 1.4075 )
									ret := 0.424419
								if( bbm > 1.4075 )
									ret := -0.666667
						if( bullPower > 2.95134 )
							if( bearPower <= 2.00553 )
								if( bearPower <= 1.91142 )
									ret := -0.443182
								if( bearPower > 1.91142 )
									ret := -0.884615 // sell
							if( bearPower > 2.00553 )
								if( bullPower <= 3.01734 )
									ret := 0.071429
								if( bullPower > 3.01734 )
									ret := 0.818182 // buy
					if( bullPower > 3.04596 )
						if( bbp <= 4.54239 )
							if( bullPower <= 3.81191 )
								if( bearPower <= 0.786765 )
									ret := -0.928571 // sell
								if( bearPower > 0.786765 )
									ret := 0.647059
							if( bullPower > 3.81191 )
								if( bearPower <= 0.038655 )
									ret := 0.666667
								if( bearPower > 0.038655 )
									ret := 0.955556 // buy
						if( bbp > 4.54239 )
							if( bullPower <= 3.5837 )
								if( bullPower <= 3.24689 )
									ret := 0.448087
								if( bullPower > 3.24689 )
									ret := -0.145251
							if( bullPower > 3.5837 )
								if( bbm <= 2.275 )
									ret := 0.954545 // buy
								if( bbm > 2.275 )
									ret := 0.354701
				if( bbp > 5.15486 )
					if( bullPower <= 2.95533 )
						if( bearPower <= 2.36304 )
							ret := 0.928571 // buy
						if( bearPower > 2.36304 )
							if( bullPower <= 2.82425 )
								ret := 0.062500
							if( bullPower > 2.82425 )
								ret := 0.571429
					if( bullPower > 2.95533 )
						if( bbp <= 5.40626 )
							if( bbm <= 4.42 )
								if( bbm <= 0.78807 )
									ret := -0.944444 // sell
								if( bbm > 0.78807 )
									ret := -0.303704
							if( bbm > 4.42 )
								ret := -0.827586 // sell
						if( bbp > 5.40626 )
							if( bullPower <= 3.00425 )
								ret := -0.888889 // sell
							if( bullPower > 3.00425 )
								if( bbp <= 5.70069 )
									ret := 0.286783
								if( bbp > 5.70069 )
									ret := 0.062141
			if( bullPower > 5.85161 )
				if( bullPower <= 17.603 )
					if( bullPower <= 13.109 )
						if( bbp <= 5.2576 )
							if( bbp <= 4.53441 )
								ret := 0.538462
							if( bbp > 4.53441 )
								if( bbp <= 4.82678 )
									ret := -0.972222 // sell
								if( bbp > 4.82678 )
									ret := -0.666667
						if( bbp > 5.2576 )
							if( bearPower <= 6.02337 )
								if( bbm <= 1.4576 )
									ret := -0.676923
								if( bbm > 1.4576 )
									ret := -0.101485
							if( bearPower > 6.02337 )
								if( bullPower <= 8.08538 )
									ret := 0.650000
								if( bullPower > 8.08538 )
									ret := 0.118519
					if( bullPower > 13.109 )
						if( bbp <= 18.985 )
							if( bbm <= 16.455 )
								if( bullPower <= 14.148 )
									ret := -0.923077 // sell
								if( bullPower > 14.148 )
									ret := -1.000000 // sell
							if( bbm > 16.455 )
								ret := -0.111111
						if( bbp > 18.985 )
							if( bullPower <= 14.5575 )
								ret := 0.058824
							if( bullPower > 14.5575 )
								if( bearPower <= 11.6443 )
									ret := 0.000000
								if( bearPower > 11.6443 )
									ret := -0.904762 // sell
				if( bullPower > 17.603 )
					if( bbp <= 31.0918 )
						ret := 0.894737 // buy
					if( bbp > 31.0918 )
						if( bbm <= 2.52635 )
							ret := 1.000000 // buy
						if( bbm > 2.52635 )
							if( bbp <= 38.5395 )
								ret := 0.000000
							if( bbp > 38.5395 )
								ret := 0.384615
	
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
float op_operation = decision_tree_0_META_30Min_1b33d337(bearPower, bbm, bbp, bullPower, BBPower_Color)

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


