//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: DOCN_5Min_2CT0_30d33361 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOCN_5Min_2CT0_30d33361", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOCN_5Min_30d33361(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ad_mf <= 0.252177 )
		if( ema12 <= -0.071084 )
			if( ad_mf <= -249.823 )
				if( ema13 <= -0.661311 )
					if( ema1 <= 43.3017 )
						if( tema <= 36.858 )
							ret := -0.077778
						if( tema > 36.858 )
							ret := -0.600000
					if( ema1 > 43.3017 )
						if( ad <= -91849.7 )
							ret := -1.000000 // sell
						if( ad > -91849.7 )
							ret := 0.933333 // buy
				if( ema13 > -0.661311 )
					if( ad <= -5656.83 )
						if( ad_mf <= -10461 )
							ret := 0.104354
						if( ad_mf > -10461 )
							ret := 0.320976
					if( ad > -5656.83 )
						if( mf <= 0.437088 )
							ret := 0.035605
						if( mf > 0.437088 )
							ret := -0.592593
			if( ad_mf > -249.823 )
				if( ad <= -138.611 )
					if( tema <= 22.7518 )
						ret := -1.000000 // sell
					if( tema > 22.7518 )
						ret := 1.000000 // buy
				if( ad > -138.611 )
					if( ema12 <= -0.110989 )
						if( ema13 <= -0.244801 )
							ret := 0.297101
						if( ema13 > -0.244801 )
							ret := 0.650655
					if( ema12 > -0.110989 )
						if( ema3 <= 40.3881 )
							ret := 0.277922
						if( ema3 > 40.3881 )
							ret := -0.343750
		if( ema12 > -0.071084 )
			if( ad <= -32862.9 )
				if( ema13 <= 0.04735 )
					if( ema12 <= -0.005404 )
						if( ad_mf <= -65339.6 )
							ret := 0.045872
						if( ad_mf > -65339.6 )
							ret := -0.335260
					if( ema12 > -0.005404 )
						if( ema13 <= -0.015249 )
							ret := 1.000000 // buy
						if( ema13 > -0.015249 )
							ret := 0.160714
				if( ema13 > 0.04735 )
					if( ema2 <= 34.2836 )
						if( ema13 <= 0.113809 )
							ret := 0.355932
						if( ema13 > 0.113809 )
							ret := 0.812121 // buy
					if( ema2 > 34.2836 )
						if( mf <= 0.054589 )
							ret := 0.510638
						if( mf > 0.054589 )
							ret := 0.000000
			if( ad > -32862.9 )
				if( ema1 <= 38.8019 )
					if( ema12 <= -0.010636 )
						if( mf <= -0.293331 )
							ret := -0.295139
						if( mf > -0.293331 )
							ret := 0.109201
					if( ema12 > -0.010636 )
						if( ad_mf <= -0.054237 )
							ret := 0.007986
						if( ad_mf > -0.054237 )
							ret := -0.178189
				if( ema1 > 38.8019 )
					if( mf <= -0.033861 )
						if( ema12 <= 0.062824 )
							ret := -0.134089
						if( ema12 > 0.062824 )
							ret := -0.415162
					if( mf > -0.033861 )
						if( mf <= 0.318974 )
							ret := -0.013870
						if( mf > 0.318974 )
							ret := -0.341935
	if( ad_mf > 0.252177 )
		if( mf <= -0.41714 )
			if( ad_mf <= 243.292 )
				if( ema12 <= -0.124623 )
					if( ema12 <= -0.221208 )
						ret := -0.625000
					if( ema12 > -0.221208 )
						if( ema2 <= 40.9281 )
							ret := 0.466667
						if( ema2 > 40.9281 )
							ret := -0.400000
				if( ema12 > -0.124623 )
					if( ema3 <= 39.5036 )
						if( ema2 <= 26.5626 )
							ret := 0.000000
						if( ema2 > 26.5626 )
							ret := -0.873950 // sell
					if( ema3 > 39.5036 )
						if( ema2 <= 41.4613 )
							ret := 0.888889 // buy
						if( ema2 > 41.4613 )
							ret := -0.777778 // sell
			if( ad_mf > 243.292 )
				if( ema2 <= 44.4319 )
					if( ema12 <= -0.20685 )
						if( ema12 <= -0.478744 )
							ret := -0.666667
						if( ema12 > -0.478744 )
							ret := -1.000000 // sell
					if( ema12 > -0.20685 )
						if( ema3 <= 39.764 )
							ret := -0.139344
						if( ema3 > 39.764 )
							ret := -0.818182 // sell
				if( ema2 > 44.4319 )
					ret := 1.000000 // buy
		if( mf > -0.41714 )
			if( ad <= 21197.9 )
				if( ema12 <= -0.45474 )
					if( ad <= 345.389 )
						ret := 0.571429
					if( ad > 345.389 )
						if( ema1 <= 27.4956 )
							ret := 1.000000 // buy
						if( ema1 > 27.4956 )
							ret := -0.921569 // sell
				if( ema12 > -0.45474 )
					if( ad <= 2755.58 )
						if( ema1 <= 48.1535 )
							ret := -0.111844
						if( ema1 > 48.1535 )
							ret := 0.307087
					if( ad > 2755.58 )
						if( ad <= 4398.52 )
							ret := 0.056121
						if( ad > 4398.52 )
							ret := -0.050439
			if( ad > 21197.9 )
				if( ema3 <= 44.881 )
					if( ad_mf <= 24018.1 )
						if( ema13 <= 0.020135 )
							ret := 0.648855
						if( ema13 > 0.020135 )
							ret := 0.201087
					if( ad_mf > 24018.1 )
						if( mf <= 0.24351 )
							ret := 0.168332
						if( mf > 0.24351 )
							ret := -0.042553
				if( ema3 > 44.881 )
					if( ad <= 51206.7 )
						if( ad <= 29733.5 )
							ret := -0.514286
						if( ad > 29733.5 )
							ret := 0.090909
					if( ad > 51206.7 )
						if( ema13 <= 0.162408 )
							ret := -0.333333
						if( ema13 > 0.162408 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_DOCN_5Min_30d33361(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


