//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: MELI_1Min_2CT0_0a9ac9a0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_1Min_2CT0_0a9ac9a0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_1Min_0a9ac9a0(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6,max_features=sqrt, min_samples_split=10,random_state=843828734)
	if( ad <= -207.087 )
		if( ema1 <= 1783.36 )
			if( ad_mf <= -286.047 )
				if( ema1 <= 1692.82 )
					if( ad <= -344.619 )
						if( ad_mf <= -918.174 )
							ret := 0.034867
						if( ad_mf > -918.174 )
							ret := 0.189239
					if( ad > -344.619 )
						if( ema13 <= 0.87576 )
							ret := -0.483871
						if( ema13 > 0.87576 )
							ret := 0.235294
				if( ema1 > 1692.82 )
					if( ema3 <= 1738.41 )
						if( ad_mf <= -1744.09 )
							ret := 0.056380
						if( ad_mf > -1744.09 )
							ret := -0.199120
					if( ema3 > 1738.41 )
						if( ad <= -1951.96 )
							ret := -0.316384
						if( ad > -1951.96 )
							ret := 0.176972
			if( ad_mf > -286.047 )
				if( ema1 <= 1582.61 )
					if( ema1 <= 1465.93 )
						if( ema2 <= 1393.61 )
							ret := 0.000000
						if( ema2 > 1393.61 )
							ret := 0.666667
					if( ema1 > 1465.93 )
						if( tema <= 1468.9 )
							ret := -1.000000 // sell
						if( tema > 1468.9 )
							ret := 0.125000
				if( ema1 > 1582.61 )
					if( ema12 <= -4.61941 )
						ret := -1.000000 // sell
					if( ema12 > -4.61941 )
						if( tema <= 1677.47 )
							ret := 0.785714 // buy
						if( tema > 1677.47 )
							ret := 0.519231
		if( ema1 > 1783.36 )
			if( tema <= 2106.31 )
				if( ema12 <= -1.89504 )
					if( mf <= 0.076435 )
						if( ad_mf <= -332.654 )
							ret := 0.495763
						if( ad_mf > -332.654 )
							ret := 0.000000
					if( mf > 0.076435 )
						if( ema3 <= 1898.69 )
							ret := 0.785714 // buy
						if( ema3 > 1898.69 )
							ret := -0.444444
				if( ema12 > -1.89504 )
					if( ema3 <= 1835.25 )
						if( ema13 <= 4.6548 )
							ret := 0.644860
						if( ema13 > 4.6548 )
							ret := -0.016393
					if( ema3 > 1835.25 )
						if( ad_mf <= -5727.03 )
							ret := 0.553571
						if( ad_mf > -5727.03 )
							ret := 0.142380
			if( tema > 2106.31 )
				if( ema13 <= -2.01926 )
					if( mf <= -0.215025 )
						if( ad <= -441.484 )
							ret := -0.173913
						if( ad > -441.484 )
							ret := -1.000000 // sell
					if( mf > -0.215025 )
						if( ad_mf <= -486.022 )
							ret := 0.731707 // buy
						if( ad_mf > -486.022 )
							ret := 0.000000
				if( ema13 > -2.01926 )
					if( ema12 <= 5.18923 )
						if( ema13 <= 3.20516 )
							ret := -0.160279
						if( ema13 > 3.20516 )
							ret := -0.475410
					if( ema12 > 5.18923 )
						ret := 0.888889 // buy
	if( ad > -207.087 )
		if( ema3 <= 2112.29 )
			if( ema13 <= 5.1759 )
				if( ad <= 2785.69 )
					if( ad <= 425.269 )
						if( ema1 <= 1581.08 )
							ret := 0.101950
						if( ema1 > 1581.08 )
							ret := -0.018692
					if( ad > 425.269 )
						if( ema13 <= -1.00146 )
							ret := -0.003051
						if( ema13 > -1.00146 )
							ret := -0.108028
				if( ad > 2785.69 )
					if( ema3 <= 1726.06 )
						if( ema3 <= 1599.53 )
							ret := 0.291080
						if( ema3 > 1599.53 )
							ret := -0.053672
					if( ema3 > 1726.06 )
						if( ema12 <= -2.25272 )
							ret := 0.813559 // buy
						if( ema12 > -2.25272 )
							ret := 0.233161
			if( ema13 > 5.1759 )
				if( ad_mf <= 4365.25 )
					if( ema2 <= 2052.66 )
						if( ema12 <= 1.69304 )
							ret := 0.814815 // buy
						if( ema12 > 1.69304 )
							ret := -0.082027
					if( ema2 > 2052.66 )
						if( ad_mf <= -0.562098 )
							ret := 0.222222
						if( ad_mf > -0.562098 )
							ret := -0.572222
				if( ad_mf > 4365.25 )
					if( ema3 <= 1980.68 )
						if( ema12 <= 2.17117 )
							ret := 1.000000 // buy
						if( ema12 > 2.17117 )
							ret := -0.858696 // sell
					if( ema3 > 1980.68 )
						if( ad <= 6324.5 )
							ret := 0.375000
						if( ad > 6324.5 )
							ret := -1.000000 // sell
		if( ema3 > 2112.29 )
			if( ema12 <= 1.53661 )
				if( ema13 <= 0.345033 )
					if( ema2 <= 2123.33 )
						if( ema1 <= 2116.19 )
							ret := -0.098361
						if( ema1 > 2116.19 )
							ret := -0.515789
					if( ema2 > 2123.33 )
						if( mf <= -0.206311 )
							ret := -0.666667
						if( mf > -0.206311 )
							ret := 0.167883
				if( ema13 > 0.345033 )
					if( mf <= 0.235398 )
						if( ema1 <= 2124.99 )
							ret := -0.669565
						if( ema1 > 2124.99 )
							ret := -0.185567
					if( mf > 0.235398 )
						if( ema12 <= 0.425399 )
							ret := -1.000000 // sell
						if( ema12 > 0.425399 )
							ret := 0.000000
			if( ema12 > 1.53661 )
				if( mf <= 0.225133 )
					if( ema12 <= 6.99768 )
						if( ad_mf <= -0.109188 )
							ret := -0.562500
						if( ad_mf > -0.109188 )
							ret := -0.900000 // sell
					if( ema12 > 6.99768 )
						ret := 0.333333
				if( mf > 0.225133 )
					if( ad_mf <= -0.259783 )
						ret := 0.000000
					if( ad_mf > -0.259783 )
						if( mf <= 0.28081 )
							ret := -0.500000
						if( mf > 0.28081 )
							ret := 0.000000
	
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
float op_operation = decision_tree_0_MELI_1Min_0a9ac9a0(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


