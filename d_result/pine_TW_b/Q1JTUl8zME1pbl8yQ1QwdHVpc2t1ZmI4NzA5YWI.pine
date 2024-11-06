//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: CRSR_30Min_2CT0_fb8709ab Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRSR_30Min_2CT0_fb8709ab", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRSR_30Min_fb8709ab(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ema12 <= -0.072743 )
		if( ad_mf <= 719.388 )
			if( tema <= 38.5733 )
				if( ema1 <= 10.4682 )
					if( ema3 <= 6.51135 )
						if( ad_mf <= 0.106649 )
							ret := 0.333333
						if( ad_mf > 0.106649 )
							ret := 1.000000 // buy
					if( ema3 > 6.51135 )
						if( ad_mf <= -10642.1 )
							ret := -0.191489
						if( ad_mf > -10642.1 )
							ret := -0.775862 // sell
				if( ema1 > 10.4682 )
					if( ad_mf <= -4584.11 )
						if( ad_mf <= -69930.6 )
							ret := 0.316456
						if( ad_mf > -69930.6 )
							ret := 0.127743
					if( ad_mf > -4584.11 )
						if( ema3 <= 16.2015 )
							ret := 0.519802
						if( ema3 > 16.2015 )
							ret := 0.266532
			if( tema > 38.5733 )
				if( ad_mf <= -233857 )
					if( ema3 <= 47.1408 )
						if( mf <= -0.476861 )
							ret := -1.000000 // sell
						if( mf > -0.476861 )
							ret := 0.851064 // buy
					if( ema3 > 47.1408 )
						ret := -1.000000 // sell
				if( ad_mf > -233857 )
					if( ad_mf <= -0.151214 )
						if( ema13 <= -0.228965 )
							ret := -0.336000
						if( ema13 > -0.228965 )
							ret := 0.264706
					if( ad_mf > -0.151214 )
						if( ema13 <= -0.434827 )
							ret := -0.222222
						if( ema13 > -0.434827 )
							ret := -0.892857 // sell
		if( ad_mf > 719.388 )
			if( ema13 <= -0.499707 )
				if( ema3 <= 32.9622 )
					if( mf <= -0.125534 )
						if( ad <= 4433.04 )
							ret := -0.533333
						if( ad > 4433.04 )
							ret := 0.395349
					if( mf > -0.125534 )
						if( ad <= 1886.58 )
							ret := 0.125000
						if( ad > 1886.58 )
							ret := 0.770833 // buy
				if( ema3 > 32.9622 )
					if( ema12 <= -0.524442 )
						if( ad_mf <= 637248 )
							ret := 0.438462
						if( ad_mf > 637248 )
							ret := -1.000000 // sell
					if( ema12 > -0.524442 )
						if( tema <= 34.4248 )
							ret := -0.403846
						if( tema > 34.4248 )
							ret := 0.053030
			if( ema13 > -0.499707 )
				if( ema3 <= 33.7563 )
					if( ema12 <= -0.195482 )
						if( ema2 <= 14.8354 )
							ret := -0.813953 // sell
						if( ema2 > 14.8354 )
							ret := -0.161616
					if( ema12 > -0.195482 )
						if( ema13 <= -0.057396 )
							ret := -0.058184
						if( ema13 > -0.057396 )
							ret := 0.692308
				if( ema3 > 33.7563 )
					if( ad_mf <= 3879.26 )
						if( ema12 <= -0.144619 )
							ret := -0.900000 // sell
						if( ema12 > -0.144619 )
							ret := -0.517241
					if( ad_mf > 3879.26 )
						if( ema12 <= -0.40442 )
							ret := 0.600000
						if( ema12 > -0.40442 )
							ret := -0.254438
	if( ema12 > -0.072743 )
		if( tema <= 6.46771 )
			if( ad <= -20328.8 )
				if( mf <= 0.292288 )
					if( ad <= -22291.2 )
						if( ema12 <= -0.06416 )
							ret := 1.000000 // buy
						if( ema12 > -0.06416 )
							ret := 0.052632
					if( ad > -22291.2 )
						ret := -0.666667
				if( mf > 0.292288 )
					ret := -0.909091 // sell
			if( ad > -20328.8 )
				if( ema1 <= 6.14654 )
					if( mf <= 0.092799 )
						if( ema12 <= -0.003345 )
							ret := -0.025000
						if( ema12 > -0.003345 )
							ret := -0.904762 // sell
					if( mf > 0.092799 )
						if( ema1 <= 6.09879 )
							ret := 0.857143 // buy
						if( ema1 > 6.09879 )
							ret := 0.000000
				if( ema1 > 6.14654 )
					if( ad_mf <= 923.532 )
						if( ema3 <= 6.56057 )
							ret := 0.777778 // buy
						if( ema3 > 6.56057 )
							ret := -1.000000 // sell
					if( ad_mf > 923.532 )
						if( ema13 <= 0.009539 )
							ret := -0.300000
						if( ema13 > 0.009539 )
							ret := 0.575758
		if( tema > 6.46771 )
			if( ad_mf <= -0.128913 )
				if( ad_mf <= -1.26531e+06 )
					if( ad_mf <= -2.41574e+06 )
						ret := -0.750000 // sell
					if( ad_mf > -2.41574e+06 )
						ret := -1.000000 // sell
				if( ad_mf > -1.26531e+06 )
					if( ema12 <= -0.001396 )
						if( ema13 <= 0.0104 )
							ret := 0.070875
						if( ema13 > 0.0104 )
							ret := 0.400612
					if( ema12 > -0.001396 )
						if( ema1 <= 29.9875 )
							ret := -0.054281
						if( ema1 > 29.9875 )
							ret := 0.138568
			if( ad_mf > -0.128913 )
				if( ema13 <= 0.378452 )
					if( ema12 <= 0.01558 )
						if( ema13 <= 0.013153 )
							ret := -0.124319
						if( ema13 > 0.013153 )
							ret := 0.162581
					if( ema12 > 0.01558 )
						if( ad <= 101824 )
							ret := -0.193806
						if( ad > 101824 )
							ret := 0.056604
				if( ema13 > 0.378452 )
					if( ad_mf <= 67969.9 )
						if( tema <= 40.174 )
							ret := 0.218373
						if( tema > 40.174 )
							ret := -0.211864
					if( ad_mf > 67969.9 )
						if( ema2 <= 31.6851 )
							ret := -0.441176
						if( ema2 > 31.6851 )
							ret := 0.097458
	
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
float op_operation = decision_tree_0_CRSR_30Min_fb8709ab(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)

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


