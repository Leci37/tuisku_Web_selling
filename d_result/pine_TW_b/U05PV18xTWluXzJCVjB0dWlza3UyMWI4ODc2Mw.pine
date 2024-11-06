//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: SNOW_1Min_2BV0_21b88763 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_2BV0_21b88763", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_21b88763(bbm, bearPower, bbp, bullPower, BBPower_Color, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= -0.131287 )
		if( bbm <= 0.039915 )
			if( VIM <= 6.26762 )
				if( VIP <= 5.55096 )
					if( bbm <= 0.009705 )
						if( bearPower <= -0.138267 )
							if( VIM <= 1.67724 )
								if( VIM <= 1.5786 )
									ret := 0.451163
								if( VIM > 1.5786 )
									ret := 0.859155 // buy
							if( VIM > 1.67724 )
								if( VIP <= 1.77869 )
									ret := 0.106667
								if( VIP > 1.77869 )
									ret := 0.433411
						if( bearPower > -0.138267 )
							if( VIM <= 1.55834 )
								if( VIP <= 1.04185 )
									ret := 0.166667
								if( VIP > 1.04185 )
									ret := 0.818182 // buy
							if( VIM > 1.55834 )
								if( VIP <= 1.79805 )
									ret := -0.500000
								if( VIP > 1.79805 )
									ret := 0.218750
					if( bbm > 0.009705 )
						if( VIM <= 2.17675 )
							if( VIM <= 1.21378 )
								if( VIM <= 1.15884 )
									ret := 0.227273
								if( VIM > 1.15884 )
									ret := -0.666667
							if( VIM > 1.21378 )
								if( VIP <= 0.730121 )
									ret := 0.171429
								if( VIP > 0.730121 )
									ret := 0.583333
						if( VIM > 2.17675 )
							if( VIP_VIM <= -0.195803 )
								if( VIP <= 2.68008 )
									ret := -0.179487
								if( VIP > 2.68008 )
									ret := 0.611111
							if( VIP_VIM > -0.195803 )
								if( VIP <= 3.45398 )
									ret := -0.552632
								if( VIP > 3.45398 )
									ret := 0.461538
				if( VIP > 5.55096 )
					if( VIM <= 5.4768 )
						if( VIP_VIM <= 1.06821 )
							ret := 0.500000
						if( VIP_VIM > 1.06821 )
							ret := 0.000000
					if( VIM > 5.4768 )
						if( VIP_VIM <= -0.31086 )
							ret := 0.500000
						if( VIP_VIM > -0.31086 )
							if( VIP <= 7.60814 )
								if( bbp <= -0.402919 )
									ret := -0.964286 // sell
								if( bbp > -0.402919 )
									ret := -0.473684
							if( VIP > 7.60814 )
								ret := 0.285714
			if( VIM > 6.26762 )
				if( bearPower <= -0.211347 )
					if( VIP <= 94.6675 )
						if( VIP_VIM <= -1.63821 )
							if( bbp <= -1.23976 )
								if( VIM <= 12.439 )
									ret := 0.250000
								if( VIM > 12.439 )
									ret := 0.933333 // buy
							if( bbp > -1.23976 )
								if( VIP_VIM <= -1.73214 )
									ret := 0.133333
								if( VIP_VIM > -1.73214 )
									ret := -1.000000 // sell
						if( VIP_VIM > -1.63821 )
							if( bullPower <= -0.738342 )
								if( VIP <= 6.92204 )
									ret := -1.000000 // sell
								if( VIP > 6.92204 )
									ret := 0.358974
							if( bullPower > -0.738342 )
								if( VIP <= 6.75994 )
									ret := 0.964912 // buy
								if( VIP > 6.75994 )
									ret := 0.539823
					if( VIP > 94.6675 )
						if( VIP_VIM <= 1.97135 )
							if( bbp <= -0.940462 )
								ret := 1.000000 // buy
							if( bbp > -0.940462 )
								if( bbp <= -0.820044 )
									ret := 0.250000
								if( bbp > -0.820044 )
									ret := 0.904762 // buy
						if( VIP_VIM > 1.97135 )
							if( bbp <= -0.609058 )
								ret := 0.750000 // buy
							if( bbp > -0.609058 )
								ret := 0.200000
				if( bearPower > -0.211347 )
					if( VIP_VIM <= 0.860414 )
						if( bearPower <= -0.208096 )
							if( VIP <= 11.218 )
								ret := -0.250000
							if( VIP > 11.218 )
								ret := -0.250000
						if( bearPower > -0.208096 )
							if( VIP <= 15.039 )
								if( VIP <= 10.6092 )
									ret := 0.455357
								if( VIP > 10.6092 )
									ret := 0.814815 // buy
							if( VIP > 15.039 )
								if( bbm <= 6e-06 )
									ret := 0.352941
								if( bbm > 6e-06 )
									ret := -0.470588
					if( VIP_VIM > 0.860414 )
						if( VIP <= 11.2891 )
							ret := 0.428571
						if( VIP > 11.2891 )
							if( bearPower <= -0.145912 )
								if( bearPower <= -0.160884 )
									ret := -0.230769
								if( bearPower > -0.160884 )
									ret := -1.000000 // sell
							if( bearPower > -0.145912 )
								ret := 0.428571
		if( bbm > 0.039915 )
			if( VIP <= 0.55522 )
				if( VIP_VIM <= -0.894858 )
					if( bbm <= 0.3225 )
						if( bullPower <= -0.212025 )
							if( bullPower <= -0.378344 )
								if( bearPower <= -0.805373 )
									ret := -1.000000 // sell
								if( bearPower > -0.805373 )
									ret := -0.517647
							if( bullPower > -0.378344 )
								if( bearPower <= -0.52071 )
									ret := 0.255814
								if( bearPower > -0.52071 )
									ret := -0.163934
						if( bullPower > -0.212025 )
							if( VIM <= 1.51968 )
								if( bearPower <= -0.235548 )
									ret := -0.875000 // sell
								if( bearPower > -0.235548 )
									ret := 0.000000
							if( VIM > 1.51968 )
								ret := 0.000000
					if( bbm > 0.3225 )
						if( bbm <= 0.735317 )
							if( bbm <= 0.526875 )
								if( bearPower <= -0.766124 )
									ret := 0.333333
								if( bearPower > -0.766124 )
									ret := -0.285714
							if( bbm > 0.526875 )
								if( VIP_VIM <= -1.10745 )
									ret := 1.000000 // buy
								if( VIP_VIM > -1.10745 )
									ret := 0.642857
						if( bbm > 0.735317 )
							if( VIP_VIM <= -1.04258 )
								if( bbp <= -10.8439 )
									ret := 0.000000
								if( bbp > -10.8439 )
									ret := -0.960000 // sell
							if( VIP_VIM > -1.04258 )
								if( bearPower <= -3.54555 )
									ret := 0.900000 // buy
								if( bearPower > -3.54555 )
									ret := 0.000000
				if( VIP_VIM > -0.894858 )
					if( VIM <= 1.42972 )
						if( bearPower <= -2.8227 )
							ret := 1.000000 // buy
						if( bearPower > -2.8227 )
							if( bullPower <= -0.161661 )
								if( VIP_VIM <= -0.82433 )
									ret := 0.525000
								if( VIP_VIM > -0.82433 )
									ret := 0.142857
							if( bullPower > -0.161661 )
								if( bbp <= -0.712712 )
									ret := -0.800000 // sell
								if( bbp > -0.712712 )
									ret := 0.250000
					if( VIM > 1.42972 )
						ret := -0.714286 // sell
			if( VIP > 0.55522 )
				if( bbp <= -3.41909 )
					if( VIP <= 1.01332 )
						if( bullPower <= -1.21565 )
							if( VIP <= 0.560818 )
								ret := 0.750000 // buy
							if( VIP > 0.560818 )
								if( bbm <= 0.361903 )
									ret := 0.750000 // buy
								if( bbm > 0.361903 )
									ret := 0.984615 // buy
						if( bullPower > -1.21565 )
							if( bbm <= 2.66143 )
								ret := -0.200000
							if( bbm > 2.66143 )
								ret := 1.000000 // buy
					if( VIP > 1.01332 )
						if( VIP_VIM <= -0.154599 )
							if( bearPower <= -2.76819 )
								ret := -0.750000 // sell
							if( bearPower > -2.76819 )
								ret := -1.000000 // sell
						if( VIP_VIM > -0.154599 )
							ret := -0.500000
				if( bbp > -3.41909 )
					if( bbm <= 0.175444 )
						if( VIP_VIM <= -0.503619 )
							if( bullPower <= -0.328318 )
								if( bbm <= 0.138606 )
									ret := 0.337209
								if( bbm > 0.138606 )
									ret := -0.062500
							if( bullPower > -0.328318 )
								if( bbm <= 0.118834 )
									ret := 0.008230
								if( bbm > 0.118834 )
									ret := -0.152144
						if( VIP_VIM > -0.503619 )
							if( VIP_VIM <= -0.455215 )
								if( bearPower <= -0.494267 )
									ret := -0.300000
								if( bearPower > -0.494267 )
									ret := 0.406360
							if( VIP_VIM > -0.455215 )
								if( VIM <= 3.08355 )
									ret := 0.028137
								if( VIM > 3.08355 )
									ret := 0.545455
					if( bbm > 0.175444 )
						if( VIP <= 0.93343 )
							if( VIM <= 1.77623 )
								if( VIP <= 0.807925 )
									ret := 0.169667
								if( VIP > 0.807925 )
									ret := 0.005613
							if( VIM > 1.77623 )
								if( bbm <= 0.673312 )
									ret := -0.962963 // sell
								if( bbm > 0.673312 )
									ret := 0.000000
						if( VIP > 0.93343 )
							if( VIP <= 5.10377 )
								if( VIP_VIM <= -1.2101 )
									ret := 1.000000 // buy
								if( VIP_VIM > -1.2101 )
									ret := 0.270538
							if( VIP > 5.10377 )
								if( bbm <= 0.205747 )
									ret := 0.600000
								if( bbm > 0.205747 )
									ret := -1.000000 // sell
	if( bullPower > -0.131287 )
		if( VIP_VIM <= 1.15062 )
			if( bbp <= 1.74803 )
				if( bbm <= 4e-06 )
					if( bbp <= 0.123004 )
						if( bearPower <= -0.01826 )
							if( VIP <= 2.93531 )
								if( VIP_VIM <= -0.240208 )
									ret := -0.112335
								if( VIP_VIM > -0.240208 )
									ret := 0.216162
							if( VIP > 2.93531 )
								if( VIP_VIM <= -1.99857 )
									ret := -0.021739
								if( VIP_VIM > -1.99857 )
									ret := 0.342301
						if( bearPower > -0.01826 )
							if( VIM <= 12.4232 )
								if( VIM <= 10.9882 )
									ret := 0.023599
								if( VIM > 10.9882 )
									ret := -0.478261
							if( VIM > 12.4232 )
								if( VIM <= 45.126 )
									ret := 0.264249
								if( VIM > 45.126 )
									ret := -0.037313
					if( bbp > 0.123004 )
						if( bbp <= 0.370547 )
							if( VIP_VIM <= -0.05185 )
								if( VIP <= 29.875 )
									ret := -0.293458
								if( VIP > 29.875 )
									ret := 0.071429
							if( VIP_VIM > -0.05185 )
								if( VIP <= 39.7267 )
									ret := -0.047468
								if( VIP > 39.7267 )
									ret := -0.581818
						if( bbp > 0.370547 )
							if( VIP_VIM <= 0.313582 )
								if( VIP <= 4.50914 )
									ret := -0.476064
								if( VIP > 4.50914 )
									ret := -0.018182
							if( VIP_VIM > 0.313582 )
								if( bearPower <= 0.744733 )
									ret := -0.403509
								if( bearPower > 0.744733 )
									ret := 0.750000 // buy
				if( bbm > 4e-06 )
					if( bbp <= 1.42839 )
						if( bbp <= -0.714879 )
							if( VIP_VIM <= -0.27623 )
								if( VIP <= 0.420869 )
									ret := -0.250000
								if( VIP > 0.420869 )
									ret := 0.703125 // buy
							if( VIP_VIM > -0.27623 )
								if( VIP <= 0.94403 )
									ret := -0.666667
								if( VIP > 0.94403 )
									ret := 0.387755
						if( bbp > -0.714879 )
							if( bearPower <= -0.587722 )
								if( VIP_VIM <= -0.429709 )
									ret := 0.500000
								if( VIP_VIM > -0.429709 )
									ret := -0.360406
							if( bearPower > -0.587722 )
								if( VIP <= 0.946226 )
									ret := 0.014612
								if( VIP > 0.946226 )
									ret := 0.051845
					if( bbp > 1.42839 )
						if( VIP_VIM <= 0.521533 )
							if( bearPower <= 0.359046 )
								if( VIP <= 0.992376 )
									ret := -1.000000 // sell
								if( VIP > 0.992376 )
									ret := 0.852941 // buy
							if( bearPower > 0.359046 )
								if( VIP_VIM <= 0.029109 )
									ret := 0.684211
								if( VIP_VIM > 0.029109 )
									ret := -0.313953
						if( VIP_VIM > 0.521533 )
							if( VIP_VIM <= 0.834249 )
								if( VIP_VIM <= 0.542229 )
									ret := 1.000000 // buy
								if( VIP_VIM > 0.542229 )
									ret := 0.632353
							if( VIP_VIM > 0.834249 )
								if( bbp <= 1.69836 )
									ret := -0.075000
								if( bbp > 1.69836 )
									ret := 0.785714 // buy
			if( bbp > 1.74803 )
				if( bullPower <= 1.46716 )
					if( bbm <= 0.503307 )
						if( bearPower <= 0.797202 )
							if( VIP_VIM <= 0.86798 )
								if( bbp <= 1.95875 )
									ret := 0.117647
								if( bbp > 1.95875 )
									ret := 0.900000 // buy
							if( VIP_VIM > 0.86798 )
								if( VIP_VIM <= 0.974068 )
									ret := -1.000000 // sell
								if( VIP_VIM > 0.974068 )
									ret := -0.750000 // sell
						if( bearPower > 0.797202 )
							if( VIP_VIM <= 1.00771 )
								if( VIM <= 4.69684 )
									ret := -0.625000
								if( VIM > 4.69684 )
									ret := -0.088235
							if( VIP_VIM > 1.00771 )
								if( VIM <= 1.87006 )
									ret := 0.800000 // buy
								if( VIM > 1.87006 )
									ret := -0.600000
					if( bbm > 0.503307 )
						if( bearPower <= 0.488422 )
							ret := 0.250000
						if( bearPower > 0.488422 )
							if( bbm <= 0.622183 )
								if( bbm <= 0.595967 )
									ret := -0.826087 // sell
								if( bbm > 0.595967 )
									ret := 0.250000
							if( bbm > 0.622183 )
								if( bbm <= 0.7875 )
									ret := -1.000000 // sell
								if( bbm > 0.7875 )
									ret := -0.500000
				if( bullPower > 1.46716 )
					if( bullPower <= 2.74486 )
						if( bbm <= 1.2998 )
							if( VIM <= 0.904204 )
								if( VIP_VIM <= 0.728329 )
									ret := -0.733333 // sell
								if( VIP_VIM > 0.728329 )
									ret := 0.120000
							if( VIM > 0.904204 )
								if( bullPower <= 1.65724 )
									ret := 0.838710 // buy
								if( bullPower > 1.65724 )
									ret := -0.538462
						if( bbm > 1.2998 )
							if( bearPower <= 0.571437 )
								ret := 1.000000 // buy
							if( bearPower > 0.571437 )
								ret := 0.750000 // buy
					if( bullPower > 2.74486 )
						if( bearPower <= -0.305346 )
							if( VIM <= 0.880495 )
								if( bbp <= 2.56538 )
									ret := -1.000000 // sell
								if( bbp > 2.56538 )
									ret := 0.714286 // buy
							if( VIM > 0.880495 )
								ret := -1.000000 // sell
						if( bearPower > -0.305346 )
							if( VIP <= 1.16479 )
								ret := -0.500000
							if( VIP > 1.16479 )
								if( bullPower <= 3.78006 )
									ret := -1.000000 // sell
								if( bullPower > 3.78006 )
									ret := -0.666667
		if( VIP_VIM > 1.15062 )
			if( bbp <= 0.236816 )
				if( VIP <= 28.046 )
					if( bbm <= 5e-05 )
						if( bbp <= -0.131903 )
							if( VIP_VIM <= 1.48023 )
								if( bbp <= -0.232279 )
									ret := 0.500000
								if( bbp > -0.232279 )
									ret := 0.266667
							if( VIP_VIM > 1.48023 )
								if( VIP <= 7.82442 )
									ret := 0.363636
								if( VIP > 7.82442 )
									ret := -0.300000
						if( bbp > -0.131903 )
							if( bearPower <= -0.059749 )
								ret := -1.000000 // sell
							if( bearPower > -0.059749 )
								if( VIM <= 12.3711 )
									ret := -0.298246
								if( VIM > 12.3711 )
									ret := 0.000000
					if( bbm > 5e-05 )
						if( VIP <= 3.05641 )
							if( VIP <= 2.4504 )
								if( bearPower <= 0.038432 )
									ret := -0.142857
								if( bearPower > 0.038432 )
									ret := 0.500000
							if( VIP > 2.4504 )
								ret := 1.000000 // buy
						if( VIP > 3.05641 )
							if( VIP_VIM <= 1.69687 )
								if( VIP <= 12.7282 )
									ret := -0.108108
								if( VIP > 12.7282 )
									ret := -0.800000 // sell
							if( VIP_VIM > 1.69687 )
								if( bbp <= 0.02846 )
									ret := 0.857143 // buy
								if( bbp > 0.02846 )
									ret := 0.333333
				if( VIP > 28.046 )
					if( VIP_VIM <= 63.683 )
						if( VIM <= 84.8974 )
							if( VIP <= 28.8567 )
								ret := 1.000000 // buy
							if( VIP > 28.8567 )
								if( VIP <= 42.0463 )
									ret := 0.250000
								if( VIP > 42.0463 )
									ret := 0.614458
						if( VIM > 84.8974 )
							if( bbp <= -0.132346 )
								if( bearPower <= -0.103698 )
									ret := -1.000000 // sell
								if( bearPower > -0.103698 )
									ret := -0.750000 // sell
							if( bbp > -0.132346 )
								if( VIM <= 162.196 )
									ret := 0.000000
								if( VIM > 162.196 )
									ret := -0.250000
					if( VIP_VIM > 63.683 )
						ret := -0.800000 // sell
			if( bbp > 0.236816 )
				if( VIP <= 2.98308 )
					if( VIP_VIM <= 1.40448 )
						if( bbm <= 0.125621 )
							if( bullPower <= 0.859412 )
								if( bbp <= 0.650156 )
									ret := -0.074074
								if( bbp > 0.650156 )
									ret := -0.545455
							if( bullPower > 0.859412 )
								ret := 0.714286 // buy
						if( bbm > 0.125621 )
							if( VIP_VIM <= 1.29701 )
								if( VIP_VIM <= 1.18014 )
									ret := -0.500000
								if( VIP_VIM > 1.18014 )
									ret := -0.947368 // sell
							if( VIP_VIM > 1.29701 )
								ret := -0.200000
					if( VIP_VIM > 1.40448 )
						if( VIP <= 2.53223 )
							if( bbp <= 0.308102 )
								ret := 0.600000
							if( bbp > 0.308102 )
								if( bearPower <= 0.238587 )
									ret := 1.000000 // buy
								if( bearPower > 0.238587 )
									ret := 0.800000 // buy
						if( VIP > 2.53223 )
							if( VIP_VIM <= 1.50511 )
								ret := 0.750000 // buy
							if( VIP_VIM > 1.50511 )
								ret := -0.571429
				if( VIP > 2.98308 )
					if( VIP <= 26.2471 )
						if( bbp <= 0.30506 )
							if( bullPower <= 0.160008 )
								if( VIM <= 2.56056 )
									ret := -0.923077 // sell
								if( VIM > 2.56056 )
									ret := -0.365854
							if( bullPower > 0.160008 )
								if( bullPower <= 0.166221 )
									ret := 1.000000 // buy
								if( bullPower > 0.166221 )
									ret := -0.375000
						if( bbp > 0.30506 )
							if( VIP <= 3.93328 )
								if( bbm <= 0.000656 )
									ret := -0.600000
								if( bbm > 0.000656 )
									ret := 0.133333
							if( VIP > 3.93328 )
								if( bullPower <= 0.298026 )
									ret := -0.674242
								if( bullPower > 0.298026 )
									ret := -0.872000 // sell
					if( VIP > 26.2471 )
						if( VIP <= 37.625 )
							if( bullPower <= 0.157051 )
								ret := -0.250000
							if( bullPower > 0.157051 )
								if( VIP_VIM <= 1.91304 )
									ret := 0.909091 // buy
								if( VIP_VIM > 1.91304 )
									ret := 0.500000
						if( VIP > 37.625 )
							if( VIM <= 66.2078 )
								if( VIM <= 48.3 )
									ret := -0.722222 // sell
								if( VIM > 48.3 )
									ret := 0.833333 // buy
							if( VIM > 66.2078 )
								if( bbp <= 0.359158 )
									ret := -0.266667
								if( bbp > 0.359158 )
									ret := -0.833333 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SNOW_1Min_21b88763(bbm, bearPower, bbp, bullPower, BBPower_Color, VIP_VIM, VIM, VIP)

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


