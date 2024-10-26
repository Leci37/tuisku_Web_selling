//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: UBER_1Min_1B00_ecd9bdb9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_1B00_ecd9bdb9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_ecd9bdb9(bbp, bullPower, BBPower_Color, bearPower, bbm)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= 0.085908 )
		if( bullPower <= -0.064561 )
			if( bbp <= -0.158745 )
				if( bbp <= -1.77233 )
					if( bbp <= -6.0072 )
						ret := -0.600000
					if( bbp > -6.0072 )
						if( bbm <= 0.309701 )
							ret := 1.000000 // buy
						if( bbm > 0.309701 )
							if( bearPower <= -2.0557 )
								ret := 1.000000 // buy
							if( bearPower > -2.0557 )
								if( bbp <= -2.91123 )
									ret := 0.714286 // buy
								if( bbp > -2.91123 )
									ret := 0.818182 // buy
				if( bbp > -1.77233 )
					if( bullPower <= -0.141962 )
						if( bearPower <= -0.185543 )
							if( bbm <= 0.002252 )
								if( bullPower <= -0.200008 )
									ret := 0.618070
								if( bullPower > -0.200008 )
									ret := 0.188406
							if( bbm > 0.002252 )
								if( bbp <= -1.21553 )
									ret := -0.280899
								if( bbp > -1.21553 )
									ret := 0.054916
						if( bearPower > -0.185543 )
							if( bearPower <= -0.15041 )
								if( bearPower <= -0.152093 )
									ret := 0.485640
								if( bearPower > -0.152093 )
									ret := -0.708333 // sell
							if( bearPower > -0.15041 )
								if( bearPower <= -0.146647 )
									ret := 0.894737 // buy
								if( bearPower > -0.146647 )
									ret := 0.500000
					if( bullPower > -0.141962 )
						if( bullPower <= -0.126504 )
							if( bbm <= 0.039964 )
								if( bbp <= -0.262287 )
									ret := 0.307317
								if( bbp > -0.262287 )
									ret := -0.462687
							if( bbm > 0.039964 )
								if( bbp <= -0.318617 )
									ret := -0.211786
								if( bbp > -0.318617 )
									ret := -0.583333
						if( bullPower > -0.126504 )
							if( bearPower <= -0.13766 )
								if( bearPower <= -0.14023 )
									ret := 0.033309
								if( bearPower > -0.14023 )
									ret := -0.489130
							if( bearPower > -0.13766 )
								if( bearPower <= -0.080254 )
									ret := 0.223762
								if( bearPower > -0.080254 )
									ret := -0.666667
			if( bbp > -0.158745 )
				if( bbm <= 0.009167 )
					if( bullPower <= -0.068087 )
						if( bearPower <= -0.069922 )
							if( bullPower <= -0.073019 )
								if( bbp <= -0.157197 )
									ret := 0.744186 // buy
								if( bbp > -0.157197 )
									ret := 0.342857
							if( bullPower > -0.073019 )
								if( bullPower <= -0.072301 )
									ret := 0.849057 // buy
								if( bullPower > -0.072301 )
									ret := 0.560000
						if( bearPower > -0.069922 )
							if( bbp <= -0.138702 )
								ret := -0.538462
							if( bbp > -0.138702 )
								if( bearPower <= -0.068965 )
									ret := 0.409091
								if( bearPower > -0.068965 )
									ret := -0.120000
					if( bullPower > -0.068087 )
						if( bullPower <= -0.066886 )
							if( bullPower <= -0.067297 )
								if( bearPower <= -0.067921 )
									ret := 1.000000 // buy
								if( bearPower > -0.067921 )
									ret := 0.764706 // buy
							if( bullPower > -0.067297 )
								ret := 1.000000 // buy
						if( bullPower > -0.066886 )
							if( bbp <= -0.13141 )
								if( bbp <= -0.133381 )
									ret := 0.600000
								if( bbp > -0.133381 )
									ret := 0.200000
							if( bbp > -0.13141 )
								if( bullPower <= -0.064833 )
									ret := 0.771429 // buy
								if( bullPower > -0.064833 )
									ret := 1.000000 // buy
				if( bbm > 0.009167 )
					if( bbm <= 0.01995 )
						if( bullPower <= -0.067162 )
							if( bearPower <= -0.077858 )
								ret := -0.200000
							if( bearPower > -0.077858 )
								ret := -0.818182 // sell
						if( bullPower > -0.067162 )
							ret := -0.100000
					if( bbm > 0.01995 )
						ret := 0.650000
		if( bullPower > -0.064561 )
			if( bbm <= 3e-06 )
				if( BBPower_Color <= 0.5 )
					if( bullPower <= -0.000799 )
						if( bearPower <= -0.004003 )
							if( bearPower <= -0.060649 )
								if( bearPower <= -0.063664 )
									ret := 0.676471
								if( bearPower > -0.063664 )
									ret := -0.137931
							if( bearPower > -0.060649 )
								if( bearPower <= -0.059388 )
									ret := 0.794521 // buy
								if( bearPower > -0.059388 )
									ret := 0.267139
						if( bearPower > -0.004003 )
							if( bullPower <= -0.002239 )
								if( bullPower <= -0.002378 )
									ret := -0.080645
								if( bullPower > -0.002378 )
									ret := -0.705882 // sell
							if( bullPower > -0.002239 )
								if( bbp <= -0.0039 )
									ret := 0.660000
								if( bbp > -0.0039 )
									ret := 0.048780
					if( bullPower > -0.000799 )
						if( bearPower <= -0.000499 )
							ret := -0.181818
						if( bearPower > -0.000499 )
							if( bearPower <= -0.000239 )
								ret := -0.782609 // sell
							if( bearPower > -0.000239 )
								ret := -0.529412
				if( BBPower_Color > 0.5 )
					if( bearPower <= 0.006582 )
						if( bearPower <= 0.001233 )
							if( bearPower <= 0.000682 )
								if( bbp <= 0.000811 )
									ret := -0.111111
								if( bbp > 0.000811 )
									ret := 0.615385
							if( bearPower > 0.000682 )
								if( bbp <= 0.002052 )
									ret := -0.800000 // sell
								if( bbp > 0.002052 )
									ret := -0.333333
						if( bearPower > 0.001233 )
							if( bearPower <= 0.003526 )
								if( bullPower <= 0.003294 )
									ret := 0.426667
								if( bullPower > 0.003294 )
									ret := 0.714286 // buy
							if( bearPower > 0.003526 )
								if( bullPower <= 0.004208 )
									ret := -0.193548
								if( bullPower > 0.004208 )
									ret := 0.420455
					if( bearPower > 0.006582 )
						if( bbp <= 0.072513 )
							if( bbp <= 0.06944 )
								if( bearPower <= 0.032957 )
									ret := -0.067967
								if( bearPower > 0.032957 )
									ret := 0.132450
							if( bbp > 0.06944 )
								if( bullPower <= 0.035447 )
									ret := -0.833333 // sell
								if( bullPower > 0.035447 )
									ret := -0.060606
						if( bbp > 0.072513 )
							if( bearPower <= 0.038523 )
								if( bullPower <= 0.038444 )
									ret := 0.348837
								if( bullPower > 0.038444 )
									ret := 0.933333 // buy
							if( bearPower > 0.038523 )
								if( bbp <= 0.077991 )
									ret := -0.594595
								if( bbp > 0.077991 )
									ret := -0.034722
			if( bbm > 3e-06 )
				if( bbp <= -0.293826 )
					if( bbp <= -1.49047 )
						ret := -0.692308
					if( bbp > -1.49047 )
						if( bullPower <= 0.044498 )
							if( bullPower <= 3.3e-05 )
								if( bearPower <= -0.328361 )
									ret := 0.056962
								if( bearPower > -0.328361 )
									ret := 0.524324
							if( bullPower > 3.3e-05 )
								if( bullPower <= 0.011331 )
									ret := -0.763158 // sell
								if( bullPower > 0.011331 )
									ret := 0.051948
						if( bullPower > 0.044498 )
							if( bbp <= -0.841022 )
								ret := 1.000000 // buy
							if( bbp > -0.841022 )
								if( bearPower <= -0.815574 )
									ret := 0.263158
								if( bearPower > -0.815574 )
									ret := 0.877551 // buy
				if( bbp > -0.293826 )
					if( bbp <= -4e-05 )
						if( bullPower <= -0.057282 )
							if( bbm <= 0.13745 )
								if( bbm <= 0.111337 )
									ret := -0.183920
								if( bbm > 0.111337 )
									ret := 0.641975
							if( bbm > 0.13745 )
								if( bbp <= -0.283856 )
									ret := -0.304348
								if( bbp > -0.283856 )
									ret := -0.800000 // sell
						if( bullPower > -0.057282 )
							if( bearPower <= -0.07052 )
								if( bbp <= -0.057082 )
									ret := -0.029354
								if( bbp > -0.057082 )
									ret := 0.143646
							if( bearPower > -0.07052 )
								if( bbm <= 0.1189 )
									ret := -0.055055
								if( bbm > 0.1189 )
									ret := -0.590551
					if( bbp > -4e-05 )
						if( bearPower <= 0.025728 )
							if( bearPower <= -0.199117 )
								if( bullPower <= 0.274349 )
									ret := -0.973684 // sell
								if( bullPower > 0.274349 )
									ret := 0.230769
							if( bearPower > -0.199117 )
								if( bbm <= 0.200434 )
									ret := 0.028523
								if( bbm > 0.200434 )
									ret := 0.283753
						if( bearPower > 0.025728 )
							if( bearPower <= 0.037083 )
								if( bbm <= 0.00035 )
									ret := -0.739130 // sell
								if( bbm > 0.00035 )
									ret := -0.164265
							if( bearPower > 0.037083 )
								ret := -0.562500
	if( bbp > 0.085908 )
		if( bearPower <= 0.065941 )
			if( bullPower <= 0.063526 )
				if( bbm <= 0.024886 )
					if( bbm <= 0.021538 )
						if( bearPower <= 0.060451 )
							if( bbp <= 0.116132 )
								if( bullPower <= 0.056875 )
									ret := -0.169435
								if( bullPower > 0.056875 )
									ret := -0.372727
							if( bbp > 0.116132 )
								if( bbp <= 0.118288 )
									ret := 0.518519
								if( bbp > 0.118288 )
									ret := -0.127273
						if( bearPower > 0.060451 )
							if( bullPower <= 0.061512 )
								if( bullPower <= 0.060531 )
									ret := -0.600000
								if( bullPower > 0.060531 )
									ret := -0.915493 // sell
							if( bullPower > 0.061512 )
								if( bullPower <= 0.062672 )
									ret := 0.134328
								if( bullPower > 0.062672 )
									ret := -0.577778
					if( bbm > 0.021538 )
						ret := -0.888889 // sell
				if( bbm > 0.024886 )
					if( bbm <= 0.033276 )
						if( bbp <= 0.094024 )
							if( bullPower <= 0.05892 )
								if( bearPower <= 0.032798 )
									ret := -0.136364
								if( bearPower > 0.032798 )
									ret := 0.500000
							if( bullPower > 0.05892 )
								if( bbm <= 0.02995 )
									ret := 0.076923
								if( bbm > 0.02995 )
									ret := 0.304348
						if( bbp > 0.094024 )
							if( bearPower <= 0.034352 )
								if( bullPower <= 0.062272 )
									ret := 1.000000 // buy
								if( bullPower > 0.062272 )
									ret := 0.555556
							if( bearPower > 0.034352 )
								if( bbp <= 0.098251 )
									ret := 0.000000
								if( bbp > 0.098251 )
									ret := -0.200000
					if( bbm > 0.033276 )
						if( bullPower <= 0.062601 )
							if( bbp <= 0.087754 )
								ret := -0.384615
							if( bbp > 0.087754 )
								ret := -0.800000 // sell
						if( bullPower > 0.062601 )
							ret := -0.160000
			if( bullPower > 0.063526 )
				if( bearPower <= 0.022512 )
					if( bullPower <= 0.068272 )
						if( bullPower <= 0.066694 )
							ret := -0.333333
						if( bullPower > 0.066694 )
							if( bbp <= 0.08913 )
								if( bullPower <= 0.068009 )
									ret := -1.000000 // sell
								if( bullPower > 0.068009 )
									ret := -0.904762 // sell
							if( bbp > 0.08913 )
								ret := -0.727273 // sell
					if( bullPower > 0.068272 )
						if( bbp <= 0.206914 )
							if( bbp <= 0.187025 )
								if( bearPower <= -0.06413 )
									ret := -0.345277
								if( bearPower > -0.06413 )
									ret := -0.031420
							if( bbp > 0.187025 )
								if( bbm <= 0.179864 )
									ret := -0.818182 // sell
								if( bbm > 0.179864 )
									ret := -0.385246
						if( bbp > 0.206914 )
							if( bearPower <= -0.013444 )
								if( bbp <= 0.872842 )
									ret := 0.425466
								if( bbp > 0.872842 )
									ret := -0.291667
							if( bearPower > -0.013444 )
								if( bullPower <= 0.230846 )
									ret := 0.303279
								if( bullPower > 0.230846 )
									ret := -0.269912
				if( bearPower > 0.022512 )
					if( bullPower <= 0.332735 )
						if( bbm <= 0.270581 )
							if( bbp <= 0.117445 )
								if( bullPower <= 0.073799 )
									ret := 0.076826
								if( bullPower > 0.073799 )
									ret := 0.237421
							if( bbp > 0.117445 )
								if( bullPower <= 0.135706 )
									ret := -0.010323
								if( bullPower > 0.135706 )
									ret := 0.112100
						if( bbm > 0.270581 )
							if( bullPower <= 0.316735 )
								ret := -0.909091 // sell
							if( bullPower > 0.316735 )
								ret := -1.000000 // sell
					if( bullPower > 0.332735 )
						if( bullPower <= 0.471589 )
							if( bbp <= 0.397426 )
								if( bearPower <= 0.044284 )
									ret := 0.894737 // buy
								if( bearPower > 0.044284 )
									ret := -0.333333
							if( bbp > 0.397426 )
								if( bullPower <= 0.389058 )
									ret := 0.789474 // buy
								if( bullPower > 0.389058 )
									ret := 0.939394 // buy
						if( bullPower > 0.471589 )
							if( bearPower <= 0.034585 )
								ret := -0.900000 // sell
							if( bearPower > 0.034585 )
								ret := -0.333333
		if( bearPower > 0.065941 )
			if( bullPower <= 0.103245 )
				if( bbp <= 0.18653 )
					if( bearPower <= 0.083253 )
						if( bullPower <= 0.096418 )
							if( bbm <= 0.020091 )
								if( bullPower <= 0.082847 )
									ret := -0.243802
								if( bullPower > 0.082847 )
									ret := 0.212500
							if( bbm > 0.020091 )
								if( bbm <= 0.022536 )
									ret := -0.944444 // sell
								if( bbm > 0.022536 )
									ret := -0.529412
						if( bullPower > 0.096418 )
							if( bbp <= 0.177826 )
								if( bbp <= 0.16725 )
									ret := 0.909091 // buy
								if( bbp > 0.16725 )
									ret := 0.407407
							if( bbp > 0.177826 )
								ret := -0.315789
					if( bearPower > 0.083253 )
						if( bearPower <= 0.091706 )
							if( bullPower <= 0.085757 )
								if( bearPower <= 0.084831 )
									ret := -0.757576 // sell
								if( bearPower > 0.084831 )
									ret := -0.088889
							if( bullPower > 0.085757 )
								if( bearPower <= 0.088214 )
									ret := -0.746575 // sell
								if( bearPower > 0.088214 )
									ret := -0.477124
						if( bearPower > 0.091706 )
							if( bearPower <= 0.09276 )
								if( bullPower <= 0.092181 )
									ret := 0.173913
								if( bullPower > 0.092181 )
									ret := -0.333333
							if( bearPower > 0.09276 )
								if( bearPower <= 0.093111 )
									ret := 0.500000
								if( bearPower > 0.093111 )
									ret := 0.000000
				if( bbp > 0.18653 )
					if( bbp <= 0.198988 )
						if( bbp <= 0.197238 )
							if( bbp <= 0.187673 )
								if( bbp <= 0.187308 )
									ret := -0.666667
								if( bbp > 0.187308 )
									ret := -1.000000 // sell
							if( bbp > 0.187673 )
								if( bearPower <= 0.096919 )
									ret := -0.589744
								if( bearPower > 0.096919 )
									ret := -0.400000
						if( bbp > 0.197238 )
							if( bbp <= 0.198027 )
								ret := 0.000000
							if( bbp > 0.198027 )
								ret := 0.333333
					if( bbp > 0.198988 )
						if( bullPower <= 0.100217 )
							if( bearPower <= 0.100169 )
								ret := -0.909091 // sell
							if( bearPower > 0.100169 )
								ret := -1.000000 // sell
						if( bullPower > 0.100217 )
							if( bearPower <= 0.101093 )
								ret := -0.300000
							if( bearPower > 0.101093 )
								if( bearPower <= 0.102569 )
									ret := -0.753846 // sell
								if( bearPower > 0.102569 )
									ret := -0.933333 // sell
			if( bullPower > 0.103245 )
				if( bbm <= 0 )
					if( bullPower <= 0.104572 )
						if( bullPower <= 0.103669 )
							ret := 0.666667
						if( bullPower > 0.103669 )
							if( bearPower <= 0.104184 )
								ret := 0.937500 // buy
							if( bearPower > 0.104184 )
								ret := 0.846154 // buy
					if( bullPower > 0.104572 )
						if( bearPower <= 0.257034 )
							if( bbp <= 0.476393 )
								if( bullPower <= 0.117684 )
									ret := -0.205882
								if( bullPower > 0.117684 )
									ret := -0.422337
							if( bbp > 0.476393 )
								if( bbp <= 0.493731 )
									ret := 0.428571
								if( bbp > 0.493731 )
									ret := -0.233333
						if( bearPower > 0.257034 )
							if( bearPower <= 0.617894 )
								if( bullPower <= 0.434856 )
									ret := -0.553571
								if( bullPower > 0.434856 )
									ret := -0.935897 // sell
							if( bearPower > 0.617894 )
								ret := 0.384615
				if( bbm > 0 )
					if( bearPower <= 0.6869 )
						if( bbm <= 0.000211 )
							if( bbp <= 0.259418 )
								ret := 0.400000
							if( bbp > 0.259418 )
								if( bbp <= 0.374295 )
									ret := 1.000000 // buy
								if( bbp > 0.374295 )
									ret := 0.692308
						if( bbm > 0.000211 )
							if( bbm <= 0.011931 )
								if( bbp <= 0.208809 )
									ret := -0.880000 // sell
								if( bbp > 0.208809 )
									ret := -0.179558
							if( bbm > 0.011931 )
								if( bbm <= 0.050042 )
									ret := 0.045093
								if( bbm > 0.050042 )
									ret := -0.080605
					if( bearPower > 0.6869 )
						if( bullPower <= 2.20981 )
							if( bbp <= 1.85596 )
								ret := -0.900000 // sell
							if( bbp > 1.85596 )
								ret := -1.000000 // sell
						if( bullPower > 2.20981 )
							ret := -0.875000 // sell
	
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
float op_operation = decision_tree_0_UBER_1Min_ecd9bdb9(bbp, bullPower, BBPower_Color, bearPower, bbm)

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


