//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: PINS_1Hour_2CT0_eee6224c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_1Hour_2CT0_eee6224c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_1Hour_eee6224c(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ad_mf <= -0.296134 )
		if( ad <= -24980.5 )
			if( tema <= 24.9416 )
				if( ema13 <= 1.35178 )
					if( ema12 <= 0.201063 )
						if( tema <= 24.7425 )
							ret := 0.069231
						if( tema > 24.7425 )
							ret := 0.478873
					if( ema12 > 0.201063 )
						if( ad_mf <= -1.23534e+06 )
							ret := 0.806452 // buy
						if( ad_mf > -1.23534e+06 )
							ret := 0.154412
				if( ema13 > 1.35178 )
					ret := -0.933333 // sell
			if( tema > 24.9416 )
				if( ad_mf <= -46294.7 )
					if( ema13 <= -3.96562 )
						ret := 1.000000 // buy
					if( ema13 > -3.96562 )
						if( ad_mf <= -51636.2 )
							ret := -0.021015
						if( ad_mf > -51636.2 )
							ret := 0.482143
				if( ad_mf > -46294.7 )
					if( mf <= 0.380779 )
						if( ad_mf <= -34322.5 )
							ret := -0.642336
						if( ad_mf > -34322.5 )
							ret := -0.231405
					if( mf > 0.380779 )
						ret := 0.642857
		if( ad > -24980.5 )
			if( ema1 <= 17.9011 )
				if( ad <= -4320.34 )
					if( ema3 <= 15.2843 )
						if( ema1 <= 13.735 )
							ret := 0.076923
						if( ema1 > 13.735 )
							ret := 0.937500 // buy
					if( ema3 > 15.2843 )
						if( ema13 <= 0.159174 )
							ret := -0.375000
						if( ema13 > 0.159174 )
							ret := 0.272727
				if( ad > -4320.34 )
					if( tema <= 14.189 )
						ret := 0.105263
					if( tema > 14.189 )
						if( tema <= 16.1464 )
							ret := -0.957447 // sell
						if( tema > 16.1464 )
							ret := -0.355932
			if( ema1 > 17.9011 )
				if( ema12 <= 0.015791 )
					if( ema13 <= -1.3995 )
						if( ad <= -10686.4 )
							ret := 0.148936
						if( ad > -10686.4 )
							ret := -0.548780
					if( ema13 > -1.3995 )
						if( ema13 <= -0.059122 )
							ret := 0.198351
						if( ema13 > -0.059122 )
							ret := 0.395085
				if( ema12 > 0.015791 )
					if( ad_mf <= -2489.78 )
						if( ad <= -3595.3 )
							ret := -0.007034
						if( ad > -3595.3 )
							ret := -0.231527
					if( ad_mf > -2489.78 )
						if( ema3 <= 23.0483 )
							ret := 0.398058
						if( ema3 > 23.0483 )
							ret := 0.070384
	if( ad_mf > -0.296134 )
		if( ad_mf <= 4367.19 )
			if( ad <= 2502.36 )
				if( ad_mf <= -0.152639 )
					if( ema3 <= 27.4417 )
						if( ema12 <= 0.082303 )
							ret := -0.447154
						if( ema12 > 0.082303 )
							ret := 0.130841
					if( ema3 > 27.4417 )
						if( ema13 <= 0.259127 )
							ret := -0.319588
						if( ema13 > 0.259127 )
							ret := -0.682692
				if( ad_mf > -0.152639 )
					if( ema12 <= 0.595766 )
						if( ema12 <= -1.28246 )
							ret := -0.857143 // sell
						if( ema12 > -1.28246 )
							ret := -0.069643
					if( ema12 > 0.595766 )
						if( ad <= 537.285 )
							ret := -0.285714
						if( ad > 537.285 )
							ret := -0.864865 // sell
			if( ad > 2502.36 )
				if( tema <= 40.0246 )
					if( ad <= 2874.25 )
						if( ema13 <= 0.128315 )
							ret := -0.507042
						if( ema13 > 0.128315 )
							ret := -0.929412 // sell
					if( ad > 2874.25 )
						if( ema2 <= 14.5866 )
							ret := 0.857143 // buy
						if( ema2 > 14.5866 )
							ret := -0.312775
				if( tema > 40.0246 )
					if( ad_mf <= 3353.01 )
						if( ad_mf <= 3031.46 )
							ret := 0.031250
						if( ad_mf > 3031.46 )
							ret := 0.815789 // buy
					if( ad_mf > 3353.01 )
						if( ema13 <= 0.167468 )
							ret := 0.097561
						if( ema13 > 0.167468 )
							ret := -0.489796
		if( ad_mf > 4367.19 )
			if( ema12 <= -1.85176 )
				if( tema <= 73.0403 )
					if( ema12 <= -2.90315 )
						ret := -0.727273 // sell
					if( ema12 > -2.90315 )
						ret := -1.000000 // sell
				if( tema > 73.0403 )
					ret := -0.400000
			if( ema12 > -1.85176 )
				if( ema3 <= 35.3272 )
					if( ema3 <= 24.7714 )
						if( ad <= 4578.8 )
							ret := 0.708333 // buy
						if( ad > 4578.8 )
							ret := 0.036286
					if( ema3 > 24.7714 )
						if( ema13 <= 3.36874 )
							ret := -0.104366
						if( ema13 > 3.36874 )
							ret := 1.000000 // buy
				if( ema3 > 35.3272 )
					if( ema3 <= 71.9859 )
						if( ad_mf <= 5037.05 )
							ret := 0.671875
						if( ad_mf > 5037.05 )
							ret := 0.075080
					if( ema3 > 71.9859 )
						if( mf <= -0.196304 )
							ret := -0.692308
						if( mf > -0.196304 )
							ret := -0.122283
	
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
float op_operation = decision_tree_0_PINS_1Hour_eee6224c(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


