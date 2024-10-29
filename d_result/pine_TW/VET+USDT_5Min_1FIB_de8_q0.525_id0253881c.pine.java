//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: VETUSDT_5Min_1FIB_0253881c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_5Min_1FIB_0253881c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_5Min_0253881c(basis_minus, lower_4, lower_6, upper_1, upper_3, lower_2, basis, upper_4, upper_5, lower_1, upper_6, lower_3, basis_max, lower_5, upper_2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( lower_6 <= 0.033818 )
		if( lower_6 <= 0.032561 )
			if( basis_max <= -0.002131 )
				if( lower_2 <= 0.019441 )
					if( upper_6 <= 0.023357 )
						if( lower_6 <= 0.017701 )
							if( upper_4 <= 0.022093 )
								ret := 0.888889 // buy
							if( upper_4 > 0.022093 )
								ret := 1.000000 // buy
						if( lower_6 > 0.017701 )
							ret := 0.692308
					if( upper_6 > 0.023357 )
						if( basis_minus <= 0.003319 )
							if( lower_1 <= 0.019607 )
								if( lower_5 <= 0.017908 )
									ret := 1.000000 // buy
								if( lower_5 > 0.017908 )
									ret := 0.900000 // buy
							if( lower_1 > 0.019607 )
								if( lower_2 <= 0.019167 )
									ret := -0.823529 // sell
								if( lower_2 > 0.019167 )
									ret := -0.214286
						if( basis_minus > 0.003319 )
							if( lower_4 <= 0.018593 )
								ret := 0.888889 // buy
							if( lower_4 > 0.018593 )
								ret := 1.000000 // buy
				if( lower_2 > 0.019441 )
					if( lower_1 <= 0.020373 )
						if( upper_6 <= 0.024009 )
							if( basis <= 0.020508 )
								if( lower_1 <= 0.019822 )
									ret := 0.714286 // buy
								if( lower_1 > 0.019822 )
									ret := -0.709677 // sell
							if( basis > 0.020508 )
								if( lower_5 <= 0.01863 )
									ret := -0.026316
								if( lower_5 > 0.01863 )
									ret := 0.666667
						if( upper_6 > 0.024009 )
							if( lower_4 <= 0.019189 )
								if( basis_minus <= 0.003052 )
									ret := -0.272727
								if( basis_minus > 0.003052 )
									ret := -0.836066 // sell
							if( lower_4 > 0.019189 )
								ret := -1.000000 // sell
					if( lower_1 > 0.020373 )
						if( lower_4 <= 0.019605 )
							if( basis_minus <= 0.002803 )
								ret := 0.333333
							if( basis_minus > 0.002803 )
								if( basis <= 0.021506 )
									ret := 0.963964 // buy
								if( basis > 0.021506 )
									ret := 0.750000 // buy
						if( lower_4 > 0.019605 )
							if( upper_6 <= 0.037819 )
								if( upper_5 <= 0.023652 )
									ret := 0.910714 // buy
								if( upper_5 > 0.023652 )
									ret := 0.089395
							if( upper_6 > 0.037819 )
								if( lower_1 <= 0.035488 )
									ret := -0.465909
								if( lower_1 > 0.035488 )
									ret := 0.013263
			if( basis_max > -0.002131 )
				if( upper_6 <= 0.015122 )
					if( basis_minus <= 0.000259 )
						ret := 0.437500
					if( basis_minus > 0.000259 )
						if( lower_2 <= 0.014748 )
							if( basis <= 0.014837 )
								ret := 1.000000 // buy
							if( basis > 0.014837 )
								ret := 0.400000
						if( lower_2 > 0.014748 )
							ret := 1.000000 // buy
				if( upper_6 > 0.015122 )
					if( lower_2 <= 0.029508 )
						if( basis <= 0.015408 )
							if( lower_6 <= 0.015081 )
								if( basis_max <= -0.000212 )
									ret := -0.086811
								if( basis_max > -0.000212 )
									ret := -0.617647
							if( lower_6 > 0.015081 )
								if( upper_3 <= 0.015547 )
									ret := -0.909091 // sell
								if( upper_3 > 0.015547 )
									ret := -0.269231
						if( basis > 0.015408 )
							if( basis_minus <= 0.00211 )
								if( lower_1 <= 0.029704 )
									ret := 0.007856
								if( lower_1 > 0.029704 )
									ret := 0.848485 // buy
							if( basis_minus > 0.00211 )
								if( lower_1 <= 0.023124 )
									ret := -0.666667
								if( lower_1 > 0.023124 )
									ret := -0.979592 // sell
					if( lower_2 > 0.029508 )
						if( lower_4 <= 0.032726 )
							if( upper_2 <= 0.03322 )
								if( lower_3 <= 0.032087 )
									ret := -0.048103
								if( lower_3 > 0.032087 )
									ret := -0.795031 // sell
							if( upper_2 > 0.03322 )
								if( lower_2 <= 0.033084 )
									ret := 0.154331
								if( lower_2 > 0.033084 )
									ret := 0.884058 // buy
						if( lower_4 > 0.032726 )
							if( upper_4 <= 0.03549 )
								if( basis_minus <= 0.00155 )
									ret := -0.245714
								if( basis_minus > 0.00155 )
									ret := -0.686131
							if( upper_4 > 0.03549 )
								if( upper_2 <= 0.035119 )
									ret := 0.944444 // buy
								if( upper_2 > 0.035119 )
									ret := -0.200000
		if( lower_6 > 0.032561 )
			if( lower_3 <= 0.034574 )
				if( lower_3 <= 0.03453 )
					if( lower_6 <= 0.033759 )
						if( lower_5 <= 0.033661 )
							if( upper_5 <= 0.038532 )
								if( lower_5 <= 0.033423 )
									ret := 0.127482
								if( lower_5 > 0.033423 )
									ret := -0.102477
							if( upper_5 > 0.038532 )
								if( upper_5 <= 0.039088 )
									ret := 0.724138 // buy
								if( upper_5 > 0.039088 )
									ret := -0.750000 // sell
						if( lower_5 > 0.033661 )
							if( lower_4 <= 0.034114 )
								if( lower_6 <= 0.033678 )
									ret := 0.463180
								if( lower_6 > 0.033678 )
									ret := -0.075521
							if( lower_4 > 0.034114 )
								if( lower_3 <= 0.034342 )
									ret := -0.307494
								if( lower_3 > 0.034342 )
									ret := 0.206226
					if( lower_6 > 0.033759 )
						if( lower_4 <= 0.034186 )
							if( upper_6 <= 0.035846 )
								if( basis_minus <= 0.000963 )
									ret := 0.625850
								if( basis_minus > 0.000963 )
									ret := 0.022727
							if( upper_6 > 0.035846 )
								if( upper_6 <= 0.035871 )
									ret := 0.975610 // buy
								if( upper_6 > 0.035871 )
									ret := 0.698413
						if( lower_4 > 0.034186 )
							if( lower_1 <= 0.034605 )
								if( basis_max <= -0.001046 )
									ret := -0.972222 // sell
								if( basis_max > -0.001046 )
									ret := -0.260870
							if( lower_1 > 0.034605 )
								if( lower_5 <= 0.034041 )
									ret := 0.307692
								if( lower_5 > 0.034041 )
									ret := 0.776316 // buy
				if( lower_3 > 0.03453 )
					if( lower_1 <= 0.035015 )
						ret := 0.000000
					if( lower_1 > 0.035015 )
						if( upper_3 <= 0.036349 )
							ret := 1.000000 // buy
						if( upper_3 > 0.036349 )
							if( basis_minus <= 0.001894 )
								ret := 0.250000
							if( basis_minus > 0.001894 )
								if( upper_4 <= 0.037339 )
									ret := 0.980392 // buy
								if( upper_4 > 0.037339 )
									ret := 0.805556 // buy
			if( lower_3 > 0.034574 )
				if( basis_max <= -0.003928 )
					if( upper_4 <= 0.039639 )
						if( lower_1 <= 0.035792 )
							ret := 0.833333 // buy
						if( lower_1 > 0.035792 )
							ret := 1.000000 // buy
					if( upper_4 > 0.039639 )
						if( basis_minus <= 0.010156 )
							if( upper_3 <= 0.045574 )
								if( lower_2 <= 0.036122 )
									ret := -0.242424
								if( lower_2 > 0.036122 )
									ret := 0.511111
							if( upper_3 > 0.045574 )
								if( lower_2 <= 0.038674 )
									ret := -0.973684 // sell
								if( lower_2 > 0.038674 )
									ret := -0.086957
						if( basis_minus > 0.010156 )
							if( upper_6 <= 0.054034 )
								ret := 1.000000 // buy
							if( upper_6 > 0.054034 )
								ret := 0.800000 // buy
				if( basis_max > -0.003928 )
					if( lower_6 <= 0.03356 )
						if( upper_2 <= 0.037328 )
							if( upper_4 <= 0.037968 )
								if( lower_3 <= 0.034717 )
									ret := -0.712121 // sell
								if( lower_3 > 0.034717 )
									ret := 0.315789
							if( upper_4 > 0.037968 )
								if( upper_3 <= 0.037643 )
									ret := 0.666667
								if( upper_3 > 0.037643 )
									ret := -0.294118
						if( upper_2 > 0.037328 )
							if( lower_1 <= 0.035742 )
								if( upper_4 <= 0.038191 )
									ret := -0.920635 // sell
								if( upper_4 > 0.038191 )
									ret := -0.709677 // sell
							if( lower_1 > 0.035742 )
								if( upper_1 <= 0.037736 )
									ret := 0.444444
								if( upper_1 > 0.037736 )
									ret := -0.583333
					if( lower_6 > 0.03356 )
						if( upper_5 <= 0.036845 )
							if( lower_6 <= 0.033766 )
								ret := 0.454545
							if( lower_6 > 0.033766 )
								ret := 1.000000 // buy
						if( upper_5 > 0.036845 )
							if( basis_minus <= 0.002402 )
								if( lower_1 <= 0.035308 )
									ret := -0.025000
								if( lower_1 > 0.035308 )
									ret := -0.750000 // sell
							if( basis_minus > 0.002402 )
								if( upper_3 <= 0.037466 )
									ret := 0.857143 // buy
								if( upper_3 > 0.037466 )
									ret := -0.022388
	if( lower_6 > 0.033818 )
		if( upper_4 <= 0.0507 )
			if( upper_4 <= 0.050375 )
				if( lower_6 <= 0.03412 )
					if( lower_3 <= 0.034488 )
						if( lower_3 <= 0.034396 )
							if( upper_1 <= 0.034313 )
								if( basis_minus <= 0.000359 )
									ret := -0.971014 // sell
								if( basis_minus > 0.000359 )
									ret := -0.700000 // sell
							if( upper_1 > 0.034313 )
								if( upper_5 <= 0.034988 )
									ret := 0.331210
								if( upper_5 > 0.034988 )
									ret := -0.345912
						if( lower_3 > 0.034396 )
							if( upper_6 <= 0.035538 )
								if( lower_3 <= 0.034413 )
									ret := -0.714286 // sell
								if( lower_3 > 0.034413 )
									ret := -0.105263
							if( upper_6 > 0.035538 )
								if( upper_6 <= 0.035763 )
									ret := 0.896552 // buy
								if( upper_6 > 0.035763 )
									ret := 0.288630
					if( lower_3 > 0.034488 )
						if( lower_1 <= 0.034764 )
							if( basis_minus <= 0.000878 )
								if( basis <= 0.034926 )
									ret := -0.884615 // sell
								if( basis > 0.034926 )
									ret := -1.000000 // sell
							if( basis_minus > 0.000878 )
								if( upper_1 <= 0.035176 )
									ret := -0.062500
								if( upper_1 > 0.035176 )
									ret := -1.000000 // sell
						if( lower_1 > 0.034764 )
							if( basis_minus <= 0.002351 )
								if( upper_1 <= 0.035566 )
									ret := 0.147541
								if( upper_1 > 0.035566 )
									ret := -0.245098
							if( basis_minus > 0.002351 )
								if( lower_6 <= 0.033951 )
									ret := -0.524590
								if( lower_6 > 0.033951 )
									ret := -0.924242 // sell
				if( lower_6 > 0.03412 )
					if( lower_4 <= 0.034695 )
						if( upper_4 <= 0.036187 )
							if( lower_3 <= 0.034783 )
								if( lower_4 <= 0.034431 )
									ret := 0.496000
								if( lower_4 > 0.034431 )
									ret := -0.008547
							if( lower_3 > 0.034783 )
								if( lower_1 <= 0.035065 )
									ret := 0.968750 // buy
								if( lower_1 > 0.035065 )
									ret := 0.278261
						if( upper_4 > 0.036187 )
							if( basis_minus <= 0.00132 )
								if( lower_1 <= 0.03513 )
									ret := 0.153846
								if( lower_1 > 0.03513 )
									ret := 0.721154 // buy
							if( basis_minus > 0.00132 )
								if( lower_2 <= 0.034971 )
									ret := 1.000000 // buy
								if( lower_2 > 0.034971 )
									ret := 0.882353 // buy
					if( lower_4 > 0.034695 )
						if( basis_max <= -0.008276 )
							if( lower_6 <= 0.034976 )
								if( upper_5 <= 0.051349 )
									ret := -1.000000 // sell
								if( upper_5 > 0.051349 )
									ret := -0.857143 // sell
							if( lower_6 > 0.034976 )
								if( upper_1 <= 0.046622 )
									ret := 0.989247 // buy
								if( upper_1 > 0.046622 )
									ret := 0.888889 // buy
						if( basis_max > -0.008276 )
							if( lower_3 <= 0.048864 )
								if( lower_1 <= 0.03974 )
									ret := -0.061226
								if( lower_1 > 0.03974 )
									ret := -0.003018
							if( lower_3 > 0.048864 )
								if( lower_3 <= 0.048897 )
									ret := -0.905660 // sell
								if( lower_3 > 0.048897 )
									ret := -0.300000
			if( upper_4 > 0.050375 )
				if( lower_2 <= 0.041416 )
					ret := 1.000000 // buy
				if( lower_2 > 0.041416 )
					if( lower_5 <= 0.045408 )
						if( upper_3 <= 0.049642 )
							ret := -1.000000 // sell
						if( upper_3 > 0.049642 )
							if( upper_1 <= 0.048438 )
								if( lower_4 <= 0.041975 )
									ret := 1.000000 // buy
								if( lower_4 > 0.041975 )
									ret := 0.241379
							if( upper_1 > 0.048438 )
								if( lower_4 <= 0.043745 )
									ret := -0.958333 // sell
								if( lower_4 > 0.043745 )
									ret := -0.473684
					if( lower_5 > 0.045408 )
						if( lower_2 <= 0.04836 )
							if( basis <= 0.048877 )
								if( basis_minus <= 0.003225 )
									ret := 0.695364
								if( basis_minus > 0.003225 )
									ret := 0.103448
							if( basis > 0.048877 )
								if( lower_2 <= 0.04789 )
									ret := -0.585106
								if( lower_2 > 0.04789 )
									ret := 0.149635
						if( lower_2 > 0.04836 )
							if( upper_3 <= 0.050511 )
								if( upper_4 <= 0.050397 )
									ret := -0.428571
								if( upper_4 > 0.050397 )
									ret := 0.492754
							if( upper_3 > 0.050511 )
								ret := -1.000000 // sell
		if( upper_4 > 0.0507 )
			if( lower_2 <= 0.049357 )
				if( upper_4 <= 0.051068 )
					if( lower_5 <= 0.048475 )
						if( upper_1 <= 0.049142 )
							if( upper_4 <= 0.050779 )
								ret := -1.000000 // sell
							if( upper_4 > 0.050779 )
								if( upper_6 <= 0.052753 )
									ret := -0.942857 // sell
								if( upper_6 > 0.052753 )
									ret := -0.464286
						if( upper_1 > 0.049142 )
							if( upper_2 <= 0.050033 )
								if( lower_3 <= 0.046 )
									ret := 0.642857
								if( lower_3 > 0.046 )
									ret := 0.888889 // buy
							if( upper_2 > 0.050033 )
								if( basis <= 0.049148 )
									ret := -0.139706
								if( basis > 0.049148 )
									ret := -0.462523
					if( lower_5 > 0.048475 )
						ret := 0.823529 // buy
				if( upper_4 > 0.051068 )
					if( lower_4 <= 0.048458 )
						if( lower_2 <= 0.048386 )
							if( upper_3 <= 0.051014 )
								if( lower_6 <= 0.042914 )
									ret := -0.336735
								if( lower_6 > 0.042914 )
									ret := 0.685393
							if( upper_3 > 0.051014 )
								if( basis_max <= -0.003962 )
									ret := -0.172131
								if( basis_max > -0.003962 )
									ret := -0.919355 // sell
						if( lower_2 > 0.048386 )
							if( lower_2 <= 0.049145 )
								if( upper_6 <= 0.052294 )
									ret := 0.005714
								if( upper_6 > 0.052294 )
									ret := 0.728302 // buy
							if( lower_2 > 0.049145 )
								if( basis <= 0.050405 )
									ret := -0.707317 // sell
								if( basis > 0.050405 )
									ret := 0.194030
					if( lower_4 > 0.048458 )
						if( upper_1 <= 0.050526 )
							if( lower_2 <= 0.04931 )
								if( lower_3 <= 0.048953 )
									ret := 0.148148
								if( lower_3 > 0.048953 )
									ret := -0.640000
							if( lower_2 > 0.04931 )
								if( lower_5 <= 0.048655 )
									ret := 0.952381 // buy
								if( lower_5 > 0.048655 )
									ret := 0.000000
						if( upper_1 > 0.050526 )
							if( upper_3 <= 0.051632 )
								if( upper_6 <= 0.052118 )
									ret := -0.250000
								if( upper_6 > 0.052118 )
									ret := -0.913462 // sell
							if( upper_3 > 0.051632 )
								if( upper_6 <= 0.053255 )
									ret := 0.823529 // buy
								if( upper_6 > 0.053255 )
									ret := -0.802198 // sell
			if( lower_2 > 0.049357 )
				if( lower_5 <= 0.047728 )
					if( upper_5 <= 0.055503 )
						if( basis_max <= -0.005125 )
							ret := 0.842105 // buy
						if( basis_max > -0.005125 )
							if( upper_5 <= 0.055369 )
								ret := -0.500000
							if( upper_5 > 0.055369 )
								ret := 0.095238
					if( upper_5 > 0.055503 )
						if( lower_4 <= 0.048252 )
							if( lower_1 <= 0.05027 )
								ret := -0.307692
							if( lower_1 > 0.05027 )
								ret := 0.909091 // buy
						if( lower_4 > 0.048252 )
							if( upper_1 <= 0.052778 )
								if( upper_3 <= 0.054141 )
									ret := -1.000000 // sell
								if( upper_3 > 0.054141 )
									ret := -0.833333 // sell
							if( upper_1 > 0.052778 )
								if( lower_4 <= 0.048268 )
									ret := -0.769231 // sell
								if( lower_4 > 0.048268 )
									ret := -0.166667
				if( lower_5 > 0.047728 )
					if( lower_5 <= 0.049093 )
						if( lower_2 <= 0.049377 )
							if( basis_max <= -0.00181 )
								ret := -0.700000 // sell
							if( basis_max > -0.00181 )
								ret := -1.000000 // sell
						if( lower_2 > 0.049377 )
							if( lower_2 <= 0.04945 )
								if( upper_3 <= 0.050992 )
									ret := -0.800000 // sell
								if( upper_3 > 0.050992 )
									ret := -1.000000 // sell
							if( lower_2 > 0.04945 )
								ret := -1.000000 // sell
					if( lower_5 > 0.049093 )
						if( upper_2 <= 0.050497 )
							ret := -1.000000 // sell
						if( upper_2 > 0.050497 )
							if( upper_4 <= 0.050875 )
								if( lower_6 <= 0.04887 )
									ret := -0.176471
								if( lower_6 > 0.04887 )
									ret := 0.750000 // buy
							if( upper_4 > 0.050875 )
								if( basis <= 0.050152 )
									ret := -0.828571 // sell
								if( basis > 0.050152 )
									ret := -0.058824
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Fibonacci_Bollinger 
//@version=5
//indicator shorttitle="FBB", title="Fibonacci Bollinger Bands", overlay=true)

// Inputs
length_FiboBB = input.int(200, minval=1)
src = input(hlc3, title="Source")
mult = input.float(3.0, minval=0.001, maxval=50)

// Calculations
basis = ta.vwma(src, length_FiboBB)
dev = mult * ta.stdev(src, length_FiboBB)

// Upper Bands
upper_1 = basis + (0.236 * dev)
upper_2 = basis + (0.382 * dev)
upper_3 = basis + (0.5 * dev)
upper_4 = basis + (0.618 * dev)
upper_5 = basis + (0.764 * dev)
upper_6 = basis + (1 * dev)

// Lower Bands
lower_1 = basis - (0.236 * dev)
lower_2 = basis - (0.382 * dev)
lower_3 = basis - (0.5 * dev)
lower_4 = basis - (0.618 * dev)
lower_5 = basis - (0.764 * dev)
lower_6 = basis - (1 * dev)

basis_minus = basis -lower_6
basis_max = basis -upper_6

// Plotting
plot(basis, color=color.fuchsia, linewidth=2)
plot(upper_1, color=color.white, linewidth=1, title="0.236")
plot(upper_2, color=color.white, linewidth=1, title="0.382")
plot(upper_3, color=color.white, linewidth=1, title="0.5")
plot(upper_4, color=color.white, linewidth=1, title="0.618")
plot(upper_5, color=color.white, linewidth=1, title="0.764")
plot(upper_6, color=color.red, linewidth=2, title="1")
plot(lower_1, color=color.white, linewidth=1, title="0.236")
plot(lower_2, color=color.white, linewidth=1, title="0.382")
plot(lower_3, color=color.white, linewidth=1, title="0.5")
plot(lower_4, color=color.white, linewidth=1, title="0.618")
plot(lower_5, color=color.white, linewidth=1, title="0.764")
plot(lower_6, color=color.green, linewidth=2, title="1")

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
float op_operation = decision_tree_0_VETUSDT_5Min_0253881c(basis_minus, lower_4, lower_6, upper_1, upper_3, lower_2, basis, upper_4, upper_5, lower_1, upper_6, lower_3, basis_max, lower_5, upper_2)

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


