//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: MSFT_1Min_2BB0_72da84c6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_1Min_2BB0_72da84c6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_1Min_72da84c6(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.5318 )
		if( Upper_Band <= 425.671 )
			if( Upper_Band <= 393.9 )
				if( bullPower <= -1.11556 )
					if( bbp <= -2.63486 )
						if( basis <= 390.394 )
							ret := 0.500000
						if( basis > 390.394 )
							ret := 1.000000 // buy
					if( bbp > -2.63486 )
						ret := -1.000000 // sell
				if( bullPower > -1.11556 )
					if( bullPower <= -0.293287 )
						if( Upper_Band <= 392.827 )
							if( bbm <= 0.245 )
								if( Upper_Band <= 391.55 )
									ret := -0.250000
								if( Upper_Band > 391.55 )
									ret := -0.857143 // sell
							if( bbm > 0.245 )
								if( Lower_Band <= 386.181 )
									ret := 0.080000
								if( Lower_Band > 386.181 )
									ret := 0.913043 // buy
						if( Upper_Band > 392.827 )
							if( Lower_Band <= 388.874 )
								if( bullPower <= -0.541277 )
									ret := 1.000000 // buy
								if( bullPower > -0.541277 )
									ret := 0.500000
							if( Lower_Band > 388.874 )
								ret := 1.000000 // buy
					if( bullPower > -0.293287 )
						if( bbp <= -0.648027 )
							if( bbp <= -2.29173 )
								ret := 0.250000
							if( bbp > -2.29173 )
								if( bbm <= 1.914 )
									ret := 0.985294 // buy
								if( bbm > 1.914 )
									ret := 0.777778 // buy
						if( bbp > -0.648027 )
							if( Lower_Band <= 389.639 )
								if( basis <= 389.955 )
									ret := 0.750000 // buy
								if( basis > 389.955 )
									ret := -0.222222
							if( Lower_Band > 389.639 )
								if( bbp <= -0.607854 )
									ret := 0.750000 // buy
								if( bbp > -0.607854 )
									ret := 0.800000 // buy
			if( Upper_Band > 393.9 )
				if( basis <= 393.967 )
					if( bbp <= -2.55841 )
						if( Lower_Band <= 389.261 )
							if( Lower_Band <= 388.751 )
								ret := 1.000000 // buy
							if( Lower_Band > 388.751 )
								ret := 0.750000 // buy
						if( Lower_Band > 389.261 )
							if( bearPower <= -1.81235 )
								if( bullPower <= -1.01332 )
									ret := 0.428571
								if( bullPower > -1.01332 )
									ret := 1.000000 // buy
							if( bearPower > -1.81235 )
								ret := -0.500000
					if( bbp > -2.55841 )
						if( bbp <= -0.561535 )
							if( Lower_Band <= 390.939 )
								if( Lower_Band <= 390.1 )
									ret := -0.493151
								if( Lower_Band > 390.1 )
									ret := 0.687500
							if( Lower_Band > 390.939 )
								if( Lower_Band <= 393.365 )
									ret := -0.858407 // sell
								if( Lower_Band > 393.365 )
									ret := 0.600000
						if( bbp > -0.561535 )
							if( bbm <= 0.491704 )
								ret := 0.500000
							if( bbm > 0.491704 )
								ret := 1.000000 // buy
				if( basis > 393.967 )
					if( Lower_Band <= 393.496 )
						if( bearPower <= -0.473649 )
							if( bullPower <= 0.13183 )
								if( bearPower <= -0.507113 )
									ret := 0.801980 // buy
								if( bearPower > -0.507113 )
									ret := 0.363636
							if( bullPower > 0.13183 )
								if( bearPower <= -3.40185 )
									ret := 1.000000 // buy
								if( bearPower > -3.40185 )
									ret := -1.000000 // sell
						if( bearPower > -0.473649 )
							if( Upper_Band <= 395.188 )
								ret := -1.000000 // sell
							if( Upper_Band > 395.188 )
								ret := 1.000000 // buy
					if( Lower_Band > 393.496 )
						if( Upper_Band <= 423.507 )
							if( bbm <= 0.109321 )
								if( Upper_Band <= 408.759 )
									ret := 0.327103
								if( Upper_Band > 408.759 )
									ret := 0.116541
							if( bbm > 0.109321 )
								if( bullPower <= -0.183738 )
									ret := 0.027964
								if( bullPower > -0.183738 )
									ret := 0.155526
						if( Upper_Band > 423.507 )
							if( bbm <= 0.158508 )
								if( basis <= 425.133 )
									ret := 0.383178
								if( basis > 425.133 )
									ret := -1.000000 // sell
							if( bbm > 0.158508 )
								if( bearPower <= -1.51847 )
									ret := 0.657895
								if( bearPower > -1.51847 )
									ret := -0.306265
		if( Upper_Band > 425.671 )
			if( Lower_Band <= 452.604 )
				if( Upper_Band <= 426.072 )
					if( basis <= 425.195 )
						if( basis <= 423.364 )
							ret := -0.500000
						if( basis > 423.364 )
							if( Lower_Band <= 423.586 )
								if( bearPower <= -0.542913 )
									ret := 0.984375 // buy
								if( bearPower > -0.542913 )
									ret := 0.769231 // buy
							if( Lower_Band > 423.586 )
								if( bbp <= -0.721252 )
									ret := -0.071429
								if( bbp > -0.721252 )
									ret := 0.800000 // buy
					if( basis > 425.195 )
						if( Lower_Band <= 424.86 )
							ret := 0.000000
						if( Lower_Band > 424.86 )
							ret := -0.500000
				if( Upper_Band > 426.072 )
					if( basis <= 452.67 )
						if( bbm <= 0.378524 )
							if( bullPower <= -0.435878 )
								if( bullPower <= -1.91615 )
									ret := -0.772727 // sell
								if( bullPower > -1.91615 )
									ret := 0.425373
							if( bullPower > -0.435878 )
								if( Upper_Band <= 426.179 )
									ret := -0.482759
								if( Upper_Band > 426.179 )
									ret := 0.202029
						if( bbm > 0.378524 )
							if( basis <= 418.2 )
								if( bullPower <= -2.06691 )
									ret := 1.000000 // buy
								if( bullPower > -2.06691 )
									ret := 0.500000
							if( basis > 418.2 )
								if( Lower_Band <= 423.653 )
									ret := -0.463636
								if( Lower_Band > 423.653 )
									ret := 0.133599
					if( basis > 452.67 )
						if( bearPower <= -0.357927 )
							if( Upper_Band <= 453.958 )
								if( bbm <= 0.420838 )
									ret := 0.258065
								if( bbm > 0.420838 )
									ret := 0.750000 // buy
							if( Upper_Band > 453.958 )
								if( basis <= 453.597 )
									ret := 0.795918 // buy
								if( basis > 453.597 )
									ret := 0.400000
						if( bearPower > -0.357927 )
							if( basis <= 453.13 )
								ret := 0.000000
							if( basis > 453.13 )
								ret := -0.750000 // sell
			if( Lower_Band > 452.604 )
				if( basis <= 464.321 )
					if( bbm <= 0.250226 )
						if( Lower_Band <= 453.897 )
							if( bbp <= -0.869931 )
								if( basis <= 453.881 )
									ret := 0.142857
								if( basis > 453.881 )
									ret := -0.813953 // sell
							if( bbp > -0.869931 )
								if( bullPower <= -0.189025 )
									ret := 0.166667
								if( bullPower > -0.189025 )
									ret := -0.428571
						if( Lower_Band > 453.897 )
							if( Lower_Band <= 454.934 )
								if( Upper_Band <= 455.695 )
									ret := 0.277778
								if( Upper_Band > 455.695 )
									ret := 0.818182 // buy
							if( Lower_Band > 454.934 )
								if( Upper_Band <= 457.045 )
									ret := -0.636364
								if( Upper_Band > 457.045 )
									ret := 0.288462
					if( bbm > 0.250226 )
						if( bullPower <= -0.145008 )
							if( basis <= 453.824 )
								if( Upper_Band <= 454.744 )
									ret := 0.000000
								if( Upper_Band > 454.744 )
									ret := 1.000000 // buy
							if( basis > 453.824 )
								if( basis <= 457.132 )
									ret := -0.557789
								if( basis > 457.132 )
									ret := -0.184397
						if( bullPower > -0.145008 )
							if( basis <= 460.841 )
								if( basis <= 454.009 )
									ret := -0.750000 // sell
								if( basis > 454.009 )
									ret := 0.324675
							if( basis > 460.841 )
								if( Lower_Band <= 461.355 )
									ret := -0.823529 // sell
								if( Lower_Band > 461.355 )
									ret := 0.076923
				if( basis > 464.321 )
					if( bullPower <= -0.295241 )
						if( bbp <= -1.39052 )
							if( Lower_Band <= 465.407 )
								ret := 1.000000 // buy
							if( Lower_Band > 465.407 )
								ret := 0.714286 // buy
						if( bbp > -1.39052 )
							if( bearPower <= -0.749971 )
								ret := -0.142857
							if( bearPower > -0.749971 )
								if( bbm <= 0.270835 )
									ret := 0.595238
								if( bbm > 0.270835 )
									ret := 0.894737 // buy
					if( bullPower > -0.295241 )
						if( bbm <= 0.41155 )
							if( bbp <= -0.563674 )
								if( Upper_Band <= 466.371 )
									ret := -0.181818
								if( Upper_Band > 466.371 )
									ret := 0.384615
							if( bbp > -0.563674 )
								if( bbp <= -0.550856 )
									ret := 0.500000
								if( bbp > -0.550856 )
									ret := 0.800000 // buy
						if( bbm > 0.41155 )
							if( Lower_Band <= 465.596 )
								if( bbm <= 0.5696 )
									ret := 1.000000 // buy
								if( bbm > 0.5696 )
									ret := 0.333333
							if( Lower_Band > 465.596 )
								if( bullPower <= 0.027267 )
									ret := -0.937500 // sell
								if( bullPower > 0.027267 )
									ret := -0.428571
	if( bbp > -0.5318 )
		if( bearPower <= 0.375966 )
			if( basis <= 396.821 )
				if( basis <= 396.392 )
					if( basis <= 390.068 )
						if( Lower_Band <= 389.096 )
							if( bbp <= 1.51164 )
								if( bbm <= 0.926066 )
									ret := 0.929577 // buy
								if( bbm > 0.926066 )
									ret := 0.677419
							if( bbp > 1.51164 )
								ret := 0.142857
						if( Lower_Band > 389.096 )
							if( Lower_Band <= 389.352 )
								if( Upper_Band <= 390.392 )
									ret := 0.000000
								if( Upper_Band > 390.392 )
									ret := 0.428571
							if( Lower_Band > 389.352 )
								ret := 0.750000 // buy
					if( basis > 390.068 )
						if( Lower_Band <= 395.559 )
							if( Lower_Band <= 394.442 )
								if( Upper_Band <= 395.717 )
									ret := 0.149533
								if( Upper_Band > 395.717 )
									ret := -0.504348
							if( Lower_Band > 394.442 )
								if( bearPower <= -0.377409 )
									ret := -0.666667
								if( bearPower > -0.377409 )
									ret := 0.433428
						if( Lower_Band > 395.559 )
							if( Upper_Band <= 396.94 )
								if( bbm <= 0.357589 )
									ret := -0.947368 // sell
								if( bbm > 0.357589 )
									ret := -0.500000
							if( Upper_Band > 396.94 )
								ret := -0.571429
				if( basis > 396.392 )
					if( bbp <= 0.730998 )
						if( bbm <= 0.19515 )
							if( Upper_Band <= 396.888 )
								ret := 1.000000 // buy
							if( Upper_Band > 396.888 )
								if( Lower_Band <= 395.911 )
									ret := 0.761905 // buy
								if( Lower_Band > 395.911 )
									ret := -0.216216
						if( bbm > 0.19515 )
							if( Lower_Band <= 394.944 )
								ret := 0.000000
							if( Lower_Band > 394.944 )
								if( bullPower <= -0.014074 )
									ret := 0.642857
								if( bullPower > -0.014074 )
									ret := 0.891473 // buy
					if( bbp > 0.730998 )
						if( basis <= 396.708 )
							if( Lower_Band <= 395.78 )
								ret := 0.000000
							if( Lower_Band > 395.78 )
								if( bullPower <= 0.516477 )
									ret := 0.000000
								if( bullPower > 0.516477 )
									ret := -1.000000 // sell
						if( basis > 396.708 )
							if( bullPower <= 0.55974 )
								ret := 0.750000 // buy
							if( bullPower > 0.55974 )
								ret := 1.000000 // buy
			if( basis > 396.821 )
				if( Lower_Band <= 395.59 )
					if( bbm <= 0.961281 )
						if( bbm <= 0.2487 )
							if( BBPower_Color <= 0.5 )
								ret := 0.500000
							if( BBPower_Color > 0.5 )
								ret := 0.000000
						if( bbm > 0.2487 )
							if( basis <= 397.581 )
								if( Lower_Band <= 395.417 )
									ret := 0.875000 // buy
								if( Lower_Band > 395.417 )
									ret := 1.000000 // buy
							if( basis > 397.581 )
								if( bearPower <= -0.010657 )
									ret := 0.833333 // buy
								if( bearPower > -0.010657 )
									ret := 0.333333
					if( bbm > 0.961281 )
						if( bbm <= 1.34275 )
							if( Lower_Band <= 394.416 )
								ret := -1.000000 // sell
							if( Lower_Band > 394.416 )
								if( bbm <= 1.27211 )
									ret := 0.500000
								if( bbm > 1.27211 )
									ret := -1.000000 // sell
						if( bbm > 1.34275 )
							if( bullPower <= 6.34324 )
								if( bbm <= 2.79958 )
									ret := 1.000000 // buy
								if( bbm > 2.79958 )
									ret := 0.000000
							if( bullPower > 6.34324 )
								ret := 1.000000 // buy
				if( Lower_Band > 395.59 )
					if( bullPower <= -0.127352 )
						if( bbp <= -0.341012 )
							if( basis <= 396.95 )
								ret := -1.000000 // sell
							if( basis > 396.95 )
								if( basis <= 400.87 )
									ret := 0.377778
								if( basis > 400.87 )
									ret := 0.050515
						if( bbp > -0.341012 )
							if( bearPower <= -0.20124 )
								if( Lower_Band <= 422.9 )
									ret := -1.000000 // sell
								if( Lower_Band > 422.9 )
									ret := -0.200000
							if( bearPower > -0.20124 )
								if( basis <= 397.079 )
									ret := -1.000000 // sell
								if( basis > 397.079 )
									ret := 0.234450
					if( bullPower > -0.127352 )
						if( Upper_Band <= 467.659 )
							if( bullPower <= 0.929724 )
								if( Upper_Band <= 422.142 )
									ret := 0.046414
								if( Upper_Band > 422.142 )
									ret := 0.014967
							if( bullPower > 0.929724 )
								if( Lower_Band <= 405.421 )
									ret := -0.495098
								if( Lower_Band > 405.421 )
									ret := 0.035831
						if( Upper_Band > 467.659 )
							if( bbp <= -0.208921 )
								if( Lower_Band <= 466.193 )
									ret := -0.750000 // sell
								if( Lower_Band > 466.193 )
									ret := 0.514286
							if( bbp > -0.208921 )
								if( basis <= 467.444 )
									ret := -0.208333
								if( basis > 467.444 )
									ret := -0.613636
		if( bearPower > 0.375966 )
			if( Upper_Band <= 415.404 )
				if( bearPower <= 0.774099 )
					if( Upper_Band <= 399.091 )
						if( basis <= 390.105 )
							if( Lower_Band <= 385.817 )
								if( Upper_Band <= 388.923 )
									ret := 0.400000
								if( Upper_Band > 388.923 )
									ret := -0.666667
							if( Lower_Band > 385.817 )
								if( bullPower <= 1.38923 )
									ret := 0.888889 // buy
								if( bullPower > 1.38923 )
									ret := -0.500000
						if( basis > 390.105 )
							if( bbm <= 0.100893 )
								if( bullPower <= 0.431354 )
									ret := 0.000000
								if( bullPower > 0.431354 )
									ret := -0.788462 // sell
							if( bbm > 0.100893 )
								if( bearPower <= 0.428824 )
									ret := 0.000000
								if( bearPower > 0.428824 )
									ret := -0.396396
					if( Upper_Band > 399.091 )
						if( basis <= 398.819 )
							if( bbp <= 2.45474 )
								if( bearPower <= 0.512633 )
									ret := 0.162791
								if( bearPower > 0.512633 )
									ret := 0.772727 // buy
							if( bbp > 2.45474 )
								ret := -1.000000 // sell
						if( basis > 398.819 )
							if( basis <= 402.295 )
								if( bullPower <= 1.0259 )
									ret := -0.232258
								if( bullPower > 1.0259 )
									ret := -0.636364
							if( basis > 402.295 )
								if( basis <= 407.262 )
									ret := 0.176904
								if( basis > 407.262 )
									ret := -0.076923
				if( bearPower > 0.774099 )
					if( bullPower <= 1.13402 )
						if( basis <= 413.329 )
							if( Lower_Band <= 386.868 )
								ret := -1.000000 // sell
							if( Lower_Band > 386.868 )
								if( Upper_Band <= 392.756 )
									ret := -0.800000 // sell
								if( Upper_Band > 392.756 )
									ret := 0.492424
						if( basis > 413.329 )
							ret := 1.000000 // buy
					if( bullPower > 1.13402 )
						if( bbm <= 0.054539 )
							if( bbm <= 0.020842 )
								if( bearPower <= 1.2079 )
									ret := 0.500000
								if( bearPower > 1.2079 )
									ret := -0.333333
							if( bbm > 0.020842 )
								ret := -1.000000 // sell
						if( bbm > 0.054539 )
							if( bullPower <= 2.56793 )
								if( Upper_Band <= 414.18 )
									ret := 0.003247
								if( Upper_Band > 414.18 )
									ret := 0.763158 // buy
							if( bullPower > 2.56793 )
								if( basis <= 400.799 )
									ret := 0.272727
								if( basis > 400.799 )
									ret := 0.714286 // buy
			if( Upper_Band > 415.404 )
				if( bbp <= 5.47484 )
					if( Lower_Band <= 413.007 )
						if( Upper_Band <= 415.742 )
							if( bullPower <= 1.08626 )
								if( basis <= 413.731 )
									ret := -0.100000
								if( basis > 413.731 )
									ret := -0.960000 // sell
							if( bullPower > 1.08626 )
								if( bbm <= 0.748515 )
									ret := 0.000000
								if( bbm > 0.748515 )
									ret := 1.000000 // buy
						if( Upper_Band > 415.742 )
							if( bullPower <= 2.51624 )
								if( Upper_Band <= 419.173 )
									ret := 0.376623
								if( Upper_Band > 419.173 )
									ret := 0.840909 // buy
							if( bullPower > 2.51624 )
								if( Upper_Band <= 422.076 )
									ret := -0.500000
								if( Upper_Band > 422.076 )
									ret := -1.000000 // sell
					if( Lower_Band > 413.007 )
						if( Lower_Band <= 414.505 )
							if( bearPower <= 0.571138 )
								if( bbp <= 1.87382 )
									ret := -0.570093
								if( bbp > 1.87382 )
									ret := 0.200000
							if( bearPower > 0.571138 )
								if( bearPower <= 0.623423 )
									ret := -0.923077 // sell
								if( bearPower > 0.623423 )
									ret := -0.691358
						if( Lower_Band > 414.505 )
							if( basis <= 465.795 )
								if( Upper_Band <= 459.221 )
									ret := -0.114787
								if( Upper_Band > 459.221 )
									ret := 0.354331
							if( basis > 465.795 )
								if( bbp <= 1.57737 )
									ret := -0.642857
								if( bbp > 1.57737 )
									ret := -1.000000 // sell
				if( bbp > 5.47484 )
					if( bbm <= 1.035 )
						ret := 0.000000
					if( bbm > 1.035 )
						if( Upper_Band <= 416.709 )
							ret := -0.250000
						if( Upper_Band > 416.709 )
							if( bearPower <= 1.92591 )
								ret := -0.750000 // sell
							if( bearPower > 1.92591 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bollinger_Bands 
//@version=5
//indicator shorttitle="BB", title="Bollinger Bands", overlay=true, timeframe="", timeframe_gaps=true)
length_BB = input.int(20, minval=1)
maType = input.string("SMA", "Basis MA Type", options = ["SMA", "EMA", "SMMA (RMA)", "WMA", "VWMA"])
src = input(close, title="Source")
mult = input.float(2.0, minval=0.001, maxval=50, title="StdDev")

ma(source, length_BB, _type) =>
    switch _type
        "SMA" => ta.sma(source, length_BB)
        "EMA" => ta.ema(source, length_BB)
        "SMMA (RMA)" => ta.rma(source, length_BB)
        "WMA" => ta.wma(source, length_BB)
        "VWMA" => ta.vwma(source, length_BB)

basis = ma(src, length_BB, maType)
dev = mult * ta.stdev(src, length_BB)
Upper_Band = basis + dev
Lower_Band = basis - dev
offset = input.int(0, "Offset", minval = -500, maxval = 500, display = display.data_window)
plot(basis, "Basis", color=#2962FF, offset = offset)
p1 = plot(Upper_Band, "Upper", color=#F23645, offset = offset)
p2 = plot(Lower_Band, "Lower", color=#089981, offset = offset)
fill(p1, p2, title = "Background", color=color.rgb(33, 150, 243, 95))

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
float op_operation = decision_tree_0_MSFT_1Min_72da84c6(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


