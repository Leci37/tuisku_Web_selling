//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: SOLUSDT_30Min_2CT0_bee1ef19 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_30Min_2CT0_bee1ef19", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_30Min_bee1ef19(mf, ad, ad_mf, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad_mf <= -62111.6 )
		if( ad_mf <= -594504 )
			if( ema12 <= -0.049962 )
				if( ema13 <= -1.91582 )
					ret := 1.000000 // buy
				if( ema13 > -1.91582 )
					if( ema1 <= 18.9102 )
						ret := 1.000000 // buy
					if( ema1 > 18.9102 )
						ret := 0.125000
			if( ema12 > -0.049962 )
				if( ad <= -659309 )
					if( ema3 <= 27.9489 )
						ret := 0.500000
					if( ema3 > 27.9489 )
						ret := -1.000000 // sell
				if( ad > -659309 )
					ret := 0.785714 // buy
		if( ad_mf > -594504 )
			if( ema12 <= -1.15798 )
				if( ema3 <= 127.865 )
					if( ema3 <= 53.61 )
						if( ad <= -173177 )
							if( ema2 <= 40.0595 )
								if( ema12 <= -1.28434 )
									ret := 0.166667
								if( ema12 > -1.28434 )
									ret := 0.846154 // buy
							if( ema2 > 40.0595 )
								ret := -0.071429
						if( ad > -173177 )
							ret := -0.888889 // sell
					if( ema3 > 53.61 )
						if( ema13 <= -3.15198 )
							if( ema12 <= -2.13985 )
								if( ema2 <= 114.866 )
									ret := 0.322034
								if( ema2 > 114.866 )
									ret := 0.925926 // buy
							if( ema12 > -2.13985 )
								if( ema3 <= 87.6236 )
									ret := 0.545455
								if( ema3 > 87.6236 )
									ret := -0.305556
						if( ema13 > -3.15198 )
							if( tema <= 56.0882 )
								ret := 1.000000 // buy
							if( tema > 56.0882 )
								if( ad_mf <= -114977 )
									ret := 0.741935 // buy
								if( ad_mf > -114977 )
									ret := 0.390000
				if( ema3 > 127.865 )
					if( ad <= -200332 )
						if( ad_mf <= -368192 )
							ret := 0.692308
						if( ad_mf > -368192 )
							if( ema12 <= -2.48735 )
								if( ema12 <= -2.97892 )
									ret := 0.074074
								if( ema12 > -2.97892 )
									ret := 0.700000 // buy
							if( ema12 > -2.48735 )
								if( ema1 <= 138.802 )
									ret := -0.217391
								if( ema1 > 138.802 )
									ret := -0.837209 // sell
					if( ad > -200332 )
						if( ema13 <= -2.5298 )
							if( mf <= 0.0008 )
								if( ad_mf <= -71788.1 )
									ret := 0.124402
								if( ad_mf > -71788.1 )
									ret := 0.488889
							if( mf > 0.0008 )
								if( ema1 <= 150.727 )
									ret := 0.866667 // buy
								if( ema1 > 150.727 )
									ret := 0.458333
						if( ema13 > -2.5298 )
							if( ema13 <= -2.04313 )
								if( ema12 <= -1.71107 )
									ret := -0.875000 // sell
								if( ema12 > -1.71107 )
									ret := -0.092593
							if( ema13 > -2.04313 )
								if( tema <= 138.016 )
									ret := 0.411765
								if( tema > 138.016 )
									ret := -0.025641
			if( ema12 > -1.15798 )
				if( mf <= -0.242115 )
					if( ad_mf <= -80697.1 )
						if( ema13 <= -1.23236 )
							if( ad_mf <= -208239 )
								if( ema12 <= -0.919749 )
									ret := -0.681818
								if( ema12 > -0.919749 )
									ret := -0.142857
							if( ad_mf > -208239 )
								if( ema13 <= -1.43139 )
									ret := 0.551724
								if( ema13 > -1.43139 )
									ret := -0.416667
						if( ema13 > -1.23236 )
							if( tema <= 34.9519 )
								if( ema3 <= 34.1034 )
									ret := 0.424749
								if( ema3 > 34.1034 )
									ret := 0.857143 // buy
							if( tema > 34.9519 )
								if( ema2 <= 38.3726 )
									ret := -0.500000
								if( ema2 > 38.3726 )
									ret := 0.116667
					if( ad_mf > -80697.1 )
						if( ema13 <= -0.42614 )
							if( ema1 <= 39.2184 )
								if( ema12 <= -0.48501 )
									ret := 0.277778
								if( ema12 > -0.48501 )
									ret := 0.750000 // buy
							if( ema1 > 39.2184 )
								ret := -0.105263
						if( ema13 > -0.42614 )
							if( ad <= -73923.2 )
								if( ema1 <= 2.53656 )
									ret := -0.666667
								if( ema1 > 2.53656 )
									ret := -1.000000 // sell
							if( ad > -73923.2 )
								if( ad_mf <= -69528.7 )
									ret := 0.666667
								if( ad_mf > -69528.7 )
									ret := -0.145455
				if( mf > -0.242115 )
					if( ad_mf <= -79625.8 )
						if( ema12 <= -0.025194 )
							if( tema <= 130.278 )
								if( ema3 <= 44.5723 )
									ret := -0.061914
								if( ema3 > 44.5723 )
									ret := 0.050773
							if( tema > 130.278 )
								if( ad_mf <= -161294 )
									ret := -0.646341
								if( ad_mf > -161294 )
									ret := -0.214744
						if( ema12 > -0.025194 )
							if( ad <= -80790.8 )
								if( mf <= 0.108081 )
									ret := 0.012594
								if( mf > 0.108081 )
									ret := 0.124913
							if( ad > -80790.8 )
								if( ema1 <= 98.6617 )
									ret := -0.632353
								if( ema1 > 98.6617 )
									ret := 0.769231 // buy
					if( ad_mf > -79625.8 )
						if( ema13 <= 0.650278 )
							if( ema12 <= -0.114389 )
								if( ema2 <= 34.7793 )
									ret := 0.342697
								if( ema2 > 34.7793 )
									ret := 0.127044
							if( ema12 > -0.114389 )
								if( ad <= -75695 )
									ret := 0.175287
								if( ad > -75695 )
									ret := -0.096799
						if( ema13 > 0.650278 )
							if( ema13 <= 1.58008 )
								if( ad_mf <= -69937.9 )
									ret := 0.186567
								if( ad_mf > -69937.9 )
									ret := 0.629442
							if( ema13 > 1.58008 )
								if( ema1 <= 54.9003 )
									ret := 0.739130 // buy
								if( ema1 > 54.9003 )
									ret := -0.051724
	if( ad_mf > -62111.6 )
		if( ema12 <= 0.016307 )
			if( ad <= 81267.2 )
				if( ad_mf <= -58343.7 )
					if( ad_mf <= -59952.4 )
						if( tema <= 39.3195 )
							if( ad <= -60158 )
								if( mf <= -0.059744 )
									ret := -0.166667
								if( mf > -0.059744 )
									ret := 0.474576
							if( ad > -60158 )
								ret := -0.400000
						if( tema > 39.3195 )
							if( ad <= -61701.6 )
								if( ema12 <= -0.231016 )
									ret := -1.000000 // sell
								if( ema12 > -0.231016 )
									ret := -0.800000 // sell
							if( ad > -61701.6 )
								if( ema13 <= -1.12887 )
									ret := -0.304348
								if( ema13 > -1.12887 )
									ret := 0.200000
					if( ad_mf > -59952.4 )
						if( ema12 <= -1.88115 )
							ret := 0.466667
						if( ema12 > -1.88115 )
							if( ad_mf <= -58541 )
								if( tema <= 159.295 )
									ret := -0.478261
								if( tema > 159.295 )
									ret := -1.000000 // sell
							if( ad_mf > -58541 )
								if( ema1 <= 6.71874 )
									ret := -0.555556
								if( ema1 > 6.71874 )
									ret := -0.975000 // sell
				if( ad_mf > -58343.7 )
					if( mf <= -0.177937 )
						if( mf <= -0.178541 )
							if( ema1 <= 32.343 )
								if( ema3 <= 32.6513 )
									ret := 0.048682
								if( ema3 > 32.6513 )
									ret := 0.600000
							if( ema1 > 32.343 )
								if( ema12 <= -0.135692 )
									ret := -0.062932
								if( ema12 > -0.135692 )
									ret := 0.188172
						if( mf > -0.178541 )
							if( ema13 <= -0.187028 )
								ret := 0.411765
							if( ema13 > -0.187028 )
								ret := 0.750000 // buy
					if( mf > -0.177937 )
						if( ad_mf <= -44043.4 )
							if( ad_mf <= -44987.7 )
								if( ema13 <= -0.41906 )
									ret := 0.102941
								if( ema13 > -0.41906 )
									ret := -0.028135
							if( ad_mf > -44987.7 )
								if( tema <= 20.8553 )
									ret := 0.701754 // buy
								if( tema > 20.8553 )
									ret := 0.295302
						if( ad_mf > -44043.4 )
							if( tema <= 1.37537 )
								if( mf <= -0.113425 )
									ret := -0.153846
								if( mf > -0.113425 )
									ret := 0.444444
							if( tema > 1.37537 )
								if( ema13 <= -5.71533 )
									ret := -0.443038
								if( ema13 > -5.71533 )
									ret := -0.044699
			if( ad > 81267.2 )
				if( mf <= 0.092411 )
					if( ema1 <= 184.669 )
						if( ad <= 84391.3 )
							if( ema13 <= -1.02157 )
								if( ema12 <= -1.02116 )
									ret := 1.000000 // buy
								if( ema12 > -1.02116 )
									ret := 0.888889 // buy
							if( ema13 > -1.02157 )
								if( ema3 <= 20.3955 )
									ret := 0.108108
								if( ema3 > 20.3955 )
									ret := 0.443396
						if( ad > 84391.3 )
							if( ema13 <= -3.11287 )
								if( ema1 <= 80.643 )
									ret := 0.868421 // buy
								if( ema1 > 80.643 )
									ret := 0.431624
							if( ema13 > -3.11287 )
								if( tema <= 13.8542 )
									ret := 0.277778
								if( tema > 13.8542 )
									ret := 0.025074
					if( ema1 > 184.669 )
						if( ad <= 118716 )
							if( mf <= -0.066104 )
								ret := -0.461538
							if( mf > -0.066104 )
								ret := 0.000000
						if( ad > 118716 )
							ret := -0.761905 // sell
				if( mf > 0.092411 )
					if( ema12 <= -1.52024 )
						if( ema2 <= 65.0104 )
							ret := 1.000000 // buy
						if( ema2 > 65.0104 )
							if( ad_mf <= 457424 )
								if( ema12 <= -2.87167 )
									ret := -0.583333
								if( ema12 > -2.87167 )
									ret := -0.902439 // sell
							if( ad_mf > 457424 )
								ret := -0.166667
					if( ema12 > -1.52024 )
						if( ad_mf <= 84778 )
							if( ema12 <= -0.075473 )
								if( mf <= 0.188548 )
									ret := 0.972222 // buy
								if( mf > 0.188548 )
									ret := 0.357143
							if( ema12 > -0.075473 )
								if( ema1 <= 14.3745 )
									ret := 0.833333 // buy
								if( ema1 > 14.3745 )
									ret := -0.625000
						if( ad_mf > 84778 )
							if( ema1 <= 94.2827 )
								if( ema12 <= -0.031281 )
									ret := -0.309469
								if( ema12 > -0.031281 )
									ret := 0.036496
							if( ema1 > 94.2827 )
								if( tema <= 127.601 )
									ret := 0.289157
								if( tema > 127.601 )
									ret := -0.041667
		if( ema12 > 0.016307 )
			if( ad_mf <= 65908.4 )
				if( ad_mf <= 61067.1 )
					if( ema3 <= 137.652 )
						if( ad_mf <= -39811.2 )
							if( ema1 <= 137.139 )
								if( ema12 <= 0.065151 )
									ret := 0.089030
								if( ema12 > 0.065151 )
									ret := -0.112676
							if( ema1 > 137.139 )
								if( tema <= 138.802 )
									ret := 0.933333 // buy
								if( tema > 138.802 )
									ret := 0.750000 // buy
						if( ad_mf > -39811.2 )
							if( ema2 <= 21.4884 )
								if( ad <= 50540.6 )
									ret := 0.096105
								if( ad > 50540.6 )
									ret := 0.332248
							if( ema2 > 21.4884 )
								if( tema <= 60.6202 )
									ret := 0.013737
								if( tema > 60.6202 )
									ret := 0.104088
					if( ema3 > 137.652 )
						if( ema13 <= -0.765686 )
							if( mf <= -0.023798 )
								ret := -0.750000 // sell
							if( mf > -0.023798 )
								ret := -0.916667 // sell
						if( ema13 > -0.765686 )
							if( ad_mf <= -10671.9 )
								if( tema <= 246.606 )
									ret := 0.040825
								if( tema > 246.606 )
									ret := -0.523810
							if( ad_mf > -10671.9 )
								if( ema3 <= 200.341 )
									ret := -0.050555
								if( ema3 > 200.341 )
									ret := -0.226027
				if( ad_mf > 61067.1 )
					if( ad_mf <= 62069 )
						if( tema <= 5.79076 )
							if( ad <= 61802.4 )
								ret := -0.555556
							if( ad > 61802.4 )
								ret := 0.750000 // buy
						if( tema > 5.79076 )
							if( ema12 <= 0.761981 )
								if( ema12 <= 0.589938 )
									ret := 0.672000
								if( ema12 > 0.589938 )
									ret := 1.000000 // buy
							if( ema12 > 0.761981 )
								ret := 0.100000
					if( ad_mf > 62069 )
						if( mf <= 0.324379 )
							if( ad_mf <= 62960 )
								if( tema <= 68.3477 )
									ret := -0.140000
								if( tema > 68.3477 )
									ret := -0.361111
							if( ad_mf > 62960 )
								if( ad <= 64141.6 )
									ret := 0.614379
								if( ad > 64141.6 )
									ret := 0.054264
						if( mf > 0.324379 )
							ret := 0.923077 // buy
			if( ad_mf > 65908.4 )
				if( ema12 <= 0.778609 )
					if( ema2 <= 8.41716 )
						if( ema1 <= 7.78481 )
							if( ema1 <= 4.88531 )
								if( mf <= 0.327378 )
									ret := -0.424242
								if( mf > 0.327378 )
									ret := 0.068966
							if( ema1 > 4.88531 )
								if( mf <= 0.291237 )
									ret := -0.141304
								if( mf > 0.291237 )
									ret := 0.480000
						if( ema1 > 7.78481 )
							if( mf <= 0.133945 )
								ret := -0.818182 // sell
							if( mf > 0.133945 )
								ret := -1.000000 // sell
					if( ema2 > 8.41716 )
						if( ema3 <= 9.47232 )
							if( ema13 <= 0.249674 )
								if( ema2 <= 9.00678 )
									ret := 0.300000
								if( ema2 > 9.00678 )
									ret := 0.857143 // buy
							if( ema13 > 0.249674 )
								if( tema <= 9.68342 )
									ret := -0.142857
								if( tema > 9.68342 )
									ret := 0.333333
						if( ema3 > 9.47232 )
							if( ema12 <= 0.017564 )
								ret := -0.722222 // sell
							if( ema12 > 0.017564 )
								if( ema2 <= 197.707 )
									ret := -0.001948
								if( ema2 > 197.707 )
									ret := 0.833333 // buy
				if( ema12 > 0.778609 )
					if( ema2 <= 59.8792 )
						if( ad <= 401852 )
							if( ema3 <= 28.128 )
								if( ema1 <= 24.3267 )
									ret := 0.125000
								if( ema1 > 24.3267 )
									ret := -0.883721 // sell
							if( ema3 > 28.128 )
								if( ad <= 308752 )
									ret := -0.391566
								if( ad > 308752 )
									ret := 0.269231
						if( ad > 401852 )
							if( mf <= 0.180616 )
								ret := -0.500000
							if( mf > 0.180616 )
								if( mf <= 0.241298 )
									ret := -0.875000 // sell
								if( mf > 0.241298 )
									ret := -0.976190 // sell
					if( ema2 > 59.8792 )
						if( ad <= 68995.5 )
							if( ad_mf <= 67874.4 )
								ret := -0.555556
							if( ad_mf > 67874.4 )
								ret := -1.000000 // sell
						if( ad > 68995.5 )
							if( ema13 <= 1.45787 )
								if( ad_mf <= 84024.8 )
									ret := 0.411765
								if( ad_mf > 84024.8 )
									ret := -0.309322
							if( ema13 > 1.45787 )
								if( ad_mf <= 82706.3 )
									ret := 0.363095
								if( ad_mf > 82706.3 )
									ret := -0.091061
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_SOLUSDT_30Min_bee1ef19(mf, ad, ad_mf, ema1, tema, ema12, ema2, ema3, ema13)

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


