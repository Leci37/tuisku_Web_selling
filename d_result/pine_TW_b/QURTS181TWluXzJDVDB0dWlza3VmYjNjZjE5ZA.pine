//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: ADSK_5Min_2CT0_fb3cf19d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_5Min_2CT0_fb3cf19d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_5Min_fb3cf19d(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ema2 <= 202.532 )
		if( ad_mf <= -0.053295 )
			if( mf <= 0.238957 )
				if( ema13 <= 0.738476 )
					if( ad_mf <= -0.197845 )
						if( mf <= -0.146361 )
							ret := 0.341216
						if( mf > -0.146361 )
							ret := 0.105323
					if( ad_mf > -0.197845 )
						if( ema2 <= 198.289 )
							ret := 0.027778
						if( ema2 > 198.289 )
							ret := 0.887500 // buy
				if( ema13 > 0.738476 )
					if( ema3 <= 200.224 )
						if( ema1 <= 197.765 )
							ret := -0.076923
						if( ema1 > 197.765 )
							ret := -0.703704 // sell
					if( ema3 > 200.224 )
						if( ema12 <= 0.500712 )
							ret := -0.263158
						if( ema12 > 0.500712 )
							ret := 0.363636
			if( mf > 0.238957 )
				if( ema1 <= 200.079 )
					if( ad_mf <= -150.696 )
						if( ema1 <= 197.7 )
							ret := 0.631579
						if( ema1 > 197.7 )
							ret := 0.040000
					if( ad_mf > -150.696 )
						if( mf <= 0.293697 )
							ret := 1.000000 // buy
						if( mf > 0.293697 )
							ret := -0.538462
				if( ema1 > 200.079 )
					if( ema13 <= -0.816771 )
						ret := -0.857143 // sell
					if( ema13 > -0.816771 )
						if( ema12 <= 0.742458 )
							ret := 0.879630 // buy
						if( ema12 > 0.742458 )
							ret := -0.625000
		if( ad_mf > -0.053295 )
			if( mf <= -0.498574 )
				if( ema12 <= 0.288654 )
					ret := 1.000000 // buy
				if( ema12 > 0.288654 )
					ret := -0.833333 // sell
			if( mf > -0.498574 )
				if( ad_mf <= 0.07544 )
					if( ema1 <= 194.308 )
						ret := 0.533333
					if( ema1 > 194.308 )
						if( ema1 <= 201.189 )
							ret := -0.530201
						if( ema1 > 201.189 )
							ret := 0.285714
				if( ad_mf > 0.07544 )
					if( ad <= 44854.4 )
						if( ad_mf <= 0.078797 )
							ret := 0.916667 // buy
						if( ad_mf > 0.078797 )
							ret := 0.043337
					if( ad > 44854.4 )
						if( ema3 <= 195.376 )
							ret := -0.400000
						if( ema3 > 195.376 )
							ret := 0.785714 // buy
	if( ema2 > 202.532 )
		if( ad <= 436.295 )
			if( mf <= -0.437351 )
				if( ema1 <= 257.289 )
					if( ema3 <= 203.964 )
						if( tema <= 203.128 )
							ret := 0.347826
						if( tema > 203.128 )
							ret := -0.846154 // sell
					if( ema3 > 203.964 )
						if( ema12 <= -0.589698 )
							ret := 0.109589
						if( ema12 > -0.589698 )
							ret := 0.521739
				if( ema1 > 257.289 )
					if( ema1 <= 263.934 )
						if( ema2 <= 258.576 )
							ret := -0.333333
						if( ema2 > 258.576 )
							ret := -1.000000 // sell
					if( ema1 > 263.934 )
						if( ema1 <= 265.634 )
							ret := 1.000000 // buy
						if( ema1 > 265.634 )
							ret := -0.538462
			if( mf > -0.437351 )
				if( ad_mf <= -60702.5 )
					if( ema12 <= 0.32866 )
						if( mf <= -0.073858 )
							ret := -0.206422
						if( mf > -0.073858 )
							ret := -0.704348 // sell
					if( ema12 > 0.32866 )
						if( ema1 <= 244.771 )
							ret := 1.000000 // buy
						if( ema1 > 244.771 )
							ret := 0.500000
				if( ad_mf > -60702.5 )
					if( ad <= -34170.5 )
						if( ema13 <= -0.308971 )
							ret := 0.621005
						if( ema13 > -0.308971 )
							ret := 0.105634
					if( ad > -34170.5 )
						if( mf <= 0.593939 )
							ret := 0.009694
						if( mf > 0.593939 )
							ret := -0.540541
		if( ad > 436.295 )
			if( ad_mf <= 493.89 )
				if( ema2 <= 207.567 )
					ret := 0.666667
				if( ema2 > 207.567 )
					if( ema12 <= -0.193451 )
						if( ema1 <= 210.817 )
							ret := 1.000000 // buy
						if( ema1 > 210.817 )
							ret := 0.157895
					if( ema12 > -0.193451 )
						if( ema2 <= 269.737 )
							ret := -0.747475 // sell
						if( ema2 > 269.737 )
							ret := 0.000000
			if( ad_mf > 493.89 )
				if( ad_mf <= 17726.1 )
					if( ad_mf <= 13123.8 )
						if( ema13 <= -0.465575 )
							ret := -0.138049
						if( ema13 > -0.465575 )
							ret := -0.034161
					if( ad_mf > 13123.8 )
						if( tema <= 206.296 )
							ret := -0.275862
						if( tema > 206.296 )
							ret := 0.200387
				if( ad_mf > 17726.1 )
					if( ema13 <= 1.06739 )
						if( ad <= 261161 )
							ret := -0.102634
						if( ad > 261161 )
							ret := 0.777778 // buy
					if( ema13 > 1.06739 )
						if( mf <= -0.004313 )
							ret := 0.076923
						if( mf > -0.004313 )
							ret := -0.531365
	
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
float op_operation = decision_tree_0_ADSK_5Min_fb3cf19d(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)

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


