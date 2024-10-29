//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: DOTUSDT_1Hour_2CT0_df4592c8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_1Hour_2CT0_df4592c8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_1Hour_df4592c8(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ad <= -115262 )
		if( ema13 <= -0.284823 )
			if( ema12 <= -0.59666 )
				if( mf <= 0.057051 )
					if( tema <= 41.6715 )
						if( ad <= -671205 )
							ret := 0.809211 // buy
						if( ad > -671205 )
							ret := 0.372881
					if( tema > 41.6715 )
						ret := -0.625000
				if( mf > 0.057051 )
					if( ema13 <= -2.47026 )
						ret := -1.000000 // sell
					if( ema13 > -2.47026 )
						if( ad_mf <= -354968 )
							ret := 0.615385
						if( ad_mf > -354968 )
							ret := -0.461538
			if( ema12 > -0.59666 )
				if( mf <= -0.085126 )
					if( ad_mf <= -638756 )
						if( tema <= 16.9633 )
							ret := -0.112360
						if( tema > 16.9633 )
							ret := -0.545455
					if( ad_mf > -638756 )
						if( ad_mf <= -177373 )
							ret := 0.214801
						if( ad_mf > -177373 )
							ret := -0.116788
				if( mf > -0.085126 )
					if( mf <= 0.174915 )
						if( ema3 <= 14.7562 )
							ret := 0.629630
						if( ema3 > 14.7562 )
							ret := 0.239203
					if( mf > 0.174915 )
						ret := -0.619048
		if( ema13 > -0.284823 )
			if( ema3 <= 6.95768 )
				if( ema13 <= 0.016177 )
					if( mf <= 0.141017 )
						if( ema12 <= -0.073844 )
							ret := 0.331754
						if( ema12 > -0.073844 )
							ret := 0.060289
					if( mf > 0.141017 )
						if( ad_mf <= -191169 )
							ret := 0.850000 // buy
						if( ad_mf > -191169 )
							ret := 0.318182
				if( ema13 > 0.016177 )
					if( ad <= -390967 )
						if( ema13 <= 0.094818 )
							ret := 0.207792
						if( ema13 > 0.094818 )
							ret := 0.615894
					if( ad > -390967 )
						if( ad <= -363322 )
							ret := -0.608696
						if( ad > -363322 )
							ret := 0.254902
			if( ema3 > 6.95768 )
				if( ad_mf <= -864239 )
					if( ad_mf <= -906814 )
						if( ad <= -954595 )
							ret := 0.282051
						if( ad > -954595 )
							ret := -0.464286
					if( ad_mf > -906814 )
						if( tema <= 17.7221 )
							ret := 1.000000 // buy
						if( tema > 17.7221 )
							ret := 0.428571
				if( ad_mf > -864239 )
					if( ema1 <= 22.4391 )
						if( ad <= -623311 )
							ret := -0.252226
						if( ad > -623311 )
							ret := 0.028535
					if( ema1 > 22.4391 )
						if( mf <= 0.10702 )
							ret := -0.146821
						if( mf > 0.10702 )
							ret := 0.023952
	if( ad > -115262 )
		if( ema12 <= 0.392899 )
			if( ad <= 264782 )
				if( ema2 <= 7.22212 )
					if( ema12 <= -0.043574 )
						if( mf <= -0.054193 )
							ret := 0.019078
						if( mf > -0.054193 )
							ret := 0.253097
					if( ema12 > -0.043574 )
						if( mf <= 0.08821 )
							ret := -0.041487
						if( mf > 0.08821 )
							ret := 0.039486
				if( ema2 > 7.22212 )
					if( ema12 <= -0.657673 )
						if( mf <= 0.023909 )
							ret := 0.215190
						if( mf > 0.023909 )
							ret := 0.896552 // buy
					if( ema12 > -0.657673 )
						if( ema12 <= -0.315673 )
							ret := -0.260148
						if( ema12 > -0.315673 )
							ret := -0.054117
			if( ad > 264782 )
				if( mf <= 0.14218 )
					if( ema13 <= 0.051088 )
						if( ad_mf <= 389671 )
							ret := 0.184932
						if( ad_mf > 389671 )
							ret := 0.016162
					if( ema13 > 0.051088 )
						if( tema <= 6.06856 )
							ret := 0.376812
						if( tema > 6.06856 )
							ret := -0.153502
				if( mf > 0.14218 )
					if( ad_mf <= 2.17395e+06 )
						if( ad_mf <= 299030 )
							ret := 0.550420
						if( ad_mf > 299030 )
							ret := 0.132765
					if( ad_mf > 2.17395e+06 )
						if( mf <= 0.203029 )
							ret := -0.400000
						if( mf > 0.203029 )
							ret := -0.968750 // sell
		if( ema12 > 0.392899 )
			if( tema <= 28.0967 )
				if( mf <= 0.127994 )
					if( tema <= 22.5537 )
						if( ad_mf <= 650272 )
							ret := 0.857143 // buy
						if( ad_mf > 650272 )
							ret := 0.000000
					if( tema > 22.5537 )
						if( mf <= 0.060078 )
							ret := -0.400000
						if( mf > 0.060078 )
							ret := 0.292683
				if( mf > 0.127994 )
					if( mf <= 0.182992 )
						if( ad_mf <= 255674 )
							ret := -0.125000
						if( ad_mf > 255674 )
							ret := -0.734375 // sell
					if( mf > 0.182992 )
						if( ad <= 279841 )
							ret := 0.223529
						if( ad > 279841 )
							ret := -0.179775
			if( tema > 28.0967 )
				if( ad <= -95450.8 )
					ret := 0.800000 // buy
				if( ad > -95450.8 )
					if( ema12 <= 1.11535 )
						if( mf <= 0.148161 )
							ret := -0.476331
						if( mf > 0.148161 )
							ret := -0.252055
					if( ema12 > 1.11535 )
						if( ad_mf <= 609922 )
							ret := 0.857143 // buy
						if( ad_mf > 609922 )
							ret := -0.531250
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_DOTUSDT_1Hour_df4592c8(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


