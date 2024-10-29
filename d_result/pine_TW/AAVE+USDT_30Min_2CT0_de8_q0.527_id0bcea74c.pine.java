//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: AAVEUSDT_30Min_2CT0_0bcea74c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_30Min_2CT0_0bcea74c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_30Min_0bcea74c(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( ad <= -1643.85 )
		if( ema3 <= 500.383 )
			if( ad_mf <= -7622.17 )
				if( ema12 <= -0.61521 )
					if( ema3 <= 94.6693 )
						if( ad_mf <= -9277.98 )
							if( ad_mf <= -9900.01 )
								if( tema <= 54.3191 )
									ret := -0.153846
								if( tema > 54.3191 )
									ret := 0.491803
							if( ad_mf > -9900.01 )
								ret := -0.454545
						if( ad_mf > -9277.98 )
							if( ema13 <= -1.28972 )
								if( ema3 <= 85.1041 )
									ret := 0.983333 // buy
								if( ema3 > 85.1041 )
									ret := 0.666667
							if( ema13 > -1.28972 )
								ret := 0.043478
					if( ema3 > 94.6693 )
						if( ema1 <= 93.4002 )
							ret := -0.681818
						if( ema1 > 93.4002 )
							if( ad_mf <= -10318.8 )
								if( ema3 <= 453.116 )
									ret := 0.473333
								if( ema3 > 453.116 )
									ret := -0.555556
							if( ad_mf > -10318.8 )
								if( ema2 <= 460.538 )
									ret := 0.126394
								if( ema2 > 460.538 )
									ret := 1.000000 // buy
				if( ema12 > -0.61521 )
					if( ema2 <= 118.2 )
						if( tema <= 113.89 )
							if( ema13 <= 5.45944 )
								if( ema13 <= 3.94745 )
									ret := 0.002964
								if( ema13 > 3.94745 )
									ret := 0.551020
							if( ema13 > 5.45944 )
								ret := -0.666667
						if( tema > 113.89 )
							if( tema <= 115.886 )
								if( ad <= -11435.2 )
									ret := -1.000000 // sell
								if( ad > -11435.2 )
									ret := -0.555556
							if( tema > 115.886 )
								if( ema2 <= 116.845 )
									ret := -0.050000
								if( ema2 > 116.845 )
									ret := -0.888889 // sell
					if( ema2 > 118.2 )
						if( ema2 <= 463.408 )
							if( ad_mf <= -19451.4 )
								if( mf <= 0.110336 )
									ret := 0.096774
								if( mf > 0.110336 )
									ret := -0.708333 // sell
							if( ad_mf > -19451.4 )
								if( mf <= -0.104406 )
									ret := 0.000000
								if( mf > -0.104406 )
									ret := 0.426540
						if( ema2 > 463.408 )
							ret := -0.681818
			if( ad_mf > -7622.17 )
				if( ema12 <= -0.140376 )
					if( ema1 <= 106.578 )
						if( ad <= -5933.61 )
							if( ad_mf <= -6526.39 )
								if( tema <= 58.7437 )
									ret := -0.333333
								if( tema > 58.7437 )
									ret := 0.402685
							if( ad_mf > -6526.39 )
								if( ad <= -6230.25 )
									ret := 0.868421 // buy
								if( ad > -6230.25 )
									ret := 0.520000
						if( ad > -5933.61 )
							if( ema13 <= -4.91981 )
								ret := -0.846154 // sell
							if( ema13 > -4.91981 )
								if( ad <= -1683.21 )
									ret := 0.139476
								if( ad > -1683.21 )
									ret := 0.660714
					if( ema1 > 106.578 )
						if( ad_mf <= -2280.31 )
							if( ema1 <= 204.606 )
								if( ema3 <= 163.156 )
									ret := 0.002198
								if( ema3 > 163.156 )
									ret := -0.246612
							if( ema1 > 204.606 )
								if( ad_mf <= -2909.6 )
									ret := 0.200318
								if( ad_mf > -2909.6 )
									ret := -0.050562
						if( ad_mf > -2280.31 )
							if( ema2 <= 265.877 )
								if( ema12 <= -1.35772 )
									ret := 0.607527
								if( ema12 > -1.35772 )
									ret := 0.187500
							if( ema2 > 265.877 )
								if( mf <= 0.017857 )
									ret := -0.074074
								if( mf > 0.017857 )
									ret := 0.341463
				if( ema12 > -0.140376 )
					if( ad_mf <= -5346.12 )
						if( ema2 <= 345.462 )
							if( tema <= 84.2361 )
								if( ad_mf <= -7431.74 )
									ret := -0.800000 // sell
								if( ad_mf > -7431.74 )
									ret := 0.050909
							if( tema > 84.2361 )
								if( ad_mf <= -6463.09 )
									ret := -0.070485
								if( ad_mf > -6463.09 )
									ret := -0.397333
						if( ema2 > 345.462 )
							if( ad_mf <= -6736.06 )
								if( ema3 <= 385.214 )
									ret := 0.727273 // buy
								if( ema3 > 385.214 )
									ret := -0.785714 // sell
							if( ad_mf > -6736.06 )
								if( mf <= 0.182273 )
									ret := 0.602941
								if( mf > 0.182273 )
									ret := -0.200000
					if( ad_mf > -5346.12 )
						if( tema <= 56.7548 )
							if( ema13 <= 1.67392 )
								if( ad <= -2754.94 )
									ret := 0.611940
								if( ad > -2754.94 )
									ret := 0.281250
							if( ema13 > 1.67392 )
								ret := -0.538462
						if( tema > 56.7548 )
							if( ema13 <= 0.251437 )
								if( mf <= -0.248972 )
									ret := -0.542373
								if( mf > -0.248972 )
									ret := 0.036426
							if( ema13 > 0.251437 )
								if( ema13 <= 0.538188 )
									ret := 0.245310
								if( ema13 > 0.538188 )
									ret := 0.067903
		if( ema3 > 500.383 )
			if( ad_mf <= -9697.84 )
				if( ema12 <= -11.3113 )
					ret := 0.384615
				if( ema12 > -11.3113 )
					if( ema2 <= 584.508 )
						ret := -1.000000 // sell
					if( ema2 > 584.508 )
						ret := -0.833333 // sell
			if( ad_mf > -9697.84 )
				if( ad_mf <= -5677.13 )
					if( ema2 <= 574.073 )
						if( mf <= 0.055988 )
							if( ema2 <= 515.174 )
								ret := 0.400000
							if( ema2 > 515.174 )
								ret := 1.000000 // buy
						if( mf > 0.055988 )
							ret := -0.083333
					if( ema2 > 574.073 )
						ret := -0.588235
				if( ad_mf > -5677.13 )
					if( ad_mf <= -2761.15 )
						if( ema12 <= 9.72834 )
							if( ema3 <= 516.475 )
								if( tema <= 488.313 )
									ret := -0.750000 // sell
								if( tema > 488.313 )
									ret := -1.000000 // sell
							if( ema3 > 516.475 )
								if( ema13 <= -10.771 )
									ret := 0.120000
								if( ema13 > -10.771 )
									ret := -0.641791
						if( ema12 > 9.72834 )
							ret := 0.714286 // buy
					if( ad_mf > -2761.15 )
						if( ema13 <= 8.31465 )
							if( ema13 <= -3.13275 )
								ret := -0.200000
							if( ema13 > -3.13275 )
								if( ad <= -2312.59 )
									ret := 0.555556
								if( ad > -2312.59 )
									ret := 0.933333 // buy
						if( ema13 > 8.31465 )
							ret := -0.571429
	if( ad > -1643.85 )
		if( ema3 <= 87.5995 )
			if( ema12 <= 1.43437 )
				if( ad_mf <= 3002.94 )
					if( ema13 <= -1.22039 )
						if( mf <= -0.065671 )
							if( mf <= -0.253172 )
								if( ema12 <= -1.01923 )
									ret := 0.340426
								if( ema12 > -1.01923 )
									ret := -0.300000
							if( mf > -0.253172 )
								if( tema <= 41.5061 )
									ret := 0.857143 // buy
								if( tema > 41.5061 )
									ret := 0.163265
						if( mf > -0.065671 )
							if( ema1 <= 79.1741 )
								if( ema3 <= 57.2793 )
									ret := -0.200000
								if( ema3 > 57.2793 )
									ret := 0.595238
							if( ema1 > 79.1741 )
								if( ad <= -444.794 )
									ret := -0.206897
								if( ad > -444.794 )
									ret := 0.396825
					if( ema13 > -1.22039 )
						if( ad_mf <= 2978.35 )
							if( ema13 <= 0.032184 )
								if( ema12 <= -0.803325 )
									ret := -0.600000
								if( ema12 > -0.803325 )
									ret := 0.026879
							if( ema13 > 0.032184 )
								if( ad_mf <= 2781.81 )
									ret := 0.087509
								if( ad_mf > 2781.81 )
									ret := -0.264706
						if( ad_mf > 2978.35 )
							ret := -0.807692 // sell
				if( ad_mf > 3002.94 )
					if( ema1 <= 64.7981 )
						if( ad <= 8369.1 )
							if( ad_mf <= 3178.01 )
								if( tema <= 45.1452 )
									ret := 0.090909
								if( tema > 45.1452 )
									ret := 0.774648 // buy
							if( ad_mf > 3178.01 )
								if( tema <= 63.8246 )
									ret := 0.330254
								if( tema > 63.8246 )
									ret := 0.613333
						if( ad > 8369.1 )
							if( ad <= 8893.66 )
								if( ema12 <= 0.141814 )
									ret := -0.615385
								if( ema12 > 0.141814 )
									ret := -1.000000 // sell
							if( ad > 8893.66 )
								if( ema13 <= -0.711527 )
									ret := 0.573171
								if( ema13 > -0.711527 )
									ret := 0.006579
					if( ema1 > 64.7981 )
						if( ad_mf <= 19025.5 )
							if( ad <= 13179.5 )
								if( ad <= 10959 )
									ret := 0.147576
								if( ad > 10959 )
									ret := -0.320513
							if( ad > 13179.5 )
								if( ema3 <= 68.1814 )
									ret := -0.100000
								if( ema3 > 68.1814 )
									ret := 0.540373
						if( ad_mf > 19025.5 )
							if( mf <= -0.02118 )
								ret := -0.933333 // sell
							if( mf > -0.02118 )
								if( mf <= 0.097053 )
									ret := 1.000000 // buy
								if( mf > 0.097053 )
									ret := -0.414634
			if( ema12 > 1.43437 )
				if( ad <= 3287.74 )
					if( mf <= 0.239829 )
						if( mf <= 0.073208 )
							ret := 0.666667
						if( mf > 0.073208 )
							if( mf <= 0.125482 )
								ret := -0.727273 // sell
							if( mf > 0.125482 )
								if( ad_mf <= -120.902 )
									ret := 0.437500
								if( ad_mf > -120.902 )
									ret := -0.312500
					if( mf > 0.239829 )
						if( ema13 <= 2.83048 )
							ret := 0.111111
						if( ema13 > 2.83048 )
							if( ad_mf <= 1195.51 )
								ret := 0.181818
							if( ad_mf > 1195.51 )
								ret := 0.823529 // buy
				if( ad > 3287.74 )
					if( ad_mf <= 14884.8 )
						if( tema <= 83.2929 )
							if( ad <= 5121.11 )
								if( ad_mf <= 3944.37 )
									ret := -0.615385
								if( ad_mf > 3944.37 )
									ret := 0.222222
							if( ad > 5121.11 )
								if( ema13 <= 2.62888 )
									ret := -0.400000
								if( ema13 > 2.62888 )
									ret := -0.984375 // sell
						if( tema > 83.2929 )
							if( ema1 <= 82.8996 )
								ret := 0.400000
							if( ema1 > 82.8996 )
								if( ema13 <= 5.26158 )
									ret := -0.363636
								if( ema13 > 5.26158 )
									ret := -1.000000 // sell
					if( ad_mf > 14884.8 )
						if( ad <= 16561.5 )
							ret := 0.764706 // buy
						if( ad > 16561.5 )
							if( ema12 <= 1.84203 )
								if( ema13 <= 2.53486 )
									ret := -1.000000 // sell
								if( ema13 > 2.53486 )
									ret := -0.800000 // sell
							if( ema12 > 1.84203 )
								ret := 0.000000
		if( ema3 > 87.5995 )
			if( ad <= 7149.69 )
				if( ad <= 5266.2 )
					if( mf <= 0.19863 )
						if( ema1 <= 397.5 )
							if( ad_mf <= 4653.54 )
								if( tema <= 397.504 )
									ret := 0.021574
								if( tema > 397.504 )
									ret := 0.538462
							if( ad_mf > 4653.54 )
								if( ema12 <= -0.708794 )
									ret := 0.603053
								if( ema12 > -0.708794 )
									ret := 0.109091
						if( ema1 > 397.5 )
							if( mf <= -0.084341 )
								if( mf <= -0.103988 )
									ret := 0.036496
								if( mf > -0.103988 )
									ret := 0.408696
							if( mf > -0.084341 )
								if( mf <= 0.159077 )
									ret := -0.150812
								if( mf > 0.159077 )
									ret := 0.200000
					if( mf > 0.19863 )
						if( ema1 <= 225.523 )
							if( ema2 <= 178.384 )
								if( ad_mf <= 5149.56 )
									ret := -0.092084
								if( ad_mf > 5149.56 )
									ret := 0.750000 // buy
							if( ema2 > 178.384 )
								if( ema12 <= 3.98979 )
									ret := -0.444444
								if( ema12 > 3.98979 )
									ret := 0.368421
						if( ema1 > 225.523 )
							if( mf <= 0.199482 )
								ret := -0.750000 // sell
							if( mf > 0.199482 )
								if( ema3 <= 311.707 )
									ret := 0.128391
								if( ema3 > 311.707 )
									ret := -0.064370
				if( ad > 5266.2 )
					if( tema <= 492.358 )
						if( ema13 <= 6.53115 )
							if( mf <= -0.002186 )
								if( ad <= 6505.63 )
									ret := -0.531469
								if( ad > 6505.63 )
									ret := 0.081081
							if( mf > -0.002186 )
								if( ad <= 7056.52 )
									ret := -0.090580
								if( ad > 7056.52 )
									ret := -0.648148
						if( ema13 > 6.53115 )
							if( ema1 <= 415.346 )
								if( mf <= 0.274088 )
									ret := 0.759036 // buy
								if( mf > 0.274088 )
									ret := 0.073171
							if( ema1 > 415.346 )
								if( ad <= 6375.66 )
									ret := -0.870968 // sell
								if( ad > 6375.66 )
									ret := 0.647059
					if( tema > 492.358 )
						if( ad <= 6923.88 )
							if( ema13 <= -6.56323 )
								ret := -0.818182 // sell
							if( ema13 > -6.56323 )
								if( ad_mf <= 6524.45 )
									ret := -1.000000 // sell
								if( ad_mf > 6524.45 )
									ret := -0.888889 // sell
						if( ad > 6923.88 )
							ret := -0.428571
			if( ad > 7149.69 )
				if( ema13 <= 19.1128 )
					if( ema2 <= 212.601 )
						if( tema <= 102.223 )
							if( ema3 <= 96.1825 )
								if( ad <= 7641.39 )
									ret := 0.666667
								if( ad > 7641.39 )
									ret := -0.009346
							if( ema3 > 96.1825 )
								if( ad <= 21189.4 )
									ret := 0.568493
								if( ad > 21189.4 )
									ret := -0.400000
						if( tema > 102.223 )
							if( ema13 <= 3.4249 )
								if( ad_mf <= 21411.8 )
									ret := 0.048246
								if( ad_mf > 21411.8 )
									ret := -0.361111
							if( ema13 > 3.4249 )
								if( ad_mf <= 18539.5 )
									ret := -0.419118
								if( ad_mf > 18539.5 )
									ret := 0.019608
					if( ema2 > 212.601 )
						if( mf <= -0.150393 )
							ret := -0.857143 // sell
						if( mf > -0.150393 )
							if( ad <= 36308 )
								if( ema1 <= 591.807 )
									ret := 0.303712
								if( ema1 > 591.807 )
									ret := -0.833333 // sell
							if( ad > 36308 )
								if( ad <= 46898.9 )
									ret := 0.875000 // buy
								if( ad > 46898.9 )
									ret := 1.000000 // buy
				if( ema13 > 19.1128 )
					if( ema3 <= 444.799 )
						if( ad <= 12630.5 )
							ret := -0.437500
						if( ad > 12630.5 )
							if( ema13 <= 26.919 )
								ret := -1.000000 // sell
							if( ema13 > 26.919 )
								ret := -0.888889 // sell
					if( ema3 > 444.799 )
						if( ema13 <= 25.3307 )
							ret := 0.117647
						if( ema13 > 25.3307 )
							ret := -0.444444
	
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
float op_operation = decision_tree_0_AAVEUSDT_30Min_0bcea74c(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)

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


