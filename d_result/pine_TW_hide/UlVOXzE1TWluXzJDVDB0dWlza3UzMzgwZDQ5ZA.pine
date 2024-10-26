//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: RUN_15Min_2CT0_3380d49d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RUN_15Min_2CT0_3380d49d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RUN_15Min_3380d49d(mf, ad, ad_mf, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad_mf <= 0.063608 )
		if( ad_mf <= -1497.69 )
			if( ad <= -1.38743e+06 )
				if( ema3 <= 18.6025 )
					if( ad_mf <= -1.68271e+06 )
						if( ad <= -1.83439e+06 )
							ret := 0.250000
						if( ad > -1.83439e+06 )
							ret := -0.777778 // sell
					if( ad_mf > -1.68271e+06 )
						ret := 0.583333
				if( ema3 > 18.6025 )
					if( ad_mf <= -3.08174e+06 )
						ret := 0.272727
					if( ad_mf > -3.08174e+06 )
						if( ema12 <= 0.096667 )
							if( ema3 <= 25.1812 )
								ret := 0.727273 // buy
							if( ema3 > 25.1812 )
								ret := 1.000000 // buy
						if( ema12 > 0.096667 )
							ret := 0.400000
			if( ad > -1.38743e+06 )
				if( ad_mf <= -1.07404e+06 )
					if( ema3 <= 21.8518 )
						if( ema3 <= 12.1387 )
							ret := -0.076923
						if( ema3 > 12.1387 )
							if( ema12 <= -0.224637 )
								ret := -0.200000
							if( ema12 > -0.224637 )
								if( ema2 <= 18.0939 )
									ret := -0.695652
								if( ema2 > 18.0939 )
									ret := -1.000000 // sell
					if( ema3 > 21.8518 )
						ret := 0.076923
				if( ad_mf > -1.07404e+06 )
					if( ema12 <= -0.606708 )
						if( ad_mf <= -265540 )
							if( ad <= -430467 )
								if( ema2 <= 50.5665 )
									ret := 0.972973 // buy
								if( ema2 > 50.5665 )
									ret := 0.769231 // buy
							if( ad > -430467 )
								if( mf <= -0.567883 )
									ret := -0.076923
								if( mf > -0.567883 )
									ret := 0.620253
						if( ad_mf > -265540 )
							if( ad <= -13904.2 )
								if( ad_mf <= -70333.9 )
									ret := 0.141274
								if( ad_mf > -70333.9 )
									ret := -0.377193
							if( ad > -13904.2 )
								if( tema <= 50.9318 )
									ret := 0.800000 // buy
								if( tema > 50.9318 )
									ret := 0.361111
					if( ema12 > -0.606708 )
						if( ad <= -883831 )
							if( ema12 <= 0.079242 )
								if( ema12 <= -0.125881 )
									ret := 0.041667
								if( ema12 > -0.125881 )
									ret := 0.719008 // buy
							if( ema12 > 0.079242 )
								if( ad_mf <= -936567 )
									ret := -0.518519
								if( ad_mf > -936567 )
									ret := 0.357143
						if( ad > -883831 )
							if( ad_mf <= -633795 )
								if( ema1 <= 35.194 )
									ret := -0.325967
								if( ema1 > 35.194 )
									ret := 0.101695
							if( ad_mf > -633795 )
								if( ema1 <= 11.2067 )
									ret := 0.065970
								if( ema1 > 11.2067 )
									ret := 0.001679
		if( ad_mf > -1497.69 )
			if( ema12 <= 0.080372 )
				if( ad_mf <= -671.426 )
					if( ema12 <= -0.496212 )
						if( ad_mf <= -1073.98 )
							ret := 0.400000
						if( ad_mf > -1073.98 )
							if( ad_mf <= -868.306 )
								ret := 0.800000 // buy
							if( ad_mf > -868.306 )
								ret := 1.000000 // buy
					if( ema12 > -0.496212 )
						if( ad_mf <= -704.786 )
							if( ema1 <= 67.749 )
								if( ema13 <= 0.02042 )
									ret := 0.085315
								if( ema13 > 0.02042 )
									ret := 0.340643
							if( ema1 > 67.749 )
								if( tema <= 78.229 )
									ret := 0.844444 // buy
								if( tema > 78.229 )
									ret := 0.266667
						if( ad_mf > -704.786 )
							if( ema3 <= 53.1716 )
								if( ema2 <= 21.8623 )
									ret := 0.444444
								if( ema2 > 21.8623 )
									ret := 0.773333 // buy
							if( ema3 > 53.1716 )
								ret := -0.200000
				if( ad_mf > -671.426 )
					if( ema1 <= 43.1102 )
						if( tema <= 4.91078 )
							if( ema12 <= -0.01357 )
								if( ema12 <= -0.022108 )
									ret := 1.000000 // buy
								if( ema12 > -0.022108 )
									ret := 0.846154 // buy
							if( ema12 > -0.01357 )
								if( ema1 <= 4.87429 )
									ret := 0.833333 // buy
								if( ema1 > 4.87429 )
									ret := 0.461538
						if( tema > 4.91078 )
							if( ema2 <= 42.5311 )
								if( ad_mf <= -662.647 )
									ret := -0.632653
								if( ad_mf > -662.647 )
									ret := 0.078608
							if( ema2 > 42.5311 )
								if( mf <= -0.012708 )
									ret := -0.052632
								if( mf > -0.012708 )
									ret := -0.804348 // sell
					if( ema1 > 43.1102 )
						if( tema <= 43.9972 )
							if( ema13 <= -0.257066 )
								ret := 0.307692
							if( ema13 > -0.257066 )
								if( ad_mf <= -0.053993 )
									ret := 0.755102 // buy
								if( ad_mf > -0.053993 )
									ret := 0.466667
						if( tema > 43.9972 )
							if( ema12 <= -0.38178 )
								if( ema3 <= 67.6154 )
									ret := 0.725490 // buy
								if( ema3 > 67.6154 )
									ret := -0.142857
							if( ema12 > -0.38178 )
								if( ema1 <= 93.0688 )
									ret := 0.169082
								if( ema1 > 93.0688 )
									ret := -1.000000 // sell
			if( ema12 > 0.080372 )
				if( ad <= -799.808 )
					if( mf <= -0.159242 )
						if( ema12 <= 0.483611 )
							if( ema12 <= 0.185013 )
								if( ema13 <= 0.267633 )
									ret := -0.233333
								if( ema13 > 0.267633 )
									ret := -0.733333 // sell
							if( ema12 > 0.185013 )
								if( ad_mf <= -1092.54 )
									ret := 0.461538
								if( ad_mf > -1092.54 )
									ret := -0.454545
						if( ema12 > 0.483611 )
							ret := -1.000000 // sell
					if( mf > -0.159242 )
						if( tema <= 15.6279 )
							if( ad <= -1207.1 )
								ret := -0.875000 // sell
							if( ad > -1207.1 )
								ret := 0.368421
						if( tema > 15.6279 )
							if( ad_mf <= -1135.37 )
								if( ema3 <= 52.6072 )
									ret := 0.354430
								if( ema3 > 52.6072 )
									ret := -0.183673
							if( ad_mf > -1135.37 )
								if( mf <= 0.344457 )
									ret := 0.592357
								if( mf > 0.344457 )
									ret := -0.117647
				if( ad > -799.808 )
					if( tema <= 19.3921 )
						if( ema1 <= 15.3754 )
							if( ema3 <= 9.94808 )
								if( mf <= 0.218078 )
									ret := 0.769231 // buy
								if( mf > 0.218078 )
									ret := -0.333333
							if( ema3 > 9.94808 )
								if( ad_mf <= -0.231987 )
									ret := -0.061069
								if( ad_mf > -0.231987 )
									ret := -0.427885
						if( ema1 > 15.3754 )
							if( ema2 <= 18.4759 )
								if( ema2 <= 17.7698 )
									ret := 0.339394
								if( ema2 > 17.7698 )
									ret := 0.904110 // buy
							if( ema2 > 18.4759 )
								if( ad_mf <= -0.261098 )
									ret := 0.387097
								if( ad_mf > -0.261098 )
									ret := -0.277778
					if( tema > 19.3921 )
						if( ema2 <= 23.2946 )
							if( ad <= -0.902402 )
								if( ema2 <= 21.2135 )
									ret := -0.548387
								if( ema2 > 21.2135 )
									ret := 0.652174
							if( ad > -0.902402 )
								if( ema13 <= 0.237866 )
									ret := -0.481132
								if( ema13 > 0.237866 )
									ret := -0.695238
						if( ema2 > 23.2946 )
							if( ema13 <= 0.981961 )
								if( ema3 <= 62.1719 )
									ret := -0.156660
								if( ema3 > 62.1719 )
									ret := 0.127660
							if( ema13 > 0.981961 )
								if( ema1 <= 56.8183 )
									ret := -0.357143
								if( ema1 > 56.8183 )
									ret := -0.788462 // sell
	if( ad_mf > 0.063608 )
		if( ema1 <= 15.8282 )
			if( ema13 <= -0.6846 )
				if( ad_mf <= 69628 )
					if( ema3 <= 13.7297 )
						ret := 0.285714
					if( ema3 > 13.7297 )
						ret := 0.705882 // buy
				if( ad_mf > 69628 )
					if( mf <= -0.105285 )
						ret := 1.000000 // buy
					if( mf > -0.105285 )
						ret := 0.818182 // buy
			if( ema13 > -0.6846 )
				if( mf <= 0.146539 )
					if( ad <= 298372 )
						if( ema13 <= 0.227352 )
							if( tema <= 4.9 )
								if( ema3 <= 4.90611 )
									ret := 0.239669
								if( ema3 > 4.90611 )
									ret := 0.573770
							if( tema > 4.9 )
								if( ad <= 176207 )
									ret := 0.028512
								if( ad > 176207 )
									ret := 0.245955
						if( ema13 > 0.227352 )
							if( mf <= 0.117221 )
								if( ema1 <= 14.8443 )
									ret := -0.467005
								if( ema1 > 14.8443 )
									ret := 0.172414
							if( mf > 0.117221 )
								if( ema3 <= 12.2698 )
									ret := 0.615385
								if( ema3 > 12.2698 )
									ret := -0.055556
					if( ad > 298372 )
						if( ema13 <= 0.158714 )
							if( ema13 <= -0.268723 )
								if( ema3 <= 11.9489 )
									ret := -0.666667
								if( ema3 > 11.9489 )
									ret := 0.500000
							if( ema13 > -0.268723 )
								if( ema3 <= 11.7286 )
									ret := 0.126050
								if( ema3 > 11.7286 )
									ret := -0.224432
						if( ema13 > 0.158714 )
							if( ad_mf <= 532094 )
								if( ema13 <= 0.235611 )
									ret := -1.000000 // sell
								if( ema13 > 0.235611 )
									ret := -0.760000 // sell
							if( ad_mf > 532094 )
								ret := -0.250000
				if( mf > 0.146539 )
					if( mf <= 0.774323 )
						if( ad_mf <= 55377 )
							if( ema13 <= 0.095376 )
								if( ad_mf <= 51494.4 )
									ret := -0.139337
								if( ad_mf > 51494.4 )
									ret := -0.573529
							if( ema13 > 0.095376 )
								if( ema1 <= 7.31806 )
									ret := -0.269841
								if( ema1 > 7.31806 )
									ret := 0.005495
						if( ad_mf > 55377 )
							if( ad_mf <= 709384 )
								if( mf <= 0.622456 )
									ret := 0.037114
								if( mf > 0.622456 )
									ret := 0.581395
							if( ad_mf > 709384 )
								if( mf <= 0.630674 )
									ret := -0.042169
								if( mf > 0.630674 )
									ret := -0.800000 // sell
					if( mf > 0.774323 )
						if( ema13 <= 0.072973 )
							ret := 0.400000
						if( ema13 > 0.072973 )
							ret := 0.950000 // buy
		if( ema1 > 15.8282 )
			if( mf <= -0.381677 )
				if( ad_mf <= 1351.22 )
					if( ema3 <= 30.2209 )
						if( ema3 <= 29.7153 )
							if( ad_mf <= 748.197 )
								if( ema1 <= 27.9752 )
									ret := -0.146277
								if( ema1 > 27.9752 )
									ret := -0.882353 // sell
							if( ad_mf > 748.197 )
								if( ema12 <= -0.053098 )
									ret := -0.266667
								if( ema12 > -0.053098 )
									ret := -0.757576 // sell
						if( ema3 > 29.7153 )
							if( ema3 <= 29.8728 )
								ret := 1.000000 // buy
							if( ema3 > 29.8728 )
								ret := 0.454545
					if( ema3 > 30.2209 )
						if( tema <= 34.2318 )
							if( ema1 <= 30.7755 )
								if( ema3 <= 30.5628 )
									ret := -0.866667 // sell
								if( ema3 > 30.5628 )
									ret := 0.500000
							if( ema1 > 30.7755 )
								if( ema13 <= -0.415079 )
									ret := -0.363636
								if( ema13 > -0.415079 )
									ret := -0.875000 // sell
						if( tema > 34.2318 )
							if( ema12 <= -0.301541 )
								if( ad_mf <= 0.480167 )
									ret := -0.466667
								if( ad_mf > 0.480167 )
									ret := 0.306452
							if( ema12 > -0.301541 )
								if( ema2 <= 53.395 )
									ret := -0.152542
								if( ema2 > 53.395 )
									ret := -0.540107
				if( ad_mf > 1351.22 )
					if( ema13 <= 0.143889 )
						if( ad_mf <= 319484 )
							if( tema <= 53.1694 )
								if( ad <= 1403.63 )
									ret := 0.928571 // buy
								if( ad > 1403.63 )
									ret := 0.004963
							if( tema > 53.1694 )
								if( tema <= 67.9389 )
									ret := -0.500000
								if( tema > 67.9389 )
									ret := 0.294118
						if( ad_mf > 319484 )
							if( ema2 <= 32.8835 )
								if( ema2 <= 18.5924 )
									ret := 0.090909
								if( ema2 > 18.5924 )
									ret := 0.363636
							if( ema2 > 32.8835 )
								ret := 0.947368 // buy
					if( ema13 > 0.143889 )
						if( ema3 <= 31.8454 )
							if( ema2 <= 20.8066 )
								if( ema1 <= 19.5928 )
									ret := -0.357143
								if( ema1 > 19.5928 )
									ret := 0.000000
							if( ema2 > 20.8066 )
								if( ema12 <= 0.193505 )
									ret := -0.500000
								if( ema12 > 0.193505 )
									ret := -1.000000 // sell
						if( ema3 > 31.8454 )
							if( ad_mf <= 6084.01 )
								if( ema13 <= 0.193997 )
									ret := -0.538462
								if( ema13 > 0.193997 )
									ret := 0.269231
							if( ad_mf > 6084.01 )
								ret := -0.700000 // sell
			if( mf > -0.381677 )
				if( ad_mf <= 31021.8 )
					if( ema12 <= -0.60488 )
						if( mf <= -0.272595 )
							ret := -0.263158
						if( mf > -0.272595 )
							if( ema12 <= -0.76854 )
								if( ema12 <= -0.93783 )
									ret := 1.000000 // buy
								if( ema12 > -0.93783 )
									ret := 0.785714 // buy
							if( ema12 > -0.76854 )
								if( ema13 <= -1.13258 )
									ret := 0.250000
								if( ema13 > -1.13258 )
									ret := 0.650000
					if( ema12 > -0.60488 )
						if( ema13 <= 0.469185 )
							if( ema2 <= 73.0083 )
								if( ema3 <= 68.6511 )
									ret := -0.109026
								if( ema3 > 68.6511 )
									ret := 0.328947
							if( ema2 > 73.0083 )
								if( tema <= 79.237 )
									ret := -0.595420
								if( tema > 79.237 )
									ret := -0.214953
						if( ema13 > 0.469185 )
							if( tema <= 86.5834 )
								if( ad <= 28804.1 )
									ret := 0.094961
								if( ad > 28804.1 )
									ret := -0.666667
							if( tema > 86.5834 )
								if( ema3 <= 86.3612 )
									ret := -0.833333 // sell
								if( ema3 > 86.3612 )
									ret := -0.500000
				if( ad_mf > 31021.8 )
					if( tema <= 55.329 )
						if( ad <= 31290.7 )
							if( ema12 <= -0.012147 )
								if( ad <= 31088.8 )
									ret := 0.642857
								if( ad > 31088.8 )
									ret := 1.000000 // buy
							if( ema12 > -0.012147 )
								ret := 0.307692
						if( ad > 31290.7 )
							if( mf <= 0.791787 )
								if( ad_mf <= 42298.9 )
									ret := 0.069085
								if( ad_mf > 42298.9 )
									ret := -0.025320
							if( mf > 0.791787 )
								if( ema13 <= 0.425362 )
									ret := -0.701754 // sell
								if( ema13 > 0.425362 )
									ret := -0.133333
					if( tema > 55.329 )
						if( ad_mf <= 179372 )
							if( ad_mf <= 129006 )
								if( ema1 <= 75.9396 )
									ret := -0.152597
								if( ema1 > 75.9396 )
									ret := 0.061644
							if( ad_mf > 129006 )
								if( ad <= 131987 )
									ret := 0.724138 // buy
								if( ad > 131987 )
									ret := 0.037657
						if( ad_mf > 179372 )
							if( ema2 <= 70.6144 )
								if( ema3 <= 68.3003 )
									ret := -0.287425
								if( ema3 > 68.3003 )
									ret := -0.793103 // sell
							if( ema2 > 70.6144 )
								if( ad_mf <= 203148 )
									ret := -0.354839
								if( ad_mf > 203148 )
									ret := 0.297619
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_RUN_15Min_3380d49d(mf, ad, ad_mf, ema1, tema, ema12, ema2, ema3, ema13)

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


