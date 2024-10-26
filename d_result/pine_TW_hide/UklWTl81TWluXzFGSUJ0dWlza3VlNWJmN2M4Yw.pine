//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: RIVN_5Min_1FIB_e5bf7c8c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RIVN_5Min_1FIB_e5bf7c8c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RIVN_5Min_e5bf7c8c(basis, upper_2, upper_3, lower_2, lower_6, lower_1, basis_minus, lower_3, upper_6, lower_5, lower_4, upper_5, upper_4, basis_max, upper_1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( basis <= 10.353 )
		if( upper_3 <= 10.0241 )
			if( lower_3 <= 8.87188 )
				if( lower_1 <= 8.86449 )
					if( lower_2 <= 8.71798 )
						if( upper_5 <= 8.76927 )
							if( lower_3 <= 8.3622 )
								if( lower_6 <= 8.1912 )
									ret := 0.555556
								if( lower_6 > 8.1912 )
									ret := -0.666667
							if( lower_3 > 8.3622 )
								if( upper_5 <= 8.70354 )
									ret := 1.000000 // buy
								if( upper_5 > 8.70354 )
									ret := 0.629213
						if( upper_5 > 8.76927 )
							if( basis_max <= -0.211171 )
								if( lower_2 <= 8.44434 )
									ret := -0.210863
								if( lower_2 > 8.44434 )
									ret := 0.166667
							if( basis_max > -0.211171 )
								if( upper_2 <= 8.78737 )
									ret := -0.851852 // sell
								if( upper_2 > 8.78737 )
									ret := -0.040000
					if( lower_2 > 8.71798 )
						if( lower_5 <= 8.58202 )
							if( lower_4 <= 8.60778 )
								if( upper_4 <= 9.29815 )
									ret := 0.000000
								if( upper_4 > 9.29815 )
									ret := -0.500000
							if( lower_4 > 8.60778 )
								if( basis_max <= -0.565957 )
									ret := -0.272727
								if( basis_max > -0.565957 )
									ret := -0.898734 // sell
						if( lower_5 > 8.58202 )
							if( basis_max <= -0.210578 )
								if( lower_6 <= 8.51018 )
									ret := 0.461538
								if( lower_6 > 8.51018 )
									ret := 0.892857 // buy
							if( basis_max > -0.210578 )
								if( basis <= 8.84245 )
									ret := -0.578947
								if( basis > 8.84245 )
									ret := 0.000000
				if( lower_1 > 8.86449 )
					if( upper_1 <= 9.18869 )
						if( lower_5 <= 8.61369 )
							if( upper_4 <= 9.3943 )
								if( basis <= 9.01933 )
									ret := 0.789474 // buy
								if( basis > 9.01933 )
									ret := 1.000000 // buy
							if( upper_4 > 9.3943 )
								ret := 0.222222
						if( lower_5 > 8.61369 )
							if( basis <= 9.0135 )
								ret := -0.692308
							if( basis > 9.0135 )
								if( lower_1 <= 8.91202 )
									ret := 0.000000
								if( lower_1 > 8.91202 )
									ret := 0.619469
					if( upper_1 > 9.18869 )
						if( lower_1 <= 8.97734 )
							if( lower_3 <= 8.84193 )
								if( basis <= 9.08384 )
									ret := -0.085714
								if( basis > 9.08384 )
									ret := -0.361111
							if( lower_3 > 8.84193 )
								if( lower_6 <= 8.60779 )
									ret := -0.846154 // sell
								if( lower_6 > 8.60779 )
									ret := -0.923077 // sell
						if( lower_1 > 8.97734 )
							ret := 0.818182 // buy
			if( lower_3 > 8.87188 )
				if( lower_1 <= 9.02127 )
					if( upper_5 <= 9.40493 )
						if( upper_3 <= 9.2451 )
							if( upper_2 <= 9.1907 )
								ret := -1.000000 // sell
							if( upper_2 > 9.1907 )
								ret := -0.800000 // sell
						if( upper_3 > 9.2451 )
							if( lower_6 <= 8.70276 )
								if( basis <= 9.07191 )
									ret := 0.100000
								if( basis > 9.07191 )
									ret := -0.933333 // sell
							if( lower_6 > 8.70276 )
								ret := 0.500000
					if( upper_5 > 9.40493 )
						if( lower_5 <= 8.76246 )
							if( basis_minus <= 0.466678 )
								ret := -0.900000 // sell
							if( basis_minus > 0.466678 )
								ret := -1.000000 // sell
						if( lower_5 > 8.76246 )
							ret := -1.000000 // sell
				if( lower_1 > 9.02127 )
					if( lower_5 <= 9.09031 )
						if( upper_1 <= 9.36006 )
							if( lower_6 <= 8.81609 )
								if( lower_1 <= 9.13337 )
									ret := 0.130081
								if( lower_1 > 9.13337 )
									ret := 0.916667 // buy
							if( lower_6 > 8.81609 )
								if( lower_3 <= 9.11082 )
									ret := -0.174757
								if( lower_3 > 9.11082 )
									ret := -0.462963
						if( upper_1 > 9.36006 )
							if( lower_3 <= 9.16014 )
								if( upper_1 <= 9.36341 )
									ret := 0.750000 // buy
								if( upper_1 > 9.36341 )
									ret := 0.000000
							if( lower_3 > 9.16014 )
								if( basis_max <= -0.452738 )
									ret := 0.230769
								if( basis_max > -0.452738 )
									ret := 0.880000 // buy
					if( lower_5 > 9.09031 )
						if( upper_6 <= 9.75687 )
							if( upper_6 <= 9.47638 )
								ret := -0.555556
							if( upper_6 > 9.47638 )
								if( lower_4 <= 9.13324 )
									ret := -1.000000 // sell
								if( lower_4 > 9.13324 )
									ret := -0.909091 // sell
						if( upper_6 > 9.75687 )
							if( upper_4 <= 9.65114 )
								ret := 0.928571 // buy
							if( upper_4 > 9.65114 )
								if( basis <= 9.64301 )
									ret := -0.478261
								if( basis > 9.64301 )
									ret := 0.315789
		if( upper_3 > 10.0241 )
			if( upper_6 <= 10.4579 )
				if( lower_3 <= 10.124 )
					if( lower_6 <= 9.86854 )
						if( lower_1 <= 10.0373 )
							if( lower_3 <= 9.38405 )
								if( upper_4 <= 10.1419 )
									ret := 0.777778 // buy
								if( upper_4 > 10.1419 )
									ret := -0.294118
							if( lower_3 > 9.38405 )
								if( lower_4 <= 9.76475 )
									ret := 0.787234 // buy
								if( lower_4 > 9.76475 )
									ret := 0.433460
						if( lower_1 > 10.0373 )
							if( basis_minus <= 0.306575 )
								if( lower_5 <= 9.89625 )
									ret := 0.200000
								if( lower_5 > 9.89625 )
									ret := -0.125000
							if( basis_minus > 0.306575 )
								if( upper_1 <= 10.1988 )
									ret := -0.894737 // sell
								if( upper_1 > 10.1988 )
									ret := -0.153846
					if( lower_6 > 9.86854 )
						if( lower_5 <= 9.9769 )
							if( upper_4 <= 10.2481 )
								ret := 0.666667
							if( upper_4 > 10.2481 )
								if( lower_4 <= 10.0041 )
									ret := 0.961538 // buy
								if( lower_4 > 10.0041 )
									ret := 0.785714 // buy
						if( lower_5 > 9.9769 )
							if( lower_1 <= 10.1355 )
								if( lower_2 <= 10.1015 )
									ret := 0.223602
								if( lower_2 > 10.1015 )
									ret := -0.840000 // sell
							if( lower_1 > 10.1355 )
								if( upper_5 <= 10.3291 )
									ret := 0.941176 // buy
								if( upper_5 > 10.3291 )
									ret := 0.469841
				if( lower_3 > 10.124 )
					if( basis_minus <= 0.194489 )
						if( lower_5 <= 10.2268 )
							if( basis_minus <= 0.171641 )
								if( lower_6 <= 10.1969 )
									ret := -0.271028
								if( lower_6 > 10.1969 )
									ret := 0.093750
							if( basis_minus > 0.171641 )
								if( basis_max <= -0.174054 )
									ret := -0.236842
								if( basis_max > -0.174054 )
									ret := 0.361111
						if( lower_5 > 10.2268 )
							if( lower_1 <= 10.2876 )
								ret := 1.000000 // buy
							if( lower_1 > 10.2876 )
								if( upper_1 <= 10.3481 )
									ret := 0.000000
								if( upper_1 > 10.3481 )
									ret := 0.125000
					if( basis_minus > 0.194489 )
						ret := 1.000000 // buy
			if( upper_6 > 10.4579 )
				if( upper_3 <= 10.3897 )
					if( upper_1 <= 10.1912 )
						if( basis_max <= -0.753393 )
							if( upper_5 <= 10.477 )
								if( basis <= 9.86088 )
									ret := -0.413580
								if( basis > 9.86088 )
									ret := 0.727273 // buy
							if( upper_5 > 10.477 )
								if( upper_4 <= 10.4162 )
									ret := 0.914286 // buy
								if( upper_4 > 10.4162 )
									ret := 0.000000
						if( basis_max > -0.753393 )
							if( lower_3 <= 9.56417 )
								if( basis_minus <= 0.705424 )
									ret := 0.956522 // buy
								if( basis_minus > 0.705424 )
									ret := 0.306122
							if( lower_3 > 9.56417 )
								if( lower_3 <= 9.58629 )
									ret := -0.923077 // sell
								if( lower_3 > 9.58629 )
									ret := 0.196262
					if( upper_1 > 10.1912 )
						if( lower_1 <= 10.0942 )
							if( upper_2 <= 10.2526 )
								if( basis <= 10.1065 )
									ret := -1.000000 // sell
								if( basis > 10.1065 )
									ret := -0.888889 // sell
							if( upper_2 > 10.2526 )
								if( lower_2 <= 10.0195 )
									ret := -0.168421
								if( lower_2 > 10.0195 )
									ret := 0.750000 // buy
						if( lower_1 > 10.0942 )
							if( lower_4 <= 10.0728 )
								if( lower_1 <= 10.1231 )
									ret := -0.742424 // sell
								if( lower_1 > 10.1231 )
									ret := -0.125000
							if( lower_4 > 10.0728 )
								if( basis_max <= -0.23609 )
									ret := -0.903226 // sell
								if( basis_max > -0.23609 )
									ret := -0.142857
				if( upper_3 > 10.3897 )
					if( basis <= 10.0794 )
						if( upper_5 <= 10.7937 )
							if( upper_4 <= 10.5448 )
								ret := 1.000000 // buy
							if( upper_4 > 10.5448 )
								if( upper_5 <= 10.745 )
									ret := 0.634615
								if( upper_5 > 10.745 )
									ret := 1.000000 // buy
						if( upper_5 > 10.7937 )
							ret := 0.285714
					if( basis > 10.0794 )
						if( upper_6 <= 10.5343 )
							if( basis_max <= -0.136583 )
								if( upper_2 <= 10.4179 )
									ret := 0.945205 // buy
								if( upper_2 > 10.4179 )
									ret := 0.545455
							if( basis_max > -0.136583 )
								ret := 0.200000
						if( upper_6 > 10.5343 )
							if( lower_4 <= 9.52628 )
								if( upper_1 <= 10.4371 )
									ret := 1.000000 // buy
								if( upper_1 > 10.4371 )
									ret := 0.756757 // buy
							if( lower_4 > 9.52628 )
								if( basis <= 10.2998 )
									ret := -0.078235
								if( basis > 10.2998 )
									ret := 0.327198
	if( basis > 10.353 )
		if( basis_minus <= 0.168204 )
			if( basis <= 10.4895 )
				if( basis <= 10.3641 )
					if( lower_2 <= 10.2998 )
						if( upper_3 <= 10.4404 )
							ret := 0.888889 // buy
						if( upper_3 > 10.4404 )
							ret := 1.000000 // buy
					if( lower_2 > 10.2998 )
						ret := 0.333333
				if( basis > 10.3641 )
					if( upper_2 <= 10.4368 )
						if( upper_2 <= 10.4276 )
							ret := -0.727273 // sell
						if( upper_2 > 10.4276 )
							ret := -1.000000 // sell
					if( upper_2 > 10.4368 )
						if( lower_6 <= 10.3173 )
							if( basis_max <= -0.120324 )
								if( basis <= 10.4359 )
									ret := 0.611111
								if( basis > 10.4359 )
									ret := 1.000000 // buy
							if( basis_max > -0.120324 )
								ret := 0.000000
						if( lower_6 > 10.3173 )
							if( upper_1 <= 10.4767 )
								if( lower_5 <= 10.349 )
									ret := -0.583333
								if( lower_5 > 10.349 )
									ret := -0.210526
							if( upper_1 > 10.4767 )
								ret := -0.650000
			if( basis > 10.4895 )
				if( upper_5 <= 11.3156 )
					if( upper_4 <= 10.5879 )
						ret := 1.000000 // buy
					if( upper_4 > 10.5879 )
						if( lower_5 <= 10.9479 )
							ret := 0.687500
						if( lower_5 > 10.9479 )
							if( lower_4 <= 10.9729 )
								ret := 1.000000 // buy
							if( lower_4 > 10.9729 )
								ret := 0.923077 // buy
				if( upper_5 > 11.3156 )
					if( lower_2 <= 11.6862 )
						if( upper_2 <= 11.2621 )
							ret := -1.000000 // sell
						if( upper_2 > 11.2621 )
							if( lower_2 <= 11.6792 )
								ret := -0.153846
							if( lower_2 > 11.6792 )
								ret := 0.000000
					if( lower_2 > 11.6862 )
						if( upper_5 <= 16.0865 )
							if( lower_1 <= 12.4587 )
								if( upper_5 <= 11.8434 )
									ret := 1.000000 // buy
								if( upper_5 > 11.8434 )
									ret := 0.750000 // buy
							if( lower_1 > 12.4587 )
								ret := 1.000000 // buy
						if( upper_5 > 16.0865 )
							if( upper_6 <= 16.1286 )
								ret := -0.083333
							if( upper_6 > 16.1286 )
								ret := 0.272727
		if( basis_minus > 0.168204 )
			if( lower_5 <= 9.79383 )
				if( lower_5 <= 9.40448 )
					if( lower_1 <= 12.9197 )
						if( lower_1 <= 10.039 )
							if( basis_max <= -1.48318 )
								if( upper_4 <= 11.3343 )
									ret := 0.454545
								if( upper_4 > 11.3343 )
									ret := 0.000000
							if( basis_max > -1.48318 )
								if( basis <= 10.3757 )
									ret := -0.368421
								if( basis > 10.3757 )
									ret := -0.867647 // sell
						if( lower_1 > 10.039 )
							if( lower_6 <= 6.52521 )
								if( upper_2 <= 18.0166 )
									ret := -1.000000 // sell
								if( upper_2 > 18.0166 )
									ret := -0.454545
							if( lower_6 > 6.52521 )
								if( basis_minus <= 8.25313 )
									ret := 0.295732
								if( basis_minus > 8.25313 )
									ret := 0.950820 // buy
					if( lower_1 > 12.9197 )
						if( basis_minus <= 8.25615 )
							if( basis_max <= -8.16435 )
								ret := 0.285714
							if( basis_max > -8.16435 )
								if( lower_1 <= 13.2184 )
									ret := -0.687500
								if( lower_1 > 13.2184 )
									ret := 0.000000
						if( basis_minus > 8.25615 )
							ret := -1.000000 // sell
				if( lower_5 > 9.40448 )
					if( lower_5 <= 9.57164 )
						if( basis <= 10.3945 )
							if( lower_1 <= 10.0995 )
								if( upper_5 <= 11.2532 )
									ret := -1.000000 // sell
								if( upper_5 > 11.2532 )
									ret := -0.500000
							if( lower_1 > 10.0995 )
								if( upper_5 <= 11.2327 )
									ret := 0.142857
								if( upper_5 > 11.2327 )
									ret := 0.307692
						if( basis > 10.3945 )
							if( upper_3 <= 11.3763 )
								if( upper_5 <= 11.6077 )
									ret := -0.909091 // sell
								if( upper_5 > 11.6077 )
									ret := 0.000000
							if( upper_3 > 11.3763 )
								if( lower_5 <= 9.46055 )
									ret := -0.923077 // sell
								if( lower_5 > 9.46055 )
									ret := -1.000000 // sell
					if( lower_5 > 9.57164 )
						if( lower_5 <= 9.57764 )
							ret := 1.000000 // buy
						if( lower_5 > 9.57764 )
							if( basis <= 10.4703 )
								if( basis_minus <= 1.08259 )
									ret := -0.470588
								if( basis_minus > 1.08259 )
									ret := 0.911765 // buy
							if( basis > 10.4703 )
								if( upper_5 <= 11.3414 )
									ret := -0.844828 // sell
								if( upper_5 > 11.3414 )
									ret := -0.318885
			if( lower_5 > 9.79383 )
				if( basis_minus <= 0.736073 )
					if( upper_4 <= 11.4149 )
						if( upper_5 <= 10.8465 )
							if( lower_6 <= 9.78871 )
								if( upper_2 <= 10.5962 )
									ret := -0.500000
								if( upper_2 > 10.5962 )
									ret := -0.978723 // sell
							if( lower_6 > 9.78871 )
								if( basis <= 10.6092 )
									ret := -0.106232
								if( basis > 10.6092 )
									ret := 0.921053 // buy
						if( upper_5 > 10.8465 )
							if( upper_2 <= 11.2704 )
								if( lower_2 <= 10.6133 )
									ret := 0.164316
								if( lower_2 > 10.6133 )
									ret := 0.030367
							if( upper_2 > 11.2704 )
								if( lower_2 <= 10.9204 )
									ret := 0.888889 // buy
								if( lower_2 > 10.9204 )
									ret := 0.230337
					if( upper_4 > 11.4149 )
						if( lower_3 <= 11.9284 )
							if( upper_4 <= 12.0197 )
								if( upper_6 <= 11.6756 )
									ret := -0.236842
								if( upper_6 > 11.6756 )
									ret := 0.030239
							if( upper_4 > 12.0197 )
								if( lower_2 <= 11.7486 )
									ret := -0.513859
								if( lower_2 > 11.7486 )
									ret := -0.281674
						if( lower_3 > 11.9284 )
							if( lower_4 <= 16.5785 )
								if( basis_minus <= 0.434565 )
									ret := 0.060751
								if( basis_minus > 0.434565 )
									ret := -0.042775
							if( lower_4 > 16.5785 )
								if( upper_3 <= 17.239 )
									ret := -0.405117
								if( upper_3 > 17.239 )
									ret := -0.061231
				if( basis_minus > 0.736073 )
					if( lower_2 <= 26.5574 )
						if( basis_max <= -3.66042 )
							if( lower_1 <= 14.0044 )
								if( basis <= 14.3331 )
									ret := -0.194805
								if( basis > 14.3331 )
									ret := -0.929577 // sell
							if( lower_1 > 14.0044 )
								if( basis <= 15.5376 )
									ret := 0.645161
								if( basis > 15.5376 )
									ret := -0.178707
						if( basis_max > -3.66042 )
							if( lower_6 <= 9.83314 )
								if( upper_5 <= 12.4294 )
									ret := 0.340949
								if( upper_5 > 12.4294 )
									ret := -0.302326
							if( lower_6 > 9.83314 )
								if( upper_1 <= 11.0081 )
									ret := -0.486339
								if( upper_1 > 11.0081 )
									ret := 0.032041
					if( lower_2 > 26.5574 )
						if( upper_4 <= 28.1302 )
							if( basis_max <= -0.746209 )
								if( basis_minus <= 1.29703 )
									ret := -0.458647
								if( basis_minus > 1.29703 )
									ret := -0.066667
							if( basis_max > -0.746209 )
								if( lower_2 <= 26.7783 )
									ret := 0.100000
								if( lower_2 > 26.7783 )
									ret := 0.923077 // buy
						if( upper_4 > 28.1302 )
							if( upper_4 <= 28.1626 )
								ret := -1.000000 // sell
							if( upper_4 > 28.1626 )
								ret := -0.764706 // sell
	
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
float op_operation = decision_tree_0_RIVN_5Min_e5bf7c8c(basis, upper_2, upper_3, lower_2, lower_6, lower_1, basis_minus, lower_3, upper_6, lower_5, lower_4, upper_5, upper_4, basis_max, upper_1)

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


