//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: DDOG_5Min_2CT0_5f2ef08f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DDOG_5Min_2CT0_5f2ef08f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DDOG_5Min_5f2ef08f(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema12 <= 0.001254 )
		if( ad <= 210.813 )
			if( tema <= 126.746 )
				if( mf <= 0.276176 )
					if( ema1 <= 126.463 )
						if( ad <= -67158.4 )
							ret := 0.272933
						if( ad > -67158.4 )
							ret := 0.090573
					if( ema1 > 126.463 )
						if( ad_mf <= -0.17383 )
							ret := 0.173333
						if( ad_mf > -0.17383 )
							ret := 0.954023 // buy
				if( mf > 0.276176 )
					if( ema12 <= -0.243398 )
						if( ema3 <= 89.6106 )
							ret := 0.714286 // buy
						if( ema3 > 89.6106 )
							ret := -0.050847
					if( ema12 > -0.243398 )
						if( ema12 <= -0.154159 )
							ret := 0.744526 // buy
						if( ema12 > -0.154159 )
							ret := 0.304348
			if( tema > 126.746 )
				if( ad_mf <= 0.295369 )
					if( ema2 <= 131.063 )
						if( ad_mf <= -0.051397 )
							ret := -0.077778
						if( ad_mf > -0.051397 )
							ret := -0.535211
					if( ema2 > 131.063 )
						if( ad_mf <= -0.21147 )
							ret := 0.012107
						if( ad_mf > -0.21147 )
							ret := 0.424658
				if( ad_mf > 0.295369 )
					if( tema <= 132.895 )
						if( ema2 <= 129.625 )
							ret := 1.000000 // buy
						if( ema2 > 129.625 )
							ret := 0.769231 // buy
					if( tema > 132.895 )
						ret := -0.333333
		if( ad > 210.813 )
			if( ema13 <= -4.6776 )
				if( tema <= 83.1226 )
					ret := 0.900000 // buy
				if( tema > 83.1226 )
					ret := 1.000000 // buy
			if( ema13 > -4.6776 )
				if( tema <= 87.2596 )
					if( mf <= -0.052832 )
						if( ema13 <= -0.891239 )
							ret := 0.475000
						if( ema13 > -0.891239 )
							ret := -0.108883
					if( mf > -0.052832 )
						if( tema <= 64.0124 )
							ret := -0.533333
						if( tema > 64.0124 )
							ret := 0.344358
				if( tema > 87.2596 )
					if( ad_mf <= 17846.7 )
						if( ad_mf <= 14969.7 )
							ret := -0.053645
						if( ad_mf > 14969.7 )
							ret := -0.248016
					if( ad_mf > 17846.7 )
						if( ema12 <= -0.567292 )
							ret := -0.278302
						if( ema12 > -0.567292 )
							ret := 0.070397
	if( ema12 > 0.001254 )
		if( ema12 <= 1.06581 )
			if( mf <= -0.376832 )
				if( tema <= 107.263 )
					if( ema1 <= 92.987 )
						if( ema12 <= 0.260884 )
							ret := 0.410256
						if( ema12 > 0.260884 )
							ret := -0.571429
					if( ema1 > 92.987 )
						if( ema12 <= 0.014691 )
							ret := 0.000000
						if( ema12 > 0.014691 )
							ret := -0.800000 // sell
				if( tema > 107.263 )
					if( ema3 <= 121.727 )
						if( ad <= 260.742 )
							ret := 0.631313
						if( ad > 260.742 )
							ret := 0.179487
					if( ema3 > 121.727 )
						if( ema12 <= 0.100926 )
							ret := 0.518072
						if( ema12 > 0.100926 )
							ret := -0.363636
			if( mf > -0.376832 )
				if( ema13 <= 1.74829 )
					if( ad <= -391.529 )
						if( ad <= -22033.5 )
							ret := -0.109058
						if( ad > -22033.5 )
							ret := 0.035997
					if( ad > -391.529 )
						if( ad_mf <= 1960.37 )
							ret := -0.157262
						if( ad_mf > 1960.37 )
							ret := -0.047904
				if( ema13 > 1.74829 )
					if( mf <= 0.240116 )
						if( ema13 <= 2.22216 )
							ret := 0.000000
						if( ema13 > 2.22216 )
							ret := 0.909091 // buy
					if( mf > 0.240116 )
						if( ema12 <= 1.00133 )
							ret := 0.854167 // buy
						if( ema12 > 1.00133 )
							ret := 0.300000
		if( ema12 > 1.06581 )
			if( mf <= 0.091767 )
				if( tema <= 115.733 )
					ret := 0.700000 // buy
				if( tema > 115.733 )
					ret := 0.100000
			if( mf > 0.091767 )
				if( ad_mf <= -130844 )
					ret := 0.466667
				if( ad_mf > -130844 )
					if( ema12 <= 3.05798 )
						if( ad <= 321172 )
							ret := -0.741935 // sell
						if( ad > 321172 )
							ret := 0.384615
					if( ema12 > 3.05798 )
						ret := 0.357143
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_DDOG_5Min_5f2ef08f(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


