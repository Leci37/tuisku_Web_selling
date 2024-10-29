//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: APPS_1Hour_2CT0_72d97383 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_1Hour_2CT0_72d97383", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_1Hour_72d97383(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ad_mf <= -0.046233 )
		if( ema13 <= -0.119695 )
			if( tema <= 7.25441 )
				if( tema <= 5.77186 )
					if( ad_mf <= -163.042 )
						if( ema2 <= 4.43865 )
							ret := 0.402597
						if( ema2 > 4.43865 )
							ret := 0.025210
					if( ad_mf > -163.042 )
						ret := -0.916667 // sell
				if( tema > 5.77186 )
					if( ad_mf <= -268.95 )
						if( ad_mf <= -16296.2 )
							ret := 0.384615
						if( ad_mf > -16296.2 )
							ret := 0.878788 // buy
					if( ad_mf > -268.95 )
						ret := -1.000000 // sell
			if( tema > 7.25441 )
				if( ad_mf <= -379238 )
					if( ema2 <= 85.0769 )
						if( ad_mf <= -386445 )
							ret := 0.106061
						if( ad_mf > -386445 )
							ret := 0.774194 // buy
					if( ema2 > 85.0769 )
						ret := -1.000000 // sell
				if( ad_mf > -379238 )
					if( ema3 <= 58.4111 )
						if( ad <= -135.42 )
							ret := -0.164105
						if( ad > -135.42 )
							ret := 0.508197
					if( ema3 > 58.4111 )
						if( ema12 <= -0.058686 )
							ret := 0.080207
						if( ema12 > -0.058686 )
							ret := -0.514286
		if( ema13 > -0.119695 )
			if( tema <= 46.2225 )
				if( ema13 <= 0.575524 )
					if( ema1 <= 5.13868 )
						if( ema12 <= -0.0025 )
							ret := 0.262281
						if( ema12 > -0.0025 )
							ret := 0.124917
					if( ema1 > 5.13868 )
						if( ad_mf <= -37464.2 )
							ret := 0.005322
						if( ad_mf > -37464.2 )
							ret := 0.141958
				if( ema13 > 0.575524 )
					if( ema13 <= 1.58341 )
						if( ad <= -21821.5 )
							ret := 0.316239
						if( ad > -21821.5 )
							ret := 0.598456
					if( ema13 > 1.58341 )
						if( mf <= 0.173799 )
							ret := 0.750000 // buy
						if( mf > 0.173799 )
							ret := -0.200000
			if( tema > 46.2225 )
				if( ad_mf <= -2348 )
					if( ema13 <= 2.87631 )
						if( mf <= 0.130897 )
							ret := -0.043738
						if( mf > 0.130897 )
							ret := -0.278736
					if( ema13 > 2.87631 )
						if( mf <= 0.229415 )
							ret := 0.852941 // buy
						if( mf > 0.229415 )
							ret := -0.428571
				if( ad_mf > -2348 )
					if( ad_mf <= -2232.27 )
						if( tema <= 80.0965 )
							ret := 0.954545 // buy
						if( tema > 80.0965 )
							ret := 0.250000
					if( ad_mf > -2232.27 )
						if( ad_mf <= -2177.89 )
							ret := -1.000000 // sell
						if( ad_mf > -2177.89 )
							ret := 0.187179
	if( ad_mf > -0.046233 )
		if( ad_mf <= 18557.4 )
			if( ad <= 15605.1 )
				if( tema <= 1.90577 )
					if( ema13 <= -0.016971 )
						if( ema12 <= -0.014903 )
							ret := 0.136986
						if( ema12 > -0.014903 )
							ret := -0.618421
					if( ema13 > -0.016971 )
						if( tema <= 1.79804 )
							ret := 0.158228
						if( tema > 1.79804 )
							ret := 0.829787 // buy
				if( tema > 1.90577 )
					if( ema3 <= 9.04704 )
						if( ema12 <= -0.003363 )
							ret := -0.116415
						if( ema12 > -0.003363 )
							ret := -0.355634
					if( ema3 > 9.04704 )
						if( mf <= -0.134686 )
							ret := -0.210577
						if( mf > -0.134686 )
							ret := -0.053177
			if( ad > 15605.1 )
				if( ema3 <= 1.92264 )
					if( mf <= 0.04005 )
						ret := -0.500000
					if( mf > 0.04005 )
						ret := 1.000000 // buy
				if( ema3 > 1.92264 )
					if( mf <= 0.282465 )
						if( ema12 <= -0.558031 )
							ret := 0.400000
						if( ema12 > -0.558031 )
							ret := -0.707792 // sell
					if( mf > 0.282465 )
						ret := 0.285714
		if( ad_mf > 18557.4 )
			if( ad <= 92771.6 )
				if( ad_mf <= 75128.4 )
					if( ad_mf <= 66783.9 )
						if( ad_mf <= 21451.6 )
							ret := 0.398601
						if( ad_mf > 21451.6 )
							ret := 0.082563
					if( ad_mf > 66783.9 )
						if( ema3 <= 1.88723 )
							ret := -1.000000 // sell
						if( ema3 > 1.88723 )
							ret := -0.273469
				if( ad_mf > 75128.4 )
					if( ad_mf <= 77813.1 )
						if( tema <= 16.7997 )
							ret := 0.809524 // buy
						if( tema > 16.7997 )
							ret := 0.000000
					if( ad_mf > 77813.1 )
						if( ema12 <= 0.024829 )
							ret := 0.061889
						if( ema12 > 0.024829 )
							ret := 0.496815
			if( ad > 92771.6 )
				if( ad <= 93963.9 )
					if( ema2 <= 2.41049 )
						ret := 0.142857
					if( ema2 > 2.41049 )
						if( ad <= 93361.3 )
							ret := -0.066667
						if( ad > 93361.3 )
							ret := -0.951220 // sell
				if( ad > 93963.9 )
					if( ad_mf <= 1.22897e+06 )
						if( ema13 <= 0.404173 )
							ret := -0.069561
						if( ema13 > 0.404173 )
							ret := 0.064906
					if( ad_mf > 1.22897e+06 )
						if( ad <= 3.79442e+06 )
							ret := 0.537634
						if( ad > 3.79442e+06 )
							ret := -0.900000 // sell
	
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
float op_operation = decision_tree_0_APPS_1Hour_72d97383(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)

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


