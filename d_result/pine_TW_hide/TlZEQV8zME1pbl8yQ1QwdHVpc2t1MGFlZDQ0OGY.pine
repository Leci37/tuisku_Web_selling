//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: NVDA_30Min_2CT0_0aed448f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_2CT0_0aed448f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_0aed448f(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ad <= -97958.2 )
		if( ema3 <= 116.786 )
			if( mf <= -0.604927 )
				if( ema12 <= -0.968355 )
					ret := -0.300000
				if( ema12 > -0.968355 )
					ret := -0.846154 // sell
			if( mf > -0.604927 )
				if( ad <= -102578 )
					if( ad_mf <= -108595 )
						if( ema13 <= -4.54401 )
							ret := 1.000000 // buy
						if( ema13 > -4.54401 )
							if( ad_mf <= -287293 )
								if( ad_mf <= -326530 )
									ret := 0.116447
								if( ad_mf > -326530 )
									ret := 0.392857
							if( ad_mf > -287293 )
								if( ad <= -147742 )
									ret := -0.070881
								if( ad > -147742 )
									ret := 0.251163
					if( ad_mf > -108595 )
						if( ema1 <= 69.0315 )
							ret := -0.875000 // sell
						if( ema1 > 69.0315 )
							ret := -0.550000
				if( ad > -102578 )
					ret := 0.888889 // buy
		if( ema3 > 116.786 )
			if( ad <= -2.06245e+07 )
				if( ema13 <= -0.151705 )
					if( tema <= 123.678 )
						ret := -0.750000 // sell
					if( tema > 123.678 )
						if( ema3 <= 128.73 )
							ret := -1.000000 // sell
						if( ema3 > 128.73 )
							ret := -0.769231 // sell
				if( ema13 > -0.151705 )
					ret := -0.416667
			if( ad > -2.06245e+07 )
				if( ema3 <= 237.807 )
					if( ad_mf <= -4.44788e+06 )
						if( ema3 <= 128.324 )
							if( ad <= -1.56318e+07 )
								if( ema3 <= 118.634 )
									ret := 1.000000 // buy
								if( ema3 > 118.634 )
									ret := 0.266667
							if( ad > -1.56318e+07 )
								if( ema3 <= 118.919 )
									ret := -0.674419
								if( ema3 > 118.919 )
									ret := 0.037975
						if( ema3 > 128.324 )
							if( ema13 <= -1.95552 )
								if( ema13 <= -5.55084 )
									ret := 0.125000
								if( ema13 > -5.55084 )
									ret := -0.725664 // sell
							if( ema13 > -1.95552 )
								if( ad_mf <= -7.38538e+06 )
									ret := 0.103448
								if( ad_mf > -7.38538e+06 )
									ret := -0.348315
					if( ad_mf > -4.44788e+06 )
						if( ema13 <= -0.253469 )
							if( mf <= 0.213697 )
								if( ad <= -520842 )
									ret := -0.108586
								if( ad > -520842 )
									ret := 0.048438
							if( mf > 0.213697 )
								if( ema12 <= -0.591078 )
									ret := -0.769231 // sell
								if( ema12 > -0.591078 )
									ret := -0.289474
						if( ema13 > -0.253469 )
							if( ema12 <= 3.46721 )
								if( ad <= -3.93193e+06 )
									ret := 0.563218
								if( ad > -3.93193e+06 )
									ret := 0.017766
							if( ema12 > 3.46721 )
								ret := 0.666667
				if( ema3 > 237.807 )
					if( ad <= -116346 )
						if( ema13 <= 4.74184 )
							if( ad <= -221885 )
								if( ad <= -460917 )
									ret := -0.084574
								if( ad > -460917 )
									ret := -0.273550
							if( ad > -221885 )
								if( ad <= -117686 )
									ret := -0.014655
								if( ad > -117686 )
									ret := 0.583333
						if( ema13 > 4.74184 )
							if( ad_mf <= -644898 )
								if( ema1 <= 886.694 )
									ret := 0.048930
								if( ema1 > 886.694 )
									ret := -0.230769
							if( ad_mf > -644898 )
								if( ema3 <= 807.841 )
									ret := 0.387960
								if( ema3 > 807.841 )
									ret := -0.283019
					if( ad > -116346 )
						if( ema1 <= 395.39 )
							if( tema <= 309.808 )
								if( tema <= 297.685 )
									ret := -0.439024
								if( tema > 297.685 )
									ret := 0.312500
							if( tema > 309.808 )
								if( ema3 <= 365.545 )
									ret := -0.928571 // sell
								if( ema3 > 365.545 )
									ret := -0.529412
						if( ema1 > 395.39 )
							if( ema13 <= -3.6236 )
								ret := -0.500000
							if( ema13 > -3.6236 )
								if( ema3 <= 842.98 )
									ret := -0.119048
								if( ema3 > 842.98 )
									ret := 0.583333
	if( ad > -97958.2 )
		if( ema3 <= 383.581 )
			if( ad <= 1.61151e+06 )
				if( ad <= 1.31784e+06 )
					if( ema12 <= 3.29704 )
						if( ema3 <= 158.89 )
							if( ema1 <= 159.658 )
								if( ad <= -93605.3 )
									ret := 0.786667 // buy
								if( ad > -93605.3 )
									ret := 0.036079
							if( ema1 > 159.658 )
								if( ad_mf <= 16573.2 )
									ret := 0.731707 // buy
								if( ad_mf > 16573.2 )
									ret := 0.200000
						if( ema3 > 158.89 )
							if( ema1 <= 159.649 )
								if( ema1 <= 156.156 )
									ret := 0.433333
								if( ema1 > 156.156 )
									ret := -0.356436
							if( ema1 > 159.649 )
								if( mf <= -0.229749 )
									ret := 0.076215
								if( mf > -0.229749 )
									ret := -0.015679
					if( ema12 > 3.29704 )
						if( tema <= 309.225 )
							if( ad_mf <= -22795 )
								if( ad_mf <= -34664.2 )
									ret := -0.470588
								if( ad_mf > -34664.2 )
									ret := 0.727273 // buy
							if( ad_mf > -22795 )
								if( mf <= 0.190825 )
									ret := -0.807339 // sell
								if( mf > 0.190825 )
									ret := -0.488095
						if( tema > 309.225 )
							if( ad <= 472468 )
								if( ema12 <= 3.86336 )
									ret := 0.083333
								if( ema12 > 3.86336 )
									ret := 0.750000 // buy
							if( ad > 472468 )
								ret := -0.722222 // sell
				if( ad > 1.31784e+06 )
					if( ema13 <= -0.064948 )
						if( ad_mf <= 1.60374e+06 )
							if( mf <= 0.035442 )
								if( ema13 <= -5.5915 )
									ret := 0.818182 // buy
								if( ema13 > -5.5915 )
									ret := -0.365979
							if( mf > 0.035442 )
								if( tema <= 313.04 )
									ret := 0.278481
								if( tema > 313.04 )
									ret := -0.818182 // sell
						if( ad_mf > 1.60374e+06 )
							ret := 1.000000 // buy
					if( ema13 > -0.064948 )
						if( ema12 <= 2.11365 )
							if( ema1 <= 243.516 )
								if( ad_mf <= 1.53509e+06 )
									ret := 0.551237
								if( ad_mf > 1.53509e+06 )
									ret := 0.770000 // buy
							if( ema1 > 243.516 )
								if( ad <= 1.39818e+06 )
									ret := 0.690909
								if( ad > 1.39818e+06 )
									ret := -0.028571
						if( ema12 > 2.11365 )
							if( ema3 <= 277.961 )
								if( mf <= 0.371962 )
									ret := 0.631579
								if( mf > 0.371962 )
									ret := -0.320000
							if( ema3 > 277.961 )
								ret := -0.307692
			if( ad > 1.61151e+06 )
				if( ema12 <= 0.072073 )
					if( mf <= 0.463704 )
						if( ema3 <= 186.704 )
							if( mf <= -0.362919 )
								if( mf <= -0.443955 )
									ret := -0.454545
								if( mf > -0.443955 )
									ret := 0.240000
							if( mf > -0.362919 )
								if( ema12 <= -2.2218 )
									ret := 0.140351
								if( ema12 > -2.2218 )
									ret := -0.403093
						if( ema3 > 186.704 )
							if( ema3 <= 212.489 )
								if( ema12 <= -0.903082 )
									ret := -0.194805
								if( ema12 > -0.903082 )
									ret := 0.302083
							if( ema3 > 212.489 )
								if( ema2 <= 227.127 )
									ret := -0.480263
								if( ema2 > 227.127 )
									ret := -0.149742
					if( mf > 0.463704 )
						if( ad <= 3.94557e+06 )
							if( ad <= 2.6523e+06 )
								ret := -0.529412
							if( ad > 2.6523e+06 )
								ret := 0.090909
						if( ad > 3.94557e+06 )
							if( tema <= 246.391 )
								if( ema3 <= 160.194 )
									ret := 0.739130 // buy
								if( ema3 > 160.194 )
									ret := 0.153846
							if( tema > 246.391 )
								ret := 0.944444 // buy
				if( ema12 > 0.072073 )
					if( ema2 <= 104.97 )
						if( ad_mf <= 1.99386e+06 )
							if( ema1 <= 66.9075 )
								ret := -0.133333
							if( ema1 > 66.9075 )
								ret := -0.555556
						if( ad_mf > 1.99386e+06 )
							if( mf <= 0.346498 )
								if( ema12 <= 0.657073 )
									ret := 0.651163
								if( ema12 > 0.657073 )
									ret := -0.200000
							if( mf > 0.346498 )
								if( ema12 <= 1.14799 )
									ret := 1.000000 // buy
								if( ema12 > 1.14799 )
									ret := 0.722222 // buy
					if( ema2 > 104.97 )
						if( mf <= 0.060034 )
							if( ema13 <= 0.284996 )
								if( ema13 <= -0.150487 )
									ret := 0.000000
								if( ema13 > -0.150487 )
									ret := 0.790698 // buy
							if( ema13 > 0.284996 )
								if( ema2 <= 142.377 )
									ret := -0.198113
								if( ema2 > 142.377 )
									ret := 0.163043
						if( mf > 0.060034 )
							if( ema12 <= 2.2563 )
								if( ema3 <= 218.239 )
									ret := -0.016835
								if( ema3 > 218.239 )
									ret := -0.239193
							if( ema12 > 2.2563 )
								if( ad_mf <= 1.41721e+07 )
									ret := 0.363636
								if( ad_mf > 1.41721e+07 )
									ret := -1.000000 // sell
		if( ema3 > 383.581 )
			if( ad <= 2.22956e+06 )
				if( ema13 <= 1.74074 )
					if( mf <= 0.305036 )
						if( ad <= 84051.3 )
							if( ema13 <= -4.4615 )
								if( ad <= -10342.4 )
									ret := 0.468750
								if( ad > -10342.4 )
									ret := 0.129156
							if( ema13 > -4.4615 )
								if( ema12 <= 2.63246 )
									ret := 0.048605
								if( ema12 > 2.63246 )
									ret := -1.000000 // sell
						if( ad > 84051.3 )
							if( ad <= 127123 )
								if( ema12 <= -1.20871 )
									ret := -0.666667
								if( ema12 > -1.20871 )
									ret := -0.279330
							if( ad > 127123 )
								if( ema2 <= 1025.21 )
									ret := -0.037367
								if( ema2 > 1025.21 )
									ret := 0.703704 // buy
					if( mf > 0.305036 )
						if( ema2 <= 489.171 )
							if( tema <= 385.345 )
								ret := -1.000000 // sell
							if( tema > 385.345 )
								if( ad <= 2.00779e+06 )
									ret := 0.135514
								if( ad > 2.00779e+06 )
									ret := -0.583333
						if( ema2 > 489.171 )
							if( ad <= -74534.8 )
								ret := 0.750000 // buy
							if( ad > -74534.8 )
								if( ema13 <= 1.59686 )
									ret := -0.294118
								if( ema13 > 1.59686 )
									ret := -0.826087 // sell
				if( ema13 > 1.74074 )
					if( ema12 <= 0.949356 )
						if( ema13 <= 2.54643 )
							if( ema13 <= 1.8082 )
								if( ema1 <= 530.884 )
									ret := 0.818182 // buy
								if( ema1 > 530.884 )
									ret := 0.538462
							if( ema13 > 1.8082 )
								if( mf <= -0.20787 )
									ret := 0.800000 // buy
								if( mf > -0.20787 )
									ret := 0.157593
						if( ema13 > 2.54643 )
							if( ad_mf <= 425655 )
								if( ema1 <= 858.47 )
									ret := 0.714286 // buy
								if( ema1 > 858.47 )
									ret := 0.166667
							if( ad_mf > 425655 )
								ret := -0.181818
					if( ema12 > 0.949356 )
						if( mf <= 0.083934 )
							if( ad <= -1052.26 )
								if( ad <= -10551.9 )
									ret := 0.032895
								if( ad > -10551.9 )
									ret := 0.404372
							if( ad > -1052.26 )
								if( ema2 <= 494.82 )
									ret := 0.087121
								if( ema2 > 494.82 )
									ret := -0.111260
						if( mf > 0.083934 )
							if( ema2 <= 879.36 )
								if( ad <= -47731.2 )
									ret := -0.185185
								if( ad > -47731.2 )
									ret := 0.146554
							if( ema2 > 879.36 )
								if( ema3 <= 1202.56 )
									ret := -0.020528
								if( ema3 > 1202.56 )
									ret := -0.714286 // sell
			if( ad > 2.22956e+06 )
				if( ema13 <= -2.59609 )
					if( ema12 <= -2.20245 )
						if( tema <= 400.99 )
							ret := 0.545455
						if( tema > 400.99 )
							if( mf <= -0.186385 )
								if( ema12 <= -5.99811 )
									ret := 0.642857
								if( ema12 > -5.99811 )
									ret := 0.384615
							if( mf > -0.186385 )
								if( ema12 <= -7.38574 )
									ret := -1.000000 // sell
								if( ema12 > -7.38574 )
									ret := -0.121951
					if( ema12 > -2.20245 )
						if( mf <= 0.155242 )
							if( mf <= 0.022342 )
								if( ad <= 3.81243e+06 )
									ret := -0.600000
								if( ad > 3.81243e+06 )
									ret := -1.000000 // sell
							if( mf > 0.022342 )
								ret := -0.090909
						if( mf > 0.155242 )
							ret := -0.928571 // sell
				if( ema13 > -2.59609 )
					if( ema12 <= 10.2776 )
						if( ema1 <= 508.611 )
							if( mf <= 0.522233 )
								if( ema3 <= 489.435 )
									ret := 0.242105
								if( ema3 > 489.435 )
									ret := -0.483871
							if( mf > 0.522233 )
								if( ema12 <= 0.979185 )
									ret := -0.090909
								if( ema12 > 0.979185 )
									ret := 0.784314 // buy
						if( ema1 > 508.611 )
							if( ad_mf <= 5.45035e+06 )
								if( ema13 <= 8.89485 )
									ret := 0.646643
								if( ema13 > 8.89485 )
									ret := 0.303797
							if( ad_mf > 5.45035e+06 )
								if( tema <= 598.837 )
									ret := 0.928571 // buy
								if( tema > 598.837 )
									ret := -0.222222
					if( ema12 > 10.2776 )
						if( ema3 <= 774.75 )
							ret := -1.000000 // sell
						if( ema3 > 774.75 )
							ret := -0.500000
	
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
float op_operation = decision_tree_0_NVDA_30Min_0aed448f(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


