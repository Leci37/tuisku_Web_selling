//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: PINS_15Min_1B00_23a884b9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_15Min_1B00_23a884b9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_15Min_23a884b9(bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= -0.074165 )
		if( bbm <= 0.041472 )
			if( bearPower <= -0.100786 )
				if( bbp <= -0.932262 )
					if( bbp <= -1.18868 )
						if( bearPower <= -0.624638 )
							if( bullPower <= -1.54095 )
								if( bbp <= -3.64819 )
									ret := 0.333333
								if( bbp > -3.64819 )
									ret := 1.000000 // buy
							if( bullPower > -1.54095 )
								if( bbm <= 0.000545 )
									ret := 0.475410
								if( bbm > 0.000545 )
									ret := -0.161765
						if( bearPower > -0.624638 )
							ret := 1.000000 // buy
					if( bbp > -1.18868 )
						if( bullPower <= -0.538886 )
							if( bearPower <= -0.567498 )
								if( bearPower <= -0.584043 )
									ret := -0.636364
								if( bearPower > -0.584043 )
									ret := -0.178571
							if( bearPower > -0.567498 )
								if( bbp <= -1.10877 )
									ret := -0.812500 // sell
								if( bbp > -1.10877 )
									ret := -1.000000 // sell
						if( bullPower > -0.538886 )
							if( bullPower <= -0.473209 )
								if( bullPower <= -0.502258 )
									ret := -0.387097
								if( bullPower > -0.502258 )
									ret := 0.769231 // buy
							if( bullPower > -0.473209 )
								if( bbp <= -0.944523 )
									ret := -0.866667 // sell
								if( bbp > -0.944523 )
									ret := -0.200000
				if( bbp > -0.932262 )
					if( bbm <= 0.009996 )
						if( bearPower <= -0.23409 )
							if( bbp <= -0.669968 )
								if( bbp <= -0.822272 )
									ret := 0.865672 // buy
								if( bbp > -0.822272 )
									ret := 0.676301
							if( bbp > -0.669968 )
								if( bbm <= 0.000905 )
									ret := 0.609756
								if( bbm > 0.000905 )
									ret := 0.033898
						if( bearPower > -0.23409 )
							if( bbm <= 0.000103 )
								if( bullPower <= -0.228581 )
									ret := -0.166667
								if( bullPower > -0.228581 )
									ret := 0.304682
							if( bbm > 0.000103 )
								if( bbp <= -0.249809 )
									ret := 0.543860
								if( bbp > -0.249809 )
									ret := 0.828571 // buy
					if( bbm > 0.009996 )
						if( bearPower <= -0.328072 )
							if( bearPower <= -0.371189 )
								if( bbm <= 0.018647 )
									ret := 0.722222 // buy
								if( bbm > 0.018647 )
									ret := 0.050000
							if( bearPower > -0.371189 )
								if( bbm <= 0.016432 )
									ret := -0.272727
								if( bbm > 0.016432 )
									ret := -0.800000 // sell
						if( bearPower > -0.328072 )
							if( bbm <= 0.031098 )
								if( bullPower <= -0.092168 )
									ret := 0.315549
								if( bullPower > -0.092168 )
									ret := -0.175824
							if( bbm > 0.031098 )
								if( bullPower <= -0.124924 )
									ret := 0.639175
								if( bullPower > -0.124924 )
									ret := 0.347305
			if( bearPower > -0.100786 )
				if( bbm <= 0.036753 )
					if( bbp <= -0.116407 )
						if( bbp <= -0.119157 )
							if( bearPower <= -0.097315 )
								if( bbm <= 0.015 )
									ret := -0.173469
								if( bbm > 0.015 )
									ret := -0.416667
							if( bearPower > -0.097315 )
								if( bullPower <= -0.094055 )
									ret := 0.566667
								if( bullPower > -0.094055 )
									ret := 0.080592
						if( bbp > -0.119157 )
							if( bbp <= -0.118309 )
								ret := -0.666667
							if( bbp > -0.118309 )
								if( bullPower <= -0.058708 )
									ret := -0.666667
								if( bullPower > -0.058708 )
									ret := -0.264706
					if( bbp > -0.116407 )
						if( bullPower <= -0.055255 )
							if( bullPower <= -0.055992 )
								if( bbp <= -0.114975 )
									ret := 0.458333
								if( bbp > -0.114975 )
									ret := 0.692308
							if( bullPower > -0.055992 )
								ret := 1.000000 // buy
						if( bullPower > -0.055255 )
							if( bearPower <= -0.067377 )
								if( bbp <= -0.111368 )
									ret := 0.733333 // buy
								if( bbp > -0.111368 )
									ret := 1.000000 // buy
							if( bearPower > -0.067377 )
								if( bullPower <= -0.039544 )
									ret := 0.232394
								if( bullPower > -0.039544 )
									ret := -0.021951
				if( bbm > 0.036753 )
					if( bbm <= 0.039738 )
						ret := -0.789474 // sell
					if( bbm > 0.039738 )
						if( bearPower <= -0.074419 )
							if( bbp <= -0.111897 )
								if( bearPower <= -0.091877 )
									ret := -0.500000
								if( bearPower > -0.091877 )
									ret := -0.115385
							if( bbp > -0.111897 )
								ret := -0.800000 // sell
						if( bearPower > -0.074419 )
							if( bbp <= -0.091323 )
								if( bullPower <= -0.029152 )
									ret := 0.454545
								if( bullPower > -0.029152 )
									ret := 0.555556
							if( bbp > -0.091323 )
								ret := 0.000000
		if( bbm > 0.041472 )
			if( bullPower <= -0.377143 )
				if( bullPower <= -5.87118 )
					ret := -0.777778 // sell
				if( bullPower > -5.87118 )
					if( bbm <= 0.179271 )
						if( bbp <= -1.15341 )
							if( bullPower <= -0.53817 )
								if( bullPower <= -0.569429 )
									ret := 0.485149
								if( bullPower > -0.569429 )
									ret := 0.837209 // buy
							if( bullPower > -0.53817 )
								if( bearPower <= -0.665347 )
									ret := -0.142857
								if( bearPower > -0.665347 )
									ret := -1.000000 // sell
						if( bbp > -1.15341 )
							if( bbp <= -1.02554 )
								if( bbm <= 0.1375 )
									ret := 0.555556
								if( bbm > 0.1375 )
									ret := 0.977778 // buy
							if( bbp > -1.02554 )
								if( bbp <= -1.0066 )
									ret := 0.076923
								if( bbp > -1.0066 )
									ret := 0.672619
					if( bbm > 0.179271 )
						if( bearPower <= -1.50798 )
							if( bbp <= -3.87965 )
								if( bbp <= -5.07229 )
									ret := 0.306818
								if( bbp > -5.07229 )
									ret := 0.875000 // buy
							if( bbp > -3.87965 )
								if( bullPower <= -0.43643 )
									ret := 0.153101
								if( bullPower > -0.43643 )
									ret := 0.789474 // buy
						if( bearPower > -1.50798 )
							if( bbp <= -2.30033 )
								if( bbm <= 0.445 )
									ret := -0.839286 // sell
								if( bbm > 0.445 )
									ret := -0.379310
							if( bbp > -2.30033 )
								if( bearPower <= -1.46727 )
									ret := -0.723404 // sell
								if( bearPower > -1.46727 )
									ret := 0.136412
			if( bullPower > -0.377143 )
				if( bbm <= 2.28638 )
					if( bbm <= 0.049495 )
						if( bbm <= 0.047528 )
							if( bearPower <= -0.138885 )
								if( bbm <= 0.044969 )
									ret := -0.416667
								if( bbm > 0.044969 )
									ret := 0.550000
							if( bearPower > -0.138885 )
								if( bearPower <= -0.11923 )
									ret := -0.888889 // sell
								if( bearPower > -0.11923 )
									ret := -0.300000
						if( bbm > 0.047528 )
							if( bbp <= -0.153652 )
								ret := -0.888889 // sell
							if( bbp > -0.153652 )
								ret := -0.692308
					if( bbm > 0.049495 )
						if( bullPower <= 0.243691 )
							if( bbp <= -0.081364 )
								if( bullPower <= 0.144205 )
									ret := 0.018162
								if( bullPower > 0.144205 )
									ret := 0.201708
							if( bbp > -0.081364 )
								if( bbp <= -0.074454 )
									ret := 0.195695
								if( bbp > -0.074454 )
									ret := 0.900000 // buy
						if( bullPower > 0.243691 )
							if( bbm <= 1.77055 )
								if( bbm <= 1.62451 )
									ret := -0.156977
								if( bbm > 1.62451 )
									ret := -0.782609 // sell
							if( bbm > 1.77055 )
								if( bearPower <= -1.71793 )
									ret := -1.000000 // sell
								if( bearPower > -1.71793 )
									ret := 0.506849
				if( bbm > 2.28638 )
					if( bbp <= -1.79344 )
						if( bullPower <= 1.0326 )
							if( bbm <= 2.88574 )
								ret := -0.375000
							if( bbm > 2.88574 )
								ret := 0.588235
						if( bullPower > 1.0326 )
							ret := -0.800000 // sell
					if( bbp > -1.79344 )
						if( bbm <= 3.02327 )
							if( bullPower <= 0.590107 )
								ret := -0.846154 // sell
							if( bullPower > 0.590107 )
								if( bearPower <= -1.75425 )
									ret := 0.000000
								if( bearPower > -1.75425 )
									ret := -0.473684
						if( bbm > 3.02327 )
							if( bullPower <= 0.969428 )
								ret := -1.000000 // sell
							if( bullPower > 0.969428 )
								ret := -0.750000 // sell
	if( bbp > -0.074165 )
		if( bearPower <= 0.270527 )
			if( bbp <= 0.124603 )
				if( bbp <= -0.047857 )
					if( bullPower <= -0.026689 )
						if( bearPower <= -0.027632 )
							if( bullPower <= -0.02858 )
								if( bullPower <= -0.035502 )
									ret := -0.306667
								if( bullPower > -0.035502 )
									ret := 0.221739
							if( bullPower > -0.02858 )
								if( bbp <= -0.056526 )
									ret := -0.275000
								if( bbp > -0.056526 )
									ret := -0.705882 // sell
						if( bearPower > -0.027632 )
							if( bullPower <= -0.026907 )
								if( bullPower <= -0.027234 )
									ret := 0.722222 // buy
								if( bullPower > -0.027234 )
									ret := 0.428571
							if( bullPower > -0.026907 )
								ret := 0.875000 // buy
					if( bullPower > -0.026689 )
						if( bullPower <= -0.026276 )
							if( bbm <= 0.005 )
								if( bullPower <= -0.026456 )
									ret := -0.153846
								if( bullPower > -0.026456 )
									ret := -0.952381 // sell
							if( bbm > 0.005 )
								ret := -0.615385
						if( bullPower > -0.026276 )
							if( bullPower <= -0.021453 )
								if( bbp <= -0.048761 )
									ret := 0.053254
								if( bbp > -0.048761 )
									ret := 0.692308
							if( bullPower > -0.021453 )
								if( bearPower <= -0.036935 )
									ret := -0.096117
								if( bearPower > -0.036935 )
									ret := -0.517857
				if( bbp > -0.047857 )
					if( bbm <= 0.755 )
						if( bbp <= -0.032427 )
							if( bbm <= 0.0575 )
								if( bearPower <= -0.046473 )
									ret := -0.632653
								if( bearPower > -0.046473 )
									ret := -0.008368
							if( bbm > 0.0575 )
								if( bearPower <= -0.088682 )
									ret := 0.022140
								if( bearPower > -0.088682 )
									ret := 0.263060
						if( bbp > -0.032427 )
							if( bbm <= 0.438556 )
								if( bearPower <= -0.18029 )
									ret := 0.461538
								if( bearPower > -0.18029 )
									ret := -0.001002
							if( bbm > 0.438556 )
								if( bullPower <= 0.35845 )
									ret := -0.236499
								if( bullPower > 0.35845 )
									ret := 0.260870
					if( bbm > 0.755 )
						if( bbm <= 0.985257 )
							if( bullPower <= 0.470468 )
								if( bbm <= 0.825 )
									ret := -0.259259
								if( bbm > 0.825 )
									ret := -0.853659 // sell
							if( bullPower > 0.470468 )
								if( bbm <= 0.943932 )
									ret := 0.818182 // buy
								if( bbm > 0.943932 )
									ret := 0.777778 // buy
						if( bbm > 0.985257 )
							if( bbp <= 0.06402 )
								if( bullPower <= 0.619557 )
									ret := -0.923077 // sell
								if( bullPower > 0.619557 )
									ret := -0.480000
							if( bbp > 0.06402 )
								if( bbm <= 0.99977 )
									ret := -1.000000 // sell
								if( bbm > 0.99977 )
									ret := -0.135135
			if( bbp > 0.124603 )
				if( bbm <= 0.027885 )
					if( bearPower <= 0.069217 )
						if( bbp <= 0.132439 )
							if( bullPower <= 0.071619 )
								if( bearPower <= 0.065595 )
									ret := -0.093023
								if( bearPower > 0.065595 )
									ret := -0.350000
							if( bullPower > 0.071619 )
								ret := -0.750000 // sell
						if( bbp > 0.132439 )
							if( bullPower <= 0.067727 )
								if( bullPower <= 0.066515 )
									ret := 0.764706 // buy
								if( bullPower > 0.066515 )
									ret := 0.625000
							if( bullPower > 0.067727 )
								if( bullPower <= 0.083828 )
									ret := 0.078947
								if( bullPower > 0.083828 )
									ret := 0.450000
					if( bearPower > 0.069217 )
						if( bearPower <= 0.216142 )
							if( bbm <= 0.024122 )
								if( bullPower <= 0.070044 )
									ret := -0.812500 // sell
								if( bullPower > 0.070044 )
									ret := -0.162296
							if( bbm > 0.024122 )
								ret := -0.944444 // sell
						if( bearPower > 0.216142 )
							if( bullPower <= 0.231605 )
								if( bullPower <= 0.218154 )
									ret := -0.862069 // sell
								if( bullPower > 0.218154 )
									ret := -0.669492
							if( bullPower > 0.231605 )
								if( bbp <= 0.497643 )
									ret := -0.376471
								if( bbp > 0.497643 )
									ret := -0.045872
				if( bbm > 0.027885 )
					if( bullPower <= 0.471922 )
						if( bbp <= 0.497021 )
							if( bullPower <= 0.463454 )
								if( bbm <= 0.049933 )
									ret := 0.117260
								if( bbm > 0.049933 )
									ret := -0.050989
							if( bullPower > 0.463454 )
								if( bearPower <= -0.176616 )
									ret := -0.400000
								if( bearPower > -0.176616 )
									ret := 0.653333
						if( bbp > 0.497021 )
							if( bearPower <= 0.253023 )
								if( bearPower <= 0.126307 )
									ret := 0.224852
								if( bearPower > 0.126307 )
									ret := 0.047525
							if( bearPower > 0.253023 )
								if( bbm <= 0.188722 )
									ret := 0.446328
								if( bbm > 0.188722 )
									ret := -0.384615
					if( bullPower > 0.471922 )
						if( bearPower <= 0.250627 )
							if( bullPower <= 0.526036 )
								if( bbp <= 0.41936 )
									ret := -0.560976
								if( bbp > 0.41936 )
									ret := -0.131673
							if( bullPower > 0.526036 )
								if( bbp <= 0.710719 )
									ret := 0.004814
								if( bbp > 0.710719 )
									ret := -0.174651
						if( bearPower > 0.250627 )
							if( bbm <= 0.304963 )
								if( bbp <= 0.775128 )
									ret := 0.153846
								if( bbp > 0.775128 )
									ret := -0.563636
							if( bbm > 0.304963 )
								if( bbp <= 1.36984 )
									ret := 0.294118
								if( bbp > 1.36984 )
									ret := -0.769231 // sell
		if( bearPower > 0.270527 )
			if( bbp <= 0.642473 )
				if( bbm <= 5e-05 )
					if( bbp <= 0.616694 )
						if( bullPower <= 0.273937 )
							ret := -0.947368 // sell
						if( bullPower > 0.273937 )
							if( bullPower <= 0.282366 )
								if( bullPower <= 0.278896 )
									ret := 0.000000
								if( bullPower > 0.278896 )
									ret := 0.142857
							if( bullPower > 0.282366 )
								if( bearPower <= 0.285323 )
									ret := -0.750000 // sell
								if( bearPower > 0.285323 )
									ret := -0.450549
					if( bbp > 0.616694 )
						if( bbp <= 0.629239 )
							if( bearPower <= 0.31252 )
								ret := -0.900000 // sell
							if( bearPower > 0.31252 )
								ret := -1.000000 // sell
						if( bbp > 0.629239 )
							if( bullPower <= 0.316254 )
								ret := -0.777778 // sell
							if( bullPower > 0.316254 )
								if( bbp <= 0.637218 )
									ret := -0.500000
								if( bbp > 0.637218 )
									ret := -0.800000 // sell
				if( bbm > 5e-05 )
					if( bbp <= 0.619335 )
						if( bbm <= 0.01728 )
							if( bbp <= 0.599183 )
								ret := 0.363636
							if( bbp > 0.599183 )
								ret := 1.000000 // buy
						if( bbm > 0.01728 )
							if( bullPower <= 0.314131 )
								ret := 0.000000
							if( bullPower > 0.314131 )
								ret := -0.368421
					if( bbp > 0.619335 )
						if( bbp <= 0.634197 )
							if( bbm <= 0.06123 )
								if( bearPower <= 0.297548 )
									ret := -0.692308
								if( bearPower > 0.297548 )
									ret := -0.769231 // sell
							if( bbm > 0.06123 )
								ret := -1.000000 // sell
						if( bbp > 0.634197 )
							if( bbm <= 0.050602 )
								ret := 0.333333
							if( bbm > 0.050602 )
								ret := -0.785714 // sell
			if( bbp > 0.642473 )
				if( bbp <= 0.703863 )
					if( bearPower <= 0.306149 )
						if( bbp <= 0.681655 )
							if( bearPower <= 0.296275 )
								if( bearPower <= 0.279493 )
									ret := 0.312500
								if( bearPower > 0.279493 )
									ret := -0.409091
							if( bearPower > 0.296275 )
								ret := 0.636364
						if( bbp > 0.681655 )
							if( bearPower <= 0.276845 )
								ret := -0.454545
							if( bearPower > 0.276845 )
								if( bearPower <= 0.298105 )
									ret := 0.450980
								if( bearPower > 0.298105 )
									ret := 0.961538 // buy
					if( bearPower > 0.306149 )
						if( bullPower <= 0.340747 )
							ret := -0.424242
						if( bullPower > 0.340747 )
							if( bullPower <= 0.35119 )
								if( bearPower <= 0.349631 )
									ret := 0.371429
								if( bearPower > 0.349631 )
									ret := -0.384615
							if( bullPower > 0.35119 )
								ret := 0.800000 // buy
				if( bbp > 0.703863 )
					if( bbm <= 0.029827 )
						if( bbp <= 1.15301 )
							if( bbp <= 0.94052 )
								if( bearPower <= 0.357017 )
									ret := -0.958333 // sell
								if( bearPower > 0.357017 )
									ret := -0.553648
							if( bbp > 0.94052 )
								if( bearPower <= 0.487577 )
									ret := 0.740741 // buy
								if( bearPower > 0.487577 )
									ret := -0.511905
						if( bbp > 1.15301 )
							if( bbm <= 0.020353 )
								if( bearPower <= 0.588938 )
									ret := -1.000000 // sell
								if( bearPower > 0.588938 )
									ret := -0.756906 // sell
							if( bbm > 0.020353 )
								ret := -1.000000 // sell
					if( bbm > 0.029827 )
						if( bearPower <= 1.29413 )
							if( bbm <= 0.472585 )
								if( bullPower <= 0.909022 )
									ret := -0.084919
								if( bullPower > 0.909022 )
									ret := 0.135983
							if( bbm > 0.472585 )
								if( bearPower <= 0.678757 )
									ret := -0.188198
								if( bearPower > 0.678757 )
									ret := -0.464516
						if( bearPower > 1.29413 )
							if( bbp <= 3.02555 )
								ret := -0.916667 // sell
							if( bbp > 3.02555 )
								if( bearPower <= 2.88539 )
									ret := 0.365714
								if( bearPower > 2.88539 )
									ret := -0.188679
	
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
float op_operation = decision_tree_0_PINS_15Min_23a884b9(bearPower, bbm, bbp, bullPower, BBPower_Color)

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


