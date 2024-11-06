//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: DBX_5Min_2CT0_bb8de2ac Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DBX_5Min_2CT0_bb8de2ac", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DBX_5Min_bb8de2ac(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema13 <= 0.060246 )
		if( tema <= 22.4682 )
			if( mf <= -0.220478 )
				if( ad <= -73163.1 )
					if( ema12 <= -0.02554 )
						ret := 1.000000 // buy
					if( ema12 > -0.02554 )
						if( mf <= -0.322978 )
							ret := 0.777778 // buy
						if( mf > -0.322978 )
							ret := 0.388889
				if( ad > -73163.1 )
					if( ad_mf <= -50223.1 )
						if( ema13 <= -0.015722 )
							ret := -0.157895
						if( ema13 > -0.015722 )
							ret := -0.750000 // sell
					if( ad_mf > -50223.1 )
						if( ema12 <= -0.041229 )
							ret := -0.009346
						if( ema12 > -0.041229 )
							ret := 0.369973
			if( mf > -0.220478 )
				if( ema12 <= 0.041234 )
					if( ema13 <= -0.151501 )
						if( ema12 <= -0.200349 )
							ret := 0.451613
						if( ema12 > -0.200349 )
							ret := -0.529412
					if( ema13 > -0.151501 )
						if( ad_mf <= 51100 )
							ret := 0.090190
						if( ad_mf > 51100 )
							ret := 0.372000
				if( ema12 > 0.041234 )
					ret := -0.739130 // sell
		if( tema > 22.4682 )
			if( mf <= -0.165983 )
				if( ad_mf <= -18382.5 )
					if( ad_mf <= -18579.4 )
						if( tema <= 23.9646 )
							ret := 0.064857
						if( tema > 23.9646 )
							ret := -0.115318
					if( ad_mf > -18579.4 )
						if( ad <= -18502.2 )
							ret := -1.000000 // sell
						if( ad > -18502.2 )
							ret := -0.727273 // sell
				if( ad_mf > -18382.5 )
					if( ema12 <= -0.095814 )
						if( ad <= -4836.88 )
							ret := -0.366667
						if( ad > -4836.88 )
							ret := 0.669565
					if( ema12 > -0.095814 )
						if( ema3 <= 27.1569 )
							ret := 0.171975
						if( ema3 > 27.1569 )
							ret := -0.024405
			if( mf > -0.165983 )
				if( ad <= 28446.2 )
					if( ad_mf <= 28258 )
						if( mf <= -0.082487 )
							ret := -0.056624
						if( mf > -0.082487 )
							ret := 0.019209
					if( ad_mf > 28258 )
						if( ema12 <= 0.000706 )
							ret := 1.000000 // buy
						if( ema12 > 0.000706 )
							ret := 0.666667
				if( ad > 28446.2 )
					if( ema13 <= -0.108696 )
						if( ad_mf <= 240148 )
							ret := 0.351064
						if( ad_mf > 240148 )
							ret := -0.409091
					if( ema13 > -0.108696 )
						if( ema12 <= 0.039235 )
							ret := -0.144006
						if( ema12 > 0.039235 )
							ret := 0.515625
	if( ema13 > 0.060246 )
		if( ema12 <= 0.10629 )
			if( ad <= -77353.8 )
				if( mf <= 0.041989 )
					if( ema3 <= 23.1638 )
						ret := -0.615385
					if( ema3 > 23.1638 )
						if( tema <= 28.727 )
							ret := 0.675000
						if( tema > 28.727 )
							ret := -0.500000
				if( mf > 0.041989 )
					if( ema12 <= 0.066867 )
						if( ema2 <= 26.0328 )
							ret := 0.818182 // buy
						if( ema2 > 26.0328 )
							ret := 1.000000 // buy
					if( ema12 > 0.066867 )
						ret := 0.600000
			if( ad > -77353.8 )
				if( mf <= 0.025758 )
					if( ad <= 11948.4 )
						if( ad_mf <= -1847.96 )
							ret := -0.138075
						if( ad_mf > -1847.96 )
							ret := -0.453737
					if( ad > 11948.4 )
						if( ad_mf <= 12957.5 )
							ret := 0.878788 // buy
						if( ad_mf > 12957.5 )
							ret := -0.043165
				if( mf > 0.025758 )
					if( ad_mf <= 18771.1 )
						if( ad_mf <= 9400.05 )
							ret := -0.068399
						if( ad_mf > 9400.05 )
							ret := 0.141044
					if( ad_mf > 18771.1 )
						if( ad_mf <= 23423.2 )
							ret := -0.453608
						if( ad_mf > 23423.2 )
							ret := -0.129371
		if( ema12 > 0.10629 )
			if( tema <= 26.8801 )
				if( mf <= -0.37286 )
					if( mf <= -0.469599 )
						ret := -0.400000
					if( mf > -0.469599 )
						if( ema13 <= 0.200555 )
							ret := 0.133333
						if( ema13 > 0.200555 )
							ret := 0.956522 // buy
				if( mf > -0.37286 )
					if( ad <= 116242 )
						if( tema <= 21.0478 )
							ret := 0.750000 // buy
						if( tema > 21.0478 )
							ret := -0.420513
					if( ad > 116242 )
						ret := 0.857143 // buy
			if( tema > 26.8801 )
				if( mf <= 0.154608 )
					if( ema12 <= 0.110803 )
						if( ema12 <= 0.108699 )
							ret := -0.600000
						if( ema12 > 0.108699 )
							ret := 0.000000
					if( ema12 > 0.110803 )
						if( ema12 <= 0.138825 )
							ret := -0.725275 // sell
						if( ema12 > 0.138825 )
							ret := -1.000000 // sell
				if( mf > 0.154608 )
					if( ema13 <= 0.211668 )
						if( ad_mf <= -0.285735 )
							ret := -0.111111
						if( ad_mf > -0.285735 )
							ret := -0.913043 // sell
					if( ema13 > 0.211668 )
						if( ema2 <= 27.304 )
							ret := 1.000000 // buy
						if( ema2 > 27.304 )
							ret := -0.266667
	
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
float op_operation = decision_tree_0_DBX_5Min_bb8de2ac(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


