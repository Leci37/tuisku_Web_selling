//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: ABNB_1Min_2CT0_1ead7747 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ABNB_1Min_2CT0_1ead7747", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ABNB_1Min_1ead7747(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema12 <= 0.055567 )
		if( ad_mf <= 0.198263 )
			if( ad <= -612.263 )
				if( tema <= 111.626 )
					if( ema12 <= 0.029126 )
						if( ema12 <= -0.768081 )
							ret := -0.076923
						if( ema12 > -0.768081 )
							ret := 0.610390
					if( ema12 > 0.029126 )
						ret := -0.071429
				if( tema > 111.626 )
					if( ad <= -330181 )
						if( tema <= 145.428 )
							ret := 1.000000 // buy
						if( tema > 145.428 )
							ret := 0.800000 // buy
					if( ad > -330181 )
						if( tema <= 160.184 )
							ret := 0.033475
						if( tema > 160.184 )
							ret := -0.143636
			if( ad > -612.263 )
				if( ema12 <= 0.001684 )
					if( tema <= 115.272 )
						if( mf <= 0.046109 )
							ret := 0.403061
						if( mf > 0.046109 )
							ret := 0.760563 // buy
					if( tema > 115.272 )
						if( ad <= -390.033 )
							ret := 0.039497
						if( ad > -390.033 )
							ret := 0.262819
				if( ema12 > 0.001684 )
					if( ema3 <= 116.361 )
						if( mf <= -0.007999 )
							ret := 0.635802
						if( mf > -0.007999 )
							ret := 0.188341
					if( ema3 > 116.361 )
						if( ad_mf <= -0.638172 )
							ret := 0.147110
						if( ad_mf > -0.638172 )
							ret := -0.111111
		if( ad_mf > 0.198263 )
			if( ema2 <= 147.467 )
				if( ad_mf <= 78091.8 )
					if( tema <= 146.311 )
						if( ema2 <= 146.384 )
							ret := -0.012151
						if( ema2 > 146.384 )
							ret := -0.517857
					if( tema > 146.311 )
						if( ad_mf <= 0.413477 )
							ret := 0.671053
						if( ad_mf > 0.413477 )
							ret := 0.089239
				if( ad_mf > 78091.8 )
					if( mf <= -0.023449 )
						ret := 0.583333
					if( mf > -0.023449 )
						if( ema2 <= 141.07 )
							ret := -0.577778
						if( ema2 > 141.07 )
							ret := -0.909091 // sell
			if( ema2 > 147.467 )
				if( ad <= 61661.2 )
					if( ema13 <= -0.222337 )
						if( ad <= 18476 )
							ret := -0.169087
						if( ad > 18476 )
							ret := -0.647059
					if( ema13 > -0.222337 )
						if( ad <= 127.028 )
							ret := -0.315436
						if( ad > 127.028 )
							ret := -0.035801
				if( ad > 61661.2 )
					if( ema13 <= -0.125049 )
						if( mf <= 0.021983 )
							ret := 1.000000 // buy
						if( mf > 0.021983 )
							ret := 0.923077 // buy
					if( ema13 > -0.125049 )
						ret := 0.222222
	if( ema12 > 0.055567 )
		if( ad_mf <= -17196.8 )
			if( ema13 <= 0.435821 )
				if( ad_mf <= -17885.7 )
					if( mf <= -0.34148 )
						if( ema12 <= 0.139267 )
							ret := 0.307692
						if( ema12 > 0.139267 )
							ret := 0.941176 // buy
					if( mf > -0.34148 )
						if( ema13 <= 0.25704 )
							ret := -0.017778
						if( ema13 > 0.25704 )
							ret := -0.340580
				if( ad_mf > -17885.7 )
					if( ema3 <= 143.064 )
						if( mf <= 0.131621 )
							ret := 1.000000 // buy
						if( mf > 0.131621 )
							ret := 0.857143 // buy
					if( ema3 > 143.064 )
						ret := 0.111111
			if( ema13 > 0.435821 )
				if( tema <= 150.426 )
					if( mf <= -0.209906 )
						ret := -0.250000
					if( mf > -0.209906 )
						if( ema2 <= 128.912 )
							ret := 0.958904 // buy
						if( ema2 > 128.912 )
							ret := 0.527027
				if( tema > 150.426 )
					ret := -0.550000
		if( ad_mf > -17196.8 )
			if( mf <= -0.669023 )
				if( ema2 <= 138.81 )
					ret := 1.000000 // buy
				if( ema2 > 138.81 )
					ret := -0.692308
			if( mf > -0.669023 )
				if( mf <= -0.510833 )
					if( ema2 <= 115.649 )
						ret := 0.250000
					if( ema2 > 115.649 )
						if( ema13 <= 0.255897 )
							ret := -0.882979 // sell
						if( ema13 > 0.255897 )
							ret := -0.518519
				if( mf > -0.510833 )
					if( ema13 <= 0.255539 )
						if( mf <= 0.023891 )
							ret := -0.156585
						if( mf > 0.023891 )
							ret := -0.074927
					if( ema13 > 0.255539 )
						if( ema1 <= 111.52 )
							ret := 0.848485 // buy
						if( ema1 > 111.52 )
							ret := -0.042939
	
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
float op_operation = decision_tree_0_ABNB_1Min_1ead7747(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)

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


