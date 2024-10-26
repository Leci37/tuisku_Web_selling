//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: TSLA_30Min_2BT0_f41e8801 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_30Min_2BT0_f41e8801", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_30Min_f41e8801(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema13 <= 7.11573 )
		if( ema3 <= 175.916 )
			if( tema <= 180.79 )
				if( ema3 <= 174.221 )
					if( ema3 <= 109.999 )
						if( bullPower <= -1.49028 )
							if( bbm <= 0.745 )
								ret := -1.000000 // sell
							if( bbm > 0.745 )
								ret := 0.000000
						if( bullPower > -1.49028 )
							if( tema <= 109.749 )
								if( bullPower <= -1.02155 )
									ret := 0.750000 // buy
								if( bullPower > -1.02155 )
									ret := 1.000000 // buy
							if( tema > 109.749 )
								if( bullPower <= 3.66062 )
									ret := 0.685714
								if( bullPower > 3.66062 )
									ret := -0.333333
					if( ema3 > 109.999 )
						if( ema1 <= 173.075 )
							if( ema13 <= 0.905333 )
								if( ema1 <= 167.683 )
									ret := -0.011917
								if( ema1 > 167.683 )
									ret := 0.274286
							if( ema13 > 0.905333 )
								if( ema3 <= 168.759 )
									ret := 0.403636
								if( ema3 > 168.759 )
									ret := -0.211921
						if( ema1 > 173.075 )
							if( ema2 <= 173.062 )
								if( bbp <= 3.33498 )
									ret := 0.377049
								if( bbp > 3.33498 )
									ret := -0.200000
							if( ema2 > 173.062 )
								if( bbm <= 0.673286 )
									ret := -0.027397
								if( bbm > 0.673286 )
									ret := -0.373134
				if( ema3 > 174.221 )
					if( bbm <= 0.583634 )
						if( tema <= 175.426 )
							if( bearPower <= 0.362359 )
								if( ema12 <= 0.0945 )
									ret := -0.045977
								if( ema12 > 0.0945 )
									ret := 0.444444
							if( bearPower > 0.362359 )
								ret := -1.000000 // sell
						if( tema > 175.426 )
							if( ema1 <= 176.492 )
								if( bbm <= 0.52 )
									ret := 0.882353 // buy
								if( bbm > 0.52 )
									ret := 0.400000
							if( ema1 > 176.492 )
								ret := 0.000000
					if( bbm > 0.583634 )
						if( bullPower <= -1.08481 )
							if( bearPower <= -3.39091 )
								if( bullPower <= -2.32479 )
									ret := 0.333333
								if( bullPower > -2.32479 )
									ret := -1.000000 // sell
							if( bearPower > -3.39091 )
								if( ema2 <= 173.231 )
									ret := -0.142857
								if( ema2 > 173.231 )
									ret := 0.555556
						if( bullPower > -1.08481 )
							if( ema1 <= 176.894 )
								if( bbm <= 1.00022 )
									ret := 0.472527
								if( bbm > 1.00022 )
									ret := 0.696809
							if( ema1 > 176.894 )
								if( ema13 <= 2.47933 )
									ret := -0.291667
								if( ema13 > 2.47933 )
									ret := 0.588235
			if( tema > 180.79 )
				if( ema13 <= 3.72844 )
					ret := 1.000000 // buy
				if( ema13 > 3.72844 )
					if( ema12 <= 2.79681 )
						ret := 0.250000
					if( ema12 > 2.79681 )
						if( ema1 <= 177.864 )
							ret := 1.000000 // buy
						if( ema1 > 177.864 )
							ret := 0.750000 // buy
		if( ema3 > 175.916 )
			if( ema3 <= 179.441 )
				if( ema13 <= 3.66963 )
					if( bullPower <= 1.28669 )
						if( ema3 <= 176.395 )
							if( ema12 <= -1.59076 )
								if( bbp <= -5.97647 )
									ret := 0.000000
								if( bbp > -5.97647 )
									ret := 1.000000 // buy
							if( ema12 > -1.59076 )
								if( tema <= 172.417 )
									ret := -0.875000 // sell
								if( tema > 172.417 )
									ret := 0.135802
						if( ema3 > 176.395 )
							if( ema1 <= 177.133 )
								if( ema2 <= 176.562 )
									ret := -0.102273
								if( ema2 > 176.562 )
									ret := -0.530201
							if( ema1 > 177.133 )
								if( tema <= 177.73 )
									ret := 0.234848
								if( tema > 177.73 )
									ret := -0.222707
					if( bullPower > 1.28669 )
						if( ema13 <= 0.127204 )
							if( ema2 <= 178.442 )
								if( ema2 <= 176.999 )
									ret := 0.000000
								if( ema2 > 176.999 )
									ret := -0.700000 // sell
							if( ema2 > 178.442 )
								ret := 1.000000 // buy
						if( ema13 > 0.127204 )
							if( ema1 <= 180.982 )
								if( ema1 <= 179.751 )
									ret := -0.563025
								if( ema1 > 179.751 )
									ret := -0.903846 // sell
							if( ema1 > 180.982 )
								if( bearPower <= 1.98547 )
									ret := 0.555556
								if( bearPower > 1.98547 )
									ret := -0.400000
				if( ema13 > 3.66963 )
					if( bbp <= 6.73562 )
						if( tema <= 183.911 )
							ret := 0.400000
						if( tema > 183.911 )
							if( bullPower <= 3.5728 )
								ret := 1.000000 // buy
							if( bullPower > 3.5728 )
								ret := 0.500000
					if( bbp > 6.73562 )
						if( tema <= 186.912 )
							if( tema <= 185.899 )
								ret := 0.200000
							if( tema > 185.899 )
								if( bullPower <= 4.71079 )
									ret := -1.000000 // sell
								if( bullPower > 4.71079 )
									ret := -0.500000
						if( tema > 186.912 )
							ret := 1.000000 // buy
			if( ema3 > 179.441 )
				if( tema <= 179.426 )
					if( ema12 <= -2.15372 )
						if( ema2 <= 180.436 )
							if( ema2 <= 179.048 )
								ret := -0.500000
							if( ema2 > 179.048 )
								ret := -1.000000 // sell
						if( ema2 > 180.436 )
							if( tema <= 177.719 )
								if( ema13 <= -5.53861 )
									ret := 0.000000
								if( ema13 > -5.53861 )
									ret := 0.500000
							if( tema > 177.719 )
								ret := -1.000000 // sell
					if( ema12 > -2.15372 )
						if( ema13 <= -0.60109 )
							if( ema13 <= -2.22876 )
								if( ema13 <= -2.37161 )
									ret := 0.629213
								if( ema13 > -2.37161 )
									ret := 0.948718 // buy
							if( ema13 > -2.22876 )
								if( bbp <= -1.30915 )
									ret := 0.278481
								if( bbp > -1.30915 )
									ret := 0.800000 // buy
						if( ema13 > -0.60109 )
							if( tema <= 179.076 )
								ret := -0.750000 // sell
							if( tema > 179.076 )
								ret := -0.166667
				if( tema > 179.426 )
					if( bullPower <= 3.7074 )
						if( tema <= 387.4 )
							if( bullPower <= -3.67943 )
								if( tema <= 287.343 )
									ret := -0.316011
								if( tema > 287.343 )
									ret := 0.016641
							if( bullPower > -3.67943 )
								if( tema <= 341.465 )
									ret := 0.041521
								if( tema > 341.465 )
									ret := -0.027815
						if( tema > 387.4 )
							if( ema12 <= -8.33045 )
								if( ema13 <= -63.9844 )
									ret := 0.647059
								if( ema13 > -63.9844 )
									ret := -0.092084
							if( ema12 > -8.33045 )
								if( tema <= 411.534 )
									ret := 0.329609
								if( tema > 411.534 )
									ret := 0.096023
					if( bullPower > 3.7074 )
						if( tema <= 878.544 )
							if( bearPower <= -13.1603 )
								if( ema3 <= 442.793 )
									ret := -0.210526
								if( ema3 > 442.793 )
									ret := 0.500000
							if( bearPower > -13.1603 )
								if( ema3 <= 851.849 )
									ret := -0.003522
								if( ema3 > 851.849 )
									ret := 0.359116
						if( tema > 878.544 )
							if( tema <= 885.18 )
								if( ema12 <= -1.08186 )
									ret := 0.500000
								if( ema12 > -1.08186 )
									ret := -0.782051 // sell
							if( tema > 885.18 )
								if( bearPower <= -0.220288 )
									ret := -0.026205
								if( bearPower > -0.220288 )
									ret := -0.227213
	if( ema13 > 7.11573 )
		if( ema3 <= 673.283 )
			if( bullPower <= 12.074 )
				if( tema <= 588.651 )
					if( ema1 <= 497.82 )
						if( bbm <= 4.1472 )
							if( ema13 <= 8.47089 )
								if( ema2 <= 444.954 )
									ret := 0.376068
								if( ema2 > 444.954 )
									ret := -0.750000 // sell
							if( ema13 > 8.47089 )
								if( ema3 <= 305.655 )
									ret := 0.191176
								if( ema3 > 305.655 )
									ret := -0.240385
						if( bbm > 4.1472 )
							if( ema3 <= 330.427 )
								if( bbp <= 12.8836 )
									ret := 0.352941
								if( bbp > 12.8836 )
									ret := 0.937500 // buy
							if( ema3 > 330.427 )
								if( ema1 <= 361.247 )
									ret := -0.400000
								if( ema1 > 361.247 )
									ret := 0.481818
					if( ema1 > 497.82 )
						if( bearPower <= -0.046622 )
							if( BBPower_Color <= 0.5 )
								if( ema1 <= 557.131 )
									ret := 1.000000 // buy
								if( ema1 > 557.131 )
									ret := 0.500000
							if( BBPower_Color > 0.5 )
								if( ema1 <= 559.21 )
									ret := -0.240000
								if( ema1 > 559.21 )
									ret := 0.857143 // buy
						if( bearPower > -0.046622 )
							if( bullPower <= 8.4059 )
								if( ema2 <= 547.027 )
									ret := 0.959459 // buy
								if( ema2 > 547.027 )
									ret := 0.790698 // buy
							if( bullPower > 8.4059 )
								if( ema13 <= 10.8924 )
									ret := 0.255814
								if( ema13 > 10.8924 )
									ret := 0.815385 // buy
				if( tema > 588.651 )
					if( bbp <= 13.0801 )
						if( ema3 <= 625.511 )
							if( bbm <= 6.09298 )
								if( ema2 <= 590.013 )
									ret := 0.636364
								if( ema2 > 590.013 )
									ret := -0.378378
							if( bbm > 6.09298 )
								if( ema3 <= 609.643 )
									ret := -0.880000 // sell
								if( ema3 > 609.643 )
									ret := 0.000000
						if( ema3 > 625.511 )
							if( ema13 <= 13.8851 )
								if( ema2 <= 665.125 )
									ret := 0.506024
								if( ema2 > 665.125 )
									ret := 0.000000
							if( ema13 > 13.8851 )
								if( tema <= 676.032 )
									ret := -1.000000 // sell
								if( tema > 676.032 )
									ret := 0.000000
					if( bbp > 13.0801 )
						if( tema <= 682.56 )
							if( tema <= 664.789 )
								if( ema13 <= 12.0861 )
									ret := 0.608696
								if( ema13 > 12.0861 )
									ret := 0.156250
							if( tema > 664.789 )
								if( ema13 <= 8.88536 )
									ret := 1.000000 // buy
								if( ema13 > 8.88536 )
									ret := -0.416667
						if( tema > 682.56 )
							if( bearPower <= 6.10547 )
								ret := 1.000000 // buy
							if( bearPower > 6.10547 )
								ret := 0.571429
			if( bullPower > 12.074 )
				if( ema3 <= 572.135 )
					if( tema <= 534.973 )
						if( ema1 <= 457.492 )
							if( ema3 <= 393.879 )
								if( tema <= 404.301 )
									ret := -0.056075
								if( tema > 404.301 )
									ret := 0.810811 // buy
							if( ema3 > 393.879 )
								if( ema13 <= 8.9139 )
									ret := 0.166667
								if( ema13 > 8.9139 )
									ret := -0.600000
						if( ema1 > 457.492 )
							if( ema1 <= 518.837 )
								if( ema12 <= 11.3299 )
									ret := 0.678571
								if( ema12 > 11.3299 )
									ret := -0.200000
							if( ema1 > 518.837 )
								if( tema <= 531.141 )
									ret := -1.000000 // sell
								if( tema > 531.141 )
									ret := 0.000000
					if( tema > 534.973 )
						if( bbm <= 6.58747 )
							if( ema3 <= 566.195 )
								if( tema <= 577.43 )
									ret := 0.125000
								if( tema > 577.43 )
									ret := 0.857143 // buy
							if( ema3 > 566.195 )
								ret := -1.000000 // sell
						if( bbm > 6.58747 )
							if( bullPower <= 13.4413 )
								if( ema1 <= 542.429 )
									ret := -0.750000 // sell
								if( ema1 > 542.429 )
									ret := 0.750000 // buy
							if( bullPower > 13.4413 )
								if( ema2 <= 544.759 )
									ret := -0.976190 // sell
								if( ema2 > 544.759 )
									ret := -0.676471
				if( ema3 > 572.135 )
					if( bullPower <= 25.6094 )
						if( ema12 <= 13.0755 )
							if( bullPower <= 18.7796 )
								if( tema <= 639.04 )
									ret := 0.589744
								if( tema > 639.04 )
									ret := -0.098214
							if( bullPower > 18.7796 )
								if( ema2 <= 649.171 )
									ret := 0.166667
								if( ema2 > 649.171 )
									ret := 0.890625 // buy
						if( ema12 > 13.0755 )
							if( ema13 <= 29.6881 )
								if( ema12 <= 14.3044 )
									ret := -0.250000
								if( ema12 > 14.3044 )
									ret := -0.923077 // sell
							if( ema13 > 29.6881 )
								if( bbm <= 5.70167 )
									ret := -0.500000
								if( bbm > 5.70167 )
									ret := 0.916667 // buy
					if( bullPower > 25.6094 )
						if( ema3 <= 621.249 )
							if( bbp <= 62.9806 )
								ret := 1.000000 // buy
							if( bbp > 62.9806 )
								ret := 0.000000
						if( ema3 > 621.249 )
							if( ema1 <= 670.13 )
								ret := -0.428571
							if( ema1 > 670.13 )
								if( bbm <= 22.5308 )
									ret := 0.428571
								if( bbm > 22.5308 )
									ret := 1.000000 // buy
		if( ema3 > 673.283 )
			if( ema13 <= 17.0226 )
				if( bearPower <= 9.94327 )
					if( tema <= 1668.17 )
						if( tema <= 1494.28 )
							if( bbp <= 21.5086 )
								if( ema2 <= 703.406 )
									ret := -0.411290
								if( ema2 > 703.406 )
									ret := 0.058789
							if( bbp > 21.5086 )
								if( ema3 <= 701.241 )
									ret := 0.773585 // buy
								if( ema3 > 701.241 )
									ret := 0.153285
						if( tema > 1494.28 )
							if( ema1 <= 1557.13 )
								if( bullPower <= 10.7171 )
									ret := -0.375000
								if( bullPower > 10.7171 )
									ret := -0.901408 // sell
							if( ema1 > 1557.13 )
								if( bbm <= 26.4852 )
									ret := 0.777778 // buy
								if( bbm > 26.4852 )
									ret := -0.857143 // sell
					if( tema > 1668.17 )
						if( bullPower <= 7.66389 )
							if( bullPower <= 3.0265 )
								ret := 0.400000
							if( bullPower > 3.0265 )
								ret := -0.800000 // sell
						if( bullPower > 7.66389 )
							if( bbm <= 21.7442 )
								if( ema13 <= 12.5372 )
									ret := 0.428571
								if( ema13 > 12.5372 )
									ret := 0.948718 // buy
							if( bbm > 21.7442 )
								ret := 0.333333
				if( bearPower > 9.94327 )
					if( ema2 <= 909.85 )
						if( bbm <= 5.48691 )
							if( ema3 <= 731.186 )
								if( bullPower <= 15.4545 )
									ret := -0.166667
								if( bullPower > 15.4545 )
									ret := 0.666667
							if( ema3 > 731.186 )
								if( ema2 <= 738.496 )
									ret := -1.000000 // sell
								if( ema2 > 738.496 )
									ret := 0.030303
						if( bbm > 5.48691 )
							if( ema1 <= 891.467 )
								if( tema <= 742.829 )
									ret := -0.750000 // sell
								if( tema > 742.829 )
									ret := -0.312500
							if( ema1 > 891.467 )
								if( ema13 <= 13.6964 )
									ret := -0.500000
								if( ema13 > 13.6964 )
									ret := -0.947368 // sell
					if( ema2 > 909.85 )
						if( ema1 <= 1105.13 )
							if( bbm <= 20.8882 )
								if( ema13 <= 15.9794 )
									ret := 0.433962
								if( ema13 > 15.9794 )
									ret := -0.100000
							if( bbm > 20.8882 )
								ret := -0.714286 // sell
						if( ema1 > 1105.13 )
							if( ema12 <= 7.54261 )
								ret := 0.166667
							if( ema12 > 7.54261 )
								if( ema2 <= 1596.4 )
									ret := -0.818182 // sell
								if( ema2 > 1596.4 )
									ret := 0.000000
			if( ema13 > 17.0226 )
				if( ema1 <= 727.068 )
					if( bbm <= 10.321 )
						if( bullPower <= 21.9702 )
							if( ema13 <= 22.4929 )
								if( ema13 <= 21.1155 )
									ret := -0.818182 // sell
								if( ema13 > 21.1155 )
									ret := 0.000000
							if( ema13 > 22.4929 )
								if( ema3 <= 681.195 )
									ret := -0.571429
								if( ema3 > 681.195 )
									ret := -1.000000 // sell
						if( bullPower > 21.9702 )
							ret := -0.333333
					if( bbm > 10.321 )
						if( bearPower <= 13.8262 )
							if( ema12 <= 10.636 )
								ret := 1.000000 // buy
							if( ema12 > 10.636 )
								ret := 0.333333
						if( bearPower > 13.8262 )
							ret := -0.750000 // sell
				if( ema1 > 727.068 )
					if( tema <= 771.962 )
						if( ema12 <= 10.8073 )
							if( bbp <= 22.845 )
								if( tema <= 763.623 )
									ret := 0.636364
								if( tema > 763.623 )
									ret := 1.000000 // buy
							if( bbp > 22.845 )
								ret := 1.000000 // buy
						if( ema12 > 10.8073 )
							if( ema13 <= 19.7599 )
								if( ema3 <= 726.906 )
									ret := 0.000000
								if( ema3 > 726.906 )
									ret := -0.500000
							if( ema13 > 19.7599 )
								if( tema <= 760.557 )
									ret := 0.857143 // buy
								if( tema > 760.557 )
									ret := 0.384615
					if( tema > 771.962 )
						if( ema12 <= 33.2314 )
							if( ema2 <= 743.76 )
								if( tema <= 773.834 )
									ret := -0.750000 // sell
								if( tema > 773.834 )
									ret := -1.000000 // sell
							if( ema2 > 743.76 )
								if( tema <= 2076.37 )
									ret := 0.213127
								if( tema > 2076.37 )
									ret := -0.194690
						if( ema12 > 33.2314 )
							if( ema12 <= 41.672 )
								if( bearPower <= 24.3407 )
									ret := -0.500000
								if( bearPower > 24.3407 )
									ret := 0.934211 // buy
							if( ema12 > 41.672 )
								if( tema <= 1734.37 )
									ret := 0.000000
								if( tema > 1734.37 )
									ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_TSLA_30Min_f41e8801(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)

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


