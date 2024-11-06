//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: SNAP_1Min_1B00_b2f09256 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_1B00_b2f09256", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_b2f09256(bbm, bearPower, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= 0.024868 )
		if( bullPower <= -0.017095 )
			if( bbm <= 0.00241 )
				if( bbp <= -0.08482 )
					if( bbp <= -0.094823 )
						if( bullPower <= -0.04957 )
							if( bullPower <= -0.054177 )
								if( bbp <= -0.171911 )
									ret := 0.842857 // buy
								if( bbp > -0.171911 )
									ret := 0.616438
							if( bullPower > -0.054177 )
								if( bearPower <= -0.051946 )
									ret := 0.954545 // buy
								if( bearPower > -0.051946 )
									ret := 0.809524 // buy
						if( bullPower > -0.04957 )
							if( bullPower <= -0.04817 )
								if( bearPower <= -0.048823 )
									ret := 0.166667
								if( bearPower > -0.048823 )
									ret := -0.900000 // sell
							if( bullPower > -0.04817 )
								if( bearPower <= -0.047805 )
									ret := 0.833333 // buy
								if( bearPower > -0.047805 )
									ret := -0.200000
					if( bbp > -0.094823 )
						if( bearPower <= -0.046242 )
							ret := 1.000000 // buy
						if( bearPower > -0.046242 )
							if( bullPower <= -0.043501 )
								if( bullPower <= -0.044015 )
									ret := 0.850000 // buy
								if( bullPower > -0.044015 )
									ret := 0.687500
							if( bullPower > -0.043501 )
								if( bbp <= -0.085361 )
									ret := 0.900000 // buy
								if( bbp > -0.085361 )
									ret := 1.000000 // buy
				if( bbp > -0.08482 )
					if( bearPower <= -0.034841 )
						if( bullPower <= -0.035348 )
							if( bbm <= 1.4e-05 )
								if( bullPower <= -0.03655 )
									ret := 0.059406
								if( bullPower > -0.03655 )
									ret := 0.512500
							if( bbm > 1.4e-05 )
								ret := 0.941176 // buy
						if( bullPower > -0.035348 )
							if( bullPower <= -0.035203 )
								ret := -0.789474 // sell
							if( bullPower > -0.035203 )
								ret := -0.285714
					if( bearPower > -0.034841 )
						if( bullPower <= -0.025286 )
							if( bbp <= -0.052918 )
								if( bbp <= -0.053114 )
									ret := 0.463339
								if( bbp > -0.053114 )
									ret := -0.333333
							if( bbp > -0.052918 )
								if( bbp <= -0.052511 )
									ret := 0.906977 // buy
								if( bbp > -0.052511 )
									ret := 0.568182
						if( bullPower > -0.025286 )
							if( bbp <= -0.042932 )
								if( bullPower <= -0.021711 )
									ret := 0.156915
								if( bullPower > -0.021711 )
									ret := -0.460000
							if( bbp > -0.042932 )
								if( bbm <= 0.000189 )
									ret := 0.462875
								if( bbm > 0.000189 )
									ret := 1.000000 // buy
			if( bbm > 0.00241 )
				if( bullPower <= -0.11306 )
					if( bearPower <= -0.310639 )
						if( bearPower <= -0.779057 )
							if( bullPower <= -1.01435 )
								ret := 0.600000
							if( bullPower > -1.01435 )
								ret := -0.076923
						if( bearPower > -0.779057 )
							if( bbp <= -0.495298 )
								if( bullPower <= -0.260184 )
									ret := 0.972222 // buy
								if( bullPower > -0.260184 )
									ret := 0.631579
							if( bbp > -0.495298 )
								ret := 1.000000 // buy
					if( bearPower > -0.310639 )
						if( bbp <= -0.481383 )
							ret := -0.272727
						if( bbp > -0.481383 )
							if( bullPower <= -0.152596 )
								if( bullPower <= -0.179464 )
									ret := 0.500000
								if( bullPower > -0.179464 )
									ret := 0.958333 // buy
							if( bullPower > -0.152596 )
								if( bbm <= 0.055307 )
									ret := 0.263158
								if( bbm > 0.055307 )
									ret := 0.608696
				if( bullPower > -0.11306 )
					if( bearPower <= -0.103962 )
						if( bearPower <= -0.111729 )
							if( bullPower <= -0.087188 )
								if( bullPower <= -0.104491 )
									ret := 0.105263
								if( bullPower > -0.104491 )
									ret := -0.494949
							if( bullPower > -0.087188 )
								if( bullPower <= -0.051259 )
									ret := 0.215000
								if( bullPower > -0.051259 )
									ret := -0.118705
						if( bearPower > -0.111729 )
							if( bbp <= -0.17553 )
								if( bbm <= 0.03345 )
									ret := 0.700000 // buy
								if( bbm > 0.03345 )
									ret := 1.000000 // buy
							if( bbp > -0.17553 )
								if( bullPower <= -0.065653 )
									ret := -0.285714
								if( bullPower > -0.065653 )
									ret := 0.443750
					if( bearPower > -0.103962 )
						if( bullPower <= -0.052214 )
							if( bbp <= -0.169273 )
								if( bullPower <= -0.0755 )
									ret := 0.724138 // buy
								if( bullPower > -0.0755 )
									ret := -0.125000
							if( bbp > -0.169273 )
								if( bullPower <= -0.055722 )
									ret := -0.473684
								if( bullPower > -0.055722 )
									ret := -0.208955
						if( bullPower > -0.052214 )
							if( bearPower <= -0.066407 )
								if( bearPower <= -0.068982 )
									ret := 0.117555
								if( bearPower > -0.068982 )
									ret := 0.421488
							if( bearPower > -0.066407 )
								if( bearPower <= -0.054 )
									ret := -0.078990
								if( bearPower > -0.054 )
									ret := 0.034358
		if( bullPower > -0.017095 )
			if( bbp <= 0.000589 )
				if( bbm <= 0.000138 )
					if( bearPower <= -0.004968 )
						if( bearPower <= -0.005654 )
							if( bbp <= -0.011597 )
								if( bullPower <= -0.016736 )
									ret := -0.294118
								if( bullPower > -0.016736 )
									ret := 0.271990
							if( bbp > -0.011597 )
								if( bearPower <= -0.005672 )
									ret := -0.387097
								if( bearPower > -0.005672 )
									ret := -0.875000 // sell
						if( bearPower > -0.005654 )
							if( bullPower <= -0.005558 )
								if( bullPower <= -0.005638 )
									ret := 0.600000
								if( bullPower > -0.005638 )
									ret := 0.871795 // buy
							if( bullPower > -0.005558 )
								if( bbp <= -0.010216 )
									ret := 0.337209
								if( bbp > -0.010216 )
									ret := 0.629630
					if( bearPower > -0.004968 )
						if( bbp <= -0.001226 )
							if( bbm <= 1e-06 )
								if( bbp <= -0.00948 )
									ret := -0.191489
								if( bbp > -0.00948 )
									ret := 0.135135
							if( bbm > 1e-06 )
								if( bearPower <= -0.002185 )
									ret := 0.125000
								if( bearPower > -0.002185 )
									ret := 0.827586 // buy
						if( bbp > -0.001226 )
							if( bullPower <= -0.000566 )
								if( bbp <= -0.001178 )
									ret := -0.642857
								if( bbp > -0.001178 )
									ret := -1.000000 // sell
							if( bullPower > -0.000566 )
								if( bearPower <= -0.000497 )
									ret := 0.633333
								if( bearPower > -0.000497 )
									ret := -0.114286
				if( bbm > 0.000138 )
					if( bearPower <= -0.080631 )
						if( bearPower <= -0.186426 )
							if( bearPower <= -0.260633 )
								if( bullPower <= 0.032609 )
									ret := -0.421053
								if( bullPower > 0.032609 )
									ret := 0.375000
							if( bearPower > -0.260633 )
								if( bbp <= -0.209679 )
									ret := 1.000000 // buy
								if( bbp > -0.209679 )
									ret := 0.700000 // buy
						if( bearPower > -0.186426 )
							if( bbm <= 0.144201 )
								if( bbp <= -0.096453 )
									ret := 0.111111
								if( bbp > -0.096453 )
									ret := -0.389163
							if( bbm > 0.144201 )
								if( bbp <= -0.065559 )
									ret := -0.780488 // sell
								if( bbp > -0.065559 )
									ret := -0.262295
					if( bearPower > -0.080631 )
						if( bearPower <= -0.073842 )
							if( bearPower <= -0.076265 )
								if( bbp <= -0.07176 )
									ret := -0.333333
								if( bbp > -0.07176 )
									ret := 0.687500
							if( bearPower > -0.076265 )
								if( bearPower <= -0.075077 )
									ret := 1.000000 // buy
								if( bearPower > -0.075077 )
									ret := 0.641509
						if( bearPower > -0.073842 )
							if( bbp <= -0.036075 )
								if( bearPower <= -0.028721 )
									ret := 0.002024
								if( bearPower > -0.028721 )
									ret := -0.169167
							if( bbp > -0.036075 )
								if( bbm <= 0.007282 )
									ret := -0.066796
								if( bbm > 0.007282 )
									ret := 0.040998
			if( bbp > 0.000589 )
				if( bearPower <= 0.00425 )
					if( bullPower <= 0.000433 )
						if( bullPower <= 0.000423 )
							if( bearPower <= 0.000402 )
								if( bullPower <= 0.000338 )
									ret := -0.500000
								if( bullPower > 0.000338 )
									ret := 0.000000
							if( bearPower > 0.000402 )
								ret := -0.714286 // sell
						if( bullPower > 0.000423 )
							if( bbp <= 0.000858 )
								ret := -1.000000 // sell
							if( bbp > 0.000858 )
								ret := -0.800000 // sell
					if( bullPower > 0.000433 )
						if( bullPower <= 0.037737 )
							if( bbp <= 0.004372 )
								if( bbm <= 0.049822 )
									ret := -0.049840
								if( bbm > 0.049822 )
									ret := -0.464646
							if( bbp > 0.004372 )
								if( bullPower <= 0.003044 )
									ret := -0.131285
								if( bullPower > 0.003044 )
									ret := 0.054478
						if( bullPower > 0.037737 )
							if( bearPower <= -0.030452 )
								if( bbp <= 0.015737 )
									ret := -0.156463
								if( bbp > 0.015737 )
									ret := 0.658537
							if( bearPower > -0.030452 )
								if( bbp <= 0.021005 )
									ret := -0.780702 // sell
								if( bbp > 0.021005 )
									ret := -0.256410
				if( bearPower > 0.00425 )
					if( bearPower <= 0.00456 )
						if( bearPower <= 0.004491 )
							if( bearPower <= 0.004426 )
								if( bbm <= 0.01405 )
									ret := -0.185430
								if( bbm > 0.01405 )
									ret := -0.608696
							if( bearPower > 0.004426 )
								if( bearPower <= 0.004447 )
									ret := 0.333333
								if( bearPower > 0.004447 )
									ret := -0.235294
						if( bearPower > 0.004491 )
							if( bbp <= 0.00906 )
								if( bearPower <= 0.004494 )
									ret := -0.923077 // sell
								if( bearPower > 0.004494 )
									ret := -1.000000 // sell
							if( bbp > 0.00906 )
								if( bbp <= 0.01905 )
									ret := -0.333333
								if( bbp > 0.01905 )
									ret := -0.774194 // sell
					if( bearPower > 0.00456 )
						if( bullPower <= 0.012273 )
							if( bbm <= 0.0058 )
								if( bearPower <= 0.012128 )
									ret := -0.112638
								if( bearPower > 0.012128 )
									ret := -0.752577 // sell
							if( bbm > 0.0058 )
								if( bbp <= 0.016443 )
									ret := -0.823529 // sell
								if( bbp > 0.016443 )
									ret := -0.583333
						if( bullPower > 0.012273 )
							if( bullPower <= 0.012692 )
								if( bearPower <= 0.007292 )
									ret := 0.722222 // buy
								if( bearPower > 0.007292 )
									ret := 0.191176
							if( bullPower > 0.012692 )
								if( bearPower <= 0.004671 )
									ret := 0.620000
								if( bearPower > 0.004671 )
									ret := -0.007233
	if( bbp > 0.024868 )
		if( bullPower <= 0.094604 )
			if( bbm <= 0.0024 )
				if( bullPower <= 0.017807 )
					if( bbm <= 2.1e-05 )
						if( bbp <= 0.02524 )
							if( bullPower <= 0.012568 )
								if( bbp <= 0.024982 )
									ret := -0.714286 // sell
								if( bbp > 0.024982 )
									ret := 0.041667
							if( bullPower > 0.012568 )
								if( bullPower <= 0.012616 )
									ret := -0.800000 // sell
								if( bullPower > 0.012616 )
									ret := -1.000000 // sell
						if( bbp > 0.02524 )
							if( bbp <= 0.033563 )
								if( bullPower <= 0.0166 )
									ret := -0.130807
								if( bullPower > 0.0166 )
									ret := -0.627907
							if( bbp > 0.033563 )
								if( bearPower <= 0.017086 )
									ret := 0.218182
								if( bearPower > 0.017086 )
									ret := -0.048780
					if( bbm > 2.1e-05 )
						if( bullPower <= 0.016296 )
							if( bullPower <= 0.014153 )
								ret := 0.333333
							if( bullPower > 0.014153 )
								ret := -0.733333 // sell
						if( bullPower > 0.016296 )
							ret := 0.769231 // buy
				if( bullPower > 0.017807 )
					if( bullPower <= 0.019046 )
						if( bullPower <= 0.01888 )
							if( bullPower <= 0.018553 )
								if( bullPower <= 0.01847 )
									ret := -0.539823
								if( bullPower > 0.01847 )
									ret := -0.866667 // sell
							if( bullPower > 0.018553 )
								if( bbp <= 0.037293 )
									ret := 0.400000
								if( bbp > 0.037293 )
									ret := -0.076923
						if( bullPower > 0.01888 )
							if( bbp <= 0.037951 )
								if( bbp <= 0.037855 )
									ret := -0.928571 // sell
								if( bbp > 0.037855 )
									ret := -1.000000 // sell
							if( bbp > 0.037951 )
								ret := -0.800000 // sell
					if( bullPower > 0.019046 )
						if( bullPower <= 0.019754 )
							if( bullPower <= 0.019543 )
								if( bullPower <= 0.019428 )
									ret := 0.072464
								if( bullPower > 0.019428 )
									ret := -0.750000 // sell
							if( bullPower > 0.019543 )
								ret := 0.750000 // buy
						if( bullPower > 0.019754 )
							if( bullPower <= 0.079028 )
								if( bbp <= 0.13302 )
									ret := -0.379521
								if( bbp > 0.13302 )
									ret := 0.095238
							if( bullPower > 0.079028 )
								if( bullPower <= 0.086164 )
									ret := -0.864865 // sell
								if( bullPower > 0.086164 )
									ret := -0.533333
			if( bbm > 0.0024 )
				if( bbp <= 0.110072 )
					if( bullPower <= 0.051218 )
						if( bearPower <= 0.025051 )
							if( bearPower <= -0.007395 )
								if( bullPower <= 0.041744 )
									ret := -0.109091
								if( bullPower > 0.041744 )
									ret := 0.431818
							if( bearPower > -0.007395 )
								if( bbm <= 0.005001 )
									ret := 0.249123
								if( bbm > 0.005001 )
									ret := -0.076823
						if( bearPower > 0.025051 )
							if( bearPower <= 0.029729 )
								if( bbp <= 0.066625 )
									ret := -0.106952
								if( bbp > 0.066625 )
									ret := -0.418511
							if( bearPower > 0.029729 )
								if( bbp <= 0.087161 )
									ret := -0.094650
								if( bbp > 0.087161 )
									ret := -0.656250
					if( bullPower > 0.051218 )
						if( bbm <= 0.030287 )
							if( bullPower <= 0.052286 )
								if( bbp <= 0.080983 )
									ret := 0.606383
								if( bbp > 0.080983 )
									ret := 0.162500
							if( bullPower > 0.052286 )
								if( bbp <= 0.0917 )
									ret := -0.033797
								if( bbp > 0.0917 )
									ret := 0.201408
						if( bbm > 0.030287 )
							if( bbp <= 0.077977 )
								if( bullPower <= 0.069445 )
									ret := 0.080495
								if( bullPower > 0.069445 )
									ret := -0.161404
							if( bbp > 0.077977 )
								if( bullPower <= 0.087141 )
									ret := -0.208821
								if( bullPower > 0.087141 )
									ret := 0.196721
				if( bbp > 0.110072 )
					if( bearPower <= 0.032466 )
						if( bbm <= 0.067313 )
							if( bullPower <= 0.085522 )
								ret := -0.416667
							if( bullPower > 0.085522 )
								if( bbm <= 0.056427 )
									ret := -0.636364
								if( bbm > 0.056427 )
									ret := -0.860000 // sell
						if( bbm > 0.067313 )
							if( bbp <= 0.115846 )
								ret := -0.888889 // sell
							if( bbp > 0.115846 )
								ret := 0.250000
					if( bearPower > 0.032466 )
						if( bullPower <= 0.081146 )
							if( bbm <= 0.010262 )
								if( bearPower <= 0.054527 )
									ret := -0.861111 // sell
								if( bearPower > 0.054527 )
									ret := -0.450000
							if( bbm > 0.010262 )
								if( bbp <= 0.130368 )
									ret := -0.271579
								if( bbp > 0.130368 )
									ret := 0.255814
						if( bullPower > 0.081146 )
							if( bullPower <= 0.084335 )
								if( bearPower <= 0.060433 )
									ret := 0.677778
								if( bearPower > 0.060433 )
									ret := -0.368421
							if( bullPower > 0.084335 )
								if( bbp <= 0.124429 )
									ret := 0.812500 // buy
								if( bbp > 0.124429 )
									ret := -0.114865
		if( bullPower > 0.094604 )
			if( bbp <= 2.62504 )
				if( bbp <= 0.081869 )
					if( bullPower <= 0.111986 )
						if( bbp <= 0.067465 )
							if( bearPower <= -0.051401 )
								if( bullPower <= 0.102413 )
									ret := -0.888889 // sell
								if( bullPower > 0.102413 )
									ret := -0.454545
							if( bearPower > -0.051401 )
								if( bbm <= 0.142103 )
									ret := 0.090909
								if( bbm > 0.142103 )
									ret := 1.000000 // buy
						if( bbp > 0.067465 )
							if( bullPower <= 0.104259 )
								ret := -0.888889 // sell
							if( bullPower > 0.104259 )
								ret := -0.666667
					if( bullPower > 0.111986 )
						if( bbm <= 0.187471 )
							if( bullPower <= 0.116955 )
								ret := 0.772727 // buy
							if( bullPower > 0.116955 )
								ret := 1.000000 // buy
						if( bbm > 0.187471 )
							ret := -0.083333
				if( bbp > 0.081869 )
					if( bearPower <= 0.045702 )
						if( bullPower <= 0.243298 )
							if( bbm <= 0.197627 )
								if( bearPower <= 0.004858 )
									ret := -0.147541
								if( bearPower > 0.004858 )
									ret := -0.555556
							if( bbm > 0.197627 )
								if( bbm <= 0.211048 )
									ret := -0.772727 // sell
								if( bbm > 0.211048 )
									ret := -1.000000 // sell
						if( bullPower > 0.243298 )
							if( bullPower <= 0.298979 )
								if( bbp <= 0.221622 )
									ret := -0.200000
								if( bbp > 0.221622 )
									ret := 0.560000
							if( bullPower > 0.298979 )
								ret := -0.529412
					if( bearPower > 0.045702 )
						if( bearPower <= 0.06799 )
							if( bearPower <= 0.064548 )
								if( bbp <= 0.166872 )
									ret := 0.129213
								if( bbp > 0.166872 )
									ret := -0.441989
							if( bearPower > 0.064548 )
								if( bbm <= 0.044887 )
									ret := -0.571429
								if( bbm > 0.044887 )
									ret := 0.425000
						if( bearPower > 0.06799 )
							if( bbm <= 0.022714 )
								if( bbp <= 0.220208 )
									ret := -0.818182 // sell
								if( bbp > 0.220208 )
									ret := -0.508197
							if( bbm > 0.022714 )
								if( bbp <= 0.536815 )
									ret := -0.355049
								if( bbp > 0.536815 )
									ret := -0.921053 // sell
			if( bbp > 2.62504 )
				if( bbp <= 2.94889 )
					ret := 0.800000 // buy
				if( bbp > 2.94889 )
					ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_SNAP_1Min_b2f09256(bbm, bearPower, bbp, bullPower, BBPower_Color)

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


