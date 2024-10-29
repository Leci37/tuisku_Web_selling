//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: QCOM_1Min_2BV0_4f5aa792 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Min_2BV0_4f5aa792", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Min_4f5aa792(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= 0.201526 )
		if( bbp <= -2.08411 )
			if( bullPower <= -2.6241 )
				if( VIM <= 3.31481 )
					if( VIP_VIM <= -0.598545 )
						if( bullPower <= -4.07303 )
							ret := 0.500000
						if( bullPower > -4.07303 )
							ret := 1.000000 // buy
					if( VIP_VIM > -0.598545 )
						ret := -1.000000 // sell
				if( VIM > 3.31481 )
					if( VIM <= 3.73676 )
						ret := -0.750000 // sell
					if( VIM > 3.73676 )
						ret := -1.000000 // sell
			if( bullPower > -2.6241 )
				if( VIP_VIM <= -0.795399 )
					if( bearPower <= -1.58344 )
						if( VIM <= 1.43765 )
							if( bbm <= 1.7439 )
								if( bullPower <= -1.00805 )
									ret := 0.590909
								if( bullPower > -1.00805 )
									ret := -0.750000 // sell
							if( bbm > 1.7439 )
								ret := 1.000000 // buy
						if( VIM > 1.43765 )
							if( VIP <= 5.39064 )
								if( bbp <= -2.72609 )
									ret := 1.000000 // buy
								if( bbp > -2.72609 )
									ret := 0.785714 // buy
							if( VIP > 5.39064 )
								if( bearPower <= -1.83649 )
									ret := 0.500000
								if( bearPower > -1.83649 )
									ret := 1.000000 // buy
					if( bearPower > -1.58344 )
						if( bbm <= 0.008727 )
							if( VIP_VIM <= -1.21498 )
								if( VIP_VIM <= -1.71489 )
									ret := 0.750000 // buy
								if( VIP_VIM > -1.71489 )
									ret := 1.000000 // buy
							if( VIP_VIM > -1.21498 )
								if( VIP <= 2.95654 )
									ret := 0.888889 // buy
								if( VIP > 2.95654 )
									ret := 0.200000
						if( bbm > 0.008727 )
							if( bullPower <= -0.848624 )
								if( bbm <= 0.524216 )
									ret := 0.311111
								if( bbm > 0.524216 )
									ret := -0.714286 // sell
							if( bullPower > -0.848624 )
								if( bearPower <= -1.53869 )
									ret := 0.500000
								if( bearPower > -1.53869 )
									ret := 1.000000 // buy
				if( VIP_VIM > -0.795399 )
					if( VIM <= 7.79908 )
						if( bbm <= 0.606449 )
							if( bullPower <= -1.06678 )
								if( VIP_VIM <= -0.716535 )
									ret := 0.200000
								if( VIP_VIM > -0.716535 )
									ret := 0.890411 // buy
							if( bullPower > -1.06678 )
								if( bullPower <= -0.958305 )
									ret := -0.120000
								if( bullPower > -0.958305 )
									ret := 0.765625 // buy
						if( bbm > 0.606449 )
							if( VIP <= 0.809458 )
								if( bbm <= 2.5049 )
									ret := -0.082707
								if( bbm > 2.5049 )
									ret := 0.650000
							if( VIP > 0.809458 )
								if( bullPower <= -0.886932 )
									ret := -0.083333
								if( bullPower > -0.886932 )
									ret := 0.860465 // buy
					if( VIM > 7.79908 )
						if( VIP <= 13.1564 )
							if( VIP <= 8.16659 )
								ret := -0.750000 // sell
							if( VIP > 8.16659 )
								ret := -1.000000 // sell
						if( VIP > 13.1564 )
							if( VIM <= 26.0293 )
								ret := 0.800000 // buy
							if( VIM > 26.0293 )
								if( VIP_VIM <= 0.05 )
									ret := -0.250000
								if( VIP_VIM > 0.05 )
									ret := -0.600000
		if( bbp > -2.08411 )
			if( bbm <= 0.009523 )
				if( bearPower <= -0.026491 )
					if( VIM <= 7.20473 )
						if( VIP_VIM <= 0.071211 )
							if( VIM <= 2.2681 )
								if( VIP <= 1.69643 )
									ret := 0.129078
								if( VIP > 1.69643 )
									ret := -0.348837
							if( VIM > 2.2681 )
								if( VIP <= 1.77853 )
									ret := 0.568345
								if( VIP > 1.77853 )
									ret := 0.248168
						if( VIP_VIM > 0.071211 )
							if( bearPower <= -0.160578 )
								if( VIP_VIM <= 0.525751 )
									ret := 0.631757
								if( VIP_VIM > 0.525751 )
									ret := 0.278107
							if( bearPower > -0.160578 )
								if( VIP_VIM <= 0.600916 )
									ret := 0.192857
								if( VIP_VIM > 0.600916 )
									ret := 0.520000
					if( VIM > 7.20473 )
						if( VIP_VIM <= -2.5699 )
							if( VIP <= 16.8578 )
								if( bearPower <= -0.211374 )
									ret := 0.750000 // buy
								if( bearPower > -0.211374 )
									ret := -0.750000 // sell
							if( VIP > 16.8578 )
								if( bbp <= -0.480597 )
									ret := 0.714286 // buy
								if( bbp > -0.480597 )
									ret := 0.933333 // buy
						if( VIP_VIM > -2.5699 )
							if( VIM <= 7.6473 )
								if( bearPower <= -0.518717 )
									ret := 0.857143 // buy
								if( bearPower > -0.518717 )
									ret := -0.575758
							if( VIM > 7.6473 )
								if( VIP_VIM <= -0.763128 )
									ret := 0.066790
								if( VIP_VIM > -0.763128 )
									ret := 0.246673
				if( bearPower > -0.026491 )
					if( VIM <= 53.8317 )
						if( bbm <= 0.005344 )
							if( VIP_VIM <= -0.221735 )
								if( bullPower <= 0.117583 )
									ret := 0.307458
								if( bullPower > 0.117583 )
									ret := 0.032967
							if( VIP_VIM > -0.221735 )
								if( VIP_VIM <= 0.442575 )
									ret := -0.101029
								if( VIP_VIM > 0.442575 )
									ret := 0.136816
						if( bbm > 0.005344 )
							if( VIP <= 19.5735 )
								if( VIP_VIM <= -0.948788 )
									ret := -0.400000
								if( VIP_VIM > -0.948788 )
									ret := 0.290698
							if( VIP > 19.5735 )
								ret := 1.000000 // buy
					if( VIM > 53.8317 )
						if( VIM <= 108.388 )
							if( VIP_VIM <= 0.342204 )
								if( VIM <= 97.0166 )
									ret := 0.030303
								if( VIM > 97.0166 )
									ret := -0.875000 // sell
							if( VIP_VIM > 0.342204 )
								if( VIP_VIM <= 1.88093 )
									ret := -0.753247 // sell
								if( VIP_VIM > 1.88093 )
									ret := 0.166667
						if( VIM > 108.388 )
							if( bbm <= 0.001127 )
								if( VIP <= 347.16 )
									ret := -0.265625
								if( VIP > 347.16 )
									ret := 0.375000
							if( bbm > 0.001127 )
								ret := 1.000000 // buy
			if( bbm > 0.009523 )
				if( bbp <= 0.08209 )
					if( VIM <= 2.20889 )
						if( VIP_VIM <= 0.538604 )
							if( VIP <= 1.40014 )
								if( bearPower <= -1.9556 )
									ret := 1.000000 // buy
								if( bearPower > -1.9556 )
									ret := 0.021127
							if( VIP > 1.40014 )
								if( bbm <= 1.11937 )
									ret := -0.185771
								if( bbm > 1.11937 )
									ret := 0.923077 // buy
						if( VIP_VIM > 0.538604 )
							if( bearPower <= -0.048594 )
								if( bullPower <= 0.197444 )
									ret := 0.612903
								if( bullPower > 0.197444 )
									ret := -0.500000
							if( bearPower > -0.048594 )
								if( bearPower <= 0.010752 )
									ret := -0.034483
								if( bearPower > 0.010752 )
									ret := 0.500000
					if( VIM > 2.20889 )
						if( bbp <= -0.959055 )
							if( VIP <= 1.56717 )
								if( bbp <= -1.88765 )
									ret := -0.200000
								if( bbp > -1.88765 )
									ret := 0.886076 // buy
							if( VIP > 1.56717 )
								if( VIP <= 2.29125 )
									ret := -0.105769
								if( VIP > 2.29125 )
									ret := 0.429185
						if( bbp > -0.959055 )
							if( bearPower <= -0.26644 )
								if( bbp <= -0.741995 )
									ret := 0.125654
								if( bbp > -0.741995 )
									ret := -0.181159
							if( bearPower > -0.26644 )
								if( VIM <= 9.53177 )
									ret := 0.210456
								if( VIM > 9.53177 )
									ret := -0.065217
				if( bbp > 0.08209 )
					if( bbm <= 0.279987 )
						if( VIP <= 0.871361 )
							if( bbp <= 0.104022 )
								if( VIP_VIM <= -0.392057 )
									ret := 0.375000
								if( VIP_VIM > -0.392057 )
									ret := -0.235294
							if( bbp > 0.104022 )
								if( bbp <= 0.408125 )
									ret := -0.623656
								if( bbp > 0.408125 )
									ret := 0.250000
						if( VIP > 0.871361 )
							if( bearPower <= -0.033163 )
								if( VIP <= 0.914133 )
									ret := -0.174603
								if( VIP > 0.914133 )
									ret := 0.205128
							if( bearPower > -0.033163 )
								if( bearPower <= -0.007091 )
									ret := -0.053048
								if( bearPower > -0.007091 )
									ret := 0.067643
					if( bbm > 0.279987 )
						if( VIP <= 3.06897 )
							if( VIP <= 0.963108 )
								if( bullPower <= 0.235269 )
									ret := -0.040000
								if( bullPower > 0.235269 )
									ret := 0.358025
							if( VIP > 0.963108 )
								if( bbp <= 0.38606 )
									ret := 0.184424
								if( bbp > 0.38606 )
									ret := 0.062137
						if( VIP > 3.06897 )
							if( VIM <= 4.1087 )
								if( bbm <= 0.31261 )
									ret := -0.375000
								if( bbm > 0.31261 )
									ret := -0.875000 // sell
							if( VIM > 4.1087 )
								if( bearPower <= 0.073615 )
									ret := 0.461538
								if( bearPower > 0.073615 )
									ret := -0.600000
	if( bearPower > 0.201526 )
		if( bearPower <= 0.597782 )
			if( bbm <= 0.001123 )
				if( VIP_VIM <= 0.680842 )
					if( VIP_VIM <= -0.528717 )
						if( VIP <= 3.14594 )
							if( VIP <= 2.79079 )
								if( VIP_VIM <= -1.06096 )
									ret := -0.176471
								if( VIP_VIM > -1.06096 )
									ret := 0.424242
							if( VIP > 2.79079 )
								if( bbp <= 0.860801 )
									ret := 1.000000 // buy
								if( bbp > 0.860801 )
									ret := 0.750000 // buy
						if( VIP > 3.14594 )
							if( VIP <= 34.8333 )
								if( VIP <= 11.8727 )
									ret := -0.132231
								if( VIP > 11.8727 )
									ret := -0.521739
							if( VIP > 34.8333 )
								if( bearPower <= 0.363096 )
									ret := -0.130435
								if( bearPower > 0.363096 )
									ret := 0.888889 // buy
					if( VIP_VIM > -0.528717 )
						if( VIP_VIM <= -0.291722 )
							if( VIM <= 31.4968 )
								if( bearPower <= 0.34761 )
									ret := -0.715909 // sell
								if( bearPower > 0.34761 )
									ret := -0.404255
							if( VIM > 31.4968 )
								ret := 1.000000 // buy
						if( VIP_VIM > -0.291722 )
							if( VIM <= 1.10526 )
								if( bearPower <= 0.302781 )
									ret := 0.387755
								if( bearPower > 0.302781 )
									ret := -0.272727
							if( VIM > 1.10526 )
								if( VIP <= 10.7477 )
									ret := -0.321656
								if( VIP > 10.7477 )
									ret := -0.058537
				if( VIP_VIM > 0.680842 )
					if( VIP <= 21.2255 )
						if( VIM <= 3.79002 )
							if( VIM <= 3.16721 )
								if( VIP <= 3.15558 )
									ret := -0.089744
								if( VIP > 3.15558 )
									ret := 0.278481
							if( VIM > 3.16721 )
								if( VIP_VIM <= 1.82199 )
									ret := -0.827586 // sell
								if( VIP_VIM > 1.82199 )
									ret := 0.000000
						if( VIM > 3.79002 )
							if( bearPower <= 0.348417 )
								if( VIP <= 5.95401 )
									ret := -0.733333 // sell
								if( VIP > 5.95401 )
									ret := 0.163934
							if( bearPower > 0.348417 )
								if( VIP_VIM <= 0.968217 )
									ret := 0.088889
								if( VIP_VIM > 0.968217 )
									ret := 0.481928
					if( VIP > 21.2255 )
						if( VIP <= 33.5491 )
							if( VIP <= 23.9873 )
								if( VIM <= 21.0667 )
									ret := -0.750000 // sell
								if( VIM > 21.0667 )
									ret := -1.000000 // sell
							if( VIP > 23.9873 )
								if( VIM <= 29.8588 )
									ret := -0.166667
								if( VIM > 29.8588 )
									ret := -0.857143 // sell
						if( VIP > 33.5491 )
							if( VIP <= 64.5664 )
								if( bearPower <= 0.336809 )
									ret := 0.500000
								if( bearPower > 0.336809 )
									ret := 0.071429
							if( VIP > 64.5664 )
								if( VIP_VIM <= 1.08765 )
									ret := 0.750000 // buy
								if( VIP_VIM > 1.08765 )
									ret := -0.419355
			if( bbm > 0.001123 )
				if( VIP <= 1.3282 )
					if( bearPower <= 0.555877 )
						if( bullPower <= 1.37833 )
							if( bullPower <= 0.975953 )
								if( bbp <= 1.27 )
									ret := 0.029228
								if( bbp > 1.27 )
									ret := 0.474286
							if( bullPower > 0.975953 )
								if( bbm <= 0.94281 )
									ret := -0.231527
								if( bbm > 0.94281 )
									ret := -1.000000 // sell
						if( bullPower > 1.37833 )
							if( bearPower <= 0.224441 )
								ret := 0.000000
							if( bearPower > 0.224441 )
								if( VIP <= 1.14758 )
									ret := 0.166667
								if( VIP > 1.14758 )
									ret := 1.000000 // buy
					if( bearPower > 0.555877 )
						if( VIP <= 1.18694 )
							if( VIP <= 1.17192 )
								if( VIP <= 1.16088 )
									ret := 0.230769
								if( VIP > 1.16088 )
									ret := 1.000000 // buy
							if( VIP > 1.17192 )
								if( bearPower <= 0.58202 )
									ret := -1.000000 // sell
								if( bearPower > 0.58202 )
									ret := 0.250000
						if( VIP > 1.18694 )
							if( VIP <= 1.23447 )
								ret := 1.000000 // buy
							if( VIP > 1.23447 )
								if( bbp <= 1.48856 )
									ret := 0.857143 // buy
								if( bbp > 1.48856 )
									ret := 0.100000
				if( VIP > 1.3282 )
					if( VIP <= 2.64035 )
						if( VIP <= 2.30571 )
							if( VIM <= 1.78827 )
								if( bbp <= 0.578846 )
									ret := -0.309859
								if( bbp > 0.578846 )
									ret := -0.062756
							if( VIM > 1.78827 )
								if( VIP_VIM <= -0.272 )
									ret := -0.045455
								if( VIP_VIM > -0.272 )
									ret := 0.620000
						if( VIP > 2.30571 )
							if( VIM <= 2.27483 )
								if( bbp <= 0.655223 )
									ret := 0.785714 // buy
								if( bbp > 0.655223 )
									ret := -0.546875
							if( VIM > 2.27483 )
								if( bbp <= 0.759161 )
									ret := -0.954545 // sell
								if( bbp > 0.759161 )
									ret := -0.600000
					if( VIP > 2.64035 )
						if( VIM <= 2.74166 )
							if( bullPower <= 0.303883 )
								if( bbp <= 0.492322 )
									ret := 0.714286 // buy
								if( bbp > 0.492322 )
									ret := 1.000000 // buy
							if( bullPower > 0.303883 )
								if( bearPower <= 0.548021 )
									ret := 0.319728
								if( bearPower > 0.548021 )
									ret := -0.222222
						if( VIM > 2.74166 )
							if( VIM <= 4.09434 )
								if( VIP <= 4.30674 )
									ret := -0.050505
								if( VIP > 4.30674 )
									ret := -0.618421
							if( VIM > 4.09434 )
								if( VIM <= 5.77989 )
									ret := 0.472603
								if( VIM > 5.77989 )
									ret := -0.077882
		if( bearPower > 0.597782 )
			if( VIM <= 4.84363 )
				if( bullPower <= 2.44169 )
					if( VIM <= 3.77558 )
						if( VIP_VIM <= 1.67835 )
							if( bbm <= 0.004924 )
								if( VIM <= 2.03558 )
									ret := -0.747126 // sell
								if( VIM > 2.03558 )
									ret := -0.395833
							if( bbm > 0.004924 )
								if( VIP_VIM <= 0.59347 )
									ret := -0.322917
								if( VIP_VIM > 0.59347 )
									ret := -0.117021
						if( VIP_VIM > 1.67835 )
							if( bbp <= 2.18726 )
								if( VIM <= 1.12809 )
									ret := -0.200000
								if( VIM > 1.12809 )
									ret := 0.794118 // buy
							if( bbp > 2.18726 )
								if( VIM <= 2.36358 )
									ret := -0.600000
								if( VIM > 2.36358 )
									ret := -1.000000 // sell
					if( VIM > 3.77558 )
						if( VIP <= 3.77172 )
							if( bearPower <= 0.618959 )
								ret := -0.750000 // sell
							if( bearPower > 0.618959 )
								ret := -0.166667
						if( VIP > 3.77172 )
							if( bbm <= 0.008991 )
								if( bullPower <= 0.6305 )
									ret := -0.800000 // sell
								if( bullPower > 0.6305 )
									ret := -1.000000 // sell
							if( bbm > 0.008991 )
								if( bbp <= 1.37648 )
									ret := -0.428571
								if( bbp > 1.37648 )
									ret := -0.857143 // sell
				if( bullPower > 2.44169 )
					if( VIP <= 3.08955 )
						ret := -1.000000 // sell
					if( VIP > 3.08955 )
						ret := -0.750000 // sell
			if( VIM > 4.84363 )
				if( VIP <= 6.92355 )
					if( VIP <= 4.84673 )
						if( VIM <= 5.41035 )
							ret := 0.250000
						if( VIM > 5.41035 )
							ret := -1.000000 // sell
					if( VIP > 4.84673 )
						if( VIP_VIM <= 1.16317 )
							if( VIP_VIM <= -0.768982 )
								ret := -0.400000
							if( VIP_VIM > -0.768982 )
								if( VIM <= 5.59032 )
									ret := 0.371429
								if( VIM > 5.59032 )
									ret := 0.820896 // buy
						if( VIP_VIM > 1.16317 )
							ret := -1.000000 // sell
				if( VIP > 6.92355 )
					if( VIP_VIM <= -4.78538 )
						if( bullPower <= 1.14974 )
							ret := 0.500000
						if( bullPower > 1.14974 )
							ret := 1.000000 // buy
					if( VIP_VIM > -4.78538 )
						if( bullPower <= 1.87216 )
							if( VIP_VIM <= -0.397693 )
								if( VIP_VIM <= -0.734981 )
									ret := -0.400000
								if( VIP_VIM > -0.734981 )
									ret := -0.960000 // sell
							if( VIP_VIM > -0.397693 )
								if( bullPower <= 1.4655 )
									ret := -0.237209
								if( bullPower > 1.4655 )
									ret := 0.636364
						if( bullPower > 1.87216 )
							if( VIP_VIM <= -0.929823 )
								ret := 1.000000 // buy
							if( VIP_VIM > -0.929823 )
								ret := 0.250000
	
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
float op_operation = decision_tree_0_QCOM_1Min_4f5aa792(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP, VIP_VIM, VIM)

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


