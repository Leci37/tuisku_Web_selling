//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: MATICUSDT_30Min_2TV0_f1e82756 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_2TV0_f1e82756", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_f1e82756(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema3 <= 0.36463 )
		if( ema12 <= -0.000918 )
			if( tema <= 0.122541 )
				if( VIP <= 0.955009 )
					if( ema12 <= -0.001148 )
						if( ema3 <= 0.130289 )
							if( tema <= 0.105954 )
								if( tema <= 0.103854 )
									ret := 0.800000 // buy
								if( tema > 0.103854 )
									ret := 0.363636
							if( tema > 0.105954 )
								if( VIP_VIM <= -0.256546 )
									ret := 0.986111 // buy
								if( VIP_VIM > -0.256546 )
									ret := 0.833333 // buy
						if( ema3 > 0.130289 )
							if( ema1 <= 0.122814 )
								ret := -0.400000
							if( ema1 > 0.122814 )
								if( ema13 <= -0.011214 )
									ret := 1.000000 // buy
								if( ema13 > -0.011214 )
									ret := 0.500000
					if( ema12 > -0.001148 )
						if( ema12 <= -0.00094 )
							if( ema12 <= -0.000953 )
								if( VIP <= 0.676919 )
									ret := 0.857143 // buy
								if( VIP > 0.676919 )
									ret := 0.236842
							if( ema12 > -0.000953 )
								ret := -1.000000 // sell
						if( ema12 > -0.00094 )
							if( VIP <= 0.719709 )
								ret := 0.750000 // buy
							if( VIP > 0.719709 )
								ret := 1.000000 // buy
				if( VIP > 0.955009 )
					if( ema1 <= 0.108747 )
						ret := -0.714286 // sell
					if( ema1 > 0.108747 )
						if( VIP_VIM <= -0.023429 )
							if( ema13 <= -0.001808 )
								ret := 0.500000
							if( ema13 > -0.001808 )
								ret := 1.000000 // buy
						if( VIP_VIM > -0.023429 )
							ret := -0.500000
			if( tema > 0.122541 )
				if( ema3 <= 0.222505 )
					if( ema12 <= -0.005541 )
						if( ema1 <= 0.18436 )
							if( VIP_VIM <= -0.365471 )
								ret := 1.000000 // buy
							if( VIP_VIM > -0.365471 )
								if( ema13 <= -0.011381 )
									ret := 0.500000
								if( ema13 > -0.011381 )
									ret := 1.000000 // buy
						if( ema1 > 0.18436 )
							if( ema12 <= -0.006392 )
								ret := 1.000000 // buy
							if( ema12 > -0.006392 )
								ret := -0.600000
					if( ema12 > -0.005541 )
						if( VIP <= 0.857599 )
							if( ema3 <= 0.209915 )
								if( VIP <= 0.772357 )
									ret := 0.142857
								if( VIP > 0.772357 )
									ret := -0.693069
							if( ema3 > 0.209915 )
								if( VIP_VIM <= -0.286891 )
									ret := 0.400000
								if( VIP_VIM > -0.286891 )
									ret := -0.800000 // sell
						if( VIP > 0.857599 )
							if( VIP_VIM <= -0.277683 )
								if( tema <= 0.172563 )
									ret := 0.166667
								if( tema > 0.172563 )
									ret := 0.928571 // buy
							if( VIP_VIM > -0.277683 )
								if( ema1 <= 0.183983 )
									ret := 0.142857
								if( ema1 > 0.183983 )
									ret := -0.342857
				if( ema3 > 0.222505 )
					if( VIP_VIM <= 0.147201 )
						if( tema <= 0.334436 )
							if( ema12 <= -0.003536 )
								if( ema12 <= -0.00552 )
									ret := 0.583333
								if( ema12 > -0.00552 )
									ret := 0.055556
							if( ema12 > -0.003536 )
								if( VIP <= 0.945028 )
									ret := 0.788991 // buy
								if( VIP > 0.945028 )
									ret := 0.467532
						if( tema > 0.334436 )
							if( ema13 <= -0.0028 )
								if( ema2 <= 0.347965 )
									ret := -0.482143
								if( ema2 > 0.347965 )
									ret := 0.335526
							if( ema13 > -0.0028 )
								if( VIP_VIM <= -0.028157 )
									ret := 0.794872 // buy
								if( VIP_VIM > -0.028157 )
									ret := -0.250000
					if( VIP_VIM > 0.147201 )
						if( VIM <= 0.96269 )
							ret := -0.750000 // sell
						if( VIM > 0.96269 )
							ret := -1.000000 // sell
		if( ema12 > -0.000918 )
			if( VIM <= 0.714914 )
				if( tema <= 0.171716 )
					if( ema13 <= 0.007971 )
						if( tema <= 0.016268 )
							if( ema13 <= 0.000601 )
								if( VIM <= 0.674362 )
									ret := 0.000000
								if( VIM > 0.674362 )
									ret := 0.894737 // buy
							if( ema13 > 0.000601 )
								ret := -0.750000 // sell
						if( tema > 0.016268 )
							if( VIP <= 1.1057 )
								ret := -1.000000 // sell
							if( VIP > 1.1057 )
								if( ema12 <= 0.000263 )
									ret := 0.000000
								if( ema12 > 0.000263 )
									ret := -0.418367
					if( ema13 > 0.007971 )
						if( VIM <= 0.689401 )
							if( VIP_VIM <= 0.804541 )
								if( VIP <= 1.25521 )
									ret := 0.500000
								if( VIP > 1.25521 )
									ret := 0.939394 // buy
							if( VIP_VIM > 0.804541 )
								ret := 0.000000
						if( VIM > 0.689401 )
							ret := 0.000000
				if( tema > 0.171716 )
					if( VIP <= 1.20554 )
						if( ema2 <= 0.33699 )
							ret := 0.250000
						if( ema2 > 0.33699 )
							ret := 1.000000 // buy
					if( VIP > 1.20554 )
						if( ema13 <= 0.021396 )
							if( VIP_VIM <= 0.66785 )
								if( ema1 <= 0.3684 )
									ret := -0.981818 // sell
								if( ema1 > 0.3684 )
									ret := -0.750000 // sell
							if( VIP_VIM > 0.66785 )
								if( ema2 <= 0.305599 )
									ret := -1.000000 // sell
								if( ema2 > 0.305599 )
									ret := 0.000000
						if( ema13 > 0.021396 )
							if( VIP_VIM <= 0.574023 )
								ret := 1.000000 // buy
							if( VIP_VIM > 0.574023 )
								if( ema2 <= 0.263492 )
									ret := -0.750000 // sell
								if( ema2 > 0.263492 )
									ret := -1.000000 // sell
			if( VIM > 0.714914 )
				if( VIM <= 1.37692 )
					if( ema2 <= 0.234799 )
						if( tema <= 0.108041 )
							if( tema <= 0.047 )
								if( VIM <= 0.883942 )
									ret := 0.040232
								if( VIM > 0.883942 )
									ret := 0.128837
							if( tema > 0.047 )
								if( VIP_VIM <= 0.392644 )
									ret := 0.390306
								if( VIP_VIM > 0.392644 )
									ret := -0.031746
						if( tema > 0.108041 )
							if( ema3 <= 0.128908 )
								if( VIP_VIM <= -0.259322 )
									ret := 0.944444 // buy
								if( VIP_VIM > -0.259322 )
									ret := -0.258621
							if( ema3 > 0.128908 )
								if( ema3 <= 0.211477 )
									ret := 0.224599
								if( ema3 > 0.211477 )
									ret := -0.219941
					if( ema2 > 0.234799 )
						if( VIP_VIM <= 0.369132 )
							if( ema13 <= -0.000151 )
								if( VIM <= 1.02042 )
									ret := -0.225806
								if( VIM > 1.02042 )
									ret := 0.196970
							if( ema13 > -0.000151 )
								if( ema13 <= 0.01494 )
									ret := 0.365435
								if( ema13 > 0.01494 )
									ret := -0.444444
						if( VIP_VIM > 0.369132 )
							if( ema12 <= 0.007312 )
								if( VIP <= 1.2119 )
									ret := -0.245283
								if( VIP > 1.2119 )
									ret := -0.672414
							if( ema12 > 0.007312 )
								if( ema3 <= 0.323467 )
									ret := 0.973684 // buy
								if( ema3 > 0.323467 )
									ret := -0.142857
				if( VIM > 1.37692 )
					if( tema <= 0.018775 )
						if( ema3 <= 0.019157 )
							if( tema <= 0.016945 )
								if( tema <= 0.016202 )
									ret := 0.000000
								if( tema > 0.016202 )
									ret := 0.250000
							if( tema > 0.016945 )
								if( ema2 <= 0.017995 )
									ret := -1.000000 // sell
								if( ema2 > 0.017995 )
									ret := -0.500000
						if( ema3 > 0.019157 )
							if( VIM <= 1.40927 )
								ret := 1.000000 // buy
							if( VIM > 1.40927 )
								ret := 0.000000
					if( tema > 0.018775 )
						if( VIP_VIM <= -0.874321 )
							ret := -0.750000 // sell
						if( VIP_VIM > -0.874321 )
							ret := -1.000000 // sell
	if( ema3 > 0.36463 )
		if( ema12 <= -0.015255 )
			if( ema1 <= 1.43288 )
				if( ema3 <= 0.915471 )
					if( ema3 <= 0.88874 )
						if( ema3 <= 0.855112 )
							if( VIP_VIM <= -0.42898 )
								if( tema <= 0.357889 )
									ret := 1.000000 // buy
								if( tema > 0.357889 )
									ret := 0.176471
							if( VIP_VIM > -0.42898 )
								if( tema <= 0.566562 )
									ret := 0.666667
								if( tema > 0.566562 )
									ret := -0.760000 // sell
						if( ema3 > 0.855112 )
							if( VIP <= 0.690508 )
								if( ema12 <= -0.023581 )
									ret := 1.000000 // buy
								if( ema12 > -0.023581 )
									ret := -0.230769
							if( VIP > 0.690508 )
								if( VIP_VIM <= -0.513429 )
									ret := 0.833333 // buy
								if( VIP_VIM > -0.513429 )
									ret := 1.000000 // buy
					if( ema3 > 0.88874 )
						if( VIP_VIM <= -0.255192 )
							if( ema13 <= -0.047956 )
								ret := -1.000000 // sell
							if( ema13 > -0.047956 )
								if( ema12 <= -0.022001 )
									ret := 0.428571
								if( ema12 > -0.022001 )
									ret := -0.736842 // sell
						if( VIP_VIM > -0.255192 )
							ret := 0.800000 // buy
				if( ema3 > 0.915471 )
					if( ema1 <= 0.898258 )
						if( VIP_VIM <= -0.48075 )
							if( VIP_VIM <= -0.595531 )
								if( VIP_VIM <= -0.672496 )
									ret := 0.500000
								if( VIP_VIM > -0.672496 )
									ret := 1.000000 // buy
							if( VIP_VIM > -0.595531 )
								ret := 0.000000
						if( VIP_VIM > -0.48075 )
							if( ema2 <= 0.915914 )
								ret := 1.000000 // buy
							if( ema2 > 0.915914 )
								ret := 0.750000 // buy
					if( ema1 > 0.898258 )
						if( VIP_VIM <= -0.665779 )
							if( ema12 <= -0.024951 )
								if( VIP_VIM <= -0.676496 )
									ret := -0.676471
								if( VIP_VIM > -0.676496 )
									ret := 0.142857
							if( ema12 > -0.024951 )
								if( ema13 <= -0.026608 )
									ret := 0.200000
								if( ema13 > -0.026608 )
									ret := 1.000000 // buy
						if( VIP_VIM > -0.665779 )
							if( VIP <= 0.693387 )
								if( VIM <= 1.25965 )
									ret := 0.951220 // buy
								if( VIM > 1.25965 )
									ret := 0.504065
							if( VIP > 0.693387 )
								if( VIM <= 1.28156 )
									ret := 0.257703
								if( VIM > 1.28156 )
									ret := 0.710526 // buy
			if( ema1 > 1.43288 )
				if( ema13 <= -0.106059 )
					if( VIP_VIM <= -0.27527 )
						if( ema3 <= 2.02514 )
							if( ema3 <= 1.90976 )
								if( tema <= 1.61535 )
									ret := 0.875000 // buy
								if( tema > 1.61535 )
									ret := 0.333333
							if( ema3 > 1.90976 )
								ret := -1.000000 // sell
						if( ema3 > 2.02514 )
							if( VIP <= 0.67609 )
								if( VIP_VIM <= -0.603001 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.603001 )
									ret := 0.000000
							if( VIP > 0.67609 )
								if( ema13 <= -0.185425 )
									ret := 0.666667
								if( ema13 > -0.185425 )
									ret := 1.000000 // buy
					if( VIP_VIM > -0.27527 )
						if( tema <= 1.7513 )
							ret := 0.750000 // buy
						if( tema > 1.7513 )
							if( ema3 <= 2.03918 )
								ret := -1.000000 // sell
							if( ema3 > 2.03918 )
								ret := -0.500000
				if( ema13 > -0.106059 )
					if( ema1 <= 1.90767 )
						if( ema3 <= 1.78796 )
							if( ema3 <= 1.7426 )
								if( VIP <= 0.866507 )
									ret := 0.024510
								if( VIP > 0.866507 )
									ret := 0.620690
							if( ema3 > 1.7426 )
								if( ema13 <= -0.080103 )
									ret := 0.888889 // buy
								if( ema13 > -0.080103 )
									ret := -0.744186 // sell
						if( ema3 > 1.78796 )
							if( VIP <= 0.91448 )
								if( ema12 <= -0.039258 )
									ret := 0.797101 // buy
								if( ema12 > -0.039258 )
									ret := 0.338710
							if( VIP > 0.91448 )
								if( VIM <= 1.11649 )
									ret := -0.479167
								if( VIM > 1.11649 )
									ret := 1.000000 // buy
					if( ema1 > 1.90767 )
						if( ema2 <= 1.98305 )
							if( ema13 <= -0.028623 )
								if( VIP <= 0.815788 )
									ret := -0.250000
								if( VIP > 0.815788 )
									ret := -0.791045 // sell
							if( ema13 > -0.028623 )
								if( ema3 <= 1.97275 )
									ret := 0.625000
								if( ema3 > 1.97275 )
									ret := -0.285714
						if( ema2 > 1.98305 )
							if( VIM <= 1.34389 )
								if( VIP_VIM <= -0.236465 )
									ret := 0.126786
								if( VIP_VIM > -0.236465 )
									ret := -0.291339
							if( VIM > 1.34389 )
								if( ema3 <= 2.07078 )
									ret := 0.500000
								if( ema3 > 2.07078 )
									ret := -0.800000 // sell
		if( ema12 > -0.015255 )
			if( ema3 <= 1.97772 )
				if( ema12 <= 0.054014 )
					if( ema12 <= -0.004467 )
						if( VIP_VIM <= -0.32558 )
							if( VIP <= 0.814037 )
								if( ema13 <= -0.022815 )
									ret := -0.095462
								if( ema13 > -0.022815 )
									ret := 0.077272
							if( VIP > 0.814037 )
								if( tema <= 0.367537 )
									ret := -1.000000 // sell
								if( tema > 0.367537 )
									ret := -0.090047
						if( VIP_VIM > -0.32558 )
							if( ema1 <= 1.39197 )
								if( ema3 <= 0.428979 )
									ret := -0.463768
								if( ema3 > 0.428979 )
									ret := 0.189070
							if( ema1 > 1.39197 )
								if( ema3 <= 1.44637 )
									ret := -0.354610
								if( ema3 > 1.44637 )
									ret := 0.048329
					if( ema12 > -0.004467 )
						if( ema13 <= 4.2e-05 )
							if( VIM <= 0.876369 )
								if( ema2 <= 0.564932 )
									ret := -0.150000
								if( ema2 > 0.564932 )
									ret := 0.393162
							if( VIM > 0.876369 )
								if( tema <= 0.882736 )
									ret := 0.002415
								if( tema > 0.882736 )
									ret := -0.047246
						if( ema13 > 4.2e-05 )
							if( VIP <= 1.02876 )
								if( ema3 <= 1.34483 )
									ret := 0.073016
								if( ema3 > 1.34483 )
									ret := 0.215866
							if( VIP > 1.02876 )
								if( ema1 <= 1.64312 )
									ret := 0.043660
								if( ema1 > 1.64312 )
									ret := -0.080704
				if( ema12 > 0.054014 )
					if( ema1 <= 1.07862 )
						if( VIM <= 0.714217 )
							ret := -1.000000 // sell
						if( VIM > 0.714217 )
							ret := 0.714286 // buy
					if( ema1 > 1.07862 )
						if( ema3 <= 1.92161 )
							if( VIP_VIM <= 0.360705 )
								if( tema <= 2.04916 )
									ret := 0.125000
								if( tema > 2.04916 )
									ret := -1.000000 // sell
							if( VIP_VIM > 0.360705 )
								if( VIM <= 0.505924 )
									ret := -0.500000
								if( VIM > 0.505924 )
									ret := 0.713415 // buy
						if( ema3 > 1.92161 )
							if( ema2 <= 1.99391 )
								ret := -1.000000 // sell
							if( ema2 > 1.99391 )
								if( ema12 <= 0.087091 )
									ret := 0.833333 // buy
								if( ema12 > 0.087091 )
									ret := -1.000000 // sell
			if( ema3 > 1.97772 )
				if( ema2 <= 2.01991 )
					if( ema13 <= -0.003845 )
						if( ema3 <= 2.0095 )
							if( ema2 <= 1.97821 )
								if( ema3 <= 1.98136 )
									ret := -0.571429
								if( ema3 > 1.98136 )
									ret := -1.000000 // sell
							if( ema2 > 1.97821 )
								if( VIM <= 1.01234 )
									ret := 0.666667
								if( VIM > 1.01234 )
									ret := -0.206349
						if( ema3 > 2.0095 )
							if( ema3 <= 2.02447 )
								if( VIP <= 0.898348 )
									ret := 0.400000
								if( VIP > 0.898348 )
									ret := 0.937500 // buy
							if( ema3 > 2.02447 )
								ret := 0.000000
					if( ema13 > -0.003845 )
						if( tema <= 1.9946 )
							if( VIP_VIM <= -0.03809 )
								ret := -1.000000 // sell
							if( VIP_VIM > -0.03809 )
								ret := -0.600000
						if( tema > 1.9946 )
							if( VIP_VIM <= -0.093862 )
								if( ema12 <= -0.002142 )
									ret := 0.750000 // buy
								if( ema12 > -0.002142 )
									ret := -0.200000
							if( VIP_VIM > -0.093862 )
								if( ema3 <= 1.99326 )
									ret := -0.508772
								if( ema3 > 1.99326 )
									ret := -0.800000 // sell
				if( ema2 > 2.01991 )
					if( ema1 <= 2.54596 )
						if( ema1 <= 2.4863 )
							if( ema1 <= 2.4203 )
								if( ema3 <= 2.09199 )
									ret := -0.236145
								if( ema3 > 2.09199 )
									ret := 0.043872
							if( ema1 > 2.4203 )
								if( tema <= 2.45445 )
									ret := -0.787879 // sell
								if( tema > 2.45445 )
									ret := -0.301587
						if( ema1 > 2.4863 )
							if( VIM <= 0.889405 )
								if( VIP <= 1.09838 )
									ret := 1.000000 // buy
								if( VIP > 1.09838 )
									ret := -0.523810
							if( VIM > 0.889405 )
								if( ema2 <= 2.48654 )
									ret := 0.954545 // buy
								if( ema2 > 2.48654 )
									ret := 0.403509
					if( ema1 > 2.54596 )
						if( ema1 <= 2.66363 )
							if( VIP <= 0.971372 )
								if( tema <= 2.54761 )
									ret := -0.250000
								if( tema > 2.54761 )
									ret := -0.828571 // sell
							if( VIP > 0.971372 )
								if( VIP <= 1.04766 )
									ret := 0.085106
								if( VIP > 1.04766 )
									ret := -0.453416
						if( ema1 > 2.66363 )
							if( tema <= 2.81052 )
								if( ema13 <= 0.042196 )
									ret := 0.681818
								if( ema13 > 0.042196 )
									ret := -0.500000
							if( tema > 2.81052 )
								if( ema2 <= 2.86172 )
									ret := -0.105263
								if( ema2 > 2.86172 )
									ret := -0.750000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_MATICUSDT_30Min_f1e82756(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


