//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: BABA_1Hour_2CT0_d714ccf3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BABA_1Hour_2CT0_d714ccf3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BABA_1Hour_d714ccf3(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ad <= -163855 )
		if( ema13 <= 1.57036 )
			if( ad_mf <= -207443 )
				if( ema13 <= -6.98745 )
					if( ema12 <= -6.5557 )
						ret := -0.066667
					if( ema12 > -6.5557 )
						ret := -0.789474 // sell
				if( ema13 > -6.98745 )
					if( ad_mf <= -1.82085e+06 )
						if( mf <= 0.100643 )
							ret := 0.127759
						if( mf > 0.100643 )
							ret := -0.226667
					if( ad_mf > -1.82085e+06 )
						if( ad <= -1.13347e+06 )
							ret := -0.120000
						if( ad > -1.13347e+06 )
							ret := 0.053732
			if( ad_mf > -207443 )
				if( ad_mf <= -184020 )
					if( ema3 <= 90.242 )
						if( ad_mf <= -196700 )
							ret := -0.315789
						if( ad_mf > -196700 )
							ret := 0.615385
					if( ema3 > 90.242 )
						if( mf <= 0.054353 )
							ret := 0.786667 // buy
						if( mf > 0.054353 )
							ret := 0.270270
				if( ad_mf > -184020 )
					if( ema13 <= -1.47098 )
						if( mf <= -0.095371 )
							ret := -0.083333
						if( mf > -0.095371 )
							ret := -0.818182 // sell
					if( ema13 > -1.47098 )
						if( ad <= -177019 )
							ret := -0.260870
						if( ad > -177019 )
							ret := 0.525424
		if( ema13 > 1.57036 )
			if( ema2 <= 134.711 )
				if( ema13 <= 1.71094 )
					if( ad_mf <= -1.53103e+06 )
						ret := 0.352941
					if( ad_mf > -1.53103e+06 )
						ret := 0.809524 // buy
				if( ema13 > 1.71094 )
					if( ema1 <= 92.3075 )
						if( ad_mf <= -272316 )
							ret := 0.472973
						if( ad_mf > -272316 )
							ret := -0.277778
					if( ema1 > 92.3075 )
						if( mf <= -0.050787 )
							ret := -0.613636
						if( mf > -0.050787 )
							ret := 0.004854
			if( ema2 > 134.711 )
				if( ema3 <= 145.23 )
					if( mf <= 0.265351 )
						if( ema3 <= 141.658 )
							ret := 1.000000 // buy
						if( ema3 > 141.658 )
							ret := 0.533333
					if( mf > 0.265351 )
						ret := 0.454545
				if( ema3 > 145.23 )
					if( ad_mf <= -846551 )
						if( mf <= -0.107065 )
							ret := -0.040000
						if( mf > -0.107065 )
							ret := 0.466926
					if( ad_mf > -846551 )
						if( mf <= -0.032043 )
							ret := 0.666667
						if( mf > -0.032043 )
							ret := 0.087629
	if( ad > -163855 )
		if( ema3 <= 85.6095 )
			if( ema13 <= -0.015089 )
				if( ema2 <= 66.3273 )
					if( ad_mf <= -37904.1 )
						ret := 0.913043 // buy
					if( ad_mf > -37904.1 )
						if( mf <= -0.092367 )
							ret := 0.142857
						if( mf > -0.092367 )
							ret := 0.750000 // buy
				if( ema2 > 66.3273 )
					if( ema1 <= 83.749 )
						if( ema12 <= 0.121243 )
							ret := -0.047445
						if( ema12 > 0.121243 )
							ret := 0.833333 // buy
					if( ema1 > 83.749 )
						if( tema <= 83.5055 )
							ret := 0.920000 // buy
						if( tema > 83.5055 )
							ret := 0.105023
			if( ema13 > -0.015089 )
				if( mf <= -0.174993 )
					if( ema1 <= 82.0927 )
						if( ad <= 30509.7 )
							ret := -0.645161
						if( ad > 30509.7 )
							ret := -0.117647
					if( ema1 > 82.0927 )
						if( ema12 <= 0.248442 )
							ret := 0.076923
						if( ema12 > 0.248442 )
							ret := 0.818182 // buy
				if( mf > -0.174993 )
					if( mf <= 0.244325 )
						if( ad <= 2.2178e+06 )
							ret := 0.171605
						if( ad > 2.2178e+06 )
							ret := 0.571429
					if( mf > 0.244325 )
						if( ema3 <= 83.6852 )
							ret := -0.084577
						if( ema3 > 83.6852 )
							ret := 0.306667
		if( ema3 > 85.6095 )
			if( ema12 <= 0.566978 )
				if( ad <= 8654.31 )
					if( ad <= 3636.38 )
						if( ema1 <= 99.3444 )
							ret := -0.145357
						if( ema1 > 99.3444 )
							ret := -0.020680
					if( ad > 3636.38 )
						if( ema2 <= 190.468 )
							ret := 0.027957
						if( ema2 > 190.468 )
							ret := 0.314516
				if( ad > 8654.31 )
					if( ad_mf <= 8818.92 )
						if( ad <= 8731.53 )
							ret := -0.588235
						if( ad > 8731.53 )
							ret := -0.976190 // sell
					if( ad_mf > 8818.92 )
						if( mf <= -0.239513 )
							ret := -0.290323
						if( mf > -0.239513 )
							ret := -0.087568
			if( ema12 > 0.566978 )
				if( ad_mf <= -10946.8 )
					if( ema12 <= 0.687724 )
						if( ema1 <= 180.181 )
							ret := 0.269231
						if( ema1 > 180.181 )
							ret := -0.189189
					if( ema12 > 0.687724 )
						if( ema3 <= 95.3478 )
							ret := -0.703125 // sell
						if( ema3 > 95.3478 )
							ret := -0.229042
				if( ad_mf > -10946.8 )
					if( ad_mf <= 7.35589e+06 )
						if( ad_mf <= 6.09228e+06 )
							ret := 0.082964
						if( ad_mf > 6.09228e+06 )
							ret := -0.688889
					if( ad_mf > 7.35589e+06 )
						if( ema3 <= 97.3679 )
							ret := 1.000000 // buy
						if( ema3 > 97.3679 )
							ret := 0.357143
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_BABA_1Hour_d714ccf3(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)

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


