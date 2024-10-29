//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: ATOMUSDT_15Min_2BT0_b496301c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_15Min_2BT0_b496301c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_15Min_b496301c(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema13 <= -0.047023 )
		if( ema3 <= 10.8577 )
			if( tema <= 10.454 )
				if( ema3 <= 7.50425 )
					if( ema1 <= 7.07757 )
						if( bullPower <= -0.044559 )
							if( ema12 <= -0.11279 )
								if( tema <= 6.07676 )
									ret := 0.402985
								if( tema > 6.07676 )
									ret := -0.704545 // sell
							if( ema12 > -0.11279 )
								if( tema <= 6.16387 )
									ret := 0.135922
								if( tema > 6.16387 )
									ret := 0.548387
						if( bullPower > -0.044559 )
							if( ema3 <= 7.11582 )
								if( ema2 <= 3.92517 )
									ret := -0.777778 // sell
								if( ema2 > 3.92517 )
									ret := 0.011628
							if( ema3 > 7.11582 )
								if( bearPower <= -0.131067 )
									ret := -0.500000
								if( bearPower > -0.131067 )
									ret := 0.925926 // buy
					if( ema1 > 7.07757 )
						if( ema2 <= 7.39699 )
							if( ema2 <= 7.27539 )
								if( bbm <= 0.0795 )
									ret := -0.580645
								if( bbm > 0.0795 )
									ret := 0.117647
							if( ema2 > 7.27539 )
								if( ema3 <= 7.31388 )
									ret := 0.882353 // buy
								if( ema3 > 7.31388 )
									ret := -0.017699
						if( ema2 > 7.39699 )
							if( bearPower <= -0.107911 )
								if( ema3 <= 7.47962 )
									ret := -0.958333 // sell
								if( ema3 > 7.47962 )
									ret := -0.500000
							if( bearPower > -0.107911 )
								if( tema <= 7.36966 )
									ret := 0.333333
								if( tema > 7.36966 )
									ret := -0.760000 // sell
				if( ema3 > 7.50425 )
					if( bbm <= 0.189291 )
						if( ema3 <= 9.42929 )
							if( bbm <= 0.04144 )
								if( ema1 <= 7.95106 )
									ret := -0.241071
								if( ema1 > 7.95106 )
									ret := 0.145480
							if( bbm > 0.04144 )
								if( ema1 <= 7.68547 )
									ret := 0.609890
								if( ema1 > 7.68547 )
									ret := 0.251629
						if( ema3 > 9.42929 )
							if( ema1 <= 9.83 )
								if( tema <= 9.16892 )
									ret := 0.843750 // buy
								if( tema > 9.16892 )
									ret := -0.011283
							if( ema1 > 9.83 )
								if( ema1 <= 9.86527 )
									ret := 0.662069
								if( ema1 > 9.86527 )
									ret := 0.152617
					if( bbm > 0.189291 )
						if( ema2 <= 10.1638 )
							if( bbp <= 0.109066 )
								if( ema1 <= 9.54918 )
									ret := 0.756757 // buy
								if( ema1 > 9.54918 )
									ret := 0.446429
							if( bbp > 0.109066 )
								if( bbp <= 0.209783 )
									ret := -1.000000 // sell
								if( bbp > 0.209783 )
									ret := -0.166667
						if( ema2 > 10.1638 )
							if( bearPower <= -0.541078 )
								if( bbm <= 0.659046 )
									ret := -0.620690
								if( bbm > 0.659046 )
									ret := 0.400000
							if( bearPower > -0.541078 )
								if( ema12 <= -0.076268 )
									ret := 0.661017
								if( ema12 > -0.076268 )
									ret := -0.200000
			if( tema > 10.454 )
				if( ema12 <= -0.070645 )
					if( ema2 <= 10.7381 )
						if( ema3 <= 10.7307 )
							if( bbm <= 0.054 )
								ret := -1.000000 // sell
							if( bbm > 0.054 )
								if( bullPower <= -0.051553 )
									ret := 1.000000 // buy
								if( bullPower > -0.051553 )
									ret := 0.250000
						if( ema3 > 10.7307 )
							if( ema12 <= -0.073259 )
								if( ema2 <= 10.7043 )
									ret := -0.846154 // sell
								if( ema2 > 10.7043 )
									ret := -0.187500
							if( ema12 > -0.073259 )
								ret := 0.166667
					if( ema2 > 10.7381 )
						if( ema13 <= -0.11051 )
							if( bbp <= -0.291023 )
								ret := -0.142857
							if( bbp > -0.291023 )
								if( bearPower <= -0.149552 )
									ret := 0.944444 // buy
								if( bearPower > -0.149552 )
									ret := 0.000000
						if( ema13 > -0.11051 )
							ret := -0.857143 // sell
				if( ema12 > -0.070645 )
					if( ema13 <= -0.059581 )
						if( BBPower_Color <= 0.5 )
							if( bullPower <= -0.040978 )
								if( ema12 <= -0.04268 )
									ret := 0.569231
								if( ema12 > -0.04268 )
									ret := 0.090909
							if( bullPower > -0.040978 )
								if( ema2 <= 10.8178 )
									ret := 0.807229 // buy
								if( ema2 > 10.8178 )
									ret := 0.111111
						if( BBPower_Color > 0.5 )
							if( bearPower <= -0.032668 )
								if( ema13 <= -0.078385 )
									ret := 0.400000
								if( ema13 > -0.078385 )
									ret := 1.000000 // buy
							if( bearPower > -0.032668 )
								if( ema13 <= -0.076486 )
									ret := -0.714286 // sell
								if( ema13 > -0.076486 )
									ret := 0.142857
					if( ema13 > -0.059581 )
						if( bbp <= -0.162087 )
							if( bullPower <= -0.002763 )
								ret := 1.000000 // buy
							if( bullPower > -0.002763 )
								ret := 0.666667
						if( bbp > -0.162087 )
							if( bullPower <= -0.010722 )
								if( ema13 <= -0.048313 )
									ret := 0.000000
								if( ema13 > -0.048313 )
									ret := -0.636364
							if( bullPower > -0.010722 )
								if( bearPower <= -0.058745 )
									ret := 0.076923
								if( bearPower > -0.058745 )
									ret := 0.539474
		if( ema3 > 10.8577 )
			if( ema13 <= -0.134834 )
				if( ema2 <= 10.8852 )
					if( bullPower <= -0.225244 )
						ret := -1.000000 // sell
					if( bullPower > -0.225244 )
						if( ema3 <= 10.9583 )
							if( bearPower <= -0.123603 )
								if( ema3 <= 10.915 )
									ret := -0.363636
								if( ema3 > 10.915 )
									ret := -0.875000 // sell
							if( bearPower > -0.123603 )
								if( tema <= 10.6625 )
									ret := 0.857143 // buy
								if( tema > 10.6625 )
									ret := -0.333333
						if( ema3 > 10.9583 )
							if( bullPower <= -0.039892 )
								ret := 1.000000 // buy
							if( bullPower > -0.039892 )
								ret := -0.250000
				if( ema2 > 10.8852 )
					if( bbp <= -0.207946 )
						if( bearPower <= -0.944653 )
							if( tema <= 12.2633 )
								if( bbp <= -1.54887 )
									ret := 1.000000 // buy
								if( bbp > -1.54887 )
									ret := 0.857143 // buy
							if( tema > 12.2633 )
								ret := 0.000000
						if( bearPower > -0.944653 )
							if( bbm <= 0.342368 )
								if( tema <= 10.5521 )
									ret := 1.000000 // buy
								if( tema > 10.5521 )
									ret := 0.256034
							if( bbm > 0.342368 )
								if( ema1 <= 11.8172 )
									ret := -0.680851
								if( ema1 > 11.8172 )
									ret := 0.096386
					if( bbp > -0.207946 )
						if( ema1 <= 18.0533 )
							if( tema <= 17.1295 )
								if( ema1 <= 13.7099 )
									ret := 0.126456
								if( ema1 > 13.7099 )
									ret := -0.198758
							if( tema > 17.1295 )
								if( ema13 <= -0.16222 )
									ret := 0.828571 // buy
								if( ema13 > -0.16222 )
									ret := -0.200000
						if( ema1 > 18.0533 )
							if( tema <= 18.8092 )
								if( bbm <= 0.144164 )
									ret := -1.000000 // sell
								if( bbm > 0.144164 )
									ret := -0.500000
							if( tema > 18.8092 )
								if( bearPower <= -0.189644 )
									ret := -0.857143 // sell
								if( bearPower > -0.189644 )
									ret := 0.090909
			if( ema13 > -0.134834 )
				if( ema3 <= 18.1925 )
					if( bbm <= 0.056176 )
						if( ema13 <= -0.101364 )
							if( tema <= 10.789 )
								if( tema <= 10.7783 )
									ret := -0.090909
								if( tema > 10.7783 )
									ret := -0.800000 // sell
							if( tema > 10.789 )
								if( ema12 <= -0.049126 )
									ret := 0.090909
								if( ema12 > -0.049126 )
									ret := 0.488372
						if( ema13 > -0.101364 )
							if( ema1 <= 10.9599 )
								if( ema1 <= 10.9493 )
									ret := -0.034783
								if( ema1 > 10.9493 )
									ret := 0.718750 // buy
							if( ema1 > 10.9599 )
								if( ema3 <= 11.6205 )
									ret := -0.224432
								if( ema3 > 11.6205 )
									ret := -0.066194
					if( bbm > 0.056176 )
						if( bbp <= 0.1635 )
							if( bbp <= -0.495035 )
								if( ema12 <= -0.121534 )
									ret := 0.750000 // buy
								if( ema12 > -0.121534 )
									ret := -0.571429
							if( bbp > -0.495035 )
								if( tema <= 17.9383 )
									ret := 0.105399
								if( tema > 17.9383 )
									ret := 0.900000 // buy
						if( bbp > 0.1635 )
							if( bbm <= 0.218984 )
								if( ema13 <= -0.090934 )
									ret := 0.200000
								if( ema13 > -0.090934 )
									ret := -0.636364
							if( bbm > 0.218984 )
								if( ema13 <= -0.080901 )
									ret := -1.000000 // sell
								if( ema13 > -0.080901 )
									ret := -0.625000
				if( ema3 > 18.1925 )
					if( tema <= 20.4833 )
						if( ema3 <= 18.5507 )
							if( ema13 <= -0.056465 )
								if( bbp <= -0.108772 )
									ret := -0.971429 // sell
								if( bbp > -0.108772 )
									ret := -0.750000 // sell
							if( ema13 > -0.056465 )
								ret := -0.500000
						if( ema3 > 18.5507 )
							if( ema2 <= 18.6529 )
								if( bbm <= 0.14898 )
									ret := 0.800000 // buy
								if( bbm > 0.14898 )
									ret := 0.200000
							if( ema2 > 18.6529 )
								if( ema1 <= 19.3526 )
									ret := -0.933333 // sell
								if( ema1 > 19.3526 )
									ret := -0.442105
					if( tema > 20.4833 )
						if( bearPower <= -0.226951 )
							ret := -0.857143 // sell
						if( bearPower > -0.226951 )
							if( ema2 <= 20.9059 )
								if( ema13 <= -0.096005 )
									ret := 1.000000 // buy
								if( ema13 > -0.096005 )
									ret := 0.687500
							if( ema2 > 20.9059 )
								if( ema13 <= -0.09053 )
									ret := -0.071429
								if( ema13 > -0.09053 )
									ret := 0.545455
	if( ema13 > -0.047023 )
		if( ema1 <= 14.0701 )
			if( bbp <= 0.718812 )
				if( ema3 <= 14.0086 )
					if( tema <= 12.0191 )
						if( ema13 <= 0.01731 )
							if( ema1 <= 4.09121 )
								if( ema13 <= 0.003999 )
									ret := 0.119850
								if( ema13 > 0.003999 )
									ret := 0.435897
							if( ema1 > 4.09121 )
								if( bbm <= 0.03508 )
									ret := -0.014481
								if( bbm > 0.03508 )
									ret := 0.059297
						if( ema13 > 0.01731 )
							if( ema2 <= 8.41521 )
								if( tema <= 8.39692 )
									ret := 0.103662
								if( tema > 8.39692 )
									ret := 0.427822
							if( ema2 > 8.41521 )
								if( ema1 <= 8.49512 )
									ret := -0.322581
								if( ema1 > 8.49512 )
									ret := 0.039149
					if( tema > 12.0191 )
						if( bbp <= 0.158298 )
							if( ema3 <= 12.1662 )
								if( bearPower <= -0.02396 )
									ret := -0.324324
								if( bearPower > -0.02396 )
									ret := 0.024263
							if( ema3 > 12.1662 )
								if( bullPower <= 0.143615 )
									ret := 0.024846
								if( bullPower > 0.143615 )
									ret := 0.394958
						if( bbp > 0.158298 )
							if( ema13 <= 0.192274 )
								if( bullPower <= 0.112507 )
									ret := 0.303797
								if( bullPower > 0.112507 )
									ret := -0.212477
							if( ema13 > 0.192274 )
								if( bbm <= 0.094695 )
									ret := 0.500000
								if( bbm > 0.094695 )
									ret := -0.046377
				if( ema3 > 14.0086 )
					if( bearPower <= -0.056469 )
						if( bbp <= -0.112665 )
							ret := 0.166667
						if( bbp > -0.112665 )
							ret := -0.571429
					if( bearPower > -0.056469 )
						if( ema12 <= -0.016516 )
							ret := -0.200000
						if( ema12 > -0.016516 )
							if( ema2 <= 14.0468 )
								if( bbp <= 0.109965 )
									ret := 0.949153 // buy
								if( bbp > 0.109965 )
									ret := 0.500000
							if( ema2 > 14.0468 )
								ret := 0.571429
			if( bbp > 0.718812 )
				if( ema13 <= 0.272181 )
					if( ema2 <= 11.6196 )
						if( bbp <= 0.77957 )
							ret := -0.750000 // sell
						if( bbp > 0.77957 )
							if( ema13 <= 0.215314 )
								ret := 0.500000
							if( ema13 > 0.215314 )
								ret := 1.000000 // buy
					if( ema2 > 11.6196 )
						if( bbm <= 0.284977 )
							ret := -0.142857
						if( bbm > 0.284977 )
							ret := -1.000000 // sell
				if( ema13 > 0.272181 )
					if( bullPower <= 0.523894 )
						if( bbm <= 0.176588 )
							if( bbm <= 0.171276 )
								if( ema12 <= 0.211023 )
									ret := -0.428571
								if( ema12 > 0.211023 )
									ret := 0.838710 // buy
							if( bbm > 0.171276 )
								ret := -1.000000 // sell
						if( bbm > 0.176588 )
							if( ema2 <= 13.2155 )
								ret := 1.000000 // buy
							if( ema2 > 13.2155 )
								ret := 0.750000 // buy
					if( bullPower > 0.523894 )
						if( ema3 <= 10.1136 )
							if( ema13 <= 0.453636 )
								ret := 0.750000 // buy
							if( ema13 > 0.453636 )
								ret := 1.000000 // buy
						if( ema3 > 10.1136 )
							if( tema <= 13.9153 )
								if( ema13 <= 0.527623 )
									ret := 0.254902
								if( ema13 > 0.527623 )
									ret := -1.000000 // sell
							if( tema > 13.9153 )
								if( ema1 <= 13.8921 )
									ret := 1.000000 // buy
								if( ema1 > 13.8921 )
									ret := 0.250000
		if( ema1 > 14.0701 )
			if( ema2 <= 14.1899 )
				if( bearPower <= -0.009053 )
					if( ema12 <= 0.058152 )
						if( ema13 <= -0.035766 )
							if( bbm <= 0.066562 )
								ret := 1.000000 // buy
							if( bbm > 0.066562 )
								if( bbp <= -0.05126 )
									ret := -0.500000
								if( bbp > -0.05126 )
									ret := -0.250000
						if( ema13 > -0.035766 )
							if( bbp <= -0.07807 )
								if( bbm <= 0.056 )
									ret := 0.000000
								if( bbm > 0.056 )
									ret := -0.631579
							if( bbp > -0.07807 )
								if( bullPower <= 0.027913 )
									ret := -0.977778 // sell
								if( bullPower > 0.027913 )
									ret := -0.728814 // sell
					if( ema12 > 0.058152 )
						if( tema <= 14.2585 )
							ret := 0.000000
						if( tema > 14.2585 )
							ret := 0.250000
				if( bearPower > -0.009053 )
					if( bullPower <= 0.378281 )
						if( ema2 <= 14.0739 )
							if( bearPower <= 0.198964 )
								if( bbm <= 0.127219 )
									ret := 0.183673
								if( bbm > 0.127219 )
									ret := 0.740741 // buy
							if( bearPower > 0.198964 )
								ret := -1.000000 // sell
						if( ema2 > 14.0739 )
							if( bearPower <= 0.072071 )
								if( ema1 <= 14.2299 )
									ret := -0.216216
								if( ema1 > 14.2299 )
									ret := 0.571429
							if( bearPower > 0.072071 )
								if( ema3 <= 14.0758 )
									ret := -0.931034 // sell
								if( ema3 > 14.0758 )
									ret := -0.461538
					if( bullPower > 0.378281 )
						if( bbm <= 0.177252 )
							ret := -0.571429
						if( bbm > 0.177252 )
							ret := -1.000000 // sell
			if( ema2 > 14.1899 )
				if( ema3 <= 15.0132 )
					if( bullPower <= 0.312653 )
						if( ema2 <= 14.9058 )
							if( tema <= 14.1712 )
								if( bearPower <= -0.148633 )
									ret := 0.724138 // buy
								if( bearPower > -0.148633 )
									ret := 0.166667
							if( tema > 14.1712 )
								if( bbp <= -0.250185 )
									ret := -0.937500 // sell
								if( bbp > -0.250185 )
									ret := 0.011424
						if( ema2 > 14.9058 )
							if( ema13 <= 0.017671 )
								if( bbm <= 0.077547 )
									ret := -0.642857
								if( bbm > 0.077547 )
									ret := 0.275862
							if( ema13 > 0.017671 )
								if( ema1 <= 14.998 )
									ret := 0.807018 // buy
								if( ema1 > 14.998 )
									ret := 0.289855
					if( bullPower > 0.312653 )
						if( ema1 <= 15.1069 )
							if( bbp <= 0.378112 )
								ret := 0.166667
							if( bbp > 0.378112 )
								if( tema <= 14.6158 )
									ret := -0.454545
								if( tema > 14.6158 )
									ret := -0.881356 // sell
						if( ema1 > 15.1069 )
							if( ema12 <= 0.427011 )
								if( ema2 <= 15.0185 )
									ret := 0.833333 // buy
								if( ema2 > 15.0185 )
									ret := -0.300000
							if( ema12 > 0.427011 )
								ret := 1.000000 // buy
				if( ema3 > 15.0132 )
					if( ema3 <= 15.2103 )
						if( bearPower <= 0.090401 )
							if( tema <= 14.9476 )
								ret := 1.000000 // buy
							if( tema > 14.9476 )
								if( ema13 <= -0.013554 )
									ret := -0.441860
								if( ema13 > -0.013554 )
									ret := -0.847059 // sell
						if( bearPower > 0.090401 )
							if( tema <= 15.7196 )
								if( bearPower <= 0.15958 )
									ret := 0.750000 // buy
								if( bearPower > 0.15958 )
									ret := 1.000000 // buy
							if( tema > 15.7196 )
								ret := -0.333333
					if( ema3 > 15.2103 )
						if( ema3 <= 15.4843 )
							if( bbm <= 0.118757 )
								if( bullPower <= -0.009813 )
									ret := -0.941176 // sell
								if( bullPower > -0.009813 )
									ret := -0.112676
							if( bbm > 0.118757 )
								if( bbm <= 0.3865 )
									ret := 0.636364
								if( bbm > 0.3865 )
									ret := -1.000000 // sell
						if( ema3 > 15.4843 )
							if( ema1 <= 17.3104 )
								if( ema3 <= 16.0006 )
									ret := -0.097257
								if( ema3 > 16.0006 )
									ret := -0.547550
							if( ema1 > 17.3104 )
								if( ema3 <= 18.3447 )
									ret := 0.150246
								if( ema3 > 18.3447 )
									ret := -0.257653
	
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
float op_operation = decision_tree_0_ATOMUSDT_15Min_b496301c(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)

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


