//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: HUBS_5Min_2CT0_5e14d4c9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_5Min_2CT0_5e14d4c9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_5Min_5e14d4c9(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6,max_features=sqrt, min_samples_split=10,random_state=843828734)
	if( ad <= 811.337 )
		if( ema3 <= 611.677 )
			if( ema13 <= -4.32521 )
				if( ema12 <= -5.04506 )
					if( ad <= 310.952 )
						if( ad_mf <= -2109.69 )
							ret := -0.047059
						if( ad_mf > -2109.69 )
							ret := 0.461538
					if( ad > 310.952 )
						ret := -1.000000 // sell
				if( ema12 > -5.04506 )
					if( ad <= -1543.94 )
						if( ad_mf <= -4136.05 )
							ret := -0.148515
						if( ad_mf > -4136.05 )
							ret := -0.564935
					if( ad > -1543.94 )
						if( ad_mf <= -1095.05 )
							ret := 0.800000 // buy
						if( ad_mf > -1095.05 )
							ret := -0.048649
			if( ema13 > -4.32521 )
				if( ad <= -19244.4 )
					if( ema1 <= 478.365 )
						if( ad <= -23491.5 )
							ret := 0.760684 // buy
						if( ad > -23491.5 )
							ret := 0.285714
					if( ema1 > 478.365 )
						if( ema13 <= 9.10471 )
							ret := 0.102515
						if( ema13 > 9.10471 )
							ret := 1.000000 // buy
				if( ad > -19244.4 )
					if( tema <= 611.812 )
						if( ema12 <= -1.05311 )
							ret := 0.156951
						if( ema12 > -1.05311 )
							ret := 0.058692
					if( tema > 611.812 )
						if( ad <= -9022.89 )
							ret := 0.650000
						if( ad > -9022.89 )
							ret := -0.233503
		if( ema3 > 611.677 )
			if( ad_mf <= -6078.23 )
				if( tema <= 634.189 )
					if( ad <= -6437.26 )
						if( ad_mf <= -28931.8 )
							ret := -0.702703 // sell
						if( ad_mf > -28931.8 )
							ret := -0.059006
					if( ad > -6437.26 )
						if( ema12 <= 0.351045 )
							ret := -0.925926 // sell
						if( ema12 > 0.351045 )
							ret := 0.000000
				if( tema > 634.189 )
					if( tema <= 658.303 )
						if( ema13 <= 6.63239 )
							ret := -0.476923
						if( ema13 > 6.63239 )
							ret := -0.900000 // sell
					if( tema > 658.303 )
						if( ad_mf <= -10990.8 )
							ret := 0.064516
						if( ad_mf > -10990.8 )
							ret := -0.542857
			if( ad_mf > -6078.23 )
				if( ad_mf <= -4789.61 )
					if( ema2 <= 617.88 )
						if( mf <= 0.352223 )
							ret := -0.034483
						if( mf > 0.352223 )
							ret := -1.000000 // sell
					if( ema2 > 617.88 )
						if( ema12 <= -1.2185 )
							ret := -0.080000
						if( ema12 > -1.2185 )
							ret := 0.623762
				if( ad_mf > -4789.61 )
					if( ema12 <= -1.44579 )
						if( ad <= -4017.55 )
							ret := -0.736842 // sell
						if( ad > -4017.55 )
							ret := -0.192308
					if( ema12 > -1.44579 )
						if( ad <= -1659.97 )
							ret := -0.185336
						if( ad > -1659.97 )
							ret := 0.001088
	if( ad > 811.337 )
		if( ad <= 10449 )
			if( ad_mf <= 920.766 )
				if( ema2 <= 447.688 )
					if( ad <= 901.56 )
						if( ad_mf <= 865.958 )
							ret := -0.750000 // sell
						if( ad_mf > 865.958 )
							ret := -0.142857
					if( ad > 901.56 )
						ret := -1.000000 // sell
				if( ema2 > 447.688 )
					if( ema1 <= 555.79 )
						if( ema3 <= 538.181 )
							ret := -0.215909
						if( ema3 > 538.181 )
							ret := -0.680000
					if( ema1 > 555.79 )
						if( ema1 <= 572.841 )
							ret := 0.531250
						if( ema1 > 572.841 )
							ret := -0.116129
			if( ad_mf > 920.766 )
				if( ad_mf <= 1030.1 )
					if( tema <= 632.315 )
						if( ema12 <= -1.27175 )
							ret := 0.735294 // buy
						if( ema12 > -1.27175 )
							ret := 0.133333
					if( tema > 632.315 )
						if( ad_mf <= 1015.73 )
							ret := -0.609756
						if( ad_mf > 1015.73 )
							ret := 1.000000 // buy
				if( ad_mf > 1030.1 )
					if( ema3 <= 414.285 )
						if( ema12 <= 0.688383 )
							ret := 0.082192
						if( ema12 > 0.688383 )
							ret := 0.783784 // buy
					if( ema3 > 414.285 )
						if( ad <= 10290.4 )
							ret := -0.089272
						if( ad > 10290.4 )
							ret := -0.594595
		if( ad > 10449 )
			if( tema <= 469.547 )
				if( ema13 <= -0.90096 )
					if( ema2 <= 446.068 )
						if( ema3 <= 445.133 )
							ret := 0.730769 // buy
						if( ema3 > 445.133 )
							ret := 1.000000 // buy
					if( ema2 > 446.068 )
						if( ad <= 16547.5 )
							ret := 0.800000 // buy
						if( ad > 16547.5 )
							ret := 0.016949
				if( ema13 > -0.90096 )
					if( ad_mf <= 52153.7 )
						if( ema12 <= -0.258208 )
							ret := -0.520000
						if( ema12 > -0.258208 )
							ret := 0.107843
					if( ad_mf > 52153.7 )
						if( ema12 <= 4.6894 )
							ret := 0.880000 // buy
						if( ema12 > 4.6894 )
							ret := -1.000000 // sell
			if( tema > 469.547 )
				if( mf <= 0.414902 )
					if( ema13 <= 1.75536 )
						if( ad_mf <= 14101.2 )
							ret := -0.209607
						if( ad_mf > 14101.2 )
							ret := 0.137056
					if( ema13 > 1.75536 )
						if( ema2 <= 512.188 )
							ret := -0.428571
						if( ema2 > 512.188 )
							ret := 0.344937
				if( mf > 0.414902 )
					if( tema <= 474.851 )
						ret := 1.000000 // buy
					if( tema > 474.851 )
						if( ema13 <= 1.01211 )
							ret := 0.050000
						if( ema13 > 1.01211 )
							ret := -0.500000
	
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
float op_operation = decision_tree_0_HUBS_5Min_5e14d4c9(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


