//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: MELI_5Min_2CT0_95385ce8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_5Min_2CT0_95385ce8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_5Min_95385ce8(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ema3 <= 1185.3 )
		if( ema12 <= -4.2478 )
			if( ema2 <= 1106.26 )
				ret := 0.666667
			if( ema2 > 1106.26 )
				if( tema <= 1147.43 )
					if( ad_mf <= -21221.7 )
						ret := -0.333333
					if( ad_mf > -21221.7 )
						if( ema13 <= -18.8265 )
							ret := 0.000000
						if( ema13 > -18.8265 )
							ret := -0.978261 // sell
				if( tema > 1147.43 )
					if( ema12 <= -4.45634 )
						if( ad <= -5344.44 )
							ret := -0.625000
						if( ad > -5344.44 )
							ret := 0.533333
					if( ema12 > -4.45634 )
						ret := -1.000000 // sell
		if( ema12 > -4.2478 )
			if( ema1 <= 1166.27 )
				if( ema3 <= 1154.47 )
					if( ema2 <= 1140.81 )
						if( ad <= 4130.95 )
							ret := 0.433225
						if( ad > 4130.95 )
							ret := -0.131148
					if( ema2 > 1140.81 )
						if( ema2 <= 1154.74 )
							ret := 0.022222
						if( ema2 > 1154.74 )
							ret := -0.666667
				if( ema3 > 1154.47 )
					if( ad <= 2342.94 )
						if( ad_mf <= 0.087351 )
							ret := 0.489362
						if( ad_mf > 0.087351 )
							ret := 0.818966 // buy
					if( ad > 2342.94 )
						if( mf <= 0.037762 )
							ret := -0.073171
						if( mf > 0.037762 )
							ret := 0.833333 // buy
			if( ema1 > 1166.27 )
				if( ema3 <= 1170.71 )
					if( ema13 <= -1.59594 )
						if( ema2 <= 1168.3 )
							ret := 1.000000 // buy
						if( ema2 > 1168.3 )
							ret := 0.600000
					if( ema13 > -1.59594 )
						if( ema3 <= 1169.56 )
							ret := -0.111111
						if( ema3 > 1169.56 )
							ret := -0.457627
				if( ema3 > 1170.71 )
					if( ad <= -783.881 )
						if( ad_mf <= -13652.4 )
							ret := 0.818182 // buy
						if( ad_mf > -13652.4 )
							ret := -0.029412
					if( ad > -783.881 )
						if( ad <= 688.822 )
							ret := 0.624242
						if( ad > 688.822 )
							ret := 0.123711
	if( ema3 > 1185.3 )
		if( ad <= 13235.5 )
			if( ad_mf <= -13401.9 )
				if( mf <= 0.082502 )
					if( ad <= -14703.9 )
						if( ad_mf <= -22896.3 )
							ret := 0.522388
						if( ad_mf > -22896.3 )
							ret := 0.115385
					if( ad > -14703.9 )
						if( ema1 <= 1216.13 )
							ret := 0.000000
						if( ema1 > 1216.13 )
							ret := 0.888889 // buy
				if( mf > 0.082502 )
					if( ad <= -15324.6 )
						if( mf <= 0.124972 )
							ret := -1.000000 // sell
						if( mf > 0.124972 )
							ret := -0.666667
					if( ad > -15324.6 )
						if( ema13 <= 6.23743 )
							ret := 0.500000
						if( ema13 > 6.23743 )
							ret := -0.416667
			if( ad_mf > -13401.9 )
				if( ema12 <= -30.1656 )
					if( ad <= 786.5 )
						ret := 1.000000 // buy
					if( ad > 786.5 )
						ret := -1.000000 // sell
				if( ema12 > -30.1656 )
					if( tema <= 1188.17 )
						if( mf <= -0.054435 )
							ret := -0.551402
						if( mf > -0.054435 )
							ret := -0.062500
					if( tema > 1188.17 )
						if( tema <= 1202.86 )
							ret := 0.165965
						if( tema > 1202.86 )
							ret := -0.015449
		if( ad > 13235.5 )
			if( ema2 <= 1270.98 )
				if( ema12 <= -1.12645 )
					if( mf <= -0.040052 )
						ret := 0.000000
					if( mf > -0.040052 )
						if( ad <= 18948.1 )
							ret := -1.000000 // sell
						if( ad > 18948.1 )
							ret := -0.500000
				if( ema12 > -1.12645 )
					if( ad <= 13803.2 )
						ret := -1.000000 // sell
					if( ad > 13803.2 )
						if( ema12 <= 1.03387 )
							ret := 0.107143
						if( ema12 > 1.03387 )
							ret := 0.702703 // buy
			if( ema2 > 1270.98 )
				if( ema12 <= 3.68506 )
					if( ema2 <= 1755.92 )
						if( ad <= 19819.2 )
							ret := -0.313609
						if( ad > 19819.2 )
							ret := -0.676829
					if( ema2 > 1755.92 )
						if( ad <= 21238 )
							ret := -1.000000 // sell
						if( ad > 21238 )
							ret := -0.916667 // sell
				if( ema12 > 3.68506 )
					if( mf <= 0.387036 )
						if( ema13 <= 12.9571 )
							ret := 0.542373
						if( ema13 > 12.9571 )
							ret := -0.694444
					if( mf > 0.387036 )
						if( ema2 <= 1280.19 )
							ret := 1.000000 // buy
						if( ema2 > 1280.19 )
							ret := -0.739130 // sell
	
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
float op_operation = decision_tree_0_MELI_5Min_95385ce8(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


