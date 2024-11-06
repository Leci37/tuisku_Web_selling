//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: RUN_15Min_2BS0_01c07730 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RUN_15Min_2BS0_01c07730", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RUN_15Min_01c07730(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= 0.248921 )
		if( d_k <= 25.032 )
			if( bbm <= 0.244965 )
				if( bbp <= -0.696337 )
					if( rsi1 <= 34.0672 )
						if( rsi1 <= 3.01058 )
							if( bullPower <= -0.606897 )
								ret := -1.000000 // sell
							if( bullPower > -0.606897 )
								if( smoothD_d <= 0.092819 )
									ret := 0.090909
								if( smoothD_d > 0.092819 )
									ret := -0.833333 // sell
						if( rsi1 > 3.01058 )
							if( rsi1 <= 12.0881 )
								if( smoothD_d <= -2.83245 )
									ret := -0.500000
								if( smoothD_d > -2.83245 )
									ret := 0.555556
							if( rsi1 > 12.0881 )
								if( bbm <= 0.128035 )
									ret := 0.346519
								if( bbm > 0.128035 )
									ret := 0.154412
					if( rsi1 > 34.0672 )
						if( rsi1 <= 45.695 )
							if( d_k <= -11.1749 )
								if( k <= 82.8101 )
									ret := -0.800000 // sell
								if( k > 82.8101 )
									ret := 0.000000
							if( d_k > -11.1749 )
								if( d_k <= -7.80619 )
									ret := 0.714286 // buy
								if( d_k > -7.80619 )
									ret := -0.034325
						if( rsi1 > 45.695 )
							if( rsi1 <= 48.6074 )
								if( smoothD_d <= 81.1821 )
									ret := 0.800000 // buy
								if( smoothD_d > 81.1821 )
									ret := 0.142857
							if( rsi1 > 48.6074 )
								if( k <= 79.0234 )
									ret := -0.210526
								if( k > 79.0234 )
									ret := 0.583333
				if( bbp > -0.696337 )
					if( smoothD_d <= -2.59916 )
						if( d_k <= 0.002005 )
							if( bullPower <= -0.078342 )
								if( rsi1 <= 39.4907 )
									ret := 0.052632
								if( rsi1 > 39.4907 )
									ret := 0.909091 // buy
							if( bullPower > -0.078342 )
								if( smoothD_d <= -2.73582 )
									ret := 0.364641
								if( smoothD_d > -2.73582 )
									ret := -0.090909
						if( d_k > 0.002005 )
							if( bbm <= 0.051922 )
								if( rsi1 <= 39.0005 )
									ret := 0.884615 // buy
								if( rsi1 > 39.0005 )
									ret := 0.250000
							if( bbm > 0.051922 )
								if( d_k <= 0.018155 )
									ret := 1.000000 // buy
								if( d_k > 0.018155 )
									ret := 0.234043
					if( smoothD_d > -2.59916 )
						if( smoothD_d <= 95.2794 )
							if( smoothD_d <= 3.47067 )
								if( smoothD_d <= 1.48929 )
									ret := 0.054457
								if( smoothD_d > 1.48929 )
									ret := 0.209135
							if( smoothD_d > 3.47067 )
								if( d_k <= 23.7965 )
									ret := 0.057604
								if( d_k > 23.7965 )
									ret := -0.198556
						if( smoothD_d > 95.2794 )
							if( bullPower <= 0.060591 )
								if( bearPower <= 0.029852 )
									ret := 0.064140
								if( bearPower > 0.029852 )
									ret := 0.333333
							if( bullPower > 0.060591 )
								if( bearPower <= -0.045782 )
									ret := 0.750000 // buy
								if( bearPower > -0.045782 )
									ret := 0.250000
			if( bbm > 0.244965 )
				if( bearPower <= -1.86895 )
					if( d <= 2.3512 )
						if( bbm <= 0.523308 )
							ret := 1.000000 // buy
						if( bbm > 0.523308 )
							if( k <= 2.82133 )
								if( bbm <= 1.68505 )
									ret := -0.340659
								if( bbm > 1.68505 )
									ret := 0.833333 // buy
							if( k > 2.82133 )
								if( smoothK_k <= 1.36592 )
									ret := 0.444444
								if( smoothK_k > 1.36592 )
									ret := 1.000000 // buy
					if( d > 2.3512 )
						if( smoothK_k <= -1.37676 )
							if( bullPower <= -0.891144 )
								if( bbp <= -3.1922 )
									ret := 0.860000 // buy
								if( bbp > -3.1922 )
									ret := 0.555556
							if( bullPower > -0.891144 )
								if( bbp <= -2.63402 )
									ret := -0.500000
								if( bbp > -2.63402 )
									ret := 0.750000 // buy
						if( smoothK_k > -1.37676 )
							if( rsi1 <= 16.4081 )
								if( bullPower <= -0.480549 )
									ret := -0.482759
								if( bullPower > -0.480549 )
									ret := 0.750000 // buy
							if( rsi1 > 16.4081 )
								if( d <= 13.1718 )
									ret := 0.606383
								if( d > 13.1718 )
									ret := 0.226744
				if( bearPower > -1.86895 )
					if( bearPower <= -0.32911 )
						if( rsi1 <= 31.7515 )
							if( smoothD_d <= 59.1521 )
								if( bullPower <= -0.028523 )
									ret := -0.045548
								if( bullPower > -0.028523 )
									ret := -0.239651
							if( smoothD_d > 59.1521 )
								if( d <= 84.4755 )
									ret := 0.423841
								if( d > 84.4755 )
									ret := -0.023810
						if( rsi1 > 31.7515 )
							if( d <= 0.083289 )
								if( bearPower <= -0.416407 )
									ret := 0.733333 // buy
								if( bearPower > -0.416407 )
									ret := 0.272727
							if( d > 0.083289 )
								if( bbm <= 0.918253 )
									ret := -0.011022
								if( bbm > 0.918253 )
									ret := 0.132029
					if( bearPower > -0.32911 )
						if( rsi1 <= 58.0549 )
							if( d <= 96.5506 )
								if( smoothK_k <= 17.3594 )
									ret := 0.148760
								if( smoothK_k > 17.3594 )
									ret := 0.064316
							if( d > 96.5506 )
								if( BBPower_Color <= 0.5 )
									ret := 0.702128 // buy
								if( BBPower_Color > 0.5 )
									ret := 0.117647
						if( rsi1 > 58.0549 )
							if( bbp <= 0.194759 )
								if( d_k <= 21.4275 )
									ret := -0.088789
								if( d_k > 21.4275 )
									ret := -0.677419
							if( bbp > 0.194759 )
								if( d <= 80.0709 )
									ret := -0.022936
								if( d > 80.0709 )
									ret := 0.254717
		if( d_k > 25.032 )
			if( smoothK_k <= 10.695 )
				if( bearPower <= -0.122476 )
					if( smoothD_d <= 25.0727 )
						if( d <= 27.8196 )
							if( rsi1 <= 48.6374 )
								if( smoothD_d <= 24.5595 )
									ret := 0.000000
								if( smoothD_d > 24.5595 )
									ret := 0.500000
							if( rsi1 > 48.6374 )
								ret := 1.000000 // buy
						if( d > 27.8196 )
							ret := 1.000000 // buy
					if( smoothD_d > 25.0727 )
						if( d <= 35.5189 )
							if( bearPower <= -0.394335 )
								if( d_k <= 25.1675 )
									ret := -0.250000
								if( d_k > 25.1675 )
									ret := -0.867925 // sell
							if( bearPower > -0.394335 )
								if( smoothK_k <= 2.87823 )
									ret := 0.352941
								if( smoothK_k > 2.87823 )
									ret := -0.888889 // sell
						if( d > 35.5189 )
							if( rsi1 <= 36.4257 )
								if( bbm <= 0.144389 )
									ret := -0.266667
								if( bbm > 0.144389 )
									ret := 0.605263
							if( rsi1 > 36.4257 )
								if( smoothK_k <= 5.14331 )
									ret := 1.000000 // buy
								if( smoothK_k > 5.14331 )
									ret := -0.526316
				if( bearPower > -0.122476 )
					if( bearPower <= -0.010819 )
						if( bbm <= 0.082461 )
							if( smoothD_d <= 29.9362 )
								if( k <= 1.04709 )
									ret := 0.000000
								if( k > 1.04709 )
									ret := 0.833333 // buy
							if( smoothD_d > 29.9362 )
								if( bullPower <= 0.022508 )
									ret := 0.148148
								if( bullPower > 0.022508 )
									ret := -0.333333
						if( bbm > 0.082461 )
							if( bullPower <= 0.152074 )
								if( smoothD_d <= 34.6616 )
									ret := 0.636364
								if( smoothD_d > 34.6616 )
									ret := 0.941176 // buy
							if( bullPower > 0.152074 )
								ret := 0.166667
					if( bearPower > -0.010819 )
						if( smoothD_d <= 38.7173 )
							if( smoothD_d <= 26.3427 )
								if( bullPower <= 0.086563 )
									ret := 0.750000 // buy
								if( bullPower > 0.086563 )
									ret := 0.250000
							if( smoothD_d > 26.3427 )
								if( rsi1 <= 51.8445 )
									ret := -0.066667
								if( rsi1 > 51.8445 )
									ret := 0.238095
						if( smoothD_d > 38.7173 )
							if( rsi1 <= 39.3488 )
								ret := -1.000000 // sell
							if( rsi1 > 39.3488 )
								ret := -0.250000
			if( smoothK_k > 10.695 )
				if( rsi1 <= 44.786 )
					if( bearPower <= -0.181322 )
						if( rsi1 <= 33.9074 )
							if( k <= 20.0154 )
								if( rsi1 <= 29.4547 )
									ret := 0.812500 // buy
								if( rsi1 > 29.4547 )
									ret := -0.500000
							if( k > 20.0154 )
								if( bullPower <= -1.32804 )
									ret := -0.833333 // sell
								if( bullPower > -1.32804 )
									ret := 0.201389
						if( rsi1 > 33.9074 )
							if( rsi1 <= 36.2653 )
								if( bearPower <= -0.321248 )
									ret := 0.923077 // buy
								if( bearPower > -0.321248 )
									ret := 0.285714
							if( rsi1 > 36.2653 )
								if( d_k <= 30.1983 )
									ret := 0.669014
								if( d_k > 30.1983 )
									ret := 0.146341
					if( bearPower > -0.181322 )
						if( smoothD_d <= 50.5706 )
							if( rsi1 <= 40.1427 )
								if( smoothK_k <= 11.4113 )
									ret := 0.714286 // buy
								if( smoothK_k > 11.4113 )
									ret := 0.034483
							if( rsi1 > 40.1427 )
								if( smoothK_k <= 14.7103 )
									ret := -0.700000 // sell
								if( smoothK_k > 14.7103 )
									ret := -0.200000
						if( smoothD_d > 50.5706 )
							if( rsi1 <= 38.6338 )
								if( k <= 30.0584 )
									ret := 0.526316
								if( k > 30.0584 )
									ret := 0.000000
							if( rsi1 > 38.6338 )
								if( smoothD_d <= 52.4231 )
									ret := -0.250000
								if( smoothD_d > 52.4231 )
									ret := 0.604651
				if( rsi1 > 44.786 )
					if( bullPower <= 0.059817 )
						if( bbm <= 0.219563 )
							if( k <= 18.7704 )
								if( bbp <= -0.13032 )
									ret := -0.857143 // sell
								if( bbp > -0.13032 )
									ret := -0.250000
							if( k > 18.7704 )
								if( d <= 55.7027 )
									ret := 0.346939
								if( d > 55.7027 )
									ret := -0.112360
						if( bbm > 0.219563 )
							if( smoothD_d <= 52.8392 )
								if( d <= 52.683 )
									ret := -0.625000
								if( d > 52.683 )
									ret := 0.800000 // buy
							if( smoothD_d > 52.8392 )
								if( smoothD_d <= 65.4519 )
									ret := -0.840000 // sell
								if( smoothD_d > 65.4519 )
									ret := 0.000000
					if( bullPower > 0.059817 )
						if( k <= 19.4106 )
							if( d_k <= 25.6265 )
								ret := -0.750000 // sell
							if( d_k > 25.6265 )
								if( bullPower <= 0.10057 )
									ret := -0.333333
								if( bullPower > 0.10057 )
									ret := 0.111111
						if( k > 19.4106 )
							if( smoothD_d <= 74.4494 )
								if( bbp <= -0.396759 )
									ret := -0.500000
								if( bbp > -0.396759 )
									ret := 0.427632
							if( smoothD_d > 74.4494 )
								ret := 1.000000 // buy
	if( bbp > 0.248921 )
		if( bearPower <= 1.15068 )
			if( d_k <= -5.67827 )
				if( smoothD_d <= 3.64375 )
					if( smoothD_d <= 2.51896 )
						if( bbm <= 0.111062 )
							if( bbm <= 0.01 )
								ret := 0.000000
							if( bbm > 0.01 )
								ret := -0.400000
						if( bbm > 0.111062 )
							if( smoothK_k <= 8.31382 )
								ret := 0.600000
							if( smoothK_k > 8.31382 )
								if( rsi1 <= 65.1017 )
									ret := -0.250000
								if( rsi1 > 65.1017 )
									ret := 0.250000
					if( smoothD_d > 2.51896 )
						if( bearPower <= 0.206736 )
							if( smoothD_d <= 3.2384 )
								if( smoothK_k <= 12.3471 )
									ret := -0.666667
								if( smoothK_k > 12.3471 )
									ret := -1.000000 // sell
							if( smoothD_d > 3.2384 )
								ret := -1.000000 // sell
						if( bearPower > 0.206736 )
							ret := -0.400000
				if( smoothD_d > 3.64375 )
					if( d_k <= -8.63338 )
						if( bbm <= 0.078974 )
							if( bbp <= 0.361009 )
								if( smoothK_k <= 91.6156 )
									ret := -0.097792
								if( smoothK_k > 91.6156 )
									ret := 0.254902
							if( bbp > 0.361009 )
								if( k <= 31.7645 )
									ret := 0.166667
								if( k > 31.7645 )
									ret := -0.296137
						if( bbm > 0.078974 )
							if( d_k <= -27.2791 )
								if( d <= 59.3558 )
									ret := -0.009569
								if( d > 59.3558 )
									ret := -0.537634
							if( d_k > -27.2791 )
								if( BBPower_Color <= 0.5 )
									ret := 0.306358
								if( BBPower_Color > 0.5 )
									ret := 0.014441
					if( d_k > -8.63338 )
						if( d <= 65.1407 )
							if( smoothD_d <= 56.2644 )
								if( d_k <= -7.77128 )
									ret := 0.082192
								if( d_k > -7.77128 )
									ret := -0.199377
							if( smoothD_d > 56.2644 )
								if( rsi1 <= 72.9572 )
									ret := 0.494737
								if( rsi1 > 72.9572 )
									ret := -0.333333
						if( d > 65.1407 )
							if( d_k <= -7.96997 )
								if( rsi1 <= 73.3883 )
									ret := -0.534722
								if( rsi1 > 73.3883 )
									ret := -0.092308
							if( d_k > -7.96997 )
								if( d <= 81.7322 )
									ret := -0.249240
								if( d > 81.7322 )
									ret := -0.024145
			if( d_k > -5.67827 )
				if( k <= 22.054 )
					if( bullPower <= 0.843125 )
						if( rsi1 <= 68.5015 )
							if( k <= 3.36688 )
								if( rsi1 <= 62.0843 )
									ret := 0.259259
								if( rsi1 > 62.0843 )
									ret := 0.787234 // buy
							if( k > 3.36688 )
								if( smoothK_k <= 17.297 )
									ret := 0.102667
								if( smoothK_k > 17.297 )
									ret := 0.476190
						if( rsi1 > 68.5015 )
							if( bearPower <= 0.392473 )
								if( rsi1 <= 74.3148 )
									ret := -0.238462
								if( rsi1 > 74.3148 )
									ret := 0.050847
							if( bearPower > 0.392473 )
								if( smoothK_k <= 2.53399 )
									ret := 1.000000 // buy
								if( smoothK_k > 2.53399 )
									ret := 0.076923
					if( bullPower > 0.843125 )
						if( rsi1 <= 80.6864 )
							if( rsi1 <= 59.3152 )
								if( rsi1 <= 47.6036 )
									ret := 0.400000
								if( rsi1 > 47.6036 )
									ret := -0.260870
							if( rsi1 > 59.3152 )
								if( bbm <= 0.329843 )
									ret := 0.000000
								if( bbm > 0.329843 )
									ret := 0.714286 // buy
						if( rsi1 > 80.6864 )
							if( bearPower <= 0.6551 )
								ret := 0.571429
							if( bearPower > 0.6551 )
								ret := -1.000000 // sell
				if( k > 22.054 )
					if( bullPower <= 2.52591 )
						if( bearPower <= -0.108394 )
							if( k <= 34.8653 )
								if( rsi1 <= 66.8752 )
									ret := 0.338710
								if( rsi1 > 66.8752 )
									ret := -0.428571
							if( k > 34.8653 )
								if( k <= 87.5845 )
									ret := -0.310769
								if( k > 87.5845 )
									ret := 0.066038
						if( bearPower > -0.108394 )
							if( bbm <= 0.114275 )
								if( d <= 99.3866 )
									ret := -0.061709
								if( d > 99.3866 )
									ret := 0.171004
							if( bbm > 0.114275 )
								if( d <= 97.7045 )
									ret := 0.064704
								if( d > 97.7045 )
									ret := -0.042412
					if( bullPower > 2.52591 )
						if( smoothK_k <= 50.5318 )
							ret := -0.250000
						if( smoothK_k > 50.5318 )
							ret := -1.000000 // sell
		if( bearPower > 1.15068 )
			if( bbm <= 0.377869 )
				if( d <= 73.6875 )
					if( bearPower <= 1.29976 )
						if( smoothD_d <= 48.362 )
							ret := -0.400000
						if( smoothD_d > 48.362 )
							if( bbm <= 0.15 )
								ret := -1.000000 // sell
							if( bbm > 0.15 )
								ret := -0.750000 // sell
					if( bearPower > 1.29976 )
						if( rsi1 <= 66.7551 )
							if( d <= 33.1765 )
								ret := -1.000000 // sell
							if( d > 33.1765 )
								ret := -0.500000
						if( rsi1 > 66.7551 )
							ret := -1.000000 // sell
				if( d > 73.6875 )
					if( d_k <= -17.5805 )
						ret := 0.750000 // buy
					if( d_k > -17.5805 )
						if( rsi1 <= 72.0672 )
							ret := -0.142857
						if( rsi1 > 72.0672 )
							if( smoothK_k <= 90.7827 )
								if( bullPower <= 1.48243 )
									ret := 0.250000
								if( bullPower > 1.48243 )
									ret := -0.833333 // sell
							if( smoothK_k > 90.7827 )
								if( bullPower <= 1.53259 )
									ret := -1.000000 // sell
								if( bullPower > 1.53259 )
									ret := -0.761905 // sell
			if( bbm > 0.377869 )
				if( rsi1 <= 72.7047 )
					if( bbm <= 0.609844 )
						ret := 1.000000 // buy
					if( bbm > 0.609844 )
						if( d_k <= -26.4772 )
							ret := 1.000000 // buy
						if( d_k > -26.4772 )
							if( rsi1 <= 70.2986 )
								if( rsi1 <= 66.0063 )
									ret := 0.250000
								if( rsi1 > 66.0063 )
									ret := 0.777778 // buy
							if( rsi1 > 70.2986 )
								ret := -0.428571
				if( rsi1 > 72.7047 )
					if( rsi1 <= 90.7442 )
						if( bbm <= 1.25575 )
							if( smoothD_d <= 96.9925 )
								if( smoothD_d <= 92.2825 )
									ret := -0.531250
								if( smoothD_d > 92.2825 )
									ret := -0.064516
							if( smoothD_d > 96.9925 )
								if( bullPower <= 1.8776 )
									ret := -1.000000 // sell
								if( bullPower > 1.8776 )
									ret := -0.500000
						if( bbm > 1.25575 )
							if( rsi1 <= 78.0956 )
								ret := -0.250000
							if( rsi1 > 78.0956 )
								if( smoothK_k <= 96.7955 )
									ret := -1.000000 // sell
								if( smoothK_k > 96.7955 )
									ret := -0.750000 // sell
					if( rsi1 > 90.7442 )
						if( k <= 96.6016 )
							ret := -0.285714
						if( k > 96.6016 )
							if( k <= 99.9903 )
								if( rsi1 <= 94.3454 )
									ret := 1.000000 // buy
								if( rsi1 > 94.3454 )
									ret := 0.500000
							if( k > 99.9903 )
								if( bbm <= 0.431185 )
									ret := 0.500000
								if( bbm > 0.431185 )
									ret := -0.500000
	
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


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_RUN_15Min_01c07730(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


