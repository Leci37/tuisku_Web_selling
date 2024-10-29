//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: NFLX_15Min_2BT0_b10660fd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NFLX_15Min_2BT0_b10660fd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NFLX_15Min_b10660fd(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema3 <= 290.509 )
		if( ema3 <= 116.925 )
			if( bearPower <= 0.165992 )
				if( ema1 <= 115.484 )
					ret := 1.000000 // buy
				if( ema1 > 115.484 )
					if( ema13 <= -0.137772 )
						ret := 0.200000
					if( ema13 > -0.137772 )
						if( ema2 <= 116.601 )
							ret := 0.615385
						if( ema2 > 116.601 )
							if( ema3 <= 116.756 )
								ret := 0.666667
							if( ema3 > 116.756 )
								ret := 1.000000 // buy
			if( bearPower > 0.165992 )
				ret := -0.181818
		if( ema3 > 116.925 )
			if( tema <= 275.71 )
				if( ema2 <= 272.318 )
					if( ema13 <= 1.66266 )
						if( bearPower <= 0.35471 )
							if( ema12 <= 0.523374 )
								if( ema12 <= -1.98994 )
									ret := 0.308197
								if( ema12 > -1.98994 )
									ret := 0.021891
							if( ema12 > 0.523374 )
								if( bullPower <= 0.853446 )
									ret := 0.059829
								if( bullPower > 0.853446 )
									ret := 0.377133
						if( bearPower > 0.35471 )
							if( bearPower <= 1.05848 )
								if( ema1 <= 141.688 )
									ret := -0.309211
								if( ema1 > 141.688 )
									ret := -0.017936
							if( bearPower > 1.05848 )
								if( ema12 <= 1.02755 )
									ret := -0.126923
								if( ema12 > 1.02755 )
									ret := -0.463235
					if( ema13 > 1.66266 )
						if( bullPower <= 3.79001 )
							if( ema12 <= 1.84896 )
								if( ema3 <= 148.078 )
									ret := 0.906977 // buy
								if( ema3 > 148.078 )
									ret := 0.187135
							if( ema12 > 1.84896 )
								if( bbm <= 0.800938 )
									ret := -0.409091
								if( bbm > 0.800938 )
									ret := 0.581498
						if( bullPower > 3.79001 )
							if( tema <= 246.159 )
								if( ema1 <= 233.543 )
									ret := -0.061798
								if( ema1 > 233.543 )
									ret := 0.413043
							if( tema > 246.159 )
								if( ema1 <= 268.614 )
									ret := -0.480952
								if( ema1 > 268.614 )
									ret := 0.217391
				if( ema2 > 272.318 )
					if( bearPower <= -1.02157 )
						if( bbm <= 0.5525 )
							if( ema2 <= 275.79 )
								if( bearPower <= -2.22071 )
									ret := 1.000000 // buy
								if( bearPower > -2.22071 )
									ret := 0.400000
							if( ema2 > 275.79 )
								ret := -0.142857
						if( bbm > 0.5525 )
							if( ema13 <= -1.93532 )
								if( ema2 <= 274.64 )
									ret := -0.078125
								if( ema2 > 274.64 )
									ret := -0.638743
							if( ema13 > -1.93532 )
								if( bullPower <= 0.034428 )
									ret := -0.901235 // sell
								if( bullPower > 0.034428 )
									ret := -0.474359
					if( bearPower > -1.02157 )
						if( ema2 <= 273.832 )
							if( bearPower <= 0.003103 )
								if( bbp <= 0.726674 )
									ret := -0.350877
								if( bbp > 0.726674 )
									ret := 0.500000
							if( bearPower > 0.003103 )
								if( tema <= 273.982 )
									ret := -0.714286 // sell
								if( tema > 273.982 )
									ret := -0.230769
						if( ema2 > 273.832 )
							if( tema <= 274.534 )
								if( ema2 <= 274.054 )
									ret := 0.913043 // buy
								if( ema2 > 274.054 )
									ret := 0.162791
							if( tema > 274.534 )
								if( ema12 <= 0.091891 )
									ret := -0.463415
								if( ema12 > 0.091891 )
									ret := 0.300000
			if( tema > 275.71 )
				if( bullPower <= 5.69115 )
					if( bearPower <= -0.772664 )
						if( ema1 <= 288.407 )
							if( bbm <= 1.84355 )
								if( bullPower <= 0.170071 )
									ret := 0.083582
								if( bullPower > 0.170071 )
									ret := -0.360656
							if( bbm > 1.84355 )
								if( ema2 <= 285.471 )
									ret := 0.189802
								if( ema2 > 285.471 )
									ret := 0.441088
						if( ema1 > 288.407 )
							if( BBPower_Color <= 0.5 )
								if( ema13 <= 0.536452 )
									ret := 0.608108
								if( ema13 > 0.536452 )
									ret := -0.120000
							if( BBPower_Color > 0.5 )
								if( ema1 <= 289.149 )
									ret := 0.666667
								if( ema1 > 289.149 )
									ret := 0.955556 // buy
					if( bearPower > -0.772664 )
						if( ema2 <= 281.564 )
							if( ema3 <= 280.486 )
								if( ema12 <= 0.34151 )
									ret := -0.077551
								if( ema12 > 0.34151 )
									ret := 0.273846
							if( ema3 > 280.486 )
								if( bullPower <= 1.1501 )
									ret := 0.489362
								if( bullPower > 1.1501 )
									ret := 0.893939 // buy
						if( ema2 > 281.564 )
							if( ema13 <= 3.21975 )
								if( bbm <= 1.22849 )
									ret := 0.002506
								if( bbm > 1.22849 )
									ret := -0.218954
							if( ema13 > 3.21975 )
								if( tema <= 290.703 )
									ret := 0.746667 // buy
								if( tema > 290.703 )
									ret := 0.015385
				if( bullPower > 5.69115 )
					if( ema3 <= 265.833 )
						ret := -0.444444
					if( ema3 > 265.833 )
						if( ema12 <= 2.2087 )
							if( ema3 <= 283.191 )
								ret := -0.117647
							if( ema3 > 283.191 )
								if( tema <= 295.012 )
									ret := 0.833333 // buy
								if( tema > 295.012 )
									ret := 0.230769
						if( ema12 > 2.2087 )
							if( bbm <= 1.96073 )
								ret := 0.125000
							if( bbm > 1.96073 )
								if( bbp <= 22.7409 )
									ret := 0.842105 // buy
								if( bbp > 22.7409 )
									ret := -0.125000
	if( ema3 > 290.509 )
		if( ema12 <= -0.131249 )
			if( bbm <= 1.26871 )
				if( ema13 <= -1.33434 )
					if( bullPower <= -2.55642 )
						if( tema <= 521.655 )
							if( ema2 <= 315.732 )
								if( bbp <= -21.9893 )
									ret := 0.900000 // buy
								if( bbp > -21.9893 )
									ret := -0.135417
							if( ema2 > 315.732 )
								if( bearPower <= -8.85302 )
									ret := -0.400000
								if( bearPower > -8.85302 )
									ret := 0.481818
						if( tema > 521.655 )
							if( ema2 <= 535.734 )
								if( ema1 <= 531.367 )
									ret := -0.454545
								if( ema1 > 531.367 )
									ret := -1.000000 // sell
							if( ema2 > 535.734 )
								if( ema12 <= -3.77768 )
									ret := -0.468750
								if( ema12 > -3.77768 )
									ret := 0.369565
					if( bullPower > -2.55642 )
						if( ema2 <= 304.37 )
							if( ema1 <= 295.815 )
								if( bearPower <= -0.808799 )
									ret := 0.050314
								if( bearPower > -0.808799 )
									ret := 0.450000
							if( ema1 > 295.815 )
								if( bbp <= -4.84137 )
									ret := -0.222222
								if( bbp > -4.84137 )
									ret := 0.566038
						if( ema2 > 304.37 )
							if( ema3 <= 306.832 )
								if( bbp <= -4.02959 )
									ret := -0.200000
								if( bbp > -4.02959 )
									ret := -0.750000 // sell
							if( ema3 > 306.832 )
								if( ema12 <= -0.67003 )
									ret := 0.153524
								if( ema12 > -0.67003 )
									ret := -0.001377
				if( ema13 > -1.33434 )
					if( ema1 <= 433.28 )
						if( ema1 <= 301.813 )
							if( tema <= 293.052 )
								if( ema12 <= -0.321546 )
									ret := 0.156398
								if( ema12 > -0.321546 )
									ret := -0.394737
							if( tema > 293.052 )
								if( bullPower <= -0.38169 )
									ret := 0.624113
								if( bullPower > -0.38169 )
									ret := 0.318182
						if( ema1 > 301.813 )
							if( bbp <= -1.77036 )
								if( ema12 <= -0.645482 )
									ret := 0.020284
								if( ema12 > -0.645482 )
									ret := -0.182741
							if( bbp > -1.77036 )
								if( ema2 <= 379.562 )
									ret := 0.047558
								if( ema2 > 379.562 )
									ret := -0.112867
					if( ema1 > 433.28 )
						if( bullPower <= -0.799478 )
							if( tema <= 549.887 )
								if( bullPower <= -0.983694 )
									ret := 0.566845
								if( bullPower > -0.983694 )
									ret := 0.337580
							if( tema > 549.887 )
								if( tema <= 610.727 )
									ret := -0.073826
								if( tema > 610.727 )
									ret := 0.384977
						if( bullPower > -0.799478 )
							if( ema2 <= 436.03 )
								if( bbm <= 0.099337 )
									ret := 0.000000
								if( bbm > 0.099337 )
									ret := 0.861111 // buy
							if( ema2 > 436.03 )
								if( tema <= 682.681 )
									ret := 0.072787
								if( tema > 682.681 )
									ret := -0.358025
			if( bbm > 1.26871 )
				if( ema13 <= -8.84005 )
					if( bullPower <= -36.9961 )
						if( ema12 <= -29.5665 )
							ret := -1.000000 // sell
						if( ema12 > -29.5665 )
							ret := -0.909091 // sell
					if( bullPower > -36.9961 )
						if( bearPower <= -8.81202 )
							if( bbp <= -16.3149 )
								if( ema3 <= 513.148 )
									ret := 0.136364
								if( ema3 > 513.148 )
									ret := 0.645570
							if( bbp > -16.3149 )
								if( ema3 <= 402.373 )
									ret := 0.235294
								if( ema3 > 402.373 )
									ret := -0.708333 // sell
						if( bearPower > -8.81202 )
							if( bbp <= -8.08434 )
								if( ema3 <= 589.372 )
									ret := 0.776923 // buy
								if( ema3 > 589.372 )
									ret := -0.529412
							if( bbp > -8.08434 )
								if( ema13 <= -11.3785 )
									ret := 0.583333
								if( ema13 > -11.3785 )
									ret := 1.000000 // buy
				if( ema13 > -8.84005 )
					if( bbp <= -1.89932 )
						if( ema2 <= 422.642 )
							if( bullPower <= -2.44286 )
								if( ema2 <= 351.302 )
									ret := 0.038593
								if( ema2 > 351.302 )
									ret := 0.296037
							if( bullPower > -2.44286 )
								if( ema3 <= 384.206 )
									ret := -0.083944
								if( ema3 > 384.206 )
									ret := 0.114812
						if( ema2 > 422.642 )
							if( ema1 <= 423.361 )
								if( bbp <= -10.0013 )
									ret := -0.974359 // sell
								if( bbp > -10.0013 )
									ret := -0.551020
							if( ema1 > 423.361 )
								if( ema3 <= 428.357 )
									ret := 0.351064
								if( ema3 > 428.357 )
									ret := -0.097078
					if( bbp > -1.89932 )
						if( ema2 <= 635.814 )
							if( ema3 <= 521.715 )
								if( tema <= 517.165 )
									ret := 0.002604
								if( tema > 517.165 )
									ret := -0.689655
							if( ema3 > 521.715 )
								if( ema1 <= 633.094 )
									ret := 0.150895
								if( ema1 > 633.094 )
									ret := 0.941176 // buy
						if( ema2 > 635.814 )
							if( ema12 <= -1.64135 )
								ret := 1.000000 // buy
							if( ema12 > -1.64135 )
								if( ema1 <= 658.86 )
									ret := -0.535865
								if( ema1 > 658.86 )
									ret := 0.011811
		if( ema12 > -0.131249 )
			if( ema2 <= 299.074 )
				if( ema2 <= 294.861 )
					if( ema12 <= 0.200105 )
						if( tema <= 290.752 )
							if( bbm <= 0.44 )
								ret := -0.470588
							if( bbm > 0.44 )
								ret := -0.800000 // sell
						if( tema > 290.752 )
							if( ema2 <= 291.497 )
								if( ema3 <= 290.807 )
									ret := -0.074074
								if( ema3 > 290.807 )
									ret := 0.652893
							if( ema2 > 291.497 )
								if( ema3 <= 291.623 )
									ret := -0.800000 // sell
								if( ema3 > 291.623 )
									ret := 0.073248
					if( ema12 > 0.200105 )
						if( tema <= 294.599 )
							if( ema3 <= 290.833 )
								if( ema1 <= 291.109 )
									ret := -0.285714
								if( ema1 > 291.109 )
									ret := 0.517857
							if( ema3 > 290.833 )
								if( bearPower <= 0.526589 )
									ret := -0.588957
								if( bearPower > 0.526589 )
									ret := 0.042553
						if( tema > 294.599 )
							if( bullPower <= 1.99345 )
								if( ema13 <= 0.380111 )
									ret := -0.409091
								if( ema13 > 0.380111 )
									ret := 0.228571
							if( bullPower > 1.99345 )
								if( tema <= 295.571 )
									ret := -0.589286
								if( tema > 295.571 )
									ret := -0.118280
				if( ema2 > 294.861 )
					if( ema12 <= 1.0138 )
						if( ema1 <= 295.09 )
							ret := 0.263158
						if( ema1 > 295.09 )
							if( bullPower <= 1.16661 )
								if( ema12 <= 0.65474 )
									ret := -0.373950
								if( ema12 > 0.65474 )
									ret := 0.325581
							if( bullPower > 1.16661 )
								if( ema1 <= 296.99 )
									ret := -0.808290 // sell
								if( ema1 > 296.99 )
									ret := -0.553846
					if( ema12 > 1.0138 )
						if( bearPower <= 3.00598 )
							if( ema1 <= 297.688 )
								if( bbm <= 1.48841 )
									ret := 0.250000
								if( bbm > 1.48841 )
									ret := -0.888889 // sell
							if( ema1 > 297.688 )
								if( ema13 <= 5.51624 )
									ret := 0.716418 // buy
								if( ema13 > 5.51624 )
									ret := -0.333333
						if( bearPower > 3.00598 )
							if( ema3 <= 292.973 )
								ret := -0.375000
							if( ema3 > 292.973 )
								if( tema <= 305.258 )
									ret := -0.666667
								if( tema > 305.258 )
									ret := -1.000000 // sell
			if( ema2 > 299.074 )
				if( ema1 <= 723.078 )
					if( ema13 <= 10.1131 )
						if( ema1 <= 367.202 )
							if( ema13 <= 1.88492 )
								if( ema2 <= 366.942 )
									ret := -0.026408
								if( ema2 > 366.942 )
									ret := 0.774194 // buy
							if( ema13 > 1.88492 )
								if( ema3 <= 360.004 )
									ret := 0.084059
								if( ema3 > 360.004 )
									ret := 0.394102
						if( ema1 > 367.202 )
							if( tema <= 392.053 )
								if( ema2 <= 364.864 )
									ret := 0.765957 // buy
								if( ema2 > 364.864 )
									ret := -0.176481
							if( tema > 392.053 )
								if( bearPower <= 1.95959 )
									ret := -0.011960
								if( bearPower > 1.95959 )
									ret := -0.100884
					if( ema13 > 10.1131 )
						if( tema <= 545.727 )
							if( ema1 <= 387.523 )
								if( ema1 <= 308.909 )
									ret := 1.000000 // buy
								if( ema1 > 308.909 )
									ret := -0.304348
							if( ema1 > 387.523 )
								if( ema3 <= 489.851 )
									ret := 0.666667
								if( ema3 > 489.851 )
									ret := 0.950000 // buy
						if( tema > 545.727 )
							if( ema2 <= 539.451 )
								if( bullPower <= 10.5811 )
									ret := -0.875000 // sell
								if( bullPower > 10.5811 )
									ret := -1.000000 // sell
							if( ema2 > 539.451 )
								if( ema1 <= 612.863 )
									ret := 0.000000
								if( ema1 > 612.863 )
									ret := 0.818182 // buy
				if( ema1 > 723.078 )
					if( bearPower <= -2.60002 )
						ret := -1.000000 // sell
					if( bearPower > -2.60002 )
						if( ema3 <= 724.901 )
							if( ema12 <= 0.71338 )
								if( ema2 <= 724.754 )
									ret := -0.800000 // sell
								if( ema2 > 724.754 )
									ret := -1.000000 // sell
							if( ema12 > 0.71338 )
								if( ema12 <= 1.18419 )
									ret := -0.105263
								if( ema12 > 1.18419 )
									ret := -0.909091 // sell
						if( ema3 > 724.901 )
							if( ema1 <= 726.973 )
								ret := -0.055556
							if( ema1 > 726.973 )
								if( ema12 <= 0.698569 )
									ret := -0.583333
								if( ema12 > 0.698569 )
									ret := 0.000000
	
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
float op_operation = decision_tree_0_NFLX_15Min_b10660fd(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


