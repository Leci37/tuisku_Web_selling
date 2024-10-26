//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: U_1Min_1B00_5ca3bbd4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_1B00_5ca3bbd4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_5ca3bbd4(bbp, bullPower, BBPower_Color, bearPower, bbm)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbp <= -0.009987 )
		if( bullPower <= -0.04642 )
			if( bbp <= -0.114803 )
				if( bbp <= -0.122185 )
					if( bbp <= -0.165627 )
						if( bearPower <= -0.198895 )
							if( bearPower <= -0.259359 )
								if( bbp <= -0.939804 )
									ret := 0.558442
								if( bbp > -0.939804 )
									ret := 0.017544
							if( bearPower > -0.259359 )
								if( bullPower <= -0.118658 )
									ret := 0.537037
								if( bullPower > -0.118658 )
									ret := 0.149533
						if( bearPower > -0.198895 )
							if( bearPower <= -0.184485 )
								if( bullPower <= -0.161021 )
									ret := 0.625000
								if( bullPower > -0.161021 )
									ret := -0.260870
							if( bearPower > -0.184485 )
								if( bullPower <= -0.084356 )
									ret := 0.232578
								if( bullPower > -0.084356 )
									ret := -0.000644
					if( bbp > -0.165627 )
						if( bullPower <= -0.054812 )
							if( bbm <= 0.039931 )
								if( bearPower <= -0.092832 )
									ret := -0.111111
								if( bearPower > -0.092832 )
									ret := 0.334966
							if( bbm > 0.039931 )
								if( bbp <= -0.155193 )
									ret := 0.639535
								if( bbp > -0.155193 )
									ret := 1.000000 // buy
						if( bullPower > -0.054812 )
							if( bullPower <= -0.049307 )
								if( bbm <= 0.044771 )
									ret := -0.223926
								if( bbm > 0.044771 )
									ret := 0.096774
							if( bullPower > -0.049307 )
								if( bbp <= -0.129127 )
									ret := 0.680851
								if( bbp > -0.129127 )
									ret := 0.122807
				if( bbp > -0.122185 )
					if( bbp <= -0.121092 )
						if( bullPower <= -0.060673 )
							ret := -0.200000
						if( bullPower > -0.060673 )
							if( bullPower <= -0.050892 )
								if( bearPower <= -0.065994 )
									ret := -0.900000 // sell
								if( bearPower > -0.065994 )
									ret := -0.583333
							if( bullPower > -0.050892 )
								ret := -0.444444
					if( bbp > -0.121092 )
						if( bbp <= -0.119579 )
							if( bbm <= 0.0096 )
								ret := 0.000000
							if( bbm > 0.0096 )
								if( bbm <= 0.0142 )
									ret := 0.952381 // buy
								if( bbm > 0.0142 )
									ret := 0.250000
						if( bbp > -0.119579 )
							if( bullPower <= -0.058003 )
								if( bbp <= -0.116759 )
									ret := 0.090909
								if( bbp > -0.116759 )
									ret := 0.818182 // buy
							if( bullPower > -0.058003 )
								if( bullPower <= -0.052543 )
									ret := -0.454545
								if( bullPower > -0.052543 )
									ret := -0.146667
			if( bbp > -0.114803 )
				if( bearPower <= -0.0597 )
					if( bbm <= 0.014993 )
						if( bearPower <= -0.062247 )
							ret := 1.000000 // buy
						if( bearPower > -0.062247 )
							if( bbp <= -0.113651 )
								ret := 0.625000
							if( bbp > -0.113651 )
								if( bbp <= -0.112272 )
									ret := 1.000000 // buy
								if( bbp > -0.112272 )
									ret := 0.800000 // buy
					if( bbm > 0.014993 )
						if( bearPower <= -0.066768 )
							ret := 1.000000 // buy
						if( bearPower > -0.066768 )
							ret := 0.214286
				if( bearPower > -0.0597 )
					if( bullPower <= -0.053599 )
						if( bearPower <= -0.056113 )
							if( bbp <= -0.113907 )
								ret := 0.714286 // buy
							if( bbp > -0.113907 )
								if( bearPower <= -0.0568 )
									ret := -0.764706 // sell
								if( bearPower > -0.0568 )
									ret := 0.461538
						if( bearPower > -0.056113 )
							if( bearPower <= -0.055522 )
								ret := 1.000000 // buy
							if( bearPower > -0.055522 )
								if( bearPower <= -0.055122 )
									ret := 0.428571
								if( bearPower > -0.055122 )
									ret := 0.786517 // buy
					if( bullPower > -0.053599 )
						if( bullPower <= -0.051596 )
							if( bullPower <= -0.051877 )
								ret := 0.144737
							if( bullPower > -0.051877 )
								ret := -0.421053
						if( bullPower > -0.051596 )
							if( bearPower <= -0.058033 )
								ret := -0.333333
							if( bearPower > -0.058033 )
								if( bbp <= -0.097487 )
									ret := 0.397129
								if( bbp > -0.097487 )
									ret := 0.644231
		if( bullPower > -0.04642 )
			if( bullPower <= 0.015949 )
				if( bbm <= 0.004937 )
					if( bullPower <= -0.034454 )
						if( bullPower <= -0.03598 )
							if( bearPower <= -0.046161 )
								if( bearPower <= -0.046275 )
									ret := 0.333333
								if( bearPower > -0.046275 )
									ret := -0.333333
							if( bearPower > -0.046161 )
								if( bearPower <= -0.045474 )
									ret := 0.875000 // buy
								if( bearPower > -0.045474 )
									ret := 0.452347
						if( bullPower > -0.03598 )
							if( bbp <= -0.070981 )
								if( bbp <= -0.071471 )
									ret := 0.800000 // buy
								if( bbp > -0.071471 )
									ret := 1.000000 // buy
							if( bbp > -0.070981 )
								if( bearPower <= -0.034771 )
									ret := 0.609756
								if( bearPower > -0.034771 )
									ret := 0.820513 // buy
					if( bullPower > -0.034454 )
						if( bbp <= -0.066344 )
							if( bbp <= -0.066738 )
								if( bbp <= -0.06743 )
									ret := -0.218750
								if( bbp > -0.06743 )
									ret := 0.411765
							if( bbp > -0.066738 )
								if( bullPower <= -0.03325 )
									ret := -0.964286 // sell
								if( bullPower > -0.03325 )
									ret := -0.666667
						if( bbp > -0.066344 )
							if( bbp <= -0.041634 )
								if( bbm <= 0.004458 )
									ret := 0.335956
								if( bbm > 0.004458 )
									ret := 0.500000
							if( bbp > -0.041634 )
								if( bbp <= -0.037094 )
									ret := 0.005571
								if( bbp > -0.037094 )
									ret := 0.198791
				if( bbm > 0.004937 )
					if( bullPower <= -0.04434 )
						if( bearPower <= -0.056548 )
							if( bbp <= -0.156282 )
								if( bbm <= 0.07499 )
									ret := -1.000000 // sell
								if( bbm > 0.07499 )
									ret := -0.491525
							if( bbp > -0.156282 )
								if( bbm <= 0.050901 )
									ret := -0.460870
								if( bbm > 0.050901 )
									ret := 0.500000
						if( bearPower > -0.056548 )
							if( bbp <= -0.100214 )
								ret := 0.600000
							if( bbp > -0.100214 )
								ret := 0.250000
					if( bullPower > -0.04434 )
						if( bbp <= -0.226959 )
							if( bullPower <= 0.001079 )
								if( bullPower <= -0.027284 )
									ret := 0.454545
								if( bullPower > -0.027284 )
									ret := 0.937500 // buy
							if( bullPower > 0.001079 )
								ret := -0.166667
						if( bbp > -0.226959 )
							if( bbp <= -0.013014 )
								if( bbm <= 0.020162 )
									ret := -0.064940
								if( bbm > 0.020162 )
									ret := 0.020258
							if( bbp > -0.013014 )
								if( bbp <= -0.012593 )
									ret := 0.355000
								if( bbp > -0.012593 )
									ret := 0.071363
			if( bullPower > 0.015949 )
				if( bearPower <= -0.264706 )
					if( bbp <= -0.265918 )
						if( bearPower <= -0.36705 )
							if( bullPower <= 0.085199 )
								ret := -0.866667 // sell
							if( bullPower > 0.085199 )
								ret := 0.000000
						if( bearPower > -0.36705 )
							ret := 1.000000 // buy
					if( bbp > -0.265918 )
						if( bbm <= 0.409018 )
							ret := -0.958333 // sell
						if( bbm > 0.409018 )
							ret := -0.466667
				if( bearPower > -0.264706 )
					if( bullPower <= 0.024424 )
						if( bullPower <= 0.022324 )
							if( bbp <= -0.120413 )
								if( bearPower <= -0.179928 )
									ret := 1.000000 // buy
								if( bearPower > -0.179928 )
									ret := 0.619048
							if( bbp > -0.120413 )
								if( bbp <= -0.101546 )
									ret := -0.882353 // sell
								if( bbp > -0.101546 )
									ret := 0.286350
						if( bullPower > 0.022324 )
							if( bearPower <= -0.047336 )
								if( bbm <= 0.09505 )
									ret := 0.876712 // buy
								if( bbm > 0.09505 )
									ret := 0.681818
							if( bearPower > -0.047336 )
								if( bbm <= 0.069766 )
									ret := 0.432836
								if( bbm > 0.069766 )
									ret := -0.150000
					if( bullPower > 0.024424 )
						if( bearPower <= -0.101763 )
							if( bullPower <= 0.117298 )
								if( bbp <= -0.019611 )
									ret := 0.206612
								if( bbp > -0.019611 )
									ret := 0.928571 // buy
							if( bullPower > 0.117298 )
								if( bbp <= -0.036843 )
									ret := 1.000000 // buy
								if( bbp > -0.036843 )
									ret := 0.800000 // buy
						if( bearPower > -0.101763 )
							if( bearPower <= -0.048104 )
								if( bearPower <= -0.074207 )
									ret := -0.436047
								if( bearPower > -0.074207 )
									ret := -0.088542
							if( bearPower > -0.048104 )
								if( bearPower <= -0.041175 )
									ret := 0.634921
								if( bearPower > -0.041175 )
									ret := -0.708333 // sell
	if( bbp > -0.009987 )
		if( bearPower <= 0.014012 )
			if( bullPower <= -0.002933 )
				if( bearPower <= -0.003253 )
					if( bearPower <= -0.00374 )
						if( bbp <= -0.007617 )
							if( bullPower <= -0.004915 )
								ret := 0.500000
							if( bullPower > -0.004915 )
								if( bearPower <= -0.00448 )
									ret := -0.032967
								if( bearPower > -0.00448 )
									ret := 0.271186
						if( bbp > -0.007617 )
							ret := 0.727273 // buy
					if( bearPower > -0.00374 )
						if( bearPower <= -0.003531 )
							if( bbp <= -0.007158 )
								if( bbp <= -0.007351 )
									ret := -0.142857
								if( bbp > -0.007351 )
									ret := -0.454545
							if( bbp > -0.007158 )
								ret := -0.842105 // sell
						if( bearPower > -0.003531 )
							if( bearPower <= -0.003467 )
								ret := 0.666667
							if( bearPower > -0.003467 )
								if( bullPower <= -0.00334 )
									ret := -0.120000
								if( bullPower > -0.00334 )
									ret := 0.187500
				if( bearPower > -0.003253 )
					if( bbp <= -0.006072 )
						if( bullPower <= -0.003094 )
							if( bullPower <= -0.003169 )
								if( bearPower <= -0.003218 )
									ret := 0.500000
								if( bearPower > -0.003218 )
									ret := 0.818182 // buy
							if( bullPower > -0.003169 )
								ret := 0.076923
						if( bullPower > -0.003094 )
							ret := 1.000000 // buy
					if( bbp > -0.006072 )
						if( bearPower <= -0.002956 )
							ret := 0.142857
						if( bearPower > -0.002956 )
							ret := 0.647059
			if( bullPower > -0.002933 )
				if( bullPower <= 0.129157 )
					if( bearPower <= -0.086531 )
						if( bullPower <= 0.117301 )
							ret := -1.000000 // sell
						if( bullPower > 0.117301 )
							ret := -0.916667 // sell
					if( bearPower > -0.086531 )
						if( bbp <= 0.118125 )
							if( bearPower <= -0.069595 )
								if( bullPower <= 0.089511 )
									ret := 0.227273
								if( bullPower > 0.089511 )
									ret := 0.826087 // buy
							if( bearPower > -0.069595 )
								if( bbp <= 0.099938 )
									ret := -0.038416
								if( bbp > 0.099938 )
									ret := 0.276042
						if( bbp > 0.118125 )
							if( bbp <= 0.122675 )
								if( bullPower <= 0.120116 )
									ret := -0.925926 // sell
								if( bullPower > 0.120116 )
									ret := -0.571429
							if( bbp > 0.122675 )
								if( bbp <= 0.123068 )
									ret := 1.000000 // buy
								if( bbp > 0.123068 )
									ret := -0.423077
				if( bullPower > 0.129157 )
					if( bullPower <= 0.221282 )
						if( bullPower <= 0.181592 )
							if( bullPower <= 0.16469 )
								if( bearPower <= -0.016702 )
									ret := 0.707865 // buy
								if( bearPower > -0.016702 )
									ret := 0.144578
							if( bullPower > 0.16469 )
								if( bearPower <= 0.001183 )
									ret := -0.857143 // sell
								if( bearPower > 0.001183 )
									ret := 0.300000
						if( bullPower > 0.181592 )
							if( bearPower <= -0.026521 )
								ret := 1.000000 // buy
							if( bearPower > -0.026521 )
								ret := 0.615385
					if( bullPower > 0.221282 )
						if( bullPower <= 0.265192 )
							if( bbm <= 0.270771 )
								ret := -0.090909
							if( bbm > 0.270771 )
								if( bbm <= 0.308582 )
									ret := -1.000000 // sell
								if( bbm > 0.308582 )
									ret := -0.800000 // sell
						if( bullPower > 0.265192 )
							if( bearPower <= -0.064372 )
								if( bearPower <= -0.145253 )
									ret := 0.000000
								if( bearPower > -0.145253 )
									ret := -0.761905 // sell
							if( bearPower > -0.064372 )
								if( bullPower <= 0.428197 )
									ret := 0.333333
								if( bullPower > 0.428197 )
									ret := 0.916667 // buy
		if( bearPower > 0.014012 )
			if( bullPower <= 0.045768 )
				if( bearPower <= 0.040736 )
					if( bbm <= 2.2e-05 )
						if( bearPower <= 0.014322 )
							if( bullPower <= 0.014215 )
								if( bearPower <= 0.014059 )
									ret := -0.625000
								if( bearPower > 0.014059 )
									ret := 0.000000
							if( bullPower > 0.014215 )
								if( bearPower <= 0.014287 )
									ret := -0.842105 // sell
								if( bearPower > 0.014287 )
									ret := -0.684211
						if( bearPower > 0.014322 )
							if( bearPower <= 0.01604 )
								if( bbp <= 0.031739 )
									ret := -0.130802
								if( bbp > 0.031739 )
									ret := 0.600000
							if( bearPower > 0.01604 )
								if( bullPower <= 0.020374 )
									ret := -0.365135
								if( bullPower > 0.020374 )
									ret := -0.234308
					if( bbm > 2.2e-05 )
						if( bearPower <= 0.035339 )
							if( bbm <= 0.019991 )
								if( bbp <= 0.06211 )
									ret := -0.018785
								if( bbp > 0.06211 )
									ret := -0.151653
							if( bbm > 0.019991 )
								if( bullPower <= 0.041772 )
									ret := -0.344992
								if( bullPower > 0.041772 )
									ret := -0.087760
						if( bearPower > 0.035339 )
							if( bullPower <= 0.040694 )
								ret := -1.000000 // sell
							if( bullPower > 0.040694 )
								if( bullPower <= 0.044649 )
									ret := -0.095238
								if( bullPower > 0.044649 )
									ret := -0.666667
				if( bearPower > 0.040736 )
					if( bearPower <= 0.044603 )
						if( bullPower <= 0.044311 )
							if( bullPower <= 0.043565 )
								if( bullPower <= 0.041403 )
									ret := -0.847458 // sell
								if( bullPower > 0.041403 )
									ret := -0.641379
							if( bullPower > 0.043565 )
								if( bearPower <= 0.04364 )
									ret := 0.588235
								if( bearPower > 0.04364 )
									ret := -0.714286 // sell
						if( bullPower > 0.044311 )
							ret := -1.000000 // sell
					if( bearPower > 0.044603 )
						if( bearPower <= 0.045652 )
							if( bearPower <= 0.045179 )
								if( bullPower <= 0.044856 )
									ret := -0.117647
								if( bullPower > 0.044856 )
									ret := -0.857143 // sell
							if( bearPower > 0.045179 )
								if( bearPower <= 0.045405 )
									ret := 0.333333
								if( bearPower > 0.045405 )
									ret := -0.142857
						if( bearPower > 0.045652 )
							ret := -0.857143 // sell
			if( bullPower > 0.045768 )
				if( bbm <= 0.001822 )
					if( bullPower <= 0.063499 )
						if( bearPower <= 0.047878 )
							ret := -0.559322
						if( bearPower > 0.047878 )
							if( bullPower <= 0.048553 )
								if( bullPower <= 0.048331 )
									ret := -0.263158
								if( bullPower > 0.048331 )
									ret := 0.677419
							if( bullPower > 0.048553 )
								if( bearPower <= 0.049981 )
									ret := -0.630952
								if( bearPower > 0.049981 )
									ret := -0.204392
					if( bullPower > 0.063499 )
						if( bbp <= 0.130069 )
							if( bullPower <= 0.064493 )
								if( bullPower <= 0.063723 )
									ret := -1.000000 // sell
								if( bullPower > 0.063723 )
									ret := -0.625000
							if( bullPower > 0.064493 )
								ret := -1.000000 // sell
						if( bbp > 0.130069 )
							if( bearPower <= 0.07657 )
								if( bbp <= 0.143761 )
									ret := -0.446809
								if( bbp > 0.143761 )
									ret := -0.016667
							if( bearPower > 0.07657 )
								if( bullPower <= 0.077283 )
									ret := -0.885714 // sell
								if( bullPower > 0.077283 )
									ret := -0.562914
				if( bbm > 0.001822 )
					if( bbp <= 0.062916 )
						if( bearPower <= 0.016047 )
							ret := -0.461538
						if( bearPower > 0.016047 )
							ret := -0.937500 // sell
					if( bbp > 0.062916 )
						if( bbp <= 0.548522 )
							if( bearPower <= 0.196335 )
								if( bearPower <= 0.118043 )
									ret := 0.043668
								if( bearPower > 0.118043 )
									ret := -0.097297
							if( bearPower > 0.196335 )
								if( bearPower <= 0.214362 )
									ret := -0.663366
								if( bearPower > 0.214362 )
									ret := 0.025000
						if( bbp > 0.548522 )
							if( bbp <= 0.723674 )
								if( bearPower <= 0.217358 )
									ret := -0.136364
								if( bearPower > 0.217358 )
									ret := 0.754902 // buy
							if( bbp > 0.723674 )
								if( bbm <= 0.180512 )
									ret := -1.000000 // sell
								if( bbm > 0.180512 )
									ret := 0.363636
	
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
float op_operation = decision_tree_0_U_1Min_5ca3bbd4(bbp, bullPower, BBPower_Color, bearPower, bbm)

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


