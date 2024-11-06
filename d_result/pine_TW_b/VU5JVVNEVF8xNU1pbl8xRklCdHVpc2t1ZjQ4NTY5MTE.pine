//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: UNIUSDT_15Min_1FIB_f4856911 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_1FIB_f4856911", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_f4856911(lower_6, lower_3, basis_max, lower_1, upper_2, upper_6, upper_4, lower_2, basis_minus, upper_3, lower_5, upper_1, lower_4, basis, upper_5)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( upper_1 <= 6.18454 )
		if( upper_1 <= 3.85376 )
			if( lower_5 <= 3.42604 )
				if( basis_max <= -0.315588 )
					if( lower_1 <= 3.6031 )
						if( upper_5 <= 3.88671 )
							if( upper_5 <= 3.88606 )
								if( basis_max <= -0.322263 )
									ret := 0.750000 // buy
								if( basis_max > -0.322263 )
									ret := 1.000000 // buy
							if( upper_5 > 3.88606 )
								ret := 0.250000
						if( upper_5 > 3.88671 )
							if( lower_2 <= 3.52838 )
								ret := 1.000000 // buy
							if( lower_2 > 3.52838 )
								if( lower_5 <= 3.33932 )
									ret := 0.750000 // buy
								if( lower_5 > 3.33932 )
									ret := 1.000000 // buy
					if( lower_1 > 3.6031 )
						if( lower_1 <= 3.6074 )
							if( lower_2 <= 3.53228 )
								if( lower_1 <= 3.60469 )
									ret := 1.000000 // buy
								if( lower_1 > 3.60469 )
									ret := -0.166667
							if( lower_2 > 3.53228 )
								if( upper_4 <= 4.03314 )
									ret := -0.166667
								if( upper_4 > 4.03314 )
									ret := -0.900000 // sell
						if( lower_1 > 3.6074 )
							if( lower_1 <= 3.60815 )
								if( upper_5 <= 4.10989 )
									ret := -0.600000
								if( upper_5 > 4.10989 )
									ret := 0.846154 // buy
							if( lower_1 > 3.60815 )
								if( lower_2 <= 3.55303 )
									ret := 0.881356 // buy
								if( lower_2 > 3.55303 )
									ret := 1.000000 // buy
				if( basis_max > -0.315588 )
					if( upper_1 <= 3.72006 )
						ret := 1.000000 // buy
					if( upper_1 > 3.72006 )
						if( upper_4 <= 3.84775 )
							if( lower_4 <= 3.46138 )
								if( basis_max <= -0.314487 )
									ret := -0.444444
								if( basis_max > -0.314487 )
									ret := 0.777778 // buy
							if( lower_4 > 3.46138 )
								ret := -1.000000 // sell
						if( upper_4 > 3.84775 )
							ret := 1.000000 // buy
			if( lower_5 > 3.42604 )
				if( upper_3 <= 3.8239 )
					if( upper_1 <= 3.72876 )
						ret := -0.750000 // sell
					if( upper_1 > 3.72876 )
						ret := -1.000000 // sell
				if( upper_3 > 3.8239 )
					if( lower_2 <= 3.5591 )
						if( lower_6 <= 3.35805 )
							ret := 1.000000 // buy
						if( lower_6 > 3.35805 )
							ret := 0.400000
					if( lower_2 > 3.5591 )
						if( lower_1 <= 3.61509 )
							if( upper_5 <= 3.93439 )
								ret := -0.750000 // sell
							if( upper_5 > 3.93439 )
								ret := -1.000000 // sell
						if( lower_1 > 3.61509 )
							ret := -0.250000
		if( upper_1 > 3.85376 )
			if( basis <= 5.79126 )
				if( basis_max <= -1.66445 )
					if( lower_3 <= 4.04732 )
						if( upper_2 <= 5.84307 )
							ret := 0.000000
						if( upper_2 > 5.84307 )
							ret := -1.000000 // sell
					if( lower_3 > 4.04732 )
						if( basis <= 5.03005 )
							if( lower_4 <= 3.91531 )
								if( lower_2 <= 4.30116 )
									ret := 0.884615 // buy
								if( lower_2 > 4.30116 )
									ret := 1.000000 // buy
							if( lower_4 > 3.91531 )
								ret := 0.500000
						if( basis > 5.03005 )
							if( lower_6 <= 2.99186 )
								if( lower_5 <= 3.48302 )
									ret := 0.900000 // buy
								if( lower_5 > 3.48302 )
									ret := 1.000000 // buy
							if( lower_6 > 2.99186 )
								if( upper_6 <= 7.38745 )
									ret := 0.169231
								if( upper_6 > 7.38745 )
									ret := 0.769231 // buy
				if( basis_max > -1.66445 )
					if( upper_1 <= 5.85593 )
						if( basis_minus <= 0.147523 )
							if( upper_4 <= 5.35982 )
								if( upper_5 <= 5.37863 )
									ret := 0.021402
								if( upper_5 > 5.37863 )
									ret := 0.925926 // buy
							if( upper_4 > 5.35982 )
								if( basis_max <= -0.107265 )
									ret := -0.107206
								if( basis_max > -0.107265 )
									ret := -0.412903
						if( basis_minus > 0.147523 )
							if( upper_1 <= 3.94823 )
								if( upper_1 <= 3.89414 )
									ret := 0.081633
								if( upper_1 > 3.89414 )
									ret := -0.680000
							if( upper_1 > 3.94823 )
								if( basis <= 5.67733 )
									ret := 0.073870
								if( basis > 5.67733 )
									ret := 0.260274
					if( upper_1 > 5.85593 )
						if( upper_6 <= 7.26562 )
							if( lower_3 <= 4.92551 )
								if( lower_5 <= 4.55579 )
									ret := 0.579710
								if( lower_5 > 4.55579 )
									ret := -1.000000 // sell
							if( lower_3 > 4.92551 )
								if( upper_1 <= 6.11267 )
									ret := -0.192744
								if( upper_1 > 6.11267 )
									ret := 1.000000 // buy
						if( upper_6 > 7.26562 )
							if( lower_1 <= 5.33925 )
								if( lower_2 <= 5.0993 )
									ret := -0.800000 // sell
								if( lower_2 > 5.0993 )
									ret := 0.857143 // buy
							if( lower_1 > 5.33925 )
								if( lower_4 <= 4.81215 )
									ret := -0.950000 // sell
								if( lower_4 > 4.81215 )
									ret := -0.428571
			if( basis > 5.79126 )
				if( basis_max <= -0.266489 )
					if( upper_1 <= 6.01531 )
						if( upper_3 <= 5.98748 )
							if( upper_2 <= 5.9336 )
								if( lower_5 <= 5.56095 )
									ret := 0.965517 // buy
								if( lower_5 > 5.56095 )
									ret := 0.257143
							if( upper_2 > 5.9336 )
								if( lower_5 <= 5.62053 )
									ret := -0.606383
								if( lower_5 > 5.62053 )
									ret := 0.500000
						if( upper_3 > 5.98748 )
							if( lower_6 <= 5.59542 )
								if( upper_6 <= 6.1982 )
									ret := 0.618297
								if( upper_6 > 6.1982 )
									ret := 0.326450
							if( lower_6 > 5.59542 )
								if( basis_max <= -0.273792 )
									ret := -0.227545
								if( basis_max > -0.273792 )
									ret := 0.611111
					if( upper_1 > 6.01531 )
						if( basis <= 6.0696 )
							if( lower_4 <= 5.7729 )
								if( lower_2 <= 5.86228 )
									ret := 0.110429
								if( lower_2 > 5.86228 )
									ret := -0.427273
							if( lower_4 > 5.7729 )
								if( upper_5 <= 6.33254 )
									ret := 0.219373
								if( upper_5 > 6.33254 )
									ret := 0.606742
						if( basis > 6.0696 )
							if( lower_6 <= 5.8264 )
								if( lower_2 <= 5.92669 )
									ret := 0.050000
								if( lower_2 > 5.92669 )
									ret := -0.320000
							if( lower_6 > 5.8264 )
								if( lower_2 <= 6.00188 )
									ret := 1.000000 // buy
								if( lower_2 > 6.00188 )
									ret := -0.250000
				if( basis_max > -0.266489 )
					if( basis_max <= -0.145372 )
						if( upper_4 <= 6.27076 )
							if( upper_1 <= 5.85214 )
								if( upper_1 <= 5.84931 )
									ret := 0.263158
								if( upper_1 > 5.84931 )
									ret := 0.864865 // buy
							if( upper_1 > 5.85214 )
								if( lower_4 <= 5.7712 )
									ret := -0.123312
								if( lower_4 > 5.7712 )
									ret := 0.048725
						if( upper_4 > 6.27076 )
							if( upper_1 <= 6.18411 )
								if( basis <= 6.12763 )
									ret := 0.532609
								if( basis > 6.12763 )
									ret := 0.971429 // buy
							if( upper_1 > 6.18411 )
								if( upper_4 <= 6.27527 )
									ret := 1.000000 // buy
								if( upper_4 > 6.27527 )
									ret := -0.428571
					if( basis_max > -0.145372 )
						if( basis_minus <= 0.120111 )
							if( basis_minus <= 0.096586 )
								ret := 0.000000
							if( basis_minus > 0.096586 )
								if( lower_3 <= 6.11141 )
									ret := 0.512821
								if( lower_3 > 6.11141 )
									ret := 1.000000 // buy
						if( basis_minus > 0.120111 )
							if( upper_3 <= 6.21543 )
								if( upper_6 <= 6.09153 )
									ret := 0.305825
								if( upper_6 > 6.09153 )
									ret := 0.084291
							if( upper_3 > 6.21543 )
								if( lower_1 <= 6.10893 )
									ret := 1.000000 // buy
								if( lower_1 > 6.10893 )
									ret := 0.750000 // buy
	if( upper_1 > 6.18454 )
		if( lower_3 <= 6.04207 )
			if( lower_5 <= 4.81039 )
				if( basis <= 5.9354 )
					if( upper_3 <= 6.57849 )
						ret := 0.500000
					if( upper_3 > 6.57849 )
						if( lower_4 <= 4.79241 )
							if( lower_2 <= 5.19246 )
								if( upper_3 <= 6.67237 )
									ret := 1.000000 // buy
								if( upper_3 > 6.67237 )
									ret := 0.800000 // buy
							if( lower_2 > 5.19246 )
								ret := 0.250000
						if( lower_4 > 4.79241 )
							ret := 1.000000 // buy
				if( basis > 5.9354 )
					if( upper_1 <= 6.39821 )
						ret := -0.285714
					if( upper_1 > 6.39821 )
						if( basis_max <= -1.75688 )
							if( upper_2 <= 6.69298 )
								ret := 0.750000 // buy
							if( upper_2 > 6.69298 )
								ret := 1.000000 // buy
						if( basis_max > -1.75688 )
							if( lower_4 <= 4.99662 )
								ret := 0.000000
							if( lower_4 > 4.99662 )
								ret := 0.857143 // buy
			if( lower_5 > 4.81039 )
				if( lower_4 <= 5.47313 )
					if( lower_5 <= 4.94206 )
						ret := -1.000000 // sell
					if( lower_5 > 4.94206 )
						if( lower_2 <= 5.59557 )
							if( basis_minus <= 1.16645 )
								if( basis <= 5.97093 )
									ret := -1.000000 // sell
								if( basis > 5.97093 )
									ret := -0.291667
							if( basis_minus > 1.16645 )
								if( lower_6 <= 4.74035 )
									ret := 0.230769
								if( lower_6 > 4.74035 )
									ret := 0.928571 // buy
						if( lower_2 > 5.59557 )
							if( lower_4 <= 5.22116 )
								ret := 1.000000 // buy
							if( lower_4 > 5.22116 )
								if( lower_3 <= 5.62818 )
									ret := -0.528571
								if( lower_3 > 5.62818 )
									ret := 0.666667
				if( lower_4 > 5.47313 )
					if( lower_5 <= 5.37695 )
						if( lower_4 <= 5.48641 )
							if( upper_2 <= 6.40059 )
								if( basis_max <= -0.912313 )
									ret := -1.000000 // sell
								if( basis_max > -0.912313 )
									ret := 0.333333
							if( upper_2 > 6.40059 )
								if( lower_2 <= 5.69978 )
									ret := 1.000000 // buy
								if( lower_2 > 5.69978 )
									ret := -0.062500
						if( lower_4 > 5.48641 )
							if( lower_4 <= 5.51891 )
								if( lower_3 <= 5.60632 )
									ret := 0.588235
								if( lower_3 > 5.60632 )
									ret := 0.884615 // buy
							if( lower_4 > 5.51891 )
								if( lower_1 <= 6.08727 )
									ret := -0.200000
								if( lower_1 > 6.08727 )
									ret := 0.416667
					if( lower_5 > 5.37695 )
						if( upper_6 <= 7.69767 )
							if( upper_4 <= 7.23538 )
								if( basis <= 6.46663 )
									ret := -0.050107
								if( basis > 6.46663 )
									ret := -0.646018
							if( upper_4 > 7.23538 )
								if( upper_6 <= 7.69499 )
									ret := 0.823529 // buy
								if( upper_6 > 7.69499 )
									ret := -0.214286
						if( upper_6 > 7.69767 )
							if( lower_5 <= 5.68849 )
								if( upper_2 <= 6.98309 )
									ret := 0.000000
								if( upper_2 > 6.98309 )
									ret := -0.857143 // sell
							if( lower_5 > 5.68849 )
								ret := 0.000000
		if( lower_3 > 6.04207 )
			if( basis_minus <= 0.171372 )
				if( lower_6 <= 6.04554 )
					if( lower_3 <= 6.07236 )
						if( lower_5 <= 6.02031 )
							ret := 0.500000
						if( lower_5 > 6.02031 )
							ret := 0.000000
					if( lower_3 > 6.07236 )
						if( upper_1 <= 6.1909 )
							if( basis <= 6.15951 )
								if( lower_1 <= 6.11531 )
									ret := -0.500000
								if( lower_1 > 6.11531 )
									ret := 0.019608
							if( basis > 6.15951 )
								ret := -1.000000 // sell
						if( upper_1 > 6.1909 )
							if( upper_4 <= 6.26568 )
								if( lower_4 <= 6.08008 )
									ret := -0.723077 // sell
								if( lower_4 > 6.08008 )
									ret := -1.000000 // sell
							if( upper_4 > 6.26568 )
								if( basis_max <= -0.147583 )
									ret := 0.040000
								if( basis_max > -0.147583 )
									ret := -0.833333 // sell
				if( lower_6 > 6.04554 )
					if( lower_1 <= 6.24791 )
						if( basis <= 6.27554 )
							if( lower_3 <= 6.11642 )
								if( lower_6 <= 6.05789 )
									ret := 0.000000
								if( lower_6 > 6.05789 )
									ret := 0.840000 // buy
							if( lower_3 > 6.11642 )
								if( lower_3 <= 6.11963 )
									ret := -0.500000
								if( lower_3 > 6.11963 )
									ret := -0.023715
						if( basis > 6.27554 )
							if( lower_2 <= 6.222 )
								if( upper_6 <= 6.42743 )
									ret := 1.000000 // buy
								if( upper_6 > 6.42743 )
									ret := 0.857143 // buy
							if( lower_2 > 6.222 )
								if( lower_6 <= 6.13289 )
									ret := 0.086957
								if( lower_6 > 6.13289 )
									ret := 0.923077 // buy
					if( lower_1 > 6.24791 )
						if( upper_2 <= 6.34358 )
							if( upper_1 <= 6.31866 )
								ret := 0.200000
							if( upper_1 > 6.31866 )
								if( lower_2 <= 6.2351 )
									ret := -1.000000 // sell
								if( lower_2 > 6.2351 )
									ret := -0.416667
						if( upper_2 > 6.34358 )
							if( upper_6 <= 6.47835 )
								if( basis_minus <= 0.123098 )
									ret := 0.800000 // buy
								if( basis_minus > 0.123098 )
									ret := 0.083333
							if( upper_6 > 6.47835 )
								if( upper_6 <= 8.09535 )
									ret := -0.191460
								if( upper_6 > 8.09535 )
									ret := 0.500000
			if( basis_minus > 0.171372 )
				if( basis <= 6.23492 )
					if( lower_5 <= 5.99227 )
						if( lower_6 <= 5.9021 )
							if( lower_6 <= 5.88715 )
								if( basis_max <= -0.344517 )
									ret := 0.131579
								if( basis_max > -0.344517 )
									ret := -0.636364
							if( lower_6 > 5.88715 )
								if( upper_1 <= 6.28942 )
									ret := 0.738095 // buy
								if( upper_1 > 6.28942 )
									ret := 0.324561
						if( lower_6 > 5.9021 )
							if( basis_max <= -0.312626 )
								if( lower_4 <= 6.02335 )
									ret := -0.333333
								if( lower_4 > 6.02335 )
									ret := 0.486486
							if( basis_max > -0.312626 )
								if( upper_5 <= 6.34624 )
									ret := 0.162162
								if( upper_5 > 6.34624 )
									ret := -0.467456
					if( lower_5 > 5.99227 )
						if( lower_4 <= 6.06092 )
							if( lower_2 <= 6.09718 )
								if( upper_4 <= 6.29613 )
									ret := 0.392157
								if( upper_4 > 6.29613 )
									ret := -0.213115
							if( lower_2 > 6.09718 )
								if( upper_1 <= 6.21777 )
									ret := 0.000000
								if( upper_1 > 6.21777 )
									ret := 0.558201
						if( lower_4 > 6.06092 )
							if( lower_3 <= 6.09564 )
								if( basis <= 6.18189 )
									ret := 0.285714
								if( basis > 6.18189 )
									ret := -0.508197
							if( lower_3 > 6.09564 )
								if( upper_3 <= 6.33662 )
									ret := 0.000000
								if( upper_3 > 6.33662 )
									ret := 0.500000
				if( basis > 6.23492 )
					if( upper_1 <= 6.35131 )
						if( upper_2 <= 6.34781 )
							if( upper_3 <= 6.34706 )
								if( basis_minus <= 0.212697 )
									ret := -0.888889 // sell
								if( basis_minus > 0.212697 )
									ret := -0.300000
							if( upper_3 > 6.34706 )
								if( lower_2 <= 6.16446 )
									ret := 0.345679
								if( lower_2 > 6.16446 )
									ret := 0.056075
						if( upper_2 > 6.34781 )
							if( lower_1 <= 6.18221 )
								if( lower_4 <= 6.05738 )
									ret := -0.110588
								if( lower_4 > 6.05738 )
									ret := 0.154545
							if( lower_1 > 6.18221 )
								if( basis_max <= -0.230301 )
									ret := -0.345700
								if( basis_max > -0.230301 )
									ret := 0.271186
					if( upper_1 > 6.35131 )
						if( upper_1 <= 6.46662 )
							if( upper_2 <= 6.44508 )
								if( upper_2 <= 6.43521 )
									ret := 0.105721
								if( upper_2 > 6.43521 )
									ret := -0.157509
							if( upper_2 > 6.44508 )
								if( lower_1 <= 6.18835 )
									ret := 0.729412 // buy
								if( lower_1 > 6.18835 )
									ret := 0.216159
						if( upper_1 > 6.46662 )
							if( lower_6 <= 4.47589 )
								if( lower_1 <= 9.59408 )
									ret := -1.000000 // sell
								if( lower_1 > 9.59408 )
									ret := -0.500000
							if( lower_6 > 4.47589 )
								if( basis_max <= -1.49101 )
									ret := 0.127088
								if( basis_max > -1.49101 )
									ret := 0.026556
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_UNIUSDT_15Min_f4856911(lower_6, lower_3, basis_max, lower_1, upper_2, upper_6, upper_4, lower_2, basis_minus, upper_3, lower_5, upper_1, lower_4, basis, upper_5)

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


