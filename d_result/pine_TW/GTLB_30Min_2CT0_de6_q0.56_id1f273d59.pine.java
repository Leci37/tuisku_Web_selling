//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: GTLB_30Min_2CT0_1f273d59 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GTLB_30Min_2CT0_1f273d59", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GTLB_30Min_1f273d59(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( tema <= 53.2602 )
		if( tema <= 41.7032 )
			if( ema13 <= -0.605229 )
				if( ema12 <= -0.4497 )
					if( mf <= 0.192301 )
						if( ad_mf <= -194070 )
							ret := 0.700000 // buy
						if( ad_mf > -194070 )
							ret := 0.239264
					if( mf > 0.192301 )
						ret := -1.000000 // sell
				if( ema12 > -0.4497 )
					if( mf <= -0.250694 )
						if( ema3 <= 41.2883 )
							ret := 0.041667
						if( ema3 > 41.2883 )
							ret := 1.000000 // buy
					if( mf > -0.250694 )
						if( tema <= 41.1905 )
							ret := 0.731034 // buy
						if( tema > 41.1905 )
							ret := -0.058824
			if( ema13 > -0.605229 )
				if( ema12 <= -0.219971 )
					if( ema2 <= 38.4841 )
						if( ema3 <= 36.6313 )
							ret := -0.102941
						if( ema3 > 36.6313 )
							ret := 0.333333
					if( ema2 > 38.4841 )
						if( ema12 <= -0.266652 )
							ret := 0.016667
						if( ema12 > -0.266652 )
							ret := -0.656250
				if( ema12 > -0.219971 )
					if( ema3 <= 34.4964 )
						if( ema2 <= 34.179 )
							ret := 0.035065
						if( ema2 > 34.179 )
							ret := -0.592105
					if( ema3 > 34.4964 )
						if( mf <= 0.126232 )
							ret := 0.112939
						if( mf > 0.126232 )
							ret := 0.373041
		if( tema > 41.7032 )
			if( ad_mf <= -79577.7 )
				if( ad <= -82353.9 )
					if( tema <= 42.7616 )
						if( ema3 <= 40.0232 )
							ret := -1.000000 // sell
						if( ema3 > 40.0232 )
							ret := -0.206897
					if( tema > 42.7616 )
						if( ad <= -250666 )
							ret := -0.137405
						if( ad > -250666 )
							ret := 0.219512
				if( ad > -82353.9 )
					if( ema3 <= 44.736 )
						ret := 0.000000
					if( ema3 > 44.736 )
						if( mf <= 0.153129 )
							ret := 0.977273 // buy
						if( mf > 0.153129 )
							ret := 0.333333
			if( ad_mf > -79577.7 )
				if( mf <= -0.162739 )
					if( ema12 <= -1.00721 )
						if( mf <= -0.185106 )
							ret := 0.453782
						if( mf > -0.185106 )
							ret := -0.625000
					if( ema12 > -1.00721 )
						if( ema13 <= -1.33371 )
							ret := -0.537037
						if( ema13 > -1.33371 )
							ret := -0.103627
				if( mf > -0.162739 )
					if( ema3 <= 51.5317 )
						if( ema13 <= -1.58732 )
							ret := -0.419048
						if( ema13 > -1.58732 )
							ret := 0.013329
					if( ema3 > 51.5317 )
						if( ema3 <= 52.3113 )
							ret := 0.331646
						if( ema3 > 52.3113 )
							ret := 0.044487
	if( tema > 53.2602 )
		if( ema13 <= -1.11519 )
			if( ad_mf <= -394355 )
				ret := -1.000000 // sell
			if( ad_mf > -394355 )
				if( ad_mf <= -55479.4 )
					if( ad <= -59190.4 )
						if( ad_mf <= -67676.6 )
							ret := 0.389474
						if( ad_mf > -67676.6 )
							ret := -0.312500
					if( ad > -59190.4 )
						ret := 1.000000 // buy
				if( ad_mf > -55479.4 )
					if( ema3 <= 62.271 )
						if( tema <= 55.0094 )
							ret := -0.063291
						if( tema > 55.0094 )
							ret := 0.438462
					if( ema3 > 62.271 )
						if( mf <= 0.131265 )
							ret := 0.000000
						if( mf > 0.131265 )
							ret := -0.518519
		if( ema13 > -1.11519 )
			if( ad <= -85267.8 )
				if( ad <= -160110 )
					if( ema12 <= 0.474084 )
						if( ema13 <= -0.704601 )
							ret := -0.319149
						if( ema13 > -0.704601 )
							ret := 0.115385
					if( ema12 > 0.474084 )
						if( mf <= 0.135798 )
							ret := -0.800000 // sell
						if( mf > 0.135798 )
							ret := 0.000000
				if( ad > -160110 )
					if( ema12 <= -0.396299 )
						if( ema1 <= 60.0006 )
							ret := 0.363636
						if( ema1 > 60.0006 )
							ret := 0.916667 // buy
					if( ema12 > -0.396299 )
						if( ema13 <= 0.164799 )
							ret := -0.011905
						if( ema13 > 0.164799 )
							ret := 0.410000
			if( ad > -85267.8 )
				if( ad <= 357746 )
					if( tema <= 124.545 )
						if( ema13 <= -0.547787 )
							ret := -0.228891
						if( ema13 > -0.547787 )
							ret := -0.088816
					if( tema > 124.545 )
						if( ema2 <= 126.997 )
							ret := -0.829268 // sell
						if( ema2 > 126.997 )
							ret := -0.270833
				if( ad > 357746 )
					if( ad_mf <= 3.3542e+06 )
						if( ema1 <= 52.4581 )
							ret := 0.000000
						if( ema1 > 52.4581 )
							ret := -0.767857 // sell
					if( ad_mf > 3.3542e+06 )
						ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_GTLB_30Min_1f273d59(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


