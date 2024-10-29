//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow
// ID_model: AFRM_1Min_1C00_768e28ff Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_1C00_768e28ff", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_768e28ff(ad, mf, ad_mf)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad <= 11.5151 )
		if( mf <= 0.448598 )
			if( ad_mf <= -8179.73 )
				if( ad <= -24327.3 )
					if( ad_mf <= -27220.6 )
						if( mf <= -0.048776 )
							if( ad <= -27626.6 )
								if( ad_mf <= -51755.3 )
									ret := 0.171937
								if( ad_mf > -51755.3 )
									ret := 0.034075
							if( ad > -27626.6 )
								if( ad <= -27472.3 )
									ret := -0.888889 // sell
								if( ad > -27472.3 )
									ret := -0.100000
						if( mf > -0.048776 )
							if( ad <= -27347 )
								if( ad <= -34789.2 )
									ret := -0.047699
								if( ad > -34789.2 )
									ret := 0.087886
							if( ad > -27347 )
								ret := -1.000000 // sell
					if( ad_mf > -27220.6 )
						if( mf <= -0.167988 )
							if( ad <= -26813.1 )
								if( mf <= -0.247109 )
									ret := 0.933333 // buy
								if( mf > -0.247109 )
									ret := 0.181818
							if( ad > -26813.1 )
								if( ad <= -24743.6 )
									ret := -0.446809
								if( ad > -24743.6 )
									ret := 0.478261
						if( mf > -0.167988 )
							if( ad <= -25920.7 )
								if( mf <= 0.146916 )
									ret := 0.221719
								if( mf > 0.146916 )
									ret := 0.787234 // buy
							if( ad > -25920.7 )
								if( ad_mf <= -24943.5 )
									ret := 0.715976 // buy
								if( ad_mf > -24943.5 )
									ret := 0.339130
				if( ad > -24327.3 )
					if( ad_mf <= -22843.3 )
						if( ad_mf <= -23408.1 )
							if( ad <= -23652.9 )
								if( mf <= -0.186247 )
									ret := 0.026316
								if( mf > -0.186247 )
									ret := -0.373239
							if( ad > -23652.9 )
								if( mf <= -0.074157 )
									ret := 0.818182 // buy
								if( mf > -0.074157 )
									ret := 0.115385
						if( ad_mf > -23408.1 )
							if( mf <= -0.073282 )
								if( mf <= -0.100112 )
									ret := -0.528302
								if( mf > -0.100112 )
									ret := -0.916667 // sell
							if( mf > -0.073282 )
								if( mf <= -0.037454 )
									ret := 0.083333
								if( mf > -0.037454 )
									ret := -0.440678
					if( ad_mf > -22843.3 )
						if( ad <= -8309.81 )
							if( ad <= -8345.35 )
								if( mf <= -0.065638 )
									ret := 0.002208
								if( mf > -0.065638 )
									ret := -0.056783
							if( ad > -8345.35 )
								if( ad <= -8340.86 )
									ret := 0.800000 // buy
								if( ad > -8340.86 )
									ret := 0.621622
						if( ad > -8309.81 )
							if( ad <= -8274.92 )
								if( ad_mf <= -8296.12 )
									ret := -0.357143
								if( ad_mf > -8296.12 )
									ret := -0.840580 // sell
							if( ad > -8274.92 )
								if( ad_mf <= -8254.99 )
									ret := 0.666667
								if( ad_mf > -8254.99 )
									ret := -0.510417
			if( ad_mf > -8179.73 )
				if( ad_mf <= -0.191441 )
					if( ad_mf <= -0.194163 )
						if( ad <= -831.217 )
							if( ad <= -8152.93 )
								if( ad_mf <= -8154.6 )
									ret := 0.846154 // buy
								if( ad_mf > -8154.6 )
									ret := 1.000000 // buy
							if( ad > -8152.93 )
								if( mf <= 0.337989 )
									ret := 0.034868
								if( mf > 0.337989 )
									ret := 0.167702
						if( ad > -831.217 )
							if( ad_mf <= -792.595 )
								if( ad <= -793.93 )
									ret := 0.478261
								if( ad > -793.93 )
									ret := 1.000000 // buy
							if( ad_mf > -792.595 )
								if( ad_mf <= -787.432 )
									ret := -0.631579
								if( ad_mf > -787.432 )
									ret := 0.106305
					if( ad_mf > -0.194163 )
						if( mf <= 0.192445 )
							ret := 0.600000
						if( mf > 0.192445 )
							if( mf <= 0.192991 )
								ret := 1.000000 // buy
							if( mf > 0.192991 )
								if( ad_mf <= -0.193188 )
									ret := 0.939394 // buy
								if( ad_mf > -0.193188 )
									ret := 0.600000
				if( ad_mf > -0.191441 )
					if( ad_mf <= 0.064015 )
						if( mf <= 0.189842 )
							if( ad_mf <= -0.186914 )
								if( mf <= 0.188098 )
									ret := 0.740741 // buy
								if( mf > 0.188098 )
									ret := 0.315789
							if( ad_mf > -0.186914 )
								if( mf <= 0.181699 )
									ret := -0.044038
								if( mf > 0.181699 )
									ret := -0.587156
						if( mf > 0.189842 )
							if( mf <= 0.190627 )
								if( mf <= 0.190094 )
									ret := -1.000000 // sell
								if( mf > 0.190094 )
									ret := -0.695652
							if( mf > 0.190627 )
								ret := -0.304348
					if( ad_mf > 0.064015 )
						if( mf <= -0.138898 )
							if( ad_mf <= 0.144041 )
								if( ad_mf <= 0.142025 )
									ret := -0.234043
								if( ad_mf > 0.142025 )
									ret := -0.830508 // sell
							if( ad_mf > 0.144041 )
								if( mf <= -0.333611 )
									ret := 0.119152
								if( mf > -0.333611 )
									ret := -0.025621
						if( mf > -0.138898 )
							if( ad <= 1.93591 )
								if( ad_mf <= 0.138152 )
									ret := 0.132785
								if( ad_mf > 0.138152 )
									ret := 0.868421 // buy
							if( ad > 1.93591 )
								ret := 0.666667
		if( mf > 0.448598 )
			if( mf <= 0.503198 )
				if( ad_mf <= -653.381 )
					if( ad <= -2571.6 )
						if( ad_mf <= -3543.8 )
							if( mf <= 0.457971 )
								ret := 0.266667
							if( mf > 0.457971 )
								if( mf <= 0.466328 )
									ret := -0.250000
								if( mf > 0.466328 )
									ret := 0.178571
						if( ad_mf > -3543.8 )
							ret := -0.625000
					if( ad > -2571.6 )
						if( ad <= -1786.5 )
							ret := 0.583333
						if( ad > -1786.5 )
							if( ad_mf <= -800.01 )
								if( mf <= 0.478682 )
									ret := -0.115385
								if( mf > 0.478682 )
									ret := 0.500000
							if( ad_mf > -800.01 )
								ret := 0.600000
				if( ad_mf > -653.381 )
					if( ad_mf <= -0.455391 )
						if( ad <= -353.5 )
							ret := -0.777778 // sell
						if( ad > -353.5 )
							if( ad_mf <= -0.467635 )
								if( ad <= -13.8531 )
									ret := 0.222222
								if( ad > -13.8531 )
									ret := -0.449541
							if( ad_mf > -0.467635 )
								if( ad_mf <= -0.456376 )
									ret := -0.014706
								if( ad_mf > -0.456376 )
									ret := 0.615385
					if( ad_mf > -0.455391 )
						if( mf <= 0.449578 )
							ret := -1.000000 // sell
						if( mf > 0.449578 )
							if( mf <= 0.452775 )
								ret := -0.375000
							if( mf > 0.452775 )
								ret := -0.750000 // sell
			if( mf > 0.503198 )
				if( mf <= 0.505665 )
					if( ad_mf <= -0.504532 )
						ret := 0.678571
					if( ad_mf > -0.504532 )
						ret := 0.272727
				if( mf > 0.505665 )
					if( mf <= 0.506246 )
						ret := -0.833333 // sell
					if( mf > 0.506246 )
						if( ad <= -20090.1 )
							ret := 0.777778 // buy
						if( ad > -20090.1 )
							if( mf <= 0.516374 )
								ret := 0.545455
							if( mf > 0.516374 )
								if( mf <= 0.575579 )
									ret := -0.240000
								if( mf > 0.575579 )
									ret := 0.018182
	if( ad > 11.5151 )
		if( mf <= -0.271621 )
			if( ad <= 39229.2 )
				if( ad <= 6004.63 )
					if( ad <= 5522.69 )
						if( ad <= 5364.82 )
							if( ad_mf <= 1870.67 )
								if( mf <= -0.324493 )
									ret := -0.333333
								if( mf > -0.324493 )
									ret := -0.072539
							if( ad_mf > 1870.67 )
								if( mf <= -0.317745 )
									ret := -0.045455
								if( mf > -0.317745 )
									ret := -0.295238
						if( ad > 5364.82 )
							ret := 0.473684
					if( ad > 5522.69 )
						if( mf <= -0.354691 )
							ret := -0.937500 // sell
						if( mf > -0.354691 )
							if( mf <= -0.319742 )
								ret := -0.416667
							if( mf > -0.319742 )
								ret := -0.684211
				if( ad > 6004.63 )
					if( ad_mf <= 6647.21 )
						if( ad <= 6423.18 )
							if( ad <= 6338.86 )
								ret := 0.625000
							if( ad > 6338.86 )
								ret := 0.944444 // buy
						if( ad > 6423.18 )
							if( ad_mf <= 6623.09 )
								ret := 0.100000
							if( ad_mf > 6623.09 )
								ret := 0.727273 // buy
					if( ad_mf > 6647.21 )
						if( mf <= -0.32078 )
							if( ad <= 7248.06 )
								ret := -0.909091 // sell
							if( ad > 7248.06 )
								if( ad <= 10075.1 )
									ret := 0.407895
								if( ad > 10075.1 )
									ret := 0.006098
						if( mf > -0.32078 )
							if( ad_mf <= 7236.81 )
								ret := -0.666667
							if( ad_mf > 7236.81 )
								if( ad_mf <= 13561 )
									ret := 0.142857
								if( ad_mf > 13561 )
									ret := -0.276596
			if( ad > 39229.2 )
				if( ad <= 51792.2 )
					ret := -0.692308
				if( ad > 51792.2 )
					if( mf <= -0.34041 )
						ret := -0.727273 // sell
					if( mf > -0.34041 )
						ret := -1.000000 // sell
		if( mf > -0.271621 )
			if( mf <= 0.250768 )
				if( ad <= 2042.43 )
					if( ad_mf <= 2014.61 )
						if( mf <= -0.269833 )
							ret := 0.777778 // buy
						if( mf > -0.269833 )
							if( ad_mf <= 629.61 )
								if( mf <= 0.225266 )
									ret := -0.023331
								if( mf > 0.225266 )
									ret := -0.390625
							if( ad_mf > 629.61 )
								if( ad_mf <= 1862.23 )
									ret := -0.166536
								if( ad_mf > 1862.23 )
									ret := 0.013089
					if( ad_mf > 2014.61 )
						if( mf <= 0.120233 )
							if( ad <= 2033.18 )
								if( mf <= 0.027306 )
									ret := -0.730769 // sell
								if( mf > 0.027306 )
									ret := -0.444444
							if( ad > 2033.18 )
								if( ad_mf <= 2035.84 )
									ret := -1.000000 // sell
								if( ad_mf > 2035.84 )
									ret := -0.833333 // sell
						if( mf > 0.120233 )
							if( ad_mf <= 2034.09 )
								ret := 0.111111
							if( ad_mf > 2034.09 )
								ret := -0.285714
				if( ad > 2042.43 )
					if( mf <= -0.028427 )
						if( ad_mf <= 2119.52 )
							if( mf <= -0.08403 )
								if( ad_mf <= 2064.53 )
									ret := 0.764706 // buy
								if( ad_mf > 2064.53 )
									ret := 0.127273
							if( mf > -0.08403 )
								if( ad_mf <= 2075.06 )
									ret := -0.181818
								if( ad_mf > 2075.06 )
									ret := 0.722222 // buy
						if( ad_mf > 2119.52 )
							if( ad <= 5297.22 )
								if( ad <= 3374.12 )
									ret := 0.080851
								if( ad > 3374.12 )
									ret := -0.104029
							if( ad > 5297.22 )
								if( ad_mf <= 5495.05 )
									ret := 0.381720
								if( ad_mf > 5495.05 )
									ret := 0.049735
					if( mf > -0.028427 )
						if( ad_mf <= 144023 )
							if( ad_mf <= 67006.5 )
								if( ad <= 54843.7 )
									ret := -0.011495
								if( ad > 54843.7 )
									ret := 0.310345
							if( ad_mf > 67006.5 )
								if( ad_mf <= 71786.7 )
									ret := -0.707317 // sell
								if( ad_mf > 71786.7 )
									ret := -0.226950
						if( ad_mf > 144023 )
							if( mf <= 0.135038 )
								if( ad_mf <= 185352 )
									ret := 0.764706 // buy
								if( ad_mf > 185352 )
									ret := 1.000000 // buy
							if( mf > 0.135038 )
								if( mf <= 0.151998 )
									ret := -0.090909
								if( mf > 0.151998 )
									ret := 0.368421
			if( mf > 0.250768 )
				if( ad_mf <= 338981 )
					if( ad <= 1147.5 )
						if( ad_mf <= 350.189 )
							if( mf <= 0.290961 )
								if( ad_mf <= 212.958 )
									ret := 0.066667
								if( ad_mf > 212.958 )
									ret := -0.538462
							if( mf > 0.290961 )
								if( ad <= 298.785 )
									ret := 0.081967
								if( ad > 298.785 )
									ret := 0.652174
						if( ad_mf > 350.189 )
							if( ad <= 1043.01 )
								if( mf <= 0.25976 )
									ret := -0.545455
								if( mf > 0.25976 )
									ret := -0.206818
							if( ad > 1043.01 )
								if( ad <= 1056.66 )
									ret := -0.941176 // sell
								if( ad > 1056.66 )
									ret := -0.418919
					if( ad > 1147.5 )
						if( ad_mf <= 1193.65 )
							if( mf <= 0.411487 )
								ret := 0.916667 // buy
							if( mf > 0.411487 )
								ret := 0.642857
						if( ad_mf > 1193.65 )
							if( ad_mf <= 1288.45 )
								if( ad_mf <= 1222.74 )
									ret := -0.739130 // sell
								if( ad_mf > 1222.74 )
									ret := -0.318182
							if( ad_mf > 1288.45 )
								if( ad <= 7533.57 )
									ret := 0.003910
								if( ad > 7533.57 )
									ret := -0.104587
				if( ad_mf > 338981 )
					if( mf <= 0.359232 )
						ret := -1.000000 // sell
					if( mf > 0.359232 )
						if( ad <= 526557 )
							ret := -1.000000 // sell
						if( ad > 526557 )
							ret := -0.200000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_AFRM_1Min_768e28ff(ad, mf, ad_mf)

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


