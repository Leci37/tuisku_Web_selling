//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: PYPL_1Min_1FIB_aeaf3fa0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_1FIB_aeaf3fa0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_aeaf3fa0(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( lower_6 <= 65.1094 )
		if( basis <= 66.3976 )
			if( basis_minus <= 0.942402 )
				if( basis_max <= -0.81837 )
					if( lower_3 <= 64.8833 )
						if( upper_1 <= 65.214 )
							if( lower_2 <= 64.4703 )
								if( lower_6 <= 63.7907 )
									ret := -0.123851
								if( lower_6 > 63.7907 )
									ret := -0.655556
							if( lower_2 > 64.4703 )
								if( basis <= 64.8247 )
									ret := 1.000000 // buy
								if( basis > 64.8247 )
									ret := 0.244444
						if( upper_1 > 65.214 )
							if( basis_minus <= 0.843123 )
								if( lower_6 <= 64.4645 )
									ret := 0.571429
								if( lower_6 > 64.4645 )
									ret := -0.400000
							if( basis_minus > 0.843123 )
								if( basis_max <= -0.866812 )
									ret := -0.461538
								if( basis_max > -0.866812 )
									ret := -0.928571 // sell
					if( lower_3 > 64.8833 )
						if( lower_4 <= 64.8814 )
							if( lower_4 <= 64.7869 )
								if( lower_3 <= 64.8872 )
									ret := 0.300000
								if( lower_3 > 64.8872 )
									ret := -0.750000 // sell
							if( lower_4 > 64.7869 )
								if( upper_1 <= 65.6355 )
									ret := 0.695652
								if( upper_1 > 65.6355 )
									ret := -0.250000
						if( lower_4 > 64.8814 )
							if( upper_4 <= 66.5051 )
								if( upper_4 <= 66.4843 )
									ret := 0.062147
								if( upper_4 > 66.4843 )
									ret := -0.769231 // sell
							if( upper_4 > 66.5051 )
								if( lower_1 <= 65.7384 )
									ret := 0.750000 // buy
								if( lower_1 > 65.7384 )
									ret := 1.000000 // buy
				if( basis_max > -0.81837 )
					if( upper_3 <= 65.9081 )
						if( upper_3 <= 64.7828 )
							if( upper_6 <= 64.8393 )
								if( upper_5 <= 64.6246 )
									ret := 0.038714
								if( upper_5 > 64.6246 )
									ret := -0.258303
							if( upper_6 > 64.8393 )
								if( lower_6 <= 63.3759 )
									ret := -0.288288
								if( lower_6 > 63.3759 )
									ret := 0.231815
						if( upper_3 > 64.7828 )
							if( upper_2 <= 64.7777 )
								if( upper_5 <= 65.0204 )
									ret := -0.431034
								if( upper_5 > 65.0204 )
									ret := 0.200000
							if( upper_2 > 64.7777 )
								if( upper_4 <= 64.9729 )
									ret := 0.192612
								if( upper_4 > 64.9729 )
									ret := -0.043035
					if( upper_3 > 65.9081 )
						if( upper_4 <= 66.0265 )
							if( lower_2 <= 65.3842 )
								if( basis_minus <= 0.699141 )
									ret := 0.392857
								if( basis_minus > 0.699141 )
									ret := 0.846154 // buy
							if( lower_2 > 65.3842 )
								ret := 1.000000 // buy
						if( upper_4 > 66.0265 )
							if( lower_3 <= 65.3076 )
								if( basis_max <= -0.734948 )
									ret := 0.071429
								if( basis_max > -0.734948 )
									ret := -0.500000
							if( lower_3 > 65.3076 )
								if( basis_max <= -0.668262 )
									ret := 1.000000 // buy
								if( basis_max > -0.668262 )
									ret := 0.300000
			if( basis_minus > 0.942402 )
				if( upper_3 <= 64.1675 )
					if( lower_1 <= 62.9989 )
						if( lower_3 <= 62.4938 )
							if( lower_6 <= 61.854 )
								if( lower_4 <= 62.2342 )
									ret := 0.139774
								if( lower_4 > 62.2342 )
									ret := -0.718750 // sell
							if( lower_6 > 61.854 )
								if( basis_max <= -1.11681 )
									ret := 0.063291
								if( basis_max > -1.11681 )
									ret := 0.668750
						if( lower_3 > 62.4938 )
							if( basis <= 63.1414 )
								if( lower_1 <= 62.7866 )
									ret := -0.428571
								if( lower_1 > 62.7866 )
									ret := -0.871795 // sell
							if( basis > 63.1414 )
								if( lower_3 <= 62.5486 )
									ret := 0.750000 // buy
								if( lower_3 > 62.5486 )
									ret := -0.400000
					if( lower_1 > 62.9989 )
						if( lower_5 <= 62.6253 )
							if( upper_6 <= 64.8572 )
								if( upper_5 <= 64.4841 )
									ret := 0.576923
								if( upper_5 > 64.4841 )
									ret := -0.076923
							if( upper_6 > 64.8572 )
								if( upper_6 <= 64.9097 )
									ret := 0.692308
								if( upper_6 > 64.9097 )
									ret := 1.000000 // buy
						if( lower_5 > 62.6253 )
							if( lower_6 <= 62.3748 )
								ret := -1.000000 // sell
							if( lower_6 > 62.3748 )
								if( upper_6 <= 64.654 )
									ret := -0.156250
								if( upper_6 > 64.654 )
									ret := 0.600000
				if( upper_3 > 64.1675 )
					if( lower_3 <= 65.32 )
						if( lower_2 <= 65.1914 )
							if( lower_6 <= 63.6284 )
								if( upper_3 <= 67.2409 )
									ret := -0.029359
								if( upper_3 > 67.2409 )
									ret := 0.710145 // buy
							if( lower_6 > 63.6284 )
								if( upper_1 <= 66.3799 )
									ret := 0.332410
								if( upper_1 > 66.3799 )
									ret := -0.812500 // sell
						if( lower_2 > 65.1914 )
							if( lower_2 <= 65.1943 )
								if( upper_4 <= 67.2586 )
									ret := -0.965517 // sell
								if( upper_4 > 67.2586 )
									ret := 0.000000
							if( lower_2 > 65.1943 )
								if( lower_5 <= 64.9411 )
									ret := -0.140351
								if( lower_5 > 64.9411 )
									ret := -0.569620
					if( lower_3 > 65.32 )
						if( lower_4 <= 65.5241 )
							if( lower_2 <= 65.6353 )
								if( lower_5 <= 64.8186 )
									ret := -1.000000 // sell
								if( lower_5 > 64.8186 )
									ret := 0.605128
							if( lower_2 > 65.6353 )
								if( lower_5 <= 65.1159 )
									ret := -0.402597
								if( lower_5 > 65.1159 )
									ret := 0.545455
						if( lower_4 > 65.5241 )
							if( basis_max <= -1.24175 )
								ret := 1.000000 // buy
							if( basis_max > -1.24175 )
								if( basis_max <= -1.1969 )
									ret := -0.916667 // sell
								if( basis_max > -1.1969 )
									ret := -0.344828
		if( basis > 66.3976 )
			if( upper_1 <= 67.0008 )
				if( lower_4 <= 65.5913 )
					if( lower_1 <= 66.1776 )
						if( upper_5 <= 67.6736 )
							if( basis_max <= -1.47812 )
								if( basis_max <= -1.4933 )
									ret := 0.875000 // buy
								if( basis_max > -1.4933 )
									ret := 0.500000
							if( basis_max > -1.47812 )
								if( lower_6 <= 65.0249 )
									ret := -0.875000 // sell
								if( lower_6 > 65.0249 )
									ret := -0.111111
						if( upper_5 > 67.6736 )
							if( upper_2 <= 67.1464 )
								if( upper_1 <= 66.8952 )
									ret := -0.905882 // sell
								if( upper_1 > 66.8952 )
									ret := -0.285714
							if( upper_2 > 67.1464 )
								if( upper_2 <= 67.1531 )
									ret := 0.851852 // buy
								if( upper_2 > 67.1531 )
									ret := -0.606061
					if( lower_1 > 66.1776 )
						if( lower_3 <= 65.7691 )
							ret := 1.000000 // buy
						if( lower_3 > 65.7691 )
							ret := 0.428571
				if( lower_4 > 65.5913 )
					if( lower_6 <= 64.9894 )
						if( lower_2 <= 65.974 )
							if( lower_4 <= 65.5967 )
								ret := -1.000000 // sell
							if( lower_4 > 65.5967 )
								ret := -0.666667
						if( lower_2 > 65.974 )
							ret := 0.333333
					if( lower_6 > 64.9894 )
						if( lower_1 <= 66.1551 )
							ret := -1.000000 // sell
						if( lower_1 > 66.1551 )
							if( basis <= 66.5669 )
								ret := 0.142857
							if( basis > 66.5669 )
								if( upper_1 <= 66.958 )
									ret := -0.972973 // sell
								if( upper_1 > 66.958 )
									ret := -0.764706 // sell
			if( upper_1 > 67.0008 )
				if( lower_5 <= 65.8619 )
					if( lower_3 <= 65.6008 )
						if( lower_4 <= 65.2354 )
							if( basis_minus <= 2.07973 )
								ret := 0.750000 // buy
							if( basis_minus > 2.07973 )
								ret := 1.000000 // buy
						if( lower_4 > 65.2354 )
							if( basis <= 66.5834 )
								if( lower_6 <= 64.4575 )
									ret := -0.583333
								if( lower_6 > 64.4575 )
									ret := 0.000000
							if( basis > 66.5834 )
								ret := -1.000000 // sell
					if( lower_3 > 65.6008 )
						if( lower_5 <= 65.3835 )
							if( basis_minus <= 1.87782 )
								if( lower_5 <= 65.1787 )
									ret := -0.400000
								if( lower_5 > 65.1787 )
									ret := 0.200000
							if( basis_minus > 1.87782 )
								if( upper_3 <= 67.5446 )
									ret := 1.000000 // buy
								if( upper_3 > 67.5446 )
									ret := 0.750000 // buy
						if( lower_5 > 65.3835 )
							if( basis <= 69.1853 )
								if( upper_1 <= 70.2322 )
									ret := 1.000000 // buy
								if( upper_1 > 70.2322 )
									ret := 0.937500 // buy
							if( basis > 69.1853 )
								if( upper_1 <= 70.2794 )
									ret := -0.700000 // sell
								if( upper_1 > 70.2794 )
									ret := 0.809524 // buy
				if( lower_5 > 65.8619 )
					if( lower_4 <= 66.8572 )
						if( upper_2 <= 70.7671 )
							ret := 0.500000
						if( upper_2 > 70.7671 )
							if( lower_5 <= 65.99 )
								if( upper_3 <= 71.7795 )
									ret := -0.909091 // sell
								if( upper_3 > 71.7795 )
									ret := 0.500000
							if( lower_5 > 65.99 )
								if( lower_4 <= 66.7898 )
									ret := -0.944444 // sell
								if( lower_4 > 66.7898 )
									ret := -1.000000 // sell
					if( lower_4 > 66.8572 )
						ret := 1.000000 // buy
	if( lower_6 > 65.1094 )
		if( upper_4 <= 67.393 )
			if( lower_1 <= 66.3188 )
				if( lower_2 <= 65.9871 )
					if( basis_minus <= 0.284646 )
						if( upper_4 <= 65.6846 )
							if( lower_1 <= 65.4484 )
								if( upper_6 <= 65.7868 )
									ret := 0.000000
								if( upper_6 > 65.7868 )
									ret := 0.250000
							if( lower_1 > 65.4484 )
								if( lower_2 <= 65.4113 )
									ret := -0.611111
								if( lower_2 > 65.4113 )
									ret := -0.040000
						if( upper_4 > 65.6846 )
							ret := -1.000000 // sell
					if( basis_minus > 0.284646 )
						if( lower_4 <= 65.4755 )
							if( lower_6 <= 65.2385 )
								if( upper_6 <= 66.534 )
									ret := 0.199153
								if( upper_6 > 66.534 )
									ret := 0.610738
							if( lower_6 > 65.2385 )
								if( lower_4 <= 65.4746 )
									ret := 1.000000 // buy
								if( lower_4 > 65.4746 )
									ret := 0.750000 // buy
						if( lower_4 > 65.4755 )
							if( upper_2 <= 66.1287 )
								if( lower_1 <= 65.6744 )
									ret := 1.000000 // buy
								if( lower_1 > 65.6744 )
									ret := -0.513274
							if( upper_2 > 66.1287 )
								if( lower_6 <= 65.6958 )
									ret := 0.139619
								if( lower_6 > 65.6958 )
									ret := 0.602564
				if( lower_2 > 65.9871 )
					if( basis_max <= -0.389241 )
						if( upper_1 <= 66.6413 )
							if( basis <= 66.4271 )
								if( basis <= 66.4051 )
									ret := -0.346614
								if( basis > 66.4051 )
									ret := 0.270270
							if( basis > 66.4271 )
								ret := -1.000000 // sell
						if( upper_1 > 66.6413 )
							if( lower_3 <= 66.0507 )
								if( lower_2 <= 66.1163 )
									ret := 0.096491
								if( lower_2 > 66.1163 )
									ret := 0.757576 // buy
							if( lower_3 > 66.0507 )
								if( basis_minus <= 0.864122 )
									ret := -0.714286 // sell
								if( basis_minus > 0.864122 )
									ret := -0.200000
					if( basis_max > -0.389241 )
						if( upper_1 <= 66.2353 )
							if( upper_2 <= 66.2736 )
								if( upper_3 <= 66.2873 )
									ret := 0.030303
								if( upper_3 > 66.2873 )
									ret := 0.428571
							if( upper_2 > 66.2736 )
								ret := -0.600000
						if( upper_1 > 66.2353 )
							if( basis <= 66.1602 )
								ret := 0.500000
							if( basis > 66.1602 )
								if( basis <= 66.1608 )
									ret := 0.875000 // buy
								if( basis > 66.1608 )
									ret := 1.000000 // buy
			if( lower_1 > 66.3188 )
				if( basis <= 66.6457 )
					if( lower_3 <= 66.1165 )
						if( upper_3 <= 67.0504 )
							ret := 1.000000 // buy
						if( upper_3 > 67.0504 )
							if( lower_6 <= 65.4907 )
								if( basis_minus <= 1.15482 )
									ret := 0.753623 // buy
								if( basis_minus > 1.15482 )
									ret := 0.142857
							if( lower_6 > 65.4907 )
								if( lower_3 <= 66.0699 )
									ret := 0.000000
								if( lower_3 > 66.0699 )
									ret := 0.500000
					if( lower_3 > 66.1165 )
						if( lower_1 <= 66.3729 )
							if( lower_2 <= 66.2275 )
								ret := 1.000000 // buy
							if( lower_2 > 66.2275 )
								if( lower_2 <= 66.232 )
									ret := -0.200000
								if( lower_2 > 66.232 )
									ret := -0.833333 // sell
						if( lower_1 > 66.3729 )
							if( basis <= 66.6128 )
								if( basis <= 66.5797 )
									ret := 0.434783
								if( basis > 66.5797 )
									ret := 0.937500 // buy
							if( basis > 66.6128 )
								ret := -0.285714
				if( basis > 66.6457 )
					if( upper_1 <= 66.8951 )
						if( lower_6 <= 65.7411 )
							ret := -0.666667
						if( lower_6 > 65.7411 )
							ret := -1.000000 // sell
					if( upper_1 > 66.8951 )
						if( basis_max <= -1.09215 )
							if( basis_max <= -1.14396 )
								if( upper_6 <= 67.816 )
									ret := 0.000000
								if( upper_6 > 67.816 )
									ret := -0.250000
							if( basis_max > -1.14396 )
								if( lower_1 <= 66.4011 )
									ret := -1.000000 // sell
								if( lower_1 > 66.4011 )
									ret := -0.500000
						if( basis_max > -1.09215 )
							if( basis_max <= -0.823647 )
								if( upper_2 <= 67.1173 )
									ret := 0.704545 // buy
								if( upper_2 > 67.1173 )
									ret := 0.266667
							if( basis_max > -0.823647 )
								if( lower_6 <= 66.7493 )
									ret := 0.166220
								if( lower_6 > 66.7493 )
									ret := 0.893617 // buy
		if( upper_4 > 67.393 )
			if( upper_5 <= 68.1835 )
				if( lower_6 <= 67.6364 )
					if( upper_4 <= 67.3986 )
						if( upper_4 <= 67.3951 )
							if( upper_4 <= 67.3947 )
								if( basis_minus <= 0.564064 )
									ret := -0.714286 // sell
								if( basis_minus > 0.564064 )
									ret := -0.250000
							if( upper_4 > 67.3947 )
								ret := 0.200000
						if( upper_4 > 67.3951 )
							if( upper_4 <= 67.3959 )
								ret := -1.000000 // sell
							if( upper_4 > 67.3959 )
								if( upper_4 <= 67.396 )
									ret := 0.000000
								if( upper_4 > 67.396 )
									ret := -0.769231 // sell
					if( upper_4 > 67.3986 )
						if( lower_2 <= 66.105 )
							if( lower_1 <= 66.2554 )
								ret := 1.000000 // buy
							if( lower_1 > 66.2554 )
								if( basis_minus <= 1.50059 )
									ret := -0.222222
								if( basis_minus > 1.50059 )
									ret := 0.875000 // buy
						if( lower_2 > 66.105 )
							if( upper_6 <= 67.9649 )
								if( basis_max <= -0.714745 )
									ret := 0.173835
								if( basis_max > -0.714745 )
									ret := -0.117450
							if( upper_6 > 67.9649 )
								if( upper_5 <= 67.8065 )
									ret := -0.465909
								if( upper_5 > 67.8065 )
									ret := -0.016444
				if( lower_6 > 67.6364 )
					if( basis <= 67.9066 )
						ret := -1.000000 // sell
					if( basis > 67.9066 )
						ret := -0.500000
			if( upper_5 > 68.1835 )
				if( upper_3 <= 68.0863 )
					if( lower_5 <= 65.9044 )
						if( lower_6 <= 65.5217 )
							ret := -1.000000 // sell
						if( lower_6 > 65.5217 )
							if( upper_4 <= 67.9811 )
								ret := -0.200000
							if( upper_4 > 67.9811 )
								ret := -0.500000
					if( lower_5 > 65.9044 )
						if( basis_max <= -1.53445 )
							ret := 0.000000
						if( basis_max > -1.53445 )
							if( basis_minus <= 1.5043 )
								if( basis_minus <= 0.518403 )
									ret := 0.914894 // buy
								if( basis_minus > 0.518403 )
									ret := 0.343750
							if( basis_minus > 1.5043 )
								if( lower_6 <= 65.5782 )
									ret := 0.900000 // buy
								if( lower_6 > 65.5782 )
									ret := 1.000000 // buy
				if( upper_3 > 68.0863 )
					if( lower_5 <= 66.4503 )
						if( basis_minus <= 2.64775 )
							if( lower_6 <= 65.7462 )
								if( lower_1 <= 67.2631 )
									ret := -0.666667
								if( lower_1 > 67.2631 )
									ret := -0.238095
							if( lower_6 > 65.7462 )
								if( basis_max <= -1.62039 )
									ret := 0.558140
								if( basis_max > -1.62039 )
									ret := -0.071429
						if( basis_minus > 2.64775 )
							if( basis <= 70.1201 )
								if( lower_4 <= 66.6403 )
									ret := 0.571429
								if( lower_4 > 66.6403 )
									ret := 0.870000 // buy
							if( basis > 70.1201 )
								if( basis_minus <= 5.03209 )
									ret := 0.375000
								if( basis_minus > 5.03209 )
									ret := -1.000000 // sell
					if( lower_5 > 66.4503 )
						if( basis_minus <= 3.54579 )
							if( basis_max <= -2.62527 )
								if( lower_4 <= 67.1249 )
									ret := 0.422222
								if( lower_4 > 67.1249 )
									ret := -0.268765
							if( basis_max > -2.62527 )
								if( basis_max <= -1.0635 )
									ret := 0.118439
								if( basis_max > -1.0635 )
									ret := 0.044426
						if( basis_minus > 3.54579 )
							if( lower_5 <= 66.4539 )
								ret := 0.000000
							if( lower_5 > 66.4539 )
								if( lower_3 <= 67.9024 )
									ret := -0.984615 // sell
								if( lower_3 > 67.9024 )
									ret := -0.818182 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_PYPL_1Min_aeaf3fa0(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)

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


