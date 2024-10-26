//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: CRWD_1Min_2BB0_91d8ace3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_1Min_2BB0_91d8ace3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_1Min_91d8ace3(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= -0.049647 )
		if( Lower_Band <= 228.519 )
			if( Upper_Band <= 203.767 )
				if( basis <= 198.554 )
					if( bbp <= -2.79487 )
						ret := 0.750000 // buy
					if( bbp > -2.79487 )
						ret := 1.000000 // buy
				if( basis > 198.554 )
					if( Upper_Band <= 203.119 )
						if( bullPower <= -0.707779 )
							ret := -0.400000
						if( bullPower > -0.707779 )
							ret := -1.000000 // sell
					if( Upper_Band > 203.119 )
						if( bullPower <= -0.267473 )
							ret := 0.000000
						if( bullPower > -0.267473 )
							ret := -0.800000 // sell
			if( Upper_Band > 203.767 )
				if( bullPower <= -0.252848 )
					if( Lower_Band <= 201.75 )
						if( basis <= 202.556 )
							ret := 0.750000 // buy
						if( basis > 202.556 )
							ret := 1.000000 // buy
					if( Lower_Band > 201.75 )
						if( bbm <= 2.10843 )
							if( Upper_Band <= 218.116 )
								if( basis <= 216.279 )
									ret := 0.311321
								if( basis > 216.279 )
									ret := -0.548387
							if( Upper_Band > 218.116 )
								if( basis <= 230.098 )
									ret := 0.473577
								if( basis > 230.098 )
									ret := 0.903846 // buy
						if( bbm > 2.10843 )
							ret := -1.000000 // sell
				if( bullPower > -0.252848 )
					if( Upper_Band <= 206.037 )
						if( bbm <= 0.179641 )
							if( bearPower <= -0.168429 )
								ret := -1.000000 // sell
							if( bearPower > -0.168429 )
								ret := -0.750000 // sell
						if( bbm > 0.179641 )
							ret := -0.250000
					if( Upper_Band > 206.037 )
						if( basis <= 220.511 )
							if( basis <= 213.085 )
								if( bbm <= 0.221569 )
									ret := 0.500000
								if( bbm > 0.221569 )
									ret := 1.000000 // buy
							if( basis > 213.085 )
								if( basis <= 214.601 )
									ret := -1.000000 // sell
								if( basis > 214.601 )
									ret := 0.414634
						if( basis > 220.511 )
							if( basis <= 221.042 )
								if( Upper_Band <= 222.151 )
									ret := -0.937500 // sell
								if( Upper_Band > 222.151 )
									ret := 0.000000
							if( basis > 221.042 )
								if( basis <= 221.317 )
									ret := 0.800000 // buy
								if( basis > 221.317 )
									ret := 0.035019
		if( Lower_Band > 228.519 )
			if( bbm <= 0.078982 )
				if( basis <= 259.015 )
					if( Lower_Band <= 248.003 )
						if( Upper_Band <= 249.046 )
							if( bbp <= -1.18986 )
								if( Lower_Band <= 233.406 )
									ret := 0.038462
								if( Lower_Band > 233.406 )
									ret := 0.680000
							if( bbp > -1.18986 )
								if( bearPower <= -0.591496 )
									ret := -1.000000 // sell
								if( bearPower > -0.591496 )
									ret := 0.174863
						if( Upper_Band > 249.046 )
							if( bullPower <= -0.209634 )
								if( Lower_Band <= 246.832 )
									ret := -0.750000 // sell
								if( Lower_Band > 246.832 )
									ret := 0.000000
							if( bullPower > -0.209634 )
								ret := -1.000000 // sell
					if( Lower_Band > 248.003 )
						if( bullPower <= -0.670255 )
							if( Upper_Band <= 256.261 )
								if( basis <= 254.724 )
									ret := 0.250000
								if( basis > 254.724 )
									ret := -1.000000 // sell
							if( Upper_Band > 256.261 )
								if( bullPower <= -2.0895 )
									ret := -0.142857
								if( bullPower > -2.0895 )
									ret := 0.526316
						if( bullPower > -0.670255 )
							if( Lower_Band <= 251.031 )
								if( Upper_Band <= 249.433 )
									ret := 0.250000
								if( Upper_Band > 249.433 )
									ret := 0.937500 // buy
							if( Lower_Band > 251.031 )
								if( bearPower <= -0.419129 )
									ret := 0.816327 // buy
								if( bearPower > -0.419129 )
									ret := 0.479167
				if( basis > 259.015 )
					if( basis <= 304.579 )
						if( basis <= 295.873 )
							if( Lower_Band <= 294.609 )
								if( basis <= 294.871 )
									ret := 0.126621
								if( basis > 294.871 )
									ret := -0.578947
							if( Lower_Band > 294.609 )
								if( bbp <= -0.346424 )
									ret := 0.914286 // buy
								if( bbp > -0.346424 )
									ret := -0.166667
						if( basis > 295.873 )
							if( basis <= 296.31 )
								if( bullPower <= -0.413773 )
									ret := -1.000000 // sell
								if( bullPower > -0.413773 )
									ret := -0.333333
							if( basis > 296.31 )
								if( Lower_Band <= 294.454 )
									ret := -0.900000 // sell
								if( Lower_Band > 294.454 )
									ret := -0.030837
					if( basis > 304.579 )
						if( bbp <= -0.755396 )
							if( Lower_Band <= 338.761 )
								if( Lower_Band <= 316.993 )
									ret := 0.517544
								if( Lower_Band > 316.993 )
									ret := 0.892857 // buy
							if( Lower_Band > 338.761 )
								if( basis <= 340.477 )
									ret := -0.625000
								if( basis > 340.477 )
									ret := 0.357298
						if( bbp > -0.755396 )
							if( Lower_Band <= 390.492 )
								if( Lower_Band <= 374.154 )
									ret := 0.117949
								if( Lower_Band > 374.154 )
									ret := 0.327922
							if( Lower_Band > 390.492 )
								if( bullPower <= -0.256931 )
									ret := -1.000000 // sell
								if( bullPower > -0.256931 )
									ret := -0.750000 // sell
			if( bbm > 0.078982 )
				if( basis <= 234.443 )
					if( Lower_Band <= 232.352 )
						if( Lower_Band <= 229.613 )
							if( bbp <= -2.90916 )
								ret := 1.000000 // buy
							if( bbp > -2.90916 )
								if( Upper_Band <= 231.495 )
									ret := -0.062500
								if( Upper_Band > 231.495 )
									ret := -0.880000 // sell
						if( Lower_Band > 229.613 )
							if( Lower_Band <= 231.954 )
								if( Upper_Band <= 236.27 )
									ret := -0.011278
								if( Upper_Band > 236.27 )
									ret := -1.000000 // sell
							if( Lower_Band > 231.954 )
								if( Upper_Band <= 234.672 )
									ret := -0.166667
								if( Upper_Band > 234.672 )
									ret := 0.793103 // buy
					if( Lower_Band > 232.352 )
						if( bearPower <= -0.337068 )
							if( Upper_Band <= 235.161 )
								if( Upper_Band <= 234.646 )
									ret := -0.717391 // sell
								if( Upper_Band > 234.646 )
									ret := 0.000000
							if( Upper_Band > 235.161 )
								if( bearPower <= -1.25972 )
									ret := -0.400000
								if( bearPower > -1.25972 )
									ret := -0.978261 // sell
						if( bearPower > -0.337068 )
							ret := 1.000000 // buy
				if( basis > 234.443 )
					if( basis <= 300.45 )
						if( bullPower <= -1.62094 )
							if( Lower_Band <= 263.418 )
								if( Upper_Band <= 264.832 )
									ret := -0.285714
								if( Upper_Band > 264.832 )
									ret := 0.869565 // buy
							if( Lower_Band > 263.418 )
								if( Upper_Band <= 281.398 )
									ret := -0.956522 // sell
								if( Upper_Band > 281.398 )
									ret := -0.325581
						if( bullPower > -1.62094 )
							if( Lower_Band <= 297.666 )
								if( basis <= 235.14 )
									ret := 0.559322
								if( basis > 235.14 )
									ret := 0.051536
							if( Lower_Band > 297.666 )
								if( Upper_Band <= 300.677 )
									ret := -0.132353
								if( Upper_Band > 300.677 )
									ret := -0.461538
					if( basis > 300.45 )
						if( bullPower <= -1.10272 )
							if( basis <= 307.38 )
								if( basis <= 300.679 )
									ret := -0.250000
								if( basis > 300.679 )
									ret := 0.833333 // buy
							if( basis > 307.38 )
								if( Upper_Band <= 315.395 )
									ret := -0.409091
								if( Upper_Band > 315.395 )
									ret := 0.287854
						if( bullPower > -1.10272 )
							if( Lower_Band <= 310.108 )
								if( basis <= 308.075 )
									ret := 0.105882
								if( basis > 308.075 )
									ret := 0.485095
							if( Lower_Band > 310.108 )
								if( Lower_Band <= 311.428 )
									ret := -0.324324
								if( Lower_Band > 311.428 )
									ret := 0.070307
	if( bullPower > -0.049647 )
		if( Lower_Band <= 381.42 )
			if( bbm <= 0.220415 )
				if( bullPower <= 0.62559 )
					if( Upper_Band <= 201.959 )
						if( Lower_Band <= 196.911 )
							ret := 0.500000
						if( Lower_Band > 196.911 )
							ret := 1.000000 // buy
					if( Upper_Band > 201.959 )
						if( Lower_Band <= 217.306 )
							if( basis <= 201.003 )
								ret := 1.000000 // buy
							if( basis > 201.003 )
								if( Upper_Band <= 217.351 )
									ret := -0.861538 // sell
								if( Upper_Band > 217.351 )
									ret := -0.363636
						if( Lower_Band > 217.306 )
							if( Upper_Band <= 228.645 )
								if( basis <= 224.432 )
									ret := 0.262411
								if( basis > 224.432 )
									ret := 0.702703 // buy
							if( Upper_Band > 228.645 )
								if( BBPower_Color <= 0.5 )
									ret := 0.058567
								if( BBPower_Color > 0.5 )
									ret := -0.004974
				if( bullPower > 0.62559 )
					if( basis <= 330.402 )
						if( Upper_Band <= 318.242 )
							if( Upper_Band <= 308.231 )
								if( Upper_Band <= 268.992 )
									ret := -0.252613
								if( Upper_Band > 268.992 )
									ret := 0.113772
							if( Upper_Band > 308.231 )
								if( basis <= 309.202 )
									ret := -0.808511 // sell
								if( basis > 309.202 )
									ret := -0.345455
						if( Upper_Band > 318.242 )
							if( bullPower <= 1.32629 )
								if( bearPower <= 0.637957 )
									ret := -0.266667
								if( bearPower > 0.637957 )
									ret := 0.636364
							if( bullPower > 1.32629 )
								if( basis <= 322.629 )
									ret := -1.000000 // sell
								if( basis > 322.629 )
									ret := 0.187500
					if( basis > 330.402 )
						if( Lower_Band <= 344.321 )
							if( bbm <= 0.19485 )
								if( Lower_Band <= 338.187 )
									ret := -0.370370
								if( Lower_Band > 338.187 )
									ret := -0.746667 // sell
							if( bbm > 0.19485 )
								if( bbp <= 1.16952 )
									ret := -0.500000
								if( bbp > 1.16952 )
									ret := 0.100000
						if( Lower_Band > 344.321 )
							if( Lower_Band <= 344.441 )
								if( basis <= 347.321 )
									ret := 0.833333 // buy
								if( basis > 347.321 )
									ret := 0.500000
							if( Lower_Band > 344.441 )
								if( bearPower <= 0.636369 )
									ret := 0.068966
								if( bearPower > 0.636369 )
									ret := -0.374302
			if( bbm > 0.220415 )
				if( basis <= 212.906 )
					if( bullPower <= 3.71981 )
						if( bullPower <= 0.885158 )
							if( basis <= 198.662 )
								if( bearPower <= -0.120967 )
									ret := 1.000000 // buy
								if( bearPower > -0.120967 )
									ret := 0.818182 // buy
							if( basis > 198.662 )
								if( Upper_Band <= 205.682 )
									ret := -0.080000
								if( Upper_Band > 205.682 )
									ret := 0.714286 // buy
						if( bullPower > 0.885158 )
							if( bbm <= 1.12648 )
								if( bbp <= 1.17322 )
									ret := -1.000000 // sell
								if( bbp > 1.17322 )
									ret := 0.022222
							if( bbm > 1.12648 )
								if( bbm <= 2.48954 )
									ret := 0.870968 // buy
								if( bbm > 2.48954 )
									ret := 0.000000
					if( bullPower > 3.71981 )
						if( basis <= 205.319 )
							ret := 0.000000
						if( basis > 205.319 )
							ret := -1.000000 // sell
				if( basis > 212.906 )
					if( bearPower <= 1.96671 )
						if( basis <= 215.031 )
							if( bullPower <= 1.32065 )
								if( bbm <= 1.02247 )
									ret := -0.921053 // sell
								if( bbm > 1.02247 )
									ret := 0.400000
							if( bullPower > 1.32065 )
								if( bbm <= 0.815 )
									ret := -0.900000 // sell
								if( bbm > 0.815 )
									ret := 1.000000 // buy
						if( basis > 215.031 )
							if( Lower_Band <= 326.566 )
								if( Upper_Band <= 322.055 )
									ret := 0.048006
								if( Upper_Band > 322.055 )
									ret := -0.182073
							if( Lower_Band > 326.566 )
								if( basis <= 328.952 )
									ret := 0.604651
								if( basis > 328.952 )
									ret := 0.090798
					if( bearPower > 1.96671 )
						if( bbm <= 4.63331 )
							if( Lower_Band <= 363.088 )
								if( bearPower <= 6.3183 )
									ret := -0.365759
								if( bearPower > 6.3183 )
									ret := 1.000000 // buy
							if( Lower_Band > 363.088 )
								if( bullPower <= 3.11258 )
									ret := -1.000000 // sell
								if( bullPower > 3.11258 )
									ret := 0.823529 // buy
						if( bbm > 4.63331 )
							if( bullPower <= 10.197 )
								ret := 1.000000 // buy
							if( bullPower > 10.197 )
								if( bullPower <= 11.4973 )
									ret := 0.250000
								if( bullPower > 11.4973 )
									ret := 0.500000
		if( Lower_Band > 381.42 )
			if( bbp <= 1.24057 )
				if( bullPower <= 0.419053 )
					if( Upper_Band <= 392.699 )
						if( bbp <= -1.02734 )
							if( Lower_Band <= 383.681 )
								ret := 1.000000 // buy
							if( Lower_Band > 383.681 )
								if( bullPower <= 0.051085 )
									ret := 0.846154 // buy
								if( bullPower > 0.051085 )
									ret := -0.400000
						if( bbp > -1.02734 )
							if( Upper_Band <= 391.928 )
								if( basis <= 382.705 )
									ret := -0.232143
								if( basis > 382.705 )
									ret := 0.007823
							if( Upper_Band > 391.928 )
								if( bearPower <= 0.193398 )
									ret := 0.261261
								if( bearPower > 0.193398 )
									ret := -0.750000 // sell
					if( Upper_Band > 392.699 )
						if( basis <= 392.892 )
							if( Upper_Band <= 393.174 )
								if( Upper_Band <= 392.995 )
									ret := -0.548387
								if( Upper_Band > 392.995 )
									ret := 0.076923
							if( Upper_Band > 393.174 )
								if( basis <= 391.422 )
									ret := -0.400000
								if( basis > 391.422 )
									ret := -1.000000 // sell
						if( basis > 392.892 )
							if( Upper_Band <= 394.26 )
								ret := 0.500000
							if( Upper_Band > 394.26 )
								ret := -0.200000
				if( bullPower > 0.419053 )
					if( basis <= 389.893 )
						if( basis <= 389.033 )
							if( bbp <= 1.21818 )
								if( Lower_Band <= 387.27 )
									ret := -0.158333
								if( Lower_Band > 387.27 )
									ret := 0.112245
							if( bbp > 1.21818 )
								if( Lower_Band <= 384.875 )
									ret := -0.200000
								if( Lower_Band > 384.875 )
									ret := 0.600000
						if( basis > 389.033 )
							if( Lower_Band <= 388.766 )
								if( bearPower <= -0.12897 )
									ret := -0.363636
								if( bearPower > -0.12897 )
									ret := 0.536232
							if( Lower_Band > 388.766 )
								if( bearPower <= 0.23327 )
									ret := -0.125000
								if( bearPower > 0.23327 )
									ret := 0.333333
					if( basis > 389.893 )
						if( BBPower_Color <= 0.5 )
							if( bullPower <= 0.628605 )
								if( basis <= 390.558 )
									ret := 1.000000 // buy
								if( basis > 390.558 )
									ret := 0.571429
							if( bullPower > 0.628605 )
								ret := -0.600000
						if( BBPower_Color > 0.5 )
							if( Lower_Band <= 389.471 )
								if( bbm <= 0.493557 )
									ret := -0.488372
								if( bbm > 0.493557 )
									ret := -0.777778 // sell
							if( Lower_Band > 389.471 )
								if( basis <= 390.652 )
									ret := 0.266667
								if( basis > 390.652 )
									ret := -0.317647
			if( bbp > 1.24057 )
				if( bbm <= 0.1946 )
					if( Lower_Band <= 384.028 )
						if( bullPower <= 0.816465 )
							ret := 0.000000
						if( bullPower > 0.816465 )
							ret := -0.666667
					if( Lower_Band > 384.028 )
						if( basis <= 386.105 )
							if( bbp <= 2.68392 )
								ret := -1.000000 // sell
							if( bbp > 2.68392 )
								ret := -0.750000 // sell
						if( basis > 386.105 )
							if( bullPower <= 0.815798 )
								if( Upper_Band <= 388.303 )
									ret := -0.166667
								if( Upper_Band > 388.303 )
									ret := -0.625000
							if( bullPower > 0.815798 )
								if( bbm <= 0.031764 )
									ret := -0.640000
								if( bbm > 0.031764 )
									ret := -1.000000 // sell
				if( bbm > 0.1946 )
					if( basis <= 387.458 )
						if( basis <= 385.671 )
							if( bullPower <= 1.08439 )
								if( bearPower <= 0.255049 )
									ret := -0.750000 // sell
								if( bearPower > 0.255049 )
									ret := -0.085106
							if( bullPower > 1.08439 )
								if( bbm <= 0.57628 )
									ret := -1.000000 // sell
								if( bbm > 0.57628 )
									ret := -0.515152
						if( basis > 385.671 )
							if( bearPower <= 0.445388 )
								if( bbm <= 1.92365 )
									ret := 0.460000
								if( bbm > 1.92365 )
									ret := -1.000000 // sell
							if( bearPower > 0.445388 )
								if( Upper_Band <= 391.32 )
									ret := -0.333333
								if( Upper_Band > 391.32 )
									ret := 0.500000
					if( basis > 387.458 )
						if( Upper_Band <= 392.277 )
							if( bbp <= 2.36177 )
								if( Lower_Band <= 386.617 )
									ret := -0.852941 // sell
								if( Lower_Band > 386.617 )
									ret := -0.475610
							if( bbp > 2.36177 )
								if( Upper_Band <= 390.843 )
									ret := -0.750000 // sell
								if( Upper_Band > 390.843 )
									ret := -1.000000 // sell
						if( Upper_Band > 392.277 )
							if( basis <= 390.666 )
								if( bearPower <= 0.151924 )
									ret := -1.000000 // sell
								if( bearPower > 0.151924 )
									ret := 0.333333
							if( basis > 390.666 )
								if( bbm <= 0.398355 )
									ret := -0.250000
								if( bbm > 0.398355 )
									ret := -0.880000 // sell
	
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
float op_operation = decision_tree_0_CRWD_1Min_91d8ace3(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


